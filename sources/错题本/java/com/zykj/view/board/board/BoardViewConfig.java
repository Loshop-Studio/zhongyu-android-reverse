package com.zykj.view.board.board;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.ConfirmButtonType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardViewConfig;", "", "needRevoke", "", "needZoom", "needDot", "needPenHighlighter", "needGallery", "needCamera", "needText", "needGraph", "needBackgroundLine", "confirmButtonType", "Lcom/zykj/view/board/board/ConfirmButtonType;", "<init>", "(ZZZZZZZZZLcom/zykj/view/board/board/ConfirmButtonType;)V", "getNeedRevoke", "()Z", "getNeedZoom", "getNeedDot", "getNeedPenHighlighter", "getNeedGallery", "getNeedCamera", "getNeedText", "getNeedGraph", "getNeedBackgroundLine", "getConfirmButtonType", "()Lcom/zykj/view/board/board/ConfirmButtonType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class BoardViewConfig {

    @NotNull
    private final ConfirmButtonType confirmButtonType;
    private final boolean needBackgroundLine;
    private final boolean needCamera;
    private final boolean needDot;
    private final boolean needGallery;
    private final boolean needGraph;
    private final boolean needPenHighlighter;
    private final boolean needRevoke;
    private final boolean needText;
    private final boolean needZoom;

    public BoardViewConfig() {
        this(false, false, false, false, false, false, false, false, false, null, 1023, null);
    }

    public static /* synthetic */ BoardViewConfig copy$default(BoardViewConfig boardViewConfig, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, ConfirmButtonType confirmButtonType, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = boardViewConfig.needRevoke;
        }
        if ((i & 2) != 0) {
            z9 = boardViewConfig.needZoom;
        }
        if ((i & 4) != 0) {
            z10 = boardViewConfig.needDot;
        }
        if ((i & 8) != 0) {
            z11 = boardViewConfig.needPenHighlighter;
        }
        if ((i & 16) != 0) {
            z12 = boardViewConfig.needGallery;
        }
        if ((i & 32) != 0) {
            z13 = boardViewConfig.needCamera;
        }
        if ((i & 64) != 0) {
            z14 = boardViewConfig.needText;
        }
        if ((i & 128) != 0) {
            z15 = boardViewConfig.needGraph;
        }
        if ((i & 256) != 0) {
            z16 = boardViewConfig.needBackgroundLine;
        }
        if ((i & 512) != 0) {
            confirmButtonType = boardViewConfig.confirmButtonType;
        }
        boolean z17 = z16;
        ConfirmButtonType confirmButtonType2 = confirmButtonType;
        boolean z18 = z14;
        boolean z19 = z15;
        boolean z20 = z12;
        boolean z21 = z13;
        return boardViewConfig.copy(z8, z9, z10, z11, z20, z21, z18, z19, z17, confirmButtonType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNeedRevoke() {
        return this.needRevoke;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ConfirmButtonType getConfirmButtonType() {
        return this.confirmButtonType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNeedZoom() {
        return this.needZoom;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedDot() {
        return this.needDot;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getNeedPenHighlighter() {
        return this.needPenHighlighter;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getNeedGallery() {
        return this.needGallery;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNeedCamera() {
        return this.needCamera;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getNeedText() {
        return this.needText;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getNeedGraph() {
        return this.needGraph;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getNeedBackgroundLine() {
        return this.needBackgroundLine;
    }

    @NotNull
    public final BoardViewConfig copy(boolean needRevoke, boolean needZoom, boolean needDot, boolean needPenHighlighter, boolean needGallery, boolean needCamera, boolean needText, boolean needGraph, boolean needBackgroundLine, @NotNull ConfirmButtonType confirmButtonType) {
        AbstractC5830k.m5330g(confirmButtonType, "confirmButtonType");
        return new BoardViewConfig(needRevoke, needZoom, needDot, needPenHighlighter, needGallery, needCamera, needText, needGraph, needBackgroundLine, confirmButtonType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardViewConfig)) {
            return false;
        }
        BoardViewConfig boardViewConfig = (BoardViewConfig) other;
        return this.needRevoke == boardViewConfig.needRevoke && this.needZoom == boardViewConfig.needZoom && this.needDot == boardViewConfig.needDot && this.needPenHighlighter == boardViewConfig.needPenHighlighter && this.needGallery == boardViewConfig.needGallery && this.needCamera == boardViewConfig.needCamera && this.needText == boardViewConfig.needText && this.needGraph == boardViewConfig.needGraph && this.needBackgroundLine == boardViewConfig.needBackgroundLine && AbstractC5830k.m5325b(this.confirmButtonType, boardViewConfig.confirmButtonType);
    }

    @NotNull
    public final ConfirmButtonType getConfirmButtonType() {
        return this.confirmButtonType;
    }

    public final boolean getNeedBackgroundLine() {
        return this.needBackgroundLine;
    }

    public final boolean getNeedCamera() {
        return this.needCamera;
    }

    public final boolean getNeedDot() {
        return this.needDot;
    }

    public final boolean getNeedGallery() {
        return this.needGallery;
    }

    public final boolean getNeedGraph() {
        return this.needGraph;
    }

    public final boolean getNeedPenHighlighter() {
        return this.needPenHighlighter;
    }

    public final boolean getNeedRevoke() {
        return this.needRevoke;
    }

    public final boolean getNeedText() {
        return this.needText;
    }

    public final boolean getNeedZoom() {
        return this.needZoom;
    }

    public int hashCode() {
        return this.confirmButtonType.hashCode() + AbstractC0584a.m908i(this.needBackgroundLine, AbstractC0584a.m908i(this.needGraph, AbstractC0584a.m908i(this.needText, AbstractC0584a.m908i(this.needCamera, AbstractC0584a.m908i(this.needGallery, AbstractC0584a.m908i(this.needPenHighlighter, AbstractC0584a.m908i(this.needDot, AbstractC0584a.m908i(this.needZoom, Boolean.hashCode(this.needRevoke) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        boolean z8 = this.needRevoke;
        boolean z9 = this.needZoom;
        boolean z10 = this.needDot;
        boolean z11 = this.needPenHighlighter;
        boolean z12 = this.needGallery;
        boolean z13 = this.needCamera;
        boolean z14 = this.needText;
        boolean z15 = this.needGraph;
        boolean z16 = this.needBackgroundLine;
        ConfirmButtonType confirmButtonType = this.confirmButtonType;
        StringBuilder sb = new StringBuilder("BoardViewConfig(needRevoke=");
        sb.append(z8);
        sb.append(", needZoom=");
        sb.append(z9);
        sb.append(", needDot=");
        AbstractC1923c.m1058v(", needPenHighlighter=", ", needGallery=", sb, z10, z11);
        AbstractC1923c.m1058v(", needCamera=", ", needText=", sb, z12, z13);
        AbstractC1923c.m1058v(", needGraph=", ", needBackgroundLine=", sb, z14, z15);
        sb.append(z16);
        sb.append(", confirmButtonType=");
        sb.append(confirmButtonType);
        sb.append(")");
        return sb.toString();
    }

    public BoardViewConfig(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull ConfirmButtonType confirmButtonType) {
        AbstractC5830k.m5330g(confirmButtonType, "confirmButtonType");
        this.needRevoke = z8;
        this.needZoom = z9;
        this.needDot = z10;
        this.needPenHighlighter = z11;
        this.needGallery = z12;
        this.needCamera = z13;
        this.needText = z14;
        this.needGraph = z15;
        this.needBackgroundLine = z16;
        this.confirmButtonType = confirmButtonType;
    }

    public /* synthetic */ BoardViewConfig(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, ConfirmButtonType confirmButtonType, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? false : z11, (i & 16) != 0 ? false : z12, (i & 32) != 0 ? false : z13, (i & 64) != 0 ? false : z14, (i & 128) != 0 ? false : z15, (i & 256) != 0 ? false : z16, (i & 512) != 0 ? ConfirmButtonType.Null.INSTANCE : confirmButtonType);
    }
}
