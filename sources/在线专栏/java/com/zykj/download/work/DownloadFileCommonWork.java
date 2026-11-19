package com.zykj.download.work;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.work.C0810a;
import androidx.work.WorkerParameters;
import com.zykj.download.OssUtils;
import com.zykj.download.api.DownLoadApi;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2918k;
import p128o2.C2922o;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p162v1.C3419b;
import retrofit2.Retrofit;

@Keep
/* loaded from: classes.dex */
public class DownloadFileCommonWork extends DownloadFileWork {

    @NotNull
    public static final C2377a Companion = new C2377a(null);

    @NotNull
    private static DownLoadApi downLoadApi;

    @NotNull
    private static final OkHttpClient okHttpClient;

    @NotNull
    private final String TAG;

    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$a */
    public static final class C2377a {
        private C2377a() {
        }

        public /* synthetic */ C2377a(C2764g c2764g) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C0810a m7989a(@NotNull String fileUrl, @NotNull String fileDir, @NotNull String fileName) throws Throwable {
            C2769l.m9241e(fileUrl, "fileUrl");
            C2769l.m9241e(fileDir, "fileDir");
            C2769l.m9241e(fileName, "fileName");
            C2918k[] c2918kArr = {C2922o.m9996a(OssUtils.FILE_URL, fileUrl), C2922o.m9996a(OssUtils.FILE_DIR, fileDir), C2922o.m9996a(OssUtils.FILE_NAME, fileName)};
            C0810a.a aVar = new C0810a.a();
            for (int i4 = 0; i4 < 3; i4++) {
                C2918k c2918k = c2918kArr[i4];
                aVar.m4156b((String) c2918k.m9987c(), c2918k.m9988d());
            }
            C0810a c0810aM4155a = aVar.m4155a();
            C2769l.m9240d(c0810aM4155a, "dataBuilder.build()");
            return new C0810a(c0810aM4155a);
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileCommonWork", m9207f = "DownloadFileCommonWork.kt", m9208l = {66, 84, 111, 129}, m9209m = "downloadFile$suspendImpl")
    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$b */
    static final class C2378b extends AbstractC2748d {

        /* renamed from: a */
        Object f9705a;

        /* renamed from: b */
        Object f9706b;

        /* renamed from: c */
        Object f9707c;

        /* renamed from: d */
        Object f9708d;

        /* renamed from: e */
        Object f9709e;

        /* renamed from: f */
        Object f9710f;

        /* renamed from: g */
        Object f9711g;

        /* renamed from: h */
        Object f9712h;

        /* renamed from: i */
        Object f9713i;

        /* renamed from: j */
        Object f9714j;

        /* renamed from: k */
        Object f9715k;

        /* renamed from: l */
        Object f9716l;

        /* renamed from: m */
        Object f9717m;

        /* renamed from: n */
        long f9718n;

        /* renamed from: o */
        /* synthetic */ Object f9719o;

        /* renamed from: q */
        int f9721q;

        C2378b(InterfaceC3012d<? super C2378b> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9719o = obj;
            this.f9721q |= Integer.MIN_VALUE;
            return DownloadFileCommonWork.downloadFile$suspendImpl(DownloadFileCommonWork.this, null, this);
        }
    }

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(2L, TimeUnit.MINUTES);
        OkHttpClient okHttpClientBuild = builder.build();
        okHttpClient = okHttpClientBuild;
        Object objCreate = new Retrofit.Builder().client(okHttpClientBuild).baseUrl("http://www.zykj.com/").build().create(DownLoadApi.class);
        C2769l.m9240d(objCreate, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//这里不重要，在请求时，会被完整url替换掉\n            .build().create(DownLoadApi::class.java)");
        downLoadApi = (DownLoadApi) objCreate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileCommonWork(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        C2769l.m9241e(appContext, "appContext");
        C2769l.m9241e(workerParams, "workerParams");
        this.TAG = "DownloadFileCommonWork";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d2 A[Catch: all -> 0x0354, TryCatch #1 {all -> 0x0354, blocks: (B:75:0x02cb, B:77:0x02d2, B:81:0x02ff, B:80:0x02f3), top: B:113:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0331  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0249 -> B:129:0x0259). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork r23, p162v1.C3419b r24, p142q2.InterfaceC3012d r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileCommonWork.downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork, v1.b, q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/DownloadFileCommonWork.smali:142
    }

    public final void checkContentLength(long j4, @NotNull File file) throws RemoteCodeException {
        C2769l.m9241e(file, "file");
        if (j4 == file.length()) {
            return;
        }
        file.delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception("totalLength = " + j4 + " ,file.length = " + file.length()));
    }

    public final void checkMD5(@NotNull String md5, @NotNull String fileMd5, @NotNull String localPath) throws RemoteCodeException {
        C2769l.m9241e(md5, "md5");
        C2769l.m9241e(fileMd5, "fileMd5");
        C2769l.m9241e(localPath, "localPath");
        if (C2769l.m9237a(md5, fileMd5)) {
            return;
        }
        Log.e(this.TAG, " net md5 = " + md5 + " ,local md5 = " + fileMd5);
        new File(localPath).delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception(" net md5 = " + md5 + " ,local md5 = " + fileMd5));
    }

    @Override // com.zykj.download.work.DownloadFileWork
    @Nullable
    public Object downloadFile(@NotNull C3419b c3419b, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        return downloadFile$suspendImpl(this, c3419b, interfaceC3012d);
    }

    @Override // com.zykj.download.work.DownloadFileWork
    public void initParameter() throws RemoteCodeException {
        String strM4152j = getInputData().m4152j(OssUtils.FILE_URL);
        if (strM4152j == null) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, new NullPointerException("DownloadOssFileWork ->downloadUrl is not set"));
        }
        setDownloadUrl(strM4152j);
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        C2769l.m9240d(applicationContext, "applicationContext");
        setDir(ossUtils.checkDownloadDir(applicationContext, getInputData().m4152j(OssUtils.FILE_DIR)));
        setFileName(ossUtils.checkFileName(getInputData().m4152j(OssUtils.FILE_NAME), getDownloadUrl()));
        Log.d(this.TAG, "will download " + getDownloadUrl() + " to " + ((Object) new File(getDir(), getFileName()).getAbsolutePath()));
    }
}
