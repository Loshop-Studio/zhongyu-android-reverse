package kotlin;

import androidx.concurrent.futures.AbstractC3223a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10783n;
import p309qc.InterfaceC10773d;

/* loaded from: classes6.dex */
final class SafePublicationLazyImpl<T> implements InterfaceC10773d, Serializable {

    /* renamed from: f */
    public static final C9922a f23266f = new C9922a(null);

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f23267g = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "d");

    /* renamed from: c */
    public volatile InterfaceC9529a f23268c;

    /* renamed from: d */
    public volatile Object f23269d;

    /* renamed from: e */
    public final Object f23270e;

    /* renamed from: kotlin.SafePublicationLazyImpl$a */
    public static final class C9922a {
        public /* synthetic */ C9922a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9922a() {
        }
    }

    public SafePublicationLazyImpl(InterfaceC9529a initializer) {
        AbstractC9979u.m20294g(initializer, "initializer");
        this.f23268c = initializer;
        C10783n c10783n = C10783n.f26007a;
        this.f23269d = c10783n;
        this.f23270e = c10783n;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p309qc.InterfaceC10773d
    public Object getValue() {
        Object obj = this.f23269d;
        C10783n c10783n = C10783n.f26007a;
        if (obj != c10783n) {
            return obj;
        }
        InterfaceC9529a interfaceC9529a = this.f23268c;
        if (interfaceC9529a != null) {
            Object objInvoke = interfaceC9529a.invoke();
            if (AbstractC3223a.m1395a(f23267g, this, c10783n, objInvoke)) {
                this.f23268c = null;
                return objInvoke;
            }
        }
        return this.f23269d;
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return this.f23269d != C10783n.f26007a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
