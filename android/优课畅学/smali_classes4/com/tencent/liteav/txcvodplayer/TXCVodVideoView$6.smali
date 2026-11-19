.class Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onHLSKeyError(Lcom/tencent/ijk/media/player/IMediaPlayer;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "onHLSKeyError"

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 13
    .line 14
    const-string v0, "HLS decypt key get failed"

    .line 15
    .line 16
    const-string v1, "hls key error"

    .line 17
    .line 18
    const/16 v2, -0x901

    .line 19
    .line 20
    invoke-static {p1, v2, v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->stop()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->release()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-static {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Lcom/tencent/ijk/media/player/IMediaPlayer;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 56
    .line 57
    const/4 v0, -0x1

    .line 58
    invoke-static {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$6;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 62
    .line 63
    invoke-static {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 64
    .line 65
    .line 66
    return-void
.end method
