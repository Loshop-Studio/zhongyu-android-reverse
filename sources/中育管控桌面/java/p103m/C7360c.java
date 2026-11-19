package p103m;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: m.c */
/* loaded from: classes3.dex */
public final class C7360c extends AbstractC7363f {
    public C7360c(CoroutineContext coroutineContext) {
        super(coroutineContext);
    }

    @Override // p103m.AbstractC7363f
    /* renamed from: a */
    public AbstractC7363f mo8365a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        CoroutineDispatcher coroutineDispatcherM8372c = AbstractC7365h.m8372c(coroutineContext);
        CoroutineDispatcher coroutineDispatcherM8372c2 = AbstractC7365h.m8372c(coroutineContext2);
        if ((coroutineDispatcherM8372c instanceof C7361d) && !Intrinsics.areEqual(coroutineDispatcherM8372c, coroutineDispatcherM8372c2)) {
            ((C7361d) coroutineDispatcherM8372c).m8368g(false);
        }
        return new C7360c(coroutineContext2);
    }
}
