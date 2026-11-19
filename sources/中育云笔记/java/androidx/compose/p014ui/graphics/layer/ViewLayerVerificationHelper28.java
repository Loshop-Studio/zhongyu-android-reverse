package androidx.compose.p014ui.graphics.layer;

import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes2.dex */
final class ViewLayerVerificationHelper28 {
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    public final void resetPivot(View view) {
        view.resetPivot();
    }

    public final void setOutlineAmbientShadowColor(View view, int i10) {
        view.setOutlineAmbientShadowColor(i10);
    }

    public final void setOutlineSpotShadowColor(View view, int i10) {
        view.setOutlineSpotShadowColor(i10);
    }
}
