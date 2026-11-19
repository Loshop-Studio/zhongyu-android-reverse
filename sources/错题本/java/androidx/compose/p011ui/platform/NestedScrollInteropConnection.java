package androidx.compose.p011ui.platform;

import android.view.View;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m5110d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Ld6/s;", "interruptOngoingScrolls", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "Landroid/view/View;", "Landroidx/core/view/NestedScrollingChildHelper;", "nestedScrollChildHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "", "consumedScrollCache", "[I", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,233:1\n1#2:234\n65#3:235\n69#3:238\n65#3:241\n69#3:244\n65#3:247\n69#3:250\n60#4:236\n70#4:239\n60#4:242\n70#4:245\n60#4:248\n70#4:251\n22#5:237\n22#5:240\n22#5:243\n22#5:246\n22#5:249\n22#5:252\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n*L\n65#1:235\n66#1:238\n88#1:241\n89#1:244\n90#1:247\n91#1:250\n65#1:236\n66#1:239\n88#1:242\n89#1:245\n90#1:248\n91#1:251\n65#1:237\n66#1:240\n88#1:243\n89#1:246\n90#1:249\n91#1:252\n*E\n"})
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;

    @NotNull
    private final int[] consumedScrollCache;

    @NotNull
    private final NestedScrollingChildHelper nestedScrollChildHelper;

    @NotNull
    private final View view;

    public NestedScrollInteropConnection(@NotNull View view) {
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

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo7033onPostFlingRZ2iAVY(long j7, long j8, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        if (!this.nestedScrollChildHelper.dispatchNestedFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13543getXimpl(j8)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13544getYimpl(j8)), true)) {
            j8 = Velocity.INSTANCE.m13554getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m13534boximpl(j8);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m12497getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m12499toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        AbstractC5802q.m5187N(this.consumedScrollCache, 0, 0, 6);
        this.nestedScrollChildHelper.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (consumed >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (consumed & 4294967295L))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (available >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (available & 4294967295L))), null, NestedScrollInteropConnectionKt.m12499toViewTypeGyEprt8(source), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m12498toOffsetUv8p0NA(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo7339onPreFlingQWom1Mo(long j7, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        if (!this.nestedScrollChildHelper.dispatchNestedPreFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13543getXimpl(j7)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13544getYimpl(j7)))) {
            j7 = Velocity.INSTANCE.m13554getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m13534boximpl(j7);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7340onPreScrollOzD1aCk(long available, int source) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m12497getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m12499toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        AbstractC5802q.m5187N(this.consumedScrollCache, 0, 0, 6);
        this.nestedScrollChildHelper.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (available >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & available))), this.consumedScrollCache, null, NestedScrollInteropConnectionKt.m12499toViewTypeGyEprt8(source));
        return NestedScrollInteropConnectionKt.m12498toOffsetUv8p0NA(this.consumedScrollCache, available);
    }
}
