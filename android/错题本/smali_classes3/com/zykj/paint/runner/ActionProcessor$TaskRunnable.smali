.class public Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/runner/ActionProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TaskRunnable"
.end annotation


# instance fields
.field ezyAction:Lcom/zykj/paint/Actions$EzyAction;

.field final synthetic this$0:Lcom/zykj/paint/runner/ActionProcessor;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/runner/ActionProcessor;Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$000(Lcom/zykj/paint/runner/ActionProcessor;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getDuration()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-class v2, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    div-int/2addr v0, v3

    .line 40
    new-instance v3, Lcom/zykj/paint/graphic/PolyLine;

    .line 41
    .line 42
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 43
    .line 44
    invoke-static {v4}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-direct {v3, v4}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v5, v6, v7, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {v3, v4}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    iput-wide v4, v3, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 83
    .line 84
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    iput v4, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 99
    .line 100
    invoke-static {v4}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iget-object v4, v4, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 105
    .line 106
    invoke-virtual {v4, v1}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1, v3}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catch_0
    move-exception v0

    .line 115
    goto :goto_4

    .line 116
    :cond_1
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 117
    .line 118
    invoke-static {v1}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v1, v1, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 123
    .line 124
    iget-object v1, v1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :goto_0
    const/4 v1, 0x0

    .line 130
    move v4, v1

    .line 131
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-ge v1, v5, :cond_4

    .line 136
    .line 137
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Lcom/zykj/paint/Actions$EzyPoint;

    .line 142
    .line 143
    iget-object v6, v3, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 144
    .line 145
    new-instance v7, Lcom/zykj/paint/data/Vector2D;

    .line 146
    .line 147
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 148
    .line 149
    .line 150
    move-result-wide v8

    .line 151
    const/high16 v10, 0x3f800000    # 1.0f

    .line 152
    .line 153
    float-to-double v10, v10

    .line 154
    mul-double/2addr v8, v10

    .line 155
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 156
    .line 157
    .line 158
    move-result-wide v12

    .line 159
    mul-double/2addr v12, v10

    .line 160
    invoke-direct {v7, v8, v9, v12, v13}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    sub-int v5, v1, v4

    .line 167
    .line 168
    mul-int/2addr v5, v0

    .line 169
    int-to-long v5, v5

    .line 170
    const-wide/16 v7, 0x28

    .line 171
    .line 172
    cmp-long v5, v5, v7

    .line 173
    .line 174
    if-ltz v5, :cond_2

    .line 175
    .line 176
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 177
    .line 178
    invoke-static {v4}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 183
    .line 184
    .line 185
    move v4, v1

    .line 186
    goto :goto_2

    .line 187
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    add-int/lit8 v5, v5, -0x1

    .line 192
    .line 193
    if-ne v1, v5, :cond_3

    .line 194
    .line 195
    iget-object v5, p0, Lcom/zykj/paint/runner/ActionProcessor$TaskRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 196
    .line 197
    invoke-static {v5}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    .line 203
    .line 204
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_4
    :goto_3
    return-void

    .line 208
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 209
    .line 210
    .line 211
    return-void
.end method
