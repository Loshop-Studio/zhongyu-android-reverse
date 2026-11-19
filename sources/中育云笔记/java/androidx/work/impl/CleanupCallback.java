package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.work.Clock;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class CleanupCallback extends RoomDatabase.Callback {
    private final Clock clock;

    public CleanupCallback(Clock clock) {
        AbstractC9979u.m20294g(clock, "clock");
        this.clock = clock;
    }

    private final long getPruneDate() {
        return this.clock.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
    }

    private final String getPruneSQL() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + getPruneDate() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public final Clock getClock() {
        return this.clock;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        super.onOpen(db2);
        db2.beginTransaction();
        try {
            db2.execSQL(getPruneSQL());
            db2.setTransactionSuccessful();
        } finally {
            db2.endTransaction();
        }
    }
}
