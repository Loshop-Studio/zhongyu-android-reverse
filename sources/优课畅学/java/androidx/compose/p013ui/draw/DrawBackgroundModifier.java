package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {
    public static final int $stable = 8;
    private InterfaceC10570l onDraw;

    public DrawBackgroundModifier(InterfaceC10570l interfaceC10570l) {
        this.onDraw = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    public final InterfaceC10570l getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(InterfaceC10570l interfaceC10570l) {
        this.onDraw = interfaceC10570l;
    }
}
