package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p289w7.AbstractC10360a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final InterfaceC8375c clazz;
    private final InterfaceC10570l initializer;

    public ViewModelInitializer(InterfaceC8375c clazz, InterfaceC10570l initializer) {
        AbstractC9133u.m16133g(clazz, "clazz");
        AbstractC9133u.m16133g(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final InterfaceC8375c getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final InterfaceC10570l getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> clazz, InterfaceC10570l initializer) {
        this(AbstractC10360a.m19300c(clazz), initializer);
        AbstractC9133u.m16133g(clazz, "clazz");
        AbstractC9133u.m16133g(initializer, "initializer");
    }
}
