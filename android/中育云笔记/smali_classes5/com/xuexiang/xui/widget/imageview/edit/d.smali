.class public abstract Lcom/xuexiang/xui/widget/imageview/edit/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, ": glError "

    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 1
    const v0, 0x8b31

    .line 2
    .line 3
    .line 4
    invoke-static {v0, p0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->d(ILjava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    const v1, 0x8b30

    .line 13
    .line 14
    .line 15
    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/imageview/edit/d;->d(ILjava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-static {v1, p0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 29
    .line 30
    .line 31
    const-string p0, "glAttachShader"

    .line 32
    .line 33
    invoke-static {p0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    new-array p1, p0, [I

    .line 47
    .line 48
    const v2, 0x8b82

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2, p1, v0}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 52
    .line 53
    .line 54
    aget p1, p1, v0

    .line 55
    .line 56
    if-ne p1, p0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {v1}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/lang/RuntimeException;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "Could not link program: "

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_3
    :goto_0
    return v1
.end method

.method public static c()V
    .locals 3

    .line 1
    const/16 v0, 0xde1

    .line 2
    .line 3
    const/16 v1, 0x2800

    .line 4
    .line 5
    const/16 v2, 0x2601

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x2801

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x2802

    .line 16
    .line 17
    const v2, 0x812f

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x2803

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static d(ILjava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [I

    .line 15
    .line 16
    const v1, 0x8b81

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, p1, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 21
    .line 22
    .line 23
    aget p1, p1, v2

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/RuntimeException;

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "Could not compile shader "

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, ":"

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_1
    :goto_0
    return v0
.end method
