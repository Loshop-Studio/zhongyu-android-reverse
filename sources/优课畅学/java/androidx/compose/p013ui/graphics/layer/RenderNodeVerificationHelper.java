package androidx.compose.p013ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.RenderEffect;

@RequiresApi(31)
/* loaded from: classes2.dex */
public final class RenderNodeVerificationHelper {
    public static final RenderNodeVerificationHelper INSTANCE = new RenderNodeVerificationHelper();

    private RenderNodeVerificationHelper() {
    }

    public final void setRenderEffect(RenderNode renderNode, RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
