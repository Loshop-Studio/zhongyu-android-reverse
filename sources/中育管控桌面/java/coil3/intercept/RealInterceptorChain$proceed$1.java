package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.intercept.RealInterceptorChain", m7918f = "RealInterceptorChain.kt", m7919i = {0, 0}, m7920l = {31}, m7921m = "proceed", m7922n = {"interceptor", "next"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class RealInterceptorChain$proceed$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1802a;

    /* renamed from: b */
    public Object f1803b;

    /* renamed from: c */
    public /* synthetic */ Object f1804c;

    /* renamed from: d */
    public final /* synthetic */ RealInterceptorChain f1805d;

    /* renamed from: e */
    public int f1806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, Continuation continuation) {
        super(continuation);
        this.f1805d = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1804c = obj;
        this.f1806e |= Integer.MIN_VALUE;
        return this.f1805d.m1926g(this);
    }
}
