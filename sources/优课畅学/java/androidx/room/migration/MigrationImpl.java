package androidx.room.migration;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final class MigrationImpl extends Migration {
    private final InterfaceC10570l migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationImpl(int i10, int i11, InterfaceC10570l migrateCallback) {
        super(i10, i11);
        AbstractC9133u.m16133g(migrateCallback, "migrateCallback");
        this.migrateCallback = migrateCallback;
    }

    public final InterfaceC10570l getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        this.migrateCallback.invoke(db);
    }
}
