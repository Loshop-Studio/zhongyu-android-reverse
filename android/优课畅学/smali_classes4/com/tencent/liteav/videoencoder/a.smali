.class public Lcom/tencent/liteav/videoencoder/a;
.super Lcom/tencent/liteav/videoencoder/b;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:[Ljava/nio/ByteBuffer;

.field private C:[B

.field private volatile D:J

.field private E:J

.field private F:J

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:Z

.field private M:Z

.field private N:Z

.field private O:I

.field private P:I

.field private Q:I

.field private R:J

.field private S:I

.field private T:I

.field private U:I

.field private V:Z

.field private W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private X:I

.field private Y:J

.field private Z:I

.field private a:I

.field private aa:I

.field private ab:Z

.field private ac:Z

.field private ad:J

.field private ae:Ljava/lang/Runnable;

.field private b:J

.field private c:D

.field private d:J

.field private e:J

.field private f:I

.field private g:Z

.field private h:Z

.field private i:J

.field private j:J

.field private k:J

.field private l:J

.field private m:J

.field private n:Z

.field private o:J

.field private p:J

.field private q:Landroid/media/MediaCodec;

.field private r:Lcom/tencent/liteav/basic/util/f;

.field private s:Ljava/lang/Runnable;

.field private t:Ljava/lang/Runnable;

.field private u:Ljava/lang/Runnable;

.field private v:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/lang/Object;

.field private x:Landroid/view/Surface;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->b:J

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    iput-wide v3, p0, Lcom/tencent/liteav/videoencoder/a;->c:D

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->d:J

    .line 16
    .line 17
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->e:J

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->f:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->g:Z

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/a;->h:Z

    .line 25
    .line 26
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    .line 27
    .line 28
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->j:J

    .line 29
    .line 30
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->k:J

    .line 31
    .line 32
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->l:J

    .line 33
    .line 34
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->m:J

    .line 35
    .line 36
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->o:J

    .line 37
    .line 38
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->p:J

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    iput-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    .line 42
    .line 43
    iput-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 44
    .line 45
    new-instance v5, Lcom/tencent/liteav/videoencoder/a$10;

    .line 46
    .line 47
    invoke-direct {v5, p0}, Lcom/tencent/liteav/videoencoder/a$10;-><init>(Lcom/tencent/liteav/videoencoder/a;)V

    .line 48
    .line 49
    .line 50
    iput-object v5, p0, Lcom/tencent/liteav/videoencoder/a;->s:Ljava/lang/Runnable;

    .line 51
    .line 52
    new-instance v5, Lcom/tencent/liteav/videoencoder/a$11;

    .line 53
    .line 54
    invoke-direct {v5, p0}, Lcom/tencent/liteav/videoencoder/a$11;-><init>(Lcom/tencent/liteav/videoencoder/a;)V

    .line 55
    .line 56
    .line 57
    iput-object v5, p0, Lcom/tencent/liteav/videoencoder/a;->t:Ljava/lang/Runnable;

    .line 58
    .line 59
    new-instance v5, Lcom/tencent/liteav/videoencoder/a$2;

    .line 60
    .line 61
    invoke-direct {v5, p0}, Lcom/tencent/liteav/videoencoder/a$2;-><init>(Lcom/tencent/liteav/videoencoder/a;)V

    .line 62
    .line 63
    .line 64
    iput-object v5, p0, Lcom/tencent/liteav/videoencoder/a;->u:Ljava/lang/Runnable;

    .line 65
    .line 66
    new-instance v5, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    const/16 v6, 0xa

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v5, p0, Lcom/tencent/liteav/videoencoder/a;->v:Ljava/util/ArrayDeque;

    .line 74
    .line 75
    iput-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    .line 76
    .line 77
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    .line 78
    .line 79
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 80
    .line 81
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->A:Z

    .line 82
    .line 83
    iput-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    iput-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->C:[B

    .line 86
    .line 87
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    .line 88
    .line 89
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->E:J

    .line 90
    .line 91
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->F:J

    .line 92
    .line 93
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/a;->M:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->N:Z

    .line 96
    .line 97
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    .line 98
    .line 99
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->P:I

    .line 100
    .line 101
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->Q:I

    .line 102
    .line 103
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->R:J

    .line 104
    .line 105
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->S:I

    .line 106
    .line 107
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->T:I

    .line 108
    .line 109
    const/4 v4, -0x1

    .line 110
    iput v4, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    .line 111
    .line 112
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->V:Z

    .line 113
    .line 114
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->X:I

    .line 115
    .line 116
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->Y:J

    .line 117
    .line 118
    const/4 v4, 0x3

    .line 119
    iput v4, p0, Lcom/tencent/liteav/videoencoder/a;->Z:I

    .line 120
    .line 121
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->aa:I

    .line 122
    .line 123
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->ab:Z

    .line 124
    .line 125
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/a;->ac:Z

    .line 126
    .line 127
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->ad:J

    .line 128
    .line 129
    new-instance v0, Lcom/tencent/liteav/videoencoder/a$3;

    .line 130
    .line 131
    invoke-direct {v0, p0}, Lcom/tencent/liteav/videoencoder/a$3;-><init>(Lcom/tencent/liteav/videoencoder/a;)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->ae:Ljava/lang/Runnable;

    .line 135
    .line 136
    new-instance v0, Lcom/tencent/liteav/basic/util/f;

    .line 137
    .line 138
    const-string v1, "HWVideoEncoder"

    .line 139
    .line 140
    invoke-direct {v0, v1}, Lcom/tencent/liteav/basic/util/f;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 144
    .line 145
    return-void
.end method

.method private a(I)I
    .locals 35

    move-object/from16 v1, p0

    .line 101
    const-string v2, "TXCHWVideoEncoder"

    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    const/4 v3, -0x1

    if-nez v0, :cond_0

    return v3

    .line 102
    :cond_0
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 103
    :try_start_0
    iget-object v4, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    move/from16 v5, p1

    mul-int/lit16 v5, v5, 0x3e8

    int-to-long v5, v5

    invoke-virtual {v4, v0, v5, v6}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v5, 0x0

    if-ne v4, v3, :cond_1

    return v5

    :cond_1
    const/4 v6, -0x3

    const/4 v7, 0x1

    if-ne v4, v6, :cond_2

    .line 104
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;

    return v7

    :cond_2
    const/4 v6, -0x2

    if-ne v4, v6, :cond_3

    .line 105
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    .line 106
    invoke-virtual {v1, v0}, Lcom/tencent/liteav/videoencoder/b;->callDelegate(Landroid/media/MediaFormat;)V

    return v7

    :cond_3
    if-gez v4, :cond_4

    return v3

    .line 107
    :cond_4
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v19

    .line 108
    iget-object v8, v1, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;

    aget-object v8, v8, v4

    if-nez v8, :cond_5

    move-object/from16 v34, v2

    move v6, v3

    move/from16 v22, v4

    move v3, v5

    goto/16 :goto_e

    .line 109
    :cond_5
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    move-object v10, v2

    new-array v2, v9, [B

    .line 110
    iget v11, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 111
    iget v11, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v11, v12

    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 112
    iget v11, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {v8, v2, v5, v11}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 113
    iget v11, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    const/4 v12, 0x5

    const/16 v21, 0x4

    const/4 v13, 0x2

    if-le v11, v12, :cond_8

    aget-byte v11, v2, v5

    if-nez v11, :cond_8

    aget-byte v11, v2, v7

    if-nez v11, :cond_8

    aget-byte v11, v2, v13

    if-nez v11, :cond_8

    const/4 v11, 0x3

    aget-byte v14, v2, v11

    if-nez v14, :cond_8

    aget-byte v14, v2, v21

    if-nez v14, :cond_8

    aget-byte v12, v2, v12

    if-nez v12, :cond_8

    :goto_0
    add-int/lit8 v12, v9, -0x4

    if-ge v11, v12, :cond_7

    .line 114
    aget-byte v12, v2, v11

    if-nez v12, :cond_6

    add-int/lit8 v12, v11, 0x1

    aget-byte v12, v2, v12

    if-nez v12, :cond_6

    add-int/lit8 v12, v11, 0x2

    aget-byte v12, v2, v12

    if-nez v12, :cond_6

    add-int/lit8 v12, v11, 0x3

    aget-byte v12, v2, v12

    if-ne v12, v7, :cond_6

    sub-int/2addr v9, v11

    goto :goto_1

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_7
    move v11, v5

    .line 115
    :goto_1
    new-array v12, v9, [B

    .line 116
    invoke-static {v2, v11, v12, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_8
    move-object v12, v2

    .line 117
    :goto_2
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    const/4 v11, 0x0

    if-nez v9, :cond_b

    .line 118
    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_a

    .line 119
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    if-eqz v0, :cond_9

    .line 120
    invoke-interface {v0, v11, v5}, Lcom/tencent/liteav/videoencoder/c;->a(Lcom/tencent/liteav/basic/structs/TXSNALPacket;I)V

    :cond_9
    :goto_3
    move/from16 v22, v4

    move v3, v5

    :goto_4
    move-object/from16 v34, v10

    goto/16 :goto_e

    :cond_a
    move v6, v3

    goto :goto_3

    .line 121
    :cond_b
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v14, v9, 0x2

    if-ne v14, v13, :cond_d

    .line 122
    iget-boolean v0, v1, Lcom/tencent/liteav/videoencoder/a;->g:Z

    if-eqz v0, :cond_c

    .line 123
    invoke-virtual {v12}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->C:[B

    goto :goto_5

    .line 124
    :cond_c
    invoke-virtual {v12}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoencoder/a;->a([B)[B

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->C:[B

    :goto_5
    move/from16 v22, v4

    move v3, v5

    move v6, v7

    goto :goto_4

    :cond_d
    and-int/2addr v9, v7

    if-ne v9, v7, :cond_f

    .line 125
    iput v3, v1, Lcom/tencent/liteav/videoencoder/a;->G:I

    .line 126
    iget-boolean v3, v1, Lcom/tencent/liteav/videoencoder/a;->g:Z

    if-eqz v3, :cond_e

    .line 127
    iget-object v3, v1, Lcom/tencent/liteav/videoencoder/a;->C:[B

    array-length v9, v3

    array-length v13, v12

    add-int/2addr v9, v13

    new-array v9, v9, [B

    .line 128
    array-length v13, v3

    invoke-static {v3, v5, v9, v5, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    iget-object v3, v1, Lcom/tencent/liteav/videoencoder/a;->C:[B

    array-length v3, v3

    array-length v13, v12

    invoke-static {v12, v5, v9, v3, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v3, v5

    move-object v12, v9

    goto :goto_6

    .line 130
    :cond_e
    invoke-direct {v1, v12}, Lcom/tencent/liteav/videoencoder/a;->a([B)[B

    move-result-object v3

    .line 131
    iget-object v9, v1, Lcom/tencent/liteav/videoencoder/a;->C:[B

    array-length v12, v9

    array-length v13, v3

    add-int/2addr v12, v13

    new-array v12, v12, [B

    .line 132
    array-length v13, v9

    invoke-static {v9, v5, v12, v5, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    iget-object v9, v1, Lcom/tencent/liteav/videoencoder/a;->C:[B

    array-length v9, v9

    array-length v13, v3

    invoke-static {v3, v5, v12, v9, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v3, v5

    goto :goto_6

    .line 134
    :cond_f
    iget-boolean v3, v1, Lcom/tencent/liteav/videoencoder/a;->g:Z

    if-nez v3, :cond_10

    .line 135
    invoke-direct {v1, v12}, Lcom/tencent/liteav/videoencoder/a;->a([B)[B

    move-result-object v12

    :cond_10
    move v3, v7

    .line 136
    :goto_6
    iget-boolean v9, v1, Lcom/tencent/liteav/videoencoder/a;->L:Z

    if-nez v9, :cond_11

    iget v9, v1, Lcom/tencent/liteav/videoencoder/a;->G:I

    add-int/2addr v9, v7

    iput v9, v1, Lcom/tencent/liteav/videoencoder/a;->G:I

    iget v13, v1, Lcom/tencent/liteav/videoencoder/a;->f:I

    iget v14, v1, Lcom/tencent/liteav/videoencoder/a;->H:I

    mul-int/2addr v13, v14

    if-ne v9, v13, :cond_11

    .line 137
    invoke-direct {v1}, Lcom/tencent/liteav/videoencoder/a;->f()V

    .line 138
    :cond_11
    invoke-direct {v1}, Lcom/tencent/liteav/videoencoder/a;->a()J

    move-result-wide v13

    .line 139
    iget-wide v5, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v15, 0x3e8

    div-long/2addr v5, v15

    move-object/from16 v17, v10

    .line 140
    iget-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->F:J

    move-object/from16 v23, v8

    const-wide/16 v7, 0x0

    cmp-long v9, v9, v7

    if-nez v9, :cond_12

    iput-wide v13, v1, Lcom/tencent/liteav/videoencoder/a;->F:J

    .line 141
    :cond_12
    iget-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->E:J

    cmp-long v9, v9, v7

    if-nez v9, :cond_13

    iput-wide v5, v1, Lcom/tencent/liteav/videoencoder/a;->E:J

    .line 142
    :cond_13
    iget-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->F:J

    move-object/from16 v25, v12

    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->E:J

    sub-long/2addr v9, v11

    add-long/2addr v5, v9

    .line 143
    iget-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->m:J

    cmp-long v11, v13, v9

    const-wide/16 v26, 0x1

    if-gtz v11, :cond_14

    add-long v13, v9, v26

    :cond_14
    cmp-long v9, v13, v5

    if-lez v9, :cond_15

    move-wide v13, v5

    .line 144
    :cond_15
    iput-wide v13, v1, Lcom/tencent/liteav/videoencoder/a;->m:J

    .line 145
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v9

    if-nez v3, :cond_18

    .line 146
    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->d:J

    add-long/2addr v15, v11

    cmp-long v13, v9, v15

    if-lez v13, :cond_16

    .line 147
    iget-wide v13, v1, Lcom/tencent/liteav/videoencoder/a;->o:J

    long-to-double v13, v13

    const-wide v15, 0x40bf400000000000L    # 8000.0

    mul-double/2addr v13, v15

    sub-long v11, v9, v11

    long-to-double v11, v11

    div-double/2addr v13, v11

    const-wide/high16 v11, 0x4090000000000000L    # 1024.0

    div-double/2addr v13, v11

    double-to-long v11, v13

    iput-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->b:J

    .line 148
    iput-wide v7, v1, Lcom/tencent/liteav/videoencoder/a;->o:J

    .line 149
    iput-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->d:J

    .line 150
    invoke-direct {v1}, Lcom/tencent/liteav/videoencoder/a;->g()V

    .line 151
    :cond_16
    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->j:J

    add-long v13, v11, v26

    iput-wide v13, v1, Lcom/tencent/liteav/videoencoder/a;->j:J

    const-wide/16 v15, 0x100

    .line 152
    rem-long/2addr v13, v15

    cmp-long v13, v13, v7

    if-nez v13, :cond_17

    const-wide/16 v13, 0x2

    add-long/2addr v11, v13

    .line 153
    iput-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->j:J

    .line 154
    :cond_17
    iput-wide v7, v1, Lcom/tencent/liteav/videoencoder/a;->k:J

    goto :goto_7

    .line 155
    :cond_18
    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->k:J

    add-long v11, v11, v26

    iput-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->k:J

    .line 156
    :goto_7
    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->o:J

    move-object/from16 v13, v25

    array-length v14, v13

    int-to-long v14, v14

    add-long/2addr v11, v14

    iput-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->o:J

    .line 157
    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->e:J

    const-wide/16 v14, 0x7d0

    add-long/2addr v14, v11

    cmp-long v14, v9, v14

    if-lez v14, :cond_1b

    .line 158
    iget-wide v14, v1, Lcom/tencent/liteav/videoencoder/a;->p:J

    long-to-double v14, v14

    const-wide v28, 0x408f400000000000L    # 1000.0

    mul-double v14, v14, v28

    sub-long v11, v9, v11

    long-to-double v11, v11

    div-double/2addr v14, v11

    iput-wide v14, v1, Lcom/tencent/liteav/videoencoder/a;->c:D

    .line 159
    iput-wide v7, v1, Lcom/tencent/liteav/videoencoder/a;->p:J

    .line 160
    iput-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->e:J

    .line 161
    iget-object v9, v1, Lcom/tencent/liteav/videoencoder/a;->W:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_19
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    .line 162
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    cmp-long v11, v11, v7

    if-lez v11, :cond_19

    .line 163
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_8

    .line 164
    :cond_1a
    iget-object v9, v1, Lcom/tencent/liteav/videoencoder/a;->W:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    const-wide/16 v9, 0x3

    mul-long/2addr v7, v9

    long-to-int v7, v7

    .line 165
    iput v7, v1, Lcom/tencent/liteav/videoencoder/a;->X:I

    .line 166
    :cond_1b
    iget-wide v7, v1, Lcom/tencent/liteav/videoencoder/a;->p:J

    add-long v7, v7, v26

    iput-wide v7, v1, Lcom/tencent/liteav/videoencoder/a;->p:J

    .line 167
    iget v7, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    move-object/from16 v8, v23

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 168
    iget-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->l:J

    add-long v9, v9, v26

    iput-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->l:J

    .line 169
    iget-object v7, v1, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    if-eqz v7, :cond_1c

    .line 170
    iget-wide v9, v1, Lcom/tencent/liteav/videoencoder/a;->j:J

    iget-wide v11, v1, Lcom/tencent/liteav/videoencoder/a;->k:J

    const/16 v29, 0x2

    move-object/from16 v28, v7

    move-wide/from16 v30, v9

    move-wide/from16 v32, v11

    invoke-interface/range {v28 .. v33}, Lcom/tencent/liteav/videoencoder/c;->a(IJJ)V

    .line 171
    :cond_1c
    iget-boolean v7, v1, Lcom/tencent/liteav/videoencoder/a;->h:Z

    if-eqz v7, :cond_1e

    move-object/from16 v25, v13

    move-wide v12, v5

    move v6, v4

    .line 172
    iget-wide v4, v1, Lcom/tencent/liteav/videoencoder/a;->j:J

    move v2, v6

    iget-wide v6, v1, Lcom/tencent/liteav/videoencoder/a;->k:J

    move-object/from16 v23, v8

    iget-wide v8, v1, Lcom/tencent/liteav/videoencoder/a;->l:J

    if-nez v3, :cond_1d

    move-wide v10, v6

    goto :goto_9

    :cond_1d
    sub-long v10, v6, v26

    :goto_9
    const/16 v16, 0x0

    move-wide v14, v12

    move-object/from16 v18, v0

    move/from16 v22, v2

    move-object/from16 v34, v17

    move-object/from16 v17, v23

    move-object/from16 v2, v25

    const/4 v0, 0x0

    const/16 v23, -0x2

    const/16 v24, 0x1

    invoke-virtual/range {v1 .. v18}, Lcom/tencent/liteav/videoencoder/b;->callDelegate([BIJJJJJJILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    :goto_a
    move-object/from16 v2, v18

    goto :goto_c

    :cond_1e
    move-object/from16 v18, v0

    move/from16 v22, v4

    move-wide v12, v5

    move-object/from16 v34, v17

    const/4 v0, 0x0

    const/16 v23, -0x2

    const/16 v24, 0x1

    move-object/from16 v17, v8

    .line 173
    iget-wide v4, v1, Lcom/tencent/liteav/videoencoder/a;->j:J

    iget-wide v6, v1, Lcom/tencent/liteav/videoencoder/a;->k:J

    iget-wide v8, v1, Lcom/tencent/liteav/videoencoder/a;->l:J

    if-nez v3, :cond_1f

    move-wide v10, v6

    goto :goto_b

    :cond_1f
    sub-long v10, v6, v26

    :goto_b
    const/16 v16, 0x0

    move-wide v14, v12

    invoke-virtual/range {v1 .. v18}, Lcom/tencent/liteav/videoencoder/b;->callDelegate([BIJJJJJJILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    goto :goto_a

    .line 174
    :goto_c
    iget v3, v1, Lcom/tencent/liteav/videoencoder/a;->P:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v1, Lcom/tencent/liteav/videoencoder/a;->P:I

    .line 175
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_20

    .line 176
    iget-object v2, v1, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    const/4 v3, 0x0

    if-eqz v2, :cond_21

    .line 177
    invoke-interface {v2, v0, v3}, Lcom/tencent/liteav/videoencoder/c;->a(Lcom/tencent/liteav/basic/structs/TXSNALPacket;I)V

    goto :goto_d

    :cond_20
    const/4 v3, 0x0

    move/from16 v23, v24

    .line 178
    :cond_21
    :goto_d
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v4

    .line 179
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->W:Ljava/util/ArrayList;

    sub-long v4, v4, v19

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v6, v23

    .line 180
    :goto_e
    :try_start_1
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    if-eqz v0, :cond_22

    move/from16 v2, v22

    .line 181
    invoke-virtual {v0, v2, v3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    return v6

    :catch_0
    move-exception v0

    goto :goto_f

    :cond_22
    return v6

    .line 182
    :goto_f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "releaseOutputBuffer failed."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v10, v34

    invoke-static {v10, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :catch_1
    move-exception v0

    move-object v10, v2

    .line 183
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dequeueOutputBuffer failed."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3
.end method

.method private a(II[B[BI)I
    .locals 3

    if-lez p2, :cond_0

    if-le p1, p2, :cond_0

    sub-int/2addr p1, p2

    const/4 v0, 0x4

    .line 194
    :try_start_0
    new-array v1, v0, [B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/nio/IntBuffer;->put(I)Ljava/nio/IntBuffer;

    .line 196
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 197
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2, p3, p5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v1, p5, 0x4

    .line 198
    invoke-static {p4, p2, p3, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p1, v0

    add-int/2addr p5, p1

    return p5

    .line 199
    :catch_0
    const-string p1, "TXCHWVideoEncoder"

    const-string p2, "setNalData exception"

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return p5
.end method

.method private a()J
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->v:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 40
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private static a(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 32
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    .line 33
    invoke-static {v2}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v3

    .line 34
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 35
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v4

    .line 36
    array-length v5, v4

    move v6, v1

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 37
    invoke-virtual {v7, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private a(IIIII)Landroid/media/MediaFormat;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "video/avc"

    invoke-static {v0, p1, p2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p1

    mul-int/lit16 p3, p3, 0x400

    .line 7
    const-string p2, "bitrate"

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 8
    const-string p2, "frame-rate"

    invoke-virtual {p1, p2, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 9
    const-string p2, "color-format"

    const p3, 0x7f000789

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 10
    const-string p2, "i-frame-interval"

    invoke-virtual {p1, p2, p5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(IIIIIIIZ)Landroid/media/MediaFormat;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 11
    invoke-direct/range {p0 .. p5}, Lcom/tencent/liteav/videoencoder/a;->a(IIIII)Landroid/media/MediaFormat;

    move-result-object p1

    move-object p2, p0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 12
    :cond_0
    const-string p3, "video/avc"

    invoke-static {p3}, Lcom/tencent/liteav/videoencoder/a;->a(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    move-result-object p4

    if-nez p4, :cond_1

    goto/16 :goto_2

    .line 13
    :cond_1
    invoke-virtual {p4, p3}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object p3

    .line 14
    invoke-virtual {p3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getEncoderCapabilities()Landroid/media/MediaCodecInfo$EncoderCapabilities;

    move-result-object p4

    .line 15
    const-string p5, "bitrate-mode"

    if-eqz p8, :cond_2

    .line 16
    invoke-virtual {p1, p5, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p4, p6}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result p8

    if-eqz p8, :cond_3

    .line 18
    invoke-virtual {p1, p5, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_0

    .line 19
    :cond_3
    iget-boolean p6, p2, Lcom/tencent/liteav/videoencoder/a;->L:Z

    const/4 p8, 0x2

    if-eqz p6, :cond_5

    const/4 p6, 0x1

    .line 20
    invoke-virtual {p4, p6}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 21
    invoke-virtual {p1, p5, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_0

    .line 22
    :cond_4
    invoke-virtual {p4, p8}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result p6

    if-eqz p6, :cond_6

    .line 23
    invoke-virtual {p1, p5, p8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_0

    .line 24
    :cond_5
    invoke-virtual {p4, p8}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result p6

    if-eqz p6, :cond_6

    .line 25
    invoke-virtual {p1, p5, p8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 26
    :cond_6
    :goto_0
    invoke-virtual {p4}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->getComplexityRange()Landroid/util/Range;

    move-result-object p4

    const/4 p5, 0x5

    .line 27
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    const-string p5, "complexity"

    invoke-virtual {p1, p5, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 28
    iget-object p3, p3, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    array-length p4, p3

    const/4 p5, 0x0

    move p6, p5

    :goto_1
    if-ge p5, p4, :cond_8

    aget-object p8, p3, p5

    .line 29
    iget v0, p8, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    if-gt v0, p7, :cond_7

    if-le v0, p6, :cond_7

    .line 30
    const-string p6, "profile"

    invoke-virtual {p1, p6, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 31
    const-string p6, "level"

    iget p8, p8, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    invoke-virtual {p1, p6, p8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    move p6, v0

    :cond_7
    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    :cond_8
    :goto_2
    return-object p1
.end method

.method private a(J)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->v:Ljava/util/ArrayDeque;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoencoder/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->e()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoencoder/a;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoencoder/a;->d(I)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoencoder/a;J)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/videoencoder/a;->a(J)V

    return-void
.end method

.method private a(Landroid/view/Surface;II)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 41
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HWVideoEncode createGL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/b;->mGLContextExternal:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TXCHWVideoEncoder"

    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/b;->mGLContextExternal:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    instance-of v3, v1, Landroid/opengl/EGLContext;

    if-eqz v3, :cond_1

    .line 43
    check-cast v1, Landroid/opengl/EGLContext;

    invoke-static {v2, v1, p1, p2, p3}, Lcom/tencent/liteav/basic/c/b;->a(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/liteav/basic/c/b;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    goto :goto_0

    .line 44
    :cond_1
    check-cast v1, Ljavax/microedition/khronos/egl/EGLContext;

    invoke-static {v2, v1, p1, p2, p3}, Lcom/tencent/liteav/basic/c/a;->a(Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/liteav/basic/c/a;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    .line 45
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    if-nez p1, :cond_2

    return v0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 46
    invoke-static {v1, v1, v1, p1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 47
    new-instance p1, Lcom/tencent/liteav/basic/c/f;

    invoke-direct {p1}, Lcom/tencent/liteav/basic/c/f;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    .line 48
    sget-object v1, Lcom/tencent/liteav/basic/c/i;->e:[F

    sget-object v3, Lcom/tencent/liteav/basic/c/h;->a:Lcom/tencent/liteav/basic/c/h;

    invoke-static {v3, v0, v0}, Lcom/tencent/liteav/basic/c/i;->a(Lcom/tencent/liteav/basic/c/h;ZZ)[F

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/tencent/liteav/basic/c/f;->a([F[F)V

    .line 49
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    invoke-virtual {p1}, Lcom/tencent/liteav/basic/c/f;->a()Z

    move-result p1

    if-nez p1, :cond_3

    .line 50
    iput-object v2, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    return v0

    .line 51
    :cond_3
    invoke-static {v0, v0, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const/4 p1, 0x1

    return p1
.end method

.method private a(Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;)Z
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 53
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    const-wide/16 v1, 0x0

    .line 54
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->b:J

    const-wide/16 v3, 0x0

    .line 55
    iput-wide v3, p0, Lcom/tencent/liteav/videoencoder/a;->c:D

    .line 56
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->d:J

    .line 57
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->e:J

    .line 58
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->f:I

    .line 59
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    .line 60
    iget-wide v3, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->baseGopIndex:J

    iput-wide v3, p0, Lcom/tencent/liteav/videoencoder/a;->j:J

    .line 61
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->k:J

    .line 62
    iget-wide v3, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->baseFrameIndex:J

    iput-wide v3, p0, Lcom/tencent/liteav/videoencoder/a;->l:J

    .line 63
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->m:J

    .line 64
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->o:J

    .line 65
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->p:J

    const/4 v3, 0x0

    .line 66
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;

    .line 67
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->C:[B

    .line 68
    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    const/4 v1, -0x1

    .line 69
    iput v1, p0, Lcom/tencent/liteav/videoencoder/a;->G:I

    .line 70
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->width:I

    iput v2, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 71
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->height:I

    iput v2, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 72
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->gop:I

    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->H:I

    .line 73
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->fps:I

    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->I:I

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "init with fps "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/tencent/liteav/videoencoder/a;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "TXCHWVideoEncoder"

    invoke-static {v3, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-boolean v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->fullIFrame:Z

    iput-boolean v2, p0, Lcom/tencent/liteav/videoencoder/a;->L:Z

    .line 76
    iget-boolean v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->syncOutput:Z

    iput-boolean v2, p0, Lcom/tencent/liteav/videoencoder/a;->n:Z

    .line 77
    iget-boolean v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->enableEGL14:Z

    iput-boolean v2, p0, Lcom/tencent/liteav/videoencoder/a;->A:Z

    .line 78
    iget-boolean v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->forceSetBitrateMode:Z

    iput-boolean v2, p0, Lcom/tencent/liteav/videoencoder/a;->N:Z

    .line 79
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->v:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->clear()V

    .line 80
    iget-boolean v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->bLimitFps:Z

    iput-boolean v2, p0, Lcom/tencent/liteav/videoencoder/a;->M:Z

    .line 81
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->width:I

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    iget v4, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->height:I

    if-eqz v4, :cond_8

    iget v5, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->fps:I

    if-eqz v5, :cond_8

    iget v5, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->gop:I

    if-nez v5, :cond_0

    goto :goto_1

    .line 82
    :cond_0
    iget-boolean v5, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->annexb:Z

    iput-boolean v5, p0, Lcom/tencent/liteav/videoencoder/a;->g:Z

    .line 83
    iget-boolean v5, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->appendSpsPps:Z

    iput-boolean v5, p0, Lcom/tencent/liteav/videoencoder/a;->h:Z

    .line 84
    iget v5, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    if-nez v5, :cond_1

    mul-int/2addr v2, v2

    int-to-double v5, v2

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v5, v7

    mul-int/2addr v4, v4

    int-to-double v7, v4

    add-double/2addr v5, v7

    .line 85
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide v6, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v4, v6

    double-to-int v2, v4

    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    .line 86
    :cond_1
    iget v2, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    int-to-long v4, v2

    iput-wide v4, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    .line 87
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->fps:I

    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->f:I

    .line 88
    iget v2, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->encoderMode:I

    const/4 v4, 0x2

    if-eq v2, v3, :cond_4

    if-eq v2, v4, :cond_3

    const/4 v5, 0x3

    if-eq v2, v5, :cond_2

    goto :goto_0

    :cond_2
    move v4, v0

    goto :goto_0

    :cond_3
    move v4, v3

    .line 89
    :cond_4
    :goto_0
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/basic/d/c;->c()I

    move-result v2

    if-ne v2, v3, :cond_5

    .line 90
    iput v3, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->encoderProfile:I

    .line 91
    :cond_5
    iput v4, p0, Lcom/tencent/liteav/videoencoder/a;->J:I

    .line 92
    iput v3, p0, Lcom/tencent/liteav/videoencoder/a;->K:I

    .line 93
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->c()Z

    move-result p1

    if-nez p1, :cond_6

    return v0

    .line 94
    :cond_6
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/b;->mInit:Z

    .line 95
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->M:Z

    if-eqz p1, :cond_7

    .line 96
    iput v1, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    .line 97
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/a;->t:Ljava/lang/Runnable;

    invoke-virtual {p1, v1}, Lcom/tencent/liteav/basic/util/f;->b(Ljava/lang/Runnable;)V

    .line 98
    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->W:Ljava/util/ArrayList;

    .line 99
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->X:I

    return v3

    .line 100
    :cond_8
    :goto_1
    iput-boolean v3, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    return v0
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoencoder/a;Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoencoder/a;->a(Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoencoder/a;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    return p1
.end method

.method private a([B)[B
    .locals 10

    .line 184
    array-length v0, p1

    add-int/lit8 v1, v0, 0x14

    .line 185
    new-array v5, v1, [B

    const/4 v1, 0x0

    move v3, v1

    move v4, v3

    move v7, v4

    :goto_0
    if-ge v3, v0, :cond_4

    .line 186
    aget-byte v8, p1, v3

    const/4 v9, 0x1

    if-nez v8, :cond_0

    add-int/lit8 v2, v3, 0x1

    aget-byte v2, p1, v2

    if-nez v2, :cond_0

    add-int/lit8 v2, v3, 0x2

    aget-byte v2, p1, v2

    if-ne v2, v9, :cond_0

    move-object v2, p0

    move-object v6, p1

    .line 187
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/videoencoder/a;->a(II[B[BI)I

    move-result v7

    add-int/lit8 v3, v3, 0x3

    :goto_1
    move v4, v3

    goto :goto_2

    :cond_0
    move-object v6, p1

    if-nez v8, :cond_1

    add-int/lit8 p1, v3, 0x1

    .line 188
    aget-byte p1, v6, p1

    if-nez p1, :cond_1

    add-int/lit8 p1, v3, 0x2

    aget-byte p1, v6, p1

    if-nez p1, :cond_1

    add-int/lit8 p1, v3, 0x3

    aget-byte p1, v6, p1

    if-ne p1, v9, :cond_1

    move-object v2, p0

    .line 189
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/videoencoder/a;->a(II[B[BI)I

    move-result v7

    add-int/lit8 v3, v3, 0x4

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 p1, v0, -0x4

    if-ne v3, p1, :cond_3

    add-int/lit8 p1, v3, 0x1

    .line 190
    aget-byte p1, v6, p1

    if-nez p1, :cond_2

    add-int/lit8 p1, v3, 0x2

    aget-byte p1, v6, p1

    if-nez p1, :cond_2

    add-int/lit8 p1, v3, 0x3

    aget-byte p1, v6, p1

    if-eq p1, v9, :cond_3

    :cond_2
    move v3, v0

    :goto_3
    move-object v2, p0

    goto :goto_4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    move-object p1, v6

    goto :goto_0

    :cond_4
    move-object v6, p1

    goto :goto_3

    .line 191
    :goto_4
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/videoencoder/a;->a(II[B[BI)I

    move-result p1

    .line 192
    new-array v0, p1, [B

    .line 193
    invoke-static {v5, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static synthetic b(Lcom/tencent/liteav/videoencoder/a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/liteav/videoencoder/a;->ad:J

    return-wide p1
.end method

.method private b()V
    .locals 3

    .line 4
    const-string v0, "TXCHWVideoEncoder"

    const-string v1, "HWVideoEncode destroyGL"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/f;->d()V

    .line 7
    iput-object v1, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    instance-of v2, v0, Lcom/tencent/liteav/basic/c/a;

    if-eqz v2, :cond_1

    .line 9
    check-cast v0, Lcom/tencent/liteav/basic/c/a;

    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/a;->c()V

    .line 10
    iput-object v1, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    instance-of v2, v0, Lcom/tencent/liteav/basic/c/b;

    if-eqz v2, :cond_2

    .line 12
    check-cast v0, Lcom/tencent/liteav/basic/c/b;

    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/b;->c()V

    .line 13
    iput-object v1, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private b(I)V
    .locals 12
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 14
    iget-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    const/4 v1, 0x1

    if-eq v0, v1, :cond_d

    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 15
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    .line 16
    iget-boolean v2, p0, Lcom/tencent/liteav/videoencoder/a;->M:Z

    const/4 v3, -0x1

    if-eqz v2, :cond_2

    .line 17
    iput v3, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    if-ne v0, v3, :cond_1

    .line 18
    iput-boolean v1, p0, Lcom/tencent/liteav/videoencoder/a;->V:Z

    return-void

    .line 19
    :cond_1
    iget v2, p0, Lcom/tencent/liteav/videoencoder/a;->T:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->T:I

    .line 20
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    iget-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->t:Ljava/lang/Runnable;

    const/16 v5, 0x3e8

    iget v6, p0, Lcom/tencent/liteav/videoencoder/a;->I:I

    div-int/2addr v5, v6

    int-to-long v5, v5

    invoke-virtual {v2, v4, v5, v6}, Lcom/tencent/liteav/basic/util/f;->a(Ljava/lang/Runnable;J)V

    .line 21
    :cond_2
    iget-wide v4, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/videoencoder/a;->a(J)V

    .line 22
    iget v2, p0, Lcom/tencent/liteav/videoencoder/b;->mRotation:I

    rsub-int v2, v2, 0x2d0

    rem-int/lit16 v7, v2, 0x168

    const/16 v2, 0x10e

    const/16 v4, 0x5a

    if-eq v7, v4, :cond_4

    if-ne v7, v2, :cond_3

    goto :goto_0

    .line 23
    :cond_3
    iget v5, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    goto :goto_1

    :cond_4
    :goto_0
    iget v5, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    :goto_1
    if-eq v7, v4, :cond_6

    if-ne v7, v2, :cond_5

    goto :goto_2

    .line 24
    :cond_5
    iget v2, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    goto :goto_3

    :cond_6
    :goto_2
    iget v2, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 25
    :goto_3
    iget-object v4, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    move v6, v5

    iget v5, p0, Lcom/tencent/liteav/videoencoder/b;->mInputWidth:I

    move v8, v6

    iget v6, p0, Lcom/tencent/liteav/videoencoder/b;->mInputHeight:I

    int-to-float v8, v8

    int-to-float v2, v2

    div-float v9, v8, v2

    iget-boolean v10, p0, Lcom/tencent/liteav/videoencoder/b;->mEnableXMirror:Z

    const/4 v11, 0x1

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v11}, Lcom/tencent/liteav/basic/c/f;->a(III[FFZZ)V

    .line 26
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

    invoke-virtual {v2, v0}, Lcom/tencent/liteav/basic/c/f;->a(I)I

    .line 27
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    instance-of v2, v0, Lcom/tencent/liteav/basic/c/b;

    if-eqz v2, :cond_7

    .line 28
    check-cast v0, Lcom/tencent/liteav/basic/c/b;

    iget-wide v4, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    const-wide/32 v6, 0xf4240

    mul-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Lcom/tencent/liteav/basic/c/b;->a(J)V

    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/tencent/liteav/basic/c/b;

    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/b;->d()Z

    .line 30
    :cond_7
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    instance-of v2, v0, Lcom/tencent/liteav/basic/c/a;

    if-eqz v2, :cond_8

    .line 31
    check-cast v0, Lcom/tencent/liteav/basic/c/a;

    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/a;->a()Z

    .line 32
    :cond_8
    :goto_4
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoencoder/a;->a(I)I

    move-result v0

    if-lez v0, :cond_9

    goto :goto_4

    :cond_9
    if-eq v0, v3, :cond_b

    const/4 p1, -0x2

    if-ne v0, p1, :cond_a

    goto :goto_5

    .line 33
    :cond_a
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    return-void

    :cond_b
    :goto_5
    if-ne v0, v3, :cond_c

    const p1, 0x989685

    .line 34
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoencoder/b;->callDelegate(I)V

    .line 35
    :cond_c
    iput-boolean v1, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    .line 36
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->e()V

    :cond_d
    :goto_6
    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/videoencoder/a;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoencoder/a;->c(I)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/videoencoder/a;)Z
    .locals 0

    .line 3
    iget-boolean p0, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/videoencoder/a;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoencoder/a;->a(I)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/videoencoder/a;)Ljava/lang/Object;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/videoencoder/a;->w:Ljava/lang/Object;

    return-object p0
.end method

.method private c(I)V
    .locals 8

    .line 48
    iget-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    int-to-long v2, p1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    int-to-long v2, p1

    cmp-long p1, v2, v0

    const/4 v0, 0x0

    if-gez p1, :cond_2

    .line 49
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->ac:Z

    if-eqz p1, :cond_2

    .line 50
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->ab:Z

    if-eqz p1, :cond_1

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "restart video hw encoder when down bps\u3002[module:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [Hardware:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [osVersion:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    const-string v1, "TXCHWVideoEncoder"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 53
    const-string v2, ""

    invoke-static {v1, p1, v2, v0}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x3

    .line 54
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->Z:I

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->Y:J

    .line 56
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->aa:I

    .line 57
    :cond_2
    :goto_0
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    int-to-long v1, p1

    iput-wide v1, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    .line 58
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    if-eqz p1, :cond_5

    if-eqz v0, :cond_4

    .line 59
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    invoke-virtual {p1}, Lcom/tencent/liteav/basic/util/f;->a()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->ae:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 61
    iget-wide v2, p0, Lcom/tencent/liteav/videoencoder/a;->ad:J

    sub-long v4, v0, v2

    const-wide/16 v6, 0x7d0

    cmp-long p1, v4, v6

    if-ltz p1, :cond_3

    .line 62
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->ae:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 63
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    iget-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->ae:Ljava/lang/Runnable;

    sub-long/2addr v0, v2

    sub-long/2addr v6, v0

    invoke-virtual {p1, v4, v6, v7}, Lcom/tencent/liteav/basic/util/f;->a(Ljava/lang/Runnable;J)V

    return-void

    .line 64
    :cond_4
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 65
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    mul-int/lit16 v0, v0, 0x400

    const-string v1, "video-bitrate"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 66
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private c()Z
    .locals 18

    move-object/from16 v1, p0

    .line 3
    const-string v10, "TXCHWVideoEncoder"

    .line 4
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    move-result-object v0

    const-string v2, "Video"

    const-string v3, "CheckVideoEncDownBps"

    invoke-virtual {v0, v2, v3}, Lcom/tencent/liteav/basic/d/c;->a(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-lez v0, :cond_0

    move v0, v12

    goto :goto_0

    :cond_0
    move v0, v11

    .line 5
    :goto_0
    iput-boolean v0, v1, Lcom/tencent/liteav/videoencoder/a;->ac:Z

    .line 6
    iput v11, v1, Lcom/tencent/liteav/videoencoder/a;->O:I

    .line 7
    iput v11, v1, Lcom/tencent/liteav/videoencoder/a;->P:I

    .line 8
    iput-wide v4, v1, Lcom/tencent/liteav/videoencoder/a;->R:J

    .line 9
    iput v11, v1, Lcom/tencent/liteav/videoencoder/a;->S:I

    .line 10
    iput v11, v1, Lcom/tencent/liteav/videoencoder/a;->Q:I

    .line 11
    iput v11, v1, Lcom/tencent/liteav/videoencoder/a;->T:I

    const/4 v13, 0x5

    const/4 v14, 0x0

    .line 12
    :try_start_0
    iget v2, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    iget v3, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    iget v4, v1, Lcom/tencent/liteav/videoencoder/a;->a:I

    iget v5, v1, Lcom/tencent/liteav/videoencoder/a;->I:I

    iget v6, v1, Lcom/tencent/liteav/videoencoder/a;->H:I

    iget v7, v1, Lcom/tencent/liteav/videoencoder/a;->J:I

    iget v8, v1, Lcom/tencent/liteav/videoencoder/a;->K:I

    iget-boolean v9, v1, Lcom/tencent/liteav/videoencoder/a;->N:Z

    invoke-direct/range {v1 .. v9}, Lcom/tencent/liteav/videoencoder/a;->a(IIIIIIIZ)Landroid/media/MediaFormat;

    move-result-object v2

    if-nez v2, :cond_1

    .line 13
    iput-boolean v12, v1, Lcom/tencent/liteav/videoencoder/a;->y:Z

    return v11

    :catch_0
    move-exception v0

    move v15, v12

    goto/16 :goto_5

    .line 14
    :cond_1
    const-string v0, "video/avc"

    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v15, 0x2

    .line 15
    :try_start_1
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/b;->mEncFmt:Lorg/json/JSONArray;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz v0, :cond_2

    move v0, v11

    .line 16
    :goto_1
    :try_start_2
    iget-object v3, v1, Lcom/tencent/liteav/videoencoder/b;->mEncFmt:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 17
    iget-object v3, v1, Lcom/tencent/liteav/videoencoder/b;->mEncFmt:Lorg/json/JSONArray;

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 18
    const-string v4, "key"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 19
    const-string v5, "value"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    .line 20
    invoke-virtual {v2, v4, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 21
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "config custom format error "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_5

    .line 22
    :cond_2
    :goto_2
    :try_start_4
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0, v2, v14, v14, v12}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "configure format =  "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/media/MediaFormat;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_4

    :catch_3
    move-exception v0

    move-object v2, v0

    .line 24
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    iget-boolean v0, v1, Lcom/tencent/liteav/videoencoder/a;->N:Z

    if-eqz v0, :cond_5

    move-object v3, v2

    .line 26
    iget v2, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    move-object v4, v3

    iget v3, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    move-object v5, v4

    iget v4, v1, Lcom/tencent/liteav/videoencoder/a;->a:I

    move-object v6, v5

    iget v5, v1, Lcom/tencent/liteav/videoencoder/a;->I:I

    move-object v7, v6

    iget v6, v1, Lcom/tencent/liteav/videoencoder/a;->H:I

    move-object v8, v7

    iget v7, v1, Lcom/tencent/liteav/videoencoder/a;->J:I

    move-object v9, v8

    iget v8, v1, Lcom/tencent/liteav/videoencoder/a;->K:I

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v16

    invoke-direct/range {v1 .. v9}, Lcom/tencent/liteav/videoencoder/a;->a(IIIIIIIZ)Landroid/media/MediaFormat;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 27
    :try_start_6
    iget-object v2, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v2, v0, v14, v14, v12}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 28
    :try_start_7
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    if-nez v2, :cond_3

    instance-of v0, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_4

    .line 29
    :cond_3
    iget v2, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    iget v3, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    iget v4, v1, Lcom/tencent/liteav/videoencoder/a;->a:I

    iget v5, v1, Lcom/tencent/liteav/videoencoder/a;->I:I

    iget v6, v1, Lcom/tencent/liteav/videoencoder/a;->H:I

    invoke-direct/range {v1 .. v6}, Lcom/tencent/liteav/videoencoder/a;->a(IIIII)Landroid/media/MediaFormat;

    move-result-object v0

    .line 30
    iget-object v2, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v2, v0, v14, v14, v12}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 31
    :cond_4
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_4

    :cond_5
    move-object v3, v2

    .line 32
    instance-of v0, v3, Ljava/lang/IllegalArgumentException;

    if-nez v0, :cond_7

    instance-of v0, v3, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_6

    goto :goto_3

    .line 33
    :cond_6
    throw v3

    .line 34
    :cond_7
    :goto_3
    iget v2, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    iget v3, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    iget v4, v1, Lcom/tencent/liteav/videoencoder/a;->a:I

    iget v5, v1, Lcom/tencent/liteav/videoencoder/a;->I:I

    iget v6, v1, Lcom/tencent/liteav/videoencoder/a;->H:I

    invoke-direct/range {v1 .. v6}, Lcom/tencent/liteav/videoencoder/a;->a(IIIII)Landroid/media/MediaFormat;

    move-result-object v0

    .line 35
    iget-object v2, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v2, v0, v14, v14, v12}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    :goto_4
    const/4 v15, 0x3

    .line 36
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    const/4 v15, 0x4

    .line 37
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 38
    :try_start_8
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_6

    :catch_5
    move-exception v0

    move v15, v13

    .line 39
    :goto_5
    const-string v2, "create encode format failed."

    invoke-static {v10, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-lt v15, v13, :cond_8

    .line 40
    :try_start_9
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 41
    :cond_8
    iput-object v14, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    .line 42
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 43
    :cond_9
    iput-object v14, v1, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 44
    :catch_6
    :goto_6
    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    if-eqz v0, :cond_c

    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_c

    iget-object v0, v1, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    if-nez v0, :cond_a

    goto :goto_7

    .line 45
    :cond_a
    iget v2, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    iget v3, v1, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    invoke-direct {v1, v0, v2, v3}, Lcom/tencent/liteav/videoencoder/a;->a(Landroid/view/Surface;II)Z

    move-result v0

    if-nez v0, :cond_b

    .line 46
    iput-boolean v12, v1, Lcom/tencent/liteav/videoencoder/a;->y:Z

    return v11

    :cond_b
    return v12

    .line 47
    :cond_c
    :goto_7
    iput-boolean v12, v1, Lcom/tencent/liteav/videoencoder/a;->y:Z

    return v11
.end method

.method public static synthetic d(Lcom/tencent/liteav/videoencoder/a;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    return v0
.end method

.method private d()V
    .locals 5

    .line 3
    const-string v0, "release encoder failed."

    const-string v1, "TXCHWVideoEncoder"

    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    .line 4
    :try_start_0
    invoke-virtual {v2}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    .line 6
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 9
    :goto_1
    invoke-static {v1, v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_3

    :catch_1
    move-exception v2

    .line 10
    :try_start_2
    const-string v4, "stop encoder failed."

    invoke-static {v1, v4, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11
    :try_start_3
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    .line 12
    iget-object v2, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    if-eqz v2, :cond_2

    .line 13
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 14
    :cond_2
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 15
    :goto_2
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    return-void

    .line 16
    :goto_3
    :try_start_4
    iget-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 17
    iget-object v4, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;

    if-eqz v4, :cond_3

    .line 18
    invoke-virtual {v4}, Landroid/view/Surface;->release()V

    goto :goto_4

    :catch_2
    move-exception v3

    goto :goto_5

    .line 19
    :cond_3
    :goto_4
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->x:Landroid/view/Surface;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_6

    .line 20
    :goto_5
    invoke-static {v1, v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    :goto_6
    throw v2
.end method

.method private d(I)V
    .locals 2

    if-eqz p1, :cond_1

    .line 22
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->I:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "set fps "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", restart encoder."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXCHWVideoEncoder"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->b()V

    .line 25
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->d()V

    .line 26
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->I:I

    .line 27
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->c()Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic d(Lcom/tencent/liteav/videoencoder/a;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoencoder/a;->b(I)V

    return-void
.end method

.method public static synthetic e(Lcom/tencent/liteav/videoencoder/a;)Landroid/media/MediaCodec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    return-object p0
.end method

.method private e()V
    .locals 4

    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoencoder/b;->mInit:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->y:Z

    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->b()V

    .line 6
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->d()V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->b:J

    const-wide/16 v2, 0x0

    .line 9
    iput-wide v2, p0, Lcom/tencent/liteav/videoencoder/a;->c:D

    .line 10
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->d:J

    .line 11
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->e:J

    const/4 v2, 0x0

    .line 12
    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->f:I

    .line 13
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    .line 14
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->j:J

    .line 15
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->k:J

    .line 16
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->l:J

    .line 17
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->m:J

    .line 18
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->o:J

    .line 19
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->p:J

    const/4 v3, 0x0

    .line 20
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/b;->mGLContextExternal:Ljava/lang/Object;

    .line 21
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->B:[Ljava/nio/ByteBuffer;

    .line 22
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/a;->C:[B

    .line 23
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    .line 24
    iput v2, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 25
    iput v2, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 26
    iput-boolean v2, p0, Lcom/tencent/liteav/videoencoder/b;->mInit:Z

    .line 27
    iput-object v3, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 28
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->v:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 30
    iput v2, p0, Lcom/tencent/liteav/videoencoder/a;->X:I

    return-void
.end method

.method private f()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    const-string v1, "request-sync"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/a;->q:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static synthetic f(Lcom/tencent/liteav/videoencoder/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->b()V

    return-void
.end method

.method private g()V
    .locals 10

    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->Y:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 3
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->I:I

    iget-wide v4, p0, Lcom/tencent/liteav/videoencoder/a;->c:D

    double-to-int v1, v4

    sub-int v1, v0, v1

    .line 4
    div-int/lit8 v0, v0, 0x2

    const/4 v4, 0x5

    if-ge v0, v4, :cond_0

    move v0, v4

    :cond_0
    if-gt v1, v0, :cond_4

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 6
    iget-wide v4, p0, Lcom/tencent/liteav/videoencoder/a;->Y:J

    sub-long/2addr v0, v4

    iget v4, p0, Lcom/tencent/liteav/videoencoder/a;->Z:I

    rsub-int/lit8 v5, v4, 0x4

    mul-int/lit16 v5, v5, 0x7d0

    int-to-long v5, v5

    cmp-long v0, v0, v5

    if-lez v0, :cond_4

    .line 7
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->aa:I

    int-to-long v0, v0

    iget-wide v5, p0, Lcom/tencent/liteav/videoencoder/a;->b:J

    sub-long/2addr v0, v5

    .line 8
    iget-wide v5, p0, Lcom/tencent/liteav/videoencoder/a;->i:J

    const-wide/16 v7, 0x2

    div-long/2addr v5, v7

    const-wide/16 v7, 0x64

    cmp-long v9, v5, v7

    if-gez v9, :cond_1

    move-wide v5, v7

    :cond_1
    cmp-long v0, v0, v5

    const/4 v1, 0x1

    if-lez v0, :cond_3

    .line 9
    iput-boolean v1, p0, Lcom/tencent/liteav/videoencoder/a;->ab:Z

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "real bitrate is too much lower than target bitrate![targetBr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/videoencoder/a;->aa:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] [realBr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/tencent/liteav/videoencoder/a;->b:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]. restart encoder. [module:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [Hardware:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [osVersion:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    const-string v1, "TXCHWVideoEncoder"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    const-string v1, ""

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-static {v5, v0, v1, v4}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    if-eqz v0, :cond_2

    .line 14
    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/a;->ae:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/util/f;->b(Ljava/lang/Runnable;)V

    .line 15
    :cond_2
    iput-wide v2, p0, Lcom/tencent/liteav/videoencoder/a;->Y:J

    return-void

    :cond_3
    sub-int/2addr v4, v1

    .line 16
    iput v4, p0, Lcom/tencent/liteav/videoencoder/a;->Z:I

    if-gtz v4, :cond_4

    .line 17
    iput-wide v2, p0, Lcom/tencent/liteav/videoencoder/a;->Y:J

    :cond_4
    return-void
.end method

.method public static synthetic g(Lcom/tencent/liteav/videoencoder/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->d()V

    return-void
.end method

.method public static synthetic h(Lcom/tencent/liteav/videoencoder/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->c()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public getEncodeCost()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->X:I

    .line 2
    .line 3
    return v0
.end method

.method public getRealBitrate()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getRealFPS()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/videoencoder/a;->c:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public pushVideoFrame(IIIJ)J
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/32 p1, 0x989684

    .line 6
    .line 7
    .line 8
    return-wide p1

    .line 9
    :cond_0
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lcom/tencent/liteav/videoencoder/a;->Q:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/liteav/videoencoder/a;->Q:I

    .line 17
    .line 18
    iput-wide p4, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    .line 19
    .line 20
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    .line 21
    .line 22
    iput p2, p0, Lcom/tencent/liteav/videoencoder/b;->mInputWidth:I

    .line 23
    .line 24
    iput p3, p0, Lcom/tencent/liteav/videoencoder/b;->mInputHeight:I

    .line 25
    .line 26
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->L:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->f()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->M:Z

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->V:Z

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    :cond_2
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->T:I

    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->T:I

    .line 46
    .line 47
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 48
    .line 49
    iget-object p2, p0, Lcom/tencent/liteav/videoencoder/a;->t:Ljava/lang/Runnable;

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/basic/util/f;->b(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->V:Z

    .line 56
    .line 57
    :cond_3
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    .line 58
    .line 59
    iget p2, p0, Lcom/tencent/liteav/videoencoder/a;->P:I

    .line 60
    .line 61
    add-int/lit8 p2, p2, 0x1e

    .line 62
    .line 63
    const-string p3, "TXCHWVideoEncoder"

    .line 64
    .line 65
    if-le p1, p2, :cond_4

    .line 66
    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget p2, p0, Lcom/tencent/liteav/videoencoder/a;->P:I

    .line 72
    .line 73
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, "hw encoder error when render[%d] pop[%d]"

    .line 82
    .line 83
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 91
    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    iget p2, p0, Lcom/tencent/liteav/videoencoder/b;->mStreamType:I

    .line 95
    .line 96
    invoke-interface {p1, p2}, Lcom/tencent/liteav/videoencoder/c;->a(I)V

    .line 97
    .line 98
    .line 99
    :cond_4
    iget-wide p1, p0, Lcom/tencent/liteav/videoencoder/a;->R:J

    .line 100
    .line 101
    const-wide/16 p4, 0x1388

    .line 102
    .line 103
    add-long/2addr p1, p4

    .line 104
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 105
    .line 106
    .line 107
    move-result-wide p4

    .line 108
    cmp-long p1, p1, p4

    .line 109
    .line 110
    if-gez p1, :cond_6

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    .line 114
    .line 115
    move-result-wide p1

    .line 116
    iput-wide p1, p0, Lcom/tencent/liteav/videoencoder/a;->R:J

    .line 117
    .line 118
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->S:I

    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    iget p2, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    .line 123
    .line 124
    if-ne p1, p2, :cond_5

    .line 125
    .line 126
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->Q:I

    .line 127
    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget p2, p0, Lcom/tencent/liteav/videoencoder/a;->T:I

    .line 133
    .line 134
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    iget p4, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    .line 139
    .line 140
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    iget p5, p0, Lcom/tencent/liteav/videoencoder/a;->P:I

    .line 145
    .line 146
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p5

    .line 150
    filled-new-array {p1, p2, p4, p5}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const-string p2, "hw encoder error when push[%d] render task[%d] render[%d] pop[%d]"

    .line 155
    .line 156
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 164
    .line 165
    if-eqz p1, :cond_5

    .line 166
    .line 167
    iget p2, p0, Lcom/tencent/liteav/videoencoder/b;->mStreamType:I

    .line 168
    .line 169
    invoke-interface {p1, p2}, Lcom/tencent/liteav/videoencoder/c;->a(I)V

    .line 170
    .line 171
    .line 172
    :cond_5
    iget p1, p0, Lcom/tencent/liteav/videoencoder/a;->O:I

    .line 173
    .line 174
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->S:I

    .line 175
    .line 176
    :cond_6
    const-wide/16 p1, 0x0

    .line 177
    .line 178
    return-wide p1
.end method

.method public pushVideoFrameAsync(IIIJ)J
    .locals 0

    .line 1
    iget-boolean p2, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-wide/32 p1, 0x989684

    .line 6
    .line 7
    .line 8
    return-wide p1

    .line 9
    :cond_0
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 10
    .line 11
    .line 12
    iget-boolean p2, p0, Lcom/tencent/liteav/videoencoder/a;->L:Z

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->f()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p2, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/tencent/liteav/basic/util/f;->a()Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance p3, Lcom/tencent/liteav/videoencoder/a$8;

    .line 26
    .line 27
    invoke-direct {p3, p0, p1, p4, p5}, Lcom/tencent/liteav/videoencoder/a$8;-><init>(Lcom/tencent/liteav/videoencoder/a;IJ)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    const-wide/16 p1, 0x0

    .line 34
    .line 35
    return-wide p1
.end method

.method public pushVideoFrameSync(IIIJ)J
    .locals 0

    .line 1
    iget-boolean p2, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-wide/32 p1, 0x989684

    .line 6
    .line 7
    .line 8
    return-wide p1

    .line 9
    :cond_0
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 10
    .line 11
    .line 12
    iput-wide p4, p0, Lcom/tencent/liteav/videoencoder/a;->D:J

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->U:I

    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/tencent/liteav/videoencoder/a;->L:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/tencent/liteav/videoencoder/a;->f()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 24
    .line 25
    iget-object p2, p0, Lcom/tencent/liteav/videoencoder/a;->u:Ljava/lang/Runnable;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/basic/util/f;->a(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    const-wide/16 p1, 0x0

    .line 31
    .line 32
    return-wide p1
.end method

.method public setBitrate(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 4
    .line 5
    new-instance v1, Lcom/tencent/liteav/videoencoder/a$6;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/tencent/liteav/videoencoder/a$6;-><init>(Lcom/tencent/liteav/videoencoder/a;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/util/f;->b(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setBitrateFromQos(II)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/liteav/videoencoder/a;->a:I

    .line 2
    .line 3
    iget-object p2, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/liteav/videoencoder/a$7;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/videoencoder/a$7;-><init>(Lcom/tencent/liteav/videoencoder/a;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v0}, Lcom/tencent/liteav/basic/util/f;->b(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setEncodeIdrFpsFromQos(I)V
    .locals 0

    return-void
.end method

.method public setFPS(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 2
    .line 3
    new-instance v1, Lcom/tencent/liteav/videoencoder/a$5;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/tencent/liteav/videoencoder/a$5;-><init>(Lcom/tencent/liteav/videoencoder/a;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/util/f;->b(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public signalEOSAndFlush()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 7
    .line 8
    new-instance v1, Lcom/tencent/liteav/videoencoder/a$9;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/tencent/liteav/videoencoder/a$9;-><init>(Lcom/tencent/liteav/videoencoder/a;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/util/f;->a(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public start(Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;)I
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/liteav/videoencoder/b;->start(Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;)I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [Z

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 9
    .line 10
    new-instance v2, Lcom/tencent/liteav/videoencoder/a$1;

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, v0}, Lcom/tencent/liteav/videoencoder/a$1;-><init>(Lcom/tencent/liteav/videoencoder/a;Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;[Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/basic/util/f;->a(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    const/4 v1, 0x0

    .line 20
    aget-boolean v2, v0, v1

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const-string v2, "VideoEncoder[%d]: Start successfully, streamType:%d"

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget p1, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->streamType:I

    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v2, "streamType: 2-big, 3-small, 7-sub"

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    invoke-static {v3, p1, v2, v1}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    :cond_0
    aget-boolean p1, v0, v1

    .line 55
    .line 56
    const v2, 0x989684

    .line 57
    .line 58
    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Lcom/tencent/liteav/videoencoder/b;->callDelegate(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    aget-boolean p1, v0, v1

    .line 65
    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    return v1

    .line 69
    :cond_2
    return v2

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p1
.end method

.method public stop()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tencent/liteav/videoencoder/a;->z:Z

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/a;->r:Lcom/tencent/liteav/basic/util/f;

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/liteav/videoencoder/a$4;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/tencent/liteav/videoencoder/a$4;-><init>(Lcom/tencent/liteav/videoencoder/a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/util/f;->a(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0
.end method
