package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class MutableCreationExtras extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        AbstractC9979u.m20294g(key, "key");
        return (T) getExtras$lifecycle_viewmodel_release().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t10) {
        AbstractC9979u.m20294g(key, "key");
        getExtras$lifecycle_viewmodel_release().put(key, t10);
    }

    public MutableCreationExtras(Map<CreationExtras.Key<?>, ? extends Object> initialExtras) {
        AbstractC9979u.m20294g(initialExtras, "initialExtras");
        getExtras$lifecycle_viewmodel_release().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MutableCreationExtras(CreationExtras initialExtras) {
        this((Map<CreationExtras.Key<?>, ? extends Object>) initialExtras.getExtras$lifecycle_viewmodel_release());
        AbstractC9979u.m20294g(initialExtras, "initialExtras");
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
