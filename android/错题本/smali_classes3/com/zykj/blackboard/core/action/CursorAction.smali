.class public final Lcom/zykj/blackboard/core/action/CursorAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\tJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\tR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001bj\u0008\u0012\u0004\u0012\u00020\u0006`\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/CursorAction;",
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "<init>",
        "()V",
        "Ld6/s;",
        "initPointConfig",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "handleTouch",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "reset",
        "singleTouchDown",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "Landroid/graphics/Paint;",
        "mPaint",
        "Landroid/graphics/Paint;",
        "",
        "offsetForFinger",
        "F",
        "Landroid/graphics/Path;",
        "tempPath",
        "Landroid/graphics/Path;",
        "Landroid/graphics/PointF;",
        "tempPointF",
        "Landroid/graphics/PointF;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "eventList",
        "Ljava/util/ArrayList;",
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
.field private final eventList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private offsetForFinger:F

.field private final tempPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

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
    const/high16 v1, 0x41a00000    # 20.0f

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

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
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->mPaint:Landroid/graphics/Paint;

    .line 32
    .line 33
    const/high16 v0, 0x42480000    # 50.0f

    .line 34
    .line 35
    iput v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->offsetForFinger:F

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/Path;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->tempPath:Landroid/graphics/Path;

    .line 43
    .line 44
    new-instance v0, Landroid/graphics/PointF;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->tempPointF:Landroid/graphics/PointF;

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->eventList:Ljava/util/ArrayList;

    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic access$getEventList$p(Lcom/zykj/blackboard/core/action/CursorAction;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->eventList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMPaint$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getOffsetForFinger$p(Lcom/zykj/blackboard/core/action/CursorAction;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->offsetForFinger:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getTempPath$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Path;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->tempPath:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->tempPointF:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p0
.end method

.method private final handleTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;-><init>(Lcom/zykj/blackboard/core/action/CursorAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final initPointConfig()V
    .locals 3

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction;->mPaint:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getCursorColor()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction;->mPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getCursorWidth()F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getCursorOffset()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->offsetForFinger:F

    .line 30
    .line 31
    :cond_0
    return-void
.end method


# virtual methods
.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->tempPath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->eventList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/CursorAction;->initPointConfig()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction;->handleTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 10
    .line 11
    .line 12
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
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction;->handleTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction;->handleTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->eventList:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction;->mPaint:Landroid/graphics/Paint;

    .line 27
    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v1, v2, v3}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {p1, v0, v1}, Lcom/zykj/blackboard/core/action/IActionListener;->moveCursor(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method
