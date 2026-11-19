package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: pd.b */
/* loaded from: classes6.dex */
public final class C10654b implements InterfaceC10659g, InterfaceC10655c {

    /* renamed from: a */
    public final InterfaceC10659g f25680a;

    /* renamed from: b */
    public final int f25681b;

    /* renamed from: pd.b$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final Iterator f25682c;

        /* renamed from: d */
        public int f25683d;

        public a(C10654b c10654b) {
            this.f25682c = c10654b.f25680a.iterator();
            this.f25683d = c10654b.f25681b;
        }

        /* renamed from: a */
        public final void m22541a() {
            while (this.f25683d > 0 && this.f25682c.hasNext()) {
                this.f25682c.next();
                this.f25683d--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m22541a();
            return this.f25682c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m22541a();
            return this.f25682c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10654b(InterfaceC10659g sequence, int i10) {
        AbstractC9979u.m20294g(sequence, "sequence");
        this.f25680a = sequence;
        this.f25681b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // p296pd.InterfaceC10655c
    /* renamed from: a */
    public InterfaceC10659g mo22539a(int i10) {
        int i11 = this.f25681b + i10;
        return i11 < 0 ? new C10654b(this, i10) : new C10654b(this.f25680a, i11);
    }

    @Override // p296pd.InterfaceC10655c
    /* renamed from: b */
    public InterfaceC10659g mo22540b(int i10) {
        int i11 = this.f25681b;
        int i12 = i11 + i10;
        return i12 < 0 ? new C10671s(this, i10) : new C10670r(this.f25680a, i11, i12);
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a(this);
    }
}
