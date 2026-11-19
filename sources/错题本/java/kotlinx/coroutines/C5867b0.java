package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* renamed from: kotlinx.coroutines.b0 */
/* loaded from: classes4.dex */
public class C5867b0 extends AbstractC5863a implements InterfaceC5864a0 {
    @Override // kotlinx.coroutines.InterfaceC5864a0
    /* renamed from: c */
    public final Object mo5425c(SuspendLambda suspendLambda) throws Throwable {
        Object objM5461u = m5461u(suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5461u;
    }
}
