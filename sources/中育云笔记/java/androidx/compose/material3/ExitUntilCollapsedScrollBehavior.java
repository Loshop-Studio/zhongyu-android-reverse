package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {
    private final InterfaceC9529a canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC9529a interfaceC9529a) {
        this.state = topAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = interfaceC9529a;
        this.nestedScrollConnection = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);
    }

    public final InterfaceC9529a getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(topAppBarState, animationSpec, decayAnimationSpec, (i10 & 8) != 0 ? new InterfaceC9529a() { // from class: androidx.compose.material3.ExitUntilCollapsedScrollBehavior.1
            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC9529a);
    }
}
