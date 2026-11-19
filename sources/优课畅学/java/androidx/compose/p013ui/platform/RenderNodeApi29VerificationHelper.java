package androidx.compose.p013ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.RenderEffect;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class RenderNodeApi29VerificationHelper {
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    public final void setRenderEffect(RenderNode renderNode, RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
