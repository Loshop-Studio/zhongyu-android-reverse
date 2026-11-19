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
public final class FloatArrayNavType extends CollectionNavType<float[]> {
    public FloatArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    public float[] emptyCollection() {
        return new float[0];
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "float[]";
    }

    @Override // androidx.navigation.NavType
    public float[] get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m33852getFloatArrayimpl(bundleM33824constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, float[] fArr) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (fArr != null) {
            SavedStateWriter.m33926putFloatArrayimpl(bundleM33910constructorimpl, key, fArr);
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(float[] fArr) {
        List listM24091m1;
        if (fArr == null || (listM24091m1 = AbstractC10968r.m24091m1(fArr)) == null) {
            return AbstractC10978w.m24136n();
        }
        List list = listM24091m1;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(float[] fArr, float[] fArr2) {
        return AbstractC10962o.m23983d(fArr != null ? AbstractC10964p.m24011Z(fArr) : null, fArr2 != null ? AbstractC10964p.m24011Z(fArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public float[] parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return new float[]{NavType.FloatType.parseValue(value).floatValue()};
    }

    @Override // androidx.navigation.NavType
    public float[] parseValue(String value, float[] fArr) {
        float[] fArrM23994I;
        AbstractC9979u.m20294g(value, "value");
        return (fArr == null || (fArrM23994I = AbstractC10964p.m23994I(fArr, parseValue(value))) == null) ? parseValue(value) : fArrM23994I;
    }
}
