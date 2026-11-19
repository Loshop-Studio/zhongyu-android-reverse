package okio.internal;

import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

/* loaded from: classes5.dex */
public final class _JavaIoKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        AbstractC9133u.m16133g(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC8661c0.m13973S(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
