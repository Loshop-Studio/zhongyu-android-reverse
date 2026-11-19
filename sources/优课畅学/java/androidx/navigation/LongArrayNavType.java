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
public final class LongArrayNavType extends CollectionNavType<long[]> {
    public LongArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    public long[] emptyCollection() {
        return new long[0];
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "long[]";
    }

    @Override // androidx.navigation.NavType
    public long[] get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m27271getLongArrayimpl(bundleM27229constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, long[] jArr) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (jArr != null) {
            SavedStateWriter.m27337putLongArrayimpl(bundleM27315constructorimpl, key, jArr);
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(long[] jArr) {
        List listM14734t1;
        if (jArr == null || (listM14734t1 = AbstractC8801r.m14734t1(jArr)) == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14734t1, 10));
        Iterator it = listM14734t1.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(long[] jArr, long[] jArr2) {
        return AbstractC8795o.m14607d(jArr != null ? AbstractC8797p.m14639c0(jArr) : null, jArr2 != null ? AbstractC8797p.m14639c0(jArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public long[] parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return new long[]{NavType.LongType.parseValue(value).longValue()};
    }

    @Override // androidx.navigation.NavType
    public long[] parseValue(String value, long[] jArr) {
        long[] jArrM14623M;
        AbstractC9133u.m16133g(value, "value");
        return (jArr == null || (jArrM14623M = AbstractC8797p.m14623M(jArr, parseValue(value))) == null) ? parseValue(value) : jArrM14623M;
    }
}
