package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public final class ViewModelProviders {
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();
    private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    private ViewModelProviders() {
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(Collection<? extends ViewModelInitializer<?>> initializers) {
        AbstractC9979u.m20294g(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel_release(InterfaceC10469c modelClass, CreationExtras extras, ViewModelInitializer<?>... initializers) {
        VM vm;
        ViewModelInitializer<?> viewModelInitializer;
        InterfaceC9540l initializer$lifecycle_viewmodel_release;
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(extras, "extras");
        AbstractC9979u.m20294g(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm = null;
            if (i10 >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i10];
            if (AbstractC9979u.m20289b(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                break;
            }
            i10++;
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel_release = viewModelInitializer.getInitializer$lifecycle_viewmodel_release()) != null) {
            vm = (VM) initializer$lifecycle_viewmodel_release.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + CanonicalName_jvmKt.getCanonicalName(modelClass)).toString());
    }

    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
        AbstractC9979u.m20294g(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
        AbstractC9979u.m20294g(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
    }

    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel_release(InterfaceC10469c modelClass) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        String canonicalName = CanonicalName_jvmKt.getCanonicalName(modelClass);
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
    }

    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(ViewModelInitializer<?>... initializers) {
        AbstractC9979u.m20294g(initializers, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(initializers, initializers.length));
    }
}
