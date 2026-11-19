package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.data.MyCourseEntityDao_Impl;
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
public final class MyCourseEntityDao_Impl implements MyCourseEntityDao {
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MyCourseEntity> __insertAdapterOfMyCourseEntity;
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

    /* renamed from: com.zykj.study.data.MyCourseEntityDao_Impl$getMyCourseList$1 */
    public static final class C76251 extends LimitOffsetPagingSource<MyCourseEntity> {
        final /* synthetic */ MyCourseEntityDao_Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C76251(RoomRawQuery roomRawQuery, MyCourseEntityDao_Impl myCourseEntityDao_Impl, RoomDatabase roomDatabase, String[] strArr) {
            super(roomRawQuery, roomDatabase, strArr);
            this.this$0 = myCourseEntityDao_Impl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List convertRows$lambda$0(RoomRawQuery roomRawQuery, MyCourseEntityDao_Impl myCourseEntityDao_Impl, SQLiteConnection _connection) {
            String text;
            int i10;
            int i11;
            AbstractC9133u.m16133g(_connection, "_connection");
            SQLiteStatement sQLiteStatementPrepare = _connection.prepare(roomRawQuery.getSql());
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            try {
                int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSuperviser");
                int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sort");
                int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
                int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cover");
                int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "periodId");
                int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gradeId");
                int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subjectId");
                int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learning");
                int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "likes");
                int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPublic");
                int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, NotificationCompat.CATEGORY_STATUS);
                int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
                ArrayList arrayList = new ArrayList();
                while (sQLiteStatementPrepare.step()) {
                    int i12 = columnIndexOrThrow14;
                    ArrayList arrayList2 = arrayList;
                    boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow)) != 0;
                    int i13 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                    int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                    String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                    String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                    String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                        text = null;
                        i11 = columnIndexOrThrow2;
                        i10 = columnIndexOrThrow3;
                    } else {
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        i10 = columnIndexOrThrow3;
                        i11 = columnIndexOrThrow2;
                    }
                    int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                    int i16 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                    int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                    int i18 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                    int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                    boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                    String text5 = sQLiteStatementPrepare.getText(i12);
                    int i20 = columnIndexOrThrow;
                    int i21 = columnIndexOrThrow15;
                    columnIndexOrThrow15 = i21;
                    arrayList2.add(new MyCourseEntity(i14, text2, text3, text4, text, i15, i16, i17, i18, i19, z11, z10, myCourseEntityDao_Impl.__converters.stringToSessionOrderType(text5), myCourseEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(i21) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i21))), i13));
                    columnIndexOrThrow = i20;
                    columnIndexOrThrow14 = i12;
                    columnIndexOrThrow2 = i11;
                    arrayList = arrayList2;
                    columnIndexOrThrow3 = i10;
                }
                return arrayList;
            } finally {
                sQLiteStatementPrepare.close();
            }
        }

        @Override // androidx.room.paging.LimitOffsetPagingSource
        public Object convertRows(final RoomRawQuery roomRawQuery, int i10, InterfaceC9324c<? super List<? extends MyCourseEntity>> interfaceC9324c) {
            RoomDatabase roomDatabase = this.this$0.__db;
            final MyCourseEntityDao_Impl myCourseEntityDao_Impl = this.this$0;
            return DBUtil.performSuspending(roomDatabase, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.t0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return MyCourseEntityDao_Impl.C76251.convertRows$lambda$0(roomRawQuery, myCourseEntityDao_Impl, (SQLiteConnection) obj);
                }
            }, interfaceC9324c);
        }
    }

    public MyCourseEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfMyCourseEntity = new EntityInsertAdapter<MyCourseEntity>() { // from class: com.zykj.study.data.MyCourseEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `my_course` (`isSuperviser`,`sort`,`id`,`userId`,`cover`,`title`,`description`,`periodId`,`gradeId`,`subjectId`,`learning`,`likes`,`isPublic`,`status`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MyCourseEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27222bindLong(1, entity.isSuperviser() ? 1L : 0L);
                statement.mo27222bindLong(2, entity.getSort());
                statement.mo27222bindLong(3, entity.getId());
                String userId = entity.getUserId();
                if (userId == null) {
                    statement.mo27223bindNull(4);
                } else {
                    statement.mo27224bindText(4, userId);
                }
                String cover = entity.getCover();
                if (cover == null) {
                    statement.mo27223bindNull(5);
                } else {
                    statement.mo27224bindText(5, cover);
                }
                String title = entity.getTitle();
                if (title == null) {
                    statement.mo27223bindNull(6);
                } else {
                    statement.mo27224bindText(6, title);
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.mo27223bindNull(7);
                } else {
                    statement.mo27224bindText(7, description);
                }
                statement.mo27222bindLong(8, entity.getPeriodId());
                statement.mo27222bindLong(9, entity.getGradeId());
                statement.mo27222bindLong(10, entity.getSubjectId());
                statement.mo27222bindLong(11, entity.getLearning());
                statement.mo27222bindLong(12, entity.getLikes());
                statement.mo27222bindLong(13, entity.isPublic() ? 1L : 0L);
                statement.mo27224bindText(14, MyCourseEntityDao_Impl.this.__converters.sessionOrderTypeToString(entity.getStatus()));
                Long lDateToLong = MyCourseEntityDao_Impl.this.__converters.dateToLong(entity.getCreateTime());
                if (lDateToLong == null) {
                    statement.mo27223bindNull(15);
                } else {
                    statement.mo27222bindLong(15, lDateToLong.longValue());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteAll$lambda$4(String str, SQLiteConnection _connection) {
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
    public static final C8736p deleteByCourse$lambda$6(String str, int i10, SQLiteConnection _connection) {
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
    public static final MyCourseEntity findCourse$lambda$2(String str, int i10, MyCourseEntityDao_Impl myCourseEntityDao_Impl, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27222bindLong(1, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSuperviser");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sort");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cover");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "periodId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gradeId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subjectId");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learning");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "likes");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPublic");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, NotificationCompat.CATEGORY_STATUS);
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            MyCourseEntity myCourseEntity = null;
            if (sQLiteStatementPrepare.step()) {
                myCourseEntity = new MyCourseEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow)) != 0, myCourseEntityDao_Impl.__converters.stringToSessionOrderType(sQLiteStatementPrepare.getText(columnIndexOrThrow14)), myCourseEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow15))), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
            }
            return myCourseEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p getMyCourseList$lambda$3(String str, SQLiteStatement _stmt) {
        AbstractC9133u.m16133g(_stmt, "_stmt");
        _stmt.mo27224bindText(1, str);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(MyCourseEntityDao_Impl myCourseEntityDao_Impl, List list, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        myCourseEntityDao_Impl.__insertAdapterOfMyCourseEntity.insert(_connection, list);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$1(MyCourseEntityDao_Impl myCourseEntityDao_Impl, MyCourseEntity myCourseEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        myCourseEntityDao_Impl.__insertAdapterOfMyCourseEntity.insert(_connection, (SQLiteConnection) myCourseEntity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateStatus$lambda$7(String str, MyCourseEntityDao_Impl myCourseEntityDao_Impl, CourseType courseType, int i10, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, myCourseEntityDao_Impl.__converters.sessionOrderTypeToString(courseType));
            sQLiteStatementPrepare.mo27222bindLong(2, i10);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from my_course";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.m0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.deleteAll$lambda$4(str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public Object deleteByCourse(final int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from my_course where  id = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.r0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.deleteByCourse$lambda$6(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public Object deleteByUserId(final String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str2 = "delete from my_course where  userId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.p0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.deleteByUserId$lambda$5(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public LiveData<MyCourseEntity> findCourse(final int i10) {
        final String str = "select * from my_course where  id = ?";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"my_course"}, false, new InterfaceC10570l() { // from class: com.zykj.study.data.s0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.findCourse$lambda$2(str, i10, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public PagingSource<Integer, MyCourseEntity> getMyCourseList(final String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        return new C76251(new RoomRawQuery("select * from my_course where userId = ? ORDER BY sort", new InterfaceC10570l() { // from class: com.zykj.study.data.o0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.getMyCourseList$lambda$3(userId, (SQLiteStatement) obj);
            }
        }), this, this.__db, new String[]{"my_course"});
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public Object insert(final List<MyCourseEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.q0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.insert$lambda$0(this.f11109a, list, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public int updateStatus(final int i10, final CourseType status) {
        AbstractC9133u.m16133g(status, "status");
        final String str = "update my_course set status = ? WHERE id =?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.n0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Integer.valueOf(MyCourseEntityDao_Impl.updateStatus$lambda$7(str, this, status, i10, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // com.zykj.study.data.MyCourseEntityDao
    public Object insert(final MyCourseEntity myCourseEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.l0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseEntityDao_Impl.insert$lambda$1(this.f11081a, myCourseEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
