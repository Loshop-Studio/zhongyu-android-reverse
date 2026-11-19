package com.zykj.download.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.C0511s;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.zykj.download.data.AppDatabase;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2555g2;
import p087f3.InterfaceC2557h0;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p162v1.C3419b;
import p171x2.InterfaceC3474p;

@Keep
/* loaded from: classes.dex */
public abstract class DownloadFileWork extends CoroutineWorker {

    @NotNull
    public static final C2379a Companion = new C2379a(null);
    public static final long DELAY_TIME = 1000;

    @NotNull
    private final Context appContext;

    @NotNull
    private final AppDatabase appDataBase;
    public String dir;
    public String downloadUrl;
    public String fileName;

    @NotNull
    private final C0511s<Integer> progressLiveData;
    public DownloadFileWorkProxy proxy;

    @NotNull
    private final C0511s<Long> receiverLengthLiveData;

    /* renamed from: com.zykj.download.work.DownloadFileWork$a */
    public static final class C2379a {
        private C2379a() {
        }

        public /* synthetic */ C2379a(C2764g c2764g) {
            this();
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork", m9207f = "DownloadFileWork.kt", m9208l = {73, 77, 79, 93, 95}, m9209m = "downloadFileWithProgress")
    /* renamed from: com.zykj.download.work.DownloadFileWork$b */
    static final class C2380b extends AbstractC2748d {

        /* renamed from: a */
        Object f9722a;

        /* renamed from: b */
        Object f9723b;

        /* renamed from: c */
        /* synthetic */ Object f9724c;

        /* renamed from: e */
        int f9726e;

        C2380b(InterfaceC3012d<? super C2380b> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9724c = obj;
            this.f9726e |= Integer.MIN_VALUE;
            return DownloadFileWork.this.downloadFileWithProgress(this);
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1", m9207f = "DownloadFileWork.kt", m9208l = {97}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.download.work.DownloadFileWork$c */
    static final class C2381c extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super RemoteCodeException>, Object> {

        /* renamed from: b */
        int f9727b;

        /* renamed from: d */
        final /* synthetic */ C3419b f9729d;

        @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1", m9207f = "DownloadFileWork.kt", m9208l = {108, 120, 123, 120, 123, 120, 123, 120, 123, 120, 123}, m9209m = "invokeSuspend")
        /* renamed from: com.zykj.download.work.DownloadFileWork$c$a */
        static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super RemoteCodeException>, Object> {

            /* renamed from: b */
            Object f9730b;

            /* renamed from: c */
            Object f9731c;

            /* renamed from: d */
            int f9732d;

            /* renamed from: e */
            private /* synthetic */ Object f9733e;

            /* renamed from: f */
            final /* synthetic */ DownloadFileWork f9734f;

            /* renamed from: g */
            final /* synthetic */ C3419b f9735g;

            @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$download$1", m9207f = "DownloadFileWork.kt", m9208l = {103}, m9209m = "invokeSuspend")
            /* renamed from: com.zykj.download.work.DownloadFileWork$c$a$a, reason: collision with other inner class name */
            static final class C3531a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

                /* renamed from: b */
                int f9736b;

                /* renamed from: c */
                final /* synthetic */ DownloadFileWork f9737c;

                /* renamed from: d */
                final /* synthetic */ C3419b f9738d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3531a(DownloadFileWork downloadFileWork, C3419b c3419b, InterfaceC3012d<? super C3531a> interfaceC3012d) {
                    super(2, interfaceC3012d);
                    this.f9737c = downloadFileWork;
                    this.f9738d = c3419b;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                @NotNull
                public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                    return new C3531a(this.f9737c, this.f9738d, interfaceC3012d);
                }

                @Override // p171x2.InterfaceC3474p
                @Nullable
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
                    return ((C3531a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objM10175c = C3033d.m10175c();
                    int i4 = this.f9736b;
                    if (i4 == 0) {
                        C2920m.m9994b(obj);
                        DownloadFileWork downloadFileWork = this.f9737c;
                        C3419b c3419b = this.f9738d;
                        this.f9736b = 1;
                        if (downloadFileWork.downloadFile(c3419b, this) == objM10175c) {
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

            @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$job$1", m9207f = "DownloadFileWork.kt", m9208l = {99}, m9209m = "invokeSuspend")
            /* renamed from: com.zykj.download.work.DownloadFileWork$c$a$b */
            static final class b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

                /* renamed from: b */
                int f9739b;

                /* renamed from: c */
                private /* synthetic */ Object f9740c;

                /* renamed from: d */
                final /* synthetic */ DownloadFileWork f9741d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(DownloadFileWork downloadFileWork, InterfaceC3012d<? super b> interfaceC3012d) {
                    super(2, interfaceC3012d);
                    this.f9741d = downloadFileWork;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                @NotNull
                public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                    b bVar = new b(this.f9741d, interfaceC3012d);
                    bVar.f9740c = obj;
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
                    int i4 = this.f9739b;
                    if (i4 == 0) {
                        C2920m.m9994b(obj);
                        InterfaceC2557h0 interfaceC2557h0 = (InterfaceC2557h0) this.f9740c;
                        DownloadFileWork downloadFileWork = this.f9741d;
                        this.f9739b = 1;
                        if (downloadFileWork.sendSpeedAndProgress(interfaceC2557h0, this) == objM10175c) {
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
            a(DownloadFileWork downloadFileWork, C3419b c3419b, InterfaceC3012d<? super a> interfaceC3012d) {
                super(2, interfaceC3012d);
                this.f9734f = downloadFileWork;
                this.f9735g = c3419b;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @NotNull
            public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                a aVar = new a(this.f9734f, this.f9735g, interfaceC3012d);
                aVar.f9733e = obj;
                return aVar;
            }

            @Override // p171x2.InterfaceC3474p
            @Nullable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super RemoteCodeException> interfaceC3012d) {
                return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e0 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v50 */
            /* JADX WARN: Type inference failed for: r1v51 */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 510
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.C2381c.a.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/DownloadFileWork$c$a.smali:187
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2381c(C3419b c3419b, InterfaceC3012d<? super C2381c> interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f9729d = c3419b;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return DownloadFileWork.this.new C2381c(this.f9729d, interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super RemoteCodeException> interfaceC3012d) {
            return ((C2381c) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f9727b;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                a aVar = new a(DownloadFileWork.this, this.f9729d, null);
                this.f9727b = 1;
                obj = C2555g2.m8566c(aVar, this);
                if (obj == objM10175c) {
                    return objM10175c;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
            }
            return obj;
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork", m9207f = "DownloadFileWork.kt", m9208l = {199}, m9209m = "notifyProgress")
    /* renamed from: com.zykj.download.work.DownloadFileWork$d */
    static final class C2382d extends AbstractC2748d {

        /* renamed from: a */
        Object f9742a;

        /* renamed from: b */
        long f9743b;

        /* renamed from: c */
        /* synthetic */ Object f9744c;

        /* renamed from: e */
        int f9746e;

        C2382d(InterfaceC3012d<? super C2382d> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9744c = obj;
            this.f9746e |= Integer.MIN_VALUE;
            return DownloadFileWork.this.notifyProgress(0L, null, this);
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.download.work.DownloadFileWork", m9207f = "DownloadFileWork.kt", m9208l = {190, 192}, m9209m = "sendSpeedAndProgress")
    /* renamed from: com.zykj.download.work.DownloadFileWork$e */
    static final class C2383e extends AbstractC2748d {

        /* renamed from: a */
        Object f9747a;

        /* renamed from: b */
        Object f9748b;

        /* renamed from: c */
        Object f9749c;

        /* renamed from: d */
        /* synthetic */ Object f9750d;

        /* renamed from: f */
        int f9752f;

        C2383e(InterfaceC3012d<? super C2383e> interfaceC3012d) {
            super(interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9750d = obj;
            this.f9752f |= Integer.MIN_VALUE;
            return DownloadFileWork.this.sendSpeedAndProgress(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        C2769l.m9241e(appContext, "appContext");
        C2769l.m9241e(workerParams, "workerParams");
        this.appContext = appContext;
        this.appDataBase = AppDatabase.f9701n.m7977b(appContext);
        this.receiverLengthLiveData = new C0511s<>(0L);
        this.progressLiveData = new C0511s<>(0);
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

    static /* synthetic */ Object doWork$suspendImpl(DownloadFileWork downloadFileWork, InterfaceC3012d interfaceC3012d) {
        downloadFileWork.setProxy(new DownloadFileWorkProxy(downloadFileWork.appContext, downloadFileWork.getAppDataBase(), downloadFileWork));
        return downloadFileWork.downloadFileWithProgress(interfaceC3012d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[Catch: all -> 0x01ce, RemoteCodeException -> 0x0212, ServiceException -> 0x0254, ClientException -> 0x0292, LOOP:2: B:47:0x00d5->B:48:0x00d7, LOOP_END, TryCatch #2 {ClientException -> 0x0292, ServiceException -> 0x0254, RemoteCodeException -> 0x0212, all -> 0x01ce, blocks: (B:16:0x003d, B:63:0x0154, B:65:0x0158, B:67:0x0174, B:68:0x0186, B:70:0x0197, B:72:0x01ab, B:73:0x01bd, B:21:0x0052, B:59:0x013b, B:24:0x005b, B:46:0x00c7, B:48:0x00d7, B:49:0x00e9, B:27:0x0063, B:42:0x00b9, B:30:0x0070, B:37:0x00a0, B:39:0x00a4, B:51:0x00fa, B:53:0x0104, B:55:0x0125, B:33:0x0077), top: B:99:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158 A[Catch: all -> 0x01ce, RemoteCodeException -> 0x0212, ServiceException -> 0x0254, ClientException -> 0x0292, TryCatch #2 {ClientException -> 0x0292, ServiceException -> 0x0254, RemoteCodeException -> 0x0212, all -> 0x01ce, blocks: (B:16:0x003d, B:63:0x0154, B:65:0x0158, B:67:0x0174, B:68:0x0186, B:70:0x0197, B:72:0x01ab, B:73:0x01bd, B:21:0x0052, B:59:0x013b, B:24:0x005b, B:46:0x00c7, B:48:0x00d7, B:49:0x00e9, B:27:0x0063, B:42:0x00b9, B:30:0x0070, B:37:0x00a0, B:39:0x00a4, B:51:0x00fa, B:53:0x0104, B:55:0x0125, B:33:0x0077), top: B:99:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197 A[Catch: all -> 0x01ce, RemoteCodeException -> 0x0212, ServiceException -> 0x0254, ClientException -> 0x0292, TryCatch #2 {ClientException -> 0x0292, ServiceException -> 0x0254, RemoteCodeException -> 0x0212, all -> 0x01ce, blocks: (B:16:0x003d, B:63:0x0154, B:65:0x0158, B:67:0x0174, B:68:0x0186, B:70:0x0197, B:72:0x01ab, B:73:0x01bd, B:21:0x0052, B:59:0x013b, B:24:0x005b, B:46:0x00c7, B:48:0x00d7, B:49:0x00e9, B:27:0x0063, B:42:0x00b9, B:30:0x0070, B:37:0x00a0, B:39:0x00a4, B:51:0x00fa, B:53:0x0104, B:55:0x0125, B:33:0x0077), top: B:99:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadFileWithProgress(p142q2.InterfaceC3012d<? super androidx.work.ListenableWorker.AbstractC0807a> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.downloadFileWithProgress(q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/DownloadFileWork.smali:262
    }

    public static /* synthetic */ Object notifyProgress$default(DownloadFileWork downloadFileWork, long j4, Integer num, InterfaceC3012d interfaceC3012d, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyProgress");
        }
        if ((i4 & 2) != 0) {
            num = 0;
        }
        return downloadFileWork.notifyProgress(j4, num, interfaceC3012d);
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC3012d<? super ListenableWorker.AbstractC0807a> interfaceC3012d) {
        return doWork$suspendImpl(this, interfaceC3012d);
    }

    @Nullable
    public abstract Object downloadFile(@NotNull C3419b c3419b, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d);

    @NotNull
    public final AppDatabase getAppDataBase() {
        return this.appDataBase;
    }

    @NotNull
    public final String getDir() {
        String str = this.dir;
        if (str != null) {
            return str;
        }
        C2769l.m9256t("dir");
        throw null;
    }

    @NotNull
    public final String getDownloadUrl() {
        String str = this.downloadUrl;
        if (str != null) {
            return str;
        }
        C2769l.m9256t("downloadUrl");
        throw null;
    }

    @NotNull
    public final String getFileName() {
        String str = this.fileName;
        if (str != null) {
            return str;
        }
        C2769l.m9256t("fileName");
        throw null;
    }

    @NotNull
    public final C0511s<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    @NotNull
    public final DownloadFileWorkProxy getProxy() {
        DownloadFileWorkProxy downloadFileWorkProxy = this.proxy;
        if (downloadFileWorkProxy != null) {
            return downloadFileWorkProxy;
        }
        C2769l.m9256t("proxy");
        throw null;
    }

    @NotNull
    public final C0511s<Long> getReceiverLengthLiveData() {
        return this.receiverLengthLiveData;
    }

    public abstract void initParameter();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object notifyProgress(long r8, @org.jetbrains.annotations.Nullable java.lang.Integer r10, @org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<? super p128o2.C2925r> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.zykj.download.work.DownloadFileWork.C2382d
            if (r0 == 0) goto L13
            r0 = r11
            com.zykj.download.work.DownloadFileWork$d r0 = (com.zykj.download.work.DownloadFileWork.C2382d) r0
            int r1 = r0.f9746e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9746e = r1
            goto L18
        L13:
            com.zykj.download.work.DownloadFileWork$d r0 = new com.zykj.download.work.DownloadFileWork$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f9744c
            java.lang.Object r1 = p146r2.C3031b.m10172c()
            int r2 = r0.f9746e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r8 = r0.f9743b
            java.lang.Object r10 = r0.f9742a
            com.zykj.download.work.DownloadFileWork r10 = (com.zykj.download.work.DownloadFileWork) r10
            p128o2.C2920m.m9994b(r11)
            goto L89
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            p128o2.C2920m.m9994b(r11)
            androidx.lifecycle.s r11 = r7.getProgressLiveData()
            r11.postValue(r10)
            r11 = 2
            o2.k[] r2 = new p128o2.C2918k[r11]
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.C2746b.m9205d(r8)
            java.lang.String r5 = "speed"
            o2.k r4 = p128o2.C2922o.m9996a(r5, r4)
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "progress"
            o2.k r10 = p128o2.C2922o.m9996a(r4, r10)
            r2[r3] = r10
            androidx.work.a$a r10 = new androidx.work.a$a
            r10.<init>()
        L5e:
            if (r5 >= r11) goto L72
            r4 = r2[r5]
            java.lang.Object r6 = r4.m9987c()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.m9988d()
            r10.m4156b(r6, r4)
            int r5 = r5 + 1
            goto L5e
        L72:
            androidx.work.a r10 = r10.m4155a()
            java.lang.String r11 = "dataBuilder.build()"
            kotlin.jvm.internal.C2769l.m9240d(r10, r11)
            r0.f9742a = r7
            r0.f9743b = r8
            r0.f9746e = r3
            java.lang.Object r10 = r7.setProgress(r10, r0)
            if (r10 != r1) goto L88
            return r1
        L88:
            r10 = r7
        L89:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "speed="
            r11.append(r0)
            r11.append(r8)
            java.lang.String r8 = ", progress="
            r11.append(r8)
            androidx.lifecycle.s r8 = r10.getProgressLiveData()
            java.lang.Object r8 = r8.getValue()
            r11.append(r8)
            r8 = 32
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.io.PrintStream r9 = java.lang.System.out
            r9.println(r8)
            o2.r r8 = p128o2.C2925r.f11415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.notifyProgress(long, java.lang.Integer, q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/DownloadFileWork.smali:1364
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bb -> B:17:0x005b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSpeedAndProgress(@org.jetbrains.annotations.NotNull p087f3.InterfaceC2557h0 r12, @org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<? super p128o2.C2925r> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.zykj.download.work.DownloadFileWork.C2383e
            if (r0 == 0) goto L13
            r0 = r13
            com.zykj.download.work.DownloadFileWork$e r0 = (com.zykj.download.work.DownloadFileWork.C2383e) r0
            int r1 = r0.f9752f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9752f = r1
            goto L18
        L13:
            com.zykj.download.work.DownloadFileWork$e r0 = new com.zykj.download.work.DownloadFileWork$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f9750d
            java.lang.Object r1 = p146r2.C3031b.m10172c()
            int r2 = r0.f9752f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r12 = r0.f9749c
            kotlin.jvm.internal.w r12 = (kotlin.jvm.internal.C2780w) r12
            java.lang.Object r2 = r0.f9748b
            f3.h0 r2 = (p087f3.InterfaceC2557h0) r2
            java.lang.Object r5 = r0.f9747a
            com.zykj.download.work.DownloadFileWork r5 = (com.zykj.download.work.DownloadFileWork) r5
            p128o2.C2920m.m9994b(r13)
            r13 = r12
            r12 = r2
            goto L5b
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            java.lang.Object r12 = r0.f9749c
            kotlin.jvm.internal.w r12 = (kotlin.jvm.internal.C2780w) r12
            java.lang.Object r2 = r0.f9748b
            f3.h0 r2 = (p087f3.InterfaceC2557h0) r2
            java.lang.Object r5 = r0.f9747a
            com.zykj.download.work.DownloadFileWork r5 = (com.zykj.download.work.DownloadFileWork) r5
            p128o2.C2920m.m9994b(r13)
            goto La7
        L52:
            p128o2.C2920m.m9994b(r13)
            kotlin.jvm.internal.w r13 = new kotlin.jvm.internal.w
            r13.<init>()
            r5 = r11
        L5b:
            boolean r2 = p087f3.C2561i0.m8577b(r12)
            if (r2 == 0) goto Lbe
            androidx.lifecycle.s r2 = r5.getReceiverLengthLiveData()
            java.lang.Object r2 = r2.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L6e
            goto La9
        L6e:
            long r6 = r13.f10736a
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L77
            goto L86
        L77:
            long r6 = r2.longValue()
            long r8 = r13.f10736a
            long r6 = r6 - r8
            com.zykj.download.work.DownloadFileWorkProxy$a r8 = com.zykj.download.work.DownloadFileWorkProxy.Companion
            long r8 = r8.m7994a()
            long r8 = r6 / r8
        L86:
            long r6 = r2.longValue()
            r13.f10736a = r6
            androidx.lifecycle.s r2 = r5.getProgressLiveData()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.f9747a = r5
            r0.f9748b = r12
            r0.f9749c = r13
            r0.f9752f = r4
            java.lang.Object r2 = r5.notifyProgress(r8, r2, r0)
            if (r2 != r1) goto La5
            return r1
        La5:
            r2 = r12
            r12 = r13
        La7:
            r13 = r12
            r12 = r2
        La9:
            com.zykj.download.work.DownloadFileWorkProxy$a r2 = com.zykj.download.work.DownloadFileWorkProxy.Companion
            long r6 = r2.m7994a()
            r0.f9747a = r5
            r0.f9748b = r12
            r0.f9749c = r13
            r0.f9752f = r3
            java.lang.Object r2 = p087f3.C2593r0.m8654a(r6, r0)
            if (r2 != r1) goto L5b
            return r1
        Lbe:
            o2.r r12 = p128o2.C2925r.f11415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork.sendSpeedAndProgress(f3.h0, q2.d):java.lang.Object"); // DEX body: android/在线专栏/smali/com/zykj/download/work/DownloadFileWork.smali:1591
    }

    public final void setDir(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.dir = str;
    }

    public final void setDownloadUrl(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setFileName(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.fileName = str;
    }

    public final void setProxy(@NotNull DownloadFileWorkProxy downloadFileWorkProxy) {
        C2769l.m9241e(downloadFileWorkProxy, "<set-?>");
        this.proxy = downloadFileWorkProxy;
    }
}
