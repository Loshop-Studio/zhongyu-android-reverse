package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusRequester;
import androidx.compose.p014ui.layout.PinnableContainer;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private FocusRequester fallback;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private final InterfaceC9540l onExit = new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return C10786q.f26013a;
        }

        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            FocusRequesterModifierNodeKt.saveFocusedChild(this.this$0);
            PinnableContainer.PinnedHandle pinnedHandle = this.this$0.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            FocusRestorerNode focusRestorerNode = this.this$0;
            focusRestorerNode.pinnedHandle = FocusRequesterModifierNodeKt.pinFocusedChild(focusRestorerNode);
        }
    };
    private final InterfaceC9540l onEnter = new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return C10786q.f26013a;
        }

        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            PinnableContainer.PinnedHandle pinnedHandle = this.this$0.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.this$0.pinnedHandle = null;
            if (FocusRequesterModifierNodeKt.restoreFocusedChild(this.this$0)) {
                return;
            }
            FocusRequester fallback = this.this$0.getFallback();
            FocusRequester.Companion companion = FocusRequester.Companion;
            if (AbstractC9979u.m20289b(fallback, companion.getDefault())) {
                return;
            }
            if (AbstractC9979u.m20289b(this.this$0.getFallback(), companion.getCancel())) {
                focusEnterExitScope.cancelFocusChange();
            } else {
                FocusRequester.m30545requestFocus3ESFkO8$default(this.this$0.getFallback(), 0, 1, null);
            }
        }
    };

    public FocusRestorerNode(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public final FocusRequester getFallback() {
        return this.fallback;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
        super.onDetach();
    }

    public final void setFallback(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }
}
