package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* loaded from: classes5.dex */
public final class ObjectHelper {
    static final BiPredicate<Object, Object> EQUALS = new BiObjectPredicate();

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        public boolean test(Object obj, Object obj2) {
            return ObjectHelper.equals(obj, obj2);
        }
    }

    private ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static int compare(int i9, int i10) {
        if (i9 < i10) {
            return -1;
        }
        return i9 > i10 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> BiPredicate<T, T> equalsPredicate() {
        return (BiPredicate<T, T>) EQUALS;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i9, String str) {
        if (i9 > 0) {
            return i9;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i9);
    }

    public static int compare(long j9, long j10) {
        if (j9 < j10) {
            return -1;
        }
        return j9 > j10 ? 1 : 0;
    }

    @Deprecated
    public static long requireNonNull(long j9, String str) {
        throw new InternalError("Null check on a primitive: " + str);
    }

    public static long verifyPositive(long j9, String str) {
        if (j9 > 0) {
            return j9;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j9);
    }
}
