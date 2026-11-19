.class public final Lcom/friday/common/dao/FileDao_Impl$getByParentIdByNamePagingForStudent$1;
.super Landroidx/room/paging/LimitOffsetPagingSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/FileDao_Impl;->C(Ljava/lang/String;J)Landroidx/paging/PagingSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/paging/LimitOffsetPagingSource<",
        "Lcom/friday/common/entity/FileEntity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/common/dao/FileDao_Impl;


# direct methods
.method public constructor <init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByNamePagingForStudent$1;->a:Lcom/friday/common/dao/FileDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3, p4}, Landroidx/room/paging/LimitOffsetPagingSource;-><init>(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c(Landroidx/room/RoomRawQuery;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByNamePagingForStudent$1;->d(Landroidx/room/RoomRawQuery;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/room/RoomRawQuery;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 45

    .line 1
    move-object/from16 v0, p1

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
    invoke-virtual/range {p0 .. p0}, Landroidx/room/RoomRawQuery;->getBindingFunction()Lhd/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :try_start_0
    const-string v0, "fileId"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v2, "accountId"

    .line 30
    .line 31
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const-string v3, "fileName"

    .line 36
    .line 37
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "ossFileUrl"

    .line 42
    .line 43
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-string v5, "localFileUrl"

    .line 48
    .line 49
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const-string v6, "fileType"

    .line 54
    .line 55
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const-string v7, "parentId"

    .line 60
    .line 61
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v8, "createTime"

    .line 66
    .line 67
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const-string v9, "updateTime"

    .line 72
    .line 73
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const-string v10, "state"

    .line 78
    .line 79
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const-string v11, "isSync"

    .line 84
    .line 85
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    const-string v12, "version"

    .line 90
    .line 91
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    const-string v13, "isShared"

    .line 96
    .line 97
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    const-string v14, "preFileId"

    .line 102
    .line 103
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    const-string v15, "errorTimes"

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
    const-string v15, "md5"

    .line 116
    .line 117
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    move/from16 p1, v15

    .line 122
    .line 123
    const-string v15, "cached"

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
    const-string v15, "expiredTime"

    .line 132
    .line 133
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    move/from16 v17, v15

    .line 138
    .line 139
    const-string v15, "isRecycled"

    .line 140
    .line 141
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    move/from16 v18, v15

    .line 146
    .line 147
    new-instance v15, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 153
    .line 154
    .line 155
    move-result v19

    .line 156
    if-eqz v19, :cond_6

    .line 157
    .line 158
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v21

    .line 162
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 163
    .line 164
    .line 165
    move-result-wide v22

    .line 166
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v24

    .line 170
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v25

    .line 174
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v26

    .line 178
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v27

    .line 182
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v28

    .line 186
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v29

    .line 190
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v30

    .line 194
    move/from16 v19, v2

    .line 195
    .line 196
    move/from16 v42, v3

    .line 197
    .line 198
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 199
    .line 200
    .line 201
    move-result-wide v2

    .line 202
    long-to-int v2, v2

    .line 203
    move/from16 v31, v2

    .line 204
    .line 205
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 206
    .line 207
    .line 208
    move-result-wide v2

    .line 209
    long-to-int v2, v2

    .line 210
    const/16 v20, 0x1

    .line 211
    .line 212
    if-eqz v2, :cond_0

    .line 213
    .line 214
    move/from16 v32, v20

    .line 215
    .line 216
    :goto_1
    move v2, v4

    .line 217
    goto :goto_2

    .line 218
    :cond_0
    const/16 v32, 0x0

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :goto_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 222
    .line 223
    .line 224
    move-result-wide v3

    .line 225
    long-to-int v3, v3

    .line 226
    move v4, v2

    .line 227
    move/from16 v34, v3

    .line 228
    .line 229
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 230
    .line 231
    .line 232
    move-result-wide v2

    .line 233
    long-to-int v2, v2

    .line 234
    move/from16 v33, v34

    .line 235
    .line 236
    if-eqz v2, :cond_1

    .line 237
    .line 238
    move/from16 v34, v20

    .line 239
    .line 240
    :goto_3
    const/4 v2, 0x0

    .line 241
    goto :goto_4

    .line 242
    :cond_1
    const/16 v34, 0x0

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :goto_4
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    const/16 v35, 0x0

    .line 250
    .line 251
    if-eqz v3, :cond_2

    .line 252
    .line 253
    move-object/from16 v36, v35

    .line 254
    .line 255
    :goto_5
    move/from16 v2, p0

    .line 256
    .line 257
    move/from16 v43, v4

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_2
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    move-object/from16 v36, v3

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :goto_6
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v3

    .line 271
    long-to-int v3, v3

    .line 272
    move/from16 v4, p1

    .line 273
    .line 274
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 275
    .line 276
    .line 277
    move-result v37

    .line 278
    if-eqz v37, :cond_3

    .line 279
    .line 280
    :goto_7
    move/from16 p1, v0

    .line 281
    .line 282
    move/from16 v0, v16

    .line 283
    .line 284
    move-object/from16 v37, v35

    .line 285
    .line 286
    move/from16 v16, v2

    .line 287
    .line 288
    move/from16 v35, v3

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v35

    .line 295
    goto :goto_7

    .line 296
    :goto_8
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 297
    .line 298
    .line 299
    move-result-wide v2

    .line 300
    long-to-int v2, v2

    .line 301
    if-eqz v2, :cond_4

    .line 302
    .line 303
    move/from16 v38, v20

    .line 304
    .line 305
    :goto_9
    move/from16 v2, v17

    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_4
    const/16 v38, 0x0

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :goto_a
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 312
    .line 313
    .line 314
    move-result-wide v39

    .line 315
    move/from16 v17, v5

    .line 316
    .line 317
    move/from16 v3, v18

    .line 318
    .line 319
    move/from16 v18, v4

    .line 320
    .line 321
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    long-to-int v4, v4

    .line 326
    if-eqz v4, :cond_5

    .line 327
    .line 328
    move/from16 v41, v20

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :cond_5
    const/16 v41, 0x0

    .line 332
    .line 333
    :goto_b
    new-instance v20, Lcom/friday/common/entity/FileEntity;

    .line 334
    .line 335
    move-object/from16 v44, v36

    .line 336
    .line 337
    move/from16 v36, v35

    .line 338
    .line 339
    move-object/from16 v35, v44

    .line 340
    .line 341
    invoke-direct/range {v20 .. v41}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v4, v20

    .line 345
    .line 346
    invoke-interface {v15, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    .line 348
    .line 349
    move/from16 p0, v16

    .line 350
    .line 351
    move/from16 v5, v17

    .line 352
    .line 353
    move/from16 v4, v43

    .line 354
    .line 355
    move/from16 v16, v0

    .line 356
    .line 357
    move/from16 v17, v2

    .line 358
    .line 359
    move/from16 v2, v19

    .line 360
    .line 361
    move/from16 v0, p1

    .line 362
    .line 363
    move/from16 p1, v18

    .line 364
    .line 365
    move/from16 v18, v3

    .line 366
    .line 367
    move/from16 v3, v42

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :catchall_0
    move-exception v0

    .line 372
    goto :goto_c

    .line 373
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 374
    .line 375
    .line 376
    return-object v15

    .line 377
    :goto_c
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 378
    .line 379
    .line 380
    throw v0
.end method


# virtual methods
.method public convertRows(Landroidx/room/RoomRawQuery;ILvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByNamePagingForStudent$1;->a:Lcom/friday/common/dao/FileDao_Impl;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/friday/common/dao/FileDao_Impl;->S0(Lcom/friday/common/dao/FileDao_Impl;)Landroidx/room/RoomDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lc2/r0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lc2/r0;-><init>(Landroidx/room/RoomRawQuery;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p2, p1, v1, v0, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
