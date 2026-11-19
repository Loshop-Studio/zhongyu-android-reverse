package com.zykj.download.work;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkerParameters;
import com.taobao.sophix.PatchStatus;
import com.zykj.download.OssUtils;
import com.zykj.download.api.DownLoadApi;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p038c9.C5299y;
import p172l8.C8923v;
import p283w5.C9827b;

@Keep
@Metadata(m13412d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m13413d2 = {"Lcom/zykj/download/work/DownloadFileCommonWork;", "Lcom/zykj/download/work/DownloadFileWork;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "initParameter", "()V", "Lw5/b;", "entity", "downloadFile", "(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "totalLength", "Ljava/io/File;", "file", "checkContentLength", "(JLjava/io/File;)V", "", "md5", "fileMd5", "localPath", "checkMD5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Companion", "a", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public class DownloadFileCommonWork extends DownloadFileWork {
    private static DownLoadApi downLoadApi;
    private static final C8923v okHttpClient;
    private final String TAG;

    @Metadata(m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileCommonWork", m13451f = "DownloadFileCommonWork.kt", m13452i = {0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2}, m13453l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, PatchStatus.CODE_LOAD_FIND_METHOD, 111, 129}, m13454m = "downloadFile$suspendImpl", m13455n = {"this", "entity", "startPoint", "responseBody", "totalLength", "bytes", "inputStream", "fileInputStream", "readIndex", "currentLength", "isComplete", "totalLength"}, m13456s = {"L$0", "L$1", "L$2", "L$4", "J$0", "L$3", "L$4", "L$7", "L$8", "L$9", "L$10", "J$0"})
    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$downloadFile$1 */
    public static final class C71711 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9891a;

        /* renamed from: b */
        public Object f9892b;

        /* renamed from: c */
        public Object f9893c;

        /* renamed from: d */
        public Object f9894d;

        /* renamed from: e */
        public Object f9895e;

        /* renamed from: f */
        public Object f9896f;

        /* renamed from: g */
        public Object f9897g;

        /* renamed from: h */
        public Object f9898h;

        /* renamed from: i */
        public Object f9899i;

        /* renamed from: j */
        public Object f9900j;

        /* renamed from: k */
        public Object f9901k;

        /* renamed from: l */
        public Object f9902l;

        /* renamed from: m */
        public Object f9903m;

        /* renamed from: n */
        public long f9904n;

        /* renamed from: o */
        public /* synthetic */ Object f9905o;

        /* renamed from: q */
        public int f9907q;

        public C71711(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9905o = obj;
            this.f9907q |= Integer.MIN_VALUE;
            return DownloadFileCommonWork.downloadFile$suspendImpl(DownloadFileCommonWork.this, null, this);
        }
    }

    static {
        C8923v.a aVar = new C8923v.a();
        aVar.m14097O(2L, TimeUnit.MINUTES);
        C8923v c8923vM14102c = aVar.m14102c();
        okHttpClient = c8923vM14102c;
        Object objM2527b = new C5299y.b().m2542g(c8923vM14102c).m2538c("http://www.zykj.com/").m2540e().m2527b(DownLoadApi.class);
        Intrinsics.checkNotNullExpressionValue(objM2527b, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//这里不重要，在请求时，会被完整url替换掉\n            .build().create(DownLoadApi::class.java)");
        downLoadApi = (DownLoadApi) objM2527b;
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
    public static /* synthetic */ java.lang.Object downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork r24, p283w5.C9827b r25, kotlin.coroutines.Continuation r26) throws com.zykj.http.exception.RemoteCodeException {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileCommonWork.downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork, w5.b, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/download/work/DownloadFileCommonWork.smali:238
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
    public Object downloadFile(C9827b c9827b, Continuation<? super Unit> continuation) {
        return downloadFile$suspendImpl(this, c9827b, continuation);
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
