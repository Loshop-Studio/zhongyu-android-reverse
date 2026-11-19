.class public final Lcom/zykj/sketch/core/action/EraseWritingAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;

.field private static TouchRadius:F


# instance fields
.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private paint:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/sketch/core/action/EraseWritingAction;->Companion:Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;

    .line 8
    .line 9
    const/high16 v0, 0x42200000    # 40.0f

    .line 10
    .line 11
    sput v0, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 2

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 17
    .line 18
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/high16 v1, -0x10000

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 31
    .line 32
    const/high16 v1, 0x41a00000    # 20.0f

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x9

    .line 38
    .line 39
    new-array v0, v0, [F

    .line 40
    .line 41
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic access$getTouchRadius$cp()F
    .locals 1

    .line 1
    sget v0, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$setTouchRadius$cp(F)V
    .locals 0

    .line 1
    sput p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 2
    .line 3
    return-void
.end method

.method private final deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

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
    sget v3, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3}, Lcom/zykj/sketch/core/listener/IControl;->findGraph(FFF)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 23
    .line 24
    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Landroid/graphics/PointF;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    sget v4, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 50
    .line 51
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 52
    .line 53
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 54
    .line 55
    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    move-object v4, v3

    .line 74
    check-cast v4, Lcom/zykj/sketch/core/graph/Graph;

    .line 75
    .line 76
    instance-of v3, v4, Lcom/zykj/sketch/core/graph/ViewGraph;

    .line 77
    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    const/4 v8, 0x4

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    invoke-static/range {v4 .. v9}, Lcom/zykj/sketch/core/listener/IGraph$DefaultImpls;->isInRect$default(Lcom/zykj/sketch/core/listener/IGraph;FFFILjava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_0

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    instance-of v3, v4, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 99
    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    move-object v3, v4

    .line 103
    check-cast v3, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    sget v7, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 114
    .line 115
    invoke-virtual {v3, v5, v6, v7}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->getIntersectGraph(FFF)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/Iterable;

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_2

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lcom/zykj/sketch/core/graph/Graph;

    .line 136
    .line 137
    invoke-virtual {v4, v5}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 138
    .line 139
    .line 140
    const/4 v5, 0x1

    .line 141
    invoke-virtual {p0, v5}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    invoke-virtual {v4}, Lcom/zykj/sketch/core/graph/Graph;->hasChild()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-nez v3, :cond_0

    .line 150
    .line 151
    invoke-virtual {v4}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-eqz v3, :cond_3

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 158
    .line 159
    .line 160
    :cond_3
    const/4 v3, 0x0

    .line 161
    invoke-virtual {v4, v3}, Lcom/zykj/sketch/core/graph/Graph;->setMFatherGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 169
    .line 170
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 174
    .line 175
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 176
    .line 177
    invoke-interface {p1, v1, v0}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method


# virtual methods
.method public enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_ERASER_WRITING:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/EraseWritingAction;->deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/EraseWritingAction;->deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/EraseWritingAction;->deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 23
    .line 24
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/EraseWritingAction;->deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 23
    .line 24
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
