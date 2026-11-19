.class public abstract Ls6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v4, Ljava/io/File;

    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Ls6/e$a;

    .line 30
    .line 31
    invoke-direct {v0}, Ls6/e$a;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    :cond_1
    move-object v1, v3

    .line 41
    goto/16 :goto_c

    .line 42
    .line 43
    :cond_2
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    :try_start_0
    const-string v0, "MD5"

    .line 48
    .line 49
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    move-object v0, v2

    .line 59
    :goto_0
    array-length v7, v5

    .line 60
    const/4 v8, 0x0

    .line 61
    :goto_1
    if-ge v8, v7, :cond_1

    .line 62
    .line 63
    aget-object v9, v5, v8

    .line 64
    .line 65
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-static {v10}, La7/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    iget v11, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 74
    .line 75
    invoke-static {}, Ll6/d;->c()I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-ne v11, v12, :cond_3

    .line 80
    .line 81
    invoke-static {v10}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-nez v11, :cond_5

    .line 86
    .line 87
    :goto_2
    move-object/from16 v16, v0

    .line 88
    .line 89
    move-object v1, v3

    .line 90
    move-object/from16 v20, v4

    .line 91
    .line 92
    move-object/from16 p1, v5

    .line 93
    .line 94
    move/from16 v21, v7

    .line 95
    .line 96
    move/from16 v23, v8

    .line 97
    .line 98
    goto/16 :goto_b

    .line 99
    .line 100
    :cond_3
    iget v11, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 101
    .line 102
    invoke-static {}, Ll6/d;->d()I

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    if-ne v11, v12, :cond_4

    .line 107
    .line 108
    invoke-static {v10}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-nez v11, :cond_5

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    iget v11, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 116
    .line 117
    invoke-static {}, Ll6/d;->b()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-ne v11, v12, :cond_5

    .line 122
    .line 123
    invoke-static {v10}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-nez v11, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    iget-object v11, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R:Ljava/util/List;

    .line 131
    .line 132
    if-eqz v11, :cond_6

    .line 133
    .line 134
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-lez v11, :cond_6

    .line 139
    .line 140
    iget-object v11, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v11, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-nez v11, :cond_6

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    iget-boolean v11, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 150
    .line 151
    if-nez v11, :cond_7

    .line 152
    .line 153
    invoke-static {v10}, Ll6/c;->f(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    if-eqz v11, :cond_7

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 165
    .line 166
    .line 167
    move-result-wide v12

    .line 168
    const-wide/16 v14, 0x0

    .line 169
    .line 170
    cmp-long v16, v12, v14

    .line 171
    .line 172
    if-gtz v16, :cond_8

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    const-wide/16 v16, 0x3e8

    .line 176
    .line 177
    if-eqz v0, :cond_9

    .line 178
    .line 179
    invoke-virtual {v11}, Ljava/lang/String;->getBytes()[B

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Ljava/math/BigInteger;

    .line 187
    .line 188
    move-wide/from16 v18, v14

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    const/4 v15, 0x1

    .line 195
    invoke-direct {v2, v15, v14}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/math/BigInteger;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide v14

    .line 202
    goto :goto_3

    .line 203
    :cond_9
    move-wide/from16 v18, v14

    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    .line 206
    .line 207
    .line 208
    move-result-wide v14

    .line 209
    div-long v14, v14, v16

    .line 210
    .line 211
    :goto_3
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    move-object/from16 v20, v4

    .line 224
    .line 225
    move-object/from16 p1, v5

    .line 226
    .line 227
    invoke-static {v2}, La7/q;->e(Ljava/lang/Object;)J

    .line 228
    .line 229
    .line 230
    move-result-wide v4

    .line 231
    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    .line 232
    .line 233
    .line 234
    move-result-wide v21

    .line 235
    move v2, v7

    .line 236
    move/from16 v23, v8

    .line 237
    .line 238
    div-long v7, v21, v16

    .line 239
    .line 240
    invoke-static {v10}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result v16

    .line 244
    if-eqz v16, :cond_a

    .line 245
    .line 246
    invoke-static {v1, v11}, La7/h;->k(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 247
    .line 248
    .line 249
    move-result-object v16

    .line 250
    invoke-virtual/range {v16 .. v16}, Lo6/b;->c()I

    .line 251
    .line 252
    .line 253
    move-result v17

    .line 254
    invoke-virtual/range {v16 .. v16}, Lo6/b;->b()I

    .line 255
    .line 256
    .line 257
    move-result v21

    .line 258
    invoke-virtual/range {v16 .. v16}, Lo6/b;->a()J

    .line 259
    .line 260
    .line 261
    move-result-wide v24

    .line 262
    :goto_4
    move-object/from16 v16, v0

    .line 263
    .line 264
    move/from16 v0, v17

    .line 265
    .line 266
    move/from16 v1, v21

    .line 267
    .line 268
    move/from16 v21, v2

    .line 269
    .line 270
    move-object/from16 v17, v3

    .line 271
    .line 272
    move-wide/from16 v2, v24

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_a
    invoke-static {v10}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v16

    .line 279
    if-eqz v16, :cond_b

    .line 280
    .line 281
    invoke-static {v1, v11}, La7/h;->d(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 282
    .line 283
    .line 284
    move-result-object v16

    .line 285
    invoke-virtual/range {v16 .. v16}, Lo6/b;->c()I

    .line 286
    .line 287
    .line 288
    move-result v17

    .line 289
    invoke-virtual/range {v16 .. v16}, Lo6/b;->b()I

    .line 290
    .line 291
    .line 292
    move-result v21

    .line 293
    invoke-virtual/range {v16 .. v16}, Lo6/b;->a()J

    .line 294
    .line 295
    .line 296
    move-result-wide v24

    .line 297
    goto :goto_4

    .line 298
    :cond_b
    invoke-static {v1, v11}, La7/h;->f(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 299
    .line 300
    .line 301
    move-result-object v16

    .line 302
    invoke-virtual/range {v16 .. v16}, Lo6/b;->c()I

    .line 303
    .line 304
    .line 305
    move-result v17

    .line 306
    invoke-virtual/range {v16 .. v16}, Lo6/b;->b()I

    .line 307
    .line 308
    .line 309
    move-result v21

    .line 310
    move-object/from16 v16, v0

    .line 311
    .line 312
    move/from16 v0, v17

    .line 313
    .line 314
    move/from16 v1, v21

    .line 315
    .line 316
    move/from16 v21, v2

    .line 317
    .line 318
    move-object/from16 v17, v3

    .line 319
    .line 320
    move-wide/from16 v2, v18

    .line 321
    .line 322
    :goto_5
    invoke-static {v10}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v22

    .line 326
    if-nez v22, :cond_c

    .line 327
    .line 328
    invoke-static {v10}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 329
    .line 330
    .line 331
    move-result v22

    .line 332
    if-eqz v22, :cond_d

    .line 333
    .line 334
    :cond_c
    move-object/from16 v22, v9

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_d
    move-wide/from16 v24, v7

    .line 338
    .line 339
    move-object/from16 v22, v9

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :goto_6
    iget v9, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 343
    .line 344
    move-wide/from16 v24, v7

    .line 345
    .line 346
    if-lez v9, :cond_e

    .line 347
    .line 348
    int-to-long v7, v9

    .line 349
    cmp-long v7, v2, v7

    .line 350
    .line 351
    if-gez v7, :cond_e

    .line 352
    .line 353
    :goto_7
    move-object/from16 v1, v17

    .line 354
    .line 355
    goto :goto_b

    .line 356
    :cond_e
    iget v7, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 357
    .line 358
    if-lez v7, :cond_f

    .line 359
    .line 360
    int-to-long v7, v7

    .line 361
    cmp-long v7, v2, v7

    .line 362
    .line 363
    if-lez v7, :cond_f

    .line 364
    .line 365
    :goto_8
    goto :goto_7

    .line 366
    :cond_f
    cmp-long v7, v2, v18

    .line 367
    .line 368
    if-nez v7, :cond_10

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_10
    :goto_9
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->a()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-virtual {v7, v14, v15}, Lcom/luck/picture/lib/entity/LocalMedia;->g0(J)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v7, v11}, Lcom/luck/picture/lib/entity/LocalMedia;->n0(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v7, v11}, Lcom/luck/picture/lib/entity/LocalMedia;->p0(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    invoke-virtual {v7, v8}, Lcom/luck/picture/lib/entity/LocalMedia;->d0(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    invoke-virtual {v7, v8}, Lcom/luck/picture/lib/entity/LocalMedia;->m0(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v7, v2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->b0(J)V

    .line 399
    .line 400
    .line 401
    iget v2, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 402
    .line 403
    invoke-virtual {v7, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->R(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v7, v10}, Lcom/luck/picture/lib/entity/LocalMedia;->i0(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v7, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v7, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v7, v12, v13}, Lcom/luck/picture/lib/entity/LocalMedia;->r0(J)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7, v4, v5}, Lcom/luck/picture/lib/entity/LocalMedia;->P(J)V

    .line 419
    .line 420
    .line 421
    move-wide/from16 v0, v24

    .line 422
    .line 423
    invoke-virtual {v7, v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->a0(J)V

    .line 424
    .line 425
    .line 426
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 427
    .line 428
    invoke-static {}, La7/j;->e()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_11

    .line 433
    .line 434
    goto :goto_a

    .line 435
    :cond_11
    const/4 v11, 0x0

    .line 436
    :goto_a
    invoke-virtual {v7, v11}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    move-object/from16 v1, v17

    .line 440
    .line 441
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    :goto_b
    add-int/lit8 v8, v23, 0x1

    .line 445
    .line 446
    move-object/from16 v5, p1

    .line 447
    .line 448
    move-object v3, v1

    .line 449
    move-object/from16 v0, v16

    .line 450
    .line 451
    move-object/from16 v4, v20

    .line 452
    .line 453
    move/from16 v7, v21

    .line 454
    .line 455
    const/4 v2, 0x0

    .line 456
    move-object/from16 v1, p0

    .line 457
    .line 458
    goto/16 :goto_1

    .line 459
    .line 460
    :goto_c
    return-object v1
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMediaFolder;
    .locals 3

    .line 1
    invoke-static {p0, p1}, Ls6/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, La7/m;->d(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 22
    .line 23
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->h()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-virtual {v0, v1, v2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method
