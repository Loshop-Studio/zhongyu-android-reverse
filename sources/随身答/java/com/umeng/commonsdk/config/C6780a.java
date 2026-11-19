package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.AbstractC6781d;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.util.ArrayList;
import p166l2.C8880b;
import p166l2.C8882d;
import p166l2.InterfaceC8881c;

/* renamed from: com.umeng.commonsdk.config.a */
/* loaded from: classes4.dex */
public class C6780a {

    /* renamed from: a */
    public static C8880b f6736a = C8880b.m13793d();

    /* renamed from: b */
    public static boolean f6737b = false;

    /* renamed from: c */
    public static Object f6738c = new Object();

    /* renamed from: com.umeng.commonsdk.config.a$b */
    public static class b {

        /* renamed from: a */
        public static final C6780a f6739a = new C6780a();
    }

    /* renamed from: a */
    public static Pair m6258a(String str) {
        Pair pair = new Pair(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length >= 2) {
                try {
                    long j9 = Long.parseLong(strArrSplit[0]);
                    return new Pair(Long.valueOf(j9), strArrSplit[1]);
                } catch (Throwable unused) {
                }
            }
        }
        return pair;
    }

    /* renamed from: b */
    public static C6780a m6259b() {
        return b.f6739a;
    }

    /* renamed from: e */
    public static boolean m6260e(String str) {
        synchronized (f6738c) {
            try {
                if (!f6737b) {
                    return false;
                }
                return C8880b.m13792c(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static boolean m6261f() {
        boolean z9;
        synchronized (f6738c) {
            z9 = f6737b;
        }
        return z9;
    }

    /* renamed from: c */
    public void m6262c(Context context) {
        String str;
        String str2 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {AbstractC6781d.a.class.getName(), AbstractC6781d.b.class.getName(), AbstractC6781d.c.class.getName(), AbstractC6781d.d.class.getName()};
        String strM6274h = AbstractC6782a.m6274h(context, "cfgfd", "1001@3758096383,2147483647,262143,2047");
        synchronized (f6738c) {
            try {
                Pair pairM6258a = m6258a(strM6274h);
                if (((Long) pairM6258a.first).longValue() > 1000 && (str = (String) pairM6258a.second) != null && str.length() > 0) {
                    str2 = str;
                }
                String[] strArrSplit = str2.split(",");
                int length = strArrSplit.length;
                if (length > 0) {
                    ArrayList arrayList = new ArrayList();
                    C8882d c8882d = new C8882d();
                    for (int i9 = 0; i9 < length; i9++) {
                        arrayList.add(c8882d);
                        ((InterfaceC8881c) arrayList.get(i9)).mo13797a(strArrSplit[i9], f6736a, AbstractC6781d.m6266b(strArr[i9]));
                    }
                }
                f6737b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public void m6263d(Context context, String str) {
        String str2;
        String str3 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {AbstractC6781d.a.class.getName(), AbstractC6781d.b.class.getName(), AbstractC6781d.c.class.getName(), AbstractC6781d.d.class.getName()};
        synchronized (f6738c) {
            try {
                f6736a.m13794a();
                if (str != null) {
                    Pair pairM6258a = m6258a(str);
                    if (((Long) pairM6258a.first).longValue() > 1000 && (str2 = (String) pairM6258a.second) != null && str2.length() > 0) {
                        str3 = str2;
                    }
                }
                String[] strArrSplit = str3.split(",");
                int length = strArrSplit.length;
                if (length > 0) {
                    ArrayList arrayList = new ArrayList();
                    C8882d c8882d = new C8882d();
                    for (int i9 = 0; i9 < length; i9++) {
                        arrayList.add(c8882d);
                        ((InterfaceC8881c) arrayList.get(i9)).mo13797a(strArrSplit[i9], f6736a, AbstractC6781d.m6266b(strArr[i9]));
                    }
                }
                f6737b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6780a() {
    }
}
