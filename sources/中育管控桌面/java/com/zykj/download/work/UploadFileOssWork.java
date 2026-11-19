package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.google.gson.Gson;
import com.zykj.download.OssToken;
import com.zykj.download.OssUtils;
import com.zykj.download.StrategyEnum;
import com.zykj.download.api.UploadApi;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.http.listener.UploadProgressListener;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6356a0;
import p200z5.C7959d0;

@Keep
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m7880d2 = {"Lcom/zykj/download/work/UploadFileOssWork;", "Lcom/zykj/download/work/UploadFileWork;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "initParameter", "()V", "", "uploadFile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "objectName", "Ljava/lang/String;", "filePath", "Lcom/zykj/download/OssToken;", "ossToken", "Lcom/zykj/download/OssToken;", "Companion", "a", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public class UploadFileOssWork extends UploadFileWork {
    private static final C6356a0 fileOkHttpClient;
    private static final UploadApi uploadApi;
    private final Context appContext;
    private String filePath;
    private String objectName;
    private OssToken ossToken;

    /* renamed from: com.zykj.download.work.UploadFileOssWork$b */
    public /* synthetic */ class C6011b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5704a;

        static {
            int[] iArr = new int[StrategyEnum.values().length];
            iArr[StrategyEnum.ALI_OSS.ordinal()] = 1;
            iArr[StrategyEnum.GRID_FS.ordinal()] = 2;
            iArr[StrategyEnum.ZY_FS.ordinal()] = 3;
            f5704a = iArr;
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$c */
    public static final class C6012c implements UploadProgressListener {
        public C6012c() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j6, long j7) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j6));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j6 * 100.0f) / j7)));
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$d */
    public static final class C6013d implements UploadProgressListener {
        public C6013d() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j6, long j7) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j6));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j6 * 100.0f) / j7)));
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.UploadFileOssWork", m7918f = "UploadFileOssWork.kt", m7919i = {}, m7920l = {127, 149}, m7921m = "uploadFile$suspendImpl", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.download.work.UploadFileOssWork$uploadFile$1 */
    public static final class C60141 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5707a;

        /* renamed from: b */
        public /* synthetic */ Object f5708b;

        /* renamed from: d */
        public int f5710d;

        public C60141(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5708b = obj;
            this.f5710d |= Integer.MIN_VALUE;
            return UploadFileOssWork.uploadFile$suspendImpl(UploadFileOssWork.this, this);
        }
    }

    static {
        new C6356a0.a();
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6547U(2L, TimeUnit.MINUTES);
        C6356a0 c6356a0M6550c = aVar.m6550c();
        fileOkHttpClient = c6356a0M6550c;
        Object objM9793b = new C7959d0.b().m9804c("https://hagateway.zykj.org/").m9807f(c6356a0M6550c).m9805d().m9793b(UploadApi.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "Builder()\n            .baseUrl(\"https://hagateway.zykj.org/\")\n            .client(fileOkHttpClient)\n            .build().create(UploadApi::class.java)");
        uploadApi = (UploadApi) objM9793b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileOssWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.appContext = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadFile$lambda-2, reason: not valid java name */
    public static final void m17177uploadFile$lambda2(UploadFileOssWork this$0, PutObjectRequest putObjectRequest, long j6, long j7) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getReceiverLengthLiveData().postValue(Long.valueOf(j6));
        this$0.getProgressLiveData().postValue(Integer.valueOf((int) ((j6 * 100.0f) / j7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object uploadFile$suspendImpl(final com.zykj.download.work.UploadFileOssWork r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileOssWork.uploadFile$suspendImpl(com.zykj.download.work.UploadFileOssWork, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileOssWork.smali:329
    }

    @Override // com.zykj.download.work.UploadFileWork
    public void initParameter() throws RemoteCodeException {
        String string = getInputData().getString(OssUtils.OSS_OBJECT_NAME);
        if (string == null) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, new NullPointerException("UploadFileOssWork ->objectName is not set"));
        }
        this.objectName = string;
        String string2 = getInputData().getString(OssUtils.FILE_PATH);
        if (string2 == null) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, new NullPointerException("UploadFileOssWork ->filePath is not set"));
        }
        this.filePath = string2;
        try {
            String string3 = getInputData().getString(OssUtils.OSS_DATA);
            Intrinsics.checkNotNull(string3);
            OssToken ossToken = (OssToken) new Gson().fromJson(string3, OssToken.class);
            Intrinsics.checkNotNullExpressionValue(ossToken, "{\n            inputData.getString(OSS_DATA)!!.let {\n                Gson().fromJson(it, OssToken::class.java)\n            }\n        }");
            this.ossToken = ossToken;
            String str = this.filePath;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filePath");
                throw null;
            }
            if (new File(str).exists()) {
                return;
            }
            ErrorCode errorCode = ErrorCode.FILE_NO_FOUND;
            String str2 = this.filePath;
            if (str2 != null) {
                throw new RemoteCodeException(errorCode, new FileNotFoundException(str2));
            }
            Intrinsics.throwUninitializedPropertyAccessException("filePath");
            throw null;
        } catch (Exception e6) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e6);
        }
    }

    @Override // com.zykj.download.work.UploadFileWork
    public Object uploadFile(Continuation<? super String> continuation) {
        return uploadFile$suspendImpl(this, continuation);
    }
}
