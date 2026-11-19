package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import gd.AbstractC9293a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public class ViewModelProvider {
    public static final Companion Companion = new Companion(null);
    public static final CreationExtras.Key<String> VIEW_MODEL_KEY;
    private final ViewModelProviderImpl impl;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                factory = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            if ((i10 & 4) != 0) {
                creationExtras = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        public final ViewModelProvider create(ViewModelStoreOwner owner, Factory factory, CreationExtras extras) {
            AbstractC9979u.m20294g(owner, "owner");
            AbstractC9979u.m20294g(factory, "factory");
            AbstractC9979u.m20294g(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }

        private Companion() {
        }

        public final ViewModelProvider create(ViewModelStore store, Factory factory, CreationExtras extras) {
            AbstractC9979u.m20294g(store, "store");
            AbstractC9979u.m20294g(factory, "factory");
            AbstractC9979u.m20294g(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                factory = DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }
    }

    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Factory from(ViewModelInitializer<?>... initializers) {
                AbstractC9979u.m20294g(initializers, "initializers");
                return androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release((ViewModelInitializer<?>[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        static Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
            return Companion.from(viewModelInitializerArr);
        }

        default <T extends ViewModel> T create(Class<T> modelClass) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            return (T) androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
        }

        default <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            AbstractC9979u.m20294g(extras, "extras");
            return (T) create(modelClass);
        }

        default <T extends ViewModel> T create(InterfaceC10469c modelClass, CreationExtras extras) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            AbstractC9979u.m20294g(extras, "extras");
            return (T) create(AbstractC9293a.m18324a(modelClass), extras);
        }
    }

    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProvider.VIEW_MODEL_KEY;
        private static NewInstanceFactory _instance;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory._instance == null) {
                    NewInstanceFactory._instance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory._instance;
                AbstractC9979u.m20291d(newInstanceFactory);
                return newInstanceFactory;
            }

            private Companion() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            return (T) JvmViewModelProviders.INSTANCE.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            AbstractC9979u.m20294g(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(InterfaceC10469c modelClass, CreationExtras extras) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            AbstractC9979u.m20294g(extras, "extras");
            return (T) create(AbstractC9293a.m18324a(modelClass), extras);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            AbstractC9979u.m20294g(viewModel, "viewModel");
        }
    }

    static {
        CreationExtras.Companion companion = CreationExtras.Companion;
        VIEW_MODEL_KEY = new CreationExtras.Key<String>() { // from class: androidx.lifecycle.ViewModelProvider$special$$inlined$Key$1
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, null, 4, null);
        AbstractC9979u.m20294g(store, "store");
        AbstractC9979u.m20294g(factory, "factory");
    }

    public static final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStore, factory, creationExtras);
    }

    @MainThread
    public final <T extends ViewModel> T get(InterfaceC10469c modelClass) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        return (T) ViewModelProviderImpl.getViewModel$lifecycle_viewmodel_release$default(this.impl, modelClass, null, 2, null);
    }

    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static final CreationExtras.Key<Application> APPLICATION_KEY;
        public static final Companion Companion = new Companion(null);
        private static AndroidViewModelFactory _instance;
        private final Application application;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                AbstractC9979u.m20294g(application, "application");
                if (AndroidViewModelFactory._instance == null) {
                    AndroidViewModelFactory._instance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory._instance;
                AbstractC9979u.m20291d(androidViewModelFactory);
                return androidViewModelFactory;
            }

            private Companion() {
            }
        }

        static {
            CreationExtras.Companion companion = CreationExtras.Companion;
            APPLICATION_KEY = new CreationExtras.Key<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1
            };
        }

        private AndroidViewModelFactory(Application application, int i10) {
            this.application = application;
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            AbstractC9979u.m20294g(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            AbstractC9979u.m20294g(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            AbstractC9979u.m20294g(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                    AbstractC9979u.m20291d(tNewInstance);
                    return tNewInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.create(cls);
        }
    }

    private ViewModelProvider(ViewModelProviderImpl viewModelProviderImpl) {
        this.impl = viewModelProviderImpl;
    }

    public static final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStoreOwner, factory, creationExtras);
    }

    public <T extends ViewModel> T get(Class<T> modelClass) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        return (T) get(AbstractC9293a.m18326c(modelClass));
    }

    @MainThread
    public final <T extends ViewModel> T get(String key, InterfaceC10469c modelClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(modelClass, key);
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i10, AbstractC9972n abstractC9972n) {
        this(viewModelStore, factory, (i10 & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    public <T extends ViewModel> T get(String key, Class<T> modelClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(AbstractC9293a.m18326c(modelClass), key);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        this(new ViewModelProviderImpl(store, factory, defaultCreationExtras));
        AbstractC9979u.m20294g(store, "store");
        AbstractC9979u.m20294g(factory, "factory");
        AbstractC9979u.m20294g(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(ViewModelStoreOwner owner) {
        AbstractC9979u.m20294g(owner, "owner");
        ViewModelStore viewModelStore = owner.getViewModelStore();
        androidx.lifecycle.viewmodel.internal.ViewModelProviders viewModelProviders = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE;
        this(viewModelStore, viewModelProviders.getDefaultFactory$lifecycle_viewmodel_release(owner), viewModelProviders.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner owner, Factory factory) {
        this(owner.getViewModelStore(), factory, androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        AbstractC9979u.m20294g(owner, "owner");
        AbstractC9979u.m20294g(factory, "factory");
    }
}
