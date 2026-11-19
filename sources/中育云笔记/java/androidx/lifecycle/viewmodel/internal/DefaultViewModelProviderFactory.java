package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(InterfaceC10469c modelClass, CreationExtras extras) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(AbstractC9293a.m18324a(modelClass));
    }
}
