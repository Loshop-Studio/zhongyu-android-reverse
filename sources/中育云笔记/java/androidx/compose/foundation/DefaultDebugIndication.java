package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DrawModifierNode;
import sd.AbstractC11117h;

/* loaded from: classes.dex */
final class DefaultDebugIndication implements IndicationNodeFactory {
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    public static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {
        private final InteractionSource interactionSource;
        private boolean isFocused;
        private boolean isHovered;
        private boolean isPressed;

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.interactionSource = interactionSource;
        }

        @Override // androidx.compose.p014ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (this.isPressed) {
                DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, Color.m30877copywmQWz5c$default(Color.Companion.m30904getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo31429getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered || this.isFocused) {
                DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, Color.m30877copywmQWz5c$default(Color.Companion.m30904getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo31429getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            AbstractC11117h.m24726d(getCoroutineScope(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3, null);
        }
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }
}
