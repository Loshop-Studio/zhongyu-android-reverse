package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8795o;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes3.dex */
public final class IntListNavType extends CollectionNavType<List<? extends Integer>> {
    public IntListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<Int>";
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Integer> list) {
        return serializeAsValues2((List<Integer>) list);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends Integer> emptyCollection() {
        return AbstractC8809v.m14771n();
    }

    @Override // androidx.navigation.NavType
    public List<Integer> get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return AbstractC8801r.m14732s1(SavedStateReader.m27261getIntArrayimpl(bundleM27229constructorimpl, key));
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, List<Integer> list) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        if (list != null) {
            SavedStateWriter.m27333putIntArrayimpl(SavedStateWriter.m27315constructorimpl(bundle), key, AbstractC8778f0.m14543T0(list));
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Integer> list) {
        if (list == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<Integer> list, List<Integer> list2) {
        return AbstractC8795o.m14607d(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public List<Integer> parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return AbstractC8807u.m14755e(NavType.IntType.parseValue(value));
    }

    @Override // androidx.navigation.NavType
    public List<Integer> parseValue(String value, List<Integer> list) {
        List<Integer> listM14529F0;
        AbstractC9133u.m16133g(value, "value");
        return (list == null || (listM14529F0 = AbstractC8778f0.m14529F0(list, parseValue(value))) == null) ? parseValue(value) : listM14529F0;
    }
}
