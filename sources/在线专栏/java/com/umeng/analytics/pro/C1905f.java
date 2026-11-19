package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.pro.f */
/* loaded from: classes.dex */
class C1905f {

    /* renamed from: b */
    private static SQLiteOpenHelper f8708b;

    /* renamed from: d */
    private static Context f8709d;

    /* renamed from: a */
    private AtomicInteger f8710a;

    /* renamed from: c */
    private SQLiteDatabase f8711c;

    /* renamed from: com.umeng.analytics.pro.f$a */
    private static class a {

        /* renamed from: a */
        private static final C1905f f8712a = new C1905f();

        private a() {
        }
    }

    /* renamed from: a */
    public static C1905f m7068a(Context context) {
        if (f8709d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f8709d = applicationContext;
            f8708b = C1904e.m7057a(applicationContext);
        }
        return a.f8712a;
    }

    /* renamed from: b */
    public synchronized void m7070b() {
        try {
            if (this.f8710a.decrementAndGet() == 0) {
                this.f8711c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private C1905f() {
        this.f8710a = new AtomicInteger();
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m7069a() {
        if (this.f8710a.incrementAndGet() == 1) {
            this.f8711c = f8708b.getWritableDatabase();
        }
        return this.f8711c;
    }
}
