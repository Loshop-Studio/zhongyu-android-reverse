.class public Lcom/alibaba/sdk/android/tbrest/rest/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILjava/lang/String;Ljava/util/Map;Z)[B
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)[B"
        }
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const-string v3, "write out error!"

    .line 6
    .line 7
    const-string v4, "connection error!"

    .line 8
    .line 9
    const-string v5, "out close error!"

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isEmpty(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object v6

    .line 19
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 20
    .line 21
    move-object/from16 v7, p1

    .line 22
    .line 23
    invoke-direct {v0, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v7, v0

    .line 31
    check-cast v7, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_10
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_f

    .line 32
    .line 33
    if-eqz v7, :cond_1c

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    const/4 v8, 0x3

    .line 37
    const/4 v9, 0x2

    .line 38
    if-eq v1, v9, :cond_1

    .line 39
    .line 40
    if-ne v1, v8, :cond_2

    .line 41
    .line 42
    :cond_1
    invoke-virtual {v7, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v7, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 46
    .line 47
    .line 48
    if-eq v1, v9, :cond_4

    .line 49
    .line 50
    if-ne v1, v8, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    :try_start_1
    const-string v10, "GET"

    .line 54
    .line 55
    invoke-virtual {v7, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception v0

    .line 60
    move-object/from16 v16, v6

    .line 61
    .line 62
    goto/16 :goto_18

    .line 63
    .line 64
    :cond_4
    :goto_0
    const-string v10, "POST"

    .line 65
    .line 66
    invoke-virtual {v7, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    .line 69
    :goto_1
    const/4 v4, 0x0

    .line 70
    invoke-virtual {v7, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 71
    .line 72
    .line 73
    const/16 v10, 0x2710

    .line 74
    .line 75
    invoke-virtual {v7, v10}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 76
    .line 77
    .line 78
    const v10, 0xea60

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v10}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 82
    .line 83
    .line 84
    const-string v10, "Connection"

    .line 85
    .line 86
    const-string v11, "close"

    .line 87
    .line 88
    invoke-virtual {v7, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    if-eqz p3, :cond_5

    .line 92
    .line 93
    const-string v10, "Accept-Encoding"

    .line 94
    .line 95
    const-string v11, "gzip,deflate"

    .line 96
    .line 97
    invoke-virtual {v7, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 101
    .line 102
    .line 103
    if-eq v1, v9, :cond_7

    .line 104
    .line 105
    if-ne v1, v8, :cond_6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move-object v0, v6

    .line 109
    move-object/from16 v16, v0

    .line 110
    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :cond_7
    :goto_2
    const-string v10, "Content-Type"

    .line 114
    .line 115
    if-ne v1, v9, :cond_8

    .line 116
    .line 117
    const-string v11, "multipart/form-data; boundary=GJircTeP"

    .line 118
    .line 119
    invoke-virtual {v7, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_8
    if-ne v1, v8, :cond_9

    .line 124
    .line 125
    const-string v11, "application/x-www-form-urlencoded"

    .line 126
    .line 127
    invoke-virtual {v7, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_9
    :goto_3
    if-eqz v2, :cond_10

    .line 131
    .line 132
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-lez v10, :cond_10

    .line 137
    .line 138
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 139
    .line 140
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-interface {v11}, Ljava/util/Set;->size()I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    new-array v12, v12, [Ljava/lang/String;

    .line 152
    .line 153
    invoke-interface {v11, v12}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/rest/c;->a()Lcom/alibaba/sdk/android/tbrest/rest/c;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {v11, v12, v0}, Lcom/alibaba/sdk/android/tbrest/rest/c;->a([Ljava/lang/String;Z)[Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    array-length v12, v11

    .line 165
    move v13, v4

    .line 166
    :goto_4
    const-string v14, "write lBaos error!"

    .line 167
    .line 168
    if-ge v13, v12, :cond_e

    .line 169
    .line 170
    aget-object v0, v11, v13

    .line 171
    .line 172
    if-ne v1, v9, :cond_b

    .line 173
    .line 174
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    check-cast v15, [B

    .line 179
    .line 180
    if-eqz v15, :cond_a

    .line 181
    .line 182
    move-object/from16 v16, v6

    .line 183
    .line 184
    :try_start_2
    const-string v6, "--GJircTeP\r\nContent-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\nContent-Type: application/octet-stream \r\n\r\n"

    .line 185
    .line 186
    filled-new-array {v0, v0}, [Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v15}, Ljava/io/OutputStream;->write([B)V

    .line 202
    .line 203
    .line 204
    const-string v0, "\r\n"

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :catch_1
    move-exception v0

    .line 215
    invoke-static {v14, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_a
    move-object/from16 v16, v6

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_b
    move-object/from16 v16, v6

    .line 223
    .line 224
    if-ne v1, v8, :cond_d

    .line 225
    .line 226
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    check-cast v6, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    const-string v4, "="

    .line 237
    .line 238
    if-lez v15, :cond_c

    .line 239
    .line 240
    :try_start_3
    new-instance v15, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v8, "&"

    .line 246
    .line 247
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :catch_2
    move-exception v0

    .line 272
    invoke-static {v14, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_c
    :try_start_4
    new-instance v8, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :catch_3
    move-exception v0

    .line 303
    invoke-static {v14, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :cond_d
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 307
    .line 308
    move-object/from16 v6, v16

    .line 309
    .line 310
    const/4 v4, 0x0

    .line 311
    const/4 v8, 0x3

    .line 312
    goto/16 :goto_4

    .line 313
    .line 314
    :cond_e
    move-object/from16 v16, v6

    .line 315
    .line 316
    if-ne v1, v9, :cond_f

    .line 317
    .line 318
    :try_start_5
    const-string v0, "--GJircTeP--\r\n"

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :catch_4
    move-exception v0

    .line 329
    invoke-static {v14, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :cond_f
    :goto_6
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    goto :goto_7

    .line 337
    :cond_10
    move-object/from16 v16, v6

    .line 338
    .line 339
    move-object/from16 v0, v16

    .line 340
    .line 341
    :goto_7
    if-eqz v0, :cond_11

    .line 342
    .line 343
    array-length v2, v0

    .line 344
    goto :goto_8

    .line 345
    :cond_11
    const/4 v2, 0x0

    .line 346
    :goto_8
    const-string v4, "Content-Length"

    .line 347
    .line 348
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v7, v4, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :goto_9
    :try_start_6
    invoke-virtual {v7}, Ljava/net/URLConnection;->connect()V

    .line 356
    .line 357
    .line 358
    if-eq v1, v9, :cond_12

    .line 359
    .line 360
    const/4 v2, 0x3

    .line 361
    if-ne v1, v2, :cond_13

    .line 362
    .line 363
    :cond_12
    if-eqz v0, :cond_13

    .line 364
    .line 365
    array-length v1, v0

    .line 366
    if-lez v1, :cond_13

    .line 367
    .line 368
    new-instance v1, Ljava/io/DataOutputStream;

    .line 369
    .line 370
    invoke-virtual {v7}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 375
    .line 376
    .line 377
    :try_start_7
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 381
    .line 382
    .line 383
    goto :goto_a

    .line 384
    :catchall_0
    move-exception v0

    .line 385
    move-object v6, v1

    .line 386
    move-object v1, v0

    .line 387
    goto/16 :goto_16

    .line 388
    .line 389
    :catch_5
    move-exception v0

    .line 390
    goto/16 :goto_14

    .line 391
    .line 392
    :catchall_1
    move-exception v0

    .line 393
    move-object v1, v0

    .line 394
    move-object/from16 v6, v16

    .line 395
    .line 396
    goto/16 :goto_16

    .line 397
    .line 398
    :catch_6
    move-exception v0

    .line 399
    move-object/from16 v1, v16

    .line 400
    .line 401
    goto/16 :goto_14

    .line 402
    .line 403
    :cond_13
    move-object/from16 v1, v16

    .line 404
    .line 405
    :goto_a
    if-eqz v1, :cond_14

    .line 406
    .line 407
    :try_start_8
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 408
    .line 409
    .line 410
    goto :goto_b

    .line 411
    :catch_7
    move-exception v0

    .line 412
    invoke-static {v5, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 413
    .line 414
    .line 415
    :cond_14
    :goto_b
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 416
    .line 417
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 418
    .line 419
    .line 420
    if-eqz p3, :cond_15

    .line 421
    .line 422
    :try_start_9
    const-string v0, "gzip"

    .line 423
    .line 424
    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_15

    .line 433
    .line 434
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 435
    .line 436
    invoke-virtual {v7}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-direct {v0, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 441
    .line 442
    .line 443
    :goto_c
    move-object v2, v0

    .line 444
    goto :goto_d

    .line 445
    :catchall_2
    move-exception v0

    .line 446
    move-object v1, v0

    .line 447
    move-object/from16 v6, v16

    .line 448
    .line 449
    goto :goto_12

    .line 450
    :catch_8
    move-exception v0

    .line 451
    move-object/from16 v2, v16

    .line 452
    .line 453
    goto :goto_10

    .line 454
    :cond_15
    new-instance v0, Ljava/io/DataInputStream;

    .line 455
    .line 456
    invoke-virtual {v7}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-direct {v0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 461
    .line 462
    .line 463
    goto :goto_c

    .line 464
    :goto_d
    const/16 v0, 0x800

    .line 465
    .line 466
    :try_start_a
    new-array v4, v0, [B

    .line 467
    .line 468
    const/4 v6, 0x0

    .line 469
    :goto_e
    invoke-virtual {v2, v4, v6, v0}, Ljava/io/InputStream;->read([BII)I

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    const/4 v8, -0x1

    .line 474
    if-eq v7, v8, :cond_16

    .line 475
    .line 476
    invoke-virtual {v1, v4, v6, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 477
    .line 478
    .line 479
    goto :goto_e

    .line 480
    :catchall_3
    move-exception v0

    .line 481
    move-object v1, v0

    .line 482
    move-object v6, v2

    .line 483
    goto :goto_12

    .line 484
    :catch_9
    move-exception v0

    .line 485
    goto :goto_10

    .line 486
    :cond_16
    :try_start_b
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    .line 487
    .line 488
    .line 489
    goto :goto_f

    .line 490
    :catch_a
    move-exception v0

    .line 491
    invoke-static {v5, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 492
    .line 493
    .line 494
    :goto_f
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-lez v0, :cond_17

    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    return-object v0

    .line 505
    :cond_17
    return-object v16

    .line 506
    :goto_10
    :try_start_c
    invoke-static {v3, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 507
    .line 508
    .line 509
    if-eqz v2, :cond_18

    .line 510
    .line 511
    :try_start_d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_b

    .line 512
    .line 513
    .line 514
    goto :goto_11

    .line 515
    :catch_b
    move-exception v0

    .line 516
    invoke-static {v5, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 517
    .line 518
    .line 519
    :cond_18
    :goto_11
    return-object v16

    .line 520
    :goto_12
    if-eqz v6, :cond_19

    .line 521
    .line 522
    :try_start_e
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c

    .line 523
    .line 524
    .line 525
    goto :goto_13

    .line 526
    :catch_c
    move-exception v0

    .line 527
    invoke-static {v5, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 528
    .line 529
    .line 530
    :cond_19
    :goto_13
    throw v1

    .line 531
    :goto_14
    :try_start_f
    invoke-static {v3, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 532
    .line 533
    .line 534
    if-eqz v1, :cond_1a

    .line 535
    .line 536
    :try_start_10
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_d

    .line 537
    .line 538
    .line 539
    goto :goto_15

    .line 540
    :catch_d
    move-exception v0

    .line 541
    invoke-static {v5, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    :cond_1a
    :goto_15
    return-object v16

    .line 545
    :goto_16
    if-eqz v6, :cond_1b

    .line 546
    .line 547
    :try_start_11
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_e

    .line 548
    .line 549
    .line 550
    goto :goto_17

    .line 551
    :catch_e
    move-exception v0

    .line 552
    invoke-static {v5, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    :cond_1b
    :goto_17
    throw v1

    .line 556
    :goto_18
    invoke-static {v4, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 557
    .line 558
    .line 559
    return-object v16

    .line 560
    :cond_1c
    move-object/from16 v16, v6

    .line 561
    .line 562
    return-object v16

    .line 563
    :catch_f
    move-exception v0

    .line 564
    move-object/from16 v16, v6

    .line 565
    .line 566
    goto :goto_19

    .line 567
    :catch_10
    move-exception v0

    .line 568
    move-object/from16 v16, v6

    .line 569
    .line 570
    goto :goto_1a

    .line 571
    :goto_19
    invoke-static {v4, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 572
    .line 573
    .line 574
    return-object v16

    .line 575
    :goto_1a
    invoke-static {v4, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 576
    .line 577
    .line 578
    return-object v16
.end method
