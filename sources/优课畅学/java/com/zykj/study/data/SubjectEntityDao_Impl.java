package com.zykj.study.data;

import androidx.autofill.HintConstants;
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
public final class SubjectEntityDao_Impl implements SubjectEntityDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<SubjectEntity> __insertAdapterOfSubjectEntity;
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

    public SubjectEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSubjectEntity = new EntityInsertAdapter<SubjectEntity>() { // from class: com.zykj.study.data.SubjectEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `subject` (`id`,`name`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, SubjectEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27224bindText(2, entity.getName());
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
    public static final List getList$lambda$2(String str, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new SubjectEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubjectEntity getSubjectId$lambda$1(String str, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27222bindLong(1, i10);
            return sQLiteStatementPrepare.step() ? new SubjectEntity((int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id")), sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(SubjectEntityDao_Impl subjectEntityDao_Impl, List list, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        subjectEntityDao_Impl.__insertAdapterOfSubjectEntity.insert(_connection, list);
        return C8736p.f16368a;
    }

    @Override // com.zykj.study.data.SubjectEntityDao
    public Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from subject";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.o1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SubjectEntityDao_Impl.deleteAll$lambda$3(str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.SubjectEntityDao
    public LiveData<List<SubjectEntity>> getList() {
        final String str = "select * from subject";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"subject"}, false, new InterfaceC10570l() { // from class: com.zykj.study.data.p1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SubjectEntityDao_Impl.getList$lambda$2(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.zykj.study.data.SubjectEntityDao
    public Object getSubjectId(final int i10, InterfaceC9324c<? super SubjectEntity> interfaceC9324c) {
        final String str = "select * from subject where id = ?";
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.n1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SubjectEntityDao_Impl.getSubjectId$lambda$1(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    @Override // com.zykj.study.data.SubjectEntityDao
    public Object insert(final List<SubjectEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.m1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SubjectEntityDao_Impl.insert$lambda$0(this.f11087a, list, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
