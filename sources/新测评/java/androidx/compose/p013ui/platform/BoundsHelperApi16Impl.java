package androidx.compose.p013ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi16Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class BoundsHelperApi16Impl implements BoundsHelper {
    public static final BoundsHelperApi16Impl INSTANCE = new BoundsHelperApi16Impl();

    private BoundsHelperApi16Impl() {
    }

    @Override // androidx.compose.p013ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        int i10;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i11 = point.x;
        if (i11 == 0 || (i10 = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i11;
        rect.bottom = i10;
        return rect;
    }
}
