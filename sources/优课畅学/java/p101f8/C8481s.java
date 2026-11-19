package p101f8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: f8.s */
/* loaded from: classes5.dex */
public final class C8481s implements InterfaceC8469g, InterfaceC8465c {

    /* renamed from: a */
    public final InterfaceC8469g f16084a;

    /* renamed from: b */
    public final int f16085b;

    /* renamed from: f8.s$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public int f16086a;

        /* renamed from: b */
        public final Iterator f16087b;

        public a(C8481s c8481s) {
            this.f16086a = c8481s.f16085b;
            this.f16087b = c8481s.f16084a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16086a > 0 && this.f16087b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f16086a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f16086a = i10 - 1;
            return this.f16087b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8481s(InterfaceC8469g sequence, int i10) {
        AbstractC9133u.m16133g(sequence, "sequence");
        this.f16084a = sequence;
        this.f16085b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // p101f8.InterfaceC8465c
    /* renamed from: a */
    public InterfaceC8469g mo13808a(int i10) {
        int i11 = this.f16085b;
        return i10 >= i11 ? AbstractC8476n.m13832g() : new C8480r(this.f16084a, i10, i11);
    }

    @Override // p101f8.InterfaceC8465c
    /* renamed from: b */
    public InterfaceC8469g mo13809b(int i10) {
        return i10 >= this.f16085b ? this : new C8481s(this.f16084a, i10);
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a(this);
    }
}
