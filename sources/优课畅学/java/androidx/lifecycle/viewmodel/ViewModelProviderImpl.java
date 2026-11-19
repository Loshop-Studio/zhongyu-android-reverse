package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;

/* loaded from: classes3.dex */
public final class ViewModelProviderImpl {
    private final CreationExtras defaultExtras;
    private final ViewModelProvider.Factory factory;
    private final SynchronizedObject lock;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras defaultExtras) {
        AbstractC9133u.m16133g(store, "store");
        AbstractC9133u.m16133g(factory, "factory");
        AbstractC9133u.m16133g(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new SynchronizedObject();
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, InterfaceC8375c interfaceC8375c, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(interfaceC8375c);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(interfaceC8375c, str);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(InterfaceC8375c modelClass, String key) {
        T t10;
        AbstractC9133u.m16133g(modelClass, "modelClass");
        AbstractC9133u.m16133g(key, "key");
        synchronized (this.lock) {
            try {
                t10 = (T) this.store.get(key);
                if (modelClass.mo13670c(t10)) {
                    if (this.factory instanceof ViewModelProvider.OnRequeryFactory) {
                        ViewModelProvider.OnRequeryFactory onRequeryFactory = (ViewModelProvider.OnRequeryFactory) this.factory;
                        AbstractC9133u.m16130d(t10);
                        onRequeryFactory.onRequery(t10);
                    }
                    AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultExtras);
                    mutableCreationExtras.set(ViewModelProvider.VIEW_MODEL_KEY, key);
                    t10 = (T) ViewModelProviderImpl_androidKt.createViewModel(this.factory, modelClass, mutableCreationExtras);
                    this.store.put(key, t10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }
}
