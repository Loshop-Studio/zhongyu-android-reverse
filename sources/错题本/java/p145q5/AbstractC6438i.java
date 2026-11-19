package p145q5;

import java.util.concurrent.TimeUnit;
import p159s5.InterfaceC6559b;

/* renamed from: q5.i */
/* loaded from: classes3.dex */
public abstract class AbstractC6438i implements InterfaceC6559b {
    /* renamed from: a */
    public abstract InterfaceC6559b mo5084a(Runnable runnable, TimeUnit timeUnit);

    /* renamed from: b */
    public void mo5085b(Runnable runnable) {
        mo5084a(runnable, TimeUnit.NANOSECONDS);
    }
}
