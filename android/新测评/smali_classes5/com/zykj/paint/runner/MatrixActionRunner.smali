.class public Lcom/zykj/paint/runner/MatrixActionRunner;
.super Lcom/zykj/paint/runner/ActionRunner;
.source "SourceFile"


# instance fields
.field private graphId:I


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/MapViewer;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/runner/ActionRunner;-><init>(Lcom/zykj/paint/render/MapViewer;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/zykj/paint/runner/MatrixActionRunner;->graphId:I

    .line 5
    .line 6
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
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData;->getValuesList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/16 v0, 0x9

    .line 18
    .line 19
    new-array v0, v0, [F

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Float;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    aput v2, v0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_0
    iget p1, p0, Lcom/zykj/paint/runner/MatrixActionRunner;->graphId:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    const-string v1, "ActionRunner"

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v2, "\u5730\u56fe\u79fb\u52a8--->>>"

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lcom/zykj/paint/graphic/Map;->setMatrix([F)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/4 v2, -0x1

    .line 82
    if-ne p1, v2, :cond_2

    .line 83
    .line 84
    const-string p1, "\u5730\u56fe\u79fb\u52a8 \u7ed3\u675f--->>>"

    .line 85
    .line 86
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->updateMatrix()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 96
    .line 97
    iget-object p1, p1, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget v1, p0, Lcom/zykj/paint/runner/MatrixActionRunner;->graphId:I

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

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
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 116
    .line 117
    .line 118
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
