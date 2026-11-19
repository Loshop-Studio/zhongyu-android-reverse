.class public Lcom/tendcloud/tenddata/ft;
.super Lcom/tendcloud/tenddata/fk;
.source "SourceFile"


# instance fields
.field private a:Lcom/tendcloud/tenddata/dn;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/fu;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fk;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/tendcloud/tenddata/ft;->c:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v0, Lcom/tendcloud/tenddata/ft$1;->$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const-string v1, ":"

    .line 24
    .line 25
    const-string v2, "proxy"

    .line 26
    .line 27
    const-string v3, "available"

    .line 28
    .line 29
    const-string v4, "current"

    .line 30
    .line 31
    const-string v5, "ipv6"

    .line 32
    .line 33
    const-string v6, "connected"

    .line 34
    .line 35
    const-string v7, "type"

    .line 36
    .line 37
    const-string v8, "scannable"

    .line 38
    .line 39
    const-string v9, "ip"

    .line 40
    .line 41
    if-eq p1, v0, :cond_4

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    if-eq p1, v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    if-eq p1, v0, :cond_0

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_0
    :try_start_0
    sget-object p1, Lcom/tendcloud/tenddata/fu;->c:Lcom/tendcloud/tenddata/fu;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fu;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/fu;->b:Lcom/tendcloud/tenddata/fu;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fu;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->e(Landroid/content/Context;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, v3, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->j(Landroid/content/Context;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const-string p1, "cell_ip"

    .line 97
    .line 98
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string p1, "cell_ipv6"

    .line 106
    .line 107
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, v5, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->b(Landroid/content/Context;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_2

    .line 121
    .line 122
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;Z)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, v4, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-static {}, Lcom/tendcloud/tenddata/ch;->b()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_3

    .line 137
    .line 138
    new-instance p1, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 168
    .line 169
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->v(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    :catchall_0
    :goto_0
    return-void

    .line 177
    :cond_4
    sget-object p1, Lcom/tendcloud/tenddata/fu;->a:Lcom/tendcloud/tenddata/fu;

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fu;->a()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p0, v7, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 187
    .line 188
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->d(Landroid/content/Context;)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0, v3, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 200
    .line 201
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_c

    .line 206
    .line 207
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v0, v0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 221
    .line 222
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    iget-object v3, v3, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;

    .line 227
    .line 228
    const-string v6, "WiFi"

    .line 229
    .line 230
    invoke-virtual {p1, v6, v0, v3}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-eqz p1, :cond_5

    .line 235
    .line 236
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 237
    .line 238
    invoke-static {v0}, Lcom/tendcloud/tenddata/ch;->y(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {p0, v4, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-lez v0, :cond_6

    .line 250
    .line 251
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0, v6, p1}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_5
    iget-object p1, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 260
    .line 261
    invoke-virtual {p0, v4, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 262
    .line 263
    .line 264
    :cond_6
    :goto_1
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 265
    .line 266
    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->z(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-static {p1}, Lcom/tendcloud/tenddata/ft;->a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/dn;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v3, p0, Lcom/tendcloud/tenddata/ft;->a:Lcom/tendcloud/tenddata/dn;

    .line 275
    .line 276
    if-nez v3, :cond_7

    .line 277
    .line 278
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    iput-object v0, p0, Lcom/tendcloud/tenddata/ft;->a:Lcom/tendcloud/tenddata/dn;

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_7
    new-instance v3, Lcom/tendcloud/tenddata/do;

    .line 285
    .line 286
    invoke-direct {v3}, Lcom/tendcloud/tenddata/do;-><init>()V

    .line 287
    .line 288
    .line 289
    iget-object v4, p0, Lcom/tendcloud/tenddata/ft;->a:Lcom/tendcloud/tenddata/dn;

    .line 290
    .line 291
    invoke-virtual {v3, v4, v0}, Lcom/tendcloud/tenddata/do;->a(Lcom/tendcloud/tenddata/dn;Lcom/tendcloud/tenddata/dn;)D

    .line 292
    .line 293
    .line 294
    move-result-wide v3

    .line 295
    const-wide v10, 0x3fe999999999999aL    # 0.8

    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    cmpl-double v3, v3, v10

    .line 301
    .line 302
    if-lez v3, :cond_8

    .line 303
    .line 304
    const/4 p1, 0x0

    .line 305
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_8
    invoke-virtual {p0, v8, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    iput-object v0, p0, Lcom/tendcloud/tenddata/ft;->a:Lcom/tendcloud/tenddata/dn;

    .line 313
    .line 314
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    iput-object p1, p0, Lcom/tendcloud/tenddata/ft;->c:Ljava/lang/String;

    .line 323
    .line 324
    :goto_2
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    iget-object v0, v0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 333
    .line 334
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    iget-object v3, v3, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;

    .line 339
    .line 340
    invoke-virtual {p1, v6, v0, v3}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    const-string v0, "configured"

    .line 345
    .line 346
    if-eqz p1, :cond_9

    .line 347
    .line 348
    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 349
    .line 350
    invoke-static {v3}, Lcom/tendcloud/tenddata/ch;->x(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-virtual {p0, v0, v3}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-lez v0, :cond_a

    .line 362
    .line 363
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0, v6, p1}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 368
    .line 369
    .line 370
    goto :goto_3

    .line 371
    :cond_9
    iget-object p1, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 372
    .line 373
    invoke-virtual {p0, v0, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 374
    .line 375
    .line 376
    :cond_a
    :goto_3
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-object v0, v0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 385
    .line 386
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    iget-object v3, v3, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;

    .line 391
    .line 392
    const-string v4, "IP"

    .line 393
    .line 394
    invoke-virtual {p1, v4, v0, v3}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    if-eqz p1, :cond_b

    .line 399
    .line 400
    invoke-static {v9}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {p0, v9, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v5}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {p0, v5, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-lez v0, :cond_d

    .line 419
    .line 420
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0, v4, p1}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 425
    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_b
    iget-object p1, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 429
    .line 430
    invoke-virtual {p0, v9, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 431
    .line 432
    .line 433
    goto :goto_4

    .line 434
    :cond_c
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 435
    .line 436
    invoke-virtual {p0, v6, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    :cond_d
    :goto_4
    invoke-static {}, Lcom/tendcloud/tenddata/ch;->b()Z

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    if-eqz p1, :cond_e

    .line 444
    .line 445
    new-instance p1, Ljava/lang/StringBuilder;

    .line 446
    .line 447
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    invoke-virtual {p0, v2, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_e
    const-string p1, "scannableFingerId"

    .line 475
    .line 476
    iget-object v0, p0, Lcom/tendcloud/tenddata/ft;->c:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {p0, p1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    return-void
.end method

.method private static a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/dn;
    .locals 9

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v2, v0

    .line 10
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Lcom/tendcloud/tenddata/dk;

    .line 21
    .line 22
    const-string v4, "name"

    .line 23
    .line 24
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "id"

    .line 29
    .line 30
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v6, "level"

    .line 35
    .line 36
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    int-to-byte v6, v0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-direct/range {v3 .. v8}, Lcom/tendcloud/tenddata/dk;-><init>(Ljava/lang/String;Ljava/lang/String;BBB)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/dn;

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dn;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/dn;->setBsslist(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_1
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method
