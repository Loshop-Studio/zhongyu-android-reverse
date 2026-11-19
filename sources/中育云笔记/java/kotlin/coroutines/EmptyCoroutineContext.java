package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes6.dex */
public final class EmptyCoroutineContext implements InterfaceC9945d, Serializable {

    /* renamed from: c */
    public static final EmptyCoroutineContext f23351c = new EmptyCoroutineContext();

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f23351c;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public Object fold(Object obj, InterfaceC9544p operation) {
        AbstractC9979u.m20294g(operation, "operation");
        return obj;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d.b get(InterfaceC9945d.c key) {
        AbstractC9979u.m20294g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c key) {
        AbstractC9979u.m20294g(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d context) {
        AbstractC9979u.m20294g(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
