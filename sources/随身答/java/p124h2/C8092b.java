package p124h2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p240s2.C9468a;

/* renamed from: h2.b */
/* loaded from: classes4.dex */
public class C8092b {

    /* renamed from: c */
    public static C8092b f13791c;

    /* renamed from: a */
    public ConcurrentHashMap f13792a = new ConcurrentHashMap();

    /* renamed from: b */
    public Context f13793b;

    /* renamed from: h2.b$a */
    public static class a {

        /* renamed from: a */
        public AtomicInteger f13794a = new AtomicInteger();

        /* renamed from: b */
        public SQLiteOpenHelper f13795b;

        /* renamed from: c */
        public SQLiteDatabase f13796c;

        /* renamed from: b */
        public static a m12925b(Context context, String str) {
            Context contextM15647b = C9468a.m15647b(context);
            a aVar = new a();
            aVar.f13795b = C8091a.m12917a(contextM15647b, str);
            return aVar;
        }

        /* renamed from: a */
        public synchronized SQLiteDatabase m12926a() {
            try {
                if (this.f13794a.incrementAndGet() == 1) {
                    this.f13796c = this.f13795b.getWritableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f13796c;
        }

        /* renamed from: c */
        public synchronized void m12927c() {
            try {
                if (this.f13794a.decrementAndGet() == 0) {
                    this.f13796c.close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static C8092b m12921b(Context context) {
        if (f13791c == null) {
            synchronized (C8092b.class) {
                try {
                    if (f13791c == null) {
                        f13791c = new C8092b();
                    }
                } finally {
                }
            }
        }
        C8092b c8092b = f13791c;
        c8092b.f13793b = context;
        return c8092b;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m12922a(String str) {
        return m12924d(str).m12926a();
    }

    /* renamed from: c */
    public synchronized void m12923c(String str) {
        m12924d(str).m12927c();
    }

    /* renamed from: d */
    public final a m12924d(String str) {
        if (this.f13792a.get(str) != null) {
            return (a) this.f13792a.get(str);
        }
        a aVarM12925b = a.m12925b(this.f13793b, str);
        this.f13792a.put(str, aVarM12925b);
        return aVarM12925b;
    }
}
