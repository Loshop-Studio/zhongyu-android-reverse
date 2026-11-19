package com.xuexiang.xui.widget.imageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.xuexiang.xui.widget.imageview.strategy.DiskCacheStrategyEnum;
import com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy;
import com.xuexiang.xui.widget.imageview.strategy.ILoadListener;
import com.xuexiang.xui.widget.imageview.strategy.LoadOption;
import com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy;

/* loaded from: classes.dex */
public class ImageLoader implements IImageLoadStrategy {
    private static volatile ImageLoader sInstance;
    private IImageLoadStrategy mStrategy = new GlideImageLoadStrategy();

    private ImageLoader() {
    }

    public static ImageLoader get() {
        if (sInstance == null) {
            synchronized (ImageLoader.class) {
                if (sInstance == null) {
                    sInstance = new ImageLoader();
                }
            }
        }
        return sInstance;
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void clearCache(Context context) {
        this.mStrategy.clearCache(context);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void clearDiskCache(Context context) {
        this.mStrategy.clearDiskCache(context);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void clearMemoryCache(Context context) {
        this.mStrategy.clearMemoryCache(context);
    }

    public IImageLoadStrategy getStrategy() {
        return this.mStrategy;
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj) {
        this.mStrategy.loadGifImage(imageView, obj);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj) {
        this.mStrategy.loadImage(imageView, obj);
    }

    public ImageLoader setImageLoadStrategy(IImageLoadStrategy iImageLoadStrategy) {
        this.mStrategy = iImageLoadStrategy;
        return this;
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, ILoadListener iLoadListener) {
        this.mStrategy.loadGifImage(imageView, obj, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, ILoadListener iLoadListener) {
        this.mStrategy.loadImage(imageView, obj, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        this.mStrategy.loadGifImage(imageView, obj, diskCacheStrategyEnum);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        this.mStrategy.loadImage(imageView, obj, diskCacheStrategyEnum);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        this.mStrategy.loadGifImage(imageView, obj, diskCacheStrategyEnum, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        this.mStrategy.loadImage(imageView, obj, diskCacheStrategyEnum, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        this.mStrategy.loadGifImage(imageView, obj, drawable, diskCacheStrategyEnum);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        this.mStrategy.loadImage(imageView, obj, drawable, diskCacheStrategyEnum);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        this.mStrategy.loadGifImage(imageView, obj, drawable, diskCacheStrategyEnum, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        this.mStrategy.loadImage(imageView, obj, drawable, diskCacheStrategyEnum, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, LoadOption loadOption) {
        this.mStrategy.loadGifImage(imageView, obj, loadOption);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, LoadOption loadOption) {
        this.mStrategy.loadImage(imageView, obj, loadOption);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, LoadOption loadOption, ILoadListener iLoadListener) {
        this.mStrategy.loadGifImage(imageView, obj, loadOption, iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, LoadOption loadOption, ILoadListener iLoadListener) {
        this.mStrategy.loadImage(imageView, obj, loadOption, iLoadListener);
    }
}
