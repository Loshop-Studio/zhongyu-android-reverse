package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8733m;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes5.dex */
final class SynchronizedLazyImpl<T> implements InterfaceC8724d, Serializable {

    /* renamed from: a */
    public InterfaceC10559a f17358a;

    /* renamed from: b */
    public volatile Object f17359b;

    /* renamed from: c */
    public final Object f17360c;

    public SynchronizedLazyImpl(InterfaceC10559a initializer, Object obj) {
        AbstractC9133u.m16133g(initializer, "initializer");
        this.f17358a = initializer;
        this.f17359b = C8733m.f16362a;
        this.f17360c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p123h7.InterfaceC8724d
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f17359b;
        C8733m c8733m = C8733m.f16362a;
        if (obj != c8733m) {
            return obj;
        }
        synchronized (this.f17360c) {
            objInvoke = this.f17359b;
            if (objInvoke == c8733m) {
                InterfaceC10559a interfaceC10559a = this.f17358a;
                AbstractC9133u.m16130d(interfaceC10559a);
                objInvoke = interfaceC10559a.invoke();
                this.f17359b = objInvoke;
                this.f17358a = null;
            }
        }
        return objInvoke;
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return this.f17359b != C8733m.f16362a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(InterfaceC10559a interfaceC10559a, Object obj, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a, (i10 & 2) != 0 ? null : obj);
    }
}
