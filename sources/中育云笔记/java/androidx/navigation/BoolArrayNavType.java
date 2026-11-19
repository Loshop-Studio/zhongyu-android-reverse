package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10962o;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes.dex */
public final class BoolArrayNavType extends CollectionNavType<boolean[]> {
    public BoolArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    public boolean[] emptyCollection() {
        return new boolean[0];
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "boolean[]";
    }

    @Override // androidx.navigation.NavType
    public boolean[] get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m33834getBooleanArrayimpl(bundleM33824constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, boolean[] zArr) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (zArr != null) {
            SavedStateWriter.m33917putBooleanArrayimpl(bundleM33910constructorimpl, key, zArr);
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(boolean[] zArr) {
        List listM24099q1;
        if (zArr == null || (listM24099q1 = AbstractC10968r.m24099q1(zArr)) == null) {
            return AbstractC10978w.m24136n();
        }
        List list = listM24099q1;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(boolean[] zArr, boolean[] zArr2) {
        return AbstractC10962o.m23983d(zArr != null ? AbstractC10964p.m24009X(zArr) : null, zArr2 != null ? AbstractC10964p.m24009X(zArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public boolean[] parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return new boolean[]{NavType.BoolType.parseValue(value).booleanValue()};
    }

    @Override // androidx.navigation.NavType
    public boolean[] parseValue(String value, boolean[] zArr) {
        boolean[] zArrM24000O;
        AbstractC9979u.m20294g(value, "value");
        return (zArr == null || (zArrM24000O = AbstractC10964p.m24000O(zArr, parseValue(value))) == null) ? parseValue(value) : zArrM24000O;
    }
}
