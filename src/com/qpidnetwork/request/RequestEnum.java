package com.qpidnetwork.request;

/**
 * 附录枚举
 * @author Max.Chiu
 */
public class RequestEnum {
    /**
     * 国家
     */
    public enum Country {
    	Afghanistan,
    	Albania,
    	Algeria,
    	AmericanSamoa,
    	Andorra,
    	Angola,
    	Anguilla,
    	Antartica,
    	AntiguaandBarbuda,
    	Argentina,
    	Armenia,
    	Aruba,
    	AscensionIs,
    	Australia,
    	Austria,
    	Azerbaijan,
    	Bahamas,
    	Bahrain,
    	Bangladesh,
    	Barbados,
    	Belarus,
    	Belgium,
    	Belize,
    	BeninDahomey,
    	Bermuda,
    	Bhutan,
    	Bolivia,
    	BosniaandHerzegowina,
    	Botswana,
    	BouvetIsland,
    	Brazil,
    	BritishIndianOceanTerritory,
    	BruneiDarussalam,
    	Bulgaria,
    	BurkinaFaso,
    	Burundi,
    	CambodiaKampuchea,
    	Cameroon,
    	Canada,
    	CapeVerdeIslands,
    	CarriacouIslands,
    	CentralAfricanRep,
    	Chad,
    	Chile,
    	China,
    	ChristmasIsIndian,
    	CocosKeelingIs,
    	Colombia,
    	ComorosFIRep,
    	CongoBrazzaville,
    	CongoKinshasa,
    	CookIslandsRarotonga,
    	CostaRica,
    	CoteDIvoire,
    	Croatia,
    	Cuba,
    	Cyprus,
    	CzechRepublic,
    	Denmark,
    	DjiboutiRep,
    	Dominica,
    	DominicanRepublic,
    	EastTimor,
    	Ecuador,
    	Egypt,
    	ElSalvador,
    	FalklandIslands,
    	FaroeFaeroeIs,
    	FijiIslandsSuva,
    	Finland,
    	France,
    	FrenchAntilles,
    	FrenchGuiana,
    	FrenchPolynesia,
    	FrenchSouthernTerritory,
    	Gabon,
    	Gambia,
    	Georgia,
    	Germany,
    	Ghana,
    	Gibraltar,
    	Greece,
    	Greenland,
    	Grenada,
    	Guadeloupe,
    	Guam,
    	Guatemala,
    	GuineaEquatorial,
    	GuineaBissau,
    	Guyana,
    	Haiti,
    	HeardandMcDonaldIs,
    	HolyseeVaticanCityState,
    	Honduras,
    	HongKong,
    	Hungary,
    	Iceland,
    	India,
    	Indonesia,
    	Iran,
    	Iraq,
    	Ireland,
    	Israel,
    	Italy,
    	Jamaica,
    	Japan,
    	Jordan,
    	Kazakhstan,
    	Kenya,
    	Kiribati,
    	KoreaNorth,
    	KoreaSouth,
    	Kuwait,
    	Kyrgyzstan,
    	Laos,
    	Latvia,
    	Lebanon,
    	Lesotho,
    	Liberia,
    	Libya,
    	Liechtenstein,
    	Lithuania,
    	Luxembourg,
    	MacaoMacau,
    	MacedoniaFYR,
    	Madagascar,
    	Malawi,
    	Malaysia,
    	Maldives,
    	Mali,
    	Malta,
    	MarshallIs,
    	Martinique,
    	Mauritania,
    	Mauritius,
    	MayotteFrance,
    	Mexico,
    	Micronesia,
    	Moldova,
    	Monaco,
    	Mongolia,
    	Montserrat,
    	Morocco,
    	Mozambique,
    	Myanmar,
    	Namibia,
    	Nauru,
    	Nepal,
    	Netherlands,
    	NetherlandAntilles,
    	NewCaledonia,
    	NewZealand,
    	Nicaragua,
    	NigerRep,
    	Nigeria,
    	NiueIs,
    	NorfolkIsland,
    	NorthernMarianaIs,
    	Norway,
    	Oman,
    	Pakistan,
    	Palau,
    	PalestinianTerritory_occupied,
    	Panama,
    	PapuaNewGuinea,
    	Paraguay,
    	Peru,
    	Philippines,
    	PitcairnIsland,
    	Poland,
    	Portugal,
    	PuertoRico,
    	Qatar,
    	ReunionIs,
    	Romania,
    	Russia,
    	Rwanda,
    	SaintKittsNevis,
    	SaintLucia,
    	SaintMaarten,
    	SamoaAmerican,
    	SanMarino,
    	SaoTomeandPrincipe,
    	SaudiArabia,
    	SenegalRep,
    	SeychellesIs,
    	SierraLeone,
    	Singapore,
    	Slovakia,
    	Slovenia,
    	SolomonIs,
    	Somalia,
    	SouthAfrica,
    	SouthGeorgia,
    	Spain,
    	SriLankaCeylon,
    	StHelena,
    	StPierreandMiquelon,
    	Sudan,
    	Suriname,
    	SvalbardandJanMayenIs,
    	Swaziland,
    	Sweden,
    	Switzerland,
    	Syria,
    	Taiwan,
    	Tajikistan,
    	TanzaniaZanzibar,
    	Thailand,
    	Togo,
    	TokelauIs,
    	TongaIs,
    	TrinidadandTobago,
    	Tunisia,
    	Turkey,
    	Turkmenistan,
    	TurksandCaicosIs,
    	TuvaluElliceIs,
    	Uganda,
    	Ukraine,
    	UnitedArabEmirates,
    	UnitedKingdom,
    	UnitedStates,
    	UnitedStatesminoroutlyingislands,
    	Uruguay,
    	Uzbekistan,
    	VanuatuNewHebrides,
    	Venezuela,
    	Vietnam,
    	VirginIsBritish,
    	VirginIsUS,
    	WallisandFutunaIs,
    	WesternSahara,
    	YemenArabRep,
    	Yugoslavia,
    	Zambia,
    	ZimbabweRhodesia,
    	Other,   
    	Unknow,
    }
    
    /**
     * 语言
     */
    public enum Language {                              
    	Unknow,
    	English,
    	French,
    	German,
    	Spanish,
    	Italian,
    	Mandarin,
    	Cantonese,
    	Japanese,
    	Russian,
    	Arabic,
    	Portuguese,
    	Thai,
    	Other,                          	
    }
    
    /**
     * 英语能力
     */
    public enum English {
    	Little,
    	Learning,
    	Fair,
    	Good
    }
    
    /**
     * 宗教
     */
    public enum Religion {                              
    	Unknow,
    	None,
    	Buddhist,
    	Catholic,
    	Christian,
    	Evangelical,
    	Hinduism,
    	Islam,
    	Jain,
    	Jewish,
    	Mormon,
    	NotPracticing,
    	Orthodox,
    	Other,
    	Protestant,
    	Sikh,
    	Taoism,
    	Zoroastrianism,
    	JehovahsWitness,                         	
    }
    
    /**
     * 职业
     */
    public enum Profession {
    	Unknow,
    	AdvertisingMedia,
    	ClericalServiceWorker,
    	ComposerProducerTech,
    	Consultant,
    	DoctorMedicalField,
    	FinanceAccounting,
    	GraphicArtistDesigner,
    	HomeBusiness,
    	HomeMaker,
    	Teacher,
    	LawyerParalegal,
    	MiddleManagement,
    	MISProgramming,
    	OfficeManagerAdmin,
    	Other,
    	Political,
    	ProfessionalTechnical,
    	Engineering,
    	Retired,
    	SalesMarketing,
    	ScientistResearcher,
    	TechnicalManagement,
    	TourismTravelAgent,
    	Tradesman,
    	UniversityStaff,
    	UniversityStudent,
    	UpperManagExecutive,
    	Clerk,
    	Military,
    }
    
    /**
     * 教育程度
     */
    public enum Education {
    	Unknow,
    	SecondaryHighSchool,
    	VocationalSchool,
    	College,
    	Bachelor,
    	Master,
    	Doctorate,
    	PostDoctorate,
    }
    
    /**
     * 种族
     */
    public enum Ethnicity {
    	Unknow,
    	Asian,
    	BlackAfricandescent,
    	Caucasian,
    	EastIndian,
    	HispanicLatino,
    	NativeAmerican,
    	PacificIslander,
    	Semitic,
    	Other,
    }
    
    /**
     * 星座
     */
    public enum Zodiac {
    	Unknow,
    	Aquarius,
    	Pisces,
    	Aries,
    	Taurus,
    	Gemini,
    	Cancer,
    	Leo,
    	Virgo,
    	Libra,
    	Scorpio,
    	Sagittarius,
    	Capricorn,
    }
    
    /**
     * 身高
     */
    public enum Height {
    	Unknow,
    	H_5_0_153_cm,
    	H_5_1_155_cm,
    	H_5_2_158_cm,
    	H_5_3_160_cm,
    	H_5_4_163_cm,
    	H_5_5_165_cm,
    	H_5_6_168_cm,
    	H_5_7_170_cm_,
    	H_5_8_173_cm,
    	H_5_9_175_cm,
    	H_5_10_178_cm,
    	H_5_11_180_cm,
    	H_6_0_183_cm,
    	H_6_1_185_cm,
    	H_6_2_188_cm,
    	H_6_3_191_cm,
    	H_6_4_194_cm,
    	H_6_5_196_cm,
    	H_6_6_199_cm,
    	H_6_7_201_cm,
    	H_6_8_204_cm,
    	H_6_9_206_cm,
    	H_6_10_209_cm,
    	H_6_11_211_cm,
    	H_7_0_214_cm,
    	H_7_1_216_cm,
    	H_7_2_219_cm,
    	H_7_3_221_cm,
    	H_7_4_224_cm,
    	H_7_5_226_cm,
    	H_7_6_229_cm,
    	H_7_7_231_cm,
    	H_7_8_234_cm,
    	H_7_9_236_cm,
    	H_7_11_241_cm,
    	H_8_0_244_cm
    }
    
    /**
     * 体重
     */
    public enum Weight {
    	Unknow,
    	W_98_lbs_45kg,
    	W_100_lbs_46kg,
    	W_103_lbs_47kg,
    	W_105_lbs_48kg,
    	W_108_lbs_49kg,
    	W_110_lbs_50kg,
    	W_113_lbs_52kg,
    	W_115_lbs_53kg,
    	W_118_lbs_54kg,
    	W_120_lbs_55kg,
    	W_123_lbs_56kg,
    	W_125_lbs_57kg,
    	W_128_lbs_59kg,
    	W_130_lbs_59kg,
    	W_133_lbs_61kg,
    	W_135_lbs_62kg,
    	W_138_lbs_63kg,
    	W_140_lbs_64kg,
    	W_143_lbs_65kg,
    	W_145_lbs_66kg,
    	W_148_lbs_68kg,
    	W_150_lbs_69kg,
    	W_153_lbs_70kg,
    	W_155_lbs_71kg,
    	W_158_lbs_72kg,
    	W_160_lbs_73kg,
    	W_163_lbs_74kg,
    	W_165_lbs_75kg,
    	W_168_lbs_77kg,
    	W_170_lbs_78kg,
    	W_173_lbs_79kg,
    	W_175_lbs_80kg,
    	W_178_lbs_81kg,
    	W_180_lbs_82kg,
    	W_183_lbs_84kg,
    	W_185_lbs_85kg,
    	W_188_lbs_86kg,
    	W_190_lbs_87kg,
    	W_193_lbs_88kg,
    	W_195_lbs_89kg,
    	W_198_lbs_90kg,
    	W_200_lbs_91kg,
    	W_203_lbs_93kg,
    	W_205_lbs_94kg,
    	W_208_lbs_95kg,
    	W_210_lbs_96kg,
    	W_213_lbs_97kg,
    	W_215_lbs_98kg,
    	W_218_lbs_99kg,
    	W_220_lbs_100kg,
    	W_223_lbs_102kg,
    	W_225_lbs_103kg,
    	W_228_lbs_104kg,
    	W_230_lbs_105kg,
    	W_233_lbs_106kg,
    	W_235_lbs_107kg,
    	W_238_lbs_108kg,
    	W_240_lbs_109kg,
    	W_243_lbs_111kg,
    	W_245_lbs_112kg,
    	W_248_lbs_113kg,
    	W_250_lbs_114kg,
    	W_253_lbs_115kg,
    	W_255_lbs_116kg,
    	W_258_lbs_117kg,
    	W_260_lbs_118kg,
    	W_263_lbs_120kg,
    	W_265_lbs_121kg,
    	W_268_lbs_122kg,
    	W_270_lbs_123kg,
    	W_273_lbs_124kg,
    	W_275_lbs_125kg,
    	W_278_lbs_127kg,
    	W_280_lbs_128kg,
    	W_283_lbs_129kg,
    	W_285_lbs_130kg,
    	W_288_lbs_131kg,
    	W_290_lbs_132kg,
    	W_293_lbs_133kg,
    	W_295_lbs_134kg,
    	W_298_lbs_136kg,
    	W_300_lbs_137kg,
    }
    
    /**
     * 收入情况
     */
    public enum Income {
    	Unknow,
    	I15000_to_I34999,
    	I35000_to_I49999,
    	I50000_to_I74999,
    	I75000_to_I99999,
    	I100000_to_I149999,
    	I150000,
    	Prefer_Not_to_Say,
    }
    
    /**
     * 婚姻情况
     */
    public enum Marry {
    	Unknow,
    	NeverMarried,
    	Divorced,
    	Widowed,
    	Separated,
    	Married,
    }
    
    /**
     * 吸烟情况
     */
    public enum Smoke {
    	Unknow,
    	Nonsmoker,
    	Occasionally,
    	Daily,
    	Trying_to_quit,
    }
    
    /**
     * 喝酒情况
     */
    public enum Drink {
    	Unknow,
    	Never,
    	Frequently,
    	Socially_on_occasion,
    }
    
    public enum Children {
    	Unknow,
    	None,
    	Yes,
    }
    
    /**
     * 男士在线状态
     */
    public enum OnlineStatus {
    	Offline,
    	Online,
    }
    
	/**
	 * 男士头像状态
	 */
	public enum PHOTO_STATUS {
		None,
		Yes,
		Verifing,
		InstitutionsFail,
		Fail,
	}
	
	/**
	 * 3.1.查询男士列表（http post）
	 * 查询类型
	 */
    public enum QueryType {
    	DEFAULT,
    	BYID,
    }
    
    /**
     * 3.6.获取最近聊天男士列表（http post）
     * 查询类型
     */
    public enum RecentChatQueryType {
    	ALL,
    	ONLINE,
    }
}
