package p001a0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.ComponentCallbacks2C5397h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0015o;
import p116h0.AbstractC8707k;

/* renamed from: a0.m */
/* loaded from: classes3.dex */
public final class C0013m {

    /* renamed from: a */
    public final Map f25a = new HashMap();

    /* renamed from: b */
    public final C0015o.b f26b;

    /* renamed from: a0.m$b */
    public final class b implements InterfaceC0016p {

        /* renamed from: a */
        public final FragmentManager f29a;

        public b(FragmentManager fragmentManager) {
            this.f29a = fragmentManager;
        }

        @Override // p001a0.InterfaceC0016p
        /* renamed from: a */
        public Set mo7a() {
            HashSet hashSet = new HashSet();
            m11b(this.f29a, hashSet);
            return hashSet;
        }

        /* renamed from: b */
        public final void m11b(FragmentManager fragmentManager, Set set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = fragments.get(i10);
                m11b(fragment.getChildFragmentManager(), set);
                ComponentCallbacks2C5397h componentCallbacks2C5397hM9a = C0013m.this.m9a(fragment.getLifecycle());
                if (componentCallbacks2C5397hM9a != null) {
                    set.add(componentCallbacks2C5397hM9a);
                }
            }
        }
    }

    public C0013m(C0015o.b bVar) {
        this.f26b = bVar;
    }

    /* renamed from: a */
    public ComponentCallbacks2C5397h m9a(Lifecycle lifecycle) {
        AbstractC8707k.m14183a();
        return (ComponentCallbacks2C5397h) this.f25a.get(lifecycle);
    }

    /* renamed from: b */
    public ComponentCallbacks2C5397h m10b(Context context, ComponentCallbacks2C5391b componentCallbacks2C5391b, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z10) {
        AbstractC8707k.m14183a();
        ComponentCallbacks2C5397h componentCallbacks2C5397hM9a = m9a(lifecycle);
        if (componentCallbacks2C5397hM9a != null) {
            return componentCallbacks2C5397hM9a;
        }
        C0011k c0011k = new C0011k(lifecycle);
        ComponentCallbacks2C5397h componentCallbacks2C5397hMo23a = this.f26b.mo23a(componentCallbacks2C5391b, c0011k, new b(fragmentManager), context);
        this.f25a.put(lifecycle, componentCallbacks2C5397hMo23a);
        c0011k.mo0a(new a(lifecycle));
        if (z10) {
            componentCallbacks2C5397hMo23a.onStart();
        }
        return componentCallbacks2C5397hMo23a;
    }

    /* renamed from: a0.m$a */
    public class a implements InterfaceC0012l {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f27a;

        public a(Lifecycle lifecycle) {
            this.f27a = lifecycle;
        }

        @Override // p001a0.InterfaceC0012l
        public void onDestroy() {
            C0013m.this.f25a.remove(this.f27a);
        }

        @Override // p001a0.InterfaceC0012l
        public void onStart() {
        }

        @Override // p001a0.InterfaceC0012l
        public void onStop() {
        }
    }
}
