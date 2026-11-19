package com.zykj.mistake.entity.resp;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/ReviewPerformance;", "", "summaryText", "", "newMistakeCount", "", "practiceQuestionCount", "practiceDayCount", "consolidatingItemCount", "masteredItemCount", "continuousReviewDays", "<init>", "(Ljava/lang/String;IIIIII)V", "getSummaryText", "()Ljava/lang/String;", "getNewMistakeCount", "()I", "getPracticeQuestionCount", "getPracticeDayCount", "getConsolidatingItemCount", "getMasteredItemCount", "getContinuousReviewDays", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ReviewPerformance {
    public static final int $stable = 0;
    private final int consolidatingItemCount;
    private final int continuousReviewDays;
    private final int masteredItemCount;
    private final int newMistakeCount;
    private final int practiceDayCount;
    private final int practiceQuestionCount;

    @NotNull
    private final String summaryText;

    public ReviewPerformance() {
        this(null, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ ReviewPerformance copy$default(ReviewPerformance reviewPerformance, String str, int i, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reviewPerformance.summaryText;
        }
        if ((i13 & 2) != 0) {
            i = reviewPerformance.newMistakeCount;
        }
        if ((i13 & 4) != 0) {
            i8 = reviewPerformance.practiceQuestionCount;
        }
        if ((i13 & 8) != 0) {
            i9 = reviewPerformance.practiceDayCount;
        }
        if ((i13 & 16) != 0) {
            i10 = reviewPerformance.consolidatingItemCount;
        }
        if ((i13 & 32) != 0) {
            i11 = reviewPerformance.masteredItemCount;
        }
        if ((i13 & 64) != 0) {
            i12 = reviewPerformance.continuousReviewDays;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i10;
        int i17 = i8;
        return reviewPerformance.copy(str, i, i17, i9, i16, i14, i15);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNewMistakeCount() {
        return this.newMistakeCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPracticeQuestionCount() {
        return this.practiceQuestionCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPracticeDayCount() {
        return this.practiceDayCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getConsolidatingItemCount() {
        return this.consolidatingItemCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMasteredItemCount() {
        return this.masteredItemCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getContinuousReviewDays() {
        return this.continuousReviewDays;
    }

    @NotNull
    public final ReviewPerformance copy(@NotNull String summaryText, int newMistakeCount, int practiceQuestionCount, int practiceDayCount, int consolidatingItemCount, int masteredItemCount, int continuousReviewDays) {
        AbstractC5830k.m5330g(summaryText, "summaryText");
        return new ReviewPerformance(summaryText, newMistakeCount, practiceQuestionCount, practiceDayCount, consolidatingItemCount, masteredItemCount, continuousReviewDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewPerformance)) {
            return false;
        }
        ReviewPerformance reviewPerformance = (ReviewPerformance) other;
        return AbstractC5830k.m5325b(this.summaryText, reviewPerformance.summaryText) && this.newMistakeCount == reviewPerformance.newMistakeCount && this.practiceQuestionCount == reviewPerformance.practiceQuestionCount && this.practiceDayCount == reviewPerformance.practiceDayCount && this.consolidatingItemCount == reviewPerformance.consolidatingItemCount && this.masteredItemCount == reviewPerformance.masteredItemCount && this.continuousReviewDays == reviewPerformance.continuousReviewDays;
    }

    public final int getConsolidatingItemCount() {
        return this.consolidatingItemCount;
    }

    public final int getContinuousReviewDays() {
        return this.continuousReviewDays;
    }

    public final int getMasteredItemCount() {
        return this.masteredItemCount;
    }

    public final int getNewMistakeCount() {
        return this.newMistakeCount;
    }

    public final int getPracticeDayCount() {
        return this.practiceDayCount;
    }

    public final int getPracticeQuestionCount() {
        return this.practiceQuestionCount;
    }

    @NotNull
    public final String getSummaryText() {
        return this.summaryText;
    }

    public int hashCode() {
        return Integer.hashCode(this.continuousReviewDays) + AbstractC0584a.m902c(this.masteredItemCount, AbstractC0584a.m902c(this.consolidatingItemCount, AbstractC0584a.m902c(this.practiceDayCount, AbstractC0584a.m902c(this.practiceQuestionCount, AbstractC0584a.m902c(this.newMistakeCount, this.summaryText.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.summaryText;
        int i = this.newMistakeCount;
        int i8 = this.practiceQuestionCount;
        int i9 = this.practiceDayCount;
        int i10 = this.consolidatingItemCount;
        int i11 = this.masteredItemCount;
        int i12 = this.continuousReviewDays;
        StringBuilder sb = new StringBuilder("ReviewPerformance(summaryText=");
        sb.append(str);
        sb.append(", newMistakeCount=");
        sb.append(i);
        sb.append(", practiceQuestionCount=");
        AbstractC1923c.m1059w(sb, i8, ", practiceDayCount=", i9, ", consolidatingItemCount=");
        AbstractC1923c.m1059w(sb, i10, ", masteredItemCount=", i11, ", continuousReviewDays=");
        return AbstractC0037f.m90o(sb, ")", i12);
    }

    public ReviewPerformance(@NotNull String summaryText, int i, int i8, int i9, int i10, int i11, int i12) {
        AbstractC5830k.m5330g(summaryText, "summaryText");
        this.summaryText = summaryText;
        this.newMistakeCount = i;
        this.practiceQuestionCount = i8;
        this.practiceDayCount = i9;
        this.consolidatingItemCount = i10;
        this.masteredItemCount = i11;
        this.continuousReviewDays = i12;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ReviewPerformance(java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.AbstractC5824e r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.entity.resp.ReviewPerformance.<init>(java.lang.String, int, int, int, int, int, int, int, kotlin.jvm.internal.e):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/entity/resp/ReviewPerformance.smali:154
    }
}
