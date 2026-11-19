package retrofit2;

import java.lang.reflect.Method;
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
import p038c9.C5285k;
import p038c9.C5298x;
import p038c9.InterfaceC5274b;
import p038c9.InterfaceC5278d;

/* loaded from: classes5.dex */
public abstract class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C9453a implements InterfaceC5278d {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f16486a;

        public C9453a(CancellableContinuation cancellableContinuation) {
            this.f16486a = cancellableContinuation;
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: a */
        public void mo236a(InterfaceC5274b call, Throwable t9) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t9, "t");
            CancellableContinuation cancellableContinuation = this.f16486a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(t9)));
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: b */
        public void mo237b(InterfaceC5274b call, C5298x response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (!response.m2524f()) {
                CancellableContinuation cancellableContinuation = this.f16486a;
                HttpException httpException = new HttpException(response);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(httpException)));
                return;
            }
            Object objM2520a = response.m2520a();
            if (objM2520a != null) {
                this.f16486a.resumeWith(Result.m24758constructorimpl(objM2520a));
                return;
            }
            Object objM14136i = call.mo233a().m14136i(C5285k.class);
            if (objM14136i == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(objM14136i, "call.request().tag(Invocation::class.java)!!");
            Method method = ((C5285k) objM14136i).m2458a();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(method.getName());
            sb.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
            CancellableContinuation cancellableContinuation2 = this.f16486a;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C9454b implements InterfaceC5278d {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f16487a;

        public C9454b(CancellableContinuation cancellableContinuation) {
            this.f16487a = cancellableContinuation;
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: a */
        public void mo236a(InterfaceC5274b call, Throwable t9) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t9, "t");
            CancellableContinuation cancellableContinuation = this.f16487a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(t9)));
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: b */
        public void mo237b(InterfaceC5274b call, C5298x response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (response.m2524f()) {
                this.f16487a.resumeWith(Result.m24758constructorimpl(response.m2520a()));
                return;
            }
            CancellableContinuation cancellableContinuation = this.f16487a;
            HttpException httpException = new HttpException(response);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(httpException)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C9455c implements InterfaceC5278d {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f16488a;

        public C9455c(CancellableContinuation cancellableContinuation) {
            this.f16488a = cancellableContinuation;
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: a */
        public void mo236a(InterfaceC5274b call, Throwable t9) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t9, "t");
            CancellableContinuation cancellableContinuation = this.f16488a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(t9)));
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: b */
        public void mo237b(InterfaceC5274b call, C5298x response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            this.f16488a.resumeWith(Result.m24758constructorimpl(response));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class RunnableC9456d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Continuation f16489a;

        /* renamed from: b */
        public final /* synthetic */ Exception f16490b;

        public RunnableC9456d(Continuation continuation, Exception exc) {
            this.f16489a = continuation;
            this.f16490b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.f16489a);
            Exception exc = this.f16490b;
            Result.Companion companion = Result.INSTANCE;
            continuationIntercepted.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(exc)));
        }
    }

    /* renamed from: a */
    public static final Object m15621a(final InterfaceC5274b interfaceC5274b, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                interfaceC5274b.cancel();
            }
        });
        interfaceC5274b.mo234c(new C9453a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: b */
    public static final Object m15622b(final InterfaceC5274b interfaceC5274b, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                interfaceC5274b.cancel();
            }
        });
        interfaceC5274b.mo234c(new C9454b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: c */
    public static final Object m15623c(final InterfaceC5274b interfaceC5274b, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                interfaceC5274b.cancel();
            }
        });
        interfaceC5274b.mo234c(new C9455c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15624d(java.lang.Exception r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f16492b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16492b = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16491a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16492b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f16493c
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f16493c = r4
            r0.f16492b = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$d r3 = new retrofit2.KotlinExtensions$d
            r3.<init>(r0, r4)
            r5.mo26290dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m15624d(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
