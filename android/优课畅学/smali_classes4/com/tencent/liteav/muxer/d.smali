.class public Lcom/tencent/liteav/muxer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/muxer/a;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/muxer/d$a;
    }
.end annotation


# static fields
.field public static a:F = 0.5f

.field public static b:F = 0.8f

.field public static c:F = 1.25f

.field public static d:F = 2.0f


# instance fields
.field private e:I

.field private f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

.field private g:Ljava/lang/String;

.field private h:Landroid/media/MediaFormat;

.field private i:Landroid/media/MediaFormat;

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/liteav/muxer/d$a;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/liteav/muxer/d$a;",
            ">;"
        }
    .end annotation
.end field

.field private p:J

.field private q:J

.field private r:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/tencent/liteav/muxer/d;->e:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->g:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/tencent/liteav/muxer/d;->j:I

    .line 16
    .line 17
    iput v0, p0, Lcom/tencent/liteav/muxer/d;->k:I

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    iput-wide v0, p0, Lcom/tencent/liteav/muxer/d;->p:J

    .line 40
    .line 41
    iput-wide v0, p0, Lcom/tencent/liteav/muxer/d;->q:J

    .line 42
    .line 43
    iput-wide v0, p0, Lcom/tencent/liteav/muxer/d;->r:J

    .line 44
    .line 45
    return-void
.end method

.method private a(J)V
    .locals 2

    .line 95
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v0

    if-nez v0, :cond_0

    .line 97
    const-string v0, "TXCMP4SWMuxer"

    const-string v1, "flushAudioCache, bufferInfo is null"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v0

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    .line 101
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/muxer/d;->d(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(ZLjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 8

    if-eqz p2, :cond_4

    if-nez p3, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 82
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 83
    iget v1, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v1, :cond_1

    .line 84
    iget v1, p3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 85
    iget v1, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 86
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 87
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 88
    new-instance v2, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v2}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 89
    iget v3, p3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v4, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget-wide v5, p3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget v7, p3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 90
    new-instance p2, Lcom/tencent/liteav/muxer/d$a;

    invoke-direct {p2, v0, v2}, Lcom/tencent/liteav/muxer/d$a;-><init>(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    if-eqz p1, :cond_3

    .line 91
    iget-object p1, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    const/16 p3, 0xc8

    if-ge p1, p3, :cond_2

    .line 92
    iget-object p1, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    .line 93
    :cond_2
    const-string p1, "TXCMP4SWMuxer"

    const-string p2, "drop video frame. video cache size is larger than 200"

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 94
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    return-void
.end method

.method private c(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 11

    .line 4
    iget-wide v3, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v5, p0, Lcom/tencent/liteav/muxer/d;->p:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    .line 5
    const-string v9, "TXCMP4SWMuxer"

    if-gez v1, :cond_1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pts error! first frame offset timeus = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/tencent/liteav/muxer/d;->p:J

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", current timeus = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-wide v3, p0, Lcom/tencent/liteav/muxer/d;->q:J

    cmp-long v1, v3, v5

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-wide v3, v5

    .line 8
    :cond_1
    :goto_0
    iget-wide v5, p0, Lcom/tencent/liteav/muxer/d;->q:J

    cmp-long v1, v3, v5

    if-gez v1, :cond_2

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "video is not in chronological order. current frame\'s pts("

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ") smaller than pre frame\'s pts("

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lcom/tencent/liteav/muxer/d;->q:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 10
    :cond_2
    iput-wide v3, p0, Lcom/tencent/liteav/muxer/d;->q:J

    .line 11
    :goto_1
    iget v1, p0, Lcom/tencent/liteav/muxer/d;->e:I

    const/4 v5, 0x2

    const/4 v10, 0x1

    if-ne v1, v5, :cond_3

    goto :goto_3

    :cond_3
    const/4 v5, 0x3

    if-ne v1, v5, :cond_4

    long-to-float v1, v3

    .line 12
    sget v3, Lcom/tencent/liteav/muxer/d;->b:F

    :goto_2
    mul-float/2addr v1, v3

    float-to-long v3, v1

    goto :goto_3

    :cond_4
    const/4 v5, 0x4

    if-ne v1, v5, :cond_5

    long-to-float v1, v3

    .line 13
    sget v3, Lcom/tencent/liteav/muxer/d;->a:F

    goto :goto_2

    :cond_5
    if-ne v1, v10, :cond_6

    long-to-float v1, v3

    .line 14
    sget v3, Lcom/tencent/liteav/muxer/d;->c:F

    goto :goto_2

    :cond_6
    if-nez v1, :cond_7

    long-to-float v1, v3

    .line 15
    sget v3, Lcom/tencent/liteav/muxer/d;->d:F

    goto :goto_2

    .line 16
    :cond_7
    :goto_3
    iput-wide v3, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 17
    :try_start_0
    iget v1, p2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 18
    iget v1, p2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v3, p2, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v1, v3

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 19
    iget-object v1, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    iget v4, p2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v5, p2, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget v3, p2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    if-ne v3, v10, :cond_8

    move v6, v10

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    move v6, v3

    :goto_4
    iget-wide v7, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/4 v3, 0x1

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a(Ljava/nio/ByteBuffer;IIIIJ)I

    .line 20
    iget v0, p2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/2addr v0, v10

    if-eqz v0, :cond_9

    .line 21
    iput-boolean v10, p0, Lcom/tencent/liteav/muxer/d;->m:Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_6

    .line 22
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "write frame IllegalArgumentException: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    .line 23
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "write frame IllegalStateException: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    :goto_7
    return-void
.end method

.method private d()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    const-string v1, "csd-0"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_0
    return-object v0
.end method

.method private d(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 12

    .line 3
    iget-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v2, p0, Lcom/tencent/liteav/muxer/d;->p:J

    sub-long/2addr v0, v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    .line 4
    const-string v3, "TXCMP4SWMuxer"

    if-ltz v2, :cond_7

    cmp-long v2, v0, v4

    if-gez v2, :cond_0

    goto/16 :goto_6

    .line 5
    :cond_0
    iget-wide v4, p0, Lcom/tencent/liteav/muxer/d;->r:J

    cmp-long v2, v0, v4

    if-gez v2, :cond_1

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "audio is not in chronological order. current audio\'s pts pts("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ") must larger than pre audio\'s pts("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/tencent/liteav/muxer/d;->r:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-wide v0, p0, Lcom/tencent/liteav/muxer/d;->r:J

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    goto :goto_0

    .line 8
    :cond_1
    iput-wide v0, p0, Lcom/tencent/liteav/muxer/d;->r:J

    .line 9
    :goto_0
    iget v2, p0, Lcom/tencent/liteav/muxer/d;->e:I

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x3

    if-ne v2, v4, :cond_3

    long-to-float v0, v0

    .line 10
    sget v1, Lcom/tencent/liteav/muxer/d;->b:F

    :goto_1
    mul-float/2addr v0, v1

    float-to-long v0, v0

    goto :goto_2

    :cond_3
    const/4 v4, 0x4

    if-ne v2, v4, :cond_4

    long-to-float v0, v0

    .line 11
    sget v1, Lcom/tencent/liteav/muxer/d;->a:F

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    if-ne v2, v4, :cond_5

    long-to-float v0, v0

    .line 12
    sget v1, Lcom/tencent/liteav/muxer/d;->c:F

    goto :goto_1

    :cond_5
    if-nez v2, :cond_6

    long-to-float v0, v0

    .line 13
    sget v1, Lcom/tencent/liteav/muxer/d;->d:F

    goto :goto_1

    .line 14
    :cond_6
    :goto_2
    iput-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 15
    :try_start_0
    iget v0, p2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 16
    iget v0, p2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, p2, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 17
    iget-object v4, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    iget v7, p2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v8, p2, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget v9, p2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v10, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/4 v6, 0x0

    move-object v5, p1

    invoke-virtual/range {v4 .. v11}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a(Ljava/nio/ByteBuffer;IIIIJ)I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_4

    .line 18
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "write sample IllegalArgumentException: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 19
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "write sample IllegalStateException: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    return-void

    .line 20
    :cond_7
    :goto_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "drop sample. first frame offset timeus = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/tencent/liteav/muxer/d;->p:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", current sample timeus = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private e()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 2
    .line 3
    const-string v1, "csd-0"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private f()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 2
    .line 3
    const-string v1, "csd-1"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private g()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-lez v2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/tencent/liteav/muxer/d$a;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/tencent/liteav/muxer/d$a;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 63
    .line 64
    cmp-long v4, v0, v2

    .line 65
    .line 66
    if-lez v4, :cond_1

    .line 67
    .line 68
    return-wide v2

    .line 69
    :cond_1
    return-wide v0
.end method

.method private h()V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->a()Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/muxer/d;->c(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->a()Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/muxer/d;->d(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    return-void
.end method

.method private i()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/tencent/liteav/muxer/d$a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-wide v1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 22
    .line 23
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/muxer/d;->a(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->a()Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/d$a;->b()Landroid/media/MediaCodec$BufferInfo;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/muxer/d;->c(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a()I
    .locals 8

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->g:Ljava/lang/String;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/muxer/d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    const-string v0, "TXCMP4SWMuxer"

    const-string v1, "video track not set yet!"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    const/4 v0, -0x2

    return v0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    .line 9
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 10
    const-string v0, "TXCMP4SWMuxer"

    const-string v2, "start has been called. stop must be called before start"

    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    monitor-exit p0

    return v1

    .line 12
    :cond_2
    :try_start_2
    const-string v0, "TXCMP4SWMuxer"

    const-string v2, "start"

    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-direct {v0}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    .line 14
    new-instance v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;

    invoke-direct {v0}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;-><init>()V

    .line 15
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    if-eqz v2, :cond_4

    .line 16
    const-string v3, "width"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    .line 17
    iget-object v3, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    const-string v4, "height"

    invoke-virtual {v3, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    .line 18
    iput v3, v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;->videoHeight:I

    .line 19
    iput v2, v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;->videoWidth:I

    .line 20
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    const-string v3, "i-frame-interval"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    const-string v3, "i-frame-interval"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_3
    const/4 v2, 0x3

    :goto_0
    iput v2, v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;->videoGOP:I

    .line 21
    :cond_4
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    if-eqz v2, :cond_5

    .line 22
    const-string v3, "channel-count"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    .line 23
    iget-object v3, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    const-string v4, "sample-rate"

    invoke-virtual {v3, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    .line 24
    iput v2, v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;->audioChannels:I

    .line 25
    iput v3, v0, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;->audioSampleRate:I

    .line 26
    :cond_5
    invoke-direct {p0}, Lcom/tencent/liteav/muxer/d;->e()Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 27
    invoke-direct {p0}, Lcom/tencent/liteav/muxer/d;->f()Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 28
    iget-object v4, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    if-eqz v4, :cond_6

    .line 29
    invoke-direct {p0}, Lcom/tencent/liteav/muxer/d;->d()Ljava/nio/ByteBuffer;

    move-result-object v4

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    :goto_1
    const/4 v5, -0x3

    if-eqz v2, :cond_a

    if-nez v3, :cond_7

    goto :goto_2

    .line 30
    :cond_7
    iget-object v6, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    if-eqz v6, :cond_8

    if-nez v4, :cond_8

    .line 31
    const-string v0, "TXCMP4SWMuxer"

    const-string v1, "audio format contains error csd!"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    monitor-exit p0

    return v5

    .line 33
    :cond_8
    :try_start_3
    iget-object v5, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v7

    invoke-virtual {v5, v2, v6, v3, v7}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;I)V

    .line 34
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    if-eqz v2, :cond_9

    .line 35
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    invoke-virtual {v2, v4, v3}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a(Ljava/nio/ByteBuffer;I)V

    .line 36
    :cond_9
    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-virtual {v2, v0}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a(Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;)V

    .line 37
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    iget-object v2, p0, Lcom/tencent/liteav/muxer/d;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-virtual {v0}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->a()I

    const-wide/16 v2, -0x1

    .line 39
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->p:J

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    .line 41
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    .line 42
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->q:J

    .line 43
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->r:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    monitor-exit p0

    return v1

    .line 45
    :cond_a
    :goto_2
    :try_start_4
    const-string v0, "TXCMP4SWMuxer"

    const-string v1, "video format contains error csd!"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 46
    monitor-exit p0

    return v5

    .line 47
    :cond_b
    :goto_3
    :try_start_5
    const-string v0, "TXCMP4SWMuxer"

    const-string v1, "target path not set yet!"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 48
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0
.end method

.method public declared-synchronized a(Landroid/media/MediaFormat;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    const-string v0, "TXCMP4SWMuxer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addVideoTrack:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 3
    iget-object p1, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 49
    :try_start_0
    iput-object p1, p0, Lcom/tencent/liteav/muxer/d;->g:Ljava/lang/String;

    .line 50
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 51
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->g:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 54
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 55
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 58
    :try_start_2
    const-string v0, "TXCMP4SWMuxer"

    const-string v1, "create new file failed."

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 6

    monitor-enter p0

    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 70
    invoke-direct {p0, v1, p1, p2}, Lcom/tencent/liteav/muxer/d;->a(ZLjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 71
    const-string p1, "TXCMP4SWMuxer"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cache frame before muexer ready. ptsUs: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 73
    :cond_0
    :try_start_1
    iget-wide v2, p0, Lcom/tencent/liteav/muxer/d;->p:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    .line 74
    invoke-direct {p0, v1, p1, p2}, Lcom/tencent/liteav/muxer/d;->a(ZLjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 75
    invoke-direct {p0}, Lcom/tencent/liteav/muxer/d;->g()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/tencent/liteav/muxer/d;->p:J

    .line 76
    const-string p1, "TXCMP4SWMuxer"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "first frame offset = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/tencent/liteav/muxer/d;->p:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-direct {p0}, Lcom/tencent/liteav/muxer/d;->i()V

    goto :goto_0

    .line 78
    :cond_1
    iget-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/muxer/d;->a(J)V

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/muxer/d;->c(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized a([BIIJI)V
    .locals 1

    monitor-enter p0

    .line 60
    :try_start_0
    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 61
    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 62
    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 63
    iput-wide p4, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/4 p2, 0x0

    .line 64
    iput p2, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 65
    iput p3, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 66
    iput p6, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 67
    invoke-virtual {p0, v0, p1}, Lcom/tencent/liteav/muxer/d;->b(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b()I
    .locals 8

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/tencent/liteav/muxer/d;->h()V

    .line 7
    const-string v0, "TXCMP4SWMuxer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stop. start flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", video key frame set = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/16 v2, -0x1

    const/4 v0, 0x0

    .line 8
    :try_start_1
    iget-boolean v4, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    if-eqz v4, :cond_0

    iget-boolean v4, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    if-eqz v4, :cond_0

    .line 9
    iget-object v4, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-virtual {v4}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->b()I

    goto :goto_0

    :catchall_0
    move-exception v4

    goto :goto_2

    :catch_0
    move-exception v4

    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    invoke-virtual {v4}, Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :try_start_2
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    .line 13
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    .line 14
    iget-object v4, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 15
    iget-object v4, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 16
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    .line 18
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->q:J

    .line 19
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->r:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    .line 20
    :goto_1
    :try_start_3
    const-string v5, "TXCMP4SWMuxer"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "muxer stop/release exception: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 21
    :try_start_4
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    .line 22
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    .line 23
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 25
    iget-object v1, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 26
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 27
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    .line 28
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->q:J

    .line 29
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->r:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 30
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    .line 31
    :goto_2
    :try_start_5
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->l:Z

    .line 32
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->f:Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;

    .line 33
    iput-boolean v1, p0, Lcom/tencent/liteav/muxer/d;->m:Z

    .line 34
    iget-object v1, p0, Lcom/tencent/liteav/muxer/d;->n:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 35
    iget-object v1, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 36
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;

    .line 37
    iput-object v0, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    .line 38
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->q:J

    .line 39
    iput-wide v2, p0, Lcom/tencent/liteav/muxer/d;->r:J

    .line 40
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 41
    :cond_1
    :goto_3
    monitor-exit p0

    return v1

    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method

.method public declared-synchronized b(Landroid/media/MediaFormat;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    const-string v0, "TXCMP4SWMuxer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addAudioTrack:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/muxer/d;->i:Landroid/media/MediaFormat;

    .line 3
    iget-object p1, p0, Lcom/tencent/liteav/muxer/d;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 51
    :try_start_0
    invoke-direct {p0, v0, p1, p2}, Lcom/tencent/liteav/muxer/d;->a(ZLjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b([BIIJI)V
    .locals 1

    monitor-enter p0

    .line 42
    :try_start_0
    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 43
    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 44
    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 45
    iput-wide p4, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/4 p2, 0x0

    .line 46
    iput p2, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 47
    iput p3, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 48
    iput p6, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 49
    invoke-virtual {p0, v0, p1}, Lcom/tencent/liteav/muxer/d;->a(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized c()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/muxer/d;->h:Landroid/media/MediaFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 2
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 3
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
