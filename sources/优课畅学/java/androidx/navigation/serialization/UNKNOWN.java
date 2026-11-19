package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class UNKNOWN extends NavType<String> {
    public static final UNKNOWN INSTANCE = new UNKNOWN();

    private UNKNOWN() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String key) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        return null;
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "unknown";
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String value) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        return "null";
    }
}
