package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8795o;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class StringArrayNavType extends CollectionNavType<String[]> {
    public StringArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    public String[] emptyCollection() {
        return new String[0];
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "string[]";
    }

    @Override // androidx.navigation.NavType
    public String[] get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m27301getStringArrayimpl(bundleM27229constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String[] strArr) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (strArr != null) {
            SavedStateWriter.m27349putStringArrayimpl(bundleM27315constructorimpl, key, strArr);
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(String[] strArr) {
        if (strArr == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(String[] strArr, String[] strArr2) {
        return AbstractC8795o.m14607d(strArr, strArr2);
    }

    @Override // androidx.navigation.NavType
    public String[] parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return new String[]{value};
    }

    @Override // androidx.navigation.NavType
    public String[] parseValue(String value, String[] strArr) {
        String[] strArr2;
        AbstractC9133u.m16133g(value, "value");
        return (strArr == null || (strArr2 = (String[]) AbstractC8797p.m14625O(strArr, parseValue(value))) == null) ? parseValue(value) : strArr2;
    }
}
