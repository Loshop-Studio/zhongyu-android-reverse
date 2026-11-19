package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.DispatchException;
import p054e7.AbstractC5469a;

/* renamed from: retrofit2.a */
/* loaded from: classes4.dex */
public final class ExecutorC6482a implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f10666a;

    /* renamed from: b */
    public final Object f10667b;

    public ExecutorC6482a(int i) {
        this.f10666a = i;
        switch (i) {
            case 1:
                this.f10667b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f10667b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws DispatchException {
        switch (this.f10666a) {
            case 0:
                ((Handler) this.f10667b).post(runnable);
                break;
            case 1:
                ((Handler) this.f10667b).post(runnable);
                break;
            default:
                AbstractC5995r abstractC5995r = (AbstractC5995r) this.f10667b;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (!AbstractC5469a.m4834j(abstractC5995r, emptyCoroutineContext)) {
                    runnable.run();
                    break;
                } else {
                    AbstractC5469a.m4833i(abstractC5995r, emptyCoroutineContext, runnable);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f10666a) {
            case 2:
                return ((AbstractC5995r) this.f10667b).toString();
            default:
                return super.toString();
        }
    }

    public ExecutorC6482a(AbstractC5995r abstractC5995r) {
        this.f10666a = 2;
        this.f10667b = abstractC5995r;
    }
}
