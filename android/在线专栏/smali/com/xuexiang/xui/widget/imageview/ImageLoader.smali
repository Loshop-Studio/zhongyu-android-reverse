.class public Lcom/xuexiang/xui/widget/imageview/ImageLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;


# static fields
.field private static volatile sInstance:Lcom/xuexiang/xui/widget/imageview/ImageLoader;


# instance fields
.field private mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    return-void
.end method

.method public static get()Lcom/xuexiang/xui/widget/imageview/ImageLoader;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    invoke-direct {v1}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;-><init>()V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    return-object v0
.end method


# virtual methods
.method public clearCache(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->clearCache(Landroid/content/Context;)V

    return-void
.end method

.method public clearDiskCache(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->clearDiskCache(Landroid/content/Context;)V

    return-void
.end method

.method public clearMemoryCache(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->clearMemoryCache(Landroid/content/Context;)V

    return-void
.end method

.method public getStrategy()Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    return-object v0
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 6

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    return-void
.end method

.method public loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadGifImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 6

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;)V

    return-void
.end method

.method public loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V

    return-void
.end method

.method public setImageLoadStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;)Lcom/xuexiang/xui/widget/imageview/ImageLoader;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->mStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/IImageLoadStrategy;

    return-object p0
.end method
