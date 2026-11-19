package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p080j3.C3812d0;
import p080j3.C3827n;
import p080j3.InterfaceC3807b;
import p080j3.InterfaceC3811d;

/* loaded from: classes2.dex */
public abstract class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C4527a implements InterfaceC3811d {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f5669a;

        public C4527a(CancellableContinuation cancellableContinuation) {
            this.f5669a = cancellableContinuation;
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: a */
        public void mo5015a(InterfaceC3807b call, C3812d0 response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (!response.m5023e()) {
                CancellableContinuation cancellableContinuation = this.f5669a;
                HttpException httpException = new HttpException(response);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(httpException)));
                return;
            }
            Object objM5020a = response.m5020a();
            if (objM5020a != null) {
                this.f5669a.resumeWith(Result.m11788constructorimpl(objM5020a));
                return;
            }
            Object objM6140i = call.mo4982S().m6140i(C3827n.class);
            if (objM6140i == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(objM6140i, "call.request().tag(Invocation::class.java)!!");
            Method method = ((C3827n) objM6140i).m5082a();
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
            CancellableContinuation cancellableContinuation2 = this.f5669a;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: b */
        public void mo5016b(InterfaceC3807b call, Throwable t3) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t3, "t");
            CancellableContinuation cancellableContinuation = this.f5669a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(t3)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C4528b implements InterfaceC3811d {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f5670a;

        public C4528b(CancellableContinuation cancellableContinuation) {
            this.f5670a = cancellableContinuation;
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: a */
        public void mo5015a(InterfaceC3807b call, C3812d0 response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (response.m5023e()) {
                this.f5670a.resumeWith(Result.m11788constructorimpl(response.m5020a()));
                return;
            }
            CancellableContinuation cancellableContinuation = this.f5670a;
            HttpException httpException = new HttpException(response);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(httpException)));
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: b */
        public void mo5016b(InterfaceC3807b call, Throwable t3) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t3, "t");
            CancellableContinuation cancellableContinuation = this.f5670a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(t3)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C4529c implements InterfaceC3811d {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f5671a;

        public C4529c(CancellableContinuation cancellableContinuation) {
            this.f5671a = cancellableContinuation;
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: a */
        public void mo5015a(InterfaceC3807b call, C3812d0 response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            this.f5671a.resumeWith(Result.m11788constructorimpl(response));
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: b */
        public void mo5016b(InterfaceC3807b call, Throwable t3) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t3, "t");
            CancellableContinuation cancellableContinuation = this.f5671a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(t3)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class RunnableC4530d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Continuation f5672a;

        /* renamed from: b */
        public final /* synthetic */ Exception f5673b;

        public RunnableC4530d(Continuation continuation, Exception exc) {
            this.f5672a = continuation;
            this.f5673b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f5672a);
            Exception exc = this.f5673b;
            Result.Companion companion = Result.INSTANCE;
            continuationIntercepted.resumeWith(Result.m11788constructorimpl(ResultKt.createFailure(exc)));
        }
    }

    /* renamed from: a */
    public static final Object m6163a(final InterfaceC3807b interfaceC3807b, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
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
                interfaceC3807b.cancel();
            }
        });
        interfaceC3807b.mo4984U(new C4527a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: b */
    public static final Object m6164b(final InterfaceC3807b interfaceC3807b, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
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
                interfaceC3807b.cancel();
            }
        });
        interfaceC3807b.mo4984U(new C4528b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: c */
    public static final Object m6165c(final InterfaceC3807b interfaceC3807b, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
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
                interfaceC3807b.cancel();
            }
        });
        interfaceC3807b.mo4984U(new C4529c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
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
    public static final java.lang.Object m6166d(java.lang.Exception r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f5675b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5675b = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5674a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5675b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f5676c
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
            r0.f5676c = r4
            r0.f5675b = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$d r3 = new retrofit2.KotlinExtensions$d
            r3.<init>(r0, r4)
            r5.mo13351dispatch(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m6166d(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
