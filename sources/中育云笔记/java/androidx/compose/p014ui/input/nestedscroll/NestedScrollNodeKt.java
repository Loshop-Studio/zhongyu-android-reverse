package androidx.compose.p014ui.input.nestedscroll;

import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class NestedScrollNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> T findNearestAttachedAncestor(T t10) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseAncestors(t10, new InterfaceC9540l() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.findNearestAttachedAncestor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(TraversableNode traversableNode) {
                boolean z10;
                if (traversableNode.getNode().isAttached()) {
                    ref$ObjectRef.f23402c = traversableNode;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
        return (T) ref$ObjectRef.f23402c;
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
