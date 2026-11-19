package com.zykj.evaluation.p056di;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.p017db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class AppDatabaseKt {

    /* renamed from: a */
    public static final Migration f8770a = new Migration() { // from class: com.zykj.evaluation.di.AppDatabaseKt$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) throws SQLException {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE submit_task ADD COLUMN show_fail_wrong INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: a */
    public static final Migration m8679a() {
        return f8770a;
    }
}
