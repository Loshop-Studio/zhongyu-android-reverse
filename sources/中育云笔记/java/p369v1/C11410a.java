package p369v1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tendcloud.tenddata.C7979fc;
import p329s1.AbstractC11045l;
import p329s1.C11049p;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* renamed from: v1.a */
/* loaded from: classes3.dex */
public class C11410a extends SQLiteOpenHelper implements InterfaceC11412c {

    /* renamed from: c */
    public static final String[] f27234c = {"_id", "url", C7979fc.a.LENGTH, IMediaFormat.KEY_MIME};

    public C11410a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC11045l.m24467d(context);
    }

    @Override // p369v1.InterfaceC11412c
    /* renamed from: a */
    public void mo25367a(String str, C11049p c11049p) {
        AbstractC11045l.m24464a(str, c11049p);
        boolean z10 = get(str) != null;
        ContentValues contentValuesM25368c = m25368c(c11049p);
        if (z10) {
            getWritableDatabase().update("SourceInfo", contentValuesM25368c, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, contentValuesM25368c);
        }
    }

    /* renamed from: c */
    public final ContentValues m25368c(C11049p c11049p) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", c11049p.f26675a);
        contentValues.put(C7979fc.a.LENGTH, Long.valueOf(c11049p.f26676b));
        contentValues.put(IMediaFormat.KEY_MIME, c11049p.f26677c);
        return contentValues;
    }

    /* renamed from: d */
    public final C11049p m25369d(Cursor cursor) {
        return new C11049p(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow(C7979fc.a.LENGTH)), cursor.getString(cursor.getColumnIndexOrThrow(IMediaFormat.KEY_MIME)));
    }

    @Override // p369v1.InterfaceC11412c
    public C11049p get(String str) {
        C11049p c11049pM25369d;
        AbstractC11045l.m24467d(str);
        Cursor cursorQuery = getReadableDatabase().query("SourceInfo", f27234c, "url=?", new String[]{str}, null, null, null);
        if (cursorQuery != null) {
            try {
                c11049pM25369d = !cursorQuery.moveToFirst() ? null : m25369d(cursorQuery);
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return c11049pM25369d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        AbstractC11045l.m24467d(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }

    @Override // p369v1.InterfaceC11412c
    public void release() {
        close();
    }
}
