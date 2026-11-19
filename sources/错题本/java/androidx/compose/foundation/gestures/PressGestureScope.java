package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "Ld6/s;", "awaitRelease", "(Lh6/c;)Ljava/lang/Object;", "", "tryAwaitRelease", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7019roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j7) {
            return PressGestureScope.super.mo6896roundToPxR2X_6o(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7020roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo6897roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7021toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j7) {
            return PressGestureScope.super.mo6898toDpGaN1DYA(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7022toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo6899toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7024toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j7) {
            return PressGestureScope.super.mo6901toDpSizekrfVVM(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7025toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j7) {
            return PressGestureScope.super.mo6902toPxR2X_6o(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7026toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo6903toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7027toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j7) {
            return PressGestureScope.super.mo6904toSizeXkaWNTQ(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7028toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo6905toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7029toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo6906toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7023toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo6900toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7030toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo6907toSpkPz2Gy4(i);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);

    @Nullable
    Object tryAwaitRelease(@NotNull InterfaceC5631c<? super Boolean> interfaceC5631c);
}
