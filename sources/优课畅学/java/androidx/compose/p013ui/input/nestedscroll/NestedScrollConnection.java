package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m25371onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j10, long j11, InterfaceC9324c<? super Velocity> interfaceC9324c) {
            return NestedScrollConnection.super.mo20627onPostFlingRZ2iAVY(j10, j11, interfaceC9324c);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m25372onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
            return NestedScrollConnection.super.mo20628onPostScrollDzOQY0M(j10, j11, i10);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m25373onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
            return NestedScrollConnection.super.mo20933onPreFlingQWom1Mo(j10, interfaceC9324c);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m25374onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j10, int i10) {
            return NestedScrollConnection.super.mo20934onPreScrollOzD1aCk(j10, i10);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m25369onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, long j11, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return Velocity.m27128boximpl(Velocity.Companion.m27148getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m25370onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return Velocity.m27128boximpl(Velocity.Companion.m27148getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo20627onPostFlingRZ2iAVY(long j10, long j11, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return m25369onPostFlingRZ2iAVY$suspendImpl(this, j10, j11, interfaceC9324c);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return Offset.Companion.m24051getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo20933onPreFlingQWom1Mo(long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return m25370onPreFlingQWom1Mo$suspendImpl(this, j10, interfaceC9324c);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo20934onPreScrollOzD1aCk(long j10, int i10) {
        return Offset.Companion.m24051getZeroF1C5BW0();
    }
}
