package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, m5110d2 = {"Landroidx/compose/material3/ExitAlwaysScrollBehavior;", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "Landroidx/compose/material3/BottomAppBarState;", "state", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Lkotlin/Function0;", "", "canScroll", "<init>", "(Landroidx/compose/material3/BottomAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lr6/a;)V", "Landroidx/compose/material3/BottomAppBarState;", "getState", "()Landroidx/compose/material3/BottomAppBarState;", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "Lr6/a;", "getCanScroll", "()Lr6/a;", "isPinned", "Z", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ExitAlwaysScrollBehavior implements BottomAppBarScrollBehavior {

    @NotNull
    private final InterfaceC6469a canScroll;

    @Nullable
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;

    @NotNull
    private NestedScrollConnection nestedScrollConnection;

    @Nullable
    private final AnimationSpec<Float> snapAnimationSpec;

    @NotNull
    private final BottomAppBarState state;

    public ExitAlwaysScrollBehavior(@NotNull BottomAppBarState bottomAppBarState, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @NotNull InterfaceC6469a interfaceC6469a) {
        this.state = bottomAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = interfaceC6469a;
        this.nestedScrollConnection = new ExitAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    @NotNull
    public final InterfaceC6469a getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    @Nullable
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    @NotNull
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    @Nullable
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    @NotNull
    public BottomAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* renamed from: isPinned, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ ExitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC6469a interfaceC6469a, int i, AbstractC5824e abstractC5824e) {
        this(bottomAppBarState, animationSpec, decayAnimationSpec, (i & 8) != 0 ? new InterfaceC6469a() { // from class: androidx.compose.material3.ExitAlwaysScrollBehavior.1
            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC6469a);
    }
}
