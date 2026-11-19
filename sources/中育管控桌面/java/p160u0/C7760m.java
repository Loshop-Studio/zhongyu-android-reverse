package p160u0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.ComponentCallbacks2C4684i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p016b1.AbstractC4409k;
import p160u0.C7762o;

/* renamed from: u0.m */
/* loaded from: classes3.dex */
public final class C7760m {

    /* renamed from: a */
    public final Map f10253a = new HashMap();

    /* renamed from: b */
    public final C7762o.b f10254b;

    /* renamed from: u0.m$b */
    public final class b implements InterfaceC7763p {

        /* renamed from: a */
        public final FragmentManager f10257a;

        public b(FragmentManager fragmentManager) {
            this.f10257a = fragmentManager;
        }

        @Override // p160u0.InterfaceC7763p
        /* renamed from: a */
        public Set mo9263a() {
            HashSet hashSet = new HashSet();
            m9267b(this.f10257a, hashSet);
            return hashSet;
        }

        /* renamed from: b */
        public final void m9267b(FragmentManager fragmentManager, Set set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i6 = 0; i6 < size; i6++) {
                Fragment fragment = fragments.get(i6);
                m9267b(fragment.getChildFragmentManager(), set);
                ComponentCallbacks2C4684i componentCallbacks2C4684iM9265a = C7760m.this.m9265a(fragment.getLifecycle());
                if (componentCallbacks2C4684iM9265a != null) {
                    set.add(componentCallbacks2C4684iM9265a);
                }
            }
        }
    }

    public C7760m(C7762o.b bVar) {
        this.f10254b = bVar;
    }

    /* renamed from: a */
    public ComponentCallbacks2C4684i m9265a(Lifecycle lifecycle) {
        AbstractC4409k.m1440a();
        return (ComponentCallbacks2C4684i) this.f10253a.get(lifecycle);
    }

    /* renamed from: b */
    public ComponentCallbacks2C4684i m9266b(Context context, ComponentCallbacks2C4678c componentCallbacks2C4678c, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z6) {
        AbstractC4409k.m1440a();
        ComponentCallbacks2C4684i componentCallbacks2C4684iM9265a = m9265a(lifecycle);
        if (componentCallbacks2C4684iM9265a != null) {
            return componentCallbacks2C4684iM9265a;
        }
        C7758k c7758k = new C7758k(lifecycle);
        ComponentCallbacks2C4684i componentCallbacks2C4684iMo2468a = this.f10254b.mo2468a(componentCallbacks2C4678c, c7758k, new b(fragmentManager), context);
        this.f10253a.put(lifecycle, componentCallbacks2C4684iMo2468a);
        c7758k.mo9258b(new a(lifecycle));
        if (z6) {
            componentCallbacks2C4684iMo2468a.onStart();
        }
        return componentCallbacks2C4684iMo2468a;
    }

    /* renamed from: u0.m$a */
    public class a implements InterfaceC7759l {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f10255a;

        public a(Lifecycle lifecycle) {
            this.f10255a = lifecycle;
        }

        @Override // p160u0.InterfaceC7759l
        /* renamed from: d */
        public void mo2533d() {
            C7760m.this.f10253a.remove(this.f10255a);
        }

        @Override // p160u0.InterfaceC7759l
        public void onStart() {
        }

        @Override // p160u0.InterfaceC7759l
        public void onStop() {
        }
    }
}
