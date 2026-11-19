package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;
import p113g8.AbstractC8687z;

/* loaded from: classes3.dex */
public final class LongNavType extends NavType<Long> {
    public LongNavType() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "long";
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l10) {
        put(bundle, str, l10.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Long get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        return Long.valueOf(SavedStateReader.m27270getLongimpl(SavedStateReader.m27229constructorimpl(bundle), key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Long parseValue(String value) throws NumberFormatException {
        String strSubstring;
        long j10;
        AbstractC9133u.m16133g(value, "value");
        if (AbstractC8687z.m14111z(value, "L", false, 2, null)) {
            strSubstring = value.substring(0, value.length() - 1);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
        } else {
            strSubstring = value;
        }
        if (AbstractC8687z.m14105M(value, "0x", false, 2, null)) {
            String strSubstring2 = strSubstring.substring(2);
            AbstractC9133u.m16132f(strSubstring2, "substring(...)");
            j10 = Long.parseLong(strSubstring2, AbstractC8656a.m13939a(16));
        } else {
            j10 = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j10);
    }

    public void put(Bundle bundle, String key, long j10) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        SavedStateWriter.m27336putLongimpl(SavedStateWriter.m27315constructorimpl(bundle), key, j10);
    }
}
