package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;

    /* renamed from: top, reason: collision with root package name */
    private final float f28521top;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DpRect(float f10, float f11, float f12, float f13, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m33573copya9UjIt4$default(DpRect dpRect, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = dpRect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = dpRect.f28521top;
        }
        if ((i10 & 4) != 0) {
            f12 = dpRect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = dpRect.bottom;
        }
        return dpRect.m33582copya9UjIt4(f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33574getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33575getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33576getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33577getTopD9Ej5fM$annotations() {
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m33578component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m33579component2D9Ej5fM() {
        return this.f28521top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m33580component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m33581component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m33582copya9UjIt4(float f10, float f11, float f12, float f13) {
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
        return C3186Dp.m33506equalsimpl0(this.left, dpRect.left) && C3186Dp.m33506equalsimpl0(this.f28521top, dpRect.f28521top) && C3186Dp.m33506equalsimpl0(this.right, dpRect.right) && C3186Dp.m33506equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m33583getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m33584getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m33585getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m33586getTopD9Ej5fM() {
        return this.f28521top;
    }

    public int hashCode() {
        return (((((C3186Dp.m33507hashCodeimpl(this.left) * 31) + C3186Dp.m33507hashCodeimpl(this.f28521top)) * 31) + C3186Dp.m33507hashCodeimpl(this.right)) * 31) + C3186Dp.m33507hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) C3186Dp.m33512toStringimpl(this.left)) + ", top=" + ((Object) C3186Dp.m33512toStringimpl(this.f28521top)) + ", right=" + ((Object) C3186Dp.m33512toStringimpl(this.right)) + ", bottom=" + ((Object) C3186Dp.m33512toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j10, long j11, AbstractC9972n abstractC9972n) {
        this(j10, j11);
    }

    private DpRect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.f28521top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    private DpRect(long j10, long j11) {
        this(DpOffset.m33562getXD9Ej5fM(j10), DpOffset.m33564getYD9Ej5fM(j10), C3186Dp.m33501constructorimpl(DpOffset.m33562getXD9Ej5fM(j10) + DpSize.m33599getWidthD9Ej5fM(j11)), C3186Dp.m33501constructorimpl(DpOffset.m33564getYD9Ej5fM(j10) + DpSize.m33597getHeightD9Ej5fM(j11)), null);
    }
}
