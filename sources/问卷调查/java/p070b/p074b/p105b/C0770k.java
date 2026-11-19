package p070b.p074b.p105b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b.b.b.k */
/* loaded from: classes.dex */
public final class C0770k extends AbstractC0773n implements Iterable<AbstractC0773n> {

    /* renamed from: b */
    public final List<AbstractC0773n> f4441b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0770k) && ((C0770k) obj).f4441b.equals(this.f4441b));
    }

    public int hashCode() {
        return this.f4441b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC0773n> iterator() {
        return this.f4441b.iterator();
    }
}
