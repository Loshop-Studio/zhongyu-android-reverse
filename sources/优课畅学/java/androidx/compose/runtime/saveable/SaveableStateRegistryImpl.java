package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final InterfaceC10570l canBeSaved;
    private final MutableScatterMap<String, List<Object>> restored;
    private MutableScatterMap<String, List<InterfaceC10559a>> valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> map, InterfaceC10570l interfaceC10570l) {
        this.canBeSaved = interfaceC10570l;
        this.restored = (map == null || map.isEmpty()) ? null : SaveableStateRegistryKt.toMutableScatterMap(map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return ((Boolean) this.canBeSaved.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        MutableScatterMap<String, List<Object>> mutableScatterMap;
        MutableScatterMap<String, List<Object>> mutableScatterMap2 = this.restored;
        List<Object> listRemove = mutableScatterMap2 != null ? mutableScatterMap2.remove(str) : null;
        if (listRemove == null || listRemove.isEmpty()) {
            return null;
        }
        if (listRemove.size() > 1 && (mutableScatterMap = this.restored) != null) {
            mutableScatterMap.put(str, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.performSave():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String str, final InterfaceC10559a interfaceC10559a) {
        if (SaveableStateRegistryKt.fastIsBlank(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        final MutableScatterMap<String, List<InterfaceC10559a>> mutableScatterMapMutableScatterMapOf = this.valueProviders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.valueProviders = mutableScatterMapMutableScatterMapOf;
        }
        List<InterfaceC10559a> arrayList = mutableScatterMapMutableScatterMapOf.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            mutableScatterMapMutableScatterMapOf.set(str, arrayList);
        }
        arrayList.add(interfaceC10559a);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.registerProvider.3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                List<InterfaceC10559a> listRemove = mutableScatterMapMutableScatterMapOf.remove(str);
                if (listRemove != null) {
                    listRemove.remove(interfaceC10559a);
                }
                if (listRemove == null || listRemove.isEmpty()) {
                    return;
                }
                mutableScatterMapMutableScatterMapOf.set(str, listRemove);
            }
        };
    }
}
