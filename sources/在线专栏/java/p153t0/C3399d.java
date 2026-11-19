package p153t0;

import android.database.sqlite.SQLiteProgram;
import p149s0.InterfaceC3373d;

/* renamed from: t0.d */
/* loaded from: classes.dex */
class C3399d implements InterfaceC3373d {

    /* renamed from: a */
    private final SQLiteProgram f11948a;

    C3399d(SQLiteProgram sQLiteProgram) {
        this.f11948a = sQLiteProgram;
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: C */
    public void mo3486C(int i4, byte[] bArr) {
        this.f11948a.bindBlob(i4, bArr);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: c */
    public void mo3488c(int i4, String str) {
        this.f11948a.bindString(i4, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11948a.close();
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: k */
    public void mo3489k(int i4) {
        this.f11948a.bindNull(i4);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: l */
    public void mo3490l(int i4, double d4) {
        this.f11948a.bindDouble(i4, d4);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: w */
    public void mo3491w(int i4, long j4) {
        this.f11948a.bindLong(i4, j4);
    }
}
