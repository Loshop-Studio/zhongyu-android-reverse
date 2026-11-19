package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.drawerlayout.widget.DrawerLayout;
import com.p040uc.crashsdk.export.LogType;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class BarUtils {
    private static final int KEY_OFFSET = -123;
    private static final String TAG_OFFSET = "TAG_OFFSET";
    private static final String TAG_STATUS_BAR = "TAG_STATUS_BAR";

    private BarUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addMarginTopEqualStatusBarHeight(@NonNull View view) {
        view.setTag(TAG_OFFSET);
        Object tag = view.getTag(KEY_OFFSET);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(KEY_OFFSET, Boolean.TRUE);
        }
    }

    private static View applyStatusBarColor(@NonNull Activity activity, int i4, boolean z3) {
        return applyStatusBarColor(activity.getWindow(), i4, z3);
    }

    private static View createStatusBarView(@NonNull Context context, int i4) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(i4);
        view.setTag(TAG_STATUS_BAR);
        return view;
    }

    public static int getActionBarHeight() {
        TypedValue typedValue = new TypedValue();
        if (Utils.getApp().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, Utils.getApp().getResources().getDisplayMetrics());
        }
        return 0;
    }

    @RequiresApi(21)
    public static int getNavBarColor(@NonNull Activity activity) {
        return getNavBarColor(activity.getWindow());
    }

    public static int getNavBarHeight() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static String getResNameById(int i4) {
        try {
            return Utils.getApp().getResources().getResourceEntryName(i4);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    private static void hideStatusBarView(@NonNull Activity activity) {
        hideStatusBarView(activity.getWindow());
    }

    private static void invokePanels(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(Utils.getApp().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static boolean isNavBarLightMode(@NonNull Activity activity) {
        return isNavBarLightMode(activity.getWindow());
    }

    public static boolean isNavBarVisible(@NonNull Activity activity) {
        return isNavBarVisible(activity.getWindow());
    }

    public static boolean isStatusBarLightMode(@NonNull Activity activity) {
        return isStatusBarLightMode(activity.getWindow());
    }

    public static boolean isStatusBarVisible(@NonNull Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 0;
    }

    public static boolean isSupportNavBar() {
        WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return (point2.y == point.y && point2.x == point.x) ? false : true;
    }

    @RequiresApi(21)
    public static void setNavBarColor(@NonNull Activity activity, @ColorInt int i4) {
        setNavBarColor(activity.getWindow(), i4);
    }

    public static void setNavBarLightMode(@NonNull Activity activity, boolean z3) {
        setNavBarLightMode(activity.getWindow(), z3);
    }

    public static void setNavBarVisibility(@NonNull Activity activity, boolean z3) {
        setNavBarVisibility(activity.getWindow(), z3);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        invokePanels(z3 ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static View setStatusBarColor(@NonNull Activity activity, @ColorInt int i4) {
        return setStatusBarColor(activity, i4, false);
    }

    public static void setStatusBarColor4Drawer(@NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i4) {
        setStatusBarColor4Drawer(drawerLayout, view, i4, false);
    }

    public static void setStatusBarCustom(@NonNull View view) {
        Activity activityByContext = UtilsBridge.getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = getStatusBarHeight();
        }
    }

    public static void setStatusBarLightMode(@NonNull Activity activity, boolean z3) {
        setStatusBarLightMode(activity.getWindow(), z3);
    }

    public static void setStatusBarVisibility(@NonNull Activity activity, boolean z3) {
        setStatusBarVisibility(activity.getWindow(), z3);
    }

    private static void showStatusBarView(@NonNull Window window) {
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(0);
    }

    public static void subtractMarginTopEqualStatusBarHeight(@NonNull View view) {
        Object tag = view.getTag(KEY_OFFSET);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(KEY_OFFSET, Boolean.FALSE);
    }

    public static void transparentNavBar(@NonNull Activity activity) {
        transparentNavBar(activity.getWindow());
    }

    public static void transparentStatusBar(@NonNull Activity activity) {
        transparentStatusBar(activity.getWindow());
    }

    private static View applyStatusBarColor(@NonNull Window window, int i4, boolean z3) {
        ViewGroup viewGroup = z3 ? (ViewGroup) window.getDecorView() : (ViewGroup) window.findViewById(R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag == null) {
            View viewCreateStatusBarView = createStatusBarView(window.getContext(), i4);
            viewGroup.addView(viewCreateStatusBarView);
            return viewCreateStatusBarView;
        }
        if (viewFindViewWithTag.getVisibility() == 8) {
            viewFindViewWithTag.setVisibility(0);
        }
        viewFindViewWithTag.setBackgroundColor(i4);
        return viewFindViewWithTag;
    }

    @RequiresApi(21)
    public static int getNavBarColor(@NonNull Window window) {
        return window.getNavigationBarColor();
    }

    private static void hideStatusBarView(@NonNull Window window) {
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    public static boolean isNavBarLightMode(@NonNull Window window) {
        return Build.VERSION.SDK_INT >= 26 && (window.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    public static boolean isNavBarVisible(@NonNull Window window) {
        boolean z3;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                z3 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i4);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(getResNameById(id)) && childAt.getVisibility() == 0) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (!z3) {
            return z3;
        }
        if (UtilsBridge.isSamsung() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(Utils.getApp().getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
            } catch (Exception unused) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }

    public static boolean isStatusBarLightMode(@NonNull Window window) {
        return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @RequiresApi(21)
    public static void setNavBarColor(@NonNull Window window, @ColorInt int i4) {
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(i4);
    }

    public static void setNavBarLightMode(@NonNull Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }

    public static void setNavBarVisibility(@NonNull Window window, boolean z3) {
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(getResNameById(id))) {
                childAt.setVisibility(z3 ? 0 : 4);
            }
        }
        if (z3) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    public static View setStatusBarColor(@NonNull Activity activity, @ColorInt int i4, boolean z3) {
        transparentStatusBar(activity);
        return applyStatusBarColor(activity, i4, z3);
    }

    public static void setStatusBarColor4Drawer(@NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i4, boolean z3) {
        Activity activityByContext = UtilsBridge.getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        drawerLayout.setFitsSystemWindows(false);
        setStatusBarColor(view, i4);
        int childCount = drawerLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            drawerLayout.getChildAt(i5).setFitsSystemWindows(false);
        }
        if (z3) {
            hideStatusBarView(activityByContext);
        } else {
            setStatusBarColor(activityByContext, i4, false);
        }
    }

    public static void setStatusBarLightMode(@NonNull Window window, boolean z3) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static void setStatusBarVisibility(@NonNull Window window, boolean z3) {
        if (z3) {
            window.clearFlags(1024);
            showStatusBarView(window);
            addMarginTopEqualStatusBarHeight(window);
        } else {
            window.addFlags(1024);
            hideStatusBarView(window);
            subtractMarginTopEqualStatusBarHeight(window);
        }
    }

    public static void transparentNavBar(@NonNull Window window) {
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        window.setNavigationBarColor(0);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
    }

    public static void transparentStatusBar(@NonNull Window window) {
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | LogType.UNEXP_ANR);
        window.setStatusBarColor(0);
    }

    public static View setStatusBarColor(@NonNull Window window, @ColorInt int i4) {
        return setStatusBarColor(window, i4, false);
    }

    public static View setStatusBarColor(@NonNull Window window, @ColorInt int i4, boolean z3) {
        transparentStatusBar(window);
        return applyStatusBarColor(window, i4, z3);
    }

    public static void setStatusBarColor(@NonNull View view, @ColorInt int i4) {
        Activity activityByContext = UtilsBridge.getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        view.setBackgroundColor(i4);
    }

    private static void subtractMarginTopEqualStatusBarHeight(@NonNull Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (viewFindViewWithTag == null) {
            return;
        }
        subtractMarginTopEqualStatusBarHeight(viewFindViewWithTag);
    }

    private static void addMarginTopEqualStatusBarHeight(@NonNull Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (viewFindViewWithTag == null) {
            return;
        }
        addMarginTopEqualStatusBarHeight(viewFindViewWithTag);
    }
}
