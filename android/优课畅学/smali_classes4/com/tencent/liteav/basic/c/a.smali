.class public Lcom/tencent/liteav/basic/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "a"

.field private static l:[I

.field private static m:[I


# instance fields
.field private b:Ljavax/microedition/khronos/egl/EGL10;

.field private c:Ljavax/microedition/khronos/egl/EGLDisplay;

.field private d:Ljavax/microedition/khronos/egl/EGLConfig;

.field private e:Z

.field private f:Ljavax/microedition/khronos/egl/EGLContext;

.field private g:Z

.field private h:Ljavax/microedition/khronos/egl/EGLSurface;

.field private i:I

.field private j:I

.field private k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/tencent/liteav/basic/c/a;->l:[I

    .line 9
    .line 10
    const/16 v0, 0x13

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/tencent/liteav/basic/c/a;->m:[I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 4
        0x3033
        0x1
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3026
        0x0
        0x3040
        0x4
        0x3038
    .end array-data

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :array_1
    .array-data 4
        0x3033
        0x4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3026
        0x0
        0x3040
        0x4
        0x3142
        0x1
        0x3038
    .end array-data
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/basic/c/a;->i:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/basic/c/a;->j:I

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/a;->k:[I

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/liteav/basic/c/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/c/a;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/c/a;-><init>()V

    .line 2
    iput p3, v0, Lcom/tencent/liteav/basic/c/a;->i:I

    .line 3
    iput p4, v0, Lcom/tencent/liteav/basic/c/a;->j:I

    .line 4
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/liteav/basic/c/a;->a(Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;Landroid/view/Surface;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private a(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;ILjavax/microedition/khronos/egl/EGLContext;)Ljavax/microedition/khronos/egl/EGLContext;
    .locals 2

    const/16 v0, 0x3098

    const/16 v1, 0x3038

    .line 28
    filled-new-array {v0, p3, v1}, [I

    move-result-object p3

    if-nez p4, :cond_0

    .line 29
    sget-object p4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    invoke-interface {v0, p1, p2, p4, p3}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object p1

    .line 31
    invoke-direct {p0}, Lcom/tencent/liteav/basic/c/a;->f()V

    return-object p1
.end method

.method private a(Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;Landroid/view/Surface;)Z
    .locals 8

    .line 7
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/egl/EGL10;

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 8
    sget-object v1, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 9
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->k:[I

    invoke-interface {v1, v0, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    const/4 v1, 0x0

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 10
    new-array v7, v0, [I

    .line 11
    new-array v5, v0, [Ljavax/microedition/khronos/egl/EGLConfig;

    .line 12
    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v3, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    if-nez p3, :cond_0

    sget-object p1, Lcom/tencent/liteav/basic/c/a;->l:[I

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/tencent/liteav/basic/c/a;->m:[I

    goto :goto_0

    :goto_1
    const/4 v6, 0x1

    invoke-interface/range {v2 .. v7}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 13
    aget-object p1, v5, v1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/a;->d:Ljavax/microedition/khronos/egl/EGLConfig;

    .line 14
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/a;->e:Z

    goto :goto_2

    .line 15
    :cond_1
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/a;->d:Ljavax/microedition/khronos/egl/EGLConfig;

    :goto_2
    if-eqz p2, :cond_2

    .line 16
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/a;->g:Z

    .line 17
    :cond_2
    :try_start_0
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->d:Ljavax/microedition/khronos/egl/EGLConfig;

    const/4 v3, 0x2

    invoke-direct {p0, p1, v2, v3, p2}, Lcom/tencent/liteav/basic/c/a;->a(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;ILjavax/microedition/khronos/egl/EGLContext;)Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/a;->f:Ljavax/microedition/khronos/egl/EGLContext;
    :try_end_0
    .catch Lcom/tencent/liteav/basic/c/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 18
    :catch_0
    sget-object p1, Lcom/tencent/liteav/basic/c/a;->a:Ljava/lang/String;

    const-string v2, "failed to create EGLContext of OpenGL ES 2.0, try 3.0"

    invoke-static {p1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    :try_start_1
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->d:Ljavax/microedition/khronos/egl/EGLConfig;

    const/4 v3, 0x3

    invoke-direct {p0, p1, v2, v3, p2}, Lcom/tencent/liteav/basic/c/a;->a(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;ILjavax/microedition/khronos/egl/EGLContext;)Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/a;->f:Ljavax/microedition/khronos/egl/EGLContext;
    :try_end_1
    .catch Lcom/tencent/liteav/basic/c/c; {:try_start_1 .. :try_end_1} :catch_1

    .line 20
    :goto_3
    iget p1, p0, Lcom/tencent/liteav/basic/c/a;->i:I

    iget p2, p0, Lcom/tencent/liteav/basic/c/a;->j:I

    const/16 v2, 0x3038

    const/16 v3, 0x3057

    const/16 v4, 0x3056

    filled-new-array {v3, p1, v4, p2, v2}, [I

    move-result-object p1

    if-nez p3, :cond_3

    .line 21
    iget-object p2, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    iget-object p3, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->d:Ljavax/microedition/khronos/egl/EGLConfig;

    invoke-interface {p2, p3, v2, p1}, Ljavax/microedition/khronos/egl/EGL10;->eglCreatePbufferSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;[I)Ljavax/microedition/khronos/egl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    goto :goto_4

    .line 22
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    iget-object p2, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->d:Ljavax/microedition/khronos/egl/EGLConfig;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v2, p3, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateWindowSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljava/lang/Object;[I)Ljavax/microedition/khronos/egl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 23
    :goto_4
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object p2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    if-ne p1, p2, :cond_4

    .line 24
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/a;->e()V

    return v1

    .line 25
    :cond_4
    iget-object p2, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    iget-object p3, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->f:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {p2, p3, p1, p1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 26
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/a;->e()V

    return v1

    :cond_5
    return v0

    :catch_1
    move-exception v0

    move-object p1, v0

    .line 27
    sget-object p2, Lcom/tencent/liteav/basic/c/a;->a:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "failed to create EGLContext of 3.0. "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x3000

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v1, Lcom/tencent/liteav/basic/c/c;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lcom/tencent/liteav/basic/c/c;-><init>(I)V

    .line 15
    .line 16
    .line 17
    throw v1
.end method


# virtual methods
.method public a()Z
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglSwapBuffers(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    move-result v0

    .line 6
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/a;->e()V

    return v0
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/tencent/liteav/basic/c/a;->f:Ljavax/microedition/khronos/egl/EGLContext;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v2, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/a;->e()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 4
    .line 5
    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 6
    .line 7
    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v2, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 19
    .line 20
    invoke-interface {v1, v2, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->f:Ljavax/microedition/khronos/egl/EGLContext;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 30
    .line 31
    invoke-interface {v1, v2, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/c/a;->e()V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/a;->h:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/tencent/liteav/basic/c/a;->c:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 48
    .line 49
    return-void
.end method

.method public d()Ljavax/microedition/khronos/egl/EGLContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->f:Ljavax/microedition/khronos/egl/EGLContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/a;->b:Ljavax/microedition/khronos/egl/EGL10;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x3000

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/tencent/liteav/basic/c/a;->a:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "EGL error: 0x"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method
