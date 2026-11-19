package com.zykj.view.board.board;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.utils.ZoomPointSolution;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006$"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardSketchConfig;", "", "zoomPointSolution", "Lcom/zykj/view/utils/ZoomPointSolution;", "needCommitWithDeleteCache", "", "needTranslate", "defaultMoveRange", "", "maxImageCount", "isThumbnailContent", "zoomFiveLevel", "<init>", "(Lcom/zykj/view/utils/ZoomPointSolution;ZZIIZZ)V", "getZoomPointSolution", "()Lcom/zykj/view/utils/ZoomPointSolution;", "getNeedCommitWithDeleteCache", "()Z", "getNeedTranslate", "getDefaultMoveRange", "()I", "getMaxImageCount", "getZoomFiveLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class BoardSketchConfig {
    private final int defaultMoveRange;
    private final boolean isThumbnailContent;
    private final int maxImageCount;
    private final boolean needCommitWithDeleteCache;
    private final boolean needTranslate;
    private final boolean zoomFiveLevel;

    @NotNull
    private final ZoomPointSolution zoomPointSolution;

    public BoardSketchConfig() {
        this(null, false, false, 0, 0, false, false, 127, null);
    }

    public static /* synthetic */ BoardSketchConfig copy$default(BoardSketchConfig boardSketchConfig, ZoomPointSolution zoomPointSolution, boolean z8, boolean z9, int i, int i8, boolean z10, boolean z11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            zoomPointSolution = boardSketchConfig.zoomPointSolution;
        }
        if ((i9 & 2) != 0) {
            z8 = boardSketchConfig.needCommitWithDeleteCache;
        }
        if ((i9 & 4) != 0) {
            z9 = boardSketchConfig.needTranslate;
        }
        if ((i9 & 8) != 0) {
            i = boardSketchConfig.defaultMoveRange;
        }
        if ((i9 & 16) != 0) {
            i8 = boardSketchConfig.maxImageCount;
        }
        if ((i9 & 32) != 0) {
            z10 = boardSketchConfig.isThumbnailContent;
        }
        if ((i9 & 64) != 0) {
            z11 = boardSketchConfig.zoomFiveLevel;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        int i10 = i8;
        boolean z14 = z9;
        return boardSketchConfig.copy(zoomPointSolution, z8, z14, i, i10, z12, z13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ZoomPointSolution getZoomPointSolution() {
        return this.zoomPointSolution;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNeedCommitWithDeleteCache() {
        return this.needCommitWithDeleteCache;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedTranslate() {
        return this.needTranslate;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDefaultMoveRange() {
        return this.defaultMoveRange;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxImageCount() {
        return this.maxImageCount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsThumbnailContent() {
        return this.isThumbnailContent;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getZoomFiveLevel() {
        return this.zoomFiveLevel;
    }

    @NotNull
    public final BoardSketchConfig copy(@NotNull ZoomPointSolution zoomPointSolution, boolean needCommitWithDeleteCache, boolean needTranslate, int defaultMoveRange, int maxImageCount, boolean isThumbnailContent, boolean zoomFiveLevel) {
        AbstractC5830k.m5330g(zoomPointSolution, "zoomPointSolution");
        return new BoardSketchConfig(zoomPointSolution, needCommitWithDeleteCache, needTranslate, defaultMoveRange, maxImageCount, isThumbnailContent, zoomFiveLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardSketchConfig)) {
            return false;
        }
        BoardSketchConfig boardSketchConfig = (BoardSketchConfig) other;
        return this.zoomPointSolution == boardSketchConfig.zoomPointSolution && this.needCommitWithDeleteCache == boardSketchConfig.needCommitWithDeleteCache && this.needTranslate == boardSketchConfig.needTranslate && this.defaultMoveRange == boardSketchConfig.defaultMoveRange && this.maxImageCount == boardSketchConfig.maxImageCount && this.isThumbnailContent == boardSketchConfig.isThumbnailContent && this.zoomFiveLevel == boardSketchConfig.zoomFiveLevel;
    }

    public final int getDefaultMoveRange() {
        return this.defaultMoveRange;
    }

    public final int getMaxImageCount() {
        return this.maxImageCount;
    }

    public final boolean getNeedCommitWithDeleteCache() {
        return this.needCommitWithDeleteCache;
    }

    public final boolean getNeedTranslate() {
        return this.needTranslate;
    }

    public final boolean getZoomFiveLevel() {
        return this.zoomFiveLevel;
    }

    @NotNull
    public final ZoomPointSolution getZoomPointSolution() {
        return this.zoomPointSolution;
    }

    public int hashCode() {
        return Boolean.hashCode(this.zoomFiveLevel) + AbstractC0584a.m908i(this.isThumbnailContent, AbstractC0584a.m902c(this.maxImageCount, AbstractC0584a.m902c(this.defaultMoveRange, AbstractC0584a.m908i(this.needTranslate, AbstractC0584a.m908i(this.needCommitWithDeleteCache, this.zoomPointSolution.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final boolean isThumbnailContent() {
        return this.isThumbnailContent;
    }

    @NotNull
    public String toString() {
        return "BoardSketchConfig(zoomPointSolution=" + this.zoomPointSolution + ", needCommitWithDeleteCache=" + this.needCommitWithDeleteCache + ", needTranslate=" + this.needTranslate + ", defaultMoveRange=" + this.defaultMoveRange + ", maxImageCount=" + this.maxImageCount + ", isThumbnailContent=" + this.isThumbnailContent + ", zoomFiveLevel=" + this.zoomFiveLevel + ")";
    }

    public BoardSketchConfig(@NotNull ZoomPointSolution zoomPointSolution, boolean z8, boolean z9, int i, int i8, boolean z10, boolean z11) {
        AbstractC5830k.m5330g(zoomPointSolution, "zoomPointSolution");
        this.zoomPointSolution = zoomPointSolution;
        this.needCommitWithDeleteCache = z8;
        this.needTranslate = z9;
        this.defaultMoveRange = i;
        this.maxImageCount = i8;
        this.isThumbnailContent = z10;
        this.zoomFiveLevel = z11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ BoardSketchConfig(com.zykj.view.utils.ZoomPointSolution r3, boolean r4, boolean r5, int r6, int r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.AbstractC5824e r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.zykj.view.utils.ZoomPointSolution r3 = com.zykj.view.utils.ZoomPointSolution.CENTER_TOP
        L6:
            r11 = r10 & 2
            r0 = 1
            if (r11 == 0) goto Lc
            r4 = r0
        Lc:
            r11 = r10 & 4
            r1 = 0
            if (r11 == 0) goto L12
            r5 = r1
        L12:
            r11 = r10 & 8
            if (r11 == 0) goto L17
            r6 = r0
        L17:
            r11 = r10 & 16
            if (r11 == 0) goto L1c
            r7 = 3
        L1c:
            r11 = r10 & 32
            if (r11 == 0) goto L21
            r8 = r1
        L21:
            r10 = r10 & 64
            if (r10 == 0) goto L2e
            r11 = r1
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L36
        L2e:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L36:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardSketchConfig.<init>(com.zykj.view.utils.ZoomPointSolution, boolean, boolean, int, int, boolean, boolean, int, kotlin.jvm.internal.e):void"); // DEX body: android/错题本/smali_classes3/com/zykj/view/board/board/BoardSketchConfig.smali:147
    }
}
