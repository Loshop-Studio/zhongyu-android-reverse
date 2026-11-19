package p101f8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: f8.r */
/* loaded from: classes5.dex */
public final class C8480r implements InterfaceC8469g, InterfaceC8465c {

    /* renamed from: a */
    public final InterfaceC8469g f16078a;

    /* renamed from: b */
    public final int f16079b;

    /* renamed from: c */
    public final int f16080c;

    /* renamed from: f8.r$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final Iterator f16081a;

        /* renamed from: b */
        public int f16082b;

        public a() {
            this.f16081a = C8480r.this.f16078a.iterator();
        }

        /* renamed from: a */
        private final void m13862a() {
            while (this.f16082b < C8480r.this.f16079b && this.f16081a.hasNext()) {
                this.f16081a.next();
                this.f16082b++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m13862a();
            return this.f16082b < C8480r.this.f16080c && this.f16081a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m13862a();
            if (this.f16082b >= C8480r.this.f16080c) {
                throw new NoSuchElementException();
            }
            this.f16082b++;
            return this.f16081a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8480r(InterfaceC8469g sequence, int i10, int i11) {
        AbstractC9133u.m16133g(sequence, "sequence");
        this.f16078a = sequence;
        this.f16079b = i10;
        this.f16080c = i11;
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

    @Override // p101f8.InterfaceC8465c
    /* renamed from: a */
    public InterfaceC8469g mo13808a(int i10) {
        return i10 >= m13861f() ? AbstractC8476n.m13832g() : new C8480r(this.f16078a, this.f16079b + i10, this.f16080c);
    }

    @Override // p101f8.InterfaceC8465c
    /* renamed from: b */
    public InterfaceC8469g mo13809b(int i10) {
        if (i10 >= m13861f()) {
            return this;
        }
        InterfaceC8469g interfaceC8469g = this.f16078a;
        int i11 = this.f16079b;
        return new C8480r(interfaceC8469g, i11, i10 + i11);
    }

    /* renamed from: f */
    public final int m13861f() {
        return this.f16080c - this.f16079b;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a();
    }
}
