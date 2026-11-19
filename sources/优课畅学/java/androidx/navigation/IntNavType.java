package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;
import p113g8.AbstractC8687z;

/* loaded from: classes3.dex */
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
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        return Integer.valueOf(SavedStateReader.m27260getIntimpl(SavedStateReader.m27229constructorimpl(bundle), key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Integer parseValue(String value) throws NumberFormatException {
        int i10;
        AbstractC9133u.m16133g(value, "value");
        if (AbstractC8687z.m14105M(value, "0x", false, 2, null)) {
            String strSubstring = value.substring(2);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            i10 = Integer.parseInt(strSubstring, AbstractC8656a.m13939a(16));
        } else {
            i10 = Integer.parseInt(value);
        }
        return Integer.valueOf(i10);
    }

    public void put(Bundle bundle, String key, int i10) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        SavedStateWriter.m27332putIntimpl(SavedStateWriter.m27315constructorimpl(bundle), key, i10);
    }
}
