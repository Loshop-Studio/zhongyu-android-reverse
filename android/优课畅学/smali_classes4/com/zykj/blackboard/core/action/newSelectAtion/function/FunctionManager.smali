.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

.field private final defaultFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

.field private final geometryFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

.field private final imageFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

.field private final textFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

.field private final writeFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->defaultFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

    .line 15
    .line 16
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->writeFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    .line 22
    .line 23
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->textFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 29
    .line 30
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->geometryFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    .line 36
    .line 37
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->imageFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final handleClick(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleClick(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final handleDoubleClick(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleDoubleClick(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final handleMoveEnd(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleMoveEnd(FF)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final handleMoveStart(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleMoveStart(FF)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final handleMoving(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleMoving(FF)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final initCurrentFunction(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    move v1, v0

    .line 12
    move v2, v1

    .line 13
    move v3, v2

    .line 14
    move v4, v3

    .line 15
    move v5, v4

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-eqz v6, :cond_6

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    check-cast v6, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 27
    .line 28
    instance-of v7, v6, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 29
    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    instance-of v7, v6, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 36
    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of v7, v6, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 43
    .line 44
    if-eqz v7, :cond_3

    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    :cond_3
    :goto_0
    invoke-interface {v6}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    :cond_4
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_0

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 67
    .line 68
    instance-of v8, v7, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 69
    .line 70
    if-eqz v8, :cond_4

    .line 71
    .line 72
    check-cast v7, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 73
    .line 74
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->isHighlighter()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_5

    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    add-int p1, v1, v2

    .line 87
    .line 88
    add-int/2addr p1, v3

    .line 89
    add-int/2addr p1, v4

    .line 90
    add-int/2addr p1, v5

    .line 91
    if-nez p1, :cond_7

    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->defaultFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->setHasTextGraph(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    if-ne p1, v1, :cond_8

    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->writeFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->setHighlighter(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_8
    const/4 v1, 0x1

    .line 108
    if-ne p1, v2, :cond_9

    .line 109
    .line 110
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->writeFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    .line 111
    .line 112
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->setHighlighter(Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_9
    if-ne p1, v3, :cond_a

    .line 117
    .line 118
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->textFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_a
    if-ne p1, v4, :cond_b

    .line 122
    .line 123
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->geometryFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_b
    if-ne p1, v5, :cond_d

    .line 127
    .line 128
    if-ne p1, v1, :cond_c

    .line 129
    .line 130
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->imageFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_c
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->defaultFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_d
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->defaultFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

    .line 137
    .line 138
    if-lez v3, :cond_e

    .line 139
    .line 140
    move v0, v1

    .line 141
    :cond_e
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->setHasTextGraph(Z)V

    .line 142
    .line 143
    .line 144
    :goto_2
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 145
    .line 146
    return-void
.end method

.method public final initForFunctionTouch()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->initForFunctionTouch()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final isClickInSelectFunction(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isClickInSelectFunction(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->defaultFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->writeFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->textFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->geometryFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->reset()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 23
    .line 24
    return-void
.end method

.method public final setFirstPoint(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setFirstPoint(FF)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setSelectGraphList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectGraphList(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setSelectRectF(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectRectF(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setSingleGraphData(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSingleGraphData(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final showSelectRectF()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v3, v1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final updateFunctionRectF()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->currentFunction:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->updateFunctionRectF()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
