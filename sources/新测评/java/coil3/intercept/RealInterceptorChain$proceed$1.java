package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.intercept.RealInterceptorChain", m13596f = "RealInterceptorChain.kt", m13597i = {0, 0}, m13598l = {31}, m13599m = "proceed", m13600n = {"interceptor", "next"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class RealInterceptorChain$proceed$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3118a;

    /* renamed from: b */
    public Object f3119b;

    /* renamed from: c */
    public /* synthetic */ Object f3120c;

    /* renamed from: d */
    public final /* synthetic */ RealInterceptorChain f3121d;

    /* renamed from: e */
    public int f3122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, Continuation continuation) {
        super(continuation);
        this.f3121d = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3120c = obj;
        this.f3122e |= Integer.MIN_VALUE;
        return this.f3121d.mo3096b(this);
    }
}
