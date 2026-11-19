.class public final Lo9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/x;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lo9/b;->a:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(ILn9/h;)Z
    .locals 1

    .line 1
    const/16 p2, 0x64

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, p2, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/16 p2, 0x66

    .line 8
    .line 9
    if-gt p2, p1, :cond_1

    .line 10
    .line 11
    const/16 p2, 0xc8

    .line 12
    .line 13
    if-ge p1, p2, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public intercept(Li9/x$a;)Li9/d0;
    .locals 13

    .line 1
    const-string v0, "Connection"

    .line 2
    .line 3
    const-string v1, "close"

    .line 4
    .line 5
    const-string v2, "chain"

    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Lo9/g;

    .line 11
    .line 12
    invoke-virtual {p1}, Lo9/g;->g()Ln9/h;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lo9/g;->i()Li9/b0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Li9/b0;->a()Li9/c0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x1

    .line 33
    const/4 v8, 0x0

    .line 34
    :try_start_0
    invoke-virtual {v2, p1}, Ln9/h;->w(Li9/b0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Li9/b0;->h()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-static {v9}, Lo9/f;->a(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-eqz v9, :cond_3

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    const-string v9, "100-continue"

    .line 50
    .line 51
    const-string v10, "Expect"

    .line 52
    .line 53
    invoke-virtual {p1, v10}, Li9/b0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-static {v9, v10, v7}, Lg8/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_0

    .line 62
    .line 63
    invoke-virtual {v2}, Ln9/h;->h()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v7}, Ln9/h;->s(Z)Li9/d0$a;

    .line 67
    .line 68
    .line 69
    move-result-object v9
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 70
    :try_start_1
    invoke-virtual {v2}, Ln9/h;->u()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    .line 72
    .line 73
    move v10, v6

    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception v3

    .line 76
    move v10, v7

    .line 77
    goto :goto_2

    .line 78
    :catch_1
    move-exception v3

    .line 79
    move v10, v7

    .line 80
    move-object v9, v8

    .line 81
    goto :goto_2

    .line 82
    :cond_0
    move v10, v7

    .line 83
    move-object v9, v8

    .line 84
    :goto_0
    if-nez v9, :cond_2

    .line 85
    .line 86
    :try_start_2
    invoke-virtual {v3}, Li9/c0;->isDuplex()Z

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    if-eqz v11, :cond_1

    .line 91
    .line 92
    invoke-virtual {v2}, Ln9/h;->h()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p1, v7}, Ln9/h;->e(Li9/b0;Z)Lokio/Sink;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-static {v11}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-virtual {v3, v11}, Li9/c0;->writeTo(Lokio/BufferedSink;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catch_2
    move-exception v3

    .line 108
    goto :goto_2

    .line 109
    :cond_1
    invoke-virtual {v2, p1, v6}, Ln9/h;->e(Li9/b0;Z)Lokio/Sink;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    invoke-static {v11}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    invoke-virtual {v3, v11}, Li9/c0;->writeTo(Lokio/BufferedSink;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v11}, Lokio/Sink;->close()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-virtual {v2}, Ln9/h;->q()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ln9/h;->j()Ln9/o;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-virtual {v11}, Ln9/o;->q()Z

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-nez v11, :cond_4

    .line 136
    .line 137
    invoke-virtual {v2}, Ln9/h;->p()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    :try_start_3
    invoke-virtual {v2}, Ln9/h;->q()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 142
    .line 143
    .line 144
    move v10, v7

    .line 145
    move-object v9, v8

    .line 146
    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    .line 147
    .line 148
    :try_start_4
    invoke-virtual {v3}, Li9/c0;->isDuplex()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-nez v3, :cond_6

    .line 153
    .line 154
    :cond_5
    invoke-virtual {v2}, Ln9/h;->g()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 155
    .line 156
    .line 157
    :cond_6
    move-object v3, v8

    .line 158
    goto :goto_3

    .line 159
    :goto_2
    instance-of v11, v3, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 160
    .line 161
    if-nez v11, :cond_12

    .line 162
    .line 163
    invoke-virtual {v2}, Ln9/h;->m()Z

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    if-eqz v11, :cond_11

    .line 168
    .line 169
    :goto_3
    if-nez v9, :cond_7

    .line 170
    .line 171
    :try_start_5
    invoke-virtual {v2, v6}, Ln9/h;->s(Z)Li9/d0$a;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    if-eqz v10, :cond_7

    .line 179
    .line 180
    invoke-virtual {v2}, Ln9/h;->u()V

    .line 181
    .line 182
    .line 183
    move v10, v6

    .line 184
    goto :goto_4

    .line 185
    :catch_3
    move-exception p1

    .line 186
    goto/16 :goto_7

    .line 187
    .line 188
    :cond_7
    :goto_4
    invoke-virtual {v9, p1}, Li9/d0$a;->q(Li9/b0;)Li9/d0$a;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v2}, Ln9/h;->j()Ln9/o;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v11}, Ln9/o;->m()Lokhttp3/c;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v9, v11}, Li9/d0$a;->h(Lokhttp3/c;)Li9/d0$a;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    invoke-virtual {v9, v4, v5}, Li9/d0$a;->r(J)Li9/d0$a;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v11

    .line 212
    invoke-virtual {v9, v11, v12}, Li9/d0$a;->p(J)Li9/d0$a;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-virtual {v9}, Li9/d0$a;->c()Li9/d0;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-virtual {v9}, Li9/d0;->f()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    :goto_5
    invoke-virtual {p0, v11, v2}, Lo9/b;->a(ILn9/h;)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-eqz v12, :cond_9

    .line 229
    .line 230
    invoke-virtual {v2, v6}, Ln9/h;->s(Z)Li9/d0$a;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    if-eqz v10, :cond_8

    .line 238
    .line 239
    invoke-virtual {v2}, Ln9/h;->u()V

    .line 240
    .line 241
    .line 242
    :cond_8
    invoke-virtual {v9, p1}, Li9/d0$a;->q(Li9/b0;)Li9/d0$a;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-virtual {v2}, Ln9/h;->j()Ln9/o;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    invoke-virtual {v11}, Ln9/o;->m()Lokhttp3/c;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    invoke-virtual {v9, v11}, Li9/d0$a;->h(Lokhttp3/c;)Li9/d0$a;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-virtual {v9, v4, v5}, Li9/d0$a;->r(J)Li9/d0$a;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 263
    .line 264
    .line 265
    move-result-wide v11

    .line 266
    invoke-virtual {v9, v11, v12}, Li9/d0$a;->p(J)Li9/d0$a;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-virtual {v9}, Li9/d0$a;->c()Li9/d0;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-virtual {v9}, Li9/d0;->f()I

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    goto :goto_5

    .line 279
    :cond_9
    invoke-virtual {v2, v9}, Ln9/h;->t(Li9/d0;)V

    .line 280
    .line 281
    .line 282
    iget-boolean p1, p0, Lo9/b;->a:Z

    .line 283
    .line 284
    if-eqz p1, :cond_a

    .line 285
    .line 286
    const/16 p1, 0x65

    .line 287
    .line 288
    if-ne v11, p1, :cond_a

    .line 289
    .line 290
    invoke-static {v9}, Lj9/c;->a(Li9/d0;)Li9/d0;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    goto :goto_6

    .line 295
    :cond_a
    invoke-virtual {v2, v9}, Ln9/h;->r(Li9/d0;)Li9/e0;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {v9}, Li9/d0;->p()Li9/d0$a;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v4, p1}, Li9/d0$a;->b(Li9/e0;)Li9/d0$a;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    new-instance v5, Lo9/b$a;

    .line 308
    .line 309
    invoke-direct {v5, v2, p1}, Lo9/b$a;-><init>(Ln9/h;Li9/e0;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v5}, Li9/d0$a;->s(Li9/g0;)Li9/d0$a;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-virtual {p1}, Li9/d0$a;->c()Li9/d0;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    :goto_6
    invoke-virtual {p1}, Li9/d0;->t()Li9/b0;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-virtual {v4, v0}, Li9/b0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-static {v1, v4, v7}, Lg8/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-nez v4, :cond_b

    .line 333
    .line 334
    const/4 v4, 0x2

    .line 335
    invoke-static {p1, v0, v8, v4, v8}, Li9/d0;->k(Li9/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-static {v1, v0, v7}, Lg8/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_c

    .line 344
    .line 345
    :cond_b
    invoke-virtual {v2}, Ln9/h;->p()V

    .line 346
    .line 347
    .line 348
    :cond_c
    const/16 v0, 0xcc

    .line 349
    .line 350
    if-eq v11, v0, :cond_d

    .line 351
    .line 352
    const/16 v0, 0xcd

    .line 353
    .line 354
    if-ne v11, v0, :cond_e

    .line 355
    .line 356
    :cond_d
    invoke-virtual {p1}, Li9/d0;->b()Li9/e0;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v0}, Li9/e0;->contentLength()J

    .line 361
    .line 362
    .line 363
    move-result-wide v0

    .line 364
    const-wide/16 v4, 0x0

    .line 365
    .line 366
    cmp-long v0, v0, v4

    .line 367
    .line 368
    if-gtz v0, :cond_f

    .line 369
    .line 370
    :cond_e
    return-object p1

    .line 371
    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    .line 372
    .line 373
    new-instance v1, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    const-string v2, "HTTP "

    .line 379
    .line 380
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v2, " had non-zero Content-Length: "

    .line 387
    .line 388
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1}, Li9/d0;->b()Li9/e0;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-virtual {p1}, Li9/e0;->contentLength()J

    .line 396
    .line 397
    .line 398
    move-result-wide v4

    .line 399
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 410
    :goto_7
    if-eqz v3, :cond_10

    .line 411
    .line 412
    invoke-static {v3, p1}, Lh7/b;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 413
    .line 414
    .line 415
    throw v3

    .line 416
    :cond_10
    throw p1

    .line 417
    :cond_11
    throw v3

    .line 418
    :cond_12
    throw v3
.end method
