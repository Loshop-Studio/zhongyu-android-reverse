package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10962o;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
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
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m33896getStringArrayimpl(bundleM33824constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String[] strArr) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (strArr != null) {
            SavedStateWriter.m33944putStringArrayimpl(bundleM33910constructorimpl, key, strArr);
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public List<String> serializeAsValues(String[] strArr) {
        if (strArr == null) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(String[] strArr, String[] strArr2) {
        return AbstractC10962o.m23983d(strArr, strArr2);
    }

    @Override // androidx.navigation.NavType
    public String[] parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return new String[]{value};
    }

    @Override // androidx.navigation.NavType
    public String[] parseValue(String value, String[] strArr) {
        String[] strArr2;
        AbstractC9979u.m20294g(value, "value");
        return (strArr == null || (strArr2 = (String[]) AbstractC10964p.m23999N(strArr, parseValue(value))) == null) ? parseValue(value) : strArr2;
    }
}
