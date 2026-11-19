package p407xa;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* renamed from: xa.d */
/* loaded from: classes6.dex */
public final class C11819d implements InterfaceC11818c {

    /* renamed from: a */
    public final RoomDatabase f28059a;

    /* renamed from: b */
    public final EntityInsertionAdapter f28060b;

    /* renamed from: c */
    public final C11816a f28061c = new C11816a();

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f28062d;

    /* renamed from: e */
    public final EntityDeletionOrUpdateAdapter f28063e;

    /* renamed from: xa.d$a */
    public class a extends EntityInsertionAdapter {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C11817b c11817b) {
            supportSQLiteStatement.bindLong(1, c11817b.m26188f());
            if (c11817b.m26186d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, c11817b.m26186d());
            }
            if (c11817b.m26189g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c11817b.m26189g());
            }
            supportSQLiteStatement.bindLong(4, c11817b.m26190h());
            supportSQLiteStatement.bindLong(5, c11817b.m26185c());
            if (c11817b.m26191i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c11817b.m26191i());
            }
            supportSQLiteStatement.bindLong(7, C11819d.this.f28061c.m26181a(c11817b.m26187e()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `download` (`id`,`downloadUrl`,`localPath`,`totalSize`,`downloadSize`,`verifyCode`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    /* renamed from: xa.d$b */
    public class b extends EntityDeletionOrUpdateAdapter {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C11817b c11817b) {
            supportSQLiteStatement.bindLong(1, c11817b.m26188f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `download` WHERE `id` = ?";
        }
    }

    /* renamed from: xa.d$c */
    public class c extends EntityDeletionOrUpdateAdapter {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C11817b c11817b) {
            supportSQLiteStatement.bindLong(1, c11817b.m26188f());
            if (c11817b.m26186d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, c11817b.m26186d());
            }
            if (c11817b.m26189g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c11817b.m26189g());
            }
            supportSQLiteStatement.bindLong(4, c11817b.m26190h());
            supportSQLiteStatement.bindLong(5, c11817b.m26185c());
            if (c11817b.m26191i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c11817b.m26191i());
            }
            supportSQLiteStatement.bindLong(7, C11819d.this.f28061c.m26181a(c11817b.m26187e()));
            supportSQLiteStatement.bindLong(8, c11817b.m26188f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `download` SET `id` = ?,`downloadUrl` = ?,`localPath` = ?,`totalSize` = ?,`downloadSize` = ?,`verifyCode` = ?,`flag` = ? WHERE `id` = ?";
        }
    }

    public C11819d(RoomDatabase roomDatabase) {
        this.f28059a = roomDatabase;
        this.f28060b = new a(roomDatabase);
        this.f28062d = new b(roomDatabase);
        this.f28063e = new c(roomDatabase);
    }

    /* renamed from: e */
    public static List m26200e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p407xa.InterfaceC11818c
    /* renamed from: a */
    public long mo26196a(C11817b c11817b) {
        this.f28059a.assertNotSuspendingTransaction();
        this.f28059a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f28060b.insertAndReturnId(c11817b);
            this.f28059a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f28059a.endTransaction();
        }
    }

    @Override // p407xa.InterfaceC11818c
    /* renamed from: b */
    public C11817b mo26197b(String str, String str2) {
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
        this.f28059a.assertNotSuspendingTransaction();
        C11817b c11817b = null;
        Cursor cursorQuery = DBUtil.query(this.f28059a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadUrl");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "localPath");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalSize");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadSize");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "verifyCode");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, AgooConstants.MESSAGE_FLAG);
            if (cursorQuery.moveToFirst()) {
                c11817b = new C11817b(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), this.f28061c.m26182b(cursorQuery.getInt(columnIndexOrThrow7)));
            }
            return c11817b;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // p407xa.InterfaceC11818c
    /* renamed from: c */
    public void mo26198c(C11817b c11817b) {
        this.f28059a.assertNotSuspendingTransaction();
        this.f28059a.beginTransaction();
        try {
            this.f28063e.handle(c11817b);
            this.f28059a.setTransactionSuccessful();
        } finally {
            this.f28059a.endTransaction();
        }
    }
}
