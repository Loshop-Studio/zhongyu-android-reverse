.class public final Lb0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/i;
.implements Lz/d;


# instance fields
.field public final a:Lcom/bumptech/glide/load/engine/b;

.field public final b:Lb0/j;

.field public c:I

.field public d:I

.field public e:Ly/c;

.field public f:Ljava/util/List;

.field public g:I

.field public volatile h:Lf0/o;

.field public i:Ljava/io/File;

.field public j:Lb0/i0;


# direct methods
.method public constructor <init>(Lb0/j;Lcom/bumptech/glide/load/engine/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lb0/h0;->d:I

    .line 6
    .line 7
    iput-object p1, p0, Lb0/h0;->b:Lb0/j;

    .line 8
    .line 9
    iput-object p2, p0, Lb0/h0;->a:Lcom/bumptech/glide/load/engine/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb0/h0;->a:Lcom/bumptech/glide/load/engine/b;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/h0;->j:Lb0/i0;

    .line 4
    .line 5
    iget-object v2, p0, Lb0/h0;->h:Lf0/o;

    .line 6
    .line 7
    iget-object v2, v2, Lf0/o;->c:Lz/e;

    .line 8
    .line 9
    sget-object v3, Lcom/bumptech/glide/load/DataSource;->RESOURCE_DISK_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/bumptech/glide/load/engine/b;->a(Ly/c;Ljava/lang/Exception;Lz/e;Lcom/bumptech/glide/load/DataSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/h0;->h:Lf0/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lf0/o;->c:Lz/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lz/e;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lb0/h0;->b:Lb0/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb0/j;->a()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/16 v16, 0x0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget-object v2, v1, Lb0/h0;->b:Lb0/j;

    .line 20
    .line 21
    iget-object v4, v2, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 22
    .line 23
    iget-object v4, v4, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 24
    .line 25
    iget-object v5, v2, Lb0/j;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object v6, v2, Lb0/j;->g:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v2, v2, Lb0/j;->k:Ljava/lang/Class;

    .line 34
    .line 35
    iget-object v7, v4, Lcom/bumptech/glide/d;->h:Landroid/support/v4/media/h;

    .line 36
    .line 37
    iget-object v8, v7, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    check-cast v8, Lv0/i;

    .line 47
    .line 48
    if-nez v8, :cond_1

    .line 49
    .line 50
    new-instance v8, Lv0/i;

    .line 51
    .line 52
    invoke-direct {v8, v5, v6, v2}, Lv0/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iput-object v5, v8, Lv0/i;->a:Ljava/lang/Class;

    .line 57
    .line 58
    iput-object v6, v8, Lv0/i;->b:Ljava/lang/Class;

    .line 59
    .line 60
    iput-object v2, v8, Lv0/i;->c:Ljava/lang/Class;

    .line 61
    .line 62
    :goto_0
    iget-object v10, v7, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, Landroidx/collection/ArrayMap;

    .line 65
    .line 66
    monitor-enter v10

    .line 67
    :try_start_0
    iget-object v11, v7, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v11, Landroidx/collection/ArrayMap;

    .line 70
    .line 71
    invoke-virtual {v11, v8}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    check-cast v11, Ljava/util/List;

    .line 76
    .line 77
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 78
    iget-object v7, v7, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v7, Ljava/util/concurrent/atomic/AtomicReference;

    .line 81
    .line 82
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    if-nez v11, :cond_5

    .line 86
    .line 87
    new-instance v11, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v7, v4, Lcom/bumptech/glide/d;->a:Lf0/s;

    .line 93
    .line 94
    monitor-enter v7

    .line 95
    :try_start_1
    iget-object v8, v7, Lf0/s;->a:Lf0/x;

    .line 96
    .line 97
    invoke-virtual {v8, v5}, Lf0/x;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    monitor-exit v7

    .line 102
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    const/4 v10, 0x0

    .line 107
    :cond_2
    if-ge v10, v7, :cond_4

    .line 108
    .line 109
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    add-int/lit8 v10, v10, 0x1

    .line 114
    .line 115
    check-cast v12, Ljava/lang/Class;

    .line 116
    .line 117
    iget-object v13, v4, Lcom/bumptech/glide/d;->c:Landroid/support/v4/media/h;

    .line 118
    .line 119
    invoke-virtual {v13, v12, v6}, Landroid/support/v4/media/h;->y(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    const/4 v14, 0x0

    .line 128
    :cond_3
    :goto_1
    if-ge v14, v13, :cond_2

    .line 129
    .line 130
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    add-int/lit8 v14, v14, 0x1

    .line 135
    .line 136
    check-cast v15, Ljava/lang/Class;

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    iget-object v3, v4, Lcom/bumptech/glide/d;->f:Lkotlin/jvm/internal/o;

    .line 141
    .line 142
    invoke-virtual {v3, v15, v2}, Lkotlin/jvm/internal/o;->h(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_3

    .line 151
    .line 152
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-nez v3, :cond_3

    .line 157
    .line 158
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    const/16 v16, 0x0

    .line 163
    .line 164
    iget-object v3, v4, Lcom/bumptech/glide/d;->h:Landroid/support/v4/media/h;

    .line 165
    .line 166
    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    iget-object v7, v3, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v8, v7

    .line 173
    check-cast v8, Landroidx/collection/ArrayMap;

    .line 174
    .line 175
    monitor-enter v8

    .line 176
    :try_start_2
    iget-object v3, v3, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v3, Landroidx/collection/ArrayMap;

    .line 179
    .line 180
    new-instance v7, Lv0/i;

    .line 181
    .line 182
    invoke-direct {v7, v5, v6, v2}, Lv0/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v7, v4}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    monitor-exit v8

    .line 189
    goto :goto_2

    .line 190
    :catchall_0
    move-exception v0

    .line 191
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 192
    throw v0

    .line 193
    :catchall_1
    move-exception v0

    .line 194
    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 195
    throw v0

    .line 196
    :cond_5
    const/16 v16, 0x0

    .line 197
    .line 198
    :goto_2
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    const-class v0, Ljava/io/File;

    .line 205
    .line 206
    iget-object v2, v1, Lb0/h0;->b:Lb0/j;

    .line 207
    .line 208
    iget-object v2, v2, Lb0/j;->k:Ljava/lang/Class;

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_6

    .line 215
    .line 216
    goto/16 :goto_5

    .line 217
    .line 218
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 219
    .line 220
    new-instance v2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v3, "Failed to find any load path from "

    .line 223
    .line 224
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iget-object v3, v1, Lb0/h0;->b:Lb0/j;

    .line 228
    .line 229
    iget-object v3, v3, Lb0/j;->d:Ljava/lang/Object;

    .line 230
    .line 231
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v3, " to "

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-object v3, v1, Lb0/h0;->b:Lb0/j;

    .line 244
    .line 245
    iget-object v3, v3, Lb0/j;->k:Ljava/lang/Class;

    .line 246
    .line 247
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_7
    :goto_3
    iget-object v2, v1, Lb0/h0;->f:Ljava/util/List;

    .line 259
    .line 260
    const/4 v3, 0x1

    .line 261
    if-eqz v2, :cond_a

    .line 262
    .line 263
    iget v4, v1, Lb0/h0;->g:I

    .line 264
    .line 265
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-ge v4, v2, :cond_a

    .line 270
    .line 271
    iput-object v9, v1, Lb0/h0;->h:Lf0/o;

    .line 272
    .line 273
    :cond_8
    :goto_4
    if-nez v16, :cond_9

    .line 274
    .line 275
    iget v0, v1, Lb0/h0;->g:I

    .line 276
    .line 277
    iget-object v2, v1, Lb0/h0;->f:Ljava/util/List;

    .line 278
    .line 279
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-ge v0, v2, :cond_9

    .line 284
    .line 285
    iget-object v0, v1, Lb0/h0;->f:Ljava/util/List;

    .line 286
    .line 287
    iget v2, v1, Lb0/h0;->g:I

    .line 288
    .line 289
    add-int/lit8 v4, v2, 0x1

    .line 290
    .line 291
    iput v4, v1, Lb0/h0;->g:I

    .line 292
    .line 293
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, Lf0/p;

    .line 298
    .line 299
    iget-object v2, v1, Lb0/h0;->i:Ljava/io/File;

    .line 300
    .line 301
    iget-object v4, v1, Lb0/h0;->b:Lb0/j;

    .line 302
    .line 303
    iget v5, v4, Lb0/j;->e:I

    .line 304
    .line 305
    iget v6, v4, Lb0/j;->f:I

    .line 306
    .line 307
    iget-object v4, v4, Lb0/j;->i:Ly/f;

    .line 308
    .line 309
    invoke-interface {v0, v2, v5, v6, v4}, Lf0/p;->b(Ljava/lang/Object;IILy/f;)Lf0/o;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iput-object v0, v1, Lb0/h0;->h:Lf0/o;

    .line 314
    .line 315
    iget-object v0, v1, Lb0/h0;->h:Lf0/o;

    .line 316
    .line 317
    if-eqz v0, :cond_8

    .line 318
    .line 319
    iget-object v0, v1, Lb0/h0;->b:Lb0/j;

    .line 320
    .line 321
    iget-object v2, v1, Lb0/h0;->h:Lf0/o;

    .line 322
    .line 323
    iget-object v2, v2, Lf0/o;->c:Lz/e;

    .line 324
    .line 325
    invoke-interface {v2}, Lz/e;->b()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v0, v2}, Lb0/j;->c(Ljava/lang/Class;)Lb0/e0;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-eqz v0, :cond_8

    .line 334
    .line 335
    iget-object v0, v1, Lb0/h0;->h:Lf0/o;

    .line 336
    .line 337
    iget-object v0, v0, Lf0/o;->c:Lz/e;

    .line 338
    .line 339
    iget-object v2, v1, Lb0/h0;->b:Lb0/j;

    .line 340
    .line 341
    iget-object v2, v2, Lb0/j;->o:Lcom/bumptech/glide/Priority;

    .line 342
    .line 343
    invoke-interface {v0, v2, v1}, Lz/e;->e(Lcom/bumptech/glide/Priority;Lz/d;)V

    .line 344
    .line 345
    .line 346
    move/from16 v16, v3

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_9
    return v16

    .line 350
    :cond_a
    iget v2, v1, Lb0/h0;->d:I

    .line 351
    .line 352
    add-int/2addr v2, v3

    .line 353
    iput v2, v1, Lb0/h0;->d:I

    .line 354
    .line 355
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-lt v2, v4, :cond_c

    .line 360
    .line 361
    iget v2, v1, Lb0/h0;->c:I

    .line 362
    .line 363
    add-int/2addr v2, v3

    .line 364
    iput v2, v1, Lb0/h0;->c:I

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-lt v2, v3, :cond_b

    .line 371
    .line 372
    :goto_5
    return v16

    .line 373
    :cond_b
    move/from16 v2, v16

    .line 374
    .line 375
    iput v2, v1, Lb0/h0;->d:I

    .line 376
    .line 377
    :cond_c
    iget v2, v1, Lb0/h0;->c:I

    .line 378
    .line 379
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    move-object/from16 v19, v2

    .line 384
    .line 385
    check-cast v19, Ly/c;

    .line 386
    .line 387
    iget v2, v1, Lb0/h0;->d:I

    .line 388
    .line 389
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    check-cast v2, Ljava/lang/Class;

    .line 394
    .line 395
    iget-object v3, v1, Lb0/h0;->b:Lb0/j;

    .line 396
    .line 397
    invoke-virtual {v3, v2}, Lb0/j;->e(Ljava/lang/Class;)Ly/i;

    .line 398
    .line 399
    .line 400
    move-result-object v23

    .line 401
    new-instance v17, Lb0/i0;

    .line 402
    .line 403
    iget-object v3, v1, Lb0/h0;->b:Lb0/j;

    .line 404
    .line 405
    iget-object v4, v3, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 406
    .line 407
    iget-object v4, v4, Lcom/bumptech/glide/c;->a:Lc0/g;

    .line 408
    .line 409
    iget-object v5, v3, Lb0/j;->n:Ly/c;

    .line 410
    .line 411
    iget v6, v3, Lb0/j;->e:I

    .line 412
    .line 413
    iget v7, v3, Lb0/j;->f:I

    .line 414
    .line 415
    iget-object v8, v3, Lb0/j;->i:Ly/f;

    .line 416
    .line 417
    move-object/from16 v24, v2

    .line 418
    .line 419
    move-object/from16 v18, v4

    .line 420
    .line 421
    move-object/from16 v20, v5

    .line 422
    .line 423
    move/from16 v21, v6

    .line 424
    .line 425
    move/from16 v22, v7

    .line 426
    .line 427
    move-object/from16 v25, v8

    .line 428
    .line 429
    invoke-direct/range {v17 .. v25}, Lb0/i0;-><init>(Lc0/g;Ly/c;Ly/c;IILy/i;Ljava/lang/Class;Ly/f;)V

    .line 430
    .line 431
    .line 432
    move-object/from16 v4, v17

    .line 433
    .line 434
    move-object/from16 v2, v19

    .line 435
    .line 436
    iput-object v4, v1, Lb0/h0;->j:Lb0/i0;

    .line 437
    .line 438
    iget-object v3, v3, Lb0/j;->h:Lb0/t;

    .line 439
    .line 440
    invoke-virtual {v3}, Lb0/t;->a()Ld0/a;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    iget-object v4, v1, Lb0/h0;->j:Lb0/i0;

    .line 445
    .line 446
    invoke-interface {v3, v4}, Ld0/a;->a(Ly/c;)Ljava/io/File;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    iput-object v3, v1, Lb0/h0;->i:Ljava/io/File;

    .line 451
    .line 452
    if-eqz v3, :cond_d

    .line 453
    .line 454
    iput-object v2, v1, Lb0/h0;->e:Ly/c;

    .line 455
    .line 456
    iget-object v2, v1, Lb0/h0;->b:Lb0/j;

    .line 457
    .line 458
    iget-object v2, v2, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 459
    .line 460
    iget-object v2, v2, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 461
    .line 462
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/d;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    iput-object v2, v1, Lb0/h0;->f:Ljava/util/List;

    .line 467
    .line 468
    const/4 v2, 0x0

    .line 469
    iput v2, v1, Lb0/h0;->g:I

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_d
    const/4 v2, 0x0

    .line 473
    :goto_6
    move/from16 v16, v2

    .line 474
    .line 475
    goto/16 :goto_3

    .line 476
    .line 477
    :catchall_2
    move-exception v0

    .line 478
    :try_start_4
    monitor-exit v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 479
    throw v0
.end method

.method public final o(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb0/h0;->a:Lcom/bumptech/glide/load/engine/b;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/h0;->e:Ly/c;

    .line 4
    .line 5
    iget-object v2, p0, Lb0/h0;->h:Lf0/o;

    .line 6
    .line 7
    iget-object v3, v2, Lf0/o;->c:Lz/e;

    .line 8
    .line 9
    sget-object v4, Lcom/bumptech/glide/load/DataSource;->RESOURCE_DISK_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 10
    .line 11
    iget-object v5, p0, Lb0/h0;->j:Lb0/i0;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/b;->b(Ly/c;Ljava/lang/Object;Lz/e;Lcom/bumptech/glide/load/DataSource;Ly/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
