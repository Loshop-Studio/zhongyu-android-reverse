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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;",
        "Ljava/lang/Thread;",
        "<init>",
        "(Lcom/zykj/sketch/widgets/SurfaceDrawView;)V",
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
    if-eqz v0, :cond_6

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
    if-nez v0, :cond_6

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
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-eqz v1, :cond_5

    .line 123
    .line 124
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/RectF;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    if-eqz v4, :cond_5

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
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    :try_start_1
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getBackgroundId$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getDrawRect$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Landroid/graphics/Rect;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 188
    .line 189
    .line 190
    invoke-static {v2}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$getGraph$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;)Lcom/zykj/sketch/core/graph/Graph;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    if-eqz v4, :cond_4

    .line 195
    .line 196
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :catchall_1
    move-exception v4

    .line 201
    goto :goto_3

    .line 202
    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    :goto_2
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :goto_3
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 211
    .line 212
    .line 213
    :try_start_4
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    goto :goto_2

    .line 218
    :catchall_2
    move-exception v3

    .line 219
    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 224
    .line 225
    .line 226
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 227
    :cond_5
    :goto_4
    monitor-exit v0

    .line 228
    iget-object v0, p0, Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;->this$0:Lcom/zykj/sketch/widgets/SurfaceDrawView;

    .line 229
    .line 230
    invoke-static {v0, v3}, Lcom/zykj/sketch/widgets/SurfaceDrawView;->access$setLocked$p(Lcom/zykj/sketch/widgets/SurfaceDrawView;Z)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :goto_5
    monitor-exit v0

    .line 235
    throw v1

    .line 236
    :cond_6
    return-void
.end method
