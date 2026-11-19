package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8798p0;
import p246s8.AbstractC10067q;

/* loaded from: classes3.dex */
public final class NavBackStackEntryKt {
    public static final /* synthetic */ <T> T toRoute(NavBackStackEntry navBackStackEntry) {
        AbstractC9133u.m16133g(navBackStackEntry, "<this>");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) toRoute(navBackStackEntry, AbstractC9137y.m16154b(Object.class));
    }

    public static final <T> T toRoute(NavBackStackEntry navBackStackEntry, InterfaceC8375c route) {
        Pair[] pairArr;
        AbstractC9133u.m16133g(navBackStackEntry, "<this>");
        AbstractC9133u.m16133g(route, "route");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null) {
            Map mapM15943h = AbstractC9080a.m15943h();
            if (mapM15943h.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM15943h.size());
                for (Map.Entry entry : mapM15943h.entrySet()) {
                    arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            arguments = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m27315constructorimpl(arguments);
        }
        Map<String, NavArgument> arguments2 = navBackStackEntry.getDestination().getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8798p0.m14663e(arguments2.size()));
        Iterator<T> it = arguments2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((NavArgument) entry2.getValue()).getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(AbstractC10067q.m18778b(route), arguments, linkedHashMap);
    }
}
