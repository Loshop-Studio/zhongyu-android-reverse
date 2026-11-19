.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile j:Lcom/bumptech/glide/b;

.field public static volatile k:Z


# instance fields
.field public final a:Lcom/bumptech/glide/load/engine/c;

.field public final b:Lc0/b;

.field public final c:Ld0/f;

.field public final d:Lcom/bumptech/glide/c;

.field public final e:Lcom/bumptech/glide/d;

.field public final f:Lc0/g;

.field public final g:Lo0/h;

.field public final h:Lio/reactivex/internal/operators/observable/g;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/c;Ld0/f;Lc0/b;Lc0/g;Lo0/h;Lio/reactivex/internal/operators/observable/g;Lio/reactivex/internal/operators/observable/h;Landroidx/collection/ArrayMap;Ljava/util/List;)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-object/from16 v4, p5

    .line 8
    .line 9
    const-string v2, "Gif"

    .line 10
    .line 11
    const-class v5, Lx/d;

    .line 12
    .line 13
    const-string v6, "BitmapDrawable"

    .line 14
    .line 15
    const-class v7, Ljava/lang/String;

    .line 16
    .line 17
    const-class v8, Ljava/lang/Integer;

    .line 18
    .line 19
    const-string v9, "legacy_append"

    .line 20
    .line 21
    const-class v10, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 22
    .line 23
    const-class v11, [B

    .line 24
    .line 25
    const-class v12, Landroid/content/res/AssetFileDescriptor;

    .line 26
    .line 27
    const-class v13, Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    const-class v14, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    const-string v15, "Bitmap"

    .line 32
    .line 33
    move-object/from16 v16, v11

    .line 34
    .line 35
    const-class v11, Ljava/io/File;

    .line 36
    .line 37
    move-object/from16 v17, v7

    .line 38
    .line 39
    const-class v7, Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    move-object/from16 v18, v8

    .line 42
    .line 43
    const-class v8, Landroid/os/ParcelFileDescriptor;

    .line 44
    .line 45
    move-object/from16 v19, v11

    .line 46
    .line 47
    const-class v11, Landroid/graphics/Bitmap;

    .line 48
    .line 49
    move-object/from16 v20, v9

    .line 50
    .line 51
    const-class v9, Landroid/net/Uri;

    .line 52
    .line 53
    move-object/from16 v21, v9

    .line 54
    .line 55
    const-class v9, Ljava/io/InputStream;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    move-object/from16 v22, v13

    .line 61
    .line 62
    new-instance v13, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v13, v1, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 68
    .line 69
    move-object/from16 v13, p2

    .line 70
    .line 71
    iput-object v13, v1, Lcom/bumptech/glide/b;->a:Lcom/bumptech/glide/load/engine/c;

    .line 72
    .line 73
    iput-object v0, v1, Lcom/bumptech/glide/b;->b:Lc0/b;

    .line 74
    .line 75
    iput-object v4, v1, Lcom/bumptech/glide/b;->f:Lc0/g;

    .line 76
    .line 77
    move-object/from16 v13, p3

    .line 78
    .line 79
    iput-object v13, v1, Lcom/bumptech/glide/b;->c:Ld0/f;

    .line 80
    .line 81
    move-object/from16 v13, p6

    .line 82
    .line 83
    iput-object v13, v1, Lcom/bumptech/glide/b;->g:Lo0/h;

    .line 84
    .line 85
    move-object/from16 v13, p7

    .line 86
    .line 87
    iput-object v13, v1, Lcom/bumptech/glide/b;->h:Lio/reactivex/internal/operators/observable/g;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    move-object/from16 v23, v5

    .line 94
    .line 95
    new-instance v5, Lcom/bumptech/glide/d;

    .line 96
    .line 97
    invoke-direct {v5}, Lcom/bumptech/glide/d;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object v5, v1, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/d;

    .line 101
    .line 102
    new-instance v1, Li0/j;

    .line 103
    .line 104
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    move-object/from16 v24, v2

    .line 108
    .line 109
    iget-object v2, v5, Lcom/bumptech/glide/d;->g:Lkotlin/jvm/internal/o;

    .line 110
    .line 111
    monitor-enter v2

    .line 112
    move-object/from16 v25, v10

    .line 113
    .line 114
    :try_start_0
    iget-object v10, v2, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 117
    .line 118
    .line 119
    monitor-exit v2

    .line 120
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    const/16 v2, 0x1b

    .line 123
    .line 124
    if-lt v1, v2, :cond_0

    .line 125
    .line 126
    new-instance v2, Li0/q;

    .line 127
    .line 128
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object v10, v5, Lcom/bumptech/glide/d;->g:Lkotlin/jvm/internal/o;

    .line 132
    .line 133
    monitor-enter v10

    .line 134
    move/from16 p3, v1

    .line 135
    .line 136
    :try_start_1
    iget-object v1, v10, Lkotlin/jvm/internal/o;->a:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .line 140
    .line 141
    monitor-exit v10

    .line 142
    goto :goto_0

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    :try_start_2
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    throw v0

    .line 146
    :cond_0
    move/from16 p3, v1

    .line 147
    .line 148
    :goto_0
    invoke-virtual {v5}, Lcom/bumptech/glide/d;->e()Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    new-instance v2, Lm0/a;

    .line 153
    .line 154
    invoke-direct {v2, v3, v1, v0, v4}, Lm0/a;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lc0/b;Lc0/g;)V

    .line 155
    .line 156
    .line 157
    new-instance v10, Li0/z;

    .line 158
    .line 159
    move-object/from16 p6, v1

    .line 160
    .line 161
    new-instance v1, Lio/reactivex/internal/operators/observable/c;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-direct {v10, v0, v1}, Li0/z;-><init>(Lc0/b;Li0/y;)V

    .line 167
    .line 168
    .line 169
    new-instance v1, Li0/m;

    .line 170
    .line 171
    move-object/from16 p7, v2

    .line 172
    .line 173
    invoke-virtual {v5}, Lcom/bumptech/glide/d;->e()Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    move-object/from16 v26, v6

    .line 178
    .line 179
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-direct {v1, v2, v6, v0, v4}, Li0/m;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lc0/b;Lc0/g;)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Li0/e;

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    invoke-direct {v2, v1, v6}, Li0/e;-><init>(Li0/m;I)V

    .line 190
    .line 191
    .line 192
    new-instance v6, Li0/a;

    .line 193
    .line 194
    move-object/from16 v27, v14

    .line 195
    .line 196
    const/4 v14, 0x2

    .line 197
    invoke-direct {v6, v14, v1, v4}, Li0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    new-instance v14, Lk0/b;

    .line 201
    .line 202
    invoke-direct {v14, v3}, Lk0/b;-><init>(Landroid/content/Context;)V

    .line 203
    .line 204
    .line 205
    new-instance v3, Lf0/y;

    .line 206
    .line 207
    move-object/from16 v28, v14

    .line 208
    .line 209
    const/4 v14, 0x2

    .line 210
    invoke-direct {v3, v13, v14}, Lf0/y;-><init>(Landroid/content/res/Resources;I)V

    .line 211
    .line 212
    .line 213
    new-instance v14, Lf0/y;

    .line 214
    .line 215
    move-object/from16 v29, v3

    .line 216
    .line 217
    const/4 v3, 0x3

    .line 218
    invoke-direct {v14, v13, v3}, Lf0/y;-><init>(Landroid/content/res/Resources;I)V

    .line 219
    .line 220
    .line 221
    new-instance v3, Lf0/y;

    .line 222
    .line 223
    move-object/from16 v30, v14

    .line 224
    .line 225
    const/4 v14, 0x1

    .line 226
    invoke-direct {v3, v13, v14}, Lf0/y;-><init>(Landroid/content/res/Resources;I)V

    .line 227
    .line 228
    .line 229
    new-instance v14, Lf0/y;

    .line 230
    .line 231
    move-object/from16 v31, v3

    .line 232
    .line 233
    const/4 v3, 0x0

    .line 234
    invoke-direct {v14, v13, v3}, Lf0/y;-><init>(Landroid/content/res/Resources;I)V

    .line 235
    .line 236
    .line 237
    new-instance v3, Li0/b;

    .line 238
    .line 239
    invoke-direct {v3, v4}, Li0/b;-><init>(Lc0/g;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v32, v14

    .line 243
    .line 244
    new-instance v14, Ld2/c;

    .line 245
    .line 246
    move-object/from16 v33, v13

    .line 247
    .line 248
    const/4 v13, 0x2

    .line 249
    invoke-direct {v14, v13}, Ld2/c;-><init>(I)V

    .line 250
    .line 251
    .line 252
    new-instance v13, Ln0/c;

    .line 253
    .line 254
    move-object/from16 v34, v14

    .line 255
    .line 256
    const/4 v14, 0x1

    .line 257
    invoke-direct {v13, v14}, Ln0/c;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    move-object/from16 v35, v13

    .line 265
    .line 266
    new-instance v13, Lf0/a0;

    .line 267
    .line 268
    move-object/from16 v36, v14

    .line 269
    .line 270
    const/4 v14, 0x5

    .line 271
    invoke-direct {v13, v14}, Lf0/a0;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v7, v13}, Lcom/bumptech/glide/d;->b(Ljava/lang/Class;Ly/a;)V

    .line 275
    .line 276
    .line 277
    new-instance v13, Lo2/a;

    .line 278
    .line 279
    const/16 v14, 0x11

    .line 280
    .line 281
    invoke-direct {v13, v4, v14}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v9, v13}, Lcom/bumptech/glide/d;->b(Ljava/lang/Class;Ly/a;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5, v15, v7, v11, v2}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v5, v15, v9, v11, v6}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 291
    .line 292
    .line 293
    new-instance v13, Li0/e;

    .line 294
    .line 295
    const/4 v14, 0x1

    .line 296
    invoke-direct {v13, v1, v14}, Li0/e;-><init>(Li0/m;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5, v15, v8, v11, v13}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5, v15, v8, v11, v10}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 303
    .line 304
    .line 305
    new-instance v1, Li0/z;

    .line 306
    .line 307
    new-instance v13, Lio/reactivex/internal/operators/observable/g;

    .line 308
    .line 309
    const/4 v14, 0x5

    .line 310
    invoke-direct {v13, v14}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 311
    .line 312
    .line 313
    invoke-direct {v1, v0, v13}, Li0/z;-><init>(Lc0/b;Li0/y;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v5, v15, v12, v11, v1}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 317
    .line 318
    .line 319
    sget-object v1, Lf0/a0;->b:Lf0/a0;

    .line 320
    .line 321
    invoke-virtual {v5, v11, v11, v1}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 322
    .line 323
    .line 324
    new-instance v13, Li0/w;

    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    invoke-direct {v13, v14}, Li0/w;-><init>(I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v15, v11, v11, v13}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v11, v3}, Lcom/bumptech/glide/d;->c(Ljava/lang/Class;Ly/h;)V

    .line 334
    .line 335
    .line 336
    new-instance v13, Li0/a;

    .line 337
    .line 338
    move-object/from16 v14, v33

    .line 339
    .line 340
    invoke-direct {v13, v14, v2}, Li0/a;-><init>(Landroid/content/res/Resources;Ly/g;)V

    .line 341
    .line 342
    .line 343
    move-object/from16 v2, v26

    .line 344
    .line 345
    move-object/from16 v26, v12

    .line 346
    .line 347
    move-object/from16 v12, v27

    .line 348
    .line 349
    invoke-virtual {v5, v2, v7, v12, v13}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 350
    .line 351
    .line 352
    new-instance v13, Li0/a;

    .line 353
    .line 354
    invoke-direct {v13, v14, v6}, Li0/a;-><init>(Landroid/content/res/Resources;Ly/g;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v2, v9, v12, v13}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 358
    .line 359
    .line 360
    new-instance v6, Li0/a;

    .line 361
    .line 362
    invoke-direct {v6, v14, v10}, Li0/a;-><init>(Landroid/content/res/Resources;Ly/g;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v2, v8, v12, v6}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 366
    .line 367
    .line 368
    new-instance v2, Landroid/support/v4/media/h;

    .line 369
    .line 370
    const/16 v6, 0xb

    .line 371
    .line 372
    const/4 v10, 0x0

    .line 373
    invoke-direct {v2, v6, v0, v10, v3}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;ZLjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, v12, v2}, Lcom/bumptech/glide/d;->c(Ljava/lang/Class;Ly/h;)V

    .line 377
    .line 378
    .line 379
    new-instance v2, Lm0/g;

    .line 380
    .line 381
    move-object/from16 v3, p6

    .line 382
    .line 383
    move-object/from16 v6, p7

    .line 384
    .line 385
    invoke-direct {v2, v3, v6, v4}, Lm0/g;-><init>(Ljava/util/ArrayList;Lm0/a;Lc0/g;)V

    .line 386
    .line 387
    .line 388
    move-object/from16 v3, v24

    .line 389
    .line 390
    move-object/from16 v10, v25

    .line 391
    .line 392
    invoke-virtual {v5, v3, v9, v10, v2}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v3, v7, v10, v6}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 396
    .line 397
    .line 398
    new-instance v2, Lc8/c;

    .line 399
    .line 400
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5, v10, v2}, Lcom/bumptech/glide/d;->c(Ljava/lang/Class;Ly/h;)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v2, v23

    .line 407
    .line 408
    invoke-virtual {v5, v2, v2, v1}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 409
    .line 410
    .line 411
    new-instance v3, Lk0/b;

    .line 412
    .line 413
    invoke-direct {v3, v0}, Lk0/b;-><init>(Lc0/b;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v5, v15, v2, v11, v3}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v2, v20

    .line 420
    .line 421
    move-object/from16 v6, v21

    .line 422
    .line 423
    move-object/from16 v3, v22

    .line 424
    .line 425
    move-object/from16 v13, v28

    .line 426
    .line 427
    invoke-virtual {v5, v2, v6, v3, v13}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 428
    .line 429
    .line 430
    new-instance v15, Li0/a;

    .line 431
    .line 432
    const/4 v10, 0x1

    .line 433
    invoke-direct {v15, v10, v13, v0}, Li0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v5, v2, v6, v11, v15}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 437
    .line 438
    .line 439
    new-instance v10, Lj0/a;

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    invoke-direct {v10, v13}, Lj0/a;-><init>(I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v5, v10}, Lcom/bumptech/glide/d;->h(Lz/f;)V

    .line 446
    .line 447
    .line 448
    new-instance v10, Lf0/a0;

    .line 449
    .line 450
    const/4 v13, 0x6

    .line 451
    invoke-direct {v10, v13}, Lf0/a0;-><init>(I)V

    .line 452
    .line 453
    .line 454
    move-object/from16 v13, v19

    .line 455
    .line 456
    invoke-virtual {v5, v13, v7, v10}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 457
    .line 458
    .line 459
    new-instance v10, Lf0/e;

    .line 460
    .line 461
    new-instance v15, Lf0/a0;

    .line 462
    .line 463
    const/16 v0, 0x9

    .line 464
    .line 465
    invoke-direct {v15, v0}, Lf0/a0;-><init>(I)V

    .line 466
    .line 467
    .line 468
    invoke-direct {v10, v15}, Lc0/a;-><init>(Lf0/a0;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v5, v13, v9, v10}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 472
    .line 473
    .line 474
    new-instance v0, Li0/w;

    .line 475
    .line 476
    const/4 v10, 0x2

    .line 477
    invoke-direct {v0, v10}, Li0/w;-><init>(I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v5, v2, v13, v13, v0}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 481
    .line 482
    .line 483
    new-instance v0, Lf0/e;

    .line 484
    .line 485
    new-instance v10, Lf0/a0;

    .line 486
    .line 487
    const/16 v15, 0x8

    .line 488
    .line 489
    invoke-direct {v10, v15}, Lf0/a0;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-direct {v0, v10}, Lc0/a;-><init>(Lf0/a0;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5, v13, v8, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v5, v13, v13, v1}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 499
    .line 500
    .line 501
    new-instance v0, Lz/l;

    .line 502
    .line 503
    invoke-direct {v0, v4}, Lz/l;-><init>(Lc0/g;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v5, v0}, Lcom/bumptech/glide/d;->h(Lz/f;)V

    .line 507
    .line 508
    .line 509
    new-instance v0, Lj0/a;

    .line 510
    .line 511
    const/4 v10, 0x2

    .line 512
    invoke-direct {v0, v10}, Lj0/a;-><init>(I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v5, v0}, Lcom/bumptech/glide/d;->h(Lz/f;)V

    .line 516
    .line 517
    .line 518
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 519
    .line 520
    move-object/from16 v10, v29

    .line 521
    .line 522
    invoke-virtual {v5, v0, v9, v10}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 523
    .line 524
    .line 525
    move-object/from16 v15, v31

    .line 526
    .line 527
    invoke-virtual {v5, v0, v8, v15}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 528
    .line 529
    .line 530
    move-object/from16 v4, v18

    .line 531
    .line 532
    invoke-virtual {v5, v4, v9, v10}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v4, v8, v15}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 536
    .line 537
    .line 538
    move-object/from16 v10, v30

    .line 539
    .line 540
    invoke-virtual {v5, v4, v6, v10}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 541
    .line 542
    .line 543
    move-object/from16 v18, v11

    .line 544
    .line 545
    move-object/from16 v15, v26

    .line 546
    .line 547
    move-object/from16 v11, v32

    .line 548
    .line 549
    invoke-virtual {v5, v0, v15, v11}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v5, v4, v15, v11}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v5, v0, v6, v10}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 556
    .line 557
    .line 558
    new-instance v0, Lo2/a;

    .line 559
    .line 560
    const/16 v4, 0xf

    .line 561
    .line 562
    invoke-direct {v0, v4}, Lo2/a;-><init>(I)V

    .line 563
    .line 564
    .line 565
    move-object/from16 v4, v17

    .line 566
    .line 567
    invoke-virtual {v5, v4, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 568
    .line 569
    .line 570
    new-instance v0, Lo2/a;

    .line 571
    .line 572
    const/16 v10, 0xf

    .line 573
    .line 574
    invoke-direct {v0, v10}, Lo2/a;-><init>(I)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 578
    .line 579
    .line 580
    new-instance v0, Lf0/a0;

    .line 581
    .line 582
    const/16 v10, 0xc

    .line 583
    .line 584
    invoke-direct {v0, v10}, Lf0/a0;-><init>(I)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v5, v4, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 588
    .line 589
    .line 590
    new-instance v0, Lf0/a0;

    .line 591
    .line 592
    const/16 v10, 0xb

    .line 593
    .line 594
    invoke-direct {v0, v10}, Lf0/a0;-><init>(I)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5, v4, v8, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 598
    .line 599
    .line 600
    new-instance v0, Lf0/a0;

    .line 601
    .line 602
    const/16 v10, 0xa

    .line 603
    .line 604
    invoke-direct {v0, v10}, Lf0/a0;-><init>(I)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v5, v4, v15, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 608
    .line 609
    .line 610
    new-instance v0, Lio/reactivex/internal/operators/observable/c;

    .line 611
    .line 612
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 616
    .line 617
    .line 618
    new-instance v0, Lf0/a;

    .line 619
    .line 620
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    const/4 v10, 0x1

    .line 625
    invoke-direct {v0, v4, v10}, Lf0/a;-><init>(Landroid/content/res/AssetManager;I)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 629
    .line 630
    .line 631
    new-instance v0, Lf0/a;

    .line 632
    .line 633
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    const/4 v10, 0x0

    .line 638
    invoke-direct {v0, v4, v10}, Lf0/a;-><init>(Landroid/content/res/AssetManager;I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v5, v6, v8, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 642
    .line 643
    .line 644
    new-instance v0, Ld0/e;

    .line 645
    .line 646
    const/4 v4, 0x2

    .line 647
    move-object/from16 v10, p1

    .line 648
    .line 649
    invoke-direct {v0, v10, v4}, Ld0/e;-><init>(Landroid/content/Context;I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 653
    .line 654
    .line 655
    new-instance v0, Ld0/e;

    .line 656
    .line 657
    const/4 v4, 0x3

    .line 658
    invoke-direct {v0, v10, v4}, Ld0/e;-><init>(Landroid/content/Context;I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 662
    .line 663
    .line 664
    const/16 v0, 0x1d

    .line 665
    .line 666
    move/from16 v4, p3

    .line 667
    .line 668
    if-lt v4, v0, :cond_1

    .line 669
    .line 670
    new-instance v0, Lg0/c;

    .line 671
    .line 672
    invoke-direct {v0, v10, v9}, Lg0/c;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 676
    .line 677
    .line 678
    new-instance v0, Lg0/c;

    .line 679
    .line 680
    invoke-direct {v0, v10, v8}, Lg0/c;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v5, v6, v8, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 684
    .line 685
    .line 686
    :cond_1
    new-instance v0, Lf0/c0;

    .line 687
    .line 688
    const/4 v4, 0x2

    .line 689
    move-object/from16 v11, v36

    .line 690
    .line 691
    invoke-direct {v0, v11, v4}, Lf0/c0;-><init>(Landroid/content/ContentResolver;I)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 695
    .line 696
    .line 697
    new-instance v0, Lf0/c0;

    .line 698
    .line 699
    const/4 v4, 0x1

    .line 700
    invoke-direct {v0, v11, v4}, Lf0/c0;-><init>(Landroid/content/ContentResolver;I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v5, v6, v8, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 704
    .line 705
    .line 706
    new-instance v0, Lf0/c0;

    .line 707
    .line 708
    const/4 v4, 0x0

    .line 709
    invoke-direct {v0, v11, v4}, Lf0/c0;-><init>(Landroid/content/ContentResolver;I)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v5, v6, v15, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 713
    .line 714
    .line 715
    new-instance v0, Lf0/a0;

    .line 716
    .line 717
    const/16 v4, 0xd

    .line 718
    .line 719
    invoke-direct {v0, v4}, Lf0/a0;-><init>(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v5, v6, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 723
    .line 724
    .line 725
    const-class v0, Ljava/net/URL;

    .line 726
    .line 727
    new-instance v4, Lio/reactivex/internal/operators/observable/g;

    .line 728
    .line 729
    const/4 v8, 0x4

    .line 730
    invoke-direct {v4, v8}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v5, v0, v9, v4}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 734
    .line 735
    .line 736
    new-instance v0, Ld0/e;

    .line 737
    .line 738
    const/4 v4, 0x1

    .line 739
    invoke-direct {v0, v10, v4}, Ld0/e;-><init>(Landroid/content/Context;I)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v5, v6, v13, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 743
    .line 744
    .line 745
    const-class v0, Lf0/f;

    .line 746
    .line 747
    new-instance v4, Lo2/a;

    .line 748
    .line 749
    const/16 v8, 0x12

    .line 750
    .line 751
    invoke-direct {v4, v8}, Lo2/a;-><init>(I)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v5, v0, v9, v4}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 755
    .line 756
    .line 757
    new-instance v0, Lf0/a0;

    .line 758
    .line 759
    const/4 v4, 0x2

    .line 760
    invoke-direct {v0, v4}, Lf0/a0;-><init>(I)V

    .line 761
    .line 762
    .line 763
    move-object/from16 v4, v16

    .line 764
    .line 765
    invoke-virtual {v5, v4, v7, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 766
    .line 767
    .line 768
    new-instance v0, Lf0/a0;

    .line 769
    .line 770
    const/4 v7, 0x4

    .line 771
    invoke-direct {v0, v7}, Lf0/a0;-><init>(I)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v5, v4, v9, v0}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v5, v6, v6, v1}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v5, v3, v3, v1}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lf0/q;)V

    .line 781
    .line 782
    .line 783
    new-instance v0, Li0/w;

    .line 784
    .line 785
    const/4 v1, 0x1

    .line 786
    invoke-direct {v0, v1}, Li0/w;-><init>(I)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v5, v2, v3, v3, v0}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 790
    .line 791
    .line 792
    new-instance v0, Lf0/y;

    .line 793
    .line 794
    const/4 v1, 0x4

    .line 795
    invoke-direct {v0, v14, v1}, Lf0/y;-><init>(Landroid/content/res/Resources;I)V

    .line 796
    .line 797
    .line 798
    move-object/from16 v1, v18

    .line 799
    .line 800
    invoke-virtual {v5, v1, v12, v0}, Lcom/bumptech/glide/d;->g(Ljava/lang/Class;Ljava/lang/Class;Ln0/a;)V

    .line 801
    .line 802
    .line 803
    move-object/from16 v0, v34

    .line 804
    .line 805
    invoke-virtual {v5, v1, v4, v0}, Lcom/bumptech/glide/d;->g(Ljava/lang/Class;Ljava/lang/Class;Ln0/a;)V

    .line 806
    .line 807
    .line 808
    new-instance v2, Lb0/g;

    .line 809
    .line 810
    const/16 v6, 0x9

    .line 811
    .line 812
    move-object/from16 v7, p4

    .line 813
    .line 814
    move-object/from16 v8, v35

    .line 815
    .line 816
    invoke-direct {v2, v7, v0, v6, v8}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v5, v3, v4, v2}, Lcom/bumptech/glide/d;->g(Ljava/lang/Class;Ljava/lang/Class;Ln0/a;)V

    .line 820
    .line 821
    .line 822
    move-object/from16 v0, v25

    .line 823
    .line 824
    invoke-virtual {v5, v0, v4, v8}, Lcom/bumptech/glide/d;->g(Ljava/lang/Class;Ljava/lang/Class;Ln0/a;)V

    .line 825
    .line 826
    .line 827
    new-instance v0, Li0/z;

    .line 828
    .line 829
    new-instance v2, Lio/reactivex/internal/operators/observable/h;

    .line 830
    .line 831
    const/4 v3, 0x5

    .line 832
    invoke-direct {v2, v3}, Lio/reactivex/internal/operators/observable/h;-><init>(I)V

    .line 833
    .line 834
    .line 835
    invoke-direct {v0, v7, v2}, Li0/z;-><init>(Lc0/b;Li0/y;)V

    .line 836
    .line 837
    .line 838
    const-class v2, Ljava/nio/ByteBuffer;

    .line 839
    .line 840
    const-string v3, "legacy_append"

    .line 841
    .line 842
    invoke-virtual {v5, v3, v2, v1, v0}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 843
    .line 844
    .line 845
    new-instance v1, Li0/a;

    .line 846
    .line 847
    invoke-direct {v1, v14, v0}, Li0/a;-><init>(Landroid/content/res/Resources;Ly/g;)V

    .line 848
    .line 849
    .line 850
    const-class v0, Ljava/nio/ByteBuffer;

    .line 851
    .line 852
    const-string v2, "legacy_append"

    .line 853
    .line 854
    invoke-virtual {v5, v2, v0, v12, v1}, Lcom/bumptech/glide/d;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly/g;)V

    .line 855
    .line 856
    .line 857
    new-instance v6, Lc8/c;

    .line 858
    .line 859
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 860
    .line 861
    .line 862
    new-instance v2, Lcom/bumptech/glide/c;

    .line 863
    .line 864
    move-object/from16 v4, p5

    .line 865
    .line 866
    move-object/from16 v7, p8

    .line 867
    .line 868
    move-object/from16 v8, p9

    .line 869
    .line 870
    move-object/from16 v9, p10

    .line 871
    .line 872
    move-object v3, v10

    .line 873
    move-object/from16 v10, p2

    .line 874
    .line 875
    invoke-direct/range {v2 .. v10}, Lcom/bumptech/glide/c;-><init>(Landroid/content/Context;Lc0/g;Lcom/bumptech/glide/d;Lc8/c;Lio/reactivex/internal/operators/observable/h;Landroidx/collection/ArrayMap;Ljava/util/List;Lcom/bumptech/glide/load/engine/c;)V

    .line 876
    .line 877
    .line 878
    move-object/from16 v1, p0

    .line 879
    .line 880
    iput-object v2, v1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/c;

    .line 881
    .line 882
    return-void

    .line 883
    :catchall_1
    move-exception v0

    .line 884
    move-object/from16 v1, p0

    .line 885
    .line 886
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 887
    throw v0

    .line 888
    :catchall_2
    move-exception v0

    .line 889
    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 28

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/b;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/bumptech/glide/b;->k:Z

    .line 7
    .line 8
    new-instance v10, Landroidx/collection/ArrayMap;

    .line 9
    .line 10
    invoke-direct {v10}, Landroidx/collection/ArrayMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v9, Lio/reactivex/internal/operators/observable/h;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v9, v1}, Lio/reactivex/internal/operators/observable/h;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    const-string v1, "Got app info metadata: "

    .line 26
    .line 27
    const-string v3, "ManifestParser"

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    const-string v5, "Loading Glide modules"

    .line 37
    .line 38
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    new-instance v12, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const/16 v7, 0x80

    .line 55
    .line 56
    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget-object v6, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 61
    .line 62
    const/4 v7, 0x2

    .line 63
    if-nez v6, :cond_1

    .line 64
    .line 65
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    const-string v1, "Got null app info metadata"

    .line 72
    .line 73
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-static {v3, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    new-instance v6, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_4

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    const-string v8, "GlideModule"

    .line 123
    .line 124
    iget-object v11, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-virtual {v11, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    invoke-static {v6}, Lv7/d;->r(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    throw v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    :cond_4
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    const-string v1, "Finished loading Glide modules"

    .line 149
    .line 150
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    :cond_5
    :goto_1
    if-eqz p1, :cond_7

    .line 154
    .line 155
    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->A()Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_7

    .line 164
    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->A()Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v0, Ljava/lang/ClassCastException;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 189
    .line 190
    .line 191
    throw v0

    .line 192
    :cond_7
    :goto_2
    const-string v1, "Glide"

    .line 193
    .line 194
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_9

    .line 199
    .line 200
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v0, Ljava/lang/ClassCastException;

    .line 219
    .line 220
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_9
    :goto_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-nez v3, :cond_12

    .line 233
    .line 234
    sget v1, Le0/b;->c:I

    .line 235
    .line 236
    const/4 v3, 0x4

    .line 237
    if-nez v1, :cond_a

    .line 238
    .line 239
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    sput v1, Le0/b;->c:I

    .line 252
    .line 253
    :cond_a
    sget v14, Le0/b;->c:I

    .line 254
    .line 255
    const-string/jumbo v1, "source"

    .line 256
    .line 257
    .line 258
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-nez v4, :cond_11

    .line 263
    .line 264
    new-instance v13, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 265
    .line 266
    sget-object v20, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 267
    .line 268
    new-instance v19, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 269
    .line 270
    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 271
    .line 272
    .line 273
    new-instance v4, Le0/a;

    .line 274
    .line 275
    const/4 v5, 0x0

    .line 276
    invoke-direct {v4, v1, v5}, Le0/a;-><init>(Ljava/lang/String;Z)V

    .line 277
    .line 278
    .line 279
    const-wide/16 v16, 0x0

    .line 280
    .line 281
    move v15, v14

    .line 282
    move-object/from16 v18, v20

    .line 283
    .line 284
    move-object/from16 v20, v4

    .line 285
    .line 286
    invoke-direct/range {v13 .. v20}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v20, v18

    .line 290
    .line 291
    new-instance v1, Le0/b;

    .line 292
    .line 293
    invoke-direct {v1, v13}, Le0/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 294
    .line 295
    .line 296
    const-string v4, "disk-cache"

    .line 297
    .line 298
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-nez v6, :cond_10

    .line 303
    .line 304
    new-instance v15, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 305
    .line 306
    new-instance v21, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 307
    .line 308
    invoke-direct/range {v21 .. v21}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 309
    .line 310
    .line 311
    new-instance v6, Le0/a;

    .line 312
    .line 313
    const/4 v8, 0x1

    .line 314
    invoke-direct {v6, v4, v8}, Le0/a;-><init>(Ljava/lang/String;Z)V

    .line 315
    .line 316
    .line 317
    const-wide/16 v18, 0x0

    .line 318
    .line 319
    move/from16 v17, v8

    .line 320
    .line 321
    move-object/from16 v22, v6

    .line 322
    .line 323
    move/from16 v16, v8

    .line 324
    .line 325
    invoke-direct/range {v15 .. v22}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 326
    .line 327
    .line 328
    new-instance v4, Le0/b;

    .line 329
    .line 330
    invoke-direct {v4, v15}, Le0/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 331
    .line 332
    .line 333
    sget v6, Le0/b;->c:I

    .line 334
    .line 335
    if-nez v6, :cond_b

    .line 336
    .line 337
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    invoke-virtual {v6}, Ljava/lang/Runtime;->availableProcessors()I

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    sput v6, Le0/b;->c:I

    .line 350
    .line 351
    :cond_b
    sget v6, Le0/b;->c:I

    .line 352
    .line 353
    if-lt v6, v3, :cond_c

    .line 354
    .line 355
    move/from16 v16, v7

    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_c
    move/from16 v16, v0

    .line 359
    .line 360
    :goto_4
    const-string v3, "animation"

    .line 361
    .line 362
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    if-nez v6, :cond_f

    .line 367
    .line 368
    new-instance v15, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 369
    .line 370
    new-instance v21, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 371
    .line 372
    invoke-direct/range {v21 .. v21}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 373
    .line 374
    .line 375
    new-instance v6, Le0/a;

    .line 376
    .line 377
    invoke-direct {v6, v3, v0}, Le0/a;-><init>(Ljava/lang/String;Z)V

    .line 378
    .line 379
    .line 380
    const-wide/16 v18, 0x0

    .line 381
    .line 382
    move/from16 v17, v16

    .line 383
    .line 384
    move-object/from16 v22, v6

    .line 385
    .line 386
    invoke-direct/range {v15 .. v22}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 387
    .line 388
    .line 389
    new-instance v0, Le0/b;

    .line 390
    .line 391
    invoke-direct {v0, v15}, Le0/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 392
    .line 393
    .line 394
    new-instance v3, Ld0/g;

    .line 395
    .line 396
    invoke-direct {v3, v2}, Ld0/g;-><init>(Landroid/content/Context;)V

    .line 397
    .line 398
    .line 399
    new-instance v6, Ld0/h;

    .line 400
    .line 401
    invoke-direct {v6, v3}, Ld0/h;-><init>(Ld0/g;)V

    .line 402
    .line 403
    .line 404
    new-instance v8, Lio/reactivex/internal/operators/observable/g;

    .line 405
    .line 406
    const/4 v3, 0x7

    .line 407
    invoke-direct {v8, v3}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 408
    .line 409
    .line 410
    iget v3, v6, Ld0/h;->a:I

    .line 411
    .line 412
    if-lez v3, :cond_d

    .line 413
    .line 414
    new-instance v7, Lc0/h;

    .line 415
    .line 416
    int-to-long v13, v3

    .line 417
    invoke-direct {v7, v13, v14}, Lc0/h;-><init>(J)V

    .line 418
    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_d
    new-instance v7, Lio/reactivex/internal/operators/observable/c;

    .line 422
    .line 423
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 424
    .line 425
    .line 426
    :goto_5
    new-instance v3, Lc0/g;

    .line 427
    .line 428
    iget v11, v6, Ld0/h;->c:I

    .line 429
    .line 430
    invoke-direct {v3, v11}, Lc0/g;-><init>(I)V

    .line 431
    .line 432
    .line 433
    new-instance v11, Ld0/f;

    .line 434
    .line 435
    iget v6, v6, Ld0/h;->b:I

    .line 436
    .line 437
    int-to-long v13, v6

    .line 438
    invoke-direct {v11, v13, v14}, Lv0/g;-><init>(J)V

    .line 439
    .line 440
    .line 441
    new-instance v6, Lo2/a;

    .line 442
    .line 443
    invoke-direct {v6, v2}, Lo2/a;-><init>(Landroid/content/Context;)V

    .line 444
    .line 445
    .line 446
    new-instance v13, Lcom/bumptech/glide/load/engine/c;

    .line 447
    .line 448
    new-instance v14, Le0/b;

    .line 449
    .line 450
    new-instance v15, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 451
    .line 452
    sget-wide v18, Le0/b;->b:J

    .line 453
    .line 454
    new-instance v21, Ljava/util/concurrent/SynchronousQueue;

    .line 455
    .line 456
    invoke-direct/range {v21 .. v21}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 457
    .line 458
    .line 459
    move-object/from16 v27, v0

    .line 460
    .line 461
    new-instance v0, Le0/a;

    .line 462
    .line 463
    move-object/from16 v25, v1

    .line 464
    .line 465
    const-string/jumbo v1, "source-unlimited"

    .line 466
    .line 467
    .line 468
    invoke-direct {v0, v1, v5}, Le0/a;-><init>(Ljava/lang/String;Z)V

    .line 469
    .line 470
    .line 471
    const/16 v16, 0x0

    .line 472
    .line 473
    const v17, 0x7fffffff

    .line 474
    .line 475
    .line 476
    move-object/from16 v22, v0

    .line 477
    .line 478
    invoke-direct/range {v15 .. v22}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 479
    .line 480
    .line 481
    invoke-direct {v14, v15}, Le0/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v24, v4

    .line 485
    .line 486
    move-object/from16 v23, v6

    .line 487
    .line 488
    move-object/from16 v22, v11

    .line 489
    .line 490
    move-object/from16 v21, v13

    .line 491
    .line 492
    move-object/from16 v26, v14

    .line 493
    .line 494
    invoke-direct/range {v21 .. v27}, Lcom/bumptech/glide/load/engine/c;-><init>(Ld0/f;Lo2/a;Le0/b;Le0/b;Le0/b;Le0/b;)V

    .line 495
    .line 496
    .line 497
    move-object/from16 v4, v22

    .line 498
    .line 499
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 500
    .line 501
    move v0, v5

    .line 502
    move-object v5, v7

    .line 503
    new-instance v7, Lo0/h;

    .line 504
    .line 505
    invoke-direct {v7}, Lo0/h;-><init>()V

    .line 506
    .line 507
    .line 508
    new-instance v1, Lcom/bumptech/glide/b;

    .line 509
    .line 510
    move-object v6, v3

    .line 511
    move-object/from16 v3, v21

    .line 512
    .line 513
    invoke-direct/range {v1 .. v11}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/c;Ld0/f;Lc0/b;Lc0/g;Lo0/h;Lio/reactivex/internal/operators/observable/g;Lio/reactivex/internal/operators/observable/h;Landroidx/collection/ArrayMap;Ljava/util/List;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    if-nez v4, :cond_e

    .line 525
    .line 526
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 527
    .line 528
    .line 529
    sput-object v1, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 530
    .line 531
    sput-boolean v0, Lcom/bumptech/glide/b;->k:Z

    .line 532
    .line 533
    return-void

    .line 534
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    new-instance v0, Ljava/lang/ClassCastException;

    .line 542
    .line 543
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 544
    .line 545
    .line 546
    throw v0

    .line 547
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 548
    .line 549
    const-string v1, "Name must be non-null and non-empty, but given: animation"

    .line 550
    .line 551
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    throw v0

    .line 555
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 556
    .line 557
    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    .line 558
    .line 559
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    throw v0

    .line 563
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 564
    .line 565
    const-string v1, "Name must be non-null and non-empty, but given: source"

    .line 566
    .line 567
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    throw v0

    .line 571
    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    new-instance v0, Ljava/lang/ClassCastException;

    .line 579
    .line 580
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 581
    .line 582
    .line 583
    throw v0

    .line 584
    :catch_0
    move-exception v0

    .line 585
    new-instance v1, Ljava/lang/RuntimeException;

    .line 586
    .line 587
    const-string v2, "Unable to find metadata to parse GlideModules"

    .line 588
    .line 589
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 590
    .line 591
    .line 592
    throw v1

    .line 593
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 594
    .line 595
    const-string v1, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    .line 596
    .line 597
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    throw v0
.end method

.method public static c(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Glide"

    .line 10
    .line 11
    :try_start_0
    const-string v2, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Landroid/content/Context;

    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const/4 v0, 0x5

    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 86
    .line 87
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_0
    const/4 v0, 0x0

    .line 91
    :goto_0
    const-class v1, Lcom/bumptech/glide/b;

    .line 92
    .line 93
    monitor-enter v1

    .line 94
    :try_start_1
    sget-object v2, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 95
    .line 96
    if-nez v2, :cond_1

    .line 97
    .line 98
    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :catchall_0
    move-exception p0

    .line 103
    goto :goto_2

    .line 104
    :cond_1
    :goto_1
    monitor-exit v1

    .line 105
    goto :goto_3

    .line 106
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw p0

    .line 108
    :cond_2
    :goto_3
    sget-object p0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 109
    .line 110
    return-object p0
.end method

.method public static d(Landroid/content/Context;)Lo0/h;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Lcom/bumptech/glide/b;->g:Lo0/h;

    .line 11
    .line 12
    return-object p0
.end method

.method public static e(Landroid/content/Context;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lo0/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "You cannot start a load on a fragment before it is attached or after it is destroyed"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lv0/k;->a:[C

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-nez v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Lo0/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isVisible()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {v0, v1, p0, v3}, Lo0/h;->e(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/manager/SupportRequestManagerFragment;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    iget-object v1, p0, Lcom/bumptech/glide/manager/SupportRequestManagerFragment;->e:Lcom/bumptech/glide/h;

    .line 68
    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    invoke-static {v2}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v0, v0, Lo0/h;->e:Lc8/c;

    .line 76
    .line 77
    iget-object v3, p0, Lcom/bumptech/glide/manager/SupportRequestManagerFragment;->a:Lo0/a;

    .line 78
    .line 79
    iget-object v4, p0, Lcom/bumptech/glide/manager/SupportRequestManagerFragment;->b:Lo2/a;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/bumptech/glide/h;

    .line 85
    .line 86
    invoke-direct {v0, v1, v3, v4, v2}, Lcom/bumptech/glide/h;-><init>(Lcom/bumptech/glide/b;Lo0/e;Lo0/i;Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/bumptech/glide/manager/SupportRequestManagerFragment;->e:Lcom/bumptech/glide/h;

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_2
    return-object v1
.end method


# virtual methods
.method public final b()V
    .locals 3

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
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Ld0/f;

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lv0/g;->e(J)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Lc0/b;

    .line 21
    .line 22
    invoke-interface {v0}, Lc0/b;->e()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Lc0/g;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :try_start_0
    invoke-virtual {v0, v1}, Lc0/g;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v1

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string v1, "You must call this method on the main thread"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 9

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
    if-ne v0, v1, :cond_7

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 14
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
    check-cast v4, Lcom/bumptech/glide/h;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Ld0/f;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0xf

    .line 41
    .line 42
    const/16 v3, 0x14

    .line 43
    .line 44
    const/16 v4, 0x28

    .line 45
    .line 46
    if-lt p1, v4, :cond_1

    .line 47
    .line 48
    const-wide/16 v5, 0x0

    .line 49
    .line 50
    invoke-virtual {v0, v5, v6}, Lv0/g;->e(J)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    if-ge p1, v3, :cond_2

    .line 55
    .line 56
    if-ne p1, v1, :cond_3

    .line 57
    .line 58
    :cond_2
    monitor-enter v0

    .line 59
    :try_start_0
    iget-wide v5, v0, Lv0/g;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 60
    .line 61
    monitor-exit v0

    .line 62
    const-wide/16 v7, 0x2

    .line 63
    .line 64
    div-long/2addr v5, v7

    .line 65
    invoke-virtual {v0, v5, v6}, Lv0/g;->e(J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Lc0/b;

    .line 69
    .line 70
    invoke-interface {v0, p1}, Lc0/b;->c(I)V

    .line 71
    .line 72
    .line 73
    iget-object v5, p0, Lcom/bumptech/glide/b;->f:Lc0/g;

    .line 74
    .line 75
    monitor-enter v5

    .line 76
    if-lt p1, v4, :cond_4

    .line 77
    .line 78
    :try_start_1
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    :try_start_2
    invoke-virtual {v5, v2}, Lc0/g;->b(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    .line 82
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    goto :goto_2

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 86
    :try_start_5
    throw p1

    .line 87
    :cond_4
    if-ge p1, v3, :cond_5

    .line 88
    .line 89
    if-ne p1, v1, :cond_6

    .line 90
    .line 91
    :cond_5
    iget p1, v5, Lc0/g;->a:I

    .line 92
    .line 93
    div-int/lit8 p1, p1, 0x2

    .line 94
    .line 95
    invoke-virtual {v5, p1}, Lc0/g;->b(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 96
    .line 97
    .line 98
    :cond_6
    :goto_2
    monitor-exit v5

    .line 99
    return-void

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 102
    throw p1

    .line 103
    :catchall_2
    move-exception p1

    .line 104
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 105
    throw p1

    .line 106
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    const-string v0, "You must call this method on the main thread"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method
