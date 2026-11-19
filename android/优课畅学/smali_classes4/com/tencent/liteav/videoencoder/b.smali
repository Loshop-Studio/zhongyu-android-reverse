.class public Lcom/tencent/liteav/videoencoder/b;
.super Lcom/tencent/liteav/basic/module/a;
.source "SourceFile"


# instance fields
.field protected mEnableXMirror:Z

.field protected mEncFmt:Lorg/json/JSONArray;

.field protected mEncodeFilter:Lcom/tencent/liteav/basic/c/f;

.field private mEncodeFirstGOP:Z

.field protected mGLContextExternal:Ljava/lang/Object;

.field protected mInit:Z

.field protected mInputFilter:Lcom/tencent/liteav/basic/c/f;

.field protected mInputHeight:I

.field protected mInputTextureID:I

.field protected mInputWidth:I

.field protected mListener:Lcom/tencent/liteav/videoencoder/c;

.field protected mOutputHeight:I

.field protected mOutputWidth:I

.field protected mRotation:I

.field protected mStreamType:I

.field private mVideoGOPEncode:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/basic/module/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mInputWidth:I

    .line 9
    .line 10
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mInputHeight:I

    .line 11
    .line 12
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 13
    .line 14
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    iput v2, p0, Lcom/tencent/liteav/videoencoder/b;->mInputTextureID:I

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mGLContextExternal:Ljava/lang/Object;

    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    iput-wide v2, p0, Lcom/tencent/liteav/videoencoder/b;->mVideoGOPEncode:J

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFirstGOP:Z

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    iput v2, p0, Lcom/tencent/liteav/videoencoder/b;->mStreamType:I

    .line 29
    .line 30
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mRotation:I

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mEncFmt:Lorg/json/JSONArray;

    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/tencent/liteav/videoencoder/b;->mEnableXMirror:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public callDelegate(I)V
    .locals 18

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v0, p0

    move/from16 v15, p1

    .line 1
    invoke-virtual/range {v0 .. v17}, Lcom/tencent/liteav/videoencoder/b;->callDelegate([BIJJJJJJILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    return-void
.end method

.method public callDelegate(Landroid/media/MediaFormat;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    if-eqz v0, :cond_0

    .line 27
    invoke-interface {v0, p1}, Lcom/tencent/liteav/videoencoder/c;->a(Landroid/media/MediaFormat;)V

    :cond_0
    return-void
.end method

.method public callDelegate([BIJJJJJJILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 9

    move-object/from16 v0, p17

    const/4 v1, 0x0

    if-nez p16, :cond_0

    move-object v2, v1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual/range {p16 .. p16}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v2

    :goto_0
    if-nez v0, :cond_1

    :goto_1
    move-object v3, v1

    goto :goto_2

    .line 3
    :cond_1
    new-instance v1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    goto :goto_1

    :goto_2
    if-eqz v3, :cond_2

    .line 4
    iget v4, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v5, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget-wide v6, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    if-eqz v0, :cond_6

    .line 6
    new-instance v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;

    invoke-direct {v1}, Lcom/tencent/liteav/basic/structs/TXSNALPacket;-><init>()V

    .line 7
    iput-object p1, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 8
    iput p2, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 9
    iput-wide p3, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->gopIndex:J

    .line 10
    iput-wide p5, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->gopFrameIndex:J

    move-wide/from16 p3, p7

    .line 11
    iput-wide p3, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->frameIndex:J

    move-wide/from16 p3, p9

    .line 12
    iput-wide p3, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->refFremeIndex:J

    move-wide/from16 p3, p11

    .line 13
    iput-wide p3, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    move-wide/from16 p3, p13

    .line 14
    iput-wide p3, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 15
    iput-object v2, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->buffer:Ljava/nio/ByteBuffer;

    .line 16
    iget p1, p0, Lcom/tencent/liteav/videoencoder/b;->mStreamType:I

    iput p1, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->streamType:I

    if-eqz v3, :cond_3

    .line 17
    iput-object v3, v1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->info:Landroid/media/MediaCodec$BufferInfo;

    :cond_3
    move/from16 p1, p15

    .line 18
    invoke-interface {v0, v1, p1}, Lcom/tencent/liteav/videoencoder/c;->a(Lcom/tencent/liteav/basic/structs/TXSNALPacket;I)V

    const-wide/16 p3, 0x1

    const/16 p1, 0xfa6

    if-nez p2, :cond_5

    .line 19
    iget-wide v0, p0, Lcom/tencent/liteav/videoencoder/b;->mVideoGOPEncode:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_4

    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFirstGOP:Z

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 22
    :cond_4
    iput-wide p3, p0, Lcom/tencent/liteav/videoencoder/b;->mVideoGOPEncode:J

    return-void

    .line 23
    :cond_5
    iget-wide v0, p0, Lcom/tencent/liteav/videoencoder/b;->mVideoGOPEncode:J

    add-long/2addr v0, p3

    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/b;->mVideoGOPEncode:J

    .line 24
    iget-boolean p2, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFirstGOP:Z

    if-nez p2, :cond_6

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public enableNearestRPS(I)V
    .locals 0

    return-void
.end method

.method public getEncodeCost()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getRealBitrate()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getRealFPS()D
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getVideoHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public getVideoWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 2
    .line 3
    return v0
.end method

.method public onEncodeFinished(IJJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move-wide v4, p4

    .line 8
    invoke-interface/range {v0 .. v5}, Lcom/tencent/liteav/videoencoder/c;->a(IJJ)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public pushVideoFrame(IIIJ)J
    .locals 0

    const-wide/32 p1, 0x989682

    return-wide p1
.end method

.method public pushVideoFrameAsync(IIIJ)J
    .locals 0

    const-wide/32 p1, 0x989682

    return-wide p1
.end method

.method public pushVideoFrameSync(IIIJ)J
    .locals 0

    const-wide/32 p1, 0x989682

    return-wide p1
.end method

.method public restartIDR()V
    .locals 0

    return-void
.end method

.method public setBitrate(I)V
    .locals 0

    return-void
.end method

.method public setBitrateFromQos(II)V
    .locals 0

    return-void
.end method

.method public setEncodeIdrFpsFromQos(I)V
    .locals 0

    return-void
.end method

.method public setFPS(I)V
    .locals 0

    return-void
.end method

.method public setListener(Lcom/tencent/liteav/videoencoder/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 2
    .line 3
    return-void
.end method

.method public setRPSRefBitmap(IIJ)V
    .locals 0

    return-void
.end method

.method public setRotation(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/videoencoder/b;->mRotation:I

    .line 2
    .line 3
    return-void
.end method

.method public setXMirror(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videoencoder/b;->mEnableXMirror:Z

    .line 2
    .line 3
    return-void
.end method

.method public signalEOSAndFlush()V
    .locals 0

    return-void
.end method

.method public start(Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->width:I

    .line 4
    .line 5
    iput v0, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 6
    .line 7
    iget v1, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->height:I

    .line 8
    .line 9
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/liteav/videoencoder/b;->mInputWidth:I

    .line 12
    .line 13
    iput v1, p0, Lcom/tencent/liteav/videoencoder/b;->mInputHeight:I

    .line 14
    .line 15
    iget-object v0, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->glContext:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/videoencoder/b;->mGLContextExternal:Ljava/lang/Object;

    .line 18
    .line 19
    iget v0, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->streamType:I

    .line 20
    .line 21
    iput v0, p0, Lcom/tencent/liteav/videoencoder/b;->mStreamType:I

    .line 22
    .line 23
    iget-object p1, p1, Lcom/tencent/liteav/videoencoder/TXSVideoEncoderParam;->encFmt:Lorg/json/JSONArray;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/b;->mEncFmt:Lorg/json/JSONArray;

    .line 26
    .line 27
    :cond_0
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/tencent/liteav/videoencoder/b;->mVideoGOPEncode:J

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/tencent/liteav/videoencoder/b;->mEncodeFirstGOP:Z

    .line 33
    .line 34
    const p1, 0x989682

    .line 35
    .line 36
    .line 37
    return p1
.end method

.method public stop()V
    .locals 0

    return-void
.end method
