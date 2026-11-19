package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {
    private final InterfaceC10559a canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public PinnedScrollBehavior(TopAppBarState topAppBarState, InterfaceC10559a interfaceC10559a) {
        this.state = topAppBarState;
        this.canScroll = interfaceC10559a;
        this.isPinned = true;
        this.nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
                if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
                    return Offset.Companion.m24051getZeroF1C5BW0();
                }
                if (Offset.m24036getYimpl(j10) != 0.0f || Offset.m24036getYimpl(j11) <= 0.0f) {
                    TopAppBarState state = this.this$0.getState();
                    state.setContentOffset(state.getContentOffset() + Offset.m24036getYimpl(j10));
                } else {
                    this.this$0.getState().setContentOffset(0.0f);
                }
                return Offset.Companion.m24051getZeroF1C5BW0();
            }
        };
    }

    public final InterfaceC10559a getCanScroll() {
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

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(topAppBarState, (i10 & 2) != 0 ? new InterfaceC10559a() { // from class: androidx.compose.material3.PinnedScrollBehavior.1
            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC10559a);
    }
}
