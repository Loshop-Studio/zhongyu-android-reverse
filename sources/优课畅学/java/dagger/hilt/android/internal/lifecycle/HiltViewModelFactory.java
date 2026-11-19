package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.Closeable;
import java.util.Map;
import javax.inject.Provider;
import p026b6.AbstractC5208a;
import p075d6.InterfaceC8309d;
import p111g6.InterfaceC8654d;
import p122h6.C8720d;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: d */
    public static final CreationExtras.Key f15818d = new C8330a();

    /* renamed from: a */
    public final Map f15819a;

    /* renamed from: b */
    public final ViewModelProvider.Factory f15820b;

    /* renamed from: c */
    public final ViewModelProvider.Factory f15821c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$a */
    public class C8330a implements CreationExtras.Key {
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$b */
    public class C8331b implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8654d f15822a;

        public C8331b(InterfaceC8654d interfaceC8654d) {
            this.f15822a = interfaceC8654d;
        }

        /* renamed from: a */
        public final ViewModel m13542a(InterfaceC8309d interfaceC8309d, Class cls, CreationExtras creationExtras) {
            Provider provider = (Provider) ((InterfaceC8333d) AbstractC5208a.m2103a(interfaceC8309d, InterfaceC8333d.class)).mo9896a().get(cls);
            InterfaceC10570l interfaceC10570l = (InterfaceC10570l) creationExtras.get(HiltViewModelFactory.f15818d);
            Object obj = ((InterfaceC8333d) AbstractC5208a.m2103a(interfaceC8309d, InterfaceC8333d.class)).mo9897b().get(cls);
            if (obj == null) {
                if (interfaceC10570l != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (provider != null) {
                    return (ViewModel) provider.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (provider != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (interfaceC10570l != null) {
                return (ViewModel) interfaceC10570l.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            final C8720d c8720d = new C8720d();
            ViewModel viewModelM13542a = m13542a(this.f15822a.mo9890a(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).mo9891b(c8720d).build(), cls, creationExtras);
            viewModelM13542a.addCloseable(new Closeable() { // from class: h6.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c8720d.m14227a();
                }
            });
            return viewModelM13542a;
        }
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$c */
    public interface InterfaceC8332c {
        /* renamed from: c */
        Map mo9807c();

        /* renamed from: d */
        InterfaceC8654d mo9808d();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$d */
    public interface InterfaceC8333d {
        /* renamed from: a */
        Map mo9896a();

        /* renamed from: b */
        Map mo9897b();
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, InterfaceC8654d interfaceC8654d) {
        this.f15819a = map;
        this.f15820b = factory;
        this.f15821c = new C8331b(interfaceC8654d);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m13541a(Activity activity, ViewModelProvider.Factory factory) {
        InterfaceC8332c interfaceC8332c = (InterfaceC8332c) AbstractC5208a.m2103a(activity, InterfaceC8332c.class);
        return new HiltViewModelFactory(interfaceC8332c.mo9807c(), factory, interfaceC8332c.mo9808d());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        return this.f15819a.containsKey(cls) ? this.f15821c.create(cls, creationExtras) : this.f15820b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        if (this.f15819a.containsKey(cls)) {
            return this.f15821c.create(cls);
        }
        return this.f15820b.create(cls);
    }
}
