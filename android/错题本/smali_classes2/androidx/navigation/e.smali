.class public final synthetic Landroidx/navigation/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/navigation/e;->a:I

    iput-object p2, p0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/navigation/e;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/zykj/mistake/fragment/NoteFragment;

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcom/zykj/mistake/utils/h;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/zykj/mistake/utils/h;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/fragment/NoteFragment;->k(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lm7/y;

    .line 29
    .line 30
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v3, Lm7/x;

    .line 35
    .line 36
    iget-object v1, v1, Lm7/y;->b:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v1, [Ljava/lang/Enum;

    .line 39
    .line 40
    array-length v4, v1

    .line 41
    invoke-direct {v3, v2, v4}, Lm7/x;-><init>(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    array-length v2, v1

    .line 45
    const/4 v4, 0x0

    .line 46
    move v5, v4

    .line 47
    :goto_0
    if-ge v5, v2, :cond_0

    .line 48
    .line 49
    aget-object v6, v1, v5

    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v3, v6, v4}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object v3

    .line 62
    :pswitch_1
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lk7/g;

    .line 65
    .line 66
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ln7/b;

    .line 69
    .line 70
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v4, v2, Ln7/b;->a:Ln7/g;

    .line 76
    .line 77
    invoke-static {v1, v2}, Lkotlinx/serialization/json/internal/j;->o(Lk7/g;Ln7/b;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v1}, Lk7/g;->d()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/4 v4, 0x0

    .line 85
    move v5, v4

    .line 86
    :goto_1
    if-ge v5, v2, :cond_7

    .line 87
    .line 88
    invoke-interface {v1, v5}, Lk7/g;->f(I)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    new-instance v7, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    :cond_1
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_2

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    instance-of v9, v8, Lkotlinx/serialization/json/JsonNames;

    .line 112
    .line 113
    if-eqz v9, :cond_1

    .line 114
    .line 115
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    const/4 v8, 0x1

    .line 124
    if-ne v6, v8, :cond_3

    .line 125
    .line 126
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    const/4 v6, 0x0

    .line 132
    :goto_3
    check-cast v6, Lkotlinx/serialization/json/JsonNames;

    .line 133
    .line 134
    if-eqz v6, :cond_6

    .line 135
    .line 136
    invoke-interface {v6}, Lkotlinx/serialization/json/JsonNames;->names()[Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    if-eqz v6, :cond_6

    .line 141
    .line 142
    array-length v7, v6

    .line 143
    move v8, v4

    .line 144
    :goto_4
    if-ge v8, v7, :cond_6

    .line 145
    .line 146
    aget-object v9, v6, v8

    .line 147
    .line 148
    invoke-interface {v1}, Lk7/g;->getKind()Lcoil3/network/g;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    sget-object v11, Lk7/k;->b:Lk7/k;

    .line 153
    .line 154
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_4

    .line 159
    .line 160
    const-string v10, "enum value"

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_4
    const-string v10, "property"

    .line 164
    .line 165
    :goto_5
    invoke-interface {v3, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-nez v11, :cond_5

    .line 170
    .line 171
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-interface {v3, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    add-int/lit8 v8, v8, 0x1

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    new-instance v2, Lkotlinx/serialization/json/internal/JsonException;

    .line 182
    .line 183
    new-instance v4, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v6, "The suggested name \'"

    .line 186
    .line 187
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v6, "\' for "

    .line 194
    .line 195
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const/16 v6, 0x20

    .line 202
    .line 203
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-interface {v1, v5}, Lk7/g;->e(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v5, " is already one of the names for "

    .line 214
    .line 215
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-static {v3, v9}, Lkotlin/collections/e0;->B(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    invoke-interface {v1, v3}, Lk7/g;->e(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v3, " in "

    .line 242
    .line 243
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-direct {v2, v1}, Lkotlinx/serialization/json/internal/JsonException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v2

    .line 257
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :cond_7
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_8

    .line 266
    .line 267
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    :cond_8
    return-object v3

    .line 272
    :pswitch_2
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lcom/zykj/mistake/utils/k;

    .line 275
    .line 276
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v2, Landroidx/compose/runtime/State;

    .line 279
    .line 280
    iget-object v3, v1, Lcom/zykj/mistake/utils/k;->b:Lr6/a;

    .line 281
    .line 282
    invoke-interface {v3}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    check-cast v3, Ljava/lang/Number;

    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 289
    .line 290
    .line 291
    move-result-wide v3

    .line 292
    iget-object v5, v1, Lcom/zykj/mistake/utils/k;->c:Ljava/lang/Long;

    .line 293
    .line 294
    if-eqz v5, :cond_9

    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide v5

    .line 300
    sub-long v5, v3, v5

    .line 301
    .line 302
    iget-wide v7, v1, Lcom/zykj/mistake/utils/k;->a:J

    .line 303
    .line 304
    cmp-long v5, v5, v7

    .line 305
    .line 306
    if-ltz v5, :cond_a

    .line 307
    .line 308
    :cond_9
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    iput-object v3, v1, Lcom/zykj/mistake/utils/k;->c:Ljava/lang/Long;

    .line 313
    .line 314
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Lr6/a;

    .line 319
    .line 320
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    :cond_a
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 324
    .line 325
    return-object v1

    .line 326
    :pswitch_3
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, Lr6/c;

    .line 329
    .line 330
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 333
    .line 334
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    if-eqz v4, :cond_c

    .line 343
    .line 344
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    move-object v6, v4

    .line 349
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 350
    .line 351
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-nez v6, :cond_b

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_c
    const/4 v4, 0x0

    .line 359
    :goto_6
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 360
    .line 361
    if-eqz v4, :cond_d

    .line 362
    .line 363
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 364
    .line 365
    .line 366
    move-result-wide v3

    .line 367
    long-to-int v3, v3

    .line 368
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    move-object v7, v3

    .line 373
    goto :goto_7

    .line 374
    :cond_d
    const/4 v7, 0x0

    .line 375
    :goto_7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    const/4 v6, 0x1

    .line 384
    if-eqz v4, :cond_f

    .line 385
    .line 386
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    move-object v8, v4

    .line 391
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 392
    .line 393
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    if-ne v8, v6, :cond_e

    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_f
    const/4 v4, 0x0

    .line 401
    :goto_8
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 402
    .line 403
    if-eqz v4, :cond_10

    .line 404
    .line 405
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 406
    .line 407
    .line 408
    move-result-wide v3

    .line 409
    long-to-int v3, v3

    .line 410
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    move-object v8, v3

    .line 415
    goto :goto_9

    .line 416
    :cond_10
    const/4 v8, 0x0

    .line 417
    :goto_9
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    const/4 v9, 0x2

    .line 426
    if-eqz v4, :cond_12

    .line 427
    .line 428
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    move-object v10, v4

    .line 433
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 434
    .line 435
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    if-ne v10, v9, :cond_11

    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_12
    const/4 v4, 0x0

    .line 443
    :goto_a
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 444
    .line 445
    if-eqz v4, :cond_13

    .line 446
    .line 447
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 448
    .line 449
    .line 450
    move-result-wide v3

    .line 451
    long-to-int v3, v3

    .line 452
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    goto :goto_b

    .line 457
    :cond_13
    const/4 v3, 0x0

    .line 458
    :goto_b
    new-instance v4, Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    :cond_14
    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    const/4 v12, -0x1

    .line 472
    if-eqz v11, :cond_15

    .line 473
    .line 474
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v11

    .line 478
    move-object v13, v11

    .line 479
    check-cast v13, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 480
    .line 481
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 482
    .line 483
    .line 484
    move-result v13

    .line 485
    if-ne v13, v12, :cond_14

    .line 486
    .line 487
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_15
    new-instance v11, Ljava/util/ArrayList;

    .line 492
    .line 493
    const/16 v10, 0xa

    .line 494
    .line 495
    invoke-static {v2, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 496
    .line 497
    .line 498
    move-result v13

    .line 499
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v13

    .line 510
    if-eqz v13, :cond_1b

    .line 511
    .line 512
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v13

    .line 516
    check-cast v13, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 517
    .line 518
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v14

    .line 522
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 523
    .line 524
    .line 525
    move-result v15

    .line 526
    if-eqz v15, :cond_18

    .line 527
    .line 528
    if-eq v15, v6, :cond_17

    .line 529
    .line 530
    if-eq v15, v9, :cond_16

    .line 531
    .line 532
    sget-object v15, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->BLUE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 533
    .line 534
    goto :goto_e

    .line 535
    :cond_16
    sget-object v15, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->ORANGE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 536
    .line 537
    goto :goto_e

    .line 538
    :cond_17
    sget-object v15, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->GREEN:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 539
    .line 540
    goto :goto_e

    .line 541
    :cond_18
    sget-object v15, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->RED:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 542
    .line 543
    :goto_e
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 544
    .line 545
    .line 546
    move-result-wide v16

    .line 547
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 548
    .line 549
    .line 550
    move-result-object v16

    .line 551
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 552
    .line 553
    .line 554
    move-result v13

    .line 555
    if-ne v13, v12, :cond_19

    .line 556
    .line 557
    goto :goto_f

    .line 558
    :cond_19
    const/16 v16, 0x0

    .line 559
    .line 560
    :goto_f
    if-eqz v16, :cond_1a

    .line 561
    .line 562
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    .line 563
    .line 564
    .line 565
    move-result-wide v5

    .line 566
    long-to-int v5, v5

    .line 567
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    goto :goto_10

    .line 572
    :cond_1a
    const/4 v5, 0x0

    .line 573
    :goto_10
    new-instance v6, Lp4/i;

    .line 574
    .line 575
    invoke-direct {v6, v14, v15, v5}, Lp4/i;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;Ljava/lang/Integer;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    const/4 v6, 0x1

    .line 582
    goto :goto_d

    .line 583
    :cond_1b
    new-instance v2, Ljava/util/ArrayList;

    .line 584
    .line 585
    invoke-static {v4, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    const/4 v6, 0x0

    .line 597
    :goto_11
    if-ge v6, v5, :cond_1c

    .line 598
    .line 599
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v9

    .line 603
    add-int/lit8 v6, v6, 0x1

    .line 604
    .line 605
    check-cast v9, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 606
    .line 607
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 608
    .line 609
    .line 610
    move-result-wide v9

    .line 611
    long-to-int v9, v9

    .line 612
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v9

    .line 616
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_1c
    new-instance v6, Lcom/zykj/mistake/main/z0;

    .line 621
    .line 622
    move-object v10, v2

    .line 623
    move-object v9, v3

    .line 624
    invoke-direct/range {v6 .. v11}, Lcom/zykj/mistake/main/z0;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 625
    .line 626
    .line 627
    invoke-interface {v1, v6}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 631
    .line 632
    return-object v1

    .line 633
    :pswitch_4
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 636
    .line 637
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 640
    .line 641
    const/4 v3, 0x0

    .line 642
    invoke-static {v1, v2, v3}, Lcom/zykj/mistake/main/drawer/l;->g(Ljava/util/List;Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)V

    .line 643
    .line 644
    .line 645
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 646
    .line 647
    return-object v1

    .line 648
    :pswitch_5
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v1, Lr6/c;

    .line 651
    .line 652
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 655
    .line 656
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 660
    .line 661
    return-object v1

    .line 662
    :pswitch_6
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v1, Lcom/zykj/mistake/main/p;

    .line 665
    .line 666
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Lr6/a;

    .line 669
    .line 670
    iget-boolean v3, v1, Lcom/zykj/mistake/main/p;->f:Z

    .line 671
    .line 672
    if-eqz v3, :cond_1d

    .line 673
    .line 674
    iget v1, v1, Lcom/zykj/mistake/main/p;->c:I

    .line 675
    .line 676
    const/4 v3, 0x3

    .line 677
    if-ne v1, v3, :cond_1d

    .line 678
    .line 679
    invoke-interface {v2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    goto :goto_12

    .line 683
    :cond_1d
    invoke-interface {v2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    :goto_12
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 687
    .line 688
    return-object v1

    .line 689
    :pswitch_7
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v1, Lr6/c;

    .line 692
    .line 693
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v2, Lcom/zykj/mistake/main/l;

    .line 696
    .line 697
    check-cast v2, Lcom/zykj/mistake/main/c;

    .line 698
    .line 699
    iget-object v2, v2, Lcom/zykj/mistake/main/c;->a:Lcom/zykj/mistake/main/p;

    .line 700
    .line 701
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 705
    .line 706
    return-object v1

    .line 707
    :pswitch_8
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v1, Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 710
    .line 711
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v2, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 714
    .line 715
    sget-object v3, Lcom/zykj/mistake/main/j;->a:[I

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    aget v3, v3, v4

    .line 722
    .line 723
    const/4 v4, 0x1

    .line 724
    const/4 v5, 0x6

    .line 725
    const/4 v6, 0x0

    .line 726
    if-eq v3, v4, :cond_20

    .line 727
    .line 728
    const/4 v4, 0x2

    .line 729
    if-eq v3, v4, :cond_1f

    .line 730
    .line 731
    const/4 v4, 0x3

    .line 732
    if-ne v3, v4, :cond_1e

    .line 733
    .line 734
    goto :goto_13

    .line 735
    :cond_1e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 736
    .line 737
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 738
    .line 739
    .line 740
    throw v1

    .line 741
    :cond_1f
    const-string v3, "MistakeDetailRemove"

    .line 742
    .line 743
    invoke-static {v5, v3, v6}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    goto :goto_13

    .line 747
    :cond_20
    const-string v3, "MistakeListManageDeleteConfirm"

    .line 748
    .line 749
    invoke-static {v5, v3, v6}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    :goto_13
    new-instance v3, Lcom/zykj/mistake/main/h0;

    .line 753
    .line 754
    invoke-direct {v3, v1}, Lcom/zykj/mistake/main/h0;-><init>(Lcom/zykj/mistake/main/RemoveDialogTarget;)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 758
    .line 759
    .line 760
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 761
    .line 762
    return-object v1

    .line 763
    :pswitch_9
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast v1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 766
    .line 767
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 770
    .line 771
    const/4 v3, 0x1

    .line 772
    iput-boolean v3, v1, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 773
    .line 774
    sget-object v1, Lcom/zykj/mistake/feature/notebook/list/w0;->a:Lcom/zykj/mistake/feature/notebook/list/w0;

    .line 775
    .line 776
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 777
    .line 778
    .line 779
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 780
    .line 781
    return-object v1

    .line 782
    :pswitch_a
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 785
    .line 786
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 789
    .line 790
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getLayoutInfo()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-static {v1}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 803
    .line 804
    const/4 v3, 0x0

    .line 805
    if-eqz v1, :cond_21

    .line 806
    .line 807
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    goto :goto_14

    .line 812
    :cond_21
    move v1, v3

    .line 813
    :goto_14
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 814
    .line 815
    invoke-static {v2}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    add-int/lit8 v2, v2, -0x3

    .line 820
    .line 821
    if-lt v1, v2, :cond_22

    .line 822
    .line 823
    const/4 v3, 0x1

    .line 824
    :cond_22
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    return-object v1

    .line 829
    :pswitch_b
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 830
    .line 831
    check-cast v1, Lr6/c;

    .line 832
    .line 833
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 836
    .line 837
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/list/a;->a:Ljava/lang/String;

    .line 838
    .line 839
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 843
    .line 844
    return-object v1

    .line 845
    :pswitch_c
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 848
    .line 849
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v2, Landroidx/compose/runtime/MutableState;

    .line 852
    .line 853
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    check-cast v3, Ljava/lang/Boolean;

    .line 858
    .line 859
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    xor-int/lit8 v3, v3, 0x1

    .line 864
    .line 865
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    invoke-interface {v2, v3}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    check-cast v2, Ljava/lang/Boolean;

    .line 877
    .line 878
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    iput-boolean v2, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->c:Z

    .line 883
    .line 884
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->c()V

    .line 885
    .line 886
    .line 887
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 888
    .line 889
    return-object v1

    .line 890
    :pswitch_d
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v1, Lr6/c;

    .line 893
    .line 894
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 897
    .line 898
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 902
    .line 903
    return-object v1

    .line 904
    :pswitch_e
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v1, Lr6/c;

    .line 907
    .line 908
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/o3;

    .line 911
    .line 912
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 916
    .line 917
    return-object v1

    .line 918
    :pswitch_f
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v1, Lr6/c;

    .line 921
    .line 922
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/j3;

    .line 925
    .line 926
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 930
    .line 931
    return-object v1

    .line 932
    :pswitch_10
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v1, Lr6/c;

    .line 935
    .line 936
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 939
    .line 940
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/s2;

    .line 941
    .line 942
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/detail/p0;->c:Ljava/lang/String;

    .line 943
    .line 944
    const/4 v4, 0x0

    .line 945
    invoke-direct {v3, v2, v4, v4}, Lcom/zykj/mistake/feature/notebook/detail/s2;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 946
    .line 947
    .line 948
    invoke-interface {v1, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 952
    .line 953
    return-object v1

    .line 954
    :pswitch_11
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v1, Lr6/c;

    .line 957
    .line 958
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v2, Ljava/lang/Integer;

    .line 961
    .line 962
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 966
    .line 967
    return-object v1

    .line 968
    :pswitch_12
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v1, Lr6/c;

    .line 971
    .line 972
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 973
    .line 974
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/n;

    .line 975
    .line 976
    iget-wide v2, v2, Lcom/zykj/mistake/feature/collection/detail/n;->a:J

    .line 977
    .line 978
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 986
    .line 987
    return-object v1

    .line 988
    :pswitch_13
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 991
    .line 992
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 993
    .line 994
    check-cast v2, Ljava/util/List;

    .line 995
    .line 996
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getLayoutInfo()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    invoke-static {v1}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 1009
    .line 1010
    const/4 v3, 0x0

    .line 1011
    if-eqz v1, :cond_23

    .line 1012
    .line 1013
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    goto :goto_15

    .line 1018
    :cond_23
    move v1, v3

    .line 1019
    :goto_15
    invoke-static {v2}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    .line 1020
    .line 1021
    .line 1022
    move-result v2

    .line 1023
    add-int/lit8 v2, v2, -0x3

    .line 1024
    .line 1025
    if-lt v1, v2, :cond_24

    .line 1026
    .line 1027
    const/4 v3, 0x1

    .line 1028
    :cond_24
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    return-object v1

    .line 1033
    :pswitch_14
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v1, Lr6/c;

    .line 1036
    .line 1037
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v2, Lcom/zykj/mistake/feature/ask/n;

    .line 1040
    .line 1041
    new-instance v3, Lcom/zykj/mistake/feature/ask/r;

    .line 1042
    .line 1043
    iget-object v2, v2, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1044
    .line 1045
    invoke-direct {v3, v2}, Lcom/zykj/mistake/feature/ask/r;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-interface {v1, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 1052
    .line 1053
    return-object v1

    .line 1054
    :pswitch_15
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 1055
    .line 1056
    check-cast v1, Ln/f;

    .line 1057
    .line 1058
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v2, Lkotlin/jvm/internal/d;

    .line 1061
    .line 1062
    new-instance v3, Lkotlin/Pair;

    .line 1063
    .line 1064
    invoke-direct {v3, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-static {v3}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    return-object v1

    .line 1072
    :pswitch_16
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v1, Landroidx/navigation/compose/DialogNavigator;

    .line 1075
    .line 1076
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v2, Landroidx/navigation/NavBackStackEntry;

    .line 1079
    .line 1080
    invoke-static {v1, v2}, Landroidx/navigation/compose/DialogHostKt;->d(Landroidx/navigation/compose/DialogNavigator;Landroidx/navigation/NavBackStackEntry;)Ld6/s;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    return-object v1

    .line 1085
    :pswitch_17
    iget-object v1, v0, Landroidx/navigation/e;->c:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast v1, Landroidx/navigation/NavController$NavControllerNavigatorState;

    .line 1088
    .line 1089
    iget-object v2, v0, Landroidx/navigation/e;->b:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v2, Landroidx/navigation/NavBackStackEntry;

    .line 1092
    .line 1093
    invoke-static {v1, v2}, Landroidx/navigation/NavController$NavControllerNavigatorState;->a(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;)Ld6/s;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    return-object v1

    .line 1098
    nop

    .line 1099
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
