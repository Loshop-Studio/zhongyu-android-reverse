.class public Lcom/xuexiang/xui/widget/imageview/edit/g;
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
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/edit/g;->k:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/edit/g;->l:[F

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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->f:Ljava/nio/FloatBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->i:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->j:I

    .line 9
    .line 10
    int-to-float v2, v2

    .line 11
    div-float/2addr v1, v2

    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->g:I

    .line 13
    .line 14
    int-to-float v2, v2

    .line 15
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->h:I

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

.method public b()V
    .locals 4

    .line 1
    const-string v0, "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n"

    .line 2
    .line 3
    const-string v1, "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/d;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->a:I

    .line 10
    .line 11
    const-string v1, "tex_sampler"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->b:I

    .line 18
    .line 19
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->a:I

    .line 20
    .line 21
    const-string v1, "a_texcoord"

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->c:I

    .line 28
    .line 29
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->a:I

    .line 30
    .line 31
    const-string v1, "a_position"

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->d:I

    .line 38
    .line 39
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/g;->k:[F

    .line 40
    .line 41
    array-length v1, v0

    .line 42
    mul-int/lit8 v1, v1, 0x4

    .line 43
    .line 44
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->e:Ljava/nio/FloatBuffer;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/g;->l:[F

    .line 71
    .line 72
    array-length v2, v0

    .line 73
    mul-int/lit8 v2, v2, 0x4

    .line 74
    .line 75
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->f:Ljava/nio/FloatBuffer;

    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public c(I)V
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
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->a:I

    .line 9
    .line 10
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 11
    .line 12
    .line 13
    const-string v0, "glUseProgram"

    .line 14
    .line 15
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->g:I

    .line 19
    .line 20
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->h:I

    .line 21
    .line 22
    invoke-static {v1, v1, v0, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 23
    .line 24
    .line 25
    const-string v0, "glViewport"

    .line 26
    .line 27
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

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
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->c:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->e:Ljava/nio/FloatBuffer;

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
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->c:I

    .line 48
    .line 49
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 50
    .line 51
    .line 52
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->d:I

    .line 53
    .line 54
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->f:Ljava/nio/FloatBuffer;

    .line 55
    .line 56
    invoke-static/range {v2 .. v7}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 57
    .line 58
    .line 59
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->d:I

    .line 60
    .line 61
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 62
    .line 63
    .line 64
    const-string v0, "vertex attribute setup"

    .line 65
    .line 66
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

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
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

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
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/d;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->b:I

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

.method public d(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->i:I

    .line 2
    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->j:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/g;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->g:I

    .line 2
    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/g;->h:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/g;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
