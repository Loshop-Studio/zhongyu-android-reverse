package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class Migration_8_9 extends Migration {
    public static final Migration_8_9 INSTANCE = new Migration_8_9();

    private Migration_8_9() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        db2.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
