package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(21)
/* loaded from: classes.dex */
final class EdgeToEdgeApi21 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(statusBarStyle, "statusBarStyle");
        AbstractC9133u.m16133g(navigationBarStyle, "navigationBarStyle");
        AbstractC9133u.m16133g(window, "window");
        AbstractC9133u.m16133g(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(134217728);
    }
}
