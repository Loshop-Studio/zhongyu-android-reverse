package com.friday.common;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.UserDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ImageSafetyEntity;
import com.friday.common.entity.PdfEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.entity.ShareCacheEntity;
import com.friday.common.entity.User;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5225a1;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;

@StabilityInferred(parameters = 0)
@Database(entities = {User.class, FileEntity.class, ResourceEntity.class, ShareCacheEntity.class, PdfEntity.class, ImageSafetyEntity.class}, exportSchema = false, version = 12)
/* loaded from: classes3.dex */
public abstract class MyDataBase extends RoomDatabase {

    /* renamed from: a */
    public static final C5922a f5532a = new C5922a(null);

    /* renamed from: b */
    public static final int f5533b = 8;

    /* renamed from: c */
    public static final Migration f5534c = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("ALTER TABLE File ADD COLUMN preFileId TEXT");
        }
    };

    /* renamed from: d */
    public static final Migration f5535d = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("ALTER TABLE File ADD COLUMN errorTimes INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: e */
    public static final Migration f5536e = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS 'ResourceEntity' ('id' TEXT PRIMARY KEY NOT NULL, 'fileId' TEXT NOT NULL, 'pageName' TEXT NOT NULL, 'pageIndex' INTEGER NOT NULL , 'ossImageUrl' TEXT NOT NULL, 'md5' TEXT NOT NULL, 'userId' INTEGER NOT NULL, 'resourceType' INTEGER NOT NULL, 'toBeUploaded' INTEGER NOT NULL,'wasDeleted' INTEGER NOT NULL)");
            database.execSQL("ALTER TABLE File ADD COLUMN cached INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: f */
    public static final Migration f5537f = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_4_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("ALTER TABLE File ADD COLUMN md5 TEXT");
        }
    };

    /* renamed from: g */
    public static final Migration f5538g = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_5_6$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS 'ShareCacheEntity' ('fileId' TEXT PRIMARY KEY NOT NULL, 'accountId' INTEGER NOT NULL,'version' INTEGER NOT NULL, 'previewTime' INTEGER NOT NULL)");
        }
    };

    /* renamed from: h */
    public static final Migration f5539h = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_6_7$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("DROP TABLE IF EXISTS 'ShareCacheEntity'");
        }
    };

    /* renamed from: i */
    public static final Migration f5540i = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_7_8$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS 'ShareCacheEntity' ('cacheId' TEXT PRIMARY KEY NOT NULL,'fileId' TEXT  NOT NULL, 'accountId' INTEGER NOT NULL,'version' INTEGER NOT NULL, 'previewTime' INTEGER NOT NULL)");
        }
    };

    /* renamed from: j */
    public static final Migration f5541j = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_8_9$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("ALTER TABLE ResourceEntity ADD COLUMN createTimeStamp TEXT");
            database.execSQL("ALTER TABLE ResourceEntity ADD COLUMN updateTimeStamp TEXT");
        }
    };

    /* renamed from: k */
    public static final Migration f5542k = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_9_10$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("ALTER TABLE User ADD COLUMN 'cameraPermission' INTEGER NOT NULL DEFAULT 1");
            database.execSQL("ALTER TABLE User ADD COLUMN 'albumPermission' INTEGER NOT NULL DEFAULT 1");
            database.execSQL("ALTER TABLE User ADD COLUMN 'screenshotsPermission' INTEGER NOT NULL DEFAULT 1");
        }
    };

    /* renamed from: l */
    public static final Migration f5543l = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_10_11$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS 'PdfEntity' ('id' TEXT PRIMARY KEY NOT NULL,'currentPage' INTEGER NOT NULL,'pageCount' INTEGER NOT NULL)");
            database.execSQL("CREATE TABLE IF NOT EXISTS 'ImageSafetyEntity' ('imageId' TEXT PRIMARY KEY NOT NULL,'riskScore' INTEGER NOT NULL)");
        }
    };

    /* renamed from: m */
    public static final Migration f5544m = new Migration() { // from class: com.friday.common.MyDataBase$Companion$MIGRATION_11_12$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            AbstractC9979u.m20294g(database, "database");
            database.execSQL("ALTER TABLE File ADD COLUMN expiredTime INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE File ADD COLUMN isRecycled INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: com.friday.common.MyDataBase$a */
    public static final class C5922a {
        public /* synthetic */ C5922a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final MyDataBase m4756a(Context context) {
            AbstractC9979u.m20294g(context, "context");
            return (MyDataBase) Room.databaseBuilder(context, MyDataBase.class, "FRIDAY_NOTE_DB").addMigrations(MyDataBase.f5534c, MyDataBase.f5535d, MyDataBase.f5536e, MyDataBase.f5537f, MyDataBase.f5538g, MyDataBase.f5539h, MyDataBase.f5540i, MyDataBase.f5541j, MyDataBase.f5542k, MyDataBase.f5543l, MyDataBase.f5544m).build();
        }

        public C5922a() {
        }
    }

    /* renamed from: r */
    public abstract FileDao mo4750r();

    /* renamed from: s */
    public abstract InterfaceC5308v0 mo4751s();

    /* renamed from: t */
    public abstract InterfaceC5225a1 mo4752t();

    /* renamed from: u */
    public abstract ResourceDao mo4753u();

    /* renamed from: v */
    public abstract InterfaceC5250g2 mo4754v();

    /* renamed from: w */
    public abstract UserDao mo4755w();
}
