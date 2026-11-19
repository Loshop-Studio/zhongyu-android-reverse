package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(17)
/* loaded from: classes3.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        AbstractC9979u.m20294g(display, "display");
        AbstractC9979u.m20294g(point, "point");
        display.getRealSize(point);
    }
}
