package com.zykj.evaluation.p056di.entity;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.evaluation.p056di.converter.CommitSelfCorrectConverter;
import com.zykj.evaluation.p056di.converter.UploadDataConverter;
import com.zykj.evaluation.p056di.entity.UploadCorrectSelfQuestionDao_Impl;
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
import p178n5.C8648o;
import p178n5.InterfaceC8649p;

/* loaded from: classes4.dex */
public final class UploadCorrectSelfQuestionDao_Impl implements InterfaceC8649p {

    /* renamed from: e */
    public static final C6864a f8788e = new C6864a(null);

    /* renamed from: f */
    public static final int f8789f = 8;

    /* renamed from: a */
    public final RoomDatabase f8790a;

    /* renamed from: b */
    public final EntityInsertAdapter f8791b;

    /* renamed from: c */
    public final UploadDataConverter f8792c;

    /* renamed from: d */
    public final CommitSelfCorrectConverter f8793d;

    /* renamed from: com.zykj.evaluation.di.entity.UploadCorrectSelfQuestionDao_Impl$a */
    public static final class C6864a {
        public /* synthetic */ C6864a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m8752a() {
            return CollectionsKt.emptyList();
        }

        public C6864a() {
        }
    }

    public UploadCorrectSelfQuestionDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f8792c = new UploadDataConverter();
        this.f8793d = new CommitSelfCorrectConverter();
        this.f8790a = __db;
        this.f8791b = new EntityInsertAdapter<C8648o>() { // from class: com.zykj.evaluation.di.entity.UploadCorrectSelfQuestionDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, C8648o entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo24077bindLong(1, entity.m14242i());
                statement.mo24077bindLong(2, entity.m14240g());
                statement.mo24077bindLong(3, entity.m14241h());
                statement.mo24077bindLong(4, entity.m14239f());
                String strM8696c = UploadCorrectSelfQuestionDao_Impl.this.f8792c.m8696c(entity.m14236c());
                if (strM8696c == null) {
                    statement.mo24078bindNull(5);
                } else {
                    statement.mo24079bindText(5, strM8696c);
                }
                String strM8690a = UploadCorrectSelfQuestionDao_Impl.this.f8793d.m8690a(entity.m14237d());
                if (strM8690a == null) {
                    statement.mo24078bindNull(6);
                } else {
                    statement.mo24079bindText(6, strM8690a);
                }
                statement.mo24077bindLong(7, entity.m14238e());
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `upload_correct_self_question` (`user_id`,`task_id`,`task_state`,`question_id`,`answer_upload_data`,`commit_self_correct_req`,`commit_state`) VALUES (?,?,?,?,?,?,?)";
            }
        };
    }

    /* renamed from: m */
    public static final Unit m8741m(String str, long j10, long j11, int i10, SQLiteConnection _connection) {
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

    /* renamed from: n */
    public static final C8648o m8742n(String str, long j10, long j11, int i10, long j12, UploadCorrectSelfQuestionDao_Impl uploadCorrectSelfQuestionDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.mo24077bindLong(3, i10);
            sQLiteStatementPrepare.mo24077bindLong(4, j12);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_state");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "question_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "answer_upload_data");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_self_correct_req");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            C8648o c8648o = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j15 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                List listM8695b = uploadCorrectSelfQuestionDao_Impl.f8792c.m8695b(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (listM8695b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                List listM8691b = uploadCorrectSelfQuestionDao_Impl.f8793d.m8691b(text);
                if (listM8691b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.CommitSelfCorrectReq>', but it was NULL.");
                }
                c8648o = new C8648o(j13, j14, i11, j15, listM8695b, listM8691b, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
            }
            sQLiteStatementPrepare.close();
            return c8648o;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: o */
    public static final List m8743o(String str, long j10, long j11, int i10, UploadCorrectSelfQuestionDao_Impl uploadCorrectSelfQuestionDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.mo24077bindLong(3, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_state");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "question_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "answer_upload_data");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_self_correct_req");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                int i12 = columnIndexOrThrow;
                List listM8695b = uploadCorrectSelfQuestionDao_Impl.f8792c.m8695b(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (listM8695b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>', but it was NULL.");
                }
                List listM8691b = uploadCorrectSelfQuestionDao_Impl.f8793d.m8691b(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (listM8691b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.CommitSelfCorrectReq>', but it was NULL.");
                }
                arrayList.add(new C8648o(j12, j13, i11, j14, listM8695b, listM8691b, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                columnIndexOrThrow = i12;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: p */
    public static final List m8744p(String str, long j10, long j11, int i10, UploadCorrectSelfQuestionDao_Impl uploadCorrectSelfQuestionDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo24077bindLong(1, j10);
            sQLiteStatementPrepare.mo24077bindLong(2, j11);
            sQLiteStatementPrepare.mo24077bindLong(3, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "task_state");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "question_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "answer_upload_data");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_self_correct_req");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                int i12 = columnIndexOrThrow;
                List listM8695b = uploadCorrectSelfQuestionDao_Impl.f8792c.m8695b(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (listM8695b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>', but it was NULL.");
                }
                List listM8691b = uploadCorrectSelfQuestionDao_Impl.f8793d.m8691b(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (listM8691b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.CommitSelfCorrectReq>', but it was NULL.");
                }
                arrayList.add(new C8648o(j12, j13, i11, j14, listM8695b, listM8691b, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                columnIndexOrThrow = i12;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: q */
    public static final Unit m8745q(UploadCorrectSelfQuestionDao_Impl uploadCorrectSelfQuestionDao_Impl, C8648o c8648o, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        uploadCorrectSelfQuestionDao_Impl.f8791b.insert(_connection, (SQLiteConnection) c8648o);
        return Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8649p
    /* renamed from: a */
    public Object mo8746a(final long j10, final long j11, final int i10, Continuation continuation) {
        final String str = "DELETE FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f8790a, false, true, new Function1() { // from class: n5.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadCorrectSelfQuestionDao_Impl.m8741m(str, j10, j11, i10, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8649p
    /* renamed from: b */
    public Object mo8747b(final long j10, final long j11, final int i10, Continuation continuation) {
        final String str = "SELECT * FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ?";
        return DBUtil.performSuspending(this.f8790a, true, false, new Function1() { // from class: n5.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadCorrectSelfQuestionDao_Impl.m8743o(str, j10, j11, i10, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // p178n5.InterfaceC8649p
    /* renamed from: c */
    public Object mo8748c(final C8648o c8648o, Continuation continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f8790a, false, true, new Function1() { // from class: n5.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadCorrectSelfQuestionDao_Impl.m8745q(this.f14359a, c8648o, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8649p
    /* renamed from: d */
    public Object mo8749d(final long j10, final long j11, final int i10, final long j12, Continuation continuation) {
        final String str = "SELECT * FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ? AND question_id = ?";
        return DBUtil.performSuspending(this.f8790a, true, false, new Function1() { // from class: n5.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadCorrectSelfQuestionDao_Impl.m8742n(str, j10, j11, i10, j12, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // p178n5.InterfaceC8649p
    /* renamed from: e */
    public Flow mo8750e(final long j10, final long j11, final int i10) {
        final String str = "SELECT * FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ?";
        return FlowUtil.createFlow(this.f8790a, false, new String[]{"upload_correct_self_question"}, new Function1() { // from class: n5.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadCorrectSelfQuestionDao_Impl.m8744p(str, j10, j11, i10, this, (SQLiteConnection) obj);
            }
        });
    }
}
