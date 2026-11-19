.class public final Lcom/zykj/sketch/core/action/EraseWritingAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/sketch/core/action/EraseWritingAction;",
        "Lcom/zykj/sketch/core/action/BaseAction;",
        "actionControl",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "(Lcom/zykj/sketch/core/listener/IControl;)V",
        "paint",
        "Landroid/graphics/Paint;",
        "deleteGraph",
        "",
        "event",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "enumType",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "onTouchDown",
        "onTouchMove",
        "onTouchPointerDown",
        "onTouchPointerUp",
        "onTouchUp",
        "Companion",
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
    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    move-object v4, v3

    .line 71
    check-cast v4, Lcom/zykj/sketch/core/graph/Graph;

    .line 72
    .line 73
    instance-of v3, v4, Lcom/zykj/sketch/core/graph/ViewGraph;

    .line 74
    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const/4 v8, 0x4

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-static/range {v4 .. v9}, Lcom/zykj/sketch/core/listener/IGraph$DefaultImpls;->isInRect$default(Lcom/zykj/sketch/core/listener/IGraph;FFFILjava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_0

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    instance-of v3, v4, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 96
    .line 97
    if-eqz v3, :cond_0

    .line 98
    .line 99
    move-object v3, v4

    .line 100
    check-cast v3, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    sget v7, Lcom/zykj/sketch/core/action/EraseWritingAction;->TouchRadius:F

    .line 111
    .line 112
    invoke-virtual {v3, v5, v6, v7}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->getIntersectGraph(FFF)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_2

    .line 125
    .line 126
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lcom/zykj/sketch/core/graph/Graph;

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 133
    .line 134
    .line 135
    const/4 v5, 0x1

    .line 136
    invoke-virtual {p0, v5}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    invoke-virtual {v4}, Lcom/zykj/sketch/core/graph/Graph;->hasChild()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_0

    .line 145
    .line 146
    invoke-virtual {v4}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-eqz v3, :cond_3

    .line 151
    .line 152
    invoke-virtual {v3, v4}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    const/4 v3, 0x0

    .line 156
    invoke-virtual {v4, v3}, Lcom/zykj/sketch/core/graph/Graph;->setMFatherGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 164
    .line 165
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 169
    .line 170
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseWritingAction;->paint:Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-interface {p1, v1, v0}, Lcom/zykj/sketch/core/listener/IControl;->renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 173
    .line 174
    .line 175
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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
