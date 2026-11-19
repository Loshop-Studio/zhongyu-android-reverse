package p135i8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p179m7.InterfaceC9324c;

/* renamed from: i8.m */
/* loaded from: classes5.dex */
public final class C8854m extends C8884w {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16521c = AtomicIntegerFieldUpdater.newUpdater(C8854m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C8854m(InterfaceC9324c interfaceC9324c, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC9324c + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }

    /* renamed from: e */
    public final boolean m14883e() {
        return f16521c.compareAndSet(this, 0, 1);
    }
}
