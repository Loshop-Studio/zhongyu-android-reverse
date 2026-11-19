package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m20613roundToPxR2X_6o(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m20614roundToPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m20615toDpGaN1DYA(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m20616toDpu2uoSUM(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m20618toDpSizekrfVVM(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m20619toPxR2X_6o(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m20620toPx0680j_4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m20621toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j10) {
            return PressGestureScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m20622toSp0xMU5do(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m20623toSpkPz2Gy4(PressGestureScope pressGestureScope, float f10) {
            return PressGestureScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m20617toDpu2uoSUM(PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m20624toSpkPz2Gy4(PressGestureScope pressGestureScope, int i10) {
            return PressGestureScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    Object awaitRelease(InterfaceC9324c<? super C8736p> interfaceC9324c);

    Object tryAwaitRelease(InterfaceC9324c<? super Boolean> interfaceC9324c);
}
