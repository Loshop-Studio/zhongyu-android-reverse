package com.zykj.evaluation.upload;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.hilt.work.HiltWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m13558d2 = {"Lcom/zykj/evaluation/upload/FileUploadWork;", "Lcom/zykj/evaluation/upload/UploadWork;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uploadUrl", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "g", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class FileUploadWork extends UploadWork {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f */
    public static final int f10271f = 8;

    /* renamed from: com.zykj.evaluation.upload.FileUploadWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OneTimeWorkRequest.Builder m10459b(Companion companion, int i10, String str, String[] strArr, String[] strArr2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                strArr = new String[0];
            }
            if ((i11 & 8) != 0) {
                strArr2 = new String[0];
            }
            return companion.m10460a(i10, str, strArr, strArr2);
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m10460a(int i10, String fileAbsolutePath, String[] extras, String... tags) {
            Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Data.Builder builder = new Data.Builder();
            builder.putInt("INPUT_TYPE", i10);
            builder.putString("INPUT_FILE_ABSOLUTE_PATH", fileAbsolutePath);
            builder.putStringArray("EXTRA_DATA", extras);
            OneTimeWorkRequest.Builder inputData = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) FileUploadWork.class).setInputData(builder.build());
            for (String str : tags) {
                inputData.addTag(str);
            }
            return inputData;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploadWork(Context context, WorkerParameters workerParams, OssTaskManger ossTaskManger) {
        super(context, workerParams, ossTaskManger);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
    }

    @Override // com.zykj.evaluation.upload.UploadWork
    /* renamed from: g */
    public Object mo10452g(Object obj, Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.upload.UploadWork
    /* renamed from: h */
    public Object mo10453h(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.upload.UploadWork
    /* renamed from: i */
    public Object mo10454i(String str, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
