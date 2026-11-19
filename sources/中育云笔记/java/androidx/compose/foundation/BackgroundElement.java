package androidx.compose.foundation;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;
    private final Brush brush;
    private final long color;
    private final InterfaceC9540l inspectorInfo;
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j10, Brush brush, float f10, Shape shape, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(j10, brush, f10, shape, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m30879equalsimpl0(this.color, backgroundElement.color) && AbstractC9979u.m20289b(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && AbstractC9979u.m20289b(this.shape, backgroundElement.shape);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iM30885hashCodeimpl = Color.m30885hashCodeimpl(this.color) * 31;
        Brush brush = this.brush;
        return ((((iM30885hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ BackgroundElement(long j10, Brush brush, float f10, Shape shape, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10, (i10 & 2) != 0 ? null : brush, f10, shape, interfaceC9540l, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(BackgroundNode backgroundNode) {
        backgroundNode.m26952setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        backgroundNode.setShape(this.shape);
    }

    private BackgroundElement(long j10, Brush brush, float f10, Shape shape, InterfaceC9540l interfaceC9540l) {
        this.color = j10;
        this.brush = brush;
        this.alpha = f10;
        this.shape = shape;
        this.inspectorInfo = interfaceC9540l;
    }
}
