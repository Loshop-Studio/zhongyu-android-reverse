.class public Lcom/tencent/liteav/basic/c/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/c/e$a;


# instance fields
.field private volatile a:Landroid/os/HandlerThread;

.field private volatile b:Lcom/tencent/liteav/basic/c/e;

.field private c:Lcom/tencent/liteav/basic/c/f;

.field private d:I

.field private e:Z

.field private f:F

.field private g:F

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Z

.field private m:Lcom/tencent/liteav/basic/c/k;

.field private n:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/tencent/liteav/basic/c/d;->d:I

    .line 13
    .line 14
    iput-boolean v1, p0, Lcom/tencent/liteav/basic/c/d;->e:Z

    .line 15
    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    iput v2, p0, Lcom/tencent/liteav/basic/c/d;->f:F

    .line 19
    .line 20
    iput v2, p0, Lcom/tencent/liteav/basic/c/d;->g:F

    .line 21
    .line 22
    iput v1, p0, Lcom/tencent/liteav/basic/c/d;->h:I

    .line 23
    .line 24
    iput v1, p0, Lcom/tencent/liteav/basic/c/d;->i:I

    .line 25
    .line 26
    iput v1, p0, Lcom/tencent/liteav/basic/c/d;->j:I

    .line 27
    .line 28
    iput v1, p0, Lcom/tencent/liteav/basic/c/d;->k:I

    .line 29
    .line 30
    iput-boolean v1, p0, Lcom/tencent/liteav/basic/c/d;->l:Z

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->m:Lcom/tencent/liteav/basic/c/k;

    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/tencent/liteav/basic/c/d;->n:Z

    .line 35
    .line 36
    return-void
.end method

.method private a(I)V
    .locals 1

    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    if-eqz v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private a(II)V
    .locals 12

    .line 23
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/d;->l:Z

    if-eqz v0, :cond_5

    .line 24
    iget v0, p0, Lcom/tencent/liteav/basic/c/d;->j:I

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget v2, p0, Lcom/tencent/liteav/basic/c/d;->k:I

    if-eqz v2, :cond_4

    if-gt v0, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-lt v2, v0, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    if-lt v2, v0, :cond_2

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-eqz v3, :cond_3

    move v7, v0

    move v8, v4

    goto :goto_3

    :cond_3
    move v8, v0

    move v7, v4

    :goto_3
    mul-int v0, v7, v8

    mul-int/lit8 v0, v0, 0x4

    .line 25
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v11

    .line 26
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v8, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 27
    invoke-virtual {v11, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v9, 0x1908

    const/16 v10, 0x1401

    move v5, p1

    move v6, p2

    .line 28
    invoke-static/range {v5 .. v11}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 29
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/d;->m:Lcom/tencent/liteav/basic/c/k;

    if-eqz p1, :cond_4

    .line 30
    new-instance p2, Ljava/lang/Thread;

    new-instance v5, Lcom/tencent/liteav/basic/c/d$2;

    move-object v6, p0

    move v9, v7

    move v10, v8

    move-object v7, v11

    move-object v11, p1

    move-object v8, v0

    invoke-direct/range {v5 .. v11}, Lcom/tencent/liteav/basic/c/d$2;-><init>(Lcom/tencent/liteav/basic/c/d;Ljava/nio/ByteBuffer;Landroid/graphics/Bitmap;IILcom/tencent/liteav/basic/c/k;)V

    invoke-direct {p2, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 31
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    goto :goto_4

    :cond_4
    move-object v6, p0

    :goto_4
    const/4 p1, 0x0

    .line 32
    iput-object p1, v6, Lcom/tencent/liteav/basic/c/d;->m:Lcom/tencent/liteav/basic/c/k;

    .line 33
    iput-boolean v1, v6, Lcom/tencent/liteav/basic/c/d;->l:Z

    return-void

    :cond_5
    move-object v6, p0

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/c/d;IZIIIIIZZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lcom/tencent/liteav/basic/c/d;->b(IZIIIIIZZ)V

    return-void
.end method

.method private a(IIII)[I
    .locals 4

    int-to-float v0, p2

    int-to-float v1, p1

    div-float v2, v0, v1

    int-to-float p4, p4

    int-to-float p3, p3

    div-float/2addr p4, p3

    cmpl-float p3, v2, p4

    const/4 v2, 0x0

    if-lez p3, :cond_0

    mul-float/2addr v1, p4

    float-to-int p3, v1

    sub-int/2addr p2, p3

    .line 20
    div-int/lit8 p2, p2, 0x2

    move v3, p3

    move p3, p2

    move p2, v3

    goto :goto_0

    :cond_0
    div-float/2addr v0, p4

    float-to-int p3, v0

    sub-int/2addr p1, p3

    .line 21
    div-int/lit8 p1, p1, 0x2

    move v3, v2

    move v2, p1

    move p1, p3

    move p3, v3

    .line 22
    :goto_0
    filled-new-array {p1, p2, v2, p3}, [I

    move-result-object p1

    return-object p1
.end method

.method private b(IZIIIIIZZ)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p6

    move/from16 v3, p7

    if-eqz v2, :cond_19

    if-eqz v3, :cond_19

    .line 20
    iget-object v4, v0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    if-nez v4, :cond_0

    goto/16 :goto_16

    .line 21
    :cond_0
    iget-boolean v4, v0, Lcom/tencent/liteav/basic/c/d;->n:Z

    const/4 v9, 0x0

    if-eqz v4, :cond_1

    .line 22
    iput-boolean v9, v0, Lcom/tencent/liteav/basic/c/d;->n:Z

    return-void

    :cond_1
    const v10, 0x8d40

    const/16 v11, 0x4100

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    const/4 v4, 0x1

    if-eqz p8, :cond_3

    .line 23
    invoke-static {v13, v13, v13, v12}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 24
    invoke-static {v11}, Landroid/opengl/GLES20;->glClear(I)V

    .line 25
    invoke-static {v10, v9}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 26
    iget-object v5, v0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    if-eqz v5, :cond_2

    .line 27
    iget-object v5, v0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    invoke-virtual {v5}, Lcom/tencent/liteav/basic/c/e;->b()V

    .line 28
    :cond_2
    iput-boolean v4, v0, Lcom/tencent/liteav/basic/c/d;->n:Z

    :cond_3
    if-eqz p4, :cond_4

    move/from16 v5, p4

    goto :goto_0

    :cond_4
    move v5, v2

    :goto_0
    if-eqz p5, :cond_5

    move/from16 v6, p5

    goto :goto_1

    :cond_5
    move v6, v3

    .line 29
    :goto_1
    iget v7, v0, Lcom/tencent/liteav/basic/c/d;->h:I

    const/4 v8, 0x2

    const/16 v14, 0x10e

    const/16 v15, 0x5a

    if-nez v7, :cond_6

    move v7, v9

    move/from16 v16, v11

    :goto_2
    move v11, v7

    goto :goto_7

    :cond_6
    if-ne v7, v4, :cond_b

    .line 30
    iget v7, v0, Lcom/tencent/liteav/basic/c/d;->d:I

    rsub-int v7, v7, 0x2d0

    rem-int/lit16 v7, v7, 0x168

    if-eq v7, v15, :cond_8

    if-ne v7, v14, :cond_7

    goto :goto_3

    :cond_7
    move v7, v9

    goto :goto_4

    :cond_8
    :goto_3
    move v7, v4

    :goto_4
    move/from16 v16, v11

    if-eqz v7, :cond_9

    move v11, v3

    goto :goto_5

    :cond_9
    move v11, v2

    :goto_5
    if-eqz v7, :cond_a

    move v7, v2

    goto :goto_6

    :cond_a
    move v7, v3

    .line 31
    :goto_6
    invoke-direct {v0, v5, v6, v11, v7}, Lcom/tencent/liteav/basic/c/d;->a(IIII)[I

    move-result-object v5

    .line 32
    aget v6, v5, v9

    .line 33
    aget v7, v5, v4

    .line 34
    aget v11, v5, v8

    const/16 v17, 0x3

    .line 35
    aget v5, v5, v17

    move/from16 v18, v11

    move v11, v5

    move v5, v6

    move v6, v7

    move/from16 v7, v18

    goto :goto_7

    :cond_b
    move/from16 v16, v11

    move v7, v9

    goto :goto_2

    .line 36
    :goto_7
    iput v5, v0, Lcom/tencent/liteav/basic/c/d;->j:I

    .line 37
    iput v6, v0, Lcom/tencent/liteav/basic/c/d;->k:I

    .line 38
    invoke-static {v7, v11, v5, v6}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 39
    iget v10, v0, Lcom/tencent/liteav/basic/c/d;->i:I

    if-ne v10, v4, :cond_c

    if-nez p9, :cond_d

    :goto_8
    xor-int/lit8 v8, p2, 0x1

    goto :goto_9

    :cond_c
    if-ne v10, v8, :cond_d

    if-eqz p9, :cond_d

    goto :goto_8

    :cond_d
    move/from16 v8, p2

    :goto_9
    if-eqz v6, :cond_e

    int-to-float v10, v5

    int-to-float v12, v6

    div-float/2addr v10, v12

    goto :goto_a

    :cond_e
    const/high16 v10, 0x3f800000    # 1.0f

    :goto_a
    if-eqz v3, :cond_f

    int-to-float v12, v2

    int-to-float v13, v3

    div-float/2addr v12, v13

    goto :goto_b

    :cond_f
    const/high16 v12, 0x3f800000    # 1.0f

    .line 40
    :goto_b
    iget-boolean v13, v0, Lcom/tencent/liteav/basic/c/d;->e:Z

    if-ne v13, v8, :cond_11

    iget v13, v0, Lcom/tencent/liteav/basic/c/d;->d:I

    if-ne v13, v1, :cond_11

    iget v13, v0, Lcom/tencent/liteav/basic/c/d;->f:F

    cmpl-float v13, v13, v10

    if-nez v13, :cond_11

    iget v13, v0, Lcom/tencent/liteav/basic/c/d;->g:F

    cmpl-float v13, v13, v12

    if-eqz v13, :cond_10

    goto :goto_d

    :cond_10
    move v12, v7

    :goto_c
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    goto/16 :goto_15

    .line 41
    :cond_11
    :goto_d
    iput-boolean v8, v0, Lcom/tencent/liteav/basic/c/d;->e:Z

    .line 42
    iput v1, v0, Lcom/tencent/liteav/basic/c/d;->d:I

    .line 43
    iput v10, v0, Lcom/tencent/liteav/basic/c/d;->f:F

    .line 44
    iput v12, v0, Lcom/tencent/liteav/basic/c/d;->g:F

    rsub-int v1, v1, 0x2d0

    .line 45
    rem-int/lit16 v1, v1, 0x168

    if-eq v1, v15, :cond_13

    if-ne v1, v14, :cond_12

    goto :goto_e

    :cond_12
    move v10, v9

    goto :goto_f

    :cond_13
    :goto_e
    move v10, v4

    :goto_f
    if-eqz v10, :cond_14

    move v8, v6

    goto :goto_10

    :cond_14
    move v8, v5

    :goto_10
    if-eqz v10, :cond_15

    :goto_11
    move v6, v1

    goto :goto_12

    :cond_15
    move v5, v6

    goto :goto_11

    .line 46
    :goto_12
    iget-object v1, v0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    sget-object v12, Lcom/tencent/liteav/basic/c/h;->a:Lcom/tencent/liteav/basic/c/h;

    .line 47
    invoke-static {v12, v9, v4}, Lcom/tencent/liteav/basic/c/i;->a(Lcom/tencent/liteav/basic/c/h;ZZ)[F

    move-result-object v4

    int-to-float v8, v8

    int-to-float v5, v5

    div-float/2addr v8, v5

    if-eqz v10, :cond_16

    move v5, v9

    goto :goto_13

    :cond_16
    iget-boolean v5, v0, Lcom/tencent/liteav/basic/c/d;->e:Z

    :goto_13
    if-eqz v10, :cond_17

    iget-boolean v12, v0, Lcom/tencent/liteav/basic/c/d;->e:Z

    move/from16 v18, v5

    move-object v5, v4

    move v4, v6

    move v6, v8

    move v8, v12

    move v12, v7

    move/from16 v7, v18

    goto :goto_14

    :cond_17
    move v12, v7

    move v7, v5

    move-object v5, v4

    move v4, v6

    move v6, v8

    move v8, v9

    .line 48
    :goto_14
    invoke-virtual/range {v1 .. v8}, Lcom/tencent/liteav/basic/c/f;->a(III[FFZZ)V

    if-eqz v10, :cond_18

    .line 49
    iget-object v1, v0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    invoke-virtual {v1}, Lcom/tencent/liteav/basic/c/f;->g()V

    goto :goto_c

    .line 50
    :cond_18
    iget-object v1, v0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    invoke-virtual {v1}, Lcom/tencent/liteav/basic/c/f;->h()V

    goto :goto_c

    .line 51
    :goto_15
    invoke-static {v2, v2, v2, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 52
    invoke-static/range {v16 .. v16}, Landroid/opengl/GLES20;->glClear(I)V

    const v1, 0x8d40

    .line 53
    invoke-static {v1, v9}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 54
    iget-object v1, v0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/basic/c/f;->a(I)I

    .line 55
    invoke-direct {v0, v12, v11}, Lcom/tencent/liteav/basic/c/d;->a(II)V

    .line 56
    iget-object v1, v0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    if-eqz v1, :cond_19

    .line 57
    iget-object v1, v0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    invoke-virtual {v1}, Lcom/tencent/liteav/basic/c/e;->b()V

    :cond_19
    :goto_16
    return-void
.end method

.method private b(Ljava/lang/Object;Landroid/view/Surface;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Lcom/tencent/liteav/basic/c/d;->f()V

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TXGLSurfaceRenderThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 8
    new-instance v0, Lcom/tencent/liteav/basic/c/e;

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/liteav/basic/c/e;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/basic/c/e;->a(Lcom/tencent/liteav/basic/c/e$a;)V

    if-eqz p1, :cond_1

    .line 10
    instance-of v0, p1, Ljavax/microedition/khronos/egl/EGLContext;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/tencent/liteav/basic/c/e;->d:Z

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    check-cast p1, Landroid/opengl/EGLContext;

    iput-object p1, v0, Lcom/tencent/liteav/basic/c/e;->f:Landroid/opengl/EGLContext;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 13
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/tencent/liteav/basic/c/e;->d:Z

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    check-cast p1, Ljavax/microedition/khronos/egl/EGLContext;

    iput-object p1, v0, Lcom/tencent/liteav/basic/c/e;->h:Ljavax/microedition/khronos/egl/EGLContext;

    .line 15
    :goto_1
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    iput-object p2, p1, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    .line 16
    const-string p1, "TXGLSurfaceRenderThread"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "surface-render: create gl thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x64

    .line 18
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/c/d;->a(I)V

    return-void

    .line 19
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private f()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/c/e;->a(Landroid/os/Handler;Landroid/os/HandlerThread;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "TXGLSurfaceRenderThread"

    .line 14
    .line 15
    const-string v1, "surface-render: destroy gl thread"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->a:Landroid/os/HandlerThread;

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surface-render: surface render stop "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXGLSurfaceRenderThread"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/basic/c/d;->f()V

    return-void
.end method

.method public a(IZIIIIIZZ)V
    .locals 12

    .line 9
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    new-instance v1, Lcom/tencent/liteav/basic/c/d$1;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-direct/range {v1 .. v11}, Lcom/tencent/liteav/basic/c/d$1;-><init>(Lcom/tencent/liteav/basic/c/d;IZIIIIIZZ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/tencent/liteav/basic/c/k;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/d;->m:Lcom/tencent/liteav/basic/c/k;

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/tencent/liteav/basic/c/d;->l:Z

    return-void
.end method

.method public a(Ljava/lang/Object;Landroid/view/Surface;)V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surface-render: surface render start "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXGLSurfaceRenderThread"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/c/d;->b(Ljava/lang/Object;Landroid/view/Surface;)V

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 8
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Landroid/view/Surface;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->b:Lcom/tencent/liteav/basic/c/e;

    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/e;->a()Landroid/view/Surface;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return-object v0

    .line 3
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()V
    .locals 4

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/c/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/liteav/basic/c/f;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/f;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    .line 16
    .line 17
    sget-object v1, Lcom/tencent/liteav/basic/c/i;->e:[F

    .line 18
    .line 19
    sget-object v2, Lcom/tencent/liteav/basic/c/h;->a:Lcom/tencent/liteav/basic/c/h;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {v2, v3, v3}, Lcom/tencent/liteav/basic/c/i;->a(Lcom/tencent/liteav/basic/c/h;ZZ)[F

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/basic/c/f;->a([F[F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/f;->d()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/d;->c:Lcom/tencent/liteav/basic/c/f;

    .line 10
    .line 11
    :cond_0
    return-void
.end method
