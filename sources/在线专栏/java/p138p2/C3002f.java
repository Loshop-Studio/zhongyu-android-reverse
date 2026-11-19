package p138p2;

import java.util.Comparator;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: p2.f */
/* loaded from: classes.dex */
final class C3002f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    @NotNull
    public static final C3002f f11579a = new C3002f();

    private C3002f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull Comparable<Object> a4, @NotNull Comparable<Object> b4) {
        C2769l.m9241e(a4, "a");
        C2769l.m9241e(b4, "b");
        return b4.compareTo(a4);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C3001e.f11578a;
    }
}
