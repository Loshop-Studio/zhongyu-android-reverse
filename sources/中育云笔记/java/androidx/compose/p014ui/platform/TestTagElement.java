package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.node.ModifierNodeElement;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class TestTagElement extends ModifierNodeElement<TestTagNode> {
    private final String tag;

    public TestTagElement(String str) {
        this.tag = str;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return AbstractC9979u.m20289b(this.tag, ((TestTagElement) obj).tag);
        }
        return false;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("testTag");
        inspectorInfo.getProperties().set("tag", this.tag);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public TestTagNode create() {
        return new TestTagNode(this.tag);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(TestTagNode testTagNode) {
        testTagNode.setTag(this.tag);
    }
}
