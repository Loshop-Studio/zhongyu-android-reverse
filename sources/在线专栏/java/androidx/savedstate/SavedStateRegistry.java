package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import androidx.savedstate.Recreator;
import java.util.Map;
import p098i.C2661b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f4127b;

    /* renamed from: c */
    private boolean f4128c;

    /* renamed from: d */
    private Recreator.C0645a f4129d;

    /* renamed from: a */
    private C2661b<String, InterfaceC0648b> f4126a = new C2661b<>();

    /* renamed from: e */
    boolean f4130e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface InterfaceC0647a {
        /* renamed from: a */
        void mo2823a(InterfaceC0651c interfaceC0651c);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface InterfaceC0648b {
        /* renamed from: a */
        Bundle mo65a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle m3658a(String str) {
        if (!this.f4128c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f4127b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f4127b.remove(str);
        if (this.f4127b.isEmpty()) {
            this.f4127b = null;
        }
        return bundle2;
    }

    /* renamed from: b */
    void m3659b(AbstractC0496f abstractC0496f, Bundle bundle) {
        if (this.f4128c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f4127b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0496f.mo2867a(new InterfaceC0501i() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
                if (bVar == AbstractC0496f.b.ON_START) {
                    SavedStateRegistry.this.f4130e = true;
                } else if (bVar == AbstractC0496f.b.ON_STOP) {
                    SavedStateRegistry.this.f4130e = false;
                }
            }
        });
        this.f4128c = true;
    }

    /* renamed from: c */
    void m3660c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4127b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2661b<String, InterfaceC0648b>.d dVarM8936c = this.f4126a.m8936c();
        while (dVarM8936c.hasNext()) {
            Map.Entry next = dVarM8936c.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC0648b) next.getValue()).mo65a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m3661d(String str, InterfaceC0648b interfaceC0648b) {
        if (this.f4126a.mo8932f(str, interfaceC0648b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m3662e(Class<? extends InterfaceC0647a> cls) throws NoSuchMethodException, SecurityException {
        if (!this.f4130e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4129d == null) {
            this.f4129d = new Recreator.C0645a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f4129d.m3657b(cls.getName());
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
