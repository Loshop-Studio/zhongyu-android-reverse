.class public final Lb0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public c:Lcom/bumptech/glide/c;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Ljava/lang/Class;

.field public h:Lb0/t;

.field public i:Ly/f;

.field public j:Ljava/util/Map;

.field public k:Ljava/lang/Class;

.field public l:Z

.field public m:Z

.field public n:Ly/c;

.field public o:Lcom/bumptech/glide/Priority;

.field public p:Lb0/o;

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb0/j;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lb0/j;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lb0/j;->m:Z

    .line 2
    .line 3
    iget-object v1, p0, Lb0/j;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lb0/j;->m:Z

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lb0/j;->b()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    if-ge v4, v2, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Lf0/o;

    .line 30
    .line 31
    iget-object v6, v5, Lf0/o;->a:Ly/c;

    .line 32
    .line 33
    iget-object v7, v5, Lf0/o;->b:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    iget-object v5, v5, Lf0/o;->a:Ly/c;

    .line 42
    .line 43
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    move v5, v3

    .line 47
    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-ge v5, v6, :cond_2

    .line 52
    .line 53
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_1

    .line 62
    .line 63
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object v1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lb0/j;->l:Z

    .line 2
    .line 3
    iget-object v1, p0, Lb0/j;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lb0/j;->l:Z

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 16
    .line 17
    iget-object v2, p0, Lb0/j;->d:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/d;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lf0/p;

    .line 35
    .line 36
    iget-object v5, p0, Lb0/j;->d:Ljava/lang/Object;

    .line 37
    .line 38
    iget v6, p0, Lb0/j;->e:I

    .line 39
    .line 40
    iget v7, p0, Lb0/j;->f:I

    .line 41
    .line 42
    iget-object v8, p0, Lb0/j;->i:Ly/f;

    .line 43
    .line 44
    invoke-interface {v4, v5, v6, v7, v8}, Lf0/p;->b(Ljava/lang/Object;IILy/f;)Lf0/o;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v1
.end method

.method public final c(Ljava/lang/Class;)Lb0/e0;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v1, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 8
    .line 9
    iget-object v9, v1, Lb0/j;->g:Ljava/lang/Class;

    .line 10
    .line 11
    iget-object v10, v1, Lb0/j;->k:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v2, v0, Lcom/bumptech/glide/d;->i:Lq0/b;

    .line 14
    .line 15
    iget-object v4, v2, Lq0/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lv0/i;

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Lv0/i;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iput-object v3, v4, Lv0/i;->a:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v9, v4, Lv0/i;->b:Ljava/lang/Class;

    .line 34
    .line 35
    iput-object v10, v4, Lv0/i;->c:Ljava/lang/Class;

    .line 36
    .line 37
    iget-object v5, v2, Lq0/b;->a:Landroidx/collection/ArrayMap;

    .line 38
    .line 39
    monitor-enter v5

    .line 40
    :try_start_0
    iget-object v6, v2, Lq0/b;->a:Landroidx/collection/ArrayMap;

    .line 41
    .line 42
    invoke-virtual {v6, v4}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, Lb0/e0;

    .line 47
    .line 48
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 49
    iget-object v2, v2, Lq0/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v0, Lcom/bumptech/glide/d;->i:Lq0/b;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v2, Lq0/b;->c:Lb0/e0;

    .line 60
    .line 61
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    return-object v11

    .line 68
    :cond_1
    if-nez v6, :cond_f

    .line 69
    .line 70
    new-instance v12, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v2, v0, Lcom/bumptech/glide/d;->c:Landroid/support/v4/media/h;

    .line 76
    .line 77
    invoke-virtual {v2, v3, v9}, Landroid/support/v4/media/h;->y(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    const/4 v2, 0x0

    .line 86
    :goto_0
    if-ge v2, v14, :cond_c

    .line 87
    .line 88
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    add-int/lit8 v16, v2, 0x1

    .line 93
    .line 94
    check-cast v4, Ljava/lang/Class;

    .line 95
    .line 96
    iget-object v2, v0, Lcom/bumptech/glide/d;->f:Lkotlin/jvm/internal/o;

    .line 97
    .line 98
    invoke-virtual {v2, v4, v10}, Lkotlin/jvm/internal/o;->h(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/4 v6, 0x0

    .line 107
    :goto_1
    if-ge v6, v5, :cond_b

    .line 108
    .line 109
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    add-int/lit8 v17, v6, 0x1

    .line 114
    .line 115
    check-cast v7, Ljava/lang/Class;

    .line 116
    .line 117
    iget-object v6, v0, Lcom/bumptech/glide/d;->c:Landroid/support/v4/media/h;

    .line 118
    .line 119
    monitor-enter v6

    .line 120
    :try_start_1
    new-instance v8, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object v11, v6, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v11, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    const/4 v1, 0x0

    .line 134
    :goto_2
    const/16 v18, 0x1

    .line 135
    .line 136
    if-ge v1, v15, :cond_6

    .line 137
    .line 138
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v19

    .line 142
    add-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    move/from16 v20, v1

    .line 145
    .line 146
    move-object/from16 v1, v19

    .line 147
    .line 148
    check-cast v1, Ljava/lang/String;

    .line 149
    .line 150
    move-object/from16 v19, v2

    .line 151
    .line 152
    iget-object v2, v6, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v2, Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Ljava/util/List;

    .line 161
    .line 162
    if-nez v1, :cond_3

    .line 163
    .line 164
    :cond_2
    move-object/from16 v2, v19

    .line 165
    .line 166
    move/from16 v1, v20

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_2

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lq0/c;

    .line 184
    .line 185
    move-object/from16 v21, v1

    .line 186
    .line 187
    iget-object v1, v2, Lq0/c;->a:Ljava/lang/Class;

    .line 188
    .line 189
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_4

    .line 194
    .line 195
    iget-object v1, v2, Lq0/c;->b:Ljava/lang/Class;

    .line 196
    .line 197
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_4

    .line 202
    .line 203
    move/from16 v1, v18

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_4
    const/4 v1, 0x0

    .line 207
    :goto_4
    if-eqz v1, :cond_5

    .line 208
    .line 209
    iget-object v1, v2, Lq0/c;->c:Ly/g;

    .line 210
    .line 211
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    goto/16 :goto_a

    .line 217
    .line 218
    :cond_5
    :goto_5
    move-object/from16 v1, v21

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_6
    move-object/from16 v19, v2

    .line 222
    .line 223
    monitor-exit v6

    .line 224
    iget-object v1, v0, Lcom/bumptech/glide/d;->f:Lkotlin/jvm/internal/o;

    .line 225
    .line 226
    monitor-enter v1

    .line 227
    :try_start_2
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_7

    .line 232
    .line 233
    sget-object v2, Ln0/c;->b:Ln0/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 234
    .line 235
    monitor-exit v1

    .line 236
    goto :goto_8

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    goto/16 :goto_9

    .line 239
    .line 240
    :cond_7
    :try_start_3
    iget-object v2, v1, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    const/4 v11, 0x0

    .line 247
    :goto_6
    if-ge v11, v6, :cond_a

    .line 248
    .line 249
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    add-int/lit8 v11, v11, 0x1

    .line 254
    .line 255
    check-cast v15, Ln0/b;

    .line 256
    .line 257
    move-object/from16 v20, v2

    .line 258
    .line 259
    iget-object v2, v15, Ln0/b;->a:Ljava/lang/Class;

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_8

    .line 266
    .line 267
    iget-object v2, v15, Ln0/b;->b:Ljava/lang/Class;

    .line 268
    .line 269
    invoke-virtual {v7, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_8

    .line 274
    .line 275
    move/from16 v2, v18

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_8
    const/4 v2, 0x0

    .line 279
    :goto_7
    if-eqz v2, :cond_9

    .line 280
    .line 281
    iget-object v2, v15, Ln0/b;->c:Ln0/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 282
    .line 283
    monitor-exit v1

    .line 284
    :goto_8
    new-instance v1, Lb0/l;

    .line 285
    .line 286
    move-object v6, v8

    .line 287
    iget-object v8, v0, Lcom/bumptech/glide/d;->j:Lw0/d;

    .line 288
    .line 289
    move v15, v5

    .line 290
    move-object v5, v7

    .line 291
    move-object v7, v2

    .line 292
    move-object v2, v1

    .line 293
    invoke-direct/range {v2 .. v8}, Lb0/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ln0/a;Lw0/d;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-object/from16 v1, p0

    .line 300
    .line 301
    move-object/from16 v3, p1

    .line 302
    .line 303
    move v5, v15

    .line 304
    move/from16 v6, v17

    .line 305
    .line 306
    move-object/from16 v2, v19

    .line 307
    .line 308
    const/4 v11, 0x0

    .line 309
    goto/16 :goto_1

    .line 310
    .line 311
    :cond_9
    move-object/from16 v3, p1

    .line 312
    .line 313
    move-object/from16 v2, v20

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_a
    move-object v5, v7

    .line 317
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 318
    .line 319
    new-instance v2, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const-string v3, "No transcoder registered to transcode from "

    .line 325
    .line 326
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v3, " to "

    .line 333
    .line 334
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :goto_9
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 349
    throw v0

    .line 350
    :goto_a
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 351
    throw v0

    .line 352
    :cond_b
    move-object/from16 v1, p0

    .line 353
    .line 354
    move-object/from16 v3, p1

    .line 355
    .line 356
    move/from16 v2, v16

    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :cond_c
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_d

    .line 365
    .line 366
    move-object/from16 v3, p1

    .line 367
    .line 368
    move-object v4, v9

    .line 369
    move-object v5, v10

    .line 370
    const/4 v11, 0x0

    .line 371
    goto :goto_b

    .line 372
    :cond_d
    new-instance v2, Lb0/e0;

    .line 373
    .line 374
    iget-object v7, v0, Lcom/bumptech/glide/d;->j:Lw0/d;

    .line 375
    .line 376
    move-object/from16 v3, p1

    .line 377
    .line 378
    move-object v4, v9

    .line 379
    move-object v5, v10

    .line 380
    move-object v6, v12

    .line 381
    invoke-direct/range {v2 .. v7}, Lb0/e0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lw0/d;)V

    .line 382
    .line 383
    .line 384
    move-object v11, v2

    .line 385
    :goto_b
    iget-object v0, v0, Lcom/bumptech/glide/d;->i:Lq0/b;

    .line 386
    .line 387
    iget-object v1, v0, Lq0/b;->a:Landroidx/collection/ArrayMap;

    .line 388
    .line 389
    monitor-enter v1

    .line 390
    :try_start_6
    iget-object v0, v0, Lq0/b;->a:Landroidx/collection/ArrayMap;

    .line 391
    .line 392
    new-instance v2, Lv0/i;

    .line 393
    .line 394
    invoke-direct {v2, v3, v4, v5}, Lv0/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 395
    .line 396
    .line 397
    if-eqz v11, :cond_e

    .line 398
    .line 399
    move-object v3, v11

    .line 400
    goto :goto_c

    .line 401
    :cond_e
    sget-object v3, Lq0/b;->c:Lb0/e0;

    .line 402
    .line 403
    :goto_c
    invoke-virtual {v0, v2, v3}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    monitor-exit v1

    .line 407
    return-object v11

    .line 408
    :catchall_2
    move-exception v0

    .line 409
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 410
    throw v0

    .line 411
    :cond_f
    return-object v6

    .line 412
    :catchall_3
    move-exception v0

    .line 413
    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 414
    throw v0
.end method

.method public final d(Ljava/lang/Object;)Ly/a;
    .locals 7

    .line 1
    iget-object v0, p0, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/bumptech/glide/d;->b:Lkotlin/jvm/internal/o;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v2, v0, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    :cond_0
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    check-cast v5, Lq0/a;

    .line 28
    .line 29
    iget-object v6, v5, Lq0/a;->a:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {v6, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    iget-object v1, v5, Lq0/a;->b:Ly/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    monitor-exit v0

    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-eqz v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    new-instance v0, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
.end method

.method public final e(Ljava/lang/Class;)Ly/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lb0/j;->j:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ly/i;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lb0/j;->j:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ly/i;

    .line 50
    .line 51
    :cond_1
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget-object v0, p0, Lb0/j;->j:Ljava/util/Map;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-boolean v0, p0, Lb0/j;->q:Z

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, "Missing transformation for "

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p1, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_3
    :goto_0
    sget-object p1, Lh0/a;->b:Lh0/a;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_4
    return-object v0
.end method
