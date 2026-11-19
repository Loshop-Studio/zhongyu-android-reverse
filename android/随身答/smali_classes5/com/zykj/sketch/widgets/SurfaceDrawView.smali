.class public final Lcom/zykj/sketch/widgets/SurfaceDrawView;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Lcom/zykj/sketch/core/listener/RealDraw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u4e0d\u9002\u7528\u5728\u52a8\u753b\u4e0a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016J\u0008\u0010\u001f\u001a\u00020\u001aH\u0016J*\u0010 \u001a\u00020\u001a2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0012\u0010&\u001a\u00020\u001a2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010\'\u001a\u00020\u001a2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/sketch/widgets/SurfaceDrawView;",
        "Landroid/view/SurfaceView;",
        "Landroid/view/SurfaceHolder$Callback;",
        "Lcom/zykj/sketch/core/listener/RealDraw;",
        "context",
        "Landroid/content/Context;",
        "attr",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "backgroundId",
        "",
        "drawRect",
        "Landroid/graphics/Rect;",
        "execute",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "graph",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "isLocked",
        "",
        "limitDrawArea",
        "Landroid/graphics/RectF;",
        "mIsDrawing",
        "paintTableArea",
        "paintThread",
        "Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;",
        "drawGraph",
        "",
        "setDrawBackground",
        "colorId",
        "setLimitDrawArea",
        "rectF",
        "shutdown",
        "surfaceChanged",
        "holder",
        "Landroid/view/SurfaceHolder;",
        "format",
        "width",
        "height",
        "surfaceCreated",
        "surfaceDestroyed",
        "PaintThread",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private backgroundId:I

.field private drawRect:Landroid/graphics/Rect;

.field private execute:Ljava/util/concurrent/ScheduledExecutorService;

.field private graph:Lcom/zykj/sketch/core/graph/Graph;

.field private isLocked:Z

.field private limitDrawArea:Landroid/graphics/RectF;

.field private mIsDrawing:Z

.field private paintTableArea:Landroid/graphics/RectF;

.field private final paintThread:Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;-><init>(Lcom/zykj/sketch/widgets/SurfaceDrawView;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->paintThread:Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    iput p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->backgroundId:I

    .line 25
    .line 26
    new-instance p1, Landroid/graphics/Rect;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->drawRect:Landroid/graphics/Rect;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final synthetic access$getBackgroundId$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->backgroundId:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getDrawRect$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->drawRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getGraph$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Lcom/zykj/sketch/core/graph/Graph;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->graph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->limitDrawArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMIsDrawing$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->mIsDrawing:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->paintTableArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$isLocked$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->isLocked:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$setLimitDrawArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->limitDrawArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLocked$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->isLocked:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->paintTableArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public drawGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->graph:Lcom/zykj/sketch/core/graph/Graph;

    .line 7
    .line 8
    return-void
.end method

.method public setDrawBackground(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->backgroundId:I

    .line 2
    .line 3
    return-void
.end method

.method public setLimitDrawArea(Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->limitDrawArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method

.method public shutdown()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->mIsDrawing:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->isLocked:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 8

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->mIsDrawing:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->isLocked:Z

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->paintThread:Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;

    .line 16
    .line 17
    const-wide/16 v5, 0x8

    .line 18
    .line 19
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->mIsDrawing:Z

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->isLocked:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "this.holder"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    monitor-enter p1

    .line 17
    :try_start_0
    sget-object v0, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 18
    .line 19
    const-string v1, "surfaceDestroyed"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/utils/LogUtils$Companion;->d(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit p1

    .line 27
    iget-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    monitor-exit p1

    .line 40
    throw v0
.end method
