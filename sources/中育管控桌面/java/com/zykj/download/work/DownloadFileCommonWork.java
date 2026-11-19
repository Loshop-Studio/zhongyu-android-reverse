package com.zykj.download.work;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import com.zykj.download.OssUtils;
import com.zykj.download.api.DownLoadApi;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p018b3.C4414b;
import p058f5.C6356a0;
import p200z5.C7959d0;

@Keep
@Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m7880d2 = {"Lcom/zykj/download/work/DownloadFileCommonWork;", "Lcom/zykj/download/work/DownloadFileWork;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "initParameter", "()V", "Lb3/b;", "entity", "downloadFile", "(Lb3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "totalLength", "Ljava/io/File;", "file", "checkContentLength", "(JLjava/io/File;)V", "", "md5", "fileMd5", "localPath", "checkMD5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Companion", "a", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public class DownloadFileCommonWork extends DownloadFileWork {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static DownLoadApi downLoadApi;
    private static final C6356a0 okHttpClient;
    private final String TAG;

    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Data m5008b(Companion companion, String str, String str2, String str3, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                str2 = "";
            }
            if ((i6 & 4) != 0) {
                str3 = "";
            }
            return companion.m5009a(str, str2, str3);
        }

        /* renamed from: a */
        public final Data m5009a(String fileUrl, String fileDir, String fileName) {
            Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
            Intrinsics.checkNotNullParameter(fileDir, "fileDir");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Pair[] pairArr = {TuplesKt.m7887to(OssUtils.FILE_URL, fileUrl), TuplesKt.m7887to(OssUtils.FILE_DIR, fileDir), TuplesKt.m7887to(OssUtils.FILE_NAME, fileName)};
            Data.Builder builder = new Data.Builder();
            for (int i6 = 0; i6 < 3; i6++) {
                Pair pair = pairArr[i6];
                builder.put((String) pair.getFirst(), pair.getSecond());
            }
            Data dataBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
            return new Data(dataBuild);
        }

        public Companion() {
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.DownloadFileCommonWork", m7918f = "DownloadFileCommonWork.kt", m7919i = {0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2}, m7920l = {66, 84, 111, 129}, m7921m = "downloadFile$suspendImpl", m7922n = {"this", "entity", "startPoint", "responseBody", "totalLength", "bytes", "inputStream", "fileInputStream", "readIndex", "currentLength", "isComplete", "totalLength"}, m7923s = {"L$0", "L$1", "L$2", "L$4", "J$0", "L$3", "L$4", "L$7", "L$8", "L$9", "L$10", "J$0"})
    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$downloadFile$1 */
    public static final class C60001 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5651a;

        /* renamed from: b */
        public Object f5652b;

        /* renamed from: c */
        public Object f5653c;

        /* renamed from: d */
        public Object f5654d;

        /* renamed from: e */
        public Object f5655e;

        /* renamed from: f */
        public Object f5656f;

        /* renamed from: g */
        public Object f5657g;

        /* renamed from: h */
        public Object f5658h;

        /* renamed from: i */
        public Object f5659i;

        /* renamed from: j */
        public Object f5660j;

        /* renamed from: k */
        public Object f5661k;

        /* renamed from: l */
        public Object f5662l;

        /* renamed from: m */
        public Object f5663m;

        /* renamed from: n */
        public long f5664n;

        /* renamed from: o */
        public /* synthetic */ Object f5665o;

        /* renamed from: q */
        public int f5667q;

        public C60001(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5665o = obj;
            this.f5667q |= Integer.MIN_VALUE;
            return DownloadFileCommonWork.downloadFile$suspendImpl(DownloadFileCommonWork.this, null, this);
        }
    }

    static {
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6544R(2L, TimeUnit.MINUTES);
        C6356a0 c6356a0M6550c = aVar.m6550c();
        okHttpClient = c6356a0M6550c;
        Object objM9793b = new C7959d0.b().m9807f(c6356a0M6550c).m9804c("http://www.zykj.com/").m9805d().m9793b(DownLoadApi.class);
        Intrinsics.checkNotNullExpressionValue(objM9793b, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//这里不重要，在请求时，会被完整url替换掉\n            .build().create(DownLoadApi::class.java)");
        downLoadApi = (DownLoadApi) objM9793b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileCommonWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
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
    public static /* synthetic */ java.lang.Object downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork r24, p018b3.C4414b r25, kotlin.coroutines.Continuation r26) throws com.zykj.http.exception.RemoteCodeException {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileCommonWork.downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork, b3.b, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadFileCommonWork.smali:238
    }

    public final void checkContentLength(long totalLength, File file) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (totalLength == file.length()) {
            return;
        }
        file.delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception("totalLength = " + totalLength + " ,file.length = " + file.length()));
    }

    public final void checkMD5(String md5, String fileMd5, String localPath) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        if (Intrinsics.areEqual(md5, fileMd5)) {
            return;
        }
        Log.e(this.TAG, " net md5 = " + md5 + " ,local md5 = " + fileMd5);
        new File(localPath).delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception(" net md5 = " + md5 + " ,local md5 = " + fileMd5));
    }

    @Override // com.zykj.download.work.DownloadFileWork
    public Object downloadFile(C4414b c4414b, Continuation<? super Unit> continuation) {
        return downloadFile$suspendImpl(this, c4414b, continuation);
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
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        setDir(ossUtils.checkDownloadDir(applicationContext, getInputData().getString(OssUtils.FILE_DIR)));
        setFileName(ossUtils.checkFileName(getInputData().getString(OssUtils.FILE_NAME), getDownloadUrl()));
        getDownloadUrl();
        new File(getDir(), getFileName()).getAbsolutePath();
    }
}
