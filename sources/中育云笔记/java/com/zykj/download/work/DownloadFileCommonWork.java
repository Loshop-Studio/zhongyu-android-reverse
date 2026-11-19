package com.zykj.download.work;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import com.taobao.sophix.PatchStatus;
import com.zykj.download.OssUtils;
import com.zykj.download.api.DownLoadApi;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import je.C9742v;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p122df.C9033d0;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p407xa.C11817b;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public class DownloadFileCommonWork extends DownloadFileWork {
    public static final C8560a Companion = new C8560a(null);
    private static DownLoadApi downLoadApi;
    private static final C9742v okHttpClient;
    private final String TAG;

    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$a */
    public static final class C8560a {
        public /* synthetic */ C8560a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Data m16513b(C8560a c8560a, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = "";
            }
            if ((i10 & 4) != 0) {
                str3 = "";
            }
            return c8560a.m16514a(str, str2, str3);
        }

        /* renamed from: a */
        public final Data m16514a(String fileUrl, String fileDir, String fileName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(fileUrl, "fileUrl");
            AbstractC9979u.m20294g(fileDir, "fileDir");
            AbstractC9979u.m20294g(fileName, "fileName");
            Pair[] pairArr = {AbstractC10776g.m22975a(OssUtils.FILE_URL, fileUrl), AbstractC10776g.m22975a(OssUtils.FILE_DIR, fileDir), AbstractC10776g.m22975a(OssUtils.FILE_NAME, fileName)};
            Data.Builder builder = new Data.Builder();
            for (int i10 = 0; i10 < 3; i10++) {
                Pair pair = pairArr[i10];
                builder.put((String) pair.m20051f(), pair.m20052g());
            }
            Data dataBuild = builder.build();
            AbstractC9979u.m20293f(dataBuild, "dataBuilder.build()");
            return new Data(dataBuild);
        }

        public C8560a() {
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.download.work.DownloadFileCommonWork", m26211f = "DownloadFileCommonWork.kt", m26212l = {66, PatchStatus.CODE_LOAD_FIND_METHOD, 111, 129}, m26213m = "downloadFile$suspendImpl")
    /* renamed from: com.zykj.download.work.DownloadFileCommonWork$downloadFile$1 */
    public static final class C85611 extends ContinuationImpl {

        /* renamed from: c */
        public Object f19611c;

        /* renamed from: d */
        public Object f19612d;

        /* renamed from: e */
        public Object f19613e;

        /* renamed from: f */
        public Object f19614f;

        /* renamed from: g */
        public Object f19615g;

        /* renamed from: h */
        public Object f19616h;

        /* renamed from: i */
        public Object f19617i;

        /* renamed from: j */
        public Object f19618j;

        /* renamed from: k */
        public Object f19619k;

        /* renamed from: l */
        public Object f19620l;

        /* renamed from: m */
        public Object f19621m;

        /* renamed from: n */
        public Object f19622n;

        /* renamed from: o */
        public Object f19623o;

        /* renamed from: p */
        public long f19624p;

        /* renamed from: q */
        public /* synthetic */ Object f19625q;

        /* renamed from: s */
        public int f19627s;

        public C85611(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19625q = obj;
            this.f19627s |= Integer.MIN_VALUE;
            return DownloadFileCommonWork.downloadFile$suspendImpl(DownloadFileCommonWork.this, null, this);
        }
    }

    static {
        C9742v.a aVar = new C9742v.a();
        aVar.m19551O(2L, TimeUnit.MINUTES);
        C9742v c9742vM19557c = aVar.m19557c();
        okHttpClient = c9742vM19557c;
        Object objM17712b = new C9033d0.b().m17726f(c9742vM19557c).m17722b("http://www.zykj.com/").m17724d().m17712b(DownLoadApi.class);
        AbstractC9979u.m20293f(objM17712b, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//这里不重要，在请求时，会被完整url替换掉\n            .build().create(DownLoadApi::class.java)");
        downLoadApi = (DownLoadApi) objM17712b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileCommonWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerParams, "workerParams");
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
    public static /* synthetic */ java.lang.Object downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork r24, p407xa.C11817b r25, vc.InterfaceC11588c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileCommonWork.downloadFile$suspendImpl(com.zykj.download.work.DownloadFileCommonWork, xa.b, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/download/work/DownloadFileCommonWork.smali:191
    }

    public final void checkContentLength(long j10, File file) throws RemoteCodeException {
        AbstractC9979u.m20294g(file, "file");
        if (j10 == file.length()) {
            return;
        }
        file.delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception("totalLength = " + j10 + " ,file.length = " + file.length()));
    }

    public final void checkMD5(String md5, String fileMd5, String localPath) throws RemoteCodeException {
        AbstractC9979u.m20294g(md5, "md5");
        AbstractC9979u.m20294g(fileMd5, "fileMd5");
        AbstractC9979u.m20294g(localPath, "localPath");
        if (AbstractC9979u.m20289b(md5, fileMd5)) {
            return;
        }
        Log.e(this.TAG, " net md5 = " + md5 + " ,local md5 = " + fileMd5);
        new File(localPath).delete();
        throw new RemoteCodeException(ErrorCode.FILE_BREAKDOWN, new Exception(" net md5 = " + md5 + " ,local md5 = " + fileMd5));
    }

    @Override // com.zykj.download.work.DownloadFileWork
    public Object downloadFile(C11817b c11817b, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return downloadFile$suspendImpl(this, c11817b, interfaceC11588c);
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
        AbstractC9979u.m20293f(applicationContext, "applicationContext");
        setDir(ossUtils.checkDownloadDir(applicationContext, getInputData().getString(OssUtils.FILE_DIR)));
        setFileName(ossUtils.checkFileName(getInputData().getString(OssUtils.FILE_NAME), getDownloadUrl()));
        getDownloadUrl();
        new File(getDir(), getFileName()).getAbsolutePath();
    }
}
