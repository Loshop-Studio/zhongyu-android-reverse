package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J#\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m13558d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "consumedScrollCache", "", "nestedScrollChildHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "interruptOngoingScrolls", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,233:1\n1#2:234\n65#3:235\n69#3:238\n65#3:241\n69#3:244\n65#3:247\n69#3:250\n60#4:236\n70#4:239\n60#4:242\n70#4:245\n60#4:248\n70#4:251\n22#5:237\n22#5:240\n22#5:243\n22#5:246\n22#5:249\n22#5:252\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n*L\n65#1:235\n66#1:238\n88#1:241\n89#1:244\n90#1:247\n91#1:250\n65#1:236\n66#1:239\n88#1:242\n89#1:245\n90#1:248\n91#1:251\n65#1:237\n66#1:240\n88#1:243\n89#1:246\n90#1:249\n91#1:252\n*E\n"})
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final NestedScrollingChildHelper nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo17452onPostFlingRZ2iAVY(long j10, long j11, Continuation<? super Velocity> continuation) {
        if (!this.nestedScrollChildHelper.dispatchNestedFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m23799getXimpl(j11)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m23800getYimpl(j11)), true)) {
            j11 = Velocity.INSTANCE.m23810getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m23790boximpl(j11);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo17453onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m22761getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m22763toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m20751getZeroF1C5BW0();
        }
        ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (consumed >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (consumed & 4294967295L))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (available >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (available & 4294967295L))), null, NestedScrollInteropConnectionKt.m22763toViewTypeGyEprt8(source), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m22762toOffsetUv8p0NA(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo17758onPreFlingQWom1Mo(long j10, Continuation<? super Velocity> continuation) {
        if (!this.nestedScrollChildHelper.dispatchNestedPreFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m23799getXimpl(j10)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m23800getYimpl(j10)))) {
            j10 = Velocity.INSTANCE.m23810getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m23790boximpl(j10);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo17759onPreScrollOzD1aCk(long available, int source) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m22761getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m22763toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m20751getZeroF1C5BW0();
        }
        ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (available >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & available))), this.consumedScrollCache, null, NestedScrollInteropConnectionKt.m22763toViewTypeGyEprt8(source));
        return NestedScrollInteropConnectionKt.m22762toOffsetUv8p0NA(this.consumedScrollCache, available);
    }
}
