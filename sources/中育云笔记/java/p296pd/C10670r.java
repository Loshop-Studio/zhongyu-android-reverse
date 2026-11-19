package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: pd.r */
/* loaded from: classes6.dex */
public final class C10670r implements InterfaceC10659g, InterfaceC10655c {

    /* renamed from: a */
    public final InterfaceC10659g f25706a;

    /* renamed from: b */
    public final int f25707b;

    /* renamed from: c */
    public final int f25708c;

    /* renamed from: pd.r$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final Iterator f25709c;

        /* renamed from: d */
        public int f25710d;

        public a() {
            this.f25709c = C10670r.this.f25706a.iterator();
        }

        /* renamed from: a */
        private final void m22593a() {
            while (this.f25710d < C10670r.this.f25707b && this.f25709c.hasNext()) {
                this.f25709c.next();
                this.f25710d++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m22593a();
            return this.f25710d < C10670r.this.f25708c && this.f25709c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m22593a();
            if (this.f25710d >= C10670r.this.f25708c) {
                throw new NoSuchElementException();
            }
            this.f25710d++;
            return this.f25709c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10670r(InterfaceC10659g sequence, int i10, int i11) {
        AbstractC9979u.m20294g(sequence, "sequence");
        this.f25706a = sequence;
        this.f25707b = i10;
        this.f25708c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    @Override // p296pd.InterfaceC10655c
    /* renamed from: a */
    public InterfaceC10659g mo22539a(int i10) {
        return i10 >= m22592f() ? AbstractC10666n.m22563g() : new C10670r(this.f25706a, this.f25707b + i10, this.f25708c);
    }

    @Override // p296pd.InterfaceC10655c
    /* renamed from: b */
    public InterfaceC10659g mo22540b(int i10) {
        if (i10 >= m22592f()) {
            return this;
        }
        InterfaceC10659g interfaceC10659g = this.f25706a;
        int i11 = this.f25707b;
        return new C10670r(interfaceC10659g, i11, i10 + i11);
    }

    /* renamed from: f */
    public final int m22592f() {
        return this.f25708c - this.f25707b;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a();
    }
}
