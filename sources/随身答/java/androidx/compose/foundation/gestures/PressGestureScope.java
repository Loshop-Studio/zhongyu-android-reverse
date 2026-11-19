package androidx.compose.foundation.gestures;

import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m13413d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m17871roundToPxR2X_6o(PressGestureScope pressGestureScope, long j9) {
            return PressGestureScope.super.mo17758roundToPxR2X_6o(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m17872roundToPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17759roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m17873toDpGaN1DYA(PressGestureScope pressGestureScope, long j9) {
            return PressGestureScope.super.mo17760toDpGaN1DYA(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m17874toDpu2uoSUM(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17761toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m17876toDpSizekrfVVM(PressGestureScope pressGestureScope, long j9) {
            return PressGestureScope.super.mo17763toDpSizekrfVVM(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m17877toPxR2X_6o(PressGestureScope pressGestureScope, long j9) {
            return PressGestureScope.super.mo17764toPxR2X_6o(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m17878toPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17765toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m17879toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j9) {
            return PressGestureScope.super.mo17766toSizeXkaWNTQ(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m17880toSp0xMU5do(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17767toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m17881toSpkPz2Gy4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17768toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m17875toDpu2uoSUM(PressGestureScope pressGestureScope, int i9) {
            return PressGestureScope.super.mo17762toDpu2uoSUM(i9);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m17882toSpkPz2Gy4(PressGestureScope pressGestureScope, int i9) {
            return PressGestureScope.super.mo17769toSpkPz2Gy4(i9);
        }
    }

    Object awaitRelease(Continuation<? super Unit> continuation);

    Object tryAwaitRelease(Continuation<? super Boolean> continuation);
}
