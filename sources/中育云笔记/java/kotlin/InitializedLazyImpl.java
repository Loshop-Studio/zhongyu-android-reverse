package kotlin;

import java.io.Serializable;
import p309qc.InterfaceC10773d;

/* loaded from: classes6.dex */
public final class InitializedLazyImpl<T> implements InterfaceC10773d, Serializable {

    /* renamed from: c */
    public final Object f23255c;

    public InitializedLazyImpl(Object obj) {
        this.f23255c = obj;
    }

    @Override // p309qc.InterfaceC10773d
    public Object getValue() {
        return this.f23255c;
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
