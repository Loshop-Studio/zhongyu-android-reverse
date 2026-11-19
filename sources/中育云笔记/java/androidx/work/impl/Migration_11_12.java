package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class Migration_11_12 extends Migration {
    public static final Migration_11_12 INSTANCE = new Migration_11_12();

    private Migration_11_12() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        db2.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
