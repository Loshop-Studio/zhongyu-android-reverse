package com.zykj.view.board.board;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.PenColor;
import com.zykj.view.board.board.PenType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010¨\u0006&"}, m5110d2 = {"Lcom/zykj/view/board/board/PenToolState;", "", "dotVisible", "", "highlighterVisible", "penType", "Lcom/zykj/view/board/board/PenType;", "penSizeLevel", "", "penColor", "Lcom/zykj/view/board/board/PenColor;", "penCustomColor", "isShowCustomColor", "<init>", "(ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZ)V", "getDotVisible", "()Z", "getHighlighterVisible", "getPenType", "()Lcom/zykj/view/board/board/PenType;", "getPenSizeLevel", "()I", "getPenColor", "()Lcom/zykj/view/board/board/PenColor;", "getPenCustomColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class PenToolState {
    private final boolean dotVisible;
    private final boolean highlighterVisible;
    private final boolean isShowCustomColor;

    @NotNull
    private final PenColor penColor;
    private final int penCustomColor;
    private final int penSizeLevel;

    @NotNull
    private final PenType penType;

    public PenToolState() {
        this(false, false, null, 0, null, 0, false, 127, null);
    }

    public static /* synthetic */ PenToolState copy$default(PenToolState penToolState, boolean z8, boolean z9, PenType penType, int i, PenColor penColor, int i8, boolean z10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = penToolState.dotVisible;
        }
        if ((i9 & 2) != 0) {
            z9 = penToolState.highlighterVisible;
        }
        if ((i9 & 4) != 0) {
            penType = penToolState.penType;
        }
        if ((i9 & 8) != 0) {
            i = penToolState.penSizeLevel;
        }
        if ((i9 & 16) != 0) {
            penColor = penToolState.penColor;
        }
        if ((i9 & 32) != 0) {
            i8 = penToolState.penCustomColor;
        }
        if ((i9 & 64) != 0) {
            z10 = penToolState.isShowCustomColor;
        }
        int i10 = i8;
        boolean z11 = z10;
        PenColor penColor2 = penColor;
        PenType penType2 = penType;
        return penToolState.copy(z8, z9, penType2, i, penColor2, i10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDotVisible() {
        return this.dotVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHighlighterVisible() {
        return this.highlighterVisible;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PenType getPenType() {
        return this.penType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPenSizeLevel() {
        return this.penSizeLevel;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PenColor getPenColor() {
        return this.penColor;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPenCustomColor() {
        return this.penCustomColor;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsShowCustomColor() {
        return this.isShowCustomColor;
    }

    @NotNull
    public final PenToolState copy(boolean dotVisible, boolean highlighterVisible, @NotNull PenType penType, int penSizeLevel, @NotNull PenColor penColor, int penCustomColor, boolean isShowCustomColor) {
        AbstractC5830k.m5330g(penType, "penType");
        AbstractC5830k.m5330g(penColor, "penColor");
        return new PenToolState(dotVisible, highlighterVisible, penType, penSizeLevel, penColor, penCustomColor, isShowCustomColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenToolState)) {
            return false;
        }
        PenToolState penToolState = (PenToolState) other;
        return this.dotVisible == penToolState.dotVisible && this.highlighterVisible == penToolState.highlighterVisible && AbstractC5830k.m5325b(this.penType, penToolState.penType) && this.penSizeLevel == penToolState.penSizeLevel && AbstractC5830k.m5325b(this.penColor, penToolState.penColor) && this.penCustomColor == penToolState.penCustomColor && this.isShowCustomColor == penToolState.isShowCustomColor;
    }

    public final boolean getDotVisible() {
        return this.dotVisible;
    }

    public final boolean getHighlighterVisible() {
        return this.highlighterVisible;
    }

    @NotNull
    public final PenColor getPenColor() {
        return this.penColor;
    }

    public final int getPenCustomColor() {
        return this.penCustomColor;
    }

    public final int getPenSizeLevel() {
        return this.penSizeLevel;
    }

    @NotNull
    public final PenType getPenType() {
        return this.penType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isShowCustomColor) + AbstractC0584a.m902c(this.penCustomColor, (this.penColor.hashCode() + AbstractC0584a.m902c(this.penSizeLevel, (this.penType.hashCode() + AbstractC0584a.m908i(this.highlighterVisible, Boolean.hashCode(this.dotVisible) * 31, 31)) * 31, 31)) * 31, 31);
    }

    public final boolean isShowCustomColor() {
        return this.isShowCustomColor;
    }

    @NotNull
    public String toString() {
        return "PenToolState(dotVisible=" + this.dotVisible + ", highlighterVisible=" + this.highlighterVisible + ", penType=" + this.penType + ", penSizeLevel=" + this.penSizeLevel + ", penColor=" + this.penColor + ", penCustomColor=" + this.penCustomColor + ", isShowCustomColor=" + this.isShowCustomColor + ")";
    }

    public PenToolState(boolean z8, boolean z9, @NotNull PenType penType, int i, @NotNull PenColor penColor, int i8, boolean z10) {
        AbstractC5830k.m5330g(penType, "penType");
        AbstractC5830k.m5330g(penColor, "penColor");
        this.dotVisible = z8;
        this.highlighterVisible = z9;
        this.penType = penType;
        this.penSizeLevel = i;
        this.penColor = penColor;
        this.penCustomColor = i8;
        this.isShowCustomColor = z10;
    }

    public /* synthetic */ PenToolState(boolean z8, boolean z9, PenType penType, int i, PenColor penColor, int i8, boolean z10, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? PenType.Custom.INSTANCE : penType, (i9 & 8) != 0 ? 0 : i, (i9 & 16) != 0 ? PenColor.ColorBlack.INSTANCE : penColor, (i9 & 32) != 0 ? 0 : i8, (i9 & 64) != 0 ? false : z10);
    }
}
