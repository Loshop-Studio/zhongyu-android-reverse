.class Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer$OnHevcVideoDecoderErrorListener;


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
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onHevcVideoDecoderError(Lcom/tencent/ijk/media/player/IMediaPlayer;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$14;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 7
    .line 8
    const-string v0, "Vod H265 decoding failed"

    .line 9
    .line 10
    const-string v1, "hevc decode fail"

    .line 11
    .line 12
    const/16 v2, -0x900

    .line 13
    .line 14
    invoke-static {p1, v2, v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
