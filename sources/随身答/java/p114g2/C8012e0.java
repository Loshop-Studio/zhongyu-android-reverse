package p114g2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g2.e0 */
/* loaded from: classes4.dex */
public class C8012e0 {

    /* renamed from: c */
    public static SQLiteOpenHelper f13493c;

    /* renamed from: d */
    public static Context f13494d;

    /* renamed from: a */
    public AtomicInteger f13495a;

    /* renamed from: b */
    public SQLiteDatabase f13496b;

    /* renamed from: g2.e0$b */
    public static class b {

        /* renamed from: a */
        public static final C8012e0 f13497a = new C8012e0();
    }

    /* renamed from: b */
    public static C8012e0 m12585b(Context context) {
        if (f13494d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f13494d = applicationContext;
            f13493c = C8010d0.m12574a(applicationContext);
        }
        return b.f13497a;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m12586a() {
        try {
            if (this.f13495a.incrementAndGet() == 1) {
                this.f13496b = f13493c.getWritableDatabase();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13496b;
    }

    /* renamed from: c */
    public synchronized void m12587c() {
        try {
            if (this.f13495a.decrementAndGet() == 0) {
                this.f13496b.close();
            }
        } catch (Throwable unused) {
        }
    }

    public C8012e0() {
        this.f13495a = new AtomicInteger();
    }
}
