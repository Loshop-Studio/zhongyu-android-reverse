package android.view;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.SystemBarStyle;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\" \u0010\u000f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f\"\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Ld6/s;", "enable", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "enableEdgeToEdge", "", "DefaultLightScrim", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultDarkScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "Landroidx/activity/EdgeToEdgeImpl;", "Impl", "Landroidx/activity/EdgeToEdgeImpl;", "activity_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "EdgeToEdge")
@SourceDebugExtension({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
/* loaded from: classes.dex */
public final class EdgeToEdge {

    @Nullable
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    @JvmOverloads
    @JvmName(name = "enable")
    public static final void enable(@NotNull ComponentActivity componentActivity) {
        AbstractC5830k.m5330g(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.INSTANCE, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
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

    @JvmOverloads
    @JvmName(name = "enable")
    public static final void enable(@NotNull ComponentActivity componentActivity, @NotNull SystemBarStyle statusBarStyle) {
        AbstractC5830k.m5330g(componentActivity, "<this>");
        AbstractC5830k.m5330g(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    @JvmOverloads
    @JvmName(name = "enable")
    public static final void enable(@NotNull ComponentActivity componentActivity, @NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle) {
        AbstractC5830k.m5330g(componentActivity, "<this>");
        AbstractC5830k.m5330g(statusBarStyle, "statusBarStyle");
        AbstractC5830k.m5330g(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        AbstractC5830k.m5329f(decorView, "window.decorView");
        InterfaceC6471c detectDarkMode = statusBarStyle.getDetectDarkMode();
        Resources resources = decorView.getResources();
        AbstractC5830k.m5329f(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) detectDarkMode.invoke(resources)).booleanValue();
        InterfaceC6471c detectDarkMode2 = navigationBarStyle.getDetectDarkMode();
        Resources resources2 = decorView.getResources();
        AbstractC5830k.m5329f(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) detectDarkMode2.invoke(resources2)).booleanValue();
        EdgeToEdgeImpl edgeToEdgeApi23 = Impl;
        if (edgeToEdgeApi23 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                edgeToEdgeApi23 = new EdgeToEdgeApi30();
            } else if (i >= 29) {
                edgeToEdgeApi23 = new EdgeToEdgeApi29();
            } else if (i >= 28) {
                edgeToEdgeApi23 = new EdgeToEdgeApi28();
            } else if (i >= 26) {
                edgeToEdgeApi23 = new EdgeToEdgeApi26();
            } else {
                edgeToEdgeApi23 = new EdgeToEdgeApi23();
            }
        }
        EdgeToEdgeImpl edgeToEdgeImpl = edgeToEdgeApi23;
        Window window = componentActivity.getWindow();
        AbstractC5830k.m5329f(window, "window");
        edgeToEdgeImpl.setUp(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        AbstractC5830k.m5329f(window2, "window");
        edgeToEdgeImpl.adjustLayoutInDisplayCutoutMode(window2);
    }
}
