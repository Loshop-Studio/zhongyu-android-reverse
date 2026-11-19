package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: a */
    public final transient InterfaceC9212n f17582a;

    public TimeoutCancellationException(String str, InterfaceC9212n interfaceC9212n) {
        super(str);
        this.f17582a = interfaceC9212n;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
