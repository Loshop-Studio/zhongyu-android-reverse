package p000a.p062p;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;
import java.util.Objects;
import p000a.p015c.p016a.p018b.C0125b;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;
import p000a.p062p.C0404a;

/* renamed from: a.p.b */
/* loaded from: classes.dex */
public final class C0405b {

    /* renamed from: a */
    public final InterfaceC0406c f2359a;

    /* renamed from: b */
    public final C0404a f2360b = new C0404a();

    public C0405b(InterfaceC0406c interfaceC0406c) {
        this.f2359a = interfaceC0406c;
    }

    /* renamed from: a */
    public void m1423a(Bundle bundle) {
        AbstractC0355d abstractC0355dMo1151a = this.f2359a.mo1151a();
        if (((C0359h) abstractC0355dMo1151a).f2171b != AbstractC0355d.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC0355dMo1151a.mo1275a(new Recreator(this.f2359a));
        final C0404a c0404a = this.f2360b;
        if (c0404a.f2356c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            c0404a.f2355b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0355dMo1151a.mo1275a(new InterfaceC0356e() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // p000a.p057m.InterfaceC0356e
            /* renamed from: g */
            public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
                C0404a c0404a2;
                boolean z;
                if (aVar == AbstractC0355d.a.ON_START) {
                    c0404a2 = c0404a;
                    z = true;
                } else {
                    if (aVar != AbstractC0355d.a.ON_STOP) {
                        return;
                    }
                    c0404a2 = c0404a;
                    z = false;
                }
                c0404a2.f2358e = z;
            }
        });
        c0404a.f2356c = true;
    }

    /* renamed from: b */
    public void m1424b(Bundle bundle) {
        C0404a c0404a = this.f2360b;
        Objects.requireNonNull(c0404a);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c0404a.f2355b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0125b<String, C0404a.b>.d dVarM465b = c0404a.f2354a.m465b();
        while (dVarM465b.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarM465b.next();
            bundle2.putBundle((String) entry.getKey(), ((C0404a.b) entry.getValue()).mo21a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
