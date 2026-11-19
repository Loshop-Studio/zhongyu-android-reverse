package androidx.navigation.serialization;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import com.zykj.mistake.activity.C4480p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.C5823d;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p084i7.C5687c;
import p084i7.InterfaceC5686b;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6474f;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0004*\u00020\u00172\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008e\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022S\u0010#\u001aO\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b$\u0010%\u001a\u0090\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u00022S\u0010#\u001aO\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b'\u0010%\u001a/\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010.\u001a\u00020-*\u00020\u0017H\u0000¢\u0006\u0004\b.\u0010/¨\u00060"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "typeMap", "", "path", "generateRoutePattern", "(Li7/b;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Landroidx/navigation/NamedNavArgument;", "generateNavArguments", "(Li7/b;Ljava/util/Map;)Ljava/util/List;", "", "route", "generateRouteWithArgs", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlin/Function0;", "Ld6/s;", "handler", "assertNotAbstractClass", "(Li7/b;Lr6/a;)V", "Lk7/g;", "computeNavType", "(Lk7/g;Ljava/util/Map;)Landroidx/navigation/NavType;", "", "generateHashCode", "(Li7/b;)I", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "argName", "navType", "operation", "forEachIndexedKType", "(Li7/b;Ljava/util/Map;Lr6/f;)V", "forEachIndexed", "forEachIndexedName", "fieldName", "fieldType", "className", "unknownNavTypeErrorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "isValueClass", "(Lk7/g;)Z", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
/* loaded from: classes2.dex */
public final class RouteSerializerKt {
    private static final <T> void assertNotAbstractClass(InterfaceC5686b interfaceC5686b, InterfaceC6469a interfaceC6469a) {
        if (interfaceC5686b instanceof C5687c) {
            interfaceC6469a.invoke();
        }
    }

    private static final NavType<Object> computeNavType(InterfaceC5765g interfaceC5765g, Map<InterfaceC6793q, ? extends NavType<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (NavTypeConverterKt.matchKType(interfaceC5765g, (InterfaceC6793q) next)) {
                break;
            }
        }
        InterfaceC6793q interfaceC6793q = (InterfaceC6793q) next;
        NavType<?> navType = interfaceC6793q != null ? map.get(interfaceC6793q) : null;
        if (navType == null) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(interfaceC5765g);
        }
        if (AbstractC5830k.m5325b(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        AbstractC5830k.m5328e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navType;
    }

    @JvmName(name = "forEachIndexedKType")
    private static final <T> void forEachIndexedKType(InterfaceC5686b interfaceC5686b, Map<InterfaceC6793q, ? extends NavType<?>> map, InterfaceC6474f interfaceC6474f) {
        int iMo5101d = interfaceC5686b.getDescriptor().mo5101d();
        for (int i = 0; i < iMo5101d; i++) {
            String strMo5102e = interfaceC5686b.getDescriptor().mo5102e(i);
            NavType<Object> navTypeComputeNavType = computeNavType(interfaceC5686b.getDescriptor().mo5104g(i), map);
            if (navTypeComputeNavType == null) {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(strMo5102e, interfaceC5686b.getDescriptor().mo5104g(i).mo5105h(), interfaceC5686b.getDescriptor().mo5105h(), map.toString()));
            }
            interfaceC6474f.invoke(Integer.valueOf(i), strMo5102e, navTypeComputeNavType);
        }
    }

    public static /* synthetic */ void forEachIndexedKType$default(InterfaceC5686b interfaceC5686b, Map map, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 1) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        forEachIndexedKType(interfaceC5686b, map, interfaceC6474f);
    }

    @JvmName(name = "forEachIndexedName")
    private static final <T> void forEachIndexedName(InterfaceC5686b interfaceC5686b, Map<String, ? extends NavType<Object>> map, InterfaceC6474f interfaceC6474f) {
        int iMo5101d = interfaceC5686b.getDescriptor().mo5101d();
        for (int i = 0; i < iMo5101d; i++) {
            String strMo5102e = interfaceC5686b.getDescriptor().mo5102e(i);
            NavType<Object> navType = map.get(strMo5102e);
            if (navType == null) {
                throw new IllegalStateException(AbstractC1923c.m1047k(']', "Cannot locate NavType for argument [", strMo5102e).toString());
            }
            interfaceC6474f.invoke(Integer.valueOf(i), strMo5102e, navType);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> int generateHashCode(@NotNull InterfaceC5686b interfaceC5686b) {
        AbstractC5830k.m5330g(interfaceC5686b, "<this>");
        int iHashCode = interfaceC5686b.getDescriptor().mo5105h().hashCode();
        int iMo5101d = interfaceC5686b.getDescriptor().mo5101d();
        for (int i = 0; i < iMo5101d; i++) {
            iHashCode = (iHashCode * 31) + interfaceC5686b.getDescriptor().mo5102e(i).hashCode();
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T> List<NamedNavArgument> generateNavArguments(@NotNull InterfaceC5686b interfaceC5686b, @NotNull Map<InterfaceC6793q, ? extends NavType<?>> typeMap) {
        AbstractC5830k.m5330g(interfaceC5686b, "<this>");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        assertNotAbstractClass(interfaceC5686b, new C2871a(interfaceC5686b, 1));
        int iMo5101d = interfaceC5686b.getDescriptor().mo5101d();
        ArrayList arrayList = new ArrayList(iMo5101d);
        int i = 0;
        while (i < iMo5101d) {
            String strMo5102e = interfaceC5686b.getDescriptor().mo5102e(i);
            InterfaceC5686b interfaceC5686b2 = interfaceC5686b;
            arrayList.add(NamedNavArgumentKt.navArgument(strMo5102e, new C4480p(i, 3, interfaceC5686b2, typeMap, strMo5102e)));
            i++;
            interfaceC5686b = interfaceC5686b2;
        }
        return arrayList;
    }

    public static /* synthetic */ List generateNavArguments$default(InterfaceC5686b interfaceC5686b, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        return generateNavArguments(interfaceC5686b, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s generateNavArguments$lambda$2(InterfaceC5686b interfaceC5686b) {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + interfaceC5686b + ". Arguments can only be generated from concrete classes or objects.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s generateNavArguments$lambda$4$lambda$3(InterfaceC5686b interfaceC5686b, int i, Map map, String str, NavArgumentBuilder navArgument) {
        AbstractC5830k.m5330g(navArgument, "$this$navArgument");
        InterfaceC5765g interfaceC5765gMo5104g = interfaceC5686b.getDescriptor().mo5104g(i);
        boolean zMo5099b = interfaceC5765gMo5104g.mo5099b();
        NavType<?> navTypeComputeNavType = computeNavType(interfaceC5765gMo5104g, map);
        if (navTypeComputeNavType == null) {
            throw new IllegalArgumentException(unknownNavTypeErrorMessage(str, interfaceC5765gMo5104g.mo5105h(), interfaceC5686b.getDescriptor().mo5105h(), map.toString()));
        }
        navArgument.setType(navTypeComputeNavType);
        navArgument.setNullable(zMo5099b);
        if (interfaceC5686b.getDescriptor().mo5106i(i)) {
            navArgument.setUnknownDefaultValuePresent$navigation_common_release(true);
        }
        return C5443s.f8405a;
    }

    @NotNull
    public static final <T> String generateRoutePattern(@NotNull InterfaceC5686b interfaceC5686b, @NotNull Map<InterfaceC6793q, ? extends NavType<?>> typeMap, @Nullable String str) {
        AbstractC5830k.m5330g(interfaceC5686b, "<this>");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        assertNotAbstractClass(interfaceC5686b, new C2871a(interfaceC5686b, 0));
        RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, interfaceC5686b) : new RouteBuilder(interfaceC5686b);
        forEachIndexedKType(interfaceC5686b, typeMap, new C2872b(routeBuilder, 0));
        return routeBuilder.build();
    }

    public static /* synthetic */ String generateRoutePattern$default(InterfaceC5686b interfaceC5686b, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(interfaceC5686b, map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s generateRoutePattern$lambda$0(InterfaceC5686b interfaceC5686b) {
        StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
        InterfaceC6779c interfaceC6779cM6448m = AbstractC6768a.m6448m(interfaceC5686b.getDescriptor());
        throw new IllegalArgumentException(AbstractC0037f.m91p(sb, interfaceC6779cM6448m != null ? ((C5823d) interfaceC6779cM6448m).m5320e() : null, ". Routes can only be generated from concrete classes or objects."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s generateRoutePattern$lambda$1(RouteBuilder routeBuilder, int i, String argName, NavType navType) {
        AbstractC5830k.m5330g(argName, "argName");
        AbstractC5830k.m5330g(navType, "navType");
        routeBuilder.appendPattern(i, argName, navType);
        return C5443s.f8405a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T> String generateRouteWithArgs(@NotNull T route, @NotNull Map<String, ? extends NavType<Object>> typeMap) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        InterfaceC5686b interfaceC5686bM6453r = AbstractC6768a.m6453r(AbstractC5832m.m5340a(route.getClass()));
        Map<String, List<String>> mapEncodeToArgMap = new RouteEncoder(interfaceC5686bM6453r, typeMap).encodeToArgMap(route);
        RouteBuilder routeBuilder = new RouteBuilder(interfaceC5686bM6453r);
        forEachIndexedName(interfaceC5686bM6453r, typeMap, new C2873c(0, mapEncodeToArgMap, routeBuilder));
        return routeBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s generateRouteWithArgs$lambda$5(Map map, RouteBuilder routeBuilder, int i, String argName, NavType navType) {
        AbstractC5830k.m5330g(argName, "argName");
        AbstractC5830k.m5330g(navType, "navType");
        Object obj = map.get(argName);
        AbstractC5830k.m5327d(obj);
        routeBuilder.appendArg(i, argName, navType, (List) obj);
        return C5443s.f8405a;
    }

    public static final boolean isValueClass(@NotNull InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        return AbstractC5830k.m5325b(interfaceC5765g.getKind(), C5770l.f9146b) && interfaceC5765g.isInline() && interfaceC5765g.mo5101d() == 1;
    }

    private static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        return AbstractC0037f.m92q(AbstractC0037f.m101z("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}
