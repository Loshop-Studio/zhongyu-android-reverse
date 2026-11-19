package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.MutableLiveData;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.download.data.AppDatabase;
import com.zykj.download.data.DownloadEntity;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@Keep
/* loaded from: classes4.dex */
public abstract class DownloadFileWork extends CoroutineWorker {
    public static final C7282a Companion = new C7282a(null);
    public static final long DELAY_TIME = 1000;
    private final Context appContext;
    private final AppDatabase appDataBase;
    public String dir;
    public String downloadUrl;
    public String fileName;
    private final MutableLiveData<Integer> progressLiveData;
    public DownloadFileWorkProxy proxy;
    private final MutableLiveData<Long> receiverLengthLiveData;

    /* renamed from: com.zykj.download.work.DownloadFileWork$a */
    public static final class C7282a {
        public /* synthetic */ C7282a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7282a() {
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWork", m17801f = "DownloadFileWork.kt", m17802l = {73, IjkMediaMeta.FF_PROFILE_H264_MAIN, 79, 93, 95}, m17803m = "downloadFileWithProgress")
    /* renamed from: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$1 */
    public static final class C72831 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9643a;

        /* renamed from: b */
        public Object f9644b;

        /* renamed from: c */
        public /* synthetic */ Object f9645c;

        /* renamed from: e */
        public int f9647e;

        public C72831(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9645c = obj;
            this.f9647e |= Integer.MIN_VALUE;
            return DownloadFileWork.this.downloadFileWithProgress(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWork", m17801f = "DownloadFileWork.kt", m17802l = {199}, m17803m = "notifyProgress")
    /* renamed from: com.zykj.download.work.DownloadFileWork$notifyProgress$1 */
    public static final class C72851 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9663a;

        /* renamed from: b */
        public long f9664b;

        /* renamed from: c */
        public /* synthetic */ Object f9665c;

        /* renamed from: e */
        public int f9667e;

        public C72851(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9665c = obj;
            this.f9667e |= Integer.MIN_VALUE;
            return DownloadFileWork.this.notifyProgress(0L, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWork", m17801f = "DownloadFileWork.kt", m17802l = {190, 192}, m17803m = "sendSpeedAndProgress")
    /* renamed from: com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1 */
    public static final class C72861 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9668a;

        /* renamed from: b */
        public Object f9669b;

        /* renamed from: c */
        public Object f9670c;

        /* renamed from: d */
        public /* synthetic */ Object f9671d;

        /* renamed from: f */
        public int f9673f;

        public C72861(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9671d = obj;
            this.f9673f |= Integer.MIN_VALUE;
            return DownloadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(workerParams, "workerParams");
        this.appContext = appContext;
        this.appDataBase = AppDatabase.f9614a.m9174b(appContext);
        this.receiverLengthLiveData = new MutableLiveData<>(0L);
        this.progressLiveData = new MutableLiveData<>(0);
    }

    private final void checkParam() throws RemoteCodeException {
        if (this.downloadUrl == null) {
            throw new RemoteCodeException(ErrorCode.NULL_POINT, new NullPointerException("DownloadFileWork fileUrl is null"));
        }
        if (this.dir == null) {
            throw new RemoteCodeException(ErrorCode.NULL_POINT, new NullPointerException("DownloadFileWork dir is null"));
        }
        if (this.fileName == null) {
            throw new RemoteCodeException(ErrorCode.NULL_POINT, new NullPointerException("DownloadFileWork fileName is null"));
        }
    }

    public static /* synthetic */ Object doWork$suspendImpl(DownloadFileWork downloadFileWork, InterfaceC9324c interfaceC9324c) {
        downloadFileWork.setProxy(new DownloadFileWorkProxy(downloadFileWork.appContext, downloadFileWork.getAppDataBase(), downloadFileWork));
        return downloadFileWork.downloadFileWithProgress(interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161 A[Catch: all -> 0x0042, RemoteCodeException -> 0x0045, ServiceException -> 0x0048, ClientException -> 0x004b, TryCatch #2 {ClientException -> 0x004b, ServiceException -> 0x0048, RemoteCodeException -> 0x0045, all -> 0x0042, blocks: (B:16:0x003d, B:68:0x015d, B:70:0x0161, B:72:0x019a, B:29:0x005e, B:64:0x0144, B:32:0x0067, B:54:0x00d6, B:35:0x006f, B:50:0x00c7, B:38:0x007c, B:45:0x00ad, B:47:0x00b1, B:56:0x0103, B:58:0x010d, B:60:0x012e, B:41:0x0083), top: B:82:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019a A[Catch: all -> 0x0042, RemoteCodeException -> 0x0045, ServiceException -> 0x0048, ClientException -> 0x004b, TRY_LEAVE, TryCatch #2 {ClientException -> 0x004b, ServiceException -> 0x0048, RemoteCodeException -> 0x0045, all -> 0x0042, blocks: (B:16:0x003d, B:68:0x015d, B:70:0x0161, B:72:0x019a, B:29:0x005e, B:64:0x0144, B:32:0x0067, B:54:0x00d6, B:35:0x006f, B:50:0x00c7, B:38:0x007c, B:45:0x00ad, B:47:0x00b1, B:56:0x0103, B:58:0x010d, B:60:0x012e, B:41:0x0083), top: B:82:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadFileWithProgress(p179m7.InterfaceC9324c<? super androidx.work.ListenableWorker.Result> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.downloadFileWithProgress(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWork.smali:348
    }

    public static /* synthetic */ Object notifyProgress$default(DownloadFileWork downloadFileWork, long j10, Integer num, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyProgress");
        }
        if ((i10 & 2) != 0) {
            num = 0;
        }
        return downloadFileWork.notifyProgress(j10, num, interfaceC9324c);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c) {
        return doWork$suspendImpl(this, interfaceC9324c);
    }

    public abstract Object downloadFile(DownloadEntity downloadEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    public final AppDatabase getAppDataBase() {
        return this.appDataBase;
    }

    public final String getDir() {
        String str = this.dir;
        if (str != null) {
            return str;
        }
        AbstractC9133u.m16151y("dir");
        throw null;
    }

    public final String getDownloadUrl() {
        String str = this.downloadUrl;
        if (str != null) {
            return str;
        }
        AbstractC9133u.m16151y("downloadUrl");
        throw null;
    }

    public final String getFileName() {
        String str = this.fileName;
        if (str != null) {
            return str;
        }
        AbstractC9133u.m16151y("fileName");
        throw null;
    }

    public final MutableLiveData<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    public final DownloadFileWorkProxy getProxy() {
        DownloadFileWorkProxy downloadFileWorkProxy = this.proxy;
        if (downloadFileWorkProxy != null) {
            return downloadFileWorkProxy;
        }
        AbstractC9133u.m16151y("proxy");
        throw null;
    }

    public final MutableLiveData<Long> getReceiverLengthLiveData() {
        return this.receiverLengthLiveData;
    }

    public abstract void initParameter();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object notifyProgress(long r7, java.lang.Integer r9, p179m7.InterfaceC9324c<? super p123h7.C8736p> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.zykj.download.work.DownloadFileWork.C72851
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.download.work.DownloadFileWork$notifyProgress$1 r0 = (com.zykj.download.work.DownloadFileWork.C72851) r0
            int r1 = r0.f9667e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9667e = r1
            goto L18
        L13:
            com.zykj.download.work.DownloadFileWork$notifyProgress$1 r0 = new com.zykj.download.work.DownloadFileWork$notifyProgress$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9665c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f9667e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.f9664b
            java.lang.Object r9 = r0.f9663a
            com.zykj.download.work.DownloadFileWork r9 = (com.zykj.download.work.DownloadFileWork) r9
            kotlin.AbstractC9079b.m15926b(r10)
            goto L87
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9079b.m15926b(r10)
            androidx.lifecycle.MutableLiveData r10 = r6.getProgressLiveData()
            r10.postValue(r9)
            java.lang.String r10 = "speed"
            java.lang.Long r2 = p201o7.AbstractC9536a.m17799d(r7)
            kotlin.Pair r10 = p123h7.AbstractC8726f.m14230a(r10, r2)
            java.lang.String r2 = "progress"
            kotlin.Pair r9 = p123h7.AbstractC8726f.m14230a(r2, r9)
            kotlin.Pair[] r9 = new kotlin.Pair[]{r10, r9}
            androidx.work.Data$Builder r10 = new androidx.work.Data$Builder
            r10.<init>()
            r2 = 0
        L5b:
            r4 = 2
            if (r2 >= r4) goto L70
            r4 = r9[r2]
            java.lang.Object r5 = r4.m15906e()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.m15907g()
            r10.put(r5, r4)
            int r2 = r2 + 1
            goto L5b
        L70:
            androidx.work.Data r9 = r10.build()
            java.lang.String r10 = "dataBuilder.build()"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r9, r10)
            r0.f9663a = r6
            r0.f9664b = r7
            r0.f9667e = r3
            java.lang.Object r9 = r6.setProgress(r9, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r9 = r6
        L87:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "speed="
            r10.append(r0)
            r10.append(r7)
            java.lang.String r7 = ", progress="
            r10.append(r7)
            androidx.lifecycle.MutableLiveData r7 = r9.getProgressLiveData()
            java.lang.Object r7 = r7.getValue()
            r10.append(r7)
            r7 = 32
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.io.PrintStream r8 = java.lang.System.out
            r8.println(r7)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.notifyProgress(long, java.lang.Integer, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWork.smali:2086
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[PHI: r5 r11 r12
      0x005b: PHI (r5v3 com.zykj.download.work.DownloadFileWork) = 
      (r5v0 com.zykj.download.work.DownloadFileWork)
      (r5v1 com.zykj.download.work.DownloadFileWork)
      (r5v7 com.zykj.download.work.DownloadFileWork)
     binds: [B:16:0x0052, B:32:0x00bb, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r11v4 i8.b0) = (r11v0 i8.b0), (r11v1 i8.b0), (r11v12 i8.b0) binds: [B:16:0x0052, B:32:0x00bb, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r12v5 kotlin.jvm.internal.Ref$LongRef) = 
      (r12v2 kotlin.jvm.internal.Ref$LongRef)
      (r12v3 kotlin.jvm.internal.Ref$LongRef)
      (r12v7 kotlin.jvm.internal.Ref$LongRef)
     binds: [B:16:0x0052, B:32:0x00bb, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bb -> B:17:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSpeedAndProgress(p135i8.InterfaceC8822b0 r11, p179m7.InterfaceC9324c<? super p123h7.C8736p> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.zykj.download.work.DownloadFileWork.C72861
            if (r0 == 0) goto L13
            r0 = r12
            com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1 r0 = (com.zykj.download.work.DownloadFileWork.C72861) r0
            int r1 = r0.f9673f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9673f = r1
            goto L18
        L13:
            com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1 r0 = new com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9671d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f9673f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r11 = r0.f9670c
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            java.lang.Object r2 = r0.f9669b
            i8.b0 r2 = (p135i8.InterfaceC8822b0) r2
            java.lang.Object r5 = r0.f9668a
            com.zykj.download.work.DownloadFileWork r5 = (com.zykj.download.work.DownloadFileWork) r5
            kotlin.AbstractC9079b.m15926b(r12)
            r12 = r11
            r11 = r2
            goto L5b
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            java.lang.Object r11 = r0.f9670c
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            java.lang.Object r2 = r0.f9669b
            i8.b0 r2 = (p135i8.InterfaceC8822b0) r2
            java.lang.Object r5 = r0.f9668a
            com.zykj.download.work.DownloadFileWork r5 = (com.zykj.download.work.DownloadFileWork) r5
            kotlin.AbstractC9079b.m15926b(r12)
            goto La7
        L52:
            kotlin.AbstractC9079b.m15926b(r12)
            kotlin.jvm.internal.Ref$LongRef r12 = new kotlin.jvm.internal.Ref$LongRef
            r12.<init>()
            r5 = r10
        L5b:
            boolean r2 = kotlinx.coroutines.AbstractC9165e.m16558g(r11)
            if (r2 == 0) goto Lbe
            androidx.lifecycle.MutableLiveData r2 = r5.getReceiverLengthLiveData()
            java.lang.Object r2 = r2.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L6e
            goto La9
        L6e:
            long r6 = r12.f17472a
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L77
            goto L86
        L77:
            long r6 = r2.longValue()
            long r8 = r12.f17472a
            long r6 = r6 - r8
            com.zykj.download.work.DownloadFileWorkProxy$a r8 = com.zykj.download.work.DownloadFileWorkProxy.Companion
            long r8 = r8.m9201a()
            long r8 = r6 / r8
        L86:
            long r6 = r2.longValue()
            r12.f17472a = r6
            androidx.lifecycle.MutableLiveData r2 = r5.getProgressLiveData()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.f9668a = r5
            r0.f9669b = r11
            r0.f9670c = r12
            r0.f9673f = r4
            java.lang.Object r2 = r5.notifyProgress(r8, r2, r0)
            if (r2 != r1) goto La5
            goto Lbd
        La5:
            r2 = r11
            r11 = r12
        La7:
            r12 = r11
            r11 = r2
        La9:
            com.zykj.download.work.DownloadFileWorkProxy$a r2 = com.zykj.download.work.DownloadFileWorkProxy.Companion
            long r6 = r2.m9201a()
            r0.f9668a = r5
            r0.f9669b = r11
            r0.f9670c = r12
            r0.f9673f = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.m16227b(r6, r0)
            if (r2 != r1) goto L5b
        Lbd:
            return r1
        Lbe:
            h7.p r11 = p123h7.C8736p.f16368a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.sendSpeedAndProgress(i8.b0, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWork.smali:2468
    }

    public final void setDir(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.dir = str;
    }

    public final void setDownloadUrl(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setFileName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.fileName = str;
    }

    public final void setProxy(DownloadFileWorkProxy downloadFileWorkProxy) {
        AbstractC9133u.m16133g(downloadFileWorkProxy, "<set-?>");
        this.proxy = downloadFileWorkProxy;
    }
}
