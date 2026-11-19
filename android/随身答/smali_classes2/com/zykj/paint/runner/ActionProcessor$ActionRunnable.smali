.class public Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;
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
    name = "ActionRunnable"
.end annotation


# instance fields
.field ezyAction:Lcom/zykj/paint/Actions$EzyAction;

.field final synthetic this$0:Lcom/zykj/paint/runner/ActionProcessor;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/runner/ActionProcessor;Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

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
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string/jumbo v4, "\u540d\u79f0\u4e3a["

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v4, "] actionType=["

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v4, "]id=["

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v4, "]"

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const-string v4, "ActionProcessor"

    .line 78
    .line 79
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 83
    .line 84
    if-ne v1, v3, :cond_1

    .line 85
    .line 86
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 87
    .line 88
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v0, v0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 102
    .line 103
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_1
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 112
    .line 113
    if-eq v1, v3, :cond_7

    .line 114
    .line 115
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 116
    .line 117
    if-eq v1, v3, :cond_7

    .line 118
    .line 119
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 120
    .line 121
    if-eq v1, v3, :cond_7

    .line 122
    .line 123
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 124
    .line 125
    if-eq v1, v3, :cond_7

    .line 126
    .line 127
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 128
    .line 129
    if-eq v1, v3, :cond_7

    .line 130
    .line 131
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 132
    .line 133
    if-ne v1, v3, :cond_2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_6

    .line 141
    .line 142
    const-string v1, "/"

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const/4 v1, 0x1

    .line 149
    aget-object v0, v0, v1

    .line 150
    .line 151
    const-string v1, "NewPolylineData"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_3

    .line 158
    .line 159
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 160
    .line 161
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderRunningPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_3
    const-string v1, "NewLayerData"

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_4

    .line 174
    .line 175
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 176
    .line 177
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 183
    .line 184
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_4
    const-string v1, "NewImageData"

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_5

    .line 199
    .line 200
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 201
    .line 202
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderImage(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 208
    .line 209
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_5
    const-string v1, "EzyMatrixData"

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_6

    .line 224
    .line 225
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 226
    .line 227
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 230
    .line 231
    .line 232
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 233
    .line 234
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 239
    .line 240
    .line 241
    :cond_6
    :goto_0
    return-void

    .line 242
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 243
    .line 244
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0, v2}, Lcom/zykj/paint/graphic/Map;->hide(I)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 252
    .line 253
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 258
    .line 259
    .line 260
    return-void
.end method
