package okio.internal;

import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

/* loaded from: classes6.dex */
public final class _JavaIoKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        AbstractC9979u.m20294g(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC10793c0.m23108U(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
