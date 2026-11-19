.class public Lcom/zykj/paint/render/SketchViewer$e;
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
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

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
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->b(Lcom/zykj/paint/render/SketchViewer;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->c(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

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
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-gt v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 28
    .line 29
    new-instance v1, Lcom/zykj/paint/render/SketchViewer$e$a;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchViewer$e$a;-><init>(Lcom/zykj/paint/render/SketchViewer$e;)V

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
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    iget-object v4, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 45
    .line 46
    invoke-static {v4}, Lcom/zykj/paint/render/SketchViewer;->m(Lcom/zykj/paint/render/SketchViewer;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    sub-long/2addr v2, v4

    .line 51
    invoke-static {v1, v2, v3}, Lcom/zykj/paint/render/SketchViewer;->l(Lcom/zykj/paint/render/SketchViewer;J)J

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 55
    .line 56
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 61
    .line 62
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

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
    iget-object v5, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 73
    .line 74
    invoke-static {v5}, Lcom/zykj/paint/render/SketchViewer;->c(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

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
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyAction;->n()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 89
    .line 90
    invoke-static {v6}, Lcom/zykj/paint/render/SketchViewer;->k(Lcom/zykj/paint/render/SketchViewer;)J

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
    const-string v6, "timeRecord=["

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 110
    .line 111
    invoke-static {v6}, Lcom/zykj/paint/render/SketchViewer;->k(Lcom/zykj/paint/render/SketchViewer;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v6, "]---->>>>>\u8bfb\u53d6\u7b2c["

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 124
    .line 125
    invoke-static {v6}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 143
    .line 144
    invoke-static {v3}, Lcom/zykj/paint/render/SketchViewer;->f(Lcom/zykj/paint/render/SketchViewer;)I

    .line 145
    .line 146
    .line 147
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 151
    .line 152
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-le v0, v1, :cond_3

    .line 157
    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v2, "---->>>>>\u672c\u6b21\u5171\u8bfb\u53d6["

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 169
    .line 170
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    sub-int/2addr v2, v1

    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 189
    .line 190
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->n(Lcom/zykj/paint/render/SketchViewer;)Li4/a;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 195
    .line 196
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->c(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 201
    .line 202
    invoke-static {v3}, Lcom/zykj/paint/render/SketchViewer;->e(Lcom/zykj/paint/render/SketchViewer;)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-interface {v2, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v0, v1}, Li4/a;->b(Ljava/util/List;)V

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 214
    .line 215
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->o(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    const-wide/16 v2, 0x0

    .line 220
    .line 221
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 222
    .line 223
    invoke-interface {v1, p0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {v0, v1}, Lcom/zykj/paint/render/SketchViewer;->h(Lcom/zykj/paint/render/SketchViewer;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_3
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 232
    .line 233
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->o(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const-wide/16 v2, 0x28

    .line 238
    .line 239
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 240
    .line 241
    invoke-interface {v1, p0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v0, v1}, Lcom/zykj/paint/render/SketchViewer;->h(Lcom/zykj/paint/render/SketchViewer;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 246
    .line 247
    .line 248
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 249
    .line 250
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->i(Lcom/zykj/paint/render/SketchViewer;)Lg4/a;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_4

    .line 255
    .line 256
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 257
    .line 258
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->i(Lcom/zykj/paint/render/SketchViewer;)Lg4/a;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$e;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 263
    .line 264
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->k(Lcom/zykj/paint/render/SketchViewer;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    invoke-interface {v0, v1, v2}, Lg4/a;->a(J)V

    .line 269
    .line 270
    .line 271
    :cond_4
    return-void
.end method
