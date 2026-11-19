package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class FloatNavType extends NavType<Float> {
    public FloatNavType() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_FLOAT;
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f10) {
        put(bundle, str, f10.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Float get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        return Float.valueOf(SavedStateReader.m27256getFloatimpl(SavedStateReader.m27229constructorimpl(bundle), key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Float parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return Float.valueOf(Float.parseFloat(value));
    }

    public void put(Bundle bundle, String key, float f10) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        SavedStateWriter.m27330putFloatimpl(SavedStateWriter.m27315constructorimpl(bundle), key, f10);
    }
}
