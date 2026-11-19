package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class CombinedContext implements InterfaceC9945d, Serializable {

    /* renamed from: c */
    public final InterfaceC9945d f23347c;

    /* renamed from: d */
    public final InterfaceC9945d.b f23348d;

    public static final class Serialized implements Serializable {

        /* renamed from: d */
        public static final C9941a f23349d = new C9941a(null);

        /* renamed from: c */
        public final InterfaceC9945d[] f23350c;

        /* renamed from: kotlin.coroutines.CombinedContext$Serialized$a */
        public static final class C9941a {
            public /* synthetic */ C9941a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C9941a() {
            }
        }

        public Serialized(InterfaceC9945d[] elements) {
            AbstractC9979u.m20294g(elements, "elements");
            this.f23350c = elements;
        }

        private final Object readResolve() {
            InterfaceC9945d[] interfaceC9945dArr = this.f23350c;
            InterfaceC9945d interfaceC9945dPlus = EmptyCoroutineContext.f23351c;
            for (InterfaceC9945d interfaceC9945d : interfaceC9945dArr) {
                interfaceC9945dPlus = interfaceC9945dPlus.plus(interfaceC9945d);
            }
            return interfaceC9945dPlus;
        }
    }

    public CombinedContext(InterfaceC9945d left, InterfaceC9945d.b element) {
        AbstractC9979u.m20294g(left, "left");
        AbstractC9979u.m20294g(element, "element");
        this.f23347c = left;
        this.f23348d = element;
    }

    /* renamed from: C */
    public static final C10786q m20202C(InterfaceC9945d[] interfaceC9945dArr, Ref$IntRef ref$IntRef, C10786q c10786q, InterfaceC9945d.b element) {
        AbstractC9979u.m20294g(c10786q, "<unused var>");
        AbstractC9979u.m20294g(element, "element");
        int i10 = ref$IntRef.f23400c;
        ref$IntRef.f23400c = i10 + 1;
        interfaceC9945dArr[i10] = element;
        return C10786q.f26013a;
    }

    /* renamed from: r */
    private final int m20205r() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            InterfaceC9945d interfaceC9945d = combinedContext.f23347c;
            combinedContext = interfaceC9945d instanceof CombinedContext ? (CombinedContext) interfaceC9945d : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* renamed from: u */
    public static final String m20206u(String acc, InterfaceC9945d.b element) {
        AbstractC9979u.m20294g(acc, "acc");
        AbstractC9979u.m20294g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final Object writeReplace() {
        int iM20205r = m20205r();
        final InterfaceC9945d[] interfaceC9945dArr = new InterfaceC9945d[iM20205r];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(C10786q.f26013a, new InterfaceC9544p() { // from class: vc.a
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.m20202C(interfaceC9945dArr, ref$IntRef, (C10786q) obj, (InterfaceC9945d.b) obj2);
            }
        });
        if (ref$IntRef.f23400c == iM20205r) {
            return new Serialized(interfaceC9945dArr);
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
        return combinedContext.m20205r() == m20205r() && combinedContext.m20208o(this);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public Object fold(Object obj, InterfaceC9544p operation) {
        AbstractC9979u.m20294g(operation, "operation");
        return operation.invoke(this.f23347c.fold(obj, operation), this.f23348d);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d.b get(InterfaceC9945d.c key) {
        AbstractC9979u.m20294g(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            InterfaceC9945d.b bVar = combinedContext.f23348d.get(key);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC9945d interfaceC9945d = combinedContext.f23347c;
            if (!(interfaceC9945d instanceof CombinedContext)) {
                return interfaceC9945d.get(key);
            }
            combinedContext = (CombinedContext) interfaceC9945d;
        }
    }

    public int hashCode() {
        return this.f23347c.hashCode() + this.f23348d.hashCode();
    }

    /* renamed from: k */
    public final boolean m20207k(InterfaceC9945d.b bVar) {
        return AbstractC9979u.m20289b(get(bVar.getKey()), bVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c key) {
        AbstractC9979u.m20294g(key, "key");
        if (this.f23348d.get(key) != null) {
            return this.f23347c;
        }
        InterfaceC9945d interfaceC9945dMinusKey = this.f23347c.minusKey(key);
        return interfaceC9945dMinusKey == this.f23347c ? this : interfaceC9945dMinusKey == EmptyCoroutineContext.f23351c ? this.f23348d : new CombinedContext(interfaceC9945dMinusKey, this.f23348d);
    }

    /* renamed from: o */
    public final boolean m20208o(CombinedContext combinedContext) {
        while (m20207k(combinedContext.f23348d)) {
            InterfaceC9945d interfaceC9945d = combinedContext.f23347c;
            if (!(interfaceC9945d instanceof CombinedContext)) {
                AbstractC9979u.m20292e(interfaceC9945d, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m20207k((InterfaceC9945d.b) interfaceC9945d);
            }
            combinedContext = (CombinedContext) interfaceC9945d;
        }
        return false;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return InterfaceC9945d.a.m20214b(this, interfaceC9945d);
    }

    public String toString() {
        return '[' + ((String) fold("", new InterfaceC9544p() { // from class: vc.b
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.m20206u((String) obj, (InterfaceC9945d.b) obj2);
            }
        })) + ']';
    }
}
