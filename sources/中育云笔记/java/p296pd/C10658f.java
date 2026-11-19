package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* renamed from: pd.f */
/* loaded from: classes6.dex */
public final class C10658f implements InterfaceC10659g {

    /* renamed from: a */
    public final InterfaceC9529a f25692a;

    /* renamed from: b */
    public final InterfaceC9540l f25693b;

    /* renamed from: pd.f$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public Object f25694c;

        /* renamed from: d */
        public int f25695d = -2;

        public a() {
        }

        /* renamed from: a */
        private final void m22550a() {
            Object objInvoke;
            if (this.f25695d == -2) {
                objInvoke = C10658f.this.f25692a.invoke();
            } else {
                InterfaceC9540l interfaceC9540l = C10658f.this.f25693b;
                Object obj = this.f25694c;
                AbstractC9979u.m20291d(obj);
                objInvoke = interfaceC9540l.invoke(obj);
            }
            this.f25694c = objInvoke;
            this.f25695d = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25695d < 0) {
                m22550a();
            }
            return this.f25695d == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f25695d < 0) {
                m22550a();
            }
            if (this.f25695d == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f25694c;
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f25695d = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10658f(InterfaceC9529a getInitialValue, InterfaceC9540l getNextValue) {
        AbstractC9979u.m20294g(getInitialValue, "getInitialValue");
        AbstractC9979u.m20294g(getNextValue, "getNextValue");
        this.f25692a = getInitialValue;
        this.f25693b = getNextValue;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a();
    }
}
