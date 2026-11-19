package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.CanonicalName_jvmKt;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;

@ViewModelFactoryDsl
/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryBuilder {
    private final Map<InterfaceC10469c, ViewModelInitializer<?>> initializers = new LinkedHashMap();

    public final <T extends ViewModel> void addInitializer(InterfaceC10469c clazz, InterfaceC9540l initializer) {
        AbstractC9979u.m20294g(clazz, "clazz");
        AbstractC9979u.m20294g(initializer, "initializer");
        if (!this.initializers.containsKey(clazz)) {
            this.initializers.put(clazz, new ViewModelInitializer<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + CanonicalName_jvmKt.getCanonicalName(clazz) + '.').toString());
    }

    public final ViewModelProvider.Factory build() {
        return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release(this.initializers.values());
    }
}
