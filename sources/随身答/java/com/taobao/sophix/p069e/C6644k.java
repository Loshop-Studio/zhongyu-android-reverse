package com.taobao.sophix.p069e;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.sophix.e.k */
/* loaded from: classes4.dex */
public class C6644k {

    /* renamed from: a */
    private static boolean f5552a = false;

    /* renamed from: b */
    private static List<a> f5553b = new ArrayList();

    /* renamed from: com.taobao.sophix.e.k$a */
    public static class a {

        /* renamed from: a */
        String f5554a;

        /* renamed from: b */
        int f5555b;

        public a(String str, int i9) {
            this.f5554a = str;
            this.f5555b = i9;
        }
    }

    /* renamed from: a */
    public static void m4920a(String str, int i9) {
        C6638e.m4888b("SupportUtils", "addModelToBlackList", "modelName", str, "sdkVersion", Integer.valueOf(i9));
        f5553b.add(new a(str, i9));
    }

    /* renamed from: b */
    private static boolean m4922b() {
        String str = Build.MODEL;
        int i9 = Build.VERSION.SDK_INT;
        for (a aVar : f5553b) {
            int i10 = aVar.f5555b;
            if (i9 == i10 || i10 == 0) {
                if (str.equals(aVar.f5554a)) {
                    return true;
                }
            }
        }
        try {
            String str2 = (String) C6641h.m4903a(Class.forName("android.os.SystemProperties"), "get", String.class).invoke(null, "ro.yunos.version");
            if (!TextUtils.isEmpty(str2)) {
                C6638e.m4890c("SupportUtils", "isInBlackList", "yun os version", str2);
            }
        } catch (Exception e10) {
            C6638e.m4887b("SupportUtils", "isInBlackList", e10, new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4921a() {
        return f5552a || !m4922b();
    }
}
