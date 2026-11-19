.class public final Lcom/zykj/blackboard/core/action/EraseWritingAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ5\u0010\u0013\u001a\u00020\u00062\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0008J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0008J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008 \u0010\u0008J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008!\u0010\u0008J\u001b\u0010\"\u001a\u00020\u00152\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0015`.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R<\u00103\u001a*\u0012\u0004\u0012\u000201\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b020,j\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b02`.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00100\u00a8\u00064"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/EraseWritingAction;",
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "<init>",
        "()V",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "Ld6/s;",
        "drawDeleteCircle",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "deleteGraph",
        "",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "getDeleteGraphByPoint",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;",
        "deleteGraphList",
        "",
        "x",
        "y",
        "offset",
        "filterDeleteGraphList",
        "(Ljava/util/List;FFF)V",
        "Landroid/graphics/RectF;",
        "adapterAreaRectF",
        "getIntersectGraphByAreaRectF",
        "(Landroid/graphics/RectF;)Ljava/util/List;",
        "graph",
        "getMinOutRectF",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;",
        "deleteCommand",
        "reset",
        "singleTouchDown",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "getRenderAreaRectF",
        "(Ljava/util/List;)Landroid/graphics/RectF;",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Paint;",
        "Landroid/graphics/Path;",
        "circlePath",
        "Landroid/graphics/Path;",
        "touchRadius",
        "F",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "minOutRectFMap",
        "Ljava/util/HashMap;",
        "",
        "",
        "deleteCommandMap",
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
.field private final circlePath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final deleteCommandMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final minOutRectFMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private touchRadius:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    .line 13
    .line 14
    const/high16 v1, -0x10000

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    const/high16 v1, 0x41a00000    # 20.0f

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 25
    .line 26
    new-instance v0, Landroid/graphics/Path;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 32
    .line 33
    const/high16 v0, 0x42200000    # 40.0f

    .line 34
    .line 35
    iput v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->touchRadius:F

    .line 36
    .line 37
    new-instance v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->minOutRectFMap:Ljava/util/HashMap;

    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommandMap:Ljava/util/HashMap;

    .line 50
    .line 51
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->DELETE_ACTION:Lcom/zykj/blackboard/utils/EventKey;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;

    .line 56
    .line 57
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/EventBus;->register(Lcom/zykj/blackboard/utils/EventKey;Lr6/a;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static final synthetic access$deleteGraph(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteGraph(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$drawDeleteCircle(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->drawDeleteCircle(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getMinOutRectFMap$p(Lcom/zykj/blackboard/core/action/EraseWritingAction;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->minOutRectFMap:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method private final deleteCommand()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommandMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "deleteCommandMap.keys"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommandMap:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v3, Ljava/util/List;

    .line 46
    .line 47
    const-string v4, "it"

    .line 48
    .line 49
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-interface {v2, v3, v4, v5}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommandMap:Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommandMap:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method private final deleteGraph(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getDeleteGraphByPoint(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommandMap:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->deleteGraphList(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "EraseWritingAction:deleteGraph -> graphList: "

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-static {p1, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 72
    .line 73
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getRenderAreaRectF(Ljava/util/List;)Landroid/graphics/RectF;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 100
    .line 101
    const/high16 v1, 0x40800000    # 4.0f

    .line 102
    .line 103
    sub-float/2addr v0, v1

    .line 104
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 105
    .line 106
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 107
    .line 108
    sub-float/2addr v0, v1

    .line 109
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 110
    .line 111
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 112
    .line 113
    add-float/2addr v0, v1

    .line 114
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 115
    .line 116
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 117
    .line 118
    add-float/2addr v0, v1

    .line 119
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 120
    .line 121
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getIntersectGraphByAreaRectF(Landroid/graphics/RectF;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_2

    .line 130
    .line 131
    invoke-interface {v1, p1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->renderRectF(Landroid/graphics/RectF;Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    return-void
.end method

.method private final drawDeleteCircle(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget v3, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->touchRadius:F

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v2, 0x0

    .line 42
    :goto_0
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const/4 v2, 0x0

    .line 69
    :goto_1
    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method private final filterDeleteGraphList(Ljava/util/List;FFF)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;FFF)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_4

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    add-int/lit8 v4, v4, -0x1

    .line 45
    .line 46
    :goto_1
    const/4 v5, -0x1

    .line 47
    if-ge v5, v4, :cond_0

    .line 48
    .line 49
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getParent()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    invoke-interface {v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const/4 v5, 0x0

    .line 61
    :goto_2
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 66
    .line 67
    invoke-interface {v6}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 83
    .line 84
    invoke-interface {v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderRectF()Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderRectF()Landroid/graphics/RectF;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v5, v6}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 103
    .line 104
    invoke-interface {v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderRectF()Landroid/graphics/RectF;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    new-instance v6, Landroid/graphics/RectF;

    .line 109
    .line 110
    sub-float v7, p2, p4

    .line 111
    .line 112
    sub-float v8, p3, p4

    .line 113
    .line 114
    add-float v9, p2, p4

    .line 115
    .line 116
    add-float v10, p3, p4

    .line 117
    .line 118
    invoke-direct {v6, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 119
    .line 120
    .line 121
    invoke-static {v5, v6}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_3
    add-int/lit8 v4, v4, -0x1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    invoke-interface {p1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method private final getDeleteGraphByPoint(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x2

    .line 15
    new-array v3, v3, [F

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    aput v1, v3, v4

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aput v2, v3, v1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 36
    .line 37
    .line 38
    :cond_0
    new-instance v2, Landroid/graphics/RectF;

    .line 39
    .line 40
    aget v4, v3, v4

    .line 41
    .line 42
    iget v5, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->touchRadius:F

    .line 43
    .line 44
    sub-float v6, v4, v5

    .line 45
    .line 46
    aget v1, v3, v1

    .line 47
    .line 48
    sub-float v3, v1, v5

    .line 49
    .line 50
    add-float/2addr v4, v5

    .line 51
    add-float/2addr v1, v5

    .line 52
    invoke-direct {v2, v6, v3, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    iget v3, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->touchRadius:F

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v1, 0x0

    .line 81
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 114
    .line 115
    invoke-direct {p0, v4}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {v5, v2}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_2

    .line 124
    .line 125
    invoke-interface {v4}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_2

    .line 138
    .line 139
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 144
    .line 145
    invoke-direct {p0, v5}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v6, v2}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_3

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-interface {v5, v6, v7, v1}, Lcom/zykj/blackboard/core/graph/IGraph;->isCollide(FFF)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_3

    .line 168
    .line 169
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-direct {p0, v0, v2, p1, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->filterDeleteGraphList(Ljava/util/List;FFF)V

    .line 182
    .line 183
    .line 184
    return-object v0
.end method

.method private final getIntersectGraphByAreaRectF(Landroid/graphics/RectF;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 39
    .line 40
    invoke-direct {p0, v2}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {p1, v3}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    invoke-direct {p0, v2}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {p1, v3}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-object v0
.end method

.method private final getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->minOutRectFMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 54
    .line 55
    .line 56
    move-object v1, p1

    .line 57
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 78
    .line 79
    const-string v3, "childGraph"

    .line 80
    .line 81
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v2}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->minOutRectFMap:Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->minOutRectFMap:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const/4 v2, 0x0

    .line 124
    :goto_1
    invoke-interface {p1, v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->minOutRectFMap:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    check-cast p1, Landroid/graphics/RectF;

    .line 145
    .line 146
    return-object p1
.end method


# virtual methods
.method public final getRenderAreaRectF(Ljava/util/List;)Landroid/graphics/RectF;
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)",
            "Landroid/graphics/RectF;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "deleteGraphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->getMinOutRectF(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-object v0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getEraserWidth()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/high16 v0, 0x42200000    # 40.0f

    .line 18
    .line 19
    :goto_0
    iput v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->touchRadius:F

    .line 20
    .line 21
    return-void
.end method

.method public singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
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
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
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
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchMove$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchMove$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3
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
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->deleteCommand()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->circlePath:Landroid/graphics/Path;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method
