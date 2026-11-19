package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10052b;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateHandleKt__SavedStateHandleKt {
    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<InterfaceC8387o, NavType<?>> typeMap) {
        AbstractC9133u.m16133g(savedStateHandle, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) SavedStateHandleKt.toRoute(savedStateHandle, AbstractC9137y.m16154b(Object.class), typeMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(savedStateHandle, "<this>");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return SavedStateHandleKt.toRoute(savedStateHandle, AbstractC9137y.m16154b(Object.class), typeMap);
    }

    public static final <T> T toRoute(SavedStateHandle savedStateHandle, InterfaceC8375c route, Map<InterfaceC8387o, NavType<?>> typeMap) {
        AbstractC9133u.m16133g(savedStateHandle, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC10052b interfaceC10052bM18778b = AbstractC10067q.m18778b(route);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(interfaceC10052bM18778b, typeMap)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(interfaceC10052bM18778b, savedStateHandle, linkedHashMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, InterfaceC8375c interfaceC8375c, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = AbstractC9080a.m15943h();
        }
        return SavedStateHandleKt.toRoute(savedStateHandle, interfaceC8375c, map);
    }
}
