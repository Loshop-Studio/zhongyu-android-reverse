package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10783n;
import p309qc.InterfaceC10773d;

/* loaded from: classes6.dex */
public final class UnsafeLazyImpl<T> implements InterfaceC10773d, Serializable {

    /* renamed from: c */
    public InterfaceC9529a f23277c;

    /* renamed from: d */
    public Object f23278d;

    public UnsafeLazyImpl(InterfaceC9529a initializer) {
        AbstractC9979u.m20294g(initializer, "initializer");
        this.f23277c = initializer;
        this.f23278d = C10783n.f26007a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p309qc.InterfaceC10773d
    public Object getValue() {
        if (this.f23278d == C10783n.f26007a) {
            InterfaceC9529a interfaceC9529a = this.f23277c;
            AbstractC9979u.m20291d(interfaceC9529a);
            this.f23278d = interfaceC9529a.invoke();
            this.f23277c = null;
        }
        return this.f23278d;
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return this.f23278d != C10783n.f26007a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
