package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.WorkerParameters;
import com.alibaba.fastjson.asm.Opcodes;
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
import je.C9742v;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p122df.C9033d0;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public class UploadFileOssWork extends UploadFileWork {
    public static final C8571a Companion = new C8571a(null);
    private static final C9742v fileOkHttpClient;
    private static final UploadApi uploadApi;
    private final Context appContext;
    private String filePath;
    private String objectName;
    private OssToken ossToken;

    /* renamed from: com.zykj.download.work.UploadFileOssWork$a */
    public static final class C8571a {
        public /* synthetic */ C8571a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8571a() {
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$b */
    public /* synthetic */ class C8572b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19664a;

        static {
            int[] iArr = new int[StrategyEnum.values().length];
            iArr[StrategyEnum.ALI_OSS.ordinal()] = 1;
            iArr[StrategyEnum.GRID_FS.ordinal()] = 2;
            iArr[StrategyEnum.ZY_FS.ordinal()] = 3;
            f19664a = iArr;
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$c */
    public static final class C8573c implements UploadProgressListener {
        public C8573c() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j10, long j11) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j10));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j10 * 100.0f) / j11)));
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$d */
    public static final class C8574d implements UploadProgressListener {
        public C8574d() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j10, long j11) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j10));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j10 * 100.0f) / j11)));
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.download.work.UploadFileOssWork", m26211f = "UploadFileOssWork.kt", m26212l = {127, Opcodes.FCMPL}, m26213m = "uploadFile$suspendImpl")
    /* renamed from: com.zykj.download.work.UploadFileOssWork$uploadFile$1 */
    public static final class C85751 extends ContinuationImpl {

        /* renamed from: c */
        public Object f19667c;

        /* renamed from: d */
        public /* synthetic */ Object f19668d;

        /* renamed from: f */
        public int f19670f;

        public C85751(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19668d = obj;
            this.f19670f |= Integer.MIN_VALUE;
            return UploadFileOssWork.uploadFile$suspendImpl(UploadFileOssWork.this, this);
        }
    }

    static {
        new C9742v.a();
        C9742v.a aVar = new C9742v.a();
        aVar.m19554R(2L, TimeUnit.MINUTES);
        C9742v c9742vM19557c = aVar.m19557c();
        fileOkHttpClient = c9742vM19557c;
        Object objM17712b = new C9033d0.b().m17722b("https://hagateway.zykj.org/").m17726f(c9742vM19557c).m17724d().m17712b(UploadApi.class);
        AbstractC9979u.m20293f(objM17712b, "Builder()\n            .baseUrl(\"https://hagateway.zykj.org/\")\n            .client(fileOkHttpClient)\n            .build().create(UploadApi::class.java)");
        uploadApi = (UploadApi) objM17712b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileOssWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerParams, "workerParams");
        this.appContext = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadFile$lambda-2, reason: not valid java name */
    public static final void m34018uploadFile$lambda2(UploadFileOssWork this$0, PutObjectRequest putObjectRequest, long j10, long j11) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.getReceiverLengthLiveData().postValue(Long.valueOf(j10));
        this$0.getProgressLiveData().postValue(Integer.valueOf((int) ((j10 * 100.0f) / j11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object uploadFile$suspendImpl(final com.zykj.download.work.UploadFileOssWork r12, vc.InterfaceC11588c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileOssWork.uploadFile$suspendImpl(com.zykj.download.work.UploadFileOssWork, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/download/work/UploadFileOssWork.smali:290
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
            AbstractC9979u.m20291d(string3);
            OssToken ossToken = (OssToken) new Gson().fromJson(string3, OssToken.class);
            AbstractC9979u.m20293f(ossToken, "{\n            inputData.getString(OSS_DATA)!!.let {\n                Gson().fromJson(it, OssToken::class.java)\n            }\n        }");
            this.ossToken = ossToken;
            String str = this.filePath;
            if (str == null) {
                AbstractC9979u.m20312y("filePath");
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
            AbstractC9979u.m20312y("filePath");
            throw null;
        } catch (Exception e10) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e10);
        }
    }

    @Override // com.zykj.download.work.UploadFileWork
    public Object uploadFile(InterfaceC11588c<? super String> interfaceC11588c) {
        return uploadFile$suspendImpl(this, interfaceC11588c);
    }
}
