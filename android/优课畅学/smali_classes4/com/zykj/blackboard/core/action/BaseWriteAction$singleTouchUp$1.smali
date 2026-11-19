.class final Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/BaseWriteAction;->singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/blackboard/core/graph/IGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/graph/Graph;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->invoke$lambda-0(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/blackboard/core/graph/IGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/graph/Graph;)V

    return-void
.end method

.method private static final invoke$lambda-0(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/blackboard/core/graph/IGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/graph/Graph;)V
    .locals 7

    .line 1
    const-string v0, "$actionListener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$list"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$groupGraph"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$graphId"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "$graph"

    .line 27
    .line 28
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->getPaint()Landroid/graphics/Paint;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->getPaintItemLength()F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->getPaintSpacing()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v0, v1, v3}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {p3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    move-object v1, p0

    .line 56
    move-object v3, p2

    .line 57
    move-object v6, p4

    .line 58
    invoke-interface/range {v1 .. v6}, Lcom/zykj/blackboard/core/action/IActionListener;->writingGraphEvent(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    instance-of p2, p5, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 63
    .line 64
    if-eqz p2, :cond_0

    .line 65
    .line 66
    instance-of p2, p0, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 67
    .line 68
    if-eqz p2, :cond_0

    .line 69
    .line 70
    check-cast p5, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 71
    .line 72
    invoke-interface {v1}, Lcom/zykj/blackboard/core/action/IActionListener;->getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p5, p2}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 77
    .line 78
    .line 79
    check-cast p0, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getSourceFileName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p5, p2}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->setSourceFileName(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getSourceId()Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p5, p0}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->setSourceId(Ljava/lang/Integer;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    invoke-interface {p0}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->access$setSingleHandling$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->handleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->access$setLastWriteUpTime$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;J)V

    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->access$getGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lcom/zykj/blackboard/core/graph/IGraph;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->getEventList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v0, "randomUUID().toString()"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0, v6}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->buildSimpleGraph(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    move-result-object v7

    .line 10
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->getEventList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->access$getService$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    new-instance v1, Lcom/zykj/blackboard/core/action/a;

    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/a;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/blackboard/core/graph/IGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/graph/Graph;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->this$0:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-void
.end method
