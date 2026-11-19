.class public Lcom/tencent/liteav/videodecoder/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/videodecoder/b;


# instance fields
.field private a:Landroid/media/MediaCodec$BufferInfo;

.field private b:Landroid/media/MediaCodec;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:J

.field private g:J

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Landroid/view/Surface;

.field private l:I

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/basic/structs/TXSNALPacket;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private o:J

.field private p:I

.field private q:Lorg/json/JSONArray;

.field private r:Lcom/tencent/liteav/videodecoder/f;

.field private s:Lcom/tencent/liteav/videodecoder/d;

.field private t:Z

.field private u:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->a:Landroid/media/MediaCodec$BufferInfo;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 13
    .line 14
    const-string v1, "video/avc"

    .line 15
    .line 16
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/e;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/16 v1, 0x21c

    .line 19
    .line 20
    iput v1, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    .line 21
    .line 22
    const/16 v1, 0x3c0

    .line 23
    .line 24
    iput v1, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    .line 25
    .line 26
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    iput-wide v1, p0, Lcom/tencent/liteav/videodecoder/e;->f:J

    .line 29
    .line 30
    iput-wide v1, p0, Lcom/tencent/liteav/videodecoder/e;->g:J

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    iput-boolean v3, p0, Lcom/tencent/liteav/videodecoder/e;->h:Z

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    iput-boolean v3, p0, Lcom/tencent/liteav/videodecoder/e;->i:Z

    .line 37
    .line 38
    iput-boolean v3, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    .line 39
    .line 40
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->k:Landroid/view/Surface;

    .line 41
    .line 42
    iput v3, p0, Lcom/tencent/liteav/videodecoder/e;->l:I

    .line 43
    .line 44
    new-instance v4, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->n:Ljava/util/ArrayList;

    .line 57
    .line 58
    iput-wide v1, p0, Lcom/tencent/liteav/videodecoder/e;->o:J

    .line 59
    .line 60
    iput v3, p0, Lcom/tencent/liteav/videodecoder/e;->p:I

    .line 61
    .line 62
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->q:Lorg/json/JSONArray;

    .line 63
    .line 64
    new-instance v0, Lcom/tencent/liteav/videodecoder/d;

    .line 65
    .line 66
    invoke-direct {v0}, Lcom/tencent/liteav/videodecoder/d;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->s:Lcom/tencent/liteav/videodecoder/d;

    .line 70
    .line 71
    iput-boolean v3, p0, Lcom/tencent/liteav/videodecoder/e;->t:Z

    .line 72
    .line 73
    return-void
.end method

.method private a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I
    .locals 7

    .line 5
    const-string v0, "MediaCodecDecoder"

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    .line 6
    :try_start_0
    iget-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    if-nez v4, :cond_5

    iget-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->k:Landroid/view/Surface;

    if-nez v4, :cond_0

    goto/16 :goto_3

    .line 7
    :cond_0
    iput-boolean p3, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    if-eqz p3, :cond_1

    .line 8
    const-string p3, "video/hevc"

    iput-object p3, p0, Lcom/tencent/liteav/videodecoder/e;->c:Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_4

    .line 9
    :cond_1
    const-string p3, "video/avc"

    iput-object p3, p0, Lcom/tencent/liteav/videodecoder/e;->c:Ljava/lang/String;

    .line 10
    :goto_0
    iget-object p3, p0, Lcom/tencent/liteav/videodecoder/e;->c:Ljava/lang/String;

    iget v4, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    iget v5, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    invoke-static {p3, v4, v5}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p3

    if-eqz p1, :cond_2

    .line 11
    const-string v4, "csd-0"

    invoke-virtual {p3, v4, p1}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_2
    if-eqz p2, :cond_3

    .line 12
    const-string p1, "csd-1"

    invoke-virtual {p3, p1, p2}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->q:Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    move p2, v3

    .line 14
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge p2, v4, :cond_4

    .line 15
    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 16
    const-string v5, "key"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 17
    const-string v6, "value"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    .line 18
    invoke-virtual {p3, v5, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 19
    :try_start_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "config custom format error "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :cond_4
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->c:Ljava/lang/String;

    invoke-static {p1}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/4 p2, 0x1

    .line 21
    :try_start_3
    iget-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->k:Landroid/view/Surface;

    invoke-virtual {p1, p3, v4, v1, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    const/4 p1, 0x2

    .line 22
    :try_start_4
    iget-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    invoke-virtual {v4, p2}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    const/4 p1, 0x3

    .line 23
    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    invoke-virtual {p2}, Landroid/media/MediaCodec;->start()V

    const/4 p1, 0x4

    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "decode: start decoder success, is hevc: "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " w = "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " h = "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", format = "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/media/MediaFormat;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 25
    :try_start_5
    iput v3, p0, Lcom/tencent/liteav/videodecoder/e;->l:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto/16 :goto_8

    :catch_2
    move-exception p2

    move v2, v3

    :goto_2
    move v3, p1

    move-object p1, p2

    goto :goto_4

    :catch_3
    move-exception p2

    goto :goto_2

    :catch_4
    move-exception p1

    move v3, p2

    goto :goto_4

    .line 26
    :cond_5
    :goto_3
    :try_start_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "decode: init decoder error, can not init for decoder="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ",surface="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/e;->k:Landroid/view/Surface;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return v2

    .line 27
    :goto_4
    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    if-eqz p2, :cond_6

    .line 28
    :try_start_7
    invoke-virtual {p2}, Landroid/media/MediaCodec;->release()V

    .line 29
    const-string p2, "decode: , decoder release success"

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 30
    :goto_5
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    goto :goto_7

    :catchall_0
    move-exception p1

    goto :goto_6

    .line 31
    :catch_5
    :try_start_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "decode: , decoder release exception: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_5

    .line 32
    :goto_6
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 33
    throw p1

    .line 34
    :cond_6
    :goto_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "decode: init decoder "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " step exception: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->f()V

    move v3, v2

    :goto_8
    return v3
.end method

.method private a()V
    .locals 7

    .line 37
    const-string v0, "decode: release decoder exception: "

    const-string v1, "decode: release decoder sucess"

    const-string v2, "MediaCodecDecoder"

    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    if-eqz v3, :cond_0

    const/4 v4, 0x0

    .line 38
    :try_start_0
    invoke-virtual {v3}, Landroid/media/MediaCodec;->stop()V

    .line 39
    const-string v3, "decode: stop decoder sucess"

    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    :try_start_1
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    invoke-virtual {v3}, Landroid/media/MediaCodec;->release()V

    .line 41
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :goto_0
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 43
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 44
    :goto_1
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 45
    throw v0

    :catchall_1
    move-exception v3

    goto :goto_4

    :catch_1
    move-exception v3

    .line 46
    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "decode: stop decoder Exception: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 47
    :try_start_4
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    invoke-virtual {v3}, Landroid/media/MediaCodec;->release()V

    .line 48
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v1

    .line 49
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_0

    .line 50
    :goto_2
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-wide/16 v0, 0x0

    .line 51
    iput-wide v0, p0, Lcom/tencent/liteav/videodecoder/e;->f:J

    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->h:Z

    return-void

    .line 53
    :goto_3
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 54
    throw v0

    .line 55
    :goto_4
    :try_start_6
    iget-object v5, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    invoke-virtual {v5}, Landroid/media/MediaCodec;->release()V

    .line 56
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 57
    :goto_5
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v1

    .line 58
    :try_start_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_5

    .line 59
    :goto_6
    throw v3

    .line 60
    :goto_7
    iput-object v4, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 61
    throw v0

    :cond_0
    return-void
.end method

.method private a(IJJI)V
    .locals 11

    .line 62
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 63
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->a:Landroid/media/MediaCodec$BufferInfo;

    iget p1, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p1, p1, 0x4

    const-string v1, "MediaCodecDecoder"

    if-eqz p1, :cond_0

    .line 64
    const-string p1, "output EOS"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/e;->r:Lcom/tencent/liteav/videodecoder/f;

    if-eqz v2, :cond_1

    .line 66
    iget v4, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    iget v5, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    const/4 v3, 0x0

    move-wide v6, p2

    move-wide v8, p4

    move/from16 v10, p6

    invoke-interface/range {v2 .. v10}, Lcom/tencent/liteav/videodecoder/f;->onDecodeFrame(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;IIJJI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 67
    const-string p2, "onDecodeFrame failed."

    invoke-static {v1, p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->d()V

    return-void
.end method

.method private a(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 8

    .line 77
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->t:Z

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 78
    :cond_0
    iget v0, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    if-nez v0, :cond_9

    const/4 v0, 0x0

    move v1, v0

    .line 79
    :goto_0
    :try_start_0
    iget-object v2, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    array-length v3, v2

    const/4 v4, 0x1

    if-ge v1, v3, :cond_3

    .line 80
    aget-byte v3, v2, v1

    const/4 v5, 0x7

    if-nez v3, :cond_1

    add-int/lit8 v6, v1, 0x1

    aget-byte v6, v2, v6

    if-nez v6, :cond_1

    add-int/lit8 v6, v1, 0x2

    aget-byte v6, v2, v6

    if-nez v6, :cond_1

    add-int/lit8 v6, v1, 0x3

    aget-byte v6, v2, v6

    if-ne v6, v4, :cond_1

    add-int/lit8 v6, v1, 0x4

    aget-byte v7, v2, v6

    and-int/lit8 v7, v7, 0x1f

    if-ne v7, v5, :cond_1

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    if-nez v3, :cond_2

    add-int/lit8 v3, v1, 0x1

    .line 81
    aget-byte v3, v2, v3

    if-nez v3, :cond_2

    add-int/lit8 v3, v1, 0x2

    aget-byte v3, v2, v3

    if-nez v3, :cond_2

    add-int/lit8 v6, v1, 0x3

    aget-byte v3, v2, v6

    and-int/lit8 v3, v3, 0x1f

    if-ne v3, v5, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_3
    const/4 v6, -0x1

    :goto_1
    if-ltz v6, :cond_9

    .line 82
    array-length v1, v2

    sub-int/2addr v1, v6

    move v2, v6

    .line 83
    :goto_2
    iget-object v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    array-length v5, v3

    if-ge v2, v5, :cond_7

    .line 84
    aget-byte v5, v3, v2

    if-nez v5, :cond_4

    add-int/lit8 v7, v2, 0x1

    aget-byte v7, v3, v7

    if-nez v7, :cond_4

    add-int/lit8 v7, v2, 0x2

    aget-byte v7, v3, v7

    if-eq v7, v4, :cond_5

    :cond_4
    if-nez v5, :cond_6

    add-int/lit8 v5, v2, 0x1

    aget-byte v5, v3, v5

    if-nez v5, :cond_6

    add-int/lit8 v5, v2, 0x2

    aget-byte v5, v3, v5

    if-nez v5, :cond_6

    add-int/lit8 v5, v2, 0x3

    aget-byte v5, v3, v5

    if-ne v5, v4, :cond_6

    :cond_5
    sub-int v1, v2, v6

    goto :goto_3

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 85
    :cond_7
    :goto_3
    new-array v2, v1, [B

    .line 86
    invoke-static {v3, v6, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/e;->s:Lcom/tencent/liteav/videodecoder/d;

    invoke-virtual {v3, v2}, Lcom/tencent/liteav/videodecoder/d;->a([B)[B

    move-result-object v2

    if-eqz v2, :cond_9

    .line 88
    iget-object v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    array-length v4, v3

    array-length v5, v2

    add-int/2addr v4, v5

    sub-int/2addr v4, v1

    new-array v4, v4, [B

    if-lez v6, :cond_8

    .line 89
    invoke-static {v3, v0, v4, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    :cond_8
    array-length v3, v2

    invoke-static {v2, v0, v4, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    iget-object v0, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    add-int v3, v6, v1

    array-length v2, v2

    add-int/2addr v2, v6

    array-length v5, v0

    sub-int/2addr v5, v1

    sub-int/2addr v5, v6

    invoke-static {v0, v3, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    iput-object v4, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 93
    :goto_4
    const-string v0, "MediaCodecDecoder"

    const-string v1, "modify dec buffer error "

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_5
    return-void
.end method

.method private a(Z)V
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    if-eq v0, p1, :cond_2

    .line 70
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    .line 71
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->i:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 72
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->e()Z

    move-result p1

    if-nez p1, :cond_1

    .line 73
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->a()V

    .line 74
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->f()V

    return-void

    .line 75
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->a()V

    .line 76
    iget-boolean p1, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, p1}, Lcom/tencent/liteav/videodecoder/e;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I

    :cond_2
    :goto_0
    return-void
.end method

.method private b()V
    .locals 22
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-string v2, "MediaCodecDecoder"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "null decoder"

    .line 10
    .line 11
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v3, v0

    .line 23
    check-cast v3, Lcom/tencent/liteav/basic/structs/TXSNALPacket;

    .line 24
    .line 25
    if-eqz v3, :cond_e

    .line 26
    .line 27
    iget-object v0, v3, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 28
    .line 29
    array-length v0, v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_a

    .line 33
    .line 34
    :cond_1
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 35
    .line 36
    .line 37
    move-result-wide v9

    .line 38
    iget-wide v4, v1, Lcom/tencent/liteav/videodecoder/e;->o:J

    .line 39
    .line 40
    const-wide/16 v11, 0x0

    .line 41
    .line 42
    cmp-long v0, v4, v11

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iput-wide v9, v1, Lcom/tencent/liteav/videodecoder/e;->o:J

    .line 47
    .line 48
    :cond_2
    :try_start_0
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :goto_0
    move-object v4, v0

    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v0

    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v5, "decode: getInputBuffers Exception!! "

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    goto :goto_0

    .line 83
    :goto_1
    if-eqz v4, :cond_d

    .line 84
    .line 85
    array-length v0, v4

    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :cond_3
    const-wide/16 v5, 0x2710

    .line 91
    .line 92
    const/16 v7, -0x2710

    .line 93
    .line 94
    :try_start_1
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 95
    .line 96
    invoke-virtual {v0, v5, v6}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 97
    .line 98
    .line 99
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 100
    move v14, v0

    .line 101
    goto :goto_2

    .line 102
    :catch_1
    move-exception v0

    .line 103
    new-instance v13, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v14, "decode: dequeueInputBuffer Exception!! "

    .line 109
    .line 110
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    move v14, v7

    .line 128
    :goto_2
    if-ltz v14, :cond_4

    .line 129
    .line 130
    aget-object v0, v4, v14

    .line 131
    .line 132
    iget-object v4, v3, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 133
    .line 134
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    :try_start_2
    iget-object v13, v1, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 138
    .line 139
    iget-object v0, v3, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 140
    .line 141
    array-length v0, v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 142
    move-wide/from16 v20, v11

    .line 143
    .line 144
    :try_start_3
    iget-wide v11, v3, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 145
    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    const/4 v15, 0x0

    .line 149
    move/from16 v16, v0

    .line 150
    .line 151
    move-wide/from16 v17, v11

    .line 152
    .line 153
    invoke-virtual/range {v13 .. v19}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :catch_2
    move-wide/from16 v20, v11

    .line 163
    .line 164
    :catch_3
    invoke-direct {v1}, Lcom/tencent/liteav/videodecoder/e;->g()V

    .line 165
    .line 166
    .line 167
    :goto_3
    iget-wide v11, v1, Lcom/tencent/liteav/videodecoder/e;->f:J

    .line 168
    .line 169
    cmp-long v0, v11, v20

    .line 170
    .line 171
    if-nez v0, :cond_5

    .line 172
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v4, "decode: input buffer available, dequeueInputBuffer index: "

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_4
    move-wide/from16 v20, v11

    .line 195
    .line 196
    const-string v0, "decode: input buffer not available, dequeueInputBuffer failed"

    .line 197
    .line 198
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    :goto_4
    :try_start_4
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 202
    .line 203
    iget-object v4, v1, Lcom/tencent/liteav/videodecoder/e;->a:Landroid/media/MediaCodec$BufferInfo;

    .line 204
    .line 205
    invoke-virtual {v0, v4, v5, v6}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 206
    .line 207
    .line 208
    move-result v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 209
    goto :goto_5

    .line 210
    :catch_4
    move-exception v0

    .line 211
    invoke-direct {v1}, Lcom/tencent/liteav/videodecoder/e;->g()V

    .line 212
    .line 213
    .line 214
    new-instance v4, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v5, "decode: dequeueOutputBuffer exception!!"

    .line 220
    .line 221
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_5
    if-ltz v7, :cond_6

    .line 235
    .line 236
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->a:Landroid/media/MediaCodec$BufferInfo;

    .line 237
    .line 238
    iget-wide v4, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 239
    .line 240
    iget v0, v3, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->rotation:I

    .line 241
    .line 242
    move-wide v3, v4

    .line 243
    move-wide v5, v3

    .line 244
    move v2, v7

    .line 245
    move v7, v0

    .line 246
    invoke-direct/range {v1 .. v7}, Lcom/tencent/liteav/videodecoder/e;->a(IJJI)V

    .line 247
    .line 248
    .line 249
    iput v8, v1, Lcom/tencent/liteav/videodecoder/e;->l:I

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_6
    const/4 v0, -0x1

    .line 253
    if-ne v7, v0, :cond_7

    .line 254
    .line 255
    const-wide/16 v3, 0xa

    .line 256
    .line 257
    :try_start_5
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_5

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :catch_5
    move-exception v0

    .line 262
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 263
    .line 264
    .line 265
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    const-string v3, "decode: no output from decoder available when timeout fail count "

    .line 271
    .line 272
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    iget v3, v1, Lcom/tencent/liteav/videodecoder/e;->l:I

    .line 276
    .line 277
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {v1}, Lcom/tencent/liteav/videodecoder/e;->g()V

    .line 288
    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_7
    const/4 v0, -0x3

    .line 292
    if-ne v7, v0, :cond_8

    .line 293
    .line 294
    const-string v0, "decode: output buffers changed"

    .line 295
    .line 296
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_8
    const/4 v0, -0x2

    .line 301
    if-ne v7, v0, :cond_9

    .line 302
    .line 303
    invoke-direct {v1}, Lcom/tencent/liteav/videodecoder/e;->c()V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const-string v3, "decode: unexpected result from decoder.dequeueOutputBuffer: "

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    :goto_7
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 328
    .line 329
    .line 330
    move-result-wide v2

    .line 331
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->n:Ljava/util/ArrayList;

    .line 332
    .line 333
    sub-long v4, v2, v9

    .line 334
    .line 335
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    iget-wide v4, v1, Lcom/tencent/liteav/videodecoder/e;->o:J

    .line 343
    .line 344
    const-wide/16 v6, 0x3e8

    .line 345
    .line 346
    add-long/2addr v4, v6

    .line 347
    cmp-long v0, v2, v4

    .line 348
    .line 349
    if-lez v0, :cond_c

    .line 350
    .line 351
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->n:Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    move-wide/from16 v11, v20

    .line 358
    .line 359
    :cond_a
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_b

    .line 364
    .line 365
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    check-cast v4, Ljava/lang/Long;

    .line 370
    .line 371
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 372
    .line 373
    .line 374
    move-result-wide v5

    .line 375
    cmp-long v5, v5, v11

    .line 376
    .line 377
    if-lez v5, :cond_a

    .line 378
    .line 379
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 380
    .line 381
    .line 382
    move-result-wide v4

    .line 383
    move-wide v11, v4

    .line 384
    goto :goto_8

    .line 385
    :cond_b
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->n:Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 388
    .line 389
    .line 390
    iput-wide v2, v1, Lcom/tencent/liteav/videodecoder/e;->o:J

    .line 391
    .line 392
    const-wide/16 v2, 0x3

    .line 393
    .line 394
    mul-long/2addr v11, v2

    .line 395
    long-to-int v0, v11

    .line 396
    iput v0, v1, Lcom/tencent/liteav/videodecoder/e;->p:I

    .line 397
    .line 398
    :cond_c
    return-void

    .line 399
    :cond_d
    :goto_9
    const-string v0, "decode: getInputBuffers failed"

    .line 400
    .line 401
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_e
    :goto_a
    const-string v0, "decode: empty buffer"

    .line 406
    .line 407
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    iget-object v0, v1, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    return-void
.end method

.method private c()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->b:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "decode output format changed: "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "MediaCodecDecoder"

    .line 25
    .line 26
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "crop-right"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const-string v3, "crop-left"

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    sub-int/2addr v1, v3

    .line 42
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    const-string v3, "crop-bottom"

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const-string v4, "crop-top"

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    sub-int/2addr v3, v4

    .line 61
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    const-string v4, "width"

    .line 68
    .line 69
    invoke-virtual {v0, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const-string v5, "height"

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget v3, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    .line 88
    .line 89
    if-ne v1, v3, :cond_2

    .line 90
    .line 91
    iget v4, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    .line 92
    .line 93
    if-eq v0, v4, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->h:Z

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->h:Z

    .line 102
    .line 103
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->r:Lcom/tencent/liteav/videodecoder/f;

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    invoke-interface {v0, v3, v4}, Lcom/tencent/liteav/videodecoder/f;->onVideoSizeChange(II)V

    .line 108
    .line 109
    .line 110
    :cond_1
    return-void

    .line 111
    :cond_2
    :goto_0
    iput v1, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    .line 112
    .line 113
    iput v0, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    .line 114
    .line 115
    :try_start_0
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/e;->r:Lcom/tencent/liteav/videodecoder/f;

    .line 116
    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    invoke-interface {v3, v1, v0}, Lcom/tencent/liteav/videodecoder/f;->onVideoSizeChange(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catch_0
    move-exception v3

    .line 124
    const-string v4, "onVideoSizeChange failed."

    .line 125
    .line 126
    invoke-static {v2, v4, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v4, "decode: video size change to w:"

    .line 135
    .line 136
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, ",h:"

    .line 143
    .line 144
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private d()V
    .locals 12

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/e;->f:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const-string v1, "MediaCodecDecoder"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "decode first frame sucess"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    iget-wide v6, p0, Lcom/tencent/liteav/videodecoder/e;->f:J

    .line 21
    .line 22
    cmp-long v0, v6, v2

    .line 23
    .line 24
    if-lez v0, :cond_1

    .line 25
    .line 26
    const-wide/16 v8, 0x3e8

    .line 27
    .line 28
    add-long/2addr v6, v8

    .line 29
    cmp-long v0, v4, v6

    .line 30
    .line 31
    if-lez v0, :cond_1

    .line 32
    .line 33
    iget-wide v6, p0, Lcom/tencent/liteav/videodecoder/e;->g:J

    .line 34
    .line 35
    const-wide/16 v10, 0x7d0

    .line 36
    .line 37
    add-long/2addr v10, v6

    .line 38
    cmp-long v0, v4, v10

    .line 39
    .line 40
    if-lez v0, :cond_1

    .line 41
    .line 42
    cmp-long v0, v6, v2

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v6, "frame interval["

    .line 52
    .line 53
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v6, p0, Lcom/tencent/liteav/videodecoder/e;->f:J

    .line 57
    .line 58
    sub-long v6, v4, v6

    .line 59
    .line 60
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v6, "] > "

    .line 64
    .line 65
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-wide v4, p0, Lcom/tencent/liteav/videodecoder/e;->g:J

    .line 79
    .line 80
    :cond_1
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/e;->g:J

    .line 81
    .line 82
    cmp-long v0, v0, v2

    .line 83
    .line 84
    if-nez v0, :cond_2

    .line 85
    .line 86
    iput-wide v4, p0, Lcom/tencent/liteav/videodecoder/e;->g:J

    .line 87
    .line 88
    :cond_2
    iput-wide v4, p0, Lcom/tencent/liteav/videodecoder/e;->f:J

    .line 89
    .line 90
    return-void
.end method

.method private e()Z
    .locals 11

    .line 1
    new-instance v0, Landroid/media/MediaCodecList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v2, v0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v4, v2, :cond_2

    .line 15
    .line 16
    aget-object v5, v0, v4

    .line 17
    .line 18
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    array-length v7, v6

    .line 23
    move v8, v3

    .line 24
    :goto_1
    if-ge v8, v7, :cond_1

    .line 25
    .line 26
    aget-object v9, v6, v8

    .line 27
    .line 28
    const-string v10, "video/hevc"

    .line 29
    .line 30
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    if-eqz v9, :cond_0

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "decode: video/hevc MediaCodecInfo: "

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, ",encoder:"

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v2, "MediaCodecDecoder"

    .line 70
    .line 71
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return v1

    .line 75
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    return v3
.end method

.method private f()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "decode: hw decode error, hevc: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "MediaCodecDecoder"

    .line 25
    .line 26
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->u:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    const/16 v1, -0x900

    .line 36
    .line 37
    const-string v2, "h265 Decoding failed"

    .line 38
    .line 39
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->u:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    const/16 v1, 0x83a

    .line 46
    .line 47
    const-string v2, "Failed to enable hardware decoding\uff0cuse software decoding."

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->i:Z

    .line 54
    .line 55
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->r:Lcom/tencent/liteav/videodecoder/f;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    const/4 v1, -0x1

    .line 60
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/f;->onDecodeFailed(I)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method private g()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videodecoder/e;->l:I

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->f()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/tencent/liteav/videodecoder/e;->l:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/liteav/videodecoder/e;->l:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public GetDecodeCost()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videodecoder/e;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public a(II)V
    .locals 0

    if-lez p1, :cond_0

    if-lez p2, :cond_0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    .line 3
    iput p2, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "decode: init with video size: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/tencent/liteav/videodecoder/e;->d:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/tencent/liteav/videodecoder/e;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaCodecDecoder"

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->q:Lorg/json/JSONArray;

    return-void
.end method

.method public config(Landroid/view/Surface;)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    return p1

    .line 5
    :cond_0
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->k:Landroid/view/Surface;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public decode(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 3

    .line 1
    iget v0, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videodecoder/e;->a(Z)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/e;->a(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catch_0
    move-exception v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v2, "decode: doDecode Exception!! "

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "MediaCodecDecoder"

    .line 60
    .line 61
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/e;->m:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ne p1, v0, :cond_1

    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method public enableLimitDecCache(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/e;->t:Z

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "decode: enable limit dec cache: "

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "MediaCodecDecoder"

    .line 21
    .line 22
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public isHevc()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/e;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public setListener(Lcom/tencent/liteav/videodecoder/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->r:Lcom/tencent/liteav/videodecoder/f;

    .line 2
    .line 3
    return-void
.end method

.method public setNotifyListener(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/e;->u:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-void
.end method

.method public start(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;ZZ)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p4}, Lcom/tencent/liteav/videodecoder/e;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public stop()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/e;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
