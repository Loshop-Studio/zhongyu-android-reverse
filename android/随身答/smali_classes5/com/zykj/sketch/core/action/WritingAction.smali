.class public Lcom/zykj/sketch/core/action/WritingAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0008\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/sketch/core/action/WritingAction;",
        "Lcom/zykj/sketch/core/action/BaseAction;",
        "actionControl",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "writingGroupGraph",
        "Lcom/zykj/sketch/core/graph/WritingGroupGraph;",
        "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V",
        "graph",
        "Lcom/zykj/sketch/core/graph/StrokeGraph;",
        "getGraph",
        "()Lcom/zykj/sketch/core/graph/StrokeGraph;",
        "setGraph",
        "(Lcom/zykj/sketch/core/graph/StrokeGraph;)V",
        "mX",
        "",
        "getMX",
        "()F",
        "setMX",
        "(F)V",
        "mY",
        "getMY",
        "setMY",
        "path",
        "Landroid/graphics/Path;",
        "getPath",
        "()Landroid/graphics/Path;",
        "setPath",
        "(Landroid/graphics/Path;)V",
        "createGraph",
        "",
        "event",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "enumType",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "getParentGraphName",
        "",
        "onTouchDown",
        "onTouchMove",
        "onTouchPointerDown",
        "onTouchPointerUp",
        "onTouchUp",
        "sketch_release"
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
.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

.field private mX:F

.field private mY:F

.field private path:Landroid/graphics/Path;

.field private final writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V
    .locals 1

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "writingGroupGraph"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 17
    .line 18
    new-instance p1, Landroid/graphics/Path;

    .line 19
    .line 20
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 24
    .line 25
    return-void
.end method

.method private final createGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/listener/IControl$DefaultImpls;->findGraph$default(Lcom/zykj/sketch/core/listener/IControl;FFFILjava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 46
    .line 47
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/graph/StrokeGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Lcom/zykj/sketch/core/graph/Graph;->setComplete(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->getColor()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IControl;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->getWidth()F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->initPaint(Lcom/zykj/sketch/core/graph/Graph;IF)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 124
    .line 125
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 126
    .line 127
    .line 128
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 129
    .line 130
    iput v2, p0, Lcom/zykj/sketch/core/action/WritingAction;->mX:F

    .line 131
    .line 132
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 133
    .line 134
    iput v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->mY:F

    .line 135
    .line 136
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 137
    .line 138
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 142
    .line 143
    iget v2, p0, Lcom/zykj/sketch/core/action/WritingAction;->mX:F

    .line 144
    .line 145
    iget v3, p0, Lcom/zykj/sketch/core/action/WritingAction;->mY:F

    .line 146
    .line 147
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-virtual {v0, v1, p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->addPoint(FF)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance v1, Landroid/graphics/Path;

    .line 166
    .line 167
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 168
    .line 169
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-interface {p1, v1, v0}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 177
    .line 178
    .line 179
    return-void
.end method


# virtual methods
.method public enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraph()Lcom/zykj/sketch/core/graph/StrokeGraph;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->mX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->mY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getParentGraphName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

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
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, p1, v2, v0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable$default(Lcom/zykj/sketch/core/action/BaseAction;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/WritingAction;->createGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 8

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-static {p0, p1, v1, v2, v0}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable$default(Lcom/zykj/sketch/core/action/BaseAction;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/core/action/WritingAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v0, v1, v3, v4}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 43
    .line 44
    iget v4, p0, Lcom/zykj/sketch/core/action/WritingAction;->mX:F

    .line 45
    .line 46
    iget v5, p0, Lcom/zykj/sketch/core/action/WritingAction;->mY:F

    .line 47
    .line 48
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    add-float/2addr v6, v4

    .line 51
    int-to-float v2, v2

    .line 52
    div-float/2addr v6, v2

    .line 53
    iget v7, v1, Landroid/graphics/PointF;->y:F

    .line 54
    .line 55
    add-float/2addr v7, v5

    .line 56
    div-float/2addr v7, v2

    .line 57
    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 58
    .line 59
    .line 60
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 61
    .line 62
    iput v2, p0, Lcom/zykj/sketch/core/action/WritingAction;->mX:F

    .line 63
    .line 64
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 65
    .line 66
    iput v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->mY:F

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {v0, v1, p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->addPoint(FF)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v1, Landroid/graphics/Path;

    .line 84
    .line 85
    iget-object v2, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 86
    .line 87
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p1, v1, v0}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, p1, v2, v0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable$default(Lcom/zykj/sketch/core/action/BaseAction;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, p1, v2, v0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable$default(Lcom/zykj/sketch/core/action/BaseAction;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/sketch/core/action/WritingAction;->writingGroupGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;->onMeasure()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setComplete(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Landroid/graphics/Path;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 29
    .line 30
    invoke-direct {v2, v3}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v1, v2, v3}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->getActionControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final setGraph(Lcom/zykj/sketch/core/graph/StrokeGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->graph:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 2
    .line 3
    return-void
.end method

.method public final setMX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->mX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setMY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->mY:F

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/action/WritingAction;->path:Landroid/graphics/Path;

    .line 7
    .line 8
    return-void
.end method
