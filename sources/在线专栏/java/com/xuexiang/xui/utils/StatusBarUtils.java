package com.xuexiang.xui.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.C0358u;
import anet.channel.entity.EventType;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p068uc.crashsdk.export.LogType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class StatusBarUtils {
    private static final int STATUSBAR_TYPE_ANDROID6 = 3;
    private static final int STATUSBAR_TYPE_DEFAULT = 0;
    private static final int STATUSBAR_TYPE_FLYME = 2;
    private static final int STATUSBAR_TYPE_MIUI = 1;
    private static final int STATUS_BAR_DEFAULT_HEIGHT_DP = 25;
    private static int mStatusBarType = 0;
    private static int sStatusbarHeight = -1;
    private static Integer sTransparentValue = null;
    public static float sVirtualDensity = -1.0f;
    public static float sVirtualDensityDpi = -1.0f;

    public interface IWindowShower {
        void show(Window window);
    }

    private StatusBarUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @TargetApi(23)
    private static boolean Android6SetStatusBarLightMode(Window window, boolean z3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        window.getDecorView().setSystemUiVisibility(changeStatusBarModeRetainFlag(window, z3 ? 8192 : 256));
        if (!DeviceUtils.isMIUIV9()) {
            return true;
        }
        MIUISetStatusBarLightMode(window, z3);
        return true;
    }

    public static boolean FlymeSetStatusBarLightMode(Window window, boolean z3) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (window != null) {
            Android6SetStatusBarLightMode(window, z3);
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i4 = declaredField.getInt(null);
                int i5 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z3 ? i5 | i4 : (~i4) & i5);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean MIUISetStatusBarLightMode(Window window, boolean z3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i4 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z3) {
                    method.invoke(window, Integer.valueOf(i4), Integer.valueOf(i4));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i4));
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void cancelFullScreen(Activity activity, int i4, int i5) {
        if (activity == null) {
            return;
        }
        cancelFullScreen(activity.getWindow(), i4, i5);
    }

    @TargetApi(23)
    private static int changeStatusBarModeRetainFlag(Window window, int i4) {
        return retainSystemUiFlag(window, retainSystemUiFlag(window, retainSystemUiFlag(window, retainSystemUiFlag(window, retainSystemUiFlag(window, retainSystemUiFlag(window, i4, 1024), 4), 2), 4096), 1024), EventType.AUTH_SUCC);
    }

    public static void fullScreen(Activity activity) {
        if (activity == null) {
            return;
        }
        fullScreen(activity.getWindow());
    }

    public static int getNavigationBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Integer getStatusBarAPITransparentValue(Context context) throws NoSuchFieldException {
        Integer num = sTransparentValue;
        if (num != null) {
            return num;
        }
        String str = null;
        for (String str2 : context.getPackageManager().getSystemSharedLibraryNames()) {
            if ("touchwiz".equals(str2)) {
                str = "SYSTEM_UI_FLAG_TRANSPARENT_BACKGROUND";
            } else if (str2.startsWith("com.sonyericsson.navigationbar")) {
                str = "SYSTEM_UI_FLAG_TRANSPARENT";
            }
        }
        if (str != null) {
            try {
                Field field = View.class.getField(str);
                if (field != null && field.getType() == Integer.TYPE) {
                    sTransparentValue = Integer.valueOf(field.getInt(null));
                }
            } catch (Exception unused) {
            }
        }
        return sTransparentValue;
    }

    public static int getStatusBarHeight(Context context) {
        if (sStatusbarHeight == -1) {
            sStatusbarHeight = Utils.getStatusBarHeight(context);
        }
        return sStatusbarHeight;
    }

    @TargetApi(28)
    private static void handleDisplayCutoutMode(final Window window) {
        View decorView = window.getDecorView();
        if (decorView != null) {
            if (C0358u.m2012U(decorView)) {
                realHandleDisplayCutoutMode(window, decorView);
            } else {
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.xuexiang.xui.utils.StatusBarUtils.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        view.removeOnAttachStateChangeListener(this);
                        StatusBarUtils.realHandleDisplayCutoutMode(window, view);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            }
        }
    }

    public static void initStatusBarStyle(Activity activity, boolean z3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        initStatusBarStyle(activity, z3, 0);
    }

    public static boolean isFullScreen(Activity activity) {
        try {
            return (activity.getWindow().getAttributes().flags & 1024) != 0;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static boolean isMIUICustomStatusBarLightModeImpl() {
        return (DeviceUtils.isMIUIV9() && Build.VERSION.SDK_INT < 23) || DeviceUtils.isMIUIV5() || DeviceUtils.isMIUIV6() || DeviceUtils.isMIUIV7() || DeviceUtils.isMIUIV8();
    }

    public static boolean isNavigationBarExist(Activity activity) {
        return DensityUtils.isNavigationBarExist(activity);
    }

    public static boolean isNotchOfficialSupport() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(28)
    public static void realHandleDisplayCutoutMode(Window window, View view) {
        if (view.getRootWindowInsets() == null || view.getRootWindowInsets().getDisplayCutout() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        window.setAttributes(attributes);
    }

    public static int retainSystemUiFlag(Window window, int i4, int i5) {
        return (window.getDecorView().getSystemUiVisibility() & i5) == i5 ? i4 | i5 : i4;
    }

    public static void setNavigationBarColor(Activity activity, int i4) {
        activity.getWindow().setNavigationBarColor(i4);
    }

    public static boolean setStatusBarDarkMode(Activity activity) {
        if (activity == null) {
            return false;
        }
        int i4 = mStatusBarType;
        if (i4 == 0) {
            return true;
        }
        if (i4 == 1) {
            return MIUISetStatusBarLightMode(activity.getWindow(), false);
        }
        if (i4 == 2) {
            return FlymeSetStatusBarLightMode(activity.getWindow(), false);
        }
        if (i4 == 3) {
            return Android6SetStatusBarLightMode(activity.getWindow(), false);
        }
        return true;
    }

    public static boolean setStatusBarLightMode(Activity activity) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (activity == null || DeviceUtils.isZTKC2016()) {
            return false;
        }
        int i4 = mStatusBarType;
        if (i4 != 0) {
            return setStatusBarLightMode(activity, i4);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (isMIUICustomStatusBarLightModeImpl() && MIUISetStatusBarLightMode(activity.getWindow(), true)) {
            mStatusBarType = 1;
            return true;
        }
        if (FlymeSetStatusBarLightMode(activity.getWindow(), true)) {
            mStatusBarType = 2;
            return true;
        }
        if (i5 < 23) {
            return false;
        }
        Android6SetStatusBarLightMode(activity.getWindow(), true);
        mStatusBarType = 3;
        return true;
    }

    public static void setVirtualDensity(float f4) {
        sVirtualDensity = f4;
    }

    public static void setVirtualDensityDpi(float f4) {
        sVirtualDensityDpi = f4;
    }

    public static void showDialog(Activity activity, final Dialog dialog) {
        if (dialog == null) {
            return;
        }
        showWindow(activity, dialog.getWindow(), new IWindowShower() { // from class: com.xuexiang.xui.utils.StatusBarUtils.3
            @Override // com.xuexiang.xui.utils.StatusBarUtils.IWindowShower
            public void show(Window window) {
                dialog.show();
            }
        });
    }

    public static void showDialogInFullScreen(final Dialog dialog) {
        if (dialog == null) {
            return;
        }
        showWindowInFullScreen(dialog.getWindow(), new IWindowShower() { // from class: com.xuexiang.xui.utils.StatusBarUtils.2
            @Override // com.xuexiang.xui.utils.StatusBarUtils.IWindowShower
            public void show(Window window) {
                dialog.show();
            }
        });
    }

    public static boolean showWindow(Activity activity, Window window, IWindowShower iWindowShower) {
        if (activity == null || window == null || iWindowShower == null) {
            return false;
        }
        window.addFlags(8);
        iWindowShower.show(window);
        syncSystemUiVisibility(activity, window);
        window.clearFlags(8);
        return true;
    }

    public static void showWindowInFullScreen(Window window, IWindowShower iWindowShower) {
        if (window == null || iWindowShower == null) {
            return;
        }
        window.addFlags(8);
        iWindowShower.show(window);
        fullScreen(window);
        window.clearFlags(8);
    }

    public static boolean supportTransclentStatusBar6() {
        return (DeviceUtils.isZUKZ1() || DeviceUtils.isZTKC2016()) ? false : true;
    }

    private static boolean supportTranslucent() {
        return !DeviceUtils.isEssentialPhone() || Build.VERSION.SDK_INT >= 26;
    }

    public static boolean syncSystemUiVisibility(Activity activity, Window window) {
        if (activity == null) {
            return false;
        }
        return syncSystemUiVisibility(activity.getWindow(), window);
    }

    public static void translucent(Activity activity) {
        translucent(activity.getWindow());
    }

    public static void cancelFullScreen(Window window, int i4, int i5) {
        if (window == null) {
            return;
        }
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(0);
        window.addFlags(Integer.MIN_VALUE);
        if (i4 != -1) {
            window.setStatusBarColor(i4);
        }
        if (i5 != -1) {
            window.setNavigationBarColor(i5);
        }
    }

    public static void fullScreen(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4615);
    }

    public static void initStatusBarStyle(Activity activity, boolean z3, int i4) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        translucent(activity, i4);
        if (z3) {
            setStatusBarDarkMode(activity);
        } else {
            setStatusBarLightMode(activity);
        }
    }

    public static boolean syncSystemUiVisibility(Window window, Window window2) {
        if (window == null || window2 == null) {
            return false;
        }
        window2.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        return true;
    }

    public static void translucent(Window window) {
        translucent(window, 1073741824);
    }

    public static void translucent(Activity activity, int i4) {
        translucent(activity.getWindow(), i4);
    }

    @TargetApi(19)
    public static void translucent(Window window, int i4) {
        if (supportTranslucent()) {
            if (isNotchOfficialSupport()) {
                handleDisplayCutoutMode(window);
            }
            if (!DeviceUtils.isMeizu() && (!DeviceUtils.isMIUI() || Build.VERSION.SDK_INT >= 23)) {
                int i5 = Build.VERSION.SDK_INT;
                window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
                if (i5 >= 23 && supportTransclentStatusBar6()) {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                    return;
                } else {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(i4);
                    return;
                }
            }
            window.setFlags(67108864, 67108864);
        }
    }

    public static void cancelFullScreen(Activity activity) {
        if (activity == null) {
            return;
        }
        cancelFullScreen(activity.getWindow());
    }

    public static void cancelFullScreen(Window window) {
        cancelFullScreen(window, -1, -1);
    }

    private static boolean setStatusBarLightMode(Activity activity, int i4) {
        if (i4 == 1) {
            return MIUISetStatusBarLightMode(activity.getWindow(), true);
        }
        if (i4 == 2) {
            return FlymeSetStatusBarLightMode(activity.getWindow(), true);
        }
        if (i4 == 3) {
            return Android6SetStatusBarLightMode(activity.getWindow(), true);
        }
        return false;
    }
}
