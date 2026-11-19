package coil3.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.EngineInterceptor", m26211f = "EngineInterceptor.kt", m26212l = {75}, m26213m = "intercept")
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3746c;

    /* renamed from: d */
    public Object f3747d;

    /* renamed from: e */
    public Object f3748e;

    /* renamed from: f */
    public Object f3749f;

    /* renamed from: g */
    public Object f3750g;

    /* renamed from: h */
    public Object f3751h;

    /* renamed from: i */
    public Object f3752i;

    /* renamed from: j */
    public Object f3753j;

    /* renamed from: k */
    public Object f3754k;

    /* renamed from: l */
    public Object f3755l;

    /* renamed from: m */
    public /* synthetic */ Object f3756m;

    /* renamed from: n */
    public final /* synthetic */ EngineInterceptor f3757n;

    /* renamed from: o */
    public int f3758o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3757n = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3756m = obj;
        this.f3758o |= Integer.MIN_VALUE;
        return this.f3757n.mo3174a(null, this);
    }
}
