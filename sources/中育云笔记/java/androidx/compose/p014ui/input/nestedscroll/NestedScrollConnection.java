package androidx.compose.p014ui.input.nestedscroll;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.unit.Velocity;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m31973onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j10, long j11, InterfaceC11588c<? super Velocity> interfaceC11588c) {
            return NestedScrollConnection.super.mo27229onPostFlingRZ2iAVY(j10, j11, interfaceC11588c);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m31974onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
            return NestedScrollConnection.super.mo27230onPostScrollDzOQY0M(j10, j11, i10);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m31975onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
            return NestedScrollConnection.super.mo27535onPreFlingQWom1Mo(j10, interfaceC11588c);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m31976onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j10, int i10) {
            return NestedScrollConnection.super.mo27536onPreScrollOzD1aCk(j10, i10);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m31971onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, long j11, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return Velocity.m33730boximpl(Velocity.Companion.m33750getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m31972onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return Velocity.m33730boximpl(Velocity.Companion.m33750getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo27229onPostFlingRZ2iAVY(long j10, long j11, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return m31971onPostFlingRZ2iAVY$suspendImpl(this, j10, j11, interfaceC11588c);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return Offset.Companion.m30653getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo27535onPreFlingQWom1Mo(long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return m31972onPreFlingQWom1Mo$suspendImpl(this, j10, interfaceC11588c);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo27536onPreScrollOzD1aCk(long j10, int i10) {
        return Offset.Companion.m30653getZeroF1C5BW0();
    }
}
