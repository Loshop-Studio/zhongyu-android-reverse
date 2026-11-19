package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.q */
/* loaded from: classes.dex */
public class C2735q extends C2734p {
    /* renamed from: r */
    public static <T> boolean m9151r(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        C2769l.m9241e(collection, "<this>");
        C2769l.m9241e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z3 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: s */
    public static <T> boolean m9152s(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        C2769l.m9241e(collection, "<this>");
        C2769l.m9241e(elements, "elements");
        return collection.addAll(C2723g.m9080b(elements));
    }
}
