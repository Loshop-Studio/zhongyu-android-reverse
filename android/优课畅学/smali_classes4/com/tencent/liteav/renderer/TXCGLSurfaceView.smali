.class public Lcom/tencent/liteav/renderer/TXCGLSurfaceView;
.super Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field private A:Lcom/tencent/liteav/basic/c/k;

.field private B:I

.field private C:I

.field private D:Z

.field private E:Z

.field private F:Lcom/tencent/liteav/basic/c/j;

.field private G:J

.field private H:[B

.field private I:J

.field private J:I

.field private K:I

.field private final L:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroid/graphics/SurfaceTexture;

.field private h:Ljavax/microedition/khronos/egl/EGLContext;

.field private i:Lcom/tencent/liteav/basic/c/f;

.field private j:[I

.field private k:[F

.field private l:I

.field private m:Z

.field private n:F

.field private o:F

.field private p:I

.field private q:J

.field private r:J

.field private s:I

.field private t:Z

.field private u:Z

.field private v:Ljava/lang/Object;

.field private w:Landroid/os/Handler;

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x10

    .line 2
    new-array p1, p1, [F

    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->k:[F

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->l:I

    .line 4
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->m:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    iput v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->n:F

    .line 6
    iput v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->o:F

    const/16 v0, 0x14

    .line 7
    iput v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->p:I

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 9
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    const/16 v2, 0x3000

    .line 10
    iput v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->s:I

    const/4 v2, 0x1

    .line 11
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->t:Z

    .line 12
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->u:Z

    .line 13
    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->v:Ljava/lang/Object;

    .line 14
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->x:I

    .line 15
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->y:I

    .line 16
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->z:Z

    const/4 v3, 0x0

    .line 17
    iput-object v3, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->A:Lcom/tencent/liteav/basic/c/k;

    .line 18
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->B:I

    .line 19
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->C:I

    .line 20
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->D:Z

    .line 21
    iput-boolean v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->E:Z

    .line 22
    iput-object v3, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->H:[B

    .line 23
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->I:J

    .line 24
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->J:I

    .line 25
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->K:I

    .line 26
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->L:Ljava/util/Queue;

    const/4 p1, 0x2

    .line 27
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->setEGLContextClientVersion(I)V

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/16 v1, 0x8

    const/16 v2, 0x8

    const/16 v3, 0x8

    const/16 v4, 0x8

    move-object v0, p0

    .line 28
    invoke-virtual/range {v0 .. v6}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->a(IIIIII)V

    .line 29
    invoke-virtual {p0, p0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x10

    .line 31
    new-array p1, p1, [F

    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->k:[F

    const/4 p1, 0x0

    .line 32
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->l:I

    .line 33
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->m:Z

    const/high16 p2, 0x3f800000    # 1.0f

    .line 34
    iput p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->n:F

    .line 35
    iput p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->o:F

    const/16 p2, 0x14

    .line 36
    iput p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->p:I

    const-wide/16 v0, 0x0

    .line 37
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 38
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    const/16 p2, 0x3000

    .line 39
    iput p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->s:I

    const/4 p2, 0x1

    .line 40
    iput-boolean p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->t:Z

    .line 41
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->u:Z

    .line 42
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->v:Ljava/lang/Object;

    .line 43
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->x:I

    .line 44
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->y:I

    .line 45
    iput-boolean p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->z:Z

    const/4 v2, 0x0

    .line 46
    iput-object v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->A:Lcom/tencent/liteav/basic/c/k;

    .line 47
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->B:I

    .line 48
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->C:I

    .line 49
    iput-boolean p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->D:Z

    .line 50
    iput-boolean p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->E:Z

    .line 51
    iput-object v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->H:[B

    .line 52
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->I:J

    .line 53
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->J:I

    .line 54
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->K:I

    .line 55
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->L:Ljava/util/Queue;

    const/4 p1, 0x2

    .line 56
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->setEGLContextClientVersion(I)V

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/16 v1, 0x8

    const/16 v2, 0x8

    const/16 v3, 0x8

    const/16 v4, 0x8

    move-object v0, p0

    .line 57
    invoke-virtual/range {v0 .. v6}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->a(IIIIII)V

    .line 58
    invoke-virtual {p0, p0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->p:I

    return p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->p:I

    return p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;J)J
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    return-wide p1
.end method

.method private a(J)V
    .locals 0

    .line 19
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private a(Ljava/util/Queue;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "Ljava/lang/Runnable;",
            ">;)Z"
        }
    .end annotation

    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p1

    return v1

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 16
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    return v1

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x1

    return p1

    .line 18
    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static synthetic b(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->B:I

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    return-wide p1
.end method

.method public static synthetic c(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->C:I

    .line 2
    .line 3
    return p1
.end method

.method private e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->w:Landroid/os/Handler;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Landroid/os/HandlerThread;

    .line 14
    .line 15
    const-string v1, "VideoCaptureThread"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 21
    .line 22
    .line 23
    new-instance v1, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->w:Landroid/os/Handler;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->w:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {v0, p0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surfaceDestroyed-->enter with mSurfaceTextureListener:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->F:Lcom/tencent/liteav/basic/c/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXCGLSurfaceView"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->F:Lcom/tencent/liteav/basic/c/j;

    if-eqz v0, :cond_0

    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    invoke-interface {v0, v1}, Lcom/tencent/liteav/basic/c/j;->b(Landroid/graphics/SurfaceTexture;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    :cond_1
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->L:Ljava/util/Queue;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->L:Ljava/util/Queue;

    invoke-interface {v1, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()I
    .locals 2

    .line 3
    iget v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->s:I

    const/16 v1, 0x3000

    if-eq v0, v1, :cond_0

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "background capture swapbuffer error : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXCGLSurfaceView"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->s:I

    return v0
.end method

.method public getGLContext()Ljavax/microedition/khronos/egl/EGLContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->h:Ljavax/microedition/khronos/egl/EGLContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSurfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->w:Landroid/os/Handler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/os/Looper;->quitSafely()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->w:Landroid/os/Handler;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 13

    .line 1
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->L:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Ljava/util/Queue;)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    move v0, p1

    .line 8
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-wide v3, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    .line 13
    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    cmp-long v5, v3, v5

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    cmp-long v3, v1, v3

    .line 21
    .line 22
    if-gez v3, :cond_1

    .line 23
    .line 24
    :cond_0
    iput-wide v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    .line 25
    .line 26
    :cond_1
    iget-wide v3, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    .line 27
    .line 28
    sub-long v5, v1, v3

    .line 29
    .line 30
    iget-wide v7, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 31
    .line 32
    const-wide/16 v9, 0x3e8

    .line 33
    .line 34
    mul-long/2addr v7, v9

    .line 35
    iget v11, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->p:I

    .line 36
    .line 37
    int-to-long v11, v11

    .line 38
    div-long/2addr v7, v11

    .line 39
    cmp-long v5, v5, v7

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    if-gez v5, :cond_2

    .line 43
    .line 44
    const-wide/16 v0, 0xf

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(J)V

    .line 47
    .line 48
    .line 49
    move v0, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    sub-long/2addr v1, v3

    .line 52
    cmp-long v1, v1, v9

    .line 53
    .line 54
    const-wide/16 v2, 0x1

    .line 55
    .line 56
    if-lez v1, :cond_3

    .line 57
    .line 58
    iput-wide v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    iput-wide v4, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->r:J

    .line 65
    .line 66
    move v1, p1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v1, v6

    .line 69
    :goto_1
    iget-boolean v4, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->t:Z

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_4
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :try_start_1
    iget-boolean v4, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->u:Z

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    if-nez v4, :cond_5

    .line 80
    .line 81
    move v1, p1

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->H:[B

    .line 84
    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    iput-object v5, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->H:[B

    .line 88
    .line 89
    iget-object v4, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 90
    .line 91
    if-eqz v4, :cond_6

    .line 92
    .line 93
    invoke-virtual {v4}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 94
    .line 95
    .line 96
    iget-object v4, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 97
    .line 98
    iget-object v5, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->k:[F

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    goto/16 :goto_8

    .line 106
    .line 107
    :cond_6
    :goto_2
    move-object v5, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_7
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 110
    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 117
    .line 118
    iget-object v4, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->k:[F

    .line 119
    .line 120
    invoke-virtual {v0, v4}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 121
    .line 122
    .line 123
    :cond_8
    :goto_3
    if-nez v1, :cond_9

    .line 124
    .line 125
    iget-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 126
    .line 127
    add-long/2addr v0, v2

    .line 128
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_9
    iput-wide v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->q:J

    .line 132
    .line 133
    :goto_4
    iput-boolean v6, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->u:Z

    .line 134
    .line 135
    move v0, v6

    .line 136
    move v1, v0

    .line 137
    :goto_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    if-ne p1, v1, :cond_a

    .line 139
    .line 140
    if-ne p1, v0, :cond_e

    .line 141
    .line 142
    const-wide/16 v0, 0x5

    .line 143
    .line 144
    :try_start_2
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(J)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :catch_0
    move-exception p1

    .line 149
    goto/16 :goto_9

    .line 150
    .line 151
    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 152
    .line 153
    .line 154
    move-result-wide v0

    .line 155
    long-to-double v2, v0

    .line 156
    iget-wide v7, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->I:J

    .line 157
    .line 158
    long-to-double v9, v7

    .line 159
    const-wide v11, 0x408f400000000000L    # 1000.0

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    add-double/2addr v9, v11

    .line 165
    cmpl-double v2, v2, v9

    .line 166
    .line 167
    if-lez v2, :cond_b

    .line 168
    .line 169
    iget v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->K:I

    .line 170
    .line 171
    int-to-double v2, v2

    .line 172
    mul-double/2addr v2, v11

    .line 173
    sub-long v7, v0, v7

    .line 174
    .line 175
    long-to-double v7, v7

    .line 176
    div-double/2addr v2, v7

    .line 177
    double-to-int v2, v2

    .line 178
    add-int/2addr v2, p1

    .line 179
    iput v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->J:I

    .line 180
    .line 181
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->I:J

    .line 182
    .line 183
    iput v6, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->K:I

    .line 184
    .line 185
    :cond_b
    iget v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->K:I

    .line 186
    .line 187
    add-int/2addr v0, p1

    .line 188
    iput v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->K:I

    .line 189
    .line 190
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->F:Lcom/tencent/liteav/basic/c/j;

    .line 191
    .line 192
    if-eqz p1, :cond_d

    .line 193
    .line 194
    if-eqz v5, :cond_c

    .line 195
    .line 196
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->k:[F

    .line 197
    .line 198
    invoke-interface {p1, v5, v0}, Lcom/tencent/liteav/basic/c/j;->a([B[F)V

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_c
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->j:[I

    .line 203
    .line 204
    aget v0, v0, v6

    .line 205
    .line 206
    iget-object v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->k:[F

    .line 207
    .line 208
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/basic/c/j;->a(I[F)I

    .line 209
    .line 210
    .line 211
    :cond_d
    :goto_6
    monitor-enter p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 212
    :try_start_3
    iget-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->c:Z

    .line 213
    .line 214
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 215
    if-nez p1, :cond_e

    .line 216
    .line 217
    :try_start_4
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->c()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    const/16 v0, 0x3000

    .line 222
    .line 223
    if-eq p1, v0, :cond_e

    .line 224
    .line 225
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    iget-wide v2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->G:J

    .line 230
    .line 231
    sub-long/2addr v0, v2

    .line 232
    const-wide/16 v2, 0x7d0

    .line 233
    .line 234
    cmp-long v0, v0, v2

    .line 235
    .line 236
    if-lez v0, :cond_e

    .line 237
    .line 238
    const-string v0, "TXCGLSurfaceView"

    .line 239
    .line 240
    new-instance v1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v2, "background capture swapBuffer error : "

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 261
    .line 262
    .line 263
    move-result-wide v0

    .line 264
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->G:J

    .line 265
    .line 266
    new-instance v0, Landroid/os/Bundle;

    .line 267
    .line 268
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v1, "EVT_PARAM1"

    .line 272
    .line 273
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    const-string p1, "EVT_ID"

    .line 277
    .line 278
    const/16 v1, 0x83e

    .line 279
    .line 280
    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 281
    .line 282
    .line 283
    const-string p1, "EVT_TIME"

    .line 284
    .line 285
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 286
    .line 287
    .line 288
    move-result-wide v2

    .line 289
    invoke-virtual {v0, p1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 290
    .line 291
    .line 292
    const-string p1, "EVT_MSG"

    .line 293
    .line 294
    const-string v2, "Failed to render video"

    .line 295
    .line 296
    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a:Ljava/lang/ref/WeakReference;

    .line 300
    .line 301
    invoke-static {p1, v1, v0}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 302
    .line 303
    .line 304
    :cond_e
    :goto_7
    return-void

    .line 305
    :catchall_1
    move-exception p1

    .line 306
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 307
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 308
    :goto_8
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 309
    :try_start_8
    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 310
    :goto_9
    const-string v0, "TXCGLSurfaceView"

    .line 311
    .line 312
    const-string v1, "onDrawFrame failed"

    .line 313
    .line 314
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    return-void
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->t:Z

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    const/4 p1, 0x1

    .line 6
    :try_start_0
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->u:Z

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 2

    .line 1
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljavax/microedition/khronos/egl/EGL10;

    .line 6
    .line 7
    invoke-interface {p1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetCurrentContext()Ljavax/microedition/khronos/egl/EGLContext;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->h:Ljavax/microedition/khronos/egl/EGLContext;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [I

    .line 15
    .line 16
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->j:[I

    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/liteav/basic/c/g;->a()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 v0, 0x0

    .line 23
    aput p2, p1, v0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->j:[I

    .line 26
    .line 27
    aget p1, p1, v0

    .line 28
    .line 29
    if-gtz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->j:[I

    .line 33
    .line 34
    const-string p1, "TXCGLSurfaceView"

    .line 35
    .line 36
    const-string p2, "create oes texture error!! at glsurfaceview"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance p1, Landroid/graphics/SurfaceTexture;

    .line 43
    .line 44
    iget-object p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->j:[I

    .line 45
    .line 46
    aget p2, p2, v0

    .line 47
    .line 48
    invoke-direct {p1, p2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 52
    .line 53
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->e()V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lcom/tencent/liteav/basic/c/f;

    .line 57
    .line 58
    invoke-direct {p1}, Lcom/tencent/liteav/basic/c/f;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->i:Lcom/tencent/liteav/basic/c/f;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/tencent/liteav/basic/c/f;->a()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->i:Lcom/tencent/liteav/basic/c/f;

    .line 71
    .line 72
    sget-object p2, Lcom/tencent/liteav/basic/c/i;->e:[F

    .line 73
    .line 74
    sget-object v1, Lcom/tencent/liteav/basic/c/h;->a:Lcom/tencent/liteav/basic/c/h;

    .line 75
    .line 76
    invoke-static {v1, v0, v0}, Lcom/tencent/liteav/basic/c/i;->a(Lcom/tencent/liteav/basic/c/h;ZZ)[F

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, p2, v0}, Lcom/tencent/liteav/basic/c/f;->a([F[F)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->F:Lcom/tencent/liteav/basic/c/j;

    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    iget-object p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->g:Landroid/graphics/SurfaceTexture;

    .line 88
    .line 89
    invoke-interface {p1, p2}, Lcom/tencent/liteav/basic/c/j;->a(Landroid/graphics/SurfaceTexture;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_0
    return-void
.end method

.method public setFPS(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;-><init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public setRendMirror(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$3;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$3;-><init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setRendMode(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$2;-><init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setRunInBackground(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    const-string p1, "TXCGLSurfaceView"

    .line 5
    .line 6
    const-string v0, "background capture enter background"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;->c:Z

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$4;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$4;-><init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setSurfaceTextureListener(Lcom/tencent/liteav/basic/c/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->F:Lcom/tencent/liteav/basic/c/j;

    .line 2
    .line 3
    return-void
.end method
