package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8733m;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements InterfaceC8724d, Serializable {

    /* renamed from: a */
    public InterfaceC10559a f17364a;

    /* renamed from: b */
    public Object f17365b;

    public UnsafeLazyImpl(InterfaceC10559a initializer) {
        AbstractC9133u.m16133g(initializer, "initializer");
        this.f17364a = initializer;
        this.f17365b = C8733m.f16362a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p123h7.InterfaceC8724d
    public Object getValue() {
        if (this.f17365b == C8733m.f16362a) {
            InterfaceC10559a interfaceC10559a = this.f17364a;
            AbstractC9133u.m16130d(interfaceC10559a);
            this.f17365b = interfaceC10559a.invoke();
            this.f17364a = null;
        }
        return this.f17365b;
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return this.f17365b != C8733m.f16362a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
