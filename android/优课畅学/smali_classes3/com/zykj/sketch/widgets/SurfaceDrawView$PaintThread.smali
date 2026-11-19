.class public final Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/widgets/SurfaceDrawView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PaintThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/widgets/SurfaceDrawView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

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
    .locals 7

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getMIsDrawing$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$isLocked$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_7

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {v0, v1}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$setLocked$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "holder"

    .line 33
    .line 34
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 38
    .line 39
    monitor-enter v0

    .line 40
    :try_start_0
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/graphics/RectF;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-ne v3, v1, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v1

    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_0
    :goto_0
    new-instance v3, Landroid/graphics/RectF;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    int-to-float v5, v5

    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    int-to-float v6, v6

    .line 75
    invoke-direct {v3, v4, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v3}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$setPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Landroid/graphics/RectF;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/graphics/RectF;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-ne v3, v1, :cond_3

    .line 98
    .line 99
    :cond_2
    new-instance v1, Landroid/graphics/RectF;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    int-to-float v3, v3

    .line 106
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    int-to-float v5, v5

    .line 111
    invoke-direct {v1, v4, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2, v1}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$setLimitDrawArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Landroid/graphics/RectF;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const/4 v3, 0x0

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    if-eqz v4, :cond_6

    .line 129
    .line 130
    invoke-virtual {v4, v1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getDrawRect$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/Rect;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v4, v1}, Landroid/graphics/RectF;->roundOut(Landroid/graphics/Rect;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getDrawRect$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/Rect;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_5

    .line 152
    .line 153
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    new-instance v4, Landroid/graphics/Rect;

    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    invoke-direct {v4, v3, v3, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v1, v4}, Landroid/view/SurfaceHolder;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    const-string v4, "lockCanvas"

    .line 177
    .line 178
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    .line 180
    .line 181
    :try_start_1
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getBackgroundId$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 186
    .line 187
    .line 188
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getDrawRect$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/Rect;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 193
    .line 194
    .line 195
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getGraph$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Lcom/zykj/sketch/core/graph/Graph;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    if-eqz v4, :cond_4

    .line 200
    .line 201
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 202
    .line 203
    .line 204
    sget-object v4, Lh7/p;->a:Lh7/p;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :catchall_1
    move-exception v4

    .line 208
    goto :goto_3

    .line 209
    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    :goto_2
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :goto_3
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 218
    .line 219
    .line 220
    sget-object v4, Lh7/p;->a:Lh7/p;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 221
    .line 222
    :try_start_4
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    goto :goto_2

    .line 227
    :catchall_2
    move-exception v3

    .line 228
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 233
    .line 234
    .line 235
    throw v3

    .line 236
    :cond_5
    :goto_4
    sget-object v1, Lh7/p;->a:Lh7/p;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 237
    .line 238
    :cond_6
    monitor-exit v0

    .line 239
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 240
    .line 241
    invoke-static {v0, v3}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$setLocked$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Z)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :goto_5
    monitor-exit v0

    .line 246
    throw v1

    .line 247
    :cond_7
    return-void
.end method
