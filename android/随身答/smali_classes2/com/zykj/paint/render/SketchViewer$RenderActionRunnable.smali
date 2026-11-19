.class public Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/render/SketchViewer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RenderActionRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$000(Lcom/zykj/paint/render/SketchViewer;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$100(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-gt v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 28
    .line 29
    new-instance v1, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;-><init>(Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    iget-object v4, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 45
    .line 46
    invoke-static {v4}, Lcom/zykj/paint/render/SketchViewer;->access$700(Lcom/zykj/paint/render/SketchViewer;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    sub-long/2addr v2, v4

    .line 51
    invoke-static {v1, v2, v3}, Lcom/zykj/paint/render/SketchViewer;->access$602(Lcom/zykj/paint/render/SketchViewer;J)J

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 55
    .line 56
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 61
    .line 62
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :goto_0
    const-string v3, "]\u6761\u6307\u4ee4"

    .line 67
    .line 68
    const-string v4, "SketchViewer"

    .line 69
    .line 70
    if-ge v2, v0, :cond_2

    .line 71
    .line 72
    iget-object v5, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 73
    .line 74
    invoke-static {v5}, Lcom/zykj/paint/render/SketchViewer;->access$100(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Lcom/zykj/paint/Actions$EzyAction;

    .line 83
    .line 84
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 89
    .line 90
    invoke-static {v6}, Lcom/zykj/paint/render/SketchViewer;->access$600(Lcom/zykj/paint/render/SketchViewer;)J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    int-to-long v8, v5

    .line 95
    cmp-long v5, v6, v8

    .line 96
    .line 97
    if-ltz v5, :cond_1

    .line 98
    .line 99
    new-instance v5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string/jumbo v6, "timeRecord=["

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 111
    .line 112
    invoke-static {v6}, Lcom/zykj/paint/render/SketchViewer;->access$600(Lcom/zykj/paint/render/SketchViewer;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v6

    .line 116
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v6, "]---->>>>>\u8bfb\u53d6\u7b2c["

    .line 120
    .line 121
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 125
    .line 126
    invoke-static {v6}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 144
    .line 145
    invoke-static {v3}, Lcom/zykj/paint/render/SketchViewer;->access$208(Lcom/zykj/paint/render/SketchViewer;)I

    .line 146
    .line 147
    .line 148
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_2
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 152
    .line 153
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-le v0, v1, :cond_3

    .line 158
    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v2, "---->>>>>\u672c\u6b21\u5171\u8bfb\u53d6["

    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 170
    .line 171
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    sub-int/2addr v2, v1

    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 190
    .line 191
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$800(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/runner/ActionProcessor;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 196
    .line 197
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->access$100(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 202
    .line 203
    invoke-static {v3}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-interface {v2, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderAction(Ljava/util/List;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 215
    .line 216
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$900(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-wide/16 v2, 0x0

    .line 221
    .line 222
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 223
    .line 224
    invoke-interface {v1, p0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v0, v1}, Lcom/zykj/paint/render/SketchViewer;->access$302(Lcom/zykj/paint/render/SketchViewer;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_3
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 233
    .line 234
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$900(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    const-wide/16 v2, 0x28

    .line 239
    .line 240
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 241
    .line 242
    invoke-interface {v1, p0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {v0, v1}, Lcom/zykj/paint/render/SketchViewer;->access$302(Lcom/zykj/paint/render/SketchViewer;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 247
    .line 248
    .line 249
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 250
    .line 251
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-eqz v0, :cond_4

    .line 256
    .line 257
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 258
    .line 259
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 264
    .line 265
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$600(Lcom/zykj/paint/render/SketchViewer;)J

    .line 266
    .line 267
    .line 268
    move-result-wide v1

    .line 269
    invoke-interface {v0, v1, v2}, Lcom/zykj/paint/player/PlayStatusListener;->onUpdate(J)V

    .line 270
    .line 271
    .line 272
    :cond_4
    return-void
.end method
