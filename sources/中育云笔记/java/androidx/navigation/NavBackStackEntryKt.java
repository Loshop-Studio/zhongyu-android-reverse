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
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.AbstractC5447q;
import p280od.InterfaceC10469c;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10967q0;

/* loaded from: classes.dex */
public final class NavBackStackEntryKt {
    public static final /* synthetic */ <T> T toRoute(NavBackStackEntry navBackStackEntry) {
        AbstractC9979u.m20294g(navBackStackEntry, "<this>");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) toRoute(navBackStackEntry, AbstractC9983y.m20315b(Object.class));
    }

    public static final <T> T toRoute(NavBackStackEntry navBackStackEntry, InterfaceC10469c route) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(navBackStackEntry, "<this>");
        AbstractC9979u.m20294g(route, "route");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null) {
            Map mapM20088h = AbstractC9925a.m20088h();
            if (mapM20088h.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM20088h.size());
                for (Map.Entry entry : mapM20088h.entrySet()) {
                    arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            arguments = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m33910constructorimpl(arguments);
        }
        Map<String, NavArgument> arguments2 = navBackStackEntry.getDestination().getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10967q0.m24038e(arguments2.size()));
        Iterator<T> it = arguments2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((NavArgument) entry2.getValue()).getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(AbstractC5447q.m2953c(route), arguments, linkedHashMap);
    }
}
