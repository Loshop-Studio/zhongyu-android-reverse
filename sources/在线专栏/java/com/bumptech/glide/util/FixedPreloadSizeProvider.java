package com.bumptech.glide.util;

import com.bumptech.glide.ListPreloader;

/* loaded from: classes.dex */
public class FixedPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T> {
    private final int[] size;

    public FixedPreloadSizeProvider(int i4, int i5) {
        this.size = new int[]{i4, i5};
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    public int[] getPreloadSize(T t3, int i4, int i5) {
        return this.size;
    }
}
