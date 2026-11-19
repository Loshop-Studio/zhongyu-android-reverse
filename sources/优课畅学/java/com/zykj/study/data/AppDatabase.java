package com.zykj.study.data;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@TypeConverters({Converters.class})
@Database(entities = {CourseStudyEntity.class, CourseStudyKeyEntity.class, MyCourseEntity.class, MyCourseKeyEntity.class, PeriodEntity.class, GradeEntity.class, SubjectEntity.class, CatalogEntity.class, SearchHistoryEntity.class, PdfEntity.class}, exportSchema = false, version = 3)
/* loaded from: classes3.dex */
public abstract class AppDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "study.db";
    private static volatile AppDatabase instance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Migration MIGRATION_1_2 = new Migration() { // from class: com.zykj.study.data.AppDatabase$Companion$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9133u.m16133g(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS 'PdfEntity' ('id' TEXT PRIMARY KEY NOT NULL,'currentPage' INTEGER NOT NULL,'pageCount' INTEGER NOT NULL)");
        }
    };
    private static final Migration MIGRATION_2_3 = new Migration() { // from class: com.zykj.study.data.AppDatabase$Companion$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9133u.m16133g(database, "database");
            database.execSQL("ALTER TABLE my_course ADD COLUMN sort INTEGER NOT NULL DEFAULT 0");
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final AppDatabase buildDatabase(Context context) {
            return (AppDatabase) Room.databaseBuilder(context, AppDatabase.class, AppDatabase.DATABASE_NAME).addMigrations(AppDatabase.MIGRATION_1_2, AppDatabase.MIGRATION_2_3).build();
        }

        public final AppDatabase getInstance(Context context) {
            AppDatabase appDatabaseBuildDatabase;
            AbstractC9133u.m16133g(context, "context");
            AppDatabase appDatabase = AppDatabase.instance;
            if (appDatabase != null) {
                return appDatabase;
            }
            synchronized (this) {
                appDatabaseBuildDatabase = AppDatabase.instance;
                if (appDatabaseBuildDatabase == null) {
                    appDatabaseBuildDatabase = AppDatabase.Companion.buildDatabase(context);
                    AppDatabase.instance = appDatabaseBuildDatabase;
                }
            }
            return appDatabaseBuildDatabase;
        }

        private Companion() {
        }
    }

    public abstract CatalogEntityDao catalogEntityDao();

    public abstract CourseStudyEntityDao courseStudyEntityDao();

    public abstract CourseStudyKeyEntityDao courseStudyKeyEntityDao();

    public abstract GradeEntityDao gradeEntityDao();

    public abstract MyCourseEntityDao myCourseEntityDao();

    public abstract MyCourseKeyEntityDao myCourseKeyEntityDao();

    public abstract PdfDao pdfDao();

    public abstract PeriodEntityDao periodEntityDao();

    public abstract SearchHistoryEntityDao searchHistoryEntityDao();

    public abstract SubjectEntityDao subjectEntityDao();
}
