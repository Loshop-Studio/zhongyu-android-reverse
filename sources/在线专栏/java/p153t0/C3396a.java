package p153t0;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p149s0.C3370a;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3374e;
import p149s0.InterfaceC3375f;

/* renamed from: t0.a */
/* loaded from: classes.dex */
class C3396a implements InterfaceC3371b {

    /* renamed from: b */
    private static final String[] f11929b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c */
    private static final String[] f11930c = new String[0];

    /* renamed from: a */
    private final SQLiteDatabase f11931a;

    /* renamed from: t0.a$a */
    class a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3374e f11932a;

        a(InterfaceC3374e interfaceC3374e) {
            this.f11932a = interfaceC3374e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f11932a.mo10089b(new C3399d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: t0.a$b */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3374e f11934a;

        b(InterfaceC3374e interfaceC3374e) {
            this.f11934a = interfaceC3374e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f11934a.mo10089b(new C3399d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C3396a(SQLiteDatabase sQLiteDatabase) {
        this.f11931a = sQLiteDatabase;
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: A */
    public void mo3501A() {
        this.f11931a.beginTransactionNonExclusive();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: D */
    public Cursor mo3502D(InterfaceC3374e interfaceC3374e) {
        return this.f11931a.rawQueryWithFactory(new a(interfaceC3374e), interfaceC3374e.mo10088a(), f11930c, null);
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: E */
    public Cursor mo3503E(InterfaceC3374e interfaceC3374e, CancellationSignal cancellationSignal) {
        return this.f11931a.rawQueryWithFactory(new b(interfaceC3374e), interfaceC3374e.mo10088a(), f11930c, null, cancellationSignal);
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: H */
    public Cursor mo3504H(String str) {
        return mo3502D(new C3370a(str));
    }

    /* renamed from: a */
    boolean m10374a(SQLiteDatabase sQLiteDatabase) {
        return this.f11931a == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11931a.close();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: e */
    public void mo3505e() {
        this.f11931a.endTransaction();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: f */
    public void mo3506f() {
        this.f11931a.beginTransaction();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: g */
    public List<Pair<String, String>> mo3507g() {
        return this.f11931a.getAttachedDbs();
    }

    @Override // p149s0.InterfaceC3371b
    public String getPath() {
        return this.f11931a.getPath();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: h */
    public void mo3508h(String str) throws SQLException {
        this.f11931a.execSQL(str);
    }

    @Override // p149s0.InterfaceC3371b
    public boolean isOpen() {
        return this.f11931a.isOpen();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: j */
    public InterfaceC3375f mo3509j(String str) {
        return new C3400e(this.f11931a.compileStatement(str));
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: p */
    public boolean mo3510p() {
        return this.f11931a.inTransaction();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: v */
    public boolean mo3512v() {
        return this.f11931a.isWriteAheadLoggingEnabled();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: x */
    public void mo3513x() {
        this.f11931a.setTransactionSuccessful();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: z */
    public void mo3514z(String str, Object[] objArr) throws SQLException {
        this.f11931a.execSQL(str, objArr);
    }
}
