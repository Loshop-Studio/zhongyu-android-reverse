package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class CombinedContext implements InterfaceC9100d, Serializable {

    /* renamed from: a */
    public final InterfaceC9100d f17434a;

    /* renamed from: b */
    public final InterfaceC9100d.b f17435b;

    public static final class Serialized implements Serializable {

        /* renamed from: b */
        public static final C9096a f17436b = new C9096a(null);

        /* renamed from: a */
        public final InterfaceC9100d[] f17437a;

        /* renamed from: kotlin.coroutines.CombinedContext$Serialized$a */
        public static final class C9096a {
            public /* synthetic */ C9096a(AbstractC9126n abstractC9126n) {
                this();
            }

            public C9096a() {
            }
        }

        public Serialized(InterfaceC9100d[] elements) {
            AbstractC9133u.m16133g(elements, "elements");
            this.f17437a = elements;
        }

        private final Object readResolve() {
            InterfaceC9100d[] interfaceC9100dArr = this.f17437a;
            InterfaceC9100d interfaceC9100dPlus = EmptyCoroutineContext.f17438a;
            for (InterfaceC9100d interfaceC9100d : interfaceC9100dArr) {
                interfaceC9100dPlus = interfaceC9100dPlus.plus(interfaceC9100d);
            }
            return interfaceC9100dPlus;
        }
    }

    public CombinedContext(InterfaceC9100d left, InterfaceC9100d.b element) {
        AbstractC9133u.m16133g(left, "left");
        AbstractC9133u.m16133g(element, "element");
        this.f17434a = left;
        this.f17435b = element;
    }

    /* renamed from: q */
    private final int m16059q() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            InterfaceC9100d interfaceC9100d = combinedContext.f17434a;
            combinedContext = interfaceC9100d instanceof CombinedContext ? (CombinedContext) interfaceC9100d : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    /* renamed from: r */
    public static final String m16060r(String acc, InterfaceC9100d.b element) {
        AbstractC9133u.m16133g(acc, "acc");
        AbstractC9133u.m16133g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* renamed from: t */
    public static final C8736p m16061t(InterfaceC9100d[] interfaceC9100dArr, Ref$IntRef ref$IntRef, C8736p c8736p, InterfaceC9100d.b element) {
        AbstractC9133u.m16133g(c8736p, "<unused var>");
        AbstractC9133u.m16133g(element, "element");
        int i10 = ref$IntRef.f17471a;
        ref$IntRef.f17471a = i10 + 1;
        interfaceC9100dArr[i10] = element;
        return C8736p.f16368a;
    }

    private final Object writeReplace() {
        int iM16059q = m16059q();
        final InterfaceC9100d[] interfaceC9100dArr = new InterfaceC9100d[iM16059q];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(C8736p.f16368a, new InterfaceC10574p() { // from class: m7.a
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.m16061t(interfaceC9100dArr, ref$IntRef, (C8736p) obj, (InterfaceC9100d.b) obj2);
            }
        });
        if (ref$IntRef.f17471a == iM16059q) {
            return new Serialized(interfaceC9100dArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) obj;
        return combinedContext.m16059q() == m16059q() && combinedContext.m16063o(this);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public Object fold(Object obj, InterfaceC10574p operation) {
        AbstractC9133u.m16133g(operation, "operation");
        return operation.invoke(this.f17434a.fold(obj, operation), this.f17435b);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d.b get(InterfaceC9100d.c key) {
        AbstractC9133u.m16133g(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            InterfaceC9100d.b bVar = combinedContext.f17435b.get(key);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC9100d interfaceC9100d = combinedContext.f17434a;
            if (!(interfaceC9100d instanceof CombinedContext)) {
                return interfaceC9100d.get(key);
            }
            combinedContext = (CombinedContext) interfaceC9100d;
        }
    }

    public int hashCode() {
        return this.f17434a.hashCode() + this.f17435b.hashCode();
    }

    /* renamed from: m */
    public final boolean m16062m(InterfaceC9100d.b bVar) {
        return AbstractC9133u.m16128b(get(bVar.getKey()), bVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c key) {
        AbstractC9133u.m16133g(key, "key");
        if (this.f17435b.get(key) != null) {
            return this.f17434a;
        }
        InterfaceC9100d interfaceC9100dMinusKey = this.f17434a.minusKey(key);
        return interfaceC9100dMinusKey == this.f17434a ? this : interfaceC9100dMinusKey == EmptyCoroutineContext.f17438a ? this.f17435b : new CombinedContext(interfaceC9100dMinusKey, this.f17435b);
    }

    /* renamed from: o */
    public final boolean m16063o(CombinedContext combinedContext) {
        while (m16062m(combinedContext.f17435b)) {
            InterfaceC9100d interfaceC9100d = combinedContext.f17434a;
            if (!(interfaceC9100d instanceof CombinedContext)) {
                AbstractC9133u.m16131e(interfaceC9100d, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m16062m((InterfaceC9100d.b) interfaceC9100d);
            }
            combinedContext = (CombinedContext) interfaceC9100d;
        }
        return false;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return InterfaceC9100d.a.m16069b(this, interfaceC9100d);
    }

    public String toString() {
        return '[' + ((String) fold("", new InterfaceC10574p() { // from class: m7.b
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.m16060r((String) obj, (InterfaceC9100d.b) obj2);
            }
        })) + ']';
    }
}
