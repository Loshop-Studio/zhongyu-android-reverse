package com.huawei.hms.framework.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class NetworkKitSQLiteOpenHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;

    /* renamed from: d */
    public static String f11642d = "networkkit.db";

    /* renamed from: e */
    public static volatile NetworkKitSQLiteOpenHelper f11643e;

    /* renamed from: c */
    public ConcurrentHashMap f11644c;

    static {
        if (ContextHolder.getKitContext() != null) {
            f11642d = "networkkit_dynamic.db";
        }
    }

    public NetworkKitSQLiteOpenHelper(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f11644c = new ConcurrentHashMap();
    }

    public static NetworkKitSQLiteOpenHelper getInstance() {
        if (f11643e == null) {
            synchronized (NetworkKitSQLiteOpenHelper.class) {
                try {
                    if (f11643e == null) {
                        f11643e = new NetworkKitSQLiteOpenHelper(ContextHolder.getAppContext().createDeviceProtectedStorageContext(), f11642d, 1);
                    }
                } finally {
                }
            }
        }
        return f11643e;
    }

    public void deleteDbByName(String str) {
        Logger.m8571d("PLSQLiteOpenHelper", "close old db from oldDbMaps, dbname = " + str);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f11644c.get(str);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f11644c.remove(str);
        }
    }

    public boolean deleteDbFile() {
        return deleteDbFileByPath(getNetworkKitReadableDatabase().getPath());
    }

    public boolean deleteDbFileByPath(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        Logger.m8580i("PLSQLiteOpenHelper", "db is not exists");
        return false;
    }

    public boolean deleteUnusedDbFile() {
        return deleteDbFileByPath(getNetworkKitReadableDatabase().getPath().replace(f11642d, f11642d.equals("networkkit_dynamic.db") ? "networkkit.db" : "networkkit_dynamic.db"));
    }

    public SQLiteDatabase getDbByName(String str) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f11644c.get(str);
        if (sQLiteDatabase != null) {
            Logger.m8571d("PLSQLiteOpenHelper", "get old db from oldDbMaps, dbname = " + str);
            return sQLiteDatabase;
        }
        SQLiteDatabase networkKitReadableDatabase = getNetworkKitReadableDatabase();
        if (networkKitReadableDatabase != null) {
            String strReplace = networkKitReadableDatabase.getPath().replace(f11642d, str);
            if (new File(strReplace).exists()) {
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(strReplace, null, 0);
                this.f11644c.put(str, sQLiteDatabaseOpenDatabase);
                Logger.m8571d("PLSQLiteOpenHelper", "create and put old db to oldDbMaps, dbname = " + str);
                return sQLiteDatabaseOpenDatabase;
            }
            Logger.m8580i("PLSQLiteOpenHelper", "old db is not exists");
        }
        return networkKitReadableDatabase;
    }

    public String getDbName() {
        return f11642d;
    }

    public String getDbNameSuffix() {
        return "-journal";
    }

    public SQLiteDatabase getNetworkKitReadableDatabase() {
        SQLiteDatabase readableDatabase;
        try {
            readableDatabase = getReadableDatabase();
        } catch (Throwable th) {
            Logger.m8573e("PLSQLiteOpenHelper", "getReadableDatabase db error:" + th.getMessage());
            readableDatabase = null;
        }
        if (readableDatabase == null) {
            Logger.m8573e("PLSQLiteOpenHelper", "getReadableDatabase db is null");
        }
        return readableDatabase;
    }

    public SQLiteDatabase getNetworkKitWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = getWritableDatabase();
        } catch (Throwable th) {
            Logger.m8573e("PLSQLiteOpenHelper", "getWritableDatabase db error:" + th.getMessage());
            writableDatabase = null;
        }
        if (writableDatabase == null) {
            Logger.m8573e("PLSQLiteOpenHelper", "getWritableDatabase db is null");
        }
        return writableDatabase;
    }

    public SQLiteDatabase getNetworkkitUnusedDbDB() {
        return getDbByName(f11642d.equals("networkkit_dynamic.db") ? "networkkit.db" : "networkkit_dynamic.db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
