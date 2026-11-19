package com.taobao.sophix.p099e;

import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.sophix.e.k */
/* loaded from: classes5.dex */
public class C7750k {

    /* renamed from: a */
    private static boolean f13417a = false;

    /* renamed from: b */
    private static List<a> f13418b = new ArrayList();

    /* renamed from: com.taobao.sophix.e.k$a */
    public static class a {

        /* renamed from: a */
        String f13419a;

        /* renamed from: b */
        int f13420b;

        public a(String str, int i10) {
            this.f13419a = str;
            this.f13420b = i10;
        }
    }

    /* renamed from: a */
    public static void m10432a(String str, int i10) {
        C7744e.m10400b("SupportUtils", "addModelToBlackList", "modelName", str, Constants.KEY_SDK_VERSION, Integer.valueOf(i10));
        f13418b.add(new a(str, i10));
    }

    /* renamed from: b */
    private static boolean m10434b() {
        String str = Build.MODEL;
        int i10 = Build.VERSION.SDK_INT;
        for (a aVar : f13418b) {
            int i11 = aVar.f13420b;
            if (i10 == i11 || i11 == 0) {
                if (str.equals(aVar.f13419a)) {
                    return true;
                }
            }
        }
        try {
            String str2 = (String) C7747h.m10415a(Class.forName("android.os.SystemProperties"), "get", String.class).invoke(null, "ro.yunos.version");
            if (!TextUtils.isEmpty(str2)) {
                C7744e.m10402c("SupportUtils", "isInBlackList", "yun os version", str2);
            }
        } catch (Exception e10) {
            C7744e.m10399b("SupportUtils", "isInBlackList", e10, new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m10433a() {
        return f13417a || !m10434b();
    }
}
