package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p200x6.C6756f;

/* renamed from: kotlin.collections.g0 */
/* loaded from: classes2.dex */
public final class C5789g0 extends AbstractC5786f {

    /* renamed from: a */
    public final List f9183a;

    public C5789g0(List list) {
        this.f9183a = list;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= AbstractC5806u.m5282u(this)) {
            return this.f9183a.get(AbstractC5806u.m5282u(this) - i);
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(i, "Element index ", " must be in range [");
        sbM94s.append(new C6756f(0, AbstractC5806u.m5282u(this), 1));
        sbM94s.append("].");
        throw new IndexOutOfBoundsException(sbM94s.toString());
    }

    @Override // kotlin.collections.AbstractC5786f, kotlin.collections.AbstractC5775a
    /* renamed from: getSize */
    public final int get_size() {
        return this.f9183a.size();
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C5787f0(this, 0);
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final ListIterator listIterator() {
        return new C5787f0(this, 0);
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final ListIterator listIterator(int i) {
        return new C5787f0(this, i);
    }
}
