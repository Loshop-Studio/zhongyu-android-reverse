package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface PointerInputScope extends Density {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m32141getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.mo27089getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m32142roundToPxR2X_6o(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m32143roundToPx0680j_4(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z10) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m32144toDpGaN1DYA(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32145toDpu2uoSUM(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m32147toDpSizekrfVVM(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m32148toPxR2X_6o(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m32149toPx0680j_4(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            return PointerInputScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m32150toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m32151toSp0xMU5do(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32152toSpkPz2Gy4(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32146toDpu2uoSUM(PointerInputScope pointerInputScope, int i10) {
            return PointerInputScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32153toSpkPz2Gy4(PointerInputScope pointerInputScope, int i10) {
            return PointerInputScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    <R> Object awaitPointerEventScope(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo27089getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m30715getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g */
    long mo27090getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z10) {
    }
}
