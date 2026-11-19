.class public Lcom/tencent/ijk/media/player/TextureMediaPlayer;
.super Lcom/tencent/ijk/media/player/MediaPlayerProxy;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer;
.implements Lcom/tencent/ijk/media/player/ISurfaceTextureHolder;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private mBackEndMediaPlayer:Lcom/tencent/ijk/media/player/IMediaPlayer;

.field private mReuseSurfaceTexture:Z

.field private mSurface:Landroid/view/Surface;

.field private mSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field private mSurfaceTextureHost:Lcom/tencent/ijk/media/player/ISurfaceTextureHost;


# direct methods
.method public constructor <init>(Lcom/tencent/ijk/media/player/IMediaPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;-><init>(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mBackEndMediaPlayer:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getBackEndMediaPlayer()Lcom/tencent/ijk/media/player/IMediaPlayer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mBackEndMediaPlayer:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBitrateIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mBackEndMediaPlayer:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getBitrateIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getSupportedBitrates()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/ijk/media/player/IjkBitrateItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mBackEndMediaPlayer:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->getSurface()Landroid/view/Surface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getSurfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    return-object v0
.end method

.method public release()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->release()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->releaseSurfaceTexture()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public releaseSurfaceTexture()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mReuseSurfaceTexture:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTextureHost:Lcom/tencent/ijk/media/player/ISurfaceTextureHost;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lcom/tencent/ijk/media/player/ISurfaceTextureHost;->releaseSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public reset()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->releaseSurfaceTexture()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setBitrateIndex(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mBackEndMediaPlayer:Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->setBitrateIndex(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDisplay(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setReuseSurfaceTexture(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mReuseSurfaceTexture:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->setSurface(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 9
    .line 10
    return-void
.end method

.method public setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->releaseSurfaceTexture()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 15
    .line 16
    invoke-super {p0, p1}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->setSurface(Landroid/view/Surface;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Landroid/view/Surface;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 30
    .line 31
    :cond_2
    iget-object p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 32
    .line 33
    invoke-super {p0, p1}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->setSurface(Landroid/view/Surface;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setSurfaceTextureHost(Lcom/tencent/ijk/media/player/ISurfaceTextureHost;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/ijk/media/player/TextureMediaPlayer;->mSurfaceTextureHost:Lcom/tencent/ijk/media/player/ISurfaceTextureHost;

    .line 2
    .line 3
    return-void
.end method
