package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.MutableLiveData;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.taobao.sophix.PatchStatus;
import com.zykj.download.OssUtils;
import com.zykj.lib.error.code.ErrorCode;
import java.lang.reflect.InvocationTargetException;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public abstract class UploadFileWork extends CoroutineWorker {
    private final Context appContext;
    private final MutableLiveData<Integer> progressLiveData;
    private final MutableLiveData<Long> receiverLengthLiveData;

    @InterfaceC11829d(m26210c = "com.zykj.download.work.UploadFileWork", m26211f = "UploadFileWork.kt", m26212l = {113, 122}, m26213m = "sendSpeedAndProgress")
    /* renamed from: com.zykj.download.work.UploadFileWork$sendSpeedAndProgress$1 */
    public static final class C85761 extends ContinuationImpl {

        /* renamed from: c */
        public Object f19671c;

        /* renamed from: d */
        public Object f19672d;

        /* renamed from: e */
        public Object f19673e;

        /* renamed from: f */
        public Object f19674f;

        /* renamed from: g */
        public long f19675g;

        /* renamed from: h */
        public /* synthetic */ Object f19676h;

        /* renamed from: j */
        public int f19678j;

        public C85761(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19676h = obj;
            this.f19678j |= Integer.MIN_VALUE;
            return UploadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.download.work.UploadFileWork", m26211f = "UploadFileWork.kt", m26212l = {64}, m26213m = "uploadFileWithProgress")
    /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$1 */
    public static final class C85771 extends ContinuationImpl {

        /* renamed from: c */
        public Object f19679c;

        /* renamed from: d */
        public /* synthetic */ Object f19680d;

        /* renamed from: f */
        public int f19682f;

        public C85771(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19680d = obj;
            this.f19682f |= Integer.MIN_VALUE;
            return UploadFileWork.this.uploadFileWithProgress(this);
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2", m26211f = "UploadFileWork.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2 */
    public static final class C85782 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f19683c;

        /* renamed from: d */
        public /* synthetic */ Object f19684d;

        /* renamed from: f */
        public final /* synthetic */ Ref$ObjectRef f19686f;

        @InterfaceC11829d(m26210c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1", m26211f = "UploadFileWork.kt", m26212l = {PatchStatus.CODE_LOAD_UNDEFINED, PatchStatus.CODE_LOAD_MFITEM}, m26213m = "invokeSuspend")
        /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public Object f19687c;

            /* renamed from: d */
            public int f19688d;

            /* renamed from: e */
            public final /* synthetic */ Ref$ObjectRef f19689e;

            /* renamed from: f */
            public final /* synthetic */ UploadFileWork f19690f;

            /* renamed from: g */
            public final /* synthetic */ InterfaceC10045g f19691g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, UploadFileWork uploadFileWork, InterfaceC10045g interfaceC10045g, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f19689e = ref$ObjectRef;
                this.f19690f = uploadFileWork;
                this.f19691g = interfaceC10045g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f19689e, this.f19690f, this.f19691g, interfaceC11588c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            
                if (kotlinx.coroutines.DelayKt.m20376b(500, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                    int r1 = r5.f19688d
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.AbstractC9924b.m20071b(r6)
                    goto L44
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    java.lang.Object r1 = r5.f19687c
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    kotlin.AbstractC9924b.m20071b(r6)
                    goto L35
                L23:
                    kotlin.AbstractC9924b.m20071b(r6)
                    kotlin.jvm.internal.Ref$ObjectRef r1 = r5.f19689e
                    com.zykj.download.work.UploadFileWork r6 = r5.f19690f
                    r5.f19687c = r1
                    r5.f19688d = r4
                    java.lang.Object r6 = r6.uploadFile(r5)
                    if (r6 != r0) goto L35
                    goto L43
                L35:
                    r1.f23402c = r6
                    r5.f19687c = r3
                    r5.f19688d = r2
                    r1 = 500(0x1f4, double:2.47E-321)
                    java.lang.Object r6 = kotlinx.coroutines.DelayKt.m20376b(r1, r5)
                    if (r6 != r0) goto L44
                L43:
                    return r0
                L44:
                    kotlinx.coroutines.g r6 = r5.f19691g
                    kotlinx.coroutines.InterfaceC10045g.a.m20900a(r6, r3, r4, r3)
                    qc.q r6 = p309qc.C10786q.f26013a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.C85782.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1.smali:141
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C85782(Ref$ObjectRef ref$ObjectRef, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f19686f = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C85782 c85782 = UploadFileWork.this.new C85782(this.f19686f, interfaceC11588c);
            c85782.f19684d = obj;
            return c85782;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f19683c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f19684d;
            return AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(this.f19686f, UploadFileWork.this, AbstractC11117h.m24726d(interfaceC11122i0, null, null, new UploadFileWork$uploadFileWithProgress$2$job$1(UploadFileWork.this, null), 3, null), null), 3, null);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C85782) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerParams, "workerParams");
        this.appContext = appContext;
        this.receiverLengthLiveData = new MutableLiveData<>(0L);
        this.progressLiveData = new MutableLiveData<>(0);
    }

    public static /* synthetic */ Object doWork$suspendImpl(UploadFileWork uploadFileWork, InterfaceC11588c interfaceC11588c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (OssUtils.INSTANCE.isNetworkConnected(uploadFileWork.appContext)) {
            return uploadFileWork.uploadFileWithProgress(interfaceC11588c);
        }
        Pair[] pairArr = {AbstractC10776g.m22975a(OssUtils.ERROR_KEY, AbstractC11826a.m26208c(ErrorCode.NET_NO_CONNECT.getErrorCodeInfo().getCode()))};
        Data.Builder builder = new Data.Builder();
        Pair pair = pairArr[0];
        builder.put((String) pair.m20051f(), pair.m20052g());
        Data dataBuild = builder.build();
        AbstractC9979u.m20293f(dataBuild, "dataBuilder.build()");
        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure(dataBuild);
        AbstractC9979u.m20293f(resultFailure, "failure(workDataOf(ERROR_KEY to ErrorCode.NET_NO_CONNECT.errorCodeInfo.code))");
        return resultFailure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFileWithProgress(vc.InterfaceC11588c<? super androidx.work.ListenableWorker.Result> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.uploadFileWithProgress(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/download/work/UploadFileWork.smali:296
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
        return doWork$suspendImpl(this, interfaceC11588c);
    }

    public final MutableLiveData<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    public final MutableLiveData<Long> getReceiverLengthLiveData() {
        return this.receiverLengthLiveData;
    }

    public abstract void initParameter();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(500, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0125 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSpeedAndProgress(sd.InterfaceC11122i0 r14, vc.InterfaceC11588c<? super p309qc.C10786q> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.sendSpeedAndProgress(sd.i0, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/download/work/UploadFileWork.smali:1548
    }

    public abstract Object uploadFile(InterfaceC11588c<? super String> interfaceC11588c);
}
