package com.zykj.blackboard.core.data.dao;

import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.flatbuffers.C3821a;
import io.objectbox.C5698b;
import io.objectbox.C5699c;
import io.objectbox.C5700d;
import io.objectbox.C5701e;
import java.nio.ByteBuffer;
import p204y1.AbstractC6768a;

/* loaded from: classes3.dex */
public class MyObjectBox {
    private static void buildEntityAudioInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "AudioInfoEntity");
        c5699cM1044h.m5051e(16, 1738897579709439220L);
        c5699cM1044h.m5052f(7, 3593987871946665066L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 4464665664412631503L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(6, "delayTime", null, null);
        c5700dM5053g2.m5057c(2, 8231899869464597710L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(6, TypedValues.TransitionType.S_DURATION, null, null);
        c5700dM5053g3.m5057c(3, 6113963074376351913L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(1, "isPlay", null, null);
        c5700dM5053g4.m5057c(4, 788937259794251244L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(5, "commandEnum", null, null);
        c5700dM5053g5.m5057c(5, 4388561302133619468L);
        c5700dM5053g5.m5056b(2);
        c5699cM1044h.m5053g(23, "data", null, null).m5057c(6, 6365167194610598110L);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(11, "recordId", "AudioRecordEntity", "record");
        c5700dM5053g6.m5057c(7, 3593987871946665066L);
        c5700dM5053g6.m5055a();
        c5700dM5053g6.f8952f = 1548;
        c5700dM5053g6.m5058d(19, 4299508817415618274L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityAudioRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "AudioRecordEntity");
        c5699cM1044h.m5051e(3, 1457477822342009278L);
        c5699cM1044h.m5052f(4, 1106508257692437091L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 2649292414664316102L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 4207956140881163343L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(27, 6663778756731582839L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 1042370756165343078L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 1106508257692437091L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(3, 6516862116297086719L);
        c5699cM1044h.m5054h("audioInfoEntity", 3, 3006960921839278746L, 16, 1738897579709439220L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityAuthorEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "AuthorEntity");
        c5699cM1044h.m5051e(19, 4491029893095874048L);
        c5699cM1044h.m5052f(8, 8744813166089570678L);
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 7180003569711224053L);
        c5700dM5053g.m5056b(1);
        c5699cM1044h.m5053g(9, "authorName", null, null).m5057c(2, 7374957285231348279L);
        c5699cM1044h.m5053g(9, "authorId", null, null).m5057c(3, 5194475084078832533L);
        c5699cM1044h.m5053g(9, "schoolId", null, null).m5057c(4, 1596297837259916058L);
        c5699cM1044h.m5053g(9, "url", null, null).m5057c(5, 5288213926049203801L);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(6, "startTime", null, null);
        c5700dM5053g2.m5057c(6, 8884290112765498271L);
        c5700dM5053g2.m5056b(2);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(6, TypedValues.TransitionType.S_DURATION, null, null);
        c5700dM5053g3.m5057c(8, 8744813166089570678L);
        c5700dM5053g3.m5056b(2);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityBackgroundLineConfigEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "BackgroundLineConfigEntity");
        c5699cM1044h.m5051e(24, 6354252071401414514L);
        c5699cM1044h.m5052f(5, 4659655107554112597L);
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 3035121938545489039L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(5, "lineColor", null, null);
        c5700dM5053g2.m5057c(2, 6761466792425544627L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(7, "lineSpace", null, null);
        c5700dM5053g3.m5057c(3, 4039798210327797775L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(5, "lineType", null, null);
        c5700dM5053g4.m5057c(4, 980589341662717929L);
        c5700dM5053g4.m5056b(2);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(7, "lineWidth", null, null);
        c5700dM5053g5.m5057c(5, 4659655107554112597L);
        c5700dM5053g5.m5056b(4);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityBlackBoardEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "BlackBoardEntity");
        c5699cM1044h.m5051e(12, 7195762691495625457L);
        c5699cM1044h.m5052f(2, 186877666806702259L);
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 2829339404269053744L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "dir", null, null);
        c5700dM5053g2.m5057c(2, 186877666806702259L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(12, 6978303640021140890L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityCommandInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "CommandInfoEntity");
        c5699cM1044h.m5051e(5, 7743195144794219448L);
        c5699cM1044h.m5052f(7, 1129747418098677705L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 6108579328042481490L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(6, "delayTime", null, null);
        c5700dM5053g2.m5057c(2, 7495600893346042381L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(6, TypedValues.TransitionType.S_DURATION, null, null);
        c5700dM5053g3.m5057c(3, 2920998592584590400L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(1, "isPlay", null, null);
        c5700dM5053g4.m5057c(4, 5866029188196944840L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(5, "commandEnum", null, null);
        c5700dM5053g5.m5057c(5, 2864037025762273844L);
        c5700dM5053g5.m5056b(2);
        c5699cM1044h.m5053g(23, "data", null, null).m5057c(6, 7102134513203239881L);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(11, "recordId", "CommandRecordEntity", "record");
        c5700dM5053g6.m5057c(7, 1129747418098677705L);
        c5700dM5053g6.m5055a();
        c5700dM5053g6.f8952f = 1548;
        c5700dM5053g6.m5058d(5, 6471342414470418154L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityCommandRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "CommandRecordEntity");
        c5699cM1044h.m5051e(17, 1533675624321273659L);
        c5699cM1044h.m5052f(4, 1466976068188736837L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 1272142568700193409L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 7756355126835864518L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(28, 3242269590877547980L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 2415335769260754690L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 1466976068188736837L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(21, 8882662362608194884L);
        c5699cM1044h.m5054h("commandInfoEntity", 8, 5120029386737400181L, 5, 7743195144794219448L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityFileInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "FileInfoEntity");
        c5699cM1044h.m5051e(7, 7195933198745853214L);
        c5699cM1044h.m5052f(6, 1726522676427700178L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 1594301834817904798L);
        c5700dM5053g.m5056b(1);
        c5699cM1044h.m5053g(9, "fileName", null, null).m5057c(2, 2076957862605615295L);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(5, "width", null, null);
        c5700dM5053g2.m5057c(3, 4333266520315125758L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(5, "height", null, null);
        c5700dM5053g3.m5057c(4, 1087837405856477495L);
        c5700dM5053g3.m5056b(4);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(5, 2682325834017592360L);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(11, "recordId", "FileRecordEntity", "record");
        c5700dM5053g4.m5057c(6, 1726522676427700178L);
        c5700dM5053g4.m5055a();
        c5700dM5053g4.f8952f = 1548;
        c5700dM5053g4.m5058d(7, 8975889253592560872L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityFileRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "FileRecordEntity");
        c5699cM1044h.m5051e(1, 8807702116810287113L);
        c5699cM1044h.m5052f(4, 581255084365138855L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 2860392549289493867L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 4135892801542342702L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(25, 7101345596046178982L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 1211937380881226049L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 581255084365138855L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(1, 4664252886558210776L);
        c5699cM1044h.m5054h("fileInfoEntity", 1, 5610121978791820784L, 7, 7195933198745853214L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityGeometryInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "GeometryInfoEntity");
        c5699cM1044h.m5051e(21, 4283823219291471141L);
        c5699cM1044h.m5052f(7, 9052518300307403450L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 758369890359825821L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(7, "width", null, null);
        c5700dM5053g2.m5057c(2, 6960047647875413528L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(5, TypedValues.Custom.S_COLOR, null, null);
        c5700dM5053g3.m5057c(3, 7600926013197305234L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(7, "textSize", null, null);
        c5700dM5053g4.m5057c(4, 4261713491849246304L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(5, "style", null, null);
        c5700dM5053g5.m5057c(5, 7680322400492902307L);
        c5700dM5053g5.m5056b(4);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(5, "geometryType", null, null);
        c5700dM5053g6.m5057c(6, 3821197663929267481L);
        c5700dM5053g6.m5056b(4);
        C5700d c5700dM5053g7 = c5699cM1044h.m5053g(11, "recordId", "GeometryRecordEntity", "record");
        c5700dM5053g7.m5057c(7, 9052518300307403450L);
        c5700dM5053g7.m5055a();
        c5700dM5053g7.f8952f = 1548;
        c5700dM5053g7.m5058d(32, 4851417164413620379L);
        c5699cM1044h.m5054h("pointList", 10, 2467931522611419646L, 23, 253983218610838927L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityGeometryPointFEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "GeometryPointFEntity");
        c5699cM1044h.m5051e(23, 253983218610838927L);
        c5699cM1044h.m5052f(4, 2993647435457907111L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 2460418406859650403L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(7, "x", null, null);
        c5700dM5053g2.m5057c(2, 6341504903440599321L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(7, "y", null, null);
        c5700dM5053g3.m5057c(3, 2119941464416690896L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(11, "recordId", "GeometryInfoEntity", "record");
        c5700dM5053g4.m5057c(4, 2993647435457907111L);
        c5700dM5053g4.m5055a();
        c5700dM5053g4.f8952f = 1548;
        c5700dM5053g4.m5058d(35, 2983199780290730863L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityGeometryRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "GeometryRecordEntity");
        c5699cM1044h.m5051e(22, 6578349910275058692L);
        c5699cM1044h.m5052f(4, 6414865175094240391L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 6975215749131372137L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 8731590737446971660L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(33, 6460443964786600L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 222015663972846583L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 6414865175094240391L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(34, 8208977622133384242L);
        c5699cM1044h.m5054h("geometryInfoEntityList", 11, 5953019203812425150L, 21, 4283823219291471141L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityHeaderEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "HeaderEntity");
        c5699cM1044h.m5051e(6, 8452738864375470324L);
        c5699cM1044h.m5052f(16, 942905870368347727L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 271083587316187516L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(5, "version", null, null);
        c5700dM5053g2.m5057c(2, 2896554452934883007L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(5, "width", null, null);
        c5700dM5053g3.m5057c(3, 2306043389845325438L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(5, "height", null, null);
        c5700dM5053g4.m5057c(4, 91702869420279569L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(6, "createDate", null, null);
        c5700dM5053g5.m5057c(5, 1599255963751619189L);
        c5700dM5053g5.m5056b(4);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(6, "updateDate", null, null);
        c5700dM5053g6.m5057c(6, 3987983768584614497L);
        c5700dM5053g6.m5056b(4);
        C5700d c5700dM5053g7 = c5699cM1044h.m5053g(6, TypedValues.TransitionType.S_DURATION, null, null);
        c5700dM5053g7.m5057c(7, 6756707614908736118L);
        c5700dM5053g7.m5056b(4);
        c5699cM1044h.m5053g(9, "convertUrl", null, null).m5057c(11, 6421407192872309397L);
        C5700d c5700dM5053g8 = c5699cM1044h.m5053g(5, "defaultBackgroundColor", null, null);
        c5700dM5053g8.m5057c(12, 236332159395675736L);
        c5700dM5053g8.m5056b(4);
        C5700d c5700dM5053g9 = c5699cM1044h.m5053g(5, "lastBackgroundColor", null, null);
        c5700dM5053g9.m5057c(13, 6841752251661063892L);
        c5700dM5053g9.m5056b(4);
        C5700d c5700dM5053g10 = c5699cM1044h.m5053g(11, "pageId", "PageEntity", "page");
        c5700dM5053g10.m5057c(9, 5797256570918588576L);
        c5700dM5053g10.m5055a();
        c5700dM5053g10.f8952f = 1548;
        c5700dM5053g10.m5058d(6, 7029446957088249008L);
        C5700d c5700dM5053g11 = c5699cM1044h.m5053g(11, "defaultBackgroundLineConfigId", "BackgroundLineConfigEntity", "defaultBackgroundLineConfig");
        c5700dM5053g11.m5057c(15, 396819869407887376L);
        c5700dM5053g11.m5055a();
        c5700dM5053g11.f8952f = 1548;
        c5700dM5053g11.m5058d(36, 683525170848437566L);
        C5700d c5700dM5053g12 = c5699cM1044h.m5053g(11, "lastBackgroundLineConfigId", "BackgroundLineConfigEntity", "lastBackgroundLineConfig");
        c5700dM5053g12.m5057c(16, 942905870368347727L);
        c5700dM5053g12.m5055a();
        c5700dM5053g12.f8952f = 1548;
        c5700dM5053g12.m5058d(37, 8980471141152925617L);
        C5700d c5700dM5053g13 = c5699cM1044h.m5053g(11, "authorId", "AuthorEntity", "author");
        c5700dM5053g13.m5057c(10, 6953139294800756044L);
        c5700dM5053g13.m5055a();
        c5700dM5053g13.f8952f = 1548;
        c5700dM5053g13.m5058d(23, 395137366286267102L);
        C5700d c5700dM5053g14 = c5699cM1044h.m5053g(11, "moveConfigId", "MoveConfigEntity", "moveConfig");
        c5700dM5053g14.m5057c(14, 7656223054002431488L);
        c5700dM5053g14.m5055a();
        c5700dM5053g14.f8952f = 1548;
        c5700dM5053g14.m5058d(31, 1717867400835038482L);
        c5699cM1044h.m5054h("provider", 9, 6672723083024400856L, 19, 4491029893095874048L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityMatrixEventEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "MatrixEventEntity");
        c5699cM1044h.m5051e(15, 48825879652876793L);
        c5699cM1044h.m5052f(2, 2703943048309286272L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 1294314152973867822L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(11, "recordId", "MatrixRecordEntity", "record");
        c5700dM5053g2.m5057c(2, 2703943048309286272L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 1548;
        c5700dM5053g2.m5058d(18, 9095157777139256777L);
        c5699cM1044h.m5054h("matrixInfo", 5, 212650025651297158L, 9, 7339194381174988674L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityMatrixInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "MatrixInfoEntity");
        c5699cM1044h.m5051e(9, 7339194381174988674L);
        c5699cM1044h.m5052f(12, 2413030854442085848L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 8157824128287595L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(6, "eventTime", null, null);
        c5700dM5053g2.m5057c(2, 7007943029564757631L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(7, "scaleX", null, null);
        c5700dM5053g3.m5057c(3, 2687769118052329326L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(7, "skewX", null, null);
        c5700dM5053g4.m5057c(4, 6762616002731522458L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(7, "transX", null, null);
        c5700dM5053g5.m5057c(5, 6964916551845516534L);
        c5700dM5053g5.m5056b(4);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(7, "skewY", null, null);
        c5700dM5053g6.m5057c(6, 3311941188489375960L);
        c5700dM5053g6.m5056b(4);
        C5700d c5700dM5053g7 = c5699cM1044h.m5053g(7, "scaleY", null, null);
        c5700dM5053g7.m5057c(7, 7877646726736821918L);
        c5700dM5053g7.m5056b(4);
        C5700d c5700dM5053g8 = c5699cM1044h.m5053g(7, "transY", null, null);
        c5700dM5053g8.m5057c(8, 1872363001763917480L);
        c5700dM5053g8.m5056b(4);
        C5700d c5700dM5053g9 = c5699cM1044h.m5053g(7, "perSp0", null, null);
        c5700dM5053g9.m5057c(9, 72471971767457762L);
        c5700dM5053g9.m5056b(4);
        C5700d c5700dM5053g10 = c5699cM1044h.m5053g(7, "perSp1", null, null);
        c5700dM5053g10.m5057c(10, 7024503675101809910L);
        c5700dM5053g10.m5056b(4);
        C5700d c5700dM5053g11 = c5699cM1044h.m5053g(7, "perSp2", null, null);
        c5700dM5053g11.m5057c(11, 2583504155705184995L);
        c5700dM5053g11.m5056b(4);
        C5700d c5700dM5053g12 = c5699cM1044h.m5053g(11, "recordId", "MatrixEventEntity", "record");
        c5700dM5053g12.m5057c(12, 2413030854442085848L);
        c5700dM5053g12.m5055a();
        c5700dM5053g12.f8952f = 1548;
        c5700dM5053g12.m5058d(9, 4985497566298461031L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityMatrixRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "MatrixRecordEntity");
        c5699cM1044h.m5051e(18, 7216434272107827427L);
        c5699cM1044h.m5052f(4, 4717262115324513656L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 3332239218713743535L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 3923730455450647348L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(29, 2913780019033877908L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 2579243705245830986L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 4717262115324513656L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(22, 5374541823673306691L);
        c5699cM1044h.m5054h("matrixEventEntity", 6, 7483456025692942476L, 15, 48825879652876793L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityMoveConfigEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "MoveConfigEntity");
        c5699cM1044h.m5051e(20, 2661032766343741927L);
        c5699cM1044h.m5052f(9, 1162392463661187332L);
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 8297618772721499694L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(1, "isEnable", null, null);
        c5700dM5053g2.m5057c(2, 4386292675948115713L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(1, "verticalTranslate", null, null);
        c5700dM5053g3.m5057c(3, 6819516440817401546L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(1, "horizontalTranslate", null, null);
        c5700dM5053g4.m5057c(4, 6989581654964039122L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(1, "scale", null, null);
        c5700dM5053g5.m5057c(5, 2559327698020118256L);
        c5700dM5053g5.m5056b(4);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(1, "rotate", null, null);
        c5700dM5053g6.m5057c(6, 3163637491624971432L);
        c5700dM5053g6.m5056b(4);
        C5700d c5700dM5053g7 = c5699cM1044h.m5053g(5, "maxHeightTimes", null, null);
        c5700dM5053g7.m5057c(7, 6285416184997064814L);
        c5700dM5053g7.m5056b(4);
        C5700d c5700dM5053g8 = c5699cM1044h.m5053g(5, "maxWidthTimes", null, null);
        c5700dM5053g8.m5057c(8, 6140357146400751997L);
        c5700dM5053g8.m5056b(4);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityPageEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "PageEntity");
        c5699cM1044h.m5051e(14, 3184073876524851644L);
        c5699cM1044h.m5052f(8, 7278221643870379970L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 4158900098315997984L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "dirName", null, null);
        c5700dM5053g2.m5057c(2, 8144911141438072323L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(14, 1104334313543109363L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(1, "isChange", null, null);
        c5700dM5053g3.m5057c(3, 8953445388604105523L);
        c5700dM5053g3.m5056b(4);
        c5699cM1044h.m5053g(9, "commandFileName", null, null).m5057c(4, 5799487931391644931L);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(5, "commandIndex", null, null);
        c5700dM5053g4.m5057c(5, 3846866282671597737L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(11, "blackBoardEntityId", "BlackBoardEntity", "blackBoardEntity");
        c5700dM5053g5.m5057c(6, 6370233532038825797L);
        c5700dM5053g5.m5055a();
        c5700dM5053g5.f8952f = 1548;
        c5700dM5053g5.m5058d(15, 2192016506092991606L);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(11, "recordEntityId", "RecordEntity", "recordEntity");
        c5700dM5053g6.m5057c(7, 6561183928856383072L);
        c5700dM5053g6.m5055a();
        c5700dM5053g6.f8952f = 1548;
        c5700dM5053g6.m5058d(16, 5117758800188434743L);
        C5700d c5700dM5053g7 = c5699cM1044h.m5053g(11, "headerEntityId", "HeaderEntity", "headerEntity");
        c5700dM5053g7.m5057c(8, 7278221643870379970L);
        c5700dM5053g7.m5055a();
        c5700dM5053g7.f8952f = 1548;
        c5700dM5053g7.m5058d(17, 5180167903368983391L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "RecordEntity");
        c5699cM1044h.m5051e(8, 891357147187211080L);
        c5699cM1044h.m5052f(2, 2886945382326041233L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 9046634465887903763L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(11, "pageId", "PageEntity", "page");
        c5700dM5053g2.m5057c(2, 2886945382326041233L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 1548;
        c5700dM5053g2.m5058d(8, 8846653951850004940L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityTextInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "TextInfoEntity");
        c5699cM1044h.m5051e(11, 3085609912032192157L);
        c5699cM1044h.m5052f(7, 5422326425890266339L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 7568483579341312750L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(7, "width", null, null);
        c5700dM5053g2.m5057c(2, 384227753751344089L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(5, TypedValues.Custom.S_COLOR, null, null);
        c5700dM5053g3.m5057c(3, 5193906340737883215L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(7, "textSize", null, null);
        c5700dM5053g4.m5057c(4, 2430925709763338506L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(5, "style", null, null);
        c5700dM5053g5.m5057c(5, 5285358854095939391L);
        c5700dM5053g5.m5056b(4);
        c5699cM1044h.m5053g(9, "content", null, null).m5057c(6, 5784995765710474993L);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(11, "recordId", "TextRecordEntity", "record");
        c5700dM5053g6.m5057c(7, 5422326425890266339L);
        c5700dM5053g6.m5055a();
        c5700dM5053g6.f8952f = 1548;
        c5700dM5053g6.m5058d(11, 3424803898414461454L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityTextRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "TextRecordEntity");
        c5699cM1044h.m5051e(2, 1953065482304442309L);
        c5699cM1044h.m5052f(4, 916312698009440053L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 426926565622954679L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 4748695942157109661L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(26, 9054486719078532020L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 7311582035276321573L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 916312698009440053L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(2, 8421376056513633487L);
        c5699cM1044h.m5054h("textInfoEntityList", 2, 7413064398986488623L, 11, 3085609912032192157L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityTouchEventEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "TouchEventEntity");
        c5699cM1044h.m5051e(4, 2827749220184605293L);
        c5699cM1044h.m5052f(8, 4506550704609864717L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 1093335407985999731L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(7, "width", null, null);
        c5700dM5053g2.m5057c(2, 3683603152498651467L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(5, TypedValues.Custom.S_COLOR, null, null);
        c5700dM5053g3.m5057c(3, 8576374943297591956L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(7, "spacing", null, null);
        c5700dM5053g4.m5057c(4, 3208489922790624359L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(7, "itemLength", null, null);
        c5700dM5053g5.m5057c(5, 3713427572138150910L);
        c5700dM5053g5.m5056b(4);
        C5700d c5700dM5053g6 = c5699cM1044h.m5053g(5, "style", null, null);
        c5700dM5053g6.m5057c(6, 4579135818203399571L);
        c5700dM5053g6.m5056b(4);
        C5700d c5700dM5053g7 = c5699cM1044h.m5053g(7, "textSize", null, null);
        c5700dM5053g7.m5057c(7, 5903315449039480136L);
        c5700dM5053g7.m5056b(4);
        C5700d c5700dM5053g8 = c5699cM1044h.m5053g(11, "recordId", "TouchRecordEntity", "record");
        c5700dM5053g8.m5057c(8, 4506550704609864717L);
        c5700dM5053g8.m5055a();
        c5700dM5053g8.f8952f = 1548;
        c5700dM5053g8.m5058d(4, 5151929149198969604L);
        c5699cM1044h.m5054h("touchInfoList", 7, 4614426128572273347L, 13, 7818987629185229539L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityTouchInfoEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "TouchInfoEntity");
        c5699cM1044h.m5051e(13, 7818987629185229539L);
        c5699cM1044h.m5052f(6, 5268719310319346431L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 2195736893270403606L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(6, "eventTime", null, null);
        c5700dM5053g2.m5057c(2, 1481413978119928767L);
        c5700dM5053g2.m5056b(4);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(7, "x", null, null);
        c5700dM5053g3.m5057c(3, 3669544801400159911L);
        c5700dM5053g3.m5056b(4);
        C5700d c5700dM5053g4 = c5699cM1044h.m5053g(7, "y", null, null);
        c5700dM5053g4.m5057c(4, 2661984942507669471L);
        c5700dM5053g4.m5056b(4);
        C5700d c5700dM5053g5 = c5699cM1044h.m5053g(11, "recordId", "TouchEventEntity", "record");
        c5700dM5053g5.m5057c(6, 5268719310319346431L);
        c5700dM5053g5.m5055a();
        c5700dM5053g5.f8952f = 1548;
        c5700dM5053g5.m5058d(30, 319292857095377749L);
        c5699cM1044h.m5049c();
    }

    private static void buildEntityTouchRecordEntity(C5701e c5701e) {
        C5699c c5699cM1044h = AbstractC1923c.m1044h(c5701e, c5701e, "TouchRecordEntity");
        c5699cM1044h.m5051e(10, 5662561349855543958L);
        c5699cM1044h.m5052f(4, 3403049600307654934L);
        c5699cM1044h.m5050d();
        C5700d c5700dM5053g = c5699cM1044h.m5053g(6, "id", null, null);
        c5700dM5053g.m5057c(1, 2213635794541564884L);
        c5700dM5053g.m5056b(1);
        C5700d c5700dM5053g2 = c5699cM1044h.m5053g(9, "fileName", null, null);
        c5700dM5053g2.m5057c(2, 2352706818980905508L);
        c5700dM5053g2.m5055a();
        c5700dM5053g2.f8952f = 2080;
        c5700dM5053g2.m5058d(24, 748108574309902074L);
        c5699cM1044h.m5053g(9, "validate", null, null).m5057c(3, 1147768610097659098L);
        C5700d c5700dM5053g3 = c5699cM1044h.m5053g(11, "recordId", "RecordEntity", "record");
        c5700dM5053g3.m5057c(4, 3403049600307654934L);
        c5700dM5053g3.m5055a();
        c5700dM5053g3.f8952f = 1548;
        c5700dM5053g3.m5058d(10, 7088145065763104873L);
        c5699cM1044h.m5054h("touchEventList", 4, 6506424544508794050L, 4, 2827749220184605293L);
        c5699cM1044h.m5049c();
    }

    public static C5698b builder() {
        C5698b c5698b = new C5698b(getModel());
        c5698b.m5046d(FileInfoEntity_.__INSTANCE);
        c5698b.m5046d(TextInfoEntity_.__INSTANCE);
        c5698b.m5046d(PageEntity_.__INSTANCE);
        c5698b.m5046d(FileRecordEntity_.__INSTANCE);
        c5698b.m5046d(TouchInfoEntity_.__INSTANCE);
        c5698b.m5046d(AudioRecordEntity_.__INSTANCE);
        c5698b.m5046d(BackgroundLineConfigEntity_.__INSTANCE);
        c5698b.m5046d(CommandInfoEntity_.__INSTANCE);
        c5698b.m5046d(MatrixEventEntity_.__INSTANCE);
        c5698b.m5046d(AudioInfoEntity_.__INSTANCE);
        c5698b.m5046d(MoveConfigEntity_.__INSTANCE);
        c5698b.m5046d(TouchEventEntity_.__INSTANCE);
        c5698b.m5046d(CommandRecordEntity_.__INSTANCE);
        c5698b.m5046d(GeometryPointFEntity_.__INSTANCE);
        c5698b.m5046d(MatrixInfoEntity_.__INSTANCE);
        c5698b.m5046d(RecordEntity_.__INSTANCE);
        c5698b.m5046d(TextRecordEntity_.__INSTANCE);
        c5698b.m5046d(BlackBoardEntity_.__INSTANCE);
        c5698b.m5046d(MatrixRecordEntity_.__INSTANCE);
        c5698b.m5046d(TouchRecordEntity_.__INSTANCE);
        c5698b.m5046d(AuthorEntity_.__INSTANCE);
        c5698b.m5046d(GeometryInfoEntity_.__INSTANCE);
        c5698b.m5046d(GeometryRecordEntity_.__INSTANCE);
        c5698b.m5046d(HeaderEntity_.__INSTANCE);
        return c5698b;
    }

    private static byte[] getModel() {
        C5701e c5701e = new C5701e();
        c5701e.f8960c = 24;
        c5701e.f8961d = 6354252071401414514L;
        c5701e.f8962e = 37;
        c5701e.f8963f = 8980471141152925617L;
        c5701e.f8964g = 11;
        c5701e.f8965h = 5953019203812425150L;
        buildEntityFileInfoEntity(c5701e);
        buildEntityTextInfoEntity(c5701e);
        buildEntityPageEntity(c5701e);
        buildEntityFileRecordEntity(c5701e);
        buildEntityTouchInfoEntity(c5701e);
        buildEntityAudioRecordEntity(c5701e);
        buildEntityBackgroundLineConfigEntity(c5701e);
        buildEntityCommandInfoEntity(c5701e);
        buildEntityMatrixEventEntity(c5701e);
        buildEntityAudioInfoEntity(c5701e);
        buildEntityMoveConfigEntity(c5701e);
        buildEntityTouchEventEntity(c5701e);
        buildEntityCommandRecordEntity(c5701e);
        buildEntityGeometryPointFEntity(c5701e);
        buildEntityMatrixInfoEntity(c5701e);
        buildEntityRecordEntity(c5701e);
        buildEntityTextRecordEntity(c5701e);
        buildEntityBlackBoardEntity(c5701e);
        buildEntityMatrixRecordEntity(c5701e);
        buildEntityTouchRecordEntity(c5701e);
        buildEntityAuthorEntity(c5701e);
        buildEntityGeometryInfoEntity(c5701e);
        buildEntityGeometryRecordEntity(c5701e);
        buildEntityHeaderEntity(c5701e);
        C3821a c3821a = c5701e.f8958a;
        int iM2770e = c3821a.m2770e("default");
        int iM5059a = c5701e.m5059a(c5701e.f8959b);
        c3821a.m2777l(9);
        c3821a.m2767b(1, iM2770e);
        c3821a.m2766a(0, (int) 2);
        boolean z8 = c3821a.f2965l;
        c3821a.m2773h(8, 0);
        ByteBuffer byteBuffer = c3821a.f2954a;
        int i = c3821a.f2955b - 8;
        c3821a.f2955b = i;
        byteBuffer.putLong(i, 1L);
        c3821a.m2776k(2);
        c3821a.m2767b(3, iM5059a);
        if (c5701e.f8960c != null) {
            c3821a.m2769d(4, AbstractC6768a.m6444i(c3821a, r1.intValue(), c5701e.f8961d.longValue()));
        }
        if (c5701e.f8962e != null) {
            c3821a.m2769d(5, AbstractC6768a.m6444i(c3821a, r1.intValue(), c5701e.f8963f.longValue()));
        }
        if (c5701e.f8964g != null) {
            c3821a.m2769d(7, AbstractC6768a.m6444i(c3821a, r1.intValue(), c5701e.f8965h.longValue()));
        }
        int iM2771f = c3821a.m2771f();
        c3821a.m2773h(c3821a.f2956c, 4);
        c3821a.m2773h(4, 0);
        c3821a.m2774i((c3821a.m2772g() - iM2771f) + 4);
        c3821a.f2954a.position(c3821a.f2955b);
        c3821a.f2960g = true;
        return c3821a.m2775j();
    }
}
