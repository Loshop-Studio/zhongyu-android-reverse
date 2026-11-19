package p214z6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p160s6.InterfaceC6560a;

/* renamed from: z6.e */
/* loaded from: classes2.dex */
public final class C6827e implements Iterator, InterfaceC6560a {

    /* renamed from: b */
    public final Iterator f11567b;

    /* renamed from: d */
    public Object f11569d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6830h f11570e;

    /* renamed from: a */
    public final /* synthetic */ int f11566a = 0;

    /* renamed from: c */
    public int f11568c = -1;

    public C6827e(C6828f c6828f) {
        this.f11570e = c6828f;
        this.f11567b = c6828f.f11571a.iterator();
    }

    /* renamed from: a */
    public void m6488a() {
        Object next;
        C6828f c6828f = (C6828f) this.f11570e;
        do {
            Iterator it = this.f11567b;
            if (!it.hasNext()) {
                this.f11568c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c6828f.f11573c.invoke(next)).booleanValue() != c6828f.f11572b);
        this.f11569d = next;
        this.f11568c = 1;
    }

    /* renamed from: b */
    public void m6489b() {
        Iterator it = this.f11567b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((C6837o) this.f11570e).f11589c.invoke(next)).booleanValue()) {
                this.f11568c = 1;
                this.f11569d = next;
                return;
            }
        }
        this.f11568c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11566a) {
            case 0:
                if (this.f11568c == -1) {
                    m6488a();
                }
                if (this.f11568c == 1) {
                }
                break;
            default:
                if (this.f11568c == -1) {
                    m6489b();
                }
                if (this.f11568c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11566a) {
            case 0:
                if (this.f11568c == -1) {
                    m6488a();
                }
                if (this.f11568c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f11569d;
                this.f11569d = null;
                this.f11568c = -1;
                return obj;
            default:
                if (this.f11568c == -1) {
                    m6489b();
                }
                if (this.f11568c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f11569d;
                this.f11569d = null;
                this.f11568c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11566a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6827e(C6837o c6837o) {
        this.f11570e = c6837o;
        this.f11567b = c6837o.f11588b.iterator();
    }
}
