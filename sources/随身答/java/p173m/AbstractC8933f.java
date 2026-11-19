package p173m;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m.f */
/* loaded from: classes3.dex */
public abstract class AbstractC8933f implements CoroutineContext {

    /* renamed from: a */
    public final CoroutineContext f14965a;

    public AbstractC8933f(CoroutineContext coroutineContext) {
        this.f14965a = coroutineContext;
    }

    /* renamed from: a */
    public abstract AbstractC8933f mo14221a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2);

    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f14965a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f14965a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f14965a.get(key);
    }

    public int hashCode() {
        return this.f14965a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return mo14221a(this, this.f14965a.minusKey(key));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return mo14221a(this, this.f14965a.plus(coroutineContext));
    }

    public String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f14965a + ")";
    }
}
