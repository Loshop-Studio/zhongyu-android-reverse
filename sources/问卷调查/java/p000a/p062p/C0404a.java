package p000a.p062p;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import p000a.p015c.p016a.p018b.C0125b;
import p070b.p071a.p072a.p073a.C0561a;

@SuppressLint({"RestrictedApi"})
/* renamed from: a.p.a */
/* loaded from: classes.dex */
public final class C0404a {

    /* renamed from: b */
    public Bundle f2355b;

    /* renamed from: c */
    public boolean f2356c;

    /* renamed from: d */
    public Recreator.C0559a f2357d;

    /* renamed from: a */
    public C0125b<String, b> f2354a = new C0125b<>();

    /* renamed from: e */
    public boolean f2358e = true;

    /* renamed from: a.p.a$a */
    public interface a {
        /* renamed from: a */
        void mo1422a(InterfaceC0406c interfaceC0406c);
    }

    /* renamed from: a.p.a$b */
    public interface b {
        /* renamed from: a */
        Bundle mo21a();
    }

    /* renamed from: a */
    public Bundle m1419a(String str) {
        if (!this.f2356c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2355b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f2355b.remove(str);
        if (this.f2355b.isEmpty()) {
            this.f2355b = null;
        }
        return bundle2;
    }

    /* renamed from: b */
    public void m1420b(String str, b bVar) {
        if (this.f2354a.mo463d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: c */
    public void m1421c(Class<? extends a> cls) throws NoSuchMethodException, SecurityException {
        if (!this.f2358e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2357d == null) {
            this.f2357d = new Recreator.C0559a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.C0559a c0559a = this.f2357d;
            c0559a.f3501a.add(cls.getName());
        } catch (NoSuchMethodException e2) {
            StringBuilder sbM2079g = C0561a.m2079g("Class");
            sbM2079g.append(cls.getSimpleName());
            sbM2079g.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sbM2079g.toString(), e2);
        }
    }
}
