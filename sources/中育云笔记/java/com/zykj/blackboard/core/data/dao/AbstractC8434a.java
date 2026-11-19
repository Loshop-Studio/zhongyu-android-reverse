package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.android.agoo.common.AgooConstants;
import p210jc.C9712c;
import p210jc.C9714e;

/* renamed from: com.zykj.blackboard.core.data.dao.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8434a {
    /* renamed from: a */
    public static void m14356a(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("AudioInfoEntity");
        aVarM19253c.m19261e(16, 1738897579709439220L).m19262f(7, 3593987871946665066L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 4464665664412631503L).m19269c(1);
        aVarM19253c.m19263g("delayTime", 6).m19270d(2, 8231899869464597710L).m19269c(4);
        aVarM19253c.m19263g(TypedValues.TransitionType.S_DURATION, 6).m19270d(3, 6113963074376351913L).m19269c(4);
        aVarM19253c.m19263g("isPlay", 1).m19270d(4, 788937259794251244L).m19269c(4);
        aVarM19253c.m19263g("commandEnum", 5).m19270d(5, 4388561302133619468L).m19269c(2);
        aVarM19253c.m19263g("data", 23).m19270d(6, 6365167194610598110L);
        aVarM19253c.m19265i("recordId", "AudioRecordEntity", "record", 11).m19270d(7, 3593987871946665066L).m19269c(1548).m19271e(19, 4299508817415618274L);
        aVarM19253c.m19259c();
    }

    /* renamed from: b */
    public static void m14357b(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("AudioRecordEntity");
        aVarM19253c.m19261e(3, 1457477822342009278L).m19262f(4, 1106508257692437091L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 2649292414664316102L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 4207956140881163343L).m19269c(2080).m19271e(27, 6663778756731582839L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 1042370756165343078L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 1106508257692437091L).m19269c(1548).m19271e(3, 6516862116297086719L);
        aVarM19253c.m19266j("audioInfoEntity", 3, 3006960921839278746L, 16, 1738897579709439220L);
        aVarM19253c.m19259c();
    }

    /* renamed from: c */
    public static void m14358c(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("AuthorEntity");
        aVarM19253c.m19261e(19, 4491029893095874048L).m19262f(8, 8744813166089570678L);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 7180003569711224053L).m19269c(1);
        aVarM19253c.m19263g("authorName", 9).m19270d(2, 7374957285231348279L);
        aVarM19253c.m19263g("authorId", 9).m19270d(3, 5194475084078832533L);
        aVarM19253c.m19263g("schoolId", 9).m19270d(4, 1596297837259916058L);
        aVarM19253c.m19263g("url", 9).m19270d(5, 5288213926049203801L);
        aVarM19253c.m19263g("startTime", 6).m19270d(6, 8884290112765498271L).m19269c(2);
        aVarM19253c.m19263g(TypedValues.TransitionType.S_DURATION, 6).m19270d(8, 8744813166089570678L).m19269c(2);
        aVarM19253c.m19259c();
    }

    /* renamed from: d */
    public static void m14359d(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("BackgroundLineConfigEntity");
        aVarM19253c.m19261e(24, 6354252071401414514L).m19262f(5, 4659655107554112597L);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 3035121938545489039L).m19269c(1);
        aVarM19253c.m19263g("lineColor", 5).m19270d(2, 6761466792425544627L).m19269c(4);
        aVarM19253c.m19263g("lineSpace", 7).m19270d(3, 4039798210327797775L).m19269c(4);
        aVarM19253c.m19263g("lineType", 5).m19270d(4, 980589341662717929L).m19269c(2);
        aVarM19253c.m19263g("lineWidth", 7).m19270d(5, 4659655107554112597L).m19269c(4);
        aVarM19253c.m19259c();
    }

    /* renamed from: e */
    public static void m14360e(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("BlackBoardEntity");
        aVarM19253c.m19261e(12, 7195762691495625457L).m19262f(2, 186877666806702259L);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 2829339404269053744L).m19269c(1);
        aVarM19253c.m19263g("dir", 9).m19270d(2, 186877666806702259L).m19269c(2080).m19271e(12, 6978303640021140890L);
        aVarM19253c.m19259c();
    }

    /* renamed from: f */
    public static void m14361f(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("CommandInfoEntity");
        aVarM19253c.m19261e(5, 7743195144794219448L).m19262f(7, 1129747418098677705L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 6108579328042481490L).m19269c(1);
        aVarM19253c.m19263g("delayTime", 6).m19270d(2, 7495600893346042381L).m19269c(4);
        aVarM19253c.m19263g(TypedValues.TransitionType.S_DURATION, 6).m19270d(3, 2920998592584590400L).m19269c(4);
        aVarM19253c.m19263g("isPlay", 1).m19270d(4, 5866029188196944840L).m19269c(4);
        aVarM19253c.m19263g("commandEnum", 5).m19270d(5, 2864037025762273844L).m19269c(2);
        aVarM19253c.m19263g("data", 23).m19270d(6, 7102134513203239881L);
        aVarM19253c.m19265i("recordId", "CommandRecordEntity", "record", 11).m19270d(7, 1129747418098677705L).m19269c(1548).m19271e(5, 6471342414470418154L);
        aVarM19253c.m19259c();
    }

    /* renamed from: g */
    public static void m14362g(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("CommandRecordEntity");
        aVarM19253c.m19261e(17, 1533675624321273659L).m19262f(4, 1466976068188736837L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 1272142568700193409L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 7756355126835864518L).m19269c(2080).m19271e(28, 3242269590877547980L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 2415335769260754690L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 1466976068188736837L).m19269c(1548).m19271e(21, 8882662362608194884L);
        aVarM19253c.m19266j("commandInfoEntity", 8, 5120029386737400181L, 5, 7743195144794219448L);
        aVarM19253c.m19259c();
    }

    /* renamed from: h */
    public static void m14363h(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("FileInfoEntity");
        aVarM19253c.m19261e(7, 7195933198745853214L).m19262f(6, 1726522676427700178L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 1594301834817904798L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 2076957862605615295L);
        aVarM19253c.m19263g("width", 5).m19270d(3, 4333266520315125758L).m19269c(4);
        aVarM19253c.m19263g("height", 5).m19270d(4, 1087837405856477495L).m19269c(4);
        aVarM19253c.m19263g("validate", 9).m19270d(5, 2682325834017592360L);
        aVarM19253c.m19265i("recordId", "FileRecordEntity", "record", 11).m19270d(6, 1726522676427700178L).m19269c(1548).m19271e(7, 8975889253592560872L);
        aVarM19253c.m19259c();
    }

    /* renamed from: i */
    public static void m14364i(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("FileRecordEntity");
        aVarM19253c.m19261e(1, 8807702116810287113L).m19262f(4, 581255084365138855L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 2860392549289493867L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 4135892801542342702L).m19269c(2080).m19271e(25, 7101345596046178982L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 1211937380881226049L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 581255084365138855L).m19269c(1548).m19271e(1, 4664252886558210776L);
        aVarM19253c.m19266j("fileInfoEntity", 1, 5610121978791820784L, 7, 7195933198745853214L);
        aVarM19253c.m19259c();
    }

    /* renamed from: j */
    public static void m14365j(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("GeometryInfoEntity");
        aVarM19253c.m19261e(21, 4283823219291471141L).m19262f(7, 9052518300307403450L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 758369890359825821L).m19269c(1);
        aVarM19253c.m19263g("width", 7).m19270d(2, 6960047647875413528L).m19269c(4);
        aVarM19253c.m19263g(TypedValues.Custom.S_COLOR, 5).m19270d(3, 7600926013197305234L).m19269c(4);
        aVarM19253c.m19263g("textSize", 7).m19270d(4, 4261713491849246304L).m19269c(4);
        aVarM19253c.m19263g("style", 5).m19270d(5, 7680322400492902307L).m19269c(4);
        aVarM19253c.m19263g("geometryType", 5).m19270d(6, 3821197663929267481L).m19269c(4);
        aVarM19253c.m19265i("recordId", "GeometryRecordEntity", "record", 11).m19270d(7, 9052518300307403450L).m19269c(1548).m19271e(32, 4851417164413620379L);
        aVarM19253c.m19266j("pointList", 10, 2467931522611419646L, 23, 253983218610838927L);
        aVarM19253c.m19259c();
    }

    /* renamed from: k */
    public static void m14366k(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("GeometryPointFEntity");
        aVarM19253c.m19261e(23, 253983218610838927L).m19262f(4, 2993647435457907111L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 2460418406859650403L).m19269c(1);
        aVarM19253c.m19263g("x", 7).m19270d(2, 6341504903440599321L).m19269c(4);
        aVarM19253c.m19263g("y", 7).m19270d(3, 2119941464416690896L).m19269c(4);
        aVarM19253c.m19265i("recordId", "GeometryInfoEntity", "record", 11).m19270d(4, 2993647435457907111L).m19269c(1548).m19271e(35, 2983199780290730863L);
        aVarM19253c.m19259c();
    }

    /* renamed from: l */
    public static void m14367l(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("GeometryRecordEntity");
        aVarM19253c.m19261e(22, 6578349910275058692L).m19262f(4, 6414865175094240391L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 6975215749131372137L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 8731590737446971660L).m19269c(2080).m19271e(33, 6460443964786600L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 222015663972846583L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 6414865175094240391L).m19269c(1548).m19271e(34, 8208977622133384242L);
        aVarM19253c.m19266j("geometryInfoEntityList", 11, 5953019203812425150L, 21, 4283823219291471141L);
        aVarM19253c.m19259c();
    }

    /* renamed from: m */
    public static void m14368m(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("HeaderEntity");
        aVarM19253c.m19261e(6, 8452738864375470324L).m19262f(16, 942905870368347727L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 271083587316187516L).m19269c(1);
        aVarM19253c.m19263g("version", 5).m19270d(2, 2896554452934883007L).m19269c(4);
        aVarM19253c.m19263g("width", 5).m19270d(3, 2306043389845325438L).m19269c(4);
        aVarM19253c.m19263g("height", 5).m19270d(4, 91702869420279569L).m19269c(4);
        aVarM19253c.m19263g("createDate", 6).m19270d(5, 1599255963751619189L).m19269c(4);
        aVarM19253c.m19263g("updateDate", 6).m19270d(6, 3987983768584614497L).m19269c(4);
        aVarM19253c.m19263g(TypedValues.TransitionType.S_DURATION, 6).m19270d(7, 6756707614908736118L).m19269c(4);
        aVarM19253c.m19263g("convertUrl", 9).m19270d(11, 6421407192872309397L);
        aVarM19253c.m19263g("defaultBackgroundColor", 5).m19270d(12, 236332159395675736L).m19269c(4);
        aVarM19253c.m19263g("lastBackgroundColor", 5).m19270d(13, 6841752251661063892L).m19269c(4);
        aVarM19253c.m19265i("pageId", "PageEntity", "page", 11).m19270d(9, 5797256570918588576L).m19269c(1548).m19271e(6, 7029446957088249008L);
        aVarM19253c.m19265i("defaultBackgroundLineConfigId", "BackgroundLineConfigEntity", "defaultBackgroundLineConfig", 11).m19270d(15, 396819869407887376L).m19269c(1548).m19271e(36, 683525170848437566L);
        aVarM19253c.m19265i("lastBackgroundLineConfigId", "BackgroundLineConfigEntity", "lastBackgroundLineConfig", 11).m19270d(16, 942905870368347727L).m19269c(1548).m19271e(37, 8980471141152925617L);
        aVarM19253c.m19265i("authorId", "AuthorEntity", "author", 11).m19270d(10, 6953139294800756044L).m19269c(1548).m19271e(23, 395137366286267102L);
        aVarM19253c.m19265i("moveConfigId", "MoveConfigEntity", "moveConfig", 11).m19270d(14, 7656223054002431488L).m19269c(1548).m19271e(31, 1717867400835038482L);
        aVarM19253c.m19266j("provider", 9, 6672723083024400856L, 19, 4491029893095874048L);
        aVarM19253c.m19259c();
    }

    /* renamed from: n */
    public static void m14369n(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("MatrixEventEntity");
        aVarM19253c.m19261e(15, 48825879652876793L).m19262f(2, 2703943048309286272L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 1294314152973867822L).m19269c(1);
        aVarM19253c.m19265i("recordId", "MatrixRecordEntity", "record", 11).m19270d(2, 2703943048309286272L).m19269c(1548).m19271e(18, 9095157777139256777L);
        aVarM19253c.m19266j("matrixInfo", 5, 212650025651297158L, 9, 7339194381174988674L);
        aVarM19253c.m19259c();
    }

    /* renamed from: o */
    public static void m14370o(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("MatrixInfoEntity");
        aVarM19253c.m19261e(9, 7339194381174988674L).m19262f(12, 2413030854442085848L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 8157824128287595L).m19269c(1);
        aVarM19253c.m19263g("eventTime", 6).m19270d(2, 7007943029564757631L).m19269c(4);
        aVarM19253c.m19263g("scaleX", 7).m19270d(3, 2687769118052329326L).m19269c(4);
        aVarM19253c.m19263g("skewX", 7).m19270d(4, 6762616002731522458L).m19269c(4);
        aVarM19253c.m19263g("transX", 7).m19270d(5, 6964916551845516534L).m19269c(4);
        aVarM19253c.m19263g("skewY", 7).m19270d(6, 3311941188489375960L).m19269c(4);
        aVarM19253c.m19263g("scaleY", 7).m19270d(7, 7877646726736821918L).m19269c(4);
        aVarM19253c.m19263g("transY", 7).m19270d(8, 1872363001763917480L).m19269c(4);
        aVarM19253c.m19263g("perSp0", 7).m19270d(9, 72471971767457762L).m19269c(4);
        aVarM19253c.m19263g("perSp1", 7).m19270d(10, 7024503675101809910L).m19269c(4);
        aVarM19253c.m19263g("perSp2", 7).m19270d(11, 2583504155705184995L).m19269c(4);
        aVarM19253c.m19265i("recordId", "MatrixEventEntity", "record", 11).m19270d(12, 2413030854442085848L).m19269c(1548).m19271e(9, 4985497566298461031L);
        aVarM19253c.m19259c();
    }

    /* renamed from: p */
    public static void m14371p(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("MatrixRecordEntity");
        aVarM19253c.m19261e(18, 7216434272107827427L).m19262f(4, 4717262115324513656L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 3332239218713743535L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 3923730455450647348L).m19269c(2080).m19271e(29, 2913780019033877908L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 2579243705245830986L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 4717262115324513656L).m19269c(1548).m19271e(22, 5374541823673306691L);
        aVarM19253c.m19266j("matrixEventEntity", 6, 7483456025692942476L, 15, 48825879652876793L);
        aVarM19253c.m19259c();
    }

    /* renamed from: q */
    public static void m14372q(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("MoveConfigEntity");
        aVarM19253c.m19261e(20, 2661032766343741927L).m19262f(9, 1162392463661187332L);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 8297618772721499694L).m19269c(1);
        aVarM19253c.m19263g("isEnable", 1).m19270d(2, 4386292675948115713L).m19269c(4);
        aVarM19253c.m19263g("verticalTranslate", 1).m19270d(3, 6819516440817401546L).m19269c(4);
        aVarM19253c.m19263g("horizontalTranslate", 1).m19270d(4, 6989581654964039122L).m19269c(4);
        aVarM19253c.m19263g("scale", 1).m19270d(5, 2559327698020118256L).m19269c(4);
        aVarM19253c.m19263g("rotate", 1).m19270d(6, 3163637491624971432L).m19269c(4);
        aVarM19253c.m19263g("maxHeightTimes", 5).m19270d(7, 6285416184997064814L).m19269c(4);
        aVarM19253c.m19263g("maxWidthTimes", 5).m19270d(8, 6140357146400751997L).m19269c(4);
        aVarM19253c.m19259c();
    }

    /* renamed from: r */
    public static void m14373r(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("PageEntity");
        aVarM19253c.m19261e(14, 3184073876524851644L).m19262f(8, 7278221643870379970L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 4158900098315997984L).m19269c(1);
        aVarM19253c.m19263g("dirName", 9).m19270d(2, 8144911141438072323L).m19269c(2080).m19271e(14, 1104334313543109363L);
        aVarM19253c.m19263g("isChange", 1).m19270d(3, 8953445388604105523L).m19269c(4);
        aVarM19253c.m19263g("commandFileName", 9).m19270d(4, 5799487931391644931L);
        aVarM19253c.m19263g("commandIndex", 5).m19270d(5, 3846866282671597737L).m19269c(4);
        aVarM19253c.m19265i("blackBoardEntityId", "BlackBoardEntity", "blackBoardEntity", 11).m19270d(6, 6370233532038825797L).m19269c(1548).m19271e(15, 2192016506092991606L);
        aVarM19253c.m19265i("recordEntityId", "RecordEntity", "recordEntity", 11).m19270d(7, 6561183928856383072L).m19269c(1548).m19271e(16, 5117758800188434743L);
        aVarM19253c.m19265i("headerEntityId", "HeaderEntity", "headerEntity", 11).m19270d(8, 7278221643870379970L).m19269c(1548).m19271e(17, 5180167903368983391L);
        aVarM19253c.m19259c();
    }

    /* renamed from: s */
    public static void m14374s(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("RecordEntity");
        aVarM19253c.m19261e(8, 891357147187211080L).m19262f(2, 2886945382326041233L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 9046634465887903763L).m19269c(1);
        aVarM19253c.m19265i("pageId", "PageEntity", "page", 11).m19270d(2, 2886945382326041233L).m19269c(1548).m19271e(8, 8846653951850004940L);
        aVarM19253c.m19259c();
    }

    /* renamed from: t */
    public static void m14375t(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("TextInfoEntity");
        aVarM19253c.m19261e(11, 3085609912032192157L).m19262f(7, 5422326425890266339L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 7568483579341312750L).m19269c(1);
        aVarM19253c.m19263g("width", 7).m19270d(2, 384227753751344089L).m19269c(4);
        aVarM19253c.m19263g(TypedValues.Custom.S_COLOR, 5).m19270d(3, 5193906340737883215L).m19269c(4);
        aVarM19253c.m19263g("textSize", 7).m19270d(4, 2430925709763338506L).m19269c(4);
        aVarM19253c.m19263g("style", 5).m19270d(5, 5285358854095939391L).m19269c(4);
        aVarM19253c.m19263g("content", 9).m19270d(6, 5784995765710474993L);
        aVarM19253c.m19265i("recordId", "TextRecordEntity", "record", 11).m19270d(7, 5422326425890266339L).m19269c(1548).m19271e(11, 3424803898414461454L);
        aVarM19253c.m19259c();
    }

    /* renamed from: u */
    public static void m14376u(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("TextRecordEntity");
        aVarM19253c.m19261e(2, 1953065482304442309L).m19262f(4, 916312698009440053L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 426926565622954679L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 4748695942157109661L).m19269c(2080).m19271e(26, 9054486719078532020L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 7311582035276321573L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 916312698009440053L).m19269c(1548).m19271e(2, 8421376056513633487L);
        aVarM19253c.m19266j("textInfoEntityList", 2, 7413064398986488623L, 11, 3085609912032192157L);
        aVarM19253c.m19259c();
    }

    /* renamed from: v */
    public static void m14377v(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("TouchEventEntity");
        aVarM19253c.m19261e(4, 2827749220184605293L).m19262f(8, 4506550704609864717L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 1093335407985999731L).m19269c(1);
        aVarM19253c.m19263g("width", 7).m19270d(2, 3683603152498651467L).m19269c(4);
        aVarM19253c.m19263g(TypedValues.Custom.S_COLOR, 5).m19270d(3, 8576374943297591956L).m19269c(4);
        aVarM19253c.m19263g("spacing", 7).m19270d(4, 3208489922790624359L).m19269c(4);
        aVarM19253c.m19263g("itemLength", 7).m19270d(5, 3713427572138150910L).m19269c(4);
        aVarM19253c.m19263g("style", 5).m19270d(6, 4579135818203399571L).m19269c(4);
        aVarM19253c.m19263g("textSize", 7).m19270d(7, 5903315449039480136L).m19269c(4);
        aVarM19253c.m19265i("recordId", "TouchRecordEntity", "record", 11).m19270d(8, 4506550704609864717L).m19269c(1548).m19271e(4, 5151929149198969604L);
        aVarM19253c.m19266j("touchInfoList", 7, 4614426128572273347L, 13, 7818987629185229539L);
        aVarM19253c.m19259c();
    }

    /* renamed from: w */
    public static void m14378w(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("TouchInfoEntity");
        aVarM19253c.m19261e(13, 7818987629185229539L).m19262f(6, 5268719310319346431L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 2195736893270403606L).m19269c(1);
        aVarM19253c.m19263g("eventTime", 6).m19270d(2, 1481413978119928767L).m19269c(4);
        aVarM19253c.m19263g("x", 7).m19270d(3, 3669544801400159911L).m19269c(4);
        aVarM19253c.m19263g("y", 7).m19270d(4, 2661984942507669471L).m19269c(4);
        aVarM19253c.m19265i("recordId", "TouchEventEntity", "record", 11).m19270d(6, 5268719310319346431L).m19269c(1548).m19271e(30, 319292857095377749L);
        aVarM19253c.m19259c();
    }

    /* renamed from: x */
    public static void m14379x(C9714e c9714e) {
        C9714e.a aVarM19253c = c9714e.m19253c("TouchRecordEntity");
        aVarM19253c.m19261e(10, 5662561349855543958L).m19262f(4, 3403049600307654934L);
        aVarM19253c.m19260d(1);
        aVarM19253c.m19263g(AgooConstants.MESSAGE_ID, 6).m19270d(1, 2213635794541564884L).m19269c(1);
        aVarM19253c.m19263g("fileName", 9).m19270d(2, 2352706818980905508L).m19269c(2080).m19271e(24, 748108574309902074L);
        aVarM19253c.m19263g("validate", 9).m19270d(3, 1147768610097659098L);
        aVarM19253c.m19265i("recordId", "RecordEntity", "record", 11).m19270d(4, 3403049600307654934L).m19269c(1548).m19271e(10, 7088145065763104873L);
        aVarM19253c.m19266j("touchEventList", 4, 6506424544508794050L, 4, 2827749220184605293L);
        aVarM19253c.m19259c();
    }

    /* renamed from: y */
    public static C9712c m14380y() {
        C9712c c9712c = new C9712c(m14381z());
        c9712c.m19246g(FileInfoEntity_.f18153f);
        c9712c.m19246g(TextInfoEntity_.f18422f);
        c9712c.m19246g(PageEntity_.f18378f);
        c9712c.m19246g(FileRecordEntity_.f18171f);
        c9712c.m19246g(TouchInfoEntity_.f18486f);
        c9712c.m19246g(AudioRecordEntity_.f18043f);
        c9712c.m19246g(BackgroundLineConfigEntity_.f18083f);
        c9712c.m19246g(CommandInfoEntity_.f18115f);
        c9712c.m19246g(MatrixEventEntity_.f18287f);
        c9712c.m19246g(AudioInfoEntity_.f18024f);
        c9712c.m19246g(MoveConfigEntity_.f18355f);
        c9712c.m19246g(TouchEventEntity_.f18462f);
        c9712c.m19246g(CommandRecordEntity_.f18134f);
        c9712c.m19246g(GeometryPointFEntity_.f18213f);
        c9712c.m19246g(MatrixInfoEntity_.f18310f);
        c9712c.m19246g(RecordEntity_.f18398f);
        c9712c.m19246g(TextRecordEntity_.f18441f);
        c9712c.m19246g(BlackBoardEntity_.f18097f);
        c9712c.m19246g(MatrixRecordEntity_.f18334f);
        c9712c.m19246g(TouchRecordEntity_.f18503f);
        c9712c.m19246g(AuthorEntity_.f18063f);
        c9712c.m19246g(GeometryInfoEntity_.f18191f);
        c9712c.m19246g(GeometryRecordEntity_.f18229f);
        c9712c.m19246g(HeaderEntity_.f18260f);
        return c9712c;
    }

    /* renamed from: z */
    public static byte[] m14381z() {
        C9714e c9714e = new C9714e();
        c9714e.m19254d(24, 6354252071401414514L);
        c9714e.m19255e(37, 8980471141152925617L);
        c9714e.m19256f(11, 5953019203812425150L);
        m14363h(c9714e);
        m14375t(c9714e);
        m14373r(c9714e);
        m14364i(c9714e);
        m14378w(c9714e);
        m14357b(c9714e);
        m14359d(c9714e);
        m14361f(c9714e);
        m14369n(c9714e);
        m14356a(c9714e);
        m14372q(c9714e);
        m14377v(c9714e);
        m14362g(c9714e);
        m14366k(c9714e);
        m14370o(c9714e);
        m14374s(c9714e);
        m14376u(c9714e);
        m14360e(c9714e);
        m14371p(c9714e);
        m14379x(c9714e);
        m14358c(c9714e);
        m14365j(c9714e);
        m14367l(c9714e);
        m14368m(c9714e);
        return c9714e.m19251a();
    }
}
