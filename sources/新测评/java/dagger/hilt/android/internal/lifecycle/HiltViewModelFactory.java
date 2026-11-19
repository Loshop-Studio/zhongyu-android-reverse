package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.Closeable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p080e8.AbstractC7415a;
import p102g8.InterfaceC7599d;
import p135j8.InterfaceC7818d;
import p146k8.C7902d;
import p279w8.InterfaceC9823a;

/* loaded from: classes5.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: d */
    public static final CreationExtras.Key f11840d = new C7315a();

    /* renamed from: a */
    public final Map f11841a;

    /* renamed from: b */
    public final ViewModelProvider.Factory f11842b;

    /* renamed from: c */
    public final ViewModelProvider.Factory f11843c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$a */
    public class C7315a implements CreationExtras.Key {
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$b */
    public class C7316b implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7818d f11844a;

        public C7316b(InterfaceC7818d interfaceC7818d) {
            this.f11844a = interfaceC7818d;
        }

        /* renamed from: a */
        public final ViewModel m11611a(InterfaceC7599d interfaceC7599d, Class cls, CreationExtras creationExtras) {
            InterfaceC9823a interfaceC9823a = (InterfaceC9823a) ((InterfaceC7318d) AbstractC7415a.m11910a(interfaceC7599d, InterfaceC7318d.class)).mo11614a().get(cls);
            Function1 function1 = (Function1) creationExtras.get(HiltViewModelFactory.f11840d);
            Object obj = ((InterfaceC7318d) AbstractC7415a.m11910a(interfaceC7599d, InterfaceC7318d.class)).mo11615b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC9823a != null) {
                    return (ViewModel) interfaceC9823a.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (interfaceC9823a != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (function1 != null) {
                return (ViewModel) function1.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            final C7902d c7902d = new C7902d();
            ViewModel viewModelM11611a = m11611a(this.f11844a.mo13244b(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).mo13243a(c7902d).build(), cls, creationExtras);
            viewModelM11611a.addCloseable(new Closeable() { // from class: k8.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c7902d.m13523a();
                }
            });
            return viewModelM11611a;
        }
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$c */
    public interface InterfaceC7317c {
        /* renamed from: b */
        Map mo11612b();

        /* renamed from: d */
        InterfaceC7818d mo11613d();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$d */
    public interface InterfaceC7318d {
        /* renamed from: a */
        Map mo11614a();

        /* renamed from: b */
        Map mo11615b();
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, InterfaceC7818d interfaceC7818d) {
        this.f11841a = map;
        this.f11842b = factory;
        this.f11843c = new C7316b(interfaceC7818d);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m11610a(Activity activity, ViewModelProvider.Factory factory) {
        InterfaceC7317c interfaceC7317c = (InterfaceC7317c) AbstractC7415a.m11910a(activity, InterfaceC7317c.class);
        return new HiltViewModelFactory(interfaceC7317c.mo11612b(), factory, interfaceC7317c.mo11613d());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        return this.f11841a.containsKey(cls) ? this.f11843c.create(cls, creationExtras) : this.f11842b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        if (this.f11841a.containsKey(cls)) {
            return this.f11843c.create(cls);
        }
        return this.f11842b.create(cls);
    }
}
