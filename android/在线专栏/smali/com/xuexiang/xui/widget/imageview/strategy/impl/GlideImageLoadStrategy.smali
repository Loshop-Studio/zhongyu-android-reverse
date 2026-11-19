.class public Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getRequestOptions(Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)Lcom/bumptech/glide/request/RequestOptions;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {v0}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->hasSize()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/request/BaseRequestOptions;->override(II)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 4
    :cond_0
    iget-object v1, p1, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->placeholder:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->placeholder(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 6
    :cond_1
    iget-object v1, p1, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->error:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->error(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 8
    :cond_2
    iget-object v1, p1, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->cacheStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    if-eqz v1, :cond_3

    .line 9
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->toGlideStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 10
    :cond_3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$5;->$SwitchMap$com$xuexiang$xui$widget$imageview$strategy$AlignEnum:[I

    iget-object v2, p1, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_7

    const/4 v2, 0x2

    if-eq v1, v2, :cond_6

    const/4 v2, 0x3

    if-eq v1, v2, :cond_5

    const/4 v2, 0x4

    if-eq v1, v2, :cond_4

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {v0}, Lcom/bumptech/glide/request/BaseRequestOptions;->fitCenter()Lcom/bumptech/glide/request/BaseRequestOptions;

    goto :goto_0

    .line 12
    :cond_5
    invoke-virtual {v0}, Lcom/bumptech/glide/request/BaseRequestOptions;->centerInside()Lcom/bumptech/glide/request/BaseRequestOptions;

    goto :goto_0

    .line 13
    :cond_6
    invoke-virtual {v0}, Lcom/bumptech/glide/request/BaseRequestOptions;->circleCrop()Lcom/bumptech/glide/request/BaseRequestOptions;

    goto :goto_0

    .line 14
    :cond_7
    invoke-virtual {v0}, Lcom/bumptech/glide/request/BaseRequestOptions;->centerCrop()Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 15
    :goto_0
    iget p1, p1, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->timeoutMs:I

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/request/BaseRequestOptions;->timeout(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    return-object v0
.end method

.method private toGlideStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/bumptech/glide/load/engine/DiskCacheStrategy;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$5;->$SwitchMap$com$xuexiang$xui$widget$imageview$strategy$DiskCacheStrategyEnum:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    .line 2
    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->AUTOMATIC:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    return-object p1

    .line 3
    :cond_0
    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->AUTOMATIC:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    return-object p1

    .line 4
    :cond_1
    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->RESOURCE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    return-object p1

    .line 5
    :cond_2
    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->DATA:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    return-object p1

    .line 6
    :cond_3
    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    return-object p1

    .line 7
    :cond_4
    sget-object p1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->ALL:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    return-object p1
.end method


# virtual methods
.method public clearCache(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/Glide;->clearMemory()V

    .line 2
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/Glide;->clearDiskCache()V

    return-void
.end method

.method public clearDiskCache(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/Glide;->clearDiskCache()V

    return-void
.end method

.method public clearMemoryCache(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/Glide;->clearMemory()V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asGif()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    .line 4
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 0

    .line 12
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->setCacheStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 0

    .line 13
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->setCacheStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p5}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 0

    .line 10
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 0

    .line 11
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 5
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asGif()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$2;

    invoke-direct {v0, p0, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$2;-><init>(Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    .line 8
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    .line 9
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 15
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asGif()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    .line 18
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->getRequestOptions(Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)Lcom/bumptech/glide/request/RequestOptions;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    if-eqz p4, :cond_0

    .line 19
    new-instance p3, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$4;

    invoke-direct {p3, p0, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$4;-><init>(Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    .line 20
    :cond_0
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    .line 3
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 0

    .line 10
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->setCacheStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 0

    .line 11
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->setCacheStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p5}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 0

    .line 8
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 0

    .line 9
    invoke-static {p3}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->of(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 4
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$1;

    invoke-direct {v0, p0, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$1;-><init>(Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    .line 6
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    .line 7
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V
    .locals 1

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 13
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    .line 15
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->getRequestOptions(Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)Lcom/bumptech/glide/request/RequestOptions;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    if-eqz p4, :cond_0

    .line 16
    new-instance p3, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;

    invoke-direct {p3, p0, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;-><init>(Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    .line 17
    :cond_0
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method
