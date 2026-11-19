package androidx.compose.foundation;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;
    private final Brush brush;
    private final long color;
    private final InterfaceC10570l inspectorInfo;
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j10, Brush brush, float f10, Shape shape, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(j10, brush, f10, shape, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m24277equalsimpl0(this.color, backgroundElement.color) && AbstractC9133u.m16128b(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && AbstractC9133u.m16128b(this.shape, backgroundElement.shape);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iM24283hashCodeimpl = Color.m24283hashCodeimpl(this.color) * 31;
        Brush brush = this.brush;
        return ((((iM24283hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ BackgroundElement(long j10, Brush brush, float f10, Shape shape, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10, (i10 & 2) != 0 ? null : brush, f10, shape, interfaceC10570l, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(BackgroundNode backgroundNode) {
        backgroundNode.m20350setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        backgroundNode.setShape(this.shape);
    }

    private BackgroundElement(long j10, Brush brush, float f10, Shape shape, InterfaceC10570l interfaceC10570l) {
        this.color = j10;
        this.brush = brush;
        this.alpha = f10;
        this.shape = shape;
        this.inspectorInfo = interfaceC10570l;
    }
}
