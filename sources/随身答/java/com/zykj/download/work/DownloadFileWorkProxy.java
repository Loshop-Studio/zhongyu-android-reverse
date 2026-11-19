package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.p071uc.crashsdk.export.ExitType;
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
import p283w5.C9827b;
import p283w5.InterfaceC9828c;

@Keep
@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m13413d2 = {"Lcom/zykj/download/work/DownloadFileWorkProxy;", "", "Landroid/content/Context;", "context", "Lcom/zykj/download/data/AppDatabase;", "appDataBase", "Lcom/zykj/download/work/DownloadFileWork;", "downloadFileWork", "<init>", "(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V", "Ljava/io/File;", "file", "", "verifyCode", "", "checkFileIntegrity", "(Ljava/io/File;Ljava/lang/String;)Z", "url", "currentLocalFile", "checkDownloadSuccess", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw5/b;", "checkRecord", "entity", "", "totalLength", "", "updateTotalSize", "(Lw5/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadSize", "updateDownloadSize", "updateVerifyCode", "(Lw5/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/download/DownloadFlag;", "downloadSuccess", "updateFlag", "(Lw5/b;Lcom/zykj/download/DownloadFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/download/data/AppDatabase;", "Lcom/zykj/download/work/DownloadFileWork;", "Companion", "a", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
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
        public final long m9809a() {
            return DownloadFileWorkProxy.DELAY_TIME;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$b */
    public /* synthetic */ class C7178b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9939a;

        static {
            int[] iArr = new int[DownloadFlag.values().length];
            iArr[DownloadFlag.DOWNLOAD_SUCCESS.ordinal()] = 1;
            iArr[DownloadFlag.DOWNLOADING.ordinal()] = 2;
            f9939a = iArr;
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWorkProxy", m13451f = "DownloadFileWorkProxy.kt", m13452i = {}, m13453l = {92, ExitType.UNEXP_FOREGROUND_CRASH}, m13454m = "checkRecord", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$checkRecord$1 */
    public static final class C71791 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9940a;

        /* renamed from: b */
        public /* synthetic */ Object f9941b;

        /* renamed from: d */
        public int f9943d;

        public C71791(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9941b = obj;
            this.f9943d |= Integer.MIN_VALUE;
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
        InterfaceC9828c interfaceC9828cMo9795i = this.appDataBase.mo9795i();
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "currentLocalFile.absolutePath");
        C9827b c9827bMo16754b = interfaceC9828cMo9795i.mo16754b(str, absolutePath);
        if (c9827bMo16754b == null) {
            return null;
        }
        File file2 = new File(c9827bMo16754b.m16746g());
        if (c9827bMo16754b.m16744e() == DownloadFlag.DOWNLOAD_SUCCESS && file2.exists() && checkFileIntegrity(file2, c9827bMo16754b.m16748i())) {
            return c9827bMo16754b.m16746g();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkRecord(java.lang.String r22, java.io.File r23, kotlin.coroutines.Continuation<? super p283w5.C9827b> r24) {
        /*
            New URL/path pairs start at zero. A missing partial file clears both size counters.
            A completed file is reused only after its Base64 MD5 matches. Recovery keeps the checksum and restarts at zero.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWorkProxy.checkRecord(java.lang.String, java.io.File, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWorkProxy.smali:357
    }

    public final Object updateDownloadSize(C9827b c9827b, long j9, Continuation<? super Unit> continuation) {
        c9827b.m16749j(j9);
        this.appDataBase.mo9795i().mo16753a(c9827b);
        return Unit.INSTANCE;
    }

    public final Object updateFlag(C9827b c9827b, DownloadFlag downloadFlag, Continuation<? super Unit> continuation) {
        c9827b.m16750k(downloadFlag);
        this.appDataBase.mo9795i().mo16753a(c9827b);
        return Unit.INSTANCE;
    }

    public final Object updateTotalSize(C9827b c9827b, long j9, Continuation<? super Unit> continuation) {
        c9827b.m16751l(j9);
        this.appDataBase.mo9795i().mo16753a(c9827b);
        return Unit.INSTANCE;
    }

    public final Object updateVerifyCode(C9827b c9827b, String str, Continuation<? super Unit> continuation) {
        c9827b.m16752m(str);
        this.appDataBase.mo9795i().mo16753a(c9827b);
        return Unit.INSTANCE;
    }
}
