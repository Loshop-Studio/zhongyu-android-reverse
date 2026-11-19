package com.zykj.mistake.entity.req;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;", "", "sessionId", "", "itemId", "", "isCorrect", "", "<init>", "(JIZ)V", "getSessionId", "()J", "getItemId", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SubmitReviewResultReq {
    public static final int $stable = 0;
    private final boolean isCorrect;
    private final int itemId;
    private final long sessionId;

    public SubmitReviewResultReq(long j7, int i, boolean z8) {
        this.sessionId = j7;
        this.itemId = i;
        this.isCorrect = z8;
    }

    public static /* synthetic */ SubmitReviewResultReq copy$default(SubmitReviewResultReq submitReviewResultReq, long j7, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = submitReviewResultReq.sessionId;
        }
        if ((i8 & 2) != 0) {
            i = submitReviewResultReq.itemId;
        }
        if ((i8 & 4) != 0) {
            z8 = submitReviewResultReq.isCorrect;
        }
        return submitReviewResultReq.copy(j7, i, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCorrect() {
        return this.isCorrect;
    }

    @NotNull
    public final SubmitReviewResultReq copy(long sessionId, int itemId, boolean isCorrect) {
        return new SubmitReviewResultReq(sessionId, itemId, isCorrect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitReviewResultReq)) {
            return false;
        }
        SubmitReviewResultReq submitReviewResultReq = (SubmitReviewResultReq) other;
        return this.sessionId == submitReviewResultReq.sessionId && this.itemId == submitReviewResultReq.itemId && this.isCorrect == submitReviewResultReq.isCorrect;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCorrect) + AbstractC0584a.m902c(this.itemId, Long.hashCode(this.sessionId) * 31, 31);
    }

    public final boolean isCorrect() {
        return this.isCorrect;
    }

    @NotNull
    public String toString() {
        return "SubmitReviewResultReq(sessionId=" + this.sessionId + ", itemId=" + this.itemId + ", isCorrect=" + this.isCorrect + ")";
    }
}
