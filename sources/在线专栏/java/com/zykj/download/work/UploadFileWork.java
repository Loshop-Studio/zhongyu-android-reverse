package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.C0511s;
import androidx.work.C0810a;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.zykj.download.OssUtils;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.C2746b;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2781x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2560i;
import p087f3.C2593r0;
import p087f3.InterfaceC2557h0;
import p087f3.InterfaceC2578m1;
import p128o2.C2918k;
import p128o2.C2920m;
import p128o2.C2922o;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

@Keep
/* loaded from: classes.dex */
public abstract class UploadFileWork extends CoroutineWorker {

    @NotNull
    private final Context appContext;

    @NotNull
    private final C0511s<Integer> progressLiveData;

    @NotNull
    private final C0511s<Long> receiverLengthLiveData;

    @InterfaceC2750f(m9206c = "com.zykj.download.work.UploadFileWork", m9207f = "UploadFileWork.kt", m9208l = {113, 122}, m9209m = "sendSpeedAndProgress")
    /* renamed from: com.zykj.download.work.UploadFileWork$a */
    static final class C2391a extends AbstractC2748d {

        /* renamed from: a */
        Object f9763a;

        /* renamed from: b */
        Object f9764b;

        /* renamed from: c */
        Object f9765c;

        /* renamed from: d */
        Object f9766d;

        /* renamed from: e */
        long f9767e;

        /* renamed from: f */
        /* synthetic */ Object f9768f;

        /* renamed from: h */
        int f9770h;

        C2391a(InterfaceC3012d<? super C2391a> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9768f = obj;
            this.f9770h |= Integer.MIN_VALUE;
            return UploadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.UploadFileWork", m9207f = "UploadFileWork.kt", m9208l = {64}, m9209m = "uploadFileWithProgress")
    /* renamed from: com.zykj.download.work.UploadFileWork$b */
    static final class C2392b extends AbstractC2748d {

        /* renamed from: a */
        Object f9771a;

        /* renamed from: b */
        /* synthetic */ Object f9772b;

        /* renamed from: d */
        int f9774d;

        C2392b(InterfaceC3012d<? super C2392b> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9772b = obj;
            this.f9774d |= Integer.MIN_VALUE;
            return UploadFileWork.this.uploadFileWithProgress(this);
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2", m9207f = "UploadFileWork.kt", m9208l = {}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.download.work.UploadFileWork$c */
    static final class C2393c extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super InterfaceC2578m1>, Object> {

        /* renamed from: b */
        int f9775b;

        /* renamed from: c */
        private /* synthetic */ Object f9776c;

        /* renamed from: e */
        final /* synthetic */ C2781x<String> f9778e;

        @InterfaceC2750f(m9206c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1", m9207f = "UploadFileWork.kt", m9208l = {71, 73}, m9209m = "invokeSuspend")
        /* renamed from: com.zykj.download.work.UploadFileWork$c$a */
        static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

            /* renamed from: b */
            Object f9779b;

            /* renamed from: c */
            int f9780c;

            /* renamed from: d */
            final /* synthetic */ C2781x<String> f9781d;

            /* renamed from: e */
            final /* synthetic */ UploadFileWork f9782e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC2578m1 f9783f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2781x<String> c2781x, UploadFileWork uploadFileWork, InterfaceC2578m1 interfaceC2578m1, InterfaceC3012d<? super a> interfaceC3012d) {
                super(2, interfaceC3012d);
                this.f9781d = c2781x;
                this.f9782e = uploadFileWork;
                this.f9783f = interfaceC2578m1;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @NotNull
            public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                return new a(this.f9781d, this.f9782e, this.f9783f, interfaceC3012d);
            }

            @Override // p171x2.InterfaceC3474p
            @Nullable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
                return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                C2781x<String> c2781x;
                T t3;
                Object objM10175c = C3033d.m10175c();
                int i4 = this.f9780c;
                if (i4 == 0) {
                    C2920m.m9994b(obj);
                    c2781x = this.f9781d;
                    UploadFileWork uploadFileWork = this.f9782e;
                    this.f9779b = c2781x;
                    this.f9780c = 1;
                    Object objUploadFile = uploadFileWork.uploadFile(this);
                    t3 = objUploadFile;
                    if (objUploadFile == objM10175c) {
                        return objM10175c;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2920m.m9994b(obj);
                        InterfaceC2578m1.a.m8633a(this.f9783f, null, 1, null);
                        return C2925r.f11415a;
                    }
                    c2781x = (C2781x) this.f9779b;
                    C2920m.m9994b(obj);
                    t3 = obj;
                }
                c2781x.f10737a = t3;
                this.f9779b = null;
                this.f9780c = 2;
                if (C2593r0.m8654a(500L, this) == objM10175c) {
                    return objM10175c;
                }
                InterfaceC2578m1.a.m8633a(this.f9783f, null, 1, null);
                return C2925r.f11415a;
            }
        }

        @InterfaceC2750f(m9206c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$job$1", m9207f = "UploadFileWork.kt", m9208l = {67}, m9209m = "invokeSuspend")
        /* renamed from: com.zykj.download.work.UploadFileWork$c$b */
        static final class b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

            /* renamed from: b */
            int f9784b;

            /* renamed from: c */
            private /* synthetic */ Object f9785c;

            /* renamed from: d */
            final /* synthetic */ UploadFileWork f9786d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(UploadFileWork uploadFileWork, InterfaceC3012d<? super b> interfaceC3012d) {
                super(2, interfaceC3012d);
                this.f9786d = uploadFileWork;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @NotNull
            public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                b bVar = new b(this.f9786d, interfaceC3012d);
                bVar.f9785c = obj;
                return bVar;
            }

            @Override // p171x2.InterfaceC3474p
            @Nullable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
                return ((b) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM10175c = C3033d.m10175c();
                int i4 = this.f9784b;
                if (i4 == 0) {
                    C2920m.m9994b(obj);
                    InterfaceC2557h0 interfaceC2557h0 = (InterfaceC2557h0) this.f9785c;
                    UploadFileWork uploadFileWork = this.f9786d;
                    this.f9784b = 1;
                    if (uploadFileWork.sendSpeedAndProgress(interfaceC2557h0, this) == objM10175c) {
                        return objM10175c;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2920m.m9994b(obj);
                }
                return C2925r.f11415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2393c(C2781x<String> c2781x, InterfaceC3012d<? super C2393c> interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f9778e = c2781x;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            C2393c c2393c = UploadFileWork.this.new C2393c(this.f9778e, interfaceC3012d);
            c2393c.f9776c = obj;
            return c2393c;
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super InterfaceC2578m1> interfaceC3012d) {
            return ((C2393c) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3033d.m10175c();
            if (this.f9775b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2920m.m9994b(obj);
            InterfaceC2557h0 interfaceC2557h0 = (InterfaceC2557h0) this.f9776c;
            return C2560i.m8574d(interfaceC2557h0, null, null, new a(this.f9778e, UploadFileWork.this, C2560i.m8574d(interfaceC2557h0, null, null, new b(UploadFileWork.this, null), 3, null), null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWork(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        C2769l.m9241e(appContext, "appContext");
        C2769l.m9241e(workerParams, "workerParams");
        this.appContext = appContext;
        this.receiverLengthLiveData = new C0511s<>(0L);
        this.progressLiveData = new C0511s<>(0);
    }

    static /* synthetic */ Object doWork$suspendImpl(UploadFileWork uploadFileWork, InterfaceC3012d interfaceC3012d) throws Throwable {
        if (OssUtils.INSTANCE.isNetworkConnected(uploadFileWork.appContext)) {
            return uploadFileWork.uploadFileWithProgress(interfaceC3012d);
        }
        C2918k[] c2918kArr = {C2922o.m9996a(OssUtils.ERROR_KEY, C2746b.m9204c(ErrorCode.NET_NO_CONNECT.getErrorCodeInfo().getCode()))};
        C0810a.a aVar = new C0810a.a();
        for (int i4 = 0; i4 < 1; i4++) {
            C2918k c2918k = c2918kArr[i4];
            aVar.m4156b((String) c2918k.m9987c(), c2918k.m9988d());
        }
        C0810a c0810aM4155a = aVar.m4155a();
        C2769l.m9240d(c0810aM4155a, "dataBuilder.build()");
        ListenableWorker.AbstractC0807a abstractC0807aM4123b = ListenableWorker.AbstractC0807a.m4123b(c0810aM4155a);
        C2769l.m9240d(abstractC0807aM4123b, "failure(workDataOf(ERROR_KEY to ErrorCode.NET_NO_CONNECT.errorCodeInfo.code))");
        return abstractC0807aM4123b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFileWithProgress(p142q2.InterfaceC3012d<? super androidx.work.ListenableWorker.AbstractC0807a> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.uploadFileWithProgress(q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/UploadFileWork.smali:210
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC3012d<? super ListenableWorker.AbstractC0807a> interfaceC3012d) {
        return doWork$suspendImpl(this, interfaceC3012d);
    }

    @NotNull
    public final C0511s<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    @NotNull
    public final C0511s<Long> getReceiverLengthLiveData() {
        return this.receiverLengthLiveData;
    }

    public abstract void initParameter();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0131 -> B:13:0x003f). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSpeedAndProgress(@org.jetbrains.annotations.NotNull p087f3.InterfaceC2557h0 r17, @org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<? super p128o2.C2925r> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.UploadFileWork.sendSpeedAndProgress(f3.h0, q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/UploadFileWork.smali:998
    }

    @Nullable
    public abstract Object uploadFile(@NotNull InterfaceC3012d<? super String> interfaceC3012d);
}
