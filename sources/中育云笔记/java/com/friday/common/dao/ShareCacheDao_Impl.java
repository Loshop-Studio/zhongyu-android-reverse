package com.friday.common.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.ShareCacheDao_Impl;
import com.friday.common.entity.ShareCacheEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ShareCacheDao_Impl implements InterfaceC5250g2 {

    /* renamed from: c */
    public static final C5952a f5917c = new C5952a(null);

    /* renamed from: d */
    public static final int f5918d = 8;

    /* renamed from: a */
    public final RoomDatabase f5919a;

    /* renamed from: b */
    public final EntityInsertAdapter f5920b;

    /* renamed from: com.friday.common.dao.ShareCacheDao_Impl$a */
    public static final class C5952a {
        public /* synthetic */ C5952a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m5198a() {
            return AbstractC10978w.m24136n();
        }

        public C5952a() {
        }
    }

    public ShareCacheDao_Impl(RoomDatabase __db) {
        AbstractC9979u.m20294g(__db, "__db");
        this.f5919a = __db;
        this.f5920b = new EntityInsertAdapter<ShareCacheEntity>() { // from class: com.friday.common.dao.ShareCacheDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, ShareCacheEntity entity) {
                AbstractC9979u.m20294g(statement, "statement");
                AbstractC9979u.m20294g(entity, "entity");
                statement.mo33819bindText(1, entity.getCacheId());
                statement.mo33819bindText(2, entity.getFileId());
                statement.mo33817bindLong(3, entity.getVersion());
                statement.mo33817bindLong(4, entity.getAccountId());
                statement.mo33817bindLong(5, entity.getPreviewTime());
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ShareCacheEntity` (`cacheId`,`fileId`,`version`,`accountId`,`previewTime`) VALUES (?,?,?,?,?)";
            }
        };
    }

    /* renamed from: n */
    public static final C10786q m5191n(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: o */
    public static final C10786q m5192o(String str, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: p */
    public static final List m5193p(String str, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cacheId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previewTime");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ShareCacheEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: q */
    public static final ShareCacheEntity m5194q(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            return sQLiteStatementPrepare.step() ? new ShareCacheEntity(sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cacheId")), sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previewTime"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: r */
    public static final C10786q m5195r(ShareCacheDao_Impl shareCacheDao_Impl, ShareCacheEntity shareCacheEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        shareCacheDao_Impl.f5920b.insert(_connection, (SQLiteConnection) shareCacheEntity);
        return C10786q.f26013a;
    }

    /* renamed from: s */
    public static final C10786q m5196s(String str, long j10, String str2, long j11, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            sQLiteStatementPrepare.mo33817bindLong(3, j11);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // p040c2.InterfaceC5250g2
    /* renamed from: b */
    public Object mo2806b(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "DELETE FROM ShareCacheEntity WHERE accountId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5919a, false, true, new InterfaceC9540l() { // from class: c2.i2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareCacheDao_Impl.m5192o(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5250g2
    /* renamed from: c */
    public Object mo2807c(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM ShareCacheEntity WHERE fileId=? AND accountId=?";
        return DBUtil.performSuspending(this.f5919a, true, false, new InterfaceC9540l() { // from class: c2.h2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareCacheDao_Impl.m5194q(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // p040c2.InterfaceC5250g2
    /* renamed from: d */
    public Object mo2808d(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "DELETE FROM ShareCacheEntity WHERE fileId=? AND accountId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5919a, false, true, new InterfaceC9540l() { // from class: c2.j2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareCacheDao_Impl.m5191n(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5250g2
    /* renamed from: e */
    public Object mo2809e(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM ShareCacheEntity WHERE accountId=?";
        return DBUtil.performSuspending(this.f5919a, true, false, new InterfaceC9540l() { // from class: c2.m2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareCacheDao_Impl.m5193p(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // p040c2.InterfaceC5250g2
    /* renamed from: f */
    public Object mo2810f(final long j10, final String str, final long j11, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ShareCacheEntity SET previewTime=? WHERE fileId =? AND accountId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5919a, false, true, new InterfaceC9540l() { // from class: c2.l2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareCacheDao_Impl.m5196s(str2, j10, str, j11, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5250g2
    /* renamed from: g */
    public Object mo2811g(final ShareCacheEntity shareCacheEntity, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5919a, false, true, new InterfaceC9540l() { // from class: c2.k2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareCacheDao_Impl.m5195r(this.f3235c, shareCacheEntity, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }
}
