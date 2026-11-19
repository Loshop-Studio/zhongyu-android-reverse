.class public final synthetic Landroidx/navigation/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/b;->a:I

    iput-object p1, p0, Landroidx/navigation/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/navigation/b;->a:I

    .line 4
    .line 5
    sget-object v4, Ld6/s;->a:Ld6/s;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object v6, v1, Landroidx/navigation/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    return-object v6

    .line 14
    :pswitch_0
    check-cast v6, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 15
    .line 16
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "SP_NEED_SHOW_CAMERA_DIALOG"

    .line 21
    .line 22
    invoke-static {v0, v2, v5}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    return-object v4

    .line 26
    :pswitch_1
    check-cast v6, Lokio/internal/ResourceFileSystem;

    .line 27
    .line 28
    invoke-static {v6}, Lokio/internal/ResourceFileSystem;->a(Lokio/internal/ResourceFileSystem;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_2
    check-cast v6, Lm7/y;

    .line 34
    .line 35
    sget-object v0, Lk7/l;->e:Lk7/l;

    .line 36
    .line 37
    new-array v2, v5, [Lk7/g;

    .line 38
    .line 39
    new-instance v3, Landroidx/navigation/i;

    .line 40
    .line 41
    const/16 v4, 0x19

    .line 42
    .line 43
    invoke-direct {v3, v6, v4}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    const-string v4, "kotlin.Unit"

    .line 47
    .line 48
    invoke-static {v4, v0, v2, v3}, La/a;->g(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;Lr6/c;)Lk7/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_3
    check-cast v6, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 54
    .line 55
    invoke-virtual {v6}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_4
    check-cast v6, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v6}, Lkotlin/jvm/internal/k;->l([Ljava/lang/Object;)Ld6/j;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :pswitch_5
    check-cast v6, Lk7/h;

    .line 67
    .line 68
    iget-object v0, v6, Lk7/h;->k:[Lk7/g;

    .line 69
    .line 70
    invoke-static {v6, v0}, Lm7/y0;->f(Lk7/g;[Lk7/g;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_6
    check-cast v6, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ly6/q;

    .line 86
    .line 87
    invoke-interface {v0}, Ly6/q;->b()Ly6/c;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :pswitch_7
    check-cast v6, Li7/c;

    .line 93
    .line 94
    sget-object v0, Lk7/c;->b:Lk7/c;

    .line 95
    .line 96
    new-array v2, v5, [Lk7/g;

    .line 97
    .line 98
    new-instance v3, Landroidx/navigation/i;

    .line 99
    .line 100
    const/16 v4, 0x14

    .line 101
    .line 102
    invoke-direct {v3, v6, v4}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    const-string v4, "kotlinx.serialization.Polymorphic"

    .line 106
    .line 107
    invoke-static {v4, v0, v2, v3}, La/a;->g(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;Lr6/c;)Lk7/h;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v2, v6, Li7/c;->a:Ly6/c;

    .line 112
    .line 113
    const-string v3, "context"

    .line 114
    .line 115
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v3, Lk7/b;

    .line 119
    .line 120
    invoke-direct {v3, v0, v2}, Lk7/b;-><init>(Lk7/h;Ly6/c;)V

    .line 121
    .line 122
    .line 123
    return-object v3

    .line 124
    :pswitch_8
    check-cast v6, Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 125
    .line 126
    new-instance v0, Ld1/b;

    .line 127
    .line 128
    invoke-direct {v0, v6}, Ld1/b;-><init>(Lcom/google/accompanist/drawablepainter/DrawablePainter;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_9
    check-cast v6, Lcom/zykj/view/dialog/TextEditDialog;

    .line 133
    .line 134
    invoke-static {v6}, Lcom/zykj/view/dialog/TextEditDialog;->g(Lcom/zykj/view/dialog/TextEditDialog;)Ld6/s;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0

    .line 139
    :pswitch_a
    check-cast v6, Lcom/zykj/view/board/simple/SimpleFragment;

    .line 140
    .line 141
    invoke-static {v6}, Lcom/zykj/view/board/simple/SimpleFragment;->k(Lcom/zykj/view/board/simple/SimpleFragment;)Ld6/s;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_b
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 147
    .line 148
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 149
    .line 150
    invoke-virtual {v6, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v6, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 154
    .line 155
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 160
    .line 161
    invoke-virtual {v6, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->T(Lcom/zykj/mistake/feature/notebook/detail/m3;)V

    .line 162
    .line 163
    .line 164
    return-object v4

    .line 165
    :pswitch_c
    check-cast v6, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 166
    .line 167
    iget-object v0, v6, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 168
    .line 169
    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    move-object v5, v2

    .line 174
    check-cast v5, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 175
    .line 176
    const v40, -0x10001

    .line 177
    .line 178
    .line 179
    const/16 v41, 0x3

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    const/4 v10, 0x0

    .line 186
    const/4 v11, 0x0

    .line 187
    const/4 v12, 0x0

    .line 188
    const/4 v13, 0x0

    .line 189
    const/4 v14, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    const/16 v19, 0x0

    .line 198
    .line 199
    const/16 v20, 0x0

    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    const/16 v23, 0x0

    .line 206
    .line 207
    const/16 v24, 0x0

    .line 208
    .line 209
    const/16 v25, 0x0

    .line 210
    .line 211
    const/16 v26, 0x0

    .line 212
    .line 213
    const/16 v27, 0x0

    .line 214
    .line 215
    const/16 v28, 0x0

    .line 216
    .line 217
    const/16 v29, 0x0

    .line 218
    .line 219
    const/16 v30, 0x0

    .line 220
    .line 221
    const/16 v31, 0x0

    .line 222
    .line 223
    const/16 v32, 0x0

    .line 224
    .line 225
    const/16 v33, 0x0

    .line 226
    .line 227
    const/16 v34, 0x0

    .line 228
    .line 229
    const/16 v35, 0x0

    .line 230
    .line 231
    const/16 v36, 0x0

    .line 232
    .line 233
    const/16 v37, 0x0

    .line 234
    .line 235
    const/16 v38, 0x0

    .line 236
    .line 237
    const/16 v39, 0x0

    .line 238
    .line 239
    invoke-static/range {v5 .. v41}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v0, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-eqz v2, :cond_0

    .line 248
    .line 249
    return-object v4

    .line 250
    :pswitch_d
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 251
    .line 252
    iget-object v0, v6, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 253
    .line 254
    :cond_1
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    move-object v5, v2

    .line 259
    check-cast v5, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 260
    .line 261
    const v42, -0x10000001

    .line 262
    .line 263
    .line 264
    const/16 v43, 0x1f

    .line 265
    .line 266
    const/4 v6, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    const/4 v8, 0x0

    .line 269
    const/4 v9, 0x0

    .line 270
    const/4 v10, 0x0

    .line 271
    const/4 v11, 0x0

    .line 272
    const/4 v12, 0x0

    .line 273
    const/4 v13, 0x0

    .line 274
    const/4 v14, 0x0

    .line 275
    const/4 v15, 0x0

    .line 276
    const/16 v16, 0x0

    .line 277
    .line 278
    const/16 v17, 0x0

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const/16 v19, 0x0

    .line 283
    .line 284
    const/16 v20, 0x0

    .line 285
    .line 286
    const/16 v21, 0x0

    .line 287
    .line 288
    const/16 v22, 0x0

    .line 289
    .line 290
    const/16 v23, 0x0

    .line 291
    .line 292
    const/16 v24, 0x0

    .line 293
    .line 294
    const/16 v25, 0x0

    .line 295
    .line 296
    const/16 v26, 0x0

    .line 297
    .line 298
    const/16 v27, 0x0

    .line 299
    .line 300
    const/16 v28, 0x0

    .line 301
    .line 302
    const/16 v29, 0x0

    .line 303
    .line 304
    const/16 v30, 0x0

    .line 305
    .line 306
    const/16 v31, 0x0

    .line 307
    .line 308
    const/16 v32, 0x0

    .line 309
    .line 310
    const/16 v33, 0x0

    .line 311
    .line 312
    const/16 v34, 0x0

    .line 313
    .line 314
    const/16 v35, 0x0

    .line 315
    .line 316
    const/16 v36, 0x0

    .line 317
    .line 318
    const/16 v37, 0x0

    .line 319
    .line 320
    const/16 v38, 0x0

    .line 321
    .line 322
    const/16 v39, 0x0

    .line 323
    .line 324
    const/16 v40, 0x0

    .line 325
    .line 326
    const/16 v41, 0x0

    .line 327
    .line 328
    invoke-static/range {v5 .. v43}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-virtual {v0, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-eqz v2, :cond_1

    .line 337
    .line 338
    return-object v4

    .line 339
    :pswitch_e
    check-cast v6, Lcoil3/r;

    .line 340
    .line 341
    iget-object v0, v6, Lcoil3/r;->a:Lcoil3/q;

    .line 342
    .line 343
    iget-object v0, v0, Lcoil3/q;->d:Ld6/e;

    .line 344
    .line 345
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    check-cast v0, Lcoil3/disk/a;

    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_f
    check-cast v6, Lcoil3/decode/d;

    .line 353
    .line 354
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 355
    .line 356
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 357
    .line 358
    .line 359
    iget-object v4, v6, Lcoil3/decode/d;->b:Ls/l;

    .line 360
    .line 361
    new-instance v7, Lcoil3/decode/b;

    .line 362
    .line 363
    iget-object v8, v6, Lcoil3/decode/d;->a:Lcoil3/decode/p;

    .line 364
    .line 365
    invoke-interface {v8}, Lcoil3/decode/p;->source()Lokio/BufferedSource;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-direct {v7, v8}, Lcoil3/decode/b;-><init>(Lokio/Source;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v7}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    const/4 v9, 0x1

    .line 377
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 378
    .line 379
    invoke-interface {v8}, Lokio/BufferedSource;->peek()Lokio/BufferedSource;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    invoke-interface {v10}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    const/4 v11, 0x0

    .line 388
    invoke-static {v10, v11, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 389
    .line 390
    .line 391
    iget-object v10, v7, Lcoil3/decode/b;->b:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v10, Ljava/lang/Exception;

    .line 394
    .line 395
    if-nez v10, :cond_28

    .line 396
    .line 397
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 398
    .line 399
    sget-object v10, Lcoil3/decode/n;->a:Landroid/graphics/Paint;

    .line 400
    .line 401
    iget-object v10, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 402
    .line 403
    iget-object v6, v6, Lcoil3/decode/d;->d:Lcoil3/decode/m;

    .line 404
    .line 405
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    const-string v6, "image/jpeg"

    .line 409
    .line 410
    if-eqz v10, :cond_3

    .line 411
    .line 412
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v12

    .line 416
    if-nez v12, :cond_2

    .line 417
    .line 418
    const-string v12, "image/webp"

    .line 419
    .line 420
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v12

    .line 424
    if-nez v12, :cond_2

    .line 425
    .line 426
    const-string v12, "image/heic"

    .line 427
    .line 428
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v12

    .line 432
    if-nez v12, :cond_2

    .line 433
    .line 434
    const-string v12, "image/heif"

    .line 435
    .line 436
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    if-eqz v10, :cond_3

    .line 441
    .line 442
    :cond_2
    move v10, v9

    .line 443
    goto :goto_0

    .line 444
    :cond_3
    move v10, v5

    .line 445
    :goto_0
    if-eqz v10, :cond_4

    .line 446
    .line 447
    new-instance v10, Landroidx/exifinterface/media/ExifInterface;

    .line 448
    .line 449
    new-instance v12, Lcoil3/decode/l;

    .line 450
    .line 451
    invoke-interface {v8}, Lokio/BufferedSource;->peek()Lokio/BufferedSource;

    .line 452
    .line 453
    .line 454
    move-result-object v13

    .line 455
    invoke-interface {v13}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 456
    .line 457
    .line 458
    move-result-object v13

    .line 459
    invoke-direct {v12, v13}, Lcoil3/decode/l;-><init>(Ljava/io/InputStream;)V

    .line 460
    .line 461
    .line 462
    invoke-direct {v10, v12}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/io/InputStream;)V

    .line 463
    .line 464
    .line 465
    new-instance v12, Lcoil3/decode/k;

    .line 466
    .line 467
    invoke-virtual {v10}, Landroidx/exifinterface/media/ExifInterface;->isFlipped()Z

    .line 468
    .line 469
    .line 470
    move-result v13

    .line 471
    invoke-virtual {v10}, Landroidx/exifinterface/media/ExifInterface;->getRotationDegrees()I

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    invoke-direct {v12, v13, v10}, Lcoil3/decode/k;-><init>(ZI)V

    .line 476
    .line 477
    .line 478
    goto :goto_1

    .line 479
    :cond_4
    sget-object v12, Lcoil3/decode/k;->c:Lcoil3/decode/k;

    .line 480
    .line 481
    :goto_1
    iget v10, v12, Lcoil3/decode/k;->b:I

    .line 482
    .line 483
    iget-boolean v12, v12, Lcoil3/decode/k;->a:Z

    .line 484
    .line 485
    iget-object v13, v7, Lcoil3/decode/b;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v13, Ljava/lang/Exception;

    .line 488
    .line 489
    if-nez v13, :cond_27

    .line 490
    .line 491
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 492
    .line 493
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 494
    .line 495
    const/16 v14, 0x1a

    .line 496
    .line 497
    if-lt v13, v14, :cond_5

    .line 498
    .line 499
    sget-object v15, Ls/h;->c:Lo2/a;

    .line 500
    .line 501
    invoke-static {v4, v15}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v16

    .line 505
    invoke-static/range {v16 .. v16}, Lokio/a;->b(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 506
    .line 507
    .line 508
    move-result-object v16

    .line 509
    if-eqz v16, :cond_5

    .line 510
    .line 511
    invoke-static {v4, v15}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v15

    .line 515
    invoke-static {v15}, Lokio/a;->b(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 516
    .line 517
    .line 518
    move-result-object v15

    .line 519
    invoke-static {v0, v15}, Landroidx/core/util/a;->q(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 520
    .line 521
    .line 522
    :cond_5
    sget-object v15, Ls/h;->d:Lo2/a;

    .line 523
    .line 524
    invoke-static {v4, v15}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v15

    .line 528
    check-cast v15, Ljava/lang/Boolean;

    .line 529
    .line 530
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 531
    .line 532
    .line 533
    move-result v15

    .line 534
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 535
    .line 536
    iget-object v2, v4, Ls/l;->a:Landroid/content/Context;

    .line 537
    .line 538
    iput-boolean v15, v0, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 539
    .line 540
    sget-object v3, Ls/h;->b:Lo2/a;

    .line 541
    .line 542
    invoke-static {v4, v3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    check-cast v3, Landroid/graphics/Bitmap$Config;

    .line 547
    .line 548
    if-nez v12, :cond_6

    .line 549
    .line 550
    if-lez v10, :cond_8

    .line 551
    .line 552
    :cond_6
    if-eqz v3, :cond_7

    .line 553
    .line 554
    invoke-static {v3}, Lkotlin/collections/u;->x(Landroid/graphics/Bitmap$Config;)Z

    .line 555
    .line 556
    .line 557
    move-result v15

    .line 558
    if-eqz v15, :cond_8

    .line 559
    .line 560
    :cond_7
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 561
    .line 562
    :cond_8
    sget-object v15, Ls/h;->g:Lo2/a;

    .line 563
    .line 564
    invoke-static {v4, v15}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v15

    .line 568
    check-cast v15, Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 571
    .line 572
    .line 573
    move-result v15

    .line 574
    if-eqz v15, :cond_9

    .line 575
    .line 576
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 577
    .line 578
    if-ne v3, v15, :cond_9

    .line 579
    .line 580
    iget-object v15, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 581
    .line 582
    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    if-eqz v6, :cond_9

    .line 587
    .line 588
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 589
    .line 590
    :cond_9
    if-lt v13, v14, :cond_a

    .line 591
    .line 592
    invoke-static {v0}, Landroidx/core/util/a;->c(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 593
    .line 594
    .line 595
    move-result-object v6

    .line 596
    invoke-static {}, Landroidx/compose/ui/autofill/b;->n()Landroid/graphics/Bitmap$Config;

    .line 597
    .line 598
    .line 599
    move-result-object v13

    .line 600
    if-ne v6, v13, :cond_a

    .line 601
    .line 602
    invoke-static {}, Landroidx/compose/ui/autofill/b;->c()Landroid/graphics/Bitmap$Config;

    .line 603
    .line 604
    .line 605
    move-result-object v6

    .line 606
    if-eq v3, v6, :cond_a

    .line 607
    .line 608
    invoke-static {}, Landroidx/compose/ui/autofill/b;->n()Landroid/graphics/Bitmap$Config;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    :cond_a
    iput-object v3, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 613
    .line 614
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 615
    .line 616
    const/16 v6, 0x10e

    .line 617
    .line 618
    const/16 v13, 0x5a

    .line 619
    .line 620
    if-lez v3, :cond_19

    .line 621
    .line 622
    iget v14, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 623
    .line 624
    if-gtz v14, :cond_b

    .line 625
    .line 626
    move-object v15, v2

    .line 627
    move v5, v9

    .line 628
    move/from16 v25, v10

    .line 629
    .line 630
    move/from16 v22, v12

    .line 631
    .line 632
    goto/16 :goto_9

    .line 633
    .line 634
    :cond_b
    if-eq v10, v13, :cond_d

    .line 635
    .line 636
    if-ne v10, v6, :cond_c

    .line 637
    .line 638
    goto :goto_2

    .line 639
    :cond_c
    move v15, v3

    .line 640
    goto :goto_3

    .line 641
    :cond_d
    :goto_2
    move v15, v14

    .line 642
    :goto_3
    if-eq v10, v13, :cond_f

    .line 643
    .line 644
    if-ne v10, v6, :cond_e

    .line 645
    .line 646
    goto :goto_4

    .line 647
    :cond_e
    move v3, v14

    .line 648
    :cond_f
    :goto_4
    iget-object v14, v4, Ls/l;->b:Lt/f;

    .line 649
    .line 650
    iget-object v6, v4, Ls/l;->c:Lcoil3/size/Scale;

    .line 651
    .line 652
    sget-object v13, Ls/g;->b:Lo2/a;

    .line 653
    .line 654
    invoke-static {v4, v13}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v13

    .line 658
    check-cast v13, Lt/f;

    .line 659
    .line 660
    invoke-static {v15, v3, v14, v6, v13}, Ly1/a;->g(IILt/f;Lcoil3/size/Scale;Lt/f;)J

    .line 661
    .line 662
    .line 663
    move-result-wide v13

    .line 664
    const/16 v20, 0x20

    .line 665
    .line 666
    move/from16 v22, v12

    .line 667
    .line 668
    shr-long v11, v13, v20

    .line 669
    .line 670
    long-to-int v11, v11

    .line 671
    const-wide v23, 0xffffffffL

    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    and-long v12, v13, v23

    .line 677
    .line 678
    long-to-int v12, v12

    .line 679
    div-int v13, v15, v11

    .line 680
    .line 681
    invoke-static {v13}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 682
    .line 683
    .line 684
    move-result v13

    .line 685
    div-int v14, v3, v12

    .line 686
    .line 687
    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 688
    .line 689
    .line 690
    move-result v14

    .line 691
    sget-object v20, Lcoil3/decode/h;->a:[I

    .line 692
    .line 693
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 694
    .line 695
    .line 696
    move-result v23

    .line 697
    aget v5, v20, v23

    .line 698
    .line 699
    const/4 v1, 0x2

    .line 700
    if-eq v5, v9, :cond_11

    .line 701
    .line 702
    if-ne v5, v1, :cond_10

    .line 703
    .line 704
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    goto :goto_5

    .line 709
    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 710
    .line 711
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 712
    .line 713
    .line 714
    throw v0

    .line 715
    :cond_11
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 716
    .line 717
    .line 718
    move-result v5

    .line 719
    :goto_5
    if-ge v5, v9, :cond_12

    .line 720
    .line 721
    move v5, v9

    .line 722
    :cond_12
    iput v5, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 723
    .line 724
    int-to-double v13, v15

    .line 725
    move-object v15, v2

    .line 726
    int-to-double v1, v5

    .line 727
    div-double/2addr v13, v1

    .line 728
    move/from16 v25, v10

    .line 729
    .line 730
    int-to-double v9, v3

    .line 731
    div-double/2addr v9, v1

    .line 732
    int-to-double v1, v11

    .line 733
    int-to-double v11, v12

    .line 734
    div-double/2addr v1, v13

    .line 735
    div-double/2addr v11, v9

    .line 736
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    aget v3, v20, v3

    .line 741
    .line 742
    const/4 v5, 0x1

    .line 743
    if-eq v3, v5, :cond_14

    .line 744
    .line 745
    const/4 v6, 0x2

    .line 746
    if-ne v3, v6, :cond_13

    .line 747
    .line 748
    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->min(DD)D

    .line 749
    .line 750
    .line 751
    move-result-wide v1

    .line 752
    goto :goto_6

    .line 753
    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 754
    .line 755
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 756
    .line 757
    .line 758
    throw v0

    .line 759
    :cond_14
    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->max(DD)D

    .line 760
    .line 761
    .line 762
    move-result-wide v1

    .line 763
    :goto_6
    iget-object v3, v4, Ls/l;->d:Lcoil3/size/Precision;

    .line 764
    .line 765
    sget-object v4, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 766
    .line 767
    if-ne v3, v4, :cond_15

    .line 768
    .line 769
    cmpl-double v3, v1, v16

    .line 770
    .line 771
    if-lez v3, :cond_15

    .line 772
    .line 773
    move-wide/from16 v1, v16

    .line 774
    .line 775
    :cond_15
    cmpg-double v3, v1, v16

    .line 776
    .line 777
    if-nez v3, :cond_16

    .line 778
    .line 779
    const/4 v3, 0x1

    .line 780
    goto :goto_7

    .line 781
    :cond_16
    const/4 v3, 0x0

    .line 782
    :goto_7
    xor-int/lit8 v4, v3, 0x1

    .line 783
    .line 784
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 785
    .line 786
    if-nez v3, :cond_17

    .line 787
    .line 788
    cmpl-double v3, v1, v16

    .line 789
    .line 790
    const v4, 0x7fffffff

    .line 791
    .line 792
    .line 793
    if-lez v3, :cond_18

    .line 794
    .line 795
    int-to-double v9, v4

    .line 796
    div-double/2addr v9, v1

    .line 797
    invoke-static {v9, v10}, Lt6/a;->p(D)I

    .line 798
    .line 799
    .line 800
    move-result v1

    .line 801
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 802
    .line 803
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 804
    .line 805
    :cond_17
    :goto_8
    const/4 v1, 0x0

    .line 806
    goto :goto_a

    .line 807
    :cond_18
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 808
    .line 809
    int-to-double v3, v4

    .line 810
    mul-double/2addr v3, v1

    .line 811
    invoke-static {v3, v4}, Lt6/a;->p(D)I

    .line 812
    .line 813
    .line 814
    move-result v1

    .line 815
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 816
    .line 817
    goto :goto_8

    .line 818
    :cond_19
    move-object v15, v2

    .line 819
    move/from16 v25, v10

    .line 820
    .line 821
    move/from16 v22, v12

    .line 822
    .line 823
    move v5, v9

    .line 824
    :goto_9
    iput v5, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 825
    .line 826
    const/4 v1, 0x0

    .line 827
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 828
    .line 829
    :goto_a
    :try_start_0
    invoke-interface {v8}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    const/4 v3, 0x0

    .line 834
    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 835
    .line 836
    .line 837
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 838
    invoke-interface {v8}, Ljava/io/Closeable;->close()V

    .line 839
    .line 840
    .line 841
    iget-object v3, v7, Lcoil3/decode/b;->b:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v3, Ljava/lang/Exception;

    .line 844
    .line 845
    if-nez v3, :cond_26

    .line 846
    .line 847
    if-eqz v2, :cond_25

    .line 848
    .line 849
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 858
    .line 859
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 860
    .line 861
    .line 862
    if-nez v22, :cond_1a

    .line 863
    .line 864
    if-lez v25, :cond_22

    .line 865
    .line 866
    :cond_1a
    new-instance v3, Landroid/graphics/Matrix;

    .line 867
    .line 868
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 872
    .line 873
    .line 874
    move-result v4

    .line 875
    int-to-float v4, v4

    .line 876
    const/high16 v6, 0x40000000    # 2.0f

    .line 877
    .line 878
    div-float/2addr v4, v6

    .line 879
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 880
    .line 881
    .line 882
    move-result v7

    .line 883
    int-to-float v7, v7

    .line 884
    div-float/2addr v7, v6

    .line 885
    if-eqz v22, :cond_1b

    .line 886
    .line 887
    const/high16 v6, -0x40800000    # -1.0f

    .line 888
    .line 889
    const/high16 v8, 0x3f800000    # 1.0f

    .line 890
    .line 891
    invoke-virtual {v3, v6, v8, v4, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 892
    .line 893
    .line 894
    :cond_1b
    if-lez v25, :cond_1c

    .line 895
    .line 896
    move/from16 v6, v25

    .line 897
    .line 898
    int-to-float v8, v6

    .line 899
    invoke-virtual {v3, v8, v4, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 900
    .line 901
    .line 902
    goto :goto_b

    .line 903
    :cond_1c
    move/from16 v6, v25

    .line 904
    .line 905
    :goto_b
    new-instance v4, Landroid/graphics/RectF;

    .line 906
    .line 907
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    int-to-float v7, v7

    .line 912
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 913
    .line 914
    .line 915
    move-result v8

    .line 916
    int-to-float v8, v8

    .line 917
    const/4 v9, 0x0

    .line 918
    invoke-direct {v4, v9, v9, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 922
    .line 923
    .line 924
    iget v7, v4, Landroid/graphics/RectF;->left:F

    .line 925
    .line 926
    cmpg-float v8, v7, v9

    .line 927
    .line 928
    if-nez v8, :cond_1d

    .line 929
    .line 930
    iget v8, v4, Landroid/graphics/RectF;->top:F

    .line 931
    .line 932
    cmpg-float v8, v8, v9

    .line 933
    .line 934
    if-nez v8, :cond_1d

    .line 935
    .line 936
    :goto_c
    const/16 v4, 0x5a

    .line 937
    .line 938
    goto :goto_d

    .line 939
    :cond_1d
    neg-float v7, v7

    .line 940
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 941
    .line 942
    neg-float v4, v4

    .line 943
    invoke-virtual {v3, v7, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 944
    .line 945
    .line 946
    goto :goto_c

    .line 947
    :goto_d
    if-eq v6, v4, :cond_20

    .line 948
    .line 949
    const/16 v4, 0x10e

    .line 950
    .line 951
    if-ne v6, v4, :cond_1e

    .line 952
    .line 953
    goto :goto_e

    .line 954
    :cond_1e
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 955
    .line 956
    .line 957
    move-result v4

    .line 958
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 959
    .line 960
    .line 961
    move-result v6

    .line 962
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 963
    .line 964
    .line 965
    move-result-object v7

    .line 966
    if-nez v7, :cond_1f

    .line 967
    .line 968
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 969
    .line 970
    :cond_1f
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    goto :goto_f

    .line 975
    :cond_20
    :goto_e
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 976
    .line 977
    .line 978
    move-result v4

    .line 979
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 980
    .line 981
    .line 982
    move-result v6

    .line 983
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 984
    .line 985
    .line 986
    move-result-object v7

    .line 987
    if-nez v7, :cond_21

    .line 988
    .line 989
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 990
    .line 991
    :cond_21
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 992
    .line 993
    .line 994
    move-result-object v4

    .line 995
    :goto_f
    new-instance v6, Landroid/graphics/Canvas;

    .line 996
    .line 997
    invoke-direct {v6, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 998
    .line 999
    .line 1000
    sget-object v7, Lcoil3/decode/n;->a:Landroid/graphics/Paint;

    .line 1001
    .line 1002
    invoke-virtual {v6, v2, v3, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1006
    .line 1007
    .line 1008
    move-object v2, v4

    .line 1009
    :cond_22
    new-instance v3, Lcoil3/decode/g;

    .line 1010
    .line 1011
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    .line 1016
    .line 1017
    invoke-direct {v6, v4, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 1018
    .line 1019
    .line 1020
    invoke-static {v6}, Lcoil3/o;->c(Landroid/graphics/drawable/Drawable;)Lcoil3/k;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1025
    .line 1026
    const/4 v5, 0x1

    .line 1027
    if-gt v4, v5, :cond_24

    .line 1028
    .line 1029
    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1030
    .line 1031
    if-eqz v0, :cond_23

    .line 1032
    .line 1033
    goto :goto_10

    .line 1034
    :cond_23
    move v5, v1

    .line 1035
    :cond_24
    :goto_10
    invoke-direct {v3, v2, v5}, Lcoil3/decode/g;-><init>(Lcoil3/k;Z)V

    .line 1036
    .line 1037
    .line 1038
    return-object v3

    .line 1039
    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1040
    .line 1041
    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 1042
    .line 1043
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    throw v0

    .line 1047
    :cond_26
    throw v3

    .line 1048
    :catchall_0
    move-exception v0

    .line 1049
    move-object v1, v0

    .line 1050
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1051
    :catchall_1
    move-exception v0

    .line 1052
    invoke-static {v8, v1}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1053
    .line 1054
    .line 1055
    throw v0

    .line 1056
    :cond_27
    throw v13

    .line 1057
    :cond_28
    throw v10

    .line 1058
    :pswitch_10
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 1059
    .line 1060
    check-cast v6, Lb0/g;

    .line 1061
    .line 1062
    const-class v0, Landroid/app/ActivityManager;

    .line 1063
    .line 1064
    iget-object v1, v6, Lb0/g;->b:Ljava/lang/Object;

    .line 1065
    .line 1066
    check-cast v1, Landroid/content/Context;

    .line 1067
    .line 1068
    const-wide v2, 0x3fc999999999999aL    # 0.2

    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    :try_start_2
    invoke-static {v1, v0}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v4

    .line 1077
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    check-cast v4, Landroid/app/ActivityManager;

    .line 1081
    .line 1082
    invoke-virtual {v4}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 1086
    if-eqz v4, :cond_29

    .line 1087
    .line 1088
    const-wide v2, 0x3fc3333333333333L    # 0.15

    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    :catch_0
    :cond_29
    const-wide/16 v4, 0x0

    .line 1094
    .line 1095
    cmpg-double v4, v4, v2

    .line 1096
    .line 1097
    if-gtz v4, :cond_2c

    .line 1098
    .line 1099
    cmpg-double v4, v2, v16

    .line 1100
    .line 1101
    if-gtz v4, :cond_2c

    .line 1102
    .line 1103
    new-instance v4, Ld2/c;

    .line 1104
    .line 1105
    const/4 v5, 0x4

    .line 1106
    invoke-direct {v4, v5}, Ld2/c;-><init>(I)V

    .line 1107
    .line 1108
    .line 1109
    :try_start_3
    invoke-static {v1, v0}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    check-cast v0, Landroid/app/ActivityManager;

    .line 1117
    .line 1118
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 1123
    .line 1124
    const/high16 v5, 0x100000

    .line 1125
    .line 1126
    and-int/2addr v1, v5

    .line 1127
    if-eqz v1, :cond_2a

    .line 1128
    .line 1129
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 1130
    .line 1131
    .line 1132
    move-result v0

    .line 1133
    goto :goto_11

    .line 1134
    :cond_2a
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 1135
    .line 1136
    .line 1137
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 1138
    goto :goto_11

    .line 1139
    :catch_1
    const/16 v0, 0x100

    .line 1140
    .line 1141
    :goto_11
    int-to-long v0, v0

    .line 1142
    const-wide/32 v5, 0x100000

    .line 1143
    .line 1144
    .line 1145
    mul-long/2addr v0, v5

    .line 1146
    long-to-double v0, v0

    .line 1147
    mul-double/2addr v2, v0

    .line 1148
    double-to-long v0, v2

    .line 1149
    const-wide/16 v2, 0x0

    .line 1150
    .line 1151
    cmp-long v2, v0, v2

    .line 1152
    .line 1153
    if-lez v2, :cond_2b

    .line 1154
    .line 1155
    new-instance v2, Landroid/support/v4/media/h;

    .line 1156
    .line 1157
    invoke-direct {v2, v0, v1, v4}, Landroid/support/v4/media/h;-><init>(JLd2/c;)V

    .line 1158
    .line 1159
    .line 1160
    goto :goto_12

    .line 1161
    :cond_2b
    new-instance v2, Lo2/a;

    .line 1162
    .line 1163
    const/16 v0, 0x1d

    .line 1164
    .line 1165
    invoke-direct {v2, v4, v0}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 1166
    .line 1167
    .line 1168
    :goto_12
    new-instance v0, Lq/e;

    .line 1169
    .line 1170
    invoke-direct {v0, v2, v4}, Lq/e;-><init>(Lq/i;Ld2/c;)V

    .line 1171
    .line 1172
    .line 1173
    return-object v0

    .line 1174
    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1175
    .line 1176
    const-string v1, "percent must be in the range [0.0, 1.0]."

    .line 1177
    .line 1178
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1179
    .line 1180
    .line 1181
    throw v0

    .line 1182
    :pswitch_11
    check-cast v6, Lkotlin/Pair;

    .line 1183
    .line 1184
    invoke-static {v6}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    return-object v0

    .line 1189
    :pswitch_12
    check-cast v6, Landroidx/savedstate/SavedStateRegistryOwner;

    .line 1190
    .line 1191
    invoke-static {v6}, Landroidx/savedstate/SavedStateRegistryController$Companion;->a(Landroidx/savedstate/SavedStateRegistryOwner;)Ld6/s;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    return-object v0

    .line 1196
    :pswitch_13
    check-cast v6, Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-static {v6}, Landroidx/navigation/internal/NavDestinationImpl;->b(Ljava/lang/String;)Landroidx/navigation/NavDeepLink;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    return-object v0

    .line 1203
    :pswitch_14
    check-cast v6, Landroidx/navigation/NavBackStackEntry;

    .line 1204
    .line 1205
    invoke-static {v6}, Landroidx/navigation/NavBackStackEntry;->a(Landroidx/navigation/NavBackStackEntry;)Landroidx/lifecycle/SavedStateHandle;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    return-object v0

    .line 1210
    nop

    .line 1211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
