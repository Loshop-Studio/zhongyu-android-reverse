package androidx.room.support;

import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* renamed from: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 */
/* loaded from: classes3.dex */
public /* synthetic */ class C4554x2da6dfef extends FunctionReferenceImpl implements InterfaceC9540l {
    public static final C4554x2da6dfef INSTANCE = new C4554x2da6dfef();

    public C4554x2da6dfef() {
        super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final Boolean invoke(SupportSQLiteDatabase p02) {
        AbstractC9979u.m20294g(p02, "p0");
        return Boolean.valueOf(p02.yieldIfContendedSafely());
    }
}
