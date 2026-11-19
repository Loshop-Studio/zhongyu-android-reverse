.class public final Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;
.super Landroidx/room/paging/LimitOffsetPagingSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->getCourseStudyList(Ljava/lang/String;)Landroidx/paging/PagingSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/paging/LimitOffsetPagingSource<",
        "Lcom/zykj/study/data/CourseStudyEntity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;


# direct methods
.method public constructor <init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;->this$0:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3, p4}, Landroidx/room/paging/LimitOffsetPagingSource;-><init>(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;->convertRows$lambda$0(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final convertRows$lambda$0(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 40

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Landroidx/room/RoomRawQuery;->getSql()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual/range {p0 .. p0}, Landroidx/room/RoomRawQuery;->getBindingFunction()Lx7/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :try_start_0
    const-string v0, "userName"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v2, "progress"

    .line 30
    .line 31
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const-string v3, "studyUserId"

    .line 36
    .line 37
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "learnTime"

    .line 42
    .line 43
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-string v5, "id"

    .line 48
    .line 49
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const-string v6, "userId"

    .line 54
    .line 55
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const-string v7, "cover"

    .line 60
    .line 61
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v8, "title"

    .line 66
    .line 67
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const-string v9, "description"

    .line 72
    .line 73
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const-string v10, "periodId"

    .line 78
    .line 79
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const-string v11, "gradeId"

    .line 84
    .line 85
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    const-string v12, "subjectId"

    .line 90
    .line 91
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    const-string v13, "learning"

    .line 96
    .line 97
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    const-string v14, "likes"

    .line 102
    .line 103
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    const-string v15, "isPublic"

    .line 108
    .line 109
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v15

    .line 113
    move/from16 p0, v15

    .line 114
    .line 115
    const-string v15, "status"

    .line 116
    .line 117
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    move/from16 p2, v15

    .line 122
    .line 123
    const-string v15, "createTime"

    .line 124
    .line 125
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    move/from16 v16, v15

    .line 130
    .line 131
    new-instance v15, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 137
    .line 138
    .line 139
    move-result v17

    .line 140
    if-eqz v17, :cond_9

    .line 141
    .line 142
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 143
    .line 144
    .line 145
    move-result v17

    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    if-eqz v17, :cond_0

    .line 149
    .line 150
    move-object/from16 v22, v18

    .line 151
    .line 152
    move/from16 v17, v14

    .line 153
    .line 154
    move-object/from16 v37, v15

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_0
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v17

    .line 161
    move-object/from16 v22, v17

    .line 162
    .line 163
    move-object/from16 v37, v15

    .line 164
    .line 165
    move/from16 v17, v14

    .line 166
    .line 167
    :goto_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 168
    .line 169
    .line 170
    move-result-wide v14

    .line 171
    long-to-int v14, v14

    .line 172
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    if-eqz v15, :cond_1

    .line 177
    .line 178
    move-object/from16 v34, v18

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_1
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    move-object/from16 v34, v15

    .line 186
    .line 187
    :goto_2
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_2

    .line 192
    .line 193
    move-object/from16 v15, v18

    .line 194
    .line 195
    :goto_3
    move/from16 v38, v0

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_2
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 199
    .line 200
    .line 201
    move-result-wide v19

    .line 202
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    goto :goto_3

    .line 207
    :goto_4
    invoke-static/range {p1 .. p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0, v15}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 212
    .line 213
    .line 214
    move-result-object v36

    .line 215
    move v0, v2

    .line 216
    move v15, v3

    .line 217
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 218
    .line 219
    .line 220
    move-result-wide v2

    .line 221
    long-to-int v2, v2

    .line 222
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_3

    .line 227
    .line 228
    move-object/from16 v21, v18

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    move-object/from16 v21, v3

    .line 236
    .line 237
    :goto_5
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_4

    .line 242
    .line 243
    move-object/from16 v23, v18

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_4
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    move-object/from16 v23, v3

    .line 251
    .line 252
    :goto_6
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_5

    .line 257
    .line 258
    move-object/from16 v24, v18

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_5
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    move-object/from16 v24, v3

    .line 266
    .line 267
    :goto_7
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-eqz v3, :cond_6

    .line 272
    .line 273
    move-object/from16 v25, v18

    .line 274
    .line 275
    :goto_8
    move/from16 v20, v2

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_6
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    move-object/from16 v25, v3

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :goto_9
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v2

    .line 289
    long-to-int v2, v2

    .line 290
    move/from16 v26, v2

    .line 291
    .line 292
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    long-to-int v2, v2

    .line 297
    move/from16 v27, v2

    .line 298
    .line 299
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v2

    .line 303
    long-to-int v2, v2

    .line 304
    move/from16 v28, v2

    .line 305
    .line 306
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 307
    .line 308
    .line 309
    move-result-wide v2

    .line 310
    long-to-int v2, v2

    .line 311
    move/from16 v39, v5

    .line 312
    .line 313
    move/from16 v3, v17

    .line 314
    .line 315
    move/from16 v17, v4

    .line 316
    .line 317
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v4

    .line 321
    long-to-int v4, v4

    .line 322
    move/from16 v5, p0

    .line 323
    .line 324
    move/from16 v29, v2

    .line 325
    .line 326
    move/from16 p0, v3

    .line 327
    .line 328
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v2

    .line 332
    long-to-int v2, v2

    .line 333
    if-eqz v2, :cond_7

    .line 334
    .line 335
    const/4 v2, 0x1

    .line 336
    :goto_a
    move/from16 v31, v2

    .line 337
    .line 338
    move/from16 v2, p2

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_7
    const/4 v2, 0x0

    .line 342
    goto :goto_a

    .line 343
    :goto_b
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    move/from16 p2, v0

    .line 348
    .line 349
    invoke-static/range {p1 .. p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0, v3}, Lcom/zykj/study/data/Converters;->stringToSessionOrderType(Ljava/lang/String;)Lcom/zykj/study/bean/course/CourseType;

    .line 354
    .line 355
    .line 356
    move-result-object v32

    .line 357
    move/from16 v0, v16

    .line 358
    .line 359
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_8

    .line 364
    .line 365
    :goto_c
    move/from16 v16, v0

    .line 366
    .line 367
    move-object/from16 v3, v18

    .line 368
    .line 369
    goto :goto_d

    .line 370
    :cond_8
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v18

    .line 374
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 375
    .line 376
    .line 377
    move-result-object v18

    .line 378
    goto :goto_c

    .line 379
    :goto_d
    invoke-static/range {p1 .. p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0, v3}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 384
    .line 385
    .line 386
    move-result-object v35

    .line 387
    new-instance v19, Lcom/zykj/study/data/CourseStudyEntity;

    .line 388
    .line 389
    move/from16 v30, v4

    .line 390
    .line 391
    move/from16 v33, v14

    .line 392
    .line 393
    invoke-direct/range {v19 .. v36}, Lcom/zykj/study/data/CourseStudyEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;)V

    .line 394
    .line 395
    .line 396
    move-object/from16 v0, v19

    .line 397
    .line 398
    move-object/from16 v3, v37

    .line 399
    .line 400
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 401
    .line 402
    .line 403
    move v0, v2

    .line 404
    move/from16 v2, p2

    .line 405
    .line 406
    move/from16 p2, v0

    .line 407
    .line 408
    move v0, v15

    .line 409
    move-object v15, v3

    .line 410
    move v3, v0

    .line 411
    move/from16 v14, p0

    .line 412
    .line 413
    move/from16 p0, v5

    .line 414
    .line 415
    move/from16 v4, v17

    .line 416
    .line 417
    move/from16 v0, v38

    .line 418
    .line 419
    move/from16 v5, v39

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :catchall_0
    move-exception v0

    .line 424
    goto :goto_e

    .line 425
    :cond_9
    move-object v3, v15

    .line 426
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 427
    .line 428
    .line 429
    return-object v3

    .line 430
    :goto_e
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 431
    .line 432
    .line 433
    throw v0
.end method


# virtual methods
.method public convertRows(Landroidx/room/RoomRawQuery;ILm7/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomRawQuery;",
            "I",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;->this$0:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->access$get__db$p(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)Landroidx/room/RoomDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;->this$0:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/study/data/z;

    .line 10
    .line 11
    invoke-direct {v1, p1, v0}, Lcom/zykj/study/data/z;-><init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p2, p1, v0, v1, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
