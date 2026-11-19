package kotlin;

import androidx.concurrent.futures.AbstractC3193a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8733m;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes5.dex */
final class SafePublicationLazyImpl<T> implements InterfaceC8724d, Serializable {

    /* renamed from: d */
    public static final C9077a f17353d = new C9077a(null);

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f17354e = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");

    /* renamed from: a */
    public volatile InterfaceC10559a f17355a;

    /* renamed from: b */
    public volatile Object f17356b;

    /* renamed from: c */
    public final Object f17357c;

    /* renamed from: kotlin.SafePublicationLazyImpl$a */
    public static final class C9077a {
        public /* synthetic */ C9077a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9077a() {
        }
    }

    public SafePublicationLazyImpl(InterfaceC10559a initializer) {
        AbstractC9133u.m16133g(initializer, "initializer");
        this.f17355a = initializer;
        C8733m c8733m = C8733m.f16362a;
        this.f17356b = c8733m;
        this.f17357c = c8733m;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p123h7.InterfaceC8724d
    public Object getValue() {
        Object obj = this.f17356b;
        C8733m c8733m = C8733m.f16362a;
        if (obj != c8733m) {
            return obj;
        }
        InterfaceC10559a interfaceC10559a = this.f17355a;
        if (interfaceC10559a != null) {
            Object objInvoke = interfaceC10559a.invoke();
            if (AbstractC3193a.m1318a(f17354e, this, c8733m, objInvoke)) {
                this.f17355a = null;
                return objInvoke;
            }
        }
        return this.f17356b;
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return this.f17356b != C8733m.f16362a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
