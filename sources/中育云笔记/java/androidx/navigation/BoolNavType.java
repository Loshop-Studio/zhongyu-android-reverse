package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import anetwork.channel.util.RequestConstant;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class BoolNavType extends NavType<Boolean> {
    public BoolNavType() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_BOOLEAN;
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
        put(bundle, str, bool.booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Boolean get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
            return null;
        }
        return Boolean.valueOf(SavedStateReader.m33833getBooleanimpl(bundleM33824constructorimpl, key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Boolean parseValue(String value) {
        boolean z10;
        AbstractC9979u.m20294g(value, "value");
        if (AbstractC9979u.m20289b(value, RequestConstant.TRUE)) {
            z10 = true;
        } else {
            if (!AbstractC9979u.m20289b(value, RequestConstant.FALSE)) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void put(Bundle bundle, String key, boolean z10) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        SavedStateWriter.m33916putBooleanimpl(SavedStateWriter.m33910constructorimpl(bundle), key, z10);
    }
}
