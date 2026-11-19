package com.xuexiang.xui.widget.imageview.strategy;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class LoadOption {
    public static final int DEFAULT_TIMEOUT = 2500;
    public DiskCacheStrategyEnum cacheStrategy;
    public Drawable error;
    public int height;
    public Drawable placeholder;
    public int width;
    public AlignEnum align = AlignEnum.DEFAULT;
    public int timeoutMs = DEFAULT_TIMEOUT;

    public LoadOption() {
    }

    /* renamed from: of */
    public static LoadOption m7971of(DiskCacheStrategyEnum diskCacheStrategyEnum) {
        return new LoadOption(diskCacheStrategyEnum);
    }

    public AlignEnum getAlign() {
        return this.align;
    }

    public DiskCacheStrategyEnum getCacheStrategy() {
        return this.cacheStrategy;
    }

    public Drawable getError() {
        return this.error;
    }

    public int getHeight() {
        return this.height;
    }

    public Drawable getPlaceholder() {
        return this.placeholder;
    }

    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasSize() {
        return (this.width == 0 || this.height == 0) ? false : true;
    }

    public LoadOption setAlign(AlignEnum alignEnum) {
        this.align = alignEnum;
        return this;
    }

    public LoadOption setCacheStrategy(DiskCacheStrategyEnum diskCacheStrategyEnum) {
        this.cacheStrategy = diskCacheStrategyEnum;
        return this;
    }

    public LoadOption setError(Drawable drawable) {
        this.error = drawable;
        return this;
    }

    public LoadOption setPlaceholder(Drawable drawable) {
        this.placeholder = drawable;
        return this;
    }

    public LoadOption setSize(int i4, int i5) {
        this.width = i4;
        this.height = i5;
        return this;
    }

    public LoadOption setTimeoutMs(int i4) {
        this.timeoutMs = i4;
        return this;
    }

    public String toString() {
        return "LoadOption{cacheStrategy=" + this.cacheStrategy + ", placeholder=" + this.placeholder + ", width=" + this.width + ", height=" + this.height + '}';
    }

    /* renamed from: of */
    public static LoadOption m7970of(Drawable drawable) {
        return new LoadOption(drawable);
    }

    public LoadOption(DiskCacheStrategyEnum diskCacheStrategyEnum) {
        this.cacheStrategy = diskCacheStrategyEnum;
    }

    public LoadOption(Drawable drawable) {
        this.placeholder = drawable;
    }
}
