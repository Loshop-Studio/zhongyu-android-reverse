package com.zykj.evaluation.p056di.entity;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.evaluation.bean.UploadData;
import com.zykj.evaluation.p056di.converter.CommitTaskAnswerConverter;
import com.zykj.evaluation.p056di.converter.UploadDataConverter;
import com.zykj.evaluation.p056di.entity.UploadQuestionDao_Impl;
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
import p178n5.C8655v;
import p178n5.InterfaceC8656w;

/* loaded from: classes4.dex */
public final class UploadQuestionDao_Impl implements InterfaceC8656w {

    /* renamed from: e */
    public static final C6866a f8795e = new C6866a(null);

    /* renamed from: f */
    public static final int f8796f = 8;

    /* renamed from: a */
    public final RoomDatabase f8797a;

    /* renamed from: b */
    public final EntityInsertAdapter f8798b;

    /* renamed from: c */
    public final UploadDataConverter f8799c;

    /* renamed from: d */
    public final CommitTaskAnswerConverter f8800d;

    /* renamed from: com.zykj.evaluation.di.entity.UploadQuestionDao_Impl$a */
    public static final class C6866a {
        public /* synthetic */ C6866a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m8771a() {
            return CollectionsKt.emptyList();
        }

        public C6866a() {
        }
    }

    public UploadQuestionDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f8799c = new UploadDataConverter();
        this.f8800d = new CommitTaskAnswerConverter();
        this.f8797a = __db;
        this.f8798b = new EntityInsertAdapter<C8655v>() { // from class: com.zykj.evaluation.di.entity.UploadQuestionDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, C8655v entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo24077bindLong(1, entity.m14252j());
                statement.mo24077bindLong(2, entity.m14250h());
                statement.mo24077bindLong(3, entity.m14251i());
                statement.mo24077bindLong(4, entity.m14249g());
                String strM8697d = UploadQuestionDao_Impl.this.f8799c.m8697d(entity.m14248f());
                if (strM8697d == null) {
                    statement.mo24078bindNull(5);
                } else {
                    statement.mo24079bindText(5, strM8697d);
                }
                String strM8696c = UploadQuestionDao_Impl.this.f8799c.m8696c(entity.m14245c());
                if (strM8696c == null) {
                    statement.mo24078bindNull(6);
                } else {
                    statement.mo24079bindText(6, strM8696c);
                }
                statement.mo24077bindLong(7, entity.m14254l() ? 1L : 0L);
                statement.mo24077bindLong(8, entity.m14253k() ? 1L : 0L);
                String strM8693b = UploadQuestionDao_Impl.this.f8800d.m8693b(entity.m14247e());
                if (strM8693b == null) {
                    statement.mo24078bindNull(9);
                } else {
                    statement.mo24079bindText(9, strM8693b);
                }
                statement.mo24077bindLong(10, entity.m14246d());
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `upload_question` (`user_id`,`task_id`,`task_state`,`question_id`,`draft_upload_data`,`answer_upload_data`,`is_todo`,`is_group`,`commit_request`,`commit_state`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }
        };
    }

    /* renamed from: m */
    public static final Unit m8760m(String str, long j10, long j11, int i10, SQLiteConnection _connection) {
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
    public static final C8655v m8761n(String str, long j10, long j11, int i10, long j12, UploadQuestionDao_Impl uploadQuestionDao_Impl, SQLiteConnection _connection) {
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
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "draft_upload_data");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "answer_upload_data");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_todo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_group");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_request");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            C8655v c8655v = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j15 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                UploadData uploadDataM8694a = uploadQuestionDao_Impl.f8799c.m8694a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (uploadDataM8694a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.zykj.evaluation.bean.UploadData', but it was NULL.");
                }
                List listM8695b = uploadQuestionDao_Impl.f8799c.m8695b(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (listM8695b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>', but it was NULL.");
                }
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                List listM8692a = uploadQuestionDao_Impl.f8800d.m8692a(text);
                if (listM8692a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.CommitTaskAnswer>', but it was NULL.");
                }
                c8655v = new C8655v(j13, j14, i11, j15, uploadDataM8694a, listM8695b, z9, z10, listM8692a, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
            }
            sQLiteStatementPrepare.close();
            return c8655v;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: o */
    public static final List m8762o(String str, long j10, long j11, int i10, UploadQuestionDao_Impl uploadQuestionDao_Impl, SQLiteConnection _connection) {
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
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "draft_upload_data");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "answer_upload_data");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_todo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_group");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_request");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                UploadData uploadDataM8694a = uploadQuestionDao_Impl.f8799c.m8694a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (uploadDataM8694a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.zykj.evaluation.bean.UploadData', but it was NULL.");
                }
                List listM8695b = uploadQuestionDao_Impl.f8799c.m8695b(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (listM8695b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>', but it was NULL.");
                }
                int i12 = columnIndexOrThrow;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                int i13 = columnIndexOrThrow2;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                List listM8692a = uploadQuestionDao_Impl.f8800d.m8692a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (listM8692a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.CommitTaskAnswer>', but it was NULL.");
                }
                arrayList.add(new C8655v(j12, j13, i11, j14, uploadDataM8694a, listM8695b, z9, z10, listM8692a, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)));
                columnIndexOrThrow = i12;
                columnIndexOrThrow2 = i13;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: p */
    public static final List m8763p(String str, long j10, long j11, int i10, UploadQuestionDao_Impl uploadQuestionDao_Impl, SQLiteConnection _connection) {
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
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "draft_upload_data");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "answer_upload_data");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_todo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_group");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_request");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commit_state");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                UploadData uploadDataM8694a = uploadQuestionDao_Impl.f8799c.m8694a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (uploadDataM8694a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.zykj.evaluation.bean.UploadData', but it was NULL.");
                }
                List listM8695b = uploadQuestionDao_Impl.f8799c.m8695b(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (listM8695b == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>', but it was NULL.");
                }
                int i12 = columnIndexOrThrow;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                int i13 = columnIndexOrThrow2;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                List listM8692a = uploadQuestionDao_Impl.f8800d.m8692a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (listM8692a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.zykj.evaluation.bean.CommitTaskAnswer>', but it was NULL.");
                }
                arrayList.add(new C8655v(j12, j13, i11, j14, uploadDataM8694a, listM8695b, z9, z10, listM8692a, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)));
                columnIndexOrThrow = i12;
                columnIndexOrThrow2 = i13;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: q */
    public static final Unit m8764q(UploadQuestionDao_Impl uploadQuestionDao_Impl, C8655v c8655v, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        uploadQuestionDao_Impl.f8798b.insert(_connection, (SQLiteConnection) c8655v);
        return Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8656w
    /* renamed from: a */
    public Object mo8765a(final long j10, final long j11, final int i10, Continuation continuation) {
        final String str = "SELECT * FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ?";
        return DBUtil.performSuspending(this.f8797a, true, false, new Function1() { // from class: n5.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadQuestionDao_Impl.m8762o(str, j10, j11, i10, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // p178n5.InterfaceC8656w
    /* renamed from: b */
    public Object mo8766b(final C8655v c8655v, Continuation continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f8797a, false, true, new Function1() { // from class: n5.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadQuestionDao_Impl.m8764q(this.f14396a, c8655v, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8656w
    /* renamed from: c */
    public Object mo8767c(final long j10, final long j11, final int i10, Continuation continuation) {
        final String str = "DELETE FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f8797a, false, true, new Function1() { // from class: n5.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadQuestionDao_Impl.m8760m(str, j10, j11, i10, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // p178n5.InterfaceC8656w
    /* renamed from: d */
    public Object mo8768d(final long j10, final long j11, final int i10, final long j12, Continuation continuation) {
        final String str = "SELECT * FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ? AND question_id = ?";
        return DBUtil.performSuspending(this.f8797a, true, false, new Function1() { // from class: n5.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadQuestionDao_Impl.m8761n(str, j10, j11, i10, j12, this, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // p178n5.InterfaceC8656w
    /* renamed from: e */
    public Flow mo8769e(final long j10, final long j11, final int i10) {
        final String str = "SELECT * FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ?";
        return FlowUtil.createFlow(this.f8797a, false, new String[]{"upload_question"}, new Function1() { // from class: n5.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadQuestionDao_Impl.m8763p(str, j10, j11, i10, this, (SQLiteConnection) obj);
            }
        });
    }
}
