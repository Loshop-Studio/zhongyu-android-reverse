package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.node.DrawModifierNode;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    private InterfaceC10570l onDraw;

    public DrawWithContentModifier(InterfaceC10570l interfaceC10570l) {
        this.onDraw = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }

    public final InterfaceC10570l getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(InterfaceC10570l interfaceC10570l) {
        this.onDraw = interfaceC10570l;
    }
}
