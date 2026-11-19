package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.MutableLiveData;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.zykj.download.OssUtils;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Keep
@Metadata(m7879d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H&J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0011\u0010\u001b\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/download/work/UploadFileWork;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "progressLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getProgressLiveData", "()Landroidx/lifecycle/MutableLiveData;", "receiverLengthLiveData", "", "getReceiverLengthLiveData", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initParameter", "", "sendSpeedAndProgress", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "", "uploadFileWithProgress", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public abstract class UploadFileWork extends CoroutineWorker {
    private final Context appContext;
    private final MutableLiveData<Integer> progressLiveData;
    private final MutableLiveData<Long> receiverLengthLiveData;

    @Metadata(m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.UploadFileWork", m7918f = "UploadFileWork.kt", m7919i = {0, 0, 0, 0, 0}, m7920l = {113, 122}, m7921m = "sendSpeedAndProgress", m7922n = {"this", "coroutineScope", "prevLength", "it", OssUtils.SPEED}, m7923s = {"L$0", "L$1", "L$2", "L$3", "J$0"})
    /* renamed from: com.zykj.download.work.UploadFileWork$sendSpeedAndProgress$1 */
    public static final class C60151 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5711a;

        /* renamed from: b */
        public Object f5712b;

        /* renamed from: c */
        public Object f5713c;

        /* renamed from: d */
        public Object f5714d;

        /* renamed from: e */
        public long f5715e;

        /* renamed from: f */
        public /* synthetic */ Object f5716f;

        /* renamed from: h */
        public int f5718h;

        public C60151(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5716f = obj;
            this.f5718h |= Integer.MIN_VALUE;
            return UploadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.UploadFileWork", m7918f = "UploadFileWork.kt", m7919i = {0}, m7920l = {64}, m7921m = "uploadFileWithProgress", m7922n = {"successResult"}, m7923s = {"L$0"})
    /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$1 */
    public static final class C60161 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5719a;

        /* renamed from: b */
        public /* synthetic */ Object f5720b;

        /* renamed from: d */
        public int f5722d;

        public C60161(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5720b = obj;
            this.f5722d |= Integer.MIN_VALUE;
            return UploadFileWork.this.uploadFileWithProgress(this);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7880d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2", m7918f = "UploadFileWork.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2 */
    public static final class C60172 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* renamed from: a */
        public int f5723a;

        /* renamed from: b */
        public /* synthetic */ Object f5724b;

        /* renamed from: d */
        public final /* synthetic */ Ref.ObjectRef f5726d;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1", m7918f = "UploadFileWork.kt", m7919i = {}, m7920l = {71, 73}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public Object f5727a;

            /* renamed from: b */
            public int f5728b;

            /* renamed from: c */
            public final /* synthetic */ Ref.ObjectRef f5729c;

            /* renamed from: d */
            public final /* synthetic */ UploadFileWork f5730d;

            /* renamed from: e */
            public final /* synthetic */ Job f5731e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef objectRef, UploadFileWork uploadFileWork, Job job, Continuation continuation) {
                super(2, continuation);
                this.f5729c = objectRef;
                this.f5730d = uploadFileWork;
                this.f5731e = job;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f5729c, this.f5730d, this.f5731e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(500, r5) == r0) goto L15;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f5728b
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L44
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    java.lang.Object r1 = r5.f5727a
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L35
                L23:
                    kotlin.ResultKt.throwOnFailure(r6)
                    kotlin.jvm.internal.Ref$ObjectRef r1 = r5.f5729c
                    com.zykj.download.work.UploadFileWork r6 = r5.f5730d
                    r5.f5727a = r1
                    r5.f5728b = r4
                    java.lang.Object r6 = r6.uploadFile(r5)
                    if (r6 != r0) goto L35
                    goto L43
                L35:
                    r1.element = r6
                    r5.f5727a = r3
                    r5.f5728b = r2
                    r1 = 500(0x1f4, double:2.47E-321)
                    java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r1, r5)
                    if (r6 != r0) goto L44
                L43:
                    return r0
                L44:
                    kotlinx.coroutines.Job r6 = r5.f5731e
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r6, r3, r4, r3)
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.C60172.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1.smali:146
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60172(Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.f5726d = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C60172 c60172 = UploadFileWork.this.new C60172(this.f5726d, continuation);
            c60172.f5724b = obj;
            return c60172;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5723a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f5724b;
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.f5726d, UploadFileWork.this, BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UploadFileWork$uploadFileWithProgress$2$job$1(UploadFileWork.this, null), 3, null), null), 3, null);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.appContext = appContext;
        this.receiverLengthLiveData = new MutableLiveData<>(0L);
        this.progressLiveData = new MutableLiveData<>(0);
    }

    public static /* synthetic */ Object doWork$suspendImpl(UploadFileWork uploadFileWork, Continuation continuation) {
        if (OssUtils.INSTANCE.isNetworkConnected(uploadFileWork.appContext)) {
            return uploadFileWork.uploadFileWithProgress(continuation);
        }
        Pair[] pairArr = {TuplesKt.m7887to(OssUtils.ERROR_KEY, Boxing.boxInt(ErrorCode.NET_NO_CONNECT.getErrorCodeInfo().getCode()))};
        Data.Builder builder = new Data.Builder();
        Pair pair = pairArr[0];
        builder.put((String) pair.getFirst(), pair.getSecond());
        Data dataBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure(dataBuild);
        Intrinsics.checkNotNullExpressionValue(resultFailure, "failure(workDataOf(ERROR_KEY to ErrorCode.NET_NO_CONNECT.errorCodeInfo.code))");
        return resultFailure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFileWithProgress(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r10) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.uploadFileWithProgress(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileWork.smali:340
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    public final MutableLiveData<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    public final MutableLiveData<Long> getReceiverLengthLiveData() {
        return this.receiverLengthLiveData;
    }

    public abstract void initParameter();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0125 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSpeedAndProgress(kotlinx.coroutines.CoroutineScope r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.sendSpeedAndProgress(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileWork.smali:1587
    }

    public abstract Object uploadFile(Continuation<? super String> continuation);
}
