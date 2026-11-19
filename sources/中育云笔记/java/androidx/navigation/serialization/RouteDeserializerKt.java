package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* loaded from: classes.dex */
public final class RouteDeserializerKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(InterfaceC5432b interfaceC5432b, Bundle bundle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(interfaceC5432b, "<this>");
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        return (T) new RouteDecoder(bundle, typeMap).decodeRouteWithArgs$navigation_common_release(interfaceC5432b);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(InterfaceC5432b interfaceC5432b, SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(interfaceC5432b, "<this>");
        AbstractC9979u.m20294g(handle, "handle");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        return (T) new RouteDecoder(handle, typeMap).decodeRouteWithArgs$navigation_common_release(interfaceC5432b);
    }
}
