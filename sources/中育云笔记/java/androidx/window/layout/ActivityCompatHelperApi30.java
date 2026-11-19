package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(30)
/* loaded from: classes3.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        AbstractC9979u.m20293f(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        AbstractC9979u.m20293f(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
