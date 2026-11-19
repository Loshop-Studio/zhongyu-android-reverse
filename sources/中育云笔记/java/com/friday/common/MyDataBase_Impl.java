package com.friday.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.friday.common.MyDataBase_Impl;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.FileDao_Impl;
import com.friday.common.dao.ImageSafetyDao_Impl;
import com.friday.common.dao.PdfDao_Impl;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.ResourceDao_Impl;
import com.friday.common.dao.ShareCacheDao_Impl;
import com.friday.common.dao.UserDao;
import com.friday.common.dao.UserDao_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import org.android.agoo.common.AgooConstants;
import p040c2.InterfaceC5225a1;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MyDataBase_Impl extends MyDataBase {

    /* renamed from: n */
    public final InterfaceC10773d f5545n = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z1.c
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyDataBase_Impl.m4765I(this.f28336c);
        }
    });

    /* renamed from: o */
    public final InterfaceC10773d f5546o = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z1.d
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyDataBase_Impl.m4760D(this.f28337c);
        }
    });

    /* renamed from: p */
    public final InterfaceC10773d f5547p = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z1.e
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyDataBase_Impl.m4763G(this.f28338c);
        }
    });

    /* renamed from: q */
    public final InterfaceC10773d f5548q = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z1.f
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyDataBase_Impl.m4764H(this.f28339c);
        }
    });

    /* renamed from: r */
    public final InterfaceC10773d f5549r = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z1.g
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyDataBase_Impl.m4761E(this.f28340c);
        }
    });

    /* renamed from: s */
    public final InterfaceC10773d f5550s = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z1.h
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyDataBase_Impl.m4762F(this.f28341c);
        }
    });

    /* renamed from: D */
    public static final FileDao_Impl m4760D(MyDataBase_Impl myDataBase_Impl) {
        return new FileDao_Impl(myDataBase_Impl);
    }

    /* renamed from: E */
    public static final ImageSafetyDao_Impl m4761E(MyDataBase_Impl myDataBase_Impl) {
        return new ImageSafetyDao_Impl(myDataBase_Impl);
    }

    /* renamed from: F */
    public static final PdfDao_Impl m4762F(MyDataBase_Impl myDataBase_Impl) {
        return new PdfDao_Impl(myDataBase_Impl);
    }

    /* renamed from: G */
    public static final ResourceDao_Impl m4763G(MyDataBase_Impl myDataBase_Impl) {
        return new ResourceDao_Impl(myDataBase_Impl);
    }

    /* renamed from: H */
    public static final ShareCacheDao_Impl m4764H(MyDataBase_Impl myDataBase_Impl) {
        return new ShareCacheDao_Impl(myDataBase_Impl);
    }

    /* renamed from: I */
    public static final UserDao_Impl m4765I(MyDataBase_Impl myDataBase_Impl) {
        return new UserDao_Impl(myDataBase_Impl);
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.friday.common.MyDataBase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(12, "28808f723a84e8de0fc59523c2703c44", "8eeb379fa30af3e858fac98595b59058");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) throws Exception {
                AbstractC9979u.m20294g(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `User` (`accountId` INTEGER NOT NULL, `accountName` TEXT NOT NULL, `headPhotoUrl` TEXT NOT NULL, `userName` TEXT NOT NULL, `unit` TEXT NOT NULL, `cameraPermission` INTEGER NOT NULL, `albumPermission` INTEGER NOT NULL, `screenshotsPermission` INTEGER NOT NULL, PRIMARY KEY(`accountId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `File` (`fileId` TEXT NOT NULL, `accountId` INTEGER NOT NULL, `fileName` TEXT NOT NULL, `ossFileUrl` TEXT NOT NULL, `localFileUrl` TEXT NOT NULL, `fileType` TEXT NOT NULL, `parentId` TEXT NOT NULL, `createTime` TEXT NOT NULL, `updateTime` TEXT NOT NULL, `state` INTEGER NOT NULL, `isSync` INTEGER NOT NULL, `version` INTEGER NOT NULL, `isShared` INTEGER NOT NULL, `preFileId` TEXT, `errorTimes` INTEGER NOT NULL, `md5` TEXT, `cached` INTEGER NOT NULL, `expiredTime` INTEGER NOT NULL, `isRecycled` INTEGER NOT NULL, PRIMARY KEY(`fileId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `ResourceEntity` (`id` TEXT NOT NULL, `fileId` TEXT NOT NULL, `pageName` TEXT NOT NULL, `pageIndex` INTEGER NOT NULL, `ossImageUrl` TEXT NOT NULL, `md5` TEXT NOT NULL, `userId` INTEGER NOT NULL, `resourceType` INTEGER NOT NULL, `toBeUploaded` INTEGER NOT NULL, `wasDeleted` INTEGER NOT NULL, `createTimeStamp` TEXT, `updateTimeStamp` TEXT, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `ShareCacheEntity` (`cacheId` TEXT NOT NULL, `fileId` TEXT NOT NULL, `version` INTEGER NOT NULL, `accountId` INTEGER NOT NULL, `previewTime` INTEGER NOT NULL, PRIMARY KEY(`cacheId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PdfEntity` (`id` TEXT NOT NULL, `currentPage` INTEGER NOT NULL, `pageCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `ImageSafetyEntity` (`imageId` TEXT NOT NULL, `riskScore` INTEGER NOT NULL, PRIMARY KEY(`imageId`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '28808f723a84e8de0fc59523c2703c44')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) throws Exception {
                AbstractC9979u.m20294g(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `User`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `File`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `ResourceEntity`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `ShareCacheEntity`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PdfEntity`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `ImageSafetyEntity`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                AbstractC9979u.m20294g(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                AbstractC9979u.m20294g(connection, "connection");
                this.f5551a.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                AbstractC9979u.m20294g(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                AbstractC9979u.m20294g(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                AbstractC9979u.m20294g(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("accountId", new TableInfo.Column("accountId", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("accountName", new TableInfo.Column("accountName", "TEXT", true, 0, null, 1));
                linkedHashMap.put("headPhotoUrl", new TableInfo.Column("headPhotoUrl", "TEXT", true, 0, null, 1));
                linkedHashMap.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, 1));
                linkedHashMap.put("unit", new TableInfo.Column("unit", "TEXT", true, 0, null, 1));
                linkedHashMap.put("cameraPermission", new TableInfo.Column("cameraPermission", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("albumPermission", new TableInfo.Column("albumPermission", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("screenshotsPermission", new TableInfo.Column("screenshotsPermission", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("User", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.Companion;
                TableInfo tableInfo2 = companion.read(connection, "User");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "User(com.friday.common.entity.User).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("fileId", new TableInfo.Column("fileId", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("accountId", new TableInfo.Column("accountId", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("fileName", new TableInfo.Column("fileName", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("ossFileUrl", new TableInfo.Column("ossFileUrl", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("localFileUrl", new TableInfo.Column("localFileUrl", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("fileType", new TableInfo.Column("fileType", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("parentId", new TableInfo.Column("parentId", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("createTime", new TableInfo.Column("createTime", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("updateTime", new TableInfo.Column("updateTime", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("isSync", new TableInfo.Column("isSync", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("isShared", new TableInfo.Column("isShared", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("preFileId", new TableInfo.Column("preFileId", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("errorTimes", new TableInfo.Column("errorTimes", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("md5", new TableInfo.Column("md5", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("cached", new TableInfo.Column("cached", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("expiredTime", new TableInfo.Column("expiredTime", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("isRecycled", new TableInfo.Column("isRecycled", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("File", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "File");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "File(com.friday.common.entity.FileEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put(AgooConstants.MESSAGE_ID, new TableInfo.Column(AgooConstants.MESSAGE_ID, "TEXT", true, 1, null, 1));
                linkedHashMap3.put("fileId", new TableInfo.Column("fileId", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("pageName", new TableInfo.Column("pageName", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("pageIndex", new TableInfo.Column("pageIndex", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("ossImageUrl", new TableInfo.Column("ossImageUrl", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("md5", new TableInfo.Column("md5", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("resourceType", new TableInfo.Column("resourceType", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("toBeUploaded", new TableInfo.Column("toBeUploaded", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("wasDeleted", new TableInfo.Column("wasDeleted", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("createTimeStamp", new TableInfo.Column("createTimeStamp", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("updateTimeStamp", new TableInfo.Column("updateTimeStamp", "TEXT", false, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("ResourceEntity", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo6 = companion.read(connection, "ResourceEntity");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "ResourceEntity(com.friday.common.entity.ResourceEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("cacheId", new TableInfo.Column("cacheId", "TEXT", true, 1, null, 1));
                linkedHashMap4.put("fileId", new TableInfo.Column("fileId", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("accountId", new TableInfo.Column("accountId", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("previewTime", new TableInfo.Column("previewTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("ShareCacheEntity", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo8 = companion.read(connection, "ShareCacheEntity");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "ShareCacheEntity(com.friday.common.entity.ShareCacheEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put(AgooConstants.MESSAGE_ID, new TableInfo.Column(AgooConstants.MESSAGE_ID, "TEXT", true, 1, null, 1));
                linkedHashMap5.put("currentPage", new TableInfo.Column("currentPage", "INTEGER", true, 0, null, 1));
                linkedHashMap5.put("pageCount", new TableInfo.Column("pageCount", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("PdfEntity", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo10 = companion.read(connection, "PdfEntity");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "PdfEntity(com.friday.common.entity.PdfEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("imageId", new TableInfo.Column("imageId", "TEXT", true, 1, null, 1));
                linkedHashMap6.put("riskScore", new TableInfo.Column("riskScore", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("ImageSafetyEntity", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo12 = companion.read(connection, "ImageSafetyEntity");
                if (tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(true, null);
                }
                return new RoomOpenDelegate.ValidationResult(false, "ImageSafetyEntity(com.friday.common.entity.ImageSafetyEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "User", "File", "ResourceEntity", "ShareCacheEntity", "PdfEntity", "ImageSafetyEntity");
    }

    @Override // androidx.room.RoomDatabase
    public List createAutoMigrations(Map autoMigrationSpecs) {
        AbstractC9979u.m20294g(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "User", "File", "ResourceEntity", "ShareCacheEntity", "PdfEntity", "ImageSafetyEntity");
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC9983y.m20315b(UserDao.class), UserDao_Impl.f5928c.m5233a());
        linkedHashMap.put(AbstractC9983y.m20315b(FileDao.class), FileDao_Impl.f5807c.m5039a());
        linkedHashMap.put(AbstractC9983y.m20315b(ResourceDao.class), ResourceDao_Impl.f5893c.m5184a());
        linkedHashMap.put(AbstractC9983y.m20315b(InterfaceC5250g2.class), ShareCacheDao_Impl.f5917c.m5198a());
        linkedHashMap.put(AbstractC9983y.m20315b(InterfaceC5308v0.class), ImageSafetyDao_Impl.f5833c.m5061a());
        linkedHashMap.put(AbstractC9983y.m20315b(InterfaceC5225a1.class), PdfDao_Impl.f5837c.m5067a());
        return linkedHashMap;
    }

    @Override // com.friday.common.MyDataBase
    /* renamed from: r */
    public FileDao mo4750r() {
        return (FileDao) this.f5546o.getValue();
    }

    @Override // com.friday.common.MyDataBase
    /* renamed from: s */
    public InterfaceC5308v0 mo4751s() {
        return (InterfaceC5308v0) this.f5549r.getValue();
    }

    @Override // com.friday.common.MyDataBase
    /* renamed from: t */
    public InterfaceC5225a1 mo4752t() {
        return (InterfaceC5225a1) this.f5550s.getValue();
    }

    @Override // com.friday.common.MyDataBase
    /* renamed from: u */
    public ResourceDao mo4753u() {
        return (ResourceDao) this.f5547p.getValue();
    }

    @Override // com.friday.common.MyDataBase
    /* renamed from: v */
    public InterfaceC5250g2 mo4754v() {
        return (InterfaceC5250g2) this.f5548q.getValue();
    }

    @Override // com.friday.common.MyDataBase
    /* renamed from: w */
    public UserDao mo4755w() {
        return (UserDao) this.f5545n.getValue();
    }
}
