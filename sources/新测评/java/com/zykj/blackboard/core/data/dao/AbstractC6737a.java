package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import p214q8.C8982c;
import p214q8.C8984e;

/* renamed from: com.zykj.blackboard.core.data.dao.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6737a {
    /* renamed from: a */
    public static void m6624a(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("AudioInfoEntity");
        aVarM15069c.m15077e(16, 1738897579709439220L).m15078f(7, 3593987871946665066L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 4464665664412631503L).m15085c(1);
        aVarM15069c.m15079g("delayTime", 6).m15086d(2, 8231899869464597710L).m15085c(4);
        aVarM15069c.m15079g(TypedValues.TransitionType.S_DURATION, 6).m15086d(3, 6113963074376351913L).m15085c(4);
        aVarM15069c.m15079g("isPlay", 1).m15086d(4, 788937259794251244L).m15085c(4);
        aVarM15069c.m15079g("commandEnum", 5).m15086d(5, 4388561302133619468L).m15085c(2);
        aVarM15069c.m15079g("data", 23).m15086d(6, 6365167194610598110L);
        aVarM15069c.m15081i("recordId", "AudioRecordEntity", "record", 11).m15086d(7, 3593987871946665066L).m15085c(1548).m15087e(19, 4299508817415618274L);
        aVarM15069c.m15075c();
    }

    /* renamed from: b */
    public static void m6625b(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("AudioRecordEntity");
        aVarM15069c.m15077e(3, 1457477822342009278L).m15078f(4, 1106508257692437091L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 2649292414664316102L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 4207956140881163343L).m15085c(2080).m15087e(27, 6663778756731582839L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 1042370756165343078L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 1106508257692437091L).m15085c(1548).m15087e(3, 6516862116297086719L);
        aVarM15069c.m15082j("audioInfoEntity", 3, 3006960921839278746L, 16, 1738897579709439220L);
        aVarM15069c.m15075c();
    }

    /* renamed from: c */
    public static void m6626c(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("AuthorEntity");
        aVarM15069c.m15077e(19, 4491029893095874048L).m15078f(8, 8744813166089570678L);
        aVarM15069c.m15079g("id", 6).m15086d(1, 7180003569711224053L).m15085c(1);
        aVarM15069c.m15079g("authorName", 9).m15086d(2, 7374957285231348279L);
        aVarM15069c.m15079g("authorId", 9).m15086d(3, 5194475084078832533L);
        aVarM15069c.m15079g("schoolId", 9).m15086d(4, 1596297837259916058L);
        aVarM15069c.m15079g("url", 9).m15086d(5, 5288213926049203801L);
        aVarM15069c.m15079g("startTime", 6).m15086d(6, 8884290112765498271L).m15085c(2);
        aVarM15069c.m15079g(TypedValues.TransitionType.S_DURATION, 6).m15086d(8, 8744813166089570678L).m15085c(2);
        aVarM15069c.m15075c();
    }

    /* renamed from: d */
    public static void m6627d(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("BackgroundLineConfigEntity");
        aVarM15069c.m15077e(24, 6354252071401414514L).m15078f(5, 4659655107554112597L);
        aVarM15069c.m15079g("id", 6).m15086d(1, 3035121938545489039L).m15085c(1);
        aVarM15069c.m15079g("lineColor", 5).m15086d(2, 6761466792425544627L).m15085c(4);
        aVarM15069c.m15079g("lineSpace", 7).m15086d(3, 4039798210327797775L).m15085c(4);
        aVarM15069c.m15079g("lineType", 5).m15086d(4, 980589341662717929L).m15085c(2);
        aVarM15069c.m15079g("lineWidth", 7).m15086d(5, 4659655107554112597L).m15085c(4);
        aVarM15069c.m15075c();
    }

    /* renamed from: e */
    public static void m6628e(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("BlackBoardEntity");
        aVarM15069c.m15077e(12, 7195762691495625457L).m15078f(2, 186877666806702259L);
        aVarM15069c.m15079g("id", 6).m15086d(1, 2829339404269053744L).m15085c(1);
        aVarM15069c.m15079g("dir", 9).m15086d(2, 186877666806702259L).m15085c(2080).m15087e(12, 6978303640021140890L);
        aVarM15069c.m15075c();
    }

    /* renamed from: f */
    public static void m6629f(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("CommandInfoEntity");
        aVarM15069c.m15077e(5, 7743195144794219448L).m15078f(7, 1129747418098677705L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 6108579328042481490L).m15085c(1);
        aVarM15069c.m15079g("delayTime", 6).m15086d(2, 7495600893346042381L).m15085c(4);
        aVarM15069c.m15079g(TypedValues.TransitionType.S_DURATION, 6).m15086d(3, 2920998592584590400L).m15085c(4);
        aVarM15069c.m15079g("isPlay", 1).m15086d(4, 5866029188196944840L).m15085c(4);
        aVarM15069c.m15079g("commandEnum", 5).m15086d(5, 2864037025762273844L).m15085c(2);
        aVarM15069c.m15079g("data", 23).m15086d(6, 7102134513203239881L);
        aVarM15069c.m15081i("recordId", "CommandRecordEntity", "record", 11).m15086d(7, 1129747418098677705L).m15085c(1548).m15087e(5, 6471342414470418154L);
        aVarM15069c.m15075c();
    }

    /* renamed from: g */
    public static void m6630g(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("CommandRecordEntity");
        aVarM15069c.m15077e(17, 1533675624321273659L).m15078f(4, 1466976068188736837L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 1272142568700193409L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 7756355126835864518L).m15085c(2080).m15087e(28, 3242269590877547980L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 2415335769260754690L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 1466976068188736837L).m15085c(1548).m15087e(21, 8882662362608194884L);
        aVarM15069c.m15082j("commandInfoEntity", 8, 5120029386737400181L, 5, 7743195144794219448L);
        aVarM15069c.m15075c();
    }

    /* renamed from: h */
    public static void m6631h(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("FileInfoEntity");
        aVarM15069c.m15077e(7, 7195933198745853214L).m15078f(6, 1726522676427700178L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 1594301834817904798L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 2076957862605615295L);
        aVarM15069c.m15079g("width", 5).m15086d(3, 4333266520315125758L).m15085c(4);
        aVarM15069c.m15079g("height", 5).m15086d(4, 1087837405856477495L).m15085c(4);
        aVarM15069c.m15079g("validate", 9).m15086d(5, 2682325834017592360L);
        aVarM15069c.m15081i("recordId", "FileRecordEntity", "record", 11).m15086d(6, 1726522676427700178L).m15085c(1548).m15087e(7, 8975889253592560872L);
        aVarM15069c.m15075c();
    }

    /* renamed from: i */
    public static void m6632i(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("FileRecordEntity");
        aVarM15069c.m15077e(1, 8807702116810287113L).m15078f(4, 581255084365138855L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 2860392549289493867L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 4135892801542342702L).m15085c(2080).m15087e(25, 7101345596046178982L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 1211937380881226049L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 581255084365138855L).m15085c(1548).m15087e(1, 4664252886558210776L);
        aVarM15069c.m15082j("fileInfoEntity", 1, 5610121978791820784L, 7, 7195933198745853214L);
        aVarM15069c.m15075c();
    }

    /* renamed from: j */
    public static void m6633j(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("GeometryInfoEntity");
        aVarM15069c.m15077e(21, 4283823219291471141L).m15078f(7, 9052518300307403450L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 758369890359825821L).m15085c(1);
        aVarM15069c.m15079g("width", 7).m15086d(2, 6960047647875413528L).m15085c(4);
        aVarM15069c.m15079g(TypedValues.Custom.S_COLOR, 5).m15086d(3, 7600926013197305234L).m15085c(4);
        aVarM15069c.m15079g("textSize", 7).m15086d(4, 4261713491849246304L).m15085c(4);
        aVarM15069c.m15079g("style", 5).m15086d(5, 7680322400492902307L).m15085c(4);
        aVarM15069c.m15079g("geometryType", 5).m15086d(6, 3821197663929267481L).m15085c(4);
        aVarM15069c.m15081i("recordId", "GeometryRecordEntity", "record", 11).m15086d(7, 9052518300307403450L).m15085c(1548).m15087e(32, 4851417164413620379L);
        aVarM15069c.m15082j("pointList", 10, 2467931522611419646L, 23, 253983218610838927L);
        aVarM15069c.m15075c();
    }

    /* renamed from: k */
    public static void m6634k(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("GeometryPointFEntity");
        aVarM15069c.m15077e(23, 253983218610838927L).m15078f(4, 2993647435457907111L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 2460418406859650403L).m15085c(1);
        aVarM15069c.m15079g("x", 7).m15086d(2, 6341504903440599321L).m15085c(4);
        aVarM15069c.m15079g("y", 7).m15086d(3, 2119941464416690896L).m15085c(4);
        aVarM15069c.m15081i("recordId", "GeometryInfoEntity", "record", 11).m15086d(4, 2993647435457907111L).m15085c(1548).m15087e(35, 2983199780290730863L);
        aVarM15069c.m15075c();
    }

    /* renamed from: l */
    public static void m6635l(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("GeometryRecordEntity");
        aVarM15069c.m15077e(22, 6578349910275058692L).m15078f(4, 6414865175094240391L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 6975215749131372137L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 8731590737446971660L).m15085c(2080).m15087e(33, 6460443964786600L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 222015663972846583L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 6414865175094240391L).m15085c(1548).m15087e(34, 8208977622133384242L);
        aVarM15069c.m15082j("geometryInfoEntityList", 11, 5953019203812425150L, 21, 4283823219291471141L);
        aVarM15069c.m15075c();
    }

    /* renamed from: m */
    public static void m6636m(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("HeaderEntity");
        aVarM15069c.m15077e(6, 8452738864375470324L).m15078f(16, 942905870368347727L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 271083587316187516L).m15085c(1);
        aVarM15069c.m15079g("version", 5).m15086d(2, 2896554452934883007L).m15085c(4);
        aVarM15069c.m15079g("width", 5).m15086d(3, 2306043389845325438L).m15085c(4);
        aVarM15069c.m15079g("height", 5).m15086d(4, 91702869420279569L).m15085c(4);
        aVarM15069c.m15079g("createDate", 6).m15086d(5, 1599255963751619189L).m15085c(4);
        aVarM15069c.m15079g("updateDate", 6).m15086d(6, 3987983768584614497L).m15085c(4);
        aVarM15069c.m15079g(TypedValues.TransitionType.S_DURATION, 6).m15086d(7, 6756707614908736118L).m15085c(4);
        aVarM15069c.m15079g("convertUrl", 9).m15086d(11, 6421407192872309397L);
        aVarM15069c.m15079g("defaultBackgroundColor", 5).m15086d(12, 236332159395675736L).m15085c(4);
        aVarM15069c.m15079g("lastBackgroundColor", 5).m15086d(13, 6841752251661063892L).m15085c(4);
        aVarM15069c.m15081i("pageId", "PageEntity", "page", 11).m15086d(9, 5797256570918588576L).m15085c(1548).m15087e(6, 7029446957088249008L);
        aVarM15069c.m15081i("defaultBackgroundLineConfigId", "BackgroundLineConfigEntity", "defaultBackgroundLineConfig", 11).m15086d(15, 396819869407887376L).m15085c(1548).m15087e(36, 683525170848437566L);
        aVarM15069c.m15081i("lastBackgroundLineConfigId", "BackgroundLineConfigEntity", "lastBackgroundLineConfig", 11).m15086d(16, 942905870368347727L).m15085c(1548).m15087e(37, 8980471141152925617L);
        aVarM15069c.m15081i("authorId", "AuthorEntity", "author", 11).m15086d(10, 6953139294800756044L).m15085c(1548).m15087e(23, 395137366286267102L);
        aVarM15069c.m15081i("moveConfigId", "MoveConfigEntity", "moveConfig", 11).m15086d(14, 7656223054002431488L).m15085c(1548).m15087e(31, 1717867400835038482L);
        aVarM15069c.m15082j("provider", 9, 6672723083024400856L, 19, 4491029893095874048L);
        aVarM15069c.m15075c();
    }

    /* renamed from: n */
    public static void m6637n(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("MatrixEventEntity");
        aVarM15069c.m15077e(15, 48825879652876793L).m15078f(2, 2703943048309286272L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 1294314152973867822L).m15085c(1);
        aVarM15069c.m15081i("recordId", "MatrixRecordEntity", "record", 11).m15086d(2, 2703943048309286272L).m15085c(1548).m15087e(18, 9095157777139256777L);
        aVarM15069c.m15082j("matrixInfo", 5, 212650025651297158L, 9, 7339194381174988674L);
        aVarM15069c.m15075c();
    }

    /* renamed from: o */
    public static void m6638o(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("MatrixInfoEntity");
        aVarM15069c.m15077e(9, 7339194381174988674L).m15078f(12, 2413030854442085848L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 8157824128287595L).m15085c(1);
        aVarM15069c.m15079g("eventTime", 6).m15086d(2, 7007943029564757631L).m15085c(4);
        aVarM15069c.m15079g("scaleX", 7).m15086d(3, 2687769118052329326L).m15085c(4);
        aVarM15069c.m15079g("skewX", 7).m15086d(4, 6762616002731522458L).m15085c(4);
        aVarM15069c.m15079g("transX", 7).m15086d(5, 6964916551845516534L).m15085c(4);
        aVarM15069c.m15079g("skewY", 7).m15086d(6, 3311941188489375960L).m15085c(4);
        aVarM15069c.m15079g("scaleY", 7).m15086d(7, 7877646726736821918L).m15085c(4);
        aVarM15069c.m15079g("transY", 7).m15086d(8, 1872363001763917480L).m15085c(4);
        aVarM15069c.m15079g("perSp0", 7).m15086d(9, 72471971767457762L).m15085c(4);
        aVarM15069c.m15079g("perSp1", 7).m15086d(10, 7024503675101809910L).m15085c(4);
        aVarM15069c.m15079g("perSp2", 7).m15086d(11, 2583504155705184995L).m15085c(4);
        aVarM15069c.m15081i("recordId", "MatrixEventEntity", "record", 11).m15086d(12, 2413030854442085848L).m15085c(1548).m15087e(9, 4985497566298461031L);
        aVarM15069c.m15075c();
    }

    /* renamed from: p */
    public static void m6639p(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("MatrixRecordEntity");
        aVarM15069c.m15077e(18, 7216434272107827427L).m15078f(4, 4717262115324513656L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 3332239218713743535L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 3923730455450647348L).m15085c(2080).m15087e(29, 2913780019033877908L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 2579243705245830986L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 4717262115324513656L).m15085c(1548).m15087e(22, 5374541823673306691L);
        aVarM15069c.m15082j("matrixEventEntity", 6, 7483456025692942476L, 15, 48825879652876793L);
        aVarM15069c.m15075c();
    }

    /* renamed from: q */
    public static void m6640q(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("MoveConfigEntity");
        aVarM15069c.m15077e(20, 2661032766343741927L).m15078f(9, 1162392463661187332L);
        aVarM15069c.m15079g("id", 6).m15086d(1, 8297618772721499694L).m15085c(1);
        aVarM15069c.m15079g("isEnable", 1).m15086d(2, 4386292675948115713L).m15085c(4);
        aVarM15069c.m15079g("verticalTranslate", 1).m15086d(3, 6819516440817401546L).m15085c(4);
        aVarM15069c.m15079g("horizontalTranslate", 1).m15086d(4, 6989581654964039122L).m15085c(4);
        aVarM15069c.m15079g("scale", 1).m15086d(5, 2559327698020118256L).m15085c(4);
        aVarM15069c.m15079g("rotate", 1).m15086d(6, 3163637491624971432L).m15085c(4);
        aVarM15069c.m15079g("maxHeightTimes", 5).m15086d(7, 6285416184997064814L).m15085c(4);
        aVarM15069c.m15079g("maxWidthTimes", 5).m15086d(8, 6140357146400751997L).m15085c(4);
        aVarM15069c.m15075c();
    }

    /* renamed from: r */
    public static void m6641r(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("PageEntity");
        aVarM15069c.m15077e(14, 3184073876524851644L).m15078f(8, 7278221643870379970L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 4158900098315997984L).m15085c(1);
        aVarM15069c.m15079g("dirName", 9).m15086d(2, 8144911141438072323L).m15085c(2080).m15087e(14, 1104334313543109363L);
        aVarM15069c.m15079g("isChange", 1).m15086d(3, 8953445388604105523L).m15085c(4);
        aVarM15069c.m15079g("commandFileName", 9).m15086d(4, 5799487931391644931L);
        aVarM15069c.m15079g("commandIndex", 5).m15086d(5, 3846866282671597737L).m15085c(4);
        aVarM15069c.m15081i("blackBoardEntityId", "BlackBoardEntity", "blackBoardEntity", 11).m15086d(6, 6370233532038825797L).m15085c(1548).m15087e(15, 2192016506092991606L);
        aVarM15069c.m15081i("recordEntityId", "RecordEntity", "recordEntity", 11).m15086d(7, 6561183928856383072L).m15085c(1548).m15087e(16, 5117758800188434743L);
        aVarM15069c.m15081i("headerEntityId", "HeaderEntity", "headerEntity", 11).m15086d(8, 7278221643870379970L).m15085c(1548).m15087e(17, 5180167903368983391L);
        aVarM15069c.m15075c();
    }

    /* renamed from: s */
    public static void m6642s(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("RecordEntity");
        aVarM15069c.m15077e(8, 891357147187211080L).m15078f(2, 2886945382326041233L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 9046634465887903763L).m15085c(1);
        aVarM15069c.m15081i("pageId", "PageEntity", "page", 11).m15086d(2, 2886945382326041233L).m15085c(1548).m15087e(8, 8846653951850004940L);
        aVarM15069c.m15075c();
    }

    /* renamed from: t */
    public static void m6643t(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("TextInfoEntity");
        aVarM15069c.m15077e(11, 3085609912032192157L).m15078f(7, 5422326425890266339L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 7568483579341312750L).m15085c(1);
        aVarM15069c.m15079g("width", 7).m15086d(2, 384227753751344089L).m15085c(4);
        aVarM15069c.m15079g(TypedValues.Custom.S_COLOR, 5).m15086d(3, 5193906340737883215L).m15085c(4);
        aVarM15069c.m15079g("textSize", 7).m15086d(4, 2430925709763338506L).m15085c(4);
        aVarM15069c.m15079g("style", 5).m15086d(5, 5285358854095939391L).m15085c(4);
        aVarM15069c.m15079g("content", 9).m15086d(6, 5784995765710474993L);
        aVarM15069c.m15081i("recordId", "TextRecordEntity", "record", 11).m15086d(7, 5422326425890266339L).m15085c(1548).m15087e(11, 3424803898414461454L);
        aVarM15069c.m15075c();
    }

    /* renamed from: u */
    public static void m6644u(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("TextRecordEntity");
        aVarM15069c.m15077e(2, 1953065482304442309L).m15078f(4, 916312698009440053L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 426926565622954679L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 4748695942157109661L).m15085c(2080).m15087e(26, 9054486719078532020L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 7311582035276321573L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 916312698009440053L).m15085c(1548).m15087e(2, 8421376056513633487L);
        aVarM15069c.m15082j("textInfoEntityList", 2, 7413064398986488623L, 11, 3085609912032192157L);
        aVarM15069c.m15075c();
    }

    /* renamed from: v */
    public static void m6645v(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("TouchEventEntity");
        aVarM15069c.m15077e(4, 2827749220184605293L).m15078f(8, 4506550704609864717L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 1093335407985999731L).m15085c(1);
        aVarM15069c.m15079g("width", 7).m15086d(2, 3683603152498651467L).m15085c(4);
        aVarM15069c.m15079g(TypedValues.Custom.S_COLOR, 5).m15086d(3, 8576374943297591956L).m15085c(4);
        aVarM15069c.m15079g("spacing", 7).m15086d(4, 3208489922790624359L).m15085c(4);
        aVarM15069c.m15079g("itemLength", 7).m15086d(5, 3713427572138150910L).m15085c(4);
        aVarM15069c.m15079g("style", 5).m15086d(6, 4579135818203399571L).m15085c(4);
        aVarM15069c.m15079g("textSize", 7).m15086d(7, 5903315449039480136L).m15085c(4);
        aVarM15069c.m15081i("recordId", "TouchRecordEntity", "record", 11).m15086d(8, 4506550704609864717L).m15085c(1548).m15087e(4, 5151929149198969604L);
        aVarM15069c.m15082j("touchInfoList", 7, 4614426128572273347L, 13, 7818987629185229539L);
        aVarM15069c.m15075c();
    }

    /* renamed from: w */
    public static void m6646w(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("TouchInfoEntity");
        aVarM15069c.m15077e(13, 7818987629185229539L).m15078f(6, 5268719310319346431L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 2195736893270403606L).m15085c(1);
        aVarM15069c.m15079g("eventTime", 6).m15086d(2, 1481413978119928767L).m15085c(4);
        aVarM15069c.m15079g("x", 7).m15086d(3, 3669544801400159911L).m15085c(4);
        aVarM15069c.m15079g("y", 7).m15086d(4, 2661984942507669471L).m15085c(4);
        aVarM15069c.m15081i("recordId", "TouchEventEntity", "record", 11).m15086d(6, 5268719310319346431L).m15085c(1548).m15087e(30, 319292857095377749L);
        aVarM15069c.m15075c();
    }

    /* renamed from: x */
    public static void m6647x(C8984e c8984e) {
        C8984e.a aVarM15069c = c8984e.m15069c("TouchRecordEntity");
        aVarM15069c.m15077e(10, 5662561349855543958L).m15078f(4, 3403049600307654934L);
        aVarM15069c.m15076d(1);
        aVarM15069c.m15079g("id", 6).m15086d(1, 2213635794541564884L).m15085c(1);
        aVarM15069c.m15079g("fileName", 9).m15086d(2, 2352706818980905508L).m15085c(2080).m15087e(24, 748108574309902074L);
        aVarM15069c.m15079g("validate", 9).m15086d(3, 1147768610097659098L);
        aVarM15069c.m15081i("recordId", "RecordEntity", "record", 11).m15086d(4, 3403049600307654934L).m15085c(1548).m15087e(10, 7088145065763104873L);
        aVarM15069c.m15082j("touchEventList", 4, 6506424544508794050L, 4, 2827749220184605293L);
        aVarM15069c.m15075c();
    }

    /* renamed from: y */
    public static C8982c m6648y() {
        C8982c c8982c = new C8982c(m6649z());
        c8982c.m15062f(FileInfoEntity_.f7310d);
        c8982c.m15062f(TextInfoEntity_.f7579d);
        c8982c.m15062f(PageEntity_.f7535d);
        c8982c.m15062f(FileRecordEntity_.f7328d);
        c8982c.m15062f(TouchInfoEntity_.f7643d);
        c8982c.m15062f(AudioRecordEntity_.f7200d);
        c8982c.m15062f(BackgroundLineConfigEntity_.f7240d);
        c8982c.m15062f(CommandInfoEntity_.f7272d);
        c8982c.m15062f(MatrixEventEntity_.f7444d);
        c8982c.m15062f(AudioInfoEntity_.f7181d);
        c8982c.m15062f(MoveConfigEntity_.f7512d);
        c8982c.m15062f(TouchEventEntity_.f7619d);
        c8982c.m15062f(CommandRecordEntity_.f7291d);
        c8982c.m15062f(GeometryPointFEntity_.f7370d);
        c8982c.m15062f(MatrixInfoEntity_.f7467d);
        c8982c.m15062f(RecordEntity_.f7555d);
        c8982c.m15062f(TextRecordEntity_.f7598d);
        c8982c.m15062f(BlackBoardEntity_.f7254d);
        c8982c.m15062f(MatrixRecordEntity_.f7491d);
        c8982c.m15062f(TouchRecordEntity_.f7660d);
        c8982c.m15062f(AuthorEntity_.f7220d);
        c8982c.m15062f(GeometryInfoEntity_.f7348d);
        c8982c.m15062f(GeometryRecordEntity_.f7386d);
        c8982c.m15062f(HeaderEntity_.f7415d);
        return c8982c;
    }

    /* renamed from: z */
    public static byte[] m6649z() {
        C8984e c8984e = new C8984e();
        c8984e.m15070d(24, 6354252071401414514L);
        c8984e.m15071e(37, 8980471141152925617L);
        c8984e.m15072f(11, 5953019203812425150L);
        m6631h(c8984e);
        m6643t(c8984e);
        m6641r(c8984e);
        m6632i(c8984e);
        m6646w(c8984e);
        m6625b(c8984e);
        m6627d(c8984e);
        m6629f(c8984e);
        m6637n(c8984e);
        m6624a(c8984e);
        m6640q(c8984e);
        m6645v(c8984e);
        m6630g(c8984e);
        m6634k(c8984e);
        m6638o(c8984e);
        m6642s(c8984e);
        m6644u(c8984e);
        m6628e(c8984e);
        m6639p(c8984e);
        m6647x(c8984e);
        m6626c(c8984e);
        m6633j(c8984e);
        m6635l(c8984e);
        m6636m(c8984e);
        return c8984e.m15067a();
    }
}
