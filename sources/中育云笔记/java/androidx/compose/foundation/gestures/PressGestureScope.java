package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m27215roundToPxR2X_6o(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m27216roundToPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m27217toDpGaN1DYA(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m27218toDpu2uoSUM(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m27220toDpSizekrfVVM(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m27221toPxR2X_6o(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m27222toPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m27223toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m27224toSp0xMU5do(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m27225toSpkPz2Gy4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m27219toDpu2uoSUM(PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m27226toSpkPz2Gy4(PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    Object awaitRelease(InterfaceC11588c<? super C10786q> interfaceC11588c);

    Object tryAwaitRelease(InterfaceC11588c<? super Boolean> interfaceC11588c);
}
