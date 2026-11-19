package p297y;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* renamed from: y.r */
/* loaded from: classes3.dex */
public final class C9937r implements InterfaceC9922c {

    /* renamed from: a */
    public final View f17868a;

    /* renamed from: b */
    public volatile Deferred f17869b;

    public C9937r(View view, Deferred deferred) {
        this.f17868a = view;
        this.f17869b = deferred;
    }

    @Override // p297y.InterfaceC9922c
    /* renamed from: a */
    public Deferred mo17011a() {
        return this.f17869b;
    }

    /* renamed from: b */
    public void m17121b(Deferred deferred) {
        this.f17869b = deferred;
    }
}
