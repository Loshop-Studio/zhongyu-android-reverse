package p135i8;

import androidx.compose.animation.core.AnimationKt;
import p191n8.C9442d0;

/* renamed from: i8.q0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8867q0 {

    /* renamed from: a */
    public static final C9442d0 f16533a = new C9442d0("REMOVED_TASK");

    /* renamed from: b */
    public static final C9442d0 f16534b = new C9442d0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m14902c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * AnimationKt.MillisToNanos;
    }
}
