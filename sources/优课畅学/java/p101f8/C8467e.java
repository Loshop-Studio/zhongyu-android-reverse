package p101f8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: f8.e */
/* loaded from: classes5.dex */
public final class C8467e implements InterfaceC8469g {

    /* renamed from: a */
    public final InterfaceC8469g f16057a;

    /* renamed from: b */
    public final boolean f16058b;

    /* renamed from: c */
    public final InterfaceC10570l f16059c;

    /* renamed from: f8.e$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final Iterator f16060a;

        /* renamed from: b */
        public int f16061b = -1;

        /* renamed from: c */
        public Object f16062c;

        public a() {
            this.f16060a = C8467e.this.f16057a.iterator();
        }

        /* renamed from: a */
        public final void m13816a() {
            while (this.f16060a.hasNext()) {
                Object next = this.f16060a.next();
                if (((Boolean) C8467e.this.f16059c.invoke(next)).booleanValue() == C8467e.this.f16058b) {
                    this.f16062c = next;
                    this.f16061b = 1;
                    return;
                }
            }
            this.f16061b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16061b == -1) {
                m13816a();
            }
            return this.f16061b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f16061b == -1) {
                m13816a();
            }
            if (this.f16061b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f16062c;
            this.f16062c = null;
            this.f16061b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8467e(InterfaceC8469g sequence, boolean z10, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(sequence, "sequence");
        AbstractC9133u.m16133g(predicate, "predicate");
        this.f16057a = sequence;
        this.f16058b = z10;
        this.f16059c = predicate;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a();
    }
}
