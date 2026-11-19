package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import androidx.sqlite.p019db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.Clock;
import androidx.work.Data;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@TypeConverters({Data.class, WorkTypeConverters.class})
@Database(autoMigrations = {@AutoMigration(from = 13, m2054to = 14), @AutoMigration(from = 14, spec = AutoMigration_14_15.class, m2054to = 15), @AutoMigration(from = 16, m2054to = 17), @AutoMigration(from = 17, m2054to = 18), @AutoMigration(from = 18, m2054to = 19), @AutoMigration(from = 19, spec = AutoMigration_19_20.class, m2054to = 20), @AutoMigration(from = 20, m2054to = 21), @AutoMigration(from = 22, m2054to = 23)}, entities = {Dependency.class, WorkSpec.class, WorkTag.class, SystemIdInfo.class, WorkName.class, WorkProgress.class, Preference.class}, version = 23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class WorkDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SupportSQLiteOpenHelper create$lambda$0(Context context, SupportSQLiteOpenHelper.Configuration configuration) {
            AbstractC9979u.m20294g(configuration, "configuration");
            SupportSQLiteOpenHelper.Configuration.Builder builder = SupportSQLiteOpenHelper.Configuration.Companion.builder(context);
            builder.name(configuration.name).callback(configuration.callback).noBackupDirectory(true).allowDataLossOnRecovery(true);
            return new FrameworkSQLiteOpenHelperFactory().create(builder.build());
        }

        public final WorkDatabase create(final Context context, Executor queryExecutor, Clock clock, boolean z10) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(queryExecutor, "queryExecutor");
            AbstractC9979u.m20294g(clock, "clock");
            return (WorkDatabase) (z10 ? Room.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries() : Room.databaseBuilder(context, WorkDatabase.class, WorkDatabasePathHelperKt.WORK_DATABASE_NAME).openHelperFactory(new SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.g
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
                    return WorkDatabase.Companion.create$lambda$0(context, configuration);
                }
            })).setQueryExecutor(queryExecutor).addCallback(new CleanupCallback(clock)).addMigrations(Migration_1_2.INSTANCE).addMigrations(new RescheduleMigration(context, 2, 3)).addMigrations(Migration_3_4.INSTANCE).addMigrations(Migration_4_5.INSTANCE).addMigrations(new RescheduleMigration(context, 5, 6)).addMigrations(Migration_6_7.INSTANCE).addMigrations(Migration_7_8.INSTANCE).addMigrations(Migration_8_9.INSTANCE).addMigrations(new WorkMigration9To10(context)).addMigrations(new RescheduleMigration(context, 10, 11)).addMigrations(Migration_11_12.INSTANCE).addMigrations(Migration_12_13.INSTANCE).addMigrations(Migration_15_16.INSTANCE).addMigrations(Migration_16_17.INSTANCE).addMigrations(new RescheduleMigration(context, 21, 22)).fallbackToDestructiveMigration().build();
        }

        private Companion() {
        }
    }

    public static final WorkDatabase create(Context context, Executor executor, Clock clock, boolean z10) {
        return Companion.create(context, executor, clock, z10);
    }

    public abstract DependencyDao dependencyDao();

    public abstract PreferenceDao preferenceDao();

    public abstract RawWorkInfoDao rawWorkInfoDao();

    public abstract SystemIdInfoDao systemIdInfoDao();

    public abstract WorkNameDao workNameDao();

    public abstract WorkProgressDao workProgressDao();

    public abstract WorkSpecDao workSpecDao();

    public abstract WorkTagDao workTagDao();
}
