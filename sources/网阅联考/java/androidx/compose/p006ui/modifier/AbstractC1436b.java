package androidx.compose.p006ui.modifier;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.NodeChain;
import androidx.compose.p006ui.node.NodeKind;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.modifier.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1436b {
    /* renamed from: a */
    public static Object m704a(ModifierLocalNode modifierLocalNode, ModifierLocal modifierLocal) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
        if (!modifierLocalNode.getNode().getIsAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(32);
        if (!modifierLocalNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = modifierLocalNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM10773constructorimpl) != 0 && (parent instanceof ModifierLocalNode)) {
                        ModifierLocalNode modifierLocalNode2 = (ModifierLocalNode) parent;
                        if (modifierLocalNode2.getProvidedValues().contains$ui_release(modifierLocal)) {
                            return modifierLocalNode2.getProvidedValues().get$ui_release(modifierLocal);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    /* renamed from: b */
    public static ModifierLocalMap m705b(ModifierLocalNode modifierLocalNode) {
        return EmptyMap.INSTANCE;
    }

    /* renamed from: c */
    public static void m706c(ModifierLocalNode modifierLocalNode, ModifierLocal key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(modifierLocalNode.getProvidedValues() != EmptyMap.INSTANCE)) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        }
        if (modifierLocalNode.getProvidedValues().contains$ui_release(key)) {
            modifierLocalNode.getProvidedValues().mo10656set$ui_release(key, obj);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
    }
}
