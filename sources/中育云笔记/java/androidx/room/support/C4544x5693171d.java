package androidx.room.support;

import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* renamed from: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 */
/* loaded from: classes3.dex */
public /* synthetic */ class C4544x5693171d extends FunctionReferenceImpl implements InterfaceC9540l {
    public static final C4544x5693171d INSTANCE = new C4544x5693171d();

    public C4544x5693171d() {
        super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final Boolean invoke(SupportSQLiteDatabase p02) {
        AbstractC9979u.m20294g(p02, "p0");
        return Boolean.valueOf(p02.inTransaction());
    }
}
