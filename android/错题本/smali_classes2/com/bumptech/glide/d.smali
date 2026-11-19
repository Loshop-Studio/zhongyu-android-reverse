.class public final Lcom/bumptech/glide/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf0/s;

.field public final b:Lkotlin/jvm/internal/o;

.field public final c:Landroid/support/v4/media/h;

.field public final d:Lkotlin/jvm/internal/o;

.field public final e:Lz/h;

.field public final f:Lkotlin/jvm/internal/o;

.field public final g:Lkotlin/jvm/internal/o;

.field public final h:Landroid/support/v4/media/h;

.field public final i:Lq0/b;

.field public final j:Lw0/d;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/support/v4/media/h;

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroid/support/v4/media/h;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/bumptech/glide/d;->h:Landroid/support/v4/media/h;

    .line 12
    .line 13
    new-instance v0, Lq0/b;

    .line 14
    .line 15
    invoke-direct {v0}, Lq0/b;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/bumptech/glide/d;->i:Lq0/b;

    .line 19
    .line 20
    new-instance v0, Landroidx/core/util/Pools$SynchronizedPool;

    .line 21
    .line 22
    const/16 v1, 0x14

    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lw0/a;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lw0/b;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lw0/d;

    .line 38
    .line 39
    invoke-direct {v3, v0, v1, v2}, Lw0/d;-><init>(Landroidx/core/util/Pools$SynchronizedPool;Lw0/c;Lw0/f;)V

    .line 40
    .line 41
    .line 42
    iput-object v3, p0, Lcom/bumptech/glide/d;->j:Lw0/d;

    .line 43
    .line 44
    new-instance v0, Lf0/s;

    .line 45
    .line 46
    invoke-direct {v0, v3}, Lf0/s;-><init>(Lw0/d;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/bumptech/glide/d;->a:Lf0/s;

    .line 50
    .line 51
    new-instance v0, Lkotlin/jvm/internal/o;

    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/bumptech/glide/d;->b:Lkotlin/jvm/internal/o;

    .line 59
    .line 60
    new-instance v0, Landroid/support/v4/media/h;

    .line 61
    .line 62
    const/16 v1, 0x18

    .line 63
    .line 64
    invoke-direct {v0, v1}, Landroid/support/v4/media/h;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/bumptech/glide/d;->c:Landroid/support/v4/media/h;

    .line 68
    .line 69
    new-instance v1, Lkotlin/jvm/internal/o;

    .line 70
    .line 71
    const/4 v2, 0x5

    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-direct {v1, v2, v3}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, Lcom/bumptech/glide/d;->d:Lkotlin/jvm/internal/o;

    .line 77
    .line 78
    new-instance v1, Lz/h;

    .line 79
    .line 80
    invoke-direct {v1}, Lz/h;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lcom/bumptech/glide/d;->e:Lz/h;

    .line 84
    .line 85
    new-instance v1, Lkotlin/jvm/internal/o;

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    invoke-direct {v1, v2, v3}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, Lcom/bumptech/glide/d;->f:Lkotlin/jvm/internal/o;

    .line 92
    .line 93
    new-instance v1, Lkotlin/jvm/internal/o;

    .line 94
    .line 95
    const/4 v2, 0x4

    .line 96
    invoke-direct {v1, v2, v3}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 97
    .line 98
    .line 99
    iput-object v1, p0, Lcom/bumptech/glide/d;->g:Lkotlin/jvm/internal/o;

    .line 100
    .line 101
    const-string v1, "Gif"

    .line 102
    .line 103
    const-string v2, "Bitmap"

    .line 104
    .line 105
    const-string v3, "BitmapDrawable"

    .line 106
    .line 107
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 125
    .line 126
    .line 127
    const-string v1, "legacy_prepend_all"

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-virtual {v2, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const-string v1, "legacy_append"

    .line 134
    .line 135
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    monitor-enter v0

    .line 139
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 140
    .line 141
    iget-object v4, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v4, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 146
    .line 147
    .line 148
    iget-object v4, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v4, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    move v5, v3

    .line 160
    :goto_0
    if-ge v5, v4, :cond_0

    .line 161
    .line 162
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    add-int/lit8 v5, v5, 0x1

    .line 167
    .line 168
    check-cast v6, Ljava/lang/String;

    .line 169
    .line 170
    iget-object v7, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v7, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :catchall_0
    move-exception v1

    .line 179
    goto :goto_2

    .line 180
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    :cond_1
    :goto_1
    if-ge v3, v4, :cond_2

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    check-cast v5, Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_1

    .line 199
    .line 200
    iget-object v6, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v6, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_2
    monitor-exit v0

    .line 209
    return-void

    .line 210
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->a:Lf0/s;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lf0/s;->a:Lf0/x;

    .line 5
    .line 6
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    new-instance v2, Lf0/v;

    .line 8
    .line 9
    invoke-direct {v2, p1, p2, p3}, Lf0/v;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v1, Lf0/x;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p1, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    .line 21
    :try_start_2
    monitor-exit v1

    .line 22
    iget-object p1, v0, Lf0/s;->b:Lb0/d0;

    .line 23
    .line 24
    iget-object p1, p1, Lb0/d0;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 34
    :try_start_4
    throw p1

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 38
    throw p1
.end method

.method public final b(Ljava/lang/Class;Ly/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->b:Lkotlin/jvm/internal/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v2, Lq0/a;

    .line 7
    .line 8
    invoke-direct {v2, p1, p2}, Lq0/a;-><init>(Ljava/lang/Class;Ly/a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final c(Ljava/lang/Class;Ly/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->d:Lkotlin/jvm/internal/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v2, Lq0/d;

    .line 7
    .line 8
    invoke-direct {v2, p1, p2}, Lq0/d;-><init>(Ljava/lang/Class;Ly/h;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->c:Landroid/support/v4/media/h;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/support/v4/media/h;->x(Ljava/lang/String;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v1, Lq0/c;

    .line 9
    .line 10
    invoke-direct {v1, p2, p3, p4}, Lq0/c;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->g:Lkotlin/jvm/internal/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v1
.end method

.method public final f(Ljava/lang/Object;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->a:Lf0/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v2, v0, Lf0/s;->b:Lb0/d0;

    .line 12
    .line 13
    iget-object v2, v2, Lb0/d0;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lf0/r;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v2, Lf0/r;->a:Ljava/util/List;

    .line 26
    .line 27
    :goto_0
    if-nez v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, Lf0/s;->a:Lf0/x;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Lf0/x;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v0, Lf0/s;->b:Lb0/d0;

    .line 40
    .line 41
    iget-object v3, v3, Lb0/d0;->a:Ljava/util/HashMap;

    .line 42
    .line 43
    new-instance v4, Lf0/r;

    .line 44
    .line 45
    invoke-direct {v4, v2}, Lf0/r;-><init>(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lf0/r;

    .line 53
    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v3, "Already cached loaders for model: "

    .line 62
    .line 63
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_1
    monitor-exit v0

    .line 80
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_7

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x1

    .line 94
    move v5, v3

    .line 95
    :goto_2
    if-ge v5, v0, :cond_5

    .line 96
    .line 97
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lf0/p;

    .line 102
    .line 103
    invoke-interface {v6, p1}, Lf0/p;->a(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_4

    .line 108
    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    new-instance v1, Ljava/util/ArrayList;

    .line 112
    .line 113
    sub-int v4, v0, v5

    .line 114
    .line 115
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    move v4, v3

    .line 119
    :cond_3
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_6

    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_6
    new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;

    .line 133
    .line 134
    invoke-direct {v0, p1, v2}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Object;Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    throw v0

    .line 138
    :cond_7
    new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;

    .line 139
    .line 140
    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    throw p1
.end method

.method public final g(Ljava/lang/Class;Ljava/lang/Class;Ln0/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->f:Lkotlin/jvm/internal/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v2, Ln0/b;

    .line 7
    .line 8
    invoke-direct {v2, p1, p2, p3}, Ln0/b;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ln0/a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final h(Lz/f;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/d;->e:Lz/h;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lz/h;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-interface {p1}, Lz/f;->b()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw p1
.end method
