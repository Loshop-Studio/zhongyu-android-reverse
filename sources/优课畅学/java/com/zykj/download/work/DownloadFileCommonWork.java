package com.zykj.download.work;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import ca.C5283d0;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.download.OssUtils;
import com.zykj.download.api.DownLoadApi;
import com.zykj.download.data.DownloadEntity;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p136i9.C8897a0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@Keep
/* loaded from: classes4.dex */
public class DownloadFileCommonWork extends DownloadFileWork {
    public static final C7280a Companion = new C7280a(null);
    private static DownLoadApi downLoadApi;
    private static final C8897a0 okHttpClient;
    private final String TAG;

    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$a */
    public static final class C7280a {
        public /* synthetic */ C7280a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Data m9199b(C7280a c7280a, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = "";
            }
            if ((i10 & 4) != 0) {
                str3 = "";
            }
            return c7280a.m9200a(str, str2, str3);
        }

        /* renamed from: a */
        public final Data m9200a(String fileUrl, String fileDir, String fileName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9133u.m16133g(fileUrl, "fileUrl");
            AbstractC9133u.m16133g(fileDir, "fileDir");
            AbstractC9133u.m16133g(fileName, "fileName");
            Pair[] pairArr = {AbstractC8726f.m14230a(OssUtils.FILE_URL, fileUrl), AbstractC8726f.m14230a(OssUtils.FILE_DIR, fileDir), AbstractC8726f.m14230a(OssUtils.FILE_NAME, fileName)};
            Data.Builder builder = new Data.Builder();
            for (int i10 = 0; i10 < 3; i10++) {
                Pair pair = pairArr[i10];
                builder.put((String) pair.m15906e(), pair.m15907g());
            }
            Data dataBuild = builder.build();
            AbstractC9133u.m16132f(dataBuild, "dataBuilder.build()");
            return new Data(dataBuild);
        }

        public C7280a() {
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileCommonWork", m17801f = "DownloadFileCommonWork.kt", m17802l = {66, 84, TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR, 129}, m17803m = "downloadFile$suspendImpl")
    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$downloadFile$1 */
    public static final class C72811 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9626a;

        /* renamed from: b */
        public Object f9627b;

        /* renamed from: c */
        public Object f9628c;

        /* renamed from: d */
        public Object f9629d;

        /* renamed from: e */
        public Object f9630e;

        /* renamed from: f */
        public Object f9631f;

        /* renamed from: g */
        public Object f9632g;

        /* renamed from: h */
        public Object f9633h;

        /* renamed from: i */
        public Object f9634i;

        /* renamed from: j */
        public Object f9635j;

        /* renamed from: k */
        public Object f9636k;

        /* renamed from: l */
        public Object f9637l;

        /* renamed from: m */
        public Object f9638m;

        /* renamed from: n */
        public long f9639n;

        /* renamed from: o */
        public /* synthetic */ Object f9640o;

        /* renamed from: q */
        public int f9642q;

        public C72811(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9640o = obj;
            this.f9642q |= Integer.MIN_VALUE;
            return DownloadFileCommonWork.downloadFile$suspendImpl(DownloadFileCommonWork.this, null, this);
        }
    }

    static {
        C8897a0.a aVar = new C8897a0.a();
        aVar.m15008R(2L, TimeUnit.MINUTES);
        C8897a0 c8897a0M15014c = aVar.m15014c();
        okHttpClient = c8897a0M15014c;
        Object objM2251b = new C5283d0.b().m2265f(c8897a0M15014c).m2262c("http://www.zykj.com/").m2263d().m2251b(DownLoadApi.class);
        AbstractC9133u.m16132f(objM2251b, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//这里不重要，在请求时，会被完整url替换掉\n            .build().create(DownLoadApi::class.java)");
        downLoadApi = (DownLoadApi) objM2251b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileCommonWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(workerParams, "workerParams");
        this.TAG = "DownloadFileCommonWork";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e5 A[Catch: all -> 0x0275, TryCatch #1 {all -> 0x0275, blocks: (B:61:0x0243, B:49:0x01c5, B:53:0x01db, B:55:0x01e5, B:57:0x01eb, B:64:0x027b), top: B:97:0x0243 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02aa A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:65:0x02a3, B:67:0x02aa, B:71:0x02d7, B:70:0x02cb, B:47:0x019d), top: B:101:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0237 -> B:97:0x0243). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork r24, com.zykj.download.data.DownloadEntity r25, p179m7.InterfaceC9324c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileCommonWork.downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.data.DownloadEntity, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileCommonWork.smali:191
    }

    public final void checkContentLength(long j10, File file) throws RemoteCodeException {
        AbstractC9133u.m16133g(file, "file");
        if (j10 == file.length()) {
            return;
        }
        file.delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception("totalLength = " + j10 + " ,file.length = " + file.length()));
    }

    public final void checkMD5(String md5, String fileMd5, String localPath) throws RemoteCodeException {
        AbstractC9133u.m16133g(md5, "md5");
        AbstractC9133u.m16133g(fileMd5, "fileMd5");
        AbstractC9133u.m16133g(localPath, "localPath");
        if (AbstractC9133u.m16128b(md5, fileMd5)) {
            return;
        }
        Log.e(this.TAG, " net md5 = " + md5 + " ,local md5 = " + fileMd5);
        new File(localPath).delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception(" net md5 = " + md5 + " ,local md5 = " + fileMd5));
    }

    @Override // com.zykj.download.work.DownloadFileWork
    public Object downloadFile(DownloadEntity downloadEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return downloadFile$suspendImpl(this, downloadEntity, interfaceC9324c);
    }

    @Override // com.zykj.download.work.DownloadFileWork
    public void initParameter() throws RemoteCodeException {
        String string = getInputData().getString(OssUtils.FILE_URL);
        if (string == null) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, new NullPointerException("DownloadOssFileWork ->downloadUrl is not set"));
        }
        setDownloadUrl(string);
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        AbstractC9133u.m16132f(applicationContext, "applicationContext");
        setDir(ossUtils.checkDownloadDir(applicationContext, getInputData().getString(OssUtils.FILE_DIR)));
        setFileName(ossUtils.checkFileName(getInputData().getString(OssUtils.FILE_NAME), getDownloadUrl()));
        getDownloadUrl();
        new File(getDir(), getFileName()).getAbsolutePath();
    }
}
