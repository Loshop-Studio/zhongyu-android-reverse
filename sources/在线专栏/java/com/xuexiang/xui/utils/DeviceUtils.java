package com.xuexiang.xui.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import org.android.agoo.common.AgooConstants;

@SuppressLint({"PrivateApi"})
/* loaded from: classes.dex */
public class DeviceUtils {
    private static final String ESSENTIAL = "essential";
    private static final String FLYME = "flyme";
    private static final String KEY_FLYME_VERSION_NAME = "ro.build.display.id";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String ZTEC2016 = "zte c2016";
    private static final String ZUKZ1 = "zuk z1";
    private static String sFlymeVersionName;
    private static String sMiuiVersionName;
    private static final String[] MEIZUBOARD = {"m9", "M9", "mx", "MX"};
    private static boolean sIsTabletChecked = false;
    private static boolean sIsTabletValue = false;
    private static final String BRAND = Build.BRAND.toLowerCase();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    static {
        FileInputStream fileInputStream;
        Exception e4;
        Properties properties = new Properties();
        ?? r4 = 26;
        if (Build.VERSION.SDK_INT < 26) {
            Closeable closeable = null;
            try {
                try {
                    fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                    try {
                        properties.load(fileInputStream);
                        Utils.closeIOQuietly(fileInputStream);
                        r4 = fileInputStream;
                    } catch (Exception e5) {
                        e4 = e5;
                        e4.printStackTrace();
                        Utils.closeIOQuietly(fileInputStream);
                        r4 = fileInputStream;
                        Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                        sMiuiVersionName = getLowerCaseName(properties, declaredMethod, KEY_MIUI_VERSION_NAME);
                        sFlymeVersionName = getLowerCaseName(properties, declaredMethod, KEY_FLYME_VERSION_NAME);
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable = r4;
                    Utils.closeIOQuietly(closeable);
                    throw th;
                }
            } catch (Exception e6) {
                fileInputStream = null;
                e4 = e6;
            } catch (Throwable th2) {
                th = th2;
                Utils.closeIOQuietly(closeable);
                throw th;
            }
        }
        try {
            Method declaredMethod2 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            sMiuiVersionName = getLowerCaseName(properties, declaredMethod2, KEY_MIUI_VERSION_NAME);
            sFlymeVersionName = getLowerCaseName(properties, declaredMethod2, KEY_FLYME_VERSION_NAME);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private DeviceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static boolean _isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    @TargetApi(19)
    private static boolean checkOp(Context context, int i4) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getDeclaredMethod("checkOp", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i4), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static String getLowerCaseName(Properties properties, Method method, String str) {
        String property = properties.getProperty(str);
        if (property == null) {
            try {
                property = (String) method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        return property != null ? property.toLowerCase() : property;
    }

    public static boolean isEssentialPhone() {
        return BRAND.contains(ESSENTIAL);
    }

    public static boolean isFloatWindowOpAllowed(Context context) {
        return checkOp(context, 24);
    }

    public static boolean isFlyme() {
        return !TextUtils.isEmpty(sFlymeVersionName) && sFlymeVersionName.contains(FLYME);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isFlymeVersionHigher5_2_4() throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = com.xuexiang.xui.utils.DeviceUtils.sFlymeVersionName
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6d
            java.lang.String r3 = ""
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            java.lang.String r0 = "(\\d+\\.){2}\\d"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.lang.String r4 = com.xuexiang.xui.utils.DeviceUtils.sFlymeVersionName
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r4 = r0.find()
            if (r4 == 0) goto L6d
            java.lang.String r0 = r0.group()
            if (r0 == 0) goto L6d
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6d
            java.lang.String r3 = "\\."
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r4 = 3
            if (r3 != r4) goto L6d
            r3 = r0[r1]
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = 5
            if (r3 >= r4) goto L41
        L3f:
            r0 = 0
            goto L6e
        L41:
            r3 = r0[r1]
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 <= r4) goto L4a
            goto L6d
        L4a:
            r3 = r0[r2]
            int r3 = java.lang.Integer.parseInt(r3)
            r5 = 2
            if (r3 >= r5) goto L54
            goto L3f
        L54:
            r3 = r0[r2]
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 <= r5) goto L5d
            goto L6d
        L5d:
            r3 = r0[r5]
            int r3 = java.lang.Integer.parseInt(r3)
            r6 = 4
            if (r3 >= r6) goto L67
            goto L3f
        L67:
            r0 = r0[r5]
            int r0 = java.lang.Integer.parseInt(r0)
        L6d:
            r0 = 1
        L6e:
            boolean r3 = isMeizu()
            if (r3 == 0) goto L77
            if (r0 == 0) goto L77
            r1 = 1
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.utils.DeviceUtils.isFlymeVersionHigher5_2_4():boolean");
    }

    public static boolean isHuawei() {
        String str = BRAND;
        return str.contains(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI) || str.contains(AgooConstants.MESSAGE_SYSTEM_SOURCE_HONOR);
    }

    public static boolean isMIUI() {
        return !TextUtils.isEmpty(sMiuiVersionName);
    }

    public static boolean isMIUIV5() {
        return "v5".equals(sMiuiVersionName);
    }

    public static boolean isMIUIV6() {
        return "v6".equals(sMiuiVersionName);
    }

    public static boolean isMIUIV7() {
        return "v7".equals(sMiuiVersionName);
    }

    public static boolean isMIUIV8() {
        return "v8".equals(sMiuiVersionName);
    }

    public static boolean isMIUIV9() {
        return "v9".equals(sMiuiVersionName);
    }

    public static boolean isMeizu() {
        return isPhone(MEIZUBOARD) || isFlyme();
    }

    public static boolean isOppo() {
        return BRAND.contains(AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO);
    }

    private static boolean isPhone(String[] strArr) {
        String str = Build.BOARD;
        if (str == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTablet(Context context) {
        if (sIsTabletChecked) {
            return sIsTabletValue;
        }
        boolean z_isTablet = _isTablet(context);
        sIsTabletValue = z_isTablet;
        sIsTabletChecked = true;
        return z_isTablet;
    }

    public static boolean isVivo() {
        String str = BRAND;
        return str.contains(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO) || str.contains("bbk");
    }

    public static boolean isXiaomi() {
        return AgooConstants.MESSAGE_SYSTEM_SOURCE_XIAOMI.equals(Build.MANUFACTURER.toLowerCase());
    }

    public static boolean isZTKC2016() {
        String str = Build.MODEL;
        return str != null && str.toLowerCase().contains(ZTEC2016);
    }

    public static boolean isZUKZ1() {
        String str = Build.MODEL;
        return str != null && str.toLowerCase().contains(ZUKZ1);
    }
}
