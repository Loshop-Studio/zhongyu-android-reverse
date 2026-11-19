package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateWriter;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteDeserializerKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavBackStackEntry;", "toRoute", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/Object;", "Ly6/c;", "route", "(Landroidx/navigation/NavBackStackEntry;Ly6/c;)Ljava/lang/Object;", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n27#2:164\n46#2:165\n32#2,4:166\n31#2,7:176\n126#3:170\n153#3,3:171\n37#4,2:174\n1#5:183\n106#6:184\n46#7:185\n462#8:186\n412#8:187\n1246#9,4:188\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n*L\n159#1:164\n159#1:165\n159#1:166,4\n159#1:176,7\n159#1:170\n159#1:171,3\n159#1:174,2\n159#1:183\n159#1:184\n159#1:185\n160#1:186\n160#1:187\n160#1:188,4\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryKt {
    public static final <T> T toRoute(@NotNull NavBackStackEntry navBackStackEntry, @NotNull InterfaceC6779c route) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(navBackStackEntry, "<this>");
        AbstractC5830k.m5330g(route, "route");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null) {
            Map mapM5147A = AbstractC5785e0.m5147A();
            if (mapM5147A.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM5147A.size());
                for (Map.Entry entry : mapM5147A.entrySet()) {
                    AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            arguments = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m13683constructorimpl(arguments);
        }
        Map<String, NavArgument> arguments2 = navBackStackEntry.getDestination().getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5785e0.m5149C(arguments2.size()));
        Iterator<T> it = arguments2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((NavArgument) entry2.getValue()).getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(AbstractC6768a.m6453r(route), arguments, linkedHashMap);
    }

    public static final <T> T toRoute(NavBackStackEntry navBackStackEntry) {
        AbstractC5830k.m5330g(navBackStackEntry, "<this>");
        AbstractC5830k.m5338o();
        throw null;
    }
}
