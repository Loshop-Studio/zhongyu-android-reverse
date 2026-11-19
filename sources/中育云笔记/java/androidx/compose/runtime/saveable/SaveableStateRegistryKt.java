package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p310qd.AbstractC10788a;

/* loaded from: classes2.dex */
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        @Override // p181hd.InterfaceC9529a
        public final SaveableStateRegistry invoke() {
            return null;
        }
    });

    public static final SaveableStateRegistry SaveableStateRegistry(Map<String, ? extends List<? extends Object>> map, InterfaceC9540l interfaceC9540l) {
        return new SaveableStateRegistryImpl(map, interfaceC9540l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC10788a.m23075c(charSequence.charAt(i10))) {
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
