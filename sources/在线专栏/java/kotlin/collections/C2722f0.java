package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.f0 */
/* loaded from: classes.dex */
class C2722f0 {
    @NotNull
    /* renamed from: a */
    public static final <T> Set<T> m9079a(T t3) {
        Set<T> setSingleton = Collections.singleton(t3);
        C2769l.m9240d(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
