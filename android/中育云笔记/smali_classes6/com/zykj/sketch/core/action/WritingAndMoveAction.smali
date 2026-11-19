.class public final Lcom/zykj/sketch/core/action/WritingAndMoveAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# instance fields
.field private final DRAG:I

.field private final NONE:I

.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private final floatArray:[F

.field private graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

.field private mTempMatrix:Landroid/graphics/Matrix;

.field private mX:F

.field private mY:F

.field private midPoint:Landroid/graphics/PointF;

.field private mode:I

.field private path:Landroid/graphics/Path;

.field private selectGraph:Lcom/zykj/sketch/core/graph/Graph;

.field private final writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V
    .locals 1

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "writingGroupGraph"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->DRAG:I

    .line 20
    .line 21
    new-instance p1, Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 27
    .line 28
    iget p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->NONE:I

    .line 29
    .line 30
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mode:I

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/PointF;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->midPoint:Landroid/graphics/PointF;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/Path;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 45
    .line 46
    const/16 p1, 0x9

    .line 47
    .line 48
    new-array p1, p1, [F

    .line 49
    .line 50
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->floatArray:[F

    .line 51
    .line 52
    return-void
.end method

.method private final initTempValue(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING_MOVE:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraph()Lcom/zykj/sketch/core/graph/StrokeGraph;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getParentGraphName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getGraphName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getPath()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectGraph()Lcom/zykj/sketch/core/graph/Graph;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-object v0
.end method

.method public onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 8

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v6, 0x4

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, Lcom/zykj/sketch/core/listener/IControl$DefaultImpls;->findGraph$default(Lcom/zykj/sketch/core/listener/IControl;FFFILjava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    move-object v2, v1

    .line 42
    check-cast v2, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 63
    .line 64
    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 74
    .line 75
    .line 76
    new-instance v1, Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 77
    .line 78
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 79
    .line 80
    invoke-direct {v1, v2}, Lcom/zykj/sketch/core/graph/StrokeGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setComplete(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->getColor()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IControl;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->getWidth()F

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-static {v1, v0, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->initPaint(Lcom/zykj/sketch/core/graph/Graph;IF)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-interface {v3}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v1, v0, v2, v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 143
    .line 144
    .line 145
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 146
    .line 147
    iput v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mX:F

    .line 148
    .line 149
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 150
    .line 151
    iput v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mY:F

    .line 152
    .line 153
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 154
    .line 155
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 159
    .line 160
    iget v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mX:F

    .line 161
    .line 162
    iget v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mY:F

    .line 163
    .line 164
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-virtual {v1, v0, p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->addPoint(FF)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-instance v0, Landroid/graphics/Path;

    .line 183
    .line 184
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 185
    .line 186
    invoke-direct {v0, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {p1, v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 197
    .line 198
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 199
    .line 200
    .line 201
    :cond_2
    return-void
.end method

.method public onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 8

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p0, p1, v2, v1, v0}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable$default(Lcom/zykj/sketch/core/action/BaseAction;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;ZILjava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mode:I

    .line 31
    .line 32
    iget v4, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->NONE:I

    .line 33
    .line 34
    if-ne v0, v4, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v4}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v0, v2, v3, v4}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 61
    .line 62
    iget v4, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mX:F

    .line 63
    .line 64
    iget v5, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mY:F

    .line 65
    .line 66
    iget v6, v2, Landroid/graphics/PointF;->x:F

    .line 67
    .line 68
    add-float/2addr v6, v4

    .line 69
    int-to-float v1, v1

    .line 70
    div-float/2addr v6, v1

    .line 71
    iget v7, v2, Landroid/graphics/PointF;->y:F

    .line 72
    .line 73
    add-float/2addr v7, v5

    .line 74
    div-float/2addr v7, v1

    .line 75
    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 76
    .line 77
    .line 78
    iget v1, v2, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    iput v1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mX:F

    .line 81
    .line 82
    iget v1, v2, Landroid/graphics/PointF;->y:F

    .line 83
    .line 84
    iput v1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mY:F

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {v0, v1, p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->addPoint(FF)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance v1, Landroid/graphics/Path;

    .line 102
    .line 103
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 104
    .line 105
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p1, v1, v0}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    iget v4, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->DRAG:I

    .line 117
    .line 118
    if-ne v0, v4, :cond_3

    .line 119
    .line 120
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCount()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-le v4, v3, :cond_3

    .line 129
    .line 130
    new-instance v4, Landroid/graphics/Matrix;

    .line 131
    .line 132
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 133
    .line 134
    .line 135
    iget-object v5, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 136
    .line 137
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {p1, v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    invoke-virtual {p1, v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-static {v5, v2, v6, p1, v3}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getMidPoint(FFFFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 181
    .line 182
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->midPoint:Landroid/graphics/PointF;

    .line 183
    .line 184
    iget v5, v3, Landroid/graphics/PointF;->x:F

    .line 185
    .line 186
    sub-float/2addr v2, v5

    .line 187
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 188
    .line 189
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 190
    .line 191
    sub-float/2addr p1, v3

    .line 192
    invoke-virtual {v4, v2, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v4}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->floatArray:[F

    .line 199
    .line 200
    invoke-virtual {v4, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 201
    .line 202
    .line 203
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->floatArray:[F

    .line 204
    .line 205
    const/4 v2, 0x5

    .line 206
    aget p1, p1, v2

    .line 207
    .line 208
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getGraphMatrixListener()Lcom/zykj/sketch/core/listener/GraphMatrixListener;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-eqz p1, :cond_3

    .line 217
    .line 218
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->floatArray:[F

    .line 219
    .line 220
    aget v1, v0, v1

    .line 221
    .line 222
    aget v0, v0, v2

    .line 223
    .line 224
    invoke-interface {p1, v1, v0}, Lcom/zykj/sketch/core/listener/GraphMatrixListener;->onTranslation(FF)V

    .line 225
    .line 226
    .line 227
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 228
    .line 229
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->initTempValue(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-virtual {p1, v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {p1, v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v2, v1, v4, p1, v0}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getMidPoint(FFFFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->midPoint:Landroid/graphics/PointF;

    .line 82
    .line 83
    iget p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->DRAG:I

    .line 84
    .line 85
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mode:I

    .line 86
    .line 87
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 88
    .line 89
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 90
    .line 91
    .line 92
    :cond_1
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 93
    .line 94
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/graph/Graph;->setComplete(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 26
    .line 27
    iget p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->NONE:I

    .line 28
    .line 29
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mode:I

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;->onMeasure()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setComplete(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Landroid/graphics/Path;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 36
    .line 37
    invoke-direct {v2, v3}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v1, v2, v3}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 52
    .line 53
    .line 54
    :cond_0
    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 56
    .line 57
    new-instance p1, Landroid/graphics/Path;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public final setGraph(Lcom/zykj/sketch/core/graph/StrokeGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 2
    .line 3
    return-void
.end method

.method public final setMX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setMY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->mY:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPath(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->path:Landroid/graphics/Path;

    .line 7
    .line 8
    return-void
.end method

.method public final setSelectGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-void
.end method
