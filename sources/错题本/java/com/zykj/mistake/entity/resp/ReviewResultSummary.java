package com.zykj.mistake.entity.resp;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/ReviewResultSummary;", "", "totalCount", "", "submittedCount", "rightCount", "wrongCount", "promotedCount", "masteredCount", "hasPromoted", "", "hasMastered", "<init>", "(IIIIIIZZ)V", "getTotalCount", "()I", "getSubmittedCount", "getRightCount", "getWrongCount", "getPromotedCount", "getMasteredCount", "getHasPromoted", "()Z", "getHasMastered", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ReviewResultSummary {
    public static final int $stable = 0;
    private final boolean hasMastered;
    private final boolean hasPromoted;
    private final int masteredCount;
    private final int promotedCount;
    private final int rightCount;
    private final int submittedCount;
    private final int totalCount;
    private final int wrongCount;

    public ReviewResultSummary() {
        this(0, 0, 0, 0, 0, 0, false, false, 255, null);
    }

    public static /* synthetic */ ReviewResultSummary copy$default(ReviewResultSummary reviewResultSummary, int i, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = reviewResultSummary.totalCount;
        }
        if ((i13 & 2) != 0) {
            i8 = reviewResultSummary.submittedCount;
        }
        if ((i13 & 4) != 0) {
            i9 = reviewResultSummary.rightCount;
        }
        if ((i13 & 8) != 0) {
            i10 = reviewResultSummary.wrongCount;
        }
        if ((i13 & 16) != 0) {
            i11 = reviewResultSummary.promotedCount;
        }
        if ((i13 & 32) != 0) {
            i12 = reviewResultSummary.masteredCount;
        }
        if ((i13 & 64) != 0) {
            z8 = reviewResultSummary.hasPromoted;
        }
        if ((i13 & 128) != 0) {
            z9 = reviewResultSummary.hasMastered;
        }
        boolean z10 = z8;
        boolean z11 = z9;
        int i14 = i11;
        int i15 = i12;
        return reviewResultSummary.copy(i, i8, i9, i10, i14, i15, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSubmittedCount() {
        return this.submittedCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRightCount() {
        return this.rightCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWrongCount() {
        return this.wrongCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPromotedCount() {
        return this.promotedCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMasteredCount() {
        return this.masteredCount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasPromoted() {
        return this.hasPromoted;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasMastered() {
        return this.hasMastered;
    }

    @NotNull
    public final ReviewResultSummary copy(int totalCount, int submittedCount, int rightCount, int wrongCount, int promotedCount, int masteredCount, boolean hasPromoted, boolean hasMastered) {
        return new ReviewResultSummary(totalCount, submittedCount, rightCount, wrongCount, promotedCount, masteredCount, hasPromoted, hasMastered);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewResultSummary)) {
            return false;
        }
        ReviewResultSummary reviewResultSummary = (ReviewResultSummary) other;
        return this.totalCount == reviewResultSummary.totalCount && this.submittedCount == reviewResultSummary.submittedCount && this.rightCount == reviewResultSummary.rightCount && this.wrongCount == reviewResultSummary.wrongCount && this.promotedCount == reviewResultSummary.promotedCount && this.masteredCount == reviewResultSummary.masteredCount && this.hasPromoted == reviewResultSummary.hasPromoted && this.hasMastered == reviewResultSummary.hasMastered;
    }

    public final boolean getHasMastered() {
        return this.hasMastered;
    }

    public final boolean getHasPromoted() {
        return this.hasPromoted;
    }

    public final int getMasteredCount() {
        return this.masteredCount;
    }

    public final int getPromotedCount() {
        return this.promotedCount;
    }

    public final int getRightCount() {
        return this.rightCount;
    }

    public final int getSubmittedCount() {
        return this.submittedCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getWrongCount() {
        return this.wrongCount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasMastered) + AbstractC0584a.m908i(this.hasPromoted, AbstractC0584a.m902c(this.masteredCount, AbstractC0584a.m902c(this.promotedCount, AbstractC0584a.m902c(this.wrongCount, AbstractC0584a.m902c(this.rightCount, AbstractC0584a.m902c(this.submittedCount, Integer.hashCode(this.totalCount) * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.totalCount;
        int i8 = this.submittedCount;
        int i9 = this.rightCount;
        int i10 = this.wrongCount;
        int i11 = this.promotedCount;
        int i12 = this.masteredCount;
        boolean z8 = this.hasPromoted;
        boolean z9 = this.hasMastered;
        StringBuilder sbM99x = AbstractC0037f.m99x("ReviewResultSummary(totalCount=", ", submittedCount=", i, ", rightCount=", i8);
        AbstractC1923c.m1059w(sbM99x, i9, ", wrongCount=", i10, ", promotedCount=");
        AbstractC1923c.m1059w(sbM99x, i11, ", masteredCount=", i12, ", hasPromoted=");
        sbM99x.append(z8);
        sbM99x.append(", hasMastered=");
        sbM99x.append(z9);
        sbM99x.append(")");
        return sbM99x.toString();
    }

    public ReviewResultSummary(int i, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9) {
        this.totalCount = i;
        this.submittedCount = i8;
        this.rightCount = i9;
        this.wrongCount = i10;
        this.promotedCount = i11;
        this.masteredCount = i12;
        this.hasPromoted = z8;
        this.hasMastered = z9;
    }

    public /* synthetic */ ReviewResultSummary(int i, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9, int i13, AbstractC5824e abstractC5824e) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i8, (i13 & 4) != 0 ? 0 : i9, (i13 & 8) != 0 ? 0 : i10, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12, (i13 & 64) != 0 ? false : z8, (i13 & 128) != 0 ? false : z9);
    }
}
