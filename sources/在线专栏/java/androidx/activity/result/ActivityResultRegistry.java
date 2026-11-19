package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0321b;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p010b.AbstractC1015a;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f88a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f89b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f90c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0062d> f91d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f92e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0061c<?>> f93f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f94g = new HashMap();

    /* renamed from: h */
    final Bundle f95h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    class C0059a<I> extends AbstractC0066b<I> {

        /* renamed from: a */
        final /* synthetic */ String f100a;

        /* renamed from: b */
        final /* synthetic */ int f101b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1015a f102c;

        C0059a(String str, int i4, AbstractC1015a abstractC1015a) {
            this.f100a = str;
            this.f101b = i4;
            this.f102c = abstractC1015a;
        }

        @Override // androidx.activity.result.AbstractC0066b
        /* renamed from: b */
        public void mo92b(I i4, C0321b c0321b) {
            ActivityResultRegistry.this.f92e.add(this.f100a);
            Integer num = ActivityResultRegistry.this.f90c.get(this.f100a);
            ActivityResultRegistry.this.mo64f(num != null ? num.intValue() : this.f101b, this.f102c, i4, c0321b);
        }

        @Override // androidx.activity.result.AbstractC0066b
        /* renamed from: c */
        public void mo93c() {
            ActivityResultRegistry.this.m91l(this.f100a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    class C0060b<I> extends AbstractC0066b<I> {

        /* renamed from: a */
        final /* synthetic */ String f104a;

        /* renamed from: b */
        final /* synthetic */ int f105b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1015a f106c;

        C0060b(String str, int i4, AbstractC1015a abstractC1015a) {
            this.f104a = str;
            this.f105b = i4;
            this.f106c = abstractC1015a;
        }

        @Override // androidx.activity.result.AbstractC0066b
        /* renamed from: b */
        public void mo92b(I i4, C0321b c0321b) {
            ActivityResultRegistry.this.f92e.add(this.f104a);
            Integer num = ActivityResultRegistry.this.f90c.get(this.f104a);
            ActivityResultRegistry.this.mo64f(num != null ? num.intValue() : this.f105b, this.f106c, i4, c0321b);
        }

        @Override // androidx.activity.result.AbstractC0066b
        /* renamed from: c */
        public void mo93c() {
            ActivityResultRegistry.this.m91l(this.f104a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    private static class C0061c<O> {

        /* renamed from: a */
        final InterfaceC0065a<O> f108a;

        /* renamed from: b */
        final AbstractC1015a<?, O> f109b;

        C0061c(InterfaceC0065a<O> interfaceC0065a, AbstractC1015a<?, O> abstractC1015a) {
            this.f108a = interfaceC0065a;
            this.f109b = abstractC1015a;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    private static class C0062d {

        /* renamed from: a */
        final AbstractC0496f f110a;

        /* renamed from: b */
        private final ArrayList<InterfaceC0501i> f111b = new ArrayList<>();

        C0062d(AbstractC0496f abstractC0496f) {
            this.f110a = abstractC0496f;
        }

        /* renamed from: a */
        void m94a(InterfaceC0501i interfaceC0501i) {
            this.f110a.mo2867a(interfaceC0501i);
            this.f111b.add(interfaceC0501i);
        }

        /* renamed from: b */
        void m95b() {
            Iterator<InterfaceC0501i> it = this.f111b.iterator();
            while (it.hasNext()) {
                this.f110a.mo2869c(it.next());
            }
            this.f111b.clear();
        }
    }

    /* renamed from: a */
    private void m81a(int i4, String str) {
        this.f89b.put(Integer.valueOf(i4), str);
        this.f90c.put(str, Integer.valueOf(i4));
    }

    /* renamed from: d */
    private <O> void m82d(String str, int i4, Intent intent, C0061c<O> c0061c) {
        InterfaceC0065a<O> interfaceC0065a;
        if (c0061c != null && (interfaceC0065a = c0061c.f108a) != null) {
            interfaceC0065a.mo105a(c0061c.f109b.mo2523c(i4, intent));
        } else {
            this.f94g.remove(str);
            this.f95h.putParcelable(str, new ActivityResult(i4, intent));
        }
    }

    /* renamed from: e */
    private int m83e() {
        int iNextInt = this.f88a.nextInt(2147418112);
        while (true) {
            int i4 = iNextInt + ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
            if (!this.f89b.containsKey(Integer.valueOf(i4))) {
                return i4;
            }
            iNextInt = this.f88a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private int m84k(String str) {
        Integer num = this.f90c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iM83e = m83e();
        m81a(iM83e, str);
        return iM83e;
    }

    /* renamed from: b */
    public final boolean m85b(int i4, int i5, Intent intent) {
        String str = this.f89b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        this.f92e.remove(str);
        m82d(str, i5, intent, this.f93f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m86c(int i4, @SuppressLint({"UnknownNullness"}) O o3) {
        InterfaceC0065a<?> interfaceC0065a;
        String str = this.f89b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        this.f92e.remove(str);
        C0061c<?> c0061c = this.f93f.get(str);
        if (c0061c != null && (interfaceC0065a = c0061c.f108a) != null) {
            interfaceC0065a.mo105a(o3);
            return true;
        }
        this.f95h.remove(str);
        this.f94g.put(str, o3);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo64f(int i4, AbstractC1015a<I, O> abstractC1015a, @SuppressLint({"UnknownNullness"}) I i5, C0321b c0321b);

    /* renamed from: g */
    public final void m87g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f92e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f88a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f95h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
            String str = stringArrayList.get(i4);
            if (this.f90c.containsKey(str)) {
                Integer numRemove = this.f90c.remove(str);
                if (!this.f95h.containsKey(str)) {
                    this.f89b.remove(numRemove);
                }
            }
            m81a(integerArrayList.get(i4).intValue(), stringArrayList.get(i4));
        }
    }

    /* renamed from: h */
    public final void m88h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f90c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f90c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f92e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f95h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f88a);
    }

    /* renamed from: i */
    public final <I, O> AbstractC0066b<I> m89i(final String str, InterfaceC0504l interfaceC0504l, final AbstractC1015a<I, O> abstractC1015a, final InterfaceC0065a<O> interfaceC0065a) {
        AbstractC0496f lifecycle = interfaceC0504l.getLifecycle();
        if (lifecycle.mo2868b().m2874a(AbstractC0496f.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0504l + " is attempting to register while current state is " + lifecycle.mo2868b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int iM84k = m84k(str);
        C0062d c0062d = this.f91d.get(str);
        if (c0062d == null) {
            c0062d = new C0062d(lifecycle);
        }
        c0062d.m94a(new InterfaceC0501i() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.InterfaceC0501i
            /* renamed from: d */
            public void mo63d(InterfaceC0504l interfaceC0504l2, AbstractC0496f.b bVar) {
                if (!AbstractC0496f.b.ON_START.equals(bVar)) {
                    if (AbstractC0496f.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f93f.remove(str);
                        return;
                    } else {
                        if (AbstractC0496f.b.ON_DESTROY.equals(bVar)) {
                            ActivityResultRegistry.this.m91l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f93f.put(str, new C0061c<>(interfaceC0065a, abstractC1015a));
                if (ActivityResultRegistry.this.f94g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f94g.get(str);
                    ActivityResultRegistry.this.f94g.remove(str);
                    interfaceC0065a.mo105a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f95h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f95h.remove(str);
                    interfaceC0065a.mo105a(abstractC1015a.mo2523c(activityResult.m78b(), activityResult.m77a()));
                }
            }
        });
        this.f91d.put(str, c0062d);
        return new C0059a(str, iM84k, abstractC1015a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final <I, O> AbstractC0066b<I> m90j(String str, AbstractC1015a<I, O> abstractC1015a, InterfaceC0065a<O> interfaceC0065a) {
        int iM84k = m84k(str);
        this.f93f.put(str, new C0061c<>(interfaceC0065a, abstractC1015a));
        if (this.f94g.containsKey(str)) {
            Object obj = this.f94g.get(str);
            this.f94g.remove(str);
            interfaceC0065a.mo105a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f95h.getParcelable(str);
        if (activityResult != null) {
            this.f95h.remove(str);
            interfaceC0065a.mo105a(abstractC1015a.mo2523c(activityResult.m78b(), activityResult.m77a()));
        }
        return new C0060b(str, iM84k, abstractC1015a);
    }

    /* renamed from: l */
    final void m91l(String str) {
        Integer numRemove;
        if (!this.f92e.contains(str) && (numRemove = this.f90c.remove(str)) != null) {
            this.f89b.remove(numRemove);
        }
        this.f93f.remove(str);
        if (this.f94g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f94g.get(str));
            this.f94g.remove(str);
        }
        if (this.f95h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f95h.getParcelable(str));
            this.f95h.remove(str);
        }
        C0062d c0062d = this.f91d.get(str);
        if (c0062d != null) {
            c0062d.m95b();
            this.f91d.remove(str);
        }
    }
}
