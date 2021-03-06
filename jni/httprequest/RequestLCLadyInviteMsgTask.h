/*
 * RequestLCLadyInviteMsgTask.h
 *
 *  Created on: 2015-10-12
 *      Author: Samson
 * Description: 查询男士历史聊天消息
 */

#ifndef REQUESTLCLADYINVITEMSGTASK_H_
#define REQUESTLCLADYINVITEMSGTASK_H_

#include "RequestBaseTask.h"
#include "RequestLCDefine.h"
#include "item/LiveChatRecordListItem.h"

class RequestLCLadyInviteMsgTask;

class IRequestLCLadyInviteMsgCallback {
public:
	virtual ~IRequestLCLadyInviteMsgCallback(){};
	virtual void OnLadyInviteMsg(bool success
								, const string& errnum
								, const string& errmsg
								, int dbTime
								, const LiveChatRecordList& theList
								, const string& inviteId
								, RequestLCLadyInviteMsgTask* task) = 0;
};

class RequestLCLadyInviteMsgTask : public RequestBaseTask {
public:
	RequestLCLadyInviteMsgTask();
	virtual ~RequestLCLadyInviteMsgTask();

	// set request param
	void SetParam(const string& inviteId);

	// Implement RequestBaseTask
	bool HandleCallback(const string& url, bool requestRet, const char* buf, int size);

	void SetCallback(IRequestLCLadyInviteMsgCallback* pCallback);

protected:
	IRequestLCLadyInviteMsgCallback* mpCallback;
	string m_inviteId;
};

#endif /* REQUESTLCLADYINVITEMSGTASK_H_ */
