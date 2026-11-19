package p381w0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.ComponentCallbacks2C5816h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p109d1.AbstractC8910k;
import p381w0.C11655o;

/* renamed from: w0.m */
/* loaded from: classes3.dex */
public final class C11653m {

    /* renamed from: a */
    public final Map f27655a = new HashMap();

    /* renamed from: b */
    public final C11655o.b f27656b;

    /* renamed from: w0.m$b */
    public final class b implements InterfaceC11656p {

        /* renamed from: a */
        public final FragmentManager f27659a;

        public b(FragmentManager fragmentManager) {
            this.f27659a = fragmentManager;
        }

        @Override // p381w0.InterfaceC11656p
        /* renamed from: a */
        public Set mo25764a() {
            HashSet hashSet = new HashSet();
            m25768b(this.f27659a, hashSet);
            return hashSet;
        }

        /* renamed from: b */
        public final void m25768b(FragmentManager fragmentManager, Set set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = fragments.get(i10);
                m25768b(fragment.getChildFragmentManager(), set);
                ComponentCallbacks2C5816h componentCallbacks2C5816hM25766a = C11653m.this.m25766a(fragment.getLifecycle());
                if (componentCallbacks2C5816hM25766a != null) {
                    set.add(componentCallbacks2C5816hM25766a);
                }
            }
        }
    }

    public C11653m(C11655o.b bVar) {
        this.f27656b = bVar;
    }

    /* renamed from: a */
    public ComponentCallbacks2C5816h m25766a(Lifecycle lifecycle) {
        AbstractC8910k.m17470a();
        return (ComponentCallbacks2C5816h) this.f27655a.get(lifecycle);
    }

    /* renamed from: b */
    public ComponentCallbacks2C5816h m25767b(Context context, ComponentCallbacks2C5810b componentCallbacks2C5810b, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z10) {
        AbstractC8910k.m17470a();
        ComponentCallbacks2C5816h componentCallbacks2C5816hM25766a = m25766a(lifecycle);
        if (componentCallbacks2C5816hM25766a != null) {
            return componentCallbacks2C5816hM25766a;
        }
        C11651k c11651k = new C11651k(lifecycle);
        ComponentCallbacks2C5816h componentCallbacks2C5816hMo25780a = this.f27656b.mo25780a(componentCallbacks2C5810b, c11651k, new b(fragmentManager), context);
        this.f27655a.put(lifecycle, componentCallbacks2C5816hMo25780a);
        c11651k.mo25758a(new a(lifecycle));
        if (z10) {
            componentCallbacks2C5816hMo25780a.onStart();
        }
        return componentCallbacks2C5816hMo25780a;
    }

    /* renamed from: w0.m$a */
    public class a implements InterfaceC11652l {

        /* renamed from: c */
        public final /* synthetic */ Lifecycle f27657c;

        public a(Lifecycle lifecycle) {
            this.f27657c = lifecycle;
        }

        @Override // p381w0.InterfaceC11652l
        public void onDestroy() {
            C11653m.this.f27655a.remove(this.f27657c);
        }

        @Override // p381w0.InterfaceC11652l
        public void onStart() {
        }

        @Override // p381w0.InterfaceC11652l
        public void onStop() {
        }
    }
}
