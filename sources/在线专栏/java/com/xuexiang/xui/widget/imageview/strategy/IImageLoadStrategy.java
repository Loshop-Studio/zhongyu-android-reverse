package com.xuexiang.xui.widget.imageview.strategy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public interface IImageLoadStrategy {
    void clearCache(Context context);

    void clearDiskCache(Context context);

    void clearMemoryCache(Context context);

    void loadGifImage(ImageView imageView, Object obj);

    void loadGifImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum);

    void loadGifImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener);

    void loadGifImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum);

    void loadGifImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener);

    void loadGifImage(ImageView imageView, Object obj, ILoadListener iLoadListener);

    void loadGifImage(ImageView imageView, Object obj, LoadOption loadOption);

    void loadGifImage(ImageView imageView, Object obj, LoadOption loadOption, ILoadListener iLoadListener);

    void loadImage(ImageView imageView, Object obj);

    void loadImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum);

    void loadImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener);

    void loadImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum);

    void loadImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener);

    void loadImage(ImageView imageView, Object obj, ILoadListener iLoadListener);

    void loadImage(ImageView imageView, Object obj, LoadOption loadOption);

    void loadImage(ImageView imageView, Object obj, LoadOption loadOption, ILoadListener iLoadListener);
}
