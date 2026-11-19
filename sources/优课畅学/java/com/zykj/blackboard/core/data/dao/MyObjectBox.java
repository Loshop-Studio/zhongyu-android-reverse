package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import io.objectbox.C8960c;
import io.objectbox.C8962e;

/* loaded from: classes4.dex */
public class MyObjectBox {
    private static void buildEntityAudioInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("AudioInfoEntity");
        aVarM15443c.m15451e(16, 1738897579709439220L).m15452f(7, 3593987871946665066L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 4464665664412631503L).m15459c(1);
        aVarM15443c.m15453g("delayTime", 6).m15460d(2, 8231899869464597710L).m15459c(4);
        aVarM15443c.m15453g(TypedValues.TransitionType.S_DURATION, 6).m15460d(3, 6113963074376351913L).m15459c(4);
        aVarM15443c.m15453g("isPlay", 1).m15460d(4, 788937259794251244L).m15459c(4);
        aVarM15443c.m15453g("commandEnum", 5).m15460d(5, 4388561302133619468L).m15459c(2);
        aVarM15443c.m15453g("data", 23).m15460d(6, 6365167194610598110L);
        aVarM15443c.m15455i("recordId", "AudioRecordEntity", "record", 11).m15460d(7, 3593987871946665066L).m15459c(1548).m15461e(19, 4299508817415618274L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityAudioRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("AudioRecordEntity");
        aVarM15443c.m15451e(3, 1457477822342009278L).m15452f(4, 1106508257692437091L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 2649292414664316102L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 4207956140881163343L).m15459c(2080).m15461e(27, 6663778756731582839L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 1042370756165343078L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 1106508257692437091L).m15459c(1548).m15461e(3, 6516862116297086719L);
        aVarM15443c.m15456j("audioInfoEntity", 3, 3006960921839278746L, 16, 1738897579709439220L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityAuthorEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("AuthorEntity");
        aVarM15443c.m15451e(19, 4491029893095874048L).m15452f(8, 8744813166089570678L);
        aVarM15443c.m15453g("id", 6).m15460d(1, 7180003569711224053L).m15459c(1);
        aVarM15443c.m15453g("authorName", 9).m15460d(2, 7374957285231348279L);
        aVarM15443c.m15453g("authorId", 9).m15460d(3, 5194475084078832533L);
        aVarM15443c.m15453g("schoolId", 9).m15460d(4, 1596297837259916058L);
        aVarM15443c.m15453g(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, 9).m15460d(5, 5288213926049203801L);
        aVarM15443c.m15453g("startTime", 6).m15460d(6, 8884290112765498271L).m15459c(2);
        aVarM15443c.m15453g(TypedValues.TransitionType.S_DURATION, 6).m15460d(8, 8744813166089570678L).m15459c(2);
        aVarM15443c.m15449c();
    }

    private static void buildEntityBackgroundLineConfigEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("BackgroundLineConfigEntity");
        aVarM15443c.m15451e(24, 6354252071401414514L).m15452f(5, 4659655107554112597L);
        aVarM15443c.m15453g("id", 6).m15460d(1, 3035121938545489039L).m15459c(1);
        aVarM15443c.m15453g("lineColor", 5).m15460d(2, 6761466792425544627L).m15459c(4);
        aVarM15443c.m15453g("lineSpace", 7).m15460d(3, 4039798210327797775L).m15459c(4);
        aVarM15443c.m15453g("lineType", 5).m15460d(4, 980589341662717929L).m15459c(2);
        aVarM15443c.m15453g("lineWidth", 7).m15460d(5, 4659655107554112597L).m15459c(4);
        aVarM15443c.m15449c();
    }

    private static void buildEntityBlackBoardEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("BlackBoardEntity");
        aVarM15443c.m15451e(12, 7195762691495625457L).m15452f(2, 186877666806702259L);
        aVarM15443c.m15453g("id", 6).m15460d(1, 2829339404269053744L).m15459c(1);
        aVarM15443c.m15453g("dir", 9).m15460d(2, 186877666806702259L).m15459c(2080).m15461e(12, 6978303640021140890L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityCommandInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("CommandInfoEntity");
        aVarM15443c.m15451e(5, 7743195144794219448L).m15452f(7, 1129747418098677705L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 6108579328042481490L).m15459c(1);
        aVarM15443c.m15453g("delayTime", 6).m15460d(2, 7495600893346042381L).m15459c(4);
        aVarM15443c.m15453g(TypedValues.TransitionType.S_DURATION, 6).m15460d(3, 2920998592584590400L).m15459c(4);
        aVarM15443c.m15453g("isPlay", 1).m15460d(4, 5866029188196944840L).m15459c(4);
        aVarM15443c.m15453g("commandEnum", 5).m15460d(5, 2864037025762273844L).m15459c(2);
        aVarM15443c.m15453g("data", 23).m15460d(6, 7102134513203239881L);
        aVarM15443c.m15455i("recordId", "CommandRecordEntity", "record", 11).m15460d(7, 1129747418098677705L).m15459c(1548).m15461e(5, 6471342414470418154L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityCommandRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("CommandRecordEntity");
        aVarM15443c.m15451e(17, 1533675624321273659L).m15452f(4, 1466976068188736837L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 1272142568700193409L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 7756355126835864518L).m15459c(2080).m15461e(28, 3242269590877547980L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 2415335769260754690L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 1466976068188736837L).m15459c(1548).m15461e(21, 8882662362608194884L);
        aVarM15443c.m15456j("commandInfoEntity", 8, 5120029386737400181L, 5, 7743195144794219448L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityFileInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("FileInfoEntity");
        aVarM15443c.m15451e(7, 7195933198745853214L).m15452f(6, 1726522676427700178L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 1594301834817904798L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 2076957862605615295L);
        aVarM15443c.m15453g("width", 5).m15460d(3, 4333266520315125758L).m15459c(4);
        aVarM15443c.m15453g("height", 5).m15460d(4, 1087837405856477495L).m15459c(4);
        aVarM15443c.m15453g("validate", 9).m15460d(5, 2682325834017592360L);
        aVarM15443c.m15455i("recordId", "FileRecordEntity", "record", 11).m15460d(6, 1726522676427700178L).m15459c(1548).m15461e(7, 8975889253592560872L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityFileRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("FileRecordEntity");
        aVarM15443c.m15451e(1, 8807702116810287113L).m15452f(4, 581255084365138855L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 2860392549289493867L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 4135892801542342702L).m15459c(2080).m15461e(25, 7101345596046178982L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 1211937380881226049L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 581255084365138855L).m15459c(1548).m15461e(1, 4664252886558210776L);
        aVarM15443c.m15456j("fileInfoEntity", 1, 5610121978791820784L, 7, 7195933198745853214L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityGeometryInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("GeometryInfoEntity");
        aVarM15443c.m15451e(21, 4283823219291471141L).m15452f(7, 9052518300307403450L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 758369890359825821L).m15459c(1);
        aVarM15443c.m15453g("width", 7).m15460d(2, 6960047647875413528L).m15459c(4);
        aVarM15443c.m15453g(TypedValues.Custom.S_COLOR, 5).m15460d(3, 7600926013197305234L).m15459c(4);
        aVarM15443c.m15453g("textSize", 7).m15460d(4, 4261713491849246304L).m15459c(4);
        aVarM15443c.m15453g("style", 5).m15460d(5, 7680322400492902307L).m15459c(4);
        aVarM15443c.m15453g("geometryType", 5).m15460d(6, 3821197663929267481L).m15459c(4);
        aVarM15443c.m15455i("recordId", "GeometryRecordEntity", "record", 11).m15460d(7, 9052518300307403450L).m15459c(1548).m15461e(32, 4851417164413620379L);
        aVarM15443c.m15456j("pointList", 10, 2467931522611419646L, 23, 253983218610838927L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityGeometryPointFEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("GeometryPointFEntity");
        aVarM15443c.m15451e(23, 253983218610838927L).m15452f(4, 2993647435457907111L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 2460418406859650403L).m15459c(1);
        aVarM15443c.m15453g("x", 7).m15460d(2, 6341504903440599321L).m15459c(4);
        aVarM15443c.m15453g("y", 7).m15460d(3, 2119941464416690896L).m15459c(4);
        aVarM15443c.m15455i("recordId", "GeometryInfoEntity", "record", 11).m15460d(4, 2993647435457907111L).m15459c(1548).m15461e(35, 2983199780290730863L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityGeometryRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("GeometryRecordEntity");
        aVarM15443c.m15451e(22, 6578349910275058692L).m15452f(4, 6414865175094240391L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 6975215749131372137L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 8731590737446971660L).m15459c(2080).m15461e(33, 6460443964786600L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 222015663972846583L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 6414865175094240391L).m15459c(1548).m15461e(34, 8208977622133384242L);
        aVarM15443c.m15456j("geometryInfoEntityList", 11, 5953019203812425150L, 21, 4283823219291471141L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityHeaderEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("HeaderEntity");
        aVarM15443c.m15451e(6, 8452738864375470324L).m15452f(16, 942905870368347727L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 271083587316187516L).m15459c(1);
        aVarM15443c.m15453g("version", 5).m15460d(2, 2896554452934883007L).m15459c(4);
        aVarM15443c.m15453g("width", 5).m15460d(3, 2306043389845325438L).m15459c(4);
        aVarM15443c.m15453g("height", 5).m15460d(4, 91702869420279569L).m15459c(4);
        aVarM15443c.m15453g("createDate", 6).m15460d(5, 1599255963751619189L).m15459c(4);
        aVarM15443c.m15453g("updateDate", 6).m15460d(6, 3987983768584614497L).m15459c(4);
        aVarM15443c.m15453g(TypedValues.TransitionType.S_DURATION, 6).m15460d(7, 6756707614908736118L).m15459c(4);
        aVarM15443c.m15453g("convertUrl", 9).m15460d(11, 6421407192872309397L);
        aVarM15443c.m15453g("defaultBackgroundColor", 5).m15460d(12, 236332159395675736L).m15459c(4);
        aVarM15443c.m15453g("lastBackgroundColor", 5).m15460d(13, 6841752251661063892L).m15459c(4);
        aVarM15443c.m15455i("pageId", "PageEntity", "page", 11).m15460d(9, 5797256570918588576L).m15459c(1548).m15461e(6, 7029446957088249008L);
        aVarM15443c.m15455i("defaultBackgroundLineConfigId", "BackgroundLineConfigEntity", "defaultBackgroundLineConfig", 11).m15460d(15, 396819869407887376L).m15459c(1548).m15461e(36, 683525170848437566L);
        aVarM15443c.m15455i("lastBackgroundLineConfigId", "BackgroundLineConfigEntity", "lastBackgroundLineConfig", 11).m15460d(16, 942905870368347727L).m15459c(1548).m15461e(37, 8980471141152925617L);
        aVarM15443c.m15455i("authorId", "AuthorEntity", "author", 11).m15460d(10, 6953139294800756044L).m15459c(1548).m15461e(23, 395137366286267102L);
        aVarM15443c.m15455i("moveConfigId", "MoveConfigEntity", "moveConfig", 11).m15460d(14, 7656223054002431488L).m15459c(1548).m15461e(31, 1717867400835038482L);
        aVarM15443c.m15456j("provider", 9, 6672723083024400856L, 19, 4491029893095874048L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityMatrixEventEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("MatrixEventEntity");
        aVarM15443c.m15451e(15, 48825879652876793L).m15452f(2, 2703943048309286272L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 1294314152973867822L).m15459c(1);
        aVarM15443c.m15455i("recordId", "MatrixRecordEntity", "record", 11).m15460d(2, 2703943048309286272L).m15459c(1548).m15461e(18, 9095157777139256777L);
        aVarM15443c.m15456j("matrixInfo", 5, 212650025651297158L, 9, 7339194381174988674L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityMatrixInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("MatrixInfoEntity");
        aVarM15443c.m15451e(9, 7339194381174988674L).m15452f(12, 2413030854442085848L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 8157824128287595L).m15459c(1);
        aVarM15443c.m15453g("eventTime", 6).m15460d(2, 7007943029564757631L).m15459c(4);
        aVarM15443c.m15453g("scaleX", 7).m15460d(3, 2687769118052329326L).m15459c(4);
        aVarM15443c.m15453g("skewX", 7).m15460d(4, 6762616002731522458L).m15459c(4);
        aVarM15443c.m15453g("transX", 7).m15460d(5, 6964916551845516534L).m15459c(4);
        aVarM15443c.m15453g("skewY", 7).m15460d(6, 3311941188489375960L).m15459c(4);
        aVarM15443c.m15453g("scaleY", 7).m15460d(7, 7877646726736821918L).m15459c(4);
        aVarM15443c.m15453g("transY", 7).m15460d(8, 1872363001763917480L).m15459c(4);
        aVarM15443c.m15453g("perSp0", 7).m15460d(9, 72471971767457762L).m15459c(4);
        aVarM15443c.m15453g("perSp1", 7).m15460d(10, 7024503675101809910L).m15459c(4);
        aVarM15443c.m15453g("perSp2", 7).m15460d(11, 2583504155705184995L).m15459c(4);
        aVarM15443c.m15455i("recordId", "MatrixEventEntity", "record", 11).m15460d(12, 2413030854442085848L).m15459c(1548).m15461e(9, 4985497566298461031L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityMatrixRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("MatrixRecordEntity");
        aVarM15443c.m15451e(18, 7216434272107827427L).m15452f(4, 4717262115324513656L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 3332239218713743535L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 3923730455450647348L).m15459c(2080).m15461e(29, 2913780019033877908L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 2579243705245830986L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 4717262115324513656L).m15459c(1548).m15461e(22, 5374541823673306691L);
        aVarM15443c.m15456j("matrixEventEntity", 6, 7483456025692942476L, 15, 48825879652876793L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityMoveConfigEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("MoveConfigEntity");
        aVarM15443c.m15451e(20, 2661032766343741927L).m15452f(9, 1162392463661187332L);
        aVarM15443c.m15453g("id", 6).m15460d(1, 8297618772721499694L).m15459c(1);
        aVarM15443c.m15453g("isEnable", 1).m15460d(2, 4386292675948115713L).m15459c(4);
        aVarM15443c.m15453g("verticalTranslate", 1).m15460d(3, 6819516440817401546L).m15459c(4);
        aVarM15443c.m15453g("horizontalTranslate", 1).m15460d(4, 6989581654964039122L).m15459c(4);
        aVarM15443c.m15453g("scale", 1).m15460d(5, 2559327698020118256L).m15459c(4);
        aVarM15443c.m15453g("rotate", 1).m15460d(6, 3163637491624971432L).m15459c(4);
        aVarM15443c.m15453g("maxHeightTimes", 5).m15460d(7, 6285416184997064814L).m15459c(4);
        aVarM15443c.m15453g("maxWidthTimes", 5).m15460d(8, 6140357146400751997L).m15459c(4);
        aVarM15443c.m15449c();
    }

    private static void buildEntityPageEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("PageEntity");
        aVarM15443c.m15451e(14, 3184073876524851644L).m15452f(8, 7278221643870379970L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 4158900098315997984L).m15459c(1);
        aVarM15443c.m15453g("dirName", 9).m15460d(2, 8144911141438072323L).m15459c(2080).m15461e(14, 1104334313543109363L);
        aVarM15443c.m15453g("isChange", 1).m15460d(3, 8953445388604105523L).m15459c(4);
        aVarM15443c.m15453g("commandFileName", 9).m15460d(4, 5799487931391644931L);
        aVarM15443c.m15453g("commandIndex", 5).m15460d(5, 3846866282671597737L).m15459c(4);
        aVarM15443c.m15455i("blackBoardEntityId", "BlackBoardEntity", "blackBoardEntity", 11).m15460d(6, 6370233532038825797L).m15459c(1548).m15461e(15, 2192016506092991606L);
        aVarM15443c.m15455i("recordEntityId", "RecordEntity", "recordEntity", 11).m15460d(7, 6561183928856383072L).m15459c(1548).m15461e(16, 5117758800188434743L);
        aVarM15443c.m15455i("headerEntityId", "HeaderEntity", "headerEntity", 11).m15460d(8, 7278221643870379970L).m15459c(1548).m15461e(17, 5180167903368983391L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("RecordEntity");
        aVarM15443c.m15451e(8, 891357147187211080L).m15452f(2, 2886945382326041233L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 9046634465887903763L).m15459c(1);
        aVarM15443c.m15455i("pageId", "PageEntity", "page", 11).m15460d(2, 2886945382326041233L).m15459c(1548).m15461e(8, 8846653951850004940L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityTextInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("TextInfoEntity");
        aVarM15443c.m15451e(11, 3085609912032192157L).m15452f(7, 5422326425890266339L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 7568483579341312750L).m15459c(1);
        aVarM15443c.m15453g("width", 7).m15460d(2, 384227753751344089L).m15459c(4);
        aVarM15443c.m15453g(TypedValues.Custom.S_COLOR, 5).m15460d(3, 5193906340737883215L).m15459c(4);
        aVarM15443c.m15453g("textSize", 7).m15460d(4, 2430925709763338506L).m15459c(4);
        aVarM15443c.m15453g("style", 5).m15460d(5, 5285358854095939391L).m15459c(4);
        aVarM15443c.m15453g("content", 9).m15460d(6, 5784995765710474993L);
        aVarM15443c.m15455i("recordId", "TextRecordEntity", "record", 11).m15460d(7, 5422326425890266339L).m15459c(1548).m15461e(11, 3424803898414461454L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityTextRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("TextRecordEntity");
        aVarM15443c.m15451e(2, 1953065482304442309L).m15452f(4, 916312698009440053L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 426926565622954679L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 4748695942157109661L).m15459c(2080).m15461e(26, 9054486719078532020L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 7311582035276321573L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 916312698009440053L).m15459c(1548).m15461e(2, 8421376056513633487L);
        aVarM15443c.m15456j("textInfoEntityList", 2, 7413064398986488623L, 11, 3085609912032192157L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityTouchEventEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("TouchEventEntity");
        aVarM15443c.m15451e(4, 2827749220184605293L).m15452f(8, 4506550704609864717L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 1093335407985999731L).m15459c(1);
        aVarM15443c.m15453g("width", 7).m15460d(2, 3683603152498651467L).m15459c(4);
        aVarM15443c.m15453g(TypedValues.Custom.S_COLOR, 5).m15460d(3, 8576374943297591956L).m15459c(4);
        aVarM15443c.m15453g("spacing", 7).m15460d(4, 3208489922790624359L).m15459c(4);
        aVarM15443c.m15453g("itemLength", 7).m15460d(5, 3713427572138150910L).m15459c(4);
        aVarM15443c.m15453g("style", 5).m15460d(6, 4579135818203399571L).m15459c(4);
        aVarM15443c.m15453g("textSize", 7).m15460d(7, 5903315449039480136L).m15459c(4);
        aVarM15443c.m15455i("recordId", "TouchRecordEntity", "record", 11).m15460d(8, 4506550704609864717L).m15459c(1548).m15461e(4, 5151929149198969604L);
        aVarM15443c.m15456j("touchInfoList", 7, 4614426128572273347L, 13, 7818987629185229539L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityTouchInfoEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("TouchInfoEntity");
        aVarM15443c.m15451e(13, 7818987629185229539L).m15452f(6, 5268719310319346431L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 2195736893270403606L).m15459c(1);
        aVarM15443c.m15453g("eventTime", 6).m15460d(2, 1481413978119928767L).m15459c(4);
        aVarM15443c.m15453g("x", 7).m15460d(3, 3669544801400159911L).m15459c(4);
        aVarM15443c.m15453g("y", 7).m15460d(4, 2661984942507669471L).m15459c(4);
        aVarM15443c.m15455i("recordId", "TouchEventEntity", "record", 11).m15460d(6, 5268719310319346431L).m15459c(1548).m15461e(30, 319292857095377749L);
        aVarM15443c.m15449c();
    }

    private static void buildEntityTouchRecordEntity(C8962e c8962e) {
        C8962e.a aVarM15443c = c8962e.m15443c("TouchRecordEntity");
        aVarM15443c.m15451e(10, 5662561349855543958L).m15452f(4, 3403049600307654934L);
        aVarM15443c.m15450d(1);
        aVarM15443c.m15453g("id", 6).m15460d(1, 2213635794541564884L).m15459c(1);
        aVarM15443c.m15453g("fileName", 9).m15460d(2, 2352706818980905508L).m15459c(2080).m15461e(24, 748108574309902074L);
        aVarM15443c.m15453g("validate", 9).m15460d(3, 1147768610097659098L);
        aVarM15443c.m15455i("recordId", "RecordEntity", "record", 11).m15460d(4, 3403049600307654934L).m15459c(1548).m15461e(10, 7088145065763104873L);
        aVarM15443c.m15456j("touchEventList", 4, 6506424544508794050L, 4, 2827749220184605293L);
        aVarM15443c.m15449c();
    }

    public static C8960c builder() {
        C8960c c8960c = new C8960c(getModel());
        c8960c.m15436h(FileRecordEntity_.__INSTANCE);
        c8960c.m15436h(GeometryInfoEntity_.__INSTANCE);
        c8960c.m15436h(TextRecordEntity_.__INSTANCE);
        c8960c.m15436h(AudioRecordEntity_.__INSTANCE);
        c8960c.m15436h(TouchEventEntity_.__INSTANCE);
        c8960c.m15436h(MoveConfigEntity_.__INSTANCE);
        c8960c.m15436h(GeometryRecordEntity_.__INSTANCE);
        c8960c.m15436h(CommandInfoEntity_.__INSTANCE);
        c8960c.m15436h(HeaderEntity_.__INSTANCE);
        c8960c.m15436h(FileInfoEntity_.__INSTANCE);
        c8960c.m15436h(RecordEntity_.__INSTANCE);
        c8960c.m15436h(BackgroundLineConfigEntity_.__INSTANCE);
        c8960c.m15436h(MatrixInfoEntity_.__INSTANCE);
        c8960c.m15436h(TouchRecordEntity_.__INSTANCE);
        c8960c.m15436h(TextInfoEntity_.__INSTANCE);
        c8960c.m15436h(BlackBoardEntity_.__INSTANCE);
        c8960c.m15436h(TouchInfoEntity_.__INSTANCE);
        c8960c.m15436h(PageEntity_.__INSTANCE);
        c8960c.m15436h(MatrixEventEntity_.__INSTANCE);
        c8960c.m15436h(AuthorEntity_.__INSTANCE);
        c8960c.m15436h(GeometryPointFEntity_.__INSTANCE);
        c8960c.m15436h(AudioInfoEntity_.__INSTANCE);
        c8960c.m15436h(CommandRecordEntity_.__INSTANCE);
        c8960c.m15436h(MatrixRecordEntity_.__INSTANCE);
        return c8960c;
    }

    private static byte[] getModel() {
        C8962e c8962e = new C8962e();
        c8962e.m15444d(24, 6354252071401414514L);
        c8962e.m15445e(37, 8980471141152925617L);
        c8962e.m15446f(11, 5953019203812425150L);
        buildEntityFileRecordEntity(c8962e);
        buildEntityGeometryInfoEntity(c8962e);
        buildEntityTextRecordEntity(c8962e);
        buildEntityAudioRecordEntity(c8962e);
        buildEntityTouchEventEntity(c8962e);
        buildEntityMoveConfigEntity(c8962e);
        buildEntityGeometryRecordEntity(c8962e);
        buildEntityCommandInfoEntity(c8962e);
        buildEntityHeaderEntity(c8962e);
        buildEntityFileInfoEntity(c8962e);
        buildEntityRecordEntity(c8962e);
        buildEntityBackgroundLineConfigEntity(c8962e);
        buildEntityMatrixInfoEntity(c8962e);
        buildEntityTouchRecordEntity(c8962e);
        buildEntityTextInfoEntity(c8962e);
        buildEntityBlackBoardEntity(c8962e);
        buildEntityTouchInfoEntity(c8962e);
        buildEntityPageEntity(c8962e);
        buildEntityMatrixEventEntity(c8962e);
        buildEntityAuthorEntity(c8962e);
        buildEntityGeometryPointFEntity(c8962e);
        buildEntityAudioInfoEntity(c8962e);
        buildEntityCommandRecordEntity(c8962e);
        buildEntityMatrixRecordEntity(c8962e);
        return c8962e.m15441a();
    }
}
