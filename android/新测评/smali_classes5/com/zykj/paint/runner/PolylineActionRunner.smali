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
    iget-object v2, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    new-instance v2, Lcom/zykj/paint/graphic/PolyLine;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 30
    .line 31
    invoke-direct {v2, v3}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v4, v5, v6, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v2, v3}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    iput-wide v3, v2, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 72
    .line 73
    const-string p1, "ActionRunner"

    .line 74
    .line 75
    new-instance v3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v4, "[add id]-->"

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget v4, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {p1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 104
    .line 105
    iget-object v0, v0, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1, v2}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catch_0
    move-exception p1

    .line 116
    goto :goto_2

    .line 117
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 118
    .line 119
    iget-object p1, p1, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 120
    .line 121
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    :goto_0
    const/4 p1, 0x0

    .line 127
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-ge p1, v0, :cond_1

    .line 132
    .line 133
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lcom/zykj/paint/Actions$EzyPoint;

    .line 138
    .line 139
    iget-object v3, v2, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 140
    .line 141
    new-instance v4, Lcom/zykj/paint/data/Vector2D;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    const/high16 v7, 0x3f800000    # 1.0f

    .line 148
    .line 149
    float-to-double v7, v7

    .line 150
    mul-double/2addr v5, v7

    .line 151
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 152
    .line 153
    .line 154
    move-result-wide v9

    .line 155
    mul-double/2addr v9, v7

    .line 156
    invoke-direct {v4, v5, v6, v9, v10}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    add-int/lit8 p1, p1, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_1
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 172
    .line 173
    .line 174
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
