package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00065"}, m13558d2 = {"Lcom/zykj/evaluation/bean/DetailSubQuestion;", "", "uuid", "", "qstType", "", "score", "", "originScore", "number", "options", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "subQuestions", "questionId", "", "displayNumber", "<init>", "(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)V", "getUuid", "()Ljava/lang/String;", "getQstType", "()I", "getScore", "()D", "getOriginScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNumber", "getOptions", "()Ljava/util/List;", "getType", "getSubQuestions", "getQuestionId", "()J", "getDisplayNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)Lcom/zykj/evaluation/bean/DetailSubQuestion;", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailSubQuestion {
    public static final int $stable = 8;
    private final String displayNumber;
    private final int number;
    private final List<String> options;
    private final Double originScore;
    private final int qstType;
    private final long questionId;
    private final double score;
    private final List<DetailSubQuestion> subQuestions;
    private final int type;
    private final String uuid;

    public DetailSubQuestion(String uuid, int i10, double d10, Double d11, int i11, List<String> list, int i12, List<DetailSubQuestion> list2, long j10, String str) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.qstType = i10;
        this.score = d10;
        this.originScore = d11;
        this.number = i11;
        this.options = list;
        this.type = i12;
        this.subQuestions = list2;
        this.questionId = j10;
        this.displayNumber = str;
    }

    public static /* synthetic */ DetailSubQuestion copy$default(DetailSubQuestion detailSubQuestion, String str, int i10, double d10, Double d11, int i11, List list, int i12, List list2, long j10, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = detailSubQuestion.uuid;
        }
        if ((i13 & 2) != 0) {
            i10 = detailSubQuestion.qstType;
        }
        if ((i13 & 4) != 0) {
            d10 = detailSubQuestion.score;
        }
        if ((i13 & 8) != 0) {
            d11 = detailSubQuestion.originScore;
        }
        if ((i13 & 16) != 0) {
            i11 = detailSubQuestion.number;
        }
        if ((i13 & 32) != 0) {
            list = detailSubQuestion.options;
        }
        if ((i13 & 64) != 0) {
            i12 = detailSubQuestion.type;
        }
        if ((i13 & 128) != 0) {
            list2 = detailSubQuestion.subQuestions;
        }
        if ((i13 & 256) != 0) {
            j10 = detailSubQuestion.questionId;
        }
        if ((i13 & 512) != 0) {
            str2 = detailSubQuestion.displayNumber;
        }
        String str3 = str2;
        long j11 = j10;
        List list3 = list2;
        List list4 = list;
        Double d12 = d11;
        double d13 = d10;
        return detailSubQuestion.copy(str, i10, d13, d12, i11, list4, i12, list3, j11, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDisplayNumber() {
        return this.displayNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQstType() {
        return this.qstType;
    }

    /* renamed from: component3, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getOriginScore() {
        return this.originScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public final List<String> component6() {
        return this.options;
    }

    /* renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final List<DetailSubQuestion> component8() {
        return this.subQuestions;
    }

    /* renamed from: component9, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    public final DetailSubQuestion copy(String uuid, int qstType, double score, Double originScore, int number, List<String> options, int type, List<DetailSubQuestion> subQuestions, long questionId, String displayNumber) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new DetailSubQuestion(uuid, qstType, score, originScore, number, options, type, subQuestions, questionId, displayNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailSubQuestion)) {
            return false;
        }
        DetailSubQuestion detailSubQuestion = (DetailSubQuestion) other;
        return Intrinsics.areEqual(this.uuid, detailSubQuestion.uuid) && this.qstType == detailSubQuestion.qstType && Double.compare(this.score, detailSubQuestion.score) == 0 && Intrinsics.areEqual((Object) this.originScore, (Object) detailSubQuestion.originScore) && this.number == detailSubQuestion.number && Intrinsics.areEqual(this.options, detailSubQuestion.options) && this.type == detailSubQuestion.type && Intrinsics.areEqual(this.subQuestions, detailSubQuestion.subQuestions) && this.questionId == detailSubQuestion.questionId && Intrinsics.areEqual(this.displayNumber, detailSubQuestion.displayNumber);
    }

    public final String getDisplayNumber() {
        return this.displayNumber;
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final Double getOriginScore() {
        return this.originScore;
    }

    public final int getQstType() {
        return this.qstType;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final double getScore() {
        return this.score;
    }

    public final List<DetailSubQuestion> getSubQuestions() {
        return this.subQuestions;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = ((((this.uuid.hashCode() * 31) + Integer.hashCode(this.qstType)) * 31) + Double.hashCode(this.score)) * 31;
        Double d10 = this.originScore;
        int iHashCode2 = (((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Integer.hashCode(this.number)) * 31;
        List<String> list = this.options;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.type)) * 31;
        List<DetailSubQuestion> list2 = this.subQuestions;
        int iHashCode4 = (((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31) + Long.hashCode(this.questionId)) * 31;
        String str = this.displayNumber;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DetailSubQuestion(uuid=" + this.uuid + ", qstType=" + this.qstType + ", score=" + this.score + ", originScore=" + this.originScore + ", number=" + this.number + ", options=" + this.options + ", type=" + this.type + ", subQuestions=" + this.subQuestions + ", questionId=" + this.questionId + ", displayNumber=" + this.displayNumber + ")";
    }

    public /* synthetic */ DetailSubQuestion(String str, int i10, double d10, Double d11, int i11, List list, int i12, List list2, long j10, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, d10, d11, i11, list, i12, list2, (i13 & 256) != 0 ? 0L : j10, (i13 & 512) != 0 ? null : str2);
    }
}
