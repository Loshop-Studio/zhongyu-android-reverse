package com.gyf.immersionbar;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class NotchUtils {
    private static final String NOTCH_HUA_WEI = "com.huawei.android.util.HwNotchSizeUtil";
    private static final String NOTCH_OPPO = "com.oppo.feature.screen.heteromorphism";
    private static final String NOTCH_VIVO = "android.util.FtFeature";
    private static final String NOTCH_XIAO_MI = "ro.miui.notch";
    private static final String SYSTEM_PROPERTIES = "android.os.SystemProperties";

    private static int dp2px(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    private static DisplayCutout getDisplayCutout(Activity activity) {
        Window window;
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 28 || activity == null || (window = activity.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getDisplayCutout();
    }

    private static int[] getHuaWeiNotchSize(Context context) throws ClassNotFoundException {
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(NOTCH_HUA_WEI);
            return (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return iArr;
        }
    }

    public static int getNotchHeight(Activity activity) {
        int statusBarHeight = ImmersionBar.getStatusBarHeight(activity);
        DisplayCutout displayCutout = getDisplayCutout(activity);
        if (Build.VERSION.SDK_INT >= 28 && displayCutout != null) {
            return activity.getResources().getConfiguration().orientation == 1 ? displayCutout.getSafeInsetTop() : displayCutout.getSafeInsetLeft() == 0 ? displayCutout.getSafeInsetRight() : displayCutout.getSafeInsetLeft();
        }
        int xiaoMiNotchHeight = hasNotchAtXiaoMi(activity) ? getXiaoMiNotchHeight(activity) : 0;
        if (hasNotchAtHuaWei(activity)) {
            xiaoMiNotchHeight = getHuaWeiNotchSize(activity)[1];
        }
        if (hasNotchAtVIVO(activity) && (xiaoMiNotchHeight = dp2px(activity, 32)) < statusBarHeight) {
            xiaoMiNotchHeight = statusBarHeight;
        }
        if (!hasNotchAtOPPO(activity)) {
            return xiaoMiNotchHeight;
        }
        if (80 < statusBarHeight) {
            return statusBarHeight;
        }
        return 80;
    }

    private static int getXiaoMiNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean hasNotchAtAndroidP(View view) {
        return getDisplayCutout(view) != null;
    }

    private static boolean hasNotchAtHuaWei(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(NOTCH_HUA_WEI);
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    private static boolean hasNotchAtOPPO(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature(NOTCH_OPPO);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean hasNotchAtVIVO(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(NOTCH_VIVO);
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    private static boolean hasNotchAtXiaoMi(Context context) throws ClassNotFoundException {
        int iIntValue;
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass(SYSTEM_PROPERTIES);
                iIntValue = ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, NOTCH_XIAO_MI, 0)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } else {
            iIntValue = 0;
        }
        return iIntValue == 1;
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (activity != null) {
            return hasNotchAtXiaoMi(activity) || hasNotchAtHuaWei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVIVO(activity) || hasNotchAtAndroidP(activity);
        }
        return false;
    }

    private static boolean hasNotchAtAndroidP(Activity activity) {
        return getDisplayCutout(activity) != null;
    }

    private static DisplayCutout getDisplayCutout(View view) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 28 || view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getDisplayCutout();
    }

    public static boolean hasNotchScreen(View view) {
        if (view != null) {
            return hasNotchAtXiaoMi(view.getContext()) || hasNotchAtHuaWei(view.getContext()) || hasNotchAtOPPO(view.getContext()) || hasNotchAtVIVO(view.getContext()) || hasNotchAtAndroidP(view);
        }
        return false;
    }
}
