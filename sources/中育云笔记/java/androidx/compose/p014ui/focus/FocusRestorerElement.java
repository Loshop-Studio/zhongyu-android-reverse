package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {
    private final FocusRequester fallback;

    public FocusRestorerElement(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    public static /* synthetic */ FocusRestorerElement copy$default(FocusRestorerElement focusRestorerElement, FocusRequester focusRequester, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            focusRequester = focusRestorerElement.fallback;
        }
        return focusRestorerElement.copy(focusRequester);
    }

    public final FocusRequester component1() {
        return this.fallback;
    }

    public final FocusRestorerElement copy(FocusRequester focusRequester) {
        return new FocusRestorerElement(focusRequester);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && AbstractC9979u.m20289b(this.fallback, ((FocusRestorerElement) obj).fallback);
    }

    public final FocusRequester getFallback() {
        return this.fallback;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.fallback.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("fallback", this.fallback);
    }

    public String toString() {
        return "FocusRestorerElement(fallback=" + this.fallback + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FocusRestorerNode create() {
        return new FocusRestorerNode(this.fallback);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.setFallback(this.fallback);
    }
}
