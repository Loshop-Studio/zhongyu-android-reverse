package p096f3;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import com.zykj.download.data.DownloadEntity;
import java.util.Collections;
import java.util.List;

/* renamed from: f3.c */
/* loaded from: classes4.dex */
public final class C8433c implements InterfaceC8432b {

    /* renamed from: a */
    public final RoomDatabase f16005a;

    /* renamed from: b */
    public final EntityInsertionAdapter f16006b;

    /* renamed from: c */
    public final C8431a f16007c = new C8431a();

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f16008d;

    /* renamed from: e */
    public final EntityDeletionOrUpdateAdapter f16009e;

    /* renamed from: f3.c$a */
    public class a extends EntityInsertionAdapter {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DownloadEntity downloadEntity) {
            supportSQLiteStatement.bindLong(1, downloadEntity.m9191f());
            if (downloadEntity.m9189d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, downloadEntity.m9189d());
            }
            if (downloadEntity.m9192g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, downloadEntity.m9192g());
            }
            supportSQLiteStatement.bindLong(4, downloadEntity.m9193h());
            supportSQLiteStatement.bindLong(5, downloadEntity.m9188c());
            if (downloadEntity.m9194i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, downloadEntity.m9194i());
            }
            supportSQLiteStatement.bindLong(7, C8433c.this.f16007c.m13768a(downloadEntity.m9190e()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `download` (`id`,`downloadUrl`,`localPath`,`totalSize`,`downloadSize`,`verifyCode`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    /* renamed from: f3.c$b */
    public class b extends EntityDeletionOrUpdateAdapter {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DownloadEntity downloadEntity) {
            supportSQLiteStatement.bindLong(1, downloadEntity.m9191f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `download` WHERE `id` = ?";
        }
    }

    /* renamed from: f3.c$c */
    public class c extends EntityDeletionOrUpdateAdapter {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DownloadEntity downloadEntity) {
            supportSQLiteStatement.bindLong(1, downloadEntity.m9191f());
            if (downloadEntity.m9189d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, downloadEntity.m9189d());
            }
            if (downloadEntity.m9192g() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, downloadEntity.m9192g());
            }
            supportSQLiteStatement.bindLong(4, downloadEntity.m9193h());
            supportSQLiteStatement.bindLong(5, downloadEntity.m9188c());
            if (downloadEntity.m9194i() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, downloadEntity.m9194i());
            }
            supportSQLiteStatement.bindLong(7, C8433c.this.f16007c.m13768a(downloadEntity.m9190e()));
            supportSQLiteStatement.bindLong(8, downloadEntity.m9191f());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `download` SET `id` = ?,`downloadUrl` = ?,`localPath` = ?,`totalSize` = ?,`downloadSize` = ?,`verifyCode` = ?,`flag` = ? WHERE `id` = ?";
        }
    }

    public C8433c(RoomDatabase roomDatabase) {
        this.f16005a = roomDatabase;
        this.f16006b = new a(roomDatabase);
        this.f16008d = new b(roomDatabase);
        this.f16009e = new c(roomDatabase);
    }

    /* renamed from: e */
    public static List m13774e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p096f3.InterfaceC8432b
    /* renamed from: a */
    public void mo13770a(DownloadEntity downloadEntity) {
        this.f16005a.assertNotSuspendingTransaction();
        this.f16005a.beginTransaction();
        try {
            this.f16009e.handle(downloadEntity);
            this.f16005a.setTransactionSuccessful();
        } finally {
            this.f16005a.endTransaction();
        }
    }

    @Override // p096f3.InterfaceC8432b
    /* renamed from: b */
    public DownloadEntity mo13771b(String str, String str2) {
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
        this.f16005a.assertNotSuspendingTransaction();
        DownloadEntity downloadEntity = null;
        Cursor cursorQuery = DBUtil.query(this.f16005a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadUrl");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "localPath");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalSize");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadSize");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "verifyCode");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            if (cursorQuery.moveToFirst()) {
                downloadEntity = new DownloadEntity(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), this.f16007c.m13769b(cursorQuery.getInt(columnIndexOrThrow7)));
            }
            return downloadEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // p096f3.InterfaceC8432b
    /* renamed from: c */
    public long mo13772c(DownloadEntity downloadEntity) {
        this.f16005a.assertNotSuspendingTransaction();
        this.f16005a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f16006b.insertAndReturnId(downloadEntity);
            this.f16005a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f16005a.endTransaction();
        }
    }
}
