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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;",
        "Ljava/lang/Thread;",
        "<init>",
        "(Lcom/zykj/sketch/widgets/TextureDrawView;)V",
        "Ld6/s;",
        "run",
        "()V",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
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
    if-eqz v0, :cond_5

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
    if-nez v0, :cond_5

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
    if-eqz v0, :cond_5

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
    if-eqz v0, :cond_5

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
    if-eqz v0, :cond_4

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
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 76
    .line 77
    .line 78
    :try_start_1
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getBackgroundId$p(Lcom/zykj/sketch/widgets/TextureDrawView;)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-eqz v5, :cond_0

    .line 90
    .line 91
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    if-eqz v5, :cond_1

    .line 96
    .line 97
    invoke-virtual {v5}, Landroid/graphics/RectF;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-ne v5, v1, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v1

    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :cond_0
    :goto_0
    new-instance v1, Landroid/graphics/RectF;

    .line 108
    .line 109
    invoke-virtual {v4}, Landroid/graphics/Canvas;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    int-to-float v5, v5

    .line 114
    invoke-virtual {v4}, Landroid/graphics/Canvas;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    int-to-float v6, v6

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-direct {v1, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 121
    .line 122
    .line 123
    invoke-static {v3, v1}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$setPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;Landroid/graphics/RectF;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getGraph$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Lcom/zykj/sketch/core/graph/Graph;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-nez v5, :cond_2

    .line 137
    .line 138
    invoke-virtual {v1, v4}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_2
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    if-eqz v5, :cond_3

    .line 147
    .line 148
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    .line 153
    .line 154
    .line 155
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 164
    .line 165
    .line 166
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-interface {v6}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 179
    .line 180
    .line 181
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_3

    .line 198
    .line 199
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-virtual {v5, v6}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_3

    .line 212
    .line 213
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRenderRectPaint$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Paint;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v3}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v4}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 232
    .line 233
    .line 234
    :cond_3
    :goto_1
    :try_start_2
    invoke-virtual {v0, v4}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :catchall_1
    move-exception v1

    .line 239
    goto :goto_4

    .line 240
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :goto_3
    monitor-exit v0

    .line 245
    goto :goto_5

    .line 246
    :catchall_2
    move-exception v1

    .line 247
    :try_start_4
    invoke-virtual {v0, v4}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 248
    .line 249
    .line 250
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 251
    :goto_4
    monitor-exit v0

    .line 252
    throw v1

    .line 253
    :cond_4
    :goto_5
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 254
    .line 255
    invoke-static {v0, v2}, Lcom/zykj/sketch/widgets/TextureDrawView;->access$setLocked$p(Lcom/zykj/sketch/widgets/TextureDrawView;Z)V

    .line 256
    .line 257
    .line 258
    :cond_5
    return-void
.end method
