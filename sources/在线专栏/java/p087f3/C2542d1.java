package p087f3;

import kotlinx.coroutines.internal.C2805t;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.d1 */
/* loaded from: classes.dex */
public final class C2542d1 {

    /* renamed from: a */
    @NotNull
    private static final C2805t f10232a = new C2805t("REMOVED_TASK");

    /* renamed from: b */
    @NotNull
    private static final C2805t f10233b = new C2805t("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m8543c(long j4) {
        if (j4 <= 0) {
            return 0L;
        }
        if (j4 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j4;
    }
}
