package androidx.compose.p013ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper24 {
    public static final RenderNodeVerificationHelper24 INSTANCE = new RenderNodeVerificationHelper24();

    private RenderNodeVerificationHelper24() {
    }

    public final void discardDisplayList(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
