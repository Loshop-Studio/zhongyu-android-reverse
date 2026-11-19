package androidx.compose.foundation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/compose/foundation/OverscrollModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DelegatableNode;", "overscrollNode", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;)V", "Ld6/s;", "attachIfNeeded", "()V", "onAttach", "onDetach", "update", "Landroidx/compose/ui/node/DelegatableNode;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
/* loaded from: classes.dex */
final class OverscrollModifierNode extends DelegatingNode {

    @Nullable
    private DelegatableNode overscrollNode;

    public OverscrollModifierNode(@Nullable DelegatableNode delegatableNode) {
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
            AbstractC5830k.m5327d(delegatableNode2);
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

    public final void update(@Nullable DelegatableNode overscrollNode) {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.overscrollNode = overscrollNode;
        attachIfNeeded();
    }
}
