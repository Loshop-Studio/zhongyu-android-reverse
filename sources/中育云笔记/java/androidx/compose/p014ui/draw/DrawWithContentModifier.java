package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.node.DrawModifierNode;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    private InterfaceC9540l onDraw;

    public DrawWithContentModifier(InterfaceC9540l interfaceC9540l) {
        this.onDraw = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }

    public final InterfaceC9540l getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(InterfaceC9540l interfaceC9540l) {
        this.onDraw = interfaceC9540l;
    }
}
