package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.ExecutionException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC5895f;
import org.jetbrains.annotations.NotNull;
import p049e1.InterfaceFutureC5453a;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Landroidx/concurrent/futures/ToContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Le1/a;", "futureToObserve", "Lkotlinx/coroutines/f;", "continuation", "<init>", "(Le1/a;Lkotlinx/coroutines/f;)V", "Ld6/s;", "run", "()V", "Le1/a;", "getFutureToObserve", "()Le1/a;", "Lkotlinx/coroutines/f;", "getContinuation", "()Lkotlinx/coroutines/f;", "concurrent-futures-ktx"}, m5111k = 1, m5112mv = {1, 4, 0})
/* loaded from: classes2.dex */
final class ToContinuation<T> implements Runnable {

    @NotNull
    private final InterfaceC5895f continuation;

    @NotNull
    private final InterfaceFutureC5453a futureToObserve;

    public ToContinuation(@NotNull InterfaceFutureC5453a futureToObserve, @NotNull InterfaceC5895f continuation) {
        AbstractC5830k.m5331h(futureToObserve, "futureToObserve");
        AbstractC5830k.m5331h(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    @NotNull
    public final InterfaceC5895f getContinuation() {
        return this.continuation;
    }

    @NotNull
    public final InterfaceFutureC5453a getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            this.continuation.mo4965i(null);
            return;
        }
        try {
            this.continuation.resumeWith(Result.m13956constructorimpl(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
        } catch (ExecutionException e) {
            this.continuation.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(ListenableFutureKt.nonNullCause(e))));
        }
    }
}
