package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class NestedScrollNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> T findNearestAttachedAncestor(T t10) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseAncestors(t10, new InterfaceC10570l() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.findNearestAttachedAncestor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(TraversableNode traversableNode) {
                boolean z10;
                if (traversableNode.getNode().isAttached()) {
                    ref$ObjectRef.f17473a = traversableNode;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
        return (T) ref$ObjectRef.f17473a;
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
