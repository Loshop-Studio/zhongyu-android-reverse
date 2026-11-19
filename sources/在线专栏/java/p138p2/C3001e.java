package p138p2;

import java.util.Comparator;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: p2.e */
/* loaded from: classes.dex */
final class C3001e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    @NotNull
    public static final C3001e f11578a = new C3001e();

    private C3001e() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull Comparable<Object> a4, @NotNull Comparable<Object> b4) {
        C2769l.m9241e(a4, "a");
        C2769l.m9241e(b4, "b");
        return a4.compareTo(b4);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C3002f.f11579a;
    }
}
