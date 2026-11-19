package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.zykj.download.DownloadFlag;
import com.zykj.download.data.AppDatabase;
import java.io.File;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p162v1.C3419b;
import p162v1.InterfaceC3420c;

@Keep
/* loaded from: classes.dex */
public final class DownloadFileWorkProxy {

    @NotNull
    public static final C2384a Companion = new C2384a(null);
    private static long DELAY_TIME = 1000;

    @NotNull
    private final AppDatabase appDataBase;

    @Nullable
    private final DownloadFileWork downloadFileWork;

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$a */
    public static final class C2384a {
        private C2384a() {
        }

        public /* synthetic */ C2384a(C2764g c2764g) {
            this();
        }

        /* renamed from: a */
        public final long m7994a() {
            return DownloadFileWorkProxy.DELAY_TIME;
        }
    }

    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$b */
    public /* synthetic */ class C2385b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9753a;

        static {
            int[] iArr = new int[DownloadFlag.values().length];
            iArr[DownloadFlag.DOWNLOAD_SUCCESS.ordinal()] = 1;
            iArr[DownloadFlag.DOWNLOADING.ordinal()] = 2;
            f9753a = iArr;
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWorkProxy", m9207f = "DownloadFileWorkProxy.kt", m9208l = {92, 97}, m9209m = "checkRecord")
    /* renamed from: com.zykj.download.work.DownloadFileWorkProxy$c */
    static final class C2386c extends AbstractC2748d {

        /* renamed from: a */
        Object f9754a;

        /* renamed from: b */
        /* synthetic */ Object f9755b;

        /* renamed from: d */
        int f9757d;

        C2386c(InterfaceC3012d<? super C2386c> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9755b = obj;
            this.f9757d |= Integer.MIN_VALUE;
            return DownloadFileWorkProxy.this.checkRecord(null, null, this);
        }
    }

    public DownloadFileWorkProxy(@NotNull Context context, @NotNull AppDatabase appDataBase, @Nullable DownloadFileWork downloadFileWork) {
        C2769l.m9241e(context, "context");
        C2769l.m9241e(appDataBase, "appDataBase");
        this.appDataBase = appDataBase;
        this.downloadFileWork = downloadFileWork;
    }

    private final boolean checkFileIntegrity(File file, String str) {
        return C2769l.m9237a(BinaryUtil.calculateBase64Md5(file.getAbsolutePath()), str);
    }

    @Nullable
    public final Object checkDownloadSuccess(@NotNull String str, @NotNull File file, @NotNull InterfaceC3012d<? super String> interfaceC3012d) {
        InterfaceC3420c interfaceC3420cMo7975E = this.appDataBase.mo7975E();
        String absolutePath = file.getAbsolutePath();
        C2769l.m9240d(absolutePath, "currentLocalFile.absolutePath");
        C3419b c3419bMo10434c = interfaceC3420cMo7975E.mo10434c(str, absolutePath);
        if (c3419bMo10434c == null) {
            return null;
        }
        File file2 = new File(c3419bMo10434c.m10425g());
        if (c3419bMo10434c.m10423e() == DownloadFlag.DOWNLOAD_SUCCESS && file2.exists() && checkFileIntegrity(file2, c3419bMo10434c.m10427i())) {
            return c3419bMo10434c.m10425g();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkRecord(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.io.File r23, @org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<? super p162v1.C3419b> r24) throws java.lang.Throwable {
        /*
            New URL/path pairs start at zero. A missing partial file clears both size counters.
            A completed file is reused only after its Base64 MD5 matches. Recovery keeps the checksum and restarts at zero.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWorkProxy.checkRecord(java.lang.String, java.io.File, q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/DownloadFileWorkProxy.smali:235
    }

    @Nullable
    public final Object updateDownloadSize(@NotNull C3419b c3419b, long j4, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        c3419b.m10428j(j4);
        this.appDataBase.mo7975E().mo10432a(c3419b);
        return C2925r.f11415a;
    }

    @Nullable
    public final Object updateFlag(@NotNull C3419b c3419b, @NotNull DownloadFlag downloadFlag, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        c3419b.m10429k(downloadFlag);
        this.appDataBase.mo7975E().mo10432a(c3419b);
        return C2925r.f11415a;
    }

    @Nullable
    public final Object updateTotalSize(@NotNull C3419b c3419b, long j4, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        c3419b.m10430l(j4);
        this.appDataBase.mo7975E().mo10432a(c3419b);
        return C2925r.f11415a;
    }

    @Nullable
    public final Object updateVerifyCode(@NotNull C3419b c3419b, @Nullable String str, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        c3419b.m10431m(str);
        this.appDataBase.mo7975E().mo10432a(c3419b);
        return C2925r.f11415a;
    }
}
