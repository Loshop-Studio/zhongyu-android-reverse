.class public Lcom/tencent/liteav/basic/structs/TXSVideoFrame;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public buffer:Ljava/nio/ByteBuffer;

.field public data:[B

.field public eglContext:Ljava/lang/Object;

.field public frameType:I

.field public height:I

.field public pts:J

.field public rotation:I

.field public textureId:I

.field public width:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private native nativeLoadArrayFromBuffer([BI)V
.end method

.method private native nativeLoadArrayFromGL([BII)V
.end method

.method private native nativeLoadBufferFromGL(II)V
.end method

.method private native nativeLoadNV21BufferFromI420Buffer(II)V
.end method


# virtual methods
.method public I420toNV21([B[BII)[B
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    array-length p2, p1

    .line 4
    new-array p2, p2, [B

    .line 5
    .line 6
    :cond_0
    mul-int/2addr p3, p4

    .line 7
    div-int/lit8 p4, p3, 0x4

    .line 8
    .line 9
    add-int/2addr p4, p3

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p1, v0, p2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    move v0, p3

    .line 15
    move v1, p4

    .line 16
    :goto_0
    if-ge p3, p4, :cond_1

    .line 17
    .line 18
    aget-byte v2, p1, v1

    .line 19
    .line 20
    aput-byte v2, p2, v0

    .line 21
    .line 22
    add-int/lit8 v2, v0, 0x1

    .line 23
    .line 24
    aget-byte v3, p1, p3

    .line 25
    .line 26
    aput-byte v3, p2, v2

    .line 27
    .line 28
    add-int/lit8 p3, p3, 0x1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object p2
.end method

.method public clone()Lcom/tencent/liteav/basic/structs/TXSVideoFrame;
    .locals 3

    .line 2
    new-instance v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;-><init>()V

    .line 3
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    iput v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 4
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    iput v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 5
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->frameType:I

    iput v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->frameType:I

    .line 6
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->rotation:I

    iput v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->rotation:I

    .line 7
    iget-wide v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->pts:J

    iput-wide v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->pts:J

    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->data:[B

    iput-object v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->data:[B

    .line 9
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->textureId:I

    iput v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->textureId:I

    .line 10
    iget-object v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->eglContext:Ljava/lang/Object;

    iput-object v1, v0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->eglContext:Ljava/lang/Object;

    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->nativeClone(Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->clone()Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->release()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public loadNV21BufferFromI420Buffer()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 2
    .line 3
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->nativeLoadNV21BufferFromI420Buffer(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public loadYUVArray([B)V
    .locals 8

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    iget v3, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 5
    .line 6
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 7
    .line 8
    mul-int v2, v3, v1

    .line 9
    .line 10
    mul-int/lit8 v2, v2, 0x3

    .line 11
    .line 12
    div-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->buffer:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    mul-int/lit8 v1, v1, 0x3

    .line 22
    .line 23
    div-int/lit8 v4, v1, 0x8

    .line 24
    .line 25
    const/16 v6, 0x1401

    .line 26
    .line 27
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x0

    .line 33
    const/16 v5, 0x1908

    .line 34
    .line 35
    invoke-static/range {v1 .. v7}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    mul-int/2addr v3, v1

    .line 40
    mul-int/lit8 v3, v3, 0x3

    .line 41
    .line 42
    div-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    invoke-direct {p0, p1, v3}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->nativeLoadArrayFromBuffer([BI)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public loadYUVBufferFromGL()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 2
    .line 3
    iget v1, p0, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->nativeLoadBufferFromGL(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public native nativeClone(Ljava/nio/ByteBuffer;)V
.end method

.method public native release()V
.end method
