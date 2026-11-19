package androidx.compose.animation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.layout.ContentScale;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class SkipToLookaheadNodeKt {
    private static final InterfaceC10559a DefaultEnabled = new InterfaceC10559a() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$DefaultEnabled$1
        @Override // p300x7.InterfaceC10559a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    public static final Modifier createContentScaleModifier(Modifier modifier, ScaleToBoundsImpl scaleToBoundsImpl, final InterfaceC10559a interfaceC10559a) {
        return modifier.then(AbstractC9133u.m16128b(scaleToBoundsImpl.getContentScale(), ContentScale.Companion.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new InterfaceC10570l() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt.createContentScaleModifier.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setClip(((Boolean) interfaceC10559a.invoke()).booleanValue());
            }
        }) : Modifier.Companion).then(new SkipToLookaheadElement(scaleToBoundsImpl, interfaceC10559a));
    }
}
