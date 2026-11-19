package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class UNKNOWN extends NavType<String> {
    public static final UNKNOWN INSTANCE = new UNKNOWN();

    private UNKNOWN() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String key) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        return null;
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "unknown";
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String value) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String value) {
        AbstractC9979u.m20294g(value, "value");
        return "null";
    }
}
