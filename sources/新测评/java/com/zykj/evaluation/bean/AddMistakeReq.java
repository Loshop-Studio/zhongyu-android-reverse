package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u008e\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000eHÖ\u0001J\t\u00104\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u00065"}, m13558d2 = {"Lcom/zykj/evaluation/bean/AddMistakeReq;", "", "examId", "", "isRelatedGroup", "", "questionId", "topicId", "title", "", "extraStems", "", "stemShoot", "diff", "", "attainedLevel", "errorReason", "tagIdList", "<init>", "(JZJJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getExamId", "()J", "()Z", "getQuestionId", "getTopicId", "getTitle", "()Ljava/lang/String;", "getExtraStems", "()Ljava/util/List;", "getStemShoot", "getDiff", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAttainedLevel", "getErrorReason", "getTagIdList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JZJJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/zykj/evaluation/bean/AddMistakeReq;", "equals", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddMistakeReq {
    public static final int $stable = 8;
    private final Integer attainedLevel;
    private final Integer diff;
    private final Integer errorReason;
    private final long examId;
    private final List<String> extraStems;
    private final boolean isRelatedGroup;
    private final long questionId;
    private final String stemShoot;
    private final List<Integer> tagIdList;
    private final String title;
    private final long topicId;

    public AddMistakeReq() {
        this(0L, false, 0L, 0L, null, null, null, null, null, null, null, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getExamId() {
        return this.examId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getErrorReason() {
        return this.errorReason;
    }

    public final List<Integer> component11() {
        return this.tagIdList;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRelatedGroup() {
        return this.isRelatedGroup;
    }

    /* renamed from: component3, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component6() {
        return this.extraStems;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStemShoot() {
        return this.stemShoot;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getDiff() {
        return this.diff;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getAttainedLevel() {
        return this.attainedLevel;
    }

    public final AddMistakeReq copy(long examId, boolean isRelatedGroup, long questionId, long topicId, String title, List<String> extraStems, String stemShoot, Integer diff, Integer attainedLevel, Integer errorReason, List<Integer> tagIdList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(extraStems, "extraStems");
        Intrinsics.checkNotNullParameter(stemShoot, "stemShoot");
        Intrinsics.checkNotNullParameter(tagIdList, "tagIdList");
        return new AddMistakeReq(examId, isRelatedGroup, questionId, topicId, title, extraStems, stemShoot, diff, attainedLevel, errorReason, tagIdList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddMistakeReq)) {
            return false;
        }
        AddMistakeReq addMistakeReq = (AddMistakeReq) other;
        return this.examId == addMistakeReq.examId && this.isRelatedGroup == addMistakeReq.isRelatedGroup && this.questionId == addMistakeReq.questionId && this.topicId == addMistakeReq.topicId && Intrinsics.areEqual(this.title, addMistakeReq.title) && Intrinsics.areEqual(this.extraStems, addMistakeReq.extraStems) && Intrinsics.areEqual(this.stemShoot, addMistakeReq.stemShoot) && Intrinsics.areEqual(this.diff, addMistakeReq.diff) && Intrinsics.areEqual(this.attainedLevel, addMistakeReq.attainedLevel) && Intrinsics.areEqual(this.errorReason, addMistakeReq.errorReason) && Intrinsics.areEqual(this.tagIdList, addMistakeReq.tagIdList);
    }

    public final Integer getAttainedLevel() {
        return this.attainedLevel;
    }

    public final Integer getDiff() {
        return this.diff;
    }

    public final Integer getErrorReason() {
        return this.errorReason;
    }

    public final long getExamId() {
        return this.examId;
    }

    public final List<String> getExtraStems() {
        return this.extraStems;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getStemShoot() {
        return this.stemShoot;
    }

    public final List<Integer> getTagIdList() {
        return this.tagIdList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Long.hashCode(this.examId) * 31) + Boolean.hashCode(this.isRelatedGroup)) * 31) + Long.hashCode(this.questionId)) * 31) + Long.hashCode(this.topicId)) * 31) + this.title.hashCode()) * 31) + this.extraStems.hashCode()) * 31) + this.stemShoot.hashCode()) * 31;
        Integer num = this.diff;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.attainedLevel;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.errorReason;
        return ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.tagIdList.hashCode();
    }

    public final boolean isRelatedGroup() {
        return this.isRelatedGroup;
    }

    public String toString() {
        return "AddMistakeReq(examId=" + this.examId + ", isRelatedGroup=" + this.isRelatedGroup + ", questionId=" + this.questionId + ", topicId=" + this.topicId + ", title=" + this.title + ", extraStems=" + this.extraStems + ", stemShoot=" + this.stemShoot + ", diff=" + this.diff + ", attainedLevel=" + this.attainedLevel + ", errorReason=" + this.errorReason + ", tagIdList=" + this.tagIdList + ")";
    }

    public AddMistakeReq(long j10, boolean z9, long j11, long j12, String title, List<String> extraStems, String stemShoot, Integer num, Integer num2, Integer num3, List<Integer> tagIdList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(extraStems, "extraStems");
        Intrinsics.checkNotNullParameter(stemShoot, "stemShoot");
        Intrinsics.checkNotNullParameter(tagIdList, "tagIdList");
        this.examId = j10;
        this.isRelatedGroup = z9;
        this.questionId = j11;
        this.topicId = j12;
        this.title = title;
        this.extraStems = extraStems;
        this.stemShoot = stemShoot;
        this.diff = num;
        this.attainedLevel = num2;
        this.errorReason = num3;
        this.tagIdList = tagIdList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddMistakeReq(long j10, boolean z9, long j11, long j12, String str, List list, String str2, Integer num, Integer num2, Integer num3, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) == 0 ? z9 : false, (i10 & 4) != 0 ? 0L : j11, (i10 & 8) == 0 ? j12 : 0L, (i10 & 16) != 0 ? "" : str, (i10 & 32) != 0 ? new ArrayList() : list, (i10 & 64) == 0 ? str2 : "", (i10 & 128) != 0 ? num : num, (i10 & 256) != 0 ? num : num2, (i10 & 512) == 0 ? num3 : 0, (i10 & 1024) != 0 ? new ArrayList() : list2);
    }
}
