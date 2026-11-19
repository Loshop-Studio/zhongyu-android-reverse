package com.efs.sdk.base.p035a.p046h;

import android.content.Context;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.h.a */
/* loaded from: classes.dex */
public class C1315a {

    /* renamed from: a */
    private static String f7103a = "efs";

    /* renamed from: b */
    private static File f7104b;

    /* renamed from: a */
    public static void m5528a(String str) {
        f7103a = str;
    }

    /* renamed from: b */
    public static File m5529b(Context context, String str) {
        return new File(m5534g(context, str), "efs_config");
    }

    /* renamed from: c */
    public static File m5530c(Context context, String str) {
        return new File(m5534g(context, str), "efs_flow");
    }

    /* renamed from: d */
    public static File m5531d(Context context, String str) {
        File file = new File(m5534g(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: e */
    public static File m5532e(Context context, String str) {
        File file = new File(m5531d(context, str), String.valueOf(C1332g.m5580a()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static File m5533f(Context context, String str) {
        File file = new File(m5534g(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    private static File m5534g(Context context, String str) {
        if (f7104b == null) {
            synchronized (C1315a.class) {
                if (f7104b == null) {
                    f7104b = m5526a(context);
                }
            }
        }
        File file = new File(f7104b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static File m5526a(Context context) {
        File dir = context.getDir(f7103a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: a */
    public static File m5527a(Context context, String str) {
        return new File(m5534g(context, str), "efs_cst");
    }
}
