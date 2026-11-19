package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.paging.PagingSource;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.study.data.CourseStudyEntityDao_Impl;
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
public final class CourseStudyEntityDao_Impl implements CourseStudyEntityDao {
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<CourseStudyEntity> __insertAdapterOfCourseStudyEntity;
    private final EntityDeleteOrUpdateAdapter<CourseStudyEntity> __updateAdapterOfCourseStudyEntity;
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

    /* renamed from: com.zykj.study.data.CourseStudyEntityDao_Impl$getCourseStudyList$1 */
    public static final class C76201 extends LimitOffsetPagingSource<CourseStudyEntity> {
        final /* synthetic */ CourseStudyEntityDao_Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C76201(RoomRawQuery roomRawQuery, CourseStudyEntityDao_Impl courseStudyEntityDao_Impl, RoomDatabase roomDatabase, String[] strArr) {
            super(roomRawQuery, roomDatabase, strArr);
            this.this$0 = courseStudyEntityDao_Impl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List convertRows$lambda$0(RoomRawQuery roomRawQuery, CourseStudyEntityDao_Impl courseStudyEntityDao_Impl, SQLiteConnection _connection) {
            String text;
            ArrayList arrayList;
            int i10;
            AbstractC9133u.m16133g(_connection, "_connection");
            SQLiteStatement sQLiteStatementPrepare = _connection.prepare(roomRawQuery.getSql());
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            try {
                int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userName");
                int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "progress");
                int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "studyUserId");
                int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnTime");
                int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
                int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cover");
                int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "periodId");
                int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gradeId");
                int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subjectId");
                int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learning");
                int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "likes");
                int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPublic");
                int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, NotificationCompat.CATEGORY_STATUS);
                int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
                ArrayList arrayList2 = new ArrayList();
                while (sQLiteStatementPrepare.step()) {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                        text = null;
                        i10 = columnIndexOrThrow14;
                        arrayList = arrayList2;
                    } else {
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        arrayList = arrayList2;
                        i10 = columnIndexOrThrow14;
                    }
                    int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                    String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow;
                    Date dateLongToDate = courseStudyEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
                    int i13 = columnIndexOrThrow2;
                    int i14 = columnIndexOrThrow3;
                    int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                    int i16 = columnIndexOrThrow5;
                    int i17 = i10;
                    int i18 = columnIndexOrThrow4;
                    int i19 = columnIndexOrThrow15;
                    int i20 = columnIndexOrThrow16;
                    int i21 = columnIndexOrThrow17;
                    columnIndexOrThrow17 = i21;
                    CourseStudyEntity courseStudyEntity = new CourseStudyEntity(i15, sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), text, sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(i17), ((int) sQLiteStatementPrepare.getLong(i19)) != 0, courseStudyEntityDao_Impl.__converters.stringToSessionOrderType(sQLiteStatementPrepare.getText(i20)), i11, text2, courseStudyEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(i21) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i21))), dateLongToDate);
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(courseStudyEntity);
                    columnIndexOrThrow2 = i13;
                    columnIndexOrThrow16 = i20;
                    arrayList2 = arrayList3;
                    columnIndexOrThrow3 = i14;
                    columnIndexOrThrow14 = i17;
                    columnIndexOrThrow15 = i19;
                    columnIndexOrThrow4 = i18;
                    columnIndexOrThrow = i12;
                    columnIndexOrThrow5 = i16;
                }
                return arrayList2;
            } finally {
                sQLiteStatementPrepare.close();
            }
        }

        @Override // androidx.room.paging.LimitOffsetPagingSource
        public Object convertRows(final RoomRawQuery roomRawQuery, int i10, InterfaceC9324c<? super List<? extends CourseStudyEntity>> interfaceC9324c) {
            RoomDatabase roomDatabase = this.this$0.__db;
            final CourseStudyEntityDao_Impl courseStudyEntityDao_Impl = this.this$0;
            return DBUtil.performSuspending(roomDatabase, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.z
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return CourseStudyEntityDao_Impl.C76201.convertRows$lambda$0(roomRawQuery, courseStudyEntityDao_Impl, (SQLiteConnection) obj);
                }
            }, interfaceC9324c);
        }
    }

    public CourseStudyEntityDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfCourseStudyEntity = new EntityInsertAdapter<CourseStudyEntity>() { // from class: com.zykj.study.data.CourseStudyEntityDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `course_study` (`userName`,`progress`,`studyUserId`,`learnTime`,`id`,`userId`,`cover`,`title`,`description`,`periodId`,`gradeId`,`subjectId`,`learning`,`likes`,`isPublic`,`status`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, CourseStudyEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                String userName = entity.getUserName();
                if (userName == null) {
                    statement.mo27223bindNull(1);
                } else {
                    statement.mo27224bindText(1, userName);
                }
                statement.mo27222bindLong(2, entity.getProgress());
                String studyUserId = entity.getStudyUserId();
                if (studyUserId == null) {
                    statement.mo27223bindNull(3);
                } else {
                    statement.mo27224bindText(3, studyUserId);
                }
                Long lDateToLong = CourseStudyEntityDao_Impl.this.__converters.dateToLong(entity.getLearnTime());
                if (lDateToLong == null) {
                    statement.mo27223bindNull(4);
                } else {
                    statement.mo27222bindLong(4, lDateToLong.longValue());
                }
                statement.mo27222bindLong(5, entity.getId());
                String userId = entity.getUserId();
                if (userId == null) {
                    statement.mo27223bindNull(6);
                } else {
                    statement.mo27224bindText(6, userId);
                }
                String cover = entity.getCover();
                if (cover == null) {
                    statement.mo27223bindNull(7);
                } else {
                    statement.mo27224bindText(7, cover);
                }
                String title = entity.getTitle();
                if (title == null) {
                    statement.mo27223bindNull(8);
                } else {
                    statement.mo27224bindText(8, title);
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.mo27223bindNull(9);
                } else {
                    statement.mo27224bindText(9, description);
                }
                statement.mo27222bindLong(10, entity.getPeriodId());
                statement.mo27222bindLong(11, entity.getGradeId());
                statement.mo27222bindLong(12, entity.getSubjectId());
                statement.mo27222bindLong(13, entity.getLearning());
                statement.mo27222bindLong(14, entity.getLikes());
                statement.mo27222bindLong(15, entity.isPublic() ? 1L : 0L);
                statement.mo27224bindText(16, CourseStudyEntityDao_Impl.this.__converters.sessionOrderTypeToString(entity.getStatus()));
                Long lDateToLong2 = CourseStudyEntityDao_Impl.this.__converters.dateToLong(entity.getCreateTime());
                if (lDateToLong2 == null) {
                    statement.mo27223bindNull(17);
                } else {
                    statement.mo27222bindLong(17, lDateToLong2.longValue());
                }
            }
        };
        this.__updateAdapterOfCourseStudyEntity = new EntityDeleteOrUpdateAdapter<CourseStudyEntity>() { // from class: com.zykj.study.data.CourseStudyEntityDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public String createQuery() {
                return "UPDATE OR ABORT `course_study` SET `userName` = ?,`progress` = ?,`studyUserId` = ?,`learnTime` = ?,`id` = ?,`userId` = ?,`cover` = ?,`title` = ?,`description` = ?,`periodId` = ?,`gradeId` = ?,`subjectId` = ?,`learning` = ?,`likes` = ?,`isPublic` = ?,`status` = ?,`createTime` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, CourseStudyEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                String userName = entity.getUserName();
                if (userName == null) {
                    statement.mo27223bindNull(1);
                } else {
                    statement.mo27224bindText(1, userName);
                }
                statement.mo27222bindLong(2, entity.getProgress());
                String studyUserId = entity.getStudyUserId();
                if (studyUserId == null) {
                    statement.mo27223bindNull(3);
                } else {
                    statement.mo27224bindText(3, studyUserId);
                }
                Long lDateToLong = CourseStudyEntityDao_Impl.this.__converters.dateToLong(entity.getLearnTime());
                if (lDateToLong == null) {
                    statement.mo27223bindNull(4);
                } else {
                    statement.mo27222bindLong(4, lDateToLong.longValue());
                }
                statement.mo27222bindLong(5, entity.getId());
                String userId = entity.getUserId();
                if (userId == null) {
                    statement.mo27223bindNull(6);
                } else {
                    statement.mo27224bindText(6, userId);
                }
                String cover = entity.getCover();
                if (cover == null) {
                    statement.mo27223bindNull(7);
                } else {
                    statement.mo27224bindText(7, cover);
                }
                String title = entity.getTitle();
                if (title == null) {
                    statement.mo27223bindNull(8);
                } else {
                    statement.mo27224bindText(8, title);
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.mo27223bindNull(9);
                } else {
                    statement.mo27224bindText(9, description);
                }
                statement.mo27222bindLong(10, entity.getPeriodId());
                statement.mo27222bindLong(11, entity.getGradeId());
                statement.mo27222bindLong(12, entity.getSubjectId());
                statement.mo27222bindLong(13, entity.getLearning());
                statement.mo27222bindLong(14, entity.getLikes());
                statement.mo27222bindLong(15, entity.isPublic() ? 1L : 0L);
                statement.mo27224bindText(16, CourseStudyEntityDao_Impl.this.__converters.sessionOrderTypeToString(entity.getStatus()));
                Long lDateToLong2 = CourseStudyEntityDao_Impl.this.__converters.dateToLong(entity.getCreateTime());
                if (lDateToLong2 == null) {
                    statement.mo27223bindNull(17);
                } else {
                    statement.mo27222bindLong(17, lDateToLong2.longValue());
                }
                statement.mo27222bindLong(18, entity.getId());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p deleteAll$lambda$5(String str, SQLiteConnection _connection) {
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
    public static final C8736p deleteById$lambda$7(String str, int i10, SQLiteConnection _connection) {
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
    public static final C8736p deleteByUserId$lambda$6(String str, String str2, SQLiteConnection _connection) {
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
    public static final CourseStudyEntity findByIdAndUserId$lambda$3(String str, String str2, int i10, CourseStudyEntityDao_Impl courseStudyEntityDao_Impl, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            sQLiteStatementPrepare.mo27222bindLong(2, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "progress");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "studyUserId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cover");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "periodId");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gradeId");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subjectId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learning");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "likes");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPublic");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, NotificationCompat.CATEGORY_STATUS);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            CourseStudyEntity courseStudyEntity = null;
            if (sQLiteStatementPrepare.step()) {
                courseStudyEntity = new CourseStudyEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15)) != 0, courseStudyEntityDao_Impl.__converters.stringToSessionOrderType(sQLiteStatementPrepare.getText(columnIndexOrThrow16)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), courseStudyEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow17))), courseStudyEntityDao_Impl.__converters.longToDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4))));
            }
            return courseStudyEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p getCourseStudyList$lambda$4(String str, SQLiteStatement _stmt) {
        AbstractC9133u.m16133g(_stmt, "_stmt");
        _stmt.mo27224bindText(1, str);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$0(CourseStudyEntityDao_Impl courseStudyEntityDao_Impl, List list, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        courseStudyEntityDao_Impl.__insertAdapterOfCourseStudyEntity.insert(_connection, list);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insert$lambda$1(CourseStudyEntityDao_Impl courseStudyEntityDao_Impl, CourseStudyEntity courseStudyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        courseStudyEntityDao_Impl.__insertAdapterOfCourseStudyEntity.insert(_connection, (SQLiteConnection) courseStudyEntity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p update$lambda$2(CourseStudyEntityDao_Impl courseStudyEntityDao_Impl, CourseStudyEntity courseStudyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        courseStudyEntityDao_Impl.__updateAdapterOfCourseStudyEntity.handle(_connection, courseStudyEntity);
        return C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from course_study";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.s
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.deleteAll$lambda$5(str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object deleteById(final int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str = "delete from course_study where  id = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.t
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.deleteById$lambda$7(str, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object deleteByUserId(final String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        final String str2 = "delete from course_study where  studyUserId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.r
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.deleteByUserId$lambda$6(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object findByIdAndUserId(final String str, final int i10, InterfaceC9324c<? super CourseStudyEntity> interfaceC9324c) {
        final String str2 = "select * from course_study where studyUserId = ? and id = ?";
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.x
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.findByIdAndUserId$lambda$3(str2, str, i10, this, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public PagingSource<Integer, CourseStudyEntity> getCourseStudyList(final String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        return new C76201(new RoomRawQuery("select * from course_study where studyUserId = ? order by learnTime desc", new InterfaceC10570l() { // from class: com.zykj.study.data.y
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.getCourseStudyList$lambda$4(userId, (SQLiteStatement) obj);
            }
        }), this, this.__db, new String[]{"course_study"});
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object insert(final List<CourseStudyEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.v
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.insert$lambda$0(this.f11127a, list, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object update(final CourseStudyEntity courseStudyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.u
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.update$lambda$2(this.f11123a, courseStudyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.CourseStudyEntityDao
    public Object insert(final CourseStudyEntity courseStudyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.w
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseStudyEntityDao_Impl.insert$lambda$1(this.f11131a, courseStudyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }
}
