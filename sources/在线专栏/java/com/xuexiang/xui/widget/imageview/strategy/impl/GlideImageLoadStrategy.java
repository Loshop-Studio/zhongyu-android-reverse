package com.xuexiang.xui.widget.imageview.strategy.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.xuexiang.xui.widget.imageview.strategy.AlignEnum;
import com.xuexiang.xui.widget.imageview.strategy.DiskCacheStrategyEnum;
import com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy;
import com.xuexiang.xui.widget.imageview.strategy.ILoadListener;
import com.xuexiang.xui.widget.imageview.strategy.LoadOption;

/* loaded from: classes.dex */
public class GlideImageLoadStrategy implements IImageLoadStrategy {

    /* renamed from: com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy$5 */
    static /* synthetic */ class C22235 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum;

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$imageview$strategy$DiskCacheStrategyEnum */
        static final /* synthetic */ int[] f9693x1856c5b4;

        static {
            int[] iArr = new int[DiskCacheStrategyEnum.values().length];
            f9693x1856c5b4 = iArr;
            try {
                iArr[DiskCacheStrategyEnum.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9693x1856c5b4[DiskCacheStrategyEnum.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9693x1856c5b4[DiskCacheStrategyEnum.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9693x1856c5b4[DiskCacheStrategyEnum.RESOURCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9693x1856c5b4[DiskCacheStrategyEnum.AUTOMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[AlignEnum.values().length];
            $SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum = iArr2;
            try {
                iArr2[AlignEnum.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum[AlignEnum.CIRCLE_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum[AlignEnum.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum[AlignEnum.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    private RequestOptions getRequestOptions(LoadOption loadOption) {
        RequestOptions requestOptions = new RequestOptions();
        if (loadOption.hasSize()) {
            requestOptions.override(loadOption.getWidth(), loadOption.getHeight());
        }
        Drawable drawable = loadOption.placeholder;
        if (drawable != null) {
            requestOptions.placeholder(drawable);
        }
        Drawable drawable2 = loadOption.error;
        if (drawable2 != null) {
            requestOptions.error(drawable2);
        }
        DiskCacheStrategyEnum diskCacheStrategyEnum = loadOption.cacheStrategy;
        if (diskCacheStrategyEnum != null) {
            requestOptions.diskCacheStrategy(toGlideStrategy(diskCacheStrategyEnum));
        }
        int i4 = C22235.$SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum[loadOption.align.ordinal()];
        if (i4 == 1) {
            requestOptions.centerCrop();
        } else if (i4 == 2) {
            requestOptions.circleCrop();
        } else if (i4 == 3) {
            requestOptions.centerInside();
        } else if (i4 == 4) {
            requestOptions.fitCenter();
        }
        requestOptions.timeout(loadOption.timeoutMs);
        return requestOptions;
    }

    private DiskCacheStrategy toGlideStrategy(DiskCacheStrategyEnum diskCacheStrategyEnum) {
        int i4 = C22235.f9693x1856c5b4[diskCacheStrategyEnum.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? DiskCacheStrategy.AUTOMATIC : DiskCacheStrategy.AUTOMATIC : DiskCacheStrategy.RESOURCE : DiskCacheStrategy.DATA : DiskCacheStrategy.NONE : DiskCacheStrategy.ALL;
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void clearCache(Context context) {
        Glide.get(context).clearMemory();
        Glide.get(context).clearDiskCache();
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void clearDiskCache(Context context) {
        Glide.get(context).clearDiskCache();
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void clearMemoryCache(Context context) {
        Glide.get(context).clearMemory();
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj) {
        Glide.with(imageView.getContext()).asGif().load(obj).into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj) {
        Glide.with(imageView.getContext()).load(obj).into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, final ILoadListener iLoadListener) {
        Glide.with(imageView.getContext()).load(obj).listener(new RequestListener<Drawable>() { // from class: com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy.1
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj2, Target<Drawable> target, boolean z3) {
                iLoadListener.onLoadFailed(glideException);
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Drawable drawable, Object obj2, Target<Drawable> target, DataSource dataSource, boolean z3) {
                iLoadListener.onLoadSuccess();
                return false;
            }
        }).into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, final ILoadListener iLoadListener) {
        Glide.with(imageView.getContext()).asGif().load(obj).listener(new RequestListener<GifDrawable>() { // from class: com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy.2
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj2, Target<GifDrawable> target, boolean z3) {
                iLoadListener.onLoadFailed(glideException);
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(GifDrawable gifDrawable, Object obj2, Target<GifDrawable> target, DataSource dataSource, boolean z3) {
                iLoadListener.onLoadSuccess();
                return false;
            }
        }).into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        loadImage(imageView, obj, LoadOption.m7971of(diskCacheStrategyEnum));
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        loadImage(imageView, obj, LoadOption.m7971of(diskCacheStrategyEnum), iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        loadGifImage(imageView, obj, LoadOption.m7971of(diskCacheStrategyEnum));
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        loadImage(imageView, obj, LoadOption.m7970of(drawable).setCacheStrategy(diskCacheStrategyEnum));
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        loadGifImage(imageView, obj, LoadOption.m7971of(diskCacheStrategyEnum), iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        loadImage(imageView, obj, LoadOption.m7970of(drawable).setCacheStrategy(diskCacheStrategyEnum), iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum) {
        loadGifImage(imageView, obj, LoadOption.m7970of(drawable).setCacheStrategy(diskCacheStrategyEnum));
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadImage(ImageView imageView, Object obj, LoadOption loadOption) {
        loadImage(imageView, obj, loadOption, (ILoadListener) null);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, Drawable drawable, DiskCacheStrategyEnum diskCacheStrategyEnum, ILoadListener iLoadListener) {
        loadGifImage(imageView, obj, LoadOption.m7970of(drawable).setCacheStrategy(diskCacheStrategyEnum), iLoadListener);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    @SuppressLint({"CheckResult"})
    public void loadImage(ImageView imageView, Object obj, LoadOption loadOption, final ILoadListener iLoadListener) {
        RequestBuilder<Drawable> requestBuilderApply = Glide.with(imageView.getContext()).load(obj).apply((BaseRequestOptions<?>) getRequestOptions(loadOption));
        if (iLoadListener != null) {
            requestBuilderApply.listener(new RequestListener<Drawable>() { // from class: com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy.3
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj2, Target<Drawable> target, boolean z3) {
                    iLoadListener.onLoadFailed(glideException);
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(Drawable drawable, Object obj2, Target<Drawable> target, DataSource dataSource, boolean z3) {
                    iLoadListener.onLoadSuccess();
                    return false;
                }
            });
        }
        requestBuilderApply.into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    public void loadGifImage(ImageView imageView, Object obj, LoadOption loadOption) {
        loadGifImage(imageView, obj, loadOption, (ILoadListener) null);
    }

    @Override // com.xuexiang.xui.widget.imageview.strategy.IImageLoadStrategy
    @SuppressLint({"CheckResult"})
    public void loadGifImage(ImageView imageView, Object obj, LoadOption loadOption, final ILoadListener iLoadListener) {
        RequestBuilder<GifDrawable> requestBuilderApply = Glide.with(imageView.getContext()).asGif().load(obj).apply((BaseRequestOptions<?>) getRequestOptions(loadOption));
        if (iLoadListener != null) {
            requestBuilderApply.listener(new RequestListener<GifDrawable>() { // from class: com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy.4
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj2, Target<GifDrawable> target, boolean z3) {
                    iLoadListener.onLoadFailed(glideException);
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(GifDrawable gifDrawable, Object obj2, Target<GifDrawable> target, DataSource dataSource, boolean z3) {
                    iLoadListener.onLoadSuccess();
                    return false;
                }
            });
        }
        requestBuilderApply.into(imageView);
    }
}
