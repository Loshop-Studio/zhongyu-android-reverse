package com.xuexiang.xui.widget.imageview.preview;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.widget.imageview.preview.loader.GlideMediaLoader;
import com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader;
import com.xuexiang.xui.widget.imageview.preview.loader.ISimpleTarget;

/* loaded from: classes.dex */
public class MediaLoader implements IMediaLoader {
    private static volatile MediaLoader sInstance;
    private volatile IMediaLoader mIMediaLoader = new GlideMediaLoader();

    private MediaLoader() {
    }

    public static MediaLoader get() {
        if (sInstance == null) {
            synchronized (MediaLoader.class) {
                if (sInstance == null) {
                    sInstance = new MediaLoader();
                }
            }
        }
        return sInstance;
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void clearMemory(Context context) {
        this.mIMediaLoader.clearMemory(context);
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void displayGifImage(Fragment fragment, String str, ImageView imageView, ISimpleTarget iSimpleTarget) {
        this.mIMediaLoader.displayGifImage(fragment, str, imageView, iSimpleTarget);
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void displayImage(Fragment fragment, String str, ImageView imageView, ISimpleTarget iSimpleTarget) {
        this.mIMediaLoader.displayImage(fragment, str, imageView, iSimpleTarget);
    }

    @Override // com.xuexiang.xui.widget.imageview.preview.loader.IMediaLoader
    public void onStop(Fragment fragment) {
        this.mIMediaLoader.onStop(fragment);
    }

    public MediaLoader setIMediaLoader(IMediaLoader iMediaLoader) {
        this.mIMediaLoader = iMediaLoader;
        return this;
    }
}
