.class public abstract Lcom/zykj/blackboard/core/action/BaseWriteAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;

.field public static final INTERVAL_TIME:I = 0x1388


# instance fields
.field private final eventList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation
.end field

.field private groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

.field private isCreateNewGroup:Z

.field private isForceNeedNewGroup:Z

.field private isSingleHandling:Z

.field private lastGroupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

.field private lastWriteUpTime:J

.field private mFirstX:F

.field private mFirstY:F

.field private paint:Landroid/graphics/Paint;

.field private paintItemLength:F

.field private paintSpacing:F

.field private final service:Ljava/util/concurrent/ThreadPoolExecutor;

.field private tempPath:Landroid/graphics/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Companion:Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->eventList:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paint:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/high16 v0, 0x41f00000    # 30.0f

    .line 26
    .line 27
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintItemLength:F

    .line 28
    .line 29
    const/high16 v0, 0x41700000    # 15.0f

    .line 30
    .line 31
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintSpacing:F

    .line 32
    .line 33
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 45
    .line 46
    return-void
.end method

.method public static final synthetic access$getGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLastWriteUpTime$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastWriteUpTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getService$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setCreateNewGroup$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isCreateNewGroup:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastGroupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastWriteUpTime$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastWriteUpTime:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setSingleHandling$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isSingleHandling:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public abstract buildSimpleGraph(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
.end method

.method public final executorsTaskDone()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getCompletedTaskCount()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getEventList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->eventList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
.end method

.method public final getMFirstX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMFirstY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPaintItemLength()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintItemLength:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintSpacing()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintSpacing:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTempPath()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract handleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end method

.method public abstract handleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end method

.method public abstract handleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end method

.method public abstract initPaint()V
.end method

.method public final isForceNeedNewGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isForceNeedNewGroup:Z

    .line 2
    .line 3
    return v0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->eventList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstX:F

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstY:F

    .line 15
    .line 16
    return-void
.end method

.method public final setForceNeedNewGroup(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isForceNeedNewGroup:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMFirstX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setMFirstY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstY:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPaint(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paint:Landroid/graphics/Paint;

    .line 7
    .line 8
    return-void
.end method

.method public final setPaintItemLength(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintItemLength:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPaintSpacing(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintSpacing:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTempPath(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    return-void
.end method

.method public singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isSingleHandling:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isCreateNewGroup:Z

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-array v3, v2, [Lcom/zykj/blackboard/core/graph/IGraph;

    .line 27
    .line 28
    aput-object p1, v3, v0

    .line 29
    .line 30
    invoke-static {v3}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-interface {v1, v3, v4, v5}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    new-array v2, v2, [Lcom/zykj/blackboard/core/graph/IGraph;

    .line 48
    .line 49
    aput-object p1, v2, v0

    .line 50
    .line 51
    invoke-static {v2}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastGroupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 59
    .line 60
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 61
    .line 62
    :cond_2
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isSingleHandling:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchMove$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchMove$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
