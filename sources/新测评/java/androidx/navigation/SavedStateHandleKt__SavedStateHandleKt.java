package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata(m13557d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u001d\b\u0002\u0010\u0004\u001a\u0017\u0012\u0004\u0012\u00020\u0006\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\b0\u0005H\u0086\b¢\u0006\u0002\u0010\t\u001aF\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\u001d\b\u0002\u0010\u0004\u001a\u0017\u0012\u0004\u0012\u00020\u0006\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0007¢\u0006\u0002\b\b0\u0005¢\u0006\u0002\u0010\f¨\u0006\r"}, m13558d2 = {"toRoute", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/SavedStateHandle;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "route", "Lkotlin/reflect/KClass;", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/reflect/KClass;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/navigation/SavedStateHandleKt")
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n2642#2:68\n1#3:69\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n*L\n64#1:68\n64#1:69\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateHandleKt__SavedStateHandleKt {
    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<KType, NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) SavedStateHandleKt.toRoute(savedStateHandle, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return SavedStateHandleKt.toRoute(savedStateHandle, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
    }

    public static final <T> T toRoute(SavedStateHandle savedStateHandle, KClass<T> route, Map<KType, NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KSerializer kSerializerSerializer = SerializersKt.serializer(route);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(kSerializerSerializer, typeMap)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(kSerializerSerializer, savedStateHandle, linkedHashMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, KClass kClass, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        return SavedStateHandleKt.toRoute(savedStateHandle, kClass, map);
    }
}
