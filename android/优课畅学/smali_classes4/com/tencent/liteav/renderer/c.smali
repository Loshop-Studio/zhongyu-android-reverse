.class public Lcom/tencent/liteav/renderer/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[F

.field private final b:[F

.field private c:Ljava/nio/FloatBuffer;

.field private d:[F

.field private e:[F

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:I

.field private p:I

.field private q:I


# direct methods
.method public constructor <init>(Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x14

    .line 5
    .line 6
    new-array v1, v0, [F

    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/tencent/liteav/renderer/c;->a:[F

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    fill-array-data v0, :array_1

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/liteav/renderer/c;->b:[F

    .line 19
    .line 20
    const/16 v2, 0x10

    .line 21
    .line 22
    new-array v3, v2, [F

    .line 23
    .line 24
    iput-object v3, p0, Lcom/tencent/liteav/renderer/c;->d:[F

    .line 25
    .line 26
    new-array v2, v2, [F

    .line 27
    .line 28
    iput-object v2, p0, Lcom/tencent/liteav/renderer/c;->e:[F

    .line 29
    .line 30
    const/16 v2, -0x3039

    .line 31
    .line 32
    iput v2, p0, Lcom/tencent/liteav/renderer/c;->g:I

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/c;->l:Z

    .line 36
    .line 37
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/c;->n:Z

    .line 38
    .line 39
    const/4 v3, -0x1

    .line 40
    iput v3, p0, Lcom/tencent/liteav/renderer/c;->o:I

    .line 41
    .line 42
    iput v2, p0, Lcom/tencent/liteav/renderer/c;->p:I

    .line 43
    .line 44
    iput v2, p0, Lcom/tencent/liteav/renderer/c;->q:I

    .line 45
    .line 46
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/c;->m:Z

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    array-length p1, v1

    .line 51
    mul-int/lit8 p1, p1, 0x4

    .line 52
    .line 53
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    array-length p1, v0

    .line 80
    mul-int/lit8 p1, p1, 0x4

    .line 81
    .line 82
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 105
    .line 106
    .line 107
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/renderer/c;->e:[F

    .line 108
    .line 109
    invoke-static {p1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
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

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x0
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private a(ILjava/lang/String;)I
    .locals 3

    .line 31
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v0

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "glCreateShader type="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 33
    invoke-static {v0, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 34
    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 p2, 0x1

    .line 35
    new-array p2, p2, [I

    const v1, 0x8b81

    const/4 v2, 0x0

    .line 36
    invoke-static {v0, v1, p2, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 37
    aget p2, p2, v2

    if-nez p2, :cond_0

    .line 38
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not compile shader "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TXCOesTextureRender"

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
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

    .line 40
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    return v2

    :cond_0
    return v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    const v0, 0x8b31

    .line 41
    invoke-direct {p0, v0, p1}, Lcom/tencent/liteav/renderer/c;->a(ILjava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const v1, 0x8b30

    .line 42
    invoke-direct {p0, v1, p2}, Lcom/tencent/liteav/renderer/c;->a(ILjava/lang/String;)I

    move-result p2

    if-nez p2, :cond_1

    return v0

    .line 43
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v1

    .line 44
    const-string v2, "glCreateProgram"

    invoke-virtual {p0, v2}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 45
    const-string v2, "TXCOesTextureRender"

    if-nez v1, :cond_2

    .line 46
    const-string v3, "Could not create program"

    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :cond_2
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 48
    const-string p1, "glAttachShader"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 49
    invoke-static {v1, p2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 50
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 51
    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x1

    .line 52
    new-array p2, p1, [I

    const v3, 0x8b82

    .line 53
    invoke-static {v1, v3, p2, v0}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 54
    aget p2, p2, v0

    if-eq p2, p1, :cond_3

    .line 55
    const-string p1, "Could not link program: "

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-static {v1}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    return v0

    :cond_3
    return v1
.end method

.method private b(II)V
    .locals 9

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1
    invoke-static {v0, v0, v0, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4100

    .line 2
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 3
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/c;->l:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 4
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/c;->l:Z

    return-void

    .line 5
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 6
    const-string v0, "glUseProgram"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    const v0, 0x84c0

    .line 7
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 8
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 9
    iget-object p1, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 10
    iget v3, p0, Lcom/tencent/liteav/renderer/c;->j:I

    const/16 v7, 0x14

    iget-object v8, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    const/4 v4, 0x3

    const/16 v5, 0x1406

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 11
    const-string p1, "glVertexAttribPointer maPosition"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 12
    iget p1, p0, Lcom/tencent/liteav/renderer/c;->j:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 13
    const-string p1, "glEnableVertexAttribArray maPositionHandle"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    iget v3, p0, Lcom/tencent/liteav/renderer/c;->k:I

    iget-object v8, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    const/4 v4, 0x2

    invoke-static/range {v3 .. v8}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 16
    const-string p1, "glVertexAttribPointer maTextureHandle"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 17
    iget p1, p0, Lcom/tencent/liteav/renderer/c;->k:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 18
    const-string p1, "glEnableVertexAttribArray maTextureHandle"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lcom/tencent/liteav/renderer/c;->d:[F

    invoke-static {p1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 20
    iget p1, p0, Lcom/tencent/liteav/renderer/c;->h:I

    iget-object p2, p0, Lcom/tencent/liteav/renderer/c;->d:[F

    const/4 v0, 0x1

    invoke-static {p1, v0, v2, p2, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 21
    iget p1, p0, Lcom/tencent/liteav/renderer/c;->p:I

    rem-int/lit8 p2, p1, 0x8

    if-eqz p2, :cond_1

    add-int/lit8 p2, p1, 0x7

    .line 22
    div-int/lit8 p2, p2, 0x8

    mul-int/lit8 p2, p2, 0x8

    .line 23
    iget-object v3, p0, Lcom/tencent/liteav/renderer/c;->e:[F

    sub-int/2addr p1, v0

    int-to-float p1, p1

    mul-float/2addr p1, v1

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {v3, v2, p1, v1, v1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 24
    :cond_1
    iget p1, p0, Lcom/tencent/liteav/renderer/c;->q:I

    rem-int/lit8 p2, p1, 0x8

    if-eqz p2, :cond_2

    add-int/lit8 p2, p1, 0x7

    .line 25
    div-int/lit8 p2, p2, 0x8

    mul-int/lit8 p2, p2, 0x8

    .line 26
    iget-object v3, p0, Lcom/tencent/liteav/renderer/c;->e:[F

    sub-int/2addr p1, v0

    int-to-float p1, p1

    mul-float/2addr p1, v1

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {v3, v2, v1, p1, v1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 27
    :cond_2
    iget p1, p0, Lcom/tencent/liteav/renderer/c;->i:I

    iget-object p2, p0, Lcom/tencent/liteav/renderer/c;->e:[F

    invoke-static {p1, v0, v2, p2, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const/4 p1, 0x5

    const/4 p2, 0x4

    .line 28
    invoke-static {p1, v2, p2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 29
    const-string p1, "glDrawArrays"

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    return-void
.end method

.method private d()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 6
    .line 7
    .line 8
    aget v0, v1, v2

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/liteav/renderer/c;->g:I

    .line 11
    .line 12
    const v1, 0x8d65

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 16
    .line 17
    .line 18
    const-string v0, "glBindTexture mTextureID"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->g:I

    return v0
.end method

.method public a(II)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/tencent/liteav/renderer/c;->p:I

    .line 6
    iput p2, p0, Lcom/tencent/liteav/renderer/c;->q:I

    return-void
.end method

.method public a(IZI)V
    .locals 8

    .line 7
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/c;->n:Z

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/tencent/liteav/renderer/c;->o:I

    if-eq v0, p3, :cond_4

    .line 8
    :cond_0
    iput-boolean p2, p0, Lcom/tencent/liteav/renderer/c;->n:Z

    .line 9
    iput p3, p0, Lcom/tencent/liteav/renderer/c;->o:I

    const/16 p2, 0x14

    .line 10
    new-array v0, p2, [F

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p2, :cond_1

    .line 11
    iget-object v3, p0, Lcom/tencent/liteav/renderer/c;->b:[F

    aget v3, v3, v2

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 12
    :cond_1
    iget-boolean p2, p0, Lcom/tencent/liteav/renderer/c;->n:Z

    if-eqz p2, :cond_2

    .line 13
    aget p2, v0, v1

    neg-float p2, p2

    aput p2, v0, v1

    const/4 p2, 0x5

    .line 14
    aget v2, v0, p2

    neg-float v2, v2

    aput v2, v0, p2

    const/16 p2, 0xa

    .line 15
    aget v2, v0, p2

    neg-float v2, v2

    aput v2, v0, p2

    const/16 p2, 0xf

    .line 16
    aget v2, v0, p2

    neg-float v2, v2

    aput v2, v0, p2

    .line 17
    :cond_2
    div-int/lit8 p3, p3, 0x5a

    move p2, v1

    :goto_1
    if-ge p2, p3, :cond_3

    const/4 v2, 0x3

    .line 18
    aget v3, v0, v2

    const/4 v4, 0x4

    .line 19
    aget v5, v0, v4

    const/16 v6, 0x8

    .line 20
    aget v7, v0, v6

    aput v7, v0, v2

    const/16 v2, 0x9

    .line 21
    aget v7, v0, v2

    aput v7, v0, v4

    const/16 v4, 0x12

    .line 22
    aget v7, v0, v4

    aput v7, v0, v6

    const/16 v6, 0x13

    .line 23
    aget v7, v0, v6

    aput v7, v0, v2

    const/16 v2, 0xd

    .line 24
    aget v7, v0, v2

    aput v7, v0, v4

    const/16 v4, 0xe

    .line 25
    aget v7, v0, v4

    aput v7, v0, v6

    .line 26
    aput v3, v0, v2

    .line 27
    aput v5, v0, v4

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 28
    :cond_3
    iget-object p2, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 29
    iget-object p2, p0, Lcom/tencent/liteav/renderer/c;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {p2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    :cond_4
    const/16 p2, 0xde1

    .line 30
    invoke-direct {p0, p2, p1}, Lcom/tencent/liteav/renderer/c;->b(II)V

    return-void
.end method

.method public a(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    const-string v0, "onDrawFrame start"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/c;->e:[F

    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    const p1, 0x8d65

    .line 4
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->g:I

    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/renderer/c;->b(II)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 58
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": glError "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXCOesTextureRender"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 31
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/c;->m:Z

    const-string v1, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"

    if-eqz v0, :cond_0

    .line 32
    const-string v0, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    goto :goto_0

    .line 33
    :cond_0
    const-string v0, "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}"

    invoke-direct {p0, v1, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    .line 34
    :goto_0
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    const-string v1, "TXCOesTextureRender"

    if-nez v0, :cond_1

    .line 35
    const-string v0, "failed creating program"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 36
    :cond_1
    const-string v2, "aPosition"

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/c;->j:I

    .line 37
    const-string v0, "glGetAttribLocation aPosition"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 38
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->j:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 39
    const-string v0, "Could not get attrib location for aPosition"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 40
    :cond_2
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    const-string v3, "aTextureCoord"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/c;->k:I

    .line 41
    const-string v0, "glGetAttribLocation aTextureCoord"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 42
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->k:I

    if-ne v0, v2, :cond_3

    .line 43
    const-string v0, "Could not get attrib location for aTextureCoord"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 44
    :cond_3
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    const-string v3, "uMVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/c;->h:I

    .line 45
    const-string v0, "glGetUniformLocation uMVPMatrix"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 46
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->h:I

    if-ne v0, v2, :cond_4

    .line 47
    const-string v0, "Could not get attrib location for uMVPMatrix"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 48
    :cond_4
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    const-string v3, "uSTMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/renderer/c;->i:I

    .line 49
    const-string v0, "glGetUniformLocation uSTMatrix"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    .line 50
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->i:I

    if-ne v0, v2, :cond_5

    .line 51
    const-string v0, "Could not get attrib location for uSTMatrix"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 52
    :cond_5
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/c;->m:Z

    if-eqz v0, :cond_6

    .line 53
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/c;->d()V

    :cond_6
    const/16 v0, 0x2801

    const v1, 0x8d65

    const v2, 0x46180400    # 9729.0f

    .line 54
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2800

    .line 55
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2802

    const v2, 0x812f

    .line 56
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2803

    .line 57
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 58
    const-string v0, "glTexParameter"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->f:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/renderer/c;->g:I

    .line 9
    .line 10
    filled-new-array {v0}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 17
    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    iput v0, p0, Lcom/tencent/liteav/renderer/c;->g:I

    .line 21
    .line 22
    return-void
.end method
