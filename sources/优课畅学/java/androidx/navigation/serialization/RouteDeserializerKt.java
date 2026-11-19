package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;

/* loaded from: classes3.dex */
public final class RouteDeserializerKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(InterfaceC10052b interfaceC10052b, Bundle bundle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9133u.m16133g(interfaceC10052b, "<this>");
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        return (T) new RouteDecoder(bundle, typeMap).decodeRouteWithArgs$navigation_common_release(interfaceC10052b);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(InterfaceC10052b interfaceC10052b, SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9133u.m16133g(interfaceC10052b, "<this>");
        AbstractC9133u.m16133g(handle, "handle");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        return (T) new RouteDecoder(handle, typeMap).decodeRouteWithArgs$navigation_common_release(interfaceC10052b);
    }
}
