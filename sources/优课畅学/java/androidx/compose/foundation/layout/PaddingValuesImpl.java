package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;

    /* renamed from: top, reason: collision with root package name */
    private final float f21445top;

    public /* synthetic */ PaddingValuesImpl(float f10, float f11, float f12, float f13, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m20873getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m20874getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m20875getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m20876getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo20805calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo20806calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo20807calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo20808calculateTopPaddingD9Ej5fM() {
        return this.f21445top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return C3156Dp.m26904equalsimpl0(this.start, paddingValuesImpl.start) && C3156Dp.m26904equalsimpl0(this.f21445top, paddingValuesImpl.f21445top) && C3156Dp.m26904equalsimpl0(this.end, paddingValuesImpl.end) && C3156Dp.m26904equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m20877getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m20878getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m20879getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m20880getTopD9Ej5fM() {
        return this.f21445top;
    }

    public int hashCode() {
        return (((((C3156Dp.m26905hashCodeimpl(this.start) * 31) + C3156Dp.m26905hashCodeimpl(this.f21445top)) * 31) + C3156Dp.m26905hashCodeimpl(this.end)) * 31) + C3156Dp.m26905hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C3156Dp.m26910toStringimpl(this.start)) + ", top=" + ((Object) C3156Dp.m26910toStringimpl(this.f21445top)) + ", end=" + ((Object) C3156Dp.m26910toStringimpl(this.end)) + ", bottom=" + ((Object) C3156Dp.m26910toStringimpl(this.bottom)) + ')';
    }

    private PaddingValuesImpl(float f10, float f11, float f12, float f13) {
        this.start = f10;
        this.f21445top = f11;
        this.end = f12;
        this.bottom = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    public /* synthetic */ PaddingValuesImpl(float f10, float f11, float f12, float f13, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C3156Dp.m26899constructorimpl(0) : f10, (i10 & 2) != 0 ? C3156Dp.m26899constructorimpl(0) : f11, (i10 & 4) != 0 ? C3156Dp.m26899constructorimpl(0) : f12, (i10 & 8) != 0 ? C3156Dp.m26899constructorimpl(0) : f13, null);
    }
}
