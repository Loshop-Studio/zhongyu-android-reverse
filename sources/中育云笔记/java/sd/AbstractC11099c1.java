package sd;

import java.util.concurrent.CancellationException;

/* renamed from: sd.c1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11099c1 {
    /* renamed from: a */
    public static final CancellationException m24692a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
