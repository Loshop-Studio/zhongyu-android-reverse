.class public final Lcom/zykj/sketch/core/action/EraseViewAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# instance fields
.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private prevSelectGraph:Lcom/zykj/sketch/core/graph/Graph;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1

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
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->prevSelectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v1, v4, v5}, Lcom/zykj/sketch/core/graph/Graph;->isClickDelete(FF)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-direct {p0, v1}, Lcom/zykj/sketch/core/action/EraseViewAction;->handleListener(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/core/graph/Graph;->setMFatherGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 59
    .line 60
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    sget-object v5, Lcom/zykj/sketch/core/graph/Graph;->Companion:Lcom/zykj/sketch/core/graph/Graph$Companion;

    .line 78
    .line 79
    invoke-virtual {v5}, Lcom/zykj/sketch/core/graph/Graph$Companion;->getCornerSize()Landroid/graphics/PointF;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 84
    .line 85
    const/4 v6, 0x2

    .line 86
    int-to-float v6, v6

    .line 87
    div-float/2addr v5, v6

    .line 88
    invoke-interface {v0, v1, v4, v5}, Lcom/zykj/sketch/core/listener/IControl;->findGraph(FFF)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v1, v0

    .line 93
    check-cast v1, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 107
    .line 108
    iget-object v4, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->prevSelectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 109
    .line 110
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 121
    .line 122
    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    iget-object v0, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 126
    .line 127
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getDeleteBitmap()Landroid/graphics/Bitmap;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setDeleteBitmap(Landroid/graphics/Bitmap;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getShowDelete()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-virtual {v2, v0, p1}, Lcom/zykj/sketch/core/graph/Graph;->isClickDelete(FF)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_5

    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_4

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    invoke-direct {p0, v2}, Lcom/zykj/sketch/core/action/EraseViewAction;->handleListener(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_5
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 168
    .line 169
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/graph/Graph;->setShowDelete(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/graph/Graph;->setSelect(Z)V

    .line 180
    .line 181
    .line 182
    :goto_1
    invoke-virtual {p0, v3}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 183
    .line 184
    .line 185
    :cond_6
    if-nez v2, :cond_7

    .line 186
    .line 187
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 188
    .line 189
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 194
    .line 195
    .line 196
    :cond_7
    iget-object p1, p0, Lcom/zykj/sketch/core/action/EraseViewAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 197
    .line 198
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 199
    .line 200
    .line 201
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

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_ERASER_VIEW:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

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
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/EraseViewAction;->deleteGraph(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
