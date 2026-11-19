package androidx.work.impl;

import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class AutoMigration_19_20 implements AutoMigrationSpec {
    @Override // androidx.room.migration.AutoMigrationSpec
    public void onPostMigrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        db2.execSQL("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
