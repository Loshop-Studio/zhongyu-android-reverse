package com.friday.common.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.UserDao_Impl;
import com.friday.common.entity.User;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class UserDao_Impl implements UserDao {

    /* renamed from: c */
    public static final C5954a f5928c = new C5954a(null);

    /* renamed from: d */
    public static final int f5929d = 8;

    /* renamed from: a */
    public final RoomDatabase f5930a;

    /* renamed from: b */
    public final EntityInsertAdapter f5931b;

    /* renamed from: com.friday.common.dao.UserDao_Impl$a */
    public static final class C5954a {
        public /* synthetic */ C5954a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m5233a() {
            return AbstractC10978w.m24136n();
        }

        public C5954a() {
        }
    }

    public UserDao_Impl(RoomDatabase __db) {
        AbstractC9979u.m20294g(__db, "__db");
        this.f5930a = __db;
        this.f5931b = new EntityInsertAdapter<User>() { // from class: com.friday.common.dao.UserDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, User entity) {
                AbstractC9979u.m20294g(statement, "statement");
                AbstractC9979u.m20294g(entity, "entity");
                statement.mo33817bindLong(1, entity.getAccountId());
                statement.mo33819bindText(2, entity.getAccountName());
                statement.mo33819bindText(3, entity.getHeadPhotoUrl());
                statement.mo33819bindText(4, entity.getUserName());
                statement.mo33819bindText(5, entity.getUnit());
                statement.mo33817bindLong(6, entity.getCameraPermission() ? 1L : 0L);
                statement.mo33817bindLong(7, entity.getAlbumPermission() ? 1L : 0L);
                statement.mo33817bindLong(8, entity.getScreenshotsPermission() ? 1L : 0L);
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `User` (`accountId`,`accountName`,`headPhotoUrl`,`userName`,`unit`,`cameraPermission`,`albumPermission`,`screenshotsPermission`) VALUES (?,?,?,?,?,?,?,?)";
            }
        };
    }

    /* renamed from: A */
    public static final User m5215A(String str, long j10, SQLiteConnection _connection) {
        User user;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "headPhotoUrl");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unit");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cameraPermission");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "albumPermission");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "screenshotsPermission");
            if (sQLiteStatementPrepare.step()) {
                user = new User(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
            } else {
                user = null;
            }
            return user;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: B */
    public static final boolean m5216B(String str, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                z10 = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            return z10;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: C */
    public static final boolean m5217C(String str, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                z10 = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            return z10;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: D */
    public static final C10786q m5218D(UserDao_Impl userDao_Impl, User user, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        userDao_Impl.f5931b.insert(_connection, (SQLiteConnection) user);
        return C10786q.f26013a;
    }

    /* renamed from: E */
    public static final C10786q m5219E(String str, boolean z10, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: F */
    public static final C10786q m5220F(String str, boolean z10, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: G */
    public static final C10786q m5221G(String str, boolean z10, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: z */
    public static final boolean m5231z(String str, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                z10 = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            return z10;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: b */
    public Object mo5206b(long j10, String str, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5930a, new UserDao_Impl$insertUserOrUpdate$2(this, j10, str, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: c */
    public Object mo5207c(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT albumPermission FROM User WHERE accountId=?";
        return DBUtil.performSuspending(this.f5930a, true, false, new InterfaceC9540l() { // from class: c2.q2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UserDao_Impl.m5231z(str, j10, (SQLiteConnection) obj));
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: d */
    public Object mo5208d(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT screenshotsPermission FROM User WHERE accountId=?";
        return DBUtil.performSuspending(this.f5930a, true, false, new InterfaceC9540l() { // from class: c2.n2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UserDao_Impl.m5217C(str, j10, (SQLiteConnection) obj));
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: f */
    public Object mo5209f(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT cameraPermission FROM User WHERE accountId=?";
        return DBUtil.performSuspending(this.f5930a, true, false, new InterfaceC9540l() { // from class: c2.o2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UserDao_Impl.m5216B(str, j10, (SQLiteConnection) obj));
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: g */
    public Object mo5210g(final boolean z10, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "UPDATE User SET screenshotsPermission =? WHERE accountId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5930a, false, true, new InterfaceC9540l() { // from class: c2.r2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return UserDao_Impl.m5221G(str, z10, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: h */
    public Object mo5211h(final User user, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5930a, false, true, new InterfaceC9540l() { // from class: c2.u2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return UserDao_Impl.m5218D(this.f3338c, user, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: l */
    public Object mo5212l(final boolean z10, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "UPDATE User SET albumPermission =? WHERE accountId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5930a, false, true, new InterfaceC9540l() { // from class: c2.t2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return UserDao_Impl.m5219E(str, z10, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: o */
    public Object mo5213o(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM User WHERE accountId=?";
        return DBUtil.performSuspending(this.f5930a, true, false, new InterfaceC9540l() { // from class: c2.s2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return UserDao_Impl.m5215A(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.UserDao
    /* renamed from: p */
    public Object mo5214p(final boolean z10, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "UPDATE User SET cameraPermission =? WHERE accountId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5930a, false, true, new InterfaceC9540l() { // from class: c2.p2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return UserDao_Impl.m5220F(str, z10, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }
}
