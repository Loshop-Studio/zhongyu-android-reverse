package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.tendcloud.tenddata.C7843ab;
import com.zykj.download.DownloadFlag;
import com.zykj.download.data.AppDatabase;
import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p407xa.C11817b;
import p407xa.InterfaceC11818c;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public final class DownloadFileWorkProxy {
    public static final C8567a Companion = new C8567a(null);
    private static long DELAY_TIME = 1000;
    private final AppDatabase appDataBase;
    private final DownloadFileWork downloadFileWork;

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$a */
    public static final class C8567a {
        public /* synthetic */ C8567a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final long m16515a() {
            return DownloadFileWorkProxy.DELAY_TIME;
        }

        public C8567a() {
        }
    }

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$b */
    public /* synthetic */ class C8568b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19659a;

        static {
            int[] iArr = new int[DownloadFlag.values().length];
            iArr[DownloadFlag.DOWNLOAD_SUCCESS.ordinal()] = 1;
            iArr[DownloadFlag.DOWNLOADING.ordinal()] = 2;
            f19659a = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.download.work.DownloadFileWorkProxy", m26211f = "DownloadFileWorkProxy.kt", m26212l = {C7843ab.b.API_MYNA_STOP, 97}, m26213m = "checkRecord")
    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$checkRecord$1 */
    public static final class C85691 extends ContinuationImpl {

        /* renamed from: c */
        public Object f19660c;

        /* renamed from: d */
        public /* synthetic */ Object f19661d;

        /* renamed from: f */
        public int f19663f;

        public C85691(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19661d = obj;
            this.f19663f |= Integer.MIN_VALUE;
            return DownloadFileWorkProxy.this.checkRecord(null, null, this);
        }
    }

    public DownloadFileWorkProxy(Context context, AppDatabase appDataBase, DownloadFileWork downloadFileWork) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(appDataBase, "appDataBase");
        this.appDataBase = appDataBase;
        this.downloadFileWork = downloadFileWork;
    }

    private final boolean checkFileIntegrity(File file, String str) {
        return AbstractC9979u.m20289b(BinaryUtil.calculateBase64Md5(file.getAbsolutePath()), str);
    }

    public final Object checkDownloadSuccess(String str, File file, InterfaceC11588c<? super String> interfaceC11588c) {
        InterfaceC11818c interfaceC11818cMo16499i = this.appDataBase.mo16499i();
        String absolutePath = file.getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "currentLocalFile.absolutePath");
        C11817b c11817bMo26197b = interfaceC11818cMo16499i.mo26197b(str, absolutePath);
        if (c11817bMo26197b == null) {
            return null;
        }
        File file2 = new File(c11817bMo26197b.m26189g());
        if (c11817bMo26197b.m26187e() == DownloadFlag.DOWNLOAD_SUCCESS && file2.exists() && checkFileIntegrity(file2, c11817bMo26197b.m26191i())) {
            return c11817bMo26197b.m26189g();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkRecord(java.lang.String r22, java.io.File r23, vc.InterfaceC11588c<? super p407xa.C11817b> r24) throws java.lang.Throwable {
        /*
            New URL/path pairs start at zero. A missing partial file clears both size counters.
            A completed file is reused only after its Base64 MD5 matches. Recovery keeps the checksum and restarts at zero.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWorkProxy.checkRecord(java.lang.String, java.io.File, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/download/work/DownloadFileWorkProxy.smali:300
    }

    public final Object updateDownloadSize(C11817b c11817b, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        c11817b.m26192j(j10);
        this.appDataBase.mo16499i().mo26198c(c11817b);
        return C10786q.f26013a;
    }

    public final Object updateFlag(C11817b c11817b, DownloadFlag downloadFlag, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        c11817b.m26193k(downloadFlag);
        this.appDataBase.mo16499i().mo26198c(c11817b);
        return C10786q.f26013a;
    }

    public final Object updateTotalSize(C11817b c11817b, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        c11817b.m26194l(j10);
        this.appDataBase.mo16499i().mo26198c(c11817b);
        return C10786q.f26013a;
    }

    public final Object updateVerifyCode(C11817b c11817b, String str, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        c11817b.m26195m(str);
        this.appDataBase.mo16499i().mo26198c(c11817b);
        return C10786q.f26013a;
    }
}
