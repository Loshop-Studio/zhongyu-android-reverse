package com.zykj.evaluation.p056di.entity;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.evaluation.p056di.entity.SubmitTaskDao_Impl;
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
import p178n5.C8632a;
import p178n5.InterfaceC8634b;

/* loaded from: classes4.dex */
public final class SubmitTaskDao_Impl implements InterfaceC8634b {

    /* renamed from: c */
    public static final C6859a f8776c = new C6859a(null);

    /* renamed from: d */
    public static final int f8777d = 8;

    /* renamed from: a */
    public final RoomDatabase f8778a;

    /* renamed from: b */
    public final EntityInsertAdapter f8779b;

    /* renamed from: com.zykj.evaluation.di.entity.SubmitTaskDao_Impl$a */
    public static final class C6859a {
        public /* synthetic */ C6859a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m8714a() {
            return CollectionsKt.emptyList();
        }

        public C6859a() {
        }
    }

    public SubmitTaskDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f8778a = __db;
        this.f8779b = new EntityInsertAdapter<C8632a>() { // from class: com.zykj.evaluation.di.entity.SubmitTaskDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, C8632a entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo24077bindLong(1, entity.m14228i());
                statement.mo24077bindLong(2, entity.m14227h());
                statement.mo24077bindLong(3, entity.m14226g());
                statement.mo24079bindText(4, entity.m14224e());
                statement.mo24077bindLong(5, entity.m14223d());
                statement.mo24077bindLong(6, entity.m14222c());
                statement.mo24077bindLong(7, entity.m14225f() ? 1L : 0L);
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `submit_task` (`user_id`,`task_id`,`submit_type`,`extra`,`commit_state`,`commit_count`,`show_fail_wrong`) VALUES (?,?,?,?,?,?,?)";
            }
        };
    }

    /* renamed from: k */
    public static final Unit m8703k(String str, long j10, long j11, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: l */
    public static final C8632a m8704l(String str, long j10, long j11, SQLiteConnection _connection) {
        C8632a c8632a;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "submit_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_count");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "show_fail_wrong");
            if (sQLiteStatementPrepare.step()) {
                c8632a = new C8632a(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getText(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
            } else {
                c8632a = null;
            }
            return c8632a;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: m */
    public static final List m8705m(String str, long j10, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "submit_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_count");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "show_fail_wrong");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow;
                int i11 = columnIndexOrThrow2;
                arrayList.add(new C8632a(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getText(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0));
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: n */
    public static final Unit m8706n(SubmitTaskDao_Impl submitTaskDao_Impl, C8632a c8632a, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        submitTaskDao_Impl.f8779b.insert(_connection, (SQLiteConnection) c8632a);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m8707o(String str, long j10, long j11, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // p178n5.InterfaceC8634b
    /* renamed from: a */
    public Object mo8708a(final C8632a c8632a, Continuation continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f8778a, false, true, new Function1() { // from class: n5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitTaskDao_Impl.m8706n(this.f14317a, c8632a, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8634b
    /* renamed from: b */
    public Object mo8709b(final long j10, final long j11, Continuation continuation) {
        final String str = "DELETE FROM submit_task WHERE user_id LIKE ? AND task_id LIKE ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f8778a, false, true, new Function1() { // from class: n5.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitTaskDao_Impl.m8703k(str, j10, j11, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8634b
    /* renamed from: c */
    public Object mo8710c(final long j10, final long j11, Continuation continuation) {
        final String str = "UPDATE submit_task SET show_fail_wrong = 1 WHERE user_id = ? AND task_id = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f8778a, false, true, new Function1() { // from class: n5.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitTaskDao_Impl.m8707o(str, j10, j11, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8634b
    /* renamed from: d */
    public Object mo8711d(final long j10, final long j11, Continuation continuation) {
        final String str = "SELECT * FROM submit_task WHERE user_id LIKE ? AND task_id LIKE ?";
        return DBUtil.performSuspending(this.f8778a, true, false, new Function1() { // from class: n5.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitTaskDao_Impl.m8704l(str, j10, j11, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // p178n5.InterfaceC8634b
    /* renamed from: e */
    public Flow mo8712e(final long j10) {
        final String str = "SELECT * FROM submit_task WHERE user_id LIKE ? ";
        return FlowUtil.createFlow(this.f8778a, false, new String[]{"submit_task"}, new Function1() { // from class: n5.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitTaskDao_Impl.m8705m(str, j10, (SQLiteConnection) obj);
            }
        });
    }
}
