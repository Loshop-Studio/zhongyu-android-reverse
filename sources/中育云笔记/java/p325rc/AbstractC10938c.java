package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rc.c */
/* loaded from: classes6.dex */
public abstract class AbstractC10938c implements Iterator, InterfaceC9624a {

    /* renamed from: c */
    public int f26443c;

    /* renamed from: d */
    public Object f26444d;

    /* renamed from: a */
    public abstract void mo2912a();

    /* renamed from: b */
    public final void m23874b() {
        this.f26443c = 2;
    }

    /* renamed from: c */
    public final void m23875c(Object obj) {
        this.f26444d = obj;
        this.f26443c = 1;
    }

    /* renamed from: d */
    public final boolean m23876d() {
        this.f26443c = 3;
        mo2912a();
        return this.f26443c == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f26443c;
        if (i10 == 0) {
            return m23876d();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f26443c;
        if (i10 == 1) {
            this.f26443c = 0;
            return this.f26444d;
        }
        if (i10 == 2 || !m23876d()) {
            throw new NoSuchElementException();
        }
        this.f26443c = 0;
        return this.f26444d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
