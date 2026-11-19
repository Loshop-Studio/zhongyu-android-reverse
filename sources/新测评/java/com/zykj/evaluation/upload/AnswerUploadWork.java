package com.zykj.evaluation.upload;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.hilt.work.HiltWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.evaluation.bean.UploadData;
import com.zykj.evaluation.p056di.AppDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p167m5.AbstractC8555e;
import p178n5.C8641h;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001 B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m13558d2 = {"Lcom/zykj/evaluation/upload/AnswerUploadWork;", "Lcom/zykj/evaluation/upload/UploadWork;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uploadUrl", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "g", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm5/e;", "commitState", "Ln5/h;", "m", "(Ljava/lang/String;Lm5/e;)Ln5/h;", "e", "Lcom/zykj/evaluation/upload/OssTaskManger;", "f", "Lcom/zykj/evaluation/di/AppDatabase;", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class AnswerUploadWork extends UploadWork {

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h */
    public static final int f10267h = 8;

    /* renamed from: e, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: f, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: com.zykj.evaluation.upload.AnswerUploadWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m10457a(long j10, long j11, String uuid, int i10, String fileAbsolutePath, String[] extras, String... tags) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Data.Builder builder = new Data.Builder();
            builder.putLong("USER_ID", j10);
            builder.putLong("TASK_ID", j11);
            builder.putInt("TASK_STATE", i10);
            builder.putString("UUID", uuid);
            builder.putInt("INPUT_TYPE", 0);
            builder.putString("INPUT_FILE_ABSOLUTE_PATH", fileAbsolutePath);
            builder.putStringArray("EXTRA_DATA", extras);
            OneTimeWorkRequest.Builder inputData = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) AnswerUploadWork.class).setInputData(builder.build());
            for (String str : tags) {
                inputData.addTag(str);
            }
            return inputData;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerUploadWork(Context context, WorkerParameters workerParams, OssTaskManger ossTaskManger, AppDatabase database) {
        super(context, workerParams, ossTaskManger);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(database, "database");
        this.ossTaskManger = ossTaskManger;
        this.database = database;
    }

    @Override // com.zykj.evaluation.upload.UploadWork
    /* renamed from: g */
    public Object mo10452g(Object obj, Continuation continuation) {
        CrashReport.postCatchedException(new Exception("AnswerUploadWork failed, key is " + obj));
        Object objMo8728c = this.database.mo8676h().mo8728c(m10455m("", AbstractC8555e.a.f14189b), continuation);
        return objMo8728c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8728c : Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.upload.UploadWork
    /* renamed from: h */
    public Object mo10453h(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.upload.UploadWork
    /* renamed from: i */
    public Object mo10454i(String str, Continuation continuation) {
        Object objMo8728c = this.database.mo8676h().mo8728c(m10455m(str, AbstractC8555e.b.f14190b), continuation);
        return objMo8728c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8728c : Unit.INSTANCE;
    }

    /* renamed from: m */
    public final C8641h m10455m(String uploadUrl, AbstractC8555e commitState) {
        long j10 = getInputData().getLong("USER_ID", -1L);
        long j11 = getInputData().getLong("TASK_ID", -1L);
        int i10 = getInputData().getInt("TASK_STATE", -1);
        String string = getInputData().getString("UUID");
        String str = string == null ? "" : string;
        String string2 = getInputData().getString("INPUT_FILE_ABSOLUTE_PATH");
        return new C8641h(j10, j11, i10, str, new UploadData(str, string2 != null ? string2 : "", uploadUrl, commitState.m14097a()));
    }
}
