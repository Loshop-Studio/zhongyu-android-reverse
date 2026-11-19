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
    const-string v4, "\u540d\u79f0\u4e3a["

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v4, "] actionType=["

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v4, "]id=["

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v4, "]"

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const-string v4, "ActionProcessor"

    .line 74
    .line 75
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 79
    .line 80
    if-ne v1, v3, :cond_1

    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 83
    .line 84
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v0, v0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 98
    .line 99
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_1
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 108
    .line 109
    if-eq v1, v3, :cond_7

    .line 110
    .line 111
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 112
    .line 113
    if-eq v1, v3, :cond_7

    .line 114
    .line 115
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 116
    .line 117
    if-eq v1, v3, :cond_7

    .line 118
    .line 119
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 120
    .line 121
    if-eq v1, v3, :cond_7

    .line 122
    .line 123
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 124
    .line 125
    if-eq v1, v3, :cond_7

    .line 126
    .line 127
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 128
    .line 129
    if-ne v1, v3, :cond_2

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_6

    .line 137
    .line 138
    const-string v1, "/"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const/4 v1, 0x1

    .line 145
    aget-object v0, v0, v1

    .line 146
    .line 147
    const-string v1, "NewPolylineData"

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 156
    .line 157
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderRunningPolyLine(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_3
    const-string v1, "NewLayerData"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 172
    .line 173
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderLayer(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 179
    .line 180
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_4
    const-string v1, "NewImageData"

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_5

    .line 195
    .line 196
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 197
    .line 198
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderImage(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 204
    .line 205
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_5
    const-string v1, "EzyMatrixData"

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_6

    .line 220
    .line 221
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 222
    .line 223
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->ezyAction:Lcom/zykj/paint/Actions$EzyAction;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderMatrix(Lcom/zykj/paint/Actions$EzyAction;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 229
    .line 230
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 235
    .line 236
    .line 237
    :cond_6
    :goto_0
    return-void

    .line 238
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 239
    .line 240
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$100(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/graphic/Map;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0, v2}, Lcom/zykj/paint/graphic/Map;->hide(I)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionProcessor$ActionRunnable;->this$0:Lcom/zykj/paint/runner/ActionProcessor;

    .line 248
    .line 249
    invoke-static {v0}, Lcom/zykj/paint/runner/ActionProcessor;->access$200(Lcom/zykj/paint/runner/ActionProcessor;)Lcom/zykj/paint/render/SketchViewer;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 254
    .line 255
    .line 256
    return-void
.end method
