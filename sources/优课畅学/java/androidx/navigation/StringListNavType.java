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
        return AbstractC8809v.m14771n();
    }

    @Override // androidx.navigation.NavType
    public List<String> get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return AbstractC8801r.m14736u1(SavedStateReader.m27301getStringArrayimpl(bundleM27229constructorimpl, key));
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, List<String> list) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (list != null) {
            SavedStateWriter.m27349putStringArrayimpl(bundleM27315constructorimpl, key, (String[]) list.toArray(new String[0]));
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<String> list) {
        if (list == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, (String) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<String> list, List<String> list2) {
        return AbstractC8795o.m14607d(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public List<String> parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return AbstractC8807u.m14755e(value);
    }

    @Override // androidx.navigation.NavType
    public List<String> parseValue(String value, List<String> list) {
        List<String> listM14529F0;
        AbstractC9133u.m16133g(value, "value");
        return (list == null || (listM14529F0 = AbstractC8778f0.m14529F0(list, parseValue(value))) == null) ? parseValue(value) : listM14529F0;
    }
}
