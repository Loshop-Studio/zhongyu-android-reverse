package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MyCourseKeyEntityDao_Impl implements MyCourseKeyEntityDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MyCourseKeyEntity> __insertAdapterOfMyCourseKeyEntity;
    private final EntityDeleteOrUpdateAdapter<MyCourseKeyEntity> __updateAdapterOfMyCourseKeyEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final List<InterfaceC8375c> getRequiredConverters() {
            return AbstractC8809v.m14771n();
        }

        private Companion() {
        }
    }

    public MyCourseKeyEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfMyCourseKeyEntity = new EntityInsertAdapter<MyCourseKeyEntity>() { // from class: com.zykj.study.data.MyCourseKeyEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `my_course_key` (`id`,`userId`,`startId`,`take`,`nextStartId`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MyCourseKeyEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27224bindText(2, entity.getUserId());
                statement.mo27222bindLong(3, entity.getStartId());
                statement.mo27222bindLong(4, entity.getTake());
                if (entity.getNextStartId() == null) {
                    statement.mo27223bindNull(5);
                } else {
                    statement.mo27222bindLong(5, r5.intValue());
                }
            }
        };
        this.__updateAdapterOfMyCourseKeyEntity = new EntityDeleteOrUpdateAdapter<MyCourseKeyEntity>() { // from class: com.zykj.study.data.MyCourseKeyEntityDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public String createQuery() {
                return "UPDATE OR ABORT `my_course_key` SET `id` = ?,`userId` = ?,`startId` = ?,`take` = ?,`nextStartId` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, MyCourseKeyEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27224bindText(2, entity.getUserId());
                statement.mo27222bindLong(3, entity.getStartId());
                statement.mo27222bindLong(4, entity.getTake());
                if (entity.getNextStartId() == null) {
                    statement.mo27223bindNull(5);
                } else {
                    statement.mo27222bindLong(5, r0.intValue());
                }
                statement.mo27222bindLong(6, entity.getId());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteById$lambda$4(String str, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27222bindLong(1, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C8736p.f16368a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteByUserId$lambda$5(String str, String str2, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C8736p.f16368a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyCourseKeyEntity getKeyById$lambda$3(String str, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27222bindLong(1, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "take");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextStartId");
            if (!sQLiteStatementPrepare.step()) {
                throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.zykj.study.`data`.MyCourseKeyEntity>.");
            }
            MyCourseKeyEntity myCourseKeyEntity = new MyCourseKeyEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            sQLiteStatementPrepare.close();
            return myCourseKeyEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyCourseKeyEntity getKeyByUserId$lambda$2(String str, String str2, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "take");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextStartId");
            MyCourseKeyEntity myCourseKeyEntity = null;
            if (sQLiteStatementPrepare.step()) {
                myCourseKeyEntity = new MyCourseKeyEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            return myCourseKeyEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(MyCourseKeyEntityDao_Impl myCourseKeyEntityDao_Impl, MyCourseKeyEntity myCourseKeyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        myCourseKeyEntityDao_Impl.__insertAdapterOfMyCourseKeyEntity.insert(_connection, (SQLiteConnection) myCourseKeyEntity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p update$lambda$1(MyCourseKeyEntityDao_Impl myCourseKeyEntityDao_Impl, MyCourseKeyEntity myCourseKeyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        myCourseKeyEntityDao_Impl.__updateAdapterOfMyCourseKeyEntity.handle(_connection, myCourseKeyEntity);
        return C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseKeyEntityDao
    public Object deleteById(final int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from my_course_key where id = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.x0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseKeyEntityDao_Impl.deleteById$lambda$4(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseKeyEntityDao
    public Object deleteByUserId(final String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str2 = "delete from my_course_key where userId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.z0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseKeyEntityDao_Impl.deleteByUserId$lambda$5(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseKeyEntityDao
    public Object getKeyById(final int i10, InterfaceC9324c<? super MyCourseKeyEntity> interfaceC9324c) {
        final String str = "select * from my_course_key where id = ?";
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.v0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseKeyEntityDao_Impl.getKeyById$lambda$3(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    @Override // com.zykj.study.data.MyCourseKeyEntityDao
    public Object getKeyByUserId(final String str, InterfaceC9324c<? super MyCourseKeyEntity> interfaceC9324c) {
        final String str2 = "select * from my_course_key where userId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.u0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseKeyEntityDao_Impl.getKeyByUserId$lambda$2(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    @Override // com.zykj.study.data.MyCourseKeyEntityDao
    public Object insert(final MyCourseKeyEntity myCourseKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.y0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseKeyEntityDao_Impl.insert$lambda$0(this.f11142a, myCourseKeyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseKeyEntityDao
    public Object update(final MyCourseKeyEntity myCourseKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.w0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseKeyEntityDao_Impl.update$lambda$1(this.f11133a, myCourseKeyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
