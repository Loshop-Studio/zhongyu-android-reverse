package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {
    private final InterfaceC9529a canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public PinnedScrollBehavior(TopAppBarState topAppBarState, InterfaceC9529a interfaceC9529a) {
        this.state = topAppBarState;
        this.canScroll = interfaceC9529a;
        this.isPinned = true;
        this.nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
                if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
                    return Offset.Companion.m30653getZeroF1C5BW0();
                }
                if (Offset.m30638getYimpl(j10) != 0.0f || Offset.m30638getYimpl(j11) <= 0.0f) {
                    TopAppBarState state = this.this$0.getState();
                    state.setContentOffset(state.getContentOffset() + Offset.m30638getYimpl(j10));
                } else {
                    this.this$0.getState().setContentOffset(0.0f);
                }
                return Offset.Companion.m30653getZeroF1C5BW0();
            }
        };
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

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(topAppBarState, (i10 & 2) != 0 ? new InterfaceC9529a() { // from class: androidx.compose.material3.PinnedScrollBehavior.1
            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC9529a);
    }
}
