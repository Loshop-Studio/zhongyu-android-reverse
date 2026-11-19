package p168l7;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: l7.d */
/* loaded from: classes5.dex */
public final class C9262d implements Comparator {

    /* renamed from: a */
    public static final C9262d f18262a = new C9262d();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC9133u.m16133g(a10, "a");
        AbstractC9133u.m16133g(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C9263e.f18263a;
    }
}
