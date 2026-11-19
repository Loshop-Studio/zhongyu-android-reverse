package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.bean.BaseGuideQuestion;
import com.zykj.evaluation.bean.SpecificTrainingType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bB\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BÙ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u0015\u0012\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\b\u0010@\u001a\u0004\u0018\u00010\bJ\u0006\u0010A\u001a\u00020\u0018J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010K\u001a\u00020\u0010HÆ\u0003J\t\u0010L\u001a\u00020\u0010HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010O\u001a\u00020\u0015HÆ\u0003J\t\u0010P\u001a\u00020\u0015HÆ\u0003J\t\u0010Q\u001a\u00020\u0018HÆ\u0003J\t\u0010R\u001a\u00020\u0018HÆ\u0003J\u0015\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001bHÆ\u0003J\t\u0010T\u001a\u00020\u0018HÆ\u0003J\t\u0010U\u001a\u00020\u0015HÆ\u0003J\t\u0010V\u001a\u00020\u0015HÆ\u0003J\t\u0010W\u001a\u00020\u0015HÆ\u0003J\t\u0010X\u001a\u00020\u0018HÆ\u0003J\u008f\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\u0018HÆ\u0001J\u0013\u0010Z\u001a\u00020\u00182\b\u0010[\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\\\u001a\u00020\u0015HÖ\u0001J\t\u0010]\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00107R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u001d\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0011\u0010\u001e\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0011\u0010\u001f\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0011\u0010 \u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0011\u0010!\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b?\u00107¨\u0006^"}, m13558d2 = {"Lcom/zykj/evaluation/bean/GuideTaskInfo;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zykj/evaluation/bean/BaseGuideQuestion;", "", "id", "", "examId", "examName", "", "gradeId", "gradeName", "topicId", "topicName", "startTime", "endTime", "myScore", "", "score", "testDescription", "testTips", "state", "", "examState", "isRepresentative", "", "enableScore", "groups", "", "Lcom/zykj/evaluation/bean/GuideGroup;", "noQstStem", "whenShowMicroLesson", "whenShowAnswer", "specificTrainingType", "correctWithSelf", "<init>", "(JJLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;IIZZLjava/util/List;ZIIIZ)V", "getId", "()J", "getExamId", "getExamName", "()Ljava/lang/String;", "getGradeId", "getGradeName", "getTopicId", "getTopicName", "getStartTime", "getEndTime", "getMyScore", "()D", "getScore", "getTestDescription", "getTestTips", "getState", "()I", "getExamState", "()Z", "getEnableScore", "getGroups", "()Ljava/util/List;", "getNoQstStem", "getWhenShowMicroLesson", "getWhenShowAnswer", "getSpecificTrainingType", "getCorrectWithSelf", "getExamDescription", "isNormalTask", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GuideTaskInfo<T extends BaseGuideQuestion> {
    public static final int $stable = 8;
    private final boolean correctWithSelf;
    private final boolean enableScore;
    private final String endTime;
    private final long examId;
    private final String examName;
    private final int examState;
    private final long gradeId;
    private final String gradeName;
    private final List<GuideGroup<T>> groups;
    private final long id;
    private final boolean isRepresentative;
    private final double myScore;
    private final boolean noQstStem;
    private final double score;
    private final int specificTrainingType;
    private final String startTime;
    private final int state;
    private final String testDescription;
    private final String testTips;
    private final long topicId;
    private final String topicName;
    private final int whenShowAnswer;
    private final int whenShowMicroLesson;

    public GuideTaskInfo(long j10, long j11, String str, long j12, String str2, long j13, String str3, String str4, String str5, double d10, double d11, String str6, String str7, int i10, int i11, boolean z9, boolean z10, List<GuideGroup<T>> groups, boolean z11, int i12, int i13, int i14, boolean z12) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.id = j10;
        this.examId = j11;
        this.examName = str;
        this.gradeId = j12;
        this.gradeName = str2;
        this.topicId = j13;
        this.topicName = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.myScore = d10;
        this.score = d11;
        this.testDescription = str6;
        this.testTips = str7;
        this.state = i10;
        this.examState = i11;
        this.isRepresentative = z9;
        this.enableScore = z10;
        this.groups = groups;
        this.noQstStem = z11;
        this.whenShowMicroLesson = i12;
        this.whenShowAnswer = i13;
        this.specificTrainingType = i14;
        this.correctWithSelf = z12;
    }

    public static /* synthetic */ GuideTaskInfo copy$default(GuideTaskInfo guideTaskInfo, long j10, long j11, String str, long j12, String str2, long j13, String str3, String str4, String str5, double d10, double d11, String str6, String str7, int i10, int i11, boolean z9, boolean z10, List list, boolean z11, int i12, int i13, int i14, boolean z12, int i15, Object obj) {
        long j14;
        double d12;
        boolean z13;
        int i16;
        long j15 = (i15 & 1) != 0 ? guideTaskInfo.id : j10;
        long j16 = (i15 & 2) != 0 ? guideTaskInfo.examId : j11;
        String str8 = (i15 & 4) != 0 ? guideTaskInfo.examName : str;
        long j17 = (i15 & 8) != 0 ? guideTaskInfo.gradeId : j12;
        String str9 = (i15 & 16) != 0 ? guideTaskInfo.gradeName : str2;
        long j18 = (i15 & 32) != 0 ? guideTaskInfo.topicId : j13;
        String str10 = (i15 & 64) != 0 ? guideTaskInfo.topicName : str3;
        String str11 = (i15 & 128) != 0 ? guideTaskInfo.startTime : str4;
        String str12 = (i15 & 256) != 0 ? guideTaskInfo.endTime : str5;
        if ((i15 & 512) != 0) {
            j14 = j15;
            d12 = guideTaskInfo.myScore;
        } else {
            j14 = j15;
            d12 = d10;
        }
        double d13 = d12;
        double d14 = (i15 & 1024) != 0 ? guideTaskInfo.score : d11;
        String str13 = (i15 & 2048) != 0 ? guideTaskInfo.testDescription : str6;
        String str14 = (i15 & 4096) != 0 ? guideTaskInfo.testTips : str7;
        String str15 = str13;
        int i17 = (i15 & 8192) != 0 ? guideTaskInfo.state : i10;
        int i18 = (i15 & 16384) != 0 ? guideTaskInfo.examState : i11;
        boolean z14 = (i15 & 32768) != 0 ? guideTaskInfo.isRepresentative : z9;
        boolean z15 = (i15 & 65536) != 0 ? guideTaskInfo.enableScore : z10;
        List list2 = (i15 & 131072) != 0 ? guideTaskInfo.groups : list;
        boolean z16 = (i15 & 262144) != 0 ? guideTaskInfo.noQstStem : z11;
        int i19 = (i15 & 524288) != 0 ? guideTaskInfo.whenShowMicroLesson : i12;
        int i20 = (i15 & 1048576) != 0 ? guideTaskInfo.whenShowAnswer : i13;
        int i21 = (i15 & 2097152) != 0 ? guideTaskInfo.specificTrainingType : i14;
        if ((i15 & 4194304) != 0) {
            i16 = i21;
            z13 = guideTaskInfo.correctWithSelf;
        } else {
            z13 = z12;
            i16 = i21;
        }
        return guideTaskInfo.copy(j14, j16, str8, j17, str9, j18, str10, str11, str12, d13, d14, str15, str14, i17, i18, z14, z15, list2, z16, i19, i20, i16, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final double getMyScore() {
        return this.myScore;
    }

    /* renamed from: component11, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTestDescription() {
        return this.testDescription;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTestTips() {
        return this.testTips;
    }

    /* renamed from: component14, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component15, reason: from getter */
    public final int getExamState() {
        return this.examState;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsRepresentative() {
        return this.isRepresentative;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getEnableScore() {
        return this.enableScore;
    }

    public final List<GuideGroup<T>> component18() {
        return this.groups;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getNoQstStem() {
        return this.noQstStem;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExamId() {
        return this.examId;
    }

    /* renamed from: component20, reason: from getter */
    public final int getWhenShowMicroLesson() {
        return this.whenShowMicroLesson;
    }

    /* renamed from: component21, reason: from getter */
    public final int getWhenShowAnswer() {
        return this.whenShowAnswer;
    }

    /* renamed from: component22, reason: from getter */
    public final int getSpecificTrainingType() {
        return this.specificTrainingType;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getCorrectWithSelf() {
        return this.correctWithSelf;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExamName() {
        return this.examName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getGradeId() {
        return this.gradeId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGradeName() {
        return this.gradeName;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final GuideTaskInfo<T> copy(long id, long examId, String examName, long gradeId, String gradeName, long topicId, String topicName, String startTime, String endTime, double myScore, double score, String testDescription, String testTips, int state, int examState, boolean isRepresentative, boolean enableScore, List<GuideGroup<T>> groups, boolean noQstStem, int whenShowMicroLesson, int whenShowAnswer, int specificTrainingType, boolean correctWithSelf) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new GuideTaskInfo<>(id, examId, examName, gradeId, gradeName, topicId, topicName, startTime, endTime, myScore, score, testDescription, testTips, state, examState, isRepresentative, enableScore, groups, noQstStem, whenShowMicroLesson, whenShowAnswer, specificTrainingType, correctWithSelf);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideTaskInfo)) {
            return false;
        }
        GuideTaskInfo guideTaskInfo = (GuideTaskInfo) other;
        return this.id == guideTaskInfo.id && this.examId == guideTaskInfo.examId && Intrinsics.areEqual(this.examName, guideTaskInfo.examName) && this.gradeId == guideTaskInfo.gradeId && Intrinsics.areEqual(this.gradeName, guideTaskInfo.gradeName) && this.topicId == guideTaskInfo.topicId && Intrinsics.areEqual(this.topicName, guideTaskInfo.topicName) && Intrinsics.areEqual(this.startTime, guideTaskInfo.startTime) && Intrinsics.areEqual(this.endTime, guideTaskInfo.endTime) && Double.compare(this.myScore, guideTaskInfo.myScore) == 0 && Double.compare(this.score, guideTaskInfo.score) == 0 && Intrinsics.areEqual(this.testDescription, guideTaskInfo.testDescription) && Intrinsics.areEqual(this.testTips, guideTaskInfo.testTips) && this.state == guideTaskInfo.state && this.examState == guideTaskInfo.examState && this.isRepresentative == guideTaskInfo.isRepresentative && this.enableScore == guideTaskInfo.enableScore && Intrinsics.areEqual(this.groups, guideTaskInfo.groups) && this.noQstStem == guideTaskInfo.noQstStem && this.whenShowMicroLesson == guideTaskInfo.whenShowMicroLesson && this.whenShowAnswer == guideTaskInfo.whenShowAnswer && this.specificTrainingType == guideTaskInfo.specificTrainingType && this.correctWithSelf == guideTaskInfo.correctWithSelf;
    }

    public final boolean getCorrectWithSelf() {
        return this.correctWithSelf;
    }

    public final boolean getEnableScore() {
        return this.enableScore;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getExamDescription() {
        String str = this.testDescription;
        return str == null ? this.testTips : str;
    }

    public final long getExamId() {
        return this.examId;
    }

    public final String getExamName() {
        return this.examName;
    }

    public final int getExamState() {
        return this.examState;
    }

    public final long getGradeId() {
        return this.gradeId;
    }

    public final String getGradeName() {
        return this.gradeName;
    }

    public final List<GuideGroup<T>> getGroups() {
        return this.groups;
    }

    public final long getId() {
        return this.id;
    }

    public final double getMyScore() {
        return this.myScore;
    }

    public final boolean getNoQstStem() {
        return this.noQstStem;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getSpecificTrainingType() {
        return this.specificTrainingType;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final int getState() {
        return this.state;
    }

    public final String getTestDescription() {
        return this.testDescription;
    }

    public final String getTestTips() {
        return this.testTips;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public final int getWhenShowAnswer() {
        return this.whenShowAnswer;
    }

    public final int getWhenShowMicroLesson() {
        return this.whenShowMicroLesson;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.examId)) * 31;
        String str = this.examName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.gradeId)) * 31;
        String str2 = this.gradeName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.topicId)) * 31;
        String str3 = this.topicName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTime;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTime;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.hashCode(this.myScore)) * 31) + Double.hashCode(this.score)) * 31;
        String str6 = this.testDescription;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.testTips;
        return ((((((((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.examState)) * 31) + Boolean.hashCode(this.isRepresentative)) * 31) + Boolean.hashCode(this.enableScore)) * 31) + this.groups.hashCode()) * 31) + Boolean.hashCode(this.noQstStem)) * 31) + Integer.hashCode(this.whenShowMicroLesson)) * 31) + Integer.hashCode(this.whenShowAnswer)) * 31) + Integer.hashCode(this.specificTrainingType)) * 31) + Boolean.hashCode(this.correctWithSelf);
    }

    public final boolean isNormalTask() {
        return this.specificTrainingType == SpecificTrainingType.Normal.INSTANCE.getType();
    }

    public final boolean isRepresentative() {
        return this.isRepresentative;
    }

    public String toString() {
        return "GuideTaskInfo(id=" + this.id + ", examId=" + this.examId + ", examName=" + this.examName + ", gradeId=" + this.gradeId + ", gradeName=" + this.gradeName + ", topicId=" + this.topicId + ", topicName=" + this.topicName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", myScore=" + this.myScore + ", score=" + this.score + ", testDescription=" + this.testDescription + ", testTips=" + this.testTips + ", state=" + this.state + ", examState=" + this.examState + ", isRepresentative=" + this.isRepresentative + ", enableScore=" + this.enableScore + ", groups=" + this.groups + ", noQstStem=" + this.noQstStem + ", whenShowMicroLesson=" + this.whenShowMicroLesson + ", whenShowAnswer=" + this.whenShowAnswer + ", specificTrainingType=" + this.specificTrainingType + ", correctWithSelf=" + this.correctWithSelf + ")";
    }
}
