package p213p8;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.CoroutineDispatcher;
import p191n8.AbstractC9461n;

/* renamed from: p8.l */
/* loaded from: classes5.dex */
public final class C9772l extends CoroutineDispatcher {

    /* renamed from: a */
    public static final C9772l f19503a = new C9772l();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        C9762b.f19484g.m18280o(runnable, AbstractC9771k.f19502h, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        C9762b.f19484g.m18280o(runnable, AbstractC9771k.f19502h, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10) {
        AbstractC9461n.m17380a(i10);
        return i10 >= AbstractC9771k.f19498d ? this : super.limitedParallelism(i10);
    }
}
