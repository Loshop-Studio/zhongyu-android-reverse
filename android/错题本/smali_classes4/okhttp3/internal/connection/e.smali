.class public final Lokhttp3/internal/connection/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lokhttp3/internal/connection/m;

.field public final b:Lokhttp3/a;

.field public final c:Lokhttp3/internal/connection/i;

.field public d:Ld2/c;

.field public e:Lokhttp3/internal/connection/n;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lokhttp3/n0;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/m;Lokhttp3/a;Lokhttp3/internal/connection/i;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/connection/e;->a:Lokhttp3/internal/connection/m;

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 12
    .line 13
    iput-object p3, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(ZIZII)Lokhttp3/internal/connection/k;
    .locals 12

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 2
    .line 3
    iget-boolean v0, v0, Lokhttp3/internal/connection/i;->n:Z

    .line 4
    .line 5
    if-nez v0, :cond_23

    .line 6
    .line 7
    iget-object v0, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 8
    .line 9
    iget-object v1, v0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-boolean v3, v1, Lokhttp3/internal/connection/k;->j:Z

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    iget-object v3, v1, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 21
    .line 22
    iget-object v3, v3, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 23
    .line 24
    iget-object v3, v3, Lokhttp3/a;->i:Lokhttp3/r;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Lokhttp3/internal/connection/e;->b(Lokhttp3/r;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v3, v2

    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_3

    .line 38
    :cond_2
    :goto_1
    iget-object v3, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 39
    .line 40
    invoke-virtual {v3}, Lokhttp3/internal/connection/i;->m()Ljava/net/Socket;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_2
    monitor-exit v1

    .line 45
    iget-object v4, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 46
    .line 47
    iget-object v4, v4, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    goto/16 :goto_f

    .line 54
    .line 55
    :cond_3
    const-string p1, "Check failed."

    .line 56
    .line 57
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p2

    .line 63
    :cond_4
    if-eqz v3, :cond_5

    .line 64
    .line 65
    invoke-static {v3}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :goto_3
    monitor-exit v1

    .line 70
    throw p1

    .line 71
    :cond_5
    :goto_4
    const/4 v1, 0x0

    .line 72
    iput v1, p0, Lokhttp3/internal/connection/e;->f:I

    .line 73
    .line 74
    iput v1, p0, Lokhttp3/internal/connection/e;->g:I

    .line 75
    .line 76
    iput v1, p0, Lokhttp3/internal/connection/e;->h:I

    .line 77
    .line 78
    iget-object v3, p0, Lokhttp3/internal/connection/e;->a:Lokhttp3/internal/connection/m;

    .line 79
    .line 80
    iget-object v4, p0, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 81
    .line 82
    iget-object v5, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 83
    .line 84
    invoke-virtual {v3, v4, v5, v2, v1}, Lokhttp3/internal/connection/m;->a(Lokhttp3/a;Lokhttp3/internal/connection/i;Ljava/util/ArrayList;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_6

    .line 89
    .line 90
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 91
    .line 92
    iget-object v1, v1, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 93
    .line 94
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_f

    .line 98
    .line 99
    :cond_6
    iget-object v3, p0, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 100
    .line 101
    if-eqz v3, :cond_7

    .line 102
    .line 103
    iput-object v2, p0, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 104
    .line 105
    :goto_5
    move-object v4, v2

    .line 106
    goto/16 :goto_e

    .line 107
    .line 108
    :cond_7
    iget-object v3, p0, Lokhttp3/internal/connection/e;->d:Ld2/c;

    .line 109
    .line 110
    if-eqz v3, :cond_9

    .line 111
    .line 112
    invoke-virtual {v3}, Ld2/c;->e()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_9

    .line 117
    .line 118
    iget-object v1, p0, Lokhttp3/internal/connection/e;->d:Ld2/c;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ld2/c;->e()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_8

    .line 128
    .line 129
    iget-object v3, v1, Ld2/c;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v3, Ljava/util/ArrayList;

    .line 132
    .line 133
    iget v4, v1, Ld2/c;->b:I

    .line 134
    .line 135
    add-int/lit8 v5, v4, 0x1

    .line 136
    .line 137
    iput v5, v1, Ld2/c;->b:I

    .line 138
    .line 139
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    move-object v3, v1

    .line 144
    check-cast v3, Lokhttp3/n0;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :cond_9
    iget-object v3, p0, Lokhttp3/internal/connection/e;->e:Lokhttp3/internal/connection/n;

    .line 154
    .line 155
    if-nez v3, :cond_a

    .line 156
    .line 157
    new-instance v3, Lokhttp3/internal/connection/n;

    .line 158
    .line 159
    iget-object v4, p0, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 160
    .line 161
    iget-object v5, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 162
    .line 163
    iget-object v6, v5, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 164
    .line 165
    iget-object v6, v6, Lokhttp3/z;->A:Lo2/a;

    .line 166
    .line 167
    invoke-direct {v3, v4, v6, v5}, Lokhttp3/internal/connection/n;-><init>(Lokhttp3/a;Lo2/a;Lokhttp3/e;)V

    .line 168
    .line 169
    .line 170
    iput-object v3, p0, Lokhttp3/internal/connection/e;->e:Lokhttp3/internal/connection/n;

    .line 171
    .line 172
    :cond_a
    invoke-virtual {v3}, Lokhttp3/internal/connection/n;->a()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_22

    .line 177
    .line 178
    new-instance v4, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    :cond_b
    iget v5, v3, Lokhttp3/internal/connection/n;->d:I

    .line 184
    .line 185
    iget-object v6, v3, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-ge v5, v6, :cond_18

    .line 192
    .line 193
    iget-object v5, v3, Lokhttp3/internal/connection/n;->a:Lokhttp3/a;

    .line 194
    .line 195
    const-string v6, "No route to "

    .line 196
    .line 197
    iget v7, v3, Lokhttp3/internal/connection/n;->d:I

    .line 198
    .line 199
    iget-object v8, v3, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-ge v7, v8, :cond_17

    .line 206
    .line 207
    iget-object v7, v3, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 208
    .line 209
    iget v8, v3, Lokhttp3/internal/connection/n;->d:I

    .line 210
    .line 211
    add-int/lit8 v9, v8, 0x1

    .line 212
    .line 213
    iput v9, v3, Lokhttp3/internal/connection/n;->d:I

    .line 214
    .line 215
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, Ljava/net/Proxy;

    .line 220
    .line 221
    new-instance v8, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    iput-object v8, v3, Lokhttp3/internal/connection/n;->e:Ljava/lang/Object;

    .line 227
    .line 228
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    sget-object v10, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 233
    .line 234
    if-eq v9, v10, :cond_f

    .line 235
    .line 236
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 241
    .line 242
    if-ne v9, v10, :cond_c

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_c
    invoke-virtual {v7}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    instance-of v10, v9, Ljava/net/InetSocketAddress;

    .line 250
    .line 251
    if-eqz v10, :cond_e

    .line 252
    .line 253
    const-string v10, "proxyAddress"

    .line 254
    .line 255
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    check-cast v9, Ljava/net/InetSocketAddress;

    .line 259
    .line 260
    const-string v10, "<this>"

    .line 261
    .line 262
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    if-nez v10, :cond_d

    .line 270
    .line 271
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    const-string v11, "hostName"

    .line 276
    .line 277
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_d
    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    const-string v11, "address.hostAddress"

    .line 286
    .line 287
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    :goto_6
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    goto :goto_8

    .line 295
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string p2, "Proxy.address() is not an InetSocketAddress: "

    .line 298
    .line 299
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw p2

    .line 323
    :cond_f
    :goto_7
    iget-object v9, v5, Lokhttp3/a;->i:Lokhttp3/r;

    .line 324
    .line 325
    iget-object v10, v9, Lokhttp3/r;->d:Ljava/lang/String;

    .line 326
    .line 327
    iget v9, v9, Lokhttp3/r;->e:I

    .line 328
    .line 329
    :goto_8
    if-gt v0, v9, :cond_16

    .line 330
    .line 331
    const/high16 v11, 0x10000

    .line 332
    .line 333
    if-ge v9, v11, :cond_16

    .line 334
    .line 335
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 340
    .line 341
    if-ne v6, v11, :cond_10

    .line 342
    .line 343
    invoke-static {v10, v9}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_b

    .line 351
    :cond_10
    sget-object v6, Lp7/c;->a:[B

    .line 352
    .line 353
    const-string v6, "<this>"

    .line 354
    .line 355
    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    sget-object v6, Lp7/c;->g:Lkotlin/text/Regex;

    .line 359
    .line 360
    invoke-virtual {v6, v10}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    if-eqz v6, :cond_11

    .line 365
    .line 366
    invoke-static {v10}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    invoke-static {v5}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    goto :goto_9

    .line 375
    :cond_11
    iget-object v6, v5, Lokhttp3/a;->a:Lokhttp3/b;

    .line 376
    .line 377
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    :try_start_1
    invoke-static {v10}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    const-string v11, "getAllByName(hostname)"

    .line 385
    .line 386
    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v6}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 393
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    if-nez v11, :cond_15

    .line 398
    .line 399
    move-object v5, v6

    .line 400
    :goto_9
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    if-eqz v6, :cond_12

    .line 409
    .line 410
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    check-cast v6, Ljava/net/InetAddress;

    .line 415
    .line 416
    new-instance v10, Ljava/net/InetSocketAddress;

    .line 417
    .line 418
    invoke-direct {v10, v6, v9}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_12
    :goto_b
    iget-object v5, v3, Lokhttp3/internal/connection/n;->e:Ljava/lang/Object;

    .line 426
    .line 427
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-eqz v6, :cond_14

    .line 436
    .line 437
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 442
    .line 443
    new-instance v8, Lokhttp3/n0;

    .line 444
    .line 445
    iget-object v9, v3, Lokhttp3/internal/connection/n;->a:Lokhttp3/a;

    .line 446
    .line 447
    invoke-direct {v8, v9, v7, v6}, Lokhttp3/n0;-><init>(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 448
    .line 449
    .line 450
    iget-object v6, v3, Lokhttp3/internal/connection/n;->b:Lo2/a;

    .line 451
    .line 452
    monitor-enter v6

    .line 453
    :try_start_2
    iget-object v9, v6, Lo2/a;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v9, Ljava/util/LinkedHashSet;

    .line 456
    .line 457
    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 461
    monitor-exit v6

    .line 462
    if-eqz v9, :cond_13

    .line 463
    .line 464
    iget-object v6, v3, Lokhttp3/internal/connection/n;->f:Ljava/util/ArrayList;

    .line 465
    .line 466
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_13
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    goto :goto_c

    .line 474
    :catchall_1
    move-exception v0

    .line 475
    move-object p1, v0

    .line 476
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 477
    throw p1

    .line 478
    :cond_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-nez v5, :cond_b

    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_15
    new-instance p1, Ljava/net/UnknownHostException;

    .line 486
    .line 487
    new-instance p2, Ljava/lang/StringBuilder;

    .line 488
    .line 489
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 490
    .line 491
    .line 492
    iget-object p3, v5, Lokhttp3/a;->a:Lokhttp3/b;

    .line 493
    .line 494
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    const-string p3, " returned no addresses for "

    .line 498
    .line 499
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object p2

    .line 509
    invoke-direct {p1, p2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    throw p1

    .line 513
    :catch_0
    move-exception v0

    .line 514
    move-object p1, v0

    .line 515
    new-instance p2, Ljava/net/UnknownHostException;

    .line 516
    .line 517
    const-string p3, "Broken system behaviour for dns lookup of "

    .line 518
    .line 519
    invoke-virtual {p3, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p3

    .line 523
    invoke-direct {p2, p3}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 527
    .line 528
    .line 529
    throw p2

    .line 530
    :cond_16
    new-instance p1, Ljava/net/SocketException;

    .line 531
    .line 532
    new-instance p2, Ljava/lang/StringBuilder;

    .line 533
    .line 534
    invoke-direct {p2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    const/16 p3, 0x3a

    .line 541
    .line 542
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    const-string p3, "; port is out of range"

    .line 549
    .line 550
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object p2

    .line 557
    invoke-direct {p1, p2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    throw p1

    .line 561
    :cond_17
    new-instance p1, Ljava/net/SocketException;

    .line 562
    .line 563
    new-instance p2, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    invoke-direct {p2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    iget-object p3, v5, Lokhttp3/a;->i:Lokhttp3/r;

    .line 569
    .line 570
    iget-object p3, p3, Lokhttp3/r;->d:Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    const-string p3, "; exhausted proxy configurations: "

    .line 576
    .line 577
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    iget-object p3, v3, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 581
    .line 582
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object p2

    .line 589
    invoke-direct {p1, p2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    throw p1

    .line 593
    :cond_18
    :goto_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-eqz v5, :cond_19

    .line 598
    .line 599
    iget-object v5, v3, Lokhttp3/internal/connection/n;->f:Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-static {v5, v4}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 602
    .line 603
    .line 604
    iget-object v3, v3, Lokhttp3/internal/connection/n;->f:Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 607
    .line 608
    .line 609
    :cond_19
    new-instance v3, Ld2/c;

    .line 610
    .line 611
    invoke-direct {v3, v4}, Ld2/c;-><init>(Ljava/util/ArrayList;)V

    .line 612
    .line 613
    .line 614
    iput-object v3, p0, Lokhttp3/internal/connection/e;->d:Ld2/c;

    .line 615
    .line 616
    iget-object v5, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 617
    .line 618
    iget-boolean v5, v5, Lokhttp3/internal/connection/i;->n:Z

    .line 619
    .line 620
    if-nez v5, :cond_21

    .line 621
    .line 622
    iget-object v5, p0, Lokhttp3/internal/connection/e;->a:Lokhttp3/internal/connection/m;

    .line 623
    .line 624
    iget-object v6, p0, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 625
    .line 626
    iget-object v7, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 627
    .line 628
    invoke-virtual {v5, v6, v7, v4, v1}, Lokhttp3/internal/connection/m;->a(Lokhttp3/a;Lokhttp3/internal/connection/i;Ljava/util/ArrayList;Z)Z

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    if-eqz v1, :cond_1a

    .line 633
    .line 634
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 635
    .line 636
    iget-object v1, v1, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 637
    .line 638
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    goto/16 :goto_f

    .line 642
    .line 643
    :cond_1a
    invoke-virtual {v3}, Ld2/c;->e()Z

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    if-eqz v1, :cond_20

    .line 648
    .line 649
    iget v1, v3, Ld2/c;->b:I

    .line 650
    .line 651
    add-int/lit8 v5, v1, 0x1

    .line 652
    .line 653
    iput v5, v3, Ld2/c;->b:I

    .line 654
    .line 655
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    move-object v3, v1

    .line 660
    check-cast v3, Lokhttp3/n0;

    .line 661
    .line 662
    :goto_e
    new-instance v5, Lokhttp3/internal/connection/k;

    .line 663
    .line 664
    iget-object v1, p0, Lokhttp3/internal/connection/e;->a:Lokhttp3/internal/connection/m;

    .line 665
    .line 666
    invoke-direct {v5, v1, v3}, Lokhttp3/internal/connection/k;-><init>(Lokhttp3/internal/connection/m;Lokhttp3/n0;)V

    .line 667
    .line 668
    .line 669
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 670
    .line 671
    iput-object v5, v1, Lokhttp3/internal/connection/i;->p:Lokhttp3/internal/connection/k;

    .line 672
    .line 673
    :try_start_4
    iget-object v10, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 674
    .line 675
    move v9, p1

    .line 676
    move v6, p2

    .line 677
    move/from16 v7, p4

    .line 678
    .line 679
    move/from16 v8, p5

    .line 680
    .line 681
    invoke-virtual/range {v5 .. v10}, Lokhttp3/internal/connection/k;->c(IIIZLokhttp3/e;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 682
    .line 683
    .line 684
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 685
    .line 686
    iput-object v2, v1, Lokhttp3/internal/connection/i;->p:Lokhttp3/internal/connection/k;

    .line 687
    .line 688
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 689
    .line 690
    iget-object v1, v1, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 691
    .line 692
    iget-object v1, v1, Lokhttp3/z;->A:Lo2/a;

    .line 693
    .line 694
    monitor-enter v1

    .line 695
    :try_start_5
    iget-object v2, v1, Lo2/a;->b:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 698
    .line 699
    invoke-interface {v2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 700
    .line 701
    .line 702
    monitor-exit v1

    .line 703
    iget-object v1, p0, Lokhttp3/internal/connection/e;->a:Lokhttp3/internal/connection/m;

    .line 704
    .line 705
    iget-object v2, p0, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 706
    .line 707
    iget-object v6, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 708
    .line 709
    invoke-virtual {v1, v2, v6, v4, v0}, Lokhttp3/internal/connection/m;->a(Lokhttp3/a;Lokhttp3/internal/connection/i;Ljava/util/ArrayList;Z)Z

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    if-eqz v1, :cond_1b

    .line 714
    .line 715
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 716
    .line 717
    iget-object v1, v1, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 718
    .line 719
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    iput-object v3, p0, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 723
    .line 724
    iget-object v2, v5, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 725
    .line 726
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    invoke-static {v2}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 730
    .line 731
    .line 732
    goto :goto_f

    .line 733
    :cond_1b
    monitor-enter v5

    .line 734
    :try_start_6
    iget-object v1, p0, Lokhttp3/internal/connection/e;->a:Lokhttp3/internal/connection/m;

    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    sget-object v2, Lp7/c;->a:[B

    .line 740
    .line 741
    iget-object v2, v1, Lokhttp3/internal/connection/m;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 742
    .line 743
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    iget-object v2, v1, Lokhttp3/internal/connection/m;->b:Lr7/b;

    .line 747
    .line 748
    iget-object v1, v1, Lokhttp3/internal/connection/m;->c:Lokhttp3/internal/connection/l;

    .line 749
    .line 750
    const-wide/16 v3, 0x0

    .line 751
    .line 752
    invoke-virtual {v2, v1, v3, v4}, Lr7/b;->b(Lr7/a;J)V

    .line 753
    .line 754
    .line 755
    iget-object v1, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 756
    .line 757
    invoke-virtual {v1, v5}, Lokhttp3/internal/connection/i;->e(Lokhttp3/internal/connection/k;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 758
    .line 759
    .line 760
    monitor-exit v5

    .line 761
    move-object v1, v5

    .line 762
    :goto_f
    invoke-virtual {v1, p3}, Lokhttp3/internal/connection/k;->i(Z)Z

    .line 763
    .line 764
    .line 765
    move-result v2

    .line 766
    if-eqz v2, :cond_1c

    .line 767
    .line 768
    return-object v1

    .line 769
    :cond_1c
    invoke-virtual {v1}, Lokhttp3/internal/connection/k;->k()V

    .line 770
    .line 771
    .line 772
    iget-object v1, p0, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 773
    .line 774
    if-nez v1, :cond_0

    .line 775
    .line 776
    iget-object v1, p0, Lokhttp3/internal/connection/e;->d:Ld2/c;

    .line 777
    .line 778
    if-eqz v1, :cond_1d

    .line 779
    .line 780
    invoke-virtual {v1}, Ld2/c;->e()Z

    .line 781
    .line 782
    .line 783
    move-result v1

    .line 784
    goto :goto_10

    .line 785
    :cond_1d
    move v1, v0

    .line 786
    :goto_10
    if-nez v1, :cond_0

    .line 787
    .line 788
    iget-object v1, p0, Lokhttp3/internal/connection/e;->e:Lokhttp3/internal/connection/n;

    .line 789
    .line 790
    if-eqz v1, :cond_1e

    .line 791
    .line 792
    invoke-virtual {v1}, Lokhttp3/internal/connection/n;->a()Z

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    :cond_1e
    if-eqz v0, :cond_1f

    .line 797
    .line 798
    goto/16 :goto_0

    .line 799
    .line 800
    :cond_1f
    new-instance p1, Ljava/io/IOException;

    .line 801
    .line 802
    const-string p2, "exhausted all routes"

    .line 803
    .line 804
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    throw p1

    .line 808
    :catchall_2
    move-exception v0

    .line 809
    move-object p1, v0

    .line 810
    monitor-exit v5

    .line 811
    throw p1

    .line 812
    :catchall_3
    move-exception v0

    .line 813
    move-object p1, v0

    .line 814
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 815
    throw p1

    .line 816
    :catchall_4
    move-exception v0

    .line 817
    move-object p1, v0

    .line 818
    iget-object p2, p0, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 819
    .line 820
    iput-object v2, p2, Lokhttp3/internal/connection/i;->p:Lokhttp3/internal/connection/k;

    .line 821
    .line 822
    throw p1

    .line 823
    :cond_20
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 824
    .line 825
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 826
    .line 827
    .line 828
    throw p1

    .line 829
    :cond_21
    new-instance p1, Ljava/io/IOException;

    .line 830
    .line 831
    const-string p2, "Canceled"

    .line 832
    .line 833
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    throw p1

    .line 837
    :cond_22
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 838
    .line 839
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 840
    .line 841
    .line 842
    throw p1

    .line 843
    :cond_23
    new-instance p1, Ljava/io/IOException;

    .line 844
    .line 845
    const-string p2, "Canceled"

    .line 846
    .line 847
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    throw p1
.end method

.method public final b(Lokhttp3/r;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 7
    .line 8
    iget-object v0, v0, Lokhttp3/a;->i:Lokhttp3/r;

    .line 9
    .line 10
    iget v1, p1, Lokhttp3/r;->e:I

    .line 11
    .line 12
    iget v2, v0, Lokhttp3/r;->e:I

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lokhttp3/r;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v0, Lokhttp3/r;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 8
    .line 9
    instance-of v0, p1, Lokhttp3/internal/http2/StreamResetException;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lokhttp3/internal/http2/StreamResetException;

    .line 15
    .line 16
    iget-object v0, v0, Lokhttp3/internal/http2/StreamResetException;->errorCode:Lokhttp3/internal/http2/ErrorCode;

    .line 17
    .line 18
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->REFUSED_STREAM:Lokhttp3/internal/http2/ErrorCode;

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget p1, p0, Lokhttp3/internal/connection/e;->f:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, Lokhttp3/internal/connection/e;->f:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of p1, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lokhttp3/internal/connection/e;->g:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lokhttp3/internal/connection/e;->g:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget p1, p0, Lokhttp3/internal/connection/e;->h:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, Lokhttp3/internal/connection/e;->h:I

    .line 45
    .line 46
    return-void
.end method
