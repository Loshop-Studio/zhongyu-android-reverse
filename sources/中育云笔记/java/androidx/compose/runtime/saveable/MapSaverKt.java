package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l) {
        return ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, (SaverScope) obj2);
            }

            public final List<Object> invoke(SaverScope saverScope, T t10) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) interfaceC9544p.invoke(saverScope, t10)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new InterfaceC9540l() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.2
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
            @Override // p181hd.InterfaceC9540l
            public final T invoke(List<? extends Object> list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                for (int i10 = 0; i10 < list.size(); i10 += 2) {
                    Object obj = list.get(i10);
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i10 + 1));
                }
                return interfaceC9540l.invoke(linkedHashMap);
            }
        });
    }
}
