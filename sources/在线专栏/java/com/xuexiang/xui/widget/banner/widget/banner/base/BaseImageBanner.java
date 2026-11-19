package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.banner.widget.banner.BannerItem;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner;
import com.xuexiang.xui.widget.imageview.ImageLoader;
import com.xuexiang.xui.widget.imageview.strategy.DiskCacheStrategyEnum;
import com.xuexiang.xui.widget.imageview.strategy.LoadOption;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class BaseImageBanner<T extends BaseImageBanner<T>> extends BaseIndicatorBanner<BannerItem, T> {
    protected boolean mEnableCache;
    protected Drawable mPlaceHolder;
    protected double mScale;

    public BaseImageBanner(Context context) {
        super(context);
        initImageBanner(context);
    }

    public T enableCache(boolean z3) {
        this.mEnableCache = z3;
        return this;
    }

    public boolean getEnableCache() {
        return this.mEnableCache;
    }

    protected abstract int getImageViewId();

    protected abstract int getItemLayoutId();

    public Drawable getPlaceHolderDrawable() {
        return this.mPlaceHolder;
    }

    public double getScale() {
        return this.mScale;
    }

    protected void initImageBanner(Context context) {
        this.mPlaceHolder = new ColorDrawable(ResUtils.getColor(C2042R.color.default_image_banner_placeholder_color));
        this.mEnableCache = true;
        this.mScale = getContainerScale();
    }

    protected void loadingImageView(ImageView imageView, BannerItem bannerItem) {
        String str = bannerItem.imgUrl;
        if (TextUtils.isEmpty(str)) {
            imageView.setImageDrawable(this.mPlaceHolder);
            return;
        }
        if (this.mScale <= 0.0d) {
            ImageLoader.get().loadImage(imageView, str, this.mPlaceHolder, this.mEnableCache ? DiskCacheStrategyEnum.RESOURCE : DiskCacheStrategyEnum.NONE);
            return;
        }
        int itemWidth = getItemWidth();
        int i4 = (int) (itemWidth * this.mScale);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(itemWidth, i4));
        ImageLoader.get().loadImage(imageView, str, LoadOption.m7970of(this.mPlaceHolder).setSize(itemWidth, i4).setCacheStrategy(this.mEnableCache ? DiskCacheStrategyEnum.RESOURCE : DiskCacheStrategyEnum.NONE));
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public View onCreateItemView(int i4) {
        View viewInflate = View.inflate(getContext(), getItemLayoutId(), null);
        ImageView imageView = (ImageView) new WeakReference((ImageView) viewInflate.findViewById(getImageViewId())).get();
        BannerItem item = getItem(i4);
        if (item != null && imageView != null) {
            loadingImageView(imageView, item);
        }
        return viewInflate;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        pauseScroll();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public void onTitleSelect(TextView textView, int i4) {
        BannerItem item = getItem(i4);
        if (item != null) {
            textView.setText(item.title);
        }
    }

    public T setPlaceHolderDrawable(Drawable drawable) {
        this.mPlaceHolder = drawable;
        return this;
    }

    public T setScale(double d4) {
        this.mScale = d4;
        return this;
    }

    public BaseImageBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initImageBanner(context);
    }

    public BaseImageBanner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initImageBanner(context);
    }
}
