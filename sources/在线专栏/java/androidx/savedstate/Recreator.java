package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements InterfaceC0501i {

    /* renamed from: a */
    private final InterfaceC0651c f4124a;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C0645a implements SavedStateRegistry.InterfaceC0648b {

        /* renamed from: a */
        final Set<String> f4125a = new HashSet();

        C0645a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m3661d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0648b
        /* renamed from: a */
        public Bundle mo65a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4125a));
            return bundle;
        }

        /* renamed from: b */
        void m3657b(String str) {
            this.f4125a.add(str);
        }
    }

    Recreator(InterfaceC0651c interfaceC0651c) {
        this.f4124a = interfaceC0651c;
    }

    /* renamed from: e */
    private void m3656e(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC0647a.class);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC0647a) declaredConstructor.newInstance(new Object[0])).mo2823a(this.f4124a);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class" + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) throws NoSuchMethodException, SecurityException {
        if (bVar != AbstractC0496f.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0504l.getLifecycle().mo2869c(this);
        Bundle bundleM3658a = this.f4124a.getSavedStateRegistry().m3658a("androidx.savedstate.Restarter");
        if (bundleM3658a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM3658a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m3656e(it.next());
        }
    }
}
