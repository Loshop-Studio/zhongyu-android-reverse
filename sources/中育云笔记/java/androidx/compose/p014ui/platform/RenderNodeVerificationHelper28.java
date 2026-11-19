package androidx.compose.p014ui.platform;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper28 {
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    public final int getAmbientShadowColor(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int getSpotShadowColor(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void setAmbientShadowColor(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void setSpotShadowColor(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
