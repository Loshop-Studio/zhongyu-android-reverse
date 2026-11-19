.class public Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;


# static fields
.field private static volatile sInstance:Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;


# instance fields
.field private volatile mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;


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
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/loader/GlideMediaLoader;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/imageview/preview/loader/GlideMediaLoader;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;

    return-void
.end method

.method public static get()Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    invoke-direct {v1}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;-><init>()V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

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
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->sInstance:Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    return-object v0
.end method


# virtual methods
.method public clearMemory(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;->clearMemory(Landroid/content/Context;)V

    return-void
.end method

.method public displayGifImage(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;->displayGifImage(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;)V

    return-void
.end method

.method public displayImage(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;->displayImage(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;)V

    return-void
.end method

.method public onStop(Landroidx/fragment/app/Fragment;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;->onStop(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public setIMediaLoader(Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;)Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->mIMediaLoader:Lcom/xuexiang/xui/widget/imageview/preview/loader/IMediaLoader;

    return-object p0
.end method
