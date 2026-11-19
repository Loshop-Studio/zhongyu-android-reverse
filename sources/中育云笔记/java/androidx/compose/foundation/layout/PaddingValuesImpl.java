package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;

    /* renamed from: top, reason: collision with root package name */
    private final float f28513top;

    public /* synthetic */ PaddingValuesImpl(float f10, float f11, float f12, float f13, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m27475getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m27476getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m27477getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m27478getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo27407calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo27408calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo27409calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo27410calculateTopPaddingD9Ej5fM() {
        return this.f28513top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return C3186Dp.m33506equalsimpl0(this.start, paddingValuesImpl.start) && C3186Dp.m33506equalsimpl0(this.f28513top, paddingValuesImpl.f28513top) && C3186Dp.m33506equalsimpl0(this.end, paddingValuesImpl.end) && C3186Dp.m33506equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m27479getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m27480getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m27481getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m27482getTopD9Ej5fM() {
        return this.f28513top;
    }

    public int hashCode() {
        return (((((C3186Dp.m33507hashCodeimpl(this.start) * 31) + C3186Dp.m33507hashCodeimpl(this.f28513top)) * 31) + C3186Dp.m33507hashCodeimpl(this.end)) * 31) + C3186Dp.m33507hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C3186Dp.m33512toStringimpl(this.start)) + ", top=" + ((Object) C3186Dp.m33512toStringimpl(this.f28513top)) + ", end=" + ((Object) C3186Dp.m33512toStringimpl(this.end)) + ", bottom=" + ((Object) C3186Dp.m33512toStringimpl(this.bottom)) + ')';
    }

    private PaddingValuesImpl(float f10, float f11, float f12, float f13) {
        this.start = f10;
        this.f28513top = f11;
        this.end = f12;
        this.bottom = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    public /* synthetic */ PaddingValuesImpl(float f10, float f11, float f12, float f13, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.m33501constructorimpl(0) : f10, (i10 & 2) != 0 ? C3186Dp.m33501constructorimpl(0) : f11, (i10 & 4) != 0 ? C3186Dp.m33501constructorimpl(0) : f12, (i10 & 8) != 0 ? C3186Dp.m33501constructorimpl(0) : f13, null);
    }
}
