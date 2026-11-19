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
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m33866getLongArrayimpl(bundleM33824constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, long[] jArr) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (jArr != null) {
            SavedStateWriter.m33932putLongArrayimpl(bundleM33910constructorimpl, key, jArr);
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(long[] jArr) {
        List listM24095o1;
        if (jArr == null || (listM24095o1 = AbstractC10968r.m24095o1(jArr)) == null) {
            return AbstractC10978w.m24136n();
        }
        List list = listM24095o1;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(long[] jArr, long[] jArr2) {
        return AbstractC10962o.m23983d(jArr != null ? AbstractC10964p.m24013b0(jArr) : null, jArr2 != null ? AbstractC10964p.m24013b0(jArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public long[] parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return new long[]{NavType.LongType.parseValue(value).longValue()};
    }

    @Override // androidx.navigation.NavType
    public long[] parseValue(String value, long[] jArr) {
        long[] jArrM23997L;
        AbstractC9979u.m20294g(value, "value");
        return (jArr == null || (jArrM23997L = AbstractC10964p.m23997L(jArr, parseValue(value))) == null) ? parseValue(value) : jArrM23997L;
    }
}
