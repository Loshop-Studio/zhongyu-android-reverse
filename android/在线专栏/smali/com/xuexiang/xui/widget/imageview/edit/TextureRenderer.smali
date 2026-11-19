.class Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FLOAT_SIZE_BYTES:I = 0x4

.field private static final FRAGMENT_SHADER:Ljava/lang/String; = "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n"

.field private static final POS_VERTICES:[F

.field private static final TEX_VERTICES:[F

.field private static final VERTEX_SHADER:Ljava/lang/String; = "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n"


# instance fields
.field private mPosCoordHandle:I

.field private mPosVertices:Ljava/nio/FloatBuffer;

.field private mProgram:I

.field private mTexCoordHandle:I

.field private mTexHeight:I

.field private mTexSamplerHandle:I

.field private mTexVertices:Ljava/nio/FloatBuffer;

.field private mTexWidth:I

.field private mViewHeight:I

.field private mViewWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [F

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->TEX_VERTICES:[F

    new-array v0, v0, [F

    .line 2
    fill-array-data v0, :array_1

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->POS_VERTICES:[F

    return-void

    nop

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

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private computeOutputVertices()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mPosVertices:Ljava/nio/FloatBuffer;

    if-eqz v0, :cond_1

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexWidth:I

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexHeight:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mViewWidth:I

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mViewHeight:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    div-float/2addr v2, v1

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v4, v2, v3

    if-lez v4, :cond_0

    div-float v4, v1, v2

    div-float v2, v3, v2

    move v3, v2

    move v1, v4

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v4, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    neg-float v4, v2

    :goto_0
    const/16 v5, 0x8

    new-array v5, v5, [F

    const/4 v6, 0x0

    aput v1, v5, v6

    const/4 v7, 0x1

    aput v4, v5, v7

    const/4 v7, 0x2

    aput v3, v5, v7

    const/4 v7, 0x3

    aput v4, v5, v7

    const/4 v4, 0x4

    aput v1, v5, v4

    const/4 v1, 0x5

    aput v2, v5, v1

    const/4 v1, 0x6

    aput v3, v5, v1

    const/4 v1, 0x7

    aput v2, v5, v1

    .line 4
    invoke-virtual {v0, v5}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    :cond_1
    return-void
.end method


# virtual methods
.method init()V
    .locals 4

    const-string v0, "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n"

    const-string v1, "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n"

    .line 1
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->createProgram(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mProgram:I

    const-string v1, "tex_sampler"

    .line 2
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexSamplerHandle:I

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mProgram:I

    const-string v1, "a_texcoord"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexCoordHandle:I

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mProgram:I

    const-string v1, "a_position"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mPosCoordHandle:I

    .line 5
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->TEX_VERTICES:[F

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 6
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexVertices:Ljava/nio/FloatBuffer;

    .line 7
    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 8
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->POS_VERTICES:[F

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 9
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mPosVertices:Ljava/nio/FloatBuffer;

    .line 10
    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method renderTexture(I)V
    .locals 8

    const v0, 0x8d40

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mProgram:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const-string v0, "glUseProgram"

    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->checkGlError(Ljava/lang/String;)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mViewWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mViewHeight:I

    invoke-static {v1, v1, v0, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const-string v0, "glViewport"

    .line 5
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->checkGlError(Ljava/lang/String;)V

    const/16 v0, 0xbe2

    .line 6
    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexCoordHandle:I

    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexVertices:Ljava/nio/FloatBuffer;

    const/4 v3, 0x2

    const/16 v4, 0x1406

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexCoordHandle:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mPosCoordHandle:I

    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mPosVertices:Ljava/nio/FloatBuffer;

    invoke-static/range {v2 .. v7}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mPosCoordHandle:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const-string v0, "vertex attribute setup"

    .line 11
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->checkGlError(Ljava/lang/String;)V

    const v0, 0x84c0

    .line 12
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const-string v0, "glActiveTexture"

    .line 13
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->checkGlError(Ljava/lang/String;)V

    const/16 v0, 0xde1

    .line 14
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string p1, "glBindTexture"

    .line 15
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->checkGlError(Ljava/lang/String;)V

    .line 16
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexSamplerHandle:I

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    const/4 p1, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    invoke-static {p1, p1, p1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p1, 0x4000

    .line 18
    invoke-static {p1}, Landroid/opengl/GLES20;->glClear(I)V

    const/4 p1, 0x5

    const/4 v0, 0x4

    .line 19
    invoke-static {p1, v1, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    return-void
.end method

.method public tearDown()V
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mProgram:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    return-void
.end method

.method updateTextureSize(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexWidth:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mTexHeight:I

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->computeOutputVertices()V

    return-void
.end method

.method updateViewSize(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mViewWidth:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->mViewHeight:I

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->computeOutputVertices()V

    return-void
.end method
