.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0008J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0010R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001aj\u0008\u0012\u0004\u0012\u00020\u0015`\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR*\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "<init>",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "Ld6/s;",
        "initFunctionTypeList",
        "()V",
        "initFunctionRelativeRectF",
        "updateFunctionRectF",
        "",
        "x",
        "y",
        "",
        "isClickInSelectFunction",
        "(FF)Z",
        "Landroid/graphics/RectF;",
        "getMaxFunctionRectF",
        "()Landroid/graphics/RectF;",
        "",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "getCurrentFunctionTypeList",
        "()Ljava/util/List;",
        "reset",
        "handleClick",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "functionTypeList",
        "Ljava/util/ArrayList;",
        "deleteRelativeRectF",
        "Landroid/graphics/RectF;",
        "value",
        "hasTextGraph",
        "Z",
        "getHasTextGraph",
        "()Z",
        "setHasTextGraph",
        "(Z)V",
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
.field private final deleteRelativeRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final functionTypeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private hasTextGraph:Z


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;)V
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
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->deleteRelativeRectF:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->initFunctionTypeList()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->initFunctionRelativeRectF()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final initFunctionRelativeRectF()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41c80000    # 25.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 37
    .line 38
    sub-float/2addr v2, v0

    .line 39
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->deleteRelativeRectF:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-float/2addr v3, v2

    .line 50
    const/4 v4, 0x2

    .line 51
    int-to-float v4, v4

    .line 52
    div-float/2addr v3, v4

    .line 53
    const/high16 v5, 0x41b80000    # 23.0f

    .line 54
    .line 55
    add-float/2addr v1, v5

    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    sub-float/2addr v6, v2

    .line 65
    div-float/2addr v6, v4

    .line 66
    add-float/2addr v6, v2

    .line 67
    invoke-virtual {v0, v5, v3, v1, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private final initFunctionTypeList()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->hasTextGraph:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public getCurrentFunctionTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasTextGraph()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->hasTextGraph:Z

    .line 2
    .line 3
    return v0
.end method

.method public getMaxFunctionRectF()Landroid/graphics/RectF;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->deleteRelativeRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x42380000    # 46.0f

    .line 8
    .line 9
    add-float/2addr v0, v1

    .line 10
    new-instance v1, Lkotlin/Pair;

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectSizePair(Lkotlin/Pair;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroid/graphics/RectF;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public handleClick(FF)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleClick(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p1, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-interface {p1, p2, v0, v1}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->reset()V

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p1, 0x1

    .line 61
    return p1
.end method

.method public isClickInSelectFunction(FF)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v2, v1, [F

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput p1, v2, v3

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput p2, v2, v4

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 19
    .line 20
    .line 21
    aget v5, v2, v3

    .line 22
    .line 23
    aget v2, v2, v4

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 38
    .line 39
    sget-object v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 40
    .line 41
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    new-instance v6, Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerX()F

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    int-to-float v8, v1

    .line 58
    div-float v9, v0, v8

    .line 59
    .line 60
    sub-float/2addr v7, v9

    .line 61
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    iget v10, v10, Landroid/graphics/RectF;->top:F

    .line 66
    .line 67
    const/4 v11, 0x5

    .line 68
    int-to-float v11, v11

    .line 69
    invoke-static {v0, v11, v8, v10}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v11}, Landroid/graphics/RectF;->centerX()F

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    add-float/2addr v11, v9

    .line 82
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 87
    .line 88
    const/4 v12, 0x3

    .line 89
    int-to-float v12, v12

    .line 90
    invoke-static {v0, v12, v8, v9}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-direct {v6, v7, v10, v11, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v5, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_0

    .line 102
    .line 103
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 106
    .line 107
    .line 108
    return v4

    .line 109
    :cond_0
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 110
    .line 111
    sget-object v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 112
    .line 113
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_1

    .line 118
    .line 119
    new-instance v6, Landroid/graphics/RectF;

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 126
    .line 127
    int-to-float v1, v1

    .line 128
    div-float/2addr v0, v1

    .line 129
    sub-float/2addr v7, v0

    .line 130
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 135
    .line 136
    sub-float/2addr v1, v0

    .line 137
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 142
    .line 143
    add-float/2addr v8, v0

    .line 144
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    .line 149
    .line 150
    add-float/2addr v9, v0

    .line 151
    invoke-direct {v6, v7, v1, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v5, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_1

    .line 159
    .line 160
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 163
    .line 164
    .line 165
    return v4

    .line 166
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0, v5, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_2

    .line 175
    .line 176
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 177
    .line 178
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 179
    .line 180
    .line 181
    return v4

    .line 182
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_3

    .line 195
    .line 196
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 197
    .line 198
    invoke-direct {p1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 202
    .line 203
    .line 204
    return v4

    .line 205
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getEditRectF()Landroid/graphics/RectF;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_4

    .line 218
    .line 219
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 220
    .line 221
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 222
    .line 223
    .line 224
    return v4

    .line 225
    :cond_4
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;

    .line 226
    .line 227
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 228
    .line 229
    .line 230
    return v3
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->reset()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->setHasTextGraph(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->initFunctionTypeList()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setHasTextGraph(Z)V
    .locals 7

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->hasTextGraph:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    move v4, v3

    .line 12
    :goto_0
    const/4 v5, -0x1

    .line 13
    if-ge v4, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    add-int/lit8 v4, v4, 0x1

    .line 20
    .line 21
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 22
    .line 23
    instance-of v6, v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v3, v5

    .line 32
    :goto_1
    if-eq v3, v5, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_2
    if-nez p1, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 42
    .line 43
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    move v3, v2

    .line 55
    move v4, v3

    .line 56
    :goto_2
    if-ge v4, v1, :cond_5

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 65
    .line 66
    instance-of v6, v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 67
    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    move v3, v5

    .line 75
    :goto_3
    if-eq v3, v5, :cond_6

    .line 76
    .line 77
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_6
    if-nez p1, :cond_7

    .line 83
    .line 84
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 85
    .line 86
    sget-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 87
    .line 88
    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_7
    return-void
.end method

.method public updateFunctionRectF()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->deleteRelativeRectF:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 18
    .line 19
    add-float/2addr v1, v2

    .line 20
    const/high16 v2, 0x41700000    # 15.0f

    .line 21
    .line 22
    sub-float/2addr v1, v2

    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 34
    .line 35
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->deleteRelativeRectF:Landroid/graphics/RectF;

    .line 36
    .line 37
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 38
    .line 39
    add-float/2addr v4, v5

    .line 40
    add-float/2addr v4, v2

    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    add-float/2addr v5, v2

    .line 56
    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
