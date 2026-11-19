package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.process.c */
/* loaded from: classes.dex */
class C1933c {

    /* renamed from: a */
    private static C1933c f8977a;

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f8978b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private Context f8979c;

    private C1933c() {
    }

    /* renamed from: a */
    static C1933c m7292a(Context context) {
        if (f8977a == null) {
            synchronized (C1933c.class) {
                if (f8977a == null) {
                    f8977a = new C1933c();
                }
            }
        }
        C1933c c1933c = f8977a;
        c1933c.f8979c = context;
        return c1933c;
    }

    /* renamed from: c */
    private a m7293c(String str) {
        if (this.f8978b.get(str) != null) {
            return this.f8978b.get(str);
        }
        a aVarM7296a = a.m7296a(this.f8979c, str);
        this.f8978b.put(str, aVarM7296a);
        return aVarM7296a;
    }

    /* renamed from: b */
    synchronized void m7295b(String str) {
        m7293c(str).m7298b();
    }

    /* renamed from: com.umeng.analytics.process.c$a */
    static class a {

        /* renamed from: a */
        private AtomicInteger f8980a = new AtomicInteger();

        /* renamed from: b */
        private SQLiteOpenHelper f8981b;

        /* renamed from: c */
        private SQLiteDatabase f8982c;

        private a() {
        }

        /* renamed from: a */
        static a m7296a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f8981b = C1932b.m7288a(appContext, str);
            return aVar;
        }

        /* renamed from: b */
        synchronized void m7298b() {
            try {
                if (this.f8980a.decrementAndGet() == 0) {
                    this.f8982c.close();
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        synchronized SQLiteDatabase m7297a() {
            if (this.f8980a.incrementAndGet() == 1) {
                this.f8982c = this.f8981b.getWritableDatabase();
            }
            return this.f8982c;
        }
    }

    /* renamed from: a */
    synchronized SQLiteDatabase m7294a(String str) {
        return m7293c(str).m7297a();
    }
}
