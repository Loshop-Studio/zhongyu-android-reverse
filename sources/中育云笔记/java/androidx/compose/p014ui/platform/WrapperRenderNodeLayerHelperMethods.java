package androidx.compose.p014ui.platform;

import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class WrapperRenderNodeLayerHelperMethods {
    public static final int $stable = 0;
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE = new WrapperRenderNodeLayerHelperMethods();

    private WrapperRenderNodeLayerHelperMethods() {
    }

    public final void onDescendantInvalidated(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
