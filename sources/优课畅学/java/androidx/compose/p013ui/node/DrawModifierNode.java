package androidx.compose.p013ui.node;

import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;

/* loaded from: classes2.dex */
public interface DrawModifierNode extends DelegatableNode {
    void draw(ContentDrawScope contentDrawScope);

    default void onMeasureResultChanged() {
    }
}
