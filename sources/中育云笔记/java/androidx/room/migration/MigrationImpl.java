package androidx.room.migration;

import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
final class MigrationImpl extends Migration {
    private final InterfaceC9540l migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationImpl(int i10, int i11, InterfaceC9540l migrateCallback) {
        super(i10, i11);
        AbstractC9979u.m20294g(migrateCallback, "migrateCallback");
        this.migrateCallback = migrateCallback;
    }

    public final InterfaceC9540l getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        this.migrateCallback.invoke(db2);
    }
}
