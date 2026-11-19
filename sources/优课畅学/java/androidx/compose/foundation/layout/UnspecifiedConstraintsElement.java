package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, AbstractC9126n abstractC9126n) {
        this(f10, f11);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return C3156Dp.m26904equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) && C3156Dp.m26904equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m20920getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m20921getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (C3156Dp.m26905hashCodeimpl(this.minWidth) * 31) + C3156Dp.m26905hashCodeimpl(this.minHeight);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", C3156Dp.m26897boximpl(this.minWidth));
        inspectorInfo.getProperties().set("minHeight", C3156Dp.m26897boximpl(this.minHeight));
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f11, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m20925setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m20924setMinHeight0680j_4(this.minHeight);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
