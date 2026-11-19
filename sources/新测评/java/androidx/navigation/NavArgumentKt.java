package androidx.navigation;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001aC\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0000¨\u0006\u000b"}, m13558d2 = {"missingRequiredArguments", "", "", "", "Landroidx/navigation/NavArgument;", "isArgumentMissing", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "", "navigation-common_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n503#2,7:240\n774#3:247\n865#3,2:248\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n235#1:240,7\n237#1:247\n237#1:248,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavArgumentKt {
    public static final List<String> missingRequiredArguments(Map<String, NavArgument> map, Function1<? super String, Boolean> isArgumentMissing) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, NavArgument> entry : map.entrySet()) {
            NavArgument value = entry.getValue();
            Boolean boolValueOf = value != null ? Boolean.valueOf(value.getIsNullable()) : null;
            Intrinsics.checkNotNull(boolValueOf);
            if (!boolValueOf.booleanValue() && !value.getIsDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (isArgumentMissing.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
