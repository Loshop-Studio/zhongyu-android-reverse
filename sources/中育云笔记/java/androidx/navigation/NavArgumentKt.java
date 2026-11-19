package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class NavArgumentKt {
    public static final List<String> missingRequiredArguments(Map<String, NavArgument> map, InterfaceC9540l isArgumentMissing) {
        AbstractC9979u.m20294g(map, "<this>");
        AbstractC9979u.m20294g(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, NavArgument> entry : map.entrySet()) {
            NavArgument value = entry.getValue();
            Boolean boolValueOf = value != null ? Boolean.valueOf(value.isNullable()) : null;
            AbstractC9979u.m20291d(boolValueOf);
            if (!boolValueOf.booleanValue() && !value.isDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
