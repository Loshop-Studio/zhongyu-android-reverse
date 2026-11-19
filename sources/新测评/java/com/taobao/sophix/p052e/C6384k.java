package com.taobao.sophix.p052e;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.sophix.e.k */
/* loaded from: classes4.dex */
public class C6384k {

    /* renamed from: a */
    private static boolean f4975a = false;

    /* renamed from: b */
    private static List<a> f4976b = new ArrayList();

    /* renamed from: com.taobao.sophix.e.k$a */
    public static class a {

        /* renamed from: a */
        String f4977a;

        /* renamed from: b */
        int f4978b;

        public a(String str, int i10) {
            this.f4977a = str;
            this.f4978b = i10;
        }
    }

    /* renamed from: a */
    public static void m4741a(String str, int i10) {
        C6378e.m4709b("SupportUtils", "addModelToBlackList", "modelName", str, "sdkVersion", Integer.valueOf(i10));
        f4976b.add(new a(str, i10));
    }

    /* renamed from: b */
    private static boolean m4743b() {
        String str = Build.MODEL;
        int i10 = Build.VERSION.SDK_INT;
        for (a aVar : f4976b) {
            int i11 = aVar.f4978b;
            if (i10 == i11 || i11 == 0) {
                if (str.equals(aVar.f4977a)) {
                    return true;
                }
            }
        }
        try {
            String str2 = (String) C6381h.m4724a(Class.forName("android.os.SystemProperties"), "get", String.class).invoke(null, "ro.yunos.version");
            if (!TextUtils.isEmpty(str2)) {
                C6378e.m4711c("SupportUtils", "isInBlackList", "yun os version", str2);
            }
        } catch (Exception e10) {
            C6378e.m4708b("SupportUtils", "isInBlackList", e10, new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4742a() {
        return f4975a || !m4743b();
    }
}
