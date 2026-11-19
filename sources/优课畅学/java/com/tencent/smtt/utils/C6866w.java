package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.smtt.utils.w */
/* loaded from: classes4.dex */
public class C6866w {

    /* renamed from: a */
    private static String f7006a = null;

    /* renamed from: b */
    private static String f7007b = "GA";

    /* renamed from: c */
    private static String f7008c = "GE";

    /* renamed from: d */
    private static String f7009d = "9422";

    /* renamed from: e */
    private static String f7010e = "0";

    /* renamed from: f */
    private static String f7011f = "";

    /* renamed from: g */
    private static boolean f7012g = false;

    /* renamed from: h */
    private static boolean f7013h = false;

    /* renamed from: i */
    private static boolean f7014i = false;

    /* renamed from: a */
    private static String m6378a() {
        return " " + Build.MODEL.replaceAll("[ |\\/|\\_|\\&|\\|]", "") + " ";
    }

    /* renamed from: b */
    private static int m6383b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getWidth();
        }
        return -1;
    }

    /* renamed from: c */
    private static int m6384c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getHeight();
        }
        return -1;
    }

    /* renamed from: d */
    private static boolean m6385d(Context context) {
        if (f7013h) {
            return f7014i;
        }
        boolean z10 = (Math.min(m6383b(context), m6384c(context)) * 160) / m6386e(context) >= 700;
        f7014i = z10;
        f7013h = true;
        return z10;
    }

    /* renamed from: e */
    private static int m6386e(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return 160;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    /* renamed from: a */
    public static String m6379a(Context context) throws PackageManager.NameNotFoundException {
        if (!TextUtils.isEmpty(f7006a)) {
            return f7006a;
        }
        String strM6380a = m6380a(context, String.valueOf(WebView.getTbsSDKVersion(context)), "0", f7007b, f7008c, f7009d, f7010e, f7011f, f7012g);
        f7006a = strM6380a;
        return strM6380a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|2|48|3|(3:52|4|(1:6)(1:7))|14|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)(1:31)|32|50|33|34|35|(1:37)|38|(3:54|39|40)|41|(1:43)|44|45|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m6380a(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C6866w.m6380a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static String m6381a(String str) {
        return str.equals(TbsConfig.APP_WX) ? "WX" : str.equals(TbsConfig.APP_QQ) ? "QQ" : str.equals(TbsConfig.APP_QZONE) ? "QZ" : str.equals(TbsConfig.APP_QB) ? "QB" : "TRD";
    }

    /* renamed from: a */
    private static void m6382a(StringBuilder sb, String str, String str2) {
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
    }
}
