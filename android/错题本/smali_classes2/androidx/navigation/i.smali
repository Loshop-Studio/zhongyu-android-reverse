.class public final synthetic Landroidx/navigation/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/i;->a:I

    iput-object p1, p0, Landroidx/navigation/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/sync/a;Lh7/b;)V
    .locals 0

    .line 2
    const/16 p2, 0x13

    iput p2, p0, Landroidx/navigation/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/i;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 85

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/navigation/i;->a:I

    .line 6
    .line 7
    const-string/jumbo v3, "resp"

    .line 8
    .line 9
    .line 10
    const-wide v4, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/16 v6, 0x20

    .line 16
    .line 17
    const-string v7, "<set-?>"

    .line 18
    .line 19
    const-string v8, "$this$buildSerialDescriptor"

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const/16 v10, 0xa

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x1

    .line 26
    const-string v13, "it"

    .line 27
    .line 28
    sget-object v14, Ld6/s;->a:Ld6/s;

    .line 29
    .line 30
    iget-object v15, v0, Landroidx/navigation/i;->b:Ljava/lang/Object;

    .line 31
    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    check-cast v15, Li7/b;

    .line 36
    .line 37
    check-cast v1, Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v15

    .line 43
    :pswitch_0
    check-cast v15, Lm7/n1;

    .line 44
    .line 45
    check-cast v1, Lk7/a;

    .line 46
    .line 47
    const-string v2, "$this$buildClassSerialDescriptor"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v15, Lm7/n1;->a:Li7/b;

    .line 53
    .line 54
    invoke-interface {v2}, Li7/e;->getDescriptor()Lk7/g;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "first"

    .line 59
    .line 60
    invoke-static {v1, v3, v2}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v15, Lm7/n1;->b:Li7/b;

    .line 64
    .line 65
    invoke-interface {v2}, Li7/e;->getDescriptor()Lk7/g;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string/jumbo v3, "second"

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v3, v2}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v15, Lm7/n1;->c:Li7/b;

    .line 76
    .line 77
    invoke-interface {v2}, Li7/e;->getDescriptor()Lk7/g;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string/jumbo v3, "third"

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v3, v2}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 85
    .line 86
    .line 87
    return-object v14

    .line 88
    :pswitch_1
    check-cast v15, Lk7/g;

    .line 89
    .line 90
    check-cast v1, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v15, v1}, Lk7/g;->e(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v3, ": "

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-interface {v15, v1}, Lk7/g;->g(I)Lk7/g;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v1}, Lk7/g;->h()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    return-object v1

    .line 129
    :pswitch_2
    check-cast v15, Lm7/y;

    .line 130
    .line 131
    check-cast v1, Lk7/a;

    .line 132
    .line 133
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v2, v15, Lm7/y;->b:Ljava/io/Serializable;

    .line 137
    .line 138
    check-cast v2, Lkotlin/collections/EmptyList;

    .line 139
    .line 140
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iput-object v2, v1, Lk7/a;->b:Ljava/util/List;

    .line 144
    .line 145
    return-object v14

    .line 146
    :pswitch_3
    check-cast v15, Lkotlin/text/l;

    .line 147
    .line 148
    check-cast v1, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-virtual {v15, v1}, Lkotlin/text/l;->a(I)Lkotlin/text/j;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    return-object v1

    .line 159
    :pswitch_4
    check-cast v15, Lkotlin/jvm/internal/r;

    .line 160
    .line 161
    check-cast v1, Ly6/s;

    .line 162
    .line 163
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v2, v1, Ly6/s;->a:Lkotlin/reflect/KVariance;

    .line 170
    .line 171
    iget-object v1, v1, Ly6/s;->b:Ly6/q;

    .line 172
    .line 173
    if-nez v2, :cond_0

    .line 174
    .line 175
    const-string v1, "*"

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_0
    instance-of v3, v1, Lkotlin/jvm/internal/r;

    .line 179
    .line 180
    if-eqz v3, :cond_1

    .line 181
    .line 182
    move-object v9, v1

    .line 183
    check-cast v9, Lkotlin/jvm/internal/r;

    .line 184
    .line 185
    :cond_1
    if-eqz v9, :cond_3

    .line 186
    .line 187
    invoke-virtual {v9, v12}, Lkotlin/jvm/internal/r;->c(Z)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    if-nez v3, :cond_2

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_2
    move-object v1, v3

    .line 195
    goto :goto_1

    .line 196
    :cond_3
    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    :goto_1
    sget-object v3, Lkotlin/jvm/internal/q;->a:[I

    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    aget v2, v3, v2

    .line 207
    .line 208
    if-eq v2, v12, :cond_6

    .line 209
    .line 210
    const/4 v3, 0x2

    .line 211
    if-eq v2, v3, :cond_5

    .line 212
    .line 213
    const/4 v3, 0x3

    .line 214
    if-ne v2, v3, :cond_4

    .line 215
    .line 216
    const-string v2, "out "

    .line 217
    .line 218
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    goto :goto_2

    .line 223
    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 224
    .line 225
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 226
    .line 227
    .line 228
    throw v1

    .line 229
    :cond_5
    const-string v2, "in "

    .line 230
    .line 231
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_6
    :goto_2
    return-object v1

    .line 236
    :pswitch_5
    check-cast v15, Lkotlin/collections/h;

    .line 237
    .line 238
    check-cast v1, Ljava/util/Map$Entry;

    .line 239
    .line 240
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    new-instance v2, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    const-string v4, "(this Map)"

    .line 253
    .line 254
    if-ne v3, v15, :cond_7

    .line 255
    .line 256
    move-object v3, v4

    .line 257
    goto :goto_3

    .line 258
    :cond_7
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const/16 v3, 0x3d

    .line 266
    .line 267
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-ne v1, v15, :cond_8

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_8
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    :goto_4
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    return-object v1

    .line 289
    :pswitch_6
    check-cast v15, Lkotlin/collections/a;

    .line 290
    .line 291
    if-ne v1, v15, :cond_9

    .line 292
    .line 293
    const-string v1, "(this Collection)"

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    :goto_5
    return-object v1

    .line 301
    :pswitch_7
    check-cast v15, Li7/c;

    .line 302
    .line 303
    check-cast v1, Lk7/a;

    .line 304
    .line 305
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    const-string/jumbo v2, "type"

    .line 309
    .line 310
    .line 311
    sget-object v3, Lm7/m1;->b:Lm7/e1;

    .line 312
    .line 313
    invoke-static {v1, v2, v3}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 314
    .line 315
    .line 316
    new-instance v2, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    const-string v3, "kotlinx.serialization.Polymorphic<"

    .line 319
    .line 320
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    iget-object v3, v15, Li7/c;->a:Ly6/c;

    .line 324
    .line 325
    check-cast v3, Lkotlin/jvm/internal/d;

    .line 326
    .line 327
    invoke-virtual {v3}, Lkotlin/jvm/internal/d;->e()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const/16 v3, 0x3e

    .line 335
    .line 336
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    sget-object v3, Lk7/j;->b:Lk7/j;

    .line 344
    .line 345
    new-array v4, v11, [Lk7/g;

    .line 346
    .line 347
    invoke-static {v2, v3, v4}, La/a;->h(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;)Lk7/h;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    const-string/jumbo v3, "value"

    .line 352
    .line 353
    .line 354
    invoke-static {v1, v3, v2}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 355
    .line 356
    .line 357
    iget-object v2, v15, Li7/c;->b:Lkotlin/collections/EmptyList;

    .line 358
    .line 359
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    iput-object v2, v1, Lk7/a;->b:Ljava/util/List;

    .line 363
    .line 364
    return-object v14

    .line 365
    :pswitch_8
    check-cast v15, Lkotlinx/coroutines/sync/a;

    .line 366
    .line 367
    check-cast v1, Ljava/lang/Throwable;

    .line 368
    .line 369
    invoke-virtual {v15, v9}, Lkotlinx/coroutines/sync/a;->g(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-object v14

    .line 373
    :pswitch_9
    check-cast v15, Ljava/util/ArrayList;

    .line 374
    .line 375
    check-cast v1, Ljava/util/List;

    .line 376
    .line 377
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    return-object v1

    .line 386
    :pswitch_a
    check-cast v15, Ljava/util/Set;

    .line 387
    .line 388
    check-cast v1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 389
    .line 390
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    const/4 v3, -0x1

    .line 395
    if-ne v2, v3, :cond_a

    .line 396
    .line 397
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 398
    .line 399
    .line 400
    move-result-wide v1

    .line 401
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-interface {v15, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-nez v1, :cond_a

    .line 410
    .line 411
    move v11, v12

    .line 412
    :cond_a
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    return-object v1

    .line 417
    :pswitch_b
    check-cast v15, Lcom/zykj/mistake/main/a;

    .line 418
    .line 419
    check-cast v1, Lcom/zykj/mistake/main/a1;

    .line 420
    .line 421
    const-string/jumbo v2, "state"

    .line 422
    .line 423
    .line 424
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    const-string/jumbo v2, "\u8bf7\u8f93\u5165\u6807\u7b7e\u540d\u79f0"

    .line 428
    .line 429
    .line 430
    const/16 v3, 0x17

    .line 431
    .line 432
    invoke-static {v15, v9, v2, v11, v3}, Lcom/zykj/mistake/main/a;->a(Lcom/zykj/mistake/main/a;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/zykj/mistake/main/a;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/4 v3, 0x7

    .line 437
    invoke-static {v1, v9, v2, v3}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    return-object v1

    .line 442
    :pswitch_c
    check-cast v15, Lcom/zykj/mistake/main/l;

    .line 443
    .line 444
    check-cast v1, Lcom/zykj/mistake/main/p;

    .line 445
    .line 446
    const-string v2, "draft"

    .line 447
    .line 448
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    check-cast v15, Lcom/zykj/mistake/main/x0;

    .line 452
    .line 453
    iget v4, v15, Lcom/zykj/mistake/main/x0;->a:I

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const/16 v14, 0xffb

    .line 457
    .line 458
    const/4 v2, 0x0

    .line 459
    const/4 v3, 0x0

    .line 460
    const/4 v5, 0x0

    .line 461
    const/4 v6, 0x0

    .line 462
    const/4 v7, 0x0

    .line 463
    const/4 v8, 0x0

    .line 464
    const/4 v9, 0x0

    .line 465
    const/4 v10, 0x0

    .line 466
    const/4 v11, 0x0

    .line 467
    const/4 v12, 0x0

    .line 468
    invoke-static/range {v1 .. v14}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    return-object v1

    .line 473
    :pswitch_d
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/v1;

    .line 474
    .line 475
    check-cast v1, Lp4/e;

    .line 476
    .line 477
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    iget-object v8, v15, Lcom/zykj/mistake/feature/notebook/detail/v1;->e:Ljava/util/ArrayList;

    .line 481
    .line 482
    const/16 v9, 0x3ff

    .line 483
    .line 484
    const-wide/16 v2, 0x0

    .line 485
    .line 486
    const/4 v4, 0x0

    .line 487
    const/4 v5, 0x0

    .line 488
    const/4 v6, 0x0

    .line 489
    const/4 v7, 0x0

    .line 490
    invoke-static/range {v1 .. v9}, Lp4/e;->a(Lp4/e;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Lp4/e;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    return-object v1

    .line 495
    :pswitch_e
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 496
    .line 497
    iget-object v2, v15, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 498
    .line 499
    check-cast v1, Ljava/util/List;

    .line 500
    .line 501
    const-string v3, "collections"

    .line 502
    .line 503
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    if-eqz v3, :cond_c

    .line 511
    .line 512
    :cond_b
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    move-object v15, v1

    .line 517
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 518
    .line 519
    sget-object v74, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;->EMPTY_DIRECT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    .line 520
    .line 521
    const v83, -0x2e00001

    .line 522
    .line 523
    .line 524
    const/16 v84, 0x1

    .line 525
    .line 526
    const/16 v16, 0x0

    .line 527
    .line 528
    const/16 v17, 0x0

    .line 529
    .line 530
    const-wide/16 v18, 0x0

    .line 531
    .line 532
    const/16 v20, 0x0

    .line 533
    .line 534
    const/16 v21, 0x0

    .line 535
    .line 536
    const/16 v22, 0x0

    .line 537
    .line 538
    const/16 v23, 0x0

    .line 539
    .line 540
    const/16 v24, 0x0

    .line 541
    .line 542
    const/16 v25, 0x0

    .line 543
    .line 544
    const/16 v26, 0x0

    .line 545
    .line 546
    const/16 v27, 0x0

    .line 547
    .line 548
    const/16 v28, 0x0

    .line 549
    .line 550
    const/16 v29, 0x0

    .line 551
    .line 552
    const/16 v30, 0x0

    .line 553
    .line 554
    const/16 v31, 0x0

    .line 555
    .line 556
    const/16 v32, 0x0

    .line 557
    .line 558
    const/16 v33, 0x0

    .line 559
    .line 560
    const/16 v34, 0x0

    .line 561
    .line 562
    const/16 v35, 0x0

    .line 563
    .line 564
    const/16 v36, 0x0

    .line 565
    .line 566
    const/16 v37, 0x0

    .line 567
    .line 568
    const/16 v38, 0x0

    .line 569
    .line 570
    const/16 v39, 0x0

    .line 571
    .line 572
    const/16 v40, 0x0

    .line 573
    .line 574
    const/16 v41, 0x0

    .line 575
    .line 576
    const/16 v42, 0x0

    .line 577
    .line 578
    const/16 v43, 0x0

    .line 579
    .line 580
    const/16 v44, 0x0

    .line 581
    .line 582
    const/16 v45, 0x0

    .line 583
    .line 584
    const/16 v46, 0x0

    .line 585
    .line 586
    const/16 v47, 0x0

    .line 587
    .line 588
    const/16 v48, 0x0

    .line 589
    .line 590
    const/16 v49, 0x0

    .line 591
    .line 592
    const/16 v50, 0x0

    .line 593
    .line 594
    const/16 v51, 0x0

    .line 595
    .line 596
    const/16 v52, 0x0

    .line 597
    .line 598
    const/16 v53, 0x0

    .line 599
    .line 600
    const/16 v54, 0x0

    .line 601
    .line 602
    const/16 v55, 0x0

    .line 603
    .line 604
    const/16 v56, 0x0

    .line 605
    .line 606
    const/16 v57, 0x0

    .line 607
    .line 608
    const/16 v58, 0x0

    .line 609
    .line 610
    const/16 v59, 0x0

    .line 611
    .line 612
    const/16 v60, 0x0

    .line 613
    .line 614
    const/16 v61, 0x0

    .line 615
    .line 616
    const/16 v62, 0x0

    .line 617
    .line 618
    const/16 v63, 0x0

    .line 619
    .line 620
    const/16 v64, 0x0

    .line 621
    .line 622
    const/16 v65, 0x0

    .line 623
    .line 624
    const/16 v66, 0x0

    .line 625
    .line 626
    const/16 v67, 0x0

    .line 627
    .line 628
    const/16 v68, 0x0

    .line 629
    .line 630
    const/16 v69, 0x0

    .line 631
    .line 632
    const/16 v70, 0x1

    .line 633
    .line 634
    const/16 v73, 0x0

    .line 635
    .line 636
    const/16 v75, 0x0

    .line 637
    .line 638
    const/16 v76, 0x0

    .line 639
    .line 640
    const/16 v77, 0x0

    .line 641
    .line 642
    const/16 v78, 0x0

    .line 643
    .line 644
    const/16 v79, 0x0

    .line 645
    .line 646
    const/16 v80, 0x0

    .line 647
    .line 648
    const/16 v81, 0x0

    .line 649
    .line 650
    const/16 v82, -0x1

    .line 651
    .line 652
    const-string v71, ""

    .line 653
    .line 654
    const-string v72, ""

    .line 655
    .line 656
    invoke-static/range {v15 .. v84}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    invoke-virtual {v2, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    if-eqz v1, :cond_b

    .line 665
    .line 666
    goto/16 :goto_b

    .line 667
    .line 668
    :cond_c
    new-instance v3, Ljava/util/ArrayList;

    .line 669
    .line 670
    invoke-static {v1, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 675
    .line 676
    .line 677
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    if-eqz v4, :cond_e

    .line 686
    .line 687
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    check-cast v4, Lcom/zykj/mistake/data/c;

    .line 692
    .line 693
    new-instance v15, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 694
    .line 695
    iget-object v5, v4, Lcom/zykj/mistake/data/c;->a:Ljava/lang/String;

    .line 696
    .line 697
    iget-object v6, v4, Lcom/zykj/mistake/data/c;->b:Ljava/lang/String;

    .line 698
    .line 699
    iget v7, v4, Lcom/zykj/mistake/data/c;->c:I

    .line 700
    .line 701
    iget v8, v4, Lcom/zykj/mistake/data/c;->d:I

    .line 702
    .line 703
    if-lt v7, v8, :cond_d

    .line 704
    .line 705
    move/from16 v20, v12

    .line 706
    .line 707
    goto :goto_7

    .line 708
    :cond_d
    move/from16 v20, v11

    .line 709
    .line 710
    :goto_7
    iget-boolean v4, v4, Lcom/zykj/mistake/data/c;->e:Z

    .line 711
    .line 712
    move/from16 v21, v4

    .line 713
    .line 714
    move-object/from16 v16, v5

    .line 715
    .line 716
    move-object/from16 v17, v6

    .line 717
    .line 718
    move/from16 v18, v7

    .line 719
    .line 720
    move/from16 v19, v8

    .line 721
    .line 722
    invoke-direct/range {v15 .. v21}, Lcom/zykj/mistake/feature/notebook/list/a;-><init>(Ljava/lang/String;Ljava/lang/String;IIZZ)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    goto :goto_6

    .line 729
    :cond_e
    new-instance v1, Ljava/util/ArrayList;

    .line 730
    .line 731
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 735
    .line 736
    .line 737
    move-result v4

    .line 738
    move v5, v11

    .line 739
    :cond_f
    :goto_8
    if-ge v5, v4, :cond_10

    .line 740
    .line 741
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v6

    .line 745
    add-int/lit8 v5, v5, 0x1

    .line 746
    .line 747
    move-object v7, v6

    .line 748
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 749
    .line 750
    iget-boolean v7, v7, Lcom/zykj/mistake/feature/notebook/list/a;->f:Z

    .line 751
    .line 752
    if-eqz v7, :cond_f

    .line 753
    .line 754
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_8

    .line 758
    :cond_10
    new-instance v4, Ljava/util/ArrayList;

    .line 759
    .line 760
    invoke-static {v1, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 761
    .line 762
    .line 763
    move-result v5

    .line 764
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 768
    .line 769
    .line 770
    move-result v5

    .line 771
    :goto_9
    if-ge v11, v5, :cond_11

    .line 772
    .line 773
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    add-int/lit8 v11, v11, 0x1

    .line 778
    .line 779
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 780
    .line 781
    iget-object v6, v6, Lcom/zykj/mistake/feature/notebook/list/a;->a:Ljava/lang/String;

    .line 782
    .line 783
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    goto :goto_9

    .line 787
    :cond_11
    invoke-static {v4}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 788
    .line 789
    .line 790
    move-result-object v65

    .line 791
    :goto_a
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    move-object v15, v1

    .line 796
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 797
    .line 798
    const v83, -0x36001

    .line 799
    .line 800
    .line 801
    const/16 v84, 0x1

    .line 802
    .line 803
    const/16 v16, 0x0

    .line 804
    .line 805
    const/16 v17, 0x0

    .line 806
    .line 807
    const-wide/16 v18, 0x0

    .line 808
    .line 809
    const/16 v20, 0x0

    .line 810
    .line 811
    const/16 v21, 0x0

    .line 812
    .line 813
    const/16 v22, 0x0

    .line 814
    .line 815
    const/16 v23, 0x0

    .line 816
    .line 817
    const/16 v24, 0x0

    .line 818
    .line 819
    const/16 v25, 0x0

    .line 820
    .line 821
    const/16 v26, 0x0

    .line 822
    .line 823
    const/16 v27, 0x0

    .line 824
    .line 825
    const/16 v28, 0x0

    .line 826
    .line 827
    const/16 v29, 0x0

    .line 828
    .line 829
    const/16 v30, 0x0

    .line 830
    .line 831
    const/16 v31, 0x0

    .line 832
    .line 833
    const/16 v32, 0x0

    .line 834
    .line 835
    const/16 v33, 0x0

    .line 836
    .line 837
    const/16 v34, 0x0

    .line 838
    .line 839
    const/16 v35, 0x0

    .line 840
    .line 841
    const/16 v36, 0x0

    .line 842
    .line 843
    const/16 v37, 0x0

    .line 844
    .line 845
    const/16 v38, 0x0

    .line 846
    .line 847
    const/16 v39, 0x0

    .line 848
    .line 849
    const/16 v40, 0x0

    .line 850
    .line 851
    const/16 v41, 0x0

    .line 852
    .line 853
    const/16 v42, 0x0

    .line 854
    .line 855
    const/16 v43, 0x0

    .line 856
    .line 857
    const/16 v44, 0x0

    .line 858
    .line 859
    const/16 v45, 0x0

    .line 860
    .line 861
    const/16 v46, 0x0

    .line 862
    .line 863
    const/16 v47, 0x0

    .line 864
    .line 865
    const/16 v48, 0x0

    .line 866
    .line 867
    const/16 v49, 0x0

    .line 868
    .line 869
    const/16 v50, 0x0

    .line 870
    .line 871
    const/16 v51, 0x0

    .line 872
    .line 873
    const/16 v52, 0x0

    .line 874
    .line 875
    const/16 v53, 0x0

    .line 876
    .line 877
    const/16 v54, 0x0

    .line 878
    .line 879
    const/16 v55, 0x0

    .line 880
    .line 881
    const/16 v56, 0x0

    .line 882
    .line 883
    const/16 v57, 0x0

    .line 884
    .line 885
    const/16 v58, 0x0

    .line 886
    .line 887
    const/16 v59, 0x0

    .line 888
    .line 889
    const/16 v60, 0x0

    .line 890
    .line 891
    const/16 v61, 0x0

    .line 892
    .line 893
    const/16 v62, 0x1

    .line 894
    .line 895
    const/16 v64, 0x0

    .line 896
    .line 897
    const/16 v67, 0x0

    .line 898
    .line 899
    const/16 v68, 0x0

    .line 900
    .line 901
    const/16 v69, 0x0

    .line 902
    .line 903
    const/16 v70, 0x0

    .line 904
    .line 905
    const/16 v71, 0x0

    .line 906
    .line 907
    const/16 v72, 0x0

    .line 908
    .line 909
    const/16 v73, 0x0

    .line 910
    .line 911
    const/16 v74, 0x0

    .line 912
    .line 913
    const/16 v75, 0x0

    .line 914
    .line 915
    const/16 v76, 0x0

    .line 916
    .line 917
    const/16 v77, 0x0

    .line 918
    .line 919
    const/16 v78, 0x0

    .line 920
    .line 921
    const/16 v79, 0x0

    .line 922
    .line 923
    const/16 v80, 0x0

    .line 924
    .line 925
    const/16 v81, 0x0

    .line 926
    .line 927
    const/16 v82, -0x1

    .line 928
    .line 929
    move-object/from16 v66, v65

    .line 930
    .line 931
    move-object/from16 v63, v3

    .line 932
    .line 933
    invoke-static/range {v15 .. v84}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-virtual {v2, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-eqz v1, :cond_12

    .line 942
    .line 943
    :goto_b
    return-object v14

    .line 944
    :cond_12
    move-object/from16 v3, v63

    .line 945
    .line 946
    goto/16 :goto_a

    .line 947
    .line 948
    :pswitch_f
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 949
    .line 950
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;

    .line 951
    .line 952
    const-string/jumbo v2, "response"

    .line 953
    .line 954
    .line 955
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;->getItems()Ljava/util/List;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    new-instance v2, Ljava/util/ArrayList;

    .line 967
    .line 968
    invoke-static {v1, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 969
    .line 970
    .line 971
    move-result v3

    .line 972
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 973
    .line 974
    .line 975
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 980
    .line 981
    .line 982
    move-result v3

    .line 983
    if-eqz v3, :cond_13

    .line 984
    .line 985
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;

    .line 990
    .line 991
    new-instance v4, Lcom/zykj/mistake/data/c;

    .line 992
    .line 993
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getId()I

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v5

    .line 1001
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getName()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v6

    .line 1005
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getItemCount()I

    .line 1006
    .line 1007
    .line 1008
    move-result v7

    .line 1009
    iget-object v8, v15, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    .line 1010
    .line 1011
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getId()I

    .line 1012
    .line 1013
    .line 1014
    move-result v3

    .line 1015
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    invoke-interface {v8, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v8

    .line 1023
    const/16 v9, 0x8

    .line 1024
    .line 1025
    invoke-direct/range {v4 .. v9}, Lcom/zykj/mistake/data/c;-><init>(Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    goto :goto_c

    .line 1032
    :cond_13
    return-object v2

    .line 1033
    :pswitch_10
    check-cast v15, Landroidx/compose/ui/geometry/Rect;

    .line 1034
    .line 1035
    check-cast v1, Landroidx/compose/ui/unit/Density;

    .line 1036
    .line 1037
    const-string v2, "$this$offset"

    .line 1038
    .line 1039
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v15}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    sget v3, Lcom/zykj/mistake/feature/notebook/detail/s4;->a:F

    .line 1047
    .line 1048
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1049
    .line 1050
    .line 1051
    move-result v1

    .line 1052
    sub-float/2addr v2, v1

    .line 1053
    invoke-static {v2}, Lt6/a;->q(F)I

    .line 1054
    .line 1055
    .line 1056
    move-result v1

    .line 1057
    invoke-virtual {v15}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 1058
    .line 1059
    .line 1060
    move-result v2

    .line 1061
    invoke-static {v2}, Lt6/a;->q(F)I

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    int-to-long v7, v1

    .line 1066
    shl-long v6, v7, v6

    .line 1067
    .line 1068
    int-to-long v1, v2

    .line 1069
    and-long/2addr v1, v4

    .line 1070
    or-long/2addr v1, v6

    .line 1071
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v1

    .line 1075
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->box-impl(J)Landroidx/compose/ui/unit/IntOffset;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    return-object v1

    .line 1080
    :pswitch_11
    check-cast v15, Landroidx/compose/runtime/MutableState;

    .line 1081
    .line 1082
    check-cast v1, Landroidx/compose/ui/geometry/Rect;

    .line 1083
    .line 1084
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-interface {v15, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1088
    .line 1089
    .line 1090
    return-object v14

    .line 1091
    :pswitch_12
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 1092
    .line 1093
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 1094
    .line 1095
    const-string v2, "$this$Canvas"

    .line 1096
    .line 1097
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    new-instance v19, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 1101
    .line 1102
    const/16 v2, 0x10

    .line 1103
    .line 1104
    int-to-float v2, v2

    .line 1105
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1106
    .line 1107
    .line 1108
    move-result v2

    .line 1109
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1110
    .line 1111
    .line 1112
    move-result v17

    .line 1113
    sget-object v2, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 1114
    .line 1115
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    .line 1116
    .line 1117
    .line 1118
    move-result v2

    .line 1119
    const/16 v22, 0x1a

    .line 1120
    .line 1121
    const/16 v23, 0x0

    .line 1122
    .line 1123
    const/16 v18, 0x0

    .line 1124
    .line 1125
    const/16 v20, 0x0

    .line 1126
    .line 1127
    const/16 v21, 0x0

    .line 1128
    .line 1129
    move-object/from16 v16, v19

    .line 1130
    .line 1131
    move/from16 v19, v2

    .line 1132
    .line 1133
    invoke-direct/range {v16 .. v23}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 1134
    .line 1135
    .line 1136
    move-object/from16 v19, v16

    .line 1137
    .line 1138
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 1139
    .line 1140
    .line 1141
    move-result-wide v2

    .line 1142
    shr-long/2addr v2, v6

    .line 1143
    long-to-int v2, v2

    .line 1144
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1145
    .line 1146
    .line 1147
    move-result v2

    .line 1148
    const/high16 v3, 0x40000000    # 2.0f

    .line 1149
    .line 1150
    div-float v16, v2, v3

    .line 1151
    .line 1152
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v2

    .line 1156
    and-long/2addr v2, v4

    .line 1157
    long-to-int v2, v2

    .line 1158
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1159
    .line 1160
    .line 1161
    move-result v2

    .line 1162
    const v3, 0x3f19999a    # 0.6f

    .line 1163
    .line 1164
    .line 1165
    mul-float v17, v2, v3

    .line 1166
    .line 1167
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 1168
    .line 1169
    .line 1170
    move-result-wide v2

    .line 1171
    shr-long/2addr v2, v6

    .line 1172
    long-to-int v2, v2

    .line 1173
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    const v3, 0x3ee147ae    # 0.44f

    .line 1178
    .line 1179
    .line 1180
    mul-float v20, v2, v3

    .line 1181
    .line 1182
    const-wide v2, 0xffffeef0L

    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1188
    .line 1189
    .line 1190
    move-result-wide v21

    .line 1191
    const-wide v2, 0xffff7875L

    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1197
    .line 1198
    .line 1199
    move-result-wide v23

    .line 1200
    iget v2, v15, Lcom/zykj/mistake/feature/notebook/detail/l3;->c:I

    .line 1201
    .line 1202
    iget v3, v15, Lcom/zykj/mistake/feature/notebook/detail/l3;->a:I

    .line 1203
    .line 1204
    move-object/from16 v18, v1

    .line 1205
    .line 1206
    move/from16 v25, v2

    .line 1207
    .line 1208
    move/from16 v26, v3

    .line 1209
    .line 1210
    invoke-static/range {v16 .. v26}, Lcom/zykj/mistake/feature/notebook/detail/x3;->h(FFLandroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/drawscope/Stroke;FJJII)V

    .line 1211
    .line 1212
    .line 1213
    invoke-interface/range {v18 .. v18}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 1214
    .line 1215
    .line 1216
    move-result-wide v1

    .line 1217
    shr-long/2addr v1, v6

    .line 1218
    long-to-int v1, v1

    .line 1219
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1220
    .line 1221
    .line 1222
    move-result v1

    .line 1223
    const v2, 0x3ea8f5c3    # 0.33f

    .line 1224
    .line 1225
    .line 1226
    mul-float v20, v1, v2

    .line 1227
    .line 1228
    const-wide v1, 0xffe9f8f4L

    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v21

    .line 1237
    const-wide v1, 0xff61d7bbL

    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1243
    .line 1244
    .line 1245
    move-result-wide v23

    .line 1246
    iget v1, v15, Lcom/zykj/mistake/feature/notebook/detail/l3;->b:I

    .line 1247
    .line 1248
    iget v2, v15, Lcom/zykj/mistake/feature/notebook/detail/l3;->a:I

    .line 1249
    .line 1250
    move/from16 v25, v1

    .line 1251
    .line 1252
    move/from16 v26, v2

    .line 1253
    .line 1254
    invoke-static/range {v16 .. v26}, Lcom/zykj/mistake/feature/notebook/detail/x3;->h(FFLandroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/drawscope/Stroke;FJJII)V

    .line 1255
    .line 1256
    .line 1257
    invoke-interface/range {v18 .. v18}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 1258
    .line 1259
    .line 1260
    move-result-wide v1

    .line 1261
    shr-long/2addr v1, v6

    .line 1262
    long-to-int v1, v1

    .line 1263
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1264
    .line 1265
    .line 1266
    move-result v1

    .line 1267
    const v2, 0x3e6147ae    # 0.22f

    .line 1268
    .line 1269
    .line 1270
    mul-float v20, v1, v2

    .line 1271
    .line 1272
    const-wide v1, 0xffeff3f7L

    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1278
    .line 1279
    .line 1280
    move-result-wide v21

    .line 1281
    const-wide v1, 0xff5a9dffL

    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1287
    .line 1288
    .line 1289
    move-result-wide v23

    .line 1290
    iget v1, v15, Lcom/zykj/mistake/feature/notebook/detail/l3;->a:I

    .line 1291
    .line 1292
    iget v2, v15, Lcom/zykj/mistake/feature/notebook/detail/l3;->f:I

    .line 1293
    .line 1294
    move/from16 v25, v1

    .line 1295
    .line 1296
    move/from16 v26, v2

    .line 1297
    .line 1298
    invoke-static/range {v16 .. v26}, Lcom/zykj/mistake/feature/notebook/detail/x3;->h(FFLandroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/drawscope/Stroke;FJJII)V

    .line 1299
    .line 1300
    .line 1301
    return-object v14

    .line 1302
    :pswitch_13
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/c5;

    .line 1303
    .line 1304
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 1305
    .line 1306
    const-string v2, "$this$DisposableEffect"

    .line 1307
    .line 1308
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$6$lambda$5$$inlined$onDispose$1;

    .line 1312
    .line 1313
    invoke-direct {v1, v15}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$6$lambda$5$$inlined$onDispose$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/c5;)V

    .line 1314
    .line 1315
    .line 1316
    return-object v1

    .line 1317
    :pswitch_14
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 1318
    .line 1319
    check-cast v1, Landroid/widget/FrameLayout;

    .line 1320
    .line 1321
    const-string v2, "frame"

    .line 1322
    .line 1323
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    iput-object v1, v15, Lcom/zykj/mistake/feature/notebook/detail/a5;->b:Landroid/widget/FrameLayout;

    .line 1330
    .line 1331
    invoke-virtual {v15}, Lcom/zykj/mistake/feature/notebook/detail/a5;->i()V

    .line 1332
    .line 1333
    .line 1334
    return-object v14

    .line 1335
    :pswitch_15
    check-cast v15, Lcom/zykj/mistake/feature/home/MainHomeViewModel;

    .line 1336
    .line 1337
    check-cast v1, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 1338
    .line 1339
    const-string/jumbo v2, "tab"

    .line 1340
    .line 1341
    .line 1342
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1343
    .line 1344
    .line 1345
    new-instance v2, Lcom/zykj/mistake/feature/home/n;

    .line 1346
    .line 1347
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/home/n;-><init>(Lcom/zykj/mistake/feature/home/HomeTab;)V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v15, v2}, Lcom/zykj/mistake/feature/home/MainHomeViewModel;->a(Lcom/zykj/mistake/feature/home/k;)V

    .line 1351
    .line 1352
    .line 1353
    return-object v14

    .line 1354
    :pswitch_16
    check-cast v15, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 1355
    .line 1356
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;

    .line 1357
    .line 1358
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v2

    .line 1365
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;->getTopics()Ljava/util/List;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v2

    .line 1369
    new-instance v3, Ljava/util/ArrayList;

    .line 1370
    .line 1371
    invoke-static {v2, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1372
    .line 1373
    .line 1374
    move-result v4

    .line 1375
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1376
    .line 1377
    .line 1378
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1383
    .line 1384
    .line 1385
    move-result v4

    .line 1386
    if-eqz v4, :cond_14

    .line 1387
    .line 1388
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v4

    .line 1392
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;

    .line 1393
    .line 1394
    new-instance v5, Lp4/a;

    .line 1395
    .line 1396
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->getTopicId()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v6

    .line 1400
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->getTopicName()Ljava/lang/String;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v4

    .line 1404
    invoke-direct {v5, v6, v7, v4}, Lp4/a;-><init>(JLjava/lang/String;)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    goto :goto_d

    .line 1411
    :cond_14
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v1

    .line 1415
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;->getTags()Ljava/util/List;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    new-instance v2, Ljava/util/ArrayList;

    .line 1420
    .line 1421
    invoke-static {v1, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1422
    .line 1423
    .line 1424
    move-result v4

    .line 1425
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1426
    .line 1427
    .line 1428
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v1

    .line 1432
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1433
    .line 1434
    .line 1435
    move-result v4

    .line 1436
    if-eqz v4, :cond_15

    .line 1437
    .line 1438
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v4

    .line 1442
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 1443
    .line 1444
    new-instance v5, Lcom/zykj/mistake/feature/collection/detail/n;

    .line 1445
    .line 1446
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 1447
    .line 1448
    .line 1449
    move-result-wide v6

    .line 1450
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v4

    .line 1454
    invoke-direct {v5, v6, v7, v4}, Lcom/zykj/mistake/feature/collection/detail/n;-><init>(JLjava/lang/String;)V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    goto :goto_e

    .line 1461
    :cond_15
    iget-object v4, v15, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 1462
    .line 1463
    :goto_f
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    move-object/from16 v16, v1

    .line 1468
    .line 1469
    check-cast v16, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1470
    .line 1471
    const v51, -0xc0001

    .line 1472
    .line 1473
    .line 1474
    const/16 v52, 0x3

    .line 1475
    .line 1476
    const/16 v17, 0x0

    .line 1477
    .line 1478
    const/16 v18, 0x0

    .line 1479
    .line 1480
    const/16 v19, 0x0

    .line 1481
    .line 1482
    const/16 v20, 0x0

    .line 1483
    .line 1484
    const/16 v21, 0x0

    .line 1485
    .line 1486
    const/16 v22, 0x0

    .line 1487
    .line 1488
    const/16 v23, 0x0

    .line 1489
    .line 1490
    const/16 v24, 0x0

    .line 1491
    .line 1492
    const/16 v25, 0x0

    .line 1493
    .line 1494
    const/16 v26, 0x0

    .line 1495
    .line 1496
    const/16 v27, 0x0

    .line 1497
    .line 1498
    const/16 v28, 0x0

    .line 1499
    .line 1500
    const/16 v29, 0x0

    .line 1501
    .line 1502
    const/16 v30, 0x0

    .line 1503
    .line 1504
    const/16 v31, 0x0

    .line 1505
    .line 1506
    const/16 v32, 0x0

    .line 1507
    .line 1508
    const/16 v33, 0x0

    .line 1509
    .line 1510
    const/16 v34, 0x0

    .line 1511
    .line 1512
    const/16 v37, 0x0

    .line 1513
    .line 1514
    const/16 v38, 0x0

    .line 1515
    .line 1516
    const/16 v39, 0x0

    .line 1517
    .line 1518
    const/16 v40, 0x0

    .line 1519
    .line 1520
    const/16 v41, 0x0

    .line 1521
    .line 1522
    const/16 v42, 0x0

    .line 1523
    .line 1524
    const/16 v43, 0x0

    .line 1525
    .line 1526
    const/16 v44, 0x0

    .line 1527
    .line 1528
    const/16 v45, 0x0

    .line 1529
    .line 1530
    const/16 v46, 0x0

    .line 1531
    .line 1532
    const/16 v47, 0x0

    .line 1533
    .line 1534
    const/16 v48, 0x0

    .line 1535
    .line 1536
    const/16 v49, 0x0

    .line 1537
    .line 1538
    const/16 v50, 0x0

    .line 1539
    .line 1540
    move-object/from16 v36, v2

    .line 1541
    .line 1542
    move-object/from16 v35, v3

    .line 1543
    .line 1544
    invoke-static/range {v16 .. v52}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v2

    .line 1548
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1549
    .line 1550
    .line 1551
    move-result v1

    .line 1552
    if-eqz v1, :cond_16

    .line 1553
    .line 1554
    return-object v14

    .line 1555
    :cond_16
    move-object/from16 v3, v35

    .line 1556
    .line 1557
    move-object/from16 v2, v36

    .line 1558
    .line 1559
    goto :goto_f

    .line 1560
    :pswitch_17
    check-cast v15, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 1561
    .line 1562
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;

    .line 1563
    .line 1564
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v2

    .line 1571
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;->getTopics()Ljava/util/List;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v2

    .line 1575
    new-instance v3, Ljava/util/ArrayList;

    .line 1576
    .line 1577
    invoke-static {v2, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1578
    .line 1579
    .line 1580
    move-result v4

    .line 1581
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1582
    .line 1583
    .line 1584
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v2

    .line 1588
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v4

    .line 1592
    if-eqz v4, :cond_17

    .line 1593
    .line 1594
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v4

    .line 1598
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;

    .line 1599
    .line 1600
    new-instance v5, Lp4/a;

    .line 1601
    .line 1602
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->getTopicId()J

    .line 1603
    .line 1604
    .line 1605
    move-result-wide v6

    .line 1606
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->getTopicName()Ljava/lang/String;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v4

    .line 1610
    invoke-direct {v5, v6, v7, v4}, Lp4/a;-><init>(JLjava/lang/String;)V

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1614
    .line 1615
    .line 1616
    goto :goto_10

    .line 1617
    :cond_17
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v1

    .line 1621
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;->getTags()Ljava/util/List;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v1

    .line 1625
    new-instance v2, Ljava/util/ArrayList;

    .line 1626
    .line 1627
    invoke-static {v1, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1628
    .line 1629
    .line 1630
    move-result v4

    .line 1631
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1632
    .line 1633
    .line 1634
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1639
    .line 1640
    .line 1641
    move-result v4

    .line 1642
    if-eqz v4, :cond_18

    .line 1643
    .line 1644
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v4

    .line 1648
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 1649
    .line 1650
    new-instance v5, Lcom/zykj/mistake/feature/collection/detail/n;

    .line 1651
    .line 1652
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 1653
    .line 1654
    .line 1655
    move-result-wide v6

    .line 1656
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v4

    .line 1660
    invoke-direct {v5, v6, v7, v4}, Lcom/zykj/mistake/feature/collection/detail/n;-><init>(JLjava/lang/String;)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    goto :goto_11

    .line 1667
    :cond_18
    iget-object v4, v15, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 1668
    .line 1669
    :goto_12
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v1

    .line 1673
    move-object/from16 v16, v1

    .line 1674
    .line 1675
    check-cast v16, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1676
    .line 1677
    const v53, -0x10006001

    .line 1678
    .line 1679
    .line 1680
    const/16 v54, 0x1f

    .line 1681
    .line 1682
    const/16 v17, 0x0

    .line 1683
    .line 1684
    const/16 v18, 0x0

    .line 1685
    .line 1686
    const/16 v19, 0x0

    .line 1687
    .line 1688
    const/16 v20, 0x0

    .line 1689
    .line 1690
    const/16 v21, 0x0

    .line 1691
    .line 1692
    const/16 v22, 0x0

    .line 1693
    .line 1694
    const/16 v23, 0x0

    .line 1695
    .line 1696
    const/16 v24, 0x0

    .line 1697
    .line 1698
    const/16 v25, 0x0

    .line 1699
    .line 1700
    const/16 v26, 0x0

    .line 1701
    .line 1702
    const/16 v27, 0x0

    .line 1703
    .line 1704
    const/16 v28, 0x0

    .line 1705
    .line 1706
    const/16 v31, 0x0

    .line 1707
    .line 1708
    const/16 v32, 0x0

    .line 1709
    .line 1710
    const/16 v33, 0x0

    .line 1711
    .line 1712
    const/16 v34, 0x0

    .line 1713
    .line 1714
    const/16 v35, 0x0

    .line 1715
    .line 1716
    const/16 v36, 0x0

    .line 1717
    .line 1718
    const/16 v37, 0x0

    .line 1719
    .line 1720
    const/16 v38, 0x0

    .line 1721
    .line 1722
    const/16 v39, 0x0

    .line 1723
    .line 1724
    const/16 v40, 0x0

    .line 1725
    .line 1726
    const/16 v41, 0x0

    .line 1727
    .line 1728
    const/16 v42, 0x0

    .line 1729
    .line 1730
    const/16 v43, 0x0

    .line 1731
    .line 1732
    const/16 v44, 0x0

    .line 1733
    .line 1734
    const/16 v45, 0x0

    .line 1735
    .line 1736
    const/16 v46, 0x0

    .line 1737
    .line 1738
    const/16 v47, 0x0

    .line 1739
    .line 1740
    const/16 v48, 0x0

    .line 1741
    .line 1742
    const/16 v49, 0x0

    .line 1743
    .line 1744
    const/16 v50, 0x0

    .line 1745
    .line 1746
    const/16 v51, 0x0

    .line 1747
    .line 1748
    const/16 v52, 0x0

    .line 1749
    .line 1750
    move-object/from16 v30, v2

    .line 1751
    .line 1752
    move-object/from16 v29, v3

    .line 1753
    .line 1754
    invoke-static/range {v16 .. v54}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v2

    .line 1758
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1759
    .line 1760
    .line 1761
    move-result v1

    .line 1762
    if-eqz v1, :cond_19

    .line 1763
    .line 1764
    return-object v14

    .line 1765
    :cond_19
    move-object/from16 v3, v29

    .line 1766
    .line 1767
    move-object/from16 v2, v30

    .line 1768
    .line 1769
    goto :goto_12

    .line 1770
    :pswitch_18
    check-cast v15, Lcom/canhub/cropper/CropImageActivity;

    .line 1771
    .line 1772
    check-cast v1, Landroidx/activity/OnBackPressedCallback;

    .line 1773
    .line 1774
    sget v2, Lcom/canhub/cropper/CropImageActivity;->h:I

    .line 1775
    .line 1776
    const-string/jumbo v2, "this$0"

    .line 1777
    .line 1778
    .line 1779
    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1780
    .line 1781
    .line 1782
    const-string v2, "$this$addCallback"

    .line 1783
    .line 1784
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v15}, Lcom/canhub/cropper/CropImageActivity;->q()V

    .line 1788
    .line 1789
    .line 1790
    return-object v14

    .line 1791
    :pswitch_19
    check-cast v15, Lcoil3/disk/f;

    .line 1792
    .line 1793
    check-cast v1, Ljava/io/IOException;

    .line 1794
    .line 1795
    iput-boolean v12, v15, Lcoil3/disk/f;->l:Z

    .line 1796
    .line 1797
    return-object v14

    .line 1798
    :pswitch_1a
    check-cast v1, Landroidx/navigation/NavDestination;

    .line 1799
    .line 1800
    invoke-static {v15, v1}, Landroidx/navigation/internal/NavGraphImpl;->b(Ljava/lang/Object;Landroidx/navigation/NavDestination;)Ljava/lang/String;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v1

    .line 1804
    return-object v1

    .line 1805
    :pswitch_1b
    check-cast v15, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 1806
    .line 1807
    check-cast v1, Ljava/lang/String;

    .line 1808
    .line 1809
    invoke-static {v15, v1}, Landroidx/navigation/NavGraphNavigator;->c(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v1

    .line 1813
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v1

    .line 1817
    return-object v1

    .line 1818
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
