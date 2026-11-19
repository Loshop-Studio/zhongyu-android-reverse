package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface AwaitPointerEventScope extends Density {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m25411getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo25409getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m25412roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m25413roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m25414toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m25415toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m25417toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m25418toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m25419toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m25420toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return AwaitPointerEventScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m25421toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m25422toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return AwaitPointerEventScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
            return AwaitPointerEventScope.super.withTimeout(j10, interfaceC10574p, interfaceC9324c);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j10, interfaceC10574p, interfaceC9324c);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m25416toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return AwaitPointerEventScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m25423toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return AwaitPointerEventScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC9324c);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return interfaceC10574p.invoke(awaitPointerEventScope, interfaceC9324c);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return interfaceC10574p.invoke(awaitPointerEventScope, interfaceC9324c);
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, InterfaceC9324c<? super PointerEvent> interfaceC9324c);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo25409getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m24113getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo25410getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return withTimeout$suspendImpl(this, j10, interfaceC10574p, interfaceC9324c);
    }

    default <T> Object withTimeoutOrNull(long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return withTimeoutOrNull$suspendImpl(this, j10, interfaceC10574p, interfaceC9324c);
    }
}
