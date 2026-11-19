.class public final Lcoil3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/n;


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:Lcoil3/q;

.field public final b:Le7/c;

.field public final c:Lw1/a;

.field public final d:Lcoil3/d;

.field public volatile synthetic e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcoil3/r;

    const-string v1, "e"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lcoil3/q;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lcoil3/r;->a:Lcoil3/q;

    .line 9
    .line 10
    invoke-static {}, Lkotlinx/coroutines/x;->c()Lkotlinx/coroutines/m1;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Lcoil3/s;

    .line 15
    .line 16
    sget-object v4, Lkotlinx/coroutines/s;->a:Lkotlinx/coroutines/s;

    .line 17
    .line 18
    invoke-direct {v3, v4}, Lh6/a;-><init>(Lh6/g;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Lt6/a;->o(Lh6/h;Lh6/f;)Lh6/h;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Lkotlinx/coroutines/x;->a(Lh6/h;)Le7/c;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, v0, Lcoil3/r;->b:Le7/c;

    .line 30
    .line 31
    new-instance v2, Lcoil3/util/a;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lcoil3/util/a;-><init>(Lcoil3/r;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lw1/a;

    .line 37
    .line 38
    invoke-direct {v3, v0}, Lw1/a;-><init>(Lcoil3/r;)V

    .line 39
    .line 40
    .line 41
    iput-object v3, v0, Lcoil3/r;->c:Lw1/a;

    .line 42
    .line 43
    iget-object v4, v1, Lcoil3/q;->e:Lcoil3/d;

    .line 44
    .line 45
    new-instance v5, La5/e;

    .line 46
    .line 47
    invoke-direct {v5, v4}, La5/e;-><init>(Lcoil3/d;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v5, La5/e;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v6, v5, La5/e;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Ljava/util/ArrayList;

    .line 57
    .line 58
    iget-object v7, v5, La5/e;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object v8, v5, La5/e;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Ljava/util/ArrayList;

    .line 65
    .line 66
    iget-object v1, v1, Lcoil3/q;->b:Ls/d;

    .line 67
    .line 68
    iget-object v9, v1, Ls/d;->n:Lcoil3/j;

    .line 69
    .line 70
    sget-object v10, Lcoil3/o;->a:Lo2/a;

    .line 71
    .line 72
    iget-object v9, v9, Lcoil3/j;->a:Ljava/util/Map;

    .line 73
    .line 74
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    if-nez v9, :cond_0

    .line 79
    .line 80
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_0
    check-cast v9, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    const/4 v10, 0x2

    .line 89
    const/4 v11, 0x1

    .line 90
    if-eqz v9, :cond_1

    .line 91
    .line 92
    new-instance v9, Lcoil3/m;

    .line 93
    .line 94
    invoke-direct {v9, v11}, Lcoil3/m;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    new-instance v9, Lcoil3/m;

    .line 101
    .line 102
    invoke-direct {v9, v10}, Lcoil3/m;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_1
    new-instance v9, Lp/a;

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    invoke-direct {v9, v12}, Lp/a;-><init>(I)V

    .line 112
    .line 113
    .line 114
    const-class v13, Landroid/net/Uri;

    .line 115
    .line 116
    invoke-static {v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-virtual {v5, v9, v13}, La5/e;->b(Lp/a;Lkotlin/jvm/internal/d;)V

    .line 121
    .line 122
    .line 123
    new-instance v9, Lp/a;

    .line 124
    .line 125
    const/4 v13, 0x3

    .line 126
    invoke-direct {v9, v13}, Lp/a;-><init>(I)V

    .line 127
    .line 128
    .line 129
    const-class v14, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    invoke-virtual {v5, v9, v14}, La5/e;->b(Lp/a;Lkotlin/jvm/internal/d;)V

    .line 136
    .line 137
    .line 138
    new-instance v9, Lo/a;

    .line 139
    .line 140
    invoke-direct {v9, v12}, Lo/a;-><init>(I)V

    .line 141
    .line 142
    .line 143
    const-class v14, Lcoil3/x;

    .line 144
    .line 145
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    new-instance v10, Lkotlin/Pair;

    .line 150
    .line 151
    invoke-direct {v10, v9, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    new-instance v9, Ln/a;

    .line 158
    .line 159
    invoke-direct {v9, v12}, Ln/a;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-virtual {v5, v9, v10}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 167
    .line 168
    .line 169
    new-instance v9, Ln/a;

    .line 170
    .line 171
    const/4 v10, 0x4

    .line 172
    invoke-direct {v9, v10}, Ln/a;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-virtual {v5, v9, v12}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 180
    .line 181
    .line 182
    new-instance v9, Ln/a;

    .line 183
    .line 184
    const/16 v12, 0x9

    .line 185
    .line 186
    invoke-direct {v9, v12}, Ln/a;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-virtual {v5, v9, v12}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 194
    .line 195
    .line 196
    new-instance v9, Ln/a;

    .line 197
    .line 198
    const/4 v12, 0x6

    .line 199
    invoke-direct {v9, v12}, Ln/a;-><init>(I)V

    .line 200
    .line 201
    .line 202
    const-class v12, Landroid/graphics/drawable/Drawable;

    .line 203
    .line 204
    invoke-static {v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    invoke-virtual {v5, v9, v12}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 209
    .line 210
    .line 211
    new-instance v9, Ln/a;

    .line 212
    .line 213
    invoke-direct {v9, v11}, Ln/a;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const-class v12, Landroid/graphics/Bitmap;

    .line 217
    .line 218
    invoke-static {v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    invoke-virtual {v5, v9, v12}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 223
    .line 224
    .line 225
    sget-object v9, Lcoil3/p;->a:Lo2/a;

    .line 226
    .line 227
    iget-object v9, v1, Ls/d;->n:Lcoil3/j;

    .line 228
    .line 229
    sget-object v12, Lcoil3/p;->a:Lo2/a;

    .line 230
    .line 231
    iget-object v9, v9, Lcoil3/j;->a:Ljava/util/Map;

    .line 232
    .line 233
    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    if-nez v9, :cond_2

    .line 238
    .line 239
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    :cond_2
    check-cast v9, Ljava/lang/Number;

    .line 244
    .line 245
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    sget v12, Lh7/f;->a:I

    .line 250
    .line 251
    new-instance v12, Lh7/e;

    .line 252
    .line 253
    invoke-direct {v12, v9}, Lkotlinx/coroutines/sync/b;-><init>(I)V

    .line 254
    .line 255
    .line 256
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 257
    .line 258
    const/16 v15, 0x1d

    .line 259
    .line 260
    sget-object v10, Lcoil3/decode/m;->a:Lcoil3/decode/m;

    .line 261
    .line 262
    if-lt v9, v15, :cond_5

    .line 263
    .line 264
    iget-object v9, v1, Ls/d;->n:Lcoil3/j;

    .line 265
    .line 266
    sget-object v15, Lcoil3/p;->c:Lo2/a;

    .line 267
    .line 268
    iget-object v9, v9, Lcoil3/j;->a:Ljava/util/Map;

    .line 269
    .line 270
    invoke-interface {v9, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    if-nez v9, :cond_3

    .line 275
    .line 276
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 277
    .line 278
    :cond_3
    check-cast v9, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-eqz v9, :cond_5

    .line 285
    .line 286
    iget-object v9, v1, Ls/d;->n:Lcoil3/j;

    .line 287
    .line 288
    sget-object v15, Lcoil3/p;->b:Lo2/a;

    .line 289
    .line 290
    iget-object v9, v9, Lcoil3/j;->a:Ljava/util/Map;

    .line 291
    .line 292
    invoke-interface {v9, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    if-nez v9, :cond_4

    .line 297
    .line 298
    move-object v9, v10

    .line 299
    :cond_4
    check-cast v9, Lcoil3/decode/m;

    .line 300
    .line 301
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-eqz v9, :cond_5

    .line 306
    .line 307
    new-instance v9, Lcoil3/decode/u;

    .line 308
    .line 309
    invoke-direct {v9, v12}, Lcoil3/decode/u;-><init>(Lh7/e;)V

    .line 310
    .line 311
    .line 312
    new-instance v15, Lcoil3/c;

    .line 313
    .line 314
    invoke-direct {v15, v9, v11}, Lcoil3/c;-><init>(Lcoil3/decode/i;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    :cond_5
    new-instance v9, Lcoil3/decode/c;

    .line 321
    .line 322
    iget-object v1, v1, Ls/d;->n:Lcoil3/j;

    .line 323
    .line 324
    sget-object v15, Lcoil3/p;->b:Lo2/a;

    .line 325
    .line 326
    iget-object v1, v1, Lcoil3/j;->a:Ljava/util/Map;

    .line 327
    .line 328
    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    if-nez v1, :cond_6

    .line 333
    .line 334
    goto :goto_0

    .line 335
    :cond_6
    move-object v10, v1

    .line 336
    :goto_0
    check-cast v10, Lcoil3/decode/m;

    .line 337
    .line 338
    invoke-direct {v9, v12, v10}, Lcoil3/decode/c;-><init>(Lh7/e;Lcoil3/decode/m;)V

    .line 339
    .line 340
    .line 341
    new-instance v1, Lcoil3/c;

    .line 342
    .line 343
    invoke-direct {v1, v9, v11}, Lcoil3/c;-><init>(Lcoil3/decode/i;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    new-instance v1, Lp/a;

    .line 350
    .line 351
    invoke-direct {v1, v11}, Lp/a;-><init>(I)V

    .line 352
    .line 353
    .line 354
    const-class v9, Ljava/io/File;

    .line 355
    .line 356
    invoke-static {v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    invoke-virtual {v5, v1, v9}, La5/e;->b(Lp/a;Lkotlin/jvm/internal/d;)V

    .line 361
    .line 362
    .line 363
    new-instance v1, Ln/a;

    .line 364
    .line 365
    const/16 v9, 0x8

    .line 366
    .line 367
    invoke-direct {v1, v9}, Ln/a;-><init>(I)V

    .line 368
    .line 369
    .line 370
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    invoke-virtual {v5, v1, v9}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 375
    .line 376
    .line 377
    new-instance v1, Ln/a;

    .line 378
    .line 379
    invoke-direct {v1, v13}, Ln/a;-><init>(I)V

    .line 380
    .line 381
    .line 382
    const-class v9, Ljava/nio/ByteBuffer;

    .line 383
    .line 384
    invoke-static {v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    invoke-virtual {v5, v1, v9}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 389
    .line 390
    .line 391
    new-instance v1, Lp/a;

    .line 392
    .line 393
    const/4 v9, 0x4

    .line 394
    invoke-direct {v1, v9}, Lp/a;-><init>(I)V

    .line 395
    .line 396
    .line 397
    const-class v9, Ljava/lang/String;

    .line 398
    .line 399
    invoke-static {v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-virtual {v5, v1, v9}, La5/e;->b(Lp/a;Lkotlin/jvm/internal/d;)V

    .line 404
    .line 405
    .line 406
    new-instance v1, Lp/a;

    .line 407
    .line 408
    const/4 v9, 0x2

    .line 409
    invoke-direct {v1, v9}, Lp/a;-><init>(I)V

    .line 410
    .line 411
    .line 412
    const-class v9, Lokio/Path;

    .line 413
    .line 414
    invoke-static {v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-virtual {v5, v1, v9}, La5/e;->b(Lp/a;Lkotlin/jvm/internal/d;)V

    .line 419
    .line 420
    .line 421
    new-instance v1, Lo/b;

    .line 422
    .line 423
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 424
    .line 425
    .line 426
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    new-instance v10, Lkotlin/Pair;

    .line 431
    .line 432
    invoke-direct {v10, v1, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    new-instance v1, Lo/a;

    .line 439
    .line 440
    invoke-direct {v1, v11}, Lo/a;-><init>(I)V

    .line 441
    .line 442
    .line 443
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 444
    .line 445
    .line 446
    move-result-object v9

    .line 447
    new-instance v10, Lkotlin/Pair;

    .line 448
    .line 449
    invoke-direct {v10, v1, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    new-instance v1, Ln/a;

    .line 456
    .line 457
    const/4 v9, 0x7

    .line 458
    invoke-direct {v1, v9}, Ln/a;-><init>(I)V

    .line 459
    .line 460
    .line 461
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    invoke-virtual {v5, v1, v9}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 466
    .line 467
    .line 468
    new-instance v1, Ln/a;

    .line 469
    .line 470
    const/4 v9, 0x2

    .line 471
    invoke-direct {v1, v9}, Ln/a;-><init>(I)V

    .line 472
    .line 473
    .line 474
    const-class v9, [B

    .line 475
    .line 476
    invoke-static {v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    invoke-virtual {v5, v1, v9}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 481
    .line 482
    .line 483
    new-instance v1, Ln/a;

    .line 484
    .line 485
    const/4 v9, 0x5

    .line 486
    invoke-direct {v1, v9}, Ln/a;-><init>(I)V

    .line 487
    .line 488
    .line 489
    invoke-static {v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 490
    .line 491
    .line 492
    move-result-object v9

    .line 493
    invoke-virtual {v5, v1, v9}, La5/e;->a(Ln/f;Lkotlin/jvm/internal/d;)V

    .line 494
    .line 495
    .line 496
    new-instance v1, Lcoil3/intercept/b;

    .line 497
    .line 498
    invoke-direct {v1, v0, v2, v3}, Lcoil3/intercept/b;-><init>(Lcoil3/r;Lcoil3/util/a;Lw1/a;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    new-instance v9, Lcoil3/d;

    .line 505
    .line 506
    invoke-static {v4}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v10

    .line 510
    iget-object v1, v5, La5/e;->d:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v1, Ljava/util/ArrayList;

    .line 513
    .line 514
    invoke-static {v1}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    invoke-static {v7}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    invoke-static {v6}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v13

    .line 526
    invoke-static {v8}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v14

    .line 530
    invoke-direct/range {v9 .. v14}, Lcoil3/d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 531
    .line 532
    .line 533
    iput-object v9, v0, Lcoil3/r;->d:Lcoil3/d;

    .line 534
    .line 535
    return-void
.end method


# virtual methods
.method public final a(Ls/f;)Ls/k;
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 2
    .line 3
    sget-object v0, Le7/k;->a:Ld7/d;

    .line 4
    .line 5
    iget-object v0, v0, Ld7/d;->d:Ld7/d;

    .line 6
    .line 7
    new-instance v1, Lcoil3/RealImageLoader$enqueue$job$1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, Lcoil3/RealImageLoader$enqueue$job$1;-><init>(Lcoil3/r;Ls/f;Lh6/c;)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    iget-object v3, p0, Lcoil3/r;->b:Le7/c;

    .line 15
    .line 16
    invoke-static {v3, v0, v1, v2}, Lkotlinx/coroutines/x;->d(Lkotlinx/coroutines/v;Ld7/d;Lr6/e;I)Lkotlinx/coroutines/b0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1, v0}, Lcoil3/o;->d(Ls/f;Lkotlinx/coroutines/b0;)Ls/k;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final b(Ls/f;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    instance-of v1, v0, Lcoil3/RealImageLoader$execute$3;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lcoil3/RealImageLoader$execute$3;

    .line 13
    .line 14
    iget v3, v1, Lcoil3/RealImageLoader$execute$3;->label:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v6, v3, v4

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v1, Lcoil3/RealImageLoader$execute$3;->label:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, Lcoil3/RealImageLoader$execute$3;

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lcoil3/RealImageLoader$execute$3;-><init>(Lcoil3/r;Lh6/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v9, Lcoil3/RealImageLoader$execute$3;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v10, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    iget v1, v9, Lcoil3/RealImageLoader$execute$3;->label:I

    .line 38
    .line 39
    const/4 v11, 0x3

    .line 40
    const/4 v12, 0x2

    .line 41
    const/4 v13, 0x1

    .line 42
    const/4 v14, 0x0

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    if-eq v1, v13, :cond_3

    .line 46
    .line 47
    if-eq v1, v12, :cond_2

    .line 48
    .line 49
    if-ne v1, v11, :cond_1

    .line 50
    .line 51
    iget-object v1, v9, Lcoil3/RealImageLoader$execute$3;->L$2:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lcoil3/h;

    .line 54
    .line 55
    iget-object v3, v9, Lcoil3/RealImageLoader$execute$3;->L$1:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ls/f;

    .line 58
    .line 59
    iget-object v4, v9, Lcoil3/RealImageLoader$execute$3;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ls/m;

    .line 62
    .line 63
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto/16 :goto_c

    .line 67
    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto/16 :goto_10

    .line 70
    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object v1, v9, Lcoil3/RealImageLoader$execute$3;->L$3:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lcoil3/k;

    .line 82
    .line 83
    iget-object v3, v9, Lcoil3/RealImageLoader$execute$3;->L$2:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Lcoil3/h;

    .line 86
    .line 87
    iget-object v4, v9, Lcoil3/RealImageLoader$execute$3;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Ls/f;

    .line 90
    .line 91
    iget-object v5, v9, Lcoil3/RealImageLoader$execute$3;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Ls/m;

    .line 94
    .line 95
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    .line 97
    .line 98
    move-object v7, v5

    .line 99
    move-object v5, v1

    .line 100
    move-object v1, v4

    .line 101
    move-object v4, v3

    .line 102
    goto/16 :goto_a

    .line 103
    .line 104
    :catchall_1
    move-exception v0

    .line 105
    move-object v1, v3

    .line 106
    move-object v3, v4

    .line 107
    move-object v4, v5

    .line 108
    goto/16 :goto_10

    .line 109
    .line 110
    :cond_3
    iget-object v1, v9, Lcoil3/RealImageLoader$execute$3;->L$2:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Lcoil3/h;

    .line 113
    .line 114
    iget-object v3, v9, Lcoil3/RealImageLoader$execute$3;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, Ls/f;

    .line 117
    .line 118
    iget-object v4, v9, Lcoil3/RealImageLoader$execute$3;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Ls/m;

    .line 121
    .line 122
    :try_start_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_4
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v9}, Lh6/c;->getContext()Lh6/h;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lkotlinx/coroutines/x;->n(Lh6/h;)Lkotlinx/coroutines/w0;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    if-nez p2, :cond_5

    .line 139
    .line 140
    move v0, v13

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    const/4 v0, 0x0

    .line 143
    :goto_2
    iget-object v1, v2, Lcoil3/r;->c:Lw1/a;

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v1, v1, Lw1/a;->a:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v4, v1

    .line 151
    check-cast v4, Lcoil3/r;

    .line 152
    .line 153
    iget-object v1, v5, Ls/f;->c:Lu/a;

    .line 154
    .line 155
    instance-of v3, v1, Lcoil3/target/GenericViewTarget;

    .line 156
    .line 157
    if-eqz v3, :cond_7

    .line 158
    .line 159
    sget-object v0, Ls/h;->e:Lo2/a;

    .line 160
    .line 161
    invoke-static {v5, v0}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Landroidx/lifecycle/Lifecycle;

    .line 166
    .line 167
    if-nez v0, :cond_6

    .line 168
    .line 169
    invoke-static {v5}, Lw1/a;->a(Ls/f;)Landroidx/lifecycle/Lifecycle;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :cond_6
    move-object v7, v0

    .line 174
    new-instance v3, Lcoil3/request/ViewTargetRequestDelegate;

    .line 175
    .line 176
    move-object v6, v1

    .line 177
    check-cast v6, Lcoil3/target/GenericViewTarget;

    .line 178
    .line 179
    invoke-direct/range {v3 .. v8}, Lcoil3/request/ViewTargetRequestDelegate;-><init>(Lcoil3/r;Ls/f;Lcoil3/target/GenericViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/w0;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    sget-object v1, Ls/h;->e:Lo2/a;

    .line 184
    .line 185
    invoke-static {v5, v1}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Landroidx/lifecycle/Lifecycle;

    .line 190
    .line 191
    if-nez v1, :cond_9

    .line 192
    .line 193
    if-eqz v0, :cond_8

    .line 194
    .line 195
    invoke-static {v5}, Lw1/a;->a(Ls/f;)Landroidx/lifecycle/Lifecycle;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    goto :goto_3

    .line 200
    :cond_8
    move-object v1, v14

    .line 201
    :cond_9
    :goto_3
    if-eqz v1, :cond_a

    .line 202
    .line 203
    new-instance v0, Lcoil3/request/LifecycleRequestDelegate;

    .line 204
    .line 205
    invoke-direct {v0, v1, v8}, Lcoil3/request/LifecycleRequestDelegate;-><init>(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/w0;)V

    .line 206
    .line 207
    .line 208
    :goto_4
    move-object v3, v0

    .line 209
    goto :goto_5

    .line 210
    :cond_a
    new-instance v0, Ls/a;

    .line 211
    .line 212
    invoke-direct {v0, v8}, Ls/a;-><init>(Lkotlinx/coroutines/w0;)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :goto_5
    invoke-interface {v3}, Ls/m;->b()V

    .line 217
    .line 218
    .line 219
    invoke-static {v5}, Ls/f;->a(Ls/f;)Ls/c;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object v1, v5, Ls/f;->c:Lu/a;

    .line 224
    .line 225
    iget-object v4, v4, Lcoil3/r;->a:Lcoil3/q;

    .line 226
    .line 227
    iget-object v4, v4, Lcoil3/q;->b:Ls/d;

    .line 228
    .line 229
    iput-object v4, v0, Ls/c;->b:Ls/d;

    .line 230
    .line 231
    iget-object v4, v5, Ls/f;->s:Ls/e;

    .line 232
    .line 233
    iget-object v6, v4, Ls/e;->i:Lt/g;

    .line 234
    .line 235
    if-nez v6, :cond_c

    .line 236
    .line 237
    instance-of v7, v1, Lcoil3/target/GenericViewTarget;

    .line 238
    .line 239
    if-eqz v7, :cond_b

    .line 240
    .line 241
    move-object v7, v1

    .line 242
    check-cast v7, Lcoil3/target/GenericViewTarget;

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v7, Lt/e;

    .line 248
    .line 249
    invoke-direct {v7, v14}, Lt/e;-><init>(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_b
    sget-object v7, Lt/g;->b0:Lt/d;

    .line 254
    .line 255
    :goto_6
    iput-object v7, v0, Ls/c;->n:Lt/g;

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_c
    move-object v7, v6

    .line 259
    :goto_7
    iget-object v8, v4, Ls/e;->j:Lcoil3/size/Scale;

    .line 260
    .line 261
    if-nez v8, :cond_d

    .line 262
    .line 263
    iget-object v5, v5, Ls/f;->p:Lcoil3/size/Scale;

    .line 264
    .line 265
    iput-object v5, v0, Ls/c;->o:Lcoil3/size/Scale;

    .line 266
    .line 267
    :cond_d
    iget-object v4, v4, Ls/e;->k:Lcoil3/size/Precision;

    .line 268
    .line 269
    if-nez v4, :cond_10

    .line 270
    .line 271
    if-nez v6, :cond_e

    .line 272
    .line 273
    sget-object v4, Lt/g;->b0:Lt/d;

    .line 274
    .line 275
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_e

    .line 280
    .line 281
    sget-object v1, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_e
    instance-of v4, v1, Lcoil3/target/GenericViewTarget;

    .line 285
    .line 286
    if-eqz v4, :cond_f

    .line 287
    .line 288
    instance-of v4, v7, Lt/e;

    .line 289
    .line 290
    if-eqz v4, :cond_f

    .line 291
    .line 292
    check-cast v1, Lcoil3/target/GenericViewTarget;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    :cond_f
    sget-object v1, Lcoil3/size/Precision;->EXACT:Lcoil3/size/Precision;

    .line 298
    .line 299
    :goto_8
    iput-object v1, v0, Ls/c;->p:Lcoil3/size/Precision;

    .line 300
    .line 301
    :cond_10
    invoke-virtual {v0}, Ls/c;->a()Ls/f;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    sget-object v4, Lcoil3/h;->a:Lcoil3/f;

    .line 306
    .line 307
    :try_start_3
    iget-object v0, v1, Ls/f;->b:Ljava/lang/Object;

    .line 308
    .line 309
    sget-object v5, Ls/j;->a:Ls/j;

    .line 310
    .line 311
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-nez v0, :cond_1a

    .line 316
    .line 317
    invoke-interface {v3}, Ls/m;->start()V

    .line 318
    .line 319
    .line 320
    if-nez p2, :cond_11

    .line 321
    .line 322
    iput-object v3, v9, Lcoil3/RealImageLoader$execute$3;->L$0:Ljava/lang/Object;

    .line 323
    .line 324
    iput-object v1, v9, Lcoil3/RealImageLoader$execute$3;->L$1:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v4, v9, Lcoil3/RealImageLoader$execute$3;->L$2:Ljava/lang/Object;

    .line 327
    .line 328
    iput v13, v9, Lcoil3/RealImageLoader$execute$3;->label:I

    .line 329
    .line 330
    invoke-interface {v3, v9}, Ls/m;->a(Lh6/c;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 334
    if-ne v0, v10, :cond_11

    .line 335
    .line 336
    goto/16 :goto_b

    .line 337
    .line 338
    :catchall_2
    move-exception v0

    .line 339
    move-object v15, v3

    .line 340
    move-object v3, v1

    .line 341
    move-object v1, v4

    .line 342
    move-object v4, v15

    .line 343
    goto/16 :goto_10

    .line 344
    .line 345
    :cond_11
    move-object v15, v3

    .line 346
    move-object v3, v1

    .line 347
    move-object v1, v4

    .line 348
    move-object v4, v15

    .line 349
    :goto_9
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v0, v3, Ls/f;->c:Lu/a;

    .line 353
    .line 354
    if-eqz v0, :cond_13

    .line 355
    .line 356
    iget-object v5, v3, Ls/f;->l:Lr6/c;

    .line 357
    .line 358
    invoke-interface {v5, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    check-cast v5, Lcoil3/k;

    .line 363
    .line 364
    if-nez v5, :cond_12

    .line 365
    .line 366
    iget-object v5, v3, Ls/f;->t:Ls/d;

    .line 367
    .line 368
    iget-object v5, v5, Ls/d;->h:Lr6/c;

    .line 369
    .line 370
    invoke-interface {v5, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    check-cast v5, Lcoil3/k;

    .line 375
    .line 376
    :cond_12
    invoke-interface {v0, v5}, Lu/a;->m(Lcoil3/k;)V

    .line 377
    .line 378
    .line 379
    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    iget-object v0, v3, Ls/f;->o:Lt/g;

    .line 383
    .line 384
    iput-object v4, v9, Lcoil3/RealImageLoader$execute$3;->L$0:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v3, v9, Lcoil3/RealImageLoader$execute$3;->L$1:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v1, v9, Lcoil3/RealImageLoader$execute$3;->L$2:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v14, v9, Lcoil3/RealImageLoader$execute$3;->L$3:Ljava/lang/Object;

    .line 391
    .line 392
    iput v12, v9, Lcoil3/RealImageLoader$execute$3;->label:I

    .line 393
    .line 394
    invoke-interface {v0, v9}, Lt/g;->a(Lh6/c;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 398
    if-ne v0, v10, :cond_14

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_14
    move-object v7, v4

    .line 402
    move-object v5, v14

    .line 403
    move-object v4, v1

    .line 404
    move-object v1, v3

    .line 405
    :goto_a
    :try_start_5
    move-object v3, v0

    .line 406
    check-cast v3, Lt/f;

    .line 407
    .line 408
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    iget-object v8, v1, Ls/f;->f:Lh6/h;

    .line 412
    .line 413
    new-instance v0, Lcoil3/RealImageLoader$execute$result$1;

    .line 414
    .line 415
    const/4 v6, 0x0

    .line 416
    invoke-direct/range {v0 .. v6}, Lcoil3/RealImageLoader$execute$result$1;-><init>(Ls/f;Lcoil3/r;Lt/f;Lcoil3/h;Lcoil3/k;Lh6/c;)V

    .line 417
    .line 418
    .line 419
    iput-object v7, v9, Lcoil3/RealImageLoader$execute$3;->L$0:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v1, v9, Lcoil3/RealImageLoader$execute$3;->L$1:Ljava/lang/Object;

    .line 422
    .line 423
    iput-object v4, v9, Lcoil3/RealImageLoader$execute$3;->L$2:Ljava/lang/Object;

    .line 424
    .line 425
    iput-object v14, v9, Lcoil3/RealImageLoader$execute$3;->L$3:Ljava/lang/Object;

    .line 426
    .line 427
    iput v11, v9, Lcoil3/RealImageLoader$execute$3;->label:I

    .line 428
    .line 429
    invoke-static {v8, v0, v9}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 433
    if-ne v0, v10, :cond_15

    .line 434
    .line 435
    :goto_b
    return-object v10

    .line 436
    :cond_15
    move-object v3, v1

    .line 437
    move-object v1, v4

    .line 438
    move-object v4, v7

    .line 439
    :goto_c
    :try_start_6
    check-cast v0, Ls/i;

    .line 440
    .line 441
    instance-of v5, v0, Ls/n;

    .line 442
    .line 443
    if-eqz v5, :cond_18

    .line 444
    .line 445
    move-object v5, v0

    .line 446
    check-cast v5, Ls/n;

    .line 447
    .line 448
    iget-object v6, v3, Ls/f;->c:Lu/a;

    .line 449
    .line 450
    iget-object v7, v5, Ls/n;->b:Ls/f;

    .line 451
    .line 452
    iget-object v5, v5, Ls/n;->a:Lcoil3/k;

    .line 453
    .line 454
    instance-of v8, v6, Lcoil3/target/GenericViewTarget;

    .line 455
    .line 456
    if-nez v8, :cond_16

    .line 457
    .line 458
    if-eqz v6, :cond_17

    .line 459
    .line 460
    :goto_d
    invoke-interface {v6, v5}, Lu/a;->q(Lcoil3/k;)V

    .line 461
    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_16
    sget-object v8, Ls/h;->a:Lo2/a;

    .line 465
    .line 466
    invoke-static {v7, v8}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    check-cast v8, Lv/a;

    .line 471
    .line 472
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    goto :goto_d

    .line 476
    :cond_17
    :goto_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    goto :goto_f

    .line 483
    :cond_18
    instance-of v5, v0, Ls/b;

    .line 484
    .line 485
    if-eqz v5, :cond_19

    .line 486
    .line 487
    move-object v5, v0

    .line 488
    check-cast v5, Ls/b;

    .line 489
    .line 490
    iget-object v6, v3, Ls/f;->c:Lu/a;

    .line 491
    .line 492
    invoke-virtual {v2, v5, v6, v1}, Lcoil3/r;->e(Ls/b;Lu/a;Lcoil3/h;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 493
    .line 494
    .line 495
    :goto_f
    invoke-interface {v4}, Ls/m;->complete()V

    .line 496
    .line 497
    .line 498
    return-object v0

    .line 499
    :cond_19
    :try_start_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 500
    .line 501
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 502
    .line 503
    .line 504
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 505
    :catchall_3
    move-exception v0

    .line 506
    move-object v3, v1

    .line 507
    move-object v1, v4

    .line 508
    move-object v4, v7

    .line 509
    goto :goto_10

    .line 510
    :cond_1a
    :try_start_8
    new-instance v0, Lcoil3/request/NullRequestDataException;

    .line 511
    .line 512
    invoke-direct {v0}, Lcoil3/request/NullRequestDataException;-><init>()V

    .line 513
    .line 514
    .line 515
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 516
    :goto_10
    :try_start_9
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 517
    .line 518
    if-nez v5, :cond_1b

    .line 519
    .line 520
    invoke-static {v3, v0}, Ly1/a;->a(Ls/f;Ljava/lang/Throwable;)Ls/b;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    iget-object v3, v3, Ls/f;->c:Lu/a;

    .line 525
    .line 526
    invoke-virtual {v2, v0, v3, v1}, Lcoil3/r;->e(Ls/b;Lu/a;Lcoil3/h;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 527
    .line 528
    .line 529
    invoke-interface {v4}, Ls/m;->complete()V

    .line 530
    .line 531
    .line 532
    return-object v0

    .line 533
    :catchall_4
    move-exception v0

    .line 534
    goto :goto_11

    .line 535
    :cond_1b
    :try_start_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 542
    :goto_11
    invoke-interface {v4}, Ls/m;->complete()V

    .line 543
    .line 544
    .line 545
    throw v0
.end method

.method public final c(Ls/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p1, Ls/f;->c:Lu/a;

    .line 2
    .line 3
    instance-of v0, v0, Lcoil3/target/GenericViewTarget;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p1, Ls/f;->o:Lt/g;

    .line 8
    .line 9
    instance-of v0, v0, Lt/e;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Ls/h;->e:Lo2/a;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/lifecycle/Lifecycle;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, p1, v0, p2}, Lcoil3/r;->b(Ls/f;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    :goto_0
    new-instance v0, Lcoil3/RealImageLoader$execute$2;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p1, p0, v1}, Lcoil3/RealImageLoader$execute$2;-><init>(Ls/f;Lcoil3/r;Lh6/c;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p2}, Lkotlinx/coroutines/x;->h(Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public final d()Lq/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/r;->a:Lcoil3/q;

    .line 2
    .line 3
    iget-object v0, v0, Lcoil3/q;->c:Ld6/e;

    .line 4
    .line 5
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lq/e;

    .line 10
    .line 11
    return-object v0
.end method

.method public final e(Ls/b;Lu/a;Lcoil3/h;)V
    .locals 2

    .line 1
    iget-object v0, p1, Ls/b;->b:Ls/f;

    .line 2
    .line 3
    iget-object p1, p1, Ls/b;->a:Lcoil3/k;

    .line 4
    .line 5
    instance-of v1, p2, Lcoil3/target/GenericViewTarget;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Ls/h;->a:Lo2/a;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lv/a;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p2, p1}, Lu/a;->f(Lcoil3/k;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-void
.end method
