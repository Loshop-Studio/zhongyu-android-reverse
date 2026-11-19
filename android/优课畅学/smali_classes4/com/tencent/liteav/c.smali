.class public Lcom/tencent/liteav/c;
.super Lcom/tencent/liteav/i;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/TXCRenderAndDec$a;
.implements Lcom/tencent/liteav/TXCRenderAndDec$b;
.implements Lcom/tencent/liteav/audio/c;
.implements Lcom/tencent/liteav/audio/d;
.implements Lcom/tencent/liteav/basic/b/b;
.implements Lcom/tencent/liteav/network/h;
.implements Lcom/tencent/liteav/renderer/a$a;
.implements Lcom/tencent/liteav/renderer/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/c$a;
    }
.end annotation


# instance fields
.field private A:Lcom/tencent/liteav/renderer/h;

.field private B:Lcom/tencent/liteav/renderer/h;

.field private C:[F

.field private D:[F

.field private E:Ljava/lang/String;

.field private F:I

.field private G:Z

.field private H:Lcom/tencent/liteav/basic/a/b;

.field private I:Ljava/lang/Object;

.field private J:Lcom/tencent/liteav/basic/b/a;

.field private K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

.field private L:Ljava/lang/String;

.field private M:Z

.field private N:J

.field private O:J

.field private P:Lcom/tencent/liteav/c$a;

.field private a:Lcom/tencent/liteav/TXCRenderAndDec;

.field private f:Lcom/tencent/liteav/renderer/a;

.field private g:Lcom/tencent/liteav/network/TXCStreamDownloader;

.field private h:Landroid/os/Handler;

.field private i:Landroid/view/TextureView;

.field private j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:Z

.field private p:Landroid/view/Surface;

.field private q:I

.field private r:I

.field private s:I

.field private t:Z

.field private u:Z

.field private v:Lcom/tencent/liteav/a/a;

.field private w:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

.field private x:Lcom/tencent/liteav/b;

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/i;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->j:Z

    .line 13
    .line 14
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->k:Z

    .line 15
    .line 16
    const/16 v2, 0x64

    .line 17
    .line 18
    iput v2, p0, Lcom/tencent/liteav/c;->l:I

    .line 19
    .line 20
    iput v1, p0, Lcom/tencent/liteav/c;->m:I

    .line 21
    .line 22
    iput v1, p0, Lcom/tencent/liteav/c;->n:I

    .line 23
    .line 24
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->o:Z

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    iput v2, p0, Lcom/tencent/liteav/c;->q:I

    .line 28
    .line 29
    const v2, 0xbb80

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lcom/tencent/liteav/c;->r:I

    .line 33
    .line 34
    const/16 v2, 0x10

    .line 35
    .line 36
    iput v2, p0, Lcom/tencent/liteav/c;->s:I

    .line 37
    .line 38
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->t:Z

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->u:Z

    .line 41
    .line 42
    iput v1, p0, Lcom/tencent/liteav/c;->y:I

    .line 43
    .line 44
    iput v1, p0, Lcom/tencent/liteav/c;->z:I

    .line 45
    .line 46
    iput-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 49
    .line 50
    new-array v3, v2, [F

    .line 51
    .line 52
    fill-array-data v3, :array_0

    .line 53
    .line 54
    .line 55
    iput-object v3, p0, Lcom/tencent/liteav/c;->C:[F

    .line 56
    .line 57
    new-array v2, v2, [F

    .line 58
    .line 59
    iput-object v2, p0, Lcom/tencent/liteav/c;->D:[F

    .line 60
    .line 61
    const-string v2, ""

    .line 62
    .line 63
    iput-object v2, p0, Lcom/tencent/liteav/c;->E:Ljava/lang/String;

    .line 64
    .line 65
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->G:Z

    .line 66
    .line 67
    sget-object v3, Lcom/tencent/liteav/basic/a/b;->a:Lcom/tencent/liteav/basic/a/b;

    .line 68
    .line 69
    iput-object v3, p0, Lcom/tencent/liteav/c;->H:Lcom/tencent/liteav/basic/a/b;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/tencent/liteav/c;->I:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance v3, Lcom/tencent/liteav/c$1;

    .line 74
    .line 75
    invoke-direct {v3, p0}, Lcom/tencent/liteav/c$1;-><init>(Lcom/tencent/liteav/c;)V

    .line 76
    .line 77
    .line 78
    iput-object v3, p0, Lcom/tencent/liteav/c;->J:Lcom/tencent/liteav/basic/b/a;

    .line 79
    .line 80
    iput-object v2, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 81
    .line 82
    iput-boolean v1, p0, Lcom/tencent/liteav/c;->M:Z

    .line 83
    .line 84
    const-wide/16 v2, 0x0

    .line 85
    .line 86
    iput-wide v2, p0, Lcom/tencent/liteav/c;->N:J

    .line 87
    .line 88
    iput-wide v2, p0, Lcom/tencent/liteav/c;->O:J

    .line 89
    .line 90
    iput-object v0, p0, Lcom/tencent/liteav/c;->P:Lcom/tencent/liteav/c$a;

    .line 91
    .line 92
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/basic/d/c;->a(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/d/c;->b()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {p1, v0}, Lcom/tencent/liteav/audio/TXCAudioEngine;->CreateInstance(Landroid/content/Context;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/tencent/liteav/c;->J:Lcom/tencent/liteav/basic/b/a;

    .line 117
    .line 118
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/audio/TXCAudioEngine;->addEventCallback(Ljava/lang/ref/WeakReference;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const-string v0, "Audio"

    .line 129
    .line 130
    const-string v2, "EnableAutoRestartDevice"

    .line 131
    .line 132
    invoke-virtual {p1, v0, v2}, Lcom/tencent/liteav/basic/d/c;->a(Ljava/lang/String;Ljava/lang/String;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-wide/16 v4, 0x1

    .line 141
    .line 142
    cmp-long v0, v2, v4

    .line 143
    .line 144
    if-eqz v0, :cond_0

    .line 145
    .line 146
    const-wide/16 v4, -0x1

    .line 147
    .line 148
    cmp-long v0, v2, v4

    .line 149
    .line 150
    if-nez v0, :cond_1

    .line 151
    .line 152
    :cond_0
    const/4 v1, 0x1

    .line 153
    :cond_1
    invoke-virtual {p1, v1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->enableAutoRestartDevice(Z)V

    .line 154
    .line 155
    .line 156
    new-instance p1, Landroid/os/Handler;

    .line 157
    .line 158
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 163
    .line 164
    .line 165
    iput-object p1, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    .line 166
    .line 167
    new-instance p1, Lcom/tencent/liteav/renderer/a;

    .line 168
    .line 169
    invoke-direct {p1}, Lcom/tencent/liteav/renderer/a;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 173
    .line 174
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/basic/b/b;)V

    .line 175
    .line 176
    .line 177
    new-instance p1, Lcom/tencent/liteav/c$a;

    .line 178
    .line 179
    invoke-direct {p1, p0}, Lcom/tencent/liteav/c$a;-><init>(Lcom/tencent/liteav/c;)V

    .line 180
    .line 181
    .line 182
    iput-object p1, p0, Lcom/tencent/liteav/c;->P:Lcom/tencent/liteav/c$a;

    .line 183
    .line 184
    return-void

    .line 185
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static synthetic a(Lcom/tencent/liteav/c;)Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/c;->w:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

    return-object p0
.end method

.method private a(ILjava/lang/String;)V
    .locals 4

    .line 89
    iget-object v0, p0, Lcom/tencent/liteav/i;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 90
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 91
    const-string v1, "EVT_ID"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 92
    const-string v1, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    if-eqz p2, :cond_0

    .line 93
    const-string v1, "EVT_MSG"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 94
    :cond_0
    iget-object p2, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    if-eqz p2, :cond_1

    .line 95
    new-instance v1, Lcom/tencent/liteav/c$5;

    invoke-direct {v1, p0, p1, v0}, Lcom/tencent/liteav/c$5;-><init>(Lcom/tencent/liteav/c;ILandroid/os/Bundle;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/c;)Lcom/tencent/liteav/renderer/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    return-object p0
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 8
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    rem-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%s-%d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/TXCRenderAndDec;->setID(Ljava/lang/String;)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz p1, :cond_1

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    if-eqz p1, :cond_2

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setID(Ljava/lang/String;)V

    .line 15
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    if-eqz p1, :cond_3

    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/b;->d(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private c(Ljava/lang/String;I)I
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x5

    if-nez p2, :cond_0

    .line 7
    new-instance v2, Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v3, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Lcom/tencent/liteav/network/TXCStreamDownloader;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    goto :goto_0

    :cond_0
    if-ne p2, v1, :cond_1

    .line 8
    new-instance v2, Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v3, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    const/4 v4, 0x4

    invoke-direct {v2, v3, v4}, Lcom/tencent/liteav/network/TXCStreamDownloader;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    goto :goto_0

    .line 9
    :cond_1
    new-instance v2, Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v3, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lcom/tencent/liteav/network/TXCStreamDownloader;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 10
    iget-object v2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-object v2, v2, Lcom/tencent/liteav/d;->l:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 11
    iget-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v3, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-object v3, v3, Lcom/tencent/liteav/d;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setFlvSessionKey(Ljava/lang/String;)V

    .line 12
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v3, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setID(Ljava/lang/String;)V

    .line 13
    iget-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    invoke-virtual {v2, p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setListener(Lcom/tencent/liteav/network/h;)V

    .line 14
    iget-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    invoke-virtual {v2, p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 15
    iget-object v2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v3, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-object v3, v3, Lcom/tencent/liteav/d;->q:Ljava/util/Map;

    invoke-virtual {v2, v3}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setHeaders(Ljava/util/Map;)V

    if-ne p2, v1, :cond_3

    .line 16
    iget-object p2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    invoke-virtual {p2, v1}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setRetryTimes(I)V

    .line 17
    iget-object p2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    invoke-virtual {p2, v0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setRetryInterval(I)V

    goto :goto_1

    .line 18
    :cond_3
    iget-object p2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v0, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v0, v0, Lcom/tencent/liteav/d;->e:I

    invoke-virtual {p2, v0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setRetryTimes(I)V

    .line 19
    iget-object p2, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object v0, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v0, v0, Lcom/tencent/liteav/d;->f:I

    invoke-virtual {p2, v0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setRetryInterval(I)V

    .line 20
    :goto_1
    iget-object v1, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    iget-object p2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget-boolean v3, p2, Lcom/tencent/liteav/d;->i:Z

    iget v4, p2, Lcom/tencent/liteav/d;->m:I

    iget-boolean v5, p2, Lcom/tencent/liteav/d;->j:Z

    iget-boolean v6, p2, Lcom/tencent/liteav/d;->k:Z

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/tencent/liteav/network/TXCStreamDownloader;->start(Ljava/lang/String;ZIZZ)I

    move-result p1

    return p1
.end method

.method public static synthetic c(Lcom/tencent/liteav/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/c;->M:Z

    return p0
.end method

.method public static synthetic d(Lcom/tencent/liteav/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/c;->u()V

    return-void
.end method

.method public static synthetic e(Lcom/tencent/liteav/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/c;->v()V

    return-void
.end method

.method public static synthetic f(Lcom/tencent/liteav/c;)Lcom/tencent/liteav/TXCRenderAndDec;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    return-object p0
.end method

.method private f(I)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    :cond_0
    new-instance v0, Lcom/tencent/liteav/TXCRenderAndDec;

    iget-object v2, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/tencent/liteav/TXCRenderAndDec;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 6
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/TXCRenderAndDec;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    iget-object v2, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    invoke-virtual {v0, v2}, Lcom/tencent/liteav/TXCRenderAndDec;->setVideoRender(Lcom/tencent/liteav/renderer/e;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/TXCRenderAndDec;->setDecListener(Lcom/tencent/liteav/TXCRenderAndDec$a;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/TXCRenderAndDec;->setRenderAndDecDelegate(Lcom/tencent/liteav/TXCRenderAndDec$b;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    iget-object v2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    invoke-virtual {v0, v2}, Lcom/tencent/liteav/TXCRenderAndDec;->setConfig(Lcom/tencent/liteav/d;)V

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    iget-object v2, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/tencent/liteav/TXCRenderAndDec;->setID(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    const/4 v2, 0x5

    if-ne p1, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/TXCRenderAndDec;->start(Z)V

    .line 13
    iget-object p1, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    iget v0, p0, Lcom/tencent/liteav/c;->n:I

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/TXCRenderAndDec;->setRenderMode(I)V

    .line 14
    iget-object p1, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    iget v0, p0, Lcom/tencent/liteav/c;->m:I

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/TXCRenderAndDec;->setRenderRotation(I)V

    return-void
.end method

.method private j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/e;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/tencent/liteav/c;->y:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/e;->j()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/tencent/liteav/c;->z:I

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/tencent/liteav/c;->l()Lcom/tencent/liteav/a/a$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/tencent/liteav/a/a;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lcom/tencent/liteav/a/a;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lcom/tencent/liteav/a/a;->a(Lcom/tencent/liteav/a/a$a;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    .line 38
    .line 39
    new-instance v1, Lcom/tencent/liteav/c$2;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/tencent/liteav/c$2;-><init>(Lcom/tencent/liteav/c;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/a/a;->a(Lcom/tencent/liteav/a/a$b;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Lcom/tencent/liteav/renderer/h;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/tencent/liteav/renderer/h;-><init>(Ljava/lang/Boolean;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->b()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 64
    .line 65
    iget v1, p0, Lcom/tencent/liteav/c;->y:I

    .line 66
    .line 67
    iget v2, p0, Lcom/tencent/liteav/c;->z:I

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/renderer/h;->b(II)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 73
    .line 74
    iget v1, p0, Lcom/tencent/liteav/c;->y:I

    .line 75
    .line 76
    iget v2, p0, Lcom/tencent/liteav/c;->z:I

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/renderer/h;->a(II)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 82
    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    new-instance v0, Lcom/tencent/liteav/renderer/h;

    .line 86
    .line 87
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-direct {v0, v1}, Lcom/tencent/liteav/renderer/h;-><init>(Ljava/lang/Boolean;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->b()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 98
    .line 99
    iget-object v1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/e;->g()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget-object v2, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/tencent/liteav/renderer/e;->h()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/renderer/h;->b(II)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 115
    .line 116
    iget-object v1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/e;->g()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iget-object v2, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/tencent/liteav/renderer/e;->h()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/renderer/h;->a(II)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lcom/tencent/liteav/c;->D:[F

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 135
    .line 136
    .line 137
    :cond_2
    return-void
.end method

.method private k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->c()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->c()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method private l()Lcom/tencent/liteav/a/a$a;
    .locals 7

    .line 1
    iget v0, p0, Lcom/tencent/liteav/c;->y:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/c;->z:I

    .line 6
    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v0, 0x1e0

    .line 11
    .line 12
    const/16 v1, 0x280

    .line 13
    .line 14
    :goto_0
    new-instance v2, Lcom/tencent/liteav/a/a$a;

    .line 15
    .line 16
    invoke-direct {v2}, Lcom/tencent/liteav/a/a$a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput v0, v2, Lcom/tencent/liteav/a/a$a;->a:I

    .line 20
    .line 21
    iput v1, v2, Lcom/tencent/liteav/a/a$a;->b:I

    .line 22
    .line 23
    const/16 v3, 0x14

    .line 24
    .line 25
    iput v3, v2, Lcom/tencent/liteav/a/a$a;->c:I

    .line 26
    .line 27
    mul-int/2addr v0, v0

    .line 28
    int-to-double v3, v0

    .line 29
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 30
    .line 31
    mul-double/2addr v3, v5

    .line 32
    mul-int/2addr v1, v1

    .line 33
    int-to-double v0, v1

    .line 34
    add-double/2addr v3, v0

    .line 35
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide v3, 0x3ff3333333333333L    # 1.2

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    mul-double/2addr v0, v3

    .line 45
    double-to-int v0, v0

    .line 46
    iput v0, v2, Lcom/tencent/liteav/a/a$a;->d:I

    .line 47
    .line 48
    iget v0, p0, Lcom/tencent/liteav/c;->q:I

    .line 49
    .line 50
    iput v0, v2, Lcom/tencent/liteav/a/a$a;->h:I

    .line 51
    .line 52
    iget v0, p0, Lcom/tencent/liteav/c;->r:I

    .line 53
    .line 54
    iput v0, v2, Lcom/tencent/liteav/a/a$a;->i:I

    .line 55
    .line 56
    iget v0, p0, Lcom/tencent/liteav/c;->s:I

    .line 57
    .line 58
    iput v0, v2, Lcom/tencent/liteav/a/a$a;->j:I

    .line 59
    .line 60
    iget-object v0, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    .line 61
    .line 62
    const-string v1, ".mp4"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lcom/tencent/liteav/a/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, v2, Lcom/tencent/liteav/a/a$a;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    .line 71
    .line 72
    const-string v1, ".jpg"

    .line 73
    .line 74
    invoke-static {v0, v1}, Lcom/tencent/liteav/a/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, v2, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/a;->b()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, v2, Lcom/tencent/liteav/a/a$a;->e:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v1, "record config: "

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "TXCLivePlayer"

    .line 106
    .line 107
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v2
.end method

.method private m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/TXCRenderAndDec;->stop()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/TXCRenderAndDec;->setVideoRender(Lcom/tencent/liteav/renderer/e;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/TXCRenderAndDec;->setDecListener(Lcom/tencent/liteav/TXCRenderAndDec$a;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/TXCRenderAndDec;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private n()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/tencent/liteav/c;->F:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x5

    .line 7
    if-ne v1, v3, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 13
    .line 14
    .line 15
    iget-boolean v4, v0, Lcom/tencent/liteav/c;->G:Z

    .line 16
    .line 17
    const/16 v5, 0x12c

    .line 18
    .line 19
    invoke-static {v4, v5}, Lcom/tencent/liteav/audio/TXCAudioEngine;->enableAudioVolumeEvaluation(ZI)Z

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, Lcom/tencent/liteav/c;->K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    .line 23
    .line 24
    invoke-virtual {v0, v4}, Lcom/tencent/liteav/c;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;)V

    .line 25
    .line 26
    .line 27
    iget v4, v0, Lcom/tencent/liteav/c;->F:I

    .line 28
    .line 29
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 30
    .line 31
    if-ne v4, v3, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v7, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, v0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    .line 40
    .line 41
    iget-boolean v3, v3, Lcom/tencent/liteav/d;->g:Z

    .line 42
    .line 43
    xor-int/lit8 v8, v3, 0x1

    .line 44
    .line 45
    sget v2, Lcom/tencent/liteav/basic/a/a;->b:F

    .line 46
    .line 47
    mul-float v3, v2, v5

    .line 48
    .line 49
    float-to-int v9, v3

    .line 50
    mul-float/2addr v2, v5

    .line 51
    float-to-int v10, v2

    .line 52
    sget v2, Lcom/tencent/liteav/basic/a/a;->c:F

    .line 53
    .line 54
    mul-float/2addr v2, v5

    .line 55
    float-to-int v11, v2

    .line 56
    invoke-virtual/range {v6 .. v11}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setRemoteAudioCacheParams(Ljava/lang/String;ZIII)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    iget-object v13, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v3, v0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    .line 67
    .line 68
    iget-boolean v4, v3, Lcom/tencent/liteav/d;->g:Z

    .line 69
    .line 70
    xor-int/lit8 v14, v4, 0x1

    .line 71
    .line 72
    iget v2, v3, Lcom/tencent/liteav/d;->a:F

    .line 73
    .line 74
    mul-float/2addr v2, v5

    .line 75
    float-to-int v15, v2

    .line 76
    iget v2, v3, Lcom/tencent/liteav/d;->c:F

    .line 77
    .line 78
    mul-float/2addr v2, v5

    .line 79
    float-to-int v2, v2

    .line 80
    iget v3, v3, Lcom/tencent/liteav/d;->b:F

    .line 81
    .line 82
    mul-float/2addr v3, v5

    .line 83
    float-to-int v3, v3

    .line 84
    move/from16 v16, v2

    .line 85
    .line 86
    move/from16 v17, v3

    .line 87
    .line 88
    invoke-virtual/range {v12 .. v17}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setRemoteAudioCacheParams(Ljava/lang/String;ZIII)V

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v3, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 96
    .line 97
    iget-boolean v4, v0, Lcom/tencent/liteav/c;->j:Z

    .line 98
    .line 99
    invoke-virtual {v2, v3, v4}, Lcom/tencent/liteav/audio/TXCAudioEngine;->muteRemoteAudio(Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v3, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 107
    .line 108
    iget-boolean v4, v0, Lcom/tencent/liteav/c;->k:Z

    .line 109
    .line 110
    invoke-virtual {v2, v3, v4}, Lcom/tencent/liteav/audio/TXCAudioEngine;->muteRemoteAudioInSpeaker(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v3, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 118
    .line 119
    iget v4, v0, Lcom/tencent/liteav/c;->l:I

    .line 120
    .line 121
    invoke-virtual {v2, v3, v4}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setRemotePlayoutVolume(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-object v3, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v2, v3, v0}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setRemoteAudioStreamEventListener(Ljava/lang/String;Lcom/tencent/liteav/audio/c;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v0}, Lcom/tencent/liteav/c;->y()V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget-object v3, v0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v2, v3, v1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->startRemoteAudio(Ljava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method private o()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setRemoteAudioStreamEventListener(Ljava/lang/String;Lcom/tencent/liteav/audio/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setSetAudioEngineRemoteStreamDataListener(Ljava/lang/String;Lcom/tencent/liteav/audio/d;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->stopRemoteAudio(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setListener(Lcom/tencent/liteav/network/h;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/network/TXCStreamDownloader;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->stop()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private r()V
    .locals 3

    .line 1
    new-instance v0, Lcom/tencent/liteav/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/tencent/liteav/b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/liteav/c;->E:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 16
    .line 17
    iget v1, p0, Lcom/tencent/liteav/c;->F:I

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/b;->a(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/b;->d(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/tencent/liteav/network/TXCStreamDownloader;->getRTMPProxyUserId()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/b;->e(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/tencent/liteav/b;->a()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/b;->b()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private t()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->M:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/tencent/liteav/c;->y()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private u()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/c;->N:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const-wide/16 v1, 0x3e8

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-wide v3, p0, Lcom/tencent/liteav/c;->N:J

    .line 17
    .line 18
    div-long/2addr v3, v1

    .line 19
    long-to-int v3, v3

    .line 20
    const-string v4, "EVT_PLAY_PROGRESS"

    .line 21
    .line 22
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    iget-wide v3, p0, Lcom/tencent/liteav/c;->N:J

    .line 26
    .line 27
    long-to-int v3, v3

    .line 28
    const-string v4, "EVT_PLAY_PROGRESS_MS"

    .line 29
    .line 30
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    const/16 v3, 0x7d5

    .line 34
    .line 35
    invoke-virtual {p0, v3, v0}, Lcom/tencent/liteav/c;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-boolean v3, p0, Lcom/tencent/liteav/c;->M:Z

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    new-instance v3, Lcom/tencent/liteav/c$4;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/tencent/liteav/c$4;-><init>(Lcom/tencent/liteav/c;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method private v()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/c;->P:Lcom/tencent/liteav/c$a;

    .line 6
    .line 7
    const-wide/16 v2, 0x7d0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/c;->P:Lcom/tencent/liteav/c$a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private x()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    const-string v1, "18446744073709551615"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/tencent/liteav/a;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private y()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/c;->K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->M:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setSetAudioEngineRemoteStreamDataListener(Ljava/lang/String;Lcom/tencent/liteav/audio/d;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->t:Z

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/c;->K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->M:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setSetAudioEngineRemoteStreamDataListener(Ljava/lang/String;Lcom/tencent/liteav/audio/d;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method


# virtual methods
.method public a(I[F)I
    .locals 7

    .line 96
    iget-object p2, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    .line 97
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->t:Z

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/tencent/liteav/c;->A:Lcom/tencent/liteav/renderer/h;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/h;->d(I)I

    move-result v2

    .line 99
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    invoke-virtual {p2, v2, v0, v1}, Lcom/tencent/liteav/a/a;->a(IJ)V

    .line 100
    iget-object v1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    iget v3, p0, Lcom/tencent/liteav/c;->y:I

    iget v4, p0, Lcom/tencent/liteav/c;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/tencent/liteav/renderer/a;->a(IIIZI)V

    .line 101
    :cond_0
    iget-boolean p2, p0, Lcom/tencent/liteav/c;->t:Z

    if-eqz p2, :cond_1

    .line 102
    invoke-direct {p0}, Lcom/tencent/liteav/c;->j()V

    return p1

    .line 103
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/c;->k()V

    return p1
.end method

.method public a(Ljava/lang/String;)I
    .locals 4

    .line 66
    invoke-virtual {p0}, Lcom/tencent/liteav/c;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    if-eqz v0, :cond_2

    .line 67
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXCStreamDownloader;->switchStream(Ljava/lang/String;)Z

    move-result v0

    .line 68
    iget-object v1, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    if-eqz v1, :cond_0

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " stream_switch video cache "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    invoke-virtual {v2}, Lcom/tencent/liteav/TXCRenderAndDec;->getVideoCacheDuration()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " audio cache "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    const/16 v3, 0x7d7

    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TXCLivePlayer"

    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 70
    iput-object p1, p0, Lcom/tencent/liteav/c;->E:Ljava/lang/String;

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, -0x2

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public a(Ljava/lang/String;I)I
    .locals 4

    .line 20
    invoke-virtual {p0}, Lcom/tencent/liteav/c;->c()Z

    move-result v0

    const-string v1, "TXCLivePlayer"

    if-eqz v0, :cond_0

    .line 21
    const-string p1, "play: ignore start play when is playing"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x2

    return p1

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    if-eqz v0, :cond_1

    iget v2, v0, Lcom/tencent/liteav/d;->c:F

    iget v3, v0, Lcom/tencent/liteav/d;->b:F

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "play: can not start play while invalid cache config [minAutoAdjustCacheTime("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget p2, p2, Lcom/tencent/liteav/d;->c:F

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ") > maxAutoAdjustCacheTime("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget p2, p2, Lcom/tencent/liteav/d;->b:F

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ")]!!!!!!"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1

    .line 24
    :cond_1
    iget v2, v0, Lcom/tencent/liteav/d;->a:F

    iget v3, v0, Lcom/tencent/liteav/d;->b:F

    cmpl-float v3, v2, v3

    if-gtz v3, :cond_2

    iget v0, v0, Lcom/tencent/liteav/d;->c:F

    cmpg-float v0, v2, v0

    if-gez v0, :cond_3

    .line 25
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "play: invalid cacheTime "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v2, v2, Lcom/tencent/liteav/d;->a:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", need between minAutoAdjustCacheTime "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v2, v2, Lcom/tencent/liteav/d;->c:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " and maxAutoAdjustCacheTime "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v2, v2, Lcom/tencent/liteav/d;->b:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " , fix to maxAutoAdjustCacheTime"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    iget v1, v0, Lcom/tencent/liteav/d;->b:F

    iput v1, v0, Lcom/tencent/liteav/d;->a:F

    .line 27
    :cond_3
    iput-object p1, p0, Lcom/tencent/liteav/c;->E:Ljava/lang/String;

    .line 28
    iput p2, p0, Lcom/tencent/liteav/c;->F:I

    .line 29
    invoke-direct {p0, p1}, Lcom/tencent/liteav/c;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->o:Z

    .line 31
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->u:Z

    .line 32
    invoke-direct {p0, p2}, Lcom/tencent/liteav/c;->f(I)V

    .line 33
    invoke-direct {p0}, Lcom/tencent/liteav/c;->n()V

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/c;->c(Ljava/lang/String;I)I

    move-result p1

    if-eqz p1, :cond_4

    const/4 p2, 0x0

    .line 35
    iput-boolean p2, p0, Lcom/tencent/liteav/c;->o:Z

    .line 36
    invoke-direct {p0}, Lcom/tencent/liteav/c;->p()V

    .line 37
    invoke-direct {p0}, Lcom/tencent/liteav/c;->m()V

    .line 38
    invoke-direct {p0}, Lcom/tencent/liteav/c;->o()V

    .line 39
    iget-object p2, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    if-eqz p2, :cond_6

    const/16 v0, 0x8

    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    return p1

    .line 41
    :cond_4
    iget-object p2, p0, Lcom/tencent/liteav/c;->p:Landroid/view/Surface;

    invoke-virtual {p0, p2}, Lcom/tencent/liteav/c;->a(Landroid/view/Surface;)V

    .line 42
    invoke-direct {p0}, Lcom/tencent/liteav/c;->r()V

    .line 43
    invoke-direct {p0}, Lcom/tencent/liteav/c;->v()V

    .line 44
    iget-object p2, p0, Lcom/tencent/liteav/c;->H:Lcom/tencent/liteav/basic/a/b;

    sget-object v0, Lcom/tencent/liteav/basic/a/b;->c:Lcom/tencent/liteav/basic/a/b;

    if-ne p2, v0, :cond_5

    iget-object p2, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    if-nez p2, :cond_5

    .line 45
    iget-object p2, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz p2, :cond_5

    .line 46
    iget-object v0, p0, Lcom/tencent/liteav/c;->I:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lcom/tencent/liteav/renderer/a;->c(Ljava/lang/Object;)V

    .line 47
    :cond_5
    iget-object p2, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    sget v0, Lcom/tencent/liteav/basic/datareport/a;->bt:I

    invoke-static {p2, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V

    .line 48
    :try_start_0
    const-string p2, "com.tencent.liteav.demo.play.SuperPlayerView"

    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    iget-object p2, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    sget v0, Lcom/tencent/liteav/basic/datareport/a;->bE:I

    invoke-static {p2, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    return p1
.end method

.method public a(Z)I
    .locals 2

    .line 50
    invoke-virtual {p0}, Lcom/tencent/liteav/c;->c()Z

    move-result v0

    const-string v1, "TXCLivePlayer"

    if-nez v0, :cond_0

    .line 51
    const-string p1, "play: ignore stop play when not started"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x2

    return p1

    .line 52
    :cond_0
    const-string v0, "play: stop"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->o:Z

    .line 54
    invoke-direct {p0}, Lcom/tencent/liteav/c;->p()V

    .line 55
    invoke-direct {p0}, Lcom/tencent/liteav/c;->m()V

    .line 56
    iget-object v1, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    const/16 p1, 0x8

    .line 57
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz p1, :cond_2

    const/4 v1, 0x0

    .line 59
    invoke-virtual {p1, v1}, Lcom/tencent/liteav/renderer/e;->a(Landroid/view/Surface;)V

    .line 60
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz p1, :cond_3

    .line 61
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/a;->e()V

    .line 62
    :cond_3
    invoke-direct {p0}, Lcom/tencent/liteav/c;->o()V

    .line 63
    invoke-direct {p0}, Lcom/tencent/liteav/c;->s()V

    .line 64
    invoke-direct {p0}, Lcom/tencent/liteav/c;->w()V

    .line 65
    invoke-direct {p0}, Lcom/tencent/liteav/c;->t()V

    return v0
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/c;->a(Z)I

    return-void
.end method

.method public a(I)V
    .locals 1

    .line 72
    iput p1, p0, Lcom/tencent/liteav/c;->n:I

    .line 73
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/TXCRenderAndDec;->setRenderMode(I)V

    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz v0, :cond_0

    .line 16
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/renderer/e;->c(II)V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;I)V
    .locals 0

    .line 75
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    invoke-static {p2}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setAudioRoute(I)V

    return-void
.end method

.method public a(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/tencent/liteav/c;->k()V

    .line 105
    invoke-virtual {p0}, Lcom/tencent/liteav/c;->e()I

    return-void
.end method

.method public a(Landroid/view/Surface;)V
    .locals 1

    .line 12
    iput-object p1, p0, Lcom/tencent/liteav/c;->p:Landroid/view/Surface;

    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->a(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/c/k;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/basic/c/k;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/liteav/d;)V
    .locals 1

    .line 17
    invoke-super {p0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/d;)V

    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    if-eqz v0, :cond_0

    .line 19
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/TXCRenderAndDec;->setConfig(Lcom/tencent/liteav/d;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;Ljava/lang/Object;)V
    .locals 1

    .line 79
    iput-object p2, p0, Lcom/tencent/liteav/c;->H:Lcom/tencent/liteav/basic/a/b;

    .line 80
    iput-object p3, p0, Lcom/tencent/liteav/c;->I:Ljava/lang/Object;

    .line 81
    invoke-virtual {p0}, Lcom/tencent/liteav/c;->c()Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/tencent/liteav/c;->H:Lcom/tencent/liteav/basic/a/b;

    sget-object v0, Lcom/tencent/liteav/basic/a/b;->c:Lcom/tencent/liteav/basic/a/b;

    if-ne p3, v0, :cond_0

    iget-object p3, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    if-nez p3, :cond_0

    if-eqz p1, :cond_0

    .line 82
    iget-object p3, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz p3, :cond_0

    .line 83
    iget-object v0, p0, Lcom/tencent/liteav/c;->I:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Lcom/tencent/liteav/renderer/a;->c(Ljava/lang/Object;)V

    .line 84
    :cond_0
    iget-object p3, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    if-eqz p3, :cond_1

    .line 85
    invoke-virtual {p3, p1, p2}, Lcom/tencent/liteav/TXCRenderAndDec;->setVideoFrameListener(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;)V

    return-void

    .line 86
    :cond_1
    const-string p1, "TXCLivePlayer"

    const-string p2, "setVideoFrameListener->enter with renderAndDec is empty"

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/tencent/liteav/c;->K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    .line 78
    invoke-direct {p0}, Lcom/tencent/liteav/c;->y()V

    return-void
.end method

.method public a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 5
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getVideoView()Landroid/view/TextureView;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    if-nez p1, :cond_1

    .line 8
    new-instance p1, Landroid/view/TextureView;

    iget-object v0, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    iget-object v0, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    invoke-virtual {p1, v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->addVideoView(Landroid/view/TextureView;)V

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    if-eqz p1, :cond_3

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/renderer/e;->a(Landroid/view/TextureView;)V

    :cond_3
    return-void
.end method

.method public a(Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/tencent/liteav/c;->w:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    .line 118
    invoke-virtual {p0, p2, p1}, Lcom/tencent/liteav/c;->onNotifyEvent(ILandroid/os/Bundle;)V

    return-void
.end method

.method public a(Ljava/lang/String;[BJII)V
    .locals 4

    .line 106
    iput p5, p0, Lcom/tencent/liteav/c;->r:I

    .line 107
    iput p6, p0, Lcom/tencent/liteav/c;->q:I

    .line 108
    iget-object p1, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_1

    cmp-long p1, p3, v0

    if-gtz p1, :cond_0

    .line 109
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide p3

    .line 110
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    invoke-virtual {p1, p2, p3, p4}, Lcom/tencent/liteav/a/a;->a([BJ)V

    .line 111
    :cond_1
    iget-wide v2, p0, Lcom/tencent/liteav/c;->O:J

    cmp-long p1, v2, v0

    if-gtz p1, :cond_2

    iget-object p1, p0, Lcom/tencent/liteav/c;->K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    if-eqz p1, :cond_2

    const/16 v2, 0x10

    .line 112
    invoke-interface {p1, p5, p6, v2}, Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;->onAudioInfoChanged(III)V

    .line 113
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/c;->K:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    if-eqz p1, :cond_3

    .line 114
    invoke-interface {p1, p2, p3, p4}, Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;->onPcmDataAvailable([BJ)V

    .line 115
    :cond_3
    iget-wide p1, p0, Lcom/tencent/liteav/c;->O:J

    cmp-long p5, p1, v0

    if-gtz p5, :cond_4

    .line 116
    iput-wide p3, p0, Lcom/tencent/liteav/c;->O:J

    return-void

    :cond_4
    sub-long/2addr p3, p1

    .line 117
    iput-wide p3, p0, Lcom/tencent/liteav/c;->N:J

    return-void
.end method

.method public a(ZI)V
    .locals 0

    .line 119
    iput-boolean p1, p0, Lcom/tencent/liteav/c;->G:Z

    .line 120
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    invoke-static {p1, p2}, Lcom/tencent/liteav/audio/TXCAudioEngine;->enableAudioVolumeEvaluation(ZI)Z

    return-void
.end method

.method public b()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/c;->E:Ljava/lang/String;

    iget v1, p0, Lcom/tencent/liteav/c;->F:I

    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/c;->a(Ljava/lang/String;I)I

    return-void
.end method

.method public b(I)V
    .locals 1

    .line 3
    iput p1, p0, Lcom/tencent/liteav/c;->m:I

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/TXCRenderAndDec;->setRenderRotation(I)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 0

    .line 17
    iget-boolean p1, p0, Lcom/tencent/liteav/c;->o:Z

    if-eqz p1, :cond_0

    .line 18
    iget-object p1, p0, Lcom/tencent/liteav/c;->g:Lcom/tencent/liteav/network/TXCStreamDownloader;

    if-eqz p1, :cond_0

    .line 19
    iget-object p2, p0, Lcom/tencent/liteav/c;->E:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/network/TXCStreamDownloader;->requestKeyFrame(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 6
    iput-boolean p1, p0, Lcom/tencent/liteav/c;->j:Z

    .line 7
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/tencent/liteav/c;->j:Z

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->muteRemoteAudio(Ljava/lang/String;Z)V

    return-void
.end method

.method public c(I)V
    .locals 2

    .line 5
    iput p1, p0, Lcom/tencent/liteav/c;->l:I

    .line 6
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    iget v1, p0, Lcom/tencent/liteav/c;->l:I

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->setRemotePlayoutVolume(Ljava/lang/String;I)V

    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 3
    iput-boolean p1, p0, Lcom/tencent/liteav/c;->k:Z

    .line 4
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->muteRemoteAudioInSpeaker(Ljava/lang/String;Z)V

    return-void
.end method

.method public c()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->o:Z

    return v0
.end method

.method public d(I)I
    .locals 1

    .line 2
    iget-boolean p1, p0, Lcom/tencent/liteav/c;->t:Z

    if-eqz p1, :cond_0

    .line 3
    const-string p1, "TXCLivePlayer"

    const-string v0, "startRecord: there is existing uncompleted record task"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/tencent/liteav/c;->t:Z

    .line 5
    iget-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/a;->a(Lcom/tencent/liteav/renderer/g;)V

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/a;->a(Lcom/tencent/liteav/renderer/a$a;)V

    .line 7
    invoke-direct {p0}, Lcom/tencent/liteav/c;->y()V

    .line 8
    iget-object p1, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    sget v0, Lcom/tencent/liteav/basic/datareport/a;->av:I

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V

    const/4 p1, 0x0

    return p1
.end method

.method public d()Landroid/view/TextureView;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/c;->i:Landroid/view/TextureView;

    return-object v0
.end method

.method public e()I
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->t:Z

    if-nez v0, :cond_0

    .line 3
    const-string v0, "TXCLivePlayer"

    const-string v1, "stopRecord: no recording task exist"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->t:Z

    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/c;->y()V

    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1}, Lcom/tencent/liteav/a/a;->a()V

    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    :cond_1
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public g()V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/tencent/liteav/c;->O:J

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->M:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->M:Z

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/tencent/liteav/c;->y()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v1, Lcom/tencent/liteav/c$3;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/tencent/liteav/c$3;-><init>(Lcom/tencent/liteav/c;)V

    .line 23
    .line 24
    .line 25
    const-wide/16 v2, 0x3e8

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public h()V
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/c;->x()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->a()[I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    aget v1, v0, v1

    .line 10
    .line 11
    div-int/lit8 v1, v1, 0xa

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget v0, v0, v2

    .line 15
    .line 16
    div-int/lit8 v0, v0, 0xa

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "/"

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "%"

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 44
    .line 45
    const/16 v2, 0x1bbe

    .line 46
    .line 47
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v2, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 52
    .line 53
    const/16 v3, 0x1bbd

    .line 54
    .line 55
    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v3, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 60
    .line 61
    const/16 v4, 0x1bc6

    .line 62
    .line 63
    invoke-static {v3, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v4, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 68
    .line 69
    const/16 v5, 0x1772

    .line 70
    .line 71
    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    double-to-int v4, v4

    .line 76
    new-instance v5, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v6, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 82
    .line 83
    if-eqz v6, :cond_0

    .line 84
    .line 85
    const-string v7, "VIDEO_WIDTH"

    .line 86
    .line 87
    invoke-virtual {v6}, Lcom/tencent/liteav/renderer/e;->i()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    iget-object v6, p0, Lcom/tencent/liteav/c;->f:Lcom/tencent/liteav/renderer/a;

    .line 95
    .line 96
    invoke-virtual {v6}, Lcom/tencent/liteav/renderer/e;->j()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const-string v7, "VIDEO_HEIGHT"

    .line 101
    .line 102
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    :cond_0
    iget-object v6, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 106
    .line 107
    if-eqz v6, :cond_2

    .line 108
    .line 109
    invoke-virtual {v6}, Lcom/tencent/liteav/TXCRenderAndDec;->getVideoCacheDuration()J

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    long-to-int v6, v6

    .line 114
    const-string v7, "VIDEO_CACHE"

    .line 115
    .line 116
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    iget-object v6, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 120
    .line 121
    invoke-virtual {v6}, Lcom/tencent/liteav/TXCRenderAndDec;->getVideoCacheFrameCount()J

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    long-to-int v6, v6

    .line 126
    const-string v7, "V_SUM_CACHE_SIZE"

    .line 127
    .line 128
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    iget-object v6, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 132
    .line 133
    invoke-virtual {v6}, Lcom/tencent/liteav/TXCRenderAndDec;->getVideoDecCacheFrameCount()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    const-string v7, "V_DEC_CACHE_SIZE"

    .line 138
    .line 139
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    iget-object v6, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 143
    .line 144
    invoke-virtual {v6}, Lcom/tencent/liteav/TXCRenderAndDec;->getAVPlayInterval()J

    .line 145
    .line 146
    .line 147
    move-result-wide v6

    .line 148
    long-to-int v6, v6

    .line 149
    const-string v7, "AV_PLAY_INTERVAL"

    .line 150
    .line 151
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 152
    .line 153
    .line 154
    iget-object v6, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 155
    .line 156
    invoke-virtual {v6}, Lcom/tencent/liteav/TXCRenderAndDec;->getAVNetRecvInterval()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    long-to-int v6, v6

    .line 161
    const-string v7, "AV_RECV_INTERVAL"

    .line 162
    .line 163
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 164
    .line 165
    .line 166
    if-nez v4, :cond_1

    .line 167
    .line 168
    const/16 v6, 0xf

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_1
    move v6, v4

    .line 172
    :goto_0
    iget-object v7, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 173
    .line 174
    const/16 v8, 0x1bd0

    .line 175
    .line 176
    invoke-static {v7, v8}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    mul-int/lit8 v7, v7, 0xa

    .line 181
    .line 182
    div-int/2addr v7, v6

    .line 183
    int-to-float v6, v7

    .line 184
    const/high16 v7, 0x41200000    # 10.0f

    .line 185
    .line 186
    div-float/2addr v6, v7

    .line 187
    float-to-double v6, v6

    .line 188
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 189
    .line 190
    add-double/2addr v6, v8

    .line 191
    double-to-int v6, v6

    .line 192
    const-string v7, "VIDEO_GOP"

    .line 193
    .line 194
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    :cond_2
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v6}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getPlayAECType()I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    iget-object v7, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 206
    .line 207
    const/16 v8, 0x7e3

    .line 208
    .line 209
    invoke-static {v7, v8}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    iget-object v8, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 214
    .line 215
    const/16 v9, 0x7e4

    .line 216
    .line 217
    invoke-static {v8, v9}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    invoke-virtual {v9}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getPlaySampleRate()I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    invoke-virtual {v10}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getPlayChannels()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    new-instance v11, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v6, " | "

    .line 246
    .line 247
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v7, ","

    .line 254
    .line 255
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    const-string v7, "AUDIO_PLAY_INFO"

    .line 278
    .line 279
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iget-object v6, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 283
    .line 284
    const/16 v7, 0x7d7

    .line 285
    .line 286
    invoke-static {v6, v7}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    const-string v7, "AUDIO_CACHE"

    .line 291
    .line 292
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 293
    .line 294
    .line 295
    iget-object v6, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 296
    .line 297
    const/16 v7, 0x7e2

    .line 298
    .line 299
    invoke-static {v6, v7}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    const-string v7, "NET_JITTER"

    .line 304
    .line 305
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 306
    .line 307
    .line 308
    iget-object v6, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 309
    .line 310
    const/16 v7, 0x7e5

    .line 311
    .line 312
    invoke-static {v6, v7}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    int-to-float v6, v6

    .line 317
    const/high16 v7, 0x447a0000    # 1000.0f

    .line 318
    .line 319
    div-float/2addr v6, v7

    .line 320
    const-string v7, "AUDIO_CACHE_THRESHOLD"

    .line 321
    .line 322
    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 323
    .line 324
    .line 325
    const-string v6, "NET_SPEED"

    .line 326
    .line 327
    add-int v7, v2, v1

    .line 328
    .line 329
    invoke-virtual {v5, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 330
    .line 331
    .line 332
    const-string v6, "VIDEO_FPS"

    .line 333
    .line 334
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 335
    .line 336
    .line 337
    const-string v4, "VIDEO_BITRATE"

    .line 338
    .line 339
    invoke-virtual {v5, v4, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 340
    .line 341
    .line 342
    const-string v2, "AUDIO_BITRATE"

    .line 343
    .line 344
    invoke-virtual {v5, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 345
    .line 346
    .line 347
    const-string v1, "SERVER_IP"

    .line 348
    .line 349
    invoke-virtual {v5, v1, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 350
    .line 351
    .line 352
    const-string v1, "CPU_USAGE"

    .line 353
    .line 354
    invoke-virtual {v5, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 355
    .line 356
    .line 357
    iget-object v0, p0, Lcom/tencent/liteav/i;->e:Ljava/lang/ref/WeakReference;

    .line 358
    .line 359
    const/16 v1, 0x3a99

    .line 360
    .line 361
    invoke-static {v0, v1, v5}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    .line 362
    .line 363
    .line 364
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 365
    .line 366
    if-eqz v0, :cond_3

    .line 367
    .line 368
    invoke-virtual {v0}, Lcom/tencent/liteav/TXCRenderAndDec;->updateLoadInfo()V

    .line 369
    .line 370
    .line 371
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/c;->x:Lcom/tencent/liteav/b;

    .line 372
    .line 373
    if-eqz v0, :cond_4

    .line 374
    .line 375
    invoke-virtual {v0}, Lcom/tencent/liteav/b;->d()V

    .line 376
    .line 377
    .line 378
    :cond_4
    return-void
.end method

.method public i()I
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getRemotePlayoutVolumeLevel(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public onNotifyEvent(ILandroid/os/Bundle;)V
    .locals 4

    .line 1
    const/16 v0, 0x7d3

    .line 2
    .line 3
    const-string v1, "Video play started"

    .line 4
    .line 5
    const/16 v2, 0x7d4

    .line 6
    .line 7
    const/16 v3, 0x7ea

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    if-ne v3, p1, :cond_2

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->u:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, v2, v1}, Lcom/tencent/liteav/c;->a(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/tencent/liteav/c;->u:Z

    .line 22
    .line 23
    :cond_1
    if-ne v3, p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/tencent/liteav/c;->L:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const/16 v0, 0x7f1

    .line 36
    .line 37
    invoke-static {p1, v0, p2}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    const/16 v0, 0x7e9

    .line 42
    .line 43
    if-ne v0, p1, :cond_3

    .line 44
    .line 45
    invoke-direct {p0, v2, v1}, Lcom/tencent/liteav/c;->a(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    const/16 v0, 0x7e7

    .line 50
    .line 51
    if-eq v0, p1, :cond_6

    .line 52
    .line 53
    const/16 v0, 0x7e8

    .line 54
    .line 55
    if-ne v0, p1, :cond_4

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/c;->h:Landroid/os/Handler;

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    new-instance v1, Lcom/tencent/liteav/c$6;

    .line 63
    .line 64
    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/liteav/c$6;-><init>(Lcom/tencent/liteav/c;ILandroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 68
    .line 69
    .line 70
    :cond_5
    return-void

    .line 71
    :cond_6
    :goto_0
    const/16 p1, 0x7d7

    .line 72
    .line 73
    const-string p2, "Video play loading"

    .line 74
    .line 75
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/c;->a(ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public onPullAudio(Lcom/tencent/liteav/basic/structs/a;)V
    .locals 0

    return-void
.end method

.method public onPullNAL(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/c;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/c;->a:Lcom/tencent/liteav/TXCRenderAndDec;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/TXCRenderAndDec;->decVideo(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    return-void

    .line 17
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "decode video failed."

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "TXCLivePlayer"

    .line 39
    .line 40
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onTextureProcess(IIII)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/tencent/liteav/c;->v:Lcom/tencent/liteav/a/a;

    .line 2
    .line 3
    iget-boolean p3, p0, Lcom/tencent/liteav/c;->t:Z

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p3, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget-object p4, p0, Lcom/tencent/liteav/c;->C:[F

    .line 14
    .line 15
    invoke-virtual {p3, p4}, Lcom/tencent/liteav/renderer/h;->a([F)V

    .line 16
    .line 17
    .line 18
    iget-object p3, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 19
    .line 20
    invoke-virtual {p3, p1}, Lcom/tencent/liteav/renderer/h;->d(I)I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-virtual {p2, p3, v0, v1}, Lcom/tencent/liteav/a/a;->a(IJ)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 32
    .line 33
    iget-object p3, p0, Lcom/tencent/liteav/c;->D:[F

    .line 34
    .line 35
    invoke-virtual {p2, p3}, Lcom/tencent/liteav/renderer/h;->a([F)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p0, Lcom/tencent/liteav/c;->B:Lcom/tencent/liteav/renderer/h;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Lcom/tencent/liteav/renderer/h;->c(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-boolean p1, p0, Lcom/tencent/liteav/c;->t:Z

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-direct {p0}, Lcom/tencent/liteav/c;->j()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/c;->k()V

    .line 52
    .line 53
    .line 54
    return-void
.end method
