package p229s1;

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

/* renamed from: s1.e */
/* loaded from: classes4.dex */
public class C9128e extends SQLiteOpenHelper {
    public C9128e(Context context) {
        super(context, "okdownload-breakpoint.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* renamed from: m */
    public static ContentValues m15486m(int i10, int i11, C9124a c9124a) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("breakpoint_id", Integer.valueOf(i10));
        contentValues.put("block_index", Integer.valueOf(i11));
        contentValues.put("start_offset", Long.valueOf(c9124a.m15461f()));
        contentValues.put("content_length", Long.valueOf(c9124a.m15457b()));
        contentValues.put("current_offset", Long.valueOf(c9124a.m15458c()));
        return contentValues;
    }

    /* renamed from: n */
    public static ContentValues m15487n(C9126c c9126c) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c9126c.f15837a));
        contentValues.put("url", c9126c.m15477l());
        contentValues.put("etag", c9126c.m15470e());
        contentValues.put("parent_path", c9126c.f15840d.getAbsolutePath());
        contentValues.put("filename", c9126c.m15472g());
        contentValues.put("task_only_parent_path", Integer.valueOf(c9126c.m15480o() ? 1 : 0));
        contentValues.put("chunked", Integer.valueOf(c9126c.m15478m() ? 1 : 0));
        return contentValues;
    }

    /* renamed from: a */
    public void m15488a(C9126c c9126c) throws SQLiteException {
        int iM15469d = c9126c.m15469d();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        for (int i10 = 0; i10 < iM15469d; i10++) {
            C9124a c9124aM15468c = c9126c.m15468c(i10);
            if (writableDatabase.insert("block", null, m15486m(c9126c.f15837a, i10, c9124aM15468c)) == -1) {
                throw new SQLiteException("insert block " + c9124aM15468c + " failed!");
            }
        }
        if (writableDatabase.insert("breakpoint", null, m15487n(c9126c)) != -1) {
            return;
        }
        throw new SQLiteException("insert info " + c9126c + " failed!");
    }

    /* renamed from: f */
    public List m15489f() {
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
    public HashMap m15490g() {
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
    public SparseArray m15491h() throws Throwable {
        Cursor cursor;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            Cursor cursorRawQuery2 = writableDatabase.rawQuery("SELECT * FROM breakpoint", null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    arrayList.add(new C9127d(cursorRawQuery2));
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
                arrayList2.add(new C9125b(cursorRawQuery));
            }
            cursorRawQuery2.close();
            cursorRawQuery.close();
            SparseArray sparseArray = new SparseArray();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C9126c c9126cM15485a = ((C9127d) obj).m15485a();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C9125b c9125b = (C9125b) it.next();
                    if (c9125b.m15464a() == c9126cM15485a.f15837a) {
                        c9126cM15485a.m15466a(c9125b.m15465b());
                        it.remove();
                    }
                }
                sparseArray.put(c9126cM15485a.f15837a, c9126cM15485a);
            }
            return sparseArray;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: i */
    public void m15492i(int i10) {
        getWritableDatabase().delete("taskFileDirty", "id = ?", new String[]{String.valueOf(i10)});
    }

    /* renamed from: j */
    public void m15493j(int i10) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("id", Integer.valueOf(i10));
        writableDatabase.insert("taskFileDirty", null, contentValues);
    }

    /* renamed from: k */
    public void m15494k(int i10) {
        getWritableDatabase().delete("block", "breakpoint_id = ?", new String[]{String.valueOf(i10)});
    }

    /* renamed from: l */
    public void m15495l(int i10) {
        getWritableDatabase().delete("breakpoint", "id = ?", new String[]{String.valueOf(i10)});
        m15494k(i10);
    }

    /* renamed from: o */
    public void m15496o(C9126c c9126c, int i10, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_offset", Long.valueOf(j10));
        getWritableDatabase().update("block", contentValues, "breakpoint_id = ? AND block_index = ?", new String[]{Integer.toString(c9126c.f15837a), Integer.toString(i10)});
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
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (i10 == 1 && i11 == 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        }
        if (i10 <= 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
        }
    }

    /* renamed from: p */
    public void m15497p(String str, String str2) {
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
    public void m15498q(C9126c c9126c) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = getWritableDatabase().rawQuery("SELECT id FROM breakpoint WHERE id =" + c9126c.f15837a + " LIMIT 1", null);
            if (cursorRawQuery.moveToNext()) {
                m15495l(c9126c.f15837a);
                m15488a(c9126c);
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
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
