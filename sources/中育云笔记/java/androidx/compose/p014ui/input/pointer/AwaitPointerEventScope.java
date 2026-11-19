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
public interface AwaitPointerEventScope extends Density {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m32013getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo32011getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m32014roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m32015roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m32016toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32017toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m32019toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m32020toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m32021toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m32022toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m32023toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32024toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
            return AwaitPointerEventScope.super.withTimeout(j10, interfaceC9544p, interfaceC11588c);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j10, interfaceC9544p, interfaceC11588c);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32018toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return AwaitPointerEventScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32025toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return AwaitPointerEventScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC11588c);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return interfaceC9544p.invoke(awaitPointerEventScope, interfaceC11588c);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return interfaceC9544p.invoke(awaitPointerEventScope, interfaceC11588c);
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, InterfaceC11588c<? super PointerEvent> interfaceC11588c);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo32011getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m30715getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo32012getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return withTimeout$suspendImpl(this, j10, interfaceC9544p, interfaceC11588c);
    }

    default <T> Object withTimeoutOrNull(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return withTimeoutOrNull$suspendImpl(this, j10, interfaceC9544p, interfaceC11588c);
    }
}
