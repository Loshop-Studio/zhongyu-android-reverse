package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: pd.t */
/* loaded from: classes6.dex */
public final class C10672t implements InterfaceC10659g {

    /* renamed from: a */
    public final InterfaceC10659g f25716a;

    /* renamed from: b */
    public final InterfaceC9540l f25717b;

    /* renamed from: pd.t$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final Iterator f25718c;

        /* renamed from: d */
        public int f25719d = -1;

        /* renamed from: e */
        public Object f25720e;

        public a() {
            this.f25718c = C10672t.this.f25716a.iterator();
        }

        /* renamed from: a */
        private final void m22598a() {
            if (this.f25718c.hasNext()) {
                Object next = this.f25718c.next();
                if (((Boolean) C10672t.this.f25717b.invoke(next)).booleanValue()) {
                    this.f25719d = 1;
                    this.f25720e = next;
                    return;
                }
            }
            this.f25719d = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25719d == -1) {
                m22598a();
            }
            return this.f25719d == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f25719d == -1) {
                m22598a();
            }
            if (this.f25719d == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f25720e;
            this.f25720e = null;
            this.f25719d = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10672t(InterfaceC10659g sequence, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(sequence, "sequence");
        AbstractC9979u.m20294g(predicate, "predicate");
        this.f25716a = sequence;
        this.f25717b = predicate;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a();
    }
}
