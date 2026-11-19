.class public abstract Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:Lh0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "http.keepAlive"

    .line 2
    .line 3
    const-string v1, "true"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static a(Lf0/a;Ljava/lang/String;Ljava/lang/String;[B)Lh0/b;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "sendRequest use adashx, bytes length : "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const-string v1, "0"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    array-length v1, p3

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lj0/e;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lh0/b;

    .line 32
    .line 33
    invoke-direct {v0}, Lh0/b;-><init>()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v1, p0, Lf0/a;->i:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/net/URL;

    .line 45
    .line 46
    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v1, Ljava/net/URL;

    .line 51
    .line 52
    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Ljava/net/HttpURLConnection;

    .line 60
    .line 61
    instance-of v2, p2, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_c

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    :try_start_1
    sget-object v2, Lh0/c;->b:Lh0/d;

    .line 66
    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    new-instance v2, Lh0/d;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v2, v1}, Lh0/d;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sput-object v2, Lh0/c;->b:Lh0/d;

    .line 89
    .line 90
    :cond_2
    move-object v1, p2

    .line 91
    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    .line 92
    .line 93
    sget-object v2, Lh0/c;->b:Lh0/d;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_c

    .line 96
    .line 97
    .line 98
    :catch_0
    :cond_3
    if-eqz p2, :cond_c

    .line 99
    .line 100
    const/4 v1, 0x1

    .line 101
    invoke-virtual {p2, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 105
    .line 106
    .line 107
    :try_start_2
    const-string v2, "POST"

    .line 108
    .line 109
    invoke-virtual {p2, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/ProtocolException; {:try_start_2 .. :try_end_2} :catch_c

    .line 110
    .line 111
    .line 112
    const/4 v2, 0x0

    .line 113
    invoke-virtual {p2, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 114
    .line 115
    .line 116
    const/16 v3, 0x2710

    .line 117
    .line 118
    invoke-virtual {p2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 119
    .line 120
    .line 121
    const v3, 0xea60

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 128
    .line 129
    .line 130
    const-string v3, "Content-Type"

    .line 131
    .line 132
    const-string v4, "application/x-www-form-urlencoded"

    .line 133
    .line 134
    invoke-virtual {p2, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v3, "Charset"

    .line 138
    .line 139
    const-string v4, "UTF-8"

    .line 140
    .line 141
    invoke-virtual {p2, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-nez v3, :cond_4

    .line 149
    .line 150
    const-string v3, "x-k"

    .line 151
    .line 152
    invoke-virtual {p2, v3, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    :try_start_3
    iget-object p0, p0, Lf0/a;->d:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 156
    .line 157
    const-string v3, "x-t"

    .line 158
    .line 159
    const-string v4, "x-s"

    .line 160
    .line 161
    const-string v5, "signValue:"

    .line 162
    .line 163
    if-eqz p0, :cond_5

    .line 164
    .line 165
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-lez v6, :cond_5

    .line 170
    .line 171
    new-instance v6, Lg0/a;

    .line 172
    .line 173
    invoke-direct {v6, p1, p0, v1}, Lg0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 174
    .line 175
    .line 176
    invoke-static {p3}, Lj0/f;->b([B)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v6, p0}, Lg0/a;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance p1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {p1}, Lj0/e;->a(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const-string p0, "2"

    .line 206
    .line 207
    invoke-virtual {p2, v3, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :catchall_0
    move-exception p0

    .line 212
    goto :goto_2

    .line 213
    :cond_5
    const-string p0, ""

    .line 214
    .line 215
    new-instance v1, Lg0/a;

    .line 216
    .line 217
    invoke-direct {v1, p1, p0, v2}, Lg0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 218
    .line 219
    .line 220
    invoke-static {p3}, Lj0/f;->b([B)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {v1, p0}, Lg0/a;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    new-instance p1, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Lj0/e;->a(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2, v4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const-string p0, "3"

    .line 250
    .line 251
    invoke-virtual {p2, v3, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p0}, Lj0/e;->b(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 263
    .line 264
    .line 265
    move-result-wide p0

    .line 266
    const/4 v1, 0x0

    .line 267
    :try_start_5
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    .line 268
    .line 269
    .line 270
    if-eqz p3, :cond_6

    .line 271
    .line 272
    array-length v3, p3

    .line 273
    if-lez v3, :cond_6

    .line 274
    .line 275
    new-instance v3, Ljava/io/DataOutputStream;

    .line 276
    .line 277
    invoke-virtual {p2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-direct {v3, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_5
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 282
    .line 283
    .line 284
    :try_start_6
    invoke-virtual {v3, p3}, Ljava/io/OutputStream;->write([B)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_6
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :catchall_1
    move-exception p0

    .line 292
    move-object v1, v3

    .line 293
    goto/16 :goto_e

    .line 294
    .line 295
    :catch_1
    move-exception p2

    .line 296
    move-object v1, v3

    .line 297
    goto/16 :goto_b

    .line 298
    .line 299
    :catch_2
    move-exception p2

    .line 300
    move-object v1, v3

    .line 301
    goto/16 :goto_d

    .line 302
    .line 303
    :catchall_2
    move-exception p0

    .line 304
    goto/16 :goto_e

    .line 305
    .line 306
    :catch_3
    move-exception p2

    .line 307
    goto/16 :goto_b

    .line 308
    .line 309
    :catch_4
    move-exception p2

    .line 310
    goto/16 :goto_d

    .line 311
    .line 312
    :cond_6
    move-object v3, v1

    .line 313
    :goto_4
    if-eqz v3, :cond_7

    .line 314
    .line 315
    :try_start_7
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :catch_5
    move-exception p3

    .line 320
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p3

    .line 324
    invoke-static {p3}, Lj0/e;->b(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    :cond_7
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 328
    .line 329
    .line 330
    move-result-wide v3

    .line 331
    sub-long/2addr v3, p0

    .line 332
    iput-wide v3, v0, Lh0/b;->b:J

    .line 333
    .line 334
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 335
    .line 336
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 337
    .line 338
    .line 339
    :try_start_8
    new-instance p1, Ljava/io/DataInputStream;

    .line 340
    .line 341
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    invoke-direct {p1, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 346
    .line 347
    .line 348
    const/16 p2, 0x800

    .line 349
    .line 350
    :try_start_9
    new-array p3, p2, [B

    .line 351
    .line 352
    :goto_6
    invoke-virtual {p1, p3, v2, p2}, Ljava/io/InputStream;->read([BII)I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    const/4 v3, -0x1

    .line 357
    if-eq v1, v3, :cond_8

    .line 358
    .line 359
    invoke-virtual {p0, p3, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 360
    .line 361
    .line 362
    goto :goto_6

    .line 363
    :catchall_3
    move-exception p0

    .line 364
    move-object v1, p1

    .line 365
    goto :goto_9

    .line 366
    :catch_6
    move-exception p2

    .line 367
    move-object v1, p1

    .line 368
    goto :goto_7

    .line 369
    :cond_8
    :try_start_a
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 370
    .line 371
    .line 372
    goto :goto_8

    .line 373
    :catch_7
    move-exception p1

    .line 374
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :catchall_4
    move-exception p0

    .line 383
    goto :goto_9

    .line 384
    :catch_8
    move-exception p2

    .line 385
    :goto_7
    :try_start_b
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 390
    .line 391
    .line 392
    if-eqz v1, :cond_9

    .line 393
    .line 394
    :try_start_c
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 395
    .line 396
    .line 397
    :cond_9
    :goto_8
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    if-lez p1, :cond_c

    .line 402
    .line 403
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    invoke-static {p0}, Lh0/a;->e([B)I

    .line 408
    .line 409
    .line 410
    move-result p0

    .line 411
    sput p0, Lh0/c;->a:I

    .line 412
    .line 413
    iput p0, v0, Lh0/b;->a:I

    .line 414
    .line 415
    sget-object p0, Lh0/a;->b:Ljava/lang/String;

    .line 416
    .line 417
    iput-object p0, v0, Lh0/b;->c:Ljava/lang/String;

    .line 418
    .line 419
    goto :goto_10

    .line 420
    :goto_9
    if-eqz v1, :cond_a

    .line 421
    .line 422
    :try_start_d
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    .line 423
    .line 424
    .line 425
    goto :goto_a

    .line 426
    :catch_9
    move-exception p1

    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    :cond_a
    :goto_a
    throw p0

    .line 435
    :goto_b
    :try_start_e
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p2

    .line 439
    invoke-static {p2}, Lj0/e;->b(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 443
    .line 444
    .line 445
    move-result-wide p2

    .line 446
    sub-long/2addr p2, p0

    .line 447
    iput-wide p2, v0, Lh0/b;->b:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 448
    .line 449
    if-eqz v1, :cond_c

    .line 450
    .line 451
    :goto_c
    :try_start_f
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 452
    .line 453
    .line 454
    goto :goto_10

    .line 455
    :catch_a
    move-exception p0

    .line 456
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    invoke-static {p0}, Lj0/e;->b(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    goto :goto_10

    .line 464
    :goto_d
    :try_start_10
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object p2

    .line 468
    invoke-static {p2}, Lj0/e;->b(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 472
    .line 473
    .line 474
    move-result-wide p2

    .line 475
    sub-long/2addr p2, p0

    .line 476
    iput-wide p2, v0, Lh0/b;->b:J
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 477
    .line 478
    if-eqz v1, :cond_c

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :goto_e
    if-eqz v1, :cond_b

    .line 482
    .line 483
    :try_start_11
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_b

    .line 484
    .line 485
    .line 486
    goto :goto_f

    .line 487
    :catch_b
    move-exception p1

    .line 488
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    :cond_b
    :goto_f
    throw p0

    .line 496
    :catch_c
    :cond_c
    :goto_10
    return-object v0
.end method

.method public static b(Lf0/a;Ljava/lang/String;[B)Lh0/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lf0/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lf0/a;->i:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "/upload"

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "http://"

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "https://"

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    invoke-static {p0, v0, p1, p2}, Lh0/c;->a(Lf0/a;Ljava/lang/String;Ljava/lang/String;[B)Lh0/b;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
