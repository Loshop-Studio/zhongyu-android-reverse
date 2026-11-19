.class public Lcom/tencent/liteav/basic/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/basic/c/f$a;
    }
.end annotation


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:Z

.field protected h:Ljava/nio/FloatBuffer;

.field protected i:Ljava/nio/FloatBuffer;

.field protected j:[F

.field protected k:[F

.field protected l:Lcom/tencent/liteav/basic/c/f$a;

.field protected m:I

.field protected n:I

.field protected o:Z

.field protected p:Z

.field protected q:Z

.field private final r:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private u:Z

.field private v:I

.field private w:[F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"

    const/4 v1, 0x0

    const-string v2, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    invoke-direct {p0, v2, v0, v1}, Lcom/tencent/liteav/basic/c/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/tencent/liteav/basic/c/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->u:Z

    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lcom/tencent/liteav/basic/c/f;->v:I

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Lcom/tencent/liteav/basic/c/f;->w:[F

    .line 7
    iput v1, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    .line 8
    iput v1, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    .line 9
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->o:Z

    .line 10
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->p:Z

    .line 11
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->q:Z

    .line 12
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/tencent/liteav/basic/c/f;->r:Ljava/util/LinkedList;

    .line 13
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/f;->s:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/tencent/liteav/basic/c/f;->t:Ljava/lang/String;

    .line 15
    iput-boolean p3, p0, Lcom/tencent/liteav/basic/c/f;->q:Z

    const/4 p1, 0x1

    if-ne p1, p3, :cond_0

    .line 16
    const-string p2, "TXCGPUFilter"

    const-string p3, "set Oes fileter"

    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    :cond_0
    sget-object p2, Lcom/tencent/liteav/basic/c/i;->e:[F

    array-length p3, p2

    mul-int/lit8 p3, p3, 0x4

    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 18
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 19
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p3

    iput-object p3, p0, Lcom/tencent/liteav/basic/c/f;->h:Ljava/nio/FloatBuffer;

    .line 20
    iput-object p2, p0, Lcom/tencent/liteav/basic/c/f;->j:[F

    .line 21
    invoke-virtual {p3, p2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 22
    sget-object p2, Lcom/tencent/liteav/basic/c/i;->a:[F

    array-length p2, p2

    mul-int/lit8 p2, p2, 0x4

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 23
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 24
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p2

    iput-object p2, p0, Lcom/tencent/liteav/basic/c/f;->i:Ljava/nio/FloatBuffer;

    .line 25
    sget-object p2, Lcom/tencent/liteav/basic/c/h;->a:Lcom/tencent/liteav/basic/c/h;

    invoke-static {p2, v0, p1}, Lcom/tencent/liteav/basic/c/i;->a(Lcom/tencent/liteav/basic/c/h;ZZ)[F

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 26
    iget-object p2, p0, Lcom/tencent/liteav/basic/c/f;->i:Ljava/nio/FloatBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->h:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->i:Ljava/nio/FloatBuffer;

    invoke-virtual {p0, p1, v0, v1}, Lcom/tencent/liteav/basic/c/f;->b(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)I

    move-result p1

    return p1
.end method

.method public a(III)I
    .locals 2

    .line 48
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const v0, 0x8d40

    .line 49
    invoke-static {v0, p2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 50
    iget-object p2, p0, Lcom/tencent/liteav/basic/c/f;->h:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->i:Ljava/nio/FloatBuffer;

    invoke-virtual {p0, p1, p2, v1}, Lcom/tencent/liteav/basic/c/f;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 51
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/f;->l:Lcom/tencent/liteav/basic/c/f$a;

    if-eqz p1, :cond_1

    .line 52
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/f;->l:Lcom/tencent/liteav/basic/c/f$a;

    invoke-interface {p1, p3}, Lcom/tencent/liteav/basic/c/f$a;->a(I)V

    :cond_1
    const/4 p1, 0x0

    .line 53
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return p3
.end method

.method public a(IF)V
    .locals 1

    .line 100
    new-instance v0, Lcom/tencent/liteav/basic/c/f$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/liteav/basic/c/f$1;-><init>(Lcom/tencent/liteav/basic/c/f;IF)V

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/basic/c/f;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(II)V
    .locals 3

    .line 10
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->f:I

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->e:I

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 11
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/basic/c/f;->e:I

    .line 12
    iput p2, p0, Lcom/tencent/liteav/basic/c/f;->f:I

    .line 13
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->o:Z

    if-eqz v0, :cond_2

    .line 14
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->f()V

    :goto_0
    const/4 v0, 0x1

    .line 16
    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 18
    aget v0, v1, v2

    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    const/16 v0, 0x1908

    .line 19
    invoke-static {p1, p2, v0, v0}, Lcom/tencent/liteav/basic/c/g;->a(IIII)I

    move-result p1

    iput p1, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    .line 20
    iget p1, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    const p2, 0x8d40

    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const/16 p1, 0xde1

    .line 21
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    const v1, 0x8ce0

    invoke-static {p2, v1, p1, v0, v2}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 22
    invoke-static {p2, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    :cond_2
    :goto_1
    return-void
.end method

.method public a(III[FFZZ)V
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p4, :cond_0

    .line 64
    sget-object v2, Lcom/tencent/liteav/basic/c/h;->a:Lcom/tencent/liteav/basic/c/h;

    invoke-static {v2, v0, v1}, Lcom/tencent/liteav/basic/c/i;->a(Lcom/tencent/liteav/basic/c/h;ZZ)[F

    move-result-object v2

    :goto_0
    move/from16 v3, p1

    goto :goto_1

    :cond_0
    move-object/from16 v2, p4

    goto :goto_0

    :goto_1
    int-to-float v4, v3

    move/from16 v5, p2

    int-to-float v6, v5

    div-float v7, v4, v6

    cmpl-float v8, v7, p5

    if-lez v8, :cond_1

    mul-float v3, v6, p5

    float-to-int v3, v3

    goto :goto_2

    :cond_1
    cmpg-float v7, v7, p5

    if-gez v7, :cond_2

    div-float v5, v4, p5

    float-to-int v5, v5

    :cond_2
    :goto_2
    int-to-float v3, v3

    div-float/2addr v3, v4

    int-to-float v4, v5

    div-float/2addr v4, v6

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float v3, v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    sub-float v4, v5, v4

    div-float/2addr v4, v6

    move v6, v0

    .line 65
    :goto_3
    array-length v7, v2

    const/4 v8, 0x2

    div-int/2addr v7, v8

    if-ge v6, v7, :cond_5

    mul-int/lit8 v7, v6, 0x2

    .line 66
    aget v8, v2, v7

    const/high16 v9, 0x3f000000    # 0.5f

    cmpg-float v10, v8, v9

    if-gez v10, :cond_3

    add-float/2addr v8, v3

    .line 67
    aput v8, v2, v7

    goto :goto_4

    :cond_3
    sub-float/2addr v8, v3

    .line 68
    aput v8, v2, v7

    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 69
    aget v8, v2, v7

    cmpg-float v9, v8, v9

    if-gez v9, :cond_4

    add-float/2addr v8, v4

    .line 70
    aput v8, v2, v7

    goto :goto_5

    :cond_4
    sub-float/2addr v8, v4

    .line 71
    aput v8, v2, v7

    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 72
    :cond_5
    div-int/lit8 v3, p3, 0x5a

    move v4, v0

    :goto_6
    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v9, 0x7

    const/4 v10, 0x6

    const/4 v11, 0x3

    if-ge v4, v3, :cond_6

    .line 73
    aget v12, v2, v0

    .line 74
    aget v13, v2, v1

    .line 75
    aget v14, v2, v8

    aput v14, v2, v0

    .line 76
    aget v14, v2, v11

    aput v14, v2, v1

    .line 77
    aget v14, v2, v10

    aput v14, v2, v8

    .line 78
    aget v14, v2, v9

    aput v14, v2, v11

    .line 79
    aget v11, v2, v7

    aput v11, v2, v10

    .line 80
    aget v10, v2, v6

    aput v10, v2, v9

    .line 81
    aput v12, v2, v7

    .line 82
    aput v13, v2, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_6
    if-eqz v3, :cond_9

    if-ne v3, v8, :cond_7

    goto :goto_7

    :cond_7
    if-eqz p7, :cond_8

    .line 83
    aget v3, v2, v0

    sub-float v3, v5, v3

    aput v3, v2, v0

    .line 84
    aget v0, v2, v8

    sub-float v0, v5, v0

    aput v0, v2, v8

    .line 85
    aget v0, v2, v7

    sub-float v0, v5, v0

    aput v0, v2, v7

    .line 86
    aget v0, v2, v10

    sub-float v0, v5, v0

    aput v0, v2, v10

    :cond_8
    if-eqz p6, :cond_b

    .line 87
    aget v0, v2, v1

    sub-float v0, v5, v0

    aput v0, v2, v1

    .line 88
    aget v0, v2, v11

    sub-float v0, v5, v0

    aput v0, v2, v11

    .line 89
    aget v0, v2, v6

    sub-float v0, v5, v0

    aput v0, v2, v6

    .line 90
    aget v0, v2, v9

    sub-float/2addr v5, v0

    aput v5, v2, v9

    goto :goto_8

    :cond_9
    :goto_7
    if-eqz p6, :cond_a

    .line 91
    aget v3, v2, v0

    sub-float v3, v5, v3

    aput v3, v2, v0

    .line 92
    aget v0, v2, v8

    sub-float v0, v5, v0

    aput v0, v2, v8

    .line 93
    aget v0, v2, v7

    sub-float v0, v5, v0

    aput v0, v2, v7

    .line 94
    aget v0, v2, v10

    sub-float v0, v5, v0

    aput v0, v2, v10

    :cond_a
    if-eqz p7, :cond_b

    .line 95
    aget v0, v2, v1

    sub-float v0, v5, v0

    aput v0, v2, v1

    .line 96
    aget v0, v2, v11

    sub-float v0, v5, v0

    aput v0, v2, v11

    .line 97
    aget v0, v2, v6

    sub-float v0, v5, v0

    aput v0, v2, v6

    .line 98
    aget v0, v2, v9

    sub-float/2addr v5, v0

    aput v5, v2, v9

    .line 99
    :cond_b
    :goto_8
    sget-object v0, Lcom/tencent/liteav/basic/c/i;->e:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    invoke-virtual {p0, v0, v2}, Lcom/tencent/liteav/basic/c/f;->a([F[F)V

    return-void
.end method

.method public a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 7

    .line 23
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 24
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->k()V

    .line 25
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p2, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 27
    iget v1, p0, Lcom/tencent/liteav/basic/c/f;->b:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x1406

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 28
    iget p2, p0, Lcom/tencent/liteav/basic/c/f;->b:I

    invoke-static {p2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 29
    invoke-virtual {p3, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 30
    iget v1, p0, Lcom/tencent/liteav/basic/c/f;->d:I

    move-object v6, p3

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 31
    iget p2, p0, Lcom/tencent/liteav/basic/c/f;->d:I

    invoke-static {p2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 32
    iget p2, p0, Lcom/tencent/liteav/basic/c/f;->v:I

    const/4 p3, 0x1

    if-ltz p2, :cond_1

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->w:[F

    if-eqz v1, :cond_1

    .line 33
    invoke-static {p2, p3, v0, v1, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    :cond_1
    const/4 p2, -0x1

    const/16 v1, 0xde1

    const v2, 0x8d65

    if-eq p1, p2, :cond_3

    const p2, 0x84c0

    .line 34
    invoke-static {p2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 35
    iget-boolean p2, p0, Lcom/tencent/liteav/basic/c/f;->q:Z

    if-ne p3, p2, :cond_2

    .line 36
    invoke-static {v2, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    goto :goto_0

    .line 37
    :cond_2
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 38
    :goto_0
    iget p1, p0, Lcom/tencent/liteav/basic/c/f;->c:I

    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->i()V

    const/4 p1, 0x5

    const/4 p2, 0x4

    .line 40
    invoke-static {p1, v0, p2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 41
    iget p1, p0, Lcom/tencent/liteav/basic/c/f;->b:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 42
    iget p1, p0, Lcom/tencent/liteav/basic/c/f;->d:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 43
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->j()V

    .line 44
    iget-boolean p1, p0, Lcom/tencent/liteav/basic/c/f;->q:Z

    if-ne p3, p1, :cond_4

    .line 45
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void

    .line 46
    :cond_4
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/c/f$a;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->u:Z

    .line 9
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/f;->l:Lcom/tencent/liteav/basic/c/f$a;

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->r:Ljava/util/LinkedList;

    monitor-enter v0

    .line 102
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->r:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 103
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/tencent/liteav/basic/c/f;->o:Z

    return-void
.end method

.method public a([F[F)V
    .locals 2

    .line 54
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/f;->j:[F

    .line 55
    sget-object v0, Lcom/tencent/liteav/basic/c/i;->e:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 56
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/f;->h:Ljava/nio/FloatBuffer;

    .line 58
    invoke-virtual {v0, p1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 59
    iput-object p2, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 60
    sget-object p1, Lcom/tencent/liteav/basic/c/i;->a:[F

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x4

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 61
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/f;->i:Ljava/nio/FloatBuffer;

    .line 63
    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->s:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->t:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    .line 5
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->c()V

    .line 6
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    return v0
.end method

.method public b(I)I
    .locals 2

    .line 9
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    iget v1, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/tencent/liteav/basic/c/f;->a(III)I

    move-result p1

    return p1
.end method

.method public b(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)I
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/liteav/basic/c/f;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 7
    iget-object p2, p0, Lcom/tencent/liteav/basic/c/f;->l:Lcom/tencent/liteav/basic/c/f$a;

    if-eqz p2, :cond_1

    .line 8
    iget-object p2, p0, Lcom/tencent/liteav/basic/c/f;->l:Lcom/tencent/liteav/basic/c/f$a;

    invoke-interface {p2, p1}, Lcom/tencent/liteav/basic/c/f$a;->a(I)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public b()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    const-string v1, "position"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->b:I

    .line 2
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    const-string v1, "inputImageTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->c:I

    .line 3
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    const-string v1, "textureTransform"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->v:I

    .line 4
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    const-string v1, "inputTextureCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->d:I

    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->e()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/f;->g:Z

    .line 11
    .line 12
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/f;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->f:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/basic/c/f;->e:I

    .line 8
    .line 9
    return-void
.end method

.method public f()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    filled-new-array {v0}, [I

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 13
    .line 14
    .line 15
    iput v3, p0, Lcom/tencent/liteav/basic/c/f;->m:I

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    .line 18
    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    filled-new-array {v0}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 26
    .line 27
    .line 28
    iput v3, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    const/16 v1, 0x8

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 11
    .line 12
    const/high16 v2, 0x3f800000    # 1.0f

    .line 13
    .line 14
    aget v3, v1, v0

    .line 15
    .line 16
    sub-float/2addr v2, v3

    .line 17
    aput v2, v1, v0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->j:[F

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/c/f;->a([F[F)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :goto_0
    const/16 v1, 0x8

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 11
    .line 12
    const/high16 v2, 0x3f800000    # 1.0f

    .line 13
    .line 14
    aget v3, v1, v0

    .line 15
    .line 16
    sub-float/2addr v2, v3

    .line 17
    aput v2, v1, v0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->j:[F

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/f;->k:[F

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lcom/tencent/liteav/basic/c/f;->a([F[F)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public i()V
    .locals 0

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->r:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/f;->r:Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Runnable;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/basic/c/f;->f:I

    .line 2
    .line 3
    return v0
.end method
