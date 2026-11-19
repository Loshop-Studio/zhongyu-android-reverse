package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class CreationExtrasKt {
    public static final boolean contains(CreationExtras creationExtras, CreationExtras.Key<?> key) {
        AbstractC9979u.m20294g(creationExtras, "<this>");
        AbstractC9979u.m20294g(key, "key");
        return creationExtras.getExtras$lifecycle_viewmodel_release().containsKey(key);
    }

    public static final MutableCreationExtras plus(CreationExtras creationExtras, CreationExtras creationExtras2) {
        AbstractC9979u.m20294g(creationExtras, "<this>");
        AbstractC9979u.m20294g(creationExtras2, "creationExtras");
        return new MutableCreationExtras((Map<CreationExtras.Key<?>, ? extends Object>) AbstractC9925a.m20094n(creationExtras.getExtras$lifecycle_viewmodel_release(), creationExtras2.getExtras$lifecycle_viewmodel_release()));
    }

    public static final void plusAssign(MutableCreationExtras mutableCreationExtras, CreationExtras creationExtras) {
        AbstractC9979u.m20294g(mutableCreationExtras, "<this>");
        AbstractC9979u.m20294g(creationExtras, "creationExtras");
        mutableCreationExtras.getExtras$lifecycle_viewmodel_release().putAll(creationExtras.getExtras$lifecycle_viewmodel_release());
    }
}
