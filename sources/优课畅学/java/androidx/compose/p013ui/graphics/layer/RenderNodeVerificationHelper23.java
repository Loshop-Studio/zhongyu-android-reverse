package androidx.compose.p013ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper23 {
    public static final RenderNodeVerificationHelper23 INSTANCE = new RenderNodeVerificationHelper23();

    private RenderNodeVerificationHelper23() {
    }

    public final void destroyDisplayListData(RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
