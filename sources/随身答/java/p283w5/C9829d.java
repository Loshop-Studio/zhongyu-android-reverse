package p283w5;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p016db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

/* renamed from: w5.d */
/* loaded from: classes4.dex */
public final class C9829d implements InterfaceC9828c {

    /* renamed from: a */
    public final RoomDatabase f17538a;

    /* renamed from: b */
    public final EntityInsertionAdapter f17539b;

    /* renamed from: c */
    public final C9826a f17540c = new C9826a();

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f17541d;

    /* renamed from: e */
    public final EntityDeletionOrUpdateAdapter f17542e;

    /* renamed from: w5.d$a */
    public class a extends EntityInsertionAdapter {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C9827b c9827b) {
            supportSQLiteStatement.bindLong(1, c9827b.m16745f());
            if (c9827b.m16743d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, c9827b.m16743d());
            }
            if (c9827b.m16746g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c9827b.m16746g());
            }
            supportSQLiteStatement.bindLong(4, c9827b.m16747h());
            supportSQLiteStatement.bindLong(5, c9827b.m16742c());
            if (c9827b.m16748i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c9827b.m16748i());
            }
            supportSQLiteStatement.bindLong(7, C9829d.this.f17540c.m16738a(c9827b.m16744e()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `download` (`id`,`downloadUrl`,`localPath`,`totalSize`,`downloadSize`,`verifyCode`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    /* renamed from: w5.d$b */
    public class b extends EntityDeletionOrUpdateAdapter {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C9827b c9827b) {
            supportSQLiteStatement.bindLong(1, c9827b.m16745f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `download` WHERE `id` = ?";
        }
    }

    /* renamed from: w5.d$c */
    public class c extends EntityDeletionOrUpdateAdapter {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C9827b c9827b) {
            supportSQLiteStatement.bindLong(1, c9827b.m16745f());
            if (c9827b.m16743d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, c9827b.m16743d());
            }
            if (c9827b.m16746g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c9827b.m16746g());
            }
            supportSQLiteStatement.bindLong(4, c9827b.m16747h());
            supportSQLiteStatement.bindLong(5, c9827b.m16742c());
            if (c9827b.m16748i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c9827b.m16748i());
            }
            supportSQLiteStatement.bindLong(7, C9829d.this.f17540c.m16738a(c9827b.m16744e()));
            supportSQLiteStatement.bindLong(8, c9827b.m16745f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `download` SET `id` = ?,`downloadUrl` = ?,`localPath` = ?,`totalSize` = ?,`downloadSize` = ?,`verifyCode` = ?,`flag` = ? WHERE `id` = ?";
        }
    }

    public C9829d(RoomDatabase roomDatabase) {
        this.f17538a = roomDatabase;
        this.f17539b = new a(roomDatabase);
        this.f17541d = new b(roomDatabase);
        this.f17542e = new c(roomDatabase);
    }

    /* renamed from: e */
    public static List m16757e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p283w5.InterfaceC9828c
    /* renamed from: a */
    public void mo16753a(C9827b c9827b) {
        this.f17538a.assertNotSuspendingTransaction();
        this.f17538a.beginTransaction();
        try {
            this.f17542e.handle(c9827b);
            this.f17538a.setTransactionSuccessful();
        } finally {
            this.f17538a.endTransaction();
        }
    }

    @Override // p283w5.InterfaceC9828c
    /* renamed from: b */
    public C9827b mo16754b(String str, String str2) {
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
        this.f17538a.assertNotSuspendingTransaction();
        C9827b c9827b = null;
        Cursor cursorQuery = DBUtil.query(this.f17538a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadUrl");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "localPath");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalSize");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadSize");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "verifyCode");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            if (cursorQuery.moveToFirst()) {
                c9827b = new C9827b(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), this.f17540c.m16739b(cursorQuery.getInt(columnIndexOrThrow7)));
            }
            return c9827b;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // p283w5.InterfaceC9828c
    /* renamed from: c */
    public long mo16755c(C9827b c9827b) {
        this.f17538a.assertNotSuspendingTransaction();
        this.f17538a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f17539b.insertAndReturnId(c9827b);
            this.f17538a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f17538a.endTransaction();
        }
    }
}
