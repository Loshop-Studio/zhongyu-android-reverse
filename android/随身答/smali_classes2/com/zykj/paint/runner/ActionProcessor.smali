# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/runner/ActionProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;,
        Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;
    }
.end annotation


# static fields
.field private static final DELAY_TIME:J = 0x1f4L

.field private static final FRAME_TIME:J = 0x28L

.field private static final TAG:Ljava/lang/String; = "ActionProcessor"


# instance fields
.field private isRunning:Z

.field private map:Lcom/zykj/paint/graphic/Map;

.field schedule:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private sketchViewer:Lcom/zykj/paint/render/SketchViewer;

.field private sourceUrl:Ljava/lang/String;

.field private taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer;Lcom/zykj/paint/graphic/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic access$000(Lcom/zykj/paint/runner/ActionProcessor;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/paint/runner/ActionProcessor;->isRunning:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public addAction(Lcom/zykj/paint/Actions$EzyAction;Z)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string/jumbo v4, "\u540d\u79f0\u4e3a["

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, "] actionType=["

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v4, "]id=["

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v4, "]"

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "ActionProcessor"

    .line 60
    .line 61
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 65
    .line 66
    if-ne v1, v3, :cond_0

    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_0
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 86
    .line 87
    if-eq v1, v3, :cond_7

    .line 88
    .line 89
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 90
    .line 91
    if-eq v1, v3, :cond_7

    .line 92
    .line 93
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 94
    .line 95
    if-eq v1, v3, :cond_7

    .line 96
    .line 97
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 98
    .line 99
    if-eq v1, v3, :cond_7

    .line 100
    .line 101
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 102
    .line 103
    if-eq v1, v3, :cond_7

    .line 104
    .line 105
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 106
    .line 107
    if-ne v1, v3, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_6

    .line 115
    .line 116
    const-string v1, "/"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const/4 v1, 0x1

    .line 123
    aget-object v0, v0, v1

    .line 124
    .line 125
    const-string v1, "NewPolylineData"

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_3

    .line 132
    .line 133
    if-nez p2, :cond_2

    .line 134
    .line 135
    iget-object p2, p0, Lcom/zykj/paint/runner/ActionProcessor;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 136
    .line 137
    new-instance v0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;

    .line 138
    .line 139
    invoke-direct {v0, p0, p1}, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;-><init>(Lcom/zykj/paint/runner/ActionProcessor;Lcom/zykj/paint/Actions$EzyAction;)V

    .line 140
    .line 141
    .line 142
    const-wide/16 v1, 0x0

    .line 143
    .line 144
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 145
    .line 146
    invoke-interface {p2, v0, v1, v2, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->schedule:Ljava/util/concurrent/ScheduledFuture;

    .line 151
    .line 152
    return-void

    .line 153
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/runner/ActionProcessor;->renderPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_3
    const-string p2, "NewLayerData"

    .line 163
    .line 164
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_4

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Lcom/zykj/paint/runner/ActionProcessor;->renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 174
    .line 175
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_4
    const-string p2, "NewImageData"

    .line 180
    .line 181
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-eqz p2, :cond_5

    .line 186
    .line 187
    invoke-virtual {p0, p1}, Lcom/zykj/paint/runner/ActionProcessor;->renderImage(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_5
    const-string p2, "EzyMatrixData"

    .line 197
    .line 198
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_6

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Lcom/zykj/paint/runner/ActionProcessor;->renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 210
    .line 211
    .line 212
    :cond_6
    return-void

    .line 213
    :cond_7
    :goto_0
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 214
    .line 215
    invoke-virtual {p1, v2}, Lcom/zykj/paint/graphic/Map;->hide(I)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 219
    .line 220
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public addMultiAction(Lcom/zykj/paint/Actions$EzyAction;)Ljava/util/concurrent/ScheduledFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;-><init>(Lcom/zykj/paint/runner/ActionProcessor;Lcom/zykj/paint/Actions$EzyAction;)V

    .line 6
    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->schedule:Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->isRunning:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public pause()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->isRunning:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->schedule:Ljava/util/concurrent/ScheduledFuture;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public renderAction(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/paint/Actions$EzyAction;

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/zykj/paint/runner/ActionProcessor;->isRunning:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string/jumbo v5, "\u540d\u79f0\u4e3a["

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v5, "] actionType=["

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v5, "]id=["

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v5, "]"

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v5, "ActionProcessor"

    .line 81
    .line 82
    invoke-static {v5, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    sget v4, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 86
    .line 87
    if-ne v2, v4, :cond_2

    .line 88
    .line 89
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v0, v0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    sget v4, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 102
    .line 103
    if-eq v2, v4, :cond_7

    .line 104
    .line 105
    sget v4, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 106
    .line 107
    if-eq v2, v4, :cond_7

    .line 108
    .line 109
    sget v4, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 110
    .line 111
    if-eq v2, v4, :cond_7

    .line 112
    .line 113
    sget v4, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 114
    .line 115
    if-eq v2, v4, :cond_7

    .line 116
    .line 117
    sget v4, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 118
    .line 119
    if-eq v2, v4, :cond_7

    .line 120
    .line 121
    sget v4, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 122
    .line 123
    if-ne v2, v4, :cond_3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_0

    .line 131
    .line 132
    const-string v2, "/"

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const/4 v2, 0x1

    .line 139
    aget-object v1, v1, v2

    .line 140
    .line 141
    const-string v2, "NewPolylineData"

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_4

    .line 148
    .line 149
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderRunningPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_4
    const-string v2, "NewLayerData"

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_5

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_5
    const-string v2, "NewImageData"

    .line 168
    .line 169
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_6

    .line 174
    .line 175
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderImage(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_6
    const-string v2, "EzyMatrixData"

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_0

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 194
    .line 195
    invoke-virtual {v0, v3}, Lcom/zykj/paint/graphic/Map;->hide(I)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_8
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public renderHistory(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/paint/Actions$EzyAction;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    new-instance v4, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string/jumbo v5, "\u540d\u79f0\u4e3a["

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v5, "] actionType=["

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v5, "]id=["

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v5, "]"

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v5, "ActionProcessor"

    .line 76
    .line 77
    invoke-static {v5, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    sget v4, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 81
    .line 82
    if-ne v2, v4, :cond_1

    .line 83
    .line 84
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v0, v0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    sget v4, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 97
    .line 98
    if-eq v2, v4, :cond_6

    .line 99
    .line 100
    sget v4, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 101
    .line 102
    if-eq v2, v4, :cond_6

    .line 103
    .line 104
    sget v4, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 105
    .line 106
    if-eq v2, v4, :cond_6

    .line 107
    .line 108
    sget v4, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 109
    .line 110
    if-eq v2, v4, :cond_6

    .line 111
    .line 112
    sget v4, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 113
    .line 114
    if-eq v2, v4, :cond_6

    .line 115
    .line 116
    sget v4, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 117
    .line 118
    if-ne v2, v4, :cond_2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_0

    .line 126
    .line 127
    const-string v2, "/"

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const/4 v2, 0x1

    .line 134
    aget-object v1, v1, v2

    .line 135
    .line 136
    const-string v2, "NewPolylineData"

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_3

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_3
    const-string v2, "NewLayerData"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_4

    .line 156
    .line 157
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_4
    const-string v2, "NewImageData"

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_5

    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderImage(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_5
    const-string v2, "EzyMatrixData"

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_0

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;->renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 189
    .line 190
    invoke-virtual {v0, v3}, Lcom/zykj/paint/graphic/Map;->hide(I)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_7
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 196
    .line 197
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->renderHistorySnapshot()V

    .line 198
    .line 199
    .line 200
    return-void
.end method

# RE I/O 从数据流解码图片（BitmapFactory.decodeStream）。
.method public renderImage(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewImageData;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/paint/Actions$NewImageData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sget v2, Lcom/zykj/paint/exchange/ActionType;->ImageNew:I

    .line 24
    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->getSrc()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor;->sourceUrl:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v4, "/res/"

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, Lcom/zykj/paint/graphic/RectBmp;

    .line 70
    .line 71
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 72
    .line 73
    invoke-direct {v3, v4, v2}, Lcom/zykj/paint/graphic/RectBmp;-><init>(Lcom/zykj/paint/graphic/Map;Landroid/graphics/Bitmap;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iput p1, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 81
    .line 82
    invoke-virtual {v3, v0}, Lcom/zykj/paint/graphic/RectBmp;->setFilePath(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const-string v2, "ActionProcessor"

    .line 98
    .line 99
    new-instance v4, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v5, "add image--->"

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget v5, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 110
    .line 111
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    new-instance v2, Lcom/zykj/paint/data/Vector2D;

    .line 122
    .line 123
    int-to-float p1, p1

    .line 124
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzySize;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    int-to-float v4, v4

    .line 129
    const/high16 v5, 0x3f800000    # 1.0f

    .line 130
    .line 131
    mul-float/2addr v4, v5

    .line 132
    sub-float v4, p1, v4

    .line 133
    .line 134
    const/high16 v6, 0x40000000    # 2.0f

    .line 135
    .line 136
    div-float/2addr v4, v6

    .line 137
    float-to-double v7, v4

    .line 138
    int-to-float v0, v0

    .line 139
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzySize;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    int-to-float v4, v4

    .line 144
    mul-float/2addr v4, v5

    .line 145
    sub-float v4, v0, v4

    .line 146
    .line 147
    div-float/2addr v4, v6

    .line 148
    float-to-double v9, v4

    .line 149
    invoke-direct {v2, v7, v8, v9, v10}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v2}, Lcom/zykj/paint/graphic/RectBmp;->setVector2D(Lcom/zykj/paint/data/Vector2D;)V

    .line 153
    .line 154
    .line 155
    new-instance v2, Lcom/zykj/paint/data/Vector2D;

    .line 156
    .line 157
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzySize;->getWidth()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    int-to-float v4, v4

    .line 162
    mul-float/2addr v4, v5

    .line 163
    add-float/2addr p1, v4

    .line 164
    div-float/2addr p1, v6

    .line 165
    float-to-double v7, p1

    .line 166
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzySize;->getHeight()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    int-to-float p1, p1

    .line 171
    mul-float/2addr p1, v5

    .line 172
    add-float/2addr v0, p1

    .line 173
    div-float/2addr v0, v6

    .line 174
    float-to-double v0, v0

    .line 175
    invoke-direct {v2, v7, v8, v0, v1}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v2}, Lcom/zykj/paint/graphic/RectBmp;->setDstVector(Lcom/zykj/paint/data/Vector2D;)V

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :catch_1
    move-exception p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 195
    .line 196
    .line 197
    :cond_0
    :goto_1
    return-void
.end method

.method public renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewLayerData;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/paint/Actions$NewLayerData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sget v1, Lcom/zykj/paint/exchange/ActionType;->LayerNew:I

    .line 24
    .line 25
    if-ne p1, v1, :cond_0

    .line 26
    .line 27
    new-instance p1, Lcom/zykj/paint/graphic/Layer;

    .line 28
    .line 29
    invoke-direct {p1}, Lcom/zykj/paint/graphic/Layer;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewLayerData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v1, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p1, v0}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lcom/zykj/paint/graphic/Map;->addLayer(Lcom/zykj/paint/graphic/Layer;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-class v1, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    new-array v1, v1, [F

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v2, v3, :cond_0

    .line 31
    .line 32
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/Float;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    aput v3, v1, v2
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const-string p1, "ActionProcessor"

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string/jumbo v2, "\u5730\u56fe\u79fb\u52a8--->>>"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Lcom/zykj/paint/graphic/Map;->setMatrix([F)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    const/4 v2, -0x1

    .line 85
    if-ne v0, v2, :cond_2

    .line 86
    .line 87
    const-string/jumbo v0, "\u5730\u56fe\u79fb\u52a8 \u7ed3\u675f--->>>"

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->updateMatrix()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_2
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v0}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Lcom/zykj/paint/graphic/RectBmp;

    .line 110
    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    iget-object p1, p1, Lcom/zykj/paint/graphic/Graph;->graphMatrix:Landroid/graphics/Matrix;

    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->setValues([F)V
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    .line 117
    .line 118
    :cond_3
    return-void

    .line 119
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public renderPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/zykj/paint/graphic/PolyLine;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 20
    .line 21
    invoke-direct {v2, v3}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v4, v5, v6, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v2, v3}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v2, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 62
    .line 63
    const-string p1, "ActionProcessor"

    .line 64
    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v4, "[add id]-->"

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget v4, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {p1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_0

    .line 92
    .line 93
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 94
    .line 95
    iget-object v0, v0, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v2}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catch_0
    move-exception p1

    .line 106
    goto :goto_2

    .line 107
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 108
    .line 109
    iget-object p1, p1, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 110
    .line 111
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :goto_0
    const/4 p1, 0x0

    .line 117
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-ge p1, v0, :cond_1

    .line 122
    .line 123
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lcom/zykj/paint/Actions$EzyPoint;

    .line 128
    .line 129
    iget-object v3, v2, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 130
    .line 131
    new-instance v4, Lcom/zykj/paint/data/Vector2D;

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 138
    .line 139
    .line 140
    move-result-wide v7

    .line 141
    invoke-direct {v4, v5, v6, v7, v8}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    .line 146
    .line 147
    add-int/lit8 p1, p1, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    return-void

    .line 151
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public renderRunningPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 13

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getDuration()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-class v2, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    div-int/2addr v0, v3

    .line 26
    new-instance v3, Lcom/zykj/paint/graphic/PolyLine;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 29
    .line 30
    invoke-direct {v3, v4}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v5, v6, v7, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3, v4}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    iput-wide v4, v3, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 79
    .line 80
    iget-object v1, v1, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1, v3}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception p1

    .line 91
    goto :goto_3

    .line 92
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->map:Lcom/zykj/paint/graphic/Map;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 95
    .line 96
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :goto_0
    const/4 p1, 0x0

    .line 102
    move v1, p1

    .line 103
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-ge p1, v4, :cond_3

    .line 108
    .line 109
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lcom/zykj/paint/Actions$EzyPoint;

    .line 114
    .line 115
    iget-object v5, v3, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 116
    .line 117
    new-instance v6, Lcom/zykj/paint/data/Vector2D;

    .line 118
    .line 119
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    const/high16 v9, 0x3f800000    # 1.0f

    .line 124
    .line 125
    float-to-double v9, v9

    .line 126
    mul-double/2addr v7, v9

    .line 127
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 128
    .line 129
    .line 130
    move-result-wide v11

    .line 131
    mul-double/2addr v11, v9

    .line 132
    invoke-direct {v6, v7, v8, v11, v12}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    sub-int v4, p1, v1

    .line 139
    .line 140
    mul-int/2addr v4, v0

    .line 141
    int-to-long v4, v4

    .line 142
    const-wide/16 v6, 0x28

    .line 143
    .line 144
    cmp-long v4, v4, v6

    .line 145
    .line 146
    if-ltz v4, :cond_1

    .line 147
    .line 148
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 149
    .line 150
    invoke-virtual {v1}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 151
    .line 152
    .line 153
    move v1, p1

    .line 154
    goto :goto_2

    .line 155
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    add-int/lit8 v4, v4, -0x1

    .line 160
    .line 161
    if-ne p1, v4, :cond_2

    .line 162
    .line 163
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 164
    .line 165
    invoke-virtual {v4}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    .line 167
    .line 168
    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    return-void

    .line 172
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/runner/ActionProcessor;->isRunning:Z

    .line 3
    .line 4
    return-void
.end method

.method public setSourceUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->sourceUrl:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/zykj/paint/runner/ActionProcessor;->isRunning:Z

    .line 5
    .line 6
    return-void
.end method
