.class public final Lcom/friday/document/sync/SyncStateThree;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls2/a;

.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/common/dao/ResourceDao;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls2/a;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "resourceDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateThree;->a:Ls2/a;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/document/sync/SyncStateThree;->b:Lcom/friday/common/dao/FileDao;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/document/sync/SyncStateThree;->c:Lcom/friday/common/dao/ResourceDao;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;-><init>(Lcom/friday/document/sync/SyncStateThree;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->l:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x4

    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x3

    .line 42
    if-eqz v4, :cond_5

    .line 43
    .line 44
    if-eq v4, v8, :cond_4

    .line 45
    .line 46
    if-eq v4, v7, :cond_3

    .line 47
    .line 48
    if-eq v4, v9, :cond_2

    .line 49
    .line 50
    if-ne v4, v6, :cond_1

    .line 51
    .line 52
    iget v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->j:I

    .line 53
    .line 54
    iget-object v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v8, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, Ljava/util/Iterator;

    .line 61
    .line 62
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, Ljava/lang/Iterable;

    .line 65
    .line 66
    iget-object v11, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v11, Lcom/friday/common/property/BaseResponse;

    .line 69
    .line 70
    iget-object v12, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v12, Ljava/util/ArrayList;

    .line 73
    .line 74
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v13, Lcom/friday/common/entity/FileEntity;

    .line 77
    .line 78
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move v1, v6

    .line 82
    :goto_1
    move v5, v4

    .line 83
    move-object v6, v10

    .line 84
    move-object v4, v12

    .line 85
    move-object v10, v8

    .line 86
    move-object v8, v13

    .line 87
    goto/16 :goto_b

    .line 88
    .line 89
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_2
    iget v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->k:I

    .line 98
    .line 99
    iget v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->j:I

    .line 100
    .line 101
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->i:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v10, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v11, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->h:Ljava/lang/Object;

    .line 106
    .line 107
    iget-object v12, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v12, Ljava/util/Iterator;

    .line 110
    .line 111
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->f:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v13, Ljava/lang/Iterable;

    .line 114
    .line 115
    iget-object v14, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->e:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v14, Lcom/friday/common/property/BaseResponse;

    .line 118
    .line 119
    iget-object v15, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v15, Ljava/util/ArrayList;

    .line 122
    .line 123
    iget-object v6, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v6, Lcom/friday/common/entity/FileEntity;

    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_3
    iget v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->k:I

    .line 133
    .line 134
    iget v6, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->j:I

    .line 135
    .line 136
    iget-object v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->i:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v8, Ljava/lang/String;

    .line 139
    .line 140
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->h:Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v11, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->g:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v11, Ljava/util/Iterator;

    .line 145
    .line 146
    iget-object v12, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->f:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v12, Ljava/lang/Iterable;

    .line 149
    .line 150
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v13, Lcom/friday/common/property/BaseResponse;

    .line 153
    .line 154
    iget-object v14, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v14, Ljava/util/ArrayList;

    .line 157
    .line 158
    iget-object v15, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v15, Lcom/friday/common/entity/FileEntity;

    .line 161
    .line 162
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object v1, v12

    .line 166
    move-object v12, v11

    .line 167
    move-object v11, v10

    .line 168
    move-object v10, v14

    .line 169
    move-object v14, v13

    .line 170
    move-object v13, v8

    .line 171
    move v8, v6

    .line 172
    move-object v6, v15

    .line 173
    goto/16 :goto_4

    .line 174
    .line 175
    :cond_4
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v4, Ljava/util/ArrayList;

    .line 178
    .line 179
    iget-object v6, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v6, Lcom/friday/common/entity/FileEntity;

    .line 182
    .line 183
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    filled-new-array {v1}, [Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v1}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    iget-object v1, v0, Lcom/friday/document/sync/SyncStateThree;->a:Ls2/a;

    .line 203
    .line 204
    move-object/from16 v6, p1

    .line 205
    .line 206
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 209
    .line 210
    iput v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 211
    .line 212
    invoke-interface {v1, v4, v2}, Ls2/a;->d(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-ne v1, v3, :cond_6

    .line 217
    .line 218
    goto/16 :goto_a

    .line 219
    .line 220
    :cond_6
    :goto_2
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 221
    .line 222
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-nez v8, :cond_f

    .line 227
    .line 228
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    move v11, v5

    .line 233
    move-object v10, v8

    .line 234
    move-object v8, v6

    .line 235
    move-object v6, v4

    .line 236
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    if-eqz v12, :cond_e

    .line 241
    .line 242
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    move-object v13, v12

    .line 247
    check-cast v13, Ljava/lang/String;

    .line 248
    .line 249
    iget-object v14, v0, Lcom/friday/document/sync/SyncStateThree;->b:Lcom/friday/common/dao/FileDao;

    .line 250
    .line 251
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 252
    .line 253
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    iput-object v15, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 258
    .line 259
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v15

    .line 263
    iput-object v15, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->e:Ljava/lang/Object;

    .line 264
    .line 265
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    iput-object v15, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->f:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v10, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->g:Ljava/lang/Object;

    .line 272
    .line 273
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v15

    .line 277
    iput-object v15, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->h:Ljava/lang/Object;

    .line 278
    .line 279
    iput-object v13, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->i:Ljava/lang/Object;

    .line 280
    .line 281
    iput v11, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->j:I

    .line 282
    .line 283
    iput v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->k:I

    .line 284
    .line 285
    iput v7, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 286
    .line 287
    invoke-interface {v14, v13, v2}, Lcom/friday/common/dao/FileDao;->P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    if-ne v14, v3, :cond_7

    .line 292
    .line 293
    goto/16 :goto_a

    .line 294
    .line 295
    :cond_7
    move-object v14, v1

    .line 296
    move-object v1, v6

    .line 297
    move-object v6, v8

    .line 298
    move v8, v11

    .line 299
    move-object v11, v12

    .line 300
    move-object v12, v10

    .line 301
    move-object v10, v4

    .line 302
    move v4, v5

    .line 303
    :goto_4
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    const/16 v7, 0x31

    .line 312
    .line 313
    if-eq v5, v7, :cond_9

    .line 314
    .line 315
    packed-switch v5, :pswitch_data_0

    .line 316
    .line 317
    .line 318
    packed-switch v5, :pswitch_data_1

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :pswitch_0
    const-string v5, "12"

    .line 323
    .line 324
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-nez v5, :cond_a

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :pswitch_1
    const-string v5, "11"

    .line 332
    .line 333
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-nez v5, :cond_8

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :pswitch_2
    const-string v5, "10"

    .line 341
    .line 342
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    if-nez v5, :cond_8

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :pswitch_3
    const-string v5, "6"

    .line 350
    .line 351
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-nez v5, :cond_8

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :pswitch_4
    const-string v5, "5"

    .line 359
    .line 360
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-nez v5, :cond_8

    .line 365
    .line 366
    goto :goto_5

    .line 367
    :pswitch_5
    const-string v5, "4"

    .line 368
    .line 369
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-nez v5, :cond_8

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :pswitch_6
    const-string v5, "3"

    .line 377
    .line 378
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-nez v5, :cond_8

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_8
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_9
    const-string v5, "1"

    .line 394
    .line 395
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    if-nez v5, :cond_a

    .line 400
    .line 401
    :goto_5
    move-object v5, v10

    .line 402
    move-object v10, v1

    .line 403
    move v1, v4

    .line 404
    move v4, v8

    .line 405
    move-object v8, v12

    .line 406
    move-object v12, v5

    .line 407
    move-object/from16 v23, v13

    .line 408
    .line 409
    :goto_6
    move-object v5, v11

    .line 410
    move-object v11, v14

    .line 411
    move-object v13, v6

    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_a
    iget-object v15, v0, Lcom/friday/document/sync/SyncStateThree;->c:Lcom/friday/common/dao/ResourceDao;

    .line 415
    .line 416
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 417
    .line 418
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 423
    .line 424
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->e:Ljava/lang/Object;

    .line 429
    .line 430
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->f:Ljava/lang/Object;

    .line 435
    .line 436
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->g:Ljava/lang/Object;

    .line 437
    .line 438
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->h:Ljava/lang/Object;

    .line 443
    .line 444
    iput-object v13, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->i:Ljava/lang/Object;

    .line 445
    .line 446
    iput v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->j:I

    .line 447
    .line 448
    iput v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->k:I

    .line 449
    .line 450
    iput v9, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 451
    .line 452
    const-wide/16 v17, 0x0

    .line 453
    .line 454
    const/16 v20, 0x2

    .line 455
    .line 456
    const/16 v21, 0x0

    .line 457
    .line 458
    move-object/from16 v19, v2

    .line 459
    .line 460
    move-object/from16 v16, v13

    .line 461
    .line 462
    invoke-static/range {v15 .. v21}, Lcom/friday/common/dao/ResourceDao;->Q(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    if-ne v2, v3, :cond_b

    .line 467
    .line 468
    goto/16 :goto_a

    .line 469
    .line 470
    :cond_b
    move-object v13, v1

    .line 471
    move-object v1, v2

    .line 472
    move-object v15, v10

    .line 473
    move-object/from16 v10, v16

    .line 474
    .line 475
    move-object/from16 v2, v19

    .line 476
    .line 477
    :goto_7
    check-cast v1, Ljava/util/List;

    .line 478
    .line 479
    check-cast v1, Ljava/lang/Iterable;

    .line 480
    .line 481
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-eqz v5, :cond_c

    .line 490
    .line 491
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    .line 496
    .line 497
    invoke-virtual {v5}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_c
    move v1, v4

    .line 506
    move v4, v8

    .line 507
    move-object/from16 v23, v10

    .line 508
    .line 509
    move-object v8, v12

    .line 510
    move-object v10, v13

    .line 511
    move-object v12, v15

    .line 512
    goto :goto_6

    .line 513
    :goto_9
    iget-object v6, v0, Lcom/friday/document/sync/SyncStateThree;->c:Lcom/friday/common/dao/ResourceDao;

    .line 514
    .line 515
    iput-object v13, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->c:Ljava/lang/Object;

    .line 516
    .line 517
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    iput-object v7, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->d:Ljava/lang/Object;

    .line 522
    .line 523
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v7

    .line 527
    iput-object v7, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->e:Ljava/lang/Object;

    .line 528
    .line 529
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    iput-object v7, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->f:Ljava/lang/Object;

    .line 534
    .line 535
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->g:Ljava/lang/Object;

    .line 536
    .line 537
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->h:Ljava/lang/Object;

    .line 542
    .line 543
    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->i:Ljava/lang/Object;

    .line 548
    .line 549
    iput v4, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->j:I

    .line 550
    .line 551
    iput v1, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->k:I

    .line 552
    .line 553
    const/4 v1, 0x4

    .line 554
    iput v1, v2, Lcom/friday/document/sync/SyncStateThree$deleteFile$1;->n:I

    .line 555
    .line 556
    const-wide/16 v24, 0x0

    .line 557
    .line 558
    const/16 v27, 0x2

    .line 559
    .line 560
    const/16 v28, 0x0

    .line 561
    .line 562
    move-object/from16 v26, v2

    .line 563
    .line 564
    move-object/from16 v22, v6

    .line 565
    .line 566
    invoke-static/range {v22 .. v28}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    if-ne v2, v3, :cond_d

    .line 571
    .line 572
    :goto_a
    return-object v3

    .line 573
    :cond_d
    move-object/from16 v2, v26

    .line 574
    .line 575
    goto/16 :goto_1

    .line 576
    .line 577
    :goto_b
    move-object v1, v11

    .line 578
    const/4 v7, 0x2

    .line 579
    move v11, v5

    .line 580
    const/4 v5, 0x0

    .line 581
    goto/16 :goto_3

    .line 582
    .line 583
    :cond_e
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 584
    .line 585
    return-object v1

    .line 586
    :cond_f
    new-instance v1, Lcom/friday/common/util/SyncException;

    .line 587
    .line 588
    const/4 v2, 0x0

    .line 589
    invoke-direct {v1, v2, v2, v9, v2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 590
    .line 591
    .line 592
    throw v1

    .line 593
    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    :pswitch_data_1
    .packed-switch 0x61f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
