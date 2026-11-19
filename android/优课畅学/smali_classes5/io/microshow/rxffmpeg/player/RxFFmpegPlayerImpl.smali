.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;
.super Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# static fields
.field private static mSurfaceTexture:Landroid/graphics/SurfaceTexture;


# instance fields
.field private mWeakTextureView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/TextureView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getTextureView()Landroid/view/TextureView;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mWeakTextureView:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/TextureView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->getTextureView()Landroid/view/TextureView;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p2, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    sput-object p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 13
    .line 14
    new-instance p1, Landroid/view/Surface;

    .line 15
    .line 16
    sget-object p2, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 17
    .line 18
    invoke-direct {p1, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->setSurface(Landroid/view/Surface;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->getTextureView()Landroid/view/TextureView;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->getTextureView()Landroid/view/TextureView;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object p2, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public play(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->stop()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->setDataSource(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->setLooping(Z)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl$1;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl$1;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnPreparedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->prepare()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->stop()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->release()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    sput-object v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setTextureView(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;->mWeakTextureView:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
