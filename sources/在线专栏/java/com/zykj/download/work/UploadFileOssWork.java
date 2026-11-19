package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.C0810a;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.zykj.download.OssToken;
import com.zykj.download.OssUtils;
import com.zykj.download.api.UploadApi;
import com.zykj.http.BaseUrlEnum;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.http.listener.UploadProgressListener;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;
import retrofit2.Retrofit;

@Keep
/* loaded from: classes.dex */
public class UploadFileOssWork extends UploadFileWork {

    @NotNull
    public static final C2388a Companion = new C2388a(null);

    @NotNull
    private static final OkHttpClient fileOkHttpClient;

    @NotNull
    private static final UploadApi uploadApi;

    @NotNull
    private final Context appContext;
    private String filePath;
    private String objectName;
    private OssToken ossToken;

    /* renamed from: com.zykj.download.work.UploadFileOssWork$a */
    public static final class C2388a {
        private C2388a() {
        }

        public /* synthetic */ C2388a(C2764g c2764g) {
            this();
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.UploadFileOssWork", m9207f = "UploadFileOssWork.kt", m9208l = {121}, m9209m = "uploadFile$suspendImpl")
    /* renamed from: com.zykj.download.work.UploadFileOssWork$b */
    static final class C2389b extends AbstractC2748d {

        /* renamed from: a */
        Object f9758a;

        /* renamed from: b */
        /* synthetic */ Object f9759b;

        /* renamed from: d */
        int f9761d;

        C2389b(InterfaceC3012d<? super C2389b> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9759b = obj;
            this.f9761d |= Integer.MIN_VALUE;
            return UploadFileOssWork.uploadFile$suspendImpl(UploadFileOssWork.this, this);
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$c */
    public static final class C2390c implements UploadProgressListener {
        C2390c() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j4, long j5) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j4));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j4 * 100.0f) / j5)));
        }
    }

    static {
        new OkHttpClient.Builder();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.writeTimeout(2L, TimeUnit.MINUTES);
        OkHttpClient okHttpClientBuild = builder.build();
        fileOkHttpClient = okHttpClientBuild;
        Object objCreate = new Retrofit.Builder().client(okHttpClientBuild).baseUrl(BaseUrlEnum.DEFAULT.getUrl()).build().create(UploadApi.class);
        C2769l.m9240d(objCreate, "Builder()\n            .client(fileOkHttpClient)\n            .baseUrl(BaseUrlEnum.DEFAULT.url)\n            .build().create(UploadApi::class.java)");
        uploadApi = (UploadApi) objCreate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileOssWork(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        C2769l.m9241e(appContext, "appContext");
        C2769l.m9241e(workerParams, "workerParams");
        this.appContext = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadFile$lambda-1, reason: not valid java name */
    public static final void m10736uploadFile$lambda1(UploadFileOssWork this$0, PutObjectRequest putObjectRequest, long j4, long j5) {
        C2769l.m9241e(this$0, "this$0");
        this$0.getReceiverLengthLiveData().postValue(Long.valueOf(j4));
        this$0.getProgressLiveData().postValue(Integer.valueOf((int) ((j4 * 100.0f) / j5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object uploadFile$suspendImpl(final com.zykj.download.work.UploadFileOssWork r9, p142q2.InterfaceC3012d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileOssWork.uploadFile$suspendImpl(com.zykj.download.work.UploadFileOssWork, q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/UploadFileOssWork.smali:207
    }

    @Override // com.zykj.download.work.UploadFileWork
    public void initParameter() throws RemoteCodeException {
        String strM4152j = getInputData().m4152j(OssUtils.OSS_OBJECT_NAME);
        if (strM4152j == null) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, new NullPointerException("UploadFileOssWork ->objectName is not set"));
        }
        this.objectName = strM4152j;
        String strM4152j2 = getInputData().m4152j(OssUtils.FILE_PATH);
        if (strM4152j2 == null) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, new NullPointerException("UploadFileOssWork ->filePath is not set"));
        }
        this.filePath = strM4152j2;
        try {
            OssUtils ossUtils = OssUtils.INSTANCE;
            C0810a inputData = getInputData();
            C2769l.m9240d(inputData, "inputData");
            this.ossToken = ossUtils.getOssToken(inputData);
            String str = this.filePath;
            if (str == null) {
                C2769l.m9256t("filePath");
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
            C2769l.m9256t("filePath");
            throw null;
        } catch (NullPointerException e4) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e4);
        }
    }

    @Override // com.zykj.download.work.UploadFileWork
    @Nullable
    public Object uploadFile(@NotNull InterfaceC3012d<? super String> interfaceC3012d) {
        return uploadFile$suspendImpl(this, interfaceC3012d);
    }
}
