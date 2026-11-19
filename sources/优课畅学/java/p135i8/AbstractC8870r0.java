package p135i8;

import java.util.concurrent.CancellationException;

/* renamed from: i8.r0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8870r0 {
    /* renamed from: a */
    public static final CancellationException m14906a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
