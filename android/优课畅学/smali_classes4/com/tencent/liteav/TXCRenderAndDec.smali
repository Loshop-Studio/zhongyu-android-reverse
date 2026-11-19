.class public Lcom/tencent/liteav/TXCRenderAndDec;
.super Lcom/tencent/liteav/basic/module/a;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/b/b;
.implements Lcom/tencent/liteav/renderer/a$a;
.implements Lcom/tencent/liteav/renderer/f;
.implements Lcom/tencent/liteav/videodecoder/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/TXCRenderAndDec$a;,
        Lcom/tencent/liteav/TXCRenderAndDec$b;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "TXCRenderAndDec"


# instance fields
.field private mConfig:Lcom/tencent/liteav/d;

.field private mContext:Landroid/content/Context;

.field private mDecListener:Lcom/tencent/liteav/TXCRenderAndDec$a;

.field private mEnableDecoderChange:Z

.field private mEnableLimitHWDecCache:Z

.field private mEnableRestartDecoder:Z

.field private mFirstRender:Z

.field private mFrameDecErrCnt:J

.field private mIsRendering:Z

.field private mLastRenderCalculateTS:J

.field private mLastRenderFrameCount:J

.field private mLastReqKeyFrameTS:J

.field private mNotifyListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private mRealTime:Z

.field private mRenderAndDecDelegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/TXCRenderAndDec$b;",
            ">;"
        }
    .end annotation
.end field

.field private mRenderFrameCount:J

.field private mRenderMode:I

.field private mRenderRotation:I

.field private mStreamType:I

.field private mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

.field private mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

.field private mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

.field private mVideoFrameListener:Lcom/tencent/liteav/j;

.field private mVideoRender:Lcom/tencent/liteav/renderer/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/basic/module/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableLimitHWDecCache:Z

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 13
    .line 14
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableDecoderChange:Z

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableRestartDecoder:Z

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 21
    .line 22
    sget-object v2, Lcom/tencent/liteav/basic/a/b;->a:Lcom/tencent/liteav/basic/a/b;

    .line 23
    .line 24
    iput-object v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mIsRendering:Z

    .line 29
    .line 30
    iput v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    iput-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFrameDecErrCnt:J

    .line 35
    .line 36
    iput-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastReqKeyFrameTS:J

    .line 37
    .line 38
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFirstRender:Z

    .line 39
    .line 40
    iput v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderMode:I

    .line 41
    .line 42
    iput v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderRotation:I

    .line 43
    .line 44
    iput-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderCalculateTS:J

    .line 45
    .line 46
    iput-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderFrameCount:J

    .line 47
    .line 48
    iput-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderFrameCount:J

    .line 49
    .line 50
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mDecListener:Lcom/tencent/liteav/TXCRenderAndDec$a;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mContext:Landroid/content/Context;

    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mContext:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/basic/d/c;->a(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic access$000(Lcom/tencent/liteav/TXCRenderAndDec;)Lcom/tencent/liteav/basic/c/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/tencent/liteav/TXCRenderAndDec;)Lcom/tencent/liteav/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameListener:Lcom/tencent/liteav/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/tencent/liteav/TXCRenderAndDec;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderRotation:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lcom/tencent/liteav/TXCRenderAndDec;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 2
    .line 3
    return p0
.end method

.method private notifyEvent(ILjava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "EVT_USERID"

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "EVT_ID"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-string v1, "EVT_TIME"

    .line 21
    .line 22
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    const-string v1, "EVT_MSG"

    .line 32
    .line 33
    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    const-string p2, "EVT_STREAM_TYPE"

    .line 37
    .line 38
    iget v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 39
    .line 40
    invoke-virtual {v0, p2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-static {p2, p1, v0}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private requestKeyFrame()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastReqKeyFrameTS:J

    .line 6
    .line 7
    const-wide/16 v4, 0xbb8

    .line 8
    .line 9
    add-long/2addr v2, v4

    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastReqKeyFrameTS:J

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "requestKeyFrame: "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "TXCRenderAndDec"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderAndDecDelegate:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/tencent/liteav/TXCRenderAndDec$b;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 59
    .line 60
    invoke-interface {v0, v1, v2}, Lcom/tencent/liteav/TXCRenderAndDec$b;->b(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method private startDecode()V
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/e;->a()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-direct {p0, v0}, Lcom/tencent/liteav/TXCRenderAndDec;->startDecode(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method private startDecode(Landroid/graphics/SurfaceTexture;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->stop()V

    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    iget-boolean v1, v1, Lcom/tencent/liteav/d;->h:Z

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableHWDec(Z)V

    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    iget-object v1, v1, Lcom/tencent/liteav/d;->y:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->config(Lorg/json/JSONArray;)V

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trtc_ start decode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", hw: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    iget-boolean v2, v2, Lcom/tencent/liteav/d;->h:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TXCRenderAndDec"

    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 6
    iget-boolean v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, p1, v1, v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setup(Landroid/graphics/SurfaceTexture;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I

    .line 7
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setUserId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->start()I

    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    iget-boolean p1, p1, Lcom/tencent/liteav/d;->h:Z

    if-nez p1, :cond_1

    .line 10
    iget-boolean p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, v1, v1, v1, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setup(Landroid/view/Surface;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I

    .line 11
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setUserId(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->start()I

    :cond_1
    return-void
.end method

.method private switchToSoftDecoder()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "TXCRenderAndDec"

    .line 6
    .line 7
    const-string v2, "switch to soft decoder when hw error"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->stop()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, v1, Lcom/tencent/liteav/d;->h:Z

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableChange(Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->startDecode()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public decVideo(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 0

    return-void
.end method

.method public enableDecoderChange(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableDecoderChange:Z

    .line 2
    .line 3
    return-void
.end method

.method public enableLimitDecCache(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableLimitHWDecCache:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableLimitDecCache(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public enableRestartDecoder(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableRestartDecoder:Z

    .line 2
    .line 3
    return-void
.end method

.method public getAVNetRecvInterval()J
    .locals 2

    .line 1
    const/16 v0, 0x177e

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/module/a;->getLongValue(II)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
.end method

.method public getAVPlayInterval()J
    .locals 2

    .line 1
    const/16 v0, 0x177d

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/module/a;->getLongValue(II)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
.end method

.method public getConfig()Lcom/tencent/liteav/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStreamType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 2
    .line 3
    return v0
.end method

.method public getVideoCacheDuration()J
    .locals 2

    .line 1
    const/16 v0, 0x177a

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/module/a;->getIntValue(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-long v0, v0

    .line 9
    return-wide v0
.end method

.method public getVideoCacheFrameCount()J
    .locals 2

    .line 1
    const/16 v0, 0x177b

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/module/a;->getIntValue(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-long v0, v0

    .line 9
    return-wide v0
.end method

.method public getVideoDecCacheFrameCount()I
    .locals 2

    .line 1
    const/16 v0, 0x177c

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/module/a;->getIntValue(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public getVideoGop()I
    .locals 1

    .line 1
    const/16 v0, 0x1bd0

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/basic/module/a;->getIntValue(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getVideoRender()Lcom/tencent/liteav/renderer/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRendering()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mIsRendering:Z

    .line 2
    .line 3
    return v0
.end method

.method public muteVideo(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/e;->m()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public onDecodeFailed(I)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "video decode failed "

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
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "TXCRenderAndDec"

    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->requestKeyFrame()V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 27
    .line 28
    iget-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFrameDecErrCnt:J

    .line 29
    .line 30
    const-wide/16 v2, 0x1

    .line 31
    .line 32
    add-long/2addr v0, v2

    .line 33
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFrameDecErrCnt:J

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/16 v1, 0x4276

    .line 40
    .line 41
    invoke-virtual {p0, v1, p1, v0}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public onDecodeFrame(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;IIJJI)V
    .locals 13

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-ne v0, v2, :cond_1

    .line 13
    .line 14
    :cond_0
    mul-int/lit8 v0, v0, 0x5a

    .line 15
    .line 16
    rsub-int v0, v0, 0x168

    .line 17
    .line 18
    :cond_1
    iget-object v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameListener:Lcom/tencent/liteav/j;

    .line 19
    .line 20
    if-eqz v2, :cond_5

    .line 21
    .line 22
    if-eqz p1, :cond_5

    .line 23
    .line 24
    iget-object v3, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

    .line 25
    .line 26
    sget-object v4, Lcom/tencent/liteav/basic/a/b;->b:Lcom/tencent/liteav/basic/a/b;

    .line 27
    .line 28
    if-eq v3, v4, :cond_2

    .line 29
    .line 30
    sget-object v4, Lcom/tencent/liteav/basic/a/b;->e:Lcom/tencent/liteav/basic/a/b;

    .line 31
    .line 32
    if-ne v3, v4, :cond_5

    .line 33
    .line 34
    :cond_2
    iget-object v3, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->clone()Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move-object v3, p1

    .line 44
    :goto_0
    iget v4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderRotation:I

    .line 45
    .line 46
    add-int/2addr v4, v0

    .line 47
    rem-int/lit16 v4, v4, 0x168

    .line 48
    .line 49
    iput v4, v3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->rotation:I

    .line 50
    .line 51
    iget-object v4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

    .line 52
    .line 53
    sget-object v5, Lcom/tencent/liteav/basic/a/b;->e:Lcom/tencent/liteav/basic/a/b;

    .line 54
    .line 55
    if-ne v4, v5, :cond_4

    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->loadNV21BufferFromI420Buffer()V

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget v5, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 65
    .line 66
    invoke-interface {v2, v4, v5, v3}, Lcom/tencent/liteav/j;->a(Ljava/lang/String;ILcom/tencent/liteav/basic/structs/TXSVideoFrame;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    iget-boolean v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFirstRender:Z

    .line 70
    .line 71
    const-wide/16 v3, 0x0

    .line 72
    .line 73
    if-nez v2, :cond_7

    .line 74
    .line 75
    iput-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFirstRender:Z

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const-string v11, ""

    .line 82
    .line 83
    iget v12, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 84
    .line 85
    const/16 v6, 0x138f

    .line 86
    .line 87
    const-wide/16 v7, -0x1

    .line 88
    .line 89
    const-wide/16 v9, -0x1

    .line 90
    .line 91
    invoke-static/range {v5 .. v12}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 95
    .line 96
    if-nez v1, :cond_6

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const v2, 0x9c56

    .line 103
    .line 104
    .line 105
    iget v5, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 106
    .line 107
    invoke-static {v1, v2, v3, v4, v5}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 108
    .line 109
    .line 110
    :cond_6
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 111
    .line 112
    if-eqz v1, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->GetDecodeFirstFrameTS()J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    iget v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 125
    .line 126
    const v7, 0x9c5d

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v7, v5, v6, v2}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 130
    .line 131
    .line 132
    :cond_7
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 133
    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    move/from16 v5, p3

    .line 137
    .line 138
    invoke-virtual {v1, p1, p2, v5, v0}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;III)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    iget-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderCalculateTS:J

    .line 143
    .line 144
    cmp-long p1, v0, v3

    .line 145
    .line 146
    if-nez p1, :cond_9

    .line 147
    .line 148
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderCalculateTS:J

    .line 153
    .line 154
    iput-wide v3, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderFrameCount:J

    .line 155
    .line 156
    iput-wide v3, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderFrameCount:J

    .line 157
    .line 158
    return-void

    .line 159
    :cond_9
    iget-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderFrameCount:J

    .line 160
    .line 161
    const-wide/16 v2, 0x1

    .line 162
    .line 163
    add-long/2addr v0, v2

    .line 164
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderFrameCount:J

    .line 165
    .line 166
    return-void
.end method

.method public onNotifyEvent(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    const/16 v0, 0x83a

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->switchToSoftDecoder()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v0, 0x7e4

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    const-string p1, "TXCRenderAndDec"

    .line 14
    .line 15
    const-string p2, "decoding too many frame(>40) without output! request key frame now."

    .line 16
    .line 17
    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->requestKeyFrame()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    const-string v0, "EVT_STREAM_TYPE"

    .line 25
    .line 26
    iget v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 27
    .line 28
    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-static {v0, p1, p2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "play decode when surface texture create hw "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 12
    .line 13
    iget-boolean v1, v1, Lcom/tencent/liteav/d;->h:Z

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "TXCRenderAndDec"

    .line 23
    .line 24
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-boolean v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    .line 32
    .line 33
    xor-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, p1, v2, v2, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setup(Landroid/graphics/SurfaceTexture;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 40
    .line 41
    iget-boolean v0, v0, Lcom/tencent/liteav/d;->h:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lcom/tencent/liteav/TXCRenderAndDec;->startDecode(Landroid/graphics/SurfaceTexture;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public onSurfaceTextureDestroy(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    .line 1
    const-string v0, "TXCRenderAndDec"

    .line 2
    .line 3
    :try_start_0
    const-string v1, "play:stop decode when surface texture release"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 9
    .line 10
    iget-boolean v1, v1, Lcom/tencent/liteav/d;->h:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->stop()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/c/f;->d()V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mDecListener:Lcom/tencent/liteav/TXCRenderAndDec$a;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {v1, p1}, Lcom/tencent/liteav/TXCRenderAndDec$a;->a(Landroid/graphics/SurfaceTexture;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void

    .line 42
    :goto_1
    const-string v1, "onSurfaceTextureDestroy failed."

    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public onTextureProcess(IIII)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameListener:Lcom/tencent/liteav/j;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

    .line 6
    .line 7
    sget-object v2, Lcom/tencent/liteav/basic/a/b;->c:Lcom/tencent/liteav/basic/a/b;

    .line 8
    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    new-instance v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;-><init>()V

    .line 14
    .line 15
    .line 16
    iput p2, v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 17
    .line 18
    iput p3, v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    iput-wide p2, v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->pts:J

    .line 25
    .line 26
    iget p2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderRotation:I

    .line 27
    .line 28
    add-int/2addr p4, p2

    .line 29
    rem-int/lit16 p4, p4, 0x168

    .line 30
    .line 31
    iput p4, v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->rotation:I

    .line 32
    .line 33
    iput p1, v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->textureId:I

    .line 34
    .line 35
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 36
    .line 37
    instance-of p2, p1, Lcom/tencent/liteav/renderer/a;

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    check-cast p1, Lcom/tencent/liteav/renderer/a;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/a;->b()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, v1, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->eglContext:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget p2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 54
    .line 55
    invoke-interface {v0, p1, p2, v1}, Lcom/tencent/liteav/j;->a(Ljava/lang/String;ILcom/tencent/liteav/basic/structs/TXSVideoFrame;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->isHardwareDecode()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 71
    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

    .line 75
    .line 76
    sget-object v1, Lcom/tencent/liteav/basic/a/b;->e:Lcom/tencent/liteav/basic/a/b;

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    if-ne v0, v1, :cond_3

    .line 80
    .line 81
    new-instance v0, Lcom/tencent/liteav/beauty/a/a;

    .line 82
    .line 83
    const/4 v1, 0x3

    .line 84
    invoke-direct {v0, v1}, Lcom/tencent/liteav/beauty/a/a;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    new-instance v0, Lcom/tencent/liteav/beauty/a/a;

    .line 91
    .line 92
    invoke-direct {v0, v2}, Lcom/tencent/liteav/beauty/a/a;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 96
    .line 97
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Lcom/tencent/liteav/basic/c/f;->a(Z)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/f;->a()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 111
    .line 112
    invoke-virtual {v0, p2, p3}, Lcom/tencent/liteav/basic/c/f;->a(II)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 116
    .line 117
    new-instance v1, Lcom/tencent/liteav/TXCRenderAndDec$1;

    .line 118
    .line 119
    invoke-direct {v1, p0, p4}, Lcom/tencent/liteav/TXCRenderAndDec$1;-><init>(Lcom/tencent/liteav/TXCRenderAndDec;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/c/f;->a(Lcom/tencent/liteav/basic/c/f$a;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const-string p4, "TXCRenderAndDec"

    .line 127
    .line 128
    const-string v0, "throwVideoFrame->release mVideoFrameFilter"

    .line 129
    .line 130
    invoke-static {p4, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/4 p4, 0x0

    .line 134
    iput-object p4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 135
    .line 136
    :cond_5
    :goto_1
    iget-object p4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 137
    .line 138
    if-eqz p4, :cond_6

    .line 139
    .line 140
    const/4 p4, 0x0

    .line 141
    invoke-static {p4, p4, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 142
    .line 143
    .line 144
    iget-object p4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 145
    .line 146
    invoke-virtual {p4, p2, p3}, Lcom/tencent/liteav/basic/c/f;->a(II)V

    .line 147
    .line 148
    .line 149
    iget-object p2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFilter:Lcom/tencent/liteav/basic/c/f;

    .line 150
    .line 151
    invoke-virtual {p2, p1}, Lcom/tencent/liteav/basic/c/f;->b(I)I

    .line 152
    .line 153
    .line 154
    :cond_6
    :goto_2
    return-void
.end method

.method public onVideoSizeChange(II)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/renderer/e;->b(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "Resolution changed to"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "x"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "EVT_MSG"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    const-string v1, "EVT_PARAM1"

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    const-string v1, "EVT_PARAM2"

    .line 49
    .line 50
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    const-string v1, "EVT_USERID"

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "EVT_TIME"

    .line 63
    .line 64
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 69
    .line 70
    .line 71
    const/16 v1, 0x7d9

    .line 72
    .line 73
    invoke-virtual {p0, v1, v0}, Lcom/tencent/liteav/TXCRenderAndDec;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 77
    .line 78
    shl-int/lit8 v1, p1, 0x10

    .line 79
    .line 80
    or-int/2addr v1, p2

    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const/16 v2, 0x138b

    .line 86
    .line 87
    invoke-virtual {p0, v2, v0, v1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    int-to-long v5, p1

    .line 95
    int-to-long v7, p2

    .line 96
    const-string v9, ""

    .line 97
    .line 98
    iget v10, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 99
    .line 100
    const/16 v4, 0xfa3

    .line 101
    .line 102
    invoke-static/range {v3 .. v10}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const p2, 0x9c42

    .line 110
    .line 111
    .line 112
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 113
    .line 114
    invoke-static {p1, p2, v5, v6, v0}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const p2, 0x9c43

    .line 122
    .line 123
    .line 124
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 125
    .line 126
    invoke-static {p1, p2, v7, v8, v0}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public restartDecoder()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->isHevc()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->restart(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setBlockInterval(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->e(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setConfig(Lcom/tencent/liteav/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p1, p1, Lcom/tencent/liteav/d;->d:I

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->b(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setDecListener(Lcom/tencent/liteav/TXCRenderAndDec$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mDecListener:Lcom/tencent/liteav/TXCRenderAndDec$a;

    .line 2
    .line 3
    return-void
.end method

.method public setID(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setUserId(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public setRenderAndDecDelegate(Lcom/tencent/liteav/TXCRenderAndDec$b;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderAndDecDelegate:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public setRenderMode(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderMode:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->c(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setRenderRotation(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "vrotation setRenderRotation "

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
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "TXCRenderAndDec"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderRotation:I

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->d(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public setStreamType(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->a(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setStreamType(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public setVideoFrameListener(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameListener:Lcom/tencent/liteav/j;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameFormat:Lcom/tencent/liteav/basic/a/b;

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "setVideoFrameListener->enter listener: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", format: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string v0, "TXCRenderAndDec"

    .line 31
    .line 32
    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    instance-of p2, p2, Lcom/tencent/liteav/renderer/a;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    const-string p1, "setCustomRenderListener-> clean listener."

    .line 46
    .line 47
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 51
    .line 52
    check-cast p1, Lcom/tencent/liteav/renderer/a;

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/renderer/a;->b(Lcom/tencent/liteav/renderer/a$a;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    const-string p1, "setCustomRenderListener-> set listener."

    .line 60
    .line 61
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 65
    .line 66
    check-cast p1, Lcom/tencent/liteav/renderer/a;

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/a;->b(Lcom/tencent/liteav/renderer/a$a;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public setVideoRender(Lcom/tencent/liteav/renderer/e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "set video render "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " id "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "TXCRenderAndDec"

    .line 41
    .line 42
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 46
    .line 47
    if-nez p1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 58
    .line 59
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/renderer/e;->a(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/basic/b/b;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 70
    .line 71
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderMode:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/renderer/e;->c(I)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 77
    .line 78
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderRotation:I

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/renderer/e;->d(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoFrameListener:Lcom/tencent/liteav/j;

    .line 84
    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 88
    .line 89
    instance-of v0, p1, Lcom/tencent/liteav/renderer/a;

    .line 90
    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    check-cast p1, Lcom/tencent/liteav/renderer/a;

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/a;->b(Lcom/tencent/liteav/renderer/a$a;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mConfig:Lcom/tencent/liteav/d;

    .line 99
    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 103
    .line 104
    iget p1, p1, Lcom/tencent/liteav/d;->d:I

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/e;->b(I)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_0
    return-void
.end method

.method public start(Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "start render dec "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "TXCRenderAndDec"

    .line 33
    .line 34
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-boolean p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    .line 38
    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFrameDecErrCnt:J

    .line 42
    .line 43
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastReqKeyFrameTS:J

    .line 44
    .line 45
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/renderer/f;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/e;->f()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    new-instance p1, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 67
    .line 68
    invoke-direct {p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setUserId(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 81
    .line 82
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setStreamType(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 98
    .line 99
    iget-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableDecoderChange:Z

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableChange(Z)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableLimitHWDecCache:Z

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableLimitDecCache(Z)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 112
    .line 113
    iget-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableRestartDecoder:Z

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableRestart(Z)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->startDecode()V

    .line 119
    .line 120
    .line 121
    const/4 p1, 0x1

    .line 122
    iput-boolean p1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mIsRendering:Z

    .line 123
    .line 124
    return-void
.end method

.method public startVideo()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->stopVideo()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mFrameDecErrCnt:J

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastReqKeyFrameTS:J

    .line 12
    .line 13
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/renderer/f;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/e;->f()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "start video dec "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, ", "

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "TXCRenderAndDec"

    .line 66
    .line 67
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 71
    .line 72
    invoke-direct {v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setUserId(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 85
    .line 86
    iget v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setStreamType(I)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 92
    .line 93
    invoke-virtual {v1, p0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 97
    .line 98
    invoke-virtual {v1, p0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 102
    .line 103
    iget-boolean v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableDecoderChange:Z

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableChange(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 109
    .line 110
    iget-boolean v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableRestartDecoder:Z

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableRestart(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 116
    .line 117
    iget-boolean v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mEnableLimitHWDecCache:Z

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->enableLimitDecCache(Z)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p0}, Lcom/tencent/liteav/TXCRenderAndDec;->startDecode()V

    .line 123
    .line 124
    .line 125
    iput-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mIsRendering:Z

    .line 126
    .line 127
    return-void
.end method

.method public stop()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "stop video render dec "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "TXCRenderAndDec"

    .line 33
    .line 34
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mIsRendering:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRealTime:Z

    .line 41
    .line 42
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->stop()V

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {v0, v2}, Lcom/tencent/liteav/renderer/e;->a(Z)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/renderer/f;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public stopVideo()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mIsRendering:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "stop video dec "

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, ", "

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v3, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v3, "TXCRenderAndDec"

    .line 41
    .line 42
    invoke-static {v3, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->stop()V

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lcom/tencent/liteav/renderer/e;->a(Z)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/renderer/f;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public updateLoadInfo()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->isHardwareDecode()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    const-wide/16 v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v2, 0x138a

    .line 24
    .line 25
    invoke-virtual {p0, v2, v1, v0}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mVideoRender:Lcom/tencent/liteav/renderer/e;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/e;->n()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iget-wide v2, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderCalculateTS:J

    .line 41
    .line 42
    sub-long v2, v0, v2

    .line 43
    .line 44
    const-wide/16 v4, 0x3e8

    .line 45
    .line 46
    cmp-long v4, v2, v4

    .line 47
    .line 48
    if-ltz v4, :cond_3

    .line 49
    .line 50
    iget-wide v4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mRenderFrameCount:J

    .line 51
    .line 52
    iget-wide v6, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderFrameCount:J

    .line 53
    .line 54
    sub-long v6, v4, v6

    .line 55
    .line 56
    long-to-double v6, v6

    .line 57
    const-wide v8, 0x408f400000000000L    # 1000.0

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    mul-double/2addr v6, v8

    .line 63
    long-to-double v2, v2

    .line 64
    div-double/2addr v6, v2

    .line 65
    iput-wide v4, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderFrameCount:J

    .line 66
    .line 67
    iput-wide v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mLastRenderCalculateTS:J

    .line 68
    .line 69
    iget v0, p0, Lcom/tencent/liteav/TXCRenderAndDec;->mStreamType:I

    .line 70
    .line 71
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/16 v2, 0x1772

    .line 76
    .line 77
    invoke-virtual {p0, v2, v0, v1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void
.end method
