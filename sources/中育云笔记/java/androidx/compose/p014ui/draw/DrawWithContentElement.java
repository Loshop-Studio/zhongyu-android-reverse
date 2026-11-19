package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {
    private final InterfaceC9540l onDraw;

    public DrawWithContentElement(InterfaceC9540l interfaceC9540l) {
        this.onDraw = interfaceC9540l;
    }

    public static /* synthetic */ DrawWithContentElement copy$default(DrawWithContentElement drawWithContentElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = drawWithContentElement.onDraw;
        }
        return drawWithContentElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.onDraw;
    }

    public final DrawWithContentElement copy(InterfaceC9540l interfaceC9540l) {
        return new DrawWithContentElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && AbstractC9979u.m20289b(this.onDraw, ((DrawWithContentElement) obj).onDraw);
    }

    public final InterfaceC9540l getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public DrawWithContentModifier create() {
        return new DrawWithContentModifier(this.onDraw);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(DrawWithContentModifier drawWithContentModifier) {
        drawWithContentModifier.setOnDraw(this.onDraw);
    }
}
