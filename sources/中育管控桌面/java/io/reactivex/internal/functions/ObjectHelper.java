package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* loaded from: classes4.dex */
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

    public static int compare(int i6, int i7) {
        if (i6 < i7) {
            return -1;
        }
        return i6 > i7 ? 1 : 0;
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

    public static <T> T requireNonNull(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i6, String str) {
        if (i6 > 0) {
            return i6;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i6);
    }

    public static int compare(long j6, long j7) {
        if (j6 < j7) {
            return -1;
        }
        return j6 > j7 ? 1 : 0;
    }

    @Deprecated
    public static long requireNonNull(long j6, String str) {
        throw new InternalError("Null check on a primitive: " + str);
    }

    public static long verifyPositive(long j6, String str) {
        if (j6 > 0) {
            return j6;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j6);
    }
}
