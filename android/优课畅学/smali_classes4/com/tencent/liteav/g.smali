.class public Lcom/tencent/liteav/g;
.super Lcom/tencent/liteav/i;
.source "SourceFile"


# instance fields
.field protected a:Z

.field private f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

.field private g:Lcom/tencent/liteav/txcvodplayer/d;

.field private h:Lcom/tencent/liteav/f;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:F

.field private n:Landroid/view/Surface;

.field private o:Lcom/tencent/liteav/txcvodplayer/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/i;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/tencent/liteav/g;->j:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/liteav/g;->k:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/tencent/liteav/g;->l:Z

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/liteav/g;->m:F

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/liteav/g$1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/tencent/liteav/g$1;-><init>(Lcom/tencent/liteav/g;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/liteav/g;->o:Lcom/tencent/liteav/txcvodplayer/e;

    .line 24
    .line 25
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 31
    .line 32
    iget-object p1, p0, Lcom/tencent/liteav/g;->o:Lcom/tencent/liteav/txcvodplayer/e;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setListener(Lcom/tencent/liteav/txcvodplayer/e;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/g;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/tencent/liteav/g;->i:Z

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/g;->i:Z

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    return-object p0
.end method

.method public static synthetic d(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/d;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 2

    .line 23
    iget-object p2, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 24
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    iget-object p2, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p2}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object p2

    if-nez p2, :cond_0

    .line 26
    new-instance p2, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    iget-object v1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;-><init>(Landroid/content/Context;)V

    .line 27
    iget-object v1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {v1, p2}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->addVideoView(Landroid/view/TextureView;)V

    .line 28
    iget-object v1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setTextureRenderView(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V

    .line 29
    :cond_0
    iget-object p2, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p2}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 30
    :cond_1
    iget-object p2, p0, Lcom/tencent/liteav/g;->n:Landroid/view/Surface;

    if-eqz p2, :cond_2

    .line 31
    iget-object v1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderSurface(Landroid/view/Surface;)V

    .line 32
    :cond_2
    :goto_0
    new-instance p2, Lcom/tencent/liteav/f;

    iget-object v1, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    invoke-direct {p2, v1}, Lcom/tencent/liteav/f;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    .line 33
    invoke-virtual {p2, p1}, Lcom/tencent/liteav/f;->a(Ljava/lang/String;)V

    .line 34
    iget-object p2, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    invoke-virtual {p2}, Lcom/tencent/liteav/f;->b()V

    .line 35
    iput-boolean v0, p0, Lcom/tencent/liteav/g;->i:Z

    .line 36
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    iget-object v1, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/d;->b()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setPlayerType(I)V

    .line 37
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    iget-boolean v1, p0, Lcom/tencent/liteav/g;->j:Z

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)Z

    .line 38
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {p2, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setVideoPath(Ljava/lang/String;)V

    .line 39
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    iget-boolean v1, p0, Lcom/tencent/liteav/g;->k:Z

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setAutoPlay(Z)V

    .line 40
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    iget v1, p0, Lcom/tencent/liteav/g;->m:F

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRate(F)V

    .line 41
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    iget-boolean v1, p0, Lcom/tencent/liteav/g;->l:Z

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setAutoRotate(Z)V

    .line 42
    iget-object p2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b()V

    .line 43
    iget-object p2, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/f;->b(I)V

    .line 44
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startPlay "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TXVodPlayer"

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object p1, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    sget p2, Lcom/tencent/liteav/basic/datareport/a;->bs:I

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V

    .line 46
    :try_start_0
    const-string p1, "com.tencent.liteav.demo.play.SuperPlayerView"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 47
    iget-object p1, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    sget p2, Lcom/tencent/liteav/basic/datareport/a;->bD:I

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v0
.end method

.method public a(Z)I
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c()V

    .line 49
    iget-object v0, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 50
    iget-object p1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    if-eqz p1, :cond_1

    .line 52
    invoke-virtual {p1}, Lcom/tencent/liteav/f;->c()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public a()V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d()V

    return-void
.end method

.method public a(F)V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr p1, v1

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(I)V

    .line 58
    iget-boolean p1, p0, Lcom/tencent/liteav/g;->i:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    if-eqz p1, :cond_0

    .line 59
    invoke-virtual {p1}, Lcom/tencent/liteav/f;->j()V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 60
    iget-object p1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderMode(I)V

    return-void

    .line 61
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderMode(I)V

    return-void
.end method

.method public a(Landroid/view/Surface;)V
    .locals 1

    .line 53
    iput-object p1, p0, Lcom/tencent/liteav/g;->n:Landroid/view/Surface;

    .line 54
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderSurface(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/c/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a(Lcom/tencent/liteav/d;)V
    .locals 2

    .line 5
    invoke-super {p0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/d;)V

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/d;

    invoke-direct {v0}, Lcom/tencent/liteav/txcvodplayer/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->a(F)V

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->f:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->b(F)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->r:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->c(F)V

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-boolean v1, v1, Lcom/tencent/liteav/d;->h:Z

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->a(Z)V

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-object v1, v1, Lcom/tencent/liteav/d;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->a(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->o:I

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->a(I)V

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->p:I

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->b(I)V

    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-object v1, v1, Lcom/tencent/liteav/d;->q:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->a(Ljava/util/Map;)V

    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-boolean v1, v1, Lcom/tencent/liteav/d;->s:Z

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->b(Z)V

    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-boolean v1, v1, Lcom/tencent/liteav/d;->u:Z

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->c(Z)V

    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-object v1, v1, Lcom/tencent/liteav/d;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->b(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->w:I

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->c(I)V

    .line 20
    iget-object v0, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v1, Lcom/tencent/liteav/d;->x:I

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/d;->d(I)V

    .line 21
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    iget-object v1, p0, Lcom/tencent/liteav/g;->g:Lcom/tencent/liteav/txcvodplayer/d;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setConfig(Lcom/tencent/liteav/txcvodplayer/d;)V

    .line 22
    iget-boolean p1, p1, Lcom/tencent/liteav/d;->t:Z

    iput-boolean p1, p0, Lcom/tencent/liteav/g;->l:Z

    return-void
.end method

.method public a(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRenderView(Lcom/tencent/liteav/txcvodplayer/a;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eq p1, v0, :cond_1

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->removeVideoView()V

    :cond_0
    if-eqz p1, :cond_1

    .line 64
    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->removeVideoView()V

    :cond_1
    if-eqz p1, :cond_3

    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object v1

    if-nez v1, :cond_2

    .line 67
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tencent/liteav/txcvodplayer/TextureRenderView;-><init>(Landroid/content/Context;)V

    .line 68
    invoke-virtual {p1, v1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->addVideoView(Landroid/view/TextureView;)V

    .line 69
    iget-object v2, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setTextureRenderView(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V

    .line 70
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 71
    :cond_3
    invoke-super {p0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    return-void
.end method

.method public a(ZI)V
    .locals 0

    .line 2
    return-void
.end method

.method public b()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b()V

    return-void
.end method

.method public b(F)V
    .locals 1

    .line 5
    iput p1, p0, Lcom/tencent/liteav/g;->m:F

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRate(F)V

    .line 8
    :cond_0
    iget-boolean p1, p0, Lcom/tencent/liteav/g;->i:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/tencent/liteav/f;->l()V

    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    rsub-int p1, p1, 0x168

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setVideoRotationDegree(I)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setMute(Z)V

    return-void
.end method

.method public c(F)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setStartTime(F)V

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setVolume(I)V

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Z
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e()Z

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public d()Landroid/view/TextureView;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Z)Z
    .locals 1

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/g;->j:Z

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Z)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public e()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public e(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    mul-int/lit16 p1, p1, 0x3e8

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(I)V

    .line 3
    iget-boolean p1, p0, Lcom/tencent/liteav/g;->i:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/tencent/liteav/f;->j()V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/g;->k:Z

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setAutoPlay(Z)V

    :cond_0
    return-void
.end method

.method public f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setBitrateIndex(I)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/tencent/liteav/g;->i:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/tencent/liteav/f;->k()V

    :cond_1
    return-void
.end method

.method public f(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/g;->a:Z

    return-void
.end method

.method public g(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/tencent/liteav/g;->d()Landroid/view/TextureView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    .line 8
    .line 9
    iget-boolean v1, v1, Lcom/tencent/liteav/d;->t:Z

    .line 10
    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/high16 v3, -0x40800000    # -1.0f

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getMetaRotationDegree()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v4, 0x5a

    .line 24
    .line 25
    if-eq v1, v4, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getMetaRotationDegree()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v4, 0x10e

    .line 34
    .line 35
    if-ne v1, v4, :cond_2

    .line 36
    .line 37
    :cond_0
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move v2, v3

    .line 40
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    if-eqz p1, :cond_3

    .line 45
    .line 46
    move v2, v3

    .line 47
    :cond_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 48
    .line 49
    .line 50
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/g;->h:Lcom/tencent/liteav/f;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/f;->a(Z)V

    .line 55
    .line 56
    .line 57
    :cond_5
    return-void
.end method

.method public h()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getBufferDuration()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public k()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public l()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getBufferDuration()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getBitrateIndex()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public p()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/rtmp/TXBitrateItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/g;->f:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/tencent/ijk/media/player/IjkBitrateItem;

    .line 31
    .line 32
    new-instance v3, Lcom/tencent/rtmp/TXBitrateItem;

    .line 33
    .line 34
    invoke-direct {v3}, Lcom/tencent/rtmp/TXBitrateItem;-><init>()V

    .line 35
    .line 36
    .line 37
    iget v4, v2, Lcom/tencent/ijk/media/player/IjkBitrateItem;->index:I

    .line 38
    .line 39
    iput v4, v3, Lcom/tencent/rtmp/TXBitrateItem;->index:I

    .line 40
    .line 41
    iget v4, v2, Lcom/tencent/ijk/media/player/IjkBitrateItem;->width:I

    .line 42
    .line 43
    iput v4, v3, Lcom/tencent/rtmp/TXBitrateItem;->width:I

    .line 44
    .line 45
    iget v4, v2, Lcom/tencent/ijk/media/player/IjkBitrateItem;->height:I

    .line 46
    .line 47
    iput v4, v3, Lcom/tencent/rtmp/TXBitrateItem;->height:I

    .line 48
    .line 49
    iget v2, v2, Lcom/tencent/ijk/media/player/IjkBitrateItem;->bitrate:I

    .line 50
    .line 51
    iput v2, v3, Lcom/tencent/rtmp/TXBitrateItem;->bitrate:I

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v0
.end method
