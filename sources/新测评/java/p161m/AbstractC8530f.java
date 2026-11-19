package p161m;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m.f */
/* loaded from: classes3.dex */
public abstract class AbstractC8530f implements CoroutineContext {

    /* renamed from: a */
    public final CoroutineContext f14163a;

    public AbstractC8530f(CoroutineContext coroutineContext) {
        this.f14163a = coroutineContext;
    }

    /* renamed from: a */
    public abstract AbstractC8530f mo14019a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2);

    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f14163a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f14163a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f14163a.get(key);
    }

    public int hashCode() {
        return this.f14163a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return mo14019a(this, this.f14163a.minusKey(key));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return mo14019a(this, this.f14163a.plus(coroutineContext));
    }

    public String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f14163a + ")";
    }
}
