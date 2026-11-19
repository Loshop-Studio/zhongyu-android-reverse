package androidx.constraintlayout.core;

/* loaded from: classes2.dex */
final class Pools {
    private static final boolean DEBUG = false;

    public interface Pool<T> {
        T acquire();

        boolean release(T t6);

        void releaseAll(T[] tArr, int i6);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i6) {
            if (i6 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i6];
        }

        private boolean isInPool(T t6) {
            for (int i6 = 0; i6 < this.mPoolSize; i6++) {
                if (this.mPool[i6] == t6) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int i6 = this.mPoolSize;
            if (i6 <= 0) {
                return null;
            }
            int i7 = i6 - 1;
            Object[] objArr = this.mPool;
            T t6 = (T) objArr[i7];
            objArr[i7] = null;
            this.mPoolSize = i6 - 1;
            return t6;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t6) {
            int i6 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i6 >= objArr.length) {
                return false;
            }
            objArr[i6] = t6;
            this.mPoolSize = i6 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i6) {
            if (i6 > tArr.length) {
                i6 = tArr.length;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                T t6 = tArr[i7];
                int i8 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i8 < objArr.length) {
                    objArr[i8] = t6;
                    this.mPoolSize = i8 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
