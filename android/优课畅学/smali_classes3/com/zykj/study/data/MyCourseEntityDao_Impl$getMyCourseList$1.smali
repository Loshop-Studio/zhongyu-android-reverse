.class public final Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;
.super Landroidx/room/paging/LimitOffsetPagingSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/data/MyCourseEntityDao_Impl;->getMyCourseList(Ljava/lang/String;)Landroidx/paging/PagingSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/paging/LimitOffsetPagingSource<",
        "Lcom/zykj/study/data/MyCourseEntity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;


# direct methods
.method public constructor <init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;->this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3, p4}, Landroidx/room/paging/LimitOffsetPagingSource;-><init>(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;->convertRows$lambda$0(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final convertRows$lambda$0(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 35

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
    const-string v0, "isSuperviser"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v2, "sort"

    .line 30
    .line 31
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const-string v3, "id"

    .line 36
    .line 37
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "userId"

    .line 42
    .line 43
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-string v5, "cover"

    .line 48
    .line 49
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const-string v6, "title"

    .line 54
    .line 55
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const-string v7, "description"

    .line 60
    .line 61
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v8, "periodId"

    .line 66
    .line 67
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const-string v9, "gradeId"

    .line 72
    .line 73
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const-string v10, "subjectId"

    .line 78
    .line 79
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const-string v11, "learning"

    .line 84
    .line 85
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    const-string v12, "likes"

    .line 90
    .line 91
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    const-string v13, "isPublic"

    .line 96
    .line 97
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    const-string v14, "status"

    .line 102
    .line 103
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    const-string v15, "createTime"

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
    new-instance v15, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 121
    .line 122
    .line 123
    move-result v16

    .line 124
    if-eqz v16, :cond_7

    .line 125
    .line 126
    move/from16 p2, v14

    .line 127
    .line 128
    move-object/from16 v16, v15

    .line 129
    .line 130
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 131
    .line 132
    .line 133
    move-result-wide v14

    .line 134
    long-to-int v14, v14

    .line 135
    const/16 v17, 0x1

    .line 136
    .line 137
    if-eqz v14, :cond_0

    .line 138
    .line 139
    move/from16 v30, v17

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_0
    const/16 v30, 0x0

    .line 143
    .line 144
    :goto_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v14

    .line 148
    long-to-int v14, v14

    .line 149
    move/from16 v33, v14

    .line 150
    .line 151
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v14

    .line 155
    long-to-int v14, v14

    .line 156
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    const/16 v19, 0x0

    .line 161
    .line 162
    if-eqz v15, :cond_1

    .line 163
    .line 164
    move-object/from16 v20, v19

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    move-object/from16 v20, v15

    .line 172
    .line 173
    :goto_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-eqz v15, :cond_2

    .line 178
    .line 179
    move-object/from16 v21, v19

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    move-object/from16 v21, v15

    .line 187
    .line 188
    :goto_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    if-eqz v15, :cond_3

    .line 193
    .line 194
    move-object/from16 v22, v19

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    move-object/from16 v22, v15

    .line 202
    .line 203
    :goto_4
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    if-eqz v15, :cond_4

    .line 208
    .line 209
    move-object/from16 v23, v19

    .line 210
    .line 211
    move v15, v2

    .line 212
    move/from16 v34, v3

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_4
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    move-object/from16 v23, v15

    .line 220
    .line 221
    move/from16 v34, v3

    .line 222
    .line 223
    move v15, v2

    .line 224
    :goto_5
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    move/from16 v24, v2

    .line 230
    .line 231
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    long-to-int v2, v2

    .line 236
    move/from16 v25, v2

    .line 237
    .line 238
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 239
    .line 240
    .line 241
    move-result-wide v2

    .line 242
    long-to-int v2, v2

    .line 243
    move/from16 v26, v2

    .line 244
    .line 245
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 246
    .line 247
    .line 248
    move-result-wide v2

    .line 249
    long-to-int v2, v2

    .line 250
    move/from16 v27, v2

    .line 251
    .line 252
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 253
    .line 254
    .line 255
    move-result-wide v2

    .line 256
    long-to-int v2, v2

    .line 257
    move/from16 v28, v2

    .line 258
    .line 259
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v2

    .line 263
    long-to-int v2, v2

    .line 264
    if-eqz v2, :cond_5

    .line 265
    .line 266
    move/from16 v29, v17

    .line 267
    .line 268
    :goto_6
    move/from16 v2, p2

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_5
    const/16 v29, 0x0

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    move/from16 p2, v0

    .line 279
    .line 280
    invoke-static/range {p1 .. p1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0, v3}, Lcom/zykj/study/data/Converters;->stringToSessionOrderType(Ljava/lang/String;)Lcom/zykj/study/bean/course/CourseType;

    .line 285
    .line 286
    .line 287
    move-result-object v31

    .line 288
    move/from16 v0, p0

    .line 289
    .line 290
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_6

    .line 295
    .line 296
    :goto_8
    move/from16 p0, v0

    .line 297
    .line 298
    move-object/from16 v3, v19

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_6
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 302
    .line 303
    .line 304
    move-result-wide v17

    .line 305
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 306
    .line 307
    .line 308
    move-result-object v19

    .line 309
    goto :goto_8

    .line 310
    :goto_9
    invoke-static/range {p1 .. p1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0, v3}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 315
    .line 316
    .line 317
    move-result-object v32

    .line 318
    new-instance v18, Lcom/zykj/study/data/MyCourseEntity;

    .line 319
    .line 320
    move/from16 v19, v14

    .line 321
    .line 322
    invoke-direct/range {v18 .. v33}, Lcom/zykj/study/data/MyCourseEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;I)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v0, v18

    .line 326
    .line 327
    move-object/from16 v3, v16

    .line 328
    .line 329
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    .line 331
    .line 332
    move/from16 v0, p2

    .line 333
    .line 334
    move v14, v2

    .line 335
    move v2, v15

    .line 336
    move-object v15, v3

    .line 337
    move/from16 v3, v34

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :catchall_0
    move-exception v0

    .line 342
    goto :goto_a

    .line 343
    :cond_7
    move-object v3, v15

    .line 344
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 345
    .line 346
    .line 347
    return-object v3

    .line 348
    :goto_a
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 349
    .line 350
    .line 351
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
            "Lcom/zykj/study/data/MyCourseEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;->this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->access$get__db$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Landroidx/room/RoomDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;->this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/study/data/t0;

    .line 10
    .line 11
    invoke-direct {v1, p1, v0}, Lcom/zykj/study/data/t0;-><init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/MyCourseEntityDao_Impl;)V

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
