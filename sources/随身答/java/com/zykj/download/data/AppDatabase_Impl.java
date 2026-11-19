package com.zykj.download.data;

// RE note 本类字节码直接引用的读写或显示接口包括SQLite。

import android.database.SQLException;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p016db.SupportSQLiteDatabase;
import androidx.sqlite.p016db.SupportSQLiteOpenHelper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p283w5.AbstractC9832g;
import p283w5.C9829d;
import p283w5.InterfaceC9828c;
import p283w5.InterfaceC9831f;

/* loaded from: classes4.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: c */
    public volatile InterfaceC9828c f9889c;

    /* renamed from: com.zykj.download.data.AppDatabase_Impl$a */
    public class C7169a extends RoomOpenHelper.Delegate {
        public C7169a(int i9) {
            super(i9);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `download` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `downloadUrl` TEXT NOT NULL, `localPath` TEXT NOT NULL, `totalSize` INTEGER NOT NULL, `downloadSize` INTEGER NOT NULL, `verifyCode` TEXT, `flag` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `upload` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2eb05d347b056192efce82d4a1a31864')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `download`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `upload`");
            if (((RoomDatabase) AppDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AppDatabase_Impl.this).mCallbacks.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) AppDatabase_Impl.this).mCallbacks.get(i9)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) AppDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AppDatabase_Impl.this).mCallbacks.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) AppDatabase_Impl.this).mCallbacks.get(i9)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) AppDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            AppDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) AppDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AppDatabase_Impl.this).mCallbacks.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) AppDatabase_Impl.this).mCallbacks.get(i9)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(7);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("downloadUrl", new TableInfo.Column("downloadUrl", "TEXT", true, 0, null, 1));
            map.put("localPath", new TableInfo.Column("localPath", "TEXT", true, 0, null, 1));
            map.put("totalSize", new TableInfo.Column("totalSize", "INTEGER", true, 0, null, 1));
            map.put("downloadSize", new TableInfo.Column("downloadSize", "INTEGER", true, 0, null, 1));
            map.put("verifyCode", new TableInfo.Column("verifyCode", "TEXT", false, 0, null, 1));
            map.put("flag", new TableInfo.Column("flag", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("download", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "download");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "download(com.zykj.download.data.DownloadEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(1);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            TableInfo tableInfo3 = new TableInfo("upload", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "upload");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "upload(com.zykj.download.data.UploadEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `download`");
            writableDatabase.execSQL("DELETE FROM `upload`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "download", "upload");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C7169a(1), "2eb05d347b056192efce82d4a1a31864", "4bf3ee84833a0c2d99ec4a28d4cd32bb")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC9828c.class, C9829d.m16757e());
        map.put(InterfaceC9831f.class, AbstractC9832g.m16761a());
        return map;
    }

    @Override // com.zykj.download.data.AppDatabase
    /* renamed from: i */
    public InterfaceC9828c mo9795i() {
        InterfaceC9828c interfaceC9828c;
        if (this.f9889c != null) {
            return this.f9889c;
        }
        synchronized (this) {
            try {
                if (this.f9889c == null) {
                    this.f9889c = new C9829d(this);
                }
                interfaceC9828c = this.f9889c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC9828c;
    }
}
