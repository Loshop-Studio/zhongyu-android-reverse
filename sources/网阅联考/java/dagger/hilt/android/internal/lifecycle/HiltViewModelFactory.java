package dagger.hilt.android.internal.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;
import p018c2.AbstractC2756a;
import p064g2.InterfaceC3756c;
import p069h2.C3769d;
import p096m2.InterfaceC4366a;

/* loaded from: classes2.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final Set f4335a;

    /* renamed from: b */
    public final ViewModelProvider.Factory f4336b;

    /* renamed from: c */
    public final AbstractSavedStateViewModelFactory f4337c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$a */
    public class C3712a extends AbstractSavedStateViewModelFactory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3756c f4338a;

        public C3712a(InterfaceC3756c interfaceC3756c) {
            this.f4338a = interfaceC3756c;
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
            final C3769d c3769d = new C3769d();
            InterfaceC4366a interfaceC4366a = (InterfaceC4366a) ((InterfaceC3713b) AbstractC2756a.m1625a(this.f4338a.mo4790a(savedStateHandle).mo4791b(c3769d).build(), InterfaceC3713b.class)).mo4705a().get(cls.getName());
            if (interfaceC4366a != null) {
                ViewModel viewModel = (ViewModel) interfaceC4366a.get();
                viewModel.addCloseable(new Closeable() { // from class: h2.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        c3769d.m4871a();
                    }
                });
                return viewModel;
            }
            throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        }
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$b */
    public interface InterfaceC3713b {
        /* renamed from: a */
        Map mo4705a();
    }

    public HiltViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, Set set, ViewModelProvider.Factory factory, InterfaceC3756c interfaceC3756c) {
        this.f4335a = set;
        this.f4336b = factory;
        this.f4337c = new C3712a(interfaceC3756c);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        return this.f4335a.contains(cls.getName()) ? this.f4337c.create(cls, creationExtras) : this.f4336b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        if (this.f4335a.contains(cls.getName())) {
            return this.f4337c.create(cls);
        }
        return this.f4336b.create(cls);
    }
}
