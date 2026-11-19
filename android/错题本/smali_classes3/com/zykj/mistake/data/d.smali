.class public abstract Lcom/zykj/mistake/data/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final varargs a([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-static {v2}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v2, 0x0

    .line 19
    :cond_2
    if-nez v2, :cond_3

    .line 20
    .line 21
    const-string p0, ""

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_3
    return-object v2
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    return-object p0

    .line 15
    :cond_2
    :goto_1
    const-string p0, ""

    .line 16
    .line 17
    return-object p0
.end method

.method public static final c(Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;II)Lp4/b;
    .locals 26

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getSource()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getExamName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTopicName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "\u672a\u77e5\u6765\u6e90"

    .line 21
    .line 22
    filled-new-array {v0, v2, v3, v4}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/zykj/mistake/data/d;->a([Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :try_start_0
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getRealTitle()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    move-object v0, v4

    .line 56
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object v0, v4

    .line 68
    :goto_1
    if-nez v0, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move-object v13, v0

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    :goto_2
    move-object v13, v2

    .line 74
    :goto_3
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTopicName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lcom/zykj/mistake/data/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTitle()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lcom/zykj/mistake/data/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    move-object v2, v0

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getNumber()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Lcom/zykj/mistake/data/d;->a([Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_5

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :cond_5
    :goto_4
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTitle()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, Lcom/zykj/mistake/data/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getDiff()Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const/4 v5, 0x0

    .line 141
    if-eqz v3, :cond_6

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    goto :goto_5

    .line 148
    :cond_6
    move v3, v5

    .line 149
    :goto_5
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getAttainedLevel()Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move v6, v5

    .line 161
    :goto_6
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getErrorReason()Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    if-eqz v7, :cond_8

    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    goto :goto_7

    .line 172
    :cond_8
    move v7, v5

    .line 173
    :goto_7
    const/4 v8, 0x1

    .line 174
    if-lez v3, :cond_a

    .line 175
    .line 176
    sget-object v9, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 177
    .line 178
    sub-int/2addr v3, v8

    .line 179
    invoke-static {v3, v9}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    check-cast v3, Ljava/lang/String;

    .line 184
    .line 185
    if-eqz v3, :cond_a

    .line 186
    .line 187
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-nez v9, :cond_9

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_9
    move-object v3, v4

    .line 195
    :goto_8
    if-eqz v3, :cond_a

    .line 196
    .line 197
    new-instance v9, Lp4/i;

    .line 198
    .line 199
    sget-object v10, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->RED:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 200
    .line 201
    invoke-direct {v9, v3, v10, v4}, Lp4/i;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;Ljava/lang/Integer;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    :cond_a
    if-lez v6, :cond_c

    .line 208
    .line 209
    sget-object v3, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 210
    .line 211
    sub-int/2addr v6, v8

    .line 212
    invoke-static {v6, v3}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    check-cast v3, Ljava/lang/String;

    .line 217
    .line 218
    if-eqz v3, :cond_c

    .line 219
    .line 220
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-nez v6, :cond_b

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_b
    move-object v3, v4

    .line 228
    :goto_9
    if-eqz v3, :cond_c

    .line 229
    .line 230
    new-instance v6, Lp4/i;

    .line 231
    .line 232
    sget-object v9, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->GREEN:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 233
    .line 234
    invoke-direct {v6, v3, v9, v4}, Lp4/i;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;Ljava/lang/Integer;)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    :cond_c
    if-lez v7, :cond_e

    .line 241
    .line 242
    sget-object v3, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 243
    .line 244
    sub-int/2addr v7, v8

    .line 245
    invoke-static {v7, v3}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, Ljava/lang/String;

    .line 250
    .line 251
    if-eqz v3, :cond_e

    .line 252
    .line 253
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-nez v6, :cond_d

    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_d
    move-object v3, v4

    .line 261
    :goto_a
    if-eqz v3, :cond_e

    .line 262
    .line 263
    new-instance v6, Lp4/i;

    .line 264
    .line 265
    sget-object v7, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->ORANGE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 266
    .line 267
    invoke-direct {v6, v3, v7, v4}, Lp4/i;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;Ljava/lang/Integer;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    :cond_e
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTagNames()Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    if-nez v3, :cond_f

    .line 278
    .line 279
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 280
    .line 281
    :cond_f
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_13

    .line 290
    .line 291
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Ljava/lang/String;

    .line 296
    .line 297
    new-instance v7, Lp4/i;

    .line 298
    .line 299
    if-eqz v6, :cond_11

    .line 300
    .line 301
    invoke-static {v6}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-nez v9, :cond_10

    .line 306
    .line 307
    goto :goto_c

    .line 308
    :cond_10
    move-object v6, v4

    .line 309
    :goto_c
    if-nez v6, :cond_12

    .line 310
    .line 311
    :cond_11
    const-string v6, "\u6807\u7b7e"

    .line 312
    .line 313
    :cond_12
    sget-object v9, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->BLUE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 314
    .line 315
    invoke-direct {v7, v6, v9, v4}, Lp4/i;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;Ljava/lang/Integer;)V

    .line 316
    .line 317
    .line 318
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_13
    invoke-virtual {v0}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v22

    .line 326
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v3, "mistake_"

    .line 333
    .line 334
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v3, "_"

    .line 341
    .line 342
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    move/from16 v6, p1

    .line 346
    .line 347
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    move/from16 v3, p2

    .line 354
    .line 355
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getBookId()I

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 367
    .line 368
    .line 369
    move-result-wide v9

    .line 370
    long-to-int v0, v9

    .line 371
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTopicId()J

    .line 372
    .line 373
    .line 374
    move-result-wide v9

    .line 375
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getHasStem()Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-eqz v3, :cond_14

    .line 380
    .line 381
    new-instance v3, Lp4/k;

    .line 382
    .line 383
    invoke-direct {v3, v2}, Lp4/k;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    :goto_d
    move-object v11, v3

    .line 387
    goto :goto_e

    .line 388
    :cond_14
    new-instance v3, Lp4/j;

    .line 389
    .line 390
    const/16 v2, 0xa

    .line 391
    .line 392
    invoke-direct {v3, v2}, Lcoil3/network/g;-><init>(I)V

    .line 393
    .line 394
    .line 395
    goto :goto_d

    .line 396
    :goto_e
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getStemShoot()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-static {v2}, Lcom/zykj/mistake/data/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v15

    .line 404
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getNumber()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    if-nez v2, :cond_15

    .line 409
    .line 410
    move/from16 v16, v8

    .line 411
    .line 412
    goto :goto_f

    .line 413
    :cond_15
    move/from16 v16, v5

    .line 414
    .line 415
    :goto_f
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isRelatedQstGroup()Z

    .line 416
    .line 417
    .line 418
    move-result v17

    .line 419
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getHasStem()Z

    .line 420
    .line 421
    .line 422
    move-result v18

    .line 423
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isInCurrentCollection()Z

    .line 424
    .line 425
    .line 426
    move-result v20

    .line 427
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getCollectionIds()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-nez v2, :cond_16

    .line 432
    .line 433
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 434
    .line 435
    :cond_16
    invoke-static {v2}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 436
    .line 437
    .line 438
    move-result-object v21

    .line 439
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isMastered()Ljava/lang/Boolean;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v19

    .line 449
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getRightCount()I

    .line 450
    .line 451
    .line 452
    move-result v23

    .line 453
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getWrongCount()I

    .line 454
    .line 455
    .line 456
    move-result v24

    .line 457
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getCreationTime()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    if-eqz v1, :cond_19

    .line 462
    .line 463
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-nez v2, :cond_17

    .line 468
    .line 469
    move-object v4, v1

    .line 470
    :cond_17
    if-nez v4, :cond_18

    .line 471
    .line 472
    goto :goto_11

    .line 473
    :cond_18
    const-string v1, "T"

    .line 474
    .line 475
    invoke-static {v4, v1}, Lkotlin/text/p;->g0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    const-string v2, " "

    .line 480
    .line 481
    invoke-static {v1, v2}, Lkotlin/text/p;->g0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    :goto_10
    move-object/from16 v25, v1

    .line 486
    .line 487
    goto :goto_12

    .line 488
    :cond_19
    :goto_11
    const-string v1, ""

    .line 489
    .line 490
    goto :goto_10

    .line 491
    :goto_12
    new-instance v5, Lp4/b;

    .line 492
    .line 493
    move v8, v0

    .line 494
    invoke-direct/range {v5 .. v25}, Lp4/b;-><init>(Ljava/lang/String;IIJLcoil3/network/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/util/Set;Ljava/util/List;IILjava/lang/String;)V

    .line 495
    .line 496
    .line 497
    return-object v5
.end method
