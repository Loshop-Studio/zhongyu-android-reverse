.class public final Lcom/bumptech/glide/f;
.super Lr0/a;
.source "SourceFile"


# instance fields
.field public final r:Landroid/content/Context;

.field public final s:Lcom/bumptech/glide/h;

.field public final t:Ljava/lang/Class;

.field public final u:Lcom/bumptech/glide/c;

.field public v:Lcom/bumptech/glide/a;

.field public w:Ljava/lang/Object;

.field public final x:Ljava/util/ArrayList;

.field public y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lb0/o;->c:Lb0/m;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lr0/d;

    .line 13
    .line 14
    sget-object v1, Lcom/bumptech/glide/Priority;->LOW:Lcom/bumptech/glide/Priority;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lr0/a;->m(Lcom/bumptech/glide/Priority;)Lr0/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lr0/d;

    .line 21
    .line 22
    invoke-virtual {v0}, Lr0/a;->r()Lr0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lr0/d;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lr0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/bumptech/glide/f;->s:Lcom/bumptech/glide/h;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/bumptech/glide/f;->t:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/bumptech/glide/f;->r:Landroid/content/Context;

    .line 9
    .line 10
    iget-object p4, p2, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/b;

    .line 11
    .line 12
    iget-object p4, p4, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/c;

    .line 13
    .line 14
    iget-object p4, p4, Lcom/bumptech/glide/c;->f:Landroidx/collection/ArrayMap;

    .line 15
    .line 16
    invoke-interface {p4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/bumptech/glide/a;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/bumptech/glide/a;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    if-nez v0, :cond_2

    .line 64
    .line 65
    sget-object v0, Lcom/bumptech/glide/c;->j:Lcom/bumptech/glide/a;

    .line 66
    .line 67
    :cond_2
    iput-object v0, p0, Lcom/bumptech/glide/f;->v:Lcom/bumptech/glide/a;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/c;

    .line 70
    .line 71
    iput-object p1, p0, Lcom/bumptech/glide/f;->u:Lcom/bumptech/glide/c;

    .line 72
    .line 73
    iget-object p1, p2, Lcom/bumptech/glide/h;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    if-eqz p3, :cond_5

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    check-cast p3, Lr0/c;

    .line 90
    .line 91
    if-eqz p3, :cond_3

    .line 92
    .line 93
    iget-object p4, p0, Lcom/bumptech/glide/f;->x:Ljava/util/ArrayList;

    .line 94
    .line 95
    if-nez p4, :cond_4

    .line 96
    .line 97
    new-instance p4, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p4, p0, Lcom/bumptech/glide/f;->x:Ljava/util/ArrayList;

    .line 103
    .line 104
    :cond_4
    iget-object p4, p0, Lcom/bumptech/glide/f;->x:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    monitor-enter p2

    .line 111
    :try_start_0
    iget-object p1, p2, Lcom/bumptech/glide/h;->k:Lr0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    monitor-exit p2

    .line 114
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    throw p1
.end method


# virtual methods
.method public final A(Ls0/i;Lr0/c;Lr0/a;Ljava/util/concurrent/Executor;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p3

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Lv7/d;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, v1, Lcom/bumptech/glide/f;->y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_b

    .line 11
    .line 12
    new-instance v5, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lcom/bumptech/glide/f;->v:Lcom/bumptech/glide/a;

    .line 18
    .line 19
    iget-object v11, v8, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 20
    .line 21
    iget v9, v8, Lr0/a;->h:I

    .line 22
    .line 23
    iget v10, v8, Lr0/a;->g:I

    .line 24
    .line 25
    iget-object v3, v1, Lcom/bumptech/glide/f;->r:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v4, v1, Lcom/bumptech/glide/f;->u:Lcom/bumptech/glide/c;

    .line 28
    .line 29
    iget-object v6, v1, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v7, v1, Lcom/bumptech/glide/f;->t:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v14, v1, Lcom/bumptech/glide/f;->x:Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object v15, v4, Lcom/bumptech/glide/c;->g:Lcom/bumptech/glide/load/engine/c;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/bumptech/glide/a;->a:Lt0/a;

    .line 38
    .line 39
    new-instance v2, Lcom/bumptech/glide/request/a;

    .line 40
    .line 41
    move-object/from16 v12, p1

    .line 42
    .line 43
    move-object/from16 v13, p2

    .line 44
    .line 45
    move-object/from16 v17, p4

    .line 46
    .line 47
    move-object/from16 v16, v0

    .line 48
    .line 49
    invoke-direct/range {v2 .. v17}, Lcom/bumptech/glide/request/a;-><init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lr0/a;IILcom/bumptech/glide/Priority;Ls0/i;Lr0/c;Ljava/util/ArrayList;Lcom/bumptech/glide/load/engine/c;Lt0/a;Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    invoke-interface/range {p1 .. p1}, Ls0/i;->a()Lr0/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    instance-of v3, v0, Lcom/bumptech/glide/request/a;

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    move-object/from16 p4, v0

    .line 61
    .line 62
    move-object/from16 v16, v2

    .line 63
    .line 64
    :cond_0
    const/4 v4, 0x0

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_1
    iget-object v3, v2, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter v3

    .line 70
    :try_start_0
    iget v5, v2, Lcom/bumptech/glide/request/a;->j:I

    .line 71
    .line 72
    iget v6, v2, Lcom/bumptech/glide/request/a;->k:I

    .line 73
    .line 74
    iget-object v7, v2, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v9, v2, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;

    .line 77
    .line 78
    iget-object v10, v2, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 79
    .line 80
    iget-object v11, v2, Lcom/bumptech/glide/request/a;->l:Lcom/bumptech/glide/Priority;

    .line 81
    .line 82
    iget-object v13, v2, Lcom/bumptech/glide/request/a;->n:Ljava/util/List;

    .line 83
    .line 84
    if-eqz v13, :cond_2

    .line 85
    .line 86
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_2
    const/4 v13, 0x0

    .line 95
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    move-object v3, v0

    .line 97
    check-cast v3, Lcom/bumptech/glide/request/a;

    .line 98
    .line 99
    iget-object v14, v3, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v14

    .line 102
    :try_start_1
    iget v15, v3, Lcom/bumptech/glide/request/a;->j:I

    .line 103
    .line 104
    iget v4, v3, Lcom/bumptech/glide/request/a;->k:I

    .line 105
    .line 106
    move-object/from16 v16, v2

    .line 107
    .line 108
    iget-object v2, v3, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v12, v3, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 111
    .line 112
    :try_start_2
    iget-object v1, v3, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 113
    .line 114
    move-object/from16 p4, v0

    .line 115
    .line 116
    iget-object v0, v3, Lcom/bumptech/glide/request/a;->l:Lcom/bumptech/glide/Priority;

    .line 117
    .line 118
    iget-object v3, v3, Lcom/bumptech/glide/request/a;->n:Ljava/util/List;

    .line 119
    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    goto :goto_1

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    move-object/from16 v1, p0

    .line 129
    .line 130
    goto/16 :goto_6

    .line 131
    .line 132
    :cond_3
    const/4 v3, 0x0

    .line 133
    :goto_1
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    if-ne v5, v15, :cond_0

    .line 135
    .line 136
    if-ne v6, v4, :cond_0

    .line 137
    .line 138
    sget-object v4, Lv0/k;->a:[C

    .line 139
    .line 140
    const/4 v4, 0x1

    .line 141
    if-nez v7, :cond_5

    .line 142
    .line 143
    if-nez v2, :cond_4

    .line 144
    .line 145
    move v2, v4

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    const/4 v2, 0x0

    .line 148
    goto :goto_2

    .line 149
    :cond_5
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    :goto_2
    if-eqz v2, :cond_0

    .line 154
    .line 155
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_0

    .line 160
    .line 161
    invoke-virtual {v10, v1}, Lr0/a;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_0

    .line 166
    .line 167
    if-ne v11, v0, :cond_0

    .line 168
    .line 169
    if-ne v13, v3, :cond_0

    .line 170
    .line 171
    :goto_3
    if-eqz v4, :cond_6

    .line 172
    .line 173
    iget-boolean v0, v8, Lr0/a;->f:Z

    .line 174
    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    move-object/from16 v0, p4

    .line 178
    .line 179
    check-cast v0, Lcom/bumptech/glide/request/a;

    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/bumptech/glide/request/a;->f()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    :cond_6
    move-object/from16 v1, p0

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    const-string v0, "Argument must not be null"

    .line 191
    .line 192
    move-object/from16 v1, p4

    .line 193
    .line 194
    invoke-static {v1, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    move-object v0, v1

    .line 198
    check-cast v0, Lcom/bumptech/glide/request/a;

    .line 199
    .line 200
    invoke-virtual {v0}, Lcom/bumptech/glide/request/a;->g()Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_8

    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/bumptech/glide/request/a;->a()V

    .line 207
    .line 208
    .line 209
    :cond_8
    return-void

    .line 210
    :goto_4
    iget-object v0, v1, Lcom/bumptech/glide/f;->s:Lcom/bumptech/glide/h;

    .line 211
    .line 212
    move-object/from16 v12, p1

    .line 213
    .line 214
    invoke-virtual {v0, v12}, Lcom/bumptech/glide/h;->k(Ls0/i;)V

    .line 215
    .line 216
    .line 217
    move-object/from16 v2, v16

    .line 218
    .line 219
    invoke-interface {v12, v2}, Ls0/i;->g(Lcom/bumptech/glide/request/a;)V

    .line 220
    .line 221
    .line 222
    iget-object v3, v1, Lcom/bumptech/glide/f;->s:Lcom/bumptech/glide/h;

    .line 223
    .line 224
    monitor-enter v3

    .line 225
    :try_start_3
    iget-object v0, v3, Lcom/bumptech/glide/h;->f:Lo0/j;

    .line 226
    .line 227
    iget-object v0, v0, Lo0/j;->a:Ljava/util/Set;

    .line 228
    .line 229
    invoke-interface {v0, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    iget-object v0, v3, Lcom/bumptech/glide/h;->d:Lcom/google/gson/internal/b;

    .line 233
    .line 234
    const-string v4, "RequestTracker"

    .line 235
    .line 236
    iget-object v5, v0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v5, Ljava/util/Set;

    .line 239
    .line 240
    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    iget-boolean v5, v0, Lcom/google/gson/internal/b;->b:Z

    .line 244
    .line 245
    if-nez v5, :cond_9

    .line 246
    .line 247
    invoke-virtual {v2}, Lcom/bumptech/glide/request/a;->a()V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_9
    invoke-virtual {v2}, Lcom/bumptech/glide/request/a;->c()V

    .line 252
    .line 253
    .line 254
    const/4 v5, 0x2

    .line 255
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_a

    .line 260
    .line 261
    const-string v5, "Paused, delaying request"

    .line 262
    .line 263
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    :cond_a
    iget-object v0, v0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 267
    .line 268
    check-cast v0, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 271
    .line 272
    .line 273
    :goto_5
    monitor-exit v3

    .line 274
    return-void

    .line 275
    :catchall_2
    move-exception v0

    .line 276
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 277
    throw v0

    .line 278
    :catchall_3
    move-exception v0

    .line 279
    :goto_6
    :try_start_5
    monitor-exit v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 280
    throw v0

    .line 281
    :goto_7
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 282
    throw v0

    .line 283
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 284
    .line 285
    const-string v2, "You must call #load() before calling #into()"

    .line 286
    .line 287
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v0
.end method

.method public final bridge synthetic c(Lr0/a;)Lr0/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic e()Lr0/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final w(Lr0/a;)Lcom/bumptech/glide/f;
    .locals 0

    .line 1
    invoke-static {p1}, Lv7/d;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lr0/a;->c(Lr0/a;)Lr0/a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/bumptech/glide/f;

    .line 9
    .line 10
    return-object p1
.end method

.method public final x()Lcom/bumptech/glide/f;
    .locals 2

    .line 1
    invoke-super {p0}, Lr0/a;->e()Lr0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/bumptech/glide/f;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/bumptech/glide/f;->v:Lcom/bumptech/glide/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bumptech/glide/a;->c()Lcom/bumptech/glide/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lcom/bumptech/glide/f;->v:Lcom/bumptech/glide/a;

    .line 14
    .line 15
    return-object v0
.end method

.method public final y(Landroid/widget/ImageView;)V
    .locals 4

    .line 1
    sget-object v0, Lv0/k;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_3

    .line 12
    .line 13
    invoke-static {p1}, Lv7/d;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x800

    .line 17
    .line 18
    iget v1, p0, Lr0/a;->a:I

    .line 19
    .line 20
    invoke-static {v1, v0}, Lr0/a;->i(II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    sget-object v0, Lcom/bumptech/glide/e;->a:[I

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    aget v0, v0, v2

    .line 44
    .line 45
    packed-switch v0, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_0
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v2, Li0/k;->c:Li0/k;

    .line 54
    .line 55
    new-instance v3, Li0/g;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2, v3, v1}, Lr0/a;->n(Li0/k;Li0/d;Z)Lr0/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_1

    .line 65
    :pswitch_1
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v2, Li0/k;->b:Li0/k;

    .line 70
    .line 71
    new-instance v3, Li0/r;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2, v3, v1}, Lr0/a;->n(Li0/k;Li0/d;Z)Lr0/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_1

    .line 81
    :pswitch_2
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v2, Li0/k;->c:Li0/k;

    .line 86
    .line 87
    new-instance v3, Li0/g;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2, v3, v1}, Lr0/a;->n(Li0/k;Li0/d;Z)Lr0/a;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_1

    .line 97
    :pswitch_3
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v2, Li0/k;->d:Li0/k;

    .line 102
    .line 103
    new-instance v3, Li0/f;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2, v3}, Lr0/a;->j(Li0/k;Li0/d;)Lr0/a;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_1

    .line 113
    :cond_0
    :goto_0
    move-object v0, p0

    .line 114
    :goto_1
    iget-object v2, p0, Lcom/bumptech/glide/f;->u:Lcom/bumptech/glide/c;

    .line 115
    .line 116
    iget-object v2, v2, Lcom/bumptech/glide/c;->c:Lc8/c;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const-class v2, Landroid/graphics/Bitmap;

    .line 122
    .line 123
    iget-object v3, p0, Lcom/bumptech/glide/f;->t:Ljava/lang/Class;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_1

    .line 130
    .line 131
    new-instance v2, Ls0/b;

    .line 132
    .line 133
    invoke-direct {v2, p1, v1}, Ls0/b;-><init>(Landroid/widget/ImageView;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_1
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_2

    .line 144
    .line 145
    new-instance v2, Ls0/b;

    .line 146
    .line 147
    const/4 v1, 0x1

    .line 148
    invoke-direct {v2, p1, v1}, Ls0/b;-><init>(Landroid/widget/ImageView;I)V

    .line 149
    .line 150
    .line 151
    :goto_2
    const/4 p1, 0x0

    .line 152
    sget-object v1, Lv0/e;->a:Lretrofit2/a;

    .line 153
    .line 154
    invoke-virtual {p0, v2, p1, v0, v1}, Lcom/bumptech/glide/f;->A(Ls0/i;Lr0/c;Lr0/a;Ljava/util/concurrent/Executor;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v1, "Unhandled class: "

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v1, ", try .as*(Class).transcode(ResourceTranscoder)"

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 184
    .line 185
    const-string v0, "You must call this method on the main thread"

    .line 186
    .line 187
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Ls0/i;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Lv0/e;->a:Lretrofit2/a;

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0, p0, v1}, Lcom/bumptech/glide/f;->A(Ls0/i;Lr0/c;Lr0/a;Ljava/util/concurrent/Executor;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
