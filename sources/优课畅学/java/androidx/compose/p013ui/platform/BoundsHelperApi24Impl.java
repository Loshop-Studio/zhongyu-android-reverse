package androidx.compose.p013ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class BoundsHelperApi24Impl implements BoundsHelper {
    public static final BoundsHelperApi24Impl INSTANCE = new BoundsHelperApi24Impl();

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.compose.p013ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int navigationBarHeight = AndroidWindowInfo_androidKt.getNavigationBarHeight(activity);
            int i10 = rect.bottom;
            if (i10 + navigationBarHeight == point.y) {
                rect.bottom = i10 + navigationBarHeight;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + navigationBarHeight == point.x) {
                rect.right = i11 + navigationBarHeight;
            }
        }
        return rect;
    }
}
