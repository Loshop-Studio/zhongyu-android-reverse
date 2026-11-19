.class Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lcom/tencent/liteav/videodecoder/b;

.field b:Lcom/tencent/liteav/videodecoder/f;

.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field

.field d:Z

.field e:Z

.field f:Landroid/view/Surface;

.field private g:Ljava/nio/ByteBuffer;

.field private h:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private a(Z)V
    .locals 5

    .line 25
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    const-string v1, "TXCVideoDecoder"

    if-eqz v0, :cond_0

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "play:decode: start decode ignore hwdec: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 27
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    if-eqz v0, :cond_1

    .line 28
    new-instance v0, Lcom/tencent/liteav/videodecoder/e;

    invoke-direct {v0}, Lcom/tencent/liteav/videodecoder/e;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    goto :goto_0

    .line 29
    :cond_1
    new-instance v0, Lcom/tencent/liteav/videodecoder/TXCVideoFfmpegDecoder;

    invoke-direct {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoFfmpegDecoder;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    .line 30
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->b:Lcom/tencent/liteav/videodecoder/f;

    invoke-interface {v0, v2}, Lcom/tencent/liteav/videodecoder/b;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->c:Ljava/lang/ref/WeakReference;

    invoke-interface {v0, v2}, Lcom/tencent/liteav/videodecoder/b;->setNotifyListener(Ljava/lang/ref/WeakReference;)V

    .line 32
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->f:Landroid/view/Surface;

    invoke-interface {v0, v2}, Lcom/tencent/liteav/videodecoder/b;->config(Landroid/view/Surface;)I

    .line 33
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->g:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->h:Ljava/nio/ByteBuffer;

    iget-boolean v4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->e:Z

    invoke-interface {v0, v2, v3, p1, v4}, Lcom/tencent/liteav/videodecoder/b;->start(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;ZZ)I

    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "play:decode: start decode hwdec: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hevc: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->e:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(ZZ)V
    .locals 1

    .line 17
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "play:decode: restart decode hwdec: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXCVideoDecoder"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    if-eqz p1, :cond_0

    .line 20
    invoke-interface {p1}, Lcom/tencent/liteav/videodecoder/b;->stop()V

    .line 21
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/tencent/liteav/videodecoder/b;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 22
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    invoke-interface {p1, v0}, Lcom/tencent/liteav/videodecoder/b;->setNotifyListener(Ljava/lang/ref/WeakReference;)V

    .line 23
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    .line 24
    :cond_0
    invoke-direct {p0, p2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a(Z)V

    return-void
.end method

.method private a([BJJI)V
    .locals 1

    .line 10
    new-instance v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/structs/TXSNALPacket;-><init>()V

    .line 11
    iput-object p1, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 12
    iput-wide p2, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 13
    iput-wide p4, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 14
    iput p6, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 15
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    if-eqz p1, :cond_0

    .line 16
    invoke-interface {p1, v0}, Lcom/tencent/liteav/videodecoder/b;->decode(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/liteav/videodecoder/b;->stop()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/b;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/b;->setNotifyListener(Ljava/lang/ref/WeakReference;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    .line 20
    .line 21
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "play:decode: stop decode hwdec: "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "TXCVideoDecoder"

    .line 48
    .line 49
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public a(ZZLandroid/view/Surface;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Lcom/tencent/liteav/videodecoder/f;Lcom/tencent/liteav/basic/b/b;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->e:Z

    .line 2
    iput-boolean p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->d:Z

    .line 3
    iput-object p3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->f:Landroid/view/Surface;

    .line 4
    iput-object p4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->g:Ljava/nio/ByteBuffer;

    .line 5
    iput-object p5, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->h:Ljava/nio/ByteBuffer;

    .line 6
    iput-object p6, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->b:Lcom/tencent/liteav/videodecoder/f;

    .line 7
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public a()Z
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a:Lcom/tencent/liteav/videodecoder/b;

    if-eqz v0, :cond_0

    .line 9
    invoke-interface {v0}, Lcom/tencent/liteav/videodecoder/b;->isHevc()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 17
    .line 18
    if-ne p1, v2, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a(ZZ)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    :try_start_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "nal"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v0, "pts"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    const-string v0, "dts"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    const-string v0, "codecId"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 57
    move-object v1, p0

    .line 58
    :try_start_1
    invoke-direct/range {v1 .. v7}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a([BJJI)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    move-exception v0

    .line 63
    :goto_1
    move-object p1, v0

    .line 64
    goto :goto_2

    .line 65
    :catch_1
    move-exception v0

    .line 66
    move-object v1, p0

    .line 67
    goto :goto_1

    .line 68
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v2, "decode frame failed."

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v0, "TXCVideoDecoder"

    .line 90
    .line 91
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_3
    move-object v1, p0

    .line 96
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a(Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
