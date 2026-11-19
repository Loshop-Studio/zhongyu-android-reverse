package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C5961g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p049e1.InterfaceFutureC5453a;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Le1/a;", "await", "(Le1/a;Lh6/c;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "nonNullCause", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, m5111k = 2, m5112mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    @Nullable
    public static final <T> Object await(@NotNull final InterfaceFutureC5453a interfaceFutureC5453a, @NotNull InterfaceC5631c<? super T> interfaceC5631c) throws Throwable {
        try {
            if (interfaceFutureC5453a.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(interfaceFutureC5453a);
            }
            C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
            interfaceFutureC5453a.addListener(new ToContinuation(interfaceFutureC5453a, c5961g), DirectExecutor.INSTANCE);
            c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Throwable th) {
                    interfaceFutureC5453a.cancel(false);
                }
            });
            Object objM5583t = c5961g.m5583t();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM5583t;
        } catch (ExecutionException e) {
            throw nonNullCause(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(@NotNull ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause != null) {
            return cause;
        }
        AbstractC5830k.m5337n();
        throw null;
    }
}
