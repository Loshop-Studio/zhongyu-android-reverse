.class public final Lcom/zykj/sketch/core/action/EraseViewAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/zykj/sketch/core/action/EraseViewAction;",
        "Lcom/zykj/sketch/core/action/BaseAction;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "actionControl",
        "<init>",
        "(Lcom/zykj/sketch/core/listener/IControl;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "event",
        "Ld6/s;",
        "deleteGraph",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "graph",
        "handleListener",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
        "onTouchDown",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "enumType",
        "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "prevSelectGraph",
        "Lcom/zykj/sketch/core/graph/Graph;",
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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private prevSelectGraph:Lcom/zykj/sketch/core/graph/Graph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    return-void
.end method

.method private final deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->findSelectGraph()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->prevSelectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {v1, v4, v5}, Lcom/zykj/sketch/core/graph/Graph;->isClickDelete(FF)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-direct {p0, v1}, Lcom/zykj/sketch/core/action/EraseViewAction;->handleListener(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/core/graph/Graph;->setMFatherGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 57
    .line 58
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v3}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    sget-object v5, Lcom/zykj/sketch/core/graph/Graph;->Companion:Lcom/zykj/sketch/core/graph/Graph$Companion;

    .line 76
    .line 77
    invoke-virtual {v5}, Lcom/zykj/sketch/core/graph/Graph$Companion;->getCornerSize()Landroid/graphics/PointF;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 82
    .line 83
    const/4 v6, 0x2

    .line 84
    int-to-float v6, v6

    .line 85
    div-float/2addr v5, v6

    .line 86
    invoke-interface {v0, v1, v4, v5}, Lcom/zykj/sketch/core/listener/IControl;->findGraph(FFF)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_3

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 102
    .line 103
    iget-object v4, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->prevSelectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 104
    .line 105
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 116
    .line 117
    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 121
    .line 122
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getDeleteBitmap()Landroid/graphics/Bitmap;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setDeleteBitmap(Landroid/graphics/Bitmap;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getShowDelete()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {v2, v0, p1}, Lcom/zykj/sketch/core/graph/Graph;->isClickDelete(FF)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_4

    .line 154
    .line 155
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    invoke-direct {p0, v2}, Lcom/zykj/sketch/core/action/EraseViewAction;->handleListener(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 163
    .line 164
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/graph/Graph;->setShowDelete(Z)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/graph/Graph;->setSelect(Z)V

    .line 175
    .line 176
    .line 177
    :goto_1
    invoke-virtual {p0, v3}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 178
    .line 179
    .line 180
    :cond_6
    if-nez v2, :cond_7

    .line 181
    .line 182
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 183
    .line 184
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 189
    .line 190
    .line 191
    :cond_7
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 192
    .line 193
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method private final handleListener(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getImageDeleteListener()Lcom/zykj/sketch/core/listener/ImageDeleteListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    instance-of v1, p1, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast p1, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/ImageGraph;->getFileName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast p1, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->getFileName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string p1, ""

    .line 32
    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-lez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/ImageDeleteListener;->onDeleteImagePath(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method


# virtual methods
.method public enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_ERASER_VIEW:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method public onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
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
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/EraseViewAction;->deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
