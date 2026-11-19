package com.taobao.sophix.p095d.p096a;

import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.sophix.p099e.C7744e;

/* renamed from: com.taobao.sophix.d.a.a */
/* loaded from: classes5.dex */
public class C7735a {

    /* renamed from: a */
    public static String f13388a;

    /* renamed from: d */
    private static final String[] f13391d = {"hotfix-api.aliyuncs.com", "pre-hotfix-api.aliyun.com", "10.101.84.136"};

    /* renamed from: b */
    public static String f13389b = "https://";

    /* renamed from: c */
    public static boolean f13390c = true;

    /* renamed from: a */
    public static void m10349a(int i10, boolean z10) {
        if (!TextUtils.isEmpty(f13388a)) {
            C7744e.m10403d("ConnectConfig", "fail to set env because host is already set", new Object[0]);
        } else {
            if (i10 < 0 || i10 > 2) {
                return;
            }
            f13388a = f13391d[i10];
            m10351a(z10);
        }
    }

    /* renamed from: a */
    public static void m10350a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f13388a = str;
        m10351a(z10);
        f13390c = false;
        C7744e.m10400b("ConnectConfig", "setHost", Constants.KEY_HOST, str, "https", Boolean.valueOf(z10));
    }

    /* renamed from: a */
    private static void m10351a(boolean z10) {
        if (z10) {
            f13389b = "https://";
        } else {
            f13389b = "http://";
        }
    }
}
