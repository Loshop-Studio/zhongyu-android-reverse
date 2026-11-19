package com.xuexiang.xui.widget.imageview.preview.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class GlideMediaLoader implements IMediaLoader {
    private RequestOptions mRequestOptions;

    public GlideMediaLoader() {
        this(new RequestOptions().error(C2042R.drawable.xui_ic_no_img).diskCacheStrategy(DiskCacheStrategy.ALL));
    }

    public static RequestOptions getRequestOptions() {
        return new RequestOptions().placeholder(C2042R.drawable.xui_ic_default_img).diskCacheStrategy(DiskCacheStrategy.ALL);
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void clearMemory(Context context) {
        Glide.get(context).clearMemory();
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void displayGifImage(Fragment fragment, String str, ImageView imageView, final ISimpleTarget iSimpleTarget) {
        Glide.with(fragment).asGif().apply((BaseRequestOptions<?>) this.mRequestOptions).load(str).listener(new RequestListener<GifDrawable>() { // from class: com.xuexiang.xui.widget.imageview.preview.loader.GlideMediaLoader.2
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<GifDrawable> target, boolean z3) {
                iSimpleTarget.onLoadFailed(null);
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(GifDrawable gifDrawable, Object obj, Target<GifDrawable> target, DataSource dataSource, boolean z3) {
                iSimpleTarget.onResourceReady();
                return false;
            }
        }).into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void displayImage(Fragment fragment, String str, ImageView imageView, final ISimpleTarget iSimpleTarget) {
        Glide.with(fragment).asBitmap().apply((BaseRequestOptions<?>) this.mRequestOptions).load(str).listener(new RequestListener<Bitmap>() { // from class: com.xuexiang.xui.widget.imageview.preview.loader.GlideMediaLoader.1
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z3) {
                iSimpleTarget.onLoadFailed(null);
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z3) {
                iSimpleTarget.onResourceReady();
                return false;
            }
        }).into(imageView);
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void onStop(Fragment fragment) {
        Glide.with(fragment).onStop();
    }

    public GlideMediaLoader(RequestOptions requestOptions) {
        this.mRequestOptions = requestOptions;
    }
}
