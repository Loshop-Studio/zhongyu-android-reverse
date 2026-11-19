package com.zykj.mistake.entity.req;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/StartReviewSessionReq;", "", "mode", "", "<init>", "(I)V", "getMode", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class StartReviewSessionReq {
    public static final int $stable = 0;
    private final int mode;

    public StartReviewSessionReq(int i) {
        this.mode = i;
    }

    public static /* synthetic */ StartReviewSessionReq copy$default(StartReviewSessionReq startReviewSessionReq, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = startReviewSessionReq.mode;
        }
        return startReviewSessionReq.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final StartReviewSessionReq copy(int mode) {
        return new StartReviewSessionReq(mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StartReviewSessionReq) && this.mode == ((StartReviewSessionReq) other).mode;
    }

    public final int getMode() {
        return this.mode;
    }

    public int hashCode() {
        return Integer.hashCode(this.mode);
    }

    @NotNull
    public String toString() {
        return AbstractC0037f.m82g(this.mode, "StartReviewSessionReq(mode=", ")");
    }
}
