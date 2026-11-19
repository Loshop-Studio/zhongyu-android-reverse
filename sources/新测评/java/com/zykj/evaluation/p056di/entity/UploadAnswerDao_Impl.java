package com.zykj.evaluation.p056di.entity;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.evaluation.bean.UploadData;
import com.zykj.evaluation.p056di.converter.UploadDataConverter;
import com.zykj.evaluation.p056di.entity.UploadAnswerDao_Impl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p178n5.C8641h;
import p178n5.InterfaceC8642i;

/* loaded from: classes4.dex */
public final class UploadAnswerDao_Impl implements InterfaceC8642i {

    /* renamed from: e */
    public static final C6862a f8780e = new C6862a(null);

    /* renamed from: f */
    public static final int f8781f = 8;

    /* renamed from: a */
    public final RoomDatabase f8782a;

    /* renamed from: b */
    public final EntityInsertAdapter f8783b;

    /* renamed from: c */
    public final UploadDataConverter f8784c;

    /* renamed from: d */
    public final EntityDeleteOrUpdateAdapter f8785d;

    /* renamed from: com.zykj.evaluation.di.entity.UploadAnswerDao_Impl$a */
    public static final class C6862a {
        public /* synthetic */ C6862a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m8733a() {
            return CollectionsKt.emptyList();
        }

        public C6862a() {
        }
    }

    public UploadAnswerDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f8784c = new UploadDataConverter();
        this.f8782a = __db;
        this.f8783b = new EntityInsertAdapter<C8641h>() { // from class: com.zykj.evaluation.di.entity.UploadAnswerDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, C8641h entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo24077bindLong(1, entity.m14232d());
                statement.mo24077bindLong(2, entity.m14229a());
                statement.mo24077bindLong(3, entity.m14230b());
                statement.mo24079bindText(4, entity.m14233e());
                String strM8697d = UploadAnswerDao_Impl.this.f8784c.m8697d(entity.m14231c());
                if (strM8697d == null) {
                    statement.mo24078bindNull(5);
                } else {
                    statement.mo24079bindText(5, strM8697d);
                }
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `upload_answer` (`user_id`,`task_id`,`task_state`,`uuid`,`upload_data`) VALUES (?,?,?,?,?)";
            }
        };
        this.f8785d = new EntityDeleteOrUpdateAdapter<C8641h>() { // from class: com.zykj.evaluation.di.entity.UploadAnswerDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, C8641h entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo24077bindLong(1, entity.m14232d());
                statement.mo24077bindLong(2, entity.m14229a());
                statement.mo24077bindLong(3, entity.m14230b());
                statement.mo24079bindText(4, entity.m14233e());
                String strM8697d = UploadAnswerDao_Impl.this.f8784c.m8697d(entity.m14231c());
                if (strM8697d == null) {
                    statement.mo24078bindNull(5);
                } else {
                    statement.mo24079bindText(5, strM8697d);
                }
                statement.mo24077bindLong(6, entity.m14232d());
                statement.mo24077bindLong(7, entity.m14229a());
                statement.mo24077bindLong(8, entity.m14230b());
                statement.mo24079bindText(9, entity.m14233e());
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public String createQuery() {
                return "UPDATE OR ABORT `upload_answer` SET `user_id` = ?,`task_id` = ?,`task_state` = ?,`uuid` = ?,`upload_data` = ? WHERE `user_id` = ? AND `task_id` = ? AND `task_state` = ? AND `uuid` = ?";
            }
        };
    }

    /* renamed from: l */
    public static final Unit m8721l(String str, long j10, long j11, int i10, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.mo24077bindLong(3, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: m */
    public static final List m8722m(String str, long j10, long j11, int i10, UploadAnswerDao_Impl uploadAnswerDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.mo24077bindLong(3, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_state");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uuid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upload_data");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                UploadData uploadDataM8694a = uploadAnswerDao_Impl.f8784c.m8694a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (uploadDataM8694a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.zykj.evaluation.bean.UploadData', but it was NULL.");
                }
                arrayList.add(new C8641h(j12, j13, i11, text, uploadDataM8694a));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: n */
    public static final List m8723n(String str, long j10, long j11, int i10, UploadAnswerDao_Impl uploadAnswerDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.mo24077bindLong(3, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_state");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uuid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upload_data");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                UploadData uploadDataM8694a = uploadAnswerDao_Impl.f8784c.m8694a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (uploadDataM8694a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.zykj.evaluation.bean.UploadData', but it was NULL.");
                }
                arrayList.add(new C8641h(j12, j13, i11, text, uploadDataM8694a));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: o */
    public static final Unit m8724o(UploadAnswerDao_Impl uploadAnswerDao_Impl, C8641h c8641h, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        uploadAnswerDao_Impl.f8783b.insert(_connection, (SQLiteConnection) c8641h);
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m8725p(UploadAnswerDao_Impl uploadAnswerDao_Impl, List list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        uploadAnswerDao_Impl.f8783b.insert(_connection, (Iterable) list);
        return Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8642i
    /* renamed from: a */
    public Object mo8726a(final long j10, final long j11, final int i10, Continuation continuation) {
        final String str = "SELECT * FROM upload_answer WHERE user_id = ? AND task_id = ? AND task_state = ?";
        return DBUtil.performSuspending(this.f8782a, true, false, new Function1() { // from class: n5.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadAnswerDao_Impl.m8722m(str, j10, j11, i10, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // p178n5.InterfaceC8642i
    /* renamed from: b */
    public Object mo8727b(final List list, Continuation continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f8782a, false, true, new Function1() { // from class: n5.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadAnswerDao_Impl.m8725p(this.f14329a, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8642i
    /* renamed from: c */
    public Object mo8728c(final C8641h c8641h, Continuation continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f8782a, false, true, new Function1() { // from class: n5.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadAnswerDao_Impl.m8724o(this.f14331a, c8641h, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8642i
    /* renamed from: d */
    public Object mo8729d(final long j10, final long j11, final int i10, Continuation continuation) {
        final String str = "DELETE FROM upload_answer WHERE user_id = ? AND task_id = ? AND task_state = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f8782a, false, true, new Function1() { // from class: n5.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadAnswerDao_Impl.m8721l(str, j10, j11, i10, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8642i
    /* renamed from: e */
    public Flow mo8730e(final long j10, final long j11, final int i10) {
        final String str = "SELECT * FROM upload_answer WHERE user_id = ? AND task_id = ? AND task_state = ?";
        return FlowUtil.createFlow(this.f8782a, false, new String[]{"upload_answer"}, new Function1() { // from class: n5.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadAnswerDao_Impl.m8723n(str, j10, j11, i10, this, (SQLiteConnection) obj);
            }
        });
    }
}
