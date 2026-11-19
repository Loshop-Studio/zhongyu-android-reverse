package com.efs.sdk.base.p020a.p031h;

import android.content.Context;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.h.a */
/* loaded from: classes2.dex */
public class C2943a {

    /* renamed from: a */
    private static String f1133a = "efs";

    /* renamed from: b */
    private static File f1134b;

    /* renamed from: a */
    public static void m2169a(String str) {
        f1133a = str;
    }

    /* renamed from: b */
    public static File m2170b(Context context, String str) {
        return new File(m2175g(context, str), "efs_config");
    }

    /* renamed from: c */
    public static File m2171c(Context context, String str) {
        return new File(m2175g(context, str), "efs_flow");
    }

    /* renamed from: d */
    public static File m2172d(Context context, String str) {
        File file = new File(m2175g(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: e */
    public static File m2173e(Context context, String str) {
        File file = new File(m2172d(context, str), String.valueOf(C2960g.m2221a()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static File m2174f(Context context, String str) {
        File file = new File(m2175g(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    private static File m2175g(Context context, String str) {
        if (f1134b == null) {
            synchronized (C2943a.class) {
                if (f1134b == null) {
                    f1134b = m2167a(context);
                }
            }
        }
        File file = new File(f1134b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static File m2167a(Context context) {
        File dir = context.getDir(f1133a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: a */
    public static File m2168a(Context context, String str) {
        return new File(m2175g(context, str), "efs_cst");
    }
}
