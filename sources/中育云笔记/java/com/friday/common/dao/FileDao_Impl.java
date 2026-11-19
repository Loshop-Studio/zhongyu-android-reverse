package com.friday.common.dao;

import androidx.paging.PagingSource;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.FileDao_Impl;
import com.friday.common.entity.FileEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class FileDao_Impl implements FileDao {

    /* renamed from: c */
    public static final C5944a f5807c = new C5944a(null);

    /* renamed from: d */
    public static final int f5808d = 8;

    /* renamed from: a */
    public final RoomDatabase f5809a;

    /* renamed from: b */
    public final EntityInsertAdapter f5810b;

    /* renamed from: com.friday.common.dao.FileDao_Impl$a */
    public static final class C5944a {
        public /* synthetic */ C5944a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m5039a() {
            return AbstractC10978w.m24136n();
        }

        public C5944a() {
        }
    }

    public FileDao_Impl(RoomDatabase __db) {
        AbstractC9979u.m20294g(__db, "__db");
        this.f5809a = __db;
        this.f5810b = new EntityInsertAdapter<FileEntity>() { // from class: com.friday.common.dao.FileDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, FileEntity entity) {
                AbstractC9979u.m20294g(statement, "statement");
                AbstractC9979u.m20294g(entity, "entity");
                statement.mo33819bindText(1, entity.getFileId());
                statement.mo33817bindLong(2, entity.getAccountId());
                statement.mo33819bindText(3, entity.getFileName());
                statement.mo33819bindText(4, entity.getOssFileUrl());
                statement.mo33819bindText(5, entity.getLocalFileUrl());
                statement.mo33819bindText(6, entity.getFileType());
                statement.mo33819bindText(7, entity.getParentId());
                statement.mo33819bindText(8, entity.getCreateTime());
                statement.mo33819bindText(9, entity.getUpdateTime());
                statement.mo33817bindLong(10, entity.getState());
                statement.mo33817bindLong(11, entity.isSync() ? 1L : 0L);
                statement.mo33817bindLong(12, entity.getVersion());
                statement.mo33817bindLong(13, entity.isShared() ? 1L : 0L);
                String preFileId = entity.getPreFileId();
                if (preFileId == null) {
                    statement.mo33818bindNull(14);
                } else {
                    statement.mo33819bindText(14, preFileId);
                }
                statement.mo33817bindLong(15, entity.getErrorTimes());
                String md5 = entity.getMd5();
                if (md5 == null) {
                    statement.mo33818bindNull(16);
                } else {
                    statement.mo33819bindText(16, md5);
                }
                statement.mo33817bindLong(17, entity.getCached() ? 1L : 0L);
                statement.mo33817bindLong(18, entity.getExpiredTime());
                statement.mo33817bindLong(19, entity.isRecycled() ? 1L : 0L);
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `File` (`fileId`,`accountId`,`fileName`,`ossFileUrl`,`localFileUrl`,`fileType`,`parentId`,`createTime`,`updateTime`,`state`,`isSync`,`version`,`isShared`,`preFileId`,`errorTimes`,`md5`,`cached`,`expiredTime`,`isRecycled`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
    }

    /* renamed from: A1 */
    public static final C10786q m4951A1(String str, String str2, int i10, String str3, String str4, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, i10);
            sQLiteStatementPrepare.mo33819bindText(3, str3);
            sQLiteStatementPrepare.mo33819bindText(4, str4);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: B1 */
    public static final C10786q m4953B1(String str, String str2, int i10, String str3, List list, int i11, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, i10);
            sQLiteStatementPrepare.mo33819bindText(3, str3);
            Iterator it = list.iterator();
            int i12 = 4;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo33819bindText(i12, (String) it.next());
                i12++;
            }
            sQLiteStatementPrepare.mo33819bindText(i11 + 4, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: C1 */
    public static final C10786q m4955C1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: D1 */
    public static final C10786q m4957D1(String str, boolean z10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: E1 */
    public static final C10786q m4959E1(String str, String str2, String str3, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: F1 */
    public static final C10786q m4961F1(String str, String str2, String str3, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: G1 */
    public static final C10786q m4963G1(String str, String str2, boolean z10, long j10, String str3, int i10, String str4, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            sQLiteStatementPrepare.mo33819bindText(4, str3);
            sQLiteStatementPrepare.mo33817bindLong(5, i10);
            sQLiteStatementPrepare.mo33819bindText(6, str4);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: H1 */
    public static final C10786q m4965H1(String str, int i10, boolean z10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, i10);
            sQLiteStatementPrepare.mo33817bindLong(2, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33819bindText(3, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: I1 */
    public static final C10786q m4967I1(String str, String str2, int i10, String str3, String str4, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, i10);
            sQLiteStatementPrepare.mo33819bindText(3, str3);
            sQLiteStatementPrepare.mo33819bindText(4, str4);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: J1 */
    public static final C10786q m4969J1(String str, String str2, int i10, String str3, boolean z10, String str4, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, i10);
            sQLiteStatementPrepare.mo33819bindText(3, str3);
            sQLiteStatementPrepare.mo33817bindLong(4, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33819bindText(5, str4);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: K1 */
    public static final C10786q m4971K1(String str, int i10, boolean z10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, i10);
            sQLiteStatementPrepare.mo33817bindLong(2, z10 ? 1L : 0L);
            sQLiteStatementPrepare.mo33819bindText(3, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: L1 */
    public static final C10786q m4973L1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: X0 */
    public static final C10786q m4985X0(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: Y0 */
    public static final Integer m4986Y0(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
            }
            return numValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: Z0 */
    public static final List m4987Z0(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: a1 */
    public static final List m4988a1(String str, String str2, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i21;
                int i22 = columnIndexOrThrow19;
                int i23 = i11;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i23;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: b1 */
    public static final List m4989b1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: c1 */
    public static final FileEntity m4991c1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            FileEntity fileEntity = null;
            if (sQLiteStatementPrepare.step()) {
                fileEntity = new FileEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15), sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow18), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19)) != 0);
            }
            return fileEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: d1 */
    public static final List m4993d1(String str, List list, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i14 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo33819bindText(i14, (String) it.next());
                i14++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i15 = columnIndexOrThrow2;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i18 = columnIndexOrThrow4;
                int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i20 = columnIndexOrThrow15;
                int i21 = (int) sQLiteStatementPrepare.getLong(i20);
                int i22 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i22)) {
                    text = null;
                    i10 = columnIndexOrThrow;
                    i13 = i21;
                    i11 = columnIndexOrThrow17;
                    i12 = i20;
                } else {
                    text = sQLiteStatementPrepare.getText(i22);
                    i10 = columnIndexOrThrow;
                    i11 = columnIndexOrThrow17;
                    i12 = i20;
                    i13 = i21;
                }
                int i23 = columnIndexOrThrow18;
                int i24 = columnIndexOrThrow5;
                int i25 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j10, text3, text4, text5, text6, text7, text8, text9, i17, z10, i19, z11, text10, i13, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i23), ((int) sQLiteStatementPrepare.getLong(i25)) != 0));
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow15 = i12;
                columnIndexOrThrow5 = i24;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow18 = i23;
                columnIndexOrThrow2 = i15;
                columnIndexOrThrow = i10;
                columnIndexOrThrow16 = i22;
                columnIndexOrThrow19 = i25;
                columnIndexOrThrow3 = i16;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: e1 */
    public static final C10786q m4995e1(long j10, String str, SQLiteStatement _stmt) {
        AbstractC9979u.m20294g(_stmt, "_stmt");
        _stmt.mo33817bindLong(1, j10);
        _stmt.mo33819bindText(2, str);
        return C10786q.f26013a;
    }

    /* renamed from: f1 */
    public static final List m4997f1(String str, String str2, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i21;
                int i22 = columnIndexOrThrow19;
                int i23 = i11;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i23;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: g1 */
    public static final C10786q m4999g1(String str, long j10, SQLiteStatement _stmt) {
        AbstractC9979u.m20294g(_stmt, "_stmt");
        _stmt.mo33819bindText(1, str);
        _stmt.mo33817bindLong(2, j10);
        return C10786q.f26013a;
    }

    /* renamed from: h1 */
    public static final C10786q m5001h1(String str, long j10, SQLiteStatement _stmt) {
        AbstractC9979u.m20294g(_stmt, "_stmt");
        _stmt.mo33819bindText(1, str);
        _stmt.mo33817bindLong(2, j10);
        return C10786q.f26013a;
    }

    /* renamed from: i1 */
    public static final FileEntity m5003i1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            FileEntity fileEntity = null;
            if (sQLiteStatementPrepare.step()) {
                fileEntity = new FileEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15), sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow18), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19)) != 0);
            }
            return fileEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: j1 */
    public static final List m5005j1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: k1 */
    public static final List m5007k1(String str, String str2, String str3, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = columnIndexOrThrow19;
                int i23 = i11;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i23;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: l1 */
    public static final List m5009l1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: m1 */
    public static final List m5011m1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: n1 */
    public static final List m5013n1(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(Integer.valueOf((int) sQLiteStatementPrepare.getLong(0)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: o1 */
    public static final List m5015o1(String str, String str2, String str3, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = columnIndexOrThrow19;
                int i23 = i11;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i23;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: p1 */
    public static final String m5017p1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            String text = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                text = sQLiteStatementPrepare.getText(0);
            }
            return text;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: q1 */
    public static final List m5019q1(String str, String str2, String str3, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = columnIndexOrThrow19;
                int i23 = i11;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i23;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: r1 */
    public static final C10786q m5021r1(long j10, SQLiteStatement _stmt) {
        AbstractC9979u.m20294g(_stmt, "_stmt");
        _stmt.mo33817bindLong(1, j10);
        return C10786q.f26013a;
    }

    /* renamed from: s1 */
    public static final List m5023s1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: t1 */
    public static final List m5025t1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: u1 */
    public static final C10786q m5027u1(String str, long j10, SQLiteStatement _stmt) {
        AbstractC9979u.m20294g(_stmt, "_stmt");
        _stmt.mo33819bindText(1, str);
        _stmt.mo33817bindLong(2, j10);
        return C10786q.f26013a;
    }

    /* renamed from: v1 */
    public static final List m5029v1(String str, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                int i22 = i11;
                int i23 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i23)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i22;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: w1 */
    public static final List m5031w1(String str, String str2, long j10, SQLiteConnection _connection) {
        String text;
        int i10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            sQLiteStatementPrepare.mo33819bindText(4, str2);
            sQLiteStatementPrepare.mo33817bindLong(5, j10);
            sQLiteStatementPrepare.mo33817bindLong(6, j10);
            sQLiteStatementPrepare.mo33817bindLong(7, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i16 = columnIndexOrThrow3;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i18 = columnIndexOrThrow15;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    text = null;
                    i10 = i18;
                    i12 = i19;
                    i11 = columnIndexOrThrow17;
                } else {
                    text = sQLiteStatementPrepare.getText(i20);
                    i10 = i18;
                    i11 = columnIndexOrThrow17;
                    i12 = i19;
                }
                int i21 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i21;
                int i22 = columnIndexOrThrow19;
                int i23 = i11;
                arrayList.add(new FileEntity(text2, j11, text3, text4, text5, text6, text7, text8, text9, i15, z10, i17, z11, text10, i12, text, ((int) sQLiteStatementPrepare.getLong(i11)) != 0, sQLiteStatementPrepare.getLong(i21), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i20;
                columnIndexOrThrow17 = i23;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow = i13;
                columnIndexOrThrow2 = i14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: x1 */
    public static final C10786q m5033x1(FileDao_Impl fileDao_Impl, FileEntity fileEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        fileDao_Impl.f5810b.insert(_connection, (SQLiteConnection) fileEntity);
        return C10786q.f26013a;
    }

    /* renamed from: y1 */
    public static final C10786q m5035y1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: z1 */
    public static final C10786q m5037z1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: A */
    public Object mo4903A(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET state=30 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.u
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5035y1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: B */
    public Object mo4904B(final String str, final String str2, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str3 = "SELECT * FROM File WHERE parentId=? AND fileType in (0,1) AND fileId!=? AND accountId=? AND state!=3 AND state!=30 ORDER BY CASE WHEN fileType = 0 Then 1 ELSE 0 END ,updateTime DESC";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.o0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5015o1(str3, str, str2, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: C */
    public PagingSource mo4905C(final String parentId, final long j10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        return new FileDao_Impl$getByParentIdByNamePagingForStudent$1(new RoomRawQuery("SELECT * FROM File WHERE parentId=? AND fileType in (0,1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30  ORDER BY CASE WHEN fileType = 0 Then 0 ELSE 1 END, filename COLLATE localized ASC", new InterfaceC9540l() { // from class: c2.b
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4999g1(parentId, j10, (SQLiteStatement) obj);
            }
        }), this, this.f5809a, new String[]{"File"});
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: D */
    public Object mo4906D(final String str, final int i10, final boolean z10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET state=1, version=?, isSync=?, errorTimes = 0 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.c0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4971K1(str2, i10, z10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: E */
    public Object mo4907E(String str, InterfaceC11588c interfaceC11588c) {
        return DBUtil.performInTransactionSuspending(this.f5809a, new FileDao_Impl$getAllParentIdById$2(this, str, null), interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: F */
    public PagingSource mo4908F(final String fileName, final long j10) {
        AbstractC9979u.m20294g(fileName, "fileName");
        return new FileDao_Impl$getByFileNamePagingForStudent$1(new RoomRawQuery("SELECT * FROM File WHERE fileType in (1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30 AND filename LIKE '%' || ? || '%' ORDER BY filename ASC", new InterfaceC9540l() { // from class: c2.f0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4995e1(j10, fileName, (SQLiteStatement) obj);
            }
        }), this, this.f5809a, new String[]{"File"});
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: H */
    public Object mo4909H(List list, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5809a, new FileDao_Impl$updateRestoreFileList$2(this, list, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: I */
    public Object mo4910I(final FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.h0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5033x1(this.f3193c, fileEntity, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: J */
    public Object mo4911J(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT errorTimes from File WHERE fileId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.x
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4986Y0(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: K */
    public Object mo4912K(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE state!=0 AND accountId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5023s1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: L */
    public Object mo4913L(final String str, final String str2, final int i10, final String str3, InterfaceC11588c interfaceC11588c) {
        final String str4 = "UPDATE File SET parentId=?, state=?, updateTime=? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4951A1(str4, str, i10, str3, str2, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: M */
    public Object mo4914M(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET state=3 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.t
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4955C1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: N */
    public Object mo4915N(List list, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5809a, new FileDao_Impl$insertFileList$2(this, list, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: O */
    public PagingSource mo4916O() {
        return new FileDao_Impl$emptyList$1(new RoomRawQuery("SELECT * FROM FILE LIMIT 0", null, 2, null), this, this.f5809a, new String[]{"FILE"});
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: P */
    public Object mo4917P(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "DELETE FROM File WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.n0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4985X0(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: Q */
    public PagingSource mo4918Q(final String parentId, final long j10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        return new FileDao_Impl$getRecycleBinFiles$1(new RoomRawQuery("SELECT * FROM File WHERE parentId=? AND accountId=? ORDER BY expiredTime DESC", new InterfaceC9540l() { // from class: c2.g0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5027u1(parentId, j10, (SQLiteStatement) obj);
            }
        }), this, this.f5809a, new String[]{"File"});
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: R */
    public List mo4919R(final long j10) {
        final String str = "SELECT * FROM File WHERE accountId=?";
        return (List) DBUtil.performBlocking(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4987Z0(str, j10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: S */
    public Object mo4920S(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE accountId=? AND (state=10 OR state=30) ";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.f
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5009l1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: T */
    public List mo4921T(final String fileId, final long j10) {
        AbstractC9979u.m20294g(fileId, "fileId");
        final String str = "WITH RECURSIVE file_tree_cte(fileId, state, parentId) AS (SELECT fileId, state, parentId FROM File WHERE fileId =? AND fileType in (0,1,12,6) AND accountId=? UNION ALL SELECT fe.fileId, fe.state, fe.parentId FROM File fe JOIN file_tree_cte ftc ON fe.parentId = ftc.fileId) SELECT state FROM file_tree_cte";
        return (List) DBUtil.performBlocking(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.y
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5013n1(str, fileId, j10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: U */
    public void mo4922U(final String fileId, final String parentId, final boolean z10, final long j10, final String updateTime, final int i10) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        final String str = "UPDATE File SET parentId=? ,isRecycled = ?,expiredTime = ?,updateTime = ?,version = ? WHERE fileId=?";
        DBUtil.performBlocking(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4963G1(str, parentId, z10, j10, updateTime, i10, fileId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: V */
    public Object mo4923V(final List list, InterfaceC11588c interfaceC11588c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM File WHERE fileId IN (");
        StringUtil.appendPlaceholders(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.s
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4993d1(string, list, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: W */
    public Object mo4924W(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE fileType!=0 AND state=0 AND accountId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.w
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5005j1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: X */
    public Object mo4925X(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM File WHERE parentId=? AND accountId=? AND state!=3 AND state!=30";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.r
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4997f1(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: Y */
    public Object mo4926Y(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM File WHERE fileId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.m0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5003i1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: Z */
    public Object mo4927Z(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM File WHERE parentId=? AND fileType=0 AND accountId=? AND state!=3 AND state!=30 ORDER BY updateTime DESC";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4988a1(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: a */
    public Object mo4928a(final String str, final String str2, InterfaceC11588c interfaceC11588c) {
        final String str3 = "UPDATE File SET ossFileUrl=? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.d0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4959E1(str3, str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: a0 */
    public Object mo4929a0(final String str, final String str2, final int i10, final String str3, InterfaceC11588c interfaceC11588c) {
        final String str4 = "UPDATE File SET fileName=?, state=?, updateTime=? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.j0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4967I1(str4, str2, i10, str3, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: b */
    public Object mo4930b(final String str, final String str2, final int i10, final String str3, final boolean z10, InterfaceC11588c interfaceC11588c) {
        final String str4 = "UPDATE File SET fileName=?, state=?, updateTime=?, cached=? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.l0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4969J1(str4, str2, i10, str3, z10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: b0 */
    public Object mo4931b0(final String str, final boolean z10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET cached = ? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.k0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4957D1(str2, z10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: c */
    public Object mo4932c(final String str, final String str2, InterfaceC11588c interfaceC11588c) {
        final String str3 = "UPDATE File SET md5 = ? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4961F1(str3, str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: e */
    public Object mo4933e(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "\nWITH RECURSIVE\n-- 1. 向上找祖先：从当前节点开始，沿着 parentId 一层层往上摸，直到 parentId 为 '0'\nAncestors AS (\n    SELECT *, 0 AS depth\n    FROM File\n    WHERE fileId = ? AND accountId = ?\n    \n    UNION ALL\n    \n    SELECT t.*, a.depth - 1\n    FROM File t\n    JOIN Ancestors a ON t.fileId = a.parentId\n    WHERE a.parentId != '0' \n      AND t.accountId = ?\n),\n\n-- 2. 向下找子孙：从当前节点开始，找所有以我为 parentId 的子集\nSubTree AS (\n    SELECT *, 0 AS depth\n    FROM File\n    WHERE fileId = ? AND accountId = ?\n    \n    UNION ALL\n    \n    SELECT t.*, st.depth + 1\n    FROM File t\n    JOIN SubTree st ON t.parentId = st.fileId\n    WHERE t.accountId = ?\n)\n\n-- 3. 合并结果并过滤：只取符合错误状态和指定类型的记录\nSELECT * FROM (\n    SELECT * FROM Ancestors\n    UNION\n    SELECT * FROM SubTree\n)\nWHERE accountId = ?\n  AND (state = 10 OR state = 30)\nORDER BY depth ASC\n";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.v
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5031w1(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: f */
    public Object mo4934f(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET state=10 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.a0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5037z1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: l */
    public Object mo4935l(final String str, final int i10, final boolean z10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET state=0, version=?, isSync=?, errorTimes = 0 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.b0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4965H1(str2, i10, z10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: m */
    public Object mo4936m(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE accountId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.e0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4989b1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: n */
    public Object mo4937n(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE accountId=? AND fileType in (1,12,6,0) AND (state=10 OR state=30) ";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5011m1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: o */
    public PagingSource mo4938o(final long j10) {
        return new FileDao_Impl$getNewestListPagingForStudent$1(new RoomRawQuery("SELECT * FROM File WHERE fileType in (1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30 ORDER BY updateTime DESC", new InterfaceC9540l() { // from class: c2.i0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5021r1(j10, (SQLiteStatement) obj);
            }
        }), this, this.f5809a, new String[]{"File"});
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: p */
    public Object mo4939p(String str, String str2, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5809a, new FileDao_Impl$updateTimeWithParents$2(this, str, str2, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: q */
    public Object mo4940q(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT md5 FROM File WHERE fileId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5017p1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: r */
    public Object mo4941r(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM File WHERE fileId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.g
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4991c1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: s */
    public Object mo4942s(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE accountId=? AND cached = 1 AND state!=3 AND state!=30 AND fileType in (10,5,3,4)";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5025t1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: t */
    public Object mo4943t(final String str, final String str2, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str3 = "SELECT * FROM File WHERE parentId=? AND fileType=0 AND fileId!=? AND accountId=? AND state!=3 AND state!=30 ORDER BY updateTime DESC";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5007k1(str3, str, str2, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: u */
    public Object mo4944u(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE File SET errorTimes=errorTimes+1 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.z
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4973L1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: v */
    public Object mo4945v(final String str, final String str2, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str3 = "SELECT * FROM File WHERE parentId=? AND fileType in (0,12) AND fileId!=? AND accountId=? AND state!=3 AND state!=30 ORDER BY CASE WHEN fileType = 0 Then 1 ELSE 0 END ,updateTime DESC";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.l
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5019q1(str3, str, str2, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: w */
    public PagingSource mo4946w(final String parentId, final long j10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        return new FileDao_Impl$getByParentIdByTimePagingForStudent$1(new RoomRawQuery("SELECT * FROM File WHERE parentId=? AND fileType in (0,1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30 ORDER BY CASE WHEN fileType = 0 Then 0 ELSE 1 END ,updateTime DESC", new InterfaceC9540l() { // from class: c2.k
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5001h1(parentId, j10, (SQLiteStatement) obj);
            }
        }), this, this.f5809a, new String[]{"File"});
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: x */
    public Object mo4947x(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM File WHERE parentId=-1 AND accountId=?";
        return DBUtil.performSuspending(this.f5809a, true, false, new InterfaceC9540l() { // from class: c2.n
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m5029v1(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: y */
    public Object mo4948y(final String str, final List list, final int i10, final String str2, InterfaceC11588c interfaceC11588c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE File SET parentId=");
        sb2.append("?");
        sb2.append(", state=");
        sb2.append("?");
        sb2.append(", updateTime=");
        sb2.append("?");
        sb2.append(" WHERE fileId IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb2, size);
        sb2.append(") AND fileId != ");
        sb2.append("?");
        final String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        Object objPerformSuspending = DBUtil.performSuspending(this.f5809a, false, true, new InterfaceC9540l() { // from class: c2.m
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl.m4953B1(string, str, i10, str2, list, size, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.FileDao
    /* renamed from: z */
    public Object mo4949z(List list, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5809a, new FileDao_Impl$markCacheStateAsFalse$2(this, list, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }
}
