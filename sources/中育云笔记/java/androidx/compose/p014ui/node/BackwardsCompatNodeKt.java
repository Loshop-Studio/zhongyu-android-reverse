package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.modifier.ModifierLocal;
import androidx.compose.p014ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class BackwardsCompatNodeKt {
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.p014ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
            return (T) modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };
    private static final InterfaceC9540l onDrawCacheReadsChanged = new InterfaceC9540l() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackwardsCompatNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.onDrawCacheReadsChanged$ui_release();
        }
    };
    private static final InterfaceC9540l updateModifierLocalConsumer = new InterfaceC9540l() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackwardsCompatNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.updateModifierLocalConsumer();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui_release().getTail$ui_release();
        AbstractC9979u.m20292e(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
