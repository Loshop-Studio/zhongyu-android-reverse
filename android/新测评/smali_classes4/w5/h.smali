.class public abstract Lw5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(II)Li6/p0;
    .locals 2

    .line 1
    sget-object v0, Li6/p0$e;->b:Li6/p0$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/p0;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Li6/p0$d;->b:Li6/p0$d;

    .line 11
    .line 12
    invoke-virtual {v0}, Li6/p0;->a()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne p0, v1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    sget-object v0, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 20
    .line 21
    invoke-virtual {v0}, Li6/p0;->a()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne p0, v1, :cond_2

    .line 26
    .line 27
    sget-object p0, Lcom/zykj/evaluation/bean/SpecificTrainingType$CompositionTraining;->INSTANCE:Lcom/zykj/evaluation/bean/SpecificTrainingType$CompositionTraining;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/SpecificTrainingType;->getType()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-ne p1, p0, :cond_3

    .line 34
    .line 35
    sget-object p0, Li6/p0$c$b;->b:Li6/p0$c$b;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    sget-object p1, Li6/p0$a;->b:Li6/p0$a;

    .line 39
    .line 40
    invoke-virtual {p1}, Li6/p0;->a()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-ne p0, v1, :cond_3

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    return-object v0
.end method

.method public static final b(Ljava/util/List;)Lcom/zykj/evaluation/bean/TaskDetailInfo;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_15

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-ne v1, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v3, v0

    .line 29
    check-cast v3, Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-static {v2, v4, v5}, Lw5/h;->m(Lcom/zykj/evaluation/bean/DetailSubQuestion;J)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const v34, 0x3fff7ff

    .line 73
    .line 74
    .line 75
    const/16 v35, 0x0

    .line 76
    .line 77
    const-wide/16 v4, 0x0

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const-wide/16 v9, 0x0

    .line 83
    .line 84
    const-wide/16 v11, 0x0

    .line 85
    .line 86
    const-wide/16 v13, 0x0

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/16 v18, 0x0

    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    const/16 v21, 0x0

    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const/16 v23, 0x0

    .line 102
    .line 103
    const/16 v24, 0x0

    .line 104
    .line 105
    const/16 v25, 0x0

    .line 106
    .line 107
    const/16 v26, 0x0

    .line 108
    .line 109
    const/16 v27, 0x0

    .line 110
    .line 111
    const/16 v28, 0x0

    .line 112
    .line 113
    const/16 v29, 0x0

    .line 114
    .line 115
    const/16 v30, 0x0

    .line 116
    .line 117
    const/16 v31, 0x0

    .line 118
    .line 119
    const/16 v32, 0x0

    .line 120
    .line 121
    const/16 v33, 0x0

    .line 122
    .line 123
    move-object/from16 v19, v1

    .line 124
    .line 125
    invoke-static/range {v3 .. v35}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->copy$default(Lcom/zykj/evaluation/bean/TaskDetailInfo;JIILjava/lang/Double;DDDLjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/util/List;IZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :cond_1
    new-instance v14, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    new-instance v15, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v1, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v5, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v6, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    new-instance v7, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v8, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    const-wide/16 v10, 0x0

    .line 170
    .line 171
    move/from16 v28, v3

    .line 172
    .line 173
    move/from16 v18, v4

    .line 174
    .line 175
    move-wide/from16 v16, v10

    .line 176
    .line 177
    move-wide/from16 v19, v16

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    move-object v11, v9

    .line 181
    move-wide/from16 v9, v19

    .line 182
    .line 183
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v21

    .line 187
    if-eqz v21, :cond_14

    .line 188
    .line 189
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v21

    .line 193
    check-cast v21, Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 194
    .line 195
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 196
    .line 197
    .line 198
    move-result-object v22

    .line 199
    if-eqz v22, :cond_3

    .line 200
    .line 201
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->doubleValue()D

    .line 202
    .line 203
    .line 204
    move-result-wide v22

    .line 205
    if-nez v13, :cond_2

    .line 206
    .line 207
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    :cond_2
    invoke-virtual {v13}, Ljava/lang/Number;->doubleValue()D

    .line 212
    .line 213
    .line 214
    move-result-wide v24

    .line 215
    add-double v24, v24, v22

    .line 216
    .line 217
    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    :cond_3
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalAnswerScore()D

    .line 222
    .line 223
    .line 224
    move-result-wide v22

    .line 225
    add-double v9, v9, v22

    .line 226
    .line 227
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 228
    .line 229
    .line 230
    move-result-wide v22

    .line 231
    add-double v16, v16, v22

    .line 232
    .line 233
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstAnswers()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    if-eqz v12, :cond_4

    .line 245
    .line 246
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 247
    .line 248
    .line 249
    :cond_4
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    invoke-static {v12}, Lw5/h;->d(Ljava/util/List;)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 254
    .line 255
    .line 256
    move-result-object v29

    .line 257
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    const-string v23, ""

    .line 262
    .line 263
    if-eqz v12, :cond_9

    .line 264
    .line 265
    if-eqz v29, :cond_9

    .line 266
    .line 267
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 268
    .line 269
    .line 270
    move-result-wide v39

    .line 271
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 272
    .line 273
    .line 274
    move-result v12

    .line 275
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v12

    .line 279
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v24

    .line 283
    if-eqz v24, :cond_5

    .line 284
    .line 285
    move/from16 v24, v3

    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_5
    move/from16 v24, v4

    .line 289
    .line 290
    :goto_2
    if-eqz v24, :cond_6

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_6
    const/4 v12, 0x0

    .line 294
    :goto_3
    if-eqz v12, :cond_7

    .line 295
    .line 296
    invoke-virtual {v12}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    goto :goto_4

    .line 301
    :cond_7
    const/4 v12, 0x0

    .line 302
    :goto_4
    if-nez v12, :cond_8

    .line 303
    .line 304
    move-object/from16 v41, v23

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_8
    move-object/from16 v41, v12

    .line 308
    .line 309
    :goto_5
    const/16 v42, 0x7f

    .line 310
    .line 311
    const/16 v43, 0x0

    .line 312
    .line 313
    const/16 v30, 0x0

    .line 314
    .line 315
    const/16 v31, 0x0

    .line 316
    .line 317
    const-wide/16 v32, 0x0

    .line 318
    .line 319
    const/16 v34, 0x0

    .line 320
    .line 321
    const/16 v35, 0x0

    .line 322
    .line 323
    const/16 v36, 0x0

    .line 324
    .line 325
    const/16 v37, 0x0

    .line 326
    .line 327
    const/16 v38, 0x0

    .line 328
    .line 329
    invoke-static/range {v29 .. v43}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->copy$default(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-wide/from16 v26, v9

    .line 337
    .line 338
    goto/16 :goto_b

    .line 339
    .line 340
    :cond_9
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v12

    .line 344
    invoke-static {v12}, Lw5/h;->c(Ljava/util/List;)I

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    new-instance v3, Ljava/util/ArrayList;

    .line 353
    .line 354
    move-wide/from16 v26, v9

    .line 355
    .line 356
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    if-eqz v9, :cond_f

    .line 372
    .line 373
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v9

    .line 377
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 378
    .line 379
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 388
    .line 389
    .line 390
    move-result v29

    .line 391
    if-eqz v29, :cond_a

    .line 392
    .line 393
    const/16 v29, 0x1

    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_a
    const/16 v29, 0x0

    .line 397
    .line 398
    :goto_7
    if-eqz v29, :cond_b

    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_b
    const/4 v10, 0x0

    .line 402
    :goto_8
    if-eqz v10, :cond_c

    .line 403
    .line 404
    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    goto :goto_9

    .line 409
    :cond_c
    const/4 v10, 0x0

    .line 410
    :goto_9
    if-nez v10, :cond_d

    .line 411
    .line 412
    move-object/from16 v10, v23

    .line 413
    .line 414
    :cond_d
    move-object/from16 v30, v3

    .line 415
    .line 416
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 417
    .line 418
    .line 419
    move-result-wide v2

    .line 420
    move-object/from16 v31, v4

    .line 421
    .line 422
    const/4 v4, 0x1

    .line 423
    if-le v12, v4, :cond_e

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_e
    const/4 v4, 0x0

    .line 427
    :goto_a
    invoke-static {v9, v10, v2, v3, v4}, Lw5/h;->l(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;JZ)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    move-object/from16 v3, v30

    .line 432
    .line 433
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-object/from16 v4, v31

    .line 437
    .line 438
    const/16 v2, 0xa

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_f
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 442
    .line 443
    .line 444
    :goto_b
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlowsCount()I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    add-int v18, v18, v2

    .line 449
    .line 450
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingResult()I

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    sget-object v3, Lcom/zykj/evaluation/bean/constant/RevisingResultEnum;->NOTHING:Lcom/zykj/evaluation/bean/constant/RevisingResultEnum;

    .line 455
    .line 456
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    if-eq v2, v3, :cond_10

    .line 461
    .line 462
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-nez v2, :cond_10

    .line 467
    .line 468
    const/16 v28, 0x0

    .line 469
    .line 470
    :cond_10
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getLastRoundRevisingRecords()Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getMicroClassToQuestionList()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    if-eqz v2, :cond_11

    .line 482
    .line 483
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 484
    .line 485
    .line 486
    :cond_11
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTypicalRightAnswers()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    if-eqz v2, :cond_12

    .line 491
    .line 492
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 493
    .line 494
    .line 495
    :cond_12
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTypicalErrorAnswers()Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    if-eqz v2, :cond_13

    .line 500
    .line 501
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 502
    .line 503
    .line 504
    :cond_13
    move-wide/from16 v9, v26

    .line 505
    .line 506
    const/16 v2, 0xa

    .line 507
    .line 508
    const/4 v3, 0x1

    .line 509
    const/4 v4, 0x0

    .line 510
    goto/16 :goto_1

    .line 511
    .line 512
    :cond_14
    move v2, v4

    .line 513
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 518
    .line 519
    const v32, 0x30de093

    .line 520
    .line 521
    .line 522
    const/16 v33, 0x0

    .line 523
    .line 524
    const-wide/16 v2, 0x0

    .line 525
    .line 526
    const/4 v4, 0x0

    .line 527
    move-object/from16 v29, v5

    .line 528
    .line 529
    const/4 v5, 0x0

    .line 530
    move-object/from16 v27, v7

    .line 531
    .line 532
    move-object/from16 v26, v8

    .line 533
    .line 534
    const-wide/16 v7, 0x0

    .line 535
    .line 536
    move-object/from16 v23, v6

    .line 537
    .line 538
    move-object v6, v13

    .line 539
    const/4 v13, 0x0

    .line 540
    move-wide/from16 v11, v16

    .line 541
    .line 542
    const/16 v16, 0x0

    .line 543
    .line 544
    const/16 v19, 0x0

    .line 545
    .line 546
    const/16 v20, 0x0

    .line 547
    .line 548
    const/16 v21, 0x0

    .line 549
    .line 550
    const/16 v22, 0x0

    .line 551
    .line 552
    const/16 v24, 0x0

    .line 553
    .line 554
    const/16 v25, 0x0

    .line 555
    .line 556
    const/16 v30, 0x0

    .line 557
    .line 558
    const/16 v31, 0x0

    .line 559
    .line 560
    move-object/from16 v17, v1

    .line 561
    .line 562
    move-object v1, v0

    .line 563
    invoke-static/range {v1 .. v33}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->copy$default(Lcom/zykj/evaluation/bean/TaskDetailInfo;JIILjava/lang/Double;DDDLjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/util/List;IZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    return-object v0

    .line 568
    :cond_15
    new-instance v0, Ljava/lang/Exception;

    .line 569
    .line 570
    const-string v1, "TaskDetailInfoList is Empty"

    .line 571
    .line 572
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v0
.end method

.method public static final c(Ljava/util/List;)I
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lw5/h;->c(Ljava/util/List;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 47
    :goto_2
    add-int/2addr v0, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return v0
.end method

.method public static final d(Ljava/util/List;)Lcom/zykj/evaluation/bean/DetailSubQuestion;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lw5/h;->d(Ljava/util/List;)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    :cond_2
    :goto_0
    return-object v0

    .line 47
    :cond_3
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public static final e(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingDraft()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lw5/c;

    .line 20
    .line 21
    const-string v1, "\u8ba2\u6b63\u8349\u7a3f"

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingDraft()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, p0}, Lw5/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static final f(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getExamDraft()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lw5/c;

    .line 20
    .line 21
    const-string v1, "\u6d4b\u8bc4\u8349\u7a3f"

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getExamDraft()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, p0}, Lw5/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static final g(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamMicroLessonComment()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 47
    :goto_1
    if-nez v1, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/4 v0, 0x0

    .line 51
    :goto_2
    check-cast v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamMicroLessonComment()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_4
    const-string p0, ""

    .line 63
    .line 64
    return-object p0
.end method

.method public static final h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_b

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getMicroClassToQuestionList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_a

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v1, v0

    .line 34
    check-cast v1, Lcom/zykj/evaluation/bean/MicroClassInfo;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/MicroClassInfo;->getAddress()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/16 v0, 0xa

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v1, 0x0

    .line 62
    move v2, v1

    .line 63
    :goto_1
    if-ge v2, v0, :cond_9

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    check-cast v3, Lcom/zykj/evaluation/bean/MicroClassInfo;

    .line 72
    .line 73
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/MicroClassInfo;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    const-string v5, " "

    .line 80
    .line 81
    filled-new-array {v5}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    const/4 v8, 0x6

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    const/4 v4, 0x0

    .line 95
    :goto_2
    const-string v5, ""

    .line 96
    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    check-cast v6, Ljava/lang/String;

    .line 104
    .line 105
    if-nez v6, :cond_4

    .line 106
    .line 107
    :cond_3
    move-object v6, v5

    .line 108
    :cond_4
    if-eqz v4, :cond_5

    .line 109
    .line 110
    const/4 v7, 0x1

    .line 111
    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Ljava/lang/String;

    .line 116
    .line 117
    if-nez v4, :cond_6

    .line 118
    .line 119
    :cond_5
    move-object v4, v5

    .line 120
    :cond_6
    new-instance v7, Lw5/d;

    .line 121
    .line 122
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/MicroClassInfo;->getSnapshot()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    if-nez v8, :cond_7

    .line 127
    .line 128
    move-object v8, v5

    .line 129
    :cond_7
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/MicroClassInfo;->getAddress()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-nez v3, :cond_8

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_8
    move-object v5, v3

    .line 137
    :goto_3
    invoke-direct {v7, v8, v5, v6, v4}, Lw5/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    return-object p0

    .line 145
    :cond_a
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
.end method

.method public static final i(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getReviseMicroLessonComment()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 47
    :goto_1
    if-nez v1, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/4 v0, 0x0

    .line 51
    :goto_2
    check-cast v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getReviseMicroLessonComment()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_4
    const-string p0, ""

    .line 63
    .line 64
    return-object p0
.end method

.method public static final j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTypicalErrorAnswers()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v0, 0xa

    .line 17
    .line 18
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/evaluation/bean/TypicalAnswer;

    .line 40
    .line 41
    new-instance v1, Lw5/g;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TypicalAnswer;->getAnswers()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    const-string v3, ""

    .line 54
    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    move-object v2, v3

    .line 58
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TypicalAnswer;->getComments()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object v3, v0

    .line 72
    :goto_1
    const/4 v5, 0x4

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct/range {v1 .. v6}, Lw5/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    return-object p1

    .line 83
    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method public static final k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTypicalRightAnswers()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_4

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v0, 0xa

    .line 17
    .line 18
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/evaluation/bean/TypicalAnswer;

    .line 40
    .line 41
    new-instance v1, Lw5/g;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TypicalAnswer;->getAnswers()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    const-string v3, ""

    .line 54
    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    move-object v2, v3

    .line 58
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TypicalAnswer;->getComments()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    move-object v4, v3

    .line 71
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TypicalAnswer;->getFullname()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move-object v3, v0

    .line 79
    :goto_1
    invoke-direct {v1, v2, v4, v3}, Lw5/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    return-object p1

    .line 87
    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method

.method public static final l(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;JZ)Lcom/zykj/evaluation/bean/DetailSubQuestion;
    .locals 18

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_3

    .line 7
    :cond_0
    invoke-static/range {p1 .. p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_4

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v2, v1

    .line 29
    :goto_0
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object v2, v1

    .line 37
    :goto_1
    if-nez v2, :cond_3

    .line 38
    .line 39
    const-string v2, ""

    .line 40
    .line 41
    :cond_3
    :goto_2
    move-object v15, v2

    .line 42
    goto :goto_4

    .line 43
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_5

    .line 48
    .line 49
    :goto_3
    move-object/from16 v15, p1

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    move-object/from16 v4, p1

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v4, "."

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_2

    .line 79
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    new-instance v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    const/16 v3, 0xa

    .line 88
    .line 89
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 111
    .line 112
    move-wide/from16 v13, p2

    .line 113
    .line 114
    invoke-static {v3, v15, v13, v14, v0}, Lw5/h;->l(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;JZ)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_6
    move-wide/from16 v13, p2

    .line 123
    .line 124
    move-object v12, v1

    .line 125
    const/16 v16, 0x7f

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    const/4 v5, 0x0

    .line 131
    const-wide/16 v6, 0x0

    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v11, 0x0

    .line 137
    move-object/from16 v3, p0

    .line 138
    .line 139
    invoke-static/range {v3 .. v17}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->copy$default(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0
.end method

.method public static final m(Lcom/zykj/evaluation/bean/DetailSubQuestion;J)Lcom/zykj/evaluation/bean/DetailSubQuestion;
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 33
    .line 34
    move-wide/from16 v13, p1

    .line 35
    .line 36
    invoke-static {v2, v13, v14}, Lw5/h;->m(Lcom/zykj/evaluation/bean/DetailSubQuestion;J)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-wide/from16 v13, p1

    .line 45
    .line 46
    :goto_1
    move-object v12, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move-wide/from16 v13, p1

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    goto :goto_1

    .line 52
    :goto_2
    const/16 v16, 0x27f

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const-wide/16 v6, 0x0

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    move-object/from16 v3, p0

    .line 66
    .line 67
    invoke-static/range {v3 .. v17}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->copy$default(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method
