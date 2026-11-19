package androidx.compose.foundation;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.node.DelegatableNode;
import androidx.compose.p012ui.node.DelegatingNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m13413d2 = {"Landroidx/compose/foundation/OverscrollModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "overscrollNode", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)V", "attachIfNeeded", "", "onAttach", "onDetach", "update", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
/* loaded from: classes.dex */
final class OverscrollModifierNode extends DelegatingNode {
    private DelegatableNode overscrollNode;

    public OverscrollModifierNode(DelegatableNode delegatableNode) {
        this.overscrollNode = delegatableNode;
    }

    private final void attachIfNeeded() {
        DelegatableNode delegatableNodeDelegate;
        Modifier.Node node;
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode == null || (node = delegatableNode.getNode()) == null || node.getIsAttached()) {
            delegatableNodeDelegate = null;
        } else {
            DelegatableNode delegatableNode2 = this.overscrollNode;
            Intrinsics.checkNotNull(delegatableNode2);
            delegatableNodeDelegate = delegate(delegatableNode2);
        }
        this.overscrollNode = delegatableNodeDelegate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        attachIfNeeded();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    public final void update(DelegatableNode overscrollNode) {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.overscrollNode = overscrollNode;
        attachIfNeeded();
    }
}
