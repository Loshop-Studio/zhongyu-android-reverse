.class public final Lcom/xuexiang/xui/widget/imageview/edit/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:[F

.field public static final l:[F


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/nio/FloatBuffer;

.field public f:Ljava/nio/FloatBuffer;

.field public g:I

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

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
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/edit/f;->k:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->l:[F

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    :array_1
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
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->f:Ljava/nio/FloatBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->i:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->j:I

    .line 9
    .line 10
    int-to-float v2, v2

    .line 11
    div-float/2addr v1, v2

    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->g:I

    .line 13
    .line 14
    int-to-float v2, v2

    .line 15
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->h:I

    .line 16
    .line 17
    int-to-float v3, v3

    .line 18
    div-float/2addr v2, v3

    .line 19
    div-float/2addr v2, v1

    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float v3, v2, v1

    .line 23
    .line 24
    const/high16 v4, -0x40800000    # -1.0f

    .line 25
    .line 26
    if-lez v3, :cond_0

    .line 27
    .line 28
    div-float v3, v4, v2

    .line 29
    .line 30
    div-float v2, v1, v2

    .line 31
    .line 32
    move v8, v2

    .line 33
    move v2, v1

    .line 34
    move v1, v8

    .line 35
    move v8, v4

    .line 36
    move v4, v3

    .line 37
    move v3, v8

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    neg-float v3, v2

    .line 40
    :goto_0
    const/16 v5, 0x8

    .line 41
    .line 42
    new-array v5, v5, [F

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    aput v4, v5, v6

    .line 46
    .line 47
    const/4 v7, 0x1

    .line 48
    aput v3, v5, v7

    .line 49
    .line 50
    const/4 v7, 0x2

    .line 51
    aput v1, v5, v7

    .line 52
    .line 53
    const/4 v7, 0x3

    .line 54
    aput v3, v5, v7

    .line 55
    .line 56
    const/4 v3, 0x4

    .line 57
    aput v4, v5, v3

    .line 58
    .line 59
    const/4 v3, 0x5

    .line 60
    aput v2, v5, v3

    .line 61
    .line 62
    const/4 v3, 0x6

    .line 63
    aput v1, v5, v3

    .line 64
    .line 65
    const/4 v1, 0x7

    .line 66
    aput v2, v5, v1

    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, v6}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method

.method public final b(I)V
    .locals 8

    .line 1
    const v0, 0x8d40

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->a:I

    .line 9
    .line 10
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 11
    .line 12
    .line 13
    const-string v0, "glUseProgram"

    .line 14
    .line 15
    invoke-static {v0}, Lv7/l;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->g:I

    .line 19
    .line 20
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->h:I

    .line 21
    .line 22
    invoke-static {v1, v1, v0, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 23
    .line 24
    .line 25
    const-string v0, "glViewport"

    .line 26
    .line 27
    invoke-static {v0}, Lv7/l;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/16 v0, 0xbe2

    .line 31
    .line 32
    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 33
    .line 34
    .line 35
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->c:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->e:Ljava/nio/FloatBuffer;

    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    const/16 v4, 0x1406

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v2 .. v7}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 45
    .line 46
    .line 47
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->c:I

    .line 48
    .line 49
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 50
    .line 51
    .line 52
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->d:I

    .line 53
    .line 54
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->f:Ljava/nio/FloatBuffer;

    .line 55
    .line 56
    invoke-static/range {v2 .. v7}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 57
    .line 58
    .line 59
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->d:I

    .line 60
    .line 61
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 62
    .line 63
    .line 64
    const-string v0, "vertex attribute setup"

    .line 65
    .line 66
    invoke-static {v0}, Lv7/l;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const v0, 0x84c0

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 73
    .line 74
    .line 75
    const-string v0, "glActiveTexture"

    .line 76
    .line 77
    invoke-static {v0}, Lv7/l;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/16 v0, 0xde1

    .line 81
    .line 82
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 83
    .line 84
    .line 85
    const-string p1, "glBindTexture"

    .line 86
    .line 87
    invoke-static {p1}, Lv7/l;->c(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/f;->b:I

    .line 91
    .line 92
    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    const/high16 v0, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-static {p1, p1, p1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 99
    .line 100
    .line 101
    const/16 p1, 0x4000

    .line 102
    .line 103
    invoke-static {p1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x5

    .line 107
    const/4 v0, 0x4

    .line 108
    invoke-static {p1, v1, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 109
    .line 110
    .line 111
    return-void
.end method
