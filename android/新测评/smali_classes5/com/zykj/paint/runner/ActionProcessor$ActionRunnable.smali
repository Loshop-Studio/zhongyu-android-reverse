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
    const-string v4, "\u540d\u79f0\u4e3a["

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v4, "] actionType=["

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v4, "]id=["

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v4, "]"

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const-string v4, "ActionProcessor"

    .line 77
    .line 78
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 82
    .line 83
    if-ne v1, v3, :cond_1

    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 86
    .line 87
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v0

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
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_1
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 111
    .line 112
    if-eq v1, v3, :cond_7

    .line 113
    .line 114
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 115
    .line 116
    if-eq v1, v3, :cond_7

    .line 117
    .line 118
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 119
    .line 120
    if-eq v1, v3, :cond_7

    .line 121
    .line 122
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 123
    .line 124
    if-eq v1, v3, :cond_7

    .line 125
    .line 126
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 127
    .line 128
    if-eq v1, v3, :cond_7

    .line 129
    .line 130
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 131
    .line 132
    if-ne v1, v3, :cond_2

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_6

    .line 140
    .line 141
    const-string v1, "/"

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const/4 v1, 0x1

    .line 148
    aget-object v0, v0, v1

    .line 149
    .line 150
    const-string v1, "NewPolylineData"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_3

    .line 157
    .line 158
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 159
    .line 160
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderRunningPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_3
    const-string v1, "NewLayerData"

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_4

    .line 173
    .line 174
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 175
    .line 176
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 182
    .line 183
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_4
    const-string v1, "NewImageData"

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_5

    .line 198
    .line 199
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 200
    .line 201
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderImage(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 207
    .line 208
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_5
    const-string v1, "EzyMatrixData"

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_6

    .line 223
    .line 224
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 225
    .line 226
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 232
    .line 233
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 238
    .line 239
    .line 240
    :cond_6
    :goto_0
    return-void

    .line 241
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 242
    .line 243
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0, v2}, Lcom/zykj/paint/graphic/Map;->hide(I)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 251
    .line 252
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 257
    .line 258
    .line 259
    return-void
.end method
