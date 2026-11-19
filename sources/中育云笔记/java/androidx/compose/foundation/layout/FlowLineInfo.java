package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    public /* synthetic */ FlowLineInfo(int i10, int i11, float f10, float f11, AbstractC9972n abstractC9972n) {
        this(i10, i11, f10, f11);
    }

    public final int getLineIndex$foundation_layout_release() {
        return this.lineIndex;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m27389getMaxCrossAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m27390getMaxMainAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxMainAxisSize;
    }

    public final int getPositionInLine$foundation_layout_release() {
        return this.positionInLine;
    }

    public final void setLineIndex$foundation_layout_release(int i10) {
        this.lineIndex = i10;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m27391setMaxCrossAxisSize0680j_4$foundation_layout_release(float f10) {
        this.maxCrossAxisSize = f10;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m27392setMaxMainAxisSize0680j_4$foundation_layout_release(float f10) {
        this.maxMainAxisSize = f10;
    }

    public final void setPositionInLine$foundation_layout_release(int i10) {
        this.positionInLine = i10;
    }

    /* renamed from: update-4j6BHR0$foundation_layout_release, reason: not valid java name */
    public final void m27393update4j6BHR0$foundation_layout_release(int i10, int i11, float f10, float f11) {
        this.lineIndex = i10;
        this.positionInLine = i11;
        this.maxMainAxisSize = f10;
        this.maxCrossAxisSize = f11;
    }

    private FlowLineInfo(int i10, int i11, float f10, float f11) {
        this.lineIndex = i10;
        this.positionInLine = i11;
        this.maxMainAxisSize = f10;
        this.maxCrossAxisSize = f11;
    }

    public /* synthetic */ FlowLineInfo(int i10, int i11, float f10, float f11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C3186Dp.m33501constructorimpl(0) : f10, (i12 & 8) != 0 ? C3186Dp.m33501constructorimpl(0) : f11, null);
    }
}
