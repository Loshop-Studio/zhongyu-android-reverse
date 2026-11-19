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
public final class IntArrayNavType extends CollectionNavType<int[]> {
    public IntArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    public int[] emptyCollection() {
        return new int[0];
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "integer[]";
    }

    @Override // androidx.navigation.NavType
    public int[] get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m27261getIntArrayimpl(bundleM27229constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, int[] iArr) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (iArr != null) {
            SavedStateWriter.m27333putIntArrayimpl(bundleM27315constructorimpl, key, iArr);
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(int[] iArr) {
        List listM14732s1;
        if (iArr == null || (listM14732s1 = AbstractC8801r.m14732s1(iArr)) == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14732s1, 10));
        Iterator it = listM14732s1.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(int[] iArr, int[] iArr2) {
        return AbstractC8795o.m14607d(iArr != null ? AbstractC8797p.m14638b0(iArr) : null, iArr2 != null ? AbstractC8797p.m14638b0(iArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public int[] parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return new int[]{NavType.IntType.parseValue(value).intValue()};
    }

    @Override // androidx.navigation.NavType
    public int[] parseValue(String value, int[] iArr) {
        int[] iArrM14622L;
        AbstractC9133u.m16133g(value, "value");
        return (iArr == null || (iArrM14622L = AbstractC8797p.m14622L(iArr, parseValue(value))) == null) ? parseValue(value) : iArrM14622L;
    }
}
