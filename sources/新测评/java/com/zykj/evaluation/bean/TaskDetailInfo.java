package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b(\u0010)J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00100J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003J\t\u0010W\u001a\u00020\u0014HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fHÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0014HÆ\u0003J\t\u0010[\u001a\u00020\u0014HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000fHÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000fHÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000fHÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000fHÆ\u0003J\t\u0010c\u001a\u00020\u0014HÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u000fHÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010JJ\u000b\u0010f\u001a\u0004\u0018\u00010\rHÆ\u0003JØ\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f2\b\b\u0002\u0010#\u001a\u00020\u00142\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u00142\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0005HÖ\u0001J\t\u0010l\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0011\u0010\u0018\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bB\u00109R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bC\u00109R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010-R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0011\u0010#\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000f¢\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0013\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bL\u00107¨\u0006m"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskDetailInfo;", "", "id", "", "itemType", "", "number", "originScore", "", "score", "totalAnswerScore", "totalScore", "path", "", "answerList", "", "Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "qstAnswers", "Lcom/zykj/evaluation/bean/DetailGroupQstAnswer;", "answerWithQuestion", "", "qstFlows", "Lcom/zykj/evaluation/bean/DetailSubQuestion;", "qstFlowsCount", "askForHelp", "isInMistakeBook", "examDraft", "revisingDraft", "microClassToQuestionList", "Lcom/zykj/evaluation/bean/MicroClassInfo;", "microClassToStudentList", "revisingResult", "typicalErrorAnswers", "Lcom/zykj/evaluation/bean/TypicalAnswer;", "typicalRightAnswers", "revisingAnswerd", "lastRoundRevisingRecords", "Lcom/zykj/evaluation/bean/RevisingRecord;", "qstLastModifyTime", "stem", "<init>", "(JIILjava/lang/Double;DDDLjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/util/List;IZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()J", "getItemType", "()I", "getNumber", "getOriginScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScore", "()D", "getTotalAnswerScore", "getTotalScore", "getPath", "()Ljava/lang/String;", "getAnswerList", "()Ljava/util/List;", "getQstAnswers", "getAnswerWithQuestion", "()Z", "getQstFlows", "getQstFlowsCount", "getAskForHelp", "getExamDraft", "getRevisingDraft", "getMicroClassToQuestionList", "getMicroClassToStudentList", "getRevisingResult", "getTypicalErrorAnswers", "getTypicalRightAnswers", "getRevisingAnswerd", "getLastRoundRevisingRecords", "getQstLastModifyTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStem", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(JIILjava/lang/Double;DDDLjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/util/List;IZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/String;)Lcom/zykj/evaluation/bean/TaskDetailInfo;", "equals", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TaskDetailInfo {
    public static final int $stable = 8;
    private final List<DetailAnswerInfo> answerList;
    private final boolean answerWithQuestion;
    private final boolean askForHelp;
    private final String examDraft;
    private final long id;
    private final boolean isInMistakeBook;
    private final int itemType;
    private final List<RevisingRecord> lastRoundRevisingRecords;
    private final List<MicroClassInfo> microClassToQuestionList;
    private final List<MicroClassInfo> microClassToStudentList;
    private final int number;
    private final Double originScore;
    private final String path;
    private final List<DetailGroupQstAnswer> qstAnswers;
    private final List<DetailSubQuestion> qstFlows;
    private final int qstFlowsCount;
    private final Long qstLastModifyTime;
    private final boolean revisingAnswerd;
    private final String revisingDraft;
    private final int revisingResult;
    private final double score;
    private final String stem;
    private final double totalAnswerScore;
    private final double totalScore;
    private final List<TypicalAnswer> typicalErrorAnswers;
    private final List<TypicalAnswer> typicalRightAnswers;

    public TaskDetailInfo(long j10, int i10, int i11, Double d10, double d11, double d12, double d13, String str, List<DetailAnswerInfo> answerList, List<DetailGroupQstAnswer> list, boolean z9, List<DetailSubQuestion> qstFlows, int i12, boolean z10, boolean z11, String str2, String str3, List<MicroClassInfo> list2, List<MicroClassInfo> list3, int i13, List<TypicalAnswer> list4, List<TypicalAnswer> list5, boolean z12, List<RevisingRecord> lastRoundRevisingRecords, Long l10, String str4) {
        Intrinsics.checkNotNullParameter(answerList, "answerList");
        Intrinsics.checkNotNullParameter(qstFlows, "qstFlows");
        Intrinsics.checkNotNullParameter(lastRoundRevisingRecords, "lastRoundRevisingRecords");
        this.id = j10;
        this.itemType = i10;
        this.number = i11;
        this.originScore = d10;
        this.score = d11;
        this.totalAnswerScore = d12;
        this.totalScore = d13;
        this.path = str;
        this.answerList = answerList;
        this.qstAnswers = list;
        this.answerWithQuestion = z9;
        this.qstFlows = qstFlows;
        this.qstFlowsCount = i12;
        this.askForHelp = z10;
        this.isInMistakeBook = z11;
        this.examDraft = str2;
        this.revisingDraft = str3;
        this.microClassToQuestionList = list2;
        this.microClassToStudentList = list3;
        this.revisingResult = i13;
        this.typicalErrorAnswers = list4;
        this.typicalRightAnswers = list5;
        this.revisingAnswerd = z12;
        this.lastRoundRevisingRecords = lastRoundRevisingRecords;
        this.qstLastModifyTime = l10;
        this.stem = str4;
    }

    public static /* synthetic */ TaskDetailInfo copy$default(TaskDetailInfo taskDetailInfo, long j10, int i10, int i11, Double d10, double d11, double d12, double d13, String str, List list, List list2, boolean z9, List list3, int i12, boolean z10, boolean z11, String str2, String str3, List list4, List list5, int i13, List list6, List list7, boolean z12, List list8, Long l10, String str4, int i14, Object obj) {
        String str5;
        Long l11;
        long j11 = (i14 & 1) != 0 ? taskDetailInfo.id : j10;
        int i15 = (i14 & 2) != 0 ? taskDetailInfo.itemType : i10;
        int i16 = (i14 & 4) != 0 ? taskDetailInfo.number : i11;
        Double d14 = (i14 & 8) != 0 ? taskDetailInfo.originScore : d10;
        double d15 = (i14 & 16) != 0 ? taskDetailInfo.score : d11;
        double d16 = (i14 & 32) != 0 ? taskDetailInfo.totalAnswerScore : d12;
        double d17 = (i14 & 64) != 0 ? taskDetailInfo.totalScore : d13;
        String str6 = (i14 & 128) != 0 ? taskDetailInfo.path : str;
        List list9 = (i14 & 256) != 0 ? taskDetailInfo.answerList : list;
        List list10 = (i14 & 512) != 0 ? taskDetailInfo.qstAnswers : list2;
        long j12 = j11;
        boolean z13 = (i14 & 1024) != 0 ? taskDetailInfo.answerWithQuestion : z9;
        List list11 = (i14 & 2048) != 0 ? taskDetailInfo.qstFlows : list3;
        boolean z14 = z13;
        int i17 = (i14 & 4096) != 0 ? taskDetailInfo.qstFlowsCount : i12;
        boolean z15 = (i14 & 8192) != 0 ? taskDetailInfo.askForHelp : z10;
        boolean z16 = (i14 & 16384) != 0 ? taskDetailInfo.isInMistakeBook : z11;
        String str7 = (i14 & 32768) != 0 ? taskDetailInfo.examDraft : str2;
        String str8 = (i14 & 65536) != 0 ? taskDetailInfo.revisingDraft : str3;
        List list12 = (i14 & 131072) != 0 ? taskDetailInfo.microClassToQuestionList : list4;
        List list13 = (i14 & 262144) != 0 ? taskDetailInfo.microClassToStudentList : list5;
        int i18 = (i14 & 524288) != 0 ? taskDetailInfo.revisingResult : i13;
        List list14 = (i14 & 1048576) != 0 ? taskDetailInfo.typicalErrorAnswers : list6;
        List list15 = (i14 & 2097152) != 0 ? taskDetailInfo.typicalRightAnswers : list7;
        boolean z17 = (i14 & 4194304) != 0 ? taskDetailInfo.revisingAnswerd : z12;
        List list16 = (i14 & 8388608) != 0 ? taskDetailInfo.lastRoundRevisingRecords : list8;
        Long l12 = (i14 & 16777216) != 0 ? taskDetailInfo.qstLastModifyTime : l10;
        if ((i14 & 33554432) != 0) {
            l11 = l12;
            str5 = taskDetailInfo.stem;
        } else {
            str5 = str4;
            l11 = l12;
        }
        return taskDetailInfo.copy(j12, i15, i16, d14, d15, d16, d17, str6, list9, list10, z14, list11, i17, z15, z16, str7, str8, list12, list13, i18, list14, list15, z17, list16, l11, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<DetailGroupQstAnswer> component10() {
        return this.qstAnswers;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getAnswerWithQuestion() {
        return this.answerWithQuestion;
    }

    public final List<DetailSubQuestion> component12() {
        return this.qstFlows;
    }

    /* renamed from: component13, reason: from getter */
    public final int getQstFlowsCount() {
        return this.qstFlowsCount;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAskForHelp() {
        return this.askForHelp;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsInMistakeBook() {
        return this.isInMistakeBook;
    }

    /* renamed from: component16, reason: from getter */
    public final String getExamDraft() {
        return this.examDraft;
    }

    /* renamed from: component17, reason: from getter */
    public final String getRevisingDraft() {
        return this.revisingDraft;
    }

    public final List<MicroClassInfo> component18() {
        return this.microClassToQuestionList;
    }

    public final List<MicroClassInfo> component19() {
        return this.microClassToStudentList;
    }

    /* renamed from: component2, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* renamed from: component20, reason: from getter */
    public final int getRevisingResult() {
        return this.revisingResult;
    }

    public final List<TypicalAnswer> component21() {
        return this.typicalErrorAnswers;
    }

    public final List<TypicalAnswer> component22() {
        return this.typicalRightAnswers;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getRevisingAnswerd() {
        return this.revisingAnswerd;
    }

    public final List<RevisingRecord> component24() {
        return this.lastRoundRevisingRecords;
    }

    /* renamed from: component25, reason: from getter */
    public final Long getQstLastModifyTime() {
        return this.qstLastModifyTime;
    }

    /* renamed from: component26, reason: from getter */
    public final String getStem() {
        return this.stem;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getOriginScore() {
        return this.originScore;
    }

    /* renamed from: component5, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTotalAnswerScore() {
        return this.totalAnswerScore;
    }

    /* renamed from: component7, reason: from getter */
    public final double getTotalScore() {
        return this.totalScore;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final List<DetailAnswerInfo> component9() {
        return this.answerList;
    }

    public final TaskDetailInfo copy(long id, int itemType, int number, Double originScore, double score, double totalAnswerScore, double totalScore, String path, List<DetailAnswerInfo> answerList, List<DetailGroupQstAnswer> qstAnswers, boolean answerWithQuestion, List<DetailSubQuestion> qstFlows, int qstFlowsCount, boolean askForHelp, boolean isInMistakeBook, String examDraft, String revisingDraft, List<MicroClassInfo> microClassToQuestionList, List<MicroClassInfo> microClassToStudentList, int revisingResult, List<TypicalAnswer> typicalErrorAnswers, List<TypicalAnswer> typicalRightAnswers, boolean revisingAnswerd, List<RevisingRecord> lastRoundRevisingRecords, Long qstLastModifyTime, String stem) {
        Intrinsics.checkNotNullParameter(answerList, "answerList");
        Intrinsics.checkNotNullParameter(qstFlows, "qstFlows");
        Intrinsics.checkNotNullParameter(lastRoundRevisingRecords, "lastRoundRevisingRecords");
        return new TaskDetailInfo(id, itemType, number, originScore, score, totalAnswerScore, totalScore, path, answerList, qstAnswers, answerWithQuestion, qstFlows, qstFlowsCount, askForHelp, isInMistakeBook, examDraft, revisingDraft, microClassToQuestionList, microClassToStudentList, revisingResult, typicalErrorAnswers, typicalRightAnswers, revisingAnswerd, lastRoundRevisingRecords, qstLastModifyTime, stem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskDetailInfo)) {
            return false;
        }
        TaskDetailInfo taskDetailInfo = (TaskDetailInfo) other;
        return this.id == taskDetailInfo.id && this.itemType == taskDetailInfo.itemType && this.number == taskDetailInfo.number && Intrinsics.areEqual((Object) this.originScore, (Object) taskDetailInfo.originScore) && Double.compare(this.score, taskDetailInfo.score) == 0 && Double.compare(this.totalAnswerScore, taskDetailInfo.totalAnswerScore) == 0 && Double.compare(this.totalScore, taskDetailInfo.totalScore) == 0 && Intrinsics.areEqual(this.path, taskDetailInfo.path) && Intrinsics.areEqual(this.answerList, taskDetailInfo.answerList) && Intrinsics.areEqual(this.qstAnswers, taskDetailInfo.qstAnswers) && this.answerWithQuestion == taskDetailInfo.answerWithQuestion && Intrinsics.areEqual(this.qstFlows, taskDetailInfo.qstFlows) && this.qstFlowsCount == taskDetailInfo.qstFlowsCount && this.askForHelp == taskDetailInfo.askForHelp && this.isInMistakeBook == taskDetailInfo.isInMistakeBook && Intrinsics.areEqual(this.examDraft, taskDetailInfo.examDraft) && Intrinsics.areEqual(this.revisingDraft, taskDetailInfo.revisingDraft) && Intrinsics.areEqual(this.microClassToQuestionList, taskDetailInfo.microClassToQuestionList) && Intrinsics.areEqual(this.microClassToStudentList, taskDetailInfo.microClassToStudentList) && this.revisingResult == taskDetailInfo.revisingResult && Intrinsics.areEqual(this.typicalErrorAnswers, taskDetailInfo.typicalErrorAnswers) && Intrinsics.areEqual(this.typicalRightAnswers, taskDetailInfo.typicalRightAnswers) && this.revisingAnswerd == taskDetailInfo.revisingAnswerd && Intrinsics.areEqual(this.lastRoundRevisingRecords, taskDetailInfo.lastRoundRevisingRecords) && Intrinsics.areEqual(this.qstLastModifyTime, taskDetailInfo.qstLastModifyTime) && Intrinsics.areEqual(this.stem, taskDetailInfo.stem);
    }

    public final List<DetailAnswerInfo> getAnswerList() {
        return this.answerList;
    }

    public final boolean getAnswerWithQuestion() {
        return this.answerWithQuestion;
    }

    public final boolean getAskForHelp() {
        return this.askForHelp;
    }

    public final String getExamDraft() {
        return this.examDraft;
    }

    public final long getId() {
        return this.id;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final List<RevisingRecord> getLastRoundRevisingRecords() {
        return this.lastRoundRevisingRecords;
    }

    public final List<MicroClassInfo> getMicroClassToQuestionList() {
        return this.microClassToQuestionList;
    }

    public final List<MicroClassInfo> getMicroClassToStudentList() {
        return this.microClassToStudentList;
    }

    public final int getNumber() {
        return this.number;
    }

    public final Double getOriginScore() {
        return this.originScore;
    }

    public final String getPath() {
        return this.path;
    }

    public final List<DetailGroupQstAnswer> getQstAnswers() {
        return this.qstAnswers;
    }

    public final List<DetailSubQuestion> getQstFlows() {
        return this.qstFlows;
    }

    public final int getQstFlowsCount() {
        return this.qstFlowsCount;
    }

    public final Long getQstLastModifyTime() {
        return this.qstLastModifyTime;
    }

    public final boolean getRevisingAnswerd() {
        return this.revisingAnswerd;
    }

    public final String getRevisingDraft() {
        return this.revisingDraft;
    }

    public final int getRevisingResult() {
        return this.revisingResult;
    }

    public final double getScore() {
        return this.score;
    }

    public final String getStem() {
        return this.stem;
    }

    public final double getTotalAnswerScore() {
        return this.totalAnswerScore;
    }

    public final double getTotalScore() {
        return this.totalScore;
    }

    public final List<TypicalAnswer> getTypicalErrorAnswers() {
        return this.typicalErrorAnswers;
    }

    public final List<TypicalAnswer> getTypicalRightAnswers() {
        return this.typicalRightAnswers;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.itemType)) * 31) + Integer.hashCode(this.number)) * 31;
        Double d10 = this.originScore;
        int iHashCode2 = (((((((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Double.hashCode(this.score)) * 31) + Double.hashCode(this.totalAnswerScore)) * 31) + Double.hashCode(this.totalScore)) * 31;
        String str = this.path;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.answerList.hashCode()) * 31;
        List<DetailGroupQstAnswer> list = this.qstAnswers;
        int iHashCode4 = (((((((((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.answerWithQuestion)) * 31) + this.qstFlows.hashCode()) * 31) + Integer.hashCode(this.qstFlowsCount)) * 31) + Boolean.hashCode(this.askForHelp)) * 31) + Boolean.hashCode(this.isInMistakeBook)) * 31;
        String str2 = this.examDraft;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.revisingDraft;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MicroClassInfo> list2 = this.microClassToQuestionList;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MicroClassInfo> list3 = this.microClassToStudentList;
        int iHashCode8 = (((iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31) + Integer.hashCode(this.revisingResult)) * 31;
        List<TypicalAnswer> list4 = this.typicalErrorAnswers;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TypicalAnswer> list5 = this.typicalRightAnswers;
        int iHashCode10 = (((((iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31) + Boolean.hashCode(this.revisingAnswerd)) * 31) + this.lastRoundRevisingRecords.hashCode()) * 31;
        Long l10 = this.qstLastModifyTime;
        int iHashCode11 = (iHashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.stem;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isInMistakeBook() {
        return this.isInMistakeBook;
    }

    public String toString() {
        return "TaskDetailInfo(id=" + this.id + ", itemType=" + this.itemType + ", number=" + this.number + ", originScore=" + this.originScore + ", score=" + this.score + ", totalAnswerScore=" + this.totalAnswerScore + ", totalScore=" + this.totalScore + ", path=" + this.path + ", answerList=" + this.answerList + ", qstAnswers=" + this.qstAnswers + ", answerWithQuestion=" + this.answerWithQuestion + ", qstFlows=" + this.qstFlows + ", qstFlowsCount=" + this.qstFlowsCount + ", askForHelp=" + this.askForHelp + ", isInMistakeBook=" + this.isInMistakeBook + ", examDraft=" + this.examDraft + ", revisingDraft=" + this.revisingDraft + ", microClassToQuestionList=" + this.microClassToQuestionList + ", microClassToStudentList=" + this.microClassToStudentList + ", revisingResult=" + this.revisingResult + ", typicalErrorAnswers=" + this.typicalErrorAnswers + ", typicalRightAnswers=" + this.typicalRightAnswers + ", revisingAnswerd=" + this.revisingAnswerd + ", lastRoundRevisingRecords=" + this.lastRoundRevisingRecords + ", qstLastModifyTime=" + this.qstLastModifyTime + ", stem=" + this.stem + ")";
    }

    public /* synthetic */ TaskDetailInfo(long j10, int i10, int i11, Double d10, double d11, double d12, double d13, String str, List list, List list2, boolean z9, List list3, int i12, boolean z10, boolean z11, String str2, String str3, List list4, List list5, int i13, List list6, List list7, boolean z12, List list8, Long l10, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, i11, d10, d11, d12, d13, str, list, list2, z9, list3, i12, z10, z11, str2, str3, list4, list5, i13, list6, list7, z12, list8, (i14 & 16777216) != 0 ? 0L : l10, (i14 & 33554432) != 0 ? null : str4);
    }
}
