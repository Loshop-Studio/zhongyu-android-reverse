package p168l7;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: l7.e */
/* loaded from: classes5.dex */
public final class C9263e implements Comparator {

    /* renamed from: a */
    public static final C9263e f18263a = new C9263e();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC9133u.m16133g(a10, "a");
        AbstractC9133u.m16133g(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C9262d.f18262a;
    }
}
