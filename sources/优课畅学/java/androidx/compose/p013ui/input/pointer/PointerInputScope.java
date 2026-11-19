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
public interface PointerInputScope extends Density {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m25539getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.mo20487getExtendedTouchPaddingNHjbRc();
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
        public static int m25540roundToPxR2X_6o(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m25541roundToPx0680j_4(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z10) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m25542toDpGaN1DYA(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m25543toDpu2uoSUM(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m25545toDpSizekrfVVM(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m25546toPxR2X_6o(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m25547toPx0680j_4(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            return PointerInputScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m25548toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j10) {
            return PointerInputScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m25549toSp0xMU5do(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m25550toSpkPz2Gy4(PointerInputScope pointerInputScope, float f10) {
            return PointerInputScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m25544toDpu2uoSUM(PointerInputScope pointerInputScope, int i10) {
            return PointerInputScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m25551toSpkPz2Gy4(PointerInputScope pointerInputScope, int i10) {
            return PointerInputScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    <R> Object awaitPointerEventScope(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo20487getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m24113getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g */
    long mo20488getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z10) {
    }
}
