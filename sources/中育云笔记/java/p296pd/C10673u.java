package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: pd.u */
/* loaded from: classes6.dex */
public final class C10673u implements InterfaceC10659g {

    /* renamed from: a */
    public final InterfaceC10659g f25722a;

    /* renamed from: b */
    public final InterfaceC9540l f25723b;

    /* renamed from: pd.u$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final Iterator f25724c;

        public a() {
            this.f25724c = C10673u.this.f25722a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25724c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C10673u.this.f25723b.invoke(this.f25724c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10673u(InterfaceC10659g sequence, InterfaceC9540l transformer) {
        AbstractC9979u.m20294g(sequence, "sequence");
        AbstractC9979u.m20294g(transformer, "transformer");
        this.f25722a = sequence;
        this.f25723b = transformer;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a();
    }
}
