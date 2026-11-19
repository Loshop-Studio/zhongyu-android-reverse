package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.taobao.sophix.PatchStatus;
import com.zykj.download.OssUtils;
import com.zykj.download.data.AppDatabase;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p283w5.C9827b;

@Keep
@Metadata(m13412d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 @2\u00020\u0001:\u0001AB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R%\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00180\u00180$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R%\u0010*\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u001a0\u001a0$8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u00106\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, m13413d2 = {"Lcom/zykj/download/work/DownloadFileWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "downloadFileWithProgress", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "checkParam", "()V", "doWork", "initParameter", "Lw5/b;", "entity", "downloadFile", "(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "sendSpeedAndProgress", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", OssUtils.SPEED, "", "progress", "notifyProgress", "(JLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/zykj/download/data/AppDatabase;", "appDataBase", "Lcom/zykj/download/data/AppDatabase;", "getAppDataBase", "()Lcom/zykj/download/data/AppDatabase;", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "receiverLengthLiveData", "Landroidx/lifecycle/MutableLiveData;", "getReceiverLengthLiveData", "()Landroidx/lifecycle/MutableLiveData;", "progressLiveData", "getProgressLiveData", "", "downloadUrl", "Ljava/lang/String;", "getDownloadUrl", "()Ljava/lang/String;", "setDownloadUrl", "(Ljava/lang/String;)V", "dir", "getDir", "setDir", "fileName", "getFileName", "setFileName", "Lcom/zykj/download/work/DownloadFileWorkProxy;", "proxy", "Lcom/zykj/download/work/DownloadFileWorkProxy;", "getProxy", "()Lcom/zykj/download/work/DownloadFileWorkProxy;", "setProxy", "(Lcom/zykj/download/work/DownloadFileWorkProxy;)V", "Companion", "a", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class DownloadFileWork extends CoroutineWorker {
    public static final long DELAY_TIME = 1000;
    private final Context appContext;
    private final AppDatabase appDataBase;
    public String dir;
    public String downloadUrl;
    public String fileName;
    private final MutableLiveData<Integer> progressLiveData;
    public DownloadFileWorkProxy proxy;
    private final MutableLiveData<Long> receiverLengthLiveData;

    @Metadata(m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWork", m13451f = "DownloadFileWork.kt", m13452i = {0, 0, 1, 2}, m13453l = {PatchStatus.CODE_LOAD_MFITEM, PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT, PatchStatus.CODE_LOAD_FIND_DEX, 93, 95}, m13454m = "downloadFileWithProgress", m13455n = {"this", "file", "localPathForSuccess", "localPathForSuccess"}, m13456s = {"L$0", "L$1", "L$0", "L$0"})
    /* renamed from: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$1 */
    public static final class C71731 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9908a;

        /* renamed from: b */
        public Object f9909b;

        /* renamed from: c */
        public /* synthetic */ Object f9910c;

        /* renamed from: e */
        public int f9912e;

        public C71731(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9910c = obj;
            this.f9912e |= Integer.MIN_VALUE;
            return DownloadFileWork.this.downloadFileWithProgress(this);
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWork", m13451f = "DownloadFileWork.kt", m13452i = {}, m13453l = {199}, m13454m = "notifyProgress", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.download.work.DownloadFileWork$notifyProgress$1 */
    public static final class C71751 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9928a;

        /* renamed from: b */
        public long f9929b;

        /* renamed from: c */
        public /* synthetic */ Object f9930c;

        /* renamed from: e */
        public int f9932e;

        public C71751(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9930c = obj;
            this.f9932e |= Integer.MIN_VALUE;
            return DownloadFileWork.this.notifyProgress(0L, null, this);
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWork", m13451f = "DownloadFileWork.kt", m13452i = {0, 0, 0}, m13453l = {190, 192}, m13454m = "sendSpeedAndProgress", m13455n = {"this", "coroutineScope", "prevLength"}, m13456s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1 */
    public static final class C71761 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9933a;

        /* renamed from: b */
        public Object f9934b;

        /* renamed from: c */
        public Object f9935c;

        /* renamed from: d */
        public /* synthetic */ Object f9936d;

        /* renamed from: f */
        public int f9938f;

        public C71761(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9936d = obj;
            this.f9938f |= Integer.MIN_VALUE;
            return DownloadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.appContext = appContext;
        this.appDataBase = AppDatabase.INSTANCE.m9797b(appContext);
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

    public static /* synthetic */ Object doWork$suspendImpl(DownloadFileWork downloadFileWork, Continuation continuation) {
        downloadFileWork.setProxy(new DownloadFileWorkProxy(downloadFileWork.appContext, downloadFileWork.getAppDataBase(), downloadFileWork));
        return downloadFileWork.downloadFileWithProgress(continuation);
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
    public final java.lang.Object downloadFileWithProgress(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r15) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.downloadFileWithProgress(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWork.smali:430
    }

    public static /* synthetic */ Object notifyProgress$default(DownloadFileWork downloadFileWork, long j9, Integer num, Continuation continuation, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyProgress");
        }
        if ((i9 & 2) != 0) {
            num = 0;
        }
        return downloadFileWork.notifyProgress(j9, num, continuation);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    public abstract Object downloadFile(C9827b c9827b, Continuation<? super Unit> continuation);

    public final AppDatabase getAppDataBase() {
        return this.appDataBase;
    }

    public final String getDir() {
        String str = this.dir;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dir");
        throw null;
    }

    public final String getDownloadUrl() {
        String str = this.downloadUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadUrl");
        throw null;
    }

    public final String getFileName() {
        String str = this.fileName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileName");
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
        Intrinsics.throwUninitializedPropertyAccessException("proxy");
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
    public final java.lang.Object notifyProgress(long r7, java.lang.Integer r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.zykj.download.work.DownloadFileWork.C71751
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.download.work.DownloadFileWork$notifyProgress$1 r0 = (com.zykj.download.work.DownloadFileWork.C71751) r0
            int r1 = r0.f9932e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9932e = r1
            goto L18
        L13:
            com.zykj.download.work.DownloadFileWork$notifyProgress$1 r0 = new com.zykj.download.work.DownloadFileWork$notifyProgress$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9930c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9932e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.f9929b
            java.lang.Object r9 = r0.f9928a
            com.zykj.download.work.DownloadFileWork r9 = (com.zykj.download.work.DownloadFileWork) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L87
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r10)
            androidx.lifecycle.MutableLiveData r10 = r6.getProgressLiveData()
            r10.postValue(r9)
            java.lang.String r10 = "speed"
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            kotlin.Pair r10 = kotlin.TuplesKt.m13420to(r10, r2)
            java.lang.String r2 = "progress"
            kotlin.Pair r9 = kotlin.TuplesKt.m13420to(r2, r9)
            kotlin.Pair[] r9 = new kotlin.Pair[]{r10, r9}
            androidx.work.Data$Builder r10 = new androidx.work.Data$Builder
            r10.<init>()
            r2 = 0
        L5b:
            r4 = 2
            if (r2 >= r4) goto L70
            r4 = r9[r2]
            java.lang.Object r5 = r4.getFirst()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getSecond()
            r10.put(r5, r4)
            int r2 = r2 + 1
            goto L5b
        L70:
            androidx.work.Data r9 = r10.build()
            java.lang.String r10 = "dataBuilder.build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r0.f9928a = r6
            r0.f9929b = r7
            r0.f9932e = r3
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
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.notifyProgress(long, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWork.smali:2163
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[PHI: r5 r11 r12
      0x005b: PHI (r5v3 com.zykj.download.work.DownloadFileWork) = 
      (r5v0 com.zykj.download.work.DownloadFileWork)
      (r5v1 com.zykj.download.work.DownloadFileWork)
      (r5v7 com.zykj.download.work.DownloadFileWork)
     binds: [B:16:0x0052, B:32:0x00bb, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r11v4 kotlinx.coroutines.CoroutineScope) = 
      (r11v0 kotlinx.coroutines.CoroutineScope)
      (r11v1 kotlinx.coroutines.CoroutineScope)
      (r11v12 kotlinx.coroutines.CoroutineScope)
     binds: [B:16:0x0052, B:32:0x00bb, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
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
    public final java.lang.Object sendSpeedAndProgress(kotlinx.coroutines.CoroutineScope r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.zykj.download.work.DownloadFileWork.C71761
            if (r0 == 0) goto L13
            r0 = r12
            com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1 r0 = (com.zykj.download.work.DownloadFileWork.C71761) r0
            int r1 = r0.f9938f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9938f = r1
            goto L18
        L13:
            com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1 r0 = new com.zykj.download.work.DownloadFileWork$sendSpeedAndProgress$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9936d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9938f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r11 = r0.f9935c
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref.LongRef) r11
            java.lang.Object r2 = r0.f9934b
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            java.lang.Object r5 = r0.f9933a
            com.zykj.download.work.DownloadFileWork r5 = (com.zykj.download.work.DownloadFileWork) r5
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
            r11 = r2
            goto L5b
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            java.lang.Object r11 = r0.f9935c
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref.LongRef) r11
            java.lang.Object r2 = r0.f9934b
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            java.lang.Object r5 = r0.f9933a
            com.zykj.download.work.DownloadFileWork r5 = (com.zykj.download.work.DownloadFileWork) r5
            kotlin.ResultKt.throwOnFailure(r12)
            goto La7
        L52:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.jvm.internal.Ref$LongRef r12 = new kotlin.jvm.internal.Ref$LongRef
            r12.<init>()
            r5 = r10
        L5b:
            boolean r2 = kotlinx.coroutines.CoroutineScopeKt.isActive(r11)
            if (r2 == 0) goto Lbe
            androidx.lifecycle.MutableLiveData r2 = r5.getReceiverLengthLiveData()
            java.lang.Object r2 = r2.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L6e
            goto La9
        L6e:
            long r6 = r12.element
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L77
            goto L86
        L77:
            long r6 = r2.longValue()
            long r8 = r12.element
            long r6 = r6 - r8
            com.zykj.download.work.DownloadFileWorkProxy$a r8 = com.zykj.download.work.DownloadFileWorkProxy.INSTANCE
            long r8 = r8.m9809a()
            long r8 = r6 / r8
        L86:
            long r6 = r2.longValue()
            r12.element = r6
            androidx.lifecycle.MutableLiveData r2 = r5.getProgressLiveData()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.f9933a = r5
            r0.f9934b = r11
            r0.f9935c = r12
            r0.f9938f = r4
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
            com.zykj.download.work.DownloadFileWorkProxy$a r2 = com.zykj.download.work.DownloadFileWorkProxy.INSTANCE
            long r6 = r2.m9809a()
            r0.f9933a = r5
            r0.f9934b = r11
            r0.f9935c = r12
            r0.f9938f = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r2 != r1) goto L5b
        Lbd:
            return r1
        Lbe:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.sendSpeedAndProgress(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWork.smali:2545
    }

    public final void setDir(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dir = str;
    }

    public final void setDownloadUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void setProxy(DownloadFileWorkProxy downloadFileWorkProxy) {
        Intrinsics.checkNotNullParameter(downloadFileWorkProxy, "<set-?>");
        this.proxy = downloadFileWorkProxy;
    }
}
