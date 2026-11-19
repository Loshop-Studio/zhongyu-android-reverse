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
public final class CourseStudyKeyEntityDao_Impl implements CourseStudyKeyEntityDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<CourseStudyKeyEntity> __insertAdapterOfCourseStudyKeyEntity;
    private final EntityDeleteOrUpdateAdapter<CourseStudyKeyEntity> __updateAdapterOfCourseStudyKeyEntity;
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

    public CourseStudyKeyEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfCourseStudyKeyEntity = new EntityInsertAdapter<CourseStudyKeyEntity>() { // from class: com.zykj.study.data.CourseStudyKeyEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `course_study_key` (`id`,`userId`,`pageIndex`,`nextPage`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, CourseStudyKeyEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27224bindText(2, entity.getUserId());
                statement.mo27222bindLong(3, entity.getPageIndex());
                if (entity.getNextPage() == null) {
                    statement.mo27223bindNull(4);
                } else {
                    statement.mo27222bindLong(4, r5.intValue());
                }
            }
        };
        this.__updateAdapterOfCourseStudyKeyEntity = new EntityDeleteOrUpdateAdapter<CourseStudyKeyEntity>() { // from class: com.zykj.study.data.CourseStudyKeyEntityDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public String createQuery() {
                return "UPDATE OR ABORT `course_study_key` SET `id` = ?,`userId` = ?,`pageIndex` = ?,`nextPage` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, CourseStudyKeyEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27224bindText(2, entity.getUserId());
                statement.mo27222bindLong(3, entity.getPageIndex());
                if (entity.getNextPage() == null) {
                    statement.mo27223bindNull(4);
                } else {
                    statement.mo27222bindLong(4, r0.intValue());
                }
                statement.mo27222bindLong(5, entity.getId());
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
    public static final CourseStudyKeyEntity getKeyById$lambda$3(String str, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27222bindLong(1, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextPage");
            if (sQLiteStatementPrepare.step()) {
                return new CourseStudyKeyEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
            }
            throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.zykj.study.`data`.CourseStudyKeyEntity>.");
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseStudyKeyEntity getKeyByUserId$lambda$2(String str, String str2, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextPage");
            CourseStudyKeyEntity courseStudyKeyEntity = null;
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                courseStudyKeyEntity = new CourseStudyKeyEntity(i10, text, i11, numValueOf);
            }
            return courseStudyKeyEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(CourseStudyKeyEntityDao_Impl courseStudyKeyEntityDao_Impl, CourseStudyKeyEntity courseStudyKeyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        courseStudyKeyEntityDao_Impl.__insertAdapterOfCourseStudyKeyEntity.insert(_connection, (SQLiteConnection) courseStudyKeyEntity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p update$lambda$1(CourseStudyKeyEntityDao_Impl courseStudyKeyEntityDao_Impl, CourseStudyKeyEntity courseStudyKeyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        courseStudyKeyEntityDao_Impl.__updateAdapterOfCourseStudyKeyEntity.handle(_connection, courseStudyKeyEntity);
        return C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyKeyEntityDao
    public Object deleteById(final int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from course_study_key where id = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.b0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyKeyEntityDao_Impl.deleteById$lambda$4(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyKeyEntityDao
    public Object deleteByUserId(final String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str2 = "delete from course_study_key where userId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.f0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyKeyEntityDao_Impl.deleteByUserId$lambda$5(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyKeyEntityDao
    public Object getKeyById(final int i10, InterfaceC9324c<? super CourseStudyKeyEntity> interfaceC9324c) {
        final String str = "select * from course_study_key where id = ?";
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.e0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyKeyEntityDao_Impl.getKeyById$lambda$3(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    @Override // com.zykj.study.data.CourseStudyKeyEntityDao
    public Object getKeyByUserId(final String str, InterfaceC9324c<? super CourseStudyKeyEntity> interfaceC9324c) {
        final String str2 = "select * from course_study_key where userId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.c0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyKeyEntityDao_Impl.getKeyByUserId$lambda$2(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    @Override // com.zykj.study.data.CourseStudyKeyEntityDao
    public Object insert(final CourseStudyKeyEntity courseStudyKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.a0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyKeyEntityDao_Impl.insert$lambda$0(this.f11026a, courseStudyKeyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyKeyEntityDao
    public Object update(final CourseStudyKeyEntity courseStudyKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.d0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyKeyEntityDao_Impl.update$lambda$1(this.f11041a, courseStudyKeyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
