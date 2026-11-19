package p020b1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.ComponentCallbacks2C5348h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p020b1.C4956o;
import p117i1.AbstractC7652k;

/* renamed from: b1.m */
/* loaded from: classes3.dex */
public final class C4954m {

    /* renamed from: a */
    public final Map f2363a = new HashMap();

    /* renamed from: b */
    public final C4956o.b f2364b;

    /* renamed from: b1.m$b */
    public final class b implements InterfaceC4957p {

        /* renamed from: a */
        public final FragmentManager f2367a;

        public b(FragmentManager fragmentManager) {
            this.f2367a = fragmentManager;
        }

        @Override // p020b1.InterfaceC4957p
        /* renamed from: a */
        public Set mo2335a() {
            HashSet hashSet = new HashSet();
            m2339b(this.f2367a, hashSet);
            return hashSet;
        }

        /* renamed from: b */
        public final void m2339b(FragmentManager fragmentManager, Set set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = fragments.get(i10);
                m2339b(fragment.getChildFragmentManager(), set);
                ComponentCallbacks2C5348h componentCallbacks2C5348hM2337a = C4954m.this.m2337a(fragment.getLifecycle());
                if (componentCallbacks2C5348hM2337a != null) {
                    set.add(componentCallbacks2C5348hM2337a);
                }
            }
        }
    }

    public C4954m(C4956o.b bVar) {
        this.f2364b = bVar;
    }

    /* renamed from: a */
    public ComponentCallbacks2C5348h m2337a(Lifecycle lifecycle) {
        AbstractC7652k.m12685a();
        return (ComponentCallbacks2C5348h) this.f2363a.get(lifecycle);
    }

    /* renamed from: b */
    public ComponentCallbacks2C5348h m2338b(Context context, ComponentCallbacks2C5342b componentCallbacks2C5342b, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z9) {
        AbstractC7652k.m12685a();
        ComponentCallbacks2C5348h componentCallbacks2C5348hM2337a = m2337a(lifecycle);
        if (componentCallbacks2C5348hM2337a != null) {
            return componentCallbacks2C5348hM2337a;
        }
        C4952k c4952k = new C4952k(lifecycle);
        ComponentCallbacks2C5348h componentCallbacks2C5348hMo2351a = this.f2364b.mo2351a(componentCallbacks2C5342b, c4952k, new b(fragmentManager), context);
        this.f2363a.put(lifecycle, componentCallbacks2C5348hMo2351a);
        c4952k.mo2329b(new a(lifecycle));
        if (z9) {
            componentCallbacks2C5348hMo2351a.onStart();
        }
        return componentCallbacks2C5348hMo2351a;
    }

    /* renamed from: b1.m$a */
    public class a implements InterfaceC4953l {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f2365a;

        public a(Lifecycle lifecycle) {
            this.f2365a = lifecycle;
        }

        @Override // p020b1.InterfaceC4953l
        public void onDestroy() {
            C4954m.this.f2363a.remove(this.f2365a);
        }

        @Override // p020b1.InterfaceC4953l
        public void onStart() {
        }

        @Override // p020b1.InterfaceC4953l
        public void onStop() {
        }
    }
}
