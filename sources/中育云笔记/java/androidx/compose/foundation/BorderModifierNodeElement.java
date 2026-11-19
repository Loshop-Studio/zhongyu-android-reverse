package androidx.compose.foundation;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    public static final int $stable = 0;
    private final Brush brush;
    private final Shape shape;
    private final float width;

    public /* synthetic */ BorderModifierNodeElement(float f10, Brush brush, Shape shape, AbstractC9972n abstractC9972n) {
        this(f10, brush, shape);
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m26972copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f10, Brush brush, Shape shape, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderModifierNodeElement.width;
        }
        if ((i10 & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i10 & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m26974copy8Feqmps(f10, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m26973component1D9Ej5fM() {
        return this.width;
    }

    public final Brush component2() {
        return this.brush;
    }

    public final Shape component3() {
        return this.shape;
    }

    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m26974copy8Feqmps(float f10, Brush brush, Shape shape) {
        return new BorderModifierNodeElement(f10, brush, shape, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return C3186Dp.m33506equalsimpl0(this.width, borderModifierNodeElement.width) && AbstractC9979u.m20289b(this.brush, borderModifierNodeElement.brush) && AbstractC9979u.m20289b(this.shape, borderModifierNodeElement.shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m26975getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((C3186Dp.m33507hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("border");
        inspectorInfo.getProperties().set("width", C3186Dp.m33499boximpl(this.width));
        if (this.brush instanceof SolidColor) {
            inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m30868boximpl(((SolidColor) this.brush).m31213getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m30868boximpl(((SolidColor) this.brush).m31213getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set("shape", this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C3186Dp.m33512toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f10, Brush brush, Shape shape) {
        this.width = f10;
        this.brush = brush;
        this.shape = shape;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(BorderModifierNode borderModifierNode) {
        borderModifierNode.m26971setWidth0680j_4(this.width);
        borderModifierNode.setBrush(this.brush);
        borderModifierNode.setShape(this.shape);
    }
}
