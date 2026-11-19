package p101f8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: f8.t */
/* loaded from: classes5.dex */
public final class C8482t implements InterfaceC8469g {

    /* renamed from: a */
    public final InterfaceC8469g f16088a;

    /* renamed from: b */
    public final InterfaceC10570l f16089b;

    /* renamed from: f8.t$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final Iterator f16090a;

        /* renamed from: b */
        public int f16091b = -1;

        /* renamed from: c */
        public Object f16092c;

        public a() {
            this.f16090a = C8482t.this.f16088a.iterator();
        }

        /* renamed from: a */
        private final void m13867a() {
            if (this.f16090a.hasNext()) {
                Object next = this.f16090a.next();
                if (((Boolean) C8482t.this.f16089b.invoke(next)).booleanValue()) {
                    this.f16091b = 1;
                    this.f16092c = next;
                    return;
                }
            }
            this.f16091b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16091b == -1) {
                m13867a();
            }
            return this.f16091b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f16091b == -1) {
                m13867a();
            }
            if (this.f16091b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f16092c;
            this.f16092c = null;
            this.f16091b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8482t(InterfaceC8469g sequence, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(sequence, "sequence");
        AbstractC9133u.m16133g(predicate, "predicate");
        this.f16088a = sequence;
        this.f16089b = predicate;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a();
    }
}
