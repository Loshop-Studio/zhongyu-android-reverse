.class public Lcom/zykj/paint/runner/PolylineActionRunner;
.super Lcom/zykj/paint/runner/ActionRunner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;
    }
.end annotation


# static fields
.field private static final FRAME_TIME:J = 0x28L


# instance fields
.field private isImmediate:Z

.field private schedule:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/MapViewer;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/runner/ActionRunner;-><init>(Lcom/zykj/paint/render/MapViewer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private processPreActions(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 11

    .line 1
    const-string v0, "[add id]-->"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    new-instance v3, Lcom/zykj/paint/graphic/PolyLine;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 32
    .line 33
    invoke-direct {v3, v4}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {v5, v6, v7, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {v3, v4}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    iput-wide v4, v3, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iput p1, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 74
    .line 75
    const-string p1, "ActionRunner"

    .line 76
    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget v0, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_0

    .line 99
    .line 100
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 101
    .line 102
    iget-object v0, v0, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1, v3}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catch_0
    move-exception p1

    .line 113
    goto :goto_2

    .line 114
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 115
    .line 116
    iget-object p1, p1, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 117
    .line 118
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :goto_0
    const/4 p1, 0x0

    .line 124
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-ge p1, v0, :cond_1

    .line 129
    .line 130
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lcom/zykj/paint/Actions$EzyPoint;

    .line 135
    .line 136
    iget-object v1, v3, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 137
    .line 138
    new-instance v4, Lcom/zykj/paint/data/Vector2D;

    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    const/high16 v7, 0x3f800000    # 1.0f

    .line 145
    .line 146
    float-to-double v7, v7

    .line 147
    mul-double/2addr v5, v7

    .line 148
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 149
    .line 150
    .line 151
    move-result-wide v9

    .line 152
    mul-double/2addr v9, v7

    .line 153
    invoke-direct {v4, v5, v6, v9, v10}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    add-int/lit8 p1, p1, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 169
    .line 170
    .line 171
    return-void
.end method


# virtual methods
.method public getTaskScheduledExecutorService()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public isImmediate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->isImmediate:Z

    .line 2
    .line 3
    return v0
.end method

.method public pause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->schedule:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 0

    return-void
.end method

.method public run(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->isImmediate:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/zykj/paint/runner/PolylineActionRunner;->processPreActions(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1}, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;-><init>(Lcom/zykj/paint/runner/PolylineActionRunner;Lcom/zykj/paint/Actions$EzyAction;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    invoke-interface {v0, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->schedule:Ljava/util/concurrent/ScheduledFuture;

    .line 25
    .line 26
    return-void
.end method

.method public setImmediate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->isImmediate:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTaskScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner;->taskScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
