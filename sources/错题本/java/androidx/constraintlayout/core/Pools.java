package androidx.constraintlayout.core;

/* loaded from: classes2.dex */
final class Pools {
    private static final boolean DEBUG = false;

    public interface Pool<T> {
        T acquire();

        boolean release(T t8);

        void releaseAll(T[] tArr, int i);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i];
        }

        private boolean isInPool(T t8) {
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == t8) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int i = this.mPoolSize;
            if (i <= 0) {
                return null;
            }
            int i8 = i - 1;
            Object[] objArr = this.mPool;
            T t8 = (T) objArr[i8];
            objArr[i8] = null;
            this.mPoolSize = i - 1;
            return t8;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t8) {
            int i = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t8;
            this.mPoolSize = i + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i8 = 0; i8 < i; i8++) {
                T t8 = tArr[i8];
                int i9 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i9 < objArr.length) {
                    objArr[i9] = t8;
                    this.mPoolSize = i9 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
