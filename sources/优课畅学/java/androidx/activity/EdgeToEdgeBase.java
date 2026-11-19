package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        AbstractC9133u.m16133g(window, "window");
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(statusBarStyle, "statusBarStyle");
        AbstractC9133u.m16133g(navigationBarStyle, "navigationBarStyle");
        AbstractC9133u.m16133g(window, "window");
        AbstractC9133u.m16133g(view, "view");
    }
}
