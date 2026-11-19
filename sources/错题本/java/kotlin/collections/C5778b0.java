package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5830k;
import p160s6.InterfaceC6560a;
import p214z6.C6824b;

/* renamed from: kotlin.collections.b0 */
/* loaded from: classes2.dex */
public final class C5778b0 implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public final /* synthetic */ int f9167a = 0;

    /* renamed from: b */
    public final Iterator f9168b;

    /* renamed from: c */
    public int f9169c;

    public C5778b0(Iterator iterator) {
        AbstractC5830k.m5330g(iterator, "iterator");
        this.f9168b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f9167a) {
            case 0:
                return this.f9168b.hasNext();
            case 1:
                break;
            default:
                return this.f9169c > 0 && this.f9168b.hasNext();
        }
        while (true) {
            int i = this.f9169c;
            it = this.f9168b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f9169c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f9167a) {
            case 0:
                int i = this.f9169c;
                this.f9169c = i + 1;
                if (i >= 0) {
                    return new C5776a0(i, this.f9168b.next());
                }
                AbstractC5806u.m5258L();
                throw null;
            case 1:
                break;
            default:
                int i8 = this.f9169c;
                if (i8 == 0) {
                    throw new NoSuchElementException();
                }
                this.f9169c = i8 - 1;
                return this.f9168b.next();
        }
        while (true) {
            int i9 = this.f9169c;
            it = this.f9168b;
            if (i9 > 0 && it.hasNext()) {
                it.next();
                this.f9169c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9167a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5778b0(C6824b c6824b, byte b6) {
        this.f9169c = c6824b.f11564c;
        this.f9168b = c6824b.f11563b.iterator();
    }

    public C5778b0(C6824b c6824b) {
        this.f9168b = c6824b.f11563b.iterator();
        this.f9169c = c6824b.f11564c;
    }
}
