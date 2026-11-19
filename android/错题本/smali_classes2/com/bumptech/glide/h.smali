.class public final Lcom/bumptech/glide/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Lo0/f;


# static fields
.field public static final l:Lr0/d;

.field public static final m:Lr0/d;


# instance fields
.field public final a:Lcom/bumptech/glide/b;

.field public final b:Landroid/content/Context;

.field public final c:Lo0/e;

.field public final d:Lcom/google/gson/internal/b;

.field public final e:Lo0/i;

.field public final f:Lo0/j;

.field public final g:Lb0/a;

.field public final h:Landroid/os/Handler;

.field public final i:Lo0/b;

.field public final j:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final k:Lr0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lr0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lr0/a;->f(Ljava/lang/Class;)Lr0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lr0/d;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lr0/a;->n:Z

    .line 16
    .line 17
    sput-object v0, Lcom/bumptech/glide/h;->l:Lr0/d;

    .line 18
    .line 19
    new-instance v0, Lr0/d;

    .line 20
    .line 21
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v2, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lr0/a;->f(Ljava/lang/Class;)Lr0/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lr0/d;

    .line 31
    .line 32
    iput-boolean v1, v0, Lr0/a;->n:Z

    .line 33
    .line 34
    new-instance v0, Lr0/d;

    .line 35
    .line 36
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lb0/o;->c:Lb0/m;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lr0/d;

    .line 46
    .line 47
    sget-object v1, Lcom/bumptech/glide/Priority;->LOW:Lcom/bumptech/glide/Priority;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lr0/a;->m(Lcom/bumptech/glide/Priority;)Lr0/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lr0/d;

    .line 54
    .line 55
    invoke-virtual {v0}, Lr0/a;->r()Lr0/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lr0/d;

    .line 60
    .line 61
    sput-object v0, Lcom/bumptech/glide/h;->m:Lr0/d;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Lo0/e;Lo0/i;Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/gson/internal/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/internal/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/bumptech/glide/b;->h:Lio/reactivex/internal/operators/observable/g;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lo0/j;

    .line 12
    .line 13
    invoke-direct {v2}, Lo0/j;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 17
    .line 18
    new-instance v2, Lb0/a;

    .line 19
    .line 20
    const/4 v3, 0x7

    .line 21
    invoke-direct {v2, p0, v3}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lcom/bumptech/glide/h;->g:Lb0/a;

    .line 25
    .line 26
    new-instance v3, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Lcom/bumptech/glide/h;->h:Landroid/os/Handler;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/b;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/bumptech/glide/h;->c:Lo0/e;

    .line 40
    .line 41
    iput-object p3, p0, Lcom/bumptech/glide/h;->e:Lo0/i;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 44
    .line 45
    iput-object p4, p0, Lcom/bumptech/glide/h;->b:Landroid/content/Context;

    .line 46
    .line 47
    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    new-instance p4, Landroid/support/v4/media/h;

    .line 52
    .line 53
    const/16 v4, 0x8

    .line 54
    .line 55
    invoke-direct {p4, v4, p0, v0}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v0, "ConnectivityMonitor"

    .line 62
    .line 63
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 64
    .line 65
    invoke-static {p3, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x1

    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    move v1, v5

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move v1, v4

    .line 76
    :goto_0
    const/4 v6, 0x3

    .line 77
    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    const-string v6, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const-string v6, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    .line 89
    .line 90
    :goto_1
    invoke-static {v0, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :cond_2
    if-eqz v1, :cond_3

    .line 94
    .line 95
    new-instance v0, Lo0/d;

    .line 96
    .line 97
    invoke-direct {v0, p3, p4}, Lo0/d;-><init>(Landroid/content/Context;Landroid/support/v4/media/h;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    new-instance v0, Lo0/g;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    :goto_2
    iput-object v0, p0, Lcom/bumptech/glide/h;->i:Lo0/b;

    .line 107
    .line 108
    sget-object p3, Lv0/k;->a:[C

    .line 109
    .line 110
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 115
    .line 116
    .line 117
    move-result-object p4

    .line 118
    if-ne p3, p4, :cond_4

    .line 119
    .line 120
    move v4, v5

    .line 121
    :cond_4
    if-nez v4, :cond_5

    .line 122
    .line 123
    invoke-virtual {v3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    invoke-interface {p2, p0}, Lo0/e;->d(Lo0/f;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-interface {p2, v0}, Lo0/e;->d(Lo0/f;)V

    .line 131
    .line 132
    .line 133
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 134
    .line 135
    iget-object p3, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/c;

    .line 136
    .line 137
    iget-object p3, p3, Lcom/bumptech/glide/c;->e:Ljava/util/List;

    .line 138
    .line 139
    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 140
    .line 141
    .line 142
    iput-object p2, p0, Lcom/bumptech/glide/h;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 143
    .line 144
    iget-object p2, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/c;

    .line 145
    .line 146
    monitor-enter p2

    .line 147
    :try_start_0
    iget-object p3, p2, Lcom/bumptech/glide/c;->i:Lr0/d;

    .line 148
    .line 149
    if-nez p3, :cond_6

    .line 150
    .line 151
    iget-object p3, p2, Lcom/bumptech/glide/c;->d:Lio/reactivex/internal/operators/observable/h;

    .line 152
    .line 153
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-instance p3, Lr0/d;

    .line 157
    .line 158
    invoke-direct {p3}, Lr0/a;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-boolean v5, p3, Lr0/a;->n:Z

    .line 162
    .line 163
    iput-object p3, p2, Lcom/bumptech/glide/c;->i:Lr0/d;

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :catchall_0
    move-exception p1

    .line 167
    goto :goto_7

    .line 168
    :cond_6
    :goto_4
    iget-object p3, p2, Lcom/bumptech/glide/c;->i:Lr0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    monitor-exit p2

    .line 171
    monitor-enter p0

    .line 172
    :try_start_1
    invoke-virtual {p3}, Lr0/a;->e()Lr0/a;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    check-cast p2, Lr0/d;

    .line 177
    .line 178
    iget-boolean p3, p2, Lr0/a;->n:Z

    .line 179
    .line 180
    if-eqz p3, :cond_8

    .line 181
    .line 182
    iget-boolean p3, p2, Lr0/a;->o:Z

    .line 183
    .line 184
    if-eqz p3, :cond_7

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    .line 190
    .line 191
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p1

    .line 195
    :cond_8
    :goto_5
    iput-boolean v5, p2, Lr0/a;->o:Z

    .line 196
    .line 197
    iput-boolean v5, p2, Lr0/a;->n:Z

    .line 198
    .line 199
    iput-object p2, p0, Lcom/bumptech/glide/h;->k:Lr0/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 200
    .line 201
    monitor-exit p0

    .line 202
    iget-object p2, p1, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 203
    .line 204
    monitor-enter p2

    .line 205
    :try_start_2
    iget-object p3, p1, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-nez p3, :cond_9

    .line 212
    .line 213
    iget-object p1, p1, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    monitor-exit p2

    .line 219
    return-void

    .line 220
    :catchall_1
    move-exception p1

    .line 221
    goto :goto_6

    .line 222
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 223
    .line 224
    const-string p3, "Cannot register already registered manager"

    .line 225
    .line 226
    invoke-direct {p1, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :goto_6
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 231
    throw p1

    .line 232
    :catchall_2
    move-exception p1

    .line 233
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 234
    throw p1

    .line 235
    :goto_7
    :try_start_4
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 236
    throw p1
.end method


# virtual methods
.method public final i(Ljava/lang/Class;)Lcom/bumptech/glide/f;
    .locals 3

    .line 1
    new-instance v0, Lcom/bumptech/glide/f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/h;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1, v2}, Lcom/bumptech/glide/f;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/lang/Class;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final j()Lcom/bumptech/glide/f;
    .locals 2

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/bumptech/glide/h;->l:Lr0/d;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final k(Ls0/i;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/h;->o(Ls0/i;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-interface {p1}, Ls0/i;->a()Lr0/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/b;

    .line 15
    .line 16
    iget-object v2, v0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    iget-object v0, v0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    :cond_1
    if-ge v4, v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    check-cast v5, Lcom/bumptech/glide/h;

    .line 35
    .line 36
    invoke-virtual {v5, p1}, Lcom/bumptech/glide/h;->o(Ls0/i;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    monitor-exit v2

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-interface {p1, v0}, Ls0/i;->g(Lcom/bumptech/glide/request/a;)V

    .line 51
    .line 52
    .line 53
    check-cast v1, Lcom/bumptech/glide/request/a;

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/bumptech/glide/request/a;->c()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :goto_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw p1

    .line 61
    :cond_3
    :goto_1
    return-void
.end method

.method public final l(Ljava/lang/String;)Lcom/bumptech/glide/f;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object p1, v0, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, v0, Lcom/bumptech/glide/f;->y:Z

    .line 11
    .line 12
    return-object v0
.end method

.method public final declared-synchronized m()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Lcom/google/gson/internal/b;->b:Z

    .line 6
    .line 7
    iget-object v1, v0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Lv0/k;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    check-cast v4, Lr0/b;

    .line 29
    .line 30
    check-cast v4, Lcom/bumptech/glide/request/a;

    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/bumptech/glide/request/a;->g()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    iget-object v5, v4, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    :try_start_1
    invoke-virtual {v4}, Lcom/bumptech/glide/request/a;->g()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/bumptech/glide/request/a;->c()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    :goto_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :try_start_2
    iget-object v5, v0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 55
    .line 56
    check-cast v5, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :goto_2
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 64
    :cond_2
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :catchall_1
    move-exception v0

    .line 67
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 68
    throw v0
.end method

.method public final declared-synchronized n()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lcom/google/gson/internal/b;->b:Z

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v2}, Lv0/k;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    :cond_0
    :goto_0
    if-ge v1, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    check-cast v4, Lr0/b;

    .line 28
    .line 29
    check-cast v4, Lcom/bumptech/glide/request/a;

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/bumptech/glide/request/a;->f()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-nez v5, :cond_0

    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/bumptech/glide/request/a;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/bumptech/glide/request/a;->a()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, v0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 48
    .line 49
    check-cast v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw v0
.end method

.method public final declared-synchronized o(Ls0/i;)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ls0/i;->a()Lr0/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lcom/google/gson/internal/b;->b(Lr0/b;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 20
    .line 21
    iget-object v0, v0, Lo0/j;->a:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p1, v0}, Ls0/i;->g(Lcom/bumptech/glide/request/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    monitor-exit p0

    .line 35
    const/4 p1, 0x0

    .line 36
    return p1

    .line 37
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized onDestroy()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 3
    .line 4
    invoke-virtual {v0}, Lo0/j;->onDestroy()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 8
    .line 9
    iget-object v0, v0, Lo0/j;->a:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v0}, Lv0/k;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    :goto_0
    if-ge v3, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    check-cast v4, Ls0/i;

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Lcom/bumptech/glide/h;->k(Ls0/i;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_3

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 38
    .line 39
    iget-object v0, v0, Lo0/j;->a:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 45
    .line 46
    iget-object v1, v0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/util/Set;

    .line 49
    .line 50
    invoke-static {v1}, Lv0/k;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :goto_1
    if-ge v2, v3, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    check-cast v4, Lr0/b;

    .line 67
    .line 68
    invoke-virtual {v0, v4}, Lcom/google/gson/internal/b;->b(Lr0/b;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    iget-object v0, v0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 73
    .line 74
    check-cast v0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/bumptech/glide/h;->c:Lo0/e;

    .line 80
    .line 81
    invoke-interface {v0, p0}, Lo0/e;->f(Lo0/f;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/bumptech/glide/h;->c:Lo0/e;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/bumptech/glide/h;->i:Lo0/b;

    .line 87
    .line 88
    invoke-interface {v0, v1}, Lo0/e;->f(Lo0/f;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/bumptech/glide/h;->h:Landroid/os/Handler;

    .line 92
    .line 93
    iget-object v1, p0, Lcom/bumptech/glide/h;->g:Lb0/a;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/b;

    .line 99
    .line 100
    iget-object v1, v0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 101
    .line 102
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    :try_start_1
    iget-object v2, v0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_2

    .line 110
    .line 111
    iget-object v0, v0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    monitor-exit p0

    .line 118
    return-void

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    const-string v2, "Cannot unregister not yet registered manager"

    .line 124
    .line 125
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 130
    :try_start_3
    throw v0

    .line 131
    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 132
    throw v0
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized onStart()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->n()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Lo0/j;->onStart()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final declared-synchronized onStop()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->m()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Lo0/j;->onStop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "{tracker="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", treeNode="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/bumptech/glide/h;->e:Lo0/i;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string/jumbo v1, "}"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    monitor-exit p0

    .line 46
    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v0
.end method
