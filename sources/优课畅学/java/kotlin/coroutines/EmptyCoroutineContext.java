package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class EmptyCoroutineContext implements InterfaceC9100d, Serializable {

    /* renamed from: a */
    public static final EmptyCoroutineContext f17438a = new EmptyCoroutineContext();

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f17438a;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public Object fold(Object obj, InterfaceC10574p operation) {
        AbstractC9133u.m16133g(operation, "operation");
        return obj;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d.b get(InterfaceC9100d.c key) {
        AbstractC9133u.m16133g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c key) {
        AbstractC9133u.m16133g(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d context) {
        AbstractC9133u.m16133g(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
