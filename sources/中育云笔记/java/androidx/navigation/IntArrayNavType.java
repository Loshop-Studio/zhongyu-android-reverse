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
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m33856getIntArrayimpl(bundleM33824constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, int[] iArr) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (iArr != null) {
            SavedStateWriter.m33928putIntArrayimpl(bundleM33910constructorimpl, key, iArr);
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(int[] iArr) {
        List listM24093n1;
        if (iArr == null || (listM24093n1 = AbstractC10968r.m24093n1(iArr)) == null) {
            return AbstractC10978w.m24136n();
        }
        List list = listM24093n1;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(int[] iArr, int[] iArr2) {
        return AbstractC10962o.m23983d(iArr != null ? AbstractC10964p.m24012a0(iArr) : null, iArr2 != null ? AbstractC10964p.m24012a0(iArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public int[] parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return new int[]{NavType.IntType.parseValue(value).intValue()};
    }

    @Override // androidx.navigation.NavType
    public int[] parseValue(String value, int[] iArr) {
        int[] iArrM23996K;
        AbstractC9979u.m20294g(value, "value");
        return (iArr == null || (iArrM23996K = AbstractC10964p.m23996K(iArr, parseValue(value))) == null) ? parseValue(value) : iArrM23996K;
    }
}
