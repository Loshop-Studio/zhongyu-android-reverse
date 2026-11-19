package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0493d0;
import androidx.lifecycle.C0506n;
import androidx.lifecycle.InterfaceC0495e0;
import androidx.savedstate.C0650b;
import androidx.savedstate.InterfaceC0651c;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
class C0474w implements InterfaceC0651c, InterfaceC0495e0 {

    /* renamed from: a */
    private final Fragment f3315a;

    /* renamed from: b */
    private final C0493d0 f3316b;

    /* renamed from: c */
    private C0506n f3317c = null;

    /* renamed from: d */
    private C0650b f3318d = null;

    C0474w(Fragment fragment, C0493d0 c0493d0) {
        this.f3315a = fragment;
        this.f3316b = c0493d0;
    }

    /* renamed from: a */
    void m2766a(AbstractC0496f.b bVar) {
        this.f3317c.m2891h(bVar);
    }

    /* renamed from: b */
    void m2767b() {
        if (this.f3317c == null) {
            this.f3317c = new C0506n(this);
            this.f3318d = C0650b.m3663a(this);
        }
    }

    /* renamed from: c */
    boolean m2768c() {
        return this.f3317c != null;
    }

    /* renamed from: d */
    void m2769d(Bundle bundle) {
        this.f3318d.m3665c(bundle);
    }

    /* renamed from: e */
    void m2770e(Bundle bundle) {
        this.f3318d.m3666d(bundle);
    }

    /* renamed from: f */
    void m2771f(AbstractC0496f.c cVar) {
        this.f3317c.m2893o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0504l
    public AbstractC0496f getLifecycle() {
        m2767b();
        return this.f3317c;
    }

    @Override // androidx.savedstate.InterfaceC0651c
    public SavedStateRegistry getSavedStateRegistry() {
        m2767b();
        return this.f3318d.m3664b();
    }

    @Override // androidx.lifecycle.InterfaceC0495e0
    public C0493d0 getViewModelStore() {
        m2767b();
        return this.f3316b;
    }
}
