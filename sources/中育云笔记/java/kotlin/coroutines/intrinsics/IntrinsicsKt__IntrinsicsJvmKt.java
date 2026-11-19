package kotlin.coroutines.intrinsics;

import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static InterfaceC11588c m20221a(final InterfaceC9540l interfaceC9540l, InterfaceC11588c completion) {
        AbstractC9979u.m20294g(interfaceC9540l, "<this>");
        AbstractC9979u.m20294g(completion, "completion");
        final InterfaceC11588c<?> interfaceC11588cM26219a = AbstractC11831f.m26219a(completion);
        if (interfaceC9540l instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC9540l).create(interfaceC11588cM26219a);
        }
        final InterfaceC9945d context = interfaceC11588cM26219a.getContext();
        return context == EmptyCoroutineContext.f23351c ? new RestrictedContinuationImpl(interfaceC11588cM26219a, interfaceC9540l) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

            /* renamed from: c */
            public int f23361c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC9540l f23362d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC11588cM26219a);
                this.f23362d = interfaceC9540l;
                AbstractC9979u.m20292e(interfaceC11588cM26219a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f23361c;
                if (i10 == 0) {
                    this.f23361c = 1;
                    AbstractC9924b.m20071b(obj);
                    AbstractC9979u.m20292e(this.f23362d, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC9540l) AbstractC9962d0.m20254e(this.f23362d, 1)).invoke(this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f23361c = 2;
                AbstractC9924b.m20071b(obj);
                return obj;
            }
        } : new ContinuationImpl(interfaceC11588cM26219a, context, interfaceC9540l) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

            /* renamed from: c */
            public int f23363c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC9540l f23364d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC11588cM26219a, context);
                this.f23364d = interfaceC9540l;
                AbstractC9979u.m20292e(interfaceC11588cM26219a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f23363c;
                if (i10 == 0) {
                    this.f23363c = 1;
                    AbstractC9924b.m20071b(obj);
                    AbstractC9979u.m20292e(this.f23364d, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC9540l) AbstractC9962d0.m20254e(this.f23364d, 1)).invoke(this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f23363c = 2;
                AbstractC9924b.m20071b(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static InterfaceC11588c m20222b(final InterfaceC9544p interfaceC9544p, final Object obj, InterfaceC11588c completion) {
        AbstractC9979u.m20294g(interfaceC9544p, "<this>");
        AbstractC9979u.m20294g(completion, "completion");
        final InterfaceC11588c<?> interfaceC11588cM26219a = AbstractC11831f.m26219a(completion);
        if (interfaceC9544p instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC9544p).create(obj, interfaceC11588cM26219a);
        }
        final InterfaceC9945d context = interfaceC11588cM26219a.getContext();
        return context == EmptyCoroutineContext.f23351c ? new RestrictedContinuationImpl(interfaceC11588cM26219a, interfaceC9544p, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* renamed from: c */
            public int f23365c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC9544p f23366d;

            /* renamed from: e */
            public final /* synthetic */ Object f23367e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC11588cM26219a);
                this.f23366d = interfaceC9544p;
                this.f23367e = obj;
                AbstractC9979u.m20292e(interfaceC11588cM26219a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj2) throws Throwable {
                int i10 = this.f23365c;
                if (i10 == 0) {
                    this.f23365c = 1;
                    AbstractC9924b.m20071b(obj2);
                    AbstractC9979u.m20292e(this.f23366d, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC9544p) AbstractC9962d0.m20254e(this.f23366d, 2)).invoke(this.f23367e, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f23365c = 2;
                AbstractC9924b.m20071b(obj2);
                return obj2;
            }
        } : new ContinuationImpl(interfaceC11588cM26219a, context, interfaceC9544p, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: c */
            public int f23368c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC9544p f23369d;

            /* renamed from: e */
            public final /* synthetic */ Object f23370e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC11588cM26219a, context);
                this.f23369d = interfaceC9544p;
                this.f23370e = obj;
                AbstractC9979u.m20292e(interfaceC11588cM26219a, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj2) throws Throwable {
                int i10 = this.f23368c;
                if (i10 == 0) {
                    this.f23368c = 1;
                    AbstractC9924b.m20071b(obj2);
                    AbstractC9979u.m20292e(this.f23369d, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((InterfaceC9544p) AbstractC9962d0.m20254e(this.f23369d, 2)).invoke(this.f23370e, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f23368c = 2;
                AbstractC9924b.m20071b(obj2);
                return obj2;
            }
        };
    }

    /* renamed from: c */
    public static final InterfaceC11588c m20223c(final InterfaceC11588c interfaceC11588c) {
        final InterfaceC9945d context = interfaceC11588c.getContext();
        return context == EmptyCoroutineContext.f23351c ? new RestrictedContinuationImpl(interfaceC11588c) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC11588c);
                AbstractC9979u.m20292e(interfaceC11588c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9924b.m20071b(obj);
                return obj;
            }
        } : new ContinuationImpl(interfaceC11588c, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC11588c, context);
                AbstractC9979u.m20292e(interfaceC11588c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9924b.m20071b(obj);
                return obj;
            }
        };
    }

    /* renamed from: d */
    public static InterfaceC11588c m20224d(InterfaceC11588c interfaceC11588c) {
        InterfaceC11588c<Object> interfaceC11588cIntercepted;
        AbstractC9979u.m20294g(interfaceC11588c, "<this>");
        ContinuationImpl continuationImpl = interfaceC11588c instanceof ContinuationImpl ? (ContinuationImpl) interfaceC11588c : null;
        return (continuationImpl == null || (interfaceC11588cIntercepted = continuationImpl.intercepted()) == null) ? interfaceC11588c : interfaceC11588cIntercepted;
    }

    /* renamed from: e */
    public static Object m20225e(InterfaceC9544p interfaceC9544p, Object obj, InterfaceC11588c completion) {
        AbstractC9979u.m20294g(interfaceC9544p, "<this>");
        AbstractC9979u.m20294g(completion, "completion");
        return ((InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2)).invoke(obj, m20223c(AbstractC11831f.m26219a(completion)));
    }
}
