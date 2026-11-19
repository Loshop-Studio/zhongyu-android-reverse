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
import p200z5.C7957c0;
import p200z5.C7978s;
import p200z5.InterfaceC7958d;
import p200z5.InterfaceC7962f;

/* loaded from: classes4.dex */
public abstract class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C7666a implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7958d f10122a;

        public C7666a(InterfaceC7958d interfaceC7958d) {
            this.f10122a = interfaceC7958d;
        }

        /* renamed from: a */
        public final void m9120a(Throwable th) {
            this.f10122a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9120a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C7667b implements InterfaceC7962f {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f10123a;

        public C7667b(CancellableContinuation cancellableContinuation) {
            this.f10123a = cancellableContinuation;
        }

        @Override // p200z5.InterfaceC7962f
        /* renamed from: a */
        public void mo9121a(InterfaceC7958d call, C7957c0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.m9788e()) {
                CancellableContinuation cancellableContinuation = this.f10123a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(new HttpException(response))));
                return;
            }
            Object objM9785a = response.m9785a();
            if (objM9785a != null) {
                this.f10123a.resumeWith(Result.m17183constructorimpl(objM9785a));
                return;
            }
            Object objM6586j = call.mo9790a().m6586j(C7978s.class);
            Intrinsics.checkNotNull(objM6586j);
            C7978s c7978s = (C7978s) objM6586j;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + c7978s.m9856b().getName() + '.' + c7978s.m9855a().getName() + " was null but response body type was declared as non-null");
            CancellableContinuation cancellableContinuation2 = this.f10123a;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
        }

        @Override // p200z5.InterfaceC7962f
        /* renamed from: b */
        public void mo9122b(InterfaceC7958d call, Throwable t6) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t6, "t");
            CancellableContinuation cancellableContinuation = this.f10123a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(t6)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C7668c implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7958d f10124a;

        public C7668c(InterfaceC7958d interfaceC7958d) {
            this.f10124a = interfaceC7958d;
        }

        /* renamed from: a */
        public final void m9123a(Throwable th) {
            this.f10124a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9123a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class C7669d implements InterfaceC7962f {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f10125a;

        public C7669d(CancellableContinuation cancellableContinuation) {
            this.f10125a = cancellableContinuation;
        }

        @Override // p200z5.InterfaceC7962f
        /* renamed from: a */
        public void mo9121a(InterfaceC7958d call, C7957c0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m9788e()) {
                CancellableContinuation cancellableContinuation = this.f10125a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m17183constructorimpl(response.m9785a()));
            } else {
                CancellableContinuation cancellableContinuation2 = this.f10125a;
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(new HttpException(response))));
            }
        }

        @Override // p200z5.InterfaceC7962f
        /* renamed from: b */
        public void mo9122b(InterfaceC7958d call, Throwable t6) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t6, "t");
            CancellableContinuation cancellableContinuation = this.f10125a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(t6)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$e */
    public static final class C7670e implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7958d f10126a;

        public C7670e(InterfaceC7958d interfaceC7958d) {
            this.f10126a = interfaceC7958d;
        }

        /* renamed from: a */
        public final void m9124a(Throwable th) {
            this.f10126a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9124a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$f */
    public static final class C7671f implements InterfaceC7962f {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f10127a;

        public C7671f(CancellableContinuation cancellableContinuation) {
            this.f10127a = cancellableContinuation;
        }

        @Override // p200z5.InterfaceC7962f
        /* renamed from: a */
        public void mo9121a(InterfaceC7958d call, C7957c0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f10127a.resumeWith(Result.m17183constructorimpl(response));
        }

        @Override // p200z5.InterfaceC7962f
        /* renamed from: b */
        public void mo9122b(InterfaceC7958d call, Throwable t6) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t6, "t");
            CancellableContinuation cancellableContinuation = this.f10127a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(t6)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$g */
    public static final class RunnableC7672g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Continuation f10128a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f10129b;

        public RunnableC7672g(Continuation continuation, Throwable th) {
            this.f10128a = continuation;
            this.f10129b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.f10128a);
            Result.Companion companion = Result.INSTANCE;
            continuationIntercepted.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(this.f10129b)));
        }
    }

    /* renamed from: a */
    public static final Object m9115a(InterfaceC7958d interfaceC7958d, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C7666a(interfaceC7958d));
        interfaceC7958d.mo9791g(new C7667b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: b */
    public static final Object m9116b(InterfaceC7958d interfaceC7958d, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C7668c(interfaceC7958d));
        interfaceC7958d.mo9791g(new C7669d(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: c */
    public static final Object m9117c(InterfaceC7958d interfaceC7958d, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C7670e(interfaceC7958d));
        interfaceC7958d.mo9791g(new C7671f(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: d */
    public static final Object m9118d(InterfaceC7958d interfaceC7958d, Continuation continuation) {
        Intrinsics.checkNotNull(interfaceC7958d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return m9116b(interfaceC7958d, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9119e(java.lang.Throwable r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f10132c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10132c = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10131b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10132c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f10130a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5c
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f10130a = r4
            r0.f10132c = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$g r3 = new retrofit2.KotlinExtensions$g
            r3.<init>(r0, r4)
            r5.mo18715dispatch(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m9119e(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
