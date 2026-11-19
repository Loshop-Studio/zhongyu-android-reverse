.class final Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcvodplayer/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/TextureRenderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

.field private b:Landroid/graphics/SurfaceTexture;

.field private c:Lcom/tencent/ijk/media/player/ISurfaceTextureHost;

.field private d:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;Landroid/graphics/SurfaceTexture;Lcom/tencent/ijk/media/player/ISurfaceTextureHost;)V
    .locals 0
    .param p1    # Lcom/tencent/liteav/txcvodplayer/TextureRenderView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/SurfaceTexture;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/ijk/media/player/ISurfaceTextureHost;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->c:Lcom/tencent/ijk/media/player/ISurfaceTextureHost;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lcom/tencent/liteav/txcvodplayer/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    return-object v0
.end method

.method public a(Lcom/tencent/ijk/media/player/IMediaPlayer;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    if-nez p1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    instance-of v0, p1, Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;

    if-eqz v0, :cond_4

    .line 2
    move-object v0, p1

    check-cast v0, Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;

    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->access$100(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/TextureRenderView$b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$b;->a(Z)V

    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 6
    :cond_1
    :try_start_0
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->access$100(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/TextureRenderView$b;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;->setSurfaceTextureHost(Lcom/tencent/ijk/media/player/ISurfaceTextureHost;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->access$100(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/TextureRenderView$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$b;->a(Landroid/graphics/SurfaceTexture;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->d:Landroid/view/Surface;

    if-eqz v1, :cond_3

    .line 11
    invoke-interface {p1, v1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setSurface(Landroid/view/Surface;)V

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    invoke-interface {v0, v1}, Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 13
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->a:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;->access$100(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)Lcom/tencent/liteav/txcvodplayer/TextureRenderView$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;->setSurfaceTextureHost(Lcom/tencent/ijk/media/player/ISurfaceTextureHost;)V

    .line 14
    :goto_0
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->d:Landroid/view/Surface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 15
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    return-void

    .line 16
    :cond_4
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->b()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 17
    invoke-interface {p1, v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public b()Landroid/view/Surface;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Landroid/view/Surface;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->b:Landroid/graphics/SurfaceTexture;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TextureRenderView$a;->d:Landroid/view/Surface;

    .line 21
    .line 22
    return-object v0
.end method
