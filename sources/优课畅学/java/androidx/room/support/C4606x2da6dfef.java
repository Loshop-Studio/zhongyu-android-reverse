package androidx.room.support;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* renamed from: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 */
/* loaded from: classes3.dex */
public /* synthetic */ class C4606x2da6dfef extends FunctionReferenceImpl implements InterfaceC10570l {
    public static final C4606x2da6dfef INSTANCE = new C4606x2da6dfef();

    public C4606x2da6dfef() {
        super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final Boolean invoke(SupportSQLiteDatabase p02) {
        AbstractC9133u.m16133g(p02, "p0");
        return Boolean.valueOf(p02.yieldIfContendedSafely());
    }
}
