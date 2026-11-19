package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Stable
/* loaded from: classes.dex */
public interface PaddingValues {

    @Immutable
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;

        /* renamed from: top, reason: collision with root package name */
        private final float f28512top;

        public /* synthetic */ Absolute(float f10, float f11, float f12, float f13, AbstractC9972n abstractC9972n) {
            this(f10, f11, f12, f13);
        }

        @Stable
        /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m27471getBottomD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m27472getLeftD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m27473getRightD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m27474getTopD9Ej5fM$annotations() {
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo27407calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateLeftPadding-u2uoSUM */
        public float mo27408calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo27409calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo27410calculateTopPaddingD9Ej5fM() {
            return this.f28512top;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return C3186Dp.m33506equalsimpl0(this.left, absolute.left) && C3186Dp.m33506equalsimpl0(this.f28512top, absolute.f28512top) && C3186Dp.m33506equalsimpl0(this.right, absolute.right) && C3186Dp.m33506equalsimpl0(this.bottom, absolute.bottom);
        }

        public int hashCode() {
            return (((((C3186Dp.m33507hashCodeimpl(this.left) * 31) + C3186Dp.m33507hashCodeimpl(this.f28512top)) * 31) + C3186Dp.m33507hashCodeimpl(this.right)) * 31) + C3186Dp.m33507hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) C3186Dp.m33512toStringimpl(this.left)) + ", top=" + ((Object) C3186Dp.m33512toStringimpl(this.f28512top)) + ", right=" + ((Object) C3186Dp.m33512toStringimpl(this.right)) + ", bottom=" + ((Object) C3186Dp.m33512toStringimpl(this.bottom)) + ')';
        }

        private Absolute(float f10, float f11, float f12, float f13) {
            this.left = f10;
            this.f28512top = f11;
            this.right = f12;
            this.bottom = f13;
            if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
            }
        }

        public /* synthetic */ Absolute(float f10, float f11, float f12, float f13, int i10, AbstractC9972n abstractC9972n) {
            this((i10 & 1) != 0 ? C3186Dp.m33501constructorimpl(0) : f10, (i10 & 2) != 0 ? C3186Dp.m33501constructorimpl(0) : f11, (i10 & 4) != 0 ? C3186Dp.m33501constructorimpl(0) : f12, (i10 & 8) != 0 ? C3186Dp.m33501constructorimpl(0) : f13, null);
        }
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo27407calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo27408calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo27409calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo27410calculateTopPaddingD9Ej5fM();
}
