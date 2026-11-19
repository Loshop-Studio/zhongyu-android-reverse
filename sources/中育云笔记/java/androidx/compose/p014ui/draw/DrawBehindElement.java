package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {
    private final InterfaceC9540l onDraw;

    public DrawBehindElement(InterfaceC9540l interfaceC9540l) {
        this.onDraw = interfaceC9540l;
    }

    public static /* synthetic */ DrawBehindElement copy$default(DrawBehindElement drawBehindElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = drawBehindElement.onDraw;
        }
        return drawBehindElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.onDraw;
    }

    public final DrawBehindElement copy(InterfaceC9540l interfaceC9540l) {
        return new DrawBehindElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && AbstractC9979u.m20289b(this.onDraw, ((DrawBehindElement) obj).onDraw);
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
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public DrawBackgroundModifier create() {
        return new DrawBackgroundModifier(this.onDraw);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(DrawBackgroundModifier drawBackgroundModifier) {
        drawBackgroundModifier.setOnDraw(this.onDraw);
    }
}
