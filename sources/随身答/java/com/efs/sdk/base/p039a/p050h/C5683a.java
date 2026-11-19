package com.efs.sdk.base.p039a.p050h;

import android.content.Context;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.h.a */
/* loaded from: classes3.dex */
public class C5683a {

    /* renamed from: a */
    private static String f4737a = "efs";

    /* renamed from: b */
    private static File f4738b;

    /* renamed from: a */
    public static void m4138a(String str) {
        f4737a = str;
    }

    /* renamed from: b */
    public static File m4139b(Context context, String str) {
        return new File(m4144g(context, str), "efs_config");
    }

    /* renamed from: c */
    public static File m4140c(Context context, String str) {
        return new File(m4144g(context, str), "efs_flow");
    }

    /* renamed from: d */
    public static File m4141d(Context context, String str) {
        File file = new File(m4144g(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: e */
    public static File m4142e(Context context, String str) {
        File file = new File(m4141d(context, str), String.valueOf(C5700g.m4190a()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static File m4143f(Context context, String str) {
        File file = new File(m4144g(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    private static File m4144g(Context context, String str) {
        if (f4738b == null) {
            synchronized (C5683a.class) {
                try {
                    if (f4738b == null) {
                        f4738b = m4136a(context);
                    }
                } finally {
                }
            }
        }
        File file = new File(f4738b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static File m4136a(Context context) {
        File dir = context.getDir(f4737a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: a */
    public static File m4137a(Context context, String str) {
        return new File(m4144g(context, str), "efs_cst");
    }
}
