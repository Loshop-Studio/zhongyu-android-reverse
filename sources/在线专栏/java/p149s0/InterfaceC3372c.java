package p149s0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: s0.c */
/* loaded from: classes.dex */
public interface InterfaceC3372c extends Closeable {

    /* renamed from: s0.c$a */
    public static abstract class a {

        /* renamed from: a */
        public final int f11843a;

        public a(int i4) {
            this.f11843a = i4;
        }

        /* renamed from: a */
        private void m10259a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e4) {
                Log.w("SupportSQLite", "delete failed: ", e4);
            }
        }

        /* renamed from: b */
        public void mo3582b(InterfaceC3371b interfaceC3371b) {
        }

        /* renamed from: c */
        public void m10260c(InterfaceC3371b interfaceC3371b) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC3371b.getPath());
            if (!interfaceC3371b.isOpen()) {
                m10259a(interfaceC3371b.getPath());
                return;
            }
            List<Pair<String, String>> listMo3507g = null;
            try {
                try {
                    listMo3507g = interfaceC3371b.mo3507g();
                } catch (SQLiteException unused) {
                }
                try {
                    interfaceC3371b.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (listMo3507g != null) {
                    Iterator<Pair<String, String>> it = listMo3507g.iterator();
                    while (it.hasNext()) {
                        m10259a((String) it.next().second);
                    }
                } else {
                    m10259a(interfaceC3371b.getPath());
                }
            }
        }

        /* renamed from: d */
        public abstract void mo3583d(InterfaceC3371b interfaceC3371b);

        /* renamed from: e */
        public abstract void mo3584e(InterfaceC3371b interfaceC3371b, int i4, int i5);

        /* renamed from: f */
        public void mo3585f(InterfaceC3371b interfaceC3371b) {
        }

        /* renamed from: g */
        public abstract void mo3586g(InterfaceC3371b interfaceC3371b, int i4, int i5);
    }

    /* renamed from: s0.c$b */
    public static class b {

        /* renamed from: a */
        public final Context f11844a;

        /* renamed from: b */
        public final String f11845b;

        /* renamed from: c */
        public final a f11846c;

        /* renamed from: d */
        public final boolean f11847d;

        /* renamed from: s0.c$b$a */
        public static class a {

            /* renamed from: a */
            Context f11848a;

            /* renamed from: b */
            String f11849b;

            /* renamed from: c */
            a f11850c;

            /* renamed from: d */
            boolean f11851d;

            a(Context context) {
                this.f11848a = context;
            }

            /* renamed from: a */
            public b m10262a() {
                if (this.f11850c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f11848a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f11851d && TextUtils.isEmpty(this.f11849b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f11848a, this.f11849b, this.f11850c, this.f11851d);
            }

            /* renamed from: b */
            public a m10263b(a aVar) {
                this.f11850c = aVar;
                return this;
            }

            /* renamed from: c */
            public a m10264c(String str) {
                this.f11849b = str;
                return this;
            }

            /* renamed from: d */
            public a m10265d(boolean z3) {
                this.f11851d = z3;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z3) {
            this.f11844a = context;
            this.f11845b = str;
            this.f11846c = aVar;
            this.f11847d = z3;
        }

        /* renamed from: a */
        public static a m10261a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: s0.c$c */
    public interface c {
        /* renamed from: a */
        InterfaceC3372c mo3484a(b bVar);
    }

    /* renamed from: F */
    InterfaceC3371b mo3483F();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z3);
}
