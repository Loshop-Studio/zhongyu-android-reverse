package p229r1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.SparseArray;
import com.liulishuo.okdownload.core.exception.SQLiteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: r1.e */
/* loaded from: classes4.dex */
public class C9421e extends SQLiteOpenHelper {
    public C9421e(Context context) {
        super(context, "okdownload-breakpoint.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* renamed from: m */
    public static ContentValues m15540m(int i9, int i10, C9417a c9417a) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("breakpoint_id", Integer.valueOf(i9));
        contentValues.put("block_index", Integer.valueOf(i10));
        contentValues.put("start_offset", Long.valueOf(c9417a.m15515f()));
        contentValues.put("content_length", Long.valueOf(c9417a.m15511b()));
        contentValues.put("current_offset", Long.valueOf(c9417a.m15512c()));
        return contentValues;
    }

    /* renamed from: n */
    public static ContentValues m15541n(C9419c c9419c) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c9419c.f16424a));
        contentValues.put("url", c9419c.m15531l());
        contentValues.put("etag", c9419c.m15524e());
        contentValues.put("parent_path", c9419c.f16427d.getAbsolutePath());
        contentValues.put("filename", c9419c.m15526g());
        contentValues.put("task_only_parent_path", Integer.valueOf(c9419c.m15534o() ? 1 : 0));
        contentValues.put("chunked", Integer.valueOf(c9419c.m15532m() ? 1 : 0));
        return contentValues;
    }

    /* renamed from: a */
    public void m15542a(C9419c c9419c) throws SQLiteException {
        int iM15523d = c9419c.m15523d();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        for (int i9 = 0; i9 < iM15523d; i9++) {
            C9417a c9417aM15522c = c9419c.m15522c(i9);
            if (writableDatabase.insert("block", null, m15540m(c9419c.f16424a, i9, c9417aM15522c)) == -1) {
                throw new SQLiteException("insert block " + c9417aM15522c + " failed!");
            }
        }
        if (writableDatabase.insert("breakpoint", null, m15541n(c9419c)) != -1) {
            return;
        }
        throw new SQLiteException("insert info " + c9419c + " failed!");
    }

    /* renamed from: c */
    public List m15543c() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = getWritableDatabase().rawQuery("SELECT * FROM taskFileDirty", null);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("id"))));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: g */
    public HashMap m15544g() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        HashMap map = new HashMap();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM okdownloadResponseFilename", null);
            while (cursorRawQuery.moveToNext()) {
                map.put(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("filename")));
            }
            cursorRawQuery.close();
            return map;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: h */
    public SparseArray m15545h() throws Throwable {
        Cursor cursor;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            Cursor cursorRawQuery2 = writableDatabase.rawQuery("SELECT * FROM breakpoint", null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    arrayList.add(new C9420d(cursorRawQuery2));
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM block", null);
            while (cursorRawQuery.moveToNext()) {
                arrayList2.add(new C9418b(cursorRawQuery));
            }
            cursorRawQuery2.close();
            cursorRawQuery.close();
            SparseArray sparseArray = new SparseArray();
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                C9419c c9419cM15539a = ((C9420d) obj).m15539a();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C9418b c9418b = (C9418b) it.next();
                    if (c9418b.m15518a() == c9419cM15539a.f16424a) {
                        c9419cM15539a.m15520a(c9418b.m15519b());
                        it.remove();
                    }
                }
                sparseArray.put(c9419cM15539a.f16424a, c9419cM15539a);
            }
            return sparseArray;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: i */
    public void m15546i(int i9) {
        getWritableDatabase().delete("taskFileDirty", "id = ?", new String[]{String.valueOf(i9)});
    }

    /* renamed from: j */
    public void m15547j(int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("id", Integer.valueOf(i9));
        writableDatabase.insert("taskFileDirty", null, contentValues);
    }

    /* renamed from: k */
    public void m15548k(int i9) {
        getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i9)});
    }

    /* renamed from: l */
    public void m15549l(int i9) {
        getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i9)});
        m15548k(i9);
    }

    /* renamed from: o */
    public void m15550o(C9419c c9419c, int i9, long j9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_offset", Long.valueOf(j9));
        getWritableDatabase().update("block", contentValues, "breakpoint_id = ? AND block_index = ?", new String[]{Integer.toString(c9419c.f16424a), Integer.toString(i9)});
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS breakpoint( id INTEGER PRIMARY KEY, url VARCHAR NOT NULL, etag VARCHAR, parent_path VARCHAR NOT NULL, filename VARCHAR, task_only_parent_path TINYINT(1) DEFAULT 0, chunked TINYINT(1) DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS block( id INTEGER PRIMARY KEY AUTOINCREMENT, breakpoint_id INTEGER, block_index INTEGER, start_offset INTEGER, content_length INTEGER, current_offset INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        setWriteAheadLoggingEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) throws SQLException {
        if (i9 == 1 && i10 == 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        }
        if (i9 <= 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
        }
    }

    /* renamed from: p */
    public void m15551p(String str, String str2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("url", str);
        contentValues.put("filename", str2);
        synchronized (str.intern()) {
            Cursor cursor = null;
            try {
                try {
                    Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT filename FROM okdownloadResponseFilename WHERE url = ?", new String[]{str});
                    try {
                        if (!cursorRawQuery.moveToFirst()) {
                            writableDatabase.insert("okdownloadResponseFilename", null, contentValues);
                        } else if (!str2.equals(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("filename")))) {
                            writableDatabase.replace("okdownloadResponseFilename", null, contentValues);
                        }
                        cursorRawQuery.close();
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: q */
    public void m15552q(C9419c c9419c) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = getWritableDatabase().rawQuery("SELECT id FROM breakpoint WHERE id =" + c9419c.f16424a + " LIMIT 1", null);
            if (cursorRawQuery.moveToNext()) {
                m15549l(c9419c.f16424a);
                m15542a(c9419c);
                writableDatabase.setTransactionSuccessful();
            }
            cursorRawQuery.close();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }
}
