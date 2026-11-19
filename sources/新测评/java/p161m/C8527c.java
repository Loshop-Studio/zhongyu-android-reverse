package p161m;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: m.c */
/* loaded from: classes3.dex */
public final class C8527c extends AbstractC8530f {
    public C8527c(CoroutineContext coroutineContext) {
        super(coroutineContext);
    }

    @Override // p161m.AbstractC8530f
    /* renamed from: a */
    public AbstractC8530f mo14019a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        CoroutineDispatcher coroutineDispatcherM14028e = AbstractC8534j.m14028e(coroutineContext);
        CoroutineDispatcher coroutineDispatcherM14028e2 = AbstractC8534j.m14028e(coroutineContext2);
        if ((coroutineDispatcherM14028e instanceof C8528d) && !Intrinsics.areEqual(coroutineDispatcherM14028e, coroutineDispatcherM14028e2)) {
            ((C8528d) coroutineDispatcherM14028e).m14022g(false);
        }
        return new C8527c(coroutineContext2);
    }
}
