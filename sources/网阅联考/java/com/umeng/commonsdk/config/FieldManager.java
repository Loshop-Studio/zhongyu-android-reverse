package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.C3437d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FieldManager {

    /* renamed from: a */
    private static final String f2424a = "cfgfd";

    /* renamed from: b */
    private static C3435b f2425b = C3435b.m3418b();

    /* renamed from: c */
    private static boolean f2426c = false;

    /* renamed from: d */
    private static Object f2427d = new Object();

    /* renamed from: com.umeng.commonsdk.config.FieldManager$a */
    public static class C3433a {

        /* renamed from: a */
        private static final FieldManager f2428a = new FieldManager();

        private C3433a() {
        }
    }

    /* renamed from: a */
    public static FieldManager m3406a() {
        return C3433a.f2428a;
    }

    public static boolean allow(String str) {
        synchronized (f2427d) {
            if (!f2426c) {
                return false;
            }
            return C3435b.m3417a(str);
        }
    }

    /* renamed from: b */
    public static boolean m3407b() {
        boolean z3;
        synchronized (f2427d) {
            z3 = f2426c;
        }
        return z3;
    }

    private FieldManager() {
    }

    /* renamed from: a */
    public void m3408a(Context context) {
        String str;
        String str2 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {C3437d.a.class.getName(), C3437d.b.class.getName(), C3437d.c.class.getName(), C3437d.d.class.getName()};
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", "1001@3758096383,2147483647,262143,2047");
        synchronized (f2427d) {
            Pair<Long, String> pairM3405a = m3405a(strImprintProperty);
            if (((Long) pairM3405a.first).longValue() > 1000 && (str = (String) pairM3405a.second) != null && str.length() > 0) {
                str2 = str;
            }
            String[] strArrSplit = str2.split(",");
            int length = strArrSplit.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C3440g c3440g = new C3440g();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(c3440g);
                    ((InterfaceC3438e) arrayList.get(i4)).mo3422a(strArrSplit[i4], f2425b, C3437d.m3424b(strArr[i4]));
                }
            }
            f2426c = true;
        }
    }

    /* renamed from: a */
    public void m3409a(Context context, String str) {
        String str2;
        String str3 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {C3437d.a.class.getName(), C3437d.b.class.getName(), C3437d.c.class.getName(), C3437d.d.class.getName()};
        synchronized (f2427d) {
            f2425b.m3419a();
            if (str != null) {
                Pair<Long, String> pairM3405a = m3405a(str);
                if (((Long) pairM3405a.first).longValue() > 1000 && (str2 = (String) pairM3405a.second) != null && str2.length() > 0) {
                    str3 = str2;
                }
            }
            String[] strArrSplit = str3.split(",");
            int length = strArrSplit.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C3440g c3440g = new C3440g();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(c3440g);
                    ((InterfaceC3438e) arrayList.get(i4)).mo3422a(strArrSplit[i4], f2425b, C3437d.m3424b(strArr[i4]));
                }
            }
            f2426c = true;
        }
    }

    /* renamed from: a */
    private static Pair<Long, String> m3405a(String str) {
        Pair<Long, String> pair = new Pair<>(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length < 2) {
                return pair;
            }
            try {
                long j4 = Long.parseLong(strArrSplit[0]);
                return new Pair<>(Long.valueOf(j4), strArrSplit[1]);
            } catch (Throwable unused) {
            }
        }
        return pair;
    }
}
