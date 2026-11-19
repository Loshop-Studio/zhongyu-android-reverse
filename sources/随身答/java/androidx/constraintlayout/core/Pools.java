package androidx.constraintlayout.core;

/* loaded from: classes2.dex */
final class Pools {
    private static final boolean DEBUG = false;

    public interface Pool<T> {
        T acquire();

        boolean release(T t9);

        void releaseAll(T[] tArr, int i9);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i9) {
            if (i9 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i9];
        }

        private boolean isInPool(T t9) {
            for (int i9 = 0; i9 < this.mPoolSize; i9++) {
                if (this.mPool[i9] == t9) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int i9 = this.mPoolSize;
            if (i9 <= 0) {
                return null;
            }
            int i10 = i9 - 1;
            Object[] objArr = this.mPool;
            T t9 = (T) objArr[i10];
            objArr[i10] = null;
            this.mPoolSize = i9 - 1;
            return t9;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t9) {
            int i9 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i9 >= objArr.length) {
                return false;
            }
            objArr[i9] = t9;
            this.mPoolSize = i9 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i9) {
            if (i9 > tArr.length) {
                i9 = tArr.length;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                T t9 = tArr[i10];
                int i11 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i11 < objArr.length) {
                    objArr[i11] = t9;
                    this.mPoolSize = i11 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
