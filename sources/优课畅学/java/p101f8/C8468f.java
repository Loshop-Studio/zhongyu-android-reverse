package p101f8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: f8.f */
/* loaded from: classes5.dex */
public final class C8468f implements InterfaceC8469g {

    /* renamed from: a */
    public final InterfaceC10559a f16064a;

    /* renamed from: b */
    public final InterfaceC10570l f16065b;

    /* renamed from: f8.f$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public Object f16066a;

        /* renamed from: b */
        public int f16067b = -2;

        public a() {
        }

        /* renamed from: a */
        private final void m13819a() {
            Object objInvoke;
            if (this.f16067b == -2) {
                objInvoke = C8468f.this.f16064a.invoke();
            } else {
                InterfaceC10570l interfaceC10570l = C8468f.this.f16065b;
                Object obj = this.f16066a;
                AbstractC9133u.m16130d(obj);
                objInvoke = interfaceC10570l.invoke(obj);
            }
            this.f16066a = objInvoke;
            this.f16067b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16067b < 0) {
                m13819a();
            }
            return this.f16067b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f16067b < 0) {
                m13819a();
            }
            if (this.f16067b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f16066a;
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f16067b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8468f(InterfaceC10559a getInitialValue, InterfaceC10570l getNextValue) {
        AbstractC9133u.m16133g(getInitialValue, "getInitialValue");
        AbstractC9133u.m16133g(getNextValue, "getNextValue");
        this.f16064a = getInitialValue;
        this.f16065b = getNextValue;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a();
    }
}
