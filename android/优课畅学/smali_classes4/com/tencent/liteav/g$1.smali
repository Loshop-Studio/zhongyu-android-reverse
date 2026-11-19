.class Lcom/tencent/liteav/g$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcvodplayer/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/g;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 10

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 2
    const-string v1, "description"

    const/16 v2, -0x8fd

    if-eq p1, v2, :cond_c

    const/16 v2, 0x7db

    const-string v3, "EVT_PARAM1"

    if-eq p1, v2, :cond_b

    const/16 v2, 0x837

    if-eq p1, v2, :cond_c

    const/16 v2, 0x83a

    const/4 v4, 0x0

    if-eq p1, v2, :cond_a

    const/16 v2, 0x7dd

    if-eq p1, v2, :cond_9

    const/16 v2, 0x7de

    if-eq p1, v2, :cond_c

    packed-switch p1, :pswitch_data_0

    const-string v2, "TXVodPlayer"

    const/16 v5, 0x7d8

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "miss match event "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :pswitch_0
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->g()V

    return-void

    .line 5
    :pswitch_1
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->h()V

    return-void

    .line 6
    :pswitch_2
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->f()V

    return-void

    :pswitch_3
    const/16 v2, 0x7d9

    goto/16 :goto_5

    :pswitch_4
    move v2, v5

    goto/16 :goto_5

    .line 7
    :pswitch_5
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->i()V

    const/16 v2, 0x7d7

    goto/16 :goto_5

    .line 8
    :pswitch_6
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->c()V

    .line 9
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    iget-boolean v3, p1, Lcom/tencent/liteav/g;->a:Z

    if-eqz v3, :cond_0

    .line 10
    invoke-static {p1}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b()V

    .line 11
    const-string p1, "loop play"

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/16 v2, 0x7d6

    goto/16 :goto_5

    .line 12
    :pswitch_7
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    const-string v2, "EVT_PLAY_DURATION"

    invoke-virtual {p2, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/tencent/liteav/f;->a(I)V

    const/16 v2, 0x7d5

    goto/16 :goto_5

    .line 13
    :pswitch_8
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->d()V

    const/16 v2, 0x7d4

    goto/16 :goto_5

    .line 14
    :pswitch_9
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->b(Lcom/tencent/liteav/g;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_6

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    const/4 v2, 0x1

    invoke-static {p1, v2}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;Z)Z

    .line 16
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->e()V

    .line 17
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 18
    const-string v6, "EVT_ID"

    invoke-virtual {p1, v6, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 19
    const-string v6, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v7

    invoke-virtual {p1, v6, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 20
    iget-object v6, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {v6}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getMediaInfo()Lcom/tencent/ijk/media/player/MediaInfo;

    move-result-object v6

    .line 21
    const-string v7, "hevc"

    if-eqz v6, :cond_2

    iget-object v6, v6, Lcom/tencent/ijk/media/player/MediaInfo;->mVideoDecoderImpl:Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 22
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v4, v2

    .line 23
    :cond_2
    iget-object v6, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {v6}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getPlayerType()I

    move-result v6

    const/4 v8, 0x2

    const-string v9, "Enables hardware decoding"

    if-nez v6, :cond_7

    if-nez v4, :cond_4

    .line 24
    iget-object v6, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {v6}, Lcom/tencent/liteav/g;->d(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/d;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/d;->a()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    :cond_3
    const-string v9, "Enables software decoding"

    :goto_0
    invoke-virtual {p1, v1, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 25
    :cond_4
    iget-object v6, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {v6}, Lcom/tencent/liteav/g;->d(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/d;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/d;->a()Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v6, "Enables hardware decoding H265"

    goto :goto_1

    :cond_5
    const-string v6, "Enables software decoding h265"

    :goto_1
    invoke-virtual {p1, v1, v6}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 26
    :goto_2
    iget-object v6, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {v6}, Lcom/tencent/liteav/g;->d(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/d;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/d;->a()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    move v2, v8

    :goto_3
    invoke-virtual {p1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 27
    invoke-virtual {p1, v7, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_4

    .line 28
    :cond_7
    invoke-virtual {p1, v1, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 29
    invoke-virtual {p1, v3, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    :goto_4
    invoke-virtual {p0, v5, p1}, Lcom/tencent/liteav/g$1;->a(ILandroid/os/Bundle;)V

    const/16 v2, 0x7d3

    goto :goto_5

    :pswitch_a
    const/16 v2, -0x8ff

    goto :goto_5

    .line 31
    :pswitch_b
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->b(Lcom/tencent/liteav/g;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 32
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->d(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/d;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/tencent/liteav/txcvodplayer/d;->a(Z)V

    :cond_8
    const/16 v2, -0x900

    goto :goto_5

    :pswitch_c
    const/16 v2, -0x901

    goto :goto_5

    .line 33
    :cond_9
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/f;->d()V

    goto :goto_5

    .line 34
    :cond_a
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->b(Lcom/tencent/liteav/g;)Z

    move-result p1

    if-nez p1, :cond_c

    .line 35
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->d(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/d;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/tencent/liteav/txcvodplayer/d;->a(Z)V

    goto :goto_5

    .line 36
    :cond_b
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getMetaRotationDegree()I

    move-result p1

    invoke-virtual {v0, v3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    :cond_c
    :goto_5
    const-string p1, ""

    invoke-virtual {p2, v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "EVT_MSG"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    iget-object p1, p1, Lcom/tencent/liteav/i;->e:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_d

    .line 39
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/liteav/basic/b/b;

    if-eqz p1, :cond_d

    .line 40
    invoke-interface {p1, v2, v0}, Lcom/tencent/liteav/basic/b/b;->onNotifyEvent(ILandroid/os/Bundle;)V

    :cond_d
    :goto_6
    :pswitch_d
    return-void

    :pswitch_data_0
    .packed-switch -0x901
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7d3
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x7e0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_d
    .end packed-switch
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .line 41
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 42
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->a()[I

    move-result-object v1

    const/4 v2, 0x0

    .line 43
    aget v2, v1, v2

    div-int/lit8 v2, v2, 0xa

    const/4 v3, 0x1

    .line 44
    aget v1, v1, v3

    div-int/lit8 v1, v1, 0xa

    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    const-string v2, "CPU_USAGE"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 47
    const-string v1, "fps"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    float-to-int v1, v1

    const-string v2, "VIDEO_FPS"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 48
    const-string v1, "dps"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    float-to-int v1, v1

    const-string v2, "VIDEO_DPS"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 49
    const-string v1, "tcpSpeed"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-int v1, v1

    div-int/lit16 v1, v1, 0x3e8

    const-string v2, "NET_SPEED"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 50
    const-string v1, "cachedBytes"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-int p1, v1

    div-int/lit16 p1, p1, 0x3e8

    const-string v1, "AUDIO_CACHE"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 51
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoWidth()I

    move-result p1

    const-string v1, "VIDEO_WIDTH"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 52
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoHeight()I

    move-result p1

    const-string v1, "VIDEO_HEIGHT"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getServerIp()Ljava/lang/String;

    move-result-object p1

    const-string v1, "SERVER_IP"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/f;

    move-result-object p1

    iget-object v1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    invoke-static {v1}, Lcom/tencent/liteav/g;->c(Lcom/tencent/liteav/g;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getServerIp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/liteav/f;->b(Ljava/lang/String;)V

    .line 55
    iget-object p1, p0, Lcom/tencent/liteav/g$1;->a:Lcom/tencent/liteav/g;

    iget-object p1, p1, Lcom/tencent/liteav/i;->e:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    .line 56
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/liteav/basic/b/b;

    if-eqz p1, :cond_0

    const/16 v1, 0x3a99

    .line 57
    invoke-interface {p1, v1, v0}, Lcom/tencent/liteav/basic/b/b;->onNotifyEvent(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method
