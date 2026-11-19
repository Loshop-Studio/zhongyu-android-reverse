package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;

    /* renamed from: top, reason: collision with root package name */
    private final float f21453top;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DpRect(float f10, float f11, float f12, float f13, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m26971copya9UjIt4$default(DpRect dpRect, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = dpRect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = dpRect.f21453top;
        }
        if ((i10 & 4) != 0) {
            f12 = dpRect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = dpRect.bottom;
        }
        return dpRect.m26980copya9UjIt4(f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26972getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26973getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26974getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26975getTopD9Ej5fM$annotations() {
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m26976component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m26977component2D9Ej5fM() {
        return this.f21453top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m26978component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m26979component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m26980copya9UjIt4(float f10, float f11, float f12, float f13) {
        return new DpRect(f10, f11, f12, f13, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return C3156Dp.m26904equalsimpl0(this.left, dpRect.left) && C3156Dp.m26904equalsimpl0(this.f21453top, dpRect.f21453top) && C3156Dp.m26904equalsimpl0(this.right, dpRect.right) && C3156Dp.m26904equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m26981getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m26982getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m26983getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m26984getTopD9Ej5fM() {
        return this.f21453top;
    }

    public int hashCode() {
        return (((((C3156Dp.m26905hashCodeimpl(this.left) * 31) + C3156Dp.m26905hashCodeimpl(this.f21453top)) * 31) + C3156Dp.m26905hashCodeimpl(this.right)) * 31) + C3156Dp.m26905hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) C3156Dp.m26910toStringimpl(this.left)) + ", top=" + ((Object) C3156Dp.m26910toStringimpl(this.f21453top)) + ", right=" + ((Object) C3156Dp.m26910toStringimpl(this.right)) + ", bottom=" + ((Object) C3156Dp.m26910toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j10, long j11, AbstractC9126n abstractC9126n) {
        this(j10, j11);
    }

    private DpRect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.f21453top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    private DpRect(long j10, long j11) {
        this(DpOffset.m26960getXD9Ej5fM(j10), DpOffset.m26962getYD9Ej5fM(j10), C3156Dp.m26899constructorimpl(DpOffset.m26960getXD9Ej5fM(j10) + DpSize.m26997getWidthD9Ej5fM(j11)), C3156Dp.m26899constructorimpl(DpOffset.m26962getYD9Ej5fM(j10) + DpSize.m26995getHeightD9Ej5fM(j11)), null);
    }
}
