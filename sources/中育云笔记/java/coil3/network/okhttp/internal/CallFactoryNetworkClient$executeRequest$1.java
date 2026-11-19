package coil3.network.okhttp.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", m26211f = "utils.kt", m26212l = {24, 24, 25}, m26213m = "executeRequest-impl")
/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f3870c;

    /* renamed from: d */
    public Object f3871d;

    /* renamed from: e */
    public Object f3872e;

    /* renamed from: f */
    public Object f3873f;

    /* renamed from: g */
    public Object f3874g;

    /* renamed from: h */
    public int f3875h;

    /* renamed from: i */
    public /* synthetic */ Object f3876i;

    /* renamed from: j */
    public int f3877j;

    public CallFactoryNetworkClient$executeRequest$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3876i = obj;
        this.f3877j |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.m3255e(null, null, null, this);
    }
}
