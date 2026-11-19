package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m5110d2 = {"Lcom/zykj/view/board/board/SimpleUIState;", "", "mainToolType", "Lcom/zykj/view/board/board/MainToolType;", "minorToolType", "Lcom/zykj/view/board/board/MinorToolType;", "expandStatus", "Lcom/zykj/view/board/board/ExpandStatus;", "<init>", "(Lcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ExpandStatus;)V", "getMainToolType", "()Lcom/zykj/view/board/board/MainToolType;", "getMinorToolType", "()Lcom/zykj/view/board/board/MinorToolType;", "getExpandStatus", "()Lcom/zykj/view/board/board/ExpandStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SimpleUIState {

    @NotNull
    private final ExpandStatus expandStatus;

    @NotNull
    private final MainToolType mainToolType;

    @NotNull
    private final MinorToolType minorToolType;

    public SimpleUIState(@NotNull MainToolType mainToolType, @NotNull MinorToolType minorToolType, @NotNull ExpandStatus expandStatus) {
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        AbstractC5830k.m5330g(minorToolType, "minorToolType");
        AbstractC5830k.m5330g(expandStatus, "expandStatus");
        this.mainToolType = mainToolType;
        this.minorToolType = minorToolType;
        this.expandStatus = expandStatus;
    }

    public static /* synthetic */ SimpleUIState copy$default(SimpleUIState simpleUIState, MainToolType mainToolType, MinorToolType minorToolType, ExpandStatus expandStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            mainToolType = simpleUIState.mainToolType;
        }
        if ((i & 2) != 0) {
            minorToolType = simpleUIState.minorToolType;
        }
        if ((i & 4) != 0) {
            expandStatus = simpleUIState.expandStatus;
        }
        return simpleUIState.copy(mainToolType, minorToolType, expandStatus);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MainToolType getMainToolType() {
        return this.mainToolType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MinorToolType getMinorToolType() {
        return this.minorToolType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ExpandStatus getExpandStatus() {
        return this.expandStatus;
    }

    @NotNull
    public final SimpleUIState copy(@NotNull MainToolType mainToolType, @NotNull MinorToolType minorToolType, @NotNull ExpandStatus expandStatus) {
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        AbstractC5830k.m5330g(minorToolType, "minorToolType");
        AbstractC5830k.m5330g(expandStatus, "expandStatus");
        return new SimpleUIState(mainToolType, minorToolType, expandStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleUIState)) {
            return false;
        }
        SimpleUIState simpleUIState = (SimpleUIState) other;
        return AbstractC5830k.m5325b(this.mainToolType, simpleUIState.mainToolType) && AbstractC5830k.m5325b(this.minorToolType, simpleUIState.minorToolType) && AbstractC5830k.m5325b(this.expandStatus, simpleUIState.expandStatus);
    }

    @NotNull
    public final ExpandStatus getExpandStatus() {
        return this.expandStatus;
    }

    @NotNull
    public final MainToolType getMainToolType() {
        return this.mainToolType;
    }

    @NotNull
    public final MinorToolType getMinorToolType() {
        return this.minorToolType;
    }

    public int hashCode() {
        return this.expandStatus.hashCode() + ((this.minorToolType.hashCode() + (this.mainToolType.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SimpleUIState(mainToolType=" + this.mainToolType + ", minorToolType=" + this.minorToolType + ", expandStatus=" + this.expandStatus + ")";
    }
}
