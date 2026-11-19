package androidx.compose.foundation;

import androidx.compose.p014ui.draw.DrawModifier;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;

/* loaded from: classes.dex */
final class IndicationModifier implements DrawModifier {
    private final IndicationInstance indicationInstance;

    public IndicationModifier(IndicationInstance indicationInstance) {
        this.indicationInstance = indicationInstance;
    }

    @Override // androidx.compose.p014ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        this.indicationInstance.drawIndication(contentDrawScope);
    }

    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }
}
