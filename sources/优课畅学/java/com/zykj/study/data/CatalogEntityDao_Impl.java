package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
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
public final class CatalogEntityDao_Impl implements CatalogEntityDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<CatalogEntity> __insertAdapterOfCatalogEntity;
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

    public CatalogEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfCatalogEntity = new EntityInsertAdapter<CatalogEntity>() { // from class: com.zykj.study.data.CatalogEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `catalog` (`id`,`courseId`,`title`,`isLeaf`,`progress`,`parentId`) VALUES (?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, CatalogEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27222bindLong(2, entity.getCourseId());
                statement.mo27224bindText(3, entity.getTitle());
                statement.mo27222bindLong(4, entity.isLeaf() ? 1L : 0L);
                statement.mo27222bindLong(5, entity.getProgress());
                statement.mo27222bindLong(6, entity.getParentId());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteAll$lambda$3(String str, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C8736p.f16368a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteByCatalogId$lambda$5(String str, int i10, SQLiteConnection _connection) {
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
    public static final C8736p deleteByCourse$lambda$4(String str, int i10, SQLiteConnection _connection) {
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
    public static final List findCourse$lambda$2(String str, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27222bindLong(1, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "courseId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLeaf");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "progress");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CatalogEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(CatalogEntityDao_Impl catalogEntityDao_Impl, List list, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        catalogEntityDao_Impl.__insertAdapterOfCatalogEntity.insert(_connection, list);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$1(CatalogEntityDao_Impl catalogEntityDao_Impl, CatalogEntity catalogEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        catalogEntityDao_Impl.__insertAdapterOfCatalogEntity.insert(_connection, (SQLiteConnection) catalogEntity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p updateCatalogTitle$lambda$6(String str, String str2, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            sQLiteStatementPrepare.mo27222bindLong(2, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C8736p.f16368a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from catalog";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.m
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.deleteAll$lambda$3(str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public Object deleteByCatalogId(final int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from catalog where  id = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.deleteByCatalogId$lambda$5(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public Object deleteByCourse(final int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from catalog where  courseId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.deleteByCourse$lambda$4(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public LiveData<List<CatalogEntity>> findCourse(final int i10) {
        final String str = "select * from catalog where  courseId = ?";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"catalog"}, false, new InterfaceC10570l() { // from class: com.zykj.study.data.n
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.findCourse$lambda$2(str, i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public Object insert(final List<CatalogEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.o
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.insert$lambda$0(this.f11097a, list, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public void updateCatalogTitle(final int i10, final String title) {
        AbstractC9133u.m16133g(title, "title");
        final String str = "update catalog set title = ? WHERE id =?";
        DBUtil.performBlocking(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.q
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.updateCatalogTitle$lambda$6(str, title, i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.zykj.study.data.CatalogEntityDao
    public Object insert(final CatalogEntity catalogEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.l
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogEntityDao_Impl.insert$lambda$1(this.f11079a, catalogEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
