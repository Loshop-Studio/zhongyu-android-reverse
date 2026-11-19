package coil3.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.RealInterceptorChain", m26211f = "RealInterceptorChain.kt", m26212l = {31}, m26213m = "proceed")
/* loaded from: classes3.dex */
public final class RealInterceptorChain$proceed$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3793c;

    /* renamed from: d */
    public Object f3794d;

    /* renamed from: e */
    public /* synthetic */ Object f3795e;

    /* renamed from: f */
    public final /* synthetic */ RealInterceptorChain f3796f;

    /* renamed from: g */
    public int f3797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3796f = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3795e = obj;
        this.f3797g |= Integer.MIN_VALUE;
        return this.f3796f.m3191g(this);
    }
}
