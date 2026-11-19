package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class EdgeToEdge {
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static final void enable(ComponentActivity componentActivity) {
        AbstractC9979u.m20294g(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle statusBarStyle) {
        AbstractC9979u.m20294g(componentActivity, "<this>");
        AbstractC9979u.m20294g(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle) {
        AbstractC9979u.m20294g(componentActivity, "<this>");
        AbstractC9979u.m20294g(statusBarStyle, "statusBarStyle");
        AbstractC9979u.m20294g(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        AbstractC9979u.m20293f(decorView, "window.decorView");
        InterfaceC9540l detectDarkMode$activity_release = statusBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        AbstractC9979u.m20293f(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) detectDarkMode$activity_release.invoke(resources)).booleanValue();
        InterfaceC9540l detectDarkMode$activity_release2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        AbstractC9979u.m20293f(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) detectDarkMode$activity_release2.invoke(resources2)).booleanValue();
        EdgeToEdgeImpl edgeToEdgeApi23 = Impl;
        if (edgeToEdgeApi23 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                edgeToEdgeApi23 = new EdgeToEdgeApi30();
            } else if (i10 >= 29) {
                edgeToEdgeApi23 = new EdgeToEdgeApi29();
            } else if (i10 >= 28) {
                edgeToEdgeApi23 = new EdgeToEdgeApi28();
            } else if (i10 >= 26) {
                edgeToEdgeApi23 = new EdgeToEdgeApi26();
            } else {
                edgeToEdgeApi23 = new EdgeToEdgeApi23();
            }
        }
        EdgeToEdgeImpl edgeToEdgeImpl = edgeToEdgeApi23;
        Window window = componentActivity.getWindow();
        AbstractC9979u.m20293f(window, "window");
        edgeToEdgeImpl.setUp(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        AbstractC9979u.m20293f(window2, "window");
        edgeToEdgeImpl.adjustLayoutInDisplayCutoutMode(window2);
    }
}
