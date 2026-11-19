package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public final class ViewModelProviderImpl {
    private final CreationExtras defaultExtras;
    private final ViewModelProvider.Factory factory;
    private final SynchronizedObject lock;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras defaultExtras) {
        AbstractC9979u.m20294g(store, "store");
        AbstractC9979u.m20294g(factory, "factory");
        AbstractC9979u.m20294g(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new SynchronizedObject();
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, InterfaceC10469c interfaceC10469c, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(interfaceC10469c);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(interfaceC10469c, str);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(InterfaceC10469c modelClass, String key) {
        T t10;
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(key, "key");
        synchronized (this.lock) {
            try {
                t10 = (T) this.store.get(key);
                if (modelClass.mo20275d(t10)) {
                    if (this.factory instanceof ViewModelProvider.OnRequeryFactory) {
                        ViewModelProvider.OnRequeryFactory onRequeryFactory = (ViewModelProvider.OnRequeryFactory) this.factory;
                        AbstractC9979u.m20291d(t10);
                        onRequeryFactory.onRequery(t10);
                    }
                    AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
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
