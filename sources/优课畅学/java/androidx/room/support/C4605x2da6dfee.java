package androidx.room.support;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* renamed from: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 */
/* loaded from: classes3.dex */
public /* synthetic */ class C4605x2da6dfee extends FunctionReferenceImpl implements InterfaceC10570l {
    public static final C4605x2da6dfee INSTANCE = new C4605x2da6dfee();

    public C4605x2da6dfee() {
        super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final Boolean invoke(SupportSQLiteDatabase p02) {
        AbstractC9133u.m16133g(p02, "p0");
        return Boolean.valueOf(p02.yieldIfContendedSafely());
    }
}
