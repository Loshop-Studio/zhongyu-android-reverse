package com.taobao.sophix.p048d.p049a;

import android.text.TextUtils;
import com.taobao.sophix.p052e.C6378e;

/* renamed from: com.taobao.sophix.d.a.a */
/* loaded from: classes4.dex */
public class C6369a {

    /* renamed from: a */
    public static String f4946a;

    /* renamed from: d */
    private static final String[] f4949d = {"hotfix-api.aliyuncs.com", "pre-hotfix-api.aliyun.com", "10.101.84.136"};

    /* renamed from: b */
    public static String f4947b = "https://";

    /* renamed from: c */
    public static boolean f4948c = true;

    /* renamed from: a */
    public static void m4658a(int i10, boolean z9) {
        if (!TextUtils.isEmpty(f4946a)) {
            C6378e.m4712d("ConnectConfig", "fail to set env because host is already set", new Object[0]);
        } else {
            if (i10 < 0 || i10 > 2) {
                return;
            }
            f4946a = f4949d[i10];
            m4660a(z9);
        }
    }

    /* renamed from: a */
    public static void m4659a(String str, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f4946a = str;
        m4660a(z9);
        f4948c = false;
        C6378e.m4709b("ConnectConfig", "setHost", "host", str, "https", Boolean.valueOf(z9));
    }

    /* renamed from: a */
    private static void m4660a(boolean z9) {
        if (z9) {
            f4947b = "https://";
        } else {
            f4947b = "http://";
        }
    }
}
