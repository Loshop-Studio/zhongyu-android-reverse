package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    public static final int findIndexByKey(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i10) {
        int index;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i10 < lazyLayoutItemProvider.getItemCount() && AbstractC9979u.m20289b(obj, lazyLayoutItemProvider.getKey(i10))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i10 : index;
    }
}
