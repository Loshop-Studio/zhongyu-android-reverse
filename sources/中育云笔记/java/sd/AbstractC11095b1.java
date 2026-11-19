package sd;

import androidx.compose.animation.core.AnimationKt;
import p410xd.C11839c0;

/* renamed from: sd.b1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11095b1 {

    /* renamed from: a */
    public static final C11839c0 f26772a = new C11839c0("REMOVED_TASK");

    /* renamed from: b */
    public static final C11839c0 f26773b = new C11839c0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m24678c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * AnimationKt.MillisToNanos;
    }
}
