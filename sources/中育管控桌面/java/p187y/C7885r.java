package p187y;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* renamed from: y.r */
/* loaded from: classes3.dex */
public final class C7885r implements InterfaceC7870c {

    /* renamed from: a */
    public final View f10607a;

    /* renamed from: b */
    public volatile Deferred f10608b;

    public C7885r(View view, Deferred deferred) {
        this.f10607a = view;
        this.f10608b = deferred;
    }

    @Override // p187y.InterfaceC7870c
    /* renamed from: a */
    public Deferred mo9567a() {
        return this.f10608b;
    }

    /* renamed from: b */
    public void m9675b(Deferred deferred) {
        this.f10608b = deferred;
    }
}
