package androidx.compose.foundation;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    public static final int $stable = 0;
    private final Brush brush;
    private final Shape shape;
    private final float width;

    public /* synthetic */ BorderModifierNodeElement(float f10, Brush brush, Shape shape, AbstractC9126n abstractC9126n) {
        this(f10, brush, shape);
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m20370copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f10, Brush brush, Shape shape, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderModifierNodeElement.width;
        }
        if ((i10 & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i10 & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m20372copy8Feqmps(f10, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m20371component1D9Ej5fM() {
        return this.width;
    }

    public final Brush component2() {
        return this.brush;
    }

    public final Shape component3() {
        return this.shape;
    }

    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m20372copy8Feqmps(float f10, Brush brush, Shape shape) {
        return new BorderModifierNodeElement(f10, brush, shape, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return C3156Dp.m26904equalsimpl0(this.width, borderModifierNodeElement.width) && AbstractC9133u.m16128b(this.brush, borderModifierNodeElement.brush) && AbstractC9133u.m16128b(this.shape, borderModifierNodeElement.shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m20373getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((C3156Dp.m26905hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("border");
        inspectorInfo.getProperties().set("width", C3156Dp.m26897boximpl(this.width));
        if (this.brush instanceof SolidColor) {
            inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m24266boximpl(((SolidColor) this.brush).m24611getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m24266boximpl(((SolidColor) this.brush).m24611getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set("shape", this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C3156Dp.m26910toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f10, Brush brush, Shape shape) {
        this.width = f10;
        this.brush = brush;
        this.shape = shape;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(BorderModifierNode borderModifierNode) {
        borderModifierNode.m20369setWidth0680j_4(this.width);
        borderModifierNode.setBrush(this.brush);
        borderModifierNode.setShape(this.shape);
    }
}
