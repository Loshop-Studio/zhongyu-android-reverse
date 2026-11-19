package androidx.compose.runtime;

/* loaded from: classes2.dex */
public interface SnapshotMutationPolicy<T> {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> T merge(SnapshotMutationPolicy<T> snapshotMutationPolicy, T t10, T t11, T t12) {
            return (T) SnapshotMutationPolicy.super.merge(t10, t11, t12);
        }
    }

    boolean equivalent(T t10, T t11);

    default T merge(T t10, T t11, T t12) {
        return null;
    }
}
