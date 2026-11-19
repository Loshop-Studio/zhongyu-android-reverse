.class public Lcom/tencent/liteav/renderer/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I = 0x1

.field public static b:I = 0x2


# instance fields
.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:[F

.field private k:[F

.field private l:F

.field private m:F

.field private n:Z

.field private o:Z

.field private final p:[F

.field private q:Ljava/nio/FloatBuffer;

.field private r:[F

.field private s:[F

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->c:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->d:I

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->e:I

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->f:I

    .line 12
    .line 13
    sget v1, Lcom/tencent/liteav/renderer/h;->b:I

    .line 14
    .line 15
    iput v1, p0, Lcom/tencent/liteav/renderer/h;->g:I

    .line 16
    .line 17
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->h:I

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->i:Z

    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    new-array v2, v1, [F

    .line 24
    .line 25
    iput-object v2, p0, Lcom/tencent/liteav/renderer/h;->j:[F

    .line 26
    .line 27
    new-array v2, v1, [F

    .line 28
    .line 29
    iput-object v2, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    .line 30
    .line 31
    const/high16 v2, 0x3f800000    # 1.0f

    .line 32
    .line 33
    iput v2, p0, Lcom/tencent/liteav/renderer/h;->l:F

    .line 34
    .line 35
    iput v2, p0, Lcom/tencent/liteav/renderer/h;->m:F

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->n:Z

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/h;->o:Z

    .line 41
    .line 42
    const/16 v2, 0x14

    .line 43
    .line 44
    new-array v2, v2, [F

    .line 45
    .line 46
    fill-array-data v2, :array_0

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lcom/tencent/liteav/renderer/h;->p:[F

    .line 50
    .line 51
    new-array v3, v1, [F

    .line 52
    .line 53
    iput-object v3, p0, Lcom/tencent/liteav/renderer/h;->r:[F

    .line 54
    .line 55
    new-array v1, v1, [F

    .line 56
    .line 57
    iput-object v1, p0, Lcom/tencent/liteav/renderer/h;->s:[F

    .line 58
    .line 59
    const/16 v1, -0x3039

    .line 60
    .line 61
    iput v1, p0, Lcom/tencent/liteav/renderer/h;->u:I

    .line 62
    .line 63
    iput v1, p0, Lcom/tencent/liteav/renderer/h;->v:I

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/h;->o:Z

    .line 70
    .line 71
    array-length p1, v2

    .line 72
    mul-int/lit8 p1, p1, 0x4

    .line 73
    .line 74
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lcom/tencent/liteav/renderer/h;->q:Ljava/nio/FloatBuffer;

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/tencent/liteav/renderer/h;->s:[F

    .line 100
    .line 101
    invoke-static {p1, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x0
        0x3f800000    # 1.0f
        0x0
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private a(ILjava/lang/String;)I
    .locals 3

    .line 16
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "glCreateShader type="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 18
    invoke-static {v0, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 19
    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 p2, 0x1

    .line 20
    new-array p2, p2, [I

    const v1, 0x8b81

    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, p2, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 22
    aget p2, p2, v2

    if-nez p2, :cond_0

    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not compile shader "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TXTweenFilter"

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    return v2

    :cond_0
    return v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    const v0, 0x8b31

    .line 26
    invoke-direct {p0, v0, p1}, Lcom/tencent/liteav/renderer/h;->a(ILjava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const v1, 0x8b30

    .line 27
    invoke-direct {p0, v1, p2}, Lcom/tencent/liteav/renderer/h;->a(ILjava/lang/String;)I

    move-result p2

    if-nez p2, :cond_1

    return v0

    .line 28
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v1

    .line 29
    const-string v2, "glCreateProgram"

    invoke-direct {p0, v2}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 30
    const-string v2, "TXTweenFilter"

    if-nez v1, :cond_2

    .line 31
    const-string v3, "Could not create program"

    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_2
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 33
    const-string p1, "glAttachShader"

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 34
    invoke-static {v1, p2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 35
    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 36
    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x1

    .line 37
    new-array p2, p1, [I

    const v3, 0x8b82

    .line 38
    invoke-static {v1, v3, p2, v0}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 39
    aget p2, p2, v0

    if-eq p2, p1, :cond_3

    .line 40
    const-string p1, "Could not link program: "

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-static {v1}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    return v0

    :cond_3
    return v1
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 43
    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": glError "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXTweenFilter"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b([F)V
    .locals 13

    .line 6
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->d:I

    if-eqz v0, :cond_8

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->c:I

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 7
    :cond_0
    iget v2, p0, Lcom/tencent/liteav/renderer/h;->e:I

    .line 8
    iget v3, p0, Lcom/tencent/liteav/renderer/h;->f:I

    .line 9
    iget v4, p0, Lcom/tencent/liteav/renderer/h;->h:I

    const/16 v5, 0x10e

    if-eq v4, v5, :cond_1

    const/16 v5, 0x5a

    if-ne v4, v5, :cond_2

    :cond_1
    move v12, v3

    move v3, v2

    move v2, v12

    :cond_2
    int-to-float v1, v1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v1, v4

    int-to-float v2, v2

    div-float/2addr v1, v2

    int-to-float v5, v0

    mul-float/2addr v5, v4

    int-to-float v3, v3

    div-float/2addr v5, v3

    .line 10
    iget v6, p0, Lcom/tencent/liteav/renderer/h;->g:I

    sget v7, Lcom/tencent/liteav/renderer/h;->a:I

    if-ne v6, v7, :cond_3

    mul-float v6, v1, v3

    int-to-float v0, v0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_4

    goto :goto_0

    :cond_3
    mul-float v6, v1, v3

    int-to-float v0, v0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_5

    :cond_4
    move v1, v5

    .line 11
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    const/4 v5, 0x0

    invoke-static {v0, v5}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 12
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->i:Z

    if-eqz v0, :cond_7

    .line 13
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->h:I

    rem-int/lit16 v0, v0, 0xb4

    const/high16 v6, -0x40800000    # -1.0f

    if-nez v0, :cond_6

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    invoke-static {v0, v5, v6, v4, v4}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    goto :goto_1

    .line 15
    :cond_6
    iget-object v0, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    invoke-static {v0, v5, v4, v6, v4}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 16
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    mul-float/2addr v2, v1

    iget v6, p0, Lcom/tencent/liteav/renderer/h;->c:I

    int-to-float v6, v6

    div-float/2addr v2, v6

    mul-float/2addr v2, v4

    mul-float/2addr v3, v1

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->d:I

    int-to-float v1, v1

    div-float/2addr v3, v1

    mul-float/2addr v3, v4

    invoke-static {v0, v5, v2, v3, v4}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 17
    iget-object v6, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    iget v0, p0, Lcom/tencent/liteav/renderer/h;->h:I

    int-to-float v8, v0

    const/4 v10, 0x0

    const/high16 v11, -0x40800000    # -1.0f

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 18
    iget-object v2, p0, Lcom/tencent/liteav/renderer/h;->j:[F

    iget-object v4, p0, Lcom/tencent/liteav/renderer/h;->k:[F

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    :cond_8
    :goto_2
    return-void
.end method

.method private d()V
    .locals 14

    .line 8
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->n:Z

    if-nez v0, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reloadFrameBuffer. size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXTweenFilter"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/h;->e()V

    const/4 v0, 0x1

    .line 11
    new-array v2, v0, [I

    .line 12
    new-array v3, v0, [I

    const/4 v4, 0x0

    .line 13
    invoke-static {v0, v2, v4}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 14
    invoke-static {v0, v3, v4}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 15
    aget v0, v2, v4

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->u:I

    .line 16
    aget v0, v3, v4

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->v:I

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "frameBuffer id = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/liteav/renderer/h;->v:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", texture id = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/liteav/renderer/h;->u:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->u:I

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 19
    const-string v0, "glBindTexture mFrameBufferTextureID"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 20
    iget v8, p0, Lcom/tencent/liteav/renderer/h;->c:I

    iget v9, p0, Lcom/tencent/liteav/renderer/h;->d:I

    const/16 v12, 0x1401

    const/4 v13, 0x0

    const/16 v5, 0xde1

    const/4 v6, 0x0

    const/16 v7, 0x1908

    const/4 v10, 0x0

    const/16 v11, 0x1908

    invoke-static/range {v5 .. v13}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    const/16 v0, 0x2801

    const v2, 0x46180400    # 9729.0f

    .line 21
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2800

    .line 22
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2802

    const v2, 0x812f

    .line 23
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2803

    .line 24
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 25
    const-string v0, "glTexParameter"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 26
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->v:I

    const v2, 0x8d40

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const v0, 0x8ce0

    .line 27
    iget v3, p0, Lcom/tencent/liteav/renderer/h;->u:I

    invoke-static {v2, v0, v1, v3, v4}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 28
    invoke-static {v1, v4}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 29
    invoke-static {v2, v4}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 30
    iput-boolean v4, p0, Lcom/tencent/liteav/renderer/h;->n:Z

    return-void
.end method

.method private e()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/16 v3, -0x3039

    .line 6
    .line 7
    if-eq v0, v3, :cond_0

    .line 8
    .line 9
    filled-new-array {v0}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 14
    .line 15
    .line 16
    iput v3, p0, Lcom/tencent/liteav/renderer/h;->v:I

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->u:I

    .line 19
    .line 20
    if-eq v0, v3, :cond_1

    .line 21
    .line 22
    filled-new-array {v0}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 27
    .line 28
    .line 29
    iput v3, p0, Lcom/tencent/liteav/renderer/h;->u:I

    .line 30
    .line 31
    :cond_1
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 13
    iput p1, p0, Lcom/tencent/liteav/renderer/h;->g:I

    return-void
.end method

.method public a(II)V
    .locals 9

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->c:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/tencent/liteav/renderer/h;->d:I

    if-ne p2, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Output resolution change: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/liteav/renderer/h;->d:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXTweenFilter"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iput p1, p0, Lcom/tencent/liteav/renderer/h;->c:I

    .line 4
    iput p2, p0, Lcom/tencent/liteav/renderer/h;->d:I

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    if-le p1, p2, :cond_1

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/renderer/h;->j:[F

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, -0x40800000    # -1.0f

    const/high16 v5, -0x40800000    # -1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static/range {v1 .. v8}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    .line 6
    iput v4, p0, Lcom/tencent/liteav/renderer/h;->l:F

    .line 7
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->m:F

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/renderer/h;->j:[F

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, -0x40800000    # -1.0f

    move v6, v4

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, -0x40800000    # -1.0f

    invoke-static/range {v1 .. v8}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    move v4, v6

    .line 9
    iput v0, p0, Lcom/tencent/liteav/renderer/h;->l:F

    .line 10
    iput v4, p0, Lcom/tencent/liteav/renderer/h;->m:F

    :goto_0
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/h;->n:Z

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 14
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/h;->i:Z

    return-void
.end method

.method public a([F)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/tencent/liteav/renderer/h;->s:[F

    return-void
.end method

.method public a()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->o:Z

    return v0
.end method

.method public b()V
    .locals 4

    .line 19
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->o:Z

    const-string v1, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"

    if-eqz v0, :cond_0

    .line 20
    const-string v0, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}"

    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    .line 22
    :goto_0
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    const-string v1, "TXTweenFilter"

    if-nez v0, :cond_1

    .line 23
    const-string v0, "failed creating program"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 24
    :cond_1
    const-string v2, "aPosition"

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->y:I

    .line 25
    const-string v0, "glGetAttribLocation aPosition"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 26
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->y:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 27
    const-string v0, "Could not get attrib location for aPosition"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 28
    :cond_2
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    const-string v3, "aTextureCoord"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->z:I

    .line 29
    const-string v0, "glGetAttribLocation aTextureCoord"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 30
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->z:I

    if-ne v0, v2, :cond_3

    .line 31
    const-string v0, "Could not get attrib location for aTextureCoord"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 32
    :cond_3
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    const-string v3, "uMVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->w:I

    .line 33
    const-string v0, "glGetUniformLocation uMVPMatrix"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 34
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->w:I

    if-ne v0, v2, :cond_4

    .line 35
    const-string v0, "Could not get attrib location for uMVPMatrix"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 36
    :cond_4
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    const-string v3, "uSTMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/h;->x:I

    .line 37
    const-string v0, "glGetUniformLocation uSTMatrix"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 38
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->x:I

    if-ne v0, v2, :cond_5

    .line 39
    const-string v0, "Could not get attrib location for uSTMatrix"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/tencent/liteav/renderer/h;->h:I

    return-void
.end method

.method public b(II)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->e:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/tencent/liteav/renderer/h;->f:I

    if-ne p2, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Input resolution change: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/liteav/renderer/h;->f:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXTweenFilter"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iput p1, p0, Lcom/tencent/liteav/renderer/h;->e:I

    .line 4
    iput p2, p0, Lcom/tencent/liteav/renderer/h;->f:I

    return-void
.end method

.method public c()V
    .locals 1

    .line 31
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 32
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/h;->e()V

    return-void
.end method

.method public c(I)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->c:I

    iget v1, p0, Lcom/tencent/liteav/renderer/h;->d:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 2
    invoke-static {v0, v0, v0, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4100

    .line 3
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 4
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->t:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 5
    const-string v0, "glUseProgram"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 6
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/h;->o:Z

    const/16 v1, 0xde1

    const v3, 0x8d65

    const v4, 0x84c0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {v4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 8
    invoke-static {v3, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {v4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 10
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 11
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/renderer/h;->q:Ljava/nio/FloatBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 12
    iget v4, p0, Lcom/tencent/liteav/renderer/h;->y:I

    const/16 v8, 0x14

    iget-object v9, p0, Lcom/tencent/liteav/renderer/h;->q:Ljava/nio/FloatBuffer;

    const/4 v5, 0x3

    const/16 v6, 0x1406

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 13
    const-string p1, "glVertexAttribPointer maPosition"

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 14
    iget p1, p0, Lcom/tencent/liteav/renderer/h;->y:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 15
    const-string p1, "glEnableVertexAttribArray maPositionHandle"

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/tencent/liteav/renderer/h;->q:Ljava/nio/FloatBuffer;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    iget v4, p0, Lcom/tencent/liteav/renderer/h;->z:I

    iget-object v9, p0, Lcom/tencent/liteav/renderer/h;->q:Ljava/nio/FloatBuffer;

    const/4 v5, 0x2

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 18
    const-string p1, "glVertexAttribPointer maTextureHandle"

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 19
    iget p1, p0, Lcom/tencent/liteav/renderer/h;->z:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 20
    const-string p1, "glEnableVertexAttribArray maTextureHandle"

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 21
    iget-object p1, p0, Lcom/tencent/liteav/renderer/h;->r:[F

    invoke-static {p1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 22
    iget-object p1, p0, Lcom/tencent/liteav/renderer/h;->r:[F

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->b([F)V

    .line 23
    iget p1, p0, Lcom/tencent/liteav/renderer/h;->w:I

    iget-object v0, p0, Lcom/tencent/liteav/renderer/h;->r:[F

    const/4 v4, 0x1

    invoke-static {p1, v4, v2, v0, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 24
    iget p1, p0, Lcom/tencent/liteav/renderer/h;->x:I

    iget-object v0, p0, Lcom/tencent/liteav/renderer/h;->s:[F

    invoke-static {p1, v4, v2, v0, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 25
    const-string p1, "glDrawArrays"

    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    const/4 v0, 0x5

    const/4 v4, 0x4

    .line 26
    invoke-static {v0, v2, v4}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 27
    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/h;->a(Ljava/lang/String;)V

    .line 28
    iget-boolean p1, p0, Lcom/tencent/liteav/renderer/h;->o:Z

    if-eqz p1, :cond_1

    .line 29
    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void

    .line 30
    :cond_1
    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void
.end method

.method public d(I)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/h;->d()V

    .line 2
    iget v0, p0, Lcom/tencent/liteav/renderer/h;->v:I

    const/16 v1, -0x3039

    if-ne v0, v1, :cond_0

    .line 3
    const-string v0, "TXTweenFilter"

    const-string v1, "invalid frame buffer id"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    :cond_0
    const v1, 0x8d40

    .line 4
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/h;->c(I)V

    const/4 p1, 0x0

    .line 6
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 7
    iget p1, p0, Lcom/tencent/liteav/renderer/h;->u:I

    return p1
.end method
