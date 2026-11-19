package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final InterfaceC10469c clazz;
    private final InterfaceC9540l initializer;

    public ViewModelInitializer(InterfaceC10469c clazz, InterfaceC9540l initializer) {
        AbstractC9979u.m20294g(clazz, "clazz");
        AbstractC9979u.m20294g(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final InterfaceC10469c getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final InterfaceC9540l getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> clazz, InterfaceC9540l initializer) {
        this(AbstractC9293a.m18326c(clazz), initializer);
        AbstractC9979u.m20294g(clazz, "clazz");
        AbstractC9979u.m20294g(initializer, "initializer");
    }
}
