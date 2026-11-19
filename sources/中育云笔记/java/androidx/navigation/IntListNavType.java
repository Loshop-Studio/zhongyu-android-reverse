package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10962o;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes.dex */
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
        return AbstractC10978w.m24136n();
    }

    @Override // androidx.navigation.NavType
    public List<Integer> get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return AbstractC10968r.m24093n1(SavedStateReader.m33856getIntArrayimpl(bundleM33824constructorimpl, key));
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, List<Integer> list) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        if (list != null) {
            SavedStateWriter.m33928putIntArrayimpl(SavedStateWriter.m33910constructorimpl(bundle), key, AbstractC10947g0.m23921W0(list));
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Integer> list) {
        if (list == null) {
            return AbstractC10978w.m24136n();
        }
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<Integer> list, List<Integer> list2) {
        return AbstractC10962o.m23983d(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public List<Integer> parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return AbstractC10976v.m24126e(NavType.IntType.parseValue(value));
    }

    @Override // androidx.navigation.NavType
    public List<Integer> parseValue(String value, List<Integer> list) {
        List<Integer> listM23906H0;
        AbstractC9979u.m20294g(value, "value");
        return (list == null || (listM23906H0 = AbstractC10947g0.m23906H0(list, parseValue(value))) == null) ? parseValue(value) : listM23906H0;
    }
}
