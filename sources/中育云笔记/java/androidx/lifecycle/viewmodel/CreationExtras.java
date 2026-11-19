package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public abstract class CreationExtras {
    public static final Companion Companion = new Companion(null);
    private final Map<Key<?>, Object> extras = new LinkedHashMap();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final /* synthetic */ <T> Key<T> Key() {
            AbstractC9979u.m20299l();
            return new Key<T>() { // from class: androidx.lifecycle.viewmodel.CreationExtras$Companion$Key$1
            };
        }

        private Companion() {
        }
    }

    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            AbstractC9979u.m20294g(key, "key");
            return null;
        }
    }

    public interface Key<T> {
    }

    public boolean equals(Object obj) {
        return (obj instanceof CreationExtras) && AbstractC9979u.m20289b(this.extras, ((CreationExtras) obj).extras);
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getExtras$lifecycle_viewmodel_release() {
        return this.extras;
    }

    public int hashCode() {
        return this.extras.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.extras + ')';
    }
}
