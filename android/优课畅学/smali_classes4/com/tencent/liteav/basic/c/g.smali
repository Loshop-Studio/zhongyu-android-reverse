.class public Lcom/tencent/liteav/basic/c/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/nio/FloatBuffer;

.field public static b:Ljava/nio/FloatBuffer;

.field public static c:Ljava/nio/FloatBuffer;

.field public static d:Ljava/nio/FloatBuffer;

.field public static e:Ljava/nio/FloatBuffer;

.field private static f:[F

.field private static g:[F

.field private static h:[F

.field private static i:[F

.field private static j:[F

.field private static k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lcom/tencent/liteav/basic/c/g;->f:[F

    .line 9
    .line 10
    new-array v2, v0, [F

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v2, Lcom/tencent/liteav/basic/c/g;->g:[F

    .line 16
    .line 17
    new-array v2, v0, [F

    .line 18
    .line 19
    fill-array-data v2, :array_2

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/tencent/liteav/basic/c/g;->h:[F

    .line 23
    .line 24
    new-array v2, v0, [F

    .line 25
    .line 26
    fill-array-data v2, :array_3

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/tencent/liteav/basic/c/g;->i:[F

    .line 30
    .line 31
    new-array v0, v0, [F

    .line 32
    .line 33
    fill-array-data v0, :array_4

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/tencent/liteav/basic/c/g;->j:[F

    .line 37
    .line 38
    invoke-static {v1}, Lcom/tencent/liteav/basic/c/g;->a([F)Ljava/nio/FloatBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lcom/tencent/liteav/basic/c/g;->a:Ljava/nio/FloatBuffer;

    .line 43
    .line 44
    sget-object v0, Lcom/tencent/liteav/basic/c/g;->g:[F

    .line 45
    .line 46
    invoke-static {v0}, Lcom/tencent/liteav/basic/c/g;->a([F)Ljava/nio/FloatBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lcom/tencent/liteav/basic/c/g;->b:Ljava/nio/FloatBuffer;

    .line 51
    .line 52
    sget-object v0, Lcom/tencent/liteav/basic/c/g;->h:[F

    .line 53
    .line 54
    invoke-static {v0}, Lcom/tencent/liteav/basic/c/g;->a([F)Ljava/nio/FloatBuffer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/tencent/liteav/basic/c/g;->c:Ljava/nio/FloatBuffer;

    .line 59
    .line 60
    sget-object v0, Lcom/tencent/liteav/basic/c/g;->i:[F

    .line 61
    .line 62
    invoke-static {v0}, Lcom/tencent/liteav/basic/c/g;->a([F)Ljava/nio/FloatBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/tencent/liteav/basic/c/g;->d:Ljava/nio/FloatBuffer;

    .line 67
    .line 68
    sget-object v0, Lcom/tencent/liteav/basic/c/g;->j:[F

    .line 69
    .line 70
    invoke-static {v0}, Lcom/tencent/liteav/basic/c/g;->a([F)Ljava/nio/FloatBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lcom/tencent/liteav/basic/c/g;->e:Ljava/nio/FloatBuffer;

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    sput v0, Lcom/tencent/liteav/basic/c/g;->k:I

    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :array_1
    .array-data 4
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data

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
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_4
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static a()I
    .locals 5

    const/4 v0, 0x1

    .line 11
    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 12
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 13
    aget v0, v1, v2

    const v3, 0x8d65

    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v0, 0x2801

    const v4, 0x46180400    # 9729.0f

    .line 14
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2800

    .line 15
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2802

    const v4, 0x812f

    .line 16
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2803

    .line 17
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 18
    aget v0, v1, v2

    return v0
.end method

.method public static a(IIII)I
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-static {p0, p1, p2, p3, v0}, Lcom/tencent/liteav/basic/c/g;->a(IIIILjava/nio/IntBuffer;)I

    move-result p0

    return p0
.end method

.method public static a(IIIILjava/nio/IntBuffer;)I
    .locals 11

    .line 6
    invoke-static {}, Lcom/tencent/liteav/basic/c/g;->b()I

    move-result v0

    const/16 v1, 0xde1

    .line 7
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/4 v7, 0x0

    const/16 v9, 0x1401

    const/16 v2, 0xde1

    const/4 v3, 0x0

    move v5, p0

    move v6, p1

    move v4, p2

    move v8, p3

    move-object v10, p4

    .line 8
    invoke-static/range {v2 .. v10}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    const/4 p0, 0x0

    .line 9
    invoke-static {v1, p0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return v0
.end method

.method public static a(Ljava/lang/String;I)I
    .locals 2

    const/4 v0, 0x1

    .line 19
    new-array v0, v0, [I

    .line 20
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    .line 21
    invoke-static {p1, p0}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 22
    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const p0, 0x8b81

    const/4 v1, 0x0

    .line 23
    invoke-static {p1, p0, v0, v1}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 24
    aget p0, v0, v1

    if-nez p0, :cond_0

    .line 25
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Compilation\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Load Shader Failed"

    invoke-static {p1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    return p1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x1

    .line 26
    new-array v0, v0, [I

    const v1, 0x8b31

    .line 27
    invoke-static {p0, v1}, Lcom/tencent/liteav/basic/c/g;->a(Ljava/lang/String;I)I

    move-result p0

    .line 28
    const-string v1, "Load Program"

    const/4 v2, 0x0

    if-nez p0, :cond_0

    .line 29
    const-string p0, "Vertex Shader Failed"

    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    const v3, 0x8b30

    .line 30
    invoke-static {p1, v3}, Lcom/tencent/liteav/basic/c/g;->a(Ljava/lang/String;I)I

    move-result p1

    if-nez p1, :cond_1

    .line 31
    const-string p0, "Fragment Shader Failed"

    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 32
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v3

    .line 33
    invoke-static {v3, p0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 34
    invoke-static {v3, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 35
    invoke-static {v3}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const v4, 0x8b82

    .line 36
    invoke-static {v3, v4, v0, v2}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 37
    aget v0, v0, v2

    if-gtz v0, :cond_2

    .line 38
    const-string p0, "Linking Failed"

    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 39
    :cond_2
    invoke-static {p0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 40
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    return v3
.end method

.method public static a([F)Ljava/nio/FloatBuffer;
    .locals 2

    .line 1
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    const/4 p0, 0x0

    .line 5
    invoke-virtual {v0, p0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    return-object v0
.end method

.method public static b()I
    .locals 5

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
    const/16 v3, 0xde1

    .line 11
    .line 12
    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x2801

    .line 16
    .line 17
    const v4, 0x46180400    # 9729.0f

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 21
    .line 22
    .line 23
    const/16 v0, 0x2800

    .line 24
    .line 25
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 26
    .line 27
    .line 28
    const/16 v0, 0x2802

    .line 29
    .line 30
    const v4, 0x812f

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 34
    .line 35
    .line 36
    const/16 v0, 0x2803

    .line 37
    .line 38
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 42
    .line 43
    .line 44
    aget v0, v1, v2

    .line 45
    .line 46
    return v0
.end method
