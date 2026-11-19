package com.zykj.study.utils;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8839h;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class CustomIndication implements IndicationNodeFactory {

    /* renamed from: a */
    public static final CustomIndication f13729a = new CustomIndication();

    public static final class PressIndicationInstance extends Modifier.Node implements DrawModifierNode {

        /* renamed from: a */
        public final InteractionSource f13730a;

        /* renamed from: b */
        public boolean f13731b;

        public PressIndicationInstance(InteractionSource interactionSource) {
            AbstractC9133u.m16133g(interactionSource, "interactionSource");
            this.f13730a = interactionSource;
        }

        @Override // androidx.compose.p013ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            AbstractC9133u.m16133g(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.f13731b) {
                DrawScope.m24821drawRectnJ9OG0$default(contentDrawScope, Color.m24275copywmQWz5c$default(Color.Companion.m24313getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo24827getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            AbstractC8839h.m14861d(getCoroutineScope(), null, null, new CustomIndication$PressIndicationInstance$onAttach$1(this, null), 3, null);
        }

        @Override // androidx.compose.p013ui.node.DrawModifierNode
        public void onMeasureResultChanged() {
            super.onMeasureResultChanged();
        }
    }

    private CustomIndication() {
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        AbstractC9133u.m16133g(interactionSource, "interactionSource");
        return new PressIndicationInstance(interactionSource);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }

    @Override // androidx.compose.foundation.Indication
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i10) {
        return super.rememberUpdatedInstance(interactionSource, composer, i10);
    }
}
