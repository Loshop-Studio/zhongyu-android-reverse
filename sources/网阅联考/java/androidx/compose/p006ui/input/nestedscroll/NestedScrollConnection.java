package androidx.compose.p006ui.input.nestedscroll;

import androidx.compose.p006ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m5175d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m10376onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j4, long j5, Continuation<? super Velocity> continuation) {
            return AbstractC1378a.m559a(nestedScrollConnection, j4, j5, continuation);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m10377onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j4, long j5, int i4) {
            return AbstractC1378a.m560b(nestedScrollConnection, j4, j5, i4);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m10378onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j4, Continuation<? super Velocity> continuation) {
            return AbstractC1378a.m561c(nestedScrollConnection, j4, continuation);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m10379onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j4, int i4) {
            return AbstractC1378a.m562d(nestedScrollConnection, j4, i4);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY */
    Object mo7212onPostFlingRZ2iAVY(long j4, long j5, Continuation<? super Velocity> continuation);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo7213onPostScrollDzOQY0M(long consumed, long available, int source);

    /* renamed from: onPreFling-QWom1Mo */
    Object mo7214onPreFlingQWom1Mo(long j4, Continuation<? super Velocity> continuation);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo7215onPreScrollOzD1aCk(long available, int source);
}
