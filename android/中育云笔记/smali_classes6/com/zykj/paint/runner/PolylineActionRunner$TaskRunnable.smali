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
    :try_start_0
    iget-object v1, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyAction;->getDuration()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v4, "[run ezyAction]-->"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsList()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    div-int/2addr v1, v4

    .line 58
    iget-object v4, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 59
    .line 60
    iget-object v4, v4, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 63
    .line 64
    .line 65
    iget-object v4, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 66
    .line 67
    iget-object v4, v4, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 68
    .line 69
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    new-instance v4, Lcom/zykj/paint/graphic/PolyLine;

    .line 73
    .line 74
    iget-object v5, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 75
    .line 76
    iget-object v5, v5, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 77
    .line 78
    invoke-direct {v4, v5}, Lcom/zykj/paint/graphic/PolyLine;-><init>(Lcom/zykj/paint/graphic/Map;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    invoke-static {v6, v7, v8, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-virtual {v4, v5}, Lcom/zykj/paint/graphic/Graph;->setBaseColor(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    .line 109
    .line 110
    .line 111
    move-result-wide v5

    .line 112
    iput-wide v5, v4, Lcom/zykj/paint/graphic/PolyLine;->width:D

    .line 113
    .line 114
    iget-object v5, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 115
    .line 116
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    iput v5, v4, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_0

    .line 127
    .line 128
    iget-object v5, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 129
    .line 130
    iget-object v5, v5, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 131
    .line 132
    iget-object v5, v5, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 133
    .line 134
    invoke-virtual {v5, v2}, Lcom/zykj/paint/graphic/Layer;->findGraph(I)Lcom/zykj/paint/graphic/Graph;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2, v4}, Lcom/zykj/paint/graphic/Graph;->addGraph(Lcom/zykj/paint/graphic/Graph;)V

    .line 139
    .line 140
    .line 141
    new-instance v5, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v6, "[graph.graphs.size()]-->"

    .line 147
    .line 148
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v2, v2, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :catch_0
    move-exception v0

    .line 169
    goto :goto_3

    .line 170
    :catch_1
    move-exception v0

    .line 171
    goto :goto_4

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 173
    .line 174
    iget-object v0, v0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 175
    .line 176
    iget-object v0, v0, Lcom/zykj/paint/graphic/Map;->currentLayer:Lcom/zykj/paint/graphic/Layer;

    .line 177
    .line 178
    iget-object v0, v0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :goto_0
    const/4 v0, 0x0

    .line 184
    move v2, v0

    .line 185
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-ge v0, v5, :cond_3

    .line 190
    .line 191
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Lcom/zykj/paint/Actions$EzyPoint;

    .line 196
    .line 197
    iget-object v6, v4, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 198
    .line 199
    new-instance v7, Lcom/zykj/paint/data/Vector2D;

    .line 200
    .line 201
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 202
    .line 203
    .line 204
    move-result-wide v8

    .line 205
    const/high16 v10, 0x3f800000    # 1.0f

    .line 206
    .line 207
    float-to-double v10, v10

    .line 208
    mul-double/2addr v8, v10

    .line 209
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 210
    .line 211
    .line 212
    move-result-wide v12

    .line 213
    mul-double/2addr v12, v10

    .line 214
    invoke-direct {v7, v8, v9, v12, v13}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    sub-int v5, v0, v2

    .line 221
    .line 222
    mul-int/2addr v5, v1

    .line 223
    int-to-long v5, v5

    .line 224
    const-wide/16 v7, 0x28

    .line 225
    .line 226
    cmp-long v5, v5, v7

    .line 227
    .line 228
    if-ltz v5, :cond_1

    .line 229
    .line 230
    iget-object v2, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 231
    .line 232
    iget-object v2, v2, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 233
    .line 234
    invoke-virtual {v2}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V

    .line 235
    .line 236
    .line 237
    move v2, v0

    .line 238
    goto :goto_2

    .line 239
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    add-int/lit8 v5, v5, -0x1

    .line 244
    .line 245
    if-ne v0, v5, :cond_2

    .line 246
    .line 247
    iget-object v5, p0, Lcom/zykj/paint/runner/PolylineActionRunner$TaskRunnable;->this$0:Lcom/zykj/paint/runner/PolylineActionRunner;

    .line 248
    .line 249
    iget-object v5, v5, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 250
    .line 251
    invoke-virtual {v5}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V

    .line 252
    .line 253
    .line 254
    :cond_2
    :goto_2
    int-to-long v5, v1

    .line 255
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    .line 257
    .line 258
    add-int/lit8 v0, v0, 0x1

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 266
    .line 267
    .line 268
    :cond_3
    :goto_5
    return-void
.end method
