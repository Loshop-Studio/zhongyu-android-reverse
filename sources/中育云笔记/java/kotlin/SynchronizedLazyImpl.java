package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10783n;
import p309qc.InterfaceC10773d;

/* loaded from: classes6.dex */
final class SynchronizedLazyImpl<T> implements InterfaceC10773d, Serializable {

    /* renamed from: c */
    public InterfaceC9529a f23271c;

    /* renamed from: d */
    public volatile Object f23272d;

    /* renamed from: e */
    public final Object f23273e;

    public SynchronizedLazyImpl(InterfaceC9529a initializer, Object obj) {
        AbstractC9979u.m20294g(initializer, "initializer");
        this.f23271c = initializer;
        this.f23272d = C10783n.f26007a;
        this.f23273e = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p309qc.InterfaceC10773d
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f23272d;
        C10783n c10783n = C10783n.f26007a;
        if (obj != c10783n) {
            return obj;
        }
        synchronized (this.f23273e) {
            objInvoke = this.f23272d;
            if (objInvoke == c10783n) {
                InterfaceC9529a interfaceC9529a = this.f23271c;
                AbstractC9979u.m20291d(interfaceC9529a);
                objInvoke = interfaceC9529a.invoke();
                this.f23272d = objInvoke;
                this.f23271c = null;
            }
        }
        return objInvoke;
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return this.f23272d != C10783n.f26007a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(InterfaceC9529a interfaceC9529a, Object obj, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC9529a, (i10 & 2) != 0 ? null : obj);
    }
}
