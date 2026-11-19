.class public Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/runner/PolylineActionRunner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TaskRunnable"
.end annotation


# instance fields
.field ezyAction:Lcom/zykj/paint/Actions$EzyAction;

.field final synthetic this$0:Lcom/zykj/paint/runner/PolylineActionRunner;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/runner/PolylineActionRunner;Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 1
    const-string v0, "ActionRunner"

    .line 2
    .line 3
    const-string v1, "[graph.graphs.size()]-->"

    .line 4
    .line 5
    const-string v2, "[run ezyAction]-->"

    .line 6
    .line 7
    :try_start_0
    iget-object v3, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyAction;->getDuration()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object v4, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 14
    .line 15
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-class v5, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 26
    .line 27
    new-instance v5, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    div-int/2addr v3, v5

    .line 57
    iget-object v5, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 58
    .line 59
    iget-object v5, v5, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 60
    .line 61
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 65
    .line 66
    iget-object v5, v5, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    new-instance v5, Lcom/zykj/paint/graphic/PolyLine;

    .line 72
    .line 73
    iget-object v6, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 74
    .line 75
    iget-object v6, v6, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 76
    .line 77
    invoke-direct {v5, v6}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v6}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    invoke-virtual {v6}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-virtual {v6}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    invoke-virtual {v6}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-static {v7, v8, v9, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-virtual {v5, v6}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    iput-wide v6, v5, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 112
    .line 113
    iget-object v6, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 114
    .line 115
    invoke-virtual {v6}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    iput v6, v5, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 120
    .line 121
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_0

    .line 126
    .line 127
    iget-object v6, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 128
    .line 129
    iget-object v6, v6, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 130
    .line 131
    iget-object v6, v6, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 132
    .line 133
    invoke-virtual {v6, v4}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v4, v5}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 138
    .line 139
    .line 140
    new-instance v6, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v4, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :catch_0
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :catch_1
    move-exception v0

    .line 165
    goto :goto_4

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 167
    .line 168
    iget-object v0, v0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 169
    .line 170
    iget-object v0, v0, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 171
    .line 172
    iget-object v0, v0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :goto_0
    const/4 v0, 0x0

    .line 178
    move v1, v0

    .line 179
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-ge v0, v4, :cond_3

    .line 184
    .line 185
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, Lcom/zykj/paint/Actions$EzyPoint;

    .line 190
    .line 191
    iget-object v6, v5, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 192
    .line 193
    new-instance v7, Lcom/zykj/paint/data/Vector2D;

    .line 194
    .line 195
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 196
    .line 197
    .line 198
    move-result-wide v8

    .line 199
    const/high16 v10, 0x3f800000    # 1.0f

    .line 200
    .line 201
    float-to-double v10, v10

    .line 202
    mul-double/2addr v8, v10

    .line 203
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 204
    .line 205
    .line 206
    move-result-wide v12

    .line 207
    mul-double/2addr v12, v10

    .line 208
    invoke-direct {v7, v8, v9, v12, v13}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    sub-int v4, v0, v1

    .line 215
    .line 216
    mul-int/2addr v4, v3

    .line 217
    int-to-long v6, v4

    .line 218
    const-wide/16 v8, 0x28

    .line 219
    .line 220
    cmp-long v4, v6, v8

    .line 221
    .line 222
    if-ltz v4, :cond_1

    .line 223
    .line 224
    iget-object v1, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 225
    .line 226
    iget-object v1, v1, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V

    .line 229
    .line 230
    .line 231
    move v1, v0

    .line 232
    goto :goto_2

    .line 233
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    add-int/lit8 v4, v4, -0x1

    .line 238
    .line 239
    if-ne v0, v4, :cond_2

    .line 240
    .line 241
    iget-object v4, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 242
    .line 243
    iget-object v4, v4, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 244
    .line 245
    invoke-virtual {v4}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V

    .line 246
    .line 247
    .line 248
    :cond_2
    :goto_2
    int-to-long v6, v3

    .line 249
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 250
    .line 251
    .line 252
    add-int/lit8 v0, v0, 0x1

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 260
    .line 261
    .line 262
    :cond_3
    :goto_5
    return-void
.end method
