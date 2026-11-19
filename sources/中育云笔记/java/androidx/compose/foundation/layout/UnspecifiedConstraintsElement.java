package androidx.compose.foundation.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, AbstractC9972n abstractC9972n) {
        this(f10, f11);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return C3186Dp.m33506equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) && C3186Dp.m33506equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m27522getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m27523getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (C3186Dp.m33507hashCodeimpl(this.minWidth) * 31) + C3186Dp.m33507hashCodeimpl(this.minHeight);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", C3186Dp.m33499boximpl(this.minWidth));
        inspectorInfo.getProperties().set("minHeight", C3186Dp.m33499boximpl(this.minHeight));
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f11, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m27527setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m27526setMinHeight0680j_4(this.minHeight);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
