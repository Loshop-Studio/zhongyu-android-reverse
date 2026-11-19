package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.MutableLiveData;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.download.OssUtils;
import com.zykj.lib.error.code.ErrorCode;
import java.lang.reflect.InvocationTargetException;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public abstract class UploadFileWork extends CoroutineWorker {
    private final Context appContext;
    private final MutableLiveData<Integer> progressLiveData;
    private final MutableLiveData<Long> receiverLengthLiveData;

    @InterfaceC9539d(m17800c = "com.zykj.download.work.UploadFileWork", m17801f = "UploadFileWork.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 122}, m17803m = "sendSpeedAndProgress")
    /* renamed from: com.zykj.download.work.UploadFileWork$sendSpeedAndProgress$1 */
    public static final class C72961 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9686a;

        /* renamed from: b */
        public Object f9687b;

        /* renamed from: c */
        public Object f9688c;

        /* renamed from: d */
        public Object f9689d;

        /* renamed from: e */
        public long f9690e;

        /* renamed from: f */
        public /* synthetic */ Object f9691f;

        /* renamed from: h */
        public int f9693h;

        public C72961(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9691f = obj;
            this.f9693h |= Integer.MIN_VALUE;
            return UploadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.UploadFileWork", m17801f = "UploadFileWork.kt", m17802l = {64}, m17803m = "uploadFileWithProgress")
    /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$1 */
    public static final class C72971 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9694a;

        /* renamed from: b */
        public /* synthetic */ Object f9695b;

        /* renamed from: d */
        public int f9697d;

        public C72971(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9695b = obj;
            this.f9697d |= Integer.MIN_VALUE;
            return UploadFileWork.this.uploadFileWithProgress(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2", m17801f = "UploadFileWork.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2 */
    public static final class C72982 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9698a;

        /* renamed from: b */
        public /* synthetic */ Object f9699b;

        /* renamed from: d */
        public final /* synthetic */ Ref$ObjectRef f9701d;

        @InterfaceC9539d(m17800c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1", m17801f = "UploadFileWork.kt", m17802l = {71, 73}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public Object f9702a;

            /* renamed from: b */
            public int f9703b;

            /* renamed from: c */
            public final /* synthetic */ Ref$ObjectRef f9704c;

            /* renamed from: d */
            public final /* synthetic */ UploadFileWork f9705d;

            /* renamed from: e */
            public final /* synthetic */ InterfaceC9212n f9706e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, UploadFileWork uploadFileWork, InterfaceC9212n interfaceC9212n, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f9704c = ref$ObjectRef;
                this.f9705d = uploadFileWork;
                this.f9706e = interfaceC9212n;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f9704c, this.f9705d, this.f9706e, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            
                if (kotlinx.coroutines.DelayKt.m16227b(500, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                    int r1 = r5.f9703b
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.AbstractC9079b.m15926b(r6)
                    goto L44
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    java.lang.Object r1 = r5.f9702a
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    kotlin.AbstractC9079b.m15926b(r6)
                    goto L35
                L23:
                    kotlin.AbstractC9079b.m15926b(r6)
                    kotlin.jvm.internal.Ref$ObjectRef r1 = r5.f9704c
                    com.zykj.download.work.UploadFileWork r6 = r5.f9705d
                    r5.f9702a = r1
                    r5.f9703b = r4
                    java.lang.Object r6 = r6.uploadFile(r5)
                    if (r6 != r0) goto L35
                    goto L43
                L35:
                    r1.f17473a = r6
                    r5.f9702a = r3
                    r5.f9703b = r2
                    r1 = 500(0x1f4, double:2.47E-321)
                    java.lang.Object r6 = kotlinx.coroutines.DelayKt.m16227b(r1, r5)
                    if (r6 != r0) goto L44
                L43:
                    return r0
                L44:
                    kotlinx.coroutines.n r6 = r5.f9706e
                    kotlinx.coroutines.InterfaceC9212n.a.m16777a(r6, r3, r4, r3)
                    h7.p r6 = p123h7.C8736p.f16368a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.C72982.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1.smali:141
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C72982(Ref$ObjectRef ref$ObjectRef, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9701d = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C72982 c72982 = UploadFileWork.this.new C72982(this.f9701d, interfaceC9324c);
            c72982.f9699b = obj;
            return c72982;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C72982) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f9698a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f9699b;
            return AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(this.f9701d, UploadFileWork.this, AbstractC8839h.m14861d(interfaceC8822b0, null, null, new UploadFileWork$uploadFileWithProgress$2$job$1(UploadFileWork.this, null), 3, null), null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(workerParams, "workerParams");
        this.appContext = appContext;
        this.receiverLengthLiveData = new MutableLiveData<>(0L);
        this.progressLiveData = new MutableLiveData<>(0);
    }

    public static /* synthetic */ Object doWork$suspendImpl(UploadFileWork uploadFileWork, InterfaceC9324c interfaceC9324c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (OssUtils.INSTANCE.isNetworkConnected(uploadFileWork.appContext)) {
            return uploadFileWork.uploadFileWithProgress(interfaceC9324c);
        }
        Pair[] pairArr = {AbstractC8726f.m14230a(OssUtils.ERROR_KEY, AbstractC9536a.m17798c(ErrorCode.NET_NO_CONNECT.getErrorCodeInfo().getCode()))};
        Data.Builder builder = new Data.Builder();
        Pair pair = pairArr[0];
        builder.put((String) pair.m15906e(), pair.m15907g());
        Data dataBuild = builder.build();
        AbstractC9133u.m16132f(dataBuild, "dataBuilder.build()");
        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure(dataBuild);
        AbstractC9133u.m16132f(resultFailure, "failure(workDataOf(ERROR_KEY to ErrorCode.NET_NO_CONNECT.errorCodeInfo.code))");
        return resultFailure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFileWithProgress(p179m7.InterfaceC9324c<? super androidx.work.ListenableWorker.Result> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.uploadFileWithProgress(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/UploadFileWork.smali:296
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c) {
        return doWork$suspendImpl(this, interfaceC9324c);
    }

    public final MutableLiveData<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    public final MutableLiveData<Long> getReceiverLengthLiveData() {
        return this.receiverLengthLiveData;
    }

    public abstract void initParameter();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        if (kotlinx.coroutines.DelayKt.m16227b(500, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0125 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSpeedAndProgress(p135i8.InterfaceC8822b0 r14, p179m7.InterfaceC9324c<? super p123h7.C8736p> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.sendSpeedAndProgress(i8.b0, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/UploadFileWork.smali:1548
    }

    public abstract Object uploadFile(InterfaceC9324c<? super String> interfaceC9324c);
}
