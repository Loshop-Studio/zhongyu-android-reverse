package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import p113g8.AbstractC8656a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC10559a() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        @Override // p300x7.InterfaceC10559a
        public final SaveableStateRegistry invoke() {
            return null;
        }
    });

    public static final SaveableStateRegistry SaveableStateRegistry(Map<String, ? extends List<? extends Object>> map, InterfaceC10570l interfaceC10570l) {
        return new SaveableStateRegistryImpl(map, interfaceC10570l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC8656a.m13941c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<K, V> toMutableScatterMap(Map<K, ? extends V> map) {
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(map.size());
        mutableScatterMap.putAll(map);
        return mutableScatterMap;
    }
}
