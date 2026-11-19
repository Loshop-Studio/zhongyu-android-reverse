package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import gd.AbstractC9293a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... initializers) {
        AbstractC9979u.m20294g(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <VM extends ViewModel> VM create(Class<VM> modelClass, CreationExtras extras) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(extras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        InterfaceC10469c interfaceC10469cM18326c = AbstractC9293a.m18326c(modelClass);
        ViewModelInitializer<?>[] viewModelInitializerArr = this.initializers;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel_release(interfaceC10469cM18326c, extras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
