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
public final class BoolListNavType extends CollectionNavType<List<? extends Boolean>> {
    public BoolListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<Boolean>";
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Boolean> list) {
        return serializeAsValues2((List<Boolean>) list);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends Boolean> emptyCollection() {
        return AbstractC10978w.m24136n();
    }

    @Override // androidx.navigation.NavType
    public List<Boolean> get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return AbstractC10968r.m24099q1(SavedStateReader.m33834getBooleanArrayimpl(bundleM33824constructorimpl, key));
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, List<Boolean> list) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (list != null) {
            SavedStateWriter.m33917putBooleanArrayimpl(bundleM33910constructorimpl, key, AbstractC10947g0.m23916R0(list));
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<Boolean> list) {
        if (list == null) {
            return AbstractC10978w.m24136n();
        }
        List<Boolean> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<Boolean> list, List<Boolean> list2) {
        return AbstractC10962o.m23983d(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public List<Boolean> parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return AbstractC10976v.m24126e(NavType.BoolType.parseValue(value));
    }

    @Override // androidx.navigation.NavType
    public List<Boolean> parseValue(String value, List<Boolean> list) {
        List<Boolean> listM23906H0;
        AbstractC9979u.m20294g(value, "value");
        return (list == null || (listM23906H0 = AbstractC10947g0.m23906H0(list, parseValue(value))) == null) ? parseValue(value) : listM23906H0;
    }
}
