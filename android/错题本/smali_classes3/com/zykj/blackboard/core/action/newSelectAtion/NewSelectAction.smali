.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\r2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0013J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008#\u0010\u000cJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008(\u0010\u0003J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008-\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008.\u0010,J\u0017\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008/\u0010,J\u001b\u0010\u0016\u001a\u00020\r2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u0002000\u0014\u00a2\u0006\u0004\u0008\u0016\u00102J\u0015\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010>R\u0016\u0010@\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008B\u0010>R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010AR\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010>R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010>R\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00150Ij\u0008\u0012\u0004\u0012\u00020\u0015`J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010KR&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00100Ij\u0008\u0012\u0004\u0012\u00020\u0010`J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010KR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010A\u00a8\u0006M"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;",
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "<init>",
        "()V",
        "",
        "x",
        "y",
        "Landroid/graphics/PointF;",
        "getRenderPointF",
        "(FF)Landroid/graphics/PointF;",
        "",
        "isMove",
        "(FF)Z",
        "Ld6/s;",
        "handleClickToSelect",
        "(FF)V",
        "Landroid/graphics/RectF;",
        "rectF",
        "handleDragToSelect",
        "(Landroid/graphics/RectF;)V",
        "",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "selectGraphList",
        "selectGraphMinOutRectFList",
        "handleSelectedRectF",
        "(Ljava/util/List;Ljava/util/List;)V",
        "srcRectF",
        "dstRectF",
        "countRectF",
        "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V",
        "checkMinOutRectF",
        "Landroid/graphics/Matrix;",
        "matrix",
        "checkMinOutRectFWithMatrix",
        "(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V",
        "isDoubleClick",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "setActionListener",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "reset",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "singleTouchDown",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "",
        "graphIdList",
        "(Ljava/util/List;)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "",
        "maxInterval",
        "I",
        "",
        "lastClickTime",
        "J",
        "lastClickX",
        "F",
        "lastClickY",
        "isClick",
        "Z",
        "minMoveDistance",
        "isSpecialFunctionClick",
        "firstX",
        "firstY",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;",
        "functionManager",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "isStart",
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
.field private firstX:F

.field private firstY:F

.field private functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

.field private isClick:Z

.field private isSpecialFunctionClick:Z

.field private isStart:Z

.field private lastClickTime:J

.field private lastClickX:F

.field private lastClickY:F

.field private final maxInterval:I

.field private final minMoveDistance:F

.field private selectGraphList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectGraphMinOutRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1f4

    .line 5
    .line 6
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->maxInterval:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 10
    .line 11
    const/high16 v1, 0x41a00000    # 20.0f

    .line 12
    .line 13
    iput v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->minMoveDistance:F

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isSpecialFunctionClick:Z

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 30
    .line 31
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 32
    .line 33
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 34
    .line 35
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/EventBus;->register(Lcom/zykj/blackboard/utils/EventKey;Lr6/a;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic access$getFunctionManager$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSelectGraphList$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSelectGraphMinOutRectFList$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method private final checkMinOutRectF(Landroid/graphics/RectF;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/high16 v0, 0x42100000    # 36.0f

    .line 13
    .line 14
    :goto_0
    const/4 v1, 0x2

    .line 15
    int-to-float v1, v1

    .line 16
    mul-float/2addr v0, v1

    .line 17
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float v2, v0, v2

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sub-float/2addr v0, v3

    .line 28
    const/4 v3, 0x0

    .line 29
    cmpl-float v4, v2, v3

    .line 30
    .line 31
    if-lez v4, :cond_1

    .line 32
    .line 33
    iget v4, p1, Landroid/graphics/RectF;->left:F

    .line 34
    .line 35
    div-float/2addr v2, v1

    .line 36
    sub-float/2addr v4, v2

    .line 37
    iput v4, p1, Landroid/graphics/RectF;->left:F

    .line 38
    .line 39
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 40
    .line 41
    add-float/2addr v4, v2

    .line 42
    iput v4, p1, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    :cond_1
    cmpl-float v2, v0, v3

    .line 45
    .line 46
    if-lez v2, :cond_2

    .line 47
    .line 48
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 49
    .line 50
    div-float/2addr v0, v1

    .line 51
    sub-float/2addr v2, v0

    .line 52
    iput v2, p1, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    add-float/2addr v1, v0

    .line 57
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method private final checkMinOutRectFWithMatrix(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 4

    .line 1
    invoke-static {p2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 v0, 0x42100000    # 36.0f

    .line 17
    .line 18
    :goto_0
    const/4 v1, 0x2

    .line 19
    int-to-float v1, v1

    .line 20
    mul-float/2addr v0, v1

    .line 21
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-float/2addr v2, v3

    .line 30
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    sub-float/2addr p2, v0

    .line 39
    const/4 v0, 0x0

    .line 40
    cmpl-float v3, v2, v0

    .line 41
    .line 42
    if-lez v3, :cond_1

    .line 43
    .line 44
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    div-float/2addr v2, v1

    .line 47
    sub-float/2addr v3, v2

    .line 48
    iput v3, p1, Landroid/graphics/RectF;->left:F

    .line 49
    .line 50
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    add-float/2addr v3, v2

    .line 53
    iput v3, p1, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    :cond_1
    cmpl-float v0, p2, v0

    .line 56
    .line 57
    if-lez v0, :cond_2

    .line 58
    .line 59
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 60
    .line 61
    div-float/2addr p2, v1

    .line 62
    sub-float/2addr v0, p2

    .line 63
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 64
    .line 65
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    add-float/2addr v0, p2

    .line 68
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method private final countRectF(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final getRenderPointF(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private final handleClickToSelect(FF)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIncludeGraphEnumListByClick()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    if-eqz v1, :cond_7

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    :goto_1
    const/4 v3, -0x1

    .line 56
    if-ge v3, v2, :cond_7

    .line 57
    .line 58
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-interface {v3, p1, p2, v4}, Lcom/zykj/blackboard/core/graph/IGraph;->isInRect(FFF)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_6

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-static {v3}, Lcom/zykj/blackboard/enums/SelectGraphEnumKt;->convert2SelectGraphEnum(Lcom/zykj/blackboard/core/graph/IGraph;)Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-nez p2, :cond_5

    .line 102
    .line 103
    :cond_4
    new-instance p2, Landroid/graphics/Matrix;

    .line 104
    .line 105
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 106
    .line 107
    .line 108
    :cond_5
    invoke-interface {v3, p2}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    :goto_3
    return-void
.end method

.method private final handleDragToSelect(Landroid/graphics/RectF;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIncludeGraphEnumListByDrag()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_1
    if-eqz v1, :cond_7

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    :goto_1
    const/4 v3, -0x1

    .line 46
    if-ge v3, v2, :cond_7

    .line 47
    .line 48
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    :cond_3
    new-instance v5, Landroid/graphics/Matrix;

    .line 73
    .line 74
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-interface {v4, v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {p1, v4}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-static {v3}, Lcom/zykj/blackboard/enums/SelectGraphEnumKt;->convert2SelectGraphEnum(Lcom/zykj/blackboard/core/graph/IGraph;)Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    :goto_3
    return-void
.end method

.method private final handleSelectedRectF(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/RectF;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/graphics/RectF;

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->countRectF(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_a

    .line 31
    .line 32
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 33
    .line 34
    const-string v1, "functionManager"

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz p2, :cond_9

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->initCurrentFunction(Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 43
    .line 44
    if-eqz p2, :cond_8

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->setSelectGraphList(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/4 v3, 0x1

    .line 60
    if-ne p1, v3, :cond_5

    .line 61
    .line 62
    instance-of p1, p2, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 63
    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    instance-of p1, p2, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 67
    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    instance-of p1, p2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    :cond_1
    new-instance p1, Landroid/graphics/RectF;

    .line 75
    .line 76
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Landroid/graphics/Matrix;

    .line 84
    .line 85
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 108
    .line 109
    .line 110
    :cond_2
    instance-of v3, p2, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 111
    .line 112
    if-eqz v3, :cond_3

    .line 113
    .line 114
    check-cast p2, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->getMovePointFList()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p2}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Landroid/graphics/PointF;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object p2, v2

    .line 128
    :goto_1
    invoke-direct {p0, p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->checkMinOutRectFWithMatrix(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 132
    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    invoke-virtual {v3, p1, v0, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->setSingleGraphData(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v2

    .line 143
    :cond_5
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->checkMinOutRectF(Landroid/graphics/RectF;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 147
    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->setSelectRectF(Landroid/graphics/RectF;)V

    .line 151
    .line 152
    .line 153
    :goto_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 154
    .line 155
    if-eqz p1, :cond_6

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->showSelectRectF()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v2

    .line 165
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v2

    .line 169
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v2

    .line 173
    :cond_9
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v2

    .line 177
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-eqz p1, :cond_b

    .line 182
    .line 183
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 184
    .line 185
    .line 186
    :cond_b
    return-void
.end method

.method private final isDoubleClick(FF)Z
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->lastClickX:F

    .line 11
    .line 12
    sub-float/2addr p1, v2

    .line 13
    float-to-double v4, p1

    .line 14
    const/4 p1, 0x2

    .line 15
    int-to-double v6, p1

    .line 16
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    double-to-float p1, v4

    .line 21
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->lastClickY:F

    .line 22
    .line 23
    sub-float/2addr p2, v2

    .line 24
    float-to-double v4, p2

    .line 25
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    double-to-float p2, v4

    .line 30
    add-float/2addr p1, p2

    .line 31
    float-to-double p1, p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    double-to-float p1, p1

    .line 37
    iget-wide v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->lastClickTime:J

    .line 38
    .line 39
    sub-long/2addr v0, v4

    .line 40
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->maxInterval:I

    .line 41
    .line 42
    int-to-long v4, p2

    .line 43
    cmp-long p2, v0, v4

    .line 44
    .line 45
    if-gez p2, :cond_0

    .line 46
    .line 47
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->minMoveDistance:F

    .line 48
    .line 49
    cmpg-float p1, p1, p2

    .line 50
    .line 51
    if-gez p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_0
    return v3
.end method

.method private final isMove(FF)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 8
    .line 9
    sub-float/2addr p2, v0

    .line 10
    float-to-double v0, p2

    .line 11
    const/4 p2, 0x2

    .line 12
    int-to-double v2, p2

    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-float p2, v0

    .line 18
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 19
    .line 20
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 21
    .line 22
    sub-float/2addr p1, v0

    .line 23
    float-to-double v0, p1

    .line 24
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    double-to-float p1, v0

    .line 29
    add-float/2addr p2, p1

    .line 30
    float-to-double p1, p2

    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    double-to-float p1, p1

    .line 36
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->minMoveDistance:F

    .line 37
    .line 38
    cmpl-float p1, p1, p2

    .line 39
    .line 40
    if-lez p1, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->handleTouchEvent(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p1, "functionManager"

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    throw p1
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 3
    .line 4
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final selectGraphList(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->reset()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->reset()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x1

    .line 40
    xor-int/2addr v0, v2

    .line 41
    if-ne v0, v2, :cond_4

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sub-int/2addr v0, v2

    .line 48
    :goto_0
    const/4 v2, -0x1

    .line 49
    if-ge v2, v0, :cond_4

    .line 50
    .line 51
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 56
    .line 57
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_1

    .line 89
    .line 90
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    :cond_1
    new-instance v4, Landroid/graphics/Matrix;

    .line 97
    .line 98
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-interface {v3, v4}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 112
    .line 113
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p0, p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->handleSelectedRectF(Ljava/util/List;Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_5
    const-string p1, "functionManager"

    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 15
    .line 16
    return-void
.end method

.method public singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->reset()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :cond_2
    const-string p1, "functionManager"

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1
.end method

.method public singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4
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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Down: X---> "

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, ", Y---> "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 57
    .line 58
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 59
    .line 60
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 61
    .line 62
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const-string v3, "functionManager"

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {v1, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->setFirstPoint(FF)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 77
    .line 78
    iget v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->isClickInSelectFunction(FF)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isSpecialFunctionClick:Z

    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 89
    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->initForFunctionTouch()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 101
    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->reset()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v2

    .line 112
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v2

    .line 116
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v2
.end method

.method public singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6
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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Move: X---> "

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, ", Y---> "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isMove(FF)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iput-boolean v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 55
    .line 56
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isSpecialFunctionClick:Z

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isStart:Z

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    const-string v3, "functionManager"

    .line 81
    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 89
    .line 90
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 91
    .line 92
    invoke-virtual {v0, v4, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->handleMoveStart(FF)V

    .line 93
    .line 94
    .line 95
    iput-boolean v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isStart:Z

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 107
    .line 108
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 109
    .line 110
    invoke-virtual {v0, v1, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->handleMoving(FF)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    const/4 v4, 0x2

    .line 139
    new-array v4, v4, [F

    .line 140
    .line 141
    aput v3, v4, v1

    .line 142
    .line 143
    aput p1, v4, v2

    .line 144
    .line 145
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_5

    .line 153
    .line 154
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 155
    .line 156
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 157
    .line 158
    aget v1, v4, v1

    .line 159
    .line 160
    aget v2, v4, v2

    .line 161
    .line 162
    invoke-interface {p1, v0, v3, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->newSelecting(FFFF)V

    .line 163
    .line 164
    .line 165
    :cond_5
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6
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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "  Up: X---> "

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, ", Y---> "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isSpecialFunctionClick:Z

    .line 40
    .line 41
    if-eqz v0, :cond_6

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const-string v3, "functionManager"

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 63
    .line 64
    iget v4, v0, Landroid/graphics/PointF;->y:F

    .line 65
    .line 66
    invoke-direct {p0, v1, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isDoubleClick(FF)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 73
    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 77
    .line 78
    iget v5, v0, Landroid/graphics/PointF;->y:F

    .line 79
    .line 80
    invoke-virtual {v1, v4, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->handleDoubleClick(FF)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v2

    .line 91
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 96
    .line 97
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 98
    .line 99
    invoke-virtual {v1, v4, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->handleClick(FF)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_8

    .line 104
    .line 105
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 106
    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->reset()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->handleClickToSelect(FF)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 124
    .line 125
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->handleSelectedRectF(Ljava/util/List;Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v2

    .line 135
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v2

    .line 139
    :cond_4
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->functionManager:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    .line 140
    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 144
    .line 145
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 146
    .line 147
    invoke-virtual {v1, v2, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->handleMoveEnd(FF)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isStart:Z

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v2

    .line 158
    :cond_6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 159
    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->handleClickToSelect(FF)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 187
    .line 188
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 189
    .line 190
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 195
    .line 196
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 197
    .line 198
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstX:F

    .line 203
    .line 204
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 205
    .line 206
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    iget v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->firstY:F

    .line 211
    .line 212
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 213
    .line 214
    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    new-instance v4, Landroid/graphics/RectF;

    .line 219
    .line 220
    invoke-direct {v4, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 221
    .line 222
    .line 223
    invoke-direct {p0, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->handleDragToSelect(Landroid/graphics/RectF;)V

    .line 224
    .line 225
    .line 226
    :goto_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList:Ljava/util/ArrayList;

    .line 227
    .line 228
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphMinOutRectFList:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->handleSelectedRectF(Ljava/util/List;Ljava/util/List;)V

    .line 231
    .line 232
    .line 233
    :cond_8
    :goto_2
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->isClick:Z

    .line 234
    .line 235
    if-eqz v0, :cond_9

    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 250
    .line 251
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->lastClickX:F

    .line 252
    .line 253
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 254
    .line 255
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->lastClickY:F

    .line 256
    .line 257
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 258
    .line 259
    .line 260
    move-result-wide v0

    .line 261
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->lastClickTime:J

    .line 262
    .line 263
    :cond_9
    return-void
.end method
