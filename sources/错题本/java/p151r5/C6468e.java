package p151r5;

import android.os.Handler;
import io.reactivex.internal.operators.observable.RunnableC5713i;
import java.util.concurrent.TimeUnit;
import p145q5.AbstractC6438i;
import p145q5.AbstractC6439j;
import p159s5.InterfaceC6559b;

/* renamed from: r5.e */
/* loaded from: classes3.dex */
public final class C6468e extends AbstractC6439j {

    /* renamed from: a */
    public final Handler f10645a;

    public C6468e(Handler handler) {
        this.f10645a = handler;
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: a */
    public final AbstractC6438i mo5086a() {
        return new C6466c(this.f10645a);
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: b */
    public final InterfaceC6559b mo5087b(RunnableC5713i runnableC5713i) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f10645a;
        RunnableC6467d runnableC6467d = new RunnableC6467d(handler, runnableC5713i);
        handler.postDelayed(runnableC6467d, timeUnit.toMillis(0L));
        return runnableC6467d;
    }
}
