package androidx.compose.p009ui.input.nestedscroll;

import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m7880d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m14992onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j6, long j7, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo10375onPostFlingRZ2iAVY(j6, j7, continuation);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m14993onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j6, long j7, int i6) {
            return NestedScrollConnection.super.mo10376onPostScrollDzOQY0M(j6, j7, i6);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m14994onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j6, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo10681onPreFlingQWom1Mo(j6, continuation);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m14995onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j6, int i6) {
            return NestedScrollConnection.super.mo10682onPreScrollOzD1aCk(j6, i6);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m14990onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j6, long j7, Continuation<? super Velocity> continuation) {
        return Velocity.m16713boximpl(Velocity.INSTANCE.m16733getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m14991onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j6, Continuation<? super Velocity> continuation) {
        return Velocity.m16713boximpl(Velocity.INSTANCE.m16733getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo10375onPostFlingRZ2iAVY(long j6, long j7, Continuation<? super Velocity> continuation) {
        return m14990onPostFlingRZ2iAVY$suspendImpl(this, j6, j7, continuation);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo10376onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m13674getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo10681onPreFlingQWom1Mo(long j6, Continuation<? super Velocity> continuation) {
        return m14991onPreFlingQWom1Mo$suspendImpl(this, j6, continuation);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo10682onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m13674getZeroF1C5BW0();
    }
}
