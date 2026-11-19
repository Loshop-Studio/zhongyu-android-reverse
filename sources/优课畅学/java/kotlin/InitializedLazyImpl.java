package kotlin;

import java.io.Serializable;
import p123h7.InterfaceC8724d;

/* loaded from: classes5.dex */
public final class InitializedLazyImpl<T> implements InterfaceC8724d, Serializable {

    /* renamed from: a */
    public final Object f17342a;

    public InitializedLazyImpl(Object obj) {
        this.f17342a = obj;
    }

    @Override // p123h7.InterfaceC8724d
    public Object getValue() {
        return this.f17342a;
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
