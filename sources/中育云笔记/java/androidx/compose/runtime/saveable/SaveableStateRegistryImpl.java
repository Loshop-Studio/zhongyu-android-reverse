package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final InterfaceC9540l canBeSaved;
    private final MutableScatterMap<String, List<Object>> restored;
    private MutableScatterMap<String, List<InterfaceC9529a>> valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> map, InterfaceC9540l interfaceC9540l) {
        this.canBeSaved = interfaceC9540l;
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
        List<Object> list = listRemove;
        if (list == null || list.isEmpty()) {
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
    public SaveableStateRegistry.Entry registerProvider(final String str, final InterfaceC9529a interfaceC9529a) {
        if (SaveableStateRegistryKt.fastIsBlank(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        final MutableScatterMap<String, List<InterfaceC9529a>> mutableScatterMapMutableScatterMapOf = this.valueProviders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.valueProviders = mutableScatterMapMutableScatterMapOf;
        }
        List<InterfaceC9529a> arrayList = mutableScatterMapMutableScatterMapOf.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            mutableScatterMapMutableScatterMapOf.set(str, arrayList);
        }
        arrayList.add(interfaceC9529a);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.registerProvider.3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                List<InterfaceC9529a> listRemove = mutableScatterMapMutableScatterMapOf.remove(str);
                if (listRemove != null) {
                    listRemove.remove(interfaceC9529a);
                }
                List<InterfaceC9529a> list = listRemove;
                if (list == null || list.isEmpty()) {
                    return;
                }
                mutableScatterMapMutableScatterMapOf.set(str, listRemove);
            }
        };
    }
}
