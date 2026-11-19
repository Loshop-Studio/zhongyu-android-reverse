package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p160s6.InterfaceC6560a;

/* renamed from: kotlin.collections.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5777b implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public int f9165a;

    /* renamed from: b */
    public Object f9166b;

    /* renamed from: a */
    public abstract void mo5120a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9165a;
        if (i == 0) {
            this.f9165a = 3;
            mo5120a();
            return this.f9165a == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9165a;
        if (i == 1) {
            this.f9165a = 0;
            return this.f9166b;
        }
        if (i != 2) {
            this.f9165a = 3;
            mo5120a();
            if (this.f9165a == 1) {
                this.f9165a = 0;
                return this.f9166b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
