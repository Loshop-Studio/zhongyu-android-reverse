package p151r5;

import android.os.Handler;
import android.os.Message;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import p145q5.AbstractC6438i;
import p159s5.InterfaceC6559b;

/* renamed from: r5.c */
/* loaded from: classes3.dex */
public final class C6466c extends AbstractC6438i {

    /* renamed from: a */
    public final Handler f10641a;

    /* renamed from: b */
    public volatile boolean f10642b;

    public C6466c(Handler handler) {
        this.f10641a = handler;
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: a */
    public final InterfaceC6559b mo5084a(Runnable runnable, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit2 == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f10642b) {
            return EmptyDisposable.INSTANCE;
        }
        Handler handler = this.f10641a;
        RunnableC6467d runnableC6467d = new RunnableC6467d(handler, runnable);
        Message messageObtain = Message.obtain(handler, runnableC6467d);
        messageObtain.obj = this;
        this.f10641a.sendMessageDelayed(messageObtain, timeUnit2.toMillis(0L));
        if (!this.f10642b) {
            return runnableC6467d;
        }
        this.f10641a.removeCallbacks(runnableC6467d);
        return EmptyDisposable.INSTANCE;
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        this.f10642b = true;
        this.f10641a.removeCallbacksAndMessages(this);
    }
}
