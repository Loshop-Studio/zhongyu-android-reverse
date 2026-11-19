package retrofit2;

import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p226r9.C9057c0;
import p226r9.C9078s;
import p226r9.InterfaceC9058d;
import p226r9.InterfaceC9062f;

/* loaded from: classes5.dex */
public abstract class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C9086a implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9058d f15713a;

        public C9086a(InterfaceC9058d interfaceC9058d) {
            this.f15713a = interfaceC9058d;
        }

        /* renamed from: a */
        public final void m15344a(Throwable th) {
            this.f15713a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m15344a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C9087b implements InterfaceC9062f {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f15714a;

        public C9087b(CancellableContinuation cancellableContinuation) {
            this.f15714a = cancellableContinuation;
        }

        @Override // p226r9.InterfaceC9062f
        /* renamed from: a */
        public void mo15271a(InterfaceC9058d call, C9057c0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.m15244d()) {
                CancellableContinuation cancellableContinuation = this.f15714a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(new HttpException(response))));
                return;
            }
            Object objM15242a = response.m15242a();
            if (objM15242a != null) {
                this.f15714a.resumeWith(Result.m24299constructorimpl(objM15242a));
                return;
            }
            Object objM380i = call.mo15246a().m380i(C9078s.class);
            Intrinsics.checkNotNull(objM380i);
            C9078s c9078s = (C9078s) objM380i;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + c9078s.m15314b().getName() + '.' + c9078s.m15313a().getName() + " was null but response body type was declared as non-null");
            CancellableContinuation cancellableContinuation2 = this.f15714a;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
        }

        @Override // p226r9.InterfaceC9062f
        /* renamed from: b */
        public void mo15272b(InterfaceC9058d call, Throwable t10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t10, "t");
            CancellableContinuation cancellableContinuation = this.f15714a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(t10)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C9088c implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9058d f15715a;

        public C9088c(InterfaceC9058d interfaceC9058d) {
            this.f15715a = interfaceC9058d;
        }

        /* renamed from: a */
        public final void m15345a(Throwable th) {
            this.f15715a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m15345a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class C9089d implements InterfaceC9062f {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f15716a;

        public C9089d(CancellableContinuation cancellableContinuation) {
            this.f15716a = cancellableContinuation;
        }

        @Override // p226r9.InterfaceC9062f
        /* renamed from: a */
        public void mo15271a(InterfaceC9058d call, C9057c0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m15244d()) {
                CancellableContinuation cancellableContinuation = this.f15716a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m24299constructorimpl(response.m15242a()));
            } else {
                CancellableContinuation cancellableContinuation2 = this.f15716a;
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(new HttpException(response))));
            }
        }

        @Override // p226r9.InterfaceC9062f
        /* renamed from: b */
        public void mo15272b(InterfaceC9058d call, Throwable t10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t10, "t");
            CancellableContinuation cancellableContinuation = this.f15716a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(t10)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$e */
    public static final class C9090e implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9058d f15717a;

        public C9090e(InterfaceC9058d interfaceC9058d) {
            this.f15717a = interfaceC9058d;
        }

        /* renamed from: a */
        public final void m15346a(Throwable th) {
            this.f15717a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m15346a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$f */
    public static final class C9091f implements InterfaceC9062f {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f15718a;

        public C9091f(CancellableContinuation cancellableContinuation) {
            this.f15718a = cancellableContinuation;
        }

        @Override // p226r9.InterfaceC9062f
        /* renamed from: a */
        public void mo15271a(InterfaceC9058d call, C9057c0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f15718a.resumeWith(Result.m24299constructorimpl(response));
        }

        @Override // p226r9.InterfaceC9062f
        /* renamed from: b */
        public void mo15272b(InterfaceC9058d call, Throwable t10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t10, "t");
            CancellableContinuation cancellableContinuation = this.f15718a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(t10)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$g */
    public static final class RunnableC9092g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Continuation f15719a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f15720b;

        public RunnableC9092g(Continuation continuation, Throwable th) {
            this.f15719a = continuation;
            this.f15720b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.f15719a);
            Result.Companion companion = Result.INSTANCE;
            continuationIntercepted.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(this.f15720b)));
        }
    }

    /* renamed from: a */
    public static final Object m15339a(InterfaceC9058d interfaceC9058d, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C9086a(interfaceC9058d));
        interfaceC9058d.mo15247j(new C9087b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: b */
    public static final Object m15340b(InterfaceC9058d interfaceC9058d, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C9088c(interfaceC9058d));
        interfaceC9058d.mo15247j(new C9089d(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: c */
    public static final Object m15341c(InterfaceC9058d interfaceC9058d, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C9090e(interfaceC9058d));
        interfaceC9058d.mo15247j(new C9091f(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: d */
    public static final Object m15342d(InterfaceC9058d interfaceC9058d, Continuation continuation) {
        Intrinsics.checkNotNull(interfaceC9058d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return m15340b(interfaceC9058d, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15343e(java.lang.Throwable r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f15723c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15723c = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15722b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f15723c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f15721a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5c
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f15721a = r4
            r0.f15723c = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$g r3 = new retrofit2.KotlinExtensions$g
            r3.<init>(r0, r4)
            r5.mo25831dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m15343e(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
