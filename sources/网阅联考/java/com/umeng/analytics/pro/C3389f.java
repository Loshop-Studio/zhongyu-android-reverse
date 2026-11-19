package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.pro.f */
/* loaded from: classes2.dex */
class C3389f {

    /* renamed from: b */
    private static SQLiteOpenHelper f2116b;

    /* renamed from: d */
    private static Context f2117d;

    /* renamed from: a */
    private AtomicInteger f2118a;

    /* renamed from: c */
    private SQLiteDatabase f2119c;

    /* renamed from: com.umeng.analytics.pro.f$a */
    public static class a {

        /* renamed from: a */
        private static final C3389f f2120a = new C3389f();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3389f m3145a(Context context) {
        if (f2117d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f2117d = applicationContext;
            f2116b = C3388e.m3134a(applicationContext);
        }
        return a.f2120a;
    }

    /* renamed from: b */
    public synchronized void m3147b() {
        try {
            if (this.f2118a.decrementAndGet() == 0) {
                this.f2119c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private C3389f() {
        this.f2118a = new AtomicInteger();
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m3146a() {
        if (this.f2118a.incrementAndGet() == 1) {
            this.f2119c = f2116b.getWritableDatabase();
        }
        return this.f2119c;
    }
}
