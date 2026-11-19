package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(final InterfaceC10574p interfaceC10574p, final InterfaceC10570l interfaceC10570l) {
        return ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, (SaverScope) obj2);
            }

            public final List<Object> invoke(SaverScope saverScope, T t10) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) interfaceC10574p.invoke(saverScope, t10)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.2
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
            @Override // p300x7.InterfaceC10570l
            public final T invoke(List<? extends Object> list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                for (int i10 = 0; i10 < list.size(); i10 += 2) {
                    Object obj = list.get(i10);
                    AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i10 + 1));
                }
                return interfaceC10570l.invoke(linkedHashMap);
            }
        });
    }
}
