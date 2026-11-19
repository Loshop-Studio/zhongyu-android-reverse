.class public Lcom/tencent/liteav/basic/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation


# static fields
.field private static a:I = 0x2

.field private static final b:Ljava/lang/String; = "b"

.field private static k:[I

.field private static l:[I


# instance fields
.field private c:Landroid/opengl/EGLDisplay;

.field private d:Landroid/opengl/EGLContext;

.field private e:Landroid/opengl/EGLConfig;

.field private f:I

.field private g:I

.field private h:Z

.field private i:Landroid/opengl/EGLSurface;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    sget v0, Lcom/tencent/liteav/basic/c/b;->a:I

    .line 2
    .line 3
    const/16 v1, 0x44

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x2

    .line 7
    if-ne v0, v3, :cond_0

    .line 8
    .line 9
    move/from16 v17, v2

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v17, v1

    .line 13
    .line 14
    :goto_0
    const/16 v19, 0x1

    .line 15
    .line 16
    const/16 v20, 0x3038

    .line 17
    .line 18
    const/16 v4, 0x3024

    .line 19
    .line 20
    const/16 v5, 0x8

    .line 21
    .line 22
    const/16 v6, 0x3023

    .line 23
    .line 24
    const/16 v7, 0x8

    .line 25
    .line 26
    const/16 v8, 0x3022

    .line 27
    .line 28
    const/16 v9, 0x8

    .line 29
    .line 30
    const/16 v10, 0x3021

    .line 31
    .line 32
    const/16 v11, 0x8

    .line 33
    .line 34
    const/16 v12, 0x3025

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    const/16 v14, 0x3026

    .line 38
    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x3040

    .line 41
    .line 42
    const/16 v18, 0x3142

    .line 43
    .line 44
    filled-new-array/range {v4 .. v20}, [I

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    sput-object v4, Lcom/tencent/liteav/basic/c/b;->k:[I

    .line 49
    .line 50
    if-ne v0, v3, :cond_1

    .line 51
    .line 52
    move/from16 v20, v2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move/from16 v20, v1

    .line 56
    .line 57
    :goto_1
    const/16 v22, 0x1

    .line 58
    .line 59
    const/16 v23, 0x3038

    .line 60
    .line 61
    const/16 v5, 0x3033

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    const/16 v7, 0x3024

    .line 65
    .line 66
    const/16 v8, 0x8

    .line 67
    .line 68
    const/16 v9, 0x3023

    .line 69
    .line 70
    const/16 v10, 0x8

    .line 71
    .line 72
    const/16 v11, 0x3022

    .line 73
    .line 74
    const/16 v12, 0x8

    .line 75
    .line 76
    const/16 v13, 0x3021

    .line 77
    .line 78
    const/16 v14, 0x8

    .line 79
    .line 80
    const/16 v15, 0x3025

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x3026

    .line 85
    .line 86
    const/16 v18, 0x0

    .line 87
    .line 88
    const/16 v19, 0x3040

    .line 89
    .line 90
    const/16 v21, 0x3142

    .line 91
    .line 92
    filled-new-array/range {v5 .. v23}, [I

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, Lcom/tencent/liteav/basic/c/b;->l:[I

    .line 97
    .line 98
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 7
    .line 8
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/tencent/liteav/basic/c/b;->f:I

    .line 17
    .line 18
    iput v0, p0, Lcom/tencent/liteav/basic/c/b;->g:I

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lcom/tencent/liteav/basic/c/b;->j:I

    .line 22
    .line 23
    return-void
.end method

.method private static a(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;
    .locals 2

    const/16 v0, 0x3098

    const/16 v1, 0x3038

    .line 32
    filled-new-array {v0, p2, v1}, [I

    move-result-object p2

    const/4 v0, 0x0

    .line 33
    invoke-static {p0, p1, p3, p2, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object p0

    .line 34
    invoke-static {}, Lcom/tencent/liteav/basic/c/b;->f()V

    return-object p0
.end method

.method public static a(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/liteav/basic/c/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/c/b;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/c/b;-><init>()V

    .line 2
    iput p3, v0, Lcom/tencent/liteav/basic/c/b;->f:I

    .line 3
    iput p4, v0, Lcom/tencent/liteav/basic/c/b;->g:I

    .line 4
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/liteav/basic/c/b;->a(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private a(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    const/4 v3, 0x0

    .line 7
    invoke-static {v3}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v4

    iput-object v4, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 8
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-ne v4, v5, :cond_0

    .line 9
    sget-object v4, Lcom/tencent/liteav/basic/c/b;->b:Ljava/lang/String;

    const-string v5, "unable to get EGL14 display"

    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v4, 0x2

    .line 10
    new-array v5, v4, [I

    .line 11
    iget-object v6, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    const/4 v7, 0x1

    invoke-static {v6, v5, v3, v5, v7}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v5

    if-nez v5, :cond_1

    const/4 v5, 0x0

    .line 12
    iput-object v5, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 13
    sget-object v5, Lcom/tencent/liteav/basic/c/b;->b:Ljava/lang/String;

    const-string v6, "unable to initialize EGL14"

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz v0, :cond_2

    .line 14
    iput-object v0, v1, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    goto :goto_2

    :cond_2
    const/4 v13, 0x1

    .line 15
    new-array v11, v13, [Landroid/opengl/EGLConfig;

    .line 16
    new-array v14, v7, [I

    .line 17
    iget-object v8, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    if-nez v2, :cond_3

    sget-object v0, Lcom/tencent/liteav/basic/c/b;->l:[I

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/tencent/liteav/basic/c/b;->k:[I

    goto :goto_0

    :goto_1
    const/4 v12, 0x0

    const/4 v15, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v15}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v0

    if-nez v0, :cond_4

    return v3

    .line 18
    :cond_4
    aget-object v0, v11, v3

    iput-object v0, v1, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    :goto_2
    if-eqz p2, :cond_5

    .line 19
    iput-boolean v7, v1, Lcom/tencent/liteav/basic/c/b;->h:Z

    move-object/from16 v0, p2

    goto :goto_3

    .line 20
    :cond_5
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 21
    :goto_3
    :try_start_0
    iget-object v5, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    iget-object v6, v1, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    invoke-static {v5, v6, v4, v0}, Lcom/tencent/liteav/basic/c/b;->a(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;

    move-result-object v4

    iput-object v4, v1, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;
    :try_end_0
    .catch Lcom/tencent/liteav/basic/c/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 22
    :catch_0
    sget-object v4, Lcom/tencent/liteav/basic/c/b;->b:Ljava/lang/String;

    const-string v5, "failed to create EGLContext of OpenGL ES 2.0, try 3.0"

    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    :try_start_1
    iget-object v4, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    iget-object v5, v1, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    const/4 v6, 0x3

    invoke-static {v4, v5, v6, v0}, Lcom/tencent/liteav/basic/c/b;->a(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;
    :try_end_1
    .catch Lcom/tencent/liteav/basic/c/c; {:try_start_1 .. :try_end_1} :catch_1

    :goto_4
    const/16 v0, 0x3038

    .line 24
    filled-new-array {v0}, [I

    move-result-object v4

    if-nez v2, :cond_6

    .line 25
    iget v2, v1, Lcom/tencent/liteav/basic/c/b;->f:I

    const/16 v4, 0x3056

    iget v5, v1, Lcom/tencent/liteav/basic/c/b;->g:I

    const/16 v6, 0x3057

    filled-new-array {v6, v2, v4, v5, v0}, [I

    move-result-object v0

    .line 26
    iget-object v2, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    iget-object v4, v1, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    invoke-static {v2, v4, v0, v3}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    goto :goto_5

    .line 27
    :cond_6
    iget-object v0, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    iget-object v5, v1, Lcom/tencent/liteav/basic/c/b;->e:Landroid/opengl/EGLConfig;

    invoke-static {v0, v5, v2, v4, v3}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    .line 28
    :goto_5
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/c/b;->a()V

    .line 29
    iget-object v0, v1, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    iget-object v2, v1, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    iget-object v4, v1, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;

    invoke-static {v0, v2, v2, v4}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 30
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/c/b;->a()V

    return v3

    :cond_7
    return v7

    :catch_1
    move-exception v0

    .line 31
    sget-object v2, Lcom/tencent/liteav/basic/c/b;->b:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "failed to create EGLContext of 3.0. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3
.end method

.method private static f()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x3000

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Lcom/tencent/liteav/basic/c/c;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/tencent/liteav/basic/c/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    throw v1
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 5
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v0

    const/16 v1, 0x3000

    if-eq v0, v1, :cond_0

    .line 6
    sget-object v1, Lcom/tencent/liteav/basic/c/b;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EGL error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(J)V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    invoke-static {v0, v1, p1, p2}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 2
    .line 3
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    sget-object v1, Lcom/tencent/liteav/basic/c/b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;

    .line 10
    .line 11
    invoke-static {v0, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "eglMakeCurrent failed"

    .line 18
    .line 19
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 2
    .line 3
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 8
    .line 9
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 10
    .line 11
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    .line 17
    .line 18
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 26
    .line 27
    .line 28
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;

    .line 31
    .line 32
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 36
    .line 37
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 43
    .line 44
    return-void
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->c:Landroid/opengl/EGLDisplay;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/b;->i:Landroid/opengl/EGLSurface;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public e()Landroid/opengl/EGLContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/b;->d:Landroid/opengl/EGLContext;

    .line 2
    .line 3
    return-object v0
.end method
