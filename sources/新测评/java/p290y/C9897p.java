package p290y;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* renamed from: y.p */
/* loaded from: classes3.dex */
public final class C9897p implements InterfaceC9884c {

    /* renamed from: a */
    public final View f17632a;

    /* renamed from: b */
    public volatile Deferred f17633b;

    public C9897p(View view, Deferred deferred) {
        this.f17632a = view;
        this.f17633b = deferred;
    }

    @Override // p290y.InterfaceC9884c
    /* renamed from: a */
    public Deferred mo16610a() {
        return this.f17633b;
    }

    /* renamed from: b */
    public void m16712b(Deferred deferred) {
        this.f17633b = deferred;
    }
}
