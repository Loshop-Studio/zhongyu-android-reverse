package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class StringNavType extends NavType<String> {
    public StringNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_STRING;
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
        if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, key) || SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m27300getStringimpl(bundleM27229constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        if (AbstractC9133u.m16128b(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String str) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundle);
        if (str != null) {
            SavedStateWriter.m27348putStringimpl(bundleM27315constructorimpl, key, str);
        } else {
            SavedStateWriter.m27338putNullimpl(bundleM27315constructorimpl, key);
        }
    }

    @Override // androidx.navigation.NavType
    public String serializeAsValue(String str) {
        String strEncode$default;
        return (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) ? "null" : strEncode$default;
    }
}
