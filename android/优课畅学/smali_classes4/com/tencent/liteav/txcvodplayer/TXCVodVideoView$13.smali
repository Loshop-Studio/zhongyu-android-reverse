.class Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer$OnErrorListener;


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
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onError(Lcom/tencent/ijk/media/player/IMediaPlayer;II)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "onError: "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ","

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    invoke-static {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 42
    .line 43
    invoke-static {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 44
    .line 45
    .line 46
    const/16 p1, -0x3ec

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-ne p2, p1, :cond_0

    .line 50
    .line 51
    const/16 p1, -0x8ff

    .line 52
    .line 53
    if-ne p3, p1, :cond_0

    .line 54
    .line 55
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 56
    .line 57
    const-string p2, "The file does not exist"

    .line 58
    .line 59
    const-string v1, "file not exist"

    .line 60
    .line 61
    invoke-static {p1, p3, p2, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c()V

    .line 67
    .line 68
    .line 69
    return v0

    .line 70
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 71
    .line 72
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 77
    .line 78
    invoke-virtual {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    int-to-long v1, p3

    .line 83
    cmp-long p1, p1, v1

    .line 84
    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 88
    .line 89
    const/4 p2, 0x0

    .line 90
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    int-to-long p2, p2

    .line 100
    invoke-static {p1, p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;J)J

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 104
    .line 105
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    int-to-float p1, p1

    .line 110
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 111
    .line 112
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/d;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iget p2, p2, Lcom/tencent/liteav/txcvodplayer/d;->a:F

    .line 117
    .line 118
    cmpg-float p1, p1, p2

    .line 119
    .line 120
    if-gez p1, :cond_2

    .line 121
    .line 122
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 131
    .line 132
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 137
    .line 138
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/d;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iget p2, p2, Lcom/tencent/liteav/txcvodplayer/d;->b:F

    .line 143
    .line 144
    const/high16 p3, 0x447a0000    # 1000.0f

    .line 145
    .line 146
    mul-float/2addr p2, p3

    .line 147
    float-to-long p2, p2

    .line 148
    const/16 v1, 0x66

    .line 149
    .line 150
    invoke-virtual {p1, v1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 155
    .line 156
    const-string p2, "Disconnected from the network. Playback error"

    .line 157
    .line 158
    const-string p3, "disconnect"

    .line 159
    .line 160
    const/16 v1, -0x8fd

    .line 161
    .line 162
    invoke-static {p1, v1, p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$13;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c()V

    .line 168
    .line 169
    .line 170
    :cond_3
    :goto_0
    return v0
.end method
