package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: pd.e */
/* loaded from: classes6.dex */
public final class C10657e implements InterfaceC10659g {

    /* renamed from: a */
    public final InterfaceC10659g f25685a;

    /* renamed from: b */
    public final boolean f25686b;

    /* renamed from: c */
    public final InterfaceC9540l f25687c;

    /* renamed from: pd.e$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final Iterator f25688c;

        /* renamed from: d */
        public int f25689d = -1;

        /* renamed from: e */
        public Object f25690e;

        public a() {
            this.f25688c = C10657e.this.f25685a.iterator();
        }

        /* renamed from: a */
        public final void m22547a() {
            while (this.f25688c.hasNext()) {
                Object next = this.f25688c.next();
                if (((Boolean) C10657e.this.f25687c.invoke(next)).booleanValue() == C10657e.this.f25686b) {
                    this.f25690e = next;
                    this.f25689d = 1;
                    return;
                }
            }
            this.f25689d = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25689d == -1) {
                m22547a();
            }
            return this.f25689d == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f25689d == -1) {
                m22547a();
            }
            if (this.f25689d == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f25690e;
            this.f25690e = null;
            this.f25689d = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10657e(InterfaceC10659g sequence, boolean z10, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(sequence, "sequence");
        AbstractC9979u.m20294g(predicate, "predicate");
        this.f25685a = sequence;
        this.f25686b = z10;
        this.f25687c = predicate;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a();
    }
}
