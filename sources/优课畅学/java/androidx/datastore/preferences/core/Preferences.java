package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public abstract class Preferences {

    public static final class Key<T> {
        private final String name;

        public Key(String name) {
            AbstractC9133u.m16133g(name, "name");
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return AbstractC9133u.m16128b(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        /* renamed from: to */
        public final Pair<T> m1672to(T t10) {
            return new Pair<>(this, t10);
        }

        public String toString() {
            return this.name;
        }
    }

    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t10) {
            AbstractC9133u.m16133g(key, "key");
            this.key = key;
            this.value = t10;
        }

        public final Key<T> getKey$datastore_preferences_core_release() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core_release() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public abstract <T> T get(Key<T> key);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(AbstractC9080a.m15959x(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(AbstractC9080a.m15959x(asMap()), true);
    }
}
