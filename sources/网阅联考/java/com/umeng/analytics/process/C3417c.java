package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.process.c */
/* loaded from: classes2.dex */
class C3417c {

    /* renamed from: a */
    private static C3417c f2385a;

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f2386b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private Context f2387c;

    private C3417c() {
    }

    /* renamed from: a */
    public static C3417c m3369a(Context context) {
        if (f2385a == null) {
            synchronized (C3417c.class) {
                if (f2385a == null) {
                    f2385a = new C3417c();
                }
            }
        }
        C3417c c3417c = f2385a;
        c3417c.f2387c = context;
        return c3417c;
    }

    /* renamed from: c */
    private a m3370c(String str) {
        if (this.f2386b.get(str) != null) {
            return this.f2386b.get(str);
        }
        a aVarM3373a = a.m3373a(this.f2387c, str);
        this.f2386b.put(str, aVarM3373a);
        return aVarM3373a;
    }

    /* renamed from: b */
    public synchronized void m3372b(String str) {
        m3370c(str).m3375b();
    }

    /* renamed from: com.umeng.analytics.process.c$a */
    public static class a {

        /* renamed from: a */
        private AtomicInteger f2388a = new AtomicInteger();

        /* renamed from: b */
        private SQLiteOpenHelper f2389b;

        /* renamed from: c */
        private SQLiteDatabase f2390c;

        private a() {
        }

        /* renamed from: a */
        public static a m3373a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f2389b = C3416b.m3365a(appContext, str);
            return aVar;
        }

        /* renamed from: b */
        public synchronized void m3375b() {
            try {
                if (this.f2388a.decrementAndGet() == 0) {
                    this.f2390c.close();
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public synchronized SQLiteDatabase m3374a() {
            if (this.f2388a.incrementAndGet() == 1) {
                this.f2390c = this.f2389b.getWritableDatabase();
            }
            return this.f2390c;
        }
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m3371a(String str) {
        return m3370c(str).m3374a();
    }
}
