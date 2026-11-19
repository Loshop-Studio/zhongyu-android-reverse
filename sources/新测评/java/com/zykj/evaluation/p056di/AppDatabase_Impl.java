package com.zykj.evaluation.p056di;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.zykj.evaluation.p056di.AppDatabase_Impl;
import com.zykj.evaluation.p056di.entity.SubmitTaskDao_Impl;
import com.zykj.evaluation.p056di.entity.UploadAnswerDao_Impl;
import com.zykj.evaluation.p056di.entity.UploadCorrectSelfQuestionDao_Impl;
import com.zykj.evaluation.p056di.entity.UploadQuestionDao_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p178n5.InterfaceC8634b;
import p178n5.InterfaceC8642i;
import p178n5.InterfaceC8649p;
import p178n5.InterfaceC8656w;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'¨\u0006/"}, m13558d2 = {"Lcom/zykj/evaluation/di/AppDatabase_Impl;", "Lcom/zykj/evaluation/di/AppDatabase;", "<init>", "()V", "Landroidx/room/RoomOpenDelegate;", "t", "()Landroidx/room/RoomOpenDelegate;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "", "clearAllTables", "", "Lkotlin/reflect/KClass;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Landroidx/room/migration/AutoMigrationSpec;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Landroidx/room/migration/Migration;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Ln5/i;", "h", "()Ln5/i;", "Ln5/w;", "j", "()Ln5/w;", "Ln5/p;", "i", "()Ln5/p;", "Ln5/b;", "g", "()Ln5/b;", "Lkotlin/Lazy;", "a", "Lkotlin/Lazy;", "_uploadAnswerDao", "b", "_uploadQuestionDao", "c", "_uploadCorrectSelfQuestionDao", "d", "_submitTaskDao", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy _uploadAnswerDao = LazyKt.lazy(new Function0() { // from class: m5.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl.m8685p(this.f14184a);
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy _uploadQuestionDao = LazyKt.lazy(new Function0() { // from class: m5.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl.m8687r(this.f14185a);
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public final Lazy _uploadCorrectSelfQuestionDao = LazyKt.lazy(new Function0() { // from class: m5.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl.m8686q(this.f14186a);
        }
    });

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy _submitTaskDao = LazyKt.lazy(new Function0() { // from class: m5.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl.m8684o(this.f14187a);
        }
    });

    /* renamed from: o */
    public static final SubmitTaskDao_Impl m8684o(AppDatabase_Impl appDatabase_Impl) {
        return new SubmitTaskDao_Impl(appDatabase_Impl);
    }

    /* renamed from: p */
    public static final UploadAnswerDao_Impl m8685p(AppDatabase_Impl appDatabase_Impl) {
        return new UploadAnswerDao_Impl(appDatabase_Impl);
    }

    /* renamed from: q */
    public static final UploadCorrectSelfQuestionDao_Impl m8686q(AppDatabase_Impl appDatabase_Impl) {
        return new UploadCorrectSelfQuestionDao_Impl(appDatabase_Impl);
    }

    /* renamed from: r */
    public static final UploadQuestionDao_Impl m8687r(AppDatabase_Impl appDatabase_Impl) {
        return new UploadQuestionDao_Impl(appDatabase_Impl);
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "upload_answer", "upload_question", "upload_correct_self_question", "submit_task");
    }

    @Override // androidx.room.RoomDatabase
    public List createAutoMigrations(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "upload_answer", "upload_question", "upload_correct_self_question", "submit_task");
    }

    @Override // com.zykj.evaluation.p056di.AppDatabase
    /* renamed from: g */
    public InterfaceC8634b mo8675g() {
        return (InterfaceC8634b) this._submitTaskDao.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC8642i.class), UploadAnswerDao_Impl.f8780e.m8733a());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC8656w.class), UploadQuestionDao_Impl.f8795e.m8771a());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC8649p.class), UploadCorrectSelfQuestionDao_Impl.f8788e.m8752a());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC8634b.class), SubmitTaskDao_Impl.f8776c.m8714a());
        return linkedHashMap;
    }

    @Override // com.zykj.evaluation.p056di.AppDatabase
    /* renamed from: h */
    public InterfaceC8642i mo8676h() {
        return (InterfaceC8642i) this._uploadAnswerDao.getValue();
    }

    @Override // com.zykj.evaluation.p056di.AppDatabase
    /* renamed from: i */
    public InterfaceC8649p mo8677i() {
        return (InterfaceC8649p) this._uploadCorrectSelfQuestionDao.getValue();
    }

    @Override // com.zykj.evaluation.p056di.AppDatabase
    /* renamed from: j */
    public InterfaceC8656w mo8678j() {
        return (InterfaceC8656w) this._uploadQuestionDao.getValue();
    }

    @Override // androidx.room.RoomDatabase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: com.zykj.evaluation.di.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(2, "90a54ad0d2ffc64b76807da9080d5976", "4422c95965a9c044fa5825b5ba8ad05b");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `upload_answer` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `task_state` INTEGER NOT NULL, `uuid` TEXT NOT NULL, `upload_data` TEXT NOT NULL, PRIMARY KEY(`user_id`, `task_id`, `task_state`, `uuid`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `upload_question` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `task_state` INTEGER NOT NULL, `question_id` INTEGER NOT NULL, `draft_upload_data` TEXT NOT NULL, `answer_upload_data` TEXT NOT NULL, `is_todo` INTEGER NOT NULL, `is_group` INTEGER NOT NULL, `commit_request` TEXT NOT NULL, `commit_state` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `task_id`, `task_state`, `question_id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `upload_correct_self_question` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `task_state` INTEGER NOT NULL, `question_id` INTEGER NOT NULL, `answer_upload_data` TEXT NOT NULL, `commit_self_correct_req` TEXT NOT NULL, `commit_state` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `task_id`, `task_state`, `question_id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `submit_task` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `submit_type` INTEGER NOT NULL, `extra` TEXT NOT NULL, `commit_state` INTEGER NOT NULL, `commit_count` INTEGER NOT NULL, `show_fail_wrong` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `task_id`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '90a54ad0d2ffc64b76807da9080d5976')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `upload_answer`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `upload_question`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `upload_correct_self_question`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `submit_task`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                this.f8775a.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("task_id", new TableInfo.Column("task_id", "INTEGER", true, 2, null, 1));
                linkedHashMap.put("task_state", new TableInfo.Column("task_state", "INTEGER", true, 3, null, 1));
                linkedHashMap.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 4, null, 1));
                linkedHashMap.put("upload_data", new TableInfo.Column("upload_data", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("upload_answer", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo.Companion companion = TableInfo.INSTANCE;
                TableInfo tableInfo2 = companion.read(connection, "upload_answer");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "upload_answer(com.zykj.evaluation.di.entity.UploadAnswer).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1, null, 1));
                linkedHashMap2.put("task_id", new TableInfo.Column("task_id", "INTEGER", true, 2, null, 1));
                linkedHashMap2.put("task_state", new TableInfo.Column("task_state", "INTEGER", true, 3, null, 1));
                linkedHashMap2.put("question_id", new TableInfo.Column("question_id", "INTEGER", true, 4, null, 1));
                linkedHashMap2.put("draft_upload_data", new TableInfo.Column("draft_upload_data", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("answer_upload_data", new TableInfo.Column("answer_upload_data", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("is_todo", new TableInfo.Column("is_todo", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("is_group", new TableInfo.Column("is_group", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("commit_request", new TableInfo.Column("commit_request", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("commit_state", new TableInfo.Column("commit_state", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("upload_question", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo4 = companion.read(connection, "upload_question");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "upload_question(com.zykj.evaluation.di.entity.UploadQuestion).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1, null, 1));
                linkedHashMap3.put("task_id", new TableInfo.Column("task_id", "INTEGER", true, 2, null, 1));
                linkedHashMap3.put("task_state", new TableInfo.Column("task_state", "INTEGER", true, 3, null, 1));
                linkedHashMap3.put("question_id", new TableInfo.Column("question_id", "INTEGER", true, 4, null, 1));
                linkedHashMap3.put("answer_upload_data", new TableInfo.Column("answer_upload_data", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("commit_self_correct_req", new TableInfo.Column("commit_self_correct_req", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("commit_state", new TableInfo.Column("commit_state", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("upload_correct_self_question", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo6 = companion.read(connection, "upload_correct_self_question");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "upload_correct_self_question(com.zykj.evaluation.di.entity.UploadCorrectSelfQuestion).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1, null, 1));
                linkedHashMap4.put("task_id", new TableInfo.Column("task_id", "INTEGER", true, 2, null, 1));
                linkedHashMap4.put("submit_type", new TableInfo.Column("submit_type", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("extra", new TableInfo.Column("extra", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("commit_state", new TableInfo.Column("commit_state", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("commit_count", new TableInfo.Column("commit_count", "INTEGER", true, 0, null, 1));
                linkedHashMap4.put("show_fail_wrong", new TableInfo.Column("show_fail_wrong", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("submit_task", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                TableInfo tableInfo8 = companion.read(connection, "submit_task");
                if (tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(true, null);
                }
                return new RoomOpenDelegate.ValidationResult(false, "submit_task(com.zykj.evaluation.di.entity.SubmitTask).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
        };
    }
}
