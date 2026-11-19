package p101f8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: f8.b */
/* loaded from: classes5.dex */
public final class C8464b implements InterfaceC8469g, InterfaceC8465c {

    /* renamed from: a */
    public final InterfaceC8469g f16052a;

    /* renamed from: b */
    public final int f16053b;

    /* renamed from: f8.b$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final Iterator f16054a;

        /* renamed from: b */
        public int f16055b;

        public a(C8464b c8464b) {
            this.f16054a = c8464b.f16052a.iterator();
            this.f16055b = c8464b.f16053b;
        }

        /* renamed from: a */
        public final void m13810a() {
            while (this.f16055b > 0 && this.f16054a.hasNext()) {
                this.f16054a.next();
                this.f16055b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m13810a();
            return this.f16054a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m13810a();
            return this.f16054a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8464b(InterfaceC8469g sequence, int i10) {
        AbstractC9133u.m16133g(sequence, "sequence");
        this.f16052a = sequence;
        this.f16053b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // p101f8.InterfaceC8465c
    /* renamed from: a */
    public InterfaceC8469g mo13808a(int i10) {
        int i11 = this.f16053b + i10;
        return i11 < 0 ? new C8464b(this, i10) : new C8464b(this.f16052a, i11);
    }

    @Override // p101f8.InterfaceC8465c
    /* renamed from: b */
    public InterfaceC8469g mo13809b(int i10) {
        int i11 = this.f16053b;
        int i12 = i11 + i10;
        return i12 < 0 ? new C8481s(this, i10) : new C8480r(this.f16052a, i11, i12);
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a(this);
    }
}
