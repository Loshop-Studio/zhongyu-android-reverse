package androidx.compose.animation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.layout.ContentScale;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class SkipToLookaheadNodeKt {
    private static final InterfaceC9529a DefaultEnabled = new InterfaceC9529a() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$DefaultEnabled$1
        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    public static final Modifier createContentScaleModifier(Modifier modifier, ScaleToBoundsImpl scaleToBoundsImpl, final InterfaceC9529a interfaceC9529a) {
        return modifier.then(AbstractC9979u.m20289b(scaleToBoundsImpl.getContentScale(), ContentScale.Companion.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new InterfaceC9540l() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt.createContentScaleModifier.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setClip(((Boolean) interfaceC9529a.invoke()).booleanValue());
            }
        }) : Modifier.Companion).then(new SkipToLookaheadElement(scaleToBoundsImpl, interfaceC9529a));
    }
}
