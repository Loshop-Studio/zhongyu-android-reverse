.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;
.super Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner<",
        "TT;>;>",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner<",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected mEnableCache:Z

.field protected mPlaceHolder:Landroid/graphics/drawable/Drawable;

.field protected mScale:D


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->initImageBanner(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->initImageBanner(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->initImageBanner(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public enableCache(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mEnableCache:Z

    return-object p0
.end method

.method public getEnableCache()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mEnableCache:Z

    return v0
.end method

.method protected abstract getImageViewId()I
.end method

.method protected abstract getItemLayoutId()I
.end method

.method public getPlaceHolderDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mPlaceHolder:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getScale()D
    .locals 2

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mScale:D

    return-wide v0
.end method

.method protected initImageBanner(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    sget v0, Lcom/xuexiang/xui/R$color;->default_image_banner_placeholder_color:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v0

    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mPlaceHolder:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mEnableCache:Z

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->getContainerScale()F

    move-result p1

    float-to-double v0, p1

    iput-wide v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mScale:D

    return-void
.end method

.method protected loadingImageView(Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;)V
    .locals 5

    .line 1
    iget-object p2, p2, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;->imgUrl:Ljava/lang/String;

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mScale:D

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-lez v4, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->getItemWidth()I

    move-result v0

    int-to-double v1, v0

    .line 5
    iget-wide v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mScale:D

    mul-double v1, v1, v3

    double-to-int v1, v1

    .line 6
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 7
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mPlaceHolder:Landroid/graphics/drawable/Drawable;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object v2

    .line 9
    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->setSize(II)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object v0

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mEnableCache:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;->RESOURCE:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;->NONE:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    .line 10
    :goto_0
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->setCacheStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object v0

    .line 11
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->get()Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    move-result-object v1

    invoke-virtual {v1, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    goto :goto_2

    .line 12
    :cond_1
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->get()Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mPlaceHolder:Landroid/graphics/drawable/Drawable;

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mEnableCache:Z

    if-eqz v2, :cond_2

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;->RESOURCE:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;->NONE:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    :goto_1
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V

    goto :goto_2

    .line 13
    :cond_3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mPlaceHolder:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_2
    return-void
.end method

.method public onCreateItemView(I)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->getItemLayoutId()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->getImageViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;

    if-eqz p1, :cond_0

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->loadingImageView(Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;)V

    :cond_0
    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->pauseScroll()V

    .line 2
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public onTitleSelect(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;

    if-eqz p2, :cond_0

    .line 2
    iget-object p2, p2, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mPlaceHolder:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setScale(D)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)TT;"
        }
    .end annotation

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->mScale:D

    return-object p0
.end method
