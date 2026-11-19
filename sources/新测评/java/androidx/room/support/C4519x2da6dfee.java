package androidx.room.support;

import androidx.sqlite.p017db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
/* renamed from: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 */
/* loaded from: classes3.dex */
public /* synthetic */ class C4519x2da6dfee extends FunctionReferenceImpl implements Function1<SupportSQLiteDatabase, Boolean> {
    public static final C4519x2da6dfee INSTANCE = new C4519x2da6dfee();

    public C4519x2da6dfee() {
        super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SupportSQLiteDatabase p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(p02.yieldIfContendedSafely());
    }
}
