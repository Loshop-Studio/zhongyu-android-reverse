package p153t0;

import android.database.sqlite.SQLiteStatement;
import p149s0.InterfaceC3375f;

/* renamed from: t0.e */
/* loaded from: classes.dex */
class C3400e extends C3399d implements InterfaceC3375f {

    /* renamed from: b */
    private final SQLiteStatement f11949b;

    C3400e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f11949b = sQLiteStatement;
    }

    @Override // p149s0.InterfaceC3375f
    /* renamed from: G */
    public long mo3520G() {
        return this.f11949b.executeInsert();
    }

    @Override // p149s0.InterfaceC3375f
    /* renamed from: i */
    public int mo3521i() {
        return this.f11949b.executeUpdateDelete();
    }
}
