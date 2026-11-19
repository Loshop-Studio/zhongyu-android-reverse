package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class Migration_12_13 extends Migration {
    public static final Migration_12_13 INSTANCE = new Migration_12_13();

    private Migration_12_13() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        db2.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
