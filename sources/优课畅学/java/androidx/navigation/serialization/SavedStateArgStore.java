package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.savedstate.SavedStateReader;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
final class SavedStateArgStore extends ArgStore {
    private final Bundle savedState;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateArgStore(Bundle savedState, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9133u.m16133g(savedState, "savedState");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.savedState = savedState;
        this.typeMap = typeMap;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(String key) {
        AbstractC9133u.m16133g(key, "key");
        return SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(this.savedState), key);
    }

    @Override // androidx.navigation.serialization.ArgStore
    public Object get(String key) {
        AbstractC9133u.m16133g(key, "key");
        NavType<?> navType = this.typeMap.get(key);
        if (navType != null) {
            return navType.get(this.savedState, key);
        }
        return null;
    }
}
