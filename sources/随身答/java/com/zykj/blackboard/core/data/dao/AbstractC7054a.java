package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import p026b8.C5208c;
import p026b8.C5210e;

/* renamed from: com.zykj.blackboard.core.data.dao.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7054a {
    /* renamed from: a */
    public static void m7728a(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("AudioInfoEntity");
        aVarM2280c.m2288e(16, 1738897579709439220L).m2289f(7, 3593987871946665066L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 4464665664412631503L).m2296c(1);
        aVarM2280c.m2290g("delayTime", 6).m2297d(2, 8231899869464597710L).m2296c(4);
        aVarM2280c.m2290g(TypedValues.TransitionType.S_DURATION, 6).m2297d(3, 6113963074376351913L).m2296c(4);
        aVarM2280c.m2290g("isPlay", 1).m2297d(4, 788937259794251244L).m2296c(4);
        aVarM2280c.m2290g("commandEnum", 5).m2297d(5, 4388561302133619468L).m2296c(2);
        aVarM2280c.m2290g("data", 23).m2297d(6, 6365167194610598110L);
        aVarM2280c.m2292i("recordId", "AudioRecordEntity", "record", 11).m2297d(7, 3593987871946665066L).m2296c(1548).m2298e(19, 4299508817415618274L);
        aVarM2280c.m2286c();
    }

    /* renamed from: b */
    public static void m7729b(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("AudioRecordEntity");
        aVarM2280c.m2288e(3, 1457477822342009278L).m2289f(4, 1106508257692437091L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 2649292414664316102L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 4207956140881163343L).m2296c(2080).m2298e(27, 6663778756731582839L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 1042370756165343078L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 1106508257692437091L).m2296c(1548).m2298e(3, 6516862116297086719L);
        aVarM2280c.m2293j("audioInfoEntity", 3, 3006960921839278746L, 16, 1738897579709439220L);
        aVarM2280c.m2286c();
    }

    /* renamed from: c */
    public static void m7730c(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("AuthorEntity");
        aVarM2280c.m2288e(19, 4491029893095874048L).m2289f(8, 8744813166089570678L);
        aVarM2280c.m2290g("id", 6).m2297d(1, 7180003569711224053L).m2296c(1);
        aVarM2280c.m2290g("authorName", 9).m2297d(2, 7374957285231348279L);
        aVarM2280c.m2290g("authorId", 9).m2297d(3, 5194475084078832533L);
        aVarM2280c.m2290g("schoolId", 9).m2297d(4, 1596297837259916058L);
        aVarM2280c.m2290g("url", 9).m2297d(5, 5288213926049203801L);
        aVarM2280c.m2290g("startTime", 6).m2297d(6, 8884290112765498271L).m2296c(2);
        aVarM2280c.m2290g(TypedValues.TransitionType.S_DURATION, 6).m2297d(8, 8744813166089570678L).m2296c(2);
        aVarM2280c.m2286c();
    }

    /* renamed from: d */
    public static void m7731d(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("BackgroundLineConfigEntity");
        aVarM2280c.m2288e(24, 6354252071401414514L).m2289f(5, 4659655107554112597L);
        aVarM2280c.m2290g("id", 6).m2297d(1, 3035121938545489039L).m2296c(1);
        aVarM2280c.m2290g("lineColor", 5).m2297d(2, 6761466792425544627L).m2296c(4);
        aVarM2280c.m2290g("lineSpace", 7).m2297d(3, 4039798210327797775L).m2296c(4);
        aVarM2280c.m2290g("lineType", 5).m2297d(4, 980589341662717929L).m2296c(2);
        aVarM2280c.m2290g("lineWidth", 7).m2297d(5, 4659655107554112597L).m2296c(4);
        aVarM2280c.m2286c();
    }

    /* renamed from: e */
    public static void m7732e(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("BlackBoardEntity");
        aVarM2280c.m2288e(12, 7195762691495625457L).m2289f(2, 186877666806702259L);
        aVarM2280c.m2290g("id", 6).m2297d(1, 2829339404269053744L).m2296c(1);
        aVarM2280c.m2290g("dir", 9).m2297d(2, 186877666806702259L).m2296c(2080).m2298e(12, 6978303640021140890L);
        aVarM2280c.m2286c();
    }

    /* renamed from: f */
    public static void m7733f(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("CommandInfoEntity");
        aVarM2280c.m2288e(5, 7743195144794219448L).m2289f(7, 1129747418098677705L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 6108579328042481490L).m2296c(1);
        aVarM2280c.m2290g("delayTime", 6).m2297d(2, 7495600893346042381L).m2296c(4);
        aVarM2280c.m2290g(TypedValues.TransitionType.S_DURATION, 6).m2297d(3, 2920998592584590400L).m2296c(4);
        aVarM2280c.m2290g("isPlay", 1).m2297d(4, 5866029188196944840L).m2296c(4);
        aVarM2280c.m2290g("commandEnum", 5).m2297d(5, 2864037025762273844L).m2296c(2);
        aVarM2280c.m2290g("data", 23).m2297d(6, 7102134513203239881L);
        aVarM2280c.m2292i("recordId", "CommandRecordEntity", "record", 11).m2297d(7, 1129747418098677705L).m2296c(1548).m2298e(5, 6471342414470418154L);
        aVarM2280c.m2286c();
    }

    /* renamed from: g */
    public static void m7734g(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("CommandRecordEntity");
        aVarM2280c.m2288e(17, 1533675624321273659L).m2289f(4, 1466976068188736837L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 1272142568700193409L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 7756355126835864518L).m2296c(2080).m2298e(28, 3242269590877547980L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 2415335769260754690L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 1466976068188736837L).m2296c(1548).m2298e(21, 8882662362608194884L);
        aVarM2280c.m2293j("commandInfoEntity", 8, 5120029386737400181L, 5, 7743195144794219448L);
        aVarM2280c.m2286c();
    }

    /* renamed from: h */
    public static void m7735h(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("FileInfoEntity");
        aVarM2280c.m2288e(7, 7195933198745853214L).m2289f(6, 1726522676427700178L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 1594301834817904798L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 2076957862605615295L);
        aVarM2280c.m2290g("width", 5).m2297d(3, 4333266520315125758L).m2296c(4);
        aVarM2280c.m2290g("height", 5).m2297d(4, 1087837405856477495L).m2296c(4);
        aVarM2280c.m2290g("validate", 9).m2297d(5, 2682325834017592360L);
        aVarM2280c.m2292i("recordId", "FileRecordEntity", "record", 11).m2297d(6, 1726522676427700178L).m2296c(1548).m2298e(7, 8975889253592560872L);
        aVarM2280c.m2286c();
    }

    /* renamed from: i */
    public static void m7736i(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("FileRecordEntity");
        aVarM2280c.m2288e(1, 8807702116810287113L).m2289f(4, 581255084365138855L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 2860392549289493867L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 4135892801542342702L).m2296c(2080).m2298e(25, 7101345596046178982L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 1211937380881226049L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 581255084365138855L).m2296c(1548).m2298e(1, 4664252886558210776L);
        aVarM2280c.m2293j("fileInfoEntity", 1, 5610121978791820784L, 7, 7195933198745853214L);
        aVarM2280c.m2286c();
    }

    /* renamed from: j */
    public static void m7737j(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("GeometryInfoEntity");
        aVarM2280c.m2288e(21, 4283823219291471141L).m2289f(7, 9052518300307403450L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 758369890359825821L).m2296c(1);
        aVarM2280c.m2290g("width", 7).m2297d(2, 6960047647875413528L).m2296c(4);
        aVarM2280c.m2290g(TypedValues.Custom.S_COLOR, 5).m2297d(3, 7600926013197305234L).m2296c(4);
        aVarM2280c.m2290g("textSize", 7).m2297d(4, 4261713491849246304L).m2296c(4);
        aVarM2280c.m2290g("style", 5).m2297d(5, 7680322400492902307L).m2296c(4);
        aVarM2280c.m2290g("geometryType", 5).m2297d(6, 3821197663929267481L).m2296c(4);
        aVarM2280c.m2292i("recordId", "GeometryRecordEntity", "record", 11).m2297d(7, 9052518300307403450L).m2296c(1548).m2298e(32, 4851417164413620379L);
        aVarM2280c.m2293j("pointList", 10, 2467931522611419646L, 23, 253983218610838927L);
        aVarM2280c.m2286c();
    }

    /* renamed from: k */
    public static void m7738k(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("GeometryPointFEntity");
        aVarM2280c.m2288e(23, 253983218610838927L).m2289f(4, 2993647435457907111L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 2460418406859650403L).m2296c(1);
        aVarM2280c.m2290g("x", 7).m2297d(2, 6341504903440599321L).m2296c(4);
        aVarM2280c.m2290g("y", 7).m2297d(3, 2119941464416690896L).m2296c(4);
        aVarM2280c.m2292i("recordId", "GeometryInfoEntity", "record", 11).m2297d(4, 2993647435457907111L).m2296c(1548).m2298e(35, 2983199780290730863L);
        aVarM2280c.m2286c();
    }

    /* renamed from: l */
    public static void m7739l(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("GeometryRecordEntity");
        aVarM2280c.m2288e(22, 6578349910275058692L).m2289f(4, 6414865175094240391L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 6975215749131372137L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 8731590737446971660L).m2296c(2080).m2298e(33, 6460443964786600L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 222015663972846583L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 6414865175094240391L).m2296c(1548).m2298e(34, 8208977622133384242L);
        aVarM2280c.m2293j("geometryInfoEntityList", 11, 5953019203812425150L, 21, 4283823219291471141L);
        aVarM2280c.m2286c();
    }

    /* renamed from: m */
    public static void m7740m(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("HeaderEntity");
        aVarM2280c.m2288e(6, 8452738864375470324L).m2289f(16, 942905870368347727L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 271083587316187516L).m2296c(1);
        aVarM2280c.m2290g("version", 5).m2297d(2, 2896554452934883007L).m2296c(4);
        aVarM2280c.m2290g("width", 5).m2297d(3, 2306043389845325438L).m2296c(4);
        aVarM2280c.m2290g("height", 5).m2297d(4, 91702869420279569L).m2296c(4);
        aVarM2280c.m2290g("createDate", 6).m2297d(5, 1599255963751619189L).m2296c(4);
        aVarM2280c.m2290g("updateDate", 6).m2297d(6, 3987983768584614497L).m2296c(4);
        aVarM2280c.m2290g(TypedValues.TransitionType.S_DURATION, 6).m2297d(7, 6756707614908736118L).m2296c(4);
        aVarM2280c.m2290g("convertUrl", 9).m2297d(11, 6421407192872309397L);
        aVarM2280c.m2290g("defaultBackgroundColor", 5).m2297d(12, 236332159395675736L).m2296c(4);
        aVarM2280c.m2290g("lastBackgroundColor", 5).m2297d(13, 6841752251661063892L).m2296c(4);
        aVarM2280c.m2292i("pageId", "PageEntity", "page", 11).m2297d(9, 5797256570918588576L).m2296c(1548).m2298e(6, 7029446957088249008L);
        aVarM2280c.m2292i("defaultBackgroundLineConfigId", "BackgroundLineConfigEntity", "defaultBackgroundLineConfig", 11).m2297d(15, 396819869407887376L).m2296c(1548).m2298e(36, 683525170848437566L);
        aVarM2280c.m2292i("lastBackgroundLineConfigId", "BackgroundLineConfigEntity", "lastBackgroundLineConfig", 11).m2297d(16, 942905870368347727L).m2296c(1548).m2298e(37, 8980471141152925617L);
        aVarM2280c.m2292i("authorId", "AuthorEntity", "author", 11).m2297d(10, 6953139294800756044L).m2296c(1548).m2298e(23, 395137366286267102L);
        aVarM2280c.m2292i("moveConfigId", "MoveConfigEntity", "moveConfig", 11).m2297d(14, 7656223054002431488L).m2296c(1548).m2298e(31, 1717867400835038482L);
        aVarM2280c.m2293j("provider", 9, 6672723083024400856L, 19, 4491029893095874048L);
        aVarM2280c.m2286c();
    }

    /* renamed from: n */
    public static void m7741n(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("MatrixEventEntity");
        aVarM2280c.m2288e(15, 48825879652876793L).m2289f(2, 2703943048309286272L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 1294314152973867822L).m2296c(1);
        aVarM2280c.m2292i("recordId", "MatrixRecordEntity", "record", 11).m2297d(2, 2703943048309286272L).m2296c(1548).m2298e(18, 9095157777139256777L);
        aVarM2280c.m2293j("matrixInfo", 5, 212650025651297158L, 9, 7339194381174988674L);
        aVarM2280c.m2286c();
    }

    /* renamed from: o */
    public static void m7742o(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("MatrixInfoEntity");
        aVarM2280c.m2288e(9, 7339194381174988674L).m2289f(12, 2413030854442085848L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 8157824128287595L).m2296c(1);
        aVarM2280c.m2290g("eventTime", 6).m2297d(2, 7007943029564757631L).m2296c(4);
        aVarM2280c.m2290g("scaleX", 7).m2297d(3, 2687769118052329326L).m2296c(4);
        aVarM2280c.m2290g("skewX", 7).m2297d(4, 6762616002731522458L).m2296c(4);
        aVarM2280c.m2290g("transX", 7).m2297d(5, 6964916551845516534L).m2296c(4);
        aVarM2280c.m2290g("skewY", 7).m2297d(6, 3311941188489375960L).m2296c(4);
        aVarM2280c.m2290g("scaleY", 7).m2297d(7, 7877646726736821918L).m2296c(4);
        aVarM2280c.m2290g("transY", 7).m2297d(8, 1872363001763917480L).m2296c(4);
        aVarM2280c.m2290g("perSp0", 7).m2297d(9, 72471971767457762L).m2296c(4);
        aVarM2280c.m2290g("perSp1", 7).m2297d(10, 7024503675101809910L).m2296c(4);
        aVarM2280c.m2290g("perSp2", 7).m2297d(11, 2583504155705184995L).m2296c(4);
        aVarM2280c.m2292i("recordId", "MatrixEventEntity", "record", 11).m2297d(12, 2413030854442085848L).m2296c(1548).m2298e(9, 4985497566298461031L);
        aVarM2280c.m2286c();
    }

    /* renamed from: p */
    public static void m7743p(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("MatrixRecordEntity");
        aVarM2280c.m2288e(18, 7216434272107827427L).m2289f(4, 4717262115324513656L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 3332239218713743535L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 3923730455450647348L).m2296c(2080).m2298e(29, 2913780019033877908L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 2579243705245830986L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 4717262115324513656L).m2296c(1548).m2298e(22, 5374541823673306691L);
        aVarM2280c.m2293j("matrixEventEntity", 6, 7483456025692942476L, 15, 48825879652876793L);
        aVarM2280c.m2286c();
    }

    /* renamed from: q */
    public static void m7744q(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("MoveConfigEntity");
        aVarM2280c.m2288e(20, 2661032766343741927L).m2289f(9, 1162392463661187332L);
        aVarM2280c.m2290g("id", 6).m2297d(1, 8297618772721499694L).m2296c(1);
        aVarM2280c.m2290g("isEnable", 1).m2297d(2, 4386292675948115713L).m2296c(4);
        aVarM2280c.m2290g("verticalTranslate", 1).m2297d(3, 6819516440817401546L).m2296c(4);
        aVarM2280c.m2290g("horizontalTranslate", 1).m2297d(4, 6989581654964039122L).m2296c(4);
        aVarM2280c.m2290g("scale", 1).m2297d(5, 2559327698020118256L).m2296c(4);
        aVarM2280c.m2290g("rotate", 1).m2297d(6, 3163637491624971432L).m2296c(4);
        aVarM2280c.m2290g("maxHeightTimes", 5).m2297d(7, 6285416184997064814L).m2296c(4);
        aVarM2280c.m2290g("maxWidthTimes", 5).m2297d(8, 6140357146400751997L).m2296c(4);
        aVarM2280c.m2286c();
    }

    /* renamed from: r */
    public static void m7745r(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("PageEntity");
        aVarM2280c.m2288e(14, 3184073876524851644L).m2289f(8, 7278221643870379970L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 4158900098315997984L).m2296c(1);
        aVarM2280c.m2290g("dirName", 9).m2297d(2, 8144911141438072323L).m2296c(2080).m2298e(14, 1104334313543109363L);
        aVarM2280c.m2290g("isChange", 1).m2297d(3, 8953445388604105523L).m2296c(4);
        aVarM2280c.m2290g("commandFileName", 9).m2297d(4, 5799487931391644931L);
        aVarM2280c.m2290g("commandIndex", 5).m2297d(5, 3846866282671597737L).m2296c(4);
        aVarM2280c.m2292i("blackBoardEntityId", "BlackBoardEntity", "blackBoardEntity", 11).m2297d(6, 6370233532038825797L).m2296c(1548).m2298e(15, 2192016506092991606L);
        aVarM2280c.m2292i("recordEntityId", "RecordEntity", "recordEntity", 11).m2297d(7, 6561183928856383072L).m2296c(1548).m2298e(16, 5117758800188434743L);
        aVarM2280c.m2292i("headerEntityId", "HeaderEntity", "headerEntity", 11).m2297d(8, 7278221643870379970L).m2296c(1548).m2298e(17, 5180167903368983391L);
        aVarM2280c.m2286c();
    }

    /* renamed from: s */
    public static void m7746s(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("RecordEntity");
        aVarM2280c.m2288e(8, 891357147187211080L).m2289f(2, 2886945382326041233L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 9046634465887903763L).m2296c(1);
        aVarM2280c.m2292i("pageId", "PageEntity", "page", 11).m2297d(2, 2886945382326041233L).m2296c(1548).m2298e(8, 8846653951850004940L);
        aVarM2280c.m2286c();
    }

    /* renamed from: t */
    public static void m7747t(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("TextInfoEntity");
        aVarM2280c.m2288e(11, 3085609912032192157L).m2289f(7, 5422326425890266339L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 7568483579341312750L).m2296c(1);
        aVarM2280c.m2290g("width", 7).m2297d(2, 384227753751344089L).m2296c(4);
        aVarM2280c.m2290g(TypedValues.Custom.S_COLOR, 5).m2297d(3, 5193906340737883215L).m2296c(4);
        aVarM2280c.m2290g("textSize", 7).m2297d(4, 2430925709763338506L).m2296c(4);
        aVarM2280c.m2290g("style", 5).m2297d(5, 5285358854095939391L).m2296c(4);
        aVarM2280c.m2290g("content", 9).m2297d(6, 5784995765710474993L);
        aVarM2280c.m2292i("recordId", "TextRecordEntity", "record", 11).m2297d(7, 5422326425890266339L).m2296c(1548).m2298e(11, 3424803898414461454L);
        aVarM2280c.m2286c();
    }

    /* renamed from: u */
    public static void m7748u(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("TextRecordEntity");
        aVarM2280c.m2288e(2, 1953065482304442309L).m2289f(4, 916312698009440053L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 426926565622954679L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 4748695942157109661L).m2296c(2080).m2298e(26, 9054486719078532020L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 7311582035276321573L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 916312698009440053L).m2296c(1548).m2298e(2, 8421376056513633487L);
        aVarM2280c.m2293j("textInfoEntityList", 2, 7413064398986488623L, 11, 3085609912032192157L);
        aVarM2280c.m2286c();
    }

    /* renamed from: v */
    public static void m7749v(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("TouchEventEntity");
        aVarM2280c.m2288e(4, 2827749220184605293L).m2289f(8, 4506550704609864717L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 1093335407985999731L).m2296c(1);
        aVarM2280c.m2290g("width", 7).m2297d(2, 3683603152498651467L).m2296c(4);
        aVarM2280c.m2290g(TypedValues.Custom.S_COLOR, 5).m2297d(3, 8576374943297591956L).m2296c(4);
        aVarM2280c.m2290g("spacing", 7).m2297d(4, 3208489922790624359L).m2296c(4);
        aVarM2280c.m2290g("itemLength", 7).m2297d(5, 3713427572138150910L).m2296c(4);
        aVarM2280c.m2290g("style", 5).m2297d(6, 4579135818203399571L).m2296c(4);
        aVarM2280c.m2290g("textSize", 7).m2297d(7, 5903315449039480136L).m2296c(4);
        aVarM2280c.m2292i("recordId", "TouchRecordEntity", "record", 11).m2297d(8, 4506550704609864717L).m2296c(1548).m2298e(4, 5151929149198969604L);
        aVarM2280c.m2293j("touchInfoList", 7, 4614426128572273347L, 13, 7818987629185229539L);
        aVarM2280c.m2286c();
    }

    /* renamed from: w */
    public static void m7750w(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("TouchInfoEntity");
        aVarM2280c.m2288e(13, 7818987629185229539L).m2289f(6, 5268719310319346431L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 2195736893270403606L).m2296c(1);
        aVarM2280c.m2290g("eventTime", 6).m2297d(2, 1481413978119928767L).m2296c(4);
        aVarM2280c.m2290g("x", 7).m2297d(3, 3669544801400159911L).m2296c(4);
        aVarM2280c.m2290g("y", 7).m2297d(4, 2661984942507669471L).m2296c(4);
        aVarM2280c.m2292i("recordId", "TouchEventEntity", "record", 11).m2297d(6, 5268719310319346431L).m2296c(1548).m2298e(30, 319292857095377749L);
        aVarM2280c.m2286c();
    }

    /* renamed from: x */
    public static void m7751x(C5210e c5210e) {
        C5210e.a aVarM2280c = c5210e.m2280c("TouchRecordEntity");
        aVarM2280c.m2288e(10, 5662561349855543958L).m2289f(4, 3403049600307654934L);
        aVarM2280c.m2287d(1);
        aVarM2280c.m2290g("id", 6).m2297d(1, 2213635794541564884L).m2296c(1);
        aVarM2280c.m2290g("fileName", 9).m2297d(2, 2352706818980905508L).m2296c(2080).m2298e(24, 748108574309902074L);
        aVarM2280c.m2290g("validate", 9).m2297d(3, 1147768610097659098L);
        aVarM2280c.m2292i("recordId", "RecordEntity", "record", 11).m2297d(4, 3403049600307654934L).m2296c(1548).m2298e(10, 7088145065763104873L);
        aVarM2280c.m2293j("touchEventList", 4, 6506424544508794050L, 4, 2827749220184605293L);
        aVarM2280c.m2286c();
    }

    /* renamed from: y */
    public static C5208c m7752y() {
        C5208c c5208c = new C5208c(m7753z());
        c5208c.m2273f(FileInfoEntity_.f8592d);
        c5208c.m2273f(TextInfoEntity_.f8861d);
        c5208c.m2273f(PageEntity_.f8817d);
        c5208c.m2273f(FileRecordEntity_.f8610d);
        c5208c.m2273f(TouchInfoEntity_.f8925d);
        c5208c.m2273f(AudioRecordEntity_.f8482d);
        c5208c.m2273f(BackgroundLineConfigEntity_.f8522d);
        c5208c.m2273f(CommandInfoEntity_.f8554d);
        c5208c.m2273f(MatrixEventEntity_.f8726d);
        c5208c.m2273f(AudioInfoEntity_.f8463d);
        c5208c.m2273f(MoveConfigEntity_.f8794d);
        c5208c.m2273f(TouchEventEntity_.f8901d);
        c5208c.m2273f(CommandRecordEntity_.f8573d);
        c5208c.m2273f(GeometryPointFEntity_.f8652d);
        c5208c.m2273f(MatrixInfoEntity_.f8749d);
        c5208c.m2273f(RecordEntity_.f8837d);
        c5208c.m2273f(TextRecordEntity_.f8880d);
        c5208c.m2273f(BlackBoardEntity_.f8536d);
        c5208c.m2273f(MatrixRecordEntity_.f8773d);
        c5208c.m2273f(TouchRecordEntity_.f8942d);
        c5208c.m2273f(AuthorEntity_.f8502d);
        c5208c.m2273f(GeometryInfoEntity_.f8630d);
        c5208c.m2273f(GeometryRecordEntity_.f8668d);
        c5208c.m2273f(HeaderEntity_.f8697d);
        return c5208c;
    }

    /* renamed from: z */
    public static byte[] m7753z() {
        C5210e c5210e = new C5210e();
        c5210e.m2281d(24, 6354252071401414514L);
        c5210e.m2282e(37, 8980471141152925617L);
        c5210e.m2283f(11, 5953019203812425150L);
        m7735h(c5210e);
        m7747t(c5210e);
        m7745r(c5210e);
        m7736i(c5210e);
        m7750w(c5210e);
        m7729b(c5210e);
        m7731d(c5210e);
        m7733f(c5210e);
        m7741n(c5210e);
        m7728a(c5210e);
        m7744q(c5210e);
        m7749v(c5210e);
        m7734g(c5210e);
        m7738k(c5210e);
        m7742o(c5210e);
        m7746s(c5210e);
        m7748u(c5210e);
        m7732e(c5210e);
        m7743p(c5210e);
        m7751x(c5210e);
        m7730c(c5210e);
        m7737j(c5210e);
        m7739l(c5210e);
        m7740m(c5210e);
        return c5210e.m2278a();
    }
}
