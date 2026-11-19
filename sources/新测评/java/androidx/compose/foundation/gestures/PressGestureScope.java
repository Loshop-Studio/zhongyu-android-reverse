package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m13558d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m17438roundToPxR2X_6o(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo17325roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m17439roundToPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17326roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m17440toDpGaN1DYA(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo17327toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m17441toDpu2uoSUM(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17328toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m17443toDpSizekrfVVM(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo17330toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m17444toPxR2X_6o(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo17331toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m17445toPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17332toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m17446toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo17333toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m17447toSp0xMU5do(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17334toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m17448toSpkPz2Gy4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo17335toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m17442toDpu2uoSUM(PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo17329toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m17449toSpkPz2Gy4(PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo17336toSpkPz2Gy4(i10);
        }
    }

    Object awaitRelease(Continuation<? super Unit> continuation);

    Object tryAwaitRelease(Continuation<? super Boolean> continuation);
}
