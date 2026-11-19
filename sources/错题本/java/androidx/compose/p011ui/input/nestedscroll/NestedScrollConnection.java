package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m11777onPostFlingRZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection, long j7, long j8, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
            return NestedScrollConnection.super.mo7033onPostFlingRZ2iAVY(j7, j8, interfaceC5631c);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m11778onPostScrollDzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection, long j7, long j8, int i) {
            return NestedScrollConnection.super.mo7034onPostScrollDzOQY0M(j7, j8, i);
        }

        @Deprecated
        @Nullable
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m11779onPreFlingQWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection, long j7, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
            return NestedScrollConnection.super.mo7339onPreFlingQWom1Mo(j7, interfaceC5631c);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m11780onPreScrollOzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection, long j7, int i) {
            return NestedScrollConnection.super.mo7340onPreScrollOzD1aCk(j7, i);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m11775onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j7, long j8, InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return Velocity.m13534boximpl(Velocity.INSTANCE.m13554getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m11776onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j7, InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return Velocity.m13534boximpl(Velocity.INSTANCE.m13554getZero9UxMQ8M());
    }

    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo7033onPostFlingRZ2iAVY(long j7, long j8, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return m11775onPostFlingRZ2iAVY$suspendImpl(this, j7, j8, interfaceC5631c);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    default Object mo7339onPreFlingQWom1Mo(long j7, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return m11776onPreFlingQWom1Mo$suspendImpl(this, j7, interfaceC5631c);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo7340onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m10457getZeroF1C5BW0();
    }
}
