package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.EraserType;
import com.zykj.view.board.board.ExpandStatus;
import com.zykj.view.board.board.MainToolType;
import com.zykj.view.board.board.MinorToolType;
import com.zykj.view.board.board.PenColor;
import com.zykj.view.board.simple.SimplePenSize;
import com.zykj.view.board.simple.SimplePenType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleUIState;", "", "isTouchable", "", "mainToolType", "Lcom/zykj/view/board/board/MainToolType;", "minorToolType", "Lcom/zykj/view/board/board/MinorToolType;", "penType", "Lcom/zykj/view/board/simple/SimplePenType;", "penSize", "Lcom/zykj/view/board/simple/SimplePenSize;", "penColor", "Lcom/zykj/view/board/board/PenColor;", "eraserType", "Lcom/zykj/view/board/board/EraserType;", "expandStatus", "Lcom/zykj/view/board/board/ExpandStatus;", "<init>", "(ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;)V", "()Z", "getMainToolType", "()Lcom/zykj/view/board/board/MainToolType;", "getMinorToolType", "()Lcom/zykj/view/board/board/MinorToolType;", "getPenType", "()Lcom/zykj/view/board/simple/SimplePenType;", "getPenSize", "()Lcom/zykj/view/board/simple/SimplePenSize;", "getPenColor", "()Lcom/zykj/view/board/board/PenColor;", "getEraserType", "()Lcom/zykj/view/board/board/EraserType;", "getExpandStatus", "()Lcom/zykj/view/board/board/ExpandStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SimpleUIState {

    @NotNull
    private final EraserType eraserType;

    @NotNull
    private final ExpandStatus expandStatus;
    private final boolean isTouchable;

    @NotNull
    private final MainToolType mainToolType;

    @NotNull
    private final MinorToolType minorToolType;

    @NotNull
    private final PenColor penColor;

    @NotNull
    private final SimplePenSize penSize;

    @NotNull
    private final SimplePenType penType;

    public SimpleUIState() {
        this(false, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ SimpleUIState copy$default(SimpleUIState simpleUIState, boolean z8, MainToolType mainToolType, MinorToolType minorToolType, SimplePenType simplePenType, SimplePenSize simplePenSize, PenColor penColor, EraserType eraserType, ExpandStatus expandStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = simpleUIState.isTouchable;
        }
        if ((i & 2) != 0) {
            mainToolType = simpleUIState.mainToolType;
        }
        if ((i & 4) != 0) {
            minorToolType = simpleUIState.minorToolType;
        }
        if ((i & 8) != 0) {
            simplePenType = simpleUIState.penType;
        }
        if ((i & 16) != 0) {
            simplePenSize = simpleUIState.penSize;
        }
        if ((i & 32) != 0) {
            penColor = simpleUIState.penColor;
        }
        if ((i & 64) != 0) {
            eraserType = simpleUIState.eraserType;
        }
        if ((i & 128) != 0) {
            expandStatus = simpleUIState.expandStatus;
        }
        EraserType eraserType2 = eraserType;
        ExpandStatus expandStatus2 = expandStatus;
        SimplePenSize simplePenSize2 = simplePenSize;
        PenColor penColor2 = penColor;
        return simpleUIState.copy(z8, mainToolType, minorToolType, simplePenType, simplePenSize2, penColor2, eraserType2, expandStatus2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTouchable() {
        return this.isTouchable;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MainToolType getMainToolType() {
        return this.mainToolType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MinorToolType getMinorToolType() {
        return this.minorToolType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SimplePenType getPenType() {
        return this.penType;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SimplePenSize getPenSize() {
        return this.penSize;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PenColor getPenColor() {
        return this.penColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final EraserType getEraserType() {
        return this.eraserType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final ExpandStatus getExpandStatus() {
        return this.expandStatus;
    }

    @NotNull
    public final SimpleUIState copy(boolean isTouchable, @NotNull MainToolType mainToolType, @NotNull MinorToolType minorToolType, @NotNull SimplePenType penType, @NotNull SimplePenSize penSize, @NotNull PenColor penColor, @NotNull EraserType eraserType, @NotNull ExpandStatus expandStatus) {
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        AbstractC5830k.m5330g(minorToolType, "minorToolType");
        AbstractC5830k.m5330g(penType, "penType");
        AbstractC5830k.m5330g(penSize, "penSize");
        AbstractC5830k.m5330g(penColor, "penColor");
        AbstractC5830k.m5330g(eraserType, "eraserType");
        AbstractC5830k.m5330g(expandStatus, "expandStatus");
        return new SimpleUIState(isTouchable, mainToolType, minorToolType, penType, penSize, penColor, eraserType, expandStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleUIState)) {
            return false;
        }
        SimpleUIState simpleUIState = (SimpleUIState) other;
        return this.isTouchable == simpleUIState.isTouchable && AbstractC5830k.m5325b(this.mainToolType, simpleUIState.mainToolType) && AbstractC5830k.m5325b(this.minorToolType, simpleUIState.minorToolType) && AbstractC5830k.m5325b(this.penType, simpleUIState.penType) && AbstractC5830k.m5325b(this.penSize, simpleUIState.penSize) && AbstractC5830k.m5325b(this.penColor, simpleUIState.penColor) && AbstractC5830k.m5325b(this.eraserType, simpleUIState.eraserType) && AbstractC5830k.m5325b(this.expandStatus, simpleUIState.expandStatus);
    }

    @NotNull
    public final EraserType getEraserType() {
        return this.eraserType;
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

    @NotNull
    public final PenColor getPenColor() {
        return this.penColor;
    }

    @NotNull
    public final SimplePenSize getPenSize() {
        return this.penSize;
    }

    @NotNull
    public final SimplePenType getPenType() {
        return this.penType;
    }

    public int hashCode() {
        return this.expandStatus.hashCode() + ((this.eraserType.hashCode() + ((this.penColor.hashCode() + ((this.penSize.hashCode() + ((this.penType.hashCode() + ((this.minorToolType.hashCode() + ((this.mainToolType.hashCode() + (Boolean.hashCode(this.isTouchable) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isTouchable() {
        return this.isTouchable;
    }

    @NotNull
    public String toString() {
        return "SimpleUIState(isTouchable=" + this.isTouchable + ", mainToolType=" + this.mainToolType + ", minorToolType=" + this.minorToolType + ", penType=" + this.penType + ", penSize=" + this.penSize + ", penColor=" + this.penColor + ", eraserType=" + this.eraserType + ", expandStatus=" + this.expandStatus + ")";
    }

    public SimpleUIState(boolean z8, @NotNull MainToolType mainToolType, @NotNull MinorToolType minorToolType, @NotNull SimplePenType penType, @NotNull SimplePenSize penSize, @NotNull PenColor penColor, @NotNull EraserType eraserType, @NotNull ExpandStatus expandStatus) {
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        AbstractC5830k.m5330g(minorToolType, "minorToolType");
        AbstractC5830k.m5330g(penType, "penType");
        AbstractC5830k.m5330g(penSize, "penSize");
        AbstractC5830k.m5330g(penColor, "penColor");
        AbstractC5830k.m5330g(eraserType, "eraserType");
        AbstractC5830k.m5330g(expandStatus, "expandStatus");
        this.isTouchable = z8;
        this.mainToolType = mainToolType;
        this.minorToolType = minorToolType;
        this.penType = penType;
        this.penSize = penSize;
        this.penColor = penColor;
        this.eraserType = eraserType;
        this.expandStatus = expandStatus;
    }

    public /* synthetic */ SimpleUIState(boolean z8, MainToolType mainToolType, MinorToolType minorToolType, SimplePenType simplePenType, SimplePenSize simplePenSize, PenColor penColor, EraserType eraserType, ExpandStatus expandStatus, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? MainToolType.Pen.INSTANCE : mainToolType, (i & 4) != 0 ? MinorToolType.Null.INSTANCE : minorToolType, (i & 8) != 0 ? SimplePenType.Custom.INSTANCE : simplePenType, (i & 16) != 0 ? SimplePenSize.Little.INSTANCE : simplePenSize, (i & 32) != 0 ? PenColor.ColorBlack.INSTANCE : penColor, (i & 64) != 0 ? EraserType.Little.INSTANCE : eraserType, (i & 128) != 0 ? ExpandStatus.Expanded.INSTANCE : expandStatus);
    }
}
