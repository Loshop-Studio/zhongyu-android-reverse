package com.xuexiang.xui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.ViewUtils;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.calligraphy3.TypefaceUtils;
import p120m2.C2864d;

/* loaded from: classes.dex */
public class XUI {
    private static Application sContext;
    private static String sDefaultFontAssetPath;
    private static boolean sIsTabletChecked;
    private static int sScreenType;

    private static int checkScreenSize(Context context) {
        int i4 = context.getResources().getConfiguration().screenLayout & 15;
        if (i4 >= 3) {
            return i4 >= 4 ? 3 : 2;
        }
        return 1;
    }

    public static void debug(String str) {
        UILog.debug(str);
    }

    public static Context getContext() {
        testInitialize();
        return sContext;
    }

    public static String getDefaultFontAssetPath() {
        return sDefaultFontAssetPath;
    }

    public static Typeface getDefaultTypeface() {
        if (TextUtils.isEmpty(sDefaultFontAssetPath)) {
            return null;
        }
        return TypefaceUtils.load(getContext().getAssets(), sDefaultFontAssetPath);
    }

    public static int getMainThemeColor(Context context) {
        return ThemeUtils.getMainThemeColor(context);
    }

    public static int getScreenType() {
        if (sIsTabletChecked) {
            return sScreenType;
        }
        int iCheckScreenSize = checkScreenSize(getContext());
        sScreenType = iCheckScreenSize;
        sIsTabletChecked = true;
        return iCheckScreenSize;
    }

    public static void init(Application application) {
        sContext = application;
    }

    public static void initFontStyle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sDefaultFontAssetPath = str;
        C2864d.m9653c(C2864d.m9652b().m9654a(new CalligraphyInterceptor(new CalligraphyConfig.Builder().setDefaultFontPath(str).setFontAttrId(C2042R.attr.fontPath).build())).m9655b());
    }

    public static void initTheme(Activity activity) {
        int screenType = getScreenType();
        if (screenType == 1) {
            activity.setTheme(C2042R.style.XUITheme_Phone);
        } else if (screenType == 2) {
            activity.setTheme(C2042R.style.XUITheme_Tablet_Small);
        } else {
            activity.setTheme(C2042R.style.XUITheme_Tablet_Big);
        }
    }

    public static boolean isTablet() {
        return getScreenType() == 2 || getScreenType() == 3;
    }

    public static void setViewsFont(View... viewArr) {
        ViewUtils.setViewsFont(viewArr);
    }

    private static void testInitialize() {
        if (sContext == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }

    public static void debug(boolean z3) {
        UILog.debug(z3);
    }

    public static Typeface getDefaultTypeface(String str) {
        if (TextUtils.isEmpty(str)) {
            str = sDefaultFontAssetPath;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(getContext().getAssets(), str);
    }
}
