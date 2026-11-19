package p364uc;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: uc.e */
/* loaded from: classes6.dex */
public final class C11385e implements Comparator {

    /* renamed from: c */
    public static final C11385e f27208c = new C11385e();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC9979u.m20294g(a10, "a");
        AbstractC9979u.m20294g(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C11384d.f27207c;
    }
}
