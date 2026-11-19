package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.ExpandStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/view/board/board/ExpandState;", "", "expandStatus", "Lcom/zykj/view/board/board/ExpandStatus;", "<init>", "(Lcom/zykj/view/board/board/ExpandStatus;)V", "getExpandStatus", "()Lcom/zykj/view/board/board/ExpandStatus;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ExpandState {

    @NotNull
    private final ExpandStatus expandStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExpandState copy$default(ExpandState expandState, ExpandStatus expandStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            expandStatus = expandState.expandStatus;
        }
        return expandState.copy(expandStatus);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ExpandStatus getExpandStatus() {
        return this.expandStatus;
    }

    @NotNull
    public final ExpandState copy(@NotNull ExpandStatus expandStatus) {
        AbstractC5830k.m5330g(expandStatus, "expandStatus");
        return new ExpandState(expandStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExpandState) && AbstractC5830k.m5325b(this.expandStatus, ((ExpandState) other).expandStatus);
    }

    @NotNull
    public final ExpandStatus getExpandStatus() {
        return this.expandStatus;
    }

    public int hashCode() {
        return this.expandStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExpandState(expandStatus=" + this.expandStatus + ")";
    }

    public ExpandState(@NotNull ExpandStatus expandStatus) {
        AbstractC5830k.m5330g(expandStatus, "expandStatus");
        this.expandStatus = expandStatus;
    }

    public /* synthetic */ ExpandState(ExpandStatus expandStatus, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? ExpandStatus.Expanded.INSTANCE : expandStatus);
    }
}
