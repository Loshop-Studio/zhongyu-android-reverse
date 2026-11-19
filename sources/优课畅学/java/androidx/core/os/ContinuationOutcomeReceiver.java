package androidx.core.os;

import android.p012os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9079b;
import kotlin.Result;
import p179m7.InterfaceC9324c;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final InterfaceC9324c<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(InterfaceC9324c<? super R> interfaceC9324c) {
        super(false);
        this.continuation = interfaceC9324c;
    }

    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            InterfaceC9324c<R> interfaceC9324c = this.continuation;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m15909b(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
