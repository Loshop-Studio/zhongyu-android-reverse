package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.C1953d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FieldManager {

    /* renamed from: a */
    private static final String f9016a = "cfgfd";

    /* renamed from: b */
    private static C1951b f9017b = C1951b.m7341b();

    /* renamed from: c */
    private static boolean f9018c = false;

    /* renamed from: d */
    private static Object f9019d = new Object();

    /* renamed from: com.umeng.commonsdk.config.FieldManager$a */
    private static class C1949a {

        /* renamed from: a */
        private static final FieldManager f9020a = new FieldManager();

        private C1949a() {
        }
    }

    /* renamed from: a */
    public static FieldManager m7329a() {
        return C1949a.f9020a;
    }

    public static boolean allow(String str) {
        synchronized (f9019d) {
            if (!f9018c) {
                return false;
            }
            return C1951b.m7340a(str);
        }
    }

    /* renamed from: b */
    public static boolean m7330b() {
        boolean z3;
        synchronized (f9019d) {
            z3 = f9018c;
        }
        return z3;
    }

    private FieldManager() {
    }

    /* renamed from: a */
    public void m7331a(Context context) {
        String str;
        String str2 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {C1953d.a.class.getName(), C1953d.b.class.getName(), C1953d.c.class.getName(), C1953d.d.class.getName()};
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", "1001@3758096383,2147483647,262143,2047");
        synchronized (f9019d) {
            Pair<Long, String> pairM7328a = m7328a(strImprintProperty);
            if (((Long) pairM7328a.first).longValue() > 1000 && (str = (String) pairM7328a.second) != null && str.length() > 0) {
                str2 = str;
            }
            String[] strArrSplit = str2.split(",");
            int length = strArrSplit.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C1956g c1956g = new C1956g();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(c1956g);
                    ((InterfaceC1954e) arrayList.get(i4)).mo7345a(strArrSplit[i4], f9017b, C1953d.m7347b(strArr[i4]));
                }
            }
            f9018c = true;
        }
    }

    /* renamed from: a */
    public void m7332a(Context context, String str) {
        String str2;
        String str3 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {C1953d.a.class.getName(), C1953d.b.class.getName(), C1953d.c.class.getName(), C1953d.d.class.getName()};
        synchronized (f9019d) {
            f9017b.m7342a();
            if (str != null) {
                Pair<Long, String> pairM7328a = m7328a(str);
                if (((Long) pairM7328a.first).longValue() > 1000 && (str2 = (String) pairM7328a.second) != null && str2.length() > 0) {
                    str3 = str2;
                }
            }
            String[] strArrSplit = str3.split(",");
            int length = strArrSplit.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C1956g c1956g = new C1956g();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(c1956g);
                    ((InterfaceC1954e) arrayList.get(i4)).mo7345a(strArrSplit[i4], f9017b, C1953d.m7347b(strArr[i4]));
                }
            }
            f9018c = true;
        }
    }

    /* renamed from: a */
    private static Pair<Long, String> m7328a(String str) {
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
