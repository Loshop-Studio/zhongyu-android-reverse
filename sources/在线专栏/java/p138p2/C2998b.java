package p138p2;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p2.b */
/* loaded from: classes.dex */
public class C2998b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m10105a(@Nullable T t3, @Nullable T t4) {
        if (t3 == t4) {
            return 0;
        }
        if (t3 == null) {
            return -1;
        }
        if (t4 == null) {
            return 1;
        }
        return t3.compareTo(t4);
    }

    @NotNull
    /* renamed from: b */
    public static <T extends Comparable<? super T>> Comparator<T> m10106b() {
        return C3001e.f11578a;
    }
}
