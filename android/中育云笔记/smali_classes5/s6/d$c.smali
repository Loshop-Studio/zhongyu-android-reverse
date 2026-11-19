.class public Ls6/d$c;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/d;->g(Lq6/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lq6/f;

.field public final synthetic i:Ls6/d;


# direct methods
.method public constructor <init>(Ls6/d;Lq6/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/d$c;->i:Ls6/d;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/d$c;->h:Lq6/f;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$d;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls6/d$c;->k()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls6/d$c;->l(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Ljava/util/List;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls6/a;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Ls6/a;->d:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 16
    .line 17
    invoke-static {v0}, Ls6/d;->l(Ls6/d;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Ls6/a;->e:[Ljava/lang/String;

    .line 24
    .line 25
    :goto_0
    move-object v4, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object v0, Ls6/a;->f:[Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 31
    .line 32
    invoke-virtual {v0}, Ls6/d;->A()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 37
    .line 38
    invoke-virtual {v0}, Ls6/d;->B()[Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 43
    .line 44
    invoke-virtual {v0}, Ls6/d;->H()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_16

    .line 53
    .line 54
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    new-instance v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    if-lez v0, :cond_16

    .line 64
    .line 65
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 66
    .line 67
    invoke-static {v0}, Ls6/d;->l(Ls6/d;)Z

    .line 68
    .line 69
    .line 70
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    const-string v4, "mime_type"

    .line 72
    .line 73
    const-string v5, "bucket_display_name"

    .line 74
    .line 75
    const-string v7, "bucket_id"

    .line 76
    .line 77
    if-eqz v0, :cond_9

    .line 78
    .line 79
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_4

    .line 89
    .line 90
    iget-object v8, v1, Ls6/d$c;->i:Ls6/d;

    .line 91
    .line 92
    invoke-virtual {v8}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    iget-boolean v8, v8, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K0:Z

    .line 97
    .line 98
    if-eqz v8, :cond_2

    .line 99
    .line 100
    iget-object v8, v1, Ls6/d$c;->i:Ls6/d;

    .line 101
    .line 102
    const/4 v9, 0x1

    .line 103
    invoke-virtual {v8, v2, v9}, Ls6/d;->J(Landroid/database/Cursor;Z)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-nez v8, :cond_1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    invoke-virtual {v8}, Lcom/luck/picture/lib/entity/LocalMedia;->O()V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto/16 :goto_f

    .line 116
    .line 117
    :catch_0
    move-exception v0

    .line 118
    goto/16 :goto_d

    .line 119
    .line 120
    :cond_2
    :goto_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 125
    .line 126
    .line 127
    move-result-wide v8

    .line 128
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    check-cast v10, Ljava/lang/Long;

    .line 137
    .line 138
    const-wide/16 v11, 0x1

    .line 139
    .line 140
    if-nez v10, :cond_3

    .line 141
    .line 142
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    goto :goto_4

    .line 147
    :cond_3
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v13

    .line 151
    add-long/2addr v13, v11

    .line 152
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    :goto_4
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-interface {v0, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_8

    .line 169
    .line 170
    new-instance v8, Ljava/util/HashSet;

    .line 171
    .line 172
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 173
    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    :cond_5
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 181
    .line 182
    .line 183
    move-result-wide v10

    .line 184
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    invoke-interface {v8, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    if-eqz v12, :cond_6

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_6
    new-instance v12, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 196
    .line 197
    invoke-direct {v12}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v10, v11}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v15

    .line 223
    invoke-interface {v0, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    if-nez v15, :cond_7

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_7
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v15

    .line 238
    check-cast v15, Ljava/lang/Long;

    .line 239
    .line 240
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 241
    .line 242
    .line 243
    move-result-wide v16

    .line 244
    const-string v6, "_id"

    .line 245
    .line 246
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    move-wide/from16 v18, v10

    .line 251
    .line 252
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 253
    .line 254
    .line 255
    move-result-wide v10

    .line 256
    invoke-virtual {v12, v13}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v15}, La7/q;->c(Ljava/lang/Object;)I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    invoke-virtual {v12, v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v10, v11, v14}, La7/h;->j(JLjava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-virtual {v12, v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v14}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    invoke-interface {v8, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    int-to-long v9, v9

    .line 287
    add-long v9, v9, v16

    .line 288
    .line 289
    long-to-int v9, v9

    .line 290
    :goto_5
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-nez v6, :cond_5

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_8
    const/4 v9, 0x0

    .line 298
    goto :goto_6

    .line 299
    :cond_9
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 300
    .line 301
    .line 302
    const/4 v0, 0x0

    .line 303
    :cond_a
    const-string v6, "_data"

    .line 304
    .line 305
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 334
    .line 335
    .line 336
    move-result-wide v10

    .line 337
    const-string v12, "count"

    .line 338
    .line 339
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    .line 344
    .line 345
    .line 346
    move-result v12

    .line 347
    new-instance v13, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 348
    .line 349
    invoke-direct {v13}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v13, v10, v11}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v13, v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v13, v8}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v13, v9}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v13, v12}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    add-int/2addr v0, v12

    .line 371
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    if-nez v6, :cond_a

    .line 376
    .line 377
    move v9, v0

    .line 378
    :goto_6
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 379
    .line 380
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 381
    .line 382
    .line 383
    iget-object v4, v1, Ls6/d$c;->i:Ls6/d;

    .line 384
    .line 385
    invoke-virtual {v4}, Ls6/a;->b()Landroid/content/Context;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    iget-object v5, v1, Ls6/d$c;->i:Ls6/d;

    .line 390
    .line 391
    invoke-virtual {v5}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    iget-object v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 396
    .line 397
    invoke-static {v4, v5}, Ls6/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    if-eqz v4, :cond_d

    .line 402
    .line 403
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    new-instance v6, Ljava/io/File;

    .line 411
    .line 412
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    .line 416
    .line 417
    .line 418
    move-result-wide v5

    .line 419
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    add-int/2addr v9, v7

    .line 424
    new-instance v7, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V

    .line 430
    .line 431
    .line 432
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    if-eqz v7, :cond_f

    .line 437
    .line 438
    invoke-static {}, La7/j;->e()Z

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    if-eqz v7, :cond_b

    .line 443
    .line 444
    invoke-static {v2}, Ls6/d;->m(Landroid/database/Cursor;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    goto :goto_7

    .line 449
    :cond_b
    invoke-static {v2}, Ls6/d;->n(Landroid/database/Cursor;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    :goto_7
    invoke-virtual {v0, v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v2}, Ls6/d;->o(Landroid/database/Cursor;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    invoke-virtual {v0, v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    invoke-static {v7}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    if-eqz v7, :cond_c

    .line 472
    .line 473
    iget-object v7, v1, Ls6/d$c;->i:Ls6/d;

    .line 474
    .line 475
    invoke-virtual {v7}, Ls6/a;->b()Landroid/content/Context;

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    invoke-static {v7, v8}, La7/i;->h(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    new-instance v8, Ljava/io/File;

    .line 492
    .line 493
    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    .line 497
    .line 498
    .line 499
    move-result-wide v7

    .line 500
    goto :goto_8

    .line 501
    :cond_c
    new-instance v7, Ljava/io/File;

    .line 502
    .line 503
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    .line 511
    .line 512
    .line 513
    move-result-wide v7

    .line 514
    :goto_8
    cmp-long v5, v5, v7

    .line 515
    .line 516
    if-lez v5, :cond_f

    .line 517
    .line 518
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-virtual {v0, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->h()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    goto :goto_a

    .line 533
    :cond_d
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    if-eqz v4, :cond_f

    .line 538
    .line 539
    invoke-static {}, La7/j;->e()Z

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    if-eqz v4, :cond_e

    .line 544
    .line 545
    invoke-static {v2}, Ls6/d;->m(Landroid/database/Cursor;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    goto :goto_9

    .line 550
    :cond_e
    invoke-static {v2}, Ls6/d;->n(Landroid/database/Cursor;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    :goto_9
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-static {v2}, Ls6/d;->o(Landroid/database/Cursor;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 562
    .line 563
    .line 564
    :cond_f
    :goto_a
    if-nez v9, :cond_10

    .line 565
    .line 566
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-nez v0, :cond_14

    .line 571
    .line 572
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 573
    .line 574
    .line 575
    return-object v3

    .line 576
    :cond_10
    :try_start_2
    invoke-static {v3}, La7/m;->c(Ljava/util/List;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v9}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 580
    .line 581
    .line 582
    const-wide/16 v4, -0x1

    .line 583
    .line 584
    invoke-virtual {v0, v4, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 585
    .line 586
    .line 587
    iget-object v4, v1, Ls6/d$c;->i:Ls6/d;

    .line 588
    .line 589
    invoke-virtual {v4}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    iget-object v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 594
    .line 595
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-eqz v4, :cond_12

    .line 600
    .line 601
    iget-object v4, v1, Ls6/d$c;->i:Ls6/d;

    .line 602
    .line 603
    invoke-virtual {v4}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    iget v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 608
    .line 609
    invoke-static {}, Ll6/d;->b()I

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    if-ne v4, v5, :cond_11

    .line 614
    .line 615
    iget-object v4, v1, Ls6/d$c;->i:Ls6/d;

    .line 616
    .line 617
    invoke-virtual {v4}, Ls6/a;->b()Landroid/content/Context;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    sget v5, Lcom/luck/picture/lib/R$string;->ps_all_audio:I

    .line 622
    .line 623
    :goto_b
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    goto :goto_c

    .line 628
    :cond_11
    iget-object v4, v1, Ls6/d$c;->i:Ls6/d;

    .line 629
    .line 630
    invoke-virtual {v4}, Ls6/a;->b()Landroid/content/Context;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    sget v5, Lcom/luck/picture/lib/R$string;->ps_camera_roll:I

    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_12
    iget-object v4, v1, Ls6/d$c;->i:Ls6/d;

    .line 638
    .line 639
    invoke-virtual {v4}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    iget-object v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 644
    .line 645
    :goto_c
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    const/4 v6, 0x0

    .line 649
    invoke-interface {v3, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 653
    .line 654
    invoke-virtual {v0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r0:Z

    .line 659
    .line 660
    if-eqz v0, :cond_13

    .line 661
    .line 662
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 663
    .line 664
    invoke-virtual {v0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 669
    .line 670
    invoke-static {}, Ll6/d;->a()I

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    if-ne v0, v4, :cond_13

    .line 675
    .line 676
    iget-object v0, v1, Ls6/d$c;->i:Ls6/d;

    .line 677
    .line 678
    invoke-static {v0, v3}, Ls6/d;->p(Ls6/d;Ljava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 679
    .line 680
    .line 681
    :cond_13
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    if-nez v0, :cond_14

    .line 686
    .line 687
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 688
    .line 689
    .line 690
    :cond_14
    return-object v3

    .line 691
    :goto_d
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 692
    .line 693
    .line 694
    sget-object v3, Ls6/a;->c:Ljava/lang/String;

    .line 695
    .line 696
    new-instance v4, Ljava/lang/StringBuilder;

    .line 697
    .line 698
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 699
    .line 700
    .line 701
    const-string v5, "loadAllMedia Data Error: "

    .line 702
    .line 703
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 718
    .line 719
    .line 720
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    if-nez v0, :cond_17

    .line 725
    .line 726
    :goto_e
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 727
    .line 728
    .line 729
    goto :goto_10

    .line 730
    :goto_f
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    if-nez v3, :cond_15

    .line 735
    .line 736
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 737
    .line 738
    .line 739
    :cond_15
    throw v0

    .line 740
    :cond_16
    if-eqz v2, :cond_17

    .line 741
    .line 742
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    if-nez v0, :cond_17

    .line 747
    .line 748
    goto :goto_e

    .line 749
    :cond_17
    :goto_10
    new-instance v0, Ljava/util/ArrayList;

    .line 750
    .line 751
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 752
    .line 753
    .line 754
    return-object v0
.end method

.method public l(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ls6/d$c;->h:Lq6/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lq6/f;->a(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
