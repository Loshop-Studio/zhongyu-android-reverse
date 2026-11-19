package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {
    private final InterfaceC10570l onDraw;

    public DrawWithContentElement(InterfaceC10570l interfaceC10570l) {
        this.onDraw = interfaceC10570l;
    }

    public static /* synthetic */ DrawWithContentElement copy$default(DrawWithContentElement drawWithContentElement, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = drawWithContentElement.onDraw;
        }
        return drawWithContentElement.copy(interfaceC10570l);
    }

    public final InterfaceC10570l component1() {
        return this.onDraw;
    }

    public final DrawWithContentElement copy(InterfaceC10570l interfaceC10570l) {
        return new DrawWithContentElement(interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && AbstractC9133u.m16128b(this.onDraw, ((DrawWithContentElement) obj).onDraw);
    }

    public final InterfaceC10570l getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public DrawWithContentModifier create() {
        return new DrawWithContentModifier(this.onDraw);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(DrawWithContentModifier drawWithContentModifier) {
        drawWithContentModifier.setOnDraw(this.onDraw);
    }
}
