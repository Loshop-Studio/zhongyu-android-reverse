package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.p014ui.draganddrop.DragAndDropEvent;
import androidx.compose.p014ui.modifier.ModifierLocalMap;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private final ModifierLocalMap providedValues;
    private final ReceiveContentConfiguration receiveContentConfiguration;
    private ReceiveContentListener receiveContentListener;

    public ReceiveContentNode(ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new DynamicReceiveContentConfiguration(this);
        this.receiveContentConfiguration = dynamicReceiveContentConfiguration;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(AbstractC10776g.m22975a(ReceiveContentConfigurationKt.getModifierLocalReceiveContent(), dynamicReceiveContentConfiguration));
        delegate(ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode(dynamicReceiveContentConfiguration, new InterfaceC9540l() { // from class: androidx.compose.foundation.content.ReceiveContentNode.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(ReceiveContentNode.this, dragAndDropEvent);
            }
        }));
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public final void setReceiveContentListener(ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public final void updateNode(ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }
}
