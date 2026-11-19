package androidx.compose.foundation.gestures;

import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m7880d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m10361roundToPxR2X_6o(PressGestureScope pressGestureScope, long j6) {
            return PressGestureScope.super.mo10248roundToPxR2X_6o(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m10362roundToPx0680j_4(PressGestureScope pressGestureScope, float f6) {
            return PressGestureScope.super.mo10249roundToPx0680j_4(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m10363toDpGaN1DYA(PressGestureScope pressGestureScope, long j6) {
            return PressGestureScope.super.mo10250toDpGaN1DYA(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m10364toDpu2uoSUM(PressGestureScope pressGestureScope, float f6) {
            return PressGestureScope.super.mo10251toDpu2uoSUM(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m10366toDpSizekrfVVM(PressGestureScope pressGestureScope, long j6) {
            return PressGestureScope.super.mo10253toDpSizekrfVVM(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m10367toPxR2X_6o(PressGestureScope pressGestureScope, long j6) {
            return PressGestureScope.super.mo10254toPxR2X_6o(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m10368toPx0680j_4(PressGestureScope pressGestureScope, float f6) {
            return PressGestureScope.super.mo10255toPx0680j_4(f6);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m10369toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j6) {
            return PressGestureScope.super.mo10256toSizeXkaWNTQ(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m10370toSp0xMU5do(PressGestureScope pressGestureScope, float f6) {
            return PressGestureScope.super.mo10257toSp0xMU5do(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m10371toSpkPz2Gy4(PressGestureScope pressGestureScope, float f6) {
            return PressGestureScope.super.mo10258toSpkPz2Gy4(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m10365toDpu2uoSUM(PressGestureScope pressGestureScope, int i6) {
            return PressGestureScope.super.mo10252toDpu2uoSUM(i6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m10372toSpkPz2Gy4(PressGestureScope pressGestureScope, int i6) {
            return PressGestureScope.super.mo10259toSpkPz2Gy4(i6);
        }
    }

    Object awaitRelease(Continuation<? super Unit> continuation);

    Object tryAwaitRelease(Continuation<? super Boolean> continuation);
}
