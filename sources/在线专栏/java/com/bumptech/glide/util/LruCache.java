package com.bumptech.glide.util;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LruCache<T, Y> {
    private final Map<T, Y> cache = new LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    public LruCache(long j4) {
        this.initialMaxSize = j4;
        this.maxSize = j4;
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(T t3) {
        return this.cache.containsKey(t3);
    }

    public synchronized Y get(T t3) {
        return this.cache.get(t3);
    }

    protected synchronized int getCount() {
        return this.cache.size();
    }

    public synchronized long getCurrentSize() {
        return this.currentSize;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    protected int getSize(Y y3) {
        return 1;
    }

    protected void onItemEvicted(T t3, Y y3) {
    }

    public synchronized Y put(T t3, Y y3) {
        long size = getSize(y3);
        if (size >= this.maxSize) {
            onItemEvicted(t3, y3);
            return null;
        }
        if (y3 != null) {
            this.currentSize += size;
        }
        Y yPut = this.cache.put(t3, y3);
        if (yPut != null) {
            this.currentSize -= getSize(yPut);
            if (!yPut.equals(y3)) {
                onItemEvicted(t3, yPut);
            }
        }
        evict();
        return yPut;
    }

    public synchronized Y remove(T t3) {
        Y yRemove;
        yRemove = this.cache.remove(t3);
        if (yRemove != null) {
            this.currentSize -= getSize(yRemove);
        }
        return yRemove;
    }

    public synchronized void setSizeMultiplier(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.maxSize = Math.round(this.initialMaxSize * f4);
        evict();
    }

    protected synchronized void trimToSize(long j4) {
        while (this.currentSize > j4) {
            Iterator<Map.Entry<T, Y>> it = this.cache.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.currentSize -= getSize(value);
            T key = next.getKey();
            it.remove();
            onItemEvicted(key, value);
        }
    }
}
