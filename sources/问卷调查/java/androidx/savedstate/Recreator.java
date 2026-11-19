package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;
import p000a.p062p.C0404a;
import p000a.p062p.InterfaceC0406c;
import p070b.p071a.p072a.p073a.C0561a;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0356e {

    /* renamed from: a */
    public final InterfaceC0406c f3500a;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C0559a implements C0404a.b {

        /* renamed from: a */
        public final Set<String> f3501a = new HashSet();

        public C0559a(C0404a c0404a) {
            c0404a.m1420b("androidx.savedstate.Restarter", this);
        }

        @Override // p000a.p062p.C0404a.b
        /* renamed from: a */
        public Bundle mo21a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3501a));
            return bundle;
        }
    }

    public Recreator(InterfaceC0406c interfaceC0406c) {
        this.f3500a = interfaceC0406c;
    }

    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) throws NoSuchMethodException, SecurityException {
        if (aVar != AbstractC0355d.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        C0359h c0359h = (C0359h) interfaceC0358g.mo1151a();
        c0359h.m1281c("removeObserver");
        c0359h.f2170a.mo464e(this);
        Bundle bundleM1419a = this.f3500a.mo1153d().m1419a("androidx.savedstate.Restarter");
        if (bundleM1419a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM1419a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> clsAsSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C0404a.a.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((C0404a.a) declaredConstructor.newInstance(new Object[0])).mo1422a(this.f3500a);
                    } catch (Exception e2) {
                        throw new RuntimeException(C0561a.m2076d("Failed to instantiate ", next), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    StringBuilder sbM2079g = C0561a.m2079g("Class");
                    sbM2079g.append(clsAsSubclass.getSimpleName());
                    sbM2079g.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbM2079g.toString(), e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(C0561a.m2077e("Class ", next, " wasn't found"), e4);
            }
        }
    }
}
