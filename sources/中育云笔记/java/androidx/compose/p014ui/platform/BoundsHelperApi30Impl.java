package androidx.compose.p014ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
/* loaded from: classes2.dex */
final class BoundsHelperApi30Impl implements BoundsHelper {
    public static final BoundsHelperApi30Impl INSTANCE = new BoundsHelperApi30Impl();

    private BoundsHelperApi30Impl() {
    }

    @Override // androidx.compose.p014ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
