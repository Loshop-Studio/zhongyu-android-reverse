package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draw.CacheDrawScope;
import androidx.compose.p013ui.draw.DrawResult;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CacheDrawScopeDragShadowCallback {
    public static final int $stable = 8;
    private GraphicsLayer graphicsLayer;

    public final DrawResult cachePicture(CacheDrawScope cacheDrawScope) {
        GraphicsLayer graphicsLayerObtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        CacheDrawScope.m23888recordTdoYBX4$default(cacheDrawScope, graphicsLayerObtainGraphicsLayer, null, null, 0L, new InterfaceC10570l() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$1$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        }, 7, null);
        this.graphicsLayer = graphicsLayerObtainGraphicsLayer;
        return cacheDrawScope.onDrawWithContent(new InterfaceC10570l() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                GraphicsLayer graphicsLayer = this.this$0.graphicsLayer;
                AbstractC9133u.m16130d(graphicsLayer);
                GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
            }
        });
    }

    public final void drawDragShadow(DrawScope drawScope) {
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (graphicsLayer == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
        }
        GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
    }
}
