package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Date;
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
public final class SearchHistoryEntityDao_Impl implements SearchHistoryEntityDao {
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<SearchHistoryEntity> __deleteAdapterOfSearchHistoryEntity;
    private final EntityInsertAdapter<SearchHistoryEntity> __insertAdapterOfSearchHistoryEntity;
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

    public SearchHistoryEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfSearchHistoryEntity = new EntityInsertAdapter<SearchHistoryEntity>() { // from class: com.zykj.study.data.SearchHistoryEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `search_history` (`id`,`userId`,`searchKey`,`createDate`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, SearchHistoryEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
                statement.mo27224bindText(2, entity.getUserId());
                statement.mo27224bindText(3, entity.getSearchKey());
                Long lDateToLong = SearchHistoryEntityDao_Impl.this.__converters.dateToLong(entity.getCreateDate());
                if (lDateToLong == null) {
                    statement.mo27223bindNull(4);
                } else {
                    statement.mo27222bindLong(4, lDateToLong.longValue());
                }
            }
        };
        this.__deleteAdapterOfSearchHistoryEntity = new EntityDeleteOrUpdateAdapter<SearchHistoryEntity>() { // from class: com.zykj.study.data.SearchHistoryEntityDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public String createQuery() {
                return "DELETE FROM `search_history` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, SearchHistoryEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.getId());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p delete$lambda$1(SearchHistoryEntityDao_Impl searchHistoryEntityDao_Impl, SearchHistoryEntity[] searchHistoryEntityArr, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        searchHistoryEntityDao_Impl.__deleteAdapterOfSearchHistoryEntity.handleMultiple(_connection, searchHistoryEntityArr);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p delete$lambda$2(SearchHistoryEntityDao_Impl searchHistoryEntityDao_Impl, List list, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        searchHistoryEntityDao_Impl.__deleteAdapterOfSearchHistoryEntity.handleMultiple(_connection, list);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteAll$lambda$5(String str, String str2, SQLiteConnection _connection) {
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
    public static final List getHistoryList$lambda$4(String str, String str2, SearchHistoryEntityDao_Impl searchHistoryEntityDao_Impl, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchKey");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                Date dateLongToDate = searchHistoryEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
                if (dateLongToDate == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                arrayList.add(new SearchHistoryEntity(i10, text, text2, dateLongToDate));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getList$lambda$3(String str, String str2, SearchHistoryEntityDao_Impl searchHistoryEntityDao_Impl, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchKey");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createDate");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                Date dateLongToDate = searchHistoryEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
                if (dateLongToDate == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                arrayList.add(new SearchHistoryEntity(i10, text, text2, dateLongToDate));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(SearchHistoryEntityDao_Impl searchHistoryEntityDao_Impl, SearchHistoryEntity[] searchHistoryEntityArr, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        searchHistoryEntityDao_Impl.__insertAdapterOfSearchHistoryEntity.insert(_connection, searchHistoryEntityArr);
        return C8736p.f16368a;
    }

    @Override // com.zykj.study.data.SearchHistoryEntityDao
    public Object delete(final SearchHistoryEntity[] searchHistoryEntityArr, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.g1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchHistoryEntityDao_Impl.delete$lambda$1(this.f11056a, searchHistoryEntityArr, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.SearchHistoryEntityDao
    public Object deleteAll(final String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str2 = "delete from search_history where userId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.i1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchHistoryEntityDao_Impl.deleteAll$lambda$5(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.SearchHistoryEntityDao
    public LiveData<List<SearchHistoryEntity>> getHistoryList(final String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        final String str = "select * from search_history where userId = ?";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"search_history"}, false, new InterfaceC10570l() { // from class: com.zykj.study.data.h1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchHistoryEntityDao_Impl.getHistoryList$lambda$4(str, userId, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.zykj.study.data.SearchHistoryEntityDao
    public List<SearchHistoryEntity> getList(final String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        final String str = "select * from search_history where userId = ? order by createDate";
        return (List) DBUtil.performBlocking(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.k1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchHistoryEntityDao_Impl.getList$lambda$3(str, userId, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.zykj.study.data.SearchHistoryEntityDao
    public Object insert(final SearchHistoryEntity[] searchHistoryEntityArr, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.l1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchHistoryEntityDao_Impl.insert$lambda$0(this.f11083a, searchHistoryEntityArr, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.SearchHistoryEntityDao
    public Object delete(final List<SearchHistoryEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.j1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchHistoryEntityDao_Impl.delete$lambda$2(this.f11071a, list, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
