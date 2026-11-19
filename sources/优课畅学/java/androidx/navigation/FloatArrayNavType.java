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
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m27257getFloatArrayimpl(bundleM27229constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, float[] fArr) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (fArr != null) {
            SavedStateWriter.m27331putFloatArrayimpl(bundleM27315constructorimpl, key, fArr);
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(float[] fArr) {
        List listM14730r1;
        if (fArr == null || (listM14730r1 = AbstractC8801r.m14730r1(fArr)) == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14730r1, 10));
        Iterator it = listM14730r1.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(float[] fArr, float[] fArr2) {
        return AbstractC8795o.m14607d(fArr != null ? AbstractC8797p.m14637a0(fArr) : null, fArr2 != null ? AbstractC8797p.m14637a0(fArr2) : null);
    }

    @Override // androidx.navigation.NavType
    public float[] parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return new float[]{NavType.FloatType.parseValue(value).floatValue()};
    }

    @Override // androidx.navigation.NavType
    public float[] parseValue(String value, float[] fArr) {
        float[] fArrM14620J;
        AbstractC9133u.m16133g(value, "value");
        return (fArr == null || (fArrM14620J = AbstractC8797p.m14620J(fArr, parseValue(value))) == null) ? parseValue(value) : fArrM14620J;
    }
}
