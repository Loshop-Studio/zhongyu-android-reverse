package p101f8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: f8.u */
/* loaded from: classes5.dex */
public final class C8483u implements InterfaceC8469g {

    /* renamed from: a */
    public final InterfaceC8469g f16094a;

    /* renamed from: b */
    public final InterfaceC10570l f16095b;

    /* renamed from: f8.u$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final Iterator f16096a;

        public a() {
            this.f16096a = C8483u.this.f16094a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16096a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C8483u.this.f16095b.invoke(this.f16096a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8483u(InterfaceC8469g sequence, InterfaceC10570l transformer) {
        AbstractC9133u.m16133g(sequence, "sequence");
        AbstractC9133u.m16133g(transformer, "transformer");
        this.f16094a = sequence;
        this.f16095b = transformer;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a();
    }
}
