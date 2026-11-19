package p007a6;

import android.support.v4.media.AbstractC0037f;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p145q5.InterfaceC6436g;
import p159s5.InterfaceC6559b;
import p183v5.AbstractC6668a;
import p185v7.AbstractC6675d;

/* renamed from: a6.a */
/* loaded from: classes.dex */
public abstract class AbstractC0018a implements InterfaceC6436g, InterfaceC6559b {

    /* renamed from: a */
    public final AtomicReference f54a = new AtomicReference();

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        DisposableHelper.dispose(this.f54a);
    }

    @Override // p145q5.InterfaceC6436g
    public final void onSubscribe(InterfaceC6559b interfaceC6559b) {
        AtomicReference atomicReference;
        Class<?> cls = getClass();
        AbstractC6668a.m6328a(interfaceC6559b, "next is null");
        do {
            atomicReference = this.f54a;
            if (atomicReference.compareAndSet(null, interfaceC6559b)) {
                return;
            }
        } while (atomicReference.get() == null);
        interfaceC6559b.dispose();
        if (atomicReference.get() != DisposableHelper.DISPOSED) {
            String name = cls.getName();
            AbstractC6675d.m6351q(new ProtocolViolationException(AbstractC0037f.m87l("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
        }
    }
}
