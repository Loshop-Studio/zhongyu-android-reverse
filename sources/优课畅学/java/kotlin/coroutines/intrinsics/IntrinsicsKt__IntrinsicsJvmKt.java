package kotlin.coroutines.intrinsics;

import kotlin.AbstractC9079b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static InterfaceC9324c m16076a(final InterfaceC10570l interfaceC10570l, InterfaceC9324c completion) {
        AbstractC9133u.m16133g(interfaceC10570l, "<this>");
        AbstractC9133u.m16133g(completion, "completion");
        final InterfaceC9324c<?> interfaceC9324cM17809a = AbstractC9541f.m17809a(completion);
        if (interfaceC10570l instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC10570l).create(interfaceC9324cM17809a);
        }
        final InterfaceC9100d context = interfaceC9324cM17809a.getContext();
        return context == EmptyCoroutineContext.f17438a ? new RestrictedContinuationImpl(interfaceC9324cM17809a, interfaceC10570l) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

            /* renamed from: a */
            public int f17448a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10570l f17449b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9324cM17809a);
                this.f17449b = interfaceC10570l;
                AbstractC9133u.m16131e(interfaceC9324cM17809a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f17448a;
                if (i10 == 0) {
                    this.f17448a = 1;
                    AbstractC9079b.m15926b(obj);
                    AbstractC9133u.m16131e(this.f17449b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC10570l) AbstractC9116d0.m16096e(this.f17449b, 1)).invoke(this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f17448a = 2;
                AbstractC9079b.m15926b(obj);
                return obj;
            }
        } : new ContinuationImpl(interfaceC9324cM17809a, context, interfaceC10570l) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

            /* renamed from: a */
            public int f17450a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10570l f17451b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9324cM17809a, context);
                this.f17451b = interfaceC10570l;
                AbstractC9133u.m16131e(interfaceC9324cM17809a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f17450a;
                if (i10 == 0) {
                    this.f17450a = 1;
                    AbstractC9079b.m15926b(obj);
                    AbstractC9133u.m16131e(this.f17451b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC10570l) AbstractC9116d0.m16096e(this.f17451b, 1)).invoke(this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f17450a = 2;
                AbstractC9079b.m15926b(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static InterfaceC9324c m16077b(final InterfaceC10574p interfaceC10574p, final Object obj, InterfaceC9324c completion) {
        AbstractC9133u.m16133g(interfaceC10574p, "<this>");
        AbstractC9133u.m16133g(completion, "completion");
        final InterfaceC9324c<?> interfaceC9324cM17809a = AbstractC9541f.m17809a(completion);
        if (interfaceC10574p instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC10574p).create(obj, interfaceC9324cM17809a);
        }
        final InterfaceC9100d context = interfaceC9324cM17809a.getContext();
        return context == EmptyCoroutineContext.f17438a ? new RestrictedContinuationImpl(interfaceC9324cM17809a, interfaceC10574p, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* renamed from: a */
            public int f17452a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10574p f17453b;

            /* renamed from: c */
            public final /* synthetic */ Object f17454c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9324cM17809a);
                this.f17453b = interfaceC10574p;
                this.f17454c = obj;
                AbstractC9133u.m16131e(interfaceC9324cM17809a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj2) throws Throwable {
                int i10 = this.f17452a;
                if (i10 == 0) {
                    this.f17452a = 1;
                    AbstractC9079b.m15926b(obj2);
                    AbstractC9133u.m16131e(this.f17453b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC10574p) AbstractC9116d0.m16096e(this.f17453b, 2)).invoke(this.f17454c, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f17452a = 2;
                AbstractC9079b.m15926b(obj2);
                return obj2;
            }
        } : new ContinuationImpl(interfaceC9324cM17809a, context, interfaceC10574p, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: a */
            public int f17455a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10574p f17456b;

            /* renamed from: c */
            public final /* synthetic */ Object f17457c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9324cM17809a, context);
                this.f17456b = interfaceC10574p;
                this.f17457c = obj;
                AbstractC9133u.m16131e(interfaceC9324cM17809a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj2) throws Throwable {
                int i10 = this.f17455a;
                if (i10 == 0) {
                    this.f17455a = 1;
                    AbstractC9079b.m15926b(obj2);
                    AbstractC9133u.m16131e(this.f17456b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC10574p) AbstractC9116d0.m16096e(this.f17456b, 2)).invoke(this.f17457c, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f17455a = 2;
                AbstractC9079b.m15926b(obj2);
                return obj2;
            }
        };
    }

    /* renamed from: c */
    public static final InterfaceC9324c m16078c(final InterfaceC9324c interfaceC9324c) {
        final InterfaceC9100d context = interfaceC9324c.getContext();
        return context == EmptyCoroutineContext.f17438a ? new RestrictedContinuationImpl(interfaceC9324c) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9324c);
                AbstractC9133u.m16131e(interfaceC9324c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9079b.m15926b(obj);
                return obj;
            }
        } : new ContinuationImpl(interfaceC9324c, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9324c, context);
                AbstractC9133u.m16131e(interfaceC9324c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9079b.m15926b(obj);
                return obj;
            }
        };
    }

    /* renamed from: d */
    public static InterfaceC9324c m16079d(InterfaceC9324c interfaceC9324c) {
        InterfaceC9324c<Object> interfaceC9324cIntercepted;
        AbstractC9133u.m16133g(interfaceC9324c, "<this>");
        ContinuationImpl continuationImpl = interfaceC9324c instanceof ContinuationImpl ? (ContinuationImpl) interfaceC9324c : null;
        return (continuationImpl == null || (interfaceC9324cIntercepted = continuationImpl.intercepted()) == null) ? interfaceC9324c : interfaceC9324cIntercepted;
    }

    /* renamed from: e */
    public static Object m16080e(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c completion) {
        AbstractC9133u.m16133g(interfaceC10574p, "<this>");
        AbstractC9133u.m16133g(completion, "completion");
        return ((InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2)).invoke(obj, m16078c(AbstractC9541f.m17809a(completion)));
    }
}
