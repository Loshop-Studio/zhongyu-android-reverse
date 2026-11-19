.class public final Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/widgets/TextureDrawView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PaintThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/widgets/TextureDrawView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/widgets/TextureDrawView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getMIsDrawing$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$isLocked$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_6

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$isRend$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_6

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$isVisibility$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_6

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-static {v0, v1}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$setLocked$p(Lcom/zykj/sketch/widgets/TextureDrawView;Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getMSurface$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/view/Surface;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v2, 0x0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    iget-object v3, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 52
    .line 53
    monitor-enter v0

    .line 54
    :try_start_0
    new-instance v4, Landroid/graphics/Rect;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-direct {v4, v2, v2, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v4}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempPaint$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Paint;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    const-string v5, "lockCanvas"

    .line 79
    .line 80
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 81
    .line 82
    .line 83
    :try_start_1
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getBackgroundId$p(Lcom/zykj/sketch/widgets/TextureDrawView;)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eqz v5, :cond_0

    .line 95
    .line 96
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-eqz v5, :cond_1

    .line 101
    .line 102
    invoke-virtual {v5}, Landroid/graphics/RectF;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-ne v5, v1, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catchall_0
    move-exception v1

    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    :cond_0
    :goto_0
    new-instance v1, Landroid/graphics/RectF;

    .line 113
    .line 114
    invoke-virtual {v4}, Landroid/graphics/Canvas;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    int-to-float v5, v5

    .line 119
    invoke-virtual {v4}, Landroid/graphics/Canvas;->getHeight()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    int-to-float v6, v6

    .line 124
    const/4 v7, 0x0

    .line 125
    invoke-direct {v1, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 126
    .line 127
    .line 128
    invoke-static {v3, v1}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$setPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;Landroid/graphics/RectF;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getGraph$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Lcom/zykj/sketch/core/graph/Graph;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    if-nez v5, :cond_2

    .line 142
    .line 143
    invoke-virtual {v1, v4}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 144
    .line 145
    .line 146
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    if-eqz v5, :cond_4

    .line 154
    .line 155
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    .line 160
    .line 161
    .line 162
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 171
    .line 172
    .line 173
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-interface {v6}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 186
    .line 187
    .line 188
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_3

    .line 205
    .line 206
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-virtual {v5, v6}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_3

    .line 219
    .line 220
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRenderRectPaint$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Paint;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v4}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 239
    .line 240
    .line 241
    :cond_3
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 242
    .line 243
    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {v0, v4}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :catchall_1
    move-exception v1

    .line 248
    goto :goto_4

    .line 249
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 250
    .line 251
    .line 252
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :goto_3
    monitor-exit v0

    .line 256
    goto :goto_5

    .line 257
    :catchall_2
    move-exception v1

    .line 258
    :try_start_4
    invoke-virtual {v0, v4}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 259
    .line 260
    .line 261
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 262
    :goto_4
    monitor-exit v0

    .line 263
    throw v1

    .line 264
    :cond_5
    :goto_5
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 265
    .line 266
    invoke-static {v0, v2}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$setLocked$p(Lcom/zykj/sketch/widgets/TextureDrawView;Z)V

    .line 267
    .line 268
    .line 269
    :cond_6
    return-void
.end method
