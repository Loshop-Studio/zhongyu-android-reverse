package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10788a;
import p310qd.AbstractC10819z;

/* loaded from: classes.dex */
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
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        return Long.valueOf(SavedStateReader.m33865getLongimpl(SavedStateReader.m33824constructorimpl(bundle), key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Long parseValue(String value) throws NumberFormatException {
        String strSubstring;
        long j10;
        AbstractC9979u.m20294g(value, "value");
        if (AbstractC10819z.m23229B(value, "L", false, 2, null)) {
            strSubstring = value.substring(0, value.length() - 1);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
        } else {
            strSubstring = value;
        }
        if (AbstractC10819z.m23242O(value, "0x", false, 2, null)) {
            String strSubstring2 = strSubstring.substring(2);
            AbstractC9979u.m20293f(strSubstring2, "substring(...)");
            j10 = Long.parseLong(strSubstring2, AbstractC10788a.m23073a(16));
        } else {
            j10 = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j10);
    }

    public void put(Bundle bundle, String key, long j10) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        SavedStateWriter.m33931putLongimpl(SavedStateWriter.m33910constructorimpl(bundle), key, j10);
    }
}
