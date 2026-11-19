.class public abstract Lcom/zykj/blackboard/core/action/BaseTouchAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/action/ITouchAction;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u0016R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R$\u0010\'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103\u00a8\u00064"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/BaseTouchAction;",
        "Lcom/zykj/blackboard/core/action/ITouchAction;",
        "<init>",
        "()V",
        "",
        "isTouchable",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "callback",
        "touchEnableCheck",
        "(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V",
        "onTouchDown",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "onTouchPointerDown",
        "onTouchMove",
        "onTouchPointerUp",
        "onTouchUp",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "setActionListener",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "isSingleFingerInput",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V",
        "isFingerTouch",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Z",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "getListener",
        "()Lcom/zykj/blackboard/core/action/IActionListener;",
        "setListener",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "graphControl",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "setGraphControl",
        "(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "getBoardConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "setBoardConfig",
        "(Lcom/zykj/blackboard/bean/BoardConfig;)V",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "setMatrixAdapter",
        "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V",
        "blackboard_release"
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
.field private boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private listener:Lcom/zykj/blackboard/core/action/IActionListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


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

.method private final touchEnableCheck(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            "Lr6/a;",
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
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {p3}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getListener()Lcom/zykj/blackboard/core/action/IActionListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isFingerTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Z
    .locals 2
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V
    .locals 2
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct {v1, p1, p2}, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;-><init>(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, p1, v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->touchEnableCheck(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/bean/BoardConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-void
.end method

.method public final setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-void
.end method

.method public final setListener(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-void
.end method
