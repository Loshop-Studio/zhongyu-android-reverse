package androidx.room.support;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* renamed from: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 */
/* loaded from: classes3.dex */
public /* synthetic */ class C4596x5693171d extends FunctionReferenceImpl implements InterfaceC10570l {
    public static final C4596x5693171d INSTANCE = new C4596x5693171d();

    public C4596x5693171d() {
        super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final Boolean invoke(SupportSQLiteDatabase p02) {
        AbstractC9133u.m16133g(p02, "p0");
        return Boolean.valueOf(p02.inTransaction());
    }
}
