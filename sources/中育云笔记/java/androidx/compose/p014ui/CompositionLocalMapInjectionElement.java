package androidx.compose.p014ui;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {
    public static final int $stable = 0;
    private final CompositionLocalMap map;

    public CompositionLocalMapInjectionElement(CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && AbstractC9979u.m20289b(((CompositionLocalMapInjectionElement) obj).map, this.map);
    }

    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("<Injected CompositionLocalMap>");
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public CompositionLocalMapInjectionNode create() {
        return new CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(CompositionLocalMapInjectionNode compositionLocalMapInjectionNode) {
        compositionLocalMapInjectionNode.setMap(this.map);
    }
}
