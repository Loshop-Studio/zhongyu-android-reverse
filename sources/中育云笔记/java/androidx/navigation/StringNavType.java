package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
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
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m33895getStringimpl(bundleM33824constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        if (AbstractC9979u.m20289b(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String str) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
        if (str != null) {
            SavedStateWriter.m33943putStringimpl(bundleM33910constructorimpl, key, str);
        } else {
            SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
        }
    }

    @Override // androidx.navigation.NavType
    public String serializeAsValue(String str) {
        String strEncode$default;
        return (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) ? "null" : strEncode$default;
    }
}
