package p160d.p161e;

import java.util.Iterator;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* renamed from: d.e.j */
/* loaded from: classes.dex */
public abstract class AbstractC1004j implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo2801a();

    @Override // java.util.Iterator
    public Integer next() {
        return Integer.valueOf(mo2801a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
