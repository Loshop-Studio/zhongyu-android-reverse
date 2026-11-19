package p214z6;

import java.util.Iterator;
import p160s6.InterfaceC6560a;

/* renamed from: z6.p */
/* loaded from: classes2.dex */
public final class C6838p implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public final Iterator f11590a;

    /* renamed from: b */
    public final /* synthetic */ C6837o f11591b;

    public C6838p(C6837o c6837o) {
        this.f11591b = c6837o;
        this.f11590a = c6837o.f11588b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11590a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f11591b.f11589c.invoke(this.f11590a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
