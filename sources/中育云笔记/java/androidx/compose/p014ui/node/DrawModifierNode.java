package androidx.compose.p014ui.node;

import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;

/* loaded from: classes2.dex */
public interface DrawModifierNode extends DelegatableNode {
    void draw(ContentDrawScope contentDrawScope);

    default void onMeasureResultChanged() {
    }
}
