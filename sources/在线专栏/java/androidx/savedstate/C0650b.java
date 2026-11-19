package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0496f;

/* renamed from: androidx.savedstate.b */
/* loaded from: classes.dex */
public final class C0650b {

    /* renamed from: a */
    private final InterfaceC0651c f4133a;

    /* renamed from: b */
    private final SavedStateRegistry f4134b = new SavedStateRegistry();

    private C0650b(InterfaceC0651c interfaceC0651c) {
        this.f4133a = interfaceC0651c;
    }

    /* renamed from: a */
    public static C0650b m3663a(InterfaceC0651c interfaceC0651c) {
        return new C0650b(interfaceC0651c);
    }

    /* renamed from: b */
    public SavedStateRegistry m3664b() {
        return this.f4134b;
    }

    /* renamed from: c */
    public void m3665c(Bundle bundle) {
        AbstractC0496f lifecycle = this.f4133a.getLifecycle();
        if (lifecycle.mo2868b() != AbstractC0496f.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo2867a(new Recreator(this.f4133a));
        this.f4134b.m3659b(lifecycle, bundle);
    }

    /* renamed from: d */
    public void m3666d(Bundle bundle) {
        this.f4134b.m3660c(bundle);
    }
}
