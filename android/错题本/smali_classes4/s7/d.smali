.class public abstract Ls7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    .line 2
    .line 3
    const-string v1, "\"\\"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokio/ByteString$Companion;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    const-string v1, "\t ,="

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lokio/ByteString$Companion;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final a(Lokhttp3/i0;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lokhttp3/c0;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "HEAD"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, Lokhttp3/i0;->d:I

    .line 15
    .line 16
    const/16 v1, 0x64

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0xc8

    .line 21
    .line 22
    if-lt v0, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    const/16 v1, 0xcc

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x130

    .line 29
    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p0}, Lp7/c;->i(Lokhttp3/i0;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/16 v2, -0x1

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    const-string v0, "Transfer-Encoding"

    .line 44
    .line 45
    invoke-static {v0, p0}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "chunked"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 59
    return p0

    .line 60
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 61
    return p0
.end method

.method public static final b(Lokhttp3/b;Lokhttp3/r;Lokhttp3/q;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "<this>"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "url"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "headers"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lokhttp3/b;->b:Lokhttp3/b;

    .line 23
    .line 24
    if-ne v0, v3, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, Lokhttp3/m;->j:Ljava/util/regex/Pattern;

    .line 28
    .line 29
    invoke-virtual {v2}, Lokhttp3/q;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v3, 0x0

    .line 34
    move v5, v3

    .line 35
    const/4 v6, 0x0

    .line 36
    :goto_0
    if-ge v5, v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2, v5}, Lokhttp3/q;->b(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const-string v8, "Set-Cookie"

    .line 43
    .line 44
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    if-nez v6, :cond_1

    .line 51
    .line 52
    new-instance v6, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/4 v7, 0x2

    .line 55
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v2, v5}, Lokhttp3/q;->e(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v2, "{\n      Collections.unmodifiableList(result)\n    }"

    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    move-object v2, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    move v6, v3

    .line 89
    const/4 v7, 0x0

    .line 90
    :goto_3
    if-ge v6, v5, :cond_24

    .line 91
    .line 92
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v8, v0

    .line 97
    check-cast v8, Ljava/lang/String;

    .line 98
    .line 99
    const-string v0, "setCookie"

    .line 100
    .line 101
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 105
    .line 106
    .line 107
    move-result-wide v9

    .line 108
    sget-object v0, Lp7/c;->a:[B

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/16 v11, 0x3b

    .line 115
    .line 116
    invoke-static {v8, v11, v3, v0}, Lp7/c;->f(Ljava/lang/String;CII)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    const/16 v12, 0x3d

    .line 121
    .line 122
    invoke-static {v8, v12, v3, v0}, Lp7/c;->f(Ljava/lang/String;CII)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-ne v13, v0, :cond_5

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_5
    invoke-static {v3, v13, v8}, Lp7/c;->x(IILjava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-nez v14, :cond_6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    invoke-static {v15}, Lp7/c;->k(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    const/4 v4, -0x1

    .line 145
    if-eq v14, v4, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 149
    .line 150
    invoke-static {v13, v0, v8}, Lp7/c;->x(IILjava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v16

    .line 154
    invoke-static/range {v16 .. v16}, Lp7/c;->k(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eq v13, v4, :cond_8

    .line 159
    .line 160
    :goto_4
    move v12, v3

    .line 161
    :goto_5
    const/4 v14, 0x0

    .line 162
    goto/16 :goto_10

    .line 163
    .line 164
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 165
    .line 166
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    const-wide/16 v17, -0x1

    .line 171
    .line 172
    const-wide v19, 0xe677d21fdbffL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    move/from16 v23, v3

    .line 178
    .line 179
    move/from16 v25, v23

    .line 180
    .line 181
    move/from16 v28, v25

    .line 182
    .line 183
    move-wide/from16 v21, v17

    .line 184
    .line 185
    move-wide/from16 v26, v19

    .line 186
    .line 187
    const/16 p2, 0x1

    .line 188
    .line 189
    const/4 v13, 0x0

    .line 190
    const/4 v14, 0x0

    .line 191
    const/16 v24, 0x1

    .line 192
    .line 193
    :goto_6
    const-wide v29, 0x7fffffffffffffffL

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    const-wide/high16 v31, -0x8000000000000000L

    .line 199
    .line 200
    if-ge v0, v4, :cond_15

    .line 201
    .line 202
    invoke-static {v8, v11, v0, v4}, Lp7/c;->f(Ljava/lang/String;CII)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-static {v8, v12, v0, v3}, Lp7/c;->f(Ljava/lang/String;CII)I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    invoke-static {v0, v11, v8}, Lp7/c;->x(IILjava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ge v11, v3, :cond_9

    .line 215
    .line 216
    add-int/lit8 v11, v11, 0x1

    .line 217
    .line 218
    invoke-static {v11, v3, v8}, Lp7/c;->x(IILjava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    goto :goto_7

    .line 223
    :cond_9
    const-string v11, ""

    .line 224
    .line 225
    :goto_7
    const-string v12, "expires"

    .line 226
    .line 227
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    if-eqz v12, :cond_a

    .line 232
    .line 233
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-static {v0, v11}, Lokhttp3/o;->i(ILjava/lang/String;)J

    .line 238
    .line 239
    .line 240
    move-result-wide v26
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 241
    :goto_8
    move/from16 v25, p2

    .line 242
    .line 243
    goto/16 :goto_9

    .line 244
    .line 245
    :cond_a
    const-string v12, "max-age"

    .line 246
    .line 247
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    if-eqz v12, :cond_e

    .line 252
    .line 253
    :try_start_1
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 254
    .line 255
    .line 256
    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 257
    const-wide/16 v21, 0x0

    .line 258
    .line 259
    cmp-long v0, v11, v21

    .line 260
    .line 261
    if-gtz v0, :cond_b

    .line 262
    .line 263
    move-wide/from16 v21, v31

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_b
    move-wide/from16 v21, v11

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :catch_0
    move-exception v0

    .line 270
    :try_start_2
    new-instance v12, Lkotlin/text/Regex;

    .line 271
    .line 272
    move-object/from16 v33, v0

    .line 273
    .line 274
    const-string v0, "-?\\d+"

    .line 275
    .line 276
    invoke-direct {v12, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v11}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_d

    .line 284
    .line 285
    const-string v0, "-"

    .line 286
    .line 287
    const/4 v12, 0x0

    .line 288
    invoke-static {v11, v0, v12}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_c

    .line 293
    .line 294
    move-wide/from16 v29, v31

    .line 295
    .line 296
    :cond_c
    move-wide/from16 v21, v29

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_d
    throw v33
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 300
    :cond_e
    const-string v12, "domain"

    .line 301
    .line 302
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v12

    .line 306
    if-eqz v12, :cond_11

    .line 307
    .line 308
    :try_start_3
    const-string v0, "."

    .line 309
    .line 310
    const/4 v12, 0x0

    .line 311
    invoke-static {v11, v0, v12}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v29

    .line 315
    if-nez v29, :cond_10

    .line 316
    .line 317
    invoke-static {v11, v0}, Lkotlin/text/p;->V(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0}, Lkotlin/collections/u;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-eqz v0, :cond_f

    .line 326
    .line 327
    move-object v14, v0

    .line 328
    const/16 v24, 0x0

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 332
    .line 333
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :cond_10
    const-string v0, "Failed requirement."

    .line 338
    .line 339
    new-instance v11, Ljava/lang/IllegalArgumentException;

    .line 340
    .line 341
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v11
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 345
    :cond_11
    const-string v12, "path"

    .line 346
    .line 347
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v12

    .line 351
    if-eqz v12, :cond_12

    .line 352
    .line 353
    move-object v13, v11

    .line 354
    goto :goto_9

    .line 355
    :cond_12
    const-string v11, "secure"

    .line 356
    .line 357
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    if-eqz v11, :cond_13

    .line 362
    .line 363
    move/from16 v28, p2

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_13
    const-string v11, "httponly"

    .line 367
    .line 368
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_14

    .line 373
    .line 374
    move/from16 v23, p2

    .line 375
    .line 376
    :catch_1
    :cond_14
    :goto_9
    add-int/lit8 v0, v3, 0x1

    .line 377
    .line 378
    const/4 v3, 0x0

    .line 379
    const/16 v11, 0x3b

    .line 380
    .line 381
    const/16 v12, 0x3d

    .line 382
    .line 383
    goto/16 :goto_6

    .line 384
    .line 385
    :cond_15
    cmp-long v0, v21, v31

    .line 386
    .line 387
    if-nez v0, :cond_16

    .line 388
    .line 389
    move-wide/from16 v17, v31

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_16
    cmp-long v0, v21, v17

    .line 393
    .line 394
    if-eqz v0, :cond_1a

    .line 395
    .line 396
    const-wide v3, 0x20c49ba5e353f7L

    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    cmp-long v0, v21, v3

    .line 402
    .line 403
    if-gtz v0, :cond_17

    .line 404
    .line 405
    const/16 v0, 0x3e8

    .line 406
    .line 407
    int-to-long v3, v0

    .line 408
    mul-long v29, v21, v3

    .line 409
    .line 410
    :cond_17
    add-long v29, v9, v29

    .line 411
    .line 412
    cmp-long v0, v29, v9

    .line 413
    .line 414
    if-ltz v0, :cond_19

    .line 415
    .line 416
    cmp-long v0, v29, v19

    .line 417
    .line 418
    if-lez v0, :cond_18

    .line 419
    .line 420
    goto :goto_a

    .line 421
    :cond_18
    move-wide/from16 v17, v29

    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_19
    :goto_a
    move-wide/from16 v17, v19

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_1a
    move-wide/from16 v17, v26

    .line 428
    .line 429
    :goto_b
    iget-object v0, v1, Lokhttp3/r;->d:Ljava/lang/String;

    .line 430
    .line 431
    if-nez v14, :cond_1b

    .line 432
    .line 433
    move-object v14, v0

    .line 434
    goto :goto_c

    .line 435
    :cond_1b
    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_1c

    .line 440
    .line 441
    goto :goto_c

    .line 442
    :cond_1c
    const/4 v12, 0x0

    .line 443
    invoke-static {v0, v14, v12}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    if-eqz v3, :cond_1d

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    sub-int/2addr v3, v4

    .line 458
    add-int/lit8 v3, v3, -0x1

    .line 459
    .line 460
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    const/16 v4, 0x2e

    .line 465
    .line 466
    if-ne v3, v4, :cond_1d

    .line 467
    .line 468
    sget-object v3, Lp7/c;->g:Lkotlin/text/Regex;

    .line 469
    .line 470
    invoke-virtual {v3, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    if-nez v3, :cond_1d

    .line 475
    .line 476
    :goto_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    if-eq v0, v3, :cond_1e

    .line 485
    .line 486
    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->g:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 487
    .line 488
    invoke-virtual {v0, v14}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    if-nez v0, :cond_1e

    .line 493
    .line 494
    :cond_1d
    const/4 v12, 0x0

    .line 495
    goto/16 :goto_5

    .line 496
    .line 497
    :cond_1e
    const-string v0, "/"

    .line 498
    .line 499
    const/4 v12, 0x0

    .line 500
    if-eqz v13, :cond_20

    .line 501
    .line 502
    invoke-static {v13, v0, v12}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    if-nez v3, :cond_1f

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_1f
    :goto_d
    move-object/from16 v20, v13

    .line 510
    .line 511
    move-object/from16 v19, v14

    .line 512
    .line 513
    goto :goto_f

    .line 514
    :cond_20
    :goto_e
    invoke-virtual {v1}, Lokhttp3/r;->b()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    const/16 v4, 0x2f

    .line 519
    .line 520
    const/4 v8, 0x6

    .line 521
    invoke-static {v3, v4, v12, v8}, Lkotlin/text/p;->S(Ljava/lang/CharSequence;CII)I

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    if-eqz v4, :cond_21

    .line 526
    .line 527
    invoke-virtual {v3, v12, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 532
    .line 533
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    :cond_21
    move-object v13, v0

    .line 537
    goto :goto_d

    .line 538
    :goto_f
    new-instance v14, Lokhttp3/m;

    .line 539
    .line 540
    move/from16 v22, v23

    .line 541
    .line 542
    move/from16 v23, v25

    .line 543
    .line 544
    move/from16 v21, v28

    .line 545
    .line 546
    invoke-direct/range {v14 .. v24}, Lokhttp3/m;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 547
    .line 548
    .line 549
    :goto_10
    if-nez v14, :cond_22

    .line 550
    .line 551
    goto :goto_11

    .line 552
    :cond_22
    if-nez v7, :cond_23

    .line 553
    .line 554
    new-instance v7, Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 557
    .line 558
    .line 559
    :cond_23
    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    :goto_11
    add-int/lit8 v6, v6, 0x1

    .line 563
    .line 564
    move v3, v12

    .line 565
    goto/16 :goto_3

    .line 566
    .line 567
    :cond_24
    if-eqz v7, :cond_25

    .line 568
    .line 569
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    const-string v1, "{\n        Collections.un\u2026ableList(cookies)\n      }"

    .line 574
    .line 575
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    goto :goto_12

    .line 579
    :cond_25
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 580
    .line 581
    :goto_12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    return-void
.end method
