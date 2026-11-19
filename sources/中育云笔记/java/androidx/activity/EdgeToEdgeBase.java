package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        AbstractC9979u.m20294g(window, "window");
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(statusBarStyle, "statusBarStyle");
        AbstractC9979u.m20294g(navigationBarStyle, "navigationBarStyle");
        AbstractC9979u.m20294g(window, "window");
        AbstractC9979u.m20294g(view, "view");
    }
}
