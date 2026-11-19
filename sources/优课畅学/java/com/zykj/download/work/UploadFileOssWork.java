package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import ca.C5283d0;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.google.gson.Gson;
import com.tencent.smtt.sdk.TbsReaderView;
import com.zykj.download.OssToken;
import com.zykj.download.OssUtils;
import com.zykj.download.StrategyEnum;
import com.zykj.download.api.UploadApi;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.http.listener.UploadProgressListener;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p136i9.C8897a0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@Keep
/* loaded from: classes4.dex */
public class UploadFileOssWork extends UploadFileWork {
    public static final C7291a Companion = new C7291a(null);
    private static final C8897a0 fileOkHttpClient;
    private static final UploadApi uploadApi;
    private final Context appContext;
    private String filePath;
    private String objectName;
    private OssToken ossToken;

    /* renamed from: com.zykj.download.work.UploadFileOssWork$a */
    public static final class C7291a {
        public /* synthetic */ C7291a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final Data m9203a(String filePath, String objectName, OssToken ossToken) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9133u.m16133g(filePath, "filePath");
            AbstractC9133u.m16133g(objectName, "objectName");
            AbstractC9133u.m16133g(ossToken, "ossToken");
            Pair[] pairArr = {AbstractC8726f.m14230a(OssUtils.FILE_PATH, filePath), AbstractC8726f.m14230a(OssUtils.OSS_OBJECT_NAME, objectName), AbstractC8726f.m14230a(OssUtils.OSS_DATA, new Gson().toJson(ossToken))};
            Data.Builder builder = new Data.Builder();
            for (int i10 = 0; i10 < 3; i10++) {
                Pair pair = pairArr[i10];
                builder.put((String) pair.m15906e(), pair.m15907g());
            }
            Data dataBuild = builder.build();
            AbstractC9133u.m16132f(dataBuild, "dataBuilder.build()");
            return new Data(dataBuild);
        }

        public C7291a() {
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$b */
    public /* synthetic */ class C7292b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9679a;

        static {
            int[] iArr = new int[StrategyEnum.values().length];
            iArr[StrategyEnum.ALI_OSS.ordinal()] = 1;
            iArr[StrategyEnum.GRID_FS.ordinal()] = 2;
            iArr[StrategyEnum.ZY_FS.ordinal()] = 3;
            f9679a = iArr;
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$c */
    public static final class C7293c implements UploadProgressListener {
        public C7293c() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j10, long j11) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j10));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j10 * 100.0f) / j11)));
        }
    }

    /* renamed from: com.zykj.download.work.UploadFileOssWork$d */
    public static final class C7294d implements UploadProgressListener {
        public C7294d() {
        }

        @Override // com.zykj.http.listener.UploadProgressListener
        public void onProgressUpdate(long j10, long j11) {
            UploadFileOssWork.this.getReceiverLengthLiveData().postValue(Long.valueOf(j10));
            UploadFileOssWork.this.getProgressLiveData().postValue(Integer.valueOf((int) ((j10 * 100.0f) / j11)));
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.UploadFileOssWork", m17801f = "UploadFileOssWork.kt", m17802l = {127, 149}, m17803m = "uploadFile$suspendImpl")
    /* renamed from: com.zykj.download.work.UploadFileOssWork$uploadFile$1 */
    public static final class C72951 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9682a;

        /* renamed from: b */
        public /* synthetic */ Object f9683b;

        /* renamed from: d */
        public int f9685d;

        public C72951(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9683b = obj;
            this.f9685d |= Integer.MIN_VALUE;
            return UploadFileOssWork.uploadFile$suspendImpl(UploadFileOssWork.this, this);
        }
    }

    static {
        new C8897a0.a();
        C8897a0.a aVar = new C8897a0.a();
        aVar.m15011U(2L, TimeUnit.MINUTES);
        C8897a0 c8897a0M15014c = aVar.m15014c();
        fileOkHttpClient = c8897a0M15014c;
        Object objM2251b = new C5283d0.b().m2262c("https://hagateway.zykj.org/").m2265f(c8897a0M15014c).m2263d().m2251b(UploadApi.class);
        AbstractC9133u.m16132f(objM2251b, "Builder()\n            .baseUrl(\"https://hagateway.zykj.org/\")\n            .client(fileOkHttpClient)\n            .build().create(UploadApi::class.java)");
        uploadApi = (UploadApi) objM2251b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileOssWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(workerParams, "workerParams");
        this.appContext = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadFile$lambda-2, reason: not valid java name */
    public static final void m27479uploadFile$lambda2(UploadFileOssWork this$0, PutObjectRequest putObjectRequest, long j10, long j11) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.getReceiverLengthLiveData().postValue(Long.valueOf(j10));
        this$0.getProgressLiveData().postValue(Integer.valueOf((int) ((j10 * 100.0f) / j11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object uploadFile$suspendImpl(final com.zykj.download.work.UploadFileOssWork r12, p179m7.InterfaceC9324c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileOssWork.uploadFile$suspendImpl(com.zykj.download.work.UploadFileOssWork, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/UploadFileOssWork.smali:290
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
            AbstractC9133u.m16130d(string3);
            OssToken ossToken = (OssToken) new Gson().fromJson(string3, OssToken.class);
            AbstractC9133u.m16132f(ossToken, "{\n            inputData.getString(OSS_DATA)!!.let {\n                Gson().fromJson(it, OssToken::class.java)\n            }\n        }");
            this.ossToken = ossToken;
            String str = this.filePath;
            if (str == null) {
                AbstractC9133u.m16151y(TbsReaderView.KEY_FILE_PATH);
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
            AbstractC9133u.m16151y(TbsReaderView.KEY_FILE_PATH);
            throw null;
        } catch (Exception e10) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e10);
        }
    }

    @Override // com.zykj.download.work.UploadFileWork
    public Object uploadFile(InterfaceC9324c<? super String> interfaceC9324c) {
        return uploadFile$suspendImpl(this, interfaceC9324c);
    }
}
