.class public Lcom/zykj/video/play/SuperPlayerView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/SuperPlayerView;->l0(Lcom/zykj/video/play/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/b;

.field public final synthetic b:Lcom/zykj/video/play/SuperPlayerView;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/SuperPlayerView;Lcom/zykj/video/play/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/video/play/SuperPlayerView$b;->a:Lcom/zykj/video/play/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onFail: errorCode = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " message = "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "SuperPlayerView"

    .line 27
    .line 28
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "\u64ad\u653e\u89c6\u9891\u6587\u4ef6\u5931\u8d25 code = "

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, " msg = "

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/4 p2, 0x0

    .line 63
    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public b(Lm5/b;Lm5/d;)V
    .locals 2

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess: protocol params = "

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lm5/d;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "SuperPlayerView"

    .line 23
    .line 24
    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {p1, v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->C(Lcom/zykj/video/play/SuperPlayerView;J)J

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p2, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 43
    .line 44
    invoke-static {p2}, Lcom/zykj/video/play/SuperPlayerView;->M(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/TXVodPlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p1, p2}, Lcom/zykj/video/play/SuperPlayerView;->W(Lcom/zykj/video/play/SuperPlayerView;Lm5/b;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    invoke-static {p1, p2}, Lcom/zykj/video/play/SuperPlayerView;->X(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->a:Lcom/zykj/video/play/b;

    .line 67
    .line 68
    iget-object p1, p1, Lcom/zykj/video/play/b;->f:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_0

    .line 75
    .line 76
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->a:Lcom/zykj/video/play/b;

    .line 77
    .line 78
    iget-object p1, p1, Lcom/zykj/video/play/b;->f:Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1}, Lm5/b;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 94
    .line 95
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p1}, Lm5/b;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_1

    .line 108
    .line 109
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 110
    .line 111
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p1}, Lm5/b;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    goto :goto_0

    .line 120
    :cond_1
    const-string p1, ""

    .line 121
    .line 122
    :goto_0
    iget-object p2, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 123
    .line 124
    invoke-static {p2, p1}, Lcom/zykj/video/play/SuperPlayerView;->Y(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 128
    .line 129
    const-wide/16 v0, 0x0

    .line 130
    .line 131
    invoke-static {p1, v0, v1, v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->d(Lcom/zykj/video/play/SuperPlayerView;JJ)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 135
    .line 136
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object p2, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 141
    .line 142
    invoke-static {p2}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-interface {p2}, Lm5/b;->b()Lj5/b;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p1, p2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O(Lj5/b;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 154
    .line 155
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-object p2, p0, Lcom/zykj/video/play/SuperPlayerView$b;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 160
    .line 161
    invoke-static {p2}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-interface {p2}, Lm5/b;->d()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-virtual {p1, p2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->P(Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method
