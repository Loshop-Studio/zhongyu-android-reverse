package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

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
        private final float f21444top;

        public /* synthetic */ Absolute(float f10, float f11, float f12, float f13, AbstractC9126n abstractC9126n) {
            this(f10, f11, f12, f13);
        }

        @Stable
        /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m20869getBottomD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m20870getLeftD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m20871getRightD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m20872getTopD9Ej5fM$annotations() {
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo20805calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateLeftPadding-u2uoSUM */
        public float mo20806calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo20807calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo20808calculateTopPaddingD9Ej5fM() {
            return this.f21444top;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return C3156Dp.m26904equalsimpl0(this.left, absolute.left) && C3156Dp.m26904equalsimpl0(this.f21444top, absolute.f21444top) && C3156Dp.m26904equalsimpl0(this.right, absolute.right) && C3156Dp.m26904equalsimpl0(this.bottom, absolute.bottom);
        }

        public int hashCode() {
            return (((((C3156Dp.m26905hashCodeimpl(this.left) * 31) + C3156Dp.m26905hashCodeimpl(this.f21444top)) * 31) + C3156Dp.m26905hashCodeimpl(this.right)) * 31) + C3156Dp.m26905hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) C3156Dp.m26910toStringimpl(this.left)) + ", top=" + ((Object) C3156Dp.m26910toStringimpl(this.f21444top)) + ", right=" + ((Object) C3156Dp.m26910toStringimpl(this.right)) + ", bottom=" + ((Object) C3156Dp.m26910toStringimpl(this.bottom)) + ')';
        }

        private Absolute(float f10, float f11, float f12, float f13) {
            this.left = f10;
            this.f21444top = f11;
            this.right = f12;
            this.bottom = f13;
            if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
            }
        }

        public /* synthetic */ Absolute(float f10, float f11, float f12, float f13, int i10, AbstractC9126n abstractC9126n) {
            this((i10 & 1) != 0 ? C3156Dp.m26899constructorimpl(0) : f10, (i10 & 2) != 0 ? C3156Dp.m26899constructorimpl(0) : f11, (i10 & 4) != 0 ? C3156Dp.m26899constructorimpl(0) : f12, (i10 & 8) != 0 ? C3156Dp.m26899constructorimpl(0) : f13, null);
        }
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo20805calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo20806calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo20807calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo20808calculateTopPaddingD9Ej5fM();
}
