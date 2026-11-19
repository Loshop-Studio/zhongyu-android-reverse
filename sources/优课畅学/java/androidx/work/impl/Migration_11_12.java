package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class Migration_11_12 extends Migration {
    public static final Migration_11_12 INSTANCE = new Migration_11_12();

    private Migration_11_12() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        db.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
