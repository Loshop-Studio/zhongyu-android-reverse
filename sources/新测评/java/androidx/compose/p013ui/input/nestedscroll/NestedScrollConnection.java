package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m13558d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m22069onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j10, long j11, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo17452onPostFlingRZ2iAVY(j10, j11, continuation);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m22070onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
            return NestedScrollConnection.super.mo17453onPostScrollDzOQY0M(j10, j11, i10);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m22071onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j10, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo17758onPreFlingQWom1Mo(j10, continuation);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m22072onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j10, int i10) {
            return NestedScrollConnection.super.mo17759onPreScrollOzD1aCk(j10, i10);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m22067onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, long j11, Continuation<? super Velocity> continuation) {
        return Velocity.m23790boximpl(Velocity.INSTANCE.m23810getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m22068onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, Continuation<? super Velocity> continuation) {
        return Velocity.m23790boximpl(Velocity.INSTANCE.m23810getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo17452onPostFlingRZ2iAVY(long j10, long j11, Continuation<? super Velocity> continuation) {
        return m22067onPostFlingRZ2iAVY$suspendImpl(this, j10, j11, continuation);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo17453onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m20751getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo17758onPreFlingQWom1Mo(long j10, Continuation<? super Velocity> continuation) {
        return m22068onPreFlingQWom1Mo$suspendImpl(this, j10, continuation);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo17759onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m20751getZeroF1C5BW0();
    }
}
