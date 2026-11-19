.class public Lcom/zykj/paint/runner/ZoomActionRunner;
.super Lcom/zykj/paint/runner/ActionRunner;
.source "SourceFile"


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


# virtual methods
.method public pause()V
    .locals 0

    return-void
.end method

.method public resume()V
    .locals 0

    return-void
.end method

.method public run(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lcom/zykj/paint/Actions$ZoomGraphData;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/paint/Actions$ZoomGraphData;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$ZoomGraphData;->getScale()D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 18
    .line 19
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 20
    .line 21
    add-double/2addr v0, v2

    .line 22
    invoke-virtual {p1, v0, v1, v0, v1}, Lcom/zykj/paint/render/MapViewer;->scaleViewPort(DD)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
