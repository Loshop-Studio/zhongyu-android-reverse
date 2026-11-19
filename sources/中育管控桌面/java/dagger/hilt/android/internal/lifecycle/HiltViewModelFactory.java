package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.Closeable;
import java.util.Map;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;
import p136q4.AbstractC7625a;
import p150s4.InterfaceC7703e;
import p171v4.InterfaceC7799e;
import p178w4.C7818d;

/* loaded from: classes4.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: d */
    public static final CreationExtras.Key f7558d = new C6250a();

    /* renamed from: a */
    public final Map f7559a;

    /* renamed from: b */
    public final ViewModelProvider.Factory f7560b;

    /* renamed from: c */
    public final ViewModelProvider.Factory f7561c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$a */
    public class C6250a implements CreationExtras.Key {
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$b */
    public class C6251b implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7799e f7562a;

        public C6251b(InterfaceC7799e interfaceC7799e) {
            this.f7562a = interfaceC7799e;
        }

        /* renamed from: a */
        public final ViewModel m6347a(InterfaceC7703e interfaceC7703e, Class cls, CreationExtras creationExtras) {
            Provider provider = (Provider) ((InterfaceC6253d) AbstractC7625a.m9065a(interfaceC7703e, InterfaceC6253d.class)).mo5272a().get(cls);
            Function1 function1 = (Function1) creationExtras.get(HiltViewModelFactory.f7558d);
            Object obj = ((InterfaceC6253d) AbstractC7625a.m9065a(interfaceC7703e, InterfaceC6253d.class)).mo5273b().get(cls);
            if (obj == null) {
                if (function1 != null) {
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
            if (function1 != null) {
                return (ViewModel) function1.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            final C7818d c7818d = new C7818d();
            ViewModel viewModelM6347a = m6347a(this.f7562a.mo5266a(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).mo5267b(c7818d).build(), cls, creationExtras);
            viewModelM6347a.addCloseable(new Closeable() { // from class: w4.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c7818d.m9408a();
                }
            });
            return viewModelM6347a;
        }
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$c */
    public interface InterfaceC6252c {
        /* renamed from: c */
        Map mo5214c();

        /* renamed from: g */
        InterfaceC7799e mo5218g();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$d */
    public interface InterfaceC6253d {
        /* renamed from: a */
        Map mo5272a();

        /* renamed from: b */
        Map mo5273b();
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, InterfaceC7799e interfaceC7799e) {
        this.f7559a = map;
        this.f7560b = factory;
        this.f7561c = new C6251b(interfaceC7799e);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m6346a(Activity activity, ViewModelProvider.Factory factory) {
        InterfaceC6252c interfaceC6252c = (InterfaceC6252c) AbstractC7625a.m9065a(activity, InterfaceC6252c.class);
        return new HiltViewModelFactory(interfaceC6252c.mo5214c(), factory, interfaceC6252c.mo5218g());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        return this.f7559a.containsKey(cls) ? this.f7561c.create(cls, creationExtras) : this.f7560b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        if (this.f7559a.containsKey(cls)) {
            return this.f7561c.create(cls);
        }
        return this.f7560b.create(cls);
    }
}
