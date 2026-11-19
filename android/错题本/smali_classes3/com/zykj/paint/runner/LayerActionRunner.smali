.class public Lcom/zykj/paint/runner/LayerActionRunner;
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
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 60
    .line 61
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, v1, v2}, Lcom/zykj/paint/render/MapViewer;->scaleViewPort(DD)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lcom/zykj/paint/graphic/Map;->addLayer(Lcom/zykj/paint/graphic/Layer;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/paint/render/MapViewer;->renderAll()V

    .line 74
    .line 75
    .line 76
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
