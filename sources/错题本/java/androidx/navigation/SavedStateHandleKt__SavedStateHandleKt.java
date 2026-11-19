package androidx.navigation;

import android.view.SavedStateHandle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5686b;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0003H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001aH\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0003¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/SavedStateHandle;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "toRoute", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "Ly6/c;", "route", "(Landroidx/lifecycle/SavedStateHandle;Ly6/c;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/SavedStateHandleKt")
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n2642#2:68\n1#3:69\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n*L\n64#1:68\n64#1:69\n*E\n"})
/* loaded from: classes2.dex */
final /* synthetic */ class SavedStateHandleKt__SavedStateHandleKt {
    @NotNull
    public static final <T> T toRoute(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC6779c route, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap) {
        AbstractC5830k.m5330g(savedStateHandle, "<this>");
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC5686b interfaceC5686bM6453r = AbstractC6768a.m6453r(route);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(interfaceC5686bM6453r, typeMap)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(interfaceC5686bM6453r, savedStateHandle, linkedHashMap);
    }

    public static Object toRoute$default(SavedStateHandle savedStateHandle, Map typeMap, int i, Object obj) {
        if ((i & 1) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(savedStateHandle, "<this>");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, InterfaceC6779c interfaceC6779c, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        return SavedStateHandleKt.toRoute(savedStateHandle, interfaceC6779c, map);
    }

    public static final <T> T toRoute(SavedStateHandle savedStateHandle, Map<InterfaceC6793q, NavType<?>> typeMap) {
        AbstractC5830k.m5330g(savedStateHandle, "<this>");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5338o();
        throw null;
    }
}
