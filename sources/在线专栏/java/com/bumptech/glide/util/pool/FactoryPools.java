package com.bumptech.glide.util.pool;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p011b0.C1023f;
import p011b0.C1024g;
import p011b0.InterfaceC1022e;

/* loaded from: classes.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final Resetter<Object> EMPTY_RESETTER = new Resetter<Object>() { // from class: com.bumptech.glide.util.pool.FactoryPools.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
        }
    };
    private static final String TAG = "FactoryPools";

    public interface Factory<T> {
        T create();
    }

    private static final class FactoryPool<T> implements InterfaceC1022e<T> {
        private final Factory<T> factory;
        private final InterfaceC1022e<T> pool;
        private final Resetter<T> resetter;

        FactoryPool(InterfaceC1022e<T> interfaceC1022e, Factory<T> factory, Resetter<T> resetter) {
            this.pool = interfaceC1022e;
            this.factory = factory;
            this.resetter = resetter;
        }

        @Override // p011b0.InterfaceC1022e
        public T acquire() {
            T tAcquire = this.pool.acquire();
            if (tAcquire == null) {
                tAcquire = this.factory.create();
                if (Log.isLoggable(FactoryPools.TAG, 2)) {
                    Log.v(FactoryPools.TAG, "Created new " + tAcquire.getClass());
                }
            }
            if (tAcquire instanceof Poolable) {
                tAcquire.getVerifier().setRecycled(false);
            }
            return (T) tAcquire;
        }

        @Override // p011b0.InterfaceC1022e
        public boolean release(T t3) {
            if (t3 instanceof Poolable) {
                ((Poolable) t3).getVerifier().setRecycled(true);
            }
            this.resetter.reset(t3);
            return this.pool.release(t3);
        }
    }

    public interface Poolable {
        StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(T t3);
    }

    private FactoryPools() {
    }

    private static <T extends Poolable> InterfaceC1022e<T> build(InterfaceC1022e<T> interfaceC1022e, Factory<T> factory) {
        return build(interfaceC1022e, factory, emptyResetter());
    }

    private static <T> Resetter<T> emptyResetter() {
        return (Resetter<T>) EMPTY_RESETTER;
    }

    public static <T extends Poolable> InterfaceC1022e<T> simple(int i4, Factory<T> factory) {
        return build(new C1023f(i4), factory);
    }

    public static <T extends Poolable> InterfaceC1022e<T> threadSafe(int i4, Factory<T> factory) {
        return build(new C1024g(i4), factory);
    }

    public static <T> InterfaceC1022e<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    private static <T> InterfaceC1022e<T> build(InterfaceC1022e<T> interfaceC1022e, Factory<T> factory, Resetter<T> resetter) {
        return new FactoryPool(interfaceC1022e, factory, resetter);
    }

    public static <T> InterfaceC1022e<List<T>> threadSafeList(int i4) {
        return build(new C1024g(i4), new Factory<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.2
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public List<T> create() {
                return new ArrayList();
            }
        }, new Resetter<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.3
            @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
            public void reset(List<T> list) {
                list.clear();
            }
        });
    }
}
