package p153t0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* renamed from: t0.b */
/* loaded from: classes.dex */
class C3397b implements InterfaceC3372c {

    /* renamed from: a */
    private final Context f11936a;

    /* renamed from: b */
    private final String f11937b;

    /* renamed from: c */
    private final InterfaceC3372c.a f11938c;

    /* renamed from: d */
    private final boolean f11939d;

    /* renamed from: e */
    private final Object f11940e = new Object();

    /* renamed from: f */
    private a f11941f;

    /* renamed from: g */
    private boolean f11942g;

    /* renamed from: t0.b$a */
    static class a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C3396a[] f11943a;

        /* renamed from: b */
        final InterfaceC3372c.a f11944b;

        /* renamed from: c */
        private boolean f11945c;

        /* renamed from: t0.b$a$a, reason: collision with other inner class name */
        class C3549a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ InterfaceC3372c.a f11946a;

            /* renamed from: b */
            final /* synthetic */ C3396a[] f11947b;

            C3549a(InterfaceC3372c.a aVar, C3396a[] c3396aArr) {
                this.f11946a = aVar;
                this.f11947b = c3396aArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f11946a.m10260c(a.m10376b(this.f11947b, sQLiteDatabase));
            }
        }

        a(Context context, String str, C3396a[] c3396aArr, InterfaceC3372c.a aVar) {
            super(context, str, null, aVar.f11843a, new C3549a(aVar, c3396aArr));
            this.f11944b = aVar;
            this.f11943a = c3396aArr;
        }

        /* renamed from: b */
        static C3396a m10376b(C3396a[] c3396aArr, SQLiteDatabase sQLiteDatabase) {
            C3396a c3396a = c3396aArr[0];
            if (c3396a == null || !c3396a.m10374a(sQLiteDatabase)) {
                c3396aArr[0] = new C3396a(sQLiteDatabase);
            }
            return c3396aArr[0];
        }

        /* renamed from: a */
        C3396a m10377a(SQLiteDatabase sQLiteDatabase) {
            return m10376b(this.f11943a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f11943a[0] = null;
        }

        /* renamed from: d */
        synchronized InterfaceC3371b m10378d() {
            this.f11945c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f11945c) {
                return m10377a(writableDatabase);
            }
            close();
            return m10378d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f11944b.mo3582b(m10377a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f11944b.mo3583d(m10377a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            this.f11945c = true;
            this.f11944b.mo3584e(m10377a(sQLiteDatabase), i4, i5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f11945c) {
                return;
            }
            this.f11944b.mo3585f(m10377a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            this.f11945c = true;
            this.f11944b.mo3586g(m10377a(sQLiteDatabase), i4, i5);
        }
    }

    C3397b(Context context, String str, InterfaceC3372c.a aVar, boolean z3) {
        this.f11936a = context;
        this.f11937b = str;
        this.f11938c = aVar;
        this.f11939d = z3;
    }

    /* renamed from: a */
    private a m10375a() {
        a aVar;
        synchronized (this.f11940e) {
            if (this.f11941f == null) {
                C3396a[] c3396aArr = new C3396a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f11937b == null || !this.f11939d) {
                    this.f11941f = new a(this.f11936a, this.f11937b, c3396aArr, this.f11938c);
                } else {
                    this.f11941f = new a(this.f11936a, new File(this.f11936a.getNoBackupFilesDir(), this.f11937b).getAbsolutePath(), c3396aArr, this.f11938c);
                }
                this.f11941f.setWriteAheadLoggingEnabled(this.f11942g);
            }
            aVar = this.f11941f;
        }
        return aVar;
    }

    @Override // p149s0.InterfaceC3372c
    /* renamed from: F */
    public InterfaceC3371b mo3483F() {
        return m10375a().m10378d();
    }

    @Override // p149s0.InterfaceC3372c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m10375a().close();
    }

    @Override // p149s0.InterfaceC3372c
    public String getDatabaseName() {
        return this.f11937b;
    }

    @Override // p149s0.InterfaceC3372c
    public void setWriteAheadLoggingEnabled(boolean z3) {
        synchronized (this.f11940e) {
            a aVar = this.f11941f;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z3);
            }
            this.f11942g = z3;
        }
    }
}
