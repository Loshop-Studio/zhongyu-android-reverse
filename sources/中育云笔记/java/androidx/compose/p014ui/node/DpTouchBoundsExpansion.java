package androidx.compose.p014ui.node;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;

    /* renamed from: top, reason: collision with root package name */
    private final float f28517top;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m32393Absolutea9UjIt4$default(Companion companion, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = C3186Dp.m33501constructorimpl(0);
            }
            if ((i10 & 2) != 0) {
                f11 = C3186Dp.m33501constructorimpl(0);
            }
            if ((i10 & 4) != 0) {
                f12 = C3186Dp.m33501constructorimpl(0);
            }
            if ((i10 & 8) != 0) {
                f13 = C3186Dp.m33501constructorimpl(0);
            }
            return companion.m32394Absolutea9UjIt4(f10, f11, f12, f13);
        }

        /* renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m32394Absolutea9UjIt4(float f10, float f11, float f12, float f13) {
            return new DpTouchBoundsExpansion(f10, f11, f12, f13, false, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f10, float f11, float f12, float f13, boolean z10, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13, z10);
    }

    /* renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m32382copylDy3nrA$default(DpTouchBoundsExpansion dpTouchBoundsExpansion, float f10, float f11, float f12, float f13, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = dpTouchBoundsExpansion.start;
        }
        if ((i10 & 2) != 0) {
            f11 = dpTouchBoundsExpansion.f28517top;
        }
        if ((i10 & 4) != 0) {
            f12 = dpTouchBoundsExpansion.end;
        }
        if ((i10 & 8) != 0) {
            f13 = dpTouchBoundsExpansion.bottom;
        }
        if ((i10 & 16) != 0) {
            z10 = dpTouchBoundsExpansion.isLayoutDirectionAware;
        }
        boolean z11 = z10;
        float f14 = f12;
        return dpTouchBoundsExpansion.m32387copylDy3nrA(f10, f11, f14, f13, z11);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m32383component1D9Ej5fM() {
        return this.start;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m32384component2D9Ej5fM() {
        return this.f28517top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m32385component3D9Ej5fM() {
        return this.end;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m32386component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m32387copylDy3nrA(float f10, float f11, float f12, float f13, boolean z10) {
        return new DpTouchBoundsExpansion(f10, f11, f12, f13, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return C3186Dp.m33506equalsimpl0(this.start, dpTouchBoundsExpansion.start) && C3186Dp.m33506equalsimpl0(this.f28517top, dpTouchBoundsExpansion.f28517top) && C3186Dp.m33506equalsimpl0(this.end, dpTouchBoundsExpansion.end) && C3186Dp.m33506equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m32388getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m32389getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m32390getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m32391getTopD9Ej5fM() {
        return this.f28517top;
    }

    public int hashCode() {
        return (((((((C3186Dp.m33507hashCodeimpl(this.start) * 31) + C3186Dp.m33507hashCodeimpl(this.f28517top)) * 31) + C3186Dp.m33507hashCodeimpl(this.end)) * 31) + C3186Dp.m33507hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m32392roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        return TouchBoundsExpansion.m32592constructorimpl(TouchBoundsExpansion.Companion.pack$ui_release(density.mo27093roundToPx0680j_4(this.start), density.mo27093roundToPx0680j_4(this.f28517top), density.mo27093roundToPx0680j_4(this.end), density.mo27093roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C3186Dp.m33512toStringimpl(this.start)) + ", top=" + ((Object) C3186Dp.m33512toStringimpl(this.f28517top)) + ", end=" + ((Object) C3186Dp.m33512toStringimpl(this.end)) + ", bottom=" + ((Object) C3186Dp.m33512toStringimpl(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float f10, float f11, float f12, float f13, boolean z10) {
        this.start = f10;
        this.f28517top = f11;
        this.end = f12;
        this.bottom = f13;
        this.isLayoutDirectionAware = z10;
        if (!(f10 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (!(f11 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (!(f12 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }
}
