.class public final Ls7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/t;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls7/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/s;)Lokhttp3/i0;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ls7/a;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v4, "bearer "

    .line 7
    .line 8
    const-string v5, "Authorization"

    .line 9
    .line 10
    const-string v6, "AppVersion"

    .line 11
    .line 12
    const-string v7, "Mistake"

    .line 13
    .line 14
    const-string v8, "AppName"

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v0, p1

    .line 20
    .line 21
    check-cast v0, Ls7/e;

    .line 22
    .line 23
    iget-object v2, v0, Ls7/e;->e:Lokhttp3/c0;

    .line 24
    .line 25
    invoke-virtual {v2}, Lokhttp3/c0;->a()Lokhttp3/b0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2, v8, v7}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/blankj/utilcode/util/c;->e()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v6, v3}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v3, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-lez v3, :cond_0

    .line 50
    .line 51
    sget-object v3, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v5, v3}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {v2}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v2}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_0
    move-object/from16 v0, p1

    .line 70
    .line 71
    check-cast v0, Ls7/e;

    .line 72
    .line 73
    iget-object v9, v0, Ls7/e;->e:Lokhttp3/c0;

    .line 74
    .line 75
    invoke-virtual {v0, v9}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    iget v10, v9, Lokhttp3/i0;->d:I

    .line 80
    .line 81
    const/16 v11, 0x191

    .line 82
    .line 83
    if-ne v10, v11, :cond_4

    .line 84
    .line 85
    :try_start_0
    new-instance v10, Lcom/google/gson/g;

    .line 86
    .line 87
    invoke-direct {v10}, Lcom/google/gson/g;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object v11, v9, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 91
    .line 92
    if-eqz v11, :cond_1

    .line 93
    .line 94
    invoke-virtual {v11}, Lokhttp3/m0;->charStream()Ljava/io/Reader;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_1
    const/4 v11, 0x0

    .line 103
    :goto_0
    const-class v12, Lcom/zykj/mistake/network/ApiResp;

    .line 104
    .line 105
    new-instance v13, Lk1/a;

    .line 106
    .line 107
    invoke-direct {v13, v12}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10, v11, v13}, Lcom/google/gson/g;->b(Ljava/io/Reader;Lk1/a;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    check-cast v10, Lcom/zykj/mistake/network/ApiResp;

    .line 115
    .line 116
    if-eqz v10, :cond_2

    .line 117
    .line 118
    invoke-virtual {v10}, Lcom/zykj/mistake/network/ApiResp;->getErrorMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    const/4 v3, 0x0

    .line 124
    :goto_1
    const-string v10, "CurrentUserDidNotLoginToTheApplication"

    .line 125
    .line 126
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    new-instance v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 133
    .line 134
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-boolean v2, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 138
    .line 139
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 140
    .line 141
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v10, ""

    .line 145
    .line 146
    iput-object v10, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 147
    .line 148
    sget-object v10, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 149
    .line 150
    new-instance v11, Landroidx/navigation/d;

    .line 151
    .line 152
    const/16 v12, 0x14

    .line 153
    .line 154
    invoke-direct {v11, v12, v2, v3}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v11}, Lcom/zykj/message/client/MessageClient;->refreshToken(Lr6/c;)V

    .line 158
    .line 159
    .line 160
    :goto_2
    iget-boolean v10, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    const-string v11, "OkHttp"

    .line 163
    .line 164
    if-eqz v10, :cond_3

    .line 165
    .line 166
    :try_start_1
    const-string v10, "\u62e6\u622a\u5668\u7b49\u5f85\u4e2d"

    .line 167
    .line 168
    invoke-static {v11, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_3
    const-string v3, "\u62e6\u622a\u5668\u7ed3\u675f"

    .line 173
    .line 174
    invoke-static {v11, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v3, Ljava/lang/CharSequence;

    .line 180
    .line 181
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-lez v3, :cond_4

    .line 186
    .line 187
    sget-object v3, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 188
    .line 189
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, Ljava/lang/String;

    .line 192
    .line 193
    const-string v3, "<set-?>"

    .line 194
    .line 195
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    sput-object v2, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 199
    .line 200
    move-object/from16 v2, p1

    .line 201
    .line 202
    check-cast v2, Ls7/e;

    .line 203
    .line 204
    iget-object v2, v2, Ls7/e;->e:Lokhttp3/c0;

    .line 205
    .line 206
    invoke-virtual {v2}, Lokhttp3/c0;->a()Lokhttp3/b0;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v2, v8, v7}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lcom/blankj/utilcode/util/c;->e()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v2, v6, v3}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    sget-object v3, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 225
    .line 226
    new-instance v6, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v2, v5, v3}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v0, v2}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 249
    .line 250
    .line 251
    move-result-object v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 252
    goto :goto_4

    .line 253
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 254
    .line 255
    .line 256
    :cond_4
    :goto_4
    return-object v9

    .line 257
    :pswitch_1
    const-string v4, "Connection"

    .line 258
    .line 259
    const-string v5, "close"

    .line 260
    .line 261
    const-string v6, "HTTP "

    .line 262
    .line 263
    move-object/from16 v0, p1

    .line 264
    .line 265
    check-cast v0, Ls7/e;

    .line 266
    .line 267
    iget-object v7, v0, Ls7/e;->d:Lokhttp3/internal/connection/d;

    .line 268
    .line 269
    invoke-static {v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v8, v7, Lokhttp3/internal/connection/d;->a:Lokhttp3/internal/connection/i;

    .line 273
    .line 274
    iget-object v9, v7, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 275
    .line 276
    iget-object v10, v7, Lokhttp3/internal/connection/d;->f:Lokhttp3/internal/connection/k;

    .line 277
    .line 278
    iget-object v11, v0, Ls7/e;->e:Lokhttp3/c0;

    .line 279
    .line 280
    iget-object v0, v11, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 281
    .line 282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 283
    .line 284
    .line 285
    move-result-wide v12

    .line 286
    :try_start_2
    invoke-interface {v9, v11}, Ls7/c;->f(Lokhttp3/c0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_9

    .line 287
    .line 288
    .line 289
    :try_start_3
    iget-object v15, v11, Lokhttp3/c0;->b:Ljava/lang/String;

    .line 290
    .line 291
    invoke-static {v15}, Lcoil3/network/g;->k(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v15
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8

    .line 295
    if-eqz v15, :cond_a

    .line 296
    .line 297
    if-eqz v0, :cond_a

    .line 298
    .line 299
    :try_start_4
    const-string v15, "100-continue"

    .line 300
    .line 301
    const-string v3, "Expect"

    .line 302
    .line 303
    iget-object v14, v11, Lokhttp3/c0;->c:Lokhttp3/q;

    .line 304
    .line 305
    invoke-virtual {v14, v3}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v15, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 313
    if-eqz v3, :cond_5

    .line 314
    .line 315
    :try_start_5
    invoke-interface {v9}, Ls7/c;->h()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 316
    .line 317
    .line 318
    :try_start_6
    invoke-virtual {v7, v2}, Lokhttp3/internal/connection/d;->c(Z)Lokhttp3/h0;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    goto :goto_6

    .line 323
    :catch_1
    move-exception v0

    .line 324
    const/4 v3, 0x0

    .line 325
    :goto_5
    const/4 v14, 0x0

    .line 326
    goto/16 :goto_c

    .line 327
    .line 328
    :catch_2
    move-exception v0

    .line 329
    invoke-virtual {v7, v0}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 330
    .line 331
    .line 332
    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 333
    :cond_5
    const/4 v3, 0x0

    .line 334
    :goto_6
    if-nez v3, :cond_7

    .line 335
    .line 336
    :try_start_7
    invoke-virtual {v0}, Lokhttp3/g0;->isDuplex()Z

    .line 337
    .line 338
    .line 339
    move-result v8
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 340
    if-eqz v8, :cond_6

    .line 341
    .line 342
    :try_start_8
    invoke-interface {v9}, Ls7/c;->h()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 343
    .line 344
    .line 345
    :try_start_9
    invoke-virtual {v7, v11, v2}, Lokhttp3/internal/connection/d;->b(Lokhttp3/c0;Z)Lokhttp3/internal/connection/b;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v0, v2}, Lokhttp3/g0;->writeTo(Lokio/BufferedSink;)V

    .line 354
    .line 355
    .line 356
    goto :goto_8

    .line 357
    :catch_3
    move-exception v0

    .line 358
    goto :goto_5

    .line 359
    :catch_4
    move-exception v0

    .line 360
    invoke-virtual {v7, v0}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 361
    .line 362
    .line 363
    throw v0

    .line 364
    :cond_6
    const/4 v2, 0x0

    .line 365
    invoke-virtual {v7, v11, v2}, Lokhttp3/internal/connection/d;->b(Lokhttp3/c0;Z)Lokhttp3/internal/connection/b;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-static {v8}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v0, v2}, Lokhttp3/g0;->writeTo(Lokio/BufferedSink;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v2}, Lokio/Sink;->close()V

    .line 377
    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_7
    const/4 v14, 0x0

    .line 381
    const/4 v15, 0x0

    .line 382
    invoke-virtual {v8, v7, v2, v15, v14}, Lokhttp3/internal/connection/i;->k(Lokhttp3/internal/connection/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 383
    .line 384
    .line 385
    iget-object v8, v10, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 386
    .line 387
    if-eqz v8, :cond_8

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_8
    const/4 v2, 0x0

    .line 391
    :goto_7
    if-nez v2, :cond_9

    .line 392
    .line 393
    invoke-interface {v9}, Ls7/c;->c()Lokhttp3/internal/connection/k;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {v2}, Lokhttp3/internal/connection/k;->k()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 398
    .line 399
    .line 400
    :cond_9
    :goto_8
    const/4 v14, 0x0

    .line 401
    goto :goto_9

    .line 402
    :cond_a
    const/4 v14, 0x0

    .line 403
    const/4 v15, 0x0

    .line 404
    :try_start_a
    invoke-virtual {v8, v7, v2, v15, v14}, Lokhttp3/internal/connection/i;->k(Lokhttp3/internal/connection/d;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 405
    .line 406
    .line 407
    move-object v3, v14

    .line 408
    :goto_9
    if-eqz v0, :cond_b

    .line 409
    .line 410
    :try_start_b
    invoke-virtual {v0}, Lokhttp3/g0;->isDuplex()Z

    .line 411
    .line 412
    .line 413
    move-result v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 414
    if-nez v0, :cond_c

    .line 415
    .line 416
    goto :goto_a

    .line 417
    :catch_5
    move-exception v0

    .line 418
    goto :goto_c

    .line 419
    :cond_b
    :goto_a
    :try_start_c
    invoke-interface {v9}, Ls7/c;->a()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 420
    .line 421
    .line 422
    :cond_c
    move-object v2, v14

    .line 423
    goto :goto_d

    .line 424
    :catch_6
    move-exception v0

    .line 425
    :try_start_d
    invoke-virtual {v7, v0}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 426
    .line 427
    .line 428
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5

    .line 429
    :catch_7
    move-exception v0

    .line 430
    :goto_b
    move-object v3, v14

    .line 431
    goto :goto_c

    .line 432
    :catch_8
    move-exception v0

    .line 433
    const/4 v14, 0x0

    .line 434
    goto :goto_b

    .line 435
    :catch_9
    move-exception v0

    .line 436
    const/4 v14, 0x0

    .line 437
    :try_start_e
    invoke-virtual {v7, v0}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 438
    .line 439
    .line 440
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7

    .line 441
    :goto_c
    instance-of v2, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 442
    .line 443
    if-nez v2, :cond_18

    .line 444
    .line 445
    iget-boolean v2, v7, Lokhttp3/internal/connection/d;->e:Z

    .line 446
    .line 447
    if-eqz v2, :cond_17

    .line 448
    .line 449
    move-object v2, v0

    .line 450
    :goto_d
    if-nez v3, :cond_d

    .line 451
    .line 452
    const/4 v15, 0x0

    .line 453
    :try_start_f
    invoke-virtual {v7, v15}, Lokhttp3/internal/connection/d;->c(Z)Lokhttp3/h0;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    goto :goto_e

    .line 461
    :catch_a
    move-exception v0

    .line 462
    goto/16 :goto_13

    .line 463
    .line 464
    :cond_d
    :goto_e
    iput-object v11, v3, Lokhttp3/h0;->a:Lokhttp3/c0;

    .line 465
    .line 466
    iget-object v0, v10, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 467
    .line 468
    iput-object v0, v3, Lokhttp3/h0;->e:Lokhttp3/p;

    .line 469
    .line 470
    iput-wide v12, v3, Lokhttp3/h0;->k:J

    .line 471
    .line 472
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 473
    .line 474
    .line 475
    move-result-wide v14

    .line 476
    iput-wide v14, v3, Lokhttp3/h0;->l:J

    .line 477
    .line 478
    invoke-virtual {v3}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    iget v3, v0, Lokhttp3/i0;->d:I

    .line 483
    .line 484
    const/16 v8, 0x64

    .line 485
    .line 486
    if-ne v3, v8, :cond_e

    .line 487
    .line 488
    :goto_f
    const/4 v15, 0x0

    .line 489
    goto :goto_10

    .line 490
    :cond_e
    const/16 v8, 0x66

    .line 491
    .line 492
    if-gt v8, v3, :cond_f

    .line 493
    .line 494
    const/16 v8, 0xc8

    .line 495
    .line 496
    if-ge v3, v8, :cond_f

    .line 497
    .line 498
    goto :goto_f

    .line 499
    :goto_10
    invoke-virtual {v7, v15}, Lokhttp3/internal/connection/d;->c(Z)Lokhttp3/h0;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    iput-object v11, v0, Lokhttp3/h0;->a:Lokhttp3/c0;

    .line 507
    .line 508
    iget-object v3, v10, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 509
    .line 510
    iput-object v3, v0, Lokhttp3/h0;->e:Lokhttp3/p;

    .line 511
    .line 512
    iput-wide v12, v0, Lokhttp3/h0;->k:J

    .line 513
    .line 514
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 515
    .line 516
    .line 517
    move-result-wide v10

    .line 518
    iput-wide v10, v0, Lokhttp3/h0;->l:J

    .line 519
    .line 520
    invoke-virtual {v0}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    iget v3, v0, Lokhttp3/i0;->d:I

    .line 525
    .line 526
    :cond_f
    invoke-virtual {v0}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 527
    .line 528
    .line 529
    move-result-object v8
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 530
    :try_start_10
    const-string v10, "Content-Type"

    .line 531
    .line 532
    invoke-static {v10, v0}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v10

    .line 536
    invoke-interface {v9, v0}, Ls7/c;->d(Lokhttp3/i0;)J

    .line 537
    .line 538
    .line 539
    move-result-wide v11

    .line 540
    invoke-interface {v9, v0}, Ls7/c;->b(Lokhttp3/i0;)Lokio/Source;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    new-instance v13, Lokhttp3/internal/connection/c;

    .line 545
    .line 546
    invoke-direct {v13, v7, v0, v11, v12}, Lokhttp3/internal/connection/c;-><init>(Lokhttp3/internal/connection/d;Lokio/Source;J)V

    .line 547
    .line 548
    .line 549
    new-instance v0, Lokhttp3/k0;

    .line 550
    .line 551
    invoke-static {v13}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 552
    .line 553
    .line 554
    move-result-object v13

    .line 555
    invoke-direct {v0, v10, v11, v12, v13}, Lokhttp3/k0;-><init>(Ljava/lang/String;JLokio/BufferedSource;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b

    .line 556
    .line 557
    .line 558
    :try_start_11
    iput-object v0, v8, Lokhttp3/h0;->g:Lokhttp3/m0;

    .line 559
    .line 560
    invoke-virtual {v8}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    iget-object v7, v0, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 565
    .line 566
    iget-object v7, v7, Lokhttp3/c0;->c:Lokhttp3/q;

    .line 567
    .line 568
    invoke-virtual {v7, v4}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    if-nez v7, :cond_10

    .line 577
    .line 578
    invoke-static {v4, v0}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    if-eqz v4, :cond_11

    .line 587
    .line 588
    :cond_10
    invoke-interface {v9}, Ls7/c;->c()Lokhttp3/internal/connection/k;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    invoke-virtual {v4}, Lokhttp3/internal/connection/k;->k()V

    .line 593
    .line 594
    .line 595
    :cond_11
    const/16 v4, 0xcc

    .line 596
    .line 597
    if-eq v3, v4, :cond_12

    .line 598
    .line 599
    const/16 v4, 0xcd

    .line 600
    .line 601
    if-ne v3, v4, :cond_15

    .line 602
    .line 603
    :cond_12
    iget-object v4, v0, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 604
    .line 605
    if-eqz v4, :cond_13

    .line 606
    .line 607
    invoke-virtual {v4}, Lokhttp3/m0;->contentLength()J

    .line 608
    .line 609
    .line 610
    move-result-wide v4

    .line 611
    goto :goto_11

    .line 612
    :cond_13
    const-wide/16 v4, -0x1

    .line 613
    .line 614
    :goto_11
    const-wide/16 v7, 0x0

    .line 615
    .line 616
    cmp-long v4, v4, v7

    .line 617
    .line 618
    if-lez v4, :cond_15

    .line 619
    .line 620
    new-instance v4, Ljava/net/ProtocolException;

    .line 621
    .line 622
    new-instance v5, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    const-string v3, " had non-zero Content-Length: "

    .line 631
    .line 632
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    iget-object v0, v0, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 636
    .line 637
    if-eqz v0, :cond_14

    .line 638
    .line 639
    invoke-virtual {v0}, Lokhttp3/m0;->contentLength()J

    .line 640
    .line 641
    .line 642
    move-result-wide v6

    .line 643
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    goto :goto_12

    .line 648
    :cond_14
    const/4 v3, 0x0

    .line 649
    :goto_12
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-direct {v4, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    throw v4

    .line 660
    :cond_15
    return-object v0

    .line 661
    :catch_b
    move-exception v0

    .line 662
    invoke-virtual {v7, v0}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 663
    .line 664
    .line 665
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_a

    .line 666
    :goto_13
    if-eqz v2, :cond_16

    .line 667
    .line 668
    invoke-static {v2, v0}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 669
    .line 670
    .line 671
    throw v2

    .line 672
    :cond_16
    throw v0

    .line 673
    :cond_17
    throw v0

    .line 674
    :cond_18
    throw v0

    .line 675
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
