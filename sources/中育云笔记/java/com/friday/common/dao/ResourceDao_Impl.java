package com.friday.common.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.ResourceDao_Impl;
import com.friday.common.entity.ResourceEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ResourceDao_Impl implements ResourceDao {

    /* renamed from: c */
    public static final C5950a f5893c = new C5950a(null);

    /* renamed from: d */
    public static final int f5894d = 8;

    /* renamed from: a */
    public final RoomDatabase f5895a;

    /* renamed from: b */
    public final EntityInsertAdapter f5896b;

    /* renamed from: com.friday.common.dao.ResourceDao_Impl$a */
    public static final class C5950a {
        public /* synthetic */ C5950a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m5184a() {
            return AbstractC10978w.m24136n();
        }

        public C5950a() {
        }
    }

    public ResourceDao_Impl(RoomDatabase __db) {
        AbstractC9979u.m20294g(__db, "__db");
        this.f5895a = __db;
        this.f5896b = new EntityInsertAdapter<ResourceEntity>() { // from class: com.friday.common.dao.ResourceDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, ResourceEntity entity) {
                AbstractC9979u.m20294g(statement, "statement");
                AbstractC9979u.m20294g(entity, "entity");
                statement.mo33819bindText(1, entity.getId());
                statement.mo33819bindText(2, entity.getFileId());
                statement.mo33819bindText(3, entity.getPageName());
                statement.mo33817bindLong(4, entity.getPageIndex());
                statement.mo33819bindText(5, entity.getOssImageUrl());
                statement.mo33819bindText(6, entity.getMd5());
                statement.mo33817bindLong(7, entity.getUserId());
                statement.mo33817bindLong(8, entity.getResourceType());
                statement.mo33817bindLong(9, entity.getToBeUploaded() ? 1L : 0L);
                statement.mo33817bindLong(10, entity.getWasDeleted() ? 1L : 0L);
                String createTimeStamp = entity.getCreateTimeStamp();
                if (createTimeStamp == null) {
                    statement.mo33818bindNull(11);
                } else {
                    statement.mo33819bindText(11, createTimeStamp);
                }
                String updateTimeStamp = entity.getUpdateTimeStamp();
                if (updateTimeStamp == null) {
                    statement.mo33818bindNull(12);
                } else {
                    statement.mo33819bindText(12, updateTimeStamp);
                }
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ResourceEntity` (`id`,`fileId`,`pageName`,`pageIndex`,`ossImageUrl`,`md5`,`userId`,`resourceType`,`toBeUploaded`,`wasDeleted`,`createTimeStamp`,`updateTimeStamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
    }

    /* renamed from: I0 */
    public static final C10786q m5128I0(String str, String str2, SQLiteConnection _connection) {
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

    /* renamed from: J0 */
    public static final C10786q m5129J0(String str, String str2, long j10, SQLiteConnection _connection) {
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

    /* renamed from: K0 */
    public static final C10786q m5130K0(String str, List list, int i10, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo33819bindText(i11, (String) it.next());
                i11++;
            }
            sQLiteStatementPrepare.mo33817bindLong(i10 + 1, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: L0 */
    public static final C10786q m5131L0(String str, String str2, SQLiteConnection _connection) {
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

    /* renamed from: M0 */
    public static final List m5132M0(String str, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow;
                int i11 = columnIndexOrThrow2;
                int i12 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
                columnIndexOrThrow3 = i12;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: N0 */
    public static final List m5133N0(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow;
                int i11 = columnIndexOrThrow2;
                int i12 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
                columnIndexOrThrow3 = i12;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: O0 */
    public static final List m5134O0(String str, long j10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow;
                int i11 = columnIndexOrThrow2;
                int i12 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
                columnIndexOrThrow3 = i12;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: P0 */
    public static final ResourceEntity m5135P0(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ResourceEntity resourceEntity = null;
            if (sQLiteStatementPrepare.step()) {
                resourceEntity = new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
            }
            return resourceEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: Q0 */
    public static final Boolean m5136Q0(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        boolean z10 = true;
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: R0 */
    public static final List m5137R0(String str, String str2, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow;
                int i11 = columnIndexOrThrow2;
                int i12 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
                columnIndexOrThrow3 = i12;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: S0 */
    public static final List m5138S0(String str, String str2, long j10, int i10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, j10);
            sQLiteStatementPrepare.mo33817bindLong(3, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i11 = columnIndexOrThrow;
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow = i11;
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow3 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: T0 */
    public static final List m5139T0(String str, String str2, String str3, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow;
                int i11 = columnIndexOrThrow2;
                int i12 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
                columnIndexOrThrow3 = i12;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: U0 */
    public static final int m5140U0(String str, long j10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            return sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: V0 */
    public static final List m5141V0(String str, List list, int i10, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo33819bindText(i11, (String) it.next());
                i11++;
            }
            sQLiteStatementPrepare.mo33817bindLong(i10 + 1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                arrayList.add(new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)));
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow3 = i13;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: W0 */
    public static final C10786q m5142W0(ResourceDao_Impl resourceDao_Impl, ResourceEntity resourceEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        resourceDao_Impl.f5896b.insert(_connection, (SQLiteConnection) resourceEntity);
        return C10786q.f26013a;
    }

    /* renamed from: X0 */
    public static final C10786q m5143X0(ResourceDao_Impl resourceDao_Impl, List list, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        resourceDao_Impl.f5896b.insert(_connection, (Iterable) list);
        return C10786q.f26013a;
    }

    /* renamed from: Y0 */
    public static final C10786q m5144Y0(String str, String str2, SQLiteConnection _connection) {
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

    /* renamed from: Z0 */
    public static final C10786q m5145Z0(String str, String str2, SQLiteConnection _connection) {
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

    /* renamed from: a1 */
    public static final ResourceEntity m5147a1(String str, long j10, String str2, String str3, String str4, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            sQLiteStatementPrepare.mo33819bindText(3, str3);
            sQLiteStatementPrepare.mo33819bindText(4, str4);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossImageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "resourceType");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toBeUploaded");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wasDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTimeStamp");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimeStamp");
            ResourceEntity resourceEntity = null;
            if (sQLiteStatementPrepare.step()) {
                resourceEntity = new ResourceEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
            }
            return resourceEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: b1 */
    public static final C10786q m5149b1(String str, String str2, SQLiteConnection _connection) {
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

    /* renamed from: c1 */
    public static final C10786q m5151c1(String str, String str2, int i10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33817bindLong(2, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: d1 */
    public static final C10786q m5153d1(String str, String str2, SQLiteConnection _connection) {
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

    /* renamed from: e1 */
    public static final C10786q m5155e1(String str, String str2, String str3, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.mo33817bindLong(3, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: f1 */
    public static final C10786q m5157f1(String str, List list, int i10, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo33819bindText(i11, (String) it.next());
                i11++;
            }
            sQLiteStatementPrepare.mo33817bindLong(i10 + 1, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: g1 */
    public static final C10786q m5159g1(String str, int i10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, i10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: h1 */
    public static final C10786q m5161h1(String str, String str2, String str3, SQLiteConnection _connection) {
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

    /* renamed from: i1 */
    public static final C10786q m5163i1(String str, int i10, String str2, String str3, long j10, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, i10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            sQLiteStatementPrepare.mo33819bindText(3, str3);
            sQLiteStatementPrepare.mo33817bindLong(4, j10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: j1 */
    public static final C10786q m5165j1(String str, String str2, String str3, String str4, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.mo33819bindText(2, str3);
            sQLiteStatementPrepare.mo33819bindText(3, str4);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: k1 */
    public static final C10786q m5167k1(String str, long j10, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33817bindLong(1, j10);
            sQLiteStatementPrepare.mo33819bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: A */
    public Object mo5086A(String str, String str2, long j10, InterfaceC11588c interfaceC11588c) {
        return DBUtil.performInTransactionSuspending(this.f5895a, new ResourceDao_Impl$deletePageResources$2(this, str, str2, j10, null), interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: B */
    public Object mo5087B(final long j10, InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM ResourceEntity WHERE userId=?";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.w1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5132M0(str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: C */
    public Object mo5088C(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "DELETE FROM ResourceEntity WHERE fileId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.t1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5131L0(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: D */
    public Object mo5089D(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET toBeUploaded=1 WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.a2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5145Z0(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: E */
    public Object mo5090E(final ResourceEntity resourceEntity, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.o1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5142W0(this.f3283c, resourceEntity, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: H */
    public Object mo5091H(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET toBeUploaded=0 WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.x1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5144Y0(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: I */
    public Object mo5092I(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM ResourceEntity WHERE id=? AND userId=?";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.y1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5135P0(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: L */
    public Object mo5093L(final List list, final long j10, InterfaceC11588c interfaceC11588c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ResourceEntity WHERE id IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb2, size);
        sb2.append(") AND ossImageUrl='' AND userId=");
        sb2.append("?");
        final String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.k1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5130K0(string, list, size, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: O */
    public Object mo5094O(List list, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5895a, new ResourceDao_Impl$deleteResourceList$2(this, list, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: R */
    public Object mo5095R(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "DELETE FROM ResourceEntity WHERE fileId=? AND userId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.z1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5129J0(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: S */
    public Object mo5096S(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET userId=? WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.u1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5167k1(str2, j10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: T */
    public Object mo5097T(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT max(pageIndex) FROM ResourceEntity WHERE userId=? AND fileId=? ";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.d1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Integer.valueOf(ResourceDao_Impl.m5140U0(str2, j10, str, (SQLiteConnection) obj));
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: V */
    public Object mo5098V(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM ResourceEntity WHERE fileId=? AND userId=? AND wasDeleted=0";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.e2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5137R0(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: W */
    public Object mo5099W(final String str, final int i10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET pageIndex = ? WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.n1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5159g1(str2, i10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: X */
    public Object mo5100X(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT wasDeleted FROM ResourceEntity WHERE id like '%' || ? || '%' AND userId=?";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.j1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5136Q0(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: Y */
    public Object mo5101Y(final List list, final long j10, InterfaceC11588c interfaceC11588c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM ResourceEntity WHERE id IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb2, size);
        sb2.append(") AND ossImageUrl!='' AND userId=");
        sb2.append("?");
        final String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.r1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5141V0(string, list, size, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: Z */
    public Object mo5102Z(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "DELETE FROM ResourceEntity WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.e1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5128I0(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: a */
    public Object mo5103a(final String str, final String str2, InterfaceC11588c interfaceC11588c) {
        final String str3 = "UPDATE ResourceEntity SET ossImageUrl=? WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.q1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5161h1(str3, str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: b */
    public Object mo5104b(final List list, final long j10, InterfaceC11588c interfaceC11588c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded=0 WHERE id IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb2, size);
        sb2.append(") AND userId=");
        sb2.append("?");
        final String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.p1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5157f1(string, list, size, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: d */
    public Object mo5105d(final String str, final int i10, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM ResourceEntity WHERE fileId=? AND userId=? AND pageIndex = ? AND wasDeleted=0";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.h1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5138S0(str2, str, j10, i10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: e */
    public Object mo5106e(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM ResourceEntity WHERE userId=? AND fileId=?  AND wasDeleted = 1";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.v1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5134O0(str2, j10, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: f */
    public Object mo5107f(final String str, final String str2, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str3 = "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded=0 WHERE fileId=? AND pageName=? AND userId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.f2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5155e1(str3, str, str2, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: i */
    public Object mo5108i(List list, InterfaceC11588c interfaceC11588c) {
        return DBUtil.performInTransactionSuspending(this.f5895a, new ResourceDao_Impl$deleteResourceListExceptOssUrlNotEmpty$2(this, list, null), interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: j */
    public Object mo5109j(final String str, final String str2, final String str3, InterfaceC11588c interfaceC11588c) {
        final String str4 = "UPDATE ResourceEntity SET md5=?,updateTimeStamp=? WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.f1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5165j1(str4, str2, str3, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: k */
    public Object mo5110k(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded =0 WHERE id=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.i1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5153d1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: l */
    public Object mo5111l(final String str, final String str2, final String str3, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str4 = "SELECT * FROM ResourceEntity WHERE userId=? AND fileId=? AND pageName LIKE '%' || ? || '%' AND Id LIKE '%' || ? || '%' ";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.l1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5147a1(str4, j10, str, str2, str3, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: m */
    public Object mo5112m(final String str, final String str2, final int i10, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str3 = "UPDATE ResourceEntity SET pageIndex=? WHERE fileId=? AND pageName=? AND userId=? AND wasDeleted=0";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.g1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5163i1(str3, i10, str, str2, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: o */
    public Object mo5113o(String str, Map map, long j10, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5895a, new ResourceDao_Impl$updatePageOrder$2(this, str, map, j10, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: p */
    public Object mo5114p(final String str, final int i10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded =0 WHERE fileId=? AND pageIndex=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.s1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5151c1(str2, str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: q */
    public Object mo5115q(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded =0 WHERE fileId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.m1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5149b1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: r */
    public Object mo5116r(final String str, final String str2, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str3 = "SELECT * FROM ResourceEntity WHERE fileId=? AND pageName=? AND userId=? AND wasDeleted=0";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.d2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5139T0(str3, str, str2, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: s */
    public Object mo5117s(String str, List list, InterfaceC11588c interfaceC11588c) {
        Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(this.f5895a, new ResourceDao_Impl$syncResourceList$2(this, str, list, null), interfaceC11588c);
        return objPerformInTransactionSuspending == AbstractC11725a.m25952f() ? objPerformInTransactionSuspending : C10786q.f26013a;
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: v */
    public Object mo5118v(final String str, final long j10, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM ResourceEntity WHERE fileId=? AND userId=?";
        return DBUtil.performSuspending(this.f5895a, true, false, new InterfaceC9540l() { // from class: c2.b2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5133N0(str2, str, j10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // com.friday.common.dao.ResourceDao
    /* renamed from: x */
    public Object mo5119x(final List list, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5895a, false, true, new InterfaceC9540l() { // from class: c2.c2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ResourceDao_Impl.m5143X0(this.f3141c, list, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }
}
