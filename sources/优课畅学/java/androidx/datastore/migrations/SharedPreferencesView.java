package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8798p0;

/* loaded from: classes2.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set<String> set) {
        AbstractC9133u.m16133g(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(("Can't access key outside migration: " + str).toString());
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String key) {
        AbstractC9133u.m16133g(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        AbstractC9133u.m16132f(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC8798p0.m14663e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC8778f0.m14549Z0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String key, boolean z10) {
        AbstractC9133u.m16133g(key, "key");
        return this.prefs.getBoolean(checkKey(key), z10);
    }

    public final float getFloat(String key, float f10) {
        AbstractC9133u.m16133g(key, "key");
        return this.prefs.getFloat(checkKey(key), f10);
    }

    public final int getInt(String key, int i10) {
        AbstractC9133u.m16133g(key, "key");
        return this.prefs.getInt(checkKey(key), i10);
    }

    public final long getLong(String key, long j10) {
        AbstractC9133u.m16133g(key, "key");
        return this.prefs.getLong(checkKey(key), j10);
    }

    public final String getString(String key, String str) {
        AbstractC9133u.m16133g(key, "key");
        return this.prefs.getString(checkKey(key), str);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        AbstractC9133u.m16133g(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet != null) {
            return AbstractC8778f0.m14548Y0(stringSet);
        }
        return null;
    }
}
