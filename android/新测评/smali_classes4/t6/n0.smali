.class public abstract Lt6/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/evaluation/bean/TaskInfo;Lcom/zykj/evaluation/ui/home/a;)Lt6/o0;
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "evaluationPage"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lm5/e$d;->b:Lm5/e$d;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getEndTime()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-static {v3}, Lcom/blankj/utilcode/util/TimeUtils;->string2Date(Ljava/lang/String;)Ljava/util/Date;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v5, Ljava/util/Date;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v5}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v4

    .line 39
    :goto_0
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getExamState()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    sget-object v6, Lcom/zykj/evaluation/bean/ExamState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/ExamState$Done;

    .line 44
    .line 45
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/ExamState;->getValue()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    sget-object v5, Lcom/zykj/evaluation/bean/TaskState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Done;

    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getTaskState()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    :goto_1
    sget-object v6, Lcom/zykj/evaluation/bean/TaskState$Handling;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Handling;

    .line 63
    .line 64
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-ne v5, v6, :cond_2

    .line 69
    .line 70
    sget-object v1, Lt6/q0$b$d;->d:Lt6/q0$b$d;

    .line 71
    .line 72
    :goto_2
    move-object/from16 v17, v1

    .line 73
    .line 74
    :goto_3
    move/from16 v19, v4

    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_2
    sget-object v6, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 79
    .line 80
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-ne v5, v6, :cond_6

    .line 85
    .line 86
    invoke-static {v1}, Lm5/f;->a(Lm5/e;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    sget-object v1, Lt6/q0$a$g;->e:Lt6/q0$a$g;

    .line 95
    .line 96
    move-object/from16 v17, v1

    .line 97
    .line 98
    const/16 v19, 0x1

    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getAnswerPad()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    sget-object v3, Lt6/q0$a$a;->e:Lt6/q0$a$a;

    .line 114
    .line 115
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getAnswerSheet()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    sget-object v3, Lt6/q0$a$b;->e:Lt6/q0$a$b;

    .line 125
    .line 126
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_5
    new-instance v3, Lt6/q0$a$f;

    .line 130
    .line 131
    invoke-direct {v3, v1}, Lt6/q0$a$f;-><init>(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    move-object/from16 v17, v3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$WaitCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$WaitCorrect;

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eq v5, v1, :cond_d

    .line 144
    .line 145
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Correcting;

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-ne v5, v1, :cond_7

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_7
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-ne v5, v1, :cond_8

    .line 161
    .line 162
    sget-object v1, Lt6/q0$a$e;->e:Lt6/q0$a$e;

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_8
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$WaitRevise;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$WaitRevise;

    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eq v5, v1, :cond_c

    .line 172
    .line 173
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$Revising;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Revising;

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-ne v5, v1, :cond_9

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_9
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Done;

    .line 183
    .line 184
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-ne v5, v1, :cond_b

    .line 189
    .line 190
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCorrectOnline()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_a

    .line 195
    .line 196
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCorrectOnlineState()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    const/4 v3, 0x4

    .line 201
    if-eq v1, v3, :cond_a

    .line 202
    .line 203
    sget-object v1, Lt6/q0$a$d;->e:Lt6/q0$a$d;

    .line 204
    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_a
    sget-object v1, Lt6/q0$a$g;->e:Lt6/q0$a$g;

    .line 208
    .line 209
    goto/16 :goto_2

    .line 210
    .line 211
    :cond_b
    sget-object v1, Lt6/q0$a$d;->e:Lt6/q0$a$d;

    .line 212
    .line 213
    goto/16 :goto_2

    .line 214
    .line 215
    :cond_c
    :goto_4
    sget-object v1, Lt6/q0$a$g;->e:Lt6/q0$a$g;

    .line 216
    .line 217
    goto/16 :goto_2

    .line 218
    .line 219
    :cond_d
    :goto_5
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCorrectOnline()Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_e

    .line 224
    .line 225
    sget-object v1, Lt6/q0$a$d;->e:Lt6/q0$a$d;

    .line 226
    .line 227
    goto/16 :goto_2

    .line 228
    .line 229
    :cond_e
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCorrectWithSelf()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_f

    .line 234
    .line 235
    sget-object v1, Lt6/q0$a$c;->e:Lt6/q0$a$c;

    .line 236
    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_f
    sget-object v1, Lt6/q0$a$g;->e:Lt6/q0$a$g;

    .line 240
    .line 241
    goto/16 :goto_2

    .line 242
    .line 243
    :goto_6
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getStartTime()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-nez v1, :cond_10

    .line 248
    .line 249
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCreationTime()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    add-int/lit8 v3, v3, -0x3

    .line 258
    .line 259
    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    const-string v3, "substring(...)"

    .line 264
    .line 265
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getEndTime()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    if-eqz v6, :cond_11

    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    add-int/lit8 v8, v8, -0x3

    .line 279
    .line 280
    invoke-virtual {v6, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_11
    const/4 v6, 0x0

    .line 289
    :goto_7
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getExamTaskId()J

    .line 290
    .line 291
    .line 292
    move-result-wide v8

    .line 293
    move-wide v10, v8

    .line 294
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getExamName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    move-wide v11, v10

    .line 299
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getTopicName()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    move-wide v12, v11

    .line 304
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCorrectWithSelf()Z

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    move-wide v13, v12

    .line 309
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getCorrectOnline()Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    move-wide v14, v13

    .line 314
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted()Z

    .line 315
    .line 316
    .line 317
    move-result v13

    .line 318
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 319
    .line 320
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-ne v5, v3, :cond_12

    .line 325
    .line 326
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getAnsweringUrge()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    goto :goto_8

    .line 331
    :cond_12
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 332
    .line 333
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-ne v5, v3, :cond_13

    .line 338
    .line 339
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getRevisingUrge()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    goto :goto_8

    .line 344
    :cond_13
    move v3, v4

    .line 345
    :goto_8
    const-string v8, ""

    .line 346
    .line 347
    if-eqz v6, :cond_14

    .line 348
    .line 349
    new-instance v4, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    const-string v7, "\t\t\u622a\u6b62\u65f6\u95f4\uff1a"

    .line 355
    .line 356
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    if-nez v4, :cond_15

    .line 367
    .line 368
    :cond_14
    move-object v4, v8

    .line 369
    :cond_15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    const-string v7, "\u5f00\u59cb\u65f6\u95f4\uff1a"

    .line 375
    .line 376
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    const/4 v4, 0x0

    .line 390
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect()Z

    .line 391
    .line 392
    .line 393
    move-result v16

    .line 394
    instance-of v0, v0, Lcom/zykj/evaluation/ui/home/a$b;

    .line 395
    .line 396
    if-eqz v0, :cond_16

    .line 397
    .line 398
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->isRead()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-nez v0, :cond_16

    .line 403
    .line 404
    const/16 v18, 0x1

    .line 405
    .line 406
    :goto_9
    const/4 v0, 0x1

    .line 407
    goto :goto_a

    .line 408
    :cond_16
    move/from16 v18, v4

    .line 409
    .line 410
    goto :goto_9

    .line 411
    :goto_a
    invoke-static {v2}, Lt6/n0;->b(Lcom/zykj/evaluation/bean/TaskInfo;)Z

    .line 412
    .line 413
    .line 414
    move-result v20

    .line 415
    invoke-static {v2}, Lt6/n0;->c(Lcom/zykj/evaluation/bean/TaskInfo;)Z

    .line 416
    .line 417
    .line 418
    move-result v21

    .line 419
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getSpecificTrainingType()I

    .line 420
    .line 421
    .line 422
    move-result v25

    .line 423
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getAddress()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    if-nez v6, :cond_17

    .line 428
    .line 429
    move-object/from16 v26, v8

    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_17
    move-object/from16 v26, v6

    .line 433
    .line 434
    :goto_b
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getTestPagerId()J

    .line 435
    .line 436
    .line 437
    move-result-wide v27

    .line 438
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getSerialNum()I

    .line 439
    .line 440
    .line 441
    move-result v29

    .line 442
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem()Z

    .line 443
    .line 444
    .line 445
    move-result v23

    .line 446
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskInfo;->getExamState()I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-ne v2, v0, :cond_18

    .line 451
    .line 452
    move/from16 v24, v0

    .line 453
    .line 454
    goto :goto_c

    .line 455
    :cond_18
    move/from16 v24, v4

    .line 456
    .line 457
    :goto_c
    new-instance v6, Lt6/o0;

    .line 458
    .line 459
    move/from16 v22, v5

    .line 460
    .line 461
    move-wide v7, v14

    .line 462
    move-object v15, v1

    .line 463
    move v14, v3

    .line 464
    invoke-direct/range {v6 .. v29}, Lt6/o0;-><init>(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JI)V

    .line 465
    .line 466
    .line 467
    return-object v6
.end method

.method public static final b(Lcom/zykj/evaluation/bean/TaskInfo;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskInfo;->getSize()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    sget-object v0, Lcom/zykj/evaluation/bean/PageSize$A3Special;->INSTANCE:Lcom/zykj/evaluation/bean/PageSize$A3Special;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/PageSize;->getValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static final c(Lcom/zykj/evaluation/bean/TaskInfo;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/evaluation/bean/SpecificTrainingType$Normal;->INSTANCE:Lcom/zykj/evaluation/bean/SpecificTrainingType$Normal;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/SpecificTrainingType;->getType()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/zykj/evaluation/bean/SpecificTrainingType$TeachMaterial;->INSTANCE:Lcom/zykj/evaluation/bean/SpecificTrainingType$TeachMaterial;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/SpecificTrainingType;->getType()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/TaskInfo;->getSpecificTrainingType()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method
