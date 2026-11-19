package p173m;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: m.c */
/* loaded from: classes3.dex */
public final class C8930c extends AbstractC8933f {
    public C8930c(CoroutineContext coroutineContext) {
        super(coroutineContext);
    }

    @Override // p173m.AbstractC8933f
    /* renamed from: a */
    public AbstractC8933f mo14221a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        CoroutineDispatcher coroutineDispatcherM14230e = AbstractC8937j.m14230e(coroutineContext);
        CoroutineDispatcher coroutineDispatcherM14230e2 = AbstractC8937j.m14230e(coroutineContext2);
        if ((coroutineDispatcherM14230e instanceof C8931d) && !Intrinsics.areEqual(coroutineDispatcherM14230e, coroutineDispatcherM14230e2)) {
            ((C8931d) coroutineDispatcherM14230e).m14224g(false);
        }
        return new C8930c(coroutineContext2);
    }
}
