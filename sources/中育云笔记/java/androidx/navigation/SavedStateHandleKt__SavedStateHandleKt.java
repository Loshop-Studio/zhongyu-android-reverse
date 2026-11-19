package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5432b;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;

/* loaded from: classes.dex */
final /* synthetic */ class SavedStateHandleKt__SavedStateHandleKt {
    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<InterfaceC10481o, NavType<?>> typeMap) {
        AbstractC9979u.m20294g(savedStateHandle, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) SavedStateHandleKt.toRoute(savedStateHandle, AbstractC9983y.m20315b(Object.class), typeMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(savedStateHandle, "<this>");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return SavedStateHandleKt.toRoute(savedStateHandle, AbstractC9983y.m20315b(Object.class), typeMap);
    }

    public static final <T> T toRoute(SavedStateHandle savedStateHandle, InterfaceC10469c route, Map<InterfaceC10481o, NavType<?>> typeMap) {
        AbstractC9979u.m20294g(savedStateHandle, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC5432b interfaceC5432bM2953c = AbstractC5447q.m2953c(route);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(interfaceC5432bM2953c, typeMap)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(interfaceC5432bM2953c, savedStateHandle, linkedHashMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, InterfaceC10469c interfaceC10469c, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = AbstractC9925a.m20088h();
        }
        return SavedStateHandleKt.toRoute(savedStateHandle, interfaceC10469c, map);
    }
}
