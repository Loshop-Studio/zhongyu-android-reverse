package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
final class ExitAlwaysScrollBehavior implements BottomAppBarScrollBehavior {
    private final InterfaceC9529a canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final BottomAppBarState state;

    public ExitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC9529a interfaceC9529a) {
        this.state = bottomAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = interfaceC9529a;
        this.nestedScrollConnection = new ExitAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    public final InterfaceC9529a getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public BottomAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ ExitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(bottomAppBarState, animationSpec, decayAnimationSpec, (i10 & 8) != 0 ? new InterfaceC9529a() { // from class: androidx.compose.material3.ExitAlwaysScrollBehavior.1
            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC9529a);
    }
}
