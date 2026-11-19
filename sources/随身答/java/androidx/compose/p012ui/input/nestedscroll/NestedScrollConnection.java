package androidx.compose.p012ui.input.nestedscroll;

import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m13413d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m22502onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j9, long j10, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo17885onPostFlingRZ2iAVY(j9, j10, continuation);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m22503onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j9, long j10, int i9) {
            return NestedScrollConnection.super.mo17886onPostScrollDzOQY0M(j9, j10, i9);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m22504onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j9, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo18191onPreFlingQWom1Mo(j9, continuation);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m22505onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j9, int i9) {
            return NestedScrollConnection.super.mo18192onPreScrollOzD1aCk(j9, i9);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m22500onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j9, long j10, Continuation<? super Velocity> continuation) {
        return Velocity.m24223boximpl(Velocity.INSTANCE.m24243getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m22501onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j9, Continuation<? super Velocity> continuation) {
        return Velocity.m24223boximpl(Velocity.INSTANCE.m24243getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo17885onPostFlingRZ2iAVY(long j9, long j10, Continuation<? super Velocity> continuation) {
        return m22500onPostFlingRZ2iAVY$suspendImpl(this, j9, j10, continuation);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo17886onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m21184getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo18191onPreFlingQWom1Mo(long j9, Continuation<? super Velocity> continuation) {
        return m22501onPreFlingQWom1Mo$suspendImpl(this, j9, continuation);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo18192onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m21184getZeroF1C5BW0();
    }
}
