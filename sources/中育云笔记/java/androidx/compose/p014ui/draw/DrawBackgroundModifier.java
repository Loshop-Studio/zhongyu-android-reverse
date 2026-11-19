package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {
    public static final int $stable = 8;
    private InterfaceC9540l onDraw;

    public DrawBackgroundModifier(InterfaceC9540l interfaceC9540l) {
        this.onDraw = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    public final InterfaceC9540l getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(InterfaceC9540l interfaceC9540l) {
        this.onDraw = interfaceC9540l;
    }
}
