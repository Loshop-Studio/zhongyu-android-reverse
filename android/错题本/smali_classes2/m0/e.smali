.class public final Lm0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lx/d;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lcom/bumptech/glide/h;

.field public final e:Lc0/b;

.field public f:Z

.field public g:Z

.field public h:Lcom/bumptech/glide/f;

.field public i:Lm0/c;

.field public j:Z

.field public k:Lm0/c;

.field public l:Landroid/graphics/Bitmap;

.field public m:Lm0/c;

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/b;Lx/d;IILandroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/bumptech/glide/b;->b:Lc0/b;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/c;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v2, Lr0/d;

    .line 26
    .line 27
    invoke-direct {v2}, Lr0/a;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v3, Lb0/o;->b:Lb0/m;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lr0/d;

    .line 37
    .line 38
    invoke-virtual {v2}, Lr0/a;->v()Lr0/a;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lr0/d;

    .line 43
    .line 44
    invoke-virtual {v2}, Lr0/a;->r()Lr0/a;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lr0/d;

    .line 49
    .line 50
    invoke-virtual {v2, p3, p4}, Lr0/a;->k(II)Lr0/a;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance p3, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p3, p0, Lm0/e;->c:Ljava/util/ArrayList;

    .line 67
    .line 68
    iput-object v1, p0, Lm0/e;->d:Lcom/bumptech/glide/h;

    .line 69
    .line 70
    new-instance p3, Landroid/os/Handler;

    .line 71
    .line 72
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    new-instance v1, Lb2/a;

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-direct {v1, p0, v2}, Lb2/a;-><init>(Ljava/lang/Object;I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p3, p4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lm0/e;->e:Lc0/b;

    .line 86
    .line 87
    iput-object p3, p0, Lm0/e;->b:Landroid/os/Handler;

    .line 88
    .line 89
    iput-object p1, p0, Lm0/e;->h:Lcom/bumptech/glide/f;

    .line 90
    .line 91
    iput-object p2, p0, Lm0/e;->a:Lx/d;

    .line 92
    .line 93
    sget-object p1, Lh0/a;->b:Lh0/a;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p5}, Lm0/e;->c(Ly/i;Landroid/graphics/Bitmap;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lm0/e;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-boolean v0, p0, Lm0/e;->g:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object v0, p0, Lm0/e;->m:Lm0/c;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lm0/e;->m:Lm0/c;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lm0/e;->b(Lm0/c;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lm0/e;->g:Z

    .line 23
    .line 24
    iget-object v1, p0, Lm0/e;->a:Lx/d;

    .line 25
    .line 26
    iget-object v2, v1, Lx/d;->l:Lx/b;

    .line 27
    .line 28
    iget v3, v2, Lx/b;->c:I

    .line 29
    .line 30
    if-lez v3, :cond_4

    .line 31
    .line 32
    iget v4, v1, Lx/d;->k:I

    .line 33
    .line 34
    if-gez v4, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    if-ltz v4, :cond_3

    .line 38
    .line 39
    if-ge v4, v3, :cond_3

    .line 40
    .line 41
    iget-object v2, v2, Lx/b;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lx/a;

    .line 48
    .line 49
    iget v2, v2, Lx/a;->i:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/4 v2, -0x1

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    :goto_0
    const/4 v2, 0x0

    .line 55
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    int-to-long v5, v2

    .line 60
    add-long/2addr v3, v5

    .line 61
    iget v2, v1, Lx/d;->k:I

    .line 62
    .line 63
    add-int/2addr v2, v0

    .line 64
    iget-object v5, v1, Lx/d;->l:Lx/b;

    .line 65
    .line 66
    iget v5, v5, Lx/b;->c:I

    .line 67
    .line 68
    rem-int/2addr v2, v5

    .line 69
    iput v2, v1, Lx/d;->k:I

    .line 70
    .line 71
    new-instance v5, Lm0/c;

    .line 72
    .line 73
    iget-object v6, p0, Lm0/e;->b:Landroid/os/Handler;

    .line 74
    .line 75
    invoke-direct {v5, v6, v2, v3, v4}, Lm0/c;-><init>(Landroid/os/Handler;IJ)V

    .line 76
    .line 77
    .line 78
    iput-object v5, p0, Lm0/e;->k:Lm0/c;

    .line 79
    .line 80
    iget-object v2, p0, Lm0/e;->h:Lcom/bumptech/glide/f;

    .line 81
    .line 82
    new-instance v3, Lu0/b;

    .line 83
    .line 84
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-direct {v3, v4}, Lu0/b;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Lr0/d;

    .line 96
    .line 97
    invoke-direct {v4}, Lr0/a;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v3}, Lr0/a;->q(Lu0/b;)Lr0/a;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Lr0/d;

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iput-object v1, v2, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 111
    .line 112
    iput-boolean v0, v2, Lcom/bumptech/glide/f;->y:Z

    .line 113
    .line 114
    iget-object v0, p0, Lm0/e;->k:Lm0/c;

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_2
    return-void
.end method

.method public final b(Lm0/c;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm0/e;->g:Z

    .line 3
    .line 4
    iget-boolean v1, p0, Lm0/e;->j:Z

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    iget-object v3, p0, Lm0/e;->b:Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v1, p0, Lm0/e;->f:Z

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iput-object p1, p0, Lm0/e;->m:Lm0/c;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v1, p1, Lm0/c;->g:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    if-eqz v1, :cond_a

    .line 29
    .line 30
    iget-object v1, p0, Lm0/e;->l:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object v4, p0, Lm0/e;->e:Lc0/b;

    .line 35
    .line 36
    invoke-interface {v4, v1}, Lc0/b;->b(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lm0/e;->l:Landroid/graphics/Bitmap;

    .line 41
    .line 42
    :cond_2
    iget-object v1, p0, Lm0/e;->i:Lm0/c;

    .line 43
    .line 44
    iput-object p1, p0, Lm0/e;->i:Lm0/c;

    .line 45
    .line 46
    iget-object p1, p0, Lm0/e;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/lit8 v4, v4, -0x1

    .line 53
    .line 54
    :goto_0
    if-ltz v4, :cond_9

    .line 55
    .line 56
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lm0/d;

    .line 61
    .line 62
    check-cast v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    :goto_1
    instance-of v7, v6, Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    check-cast v6, Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    if-nez v6, :cond_4

    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->stop()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 89
    .line 90
    .line 91
    iget-object v6, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->a:Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;

    .line 92
    .line 93
    iget-object v6, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v6, Lm0/e;

    .line 96
    .line 97
    iget-object v7, v6, Lm0/e;->i:Lm0/c;

    .line 98
    .line 99
    const/4 v8, -0x1

    .line 100
    if-eqz v7, :cond_5

    .line 101
    .line 102
    iget v7, v7, Lm0/c;->e:I

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move v7, v8

    .line 106
    :goto_2
    iget-object v6, v6, Lm0/e;->a:Lx/d;

    .line 107
    .line 108
    iget-object v6, v6, Lx/d;->l:Lx/b;

    .line 109
    .line 110
    iget v6, v6, Lx/b;->c:I

    .line 111
    .line 112
    add-int/lit8 v6, v6, -0x1

    .line 113
    .line 114
    if-ne v7, v6, :cond_6

    .line 115
    .line 116
    iget v6, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->f:I

    .line 117
    .line 118
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    iput v6, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->f:I

    .line 121
    .line 122
    :cond_6
    iget v6, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->g:I

    .line 123
    .line 124
    if-eq v6, v8, :cond_8

    .line 125
    .line 126
    iget v7, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->f:I

    .line 127
    .line 128
    if-lt v7, v6, :cond_8

    .line 129
    .line 130
    iget-object v6, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->k:Ljava/util/ArrayList;

    .line 131
    .line 132
    if-eqz v6, :cond_7

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    move v7, v0

    .line 139
    :goto_3
    if-ge v7, v6, :cond_7

    .line 140
    .line 141
    iget-object v8, v5, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->k:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    check-cast v8, Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;

    .line 148
    .line 149
    invoke-virtual {v8, v5}, Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;->onAnimationEnd(Landroid/graphics/drawable/Drawable;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v7, v7, 0x1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    invoke-virtual {v5}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->stop()V

    .line 156
    .line 157
    .line 158
    :cond_8
    :goto_4
    add-int/lit8 v4, v4, -0x1

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_9
    if-eqz v1, :cond_a

    .line 162
    .line 163
    invoke-virtual {v3, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 168
    .line 169
    .line 170
    :cond_a
    invoke-virtual {p0}, Lm0/e;->a()V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public final c(Ly/i;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    const-string v0, "Argument must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lm0/e;->l:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iget-object v0, p0, Lm0/e;->h:Lcom/bumptech/glide/f;

    .line 12
    .line 13
    new-instance v1, Lr0/d;

    .line 14
    .line 15
    invoke-direct {v1}, Lr0/a;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, p1, v2}, Lr0/a;->u(Ly/i;Z)Lr0/a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lm0/e;->h:Lcom/bumptech/glide/f;

    .line 28
    .line 29
    invoke-static {p2}, Lv0/k;->c(Landroid/graphics/Bitmap;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lm0/e;->n:I

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p0, Lm0/e;->o:I

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p0, Lm0/e;->p:I

    .line 46
    .line 47
    return-void
.end method
