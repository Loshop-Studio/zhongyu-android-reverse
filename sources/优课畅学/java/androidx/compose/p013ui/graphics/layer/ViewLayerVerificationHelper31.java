package androidx.compose.p013ui.graphics.layer;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.RenderEffect;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class ViewLayerVerificationHelper31 {
    public static final ViewLayerVerificationHelper31 INSTANCE = new ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    public final void setRenderEffect(View view, RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
