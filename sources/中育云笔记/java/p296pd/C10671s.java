package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: pd.s */
/* loaded from: classes6.dex */
public final class C10671s implements InterfaceC10659g, InterfaceC10655c {

    /* renamed from: a */
    public final InterfaceC10659g f25712a;

    /* renamed from: b */
    public final int f25713b;

    /* renamed from: pd.s$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public int f25714c;

        /* renamed from: d */
        public final Iterator f25715d;

        public a(C10671s c10671s) {
            this.f25714c = c10671s.f25713b;
            this.f25715d = c10671s.f25712a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25714c > 0 && this.f25715d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f25714c;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f25714c = i10 - 1;
            return this.f25715d.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10671s(InterfaceC10659g sequence, int i10) {
        AbstractC9979u.m20294g(sequence, "sequence");
        this.f25712a = sequence;
        this.f25713b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // p296pd.InterfaceC10655c
    /* renamed from: a */
    public InterfaceC10659g mo22539a(int i10) {
        int i11 = this.f25713b;
        return i10 >= i11 ? AbstractC10666n.m22563g() : new C10670r(this.f25712a, i10, i11);
    }

    @Override // p296pd.InterfaceC10655c
    /* renamed from: b */
    public InterfaceC10659g mo22540b(int i10) {
        return i10 >= this.f25713b ? this : new C10671s(this.f25712a, i10);
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a(this);
    }
}
