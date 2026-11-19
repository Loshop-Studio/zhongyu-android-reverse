package p018b3;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p013db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

/* renamed from: b3.d */
/* loaded from: classes3.dex */
public final class C4416d implements InterfaceC4415c {

    /* renamed from: a */
    public final RoomDatabase f1302a;

    /* renamed from: b */
    public final EntityInsertionAdapter f1303b;

    /* renamed from: c */
    public final C4413a f1304c = new C4413a();

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f1305d;

    /* renamed from: e */
    public final EntityDeletionOrUpdateAdapter f1306e;

    /* renamed from: b3.d$a */
    public class a extends EntityInsertionAdapter {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4414b c4414b) {
            supportSQLiteStatement.bindLong(1, c4414b.m1480f());
            if (c4414b.m1478d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, c4414b.m1478d());
            }
            if (c4414b.m1481g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c4414b.m1481g());
            }
            supportSQLiteStatement.bindLong(4, c4414b.m1482h());
            supportSQLiteStatement.bindLong(5, c4414b.m1477c());
            if (c4414b.m1483i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c4414b.m1483i());
            }
            supportSQLiteStatement.bindLong(7, C4416d.this.f1304c.m1473a(c4414b.m1479e()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `download` (`id`,`downloadUrl`,`localPath`,`totalSize`,`downloadSize`,`verifyCode`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    /* renamed from: b3.d$b */
    public class b extends EntityDeletionOrUpdateAdapter {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4414b c4414b) {
            supportSQLiteStatement.bindLong(1, c4414b.m1480f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `download` WHERE `id` = ?";
        }
    }

    /* renamed from: b3.d$c */
    public class c extends EntityDeletionOrUpdateAdapter {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4414b c4414b) {
            supportSQLiteStatement.bindLong(1, c4414b.m1480f());
            if (c4414b.m1478d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, c4414b.m1478d());
            }
            if (c4414b.m1481g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c4414b.m1481g());
            }
            supportSQLiteStatement.bindLong(4, c4414b.m1482h());
            supportSQLiteStatement.bindLong(5, c4414b.m1477c());
            if (c4414b.m1483i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c4414b.m1483i());
            }
            supportSQLiteStatement.bindLong(7, C4416d.this.f1304c.m1473a(c4414b.m1479e()));
            supportSQLiteStatement.bindLong(8, c4414b.m1480f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `download` SET `id` = ?,`downloadUrl` = ?,`localPath` = ?,`totalSize` = ?,`downloadSize` = ?,`verifyCode` = ?,`flag` = ? WHERE `id` = ?";
        }
    }

    public C4416d(RoomDatabase roomDatabase) {
        this.f1302a = roomDatabase;
        this.f1303b = new a(roomDatabase);
        this.f1305d = new b(roomDatabase);
        this.f1306e = new c(roomDatabase);
    }

    /* renamed from: e */
    public static List m1492e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p018b3.InterfaceC4415c
    /* renamed from: a */
    public long mo1488a(C4414b c4414b) {
        this.f1302a.assertNotSuspendingTransaction();
        this.f1302a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f1303b.insertAndReturnId(c4414b);
            this.f1302a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f1302a.endTransaction();
        }
    }

    @Override // p018b3.InterfaceC4415c
    /* renamed from: b */
    public void mo1489b(C4414b c4414b) {
        this.f1302a.assertNotSuspendingTransaction();
        this.f1302a.beginTransaction();
        try {
            this.f1306e.handle(c4414b);
            this.f1302a.setTransactionSuccessful();
        } finally {
            this.f1302a.endTransaction();
        }
    }

    @Override // p018b3.InterfaceC4415c
    /* renamed from: c */
    public C4414b mo1490c(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from download where downloadUrl = ? AND localPath = ?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        this.f1302a.assertNotSuspendingTransaction();
        C4414b c4414b = null;
        Cursor cursorQuery = DBUtil.query(this.f1302a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadUrl");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "localPath");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalSize");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadSize");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "verifyCode");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            if (cursorQuery.moveToFirst()) {
                c4414b = new C4414b(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), this.f1304c.m1474b(cursorQuery.getInt(columnIndexOrThrow7)));
            }
            return c4414b;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
