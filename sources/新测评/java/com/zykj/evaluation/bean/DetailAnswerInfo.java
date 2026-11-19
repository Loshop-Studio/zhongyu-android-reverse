package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010-\u001a\u00020\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J°\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\bHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001d¨\u0006>"}, m13558d2 = {"Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "", "uuid", "", "score", "", "originScore", "result", "", "originResult", "examAnswers", "", "examComments", "examMicroLessonComment", "revisingAnswers", "revisingComments", "reviseMicroLessonComment", "whenShowAnswer", "whenShowMicroLesson", "<init>", "(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)V", "getUuid", "()Ljava/lang/String;", "getScore", "()D", "getOriginScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getResult", "()I", "getOriginResult", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExamAnswers", "()Ljava/util/List;", "getExamComments", "getExamMicroLessonComment", "getRevisingAnswers", "getRevisingComments", "getReviseMicroLessonComment", "getWhenShowAnswer", "getWhenShowMicroLesson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailAnswerInfo {
    public static final int $stable = 8;
    private final List<String> examAnswers;
    private final List<String> examComments;
    private final String examMicroLessonComment;
    private final Integer originResult;
    private final Double originScore;
    private final int result;
    private final String reviseMicroLessonComment;
    private final List<String> revisingAnswers;
    private final List<String> revisingComments;
    private final double score;
    private final String uuid;
    private final int whenShowAnswer;
    private final int whenShowMicroLesson;

    public DetailAnswerInfo(String uuid, double d10, Double d11, int i10, Integer num, List<String> examAnswers, List<String> examComments, String str, List<String> revisingAnswers, List<String> revisingComments, String str2, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(examAnswers, "examAnswers");
        Intrinsics.checkNotNullParameter(examComments, "examComments");
        Intrinsics.checkNotNullParameter(revisingAnswers, "revisingAnswers");
        Intrinsics.checkNotNullParameter(revisingComments, "revisingComments");
        this.uuid = uuid;
        this.score = d10;
        this.originScore = d11;
        this.result = i10;
        this.originResult = num;
        this.examAnswers = examAnswers;
        this.examComments = examComments;
        this.examMicroLessonComment = str;
        this.revisingAnswers = revisingAnswers;
        this.revisingComments = revisingComments;
        this.reviseMicroLessonComment = str2;
        this.whenShowAnswer = i11;
        this.whenShowMicroLesson = i12;
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<String> component10() {
        return this.revisingComments;
    }

    /* renamed from: component11, reason: from getter */
    public final String getReviseMicroLessonComment() {
        return this.reviseMicroLessonComment;
    }

    /* renamed from: component12, reason: from getter */
    public final int getWhenShowAnswer() {
        return this.whenShowAnswer;
    }

    /* renamed from: component13, reason: from getter */
    public final int getWhenShowMicroLesson() {
        return this.whenShowMicroLesson;
    }

    /* renamed from: component2, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getOriginScore() {
        return this.originScore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOriginResult() {
        return this.originResult;
    }

    public final List<String> component6() {
        return this.examAnswers;
    }

    public final List<String> component7() {
        return this.examComments;
    }

    /* renamed from: component8, reason: from getter */
    public final String getExamMicroLessonComment() {
        return this.examMicroLessonComment;
    }

    public final List<String> component9() {
        return this.revisingAnswers;
    }

    public final DetailAnswerInfo copy(String uuid, double score, Double originScore, int result, Integer originResult, List<String> examAnswers, List<String> examComments, String examMicroLessonComment, List<String> revisingAnswers, List<String> revisingComments, String reviseMicroLessonComment, int whenShowAnswer, int whenShowMicroLesson) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(examAnswers, "examAnswers");
        Intrinsics.checkNotNullParameter(examComments, "examComments");
        Intrinsics.checkNotNullParameter(revisingAnswers, "revisingAnswers");
        Intrinsics.checkNotNullParameter(revisingComments, "revisingComments");
        return new DetailAnswerInfo(uuid, score, originScore, result, originResult, examAnswers, examComments, examMicroLessonComment, revisingAnswers, revisingComments, reviseMicroLessonComment, whenShowAnswer, whenShowMicroLesson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailAnswerInfo)) {
            return false;
        }
        DetailAnswerInfo detailAnswerInfo = (DetailAnswerInfo) other;
        return Intrinsics.areEqual(this.uuid, detailAnswerInfo.uuid) && Double.compare(this.score, detailAnswerInfo.score) == 0 && Intrinsics.areEqual((Object) this.originScore, (Object) detailAnswerInfo.originScore) && this.result == detailAnswerInfo.result && Intrinsics.areEqual(this.originResult, detailAnswerInfo.originResult) && Intrinsics.areEqual(this.examAnswers, detailAnswerInfo.examAnswers) && Intrinsics.areEqual(this.examComments, detailAnswerInfo.examComments) && Intrinsics.areEqual(this.examMicroLessonComment, detailAnswerInfo.examMicroLessonComment) && Intrinsics.areEqual(this.revisingAnswers, detailAnswerInfo.revisingAnswers) && Intrinsics.areEqual(this.revisingComments, detailAnswerInfo.revisingComments) && Intrinsics.areEqual(this.reviseMicroLessonComment, detailAnswerInfo.reviseMicroLessonComment) && this.whenShowAnswer == detailAnswerInfo.whenShowAnswer && this.whenShowMicroLesson == detailAnswerInfo.whenShowMicroLesson;
    }

    public final List<String> getExamAnswers() {
        return this.examAnswers;
    }

    public final List<String> getExamComments() {
        return this.examComments;
    }

    public final String getExamMicroLessonComment() {
        return this.examMicroLessonComment;
    }

    public final Integer getOriginResult() {
        return this.originResult;
    }

    public final Double getOriginScore() {
        return this.originScore;
    }

    public final int getResult() {
        return this.result;
    }

    public final String getReviseMicroLessonComment() {
        return this.reviseMicroLessonComment;
    }

    public final List<String> getRevisingAnswers() {
        return this.revisingAnswers;
    }

    public final List<String> getRevisingComments() {
        return this.revisingComments;
    }

    public final double getScore() {
        return this.score;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int getWhenShowAnswer() {
        return this.whenShowAnswer;
    }

    public final int getWhenShowMicroLesson() {
        return this.whenShowMicroLesson;
    }

    public int hashCode() {
        int iHashCode = ((this.uuid.hashCode() * 31) + Double.hashCode(this.score)) * 31;
        Double d10 = this.originScore;
        int iHashCode2 = (((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Integer.hashCode(this.result)) * 31;
        Integer num = this.originResult;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.examAnswers.hashCode()) * 31) + this.examComments.hashCode()) * 31;
        String str = this.examMicroLessonComment;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.revisingAnswers.hashCode()) * 31) + this.revisingComments.hashCode()) * 31;
        String str2 = this.reviseMicroLessonComment;
        return ((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.whenShowAnswer)) * 31) + Integer.hashCode(this.whenShowMicroLesson);
    }

    public String toString() {
        return "DetailAnswerInfo(uuid=" + this.uuid + ", score=" + this.score + ", originScore=" + this.originScore + ", result=" + this.result + ", originResult=" + this.originResult + ", examAnswers=" + this.examAnswers + ", examComments=" + this.examComments + ", examMicroLessonComment=" + this.examMicroLessonComment + ", revisingAnswers=" + this.revisingAnswers + ", revisingComments=" + this.revisingComments + ", reviseMicroLessonComment=" + this.reviseMicroLessonComment + ", whenShowAnswer=" + this.whenShowAnswer + ", whenShowMicroLesson=" + this.whenShowMicroLesson + ")";
    }
}
