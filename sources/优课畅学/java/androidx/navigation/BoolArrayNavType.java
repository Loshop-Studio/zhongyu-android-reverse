package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8795o;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes3.dex */
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
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m27239getBooleanArrayimpl(bundleM27229constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, boolean[] zArr) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (zArr != null) {
            SavedStateWriter.m27322putBooleanArrayimpl(bundleM27315constructorimpl, key, zArr);
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(boolean[] zArr) {
        List listM14738v1;
        if (zArr == null || (listM14738v1 = AbstractC8801r.m14738v1(zArr)) == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14738v1, 10));
        Iterator it = listM14738v1.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(boolean[] zArr, boolean[] zArr2) {
        return AbstractC8795o.m14607d(zArr != null ? AbstractC8797p.m14635Y(zArr) : null, zArr2 != null ? AbstractC8797p.m14635Y(zArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public boolean[] parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return new boolean[]{NavType.BoolType.parseValue(value).booleanValue()};
    }

    @Override // androidx.navigation.NavType
    public boolean[] parseValue(String value, boolean[] zArr) {
        boolean[] zArrM14626P;
        AbstractC9133u.m16133g(value, "value");
        return (zArr == null || (zArrM14626P = AbstractC8797p.m14626P(zArr, parseValue(value))) == null) ? parseValue(value) : zArrM14626P;
    }
}
