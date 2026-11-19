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
public final class StringListNavType extends CollectionNavType<List<? extends String>> {
    public StringListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<String>";
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
        return serializeAsValues2((List<String>) list);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends String> emptyCollection() {
        return AbstractC10978w.m24136n();
    }

    @Override // androidx.navigation.NavType
    public List<String> get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return AbstractC10968r.m24097p1(SavedStateReader.m33896getStringArrayimpl(bundleM33824constructorimpl, key));
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, List<String> list) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (list != null) {
            SavedStateWriter.m33944putStringArrayimpl(bundleM33910constructorimpl, key, (String[]) list.toArray(new String[0]));
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<String> list) {
        if (list == null) {
            return AbstractC10978w.m24136n();
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, (String) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<String> list, List<String> list2) {
        return AbstractC10962o.m23983d(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public List<String> parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return AbstractC10976v.m24126e(value);
    }

    @Override // androidx.navigation.NavType
    public List<String> parseValue(String value, List<String> list) {
        List<String> listM23906H0;
        AbstractC9979u.m20294g(value, "value");
        return (list == null || (listM23906H0 = AbstractC10947g0.m23906H0(list, parseValue(value))) == null) ? parseValue(value) : listM23906H0;
    }
}
