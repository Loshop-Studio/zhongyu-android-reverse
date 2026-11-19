package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        AbstractC9979u.m20294g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        AbstractC9979u.m20294g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        AbstractC9979u.m20294g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        AbstractC9979u.m20294g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
