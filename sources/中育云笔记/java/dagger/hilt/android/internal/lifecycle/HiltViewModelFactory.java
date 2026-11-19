package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import cc.C5421d;
import java.io.Closeable;
import java.util.Map;
import p036bc.InterfaceC5187d;
import p181hd.InterfaceC9540l;
import p295pc.InterfaceC10652a;
import p392wb.AbstractC11724a;
import p424yb.InterfaceC11942d;

/* loaded from: classes6.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: d */
    public static final CreationExtras.Key f20983d = new C9008a();

    /* renamed from: a */
    public final Map f20984a;

    /* renamed from: b */
    public final ViewModelProvider.Factory f20985b;

    /* renamed from: c */
    public final ViewModelProvider.Factory f20986c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$a */
    public class C9008a implements CreationExtras.Key {
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$b */
    public class C9009b implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5187d f20987a;

        public C9009b(InterfaceC5187d interfaceC5187d) {
            this.f20987a = interfaceC5187d;
        }

        /* renamed from: a */
        public final ViewModel m17596a(InterfaceC11942d interfaceC11942d, Class cls, CreationExtras creationExtras) {
            InterfaceC10652a interfaceC10652a = (InterfaceC10652a) ((InterfaceC9011d) AbstractC11724a.m25951a(interfaceC11942d, InterfaceC9011d.class)).mo17599a().get(cls);
            InterfaceC9540l interfaceC9540l = (InterfaceC9540l) creationExtras.get(HiltViewModelFactory.f20983d);
            Object obj = ((InterfaceC9011d) AbstractC11724a.m25951a(interfaceC11942d, InterfaceC9011d.class)).mo17600b().get(cls);
            if (obj == null) {
                if (interfaceC9540l != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC10652a != null) {
                    return (ViewModel) interfaceC10652a.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (interfaceC10652a != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (interfaceC9540l != null) {
                return (ViewModel) interfaceC9540l.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            final C5421d c5421d = new C5421d();
            ViewModel viewModelM17596a = m17596a(this.f20987a.mo2737a(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).mo2738b(c5421d).build(), cls, creationExtras);
            viewModelM17596a.addCloseable(new Closeable() { // from class: cc.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c5421d.m2899a();
                }
            });
            return viewModelM17596a;
        }
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$c */
    public interface InterfaceC9010c {
        /* renamed from: e */
        Map mo17597e();

        /* renamed from: v */
        InterfaceC5187d mo17598v();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$d */
    public interface InterfaceC9011d {
        /* renamed from: a */
        Map mo17599a();

        /* renamed from: b */
        Map mo17600b();
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, InterfaceC5187d interfaceC5187d) {
        this.f20984a = map;
        this.f20985b = factory;
        this.f20986c = new C9009b(interfaceC5187d);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m17595a(Activity activity, ViewModelProvider.Factory factory) {
        InterfaceC9010c interfaceC9010c = (InterfaceC9010c) AbstractC11724a.m25951a(activity, InterfaceC9010c.class);
        return new HiltViewModelFactory(interfaceC9010c.mo17597e(), factory, interfaceC9010c.mo17598v());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        return this.f20984a.containsKey(cls) ? this.f20986c.create(cls, creationExtras) : this.f20985b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        if (this.f20984a.containsKey(cls)) {
            return this.f20986c.create(cls);
        }
        return this.f20985b.create(cls);
    }
}
