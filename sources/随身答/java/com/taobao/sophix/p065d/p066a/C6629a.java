package com.taobao.sophix.p065d.p066a;

import android.text.TextUtils;
import com.taobao.sophix.p069e.C6638e;

/* renamed from: com.taobao.sophix.d.a.a */
/* loaded from: classes4.dex */
public class C6629a {

    /* renamed from: a */
    public static String f5523a;

    /* renamed from: d */
    private static final String[] f5526d = {"hotfix-api.aliyuncs.com", "pre-hotfix-api.aliyun.com", "10.101.84.136"};

    /* renamed from: b */
    public static String f5524b = "https://";

    /* renamed from: c */
    public static boolean f5525c = true;

    /* renamed from: a */
    public static void m4837a(int i9, boolean z9) {
        if (!TextUtils.isEmpty(f5523a)) {
            C6638e.m4891d("ConnectConfig", "fail to set env because host is already set", new Object[0]);
        } else {
            if (i9 < 0 || i9 > 2) {
                return;
            }
            f5523a = f5526d[i9];
            m4839a(z9);
        }
    }

    /* renamed from: a */
    public static void m4838a(String str, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f5523a = str;
        m4839a(z9);
        f5525c = false;
        C6638e.m4888b("ConnectConfig", "setHost", "host", str, "https", Boolean.valueOf(z9));
    }

    /* renamed from: a */
    private static void m4839a(boolean z9) {
        if (z9) {
            f5524b = "https://";
        } else {
            f5524b = "http://";
        }
    }
}
