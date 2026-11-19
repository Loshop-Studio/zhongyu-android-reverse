package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.savedstate.SavedStateReader;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class SavedStateArgStore extends ArgStore {
    private final Bundle savedState;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateArgStore(Bundle savedState, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(savedState, "savedState");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.savedState = savedState;
        this.typeMap = typeMap;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(String key) {
        AbstractC9979u.m20294g(key, "key");
        return SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(this.savedState), key);
    }

    @Override // androidx.navigation.serialization.ArgStore
    public Object get(String key) {
        AbstractC9979u.m20294g(key, "key");
        NavType<?> navType = this.typeMap.get(key);
        if (navType != null) {
            return navType.get(this.savedState, key);
        }
        return null;
    }
}
