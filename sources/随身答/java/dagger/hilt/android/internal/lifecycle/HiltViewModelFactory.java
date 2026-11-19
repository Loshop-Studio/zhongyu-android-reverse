package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.Closeable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p130h8.InterfaceC8110a;
import p215p7.AbstractC9337a;
import p235r7.InterfaceC9438d;
import p265u7.InterfaceC9724d;
import p275v7.C9772d;

/* loaded from: classes5.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: d */
    public static final CreationExtras.Key f13117d = new C7797a();

    /* renamed from: a */
    public final Map f13118a;

    /* renamed from: b */
    public final ViewModelProvider.Factory f13119b;

    /* renamed from: c */
    public final ViewModelProvider.Factory f13120c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$a */
    public class C7797a implements CreationExtras.Key {
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$b */
    public class C7798b implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9724d f13121a;

        public C7798b(InterfaceC9724d interfaceC9724d) {
            this.f13121a = interfaceC9724d;
        }

        /* renamed from: a */
        public final ViewModel m12162a(InterfaceC9438d interfaceC9438d, Class cls, CreationExtras creationExtras) {
            InterfaceC8110a interfaceC8110a = (InterfaceC8110a) ((InterfaceC7800d) AbstractC9337a.m15247a(interfaceC9438d, InterfaceC7800d.class)).mo12165a().get(cls);
            Function1 function1 = (Function1) creationExtras.get(HiltViewModelFactory.f13117d);
            Object obj = ((InterfaceC7800d) AbstractC9337a.m15247a(interfaceC9438d, InterfaceC7800d.class)).mo12166b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC8110a != null) {
                    return (ViewModel) interfaceC8110a.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (interfaceC8110a != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (function1 != null) {
                return (ViewModel) function1.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            final C9772d c9772d = new C9772d();
            ViewModel viewModelM12162a = m12162a(this.f13121a.mo12865a(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).mo12866b(c9772d).build(), cls, creationExtras);
            viewModelM12162a.addCloseable(new Closeable() { // from class: v7.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c9772d.m16556a();
                }
            });
            return viewModelM12162a;
        }
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$c */
    public interface InterfaceC7799c {
        /* renamed from: b */
        Map mo12163b();

        /* renamed from: d */
        InterfaceC9724d mo12164d();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$d */
    public interface InterfaceC7800d {
        /* renamed from: a */
        Map mo12165a();

        /* renamed from: b */
        Map mo12166b();
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, InterfaceC9724d interfaceC9724d) {
        this.f13118a = map;
        this.f13119b = factory;
        this.f13120c = new C7798b(interfaceC9724d);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m12161a(Activity activity, ViewModelProvider.Factory factory) {
        InterfaceC7799c interfaceC7799c = (InterfaceC7799c) AbstractC9337a.m15247a(activity, InterfaceC7799c.class);
        return new HiltViewModelFactory(interfaceC7799c.mo12163b(), factory, interfaceC7799c.mo12164d());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        return this.f13118a.containsKey(cls) ? this.f13120c.create(cls, creationExtras) : this.f13119b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        if (this.f13118a.containsKey(cls)) {
            return this.f13120c.create(cls);
        }
        return this.f13119b.create(cls);
    }
}
