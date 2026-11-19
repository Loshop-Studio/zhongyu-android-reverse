.class public abstract Landroidx/camera/core/processing/util/GLUtils$Program2D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/processing/util/GLUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Program2D"
.end annotation


# instance fields
.field protected mAlphaScaleLoc:I

.field protected mPositionLoc:I

.field protected mProgramHandle:I

.field protected mTransMatrixLoc:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-string/jumbo v0, "glAttachShader"

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mTransMatrixLoc:I

    .line 9
    .line 10
    iput v1, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mAlphaScaleLoc:I

    .line 11
    .line 12
    iput v1, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mPositionLoc:I

    .line 13
    .line 14
    const v2, 0x8b31

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {v2, p1}, Landroidx/camera/core/processing/util/GLUtils;->loadShader(ILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_6

    .line 21
    const v2, 0x8b30

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-static {v2, p2}, Landroidx/camera/core/processing/util/GLUtils;->loadShader(ILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p2
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    .line 28
    :try_start_2
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 29
    .line 30
    .line 31
    move-result v2
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 32
    :try_start_3
    const-string/jumbo v3, "glCreateProgram"

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2, p2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    new-array v3, v0, [I

    .line 55
    .line 56
    const v4, 0x8b82

    .line 57
    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static {v2, v4, v3, v5}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 61
    .line 62
    .line 63
    aget v3, v3, v5

    .line 64
    .line 65
    if-ne v3, v0, :cond_0

    .line 66
    .line 67
    iput v2, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mProgramHandle:I
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 68
    .line 69
    invoke-direct {p0}, Landroidx/camera/core/processing/util/GLUtils$Program2D;->loadLocations()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catch_0
    move-exception v0

    .line 74
    goto :goto_4

    .line 75
    :catch_1
    move-exception v0

    .line 76
    goto :goto_4

    .line 77
    :cond_0
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v4, "Could not link program: "

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    .line 104
    :catch_2
    move-exception v0

    .line 105
    :goto_0
    move v2, v1

    .line 106
    goto :goto_4

    .line 107
    :catch_3
    move-exception v0

    .line 108
    goto :goto_0

    .line 109
    :catch_4
    move-exception v0

    .line 110
    :goto_1
    move p2, v1

    .line 111
    :goto_2
    move v2, p2

    .line 112
    goto :goto_4

    .line 113
    :catch_5
    move-exception v0

    .line 114
    goto :goto_1

    .line 115
    :catch_6
    move-exception v0

    .line 116
    :goto_3
    move p1, v1

    .line 117
    move p2, p1

    .line 118
    goto :goto_2

    .line 119
    :catch_7
    move-exception v0

    .line 120
    goto :goto_3

    .line 121
    :goto_4
    if-eq p1, v1, :cond_1

    .line 122
    .line 123
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 124
    .line 125
    .line 126
    :cond_1
    if-eq p2, v1, :cond_2

    .line 127
    .line 128
    invoke-static {p2}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 129
    .line 130
    .line 131
    :cond_2
    if-eq v2, v1, :cond_3

    .line 132
    .line 133
    invoke-static {v2}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 134
    .line 135
    .line 136
    :cond_3
    throw v0
.end method

.method public static synthetic access$100(Landroidx/camera/core/processing/util/GLUtils$Program2D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/core/processing/util/GLUtils$Program2D;->loadLocations()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private loadLocations()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mProgramHandle:I

    .line 2
    .line 3
    const-string v1, "aPosition"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mPositionLoc:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroidx/camera/core/processing/util/GLUtils;->checkLocationOrThrow(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mProgramHandle:I

    .line 15
    .line 16
    const-string/jumbo v1, "uTransMatrix"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mTransMatrixLoc:I

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/camera/core/processing/util/GLUtils;->checkLocationOrThrow(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mProgramHandle:I

    .line 29
    .line 30
    const-string/jumbo v1, "uAlphaScale"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mAlphaScaleLoc:I

    .line 38
    .line 39
    invoke-static {v0, v1}, Landroidx/camera/core/processing/util/GLUtils;->checkLocationOrThrow(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public delete()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mProgramHandle:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public updateAlpha(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mAlphaScaleLoc:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo p1, "glUniform1f"

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public updateTransformMatrix([F)V
    .locals 3
    .param p1    # [F
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mTransMatrixLoc:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, v1, v2, p1, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo p1, "glUniformMatrix4fv"

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public use()V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mProgramHandle:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "glUseProgram"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mPositionLoc:I

    .line 13
    .line 14
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 15
    .line 16
    .line 17
    const-string/jumbo v0, "glEnableVertexAttribArray"

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Landroidx/camera/core/processing/util/GLUtils$Program2D;->mPositionLoc:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    sget-object v6, Landroidx/camera/core/processing/util/GLUtils;->VERTEX_BUF:Ljava/nio/FloatBuffer;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    const/16 v3, 0x1406

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 33
    .line 34
    .line 35
    const-string/jumbo v0, "glVertexAttribPointer"

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Landroidx/camera/core/processing/util/GLUtils;->checkGlErrorOrThrow(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroidx/camera/core/processing/util/GLUtils;->create4x4IdentityMatrix()[F

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, v0}, Landroidx/camera/core/processing/util/GLUtils$Program2D;->updateTransformMatrix([F)V

    .line 46
    .line 47
    .line 48
    const/high16 v0, 0x3f800000    # 1.0f

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroidx/camera/core/processing/util/GLUtils$Program2D;->updateAlpha(F)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
