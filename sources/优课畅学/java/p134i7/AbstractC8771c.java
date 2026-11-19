package p134i7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p311y7.InterfaceC10668a;

/* renamed from: i7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8771c implements Iterator, InterfaceC10668a {

    /* renamed from: a */
    public int f16449a;

    /* renamed from: b */
    public Object f16450b;

    /* renamed from: a */
    public abstract void mo14506a();

    /* renamed from: b */
    public final void m14507b() {
        this.f16449a = 2;
    }

    /* renamed from: c */
    public final void m14508c(Object obj) {
        this.f16450b = obj;
        this.f16449a = 1;
    }

    /* renamed from: d */
    public final boolean m14509d() {
        this.f16449a = 3;
        mo14506a();
        return this.f16449a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f16449a;
        if (i10 == 0) {
            return m14509d();
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
        int i10 = this.f16449a;
        if (i10 == 1) {
            this.f16449a = 0;
            return this.f16450b;
        }
        if (i10 == 2 || !m14509d()) {
            throw new NoSuchElementException();
        }
        this.f16449a = 0;
        return this.f16450b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
