package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10788a;
import p310qd.AbstractC10819z;

/* loaded from: classes.dex */
public final class IntNavType extends NavType<Integer> {
    public IntNavType() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_INT;
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
        put(bundle, str, num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Integer get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        return Integer.valueOf(SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(bundle), key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Integer parseValue(String value) throws NumberFormatException {
        int i10;
        AbstractC9979u.m20294g(value, "value");
        if (AbstractC10819z.m23242O(value, "0x", false, 2, null)) {
            String strSubstring = value.substring(2);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            i10 = Integer.parseInt(strSubstring, AbstractC10788a.m23073a(16));
        } else {
            i10 = Integer.parseInt(value);
        }
        return Integer.valueOf(i10);
    }

    public void put(Bundle bundle, String key, int i10) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        SavedStateWriter.m33927putIntimpl(SavedStateWriter.m33910constructorimpl(bundle), key, i10);
    }
}
