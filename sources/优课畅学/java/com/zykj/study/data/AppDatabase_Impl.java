package com.zykj.study.data;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final int $stable = 8;
    private final InterfaceC8724d _myCourseEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.a
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._myCourseEntityDao$lambda$0(this.f11025a);
        }
    });
    private final InterfaceC8724d _myCourseKeyEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.b
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._myCourseKeyEntityDao$lambda$1(this.f11030a);
        }
    });
    private final InterfaceC8724d _periodEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.c
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._periodEntityDao$lambda$2(this.f11035a);
        }
    });
    private final InterfaceC8724d _gradeEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.d
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._gradeEntityDao$lambda$3(this.f11040a);
        }
    });
    private final InterfaceC8724d _subjectEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.e
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._subjectEntityDao$lambda$4(this.f11044a);
        }
    });
    private final InterfaceC8724d _catalogEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.f
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._catalogEntityDao$lambda$5(this.f11048a);
        }
    });
    private final InterfaceC8724d _searchHistoryEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.g
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._searchHistoryEntityDao$lambda$6(this.f11053a);
        }
    });
    private final InterfaceC8724d _courseStudyEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.h
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._courseStudyEntityDao$lambda$7(this.f11058a);
        }
    });
    private final InterfaceC8724d _courseStudyKeyEntityDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.i
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._courseStudyKeyEntityDao$lambda$8(this.f11064a);
        }
    });
    private final InterfaceC8724d _pdfDao = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.data.j
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return AppDatabase_Impl._pdfDao$lambda$9(this.f11069a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogEntityDao_Impl _catalogEntityDao$lambda$5(AppDatabase_Impl appDatabase_Impl) {
        return new CatalogEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseStudyEntityDao_Impl _courseStudyEntityDao$lambda$7(AppDatabase_Impl appDatabase_Impl) {
        return new CourseStudyEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseStudyKeyEntityDao_Impl _courseStudyKeyEntityDao$lambda$8(AppDatabase_Impl appDatabase_Impl) {
        return new CourseStudyKeyEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GradeEntityDao_Impl _gradeEntityDao$lambda$3(AppDatabase_Impl appDatabase_Impl) {
        return new GradeEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyCourseEntityDao_Impl _myCourseEntityDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new MyCourseEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyCourseKeyEntityDao_Impl _myCourseKeyEntityDao$lambda$1(AppDatabase_Impl appDatabase_Impl) {
        return new MyCourseKeyEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PdfDao_Impl _pdfDao$lambda$9(AppDatabase_Impl appDatabase_Impl) {
        return new PdfDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PeriodEntityDao_Impl _periodEntityDao$lambda$2(AppDatabase_Impl appDatabase_Impl) {
        return new PeriodEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchHistoryEntityDao_Impl _searchHistoryEntityDao$lambda$6(AppDatabase_Impl appDatabase_Impl) {
        return new SearchHistoryEntityDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubjectEntityDao_Impl _subjectEntityDao$lambda$4(AppDatabase_Impl appDatabase_Impl) {
        return new SubjectEntityDao_Impl(appDatabase_Impl);
    }

    @Override // com.zykj.study.data.AppDatabase
    public CatalogEntityDao catalogEntityDao() {
        return (CatalogEntityDao) this._catalogEntityDao.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "course_study", "course_study_key", "my_course", "my_course_key", TypedValues.CycleType.S_WAVE_PERIOD, "grade", "subject", "catalog", "search_history", "PdfEntity");
    }

    @Override // com.zykj.study.data.AppDatabase
    public CourseStudyEntityDao courseStudyEntityDao() {
        return (CourseStudyEntityDao) this._courseStudyEntityDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public CourseStudyKeyEntityDao courseStudyKeyEntityDao() {
        return (CourseStudyKeyEntityDao) this._courseStudyKeyEntityDao.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<InterfaceC8375c, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        AbstractC9133u.m16133g(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "course_study", "course_study_key", "my_course", "my_course_key", TypedValues.CycleType.S_WAVE_PERIOD, "grade", "subject", "catalog", "search_history", "PdfEntity");
    }

    @Override // androidx.room.RoomDatabase
    public Set<InterfaceC8375c> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<InterfaceC8375c, List<InterfaceC8375c>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC9137y.m16154b(MyCourseEntityDao.class), MyCourseEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(MyCourseKeyEntityDao.class), MyCourseKeyEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(PeriodEntityDao.class), PeriodEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(GradeEntityDao.class), GradeEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(SubjectEntityDao.class), SubjectEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(CatalogEntityDao.class), CatalogEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(SearchHistoryEntityDao.class), SearchHistoryEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(CourseStudyEntityDao.class), CourseStudyEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(CourseStudyKeyEntityDao.class), CourseStudyKeyEntityDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC9137y.m16154b(PdfDao.class), PdfDao_Impl.Companion.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // com.zykj.study.data.AppDatabase
    public GradeEntityDao gradeEntityDao() {
        return (GradeEntityDao) this._gradeEntityDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public MyCourseEntityDao myCourseEntityDao() {
        return (MyCourseEntityDao) this._myCourseEntityDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public MyCourseKeyEntityDao myCourseKeyEntityDao() {
        return (MyCourseKeyEntityDao) this._myCourseKeyEntityDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public PdfDao pdfDao() {
        return (PdfDao) this._pdfDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public PeriodEntityDao periodEntityDao() {
        return (PeriodEntityDao) this._periodEntityDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public SearchHistoryEntityDao searchHistoryEntityDao() {
        return (SearchHistoryEntityDao) this._searchHistoryEntityDao.getValue();
    }

    @Override // com.zykj.study.data.AppDatabase
    public SubjectEntityDao subjectEntityDao() {
        return (SubjectEntityDao) this._subjectEntityDao.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.zykj.study.data.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(3, "8c81f4442798fc231c64703175b36246", "6eb7a3ba145149af08152bc6124ac897");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) throws Exception {
                AbstractC9133u.m16133g(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `course_study` (`userName` TEXT, `progress` INTEGER NOT NULL, `studyUserId` TEXT, `learnTime` INTEGER, `id` INTEGER NOT NULL, `userId` TEXT, `cover` TEXT, `title` TEXT, `description` TEXT, `periodId` INTEGER NOT NULL, `gradeId` INTEGER NOT NULL, `subjectId` INTEGER NOT NULL, `learning` INTEGER NOT NULL, `likes` INTEGER NOT NULL, `isPublic` INTEGER NOT NULL, `status` TEXT NOT NULL, `createTime` INTEGER, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `course_study_key` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `pageIndex` INTEGER NOT NULL, `nextPage` INTEGER)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `my_course` (`isSuperviser` INTEGER NOT NULL, `sort` INTEGER NOT NULL, `id` INTEGER NOT NULL, `userId` TEXT, `cover` TEXT, `title` TEXT, `description` TEXT, `periodId` INTEGER NOT NULL, `gradeId` INTEGER NOT NULL, `subjectId` INTEGER NOT NULL, `learning` INTEGER NOT NULL, `likes` INTEGER NOT NULL, `isPublic` INTEGER NOT NULL, `status` TEXT NOT NULL, `createTime` INTEGER, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `my_course_key` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `startId` INTEGER NOT NULL, `take` INTEGER NOT NULL, `nextStartId` INTEGER)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `period` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `grade` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `parentId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `subject` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `catalog` (`id` INTEGER NOT NULL, `courseId` INTEGER NOT NULL, `title` TEXT NOT NULL, `isLeaf` INTEGER NOT NULL, `progress` INTEGER NOT NULL, `parentId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `search_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `searchKey` TEXT NOT NULL, `createDate` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PdfEntity` (`id` TEXT NOT NULL, `currentPage` INTEGER NOT NULL, `pageCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8c81f4442798fc231c64703175b36246')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) throws Exception {
                AbstractC9133u.m16133g(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `course_study`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `course_study_key`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `my_course`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `my_course_key`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `period`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `grade`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `subject`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `catalog`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `search_history`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PdfEntity`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                AbstractC9133u.m16133g(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                AbstractC9133u.m16133g(connection, "connection");
                this.this$0.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                AbstractC9133u.m16133g(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                AbstractC9133u.m16133g(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                AbstractC9133u.m16133g(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("userName", new TableInfo.Column("userName", "TEXT", false, 0, null, 1));
                linkedHashMap.put("progress", new TableInfo.Column("progress", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("studyUserId", new TableInfo.Column("studyUserId", "TEXT", false, 0, null, 1));
                linkedHashMap.put("learnTime", new TableInfo.Column("learnTime", "INTEGER", false, 0, null, 1));
                linkedHashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, 1));
                linkedHashMap.put("cover", new TableInfo.Column("cover", "TEXT", false, 0, null, 1));
                linkedHashMap.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                linkedHashMap.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
                linkedHashMap.put("periodId", new TableInfo.Column("periodId", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("gradeId", new TableInfo.Column("gradeId", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("subjectId", new TableInfo.Column("subjectId", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("learning", new TableInfo.Column("learning", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("likes", new TableInfo.Column("likes", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("isPublic", new TableInfo.Column("isPublic", "INTEGER", true, 0, null, 1));
                linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, new TableInfo.Column(NotificationCompat.CATEGORY_STATUS, "TEXT", true, 0, null, 1));
                linkedHashMap.put("createTime", new TableInfo.Column("createTime", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("course_study", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.Companion;
                TableInfo tableInfo2 = companion.read(connection, "course_study");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "course_study(com.zykj.study.data.CourseStudyEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("pageIndex", new TableInfo.Column("pageIndex", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("nextPage", new TableInfo.Column("nextPage", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("course_study_key", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "course_study_key");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "course_study_key(com.zykj.study.data.CourseStudyKeyEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("isSuperviser", new TableInfo.Column("isSuperviser", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("sort", new TableInfo.Column("sort", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap3.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("cover", new TableInfo.Column("cover", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("periodId", new TableInfo.Column("periodId", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("gradeId", new TableInfo.Column("gradeId", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("subjectId", new TableInfo.Column("subjectId", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("learning", new TableInfo.Column("learning", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("likes", new TableInfo.Column("likes", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("isPublic", new TableInfo.Column("isPublic", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put(NotificationCompat.CATEGORY_STATUS, new TableInfo.Column(NotificationCompat.CATEGORY_STATUS, "TEXT", true, 0, null, 1));
                linkedHashMap3.put("createTime", new TableInfo.Column("createTime", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("my_course", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo6 = companion.read(connection, "my_course");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "my_course(com.zykj.study.data.MyCourseEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap4.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("startId", new TableInfo.Column("startId", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("take", new TableInfo.Column("take", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("nextStartId", new TableInfo.Column("nextStartId", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("my_course_key", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo8 = companion.read(connection, "my_course_key");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "my_course_key(com.zykj.study.data.MyCourseKeyEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap5.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo(TypedValues.CycleType.S_WAVE_PERIOD, linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo10 = companion.read(connection, TypedValues.CycleType.S_WAVE_PERIOD);
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "period(com.zykj.study.data.PeriodEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap6.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                linkedHashMap6.put("parentId", new TableInfo.Column("parentId", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("grade", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo12 = companion.read(connection, "grade");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "grade(com.zykj.study.data.GradeEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap7.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                TableInfo tableInfo13 = new TableInfo("subject", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo14 = companion.read(connection, "subject");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new RoomOpenDelegate.ValidationResult(false, "subject(com.zykj.study.data.SubjectEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap8.put("courseId", new TableInfo.Column("courseId", "INTEGER", true, 0, null, 1));
                linkedHashMap8.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
                linkedHashMap8.put("isLeaf", new TableInfo.Column("isLeaf", "INTEGER", true, 0, null, 1));
                linkedHashMap8.put("progress", new TableInfo.Column("progress", "INTEGER", true, 0, null, 1));
                linkedHashMap8.put("parentId", new TableInfo.Column("parentId", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo15 = new TableInfo("catalog", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo16 = companion.read(connection, "catalog");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new RoomOpenDelegate.ValidationResult(false, "catalog(com.zykj.study.data.CatalogEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap9.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                linkedHashMap9.put("searchKey", new TableInfo.Column("searchKey", "TEXT", true, 0, null, 1));
                linkedHashMap9.put("createDate", new TableInfo.Column("createDate", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo17 = new TableInfo("search_history", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo18 = companion.read(connection, "search_history");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new RoomOpenDelegate.ValidationResult(false, "search_history(com.zykj.study.data.SearchHistoryEntity).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap10.put("currentPage", new TableInfo.Column("currentPage", "INTEGER", true, 0, null, 1));
                linkedHashMap10.put("pageCount", new TableInfo.Column("pageCount", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo19 = new TableInfo("PdfEntity", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo20 = companion.read(connection, "PdfEntity");
                if (tableInfo19.equals(tableInfo20)) {
                    return new RoomOpenDelegate.ValidationResult(true, null);
                }
                return new RoomOpenDelegate.ValidationResult(false, "PdfEntity(com.zykj.study.data.PdfEntity).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
            }
        };
    }
}
