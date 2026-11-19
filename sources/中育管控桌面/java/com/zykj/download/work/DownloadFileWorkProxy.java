package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.zykj.download.DownloadFlag;
import com.zykj.download.data.AppDatabase;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p018b3.C4414b;
import p018b3.InterfaceC4415c;

@Keep
@Metadata(m7879d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m7880d2 = {"Lcom/zykj/download/work/DownloadFileWorkProxy;", "", "Landroid/content/Context;", "context", "Lcom/zykj/download/data/AppDatabase;", "appDataBase", "Lcom/zykj/download/work/DownloadFileWork;", "downloadFileWork", "<init>", "(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V", "Ljava/io/File;", "file", "", "verifyCode", "", "checkFileIntegrity", "(Ljava/io/File;Ljava/lang/String;)Z", "url", "currentLocalFile", "checkDownloadSuccess", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lb3/b;", "checkRecord", "entity", "", "totalLength", "", "updateTotalSize", "(Lb3/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadSize", "updateDownloadSize", "updateVerifyCode", "(Lb3/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/download/DownloadFlag;", "downloadSuccess", "updateFlag", "(Lb3/b;Lcom/zykj/download/DownloadFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/download/data/AppDatabase;", "Lcom/zykj/download/work/DownloadFileWork;", "Companion", "a", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class DownloadFileWorkProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static long DELAY_TIME = 1000;
    private final AppDatabase appDataBase;
    private final DownloadFileWork downloadFileWork;

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m5010a() {
            return DownloadFileWorkProxy.DELAY_TIME;
        }

        /* renamed from: b */
        public final void m5011b(long j6) {
            DownloadFileWorkProxy.DELAY_TIME = j6;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$b */
    public /* synthetic */ class C6007b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5699a;

        static {
            int[] iArr = new int[DownloadFlag.values().length];
            iArr[DownloadFlag.DOWNLOAD_SUCCESS.ordinal()] = 1;
            iArr[DownloadFlag.DOWNLOADING.ordinal()] = 2;
            f5699a = iArr;
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.DownloadFileWorkProxy", m7918f = "DownloadFileWorkProxy.kt", m7919i = {}, m7920l = {92, 97}, m7921m = "checkRecord", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$checkRecord$1 */
    public static final class C60081 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5700a;

        /* renamed from: b */
        public /* synthetic */ Object f5701b;

        /* renamed from: d */
        public int f5703d;

        public C60081(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5701b = obj;
            this.f5703d |= Integer.MIN_VALUE;
            return DownloadFileWorkProxy.this.checkRecord(null, null, this);
        }
    }

    public DownloadFileWorkProxy(Context context, AppDatabase appDataBase, DownloadFileWork downloadFileWork) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appDataBase, "appDataBase");
        this.appDataBase = appDataBase;
        this.downloadFileWork = downloadFileWork;
    }

    private final boolean checkFileIntegrity(File file, String verifyCode) {
        return Intrinsics.areEqual(BinaryUtil.calculateBase64Md5(file.getAbsolutePath()), verifyCode);
    }

    public final Object checkDownloadSuccess(String str, File file, Continuation<? super String> continuation) {
        InterfaceC4415c interfaceC4415cMo4994i = this.appDataBase.mo4994i();
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "currentLocalFile.absolutePath");
        C4414b c4414bMo1490c = interfaceC4415cMo4994i.mo1490c(str, absolutePath);
        if (c4414bMo1490c == null) {
            return null;
        }
        File file2 = new File(c4414bMo1490c.m1481g());
        if (c4414bMo1490c.m1479e() == DownloadFlag.DOWNLOAD_SUCCESS && file2.exists() && checkFileIntegrity(file2, c4414bMo1490c.m1483i())) {
            return c4414bMo1490c.m1481g();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkRecord(java.lang.String r22, java.io.File r23, kotlin.coroutines.Continuation<? super p018b3.C4414b> r24) {
        /*
            New URL/path pairs start at zero. A missing partial file clears both size counters.
            A completed file is reused only after its Base64 MD5 matches. Recovery keeps the checksum and restarts at zero.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWorkProxy.checkRecord(java.lang.String, java.io.File, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadFileWorkProxy.smali:357
    }

    public final Object updateDownloadSize(C4414b c4414b, long j6, Continuation<? super Unit> continuation) {
        c4414b.m1484j(j6);
        this.appDataBase.mo4994i().mo1489b(c4414b);
        return Unit.INSTANCE;
    }

    public final Object updateFlag(C4414b c4414b, DownloadFlag downloadFlag, Continuation<? super Unit> continuation) {
        c4414b.m1485k(downloadFlag);
        this.appDataBase.mo4994i().mo1489b(c4414b);
        return Unit.INSTANCE;
    }

    public final Object updateTotalSize(C4414b c4414b, long j6, Continuation<? super Unit> continuation) {
        c4414b.m1486l(j6);
        this.appDataBase.mo4994i().mo1489b(c4414b);
        return Unit.INSTANCE;
    }

    public final Object updateVerifyCode(C4414b c4414b, String str, Continuation<? super Unit> continuation) {
        c4414b.m1487m(str);
        this.appDataBase.mo4994i().mo1489b(c4414b);
        return Unit.INSTANCE;
    }
}
