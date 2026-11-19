.class public abstract Lcom/zykj/blackboard/core/action/BaseTouchAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/action/ITouchAction;


# instance fields
.field private boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

.field private graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

.field private listener:Lcom/zykj/blackboard/core/action/IActionListener;

.field private matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final touchEnableCheck(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "event.pointerPropertiesList"

    .line 8
    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/4 v0, 0x1

    .line 33
    if-ne p2, v0, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-interface {p3}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getListener()Lcom/zykj/blackboard/core/action/IActionListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isFingerTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Z
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p1, v1, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    return v0
.end method

.method public final isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    new-instance v1, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;

    .line 22
    .line 23
    invoke-direct {v1, p1, p2}, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;-><init>(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, p1, v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->touchEnableCheck(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 19
    .line 20
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 25
    .line 26
    return-void
.end method

.method public final setBoardConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-void
.end method

.method public final setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-void
.end method

.method public final setListener(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-void
.end method
