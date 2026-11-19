package p030c6;

import java.util.concurrent.Callable;

/* renamed from: c6.b */
/* loaded from: classes.dex */
public final class CallableC3230b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f1795a;

    public /* synthetic */ CallableC3230b(int i) {
        this.f1795a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1795a) {
            case 0:
                return AbstractC3229a.f1794a;
            case 1:
                return AbstractC3231c.f1796a;
            case 2:
                return AbstractC3232d.f1797a;
            default:
                return AbstractC3233e.f1798a;
        }
    }
}
