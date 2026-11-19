package androidx.compose.foundation.gestures;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.unit.AbstractC1702a;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m5175d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7187roundToPxR2X_6o(PressGestureScope pressGestureScope, long j4) {
            return AbstractC1702a.m906a(pressGestureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7188roundToPx0680j_4(PressGestureScope pressGestureScope, float f4) {
            return AbstractC1702a.m907b(pressGestureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7189toDpGaN1DYA(PressGestureScope pressGestureScope, long j4) {
            return AbstractC1702a.m908c(pressGestureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7190toDpu2uoSUM(PressGestureScope pressGestureScope, float f4) {
            return AbstractC1702a.m909d(pressGestureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7192toDpSizekrfVVM(PressGestureScope pressGestureScope, long j4) {
            return AbstractC1702a.m911f(pressGestureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7193toPxR2X_6o(PressGestureScope pressGestureScope, long j4) {
            return AbstractC1702a.m912g(pressGestureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7194toPx0680j_4(PressGestureScope pressGestureScope, float f4) {
            return AbstractC1702a.m913h(pressGestureScope, f4);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return AbstractC1702a.m914i(pressGestureScope, receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7195toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j4) {
            return AbstractC1702a.m915j(pressGestureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7196toSp0xMU5do(PressGestureScope pressGestureScope, float f4) {
            return AbstractC1702a.m916k(pressGestureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7197toSpkPz2Gy4(PressGestureScope pressGestureScope, float f4) {
            return AbstractC1702a.m917l(pressGestureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7191toDpu2uoSUM(PressGestureScope pressGestureScope, int i4) {
            return AbstractC1702a.m910e(pressGestureScope, i4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7198toSpkPz2Gy4(PressGestureScope pressGestureScope, int i4) {
            return AbstractC1702a.m918m(pressGestureScope, i4);
        }
    }

    Object awaitRelease(Continuation<? super Unit> continuation);

    Object tryAwaitRelease(Continuation<? super Boolean> continuation);
}
