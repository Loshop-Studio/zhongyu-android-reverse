package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10967q0;

/* loaded from: classes.dex */
final class SavedStateHandleArgStore extends ArgStore {
    private final SavedStateHandle handle;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleArgStore(SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(handle, "handle");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.handle = handle;
        this.typeMap = typeMap;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(String key) {
        AbstractC9979u.m20294g(key, "key");
        return this.handle.contains(key);
    }

    @Override // androidx.navigation.serialization.ArgStore
    public Object get(String key) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(key, "key");
        Map mapM24039f = AbstractC10967q0.m24039f(AbstractC10776g.m22975a(key, this.handle.get(key)));
        if (mapM24039f.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM24039f.size());
            for (Map.Entry entry : mapM24039f.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        NavType<?> navType = this.typeMap.get(key);
        if (navType != null) {
            return navType.get(bundleBundleOf, key);
        }
        throw new IllegalStateException(("Failed to find type for " + key + " when decoding " + this.handle).toString());
    }
}
