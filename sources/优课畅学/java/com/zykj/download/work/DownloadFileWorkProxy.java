package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.zykj.download.DownloadFlag;
import com.zykj.download.data.AppDatabase;
import com.zykj.download.data.DownloadEntity;
import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p096f3.InterfaceC8432b;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@Keep
/* loaded from: classes4.dex */
public final class DownloadFileWorkProxy {
    public static final C7287a Companion = new C7287a(null);
    private static long DELAY_TIME = 1000;
    private final AppDatabase appDataBase;
    private final DownloadFileWork downloadFileWork;

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$a */
    public static final class C7287a {
        public /* synthetic */ C7287a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final long m9201a() {
            return DownloadFileWorkProxy.DELAY_TIME;
        }

        public C7287a() {
        }
    }

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$b */
    public /* synthetic */ class C7288b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9674a;

        static {
            int[] iArr = new int[DownloadFlag.values().length];
            iArr[DownloadFlag.DOWNLOAD_SUCCESS.ordinal()] = 1;
            iArr[DownloadFlag.DOWNLOADING.ordinal()] = 2;
            f9674a = iArr;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWorkProxy", m17801f = "DownloadFileWorkProxy.kt", m17802l = {92, 97}, m17803m = "checkRecord")
    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$checkRecord$1 */
    public static final class C72891 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9675a;

        /* renamed from: b */
        public /* synthetic */ Object f9676b;

        /* renamed from: d */
        public int f9678d;

        public C72891(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9676b = obj;
            this.f9678d |= Integer.MIN_VALUE;
            return DownloadFileWorkProxy.this.checkRecord(null, null, this);
        }
    }

    public DownloadFileWorkProxy(Context context, AppDatabase appDataBase, DownloadFileWork downloadFileWork) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(appDataBase, "appDataBase");
        this.appDataBase = appDataBase;
        this.downloadFileWork = downloadFileWork;
    }

    private final boolean checkFileIntegrity(File file, String str) {
        return AbstractC9133u.m16128b(BinaryUtil.calculateBase64Md5(file.getAbsolutePath()), str);
    }

    public final Object checkDownloadSuccess(String str, File file, InterfaceC9324c<? super String> interfaceC9324c) {
        InterfaceC8432b interfaceC8432bMo9172i = this.appDataBase.mo9172i();
        String absolutePath = file.getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "currentLocalFile.absolutePath");
        DownloadEntity downloadEntityMo13771b = interfaceC8432bMo9172i.mo13771b(str, absolutePath);
        if (downloadEntityMo13771b == null) {
            return null;
        }
        File file2 = new File(downloadEntityMo13771b.m9192g());
        if (downloadEntityMo13771b.m9190e() == DownloadFlag.DOWNLOAD_SUCCESS && file2.exists() && checkFileIntegrity(file2, downloadEntityMo13771b.m9194i())) {
            return downloadEntityMo13771b.m9192g();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkRecord(java.lang.String r22, java.io.File r23, p179m7.InterfaceC9324c<? super com.zykj.download.data.DownloadEntity> r24) throws java.lang.Throwable {
        /*
            New URL/path pairs start at zero. A missing partial file clears both size counters.
            A completed file is reused only after its Base64 MD5 matches. Recovery keeps the checksum and restarts at zero.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWorkProxy.checkRecord(java.lang.String, java.io.File, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWorkProxy.smali:300
    }

    public final Object updateDownloadSize(DownloadEntity downloadEntity, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        downloadEntity.m9195j(j10);
        this.appDataBase.mo9172i().mo13770a(downloadEntity);
        return C8736p.f16368a;
    }

    public final Object updateFlag(DownloadEntity downloadEntity, DownloadFlag downloadFlag, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        downloadEntity.m9196k(downloadFlag);
        this.appDataBase.mo9172i().mo13770a(downloadEntity);
        return C8736p.f16368a;
    }

    public final Object updateTotalSize(DownloadEntity downloadEntity, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        downloadEntity.m9197l(j10);
        this.appDataBase.mo9172i().mo13770a(downloadEntity);
        return C8736p.f16368a;
    }

    public final Object updateVerifyCode(DownloadEntity downloadEntity, String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        downloadEntity.m9198m(str);
        this.appDataBase.mo9172i().mo13770a(downloadEntity);
        return C8736p.f16368a;
    }
}
