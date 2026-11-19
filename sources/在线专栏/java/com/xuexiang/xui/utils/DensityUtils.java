package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.xuexiang.xui.XUI;

/* loaded from: classes.dex */
public final class DensityUtils {
    private DensityUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int dp2px(float f4) {
        return (int) ((f4 * ResUtils.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static DisplayMetrics getAppMetrics(Activity activity, boolean z3) {
        return getDisplayMetrics(activity, z3);
    }

    public static Point getAppSize(Activity activity, boolean z3) {
        return getDisplaySize(activity, z3);
    }

    public static int getDisplayHeight(Context context, boolean z3) {
        Point displaySize = getDisplaySize(context, z3);
        if (displaySize != null) {
            return displaySize.y;
        }
        return 0;
    }

    public static DisplayMetrics getDisplayMetrics() {
        return ResUtils.getResources().getDisplayMetrics();
    }

    public static Point getDisplaySize(Context context, boolean z3) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        if (z3) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        return point;
    }

    public static int getDisplayWidth(Context context, boolean z3) {
        Point displaySize = getDisplaySize(context, z3);
        if (displaySize != null) {
            return displaySize.x;
        }
        return 0;
    }

    public static int getNavigationBarHeight(Context context) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i4 = displayMetrics.heightPixels;
        int i5 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i6 = i4 - displayMetrics2.heightPixels;
        return i6 > 0 ? i6 : Math.max(i5 - displayMetrics2.widthPixels, 0);
    }

    public static int getRealDpi(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) + 0.5f);
    }

    public static int getScreenDpi() {
        return getDisplayMetrics().densityDpi;
    }

    public static DisplayMetrics getScreenMetrics(boolean z3) {
        return getDisplayMetrics(XUI.getContext(), z3);
    }

    public static Point getScreenSize(boolean z3) {
        return getDisplaySize(XUI.getContext(), z3);
    }

    public static boolean isNavigationBarExist(Context context) {
        return getNavigationBarHeight(context) > 0;
    }

    public static int px2dp(float f4) {
        return (int) ((f4 / ResUtils.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f4) {
        return (int) ((f4 / ResUtils.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f4) {
        return (int) ((f4 * ResUtils.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int dp2px(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static DisplayMetrics getDisplayMetrics(Context context, boolean z3) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (z3) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static int px2dp(Context context, float f4) {
        return (int) ((f4 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(Context context, float f4) {
        return (int) ((f4 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
