package p103m;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7363f implements CoroutineContext {

    /* renamed from: a */
    public final CoroutineContext f9357a;

    public AbstractC7363f(CoroutineContext coroutineContext) {
        this.f9357a = coroutineContext;
    }

    /* renamed from: a */
    public abstract AbstractC7363f mo8365a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2);

    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f9357a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f9357a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f9357a.get(key);
    }

    public int hashCode() {
        return this.f9357a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return mo8365a(this, this.f9357a.minusKey(key));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return mo8365a(this, this.f9357a.plus(coroutineContext));
    }

    public String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f9357a + ")";
    }
}
