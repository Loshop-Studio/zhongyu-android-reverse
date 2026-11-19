package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(21)
/* loaded from: classes.dex */
final class EdgeToEdgeApi21 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(statusBarStyle, "statusBarStyle");
        AbstractC9979u.m20294g(navigationBarStyle, "navigationBarStyle");
        AbstractC9979u.m20294g(window, "window");
        AbstractC9979u.m20294g(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(134217728);
    }
}
