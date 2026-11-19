package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: c */
    public final transient InterfaceC10045g f23506c;

    public TimeoutCancellationException(String str, InterfaceC10045g interfaceC10045g) {
        super(str);
        this.f23506c = interfaceC10045g;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
