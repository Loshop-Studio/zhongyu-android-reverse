package androidx.core.os;

import android.p013os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9924b;
import kotlin.Result;
import vc.InterfaceC11588c;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final InterfaceC11588c<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(InterfaceC11588c<? super R> interfaceC11588c) {
        super(false);
        this.continuation = interfaceC11588c;
    }

    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            InterfaceC11588c<R> interfaceC11588c = this.continuation;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11588c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m20054c(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
