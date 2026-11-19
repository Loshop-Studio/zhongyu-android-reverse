package com.zykj.student.dialogue.upload;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.hilt.work.HiltWorker;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.LogUtils;
import com.taobao.sophix.PatchStatus;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import p172l8.AbstractC8925x;
import p172l8.C8921t;
import p172l8.C8922u;
import p172l8.C8924w;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001 B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0097@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001c\u0010\u001aJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m13413d2 = {"Lcom/zykj/student/dialogue/upload/UploadWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "type", "Ljava/io/File;", "file", "", "fileRelativePath", "Lcom/zykj/student/dialogue/upload/OssToken;", "credential", "e", "(ILjava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadPath", "", "c", "(Ljava/io/File;Ljava/lang/String;Lcom/zykj/student/dialogue/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "d", "srcPath", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "b", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWork.kt\ncom/zykj/student/dialogue/upload/UploadWork\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Data.kt\nandroidx/work/DataKt\n*L\n1#1,374:1\n13472#2,2:375\n31#3,5:377\n31#3,5:382\n31#3,5:387\n31#3,5:392\n31#3,5:397\n31#3,5:402\n31#3,5:407\n31#3,5:412\n31#3,5:417\n31#3,5:422\n*S KotlinDebug\n*F\n+ 1 UploadWork.kt\ncom/zykj/student/dialogue/upload/UploadWork\n*L\n105#1:375,2\n115#1:377,5\n126#1:382,5\n129#1:387,5\n144#1:392,5\n163#1:397,5\n171#1:402,5\n180#1:407,5\n189#1:412,5\n201#1:417,5\n204#1:422,5\n*E\n"})
/* loaded from: classes5.dex */
public final class UploadWork extends CoroutineWorker {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c */
    public static final int f11955c = 8;

    /* renamed from: d */
    public static final String f11956d = UploadWork.class.getSimpleName();

    /* renamed from: a, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: com.zykj.student.dialogue.upload.UploadWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m11064a(int i9, String fileAbsolutePath, String[] extras, String... tags) {
            Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Data.Builder builder = new Data.Builder();
            builder.putInt("INPUT_TYPE", i9);
            builder.putString("INPUT_FILE_ABSOLUTE_PATH", fileAbsolutePath);
            builder.putStringArray("EXTRA_DATA", extras);
            OneTimeWorkRequest.Builder inputData = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadWork.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setBackoffCriteria(BackoffPolicy.LINEAR, 10L, TimeUnit.SECONDS).setInputData(builder.build());
            for (String str : tags) {
                inputData.addTag(str);
            }
            return inputData;
        }

        public Companion() {
        }
    }

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.upload.UploadWork", m13451f = "UploadWork.kt", m13452i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, m13453l = {PatchStatus.CODE_LOAD_LIB_NS, 138, 150, 195}, m13454m = "doWork", m13455n = {"extras", "filePath", "type", "extras", "filePath", "type", "extras", "filePath", "date", "fileName", "type", "extras", "filePath", "ossData", "file", "type"}, m13456s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    /* renamed from: com.zykj.student.dialogue.upload.UploadWork$doWork$1 */
    public static final class C76441 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11958a;

        /* renamed from: b */
        public Object f11959b;

        /* renamed from: c */
        public Object f11960c;

        /* renamed from: d */
        public Object f11961d;

        /* renamed from: e */
        public int f11962e;

        /* renamed from: f */
        public /* synthetic */ Object f11963f;

        /* renamed from: h */
        public int f11965h;

        public C76441(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11963f = obj;
            this.f11965h |= Integer.MIN_VALUE;
            return UploadWork.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork(Context context, WorkerParameters workerParams, OssTaskManger ossTaskManger) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.ossTaskManger = ossTaskManger;
    }

    /* renamed from: c */
    public final Object m11059c(File file, String str, OssToken ossToken, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadWork$gridFsUpload$2(new C8924w.a().m14151n(ossToken.getEndpoint() + "/" + str).m14139a("Authorization", "bearer " + ossToken.getSecurityToken()).m14139a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m14148k(new C8922u.a(null, 1, null).m14042e(C8922u.f14829k).m14038a("file", file.getName(), AbstractC8925x.Companion.m14156a(file, C8921t.f14817e.m14035b("multipart/form-data"))).m14041d()).m14140b(), null), continuation);
    }

    /* renamed from: d */
    public final Object m11060d(File file, String str, OssToken ossToken, Continuation continuation) {
        LogUtils.m2956i("start ossUpload file--->" + file.getAbsolutePath());
        LogUtils.m2956i("start ossUpload fileRelativePath--->" + str);
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadWork$ossUpload$2(new OSSClient(getApplicationContext(), StringsKt.replace$default(ossToken.getEndpoint(), ossToken.getBucket() + ".", "", false, 4, (Object) null), new OSSStsTokenCredentialProvider(ossToken.getAccessKeyId(), ossToken.getAccessKeySecret(), ossToken.getSecurityToken())), new PutObjectRequest(ossToken.getBucket(), str, file.getAbsolutePath()), file, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0267  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.upload.UploadWork.doWork(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/upload/UploadWork.smali:731
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (r15 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11061e(int r11, java.io.File r12, java.lang.String r13, com.zykj.student.dialogue.upload.OssToken r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.upload.UploadWork.m11061e(int, java.io.File, java.lang.String, com.zykj.student.dialogue.upload.OssToken, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/upload/UploadWork.smali:1999
    }

    /* renamed from: f */
    public final Object m11062f(String str, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadWork$zipFile$2(str, null), continuation);
    }

    /* renamed from: g */
    public final Object m11063g(File file, String str, OssToken ossToken, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadWork$zyFsUpload$2(new C8924w.a().m14151n(ossToken.getEndpoint() + "/" + str).m14139a("Authorization", "bearer " + ossToken.getSecurityToken()).m14139a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m14148k(new C8922u.a(null, 1, null).m14042e(C8922u.f14829k).m14038a("file", file.getName(), AbstractC8925x.Companion.m14156a(file, C8921t.f14817e.m14035b("multipart/form-data"))).m14041d()).m14140b(), null), continuation);
    }
}
