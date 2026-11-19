package kotlin.collections;

import java.util.Set;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.g0 */
/* loaded from: classes.dex */
class C2724g0 extends C2722f0 {
    @NotNull
    /* renamed from: b */
    public static <T> Set<T> m9091b() {
        return C2742x.f10709a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: c */
    public static final <T> Set<T> m9092c(@NotNull Set<? extends T> set) {
        C2769l.m9241e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C2722f0.m9079a(set.iterator().next()) : m9091b();
    }
}
