.class public Lcom/tendcloud/tenddata/fo;
.super Lcom/tendcloud/tenddata/fk;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fk;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/tendcloud/tenddata/cc;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "tid"

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()V
    .locals 14

    .line 1
    const-string v0, "meid5"

    .line 2
    .line 3
    const-string v1, "meid"

    .line 4
    .line 5
    const-string v2, "imei5"

    .line 6
    .line 7
    const-string v3, "imei"

    .line 8
    .line 9
    const-string v4, "serialNo"

    .line 10
    .line 11
    invoke-static {v4}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p0, v4, v5}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-string v5, "AdID"

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v6, "adId"

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    sget-object v7, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v7}, Lcom/tendcloud/tenddata/ce;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {p0, v6, v7}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-lez v6, :cond_1

    .line 46
    .line 47
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v6, v5, v4}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v4, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-virtual {p0, v6, v4}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    iget-object v5, v5, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 69
    .line 70
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    iget-object v6, v6, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;

    .line 75
    .line 76
    const-string v7, "IMEI"

    .line 77
    .line 78
    invoke-virtual {v4, v7, v5, v6}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v5, "imeis"

    .line 83
    .line 84
    if-eqz v4, :cond_a

    .line 85
    .line 86
    :try_start_0
    sget-object v6, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 87
    .line 88
    invoke-static {v6}, Lcom/tendcloud/tenddata/ch;->A(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    new-instance v8, Lorg/json/JSONArray;

    .line 93
    .line 94
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v9, Lorg/json/JSONArray;

    .line 98
    .line 99
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v10, Lorg/json/JSONArray;

    .line 103
    .line 104
    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v11, Lorg/json/JSONArray;

    .line 108
    .line 109
    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 110
    .line 111
    .line 112
    if-eqz v6, :cond_9

    .line 113
    .line 114
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-lez v12, :cond_9

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    invoke-virtual {v6, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    if-eqz v13, :cond_2

    .line 130
    .line 131
    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    invoke-virtual {v8, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    if-eqz v13, :cond_3

    .line 143
    .line 144
    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    invoke-virtual {v9, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 149
    .line 150
    .line 151
    :cond_3
    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_4

    .line 156
    .line 157
    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 162
    .line 163
    .line 164
    :cond_4
    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    if-eqz v13, :cond_5

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    invoke-virtual {v11, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 175
    .line 176
    .line 177
    :cond_5
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    const/4 v13, 0x2

    .line 182
    if-ne v12, v13, :cond_9

    .line 183
    .line 184
    const/4 v12, 0x1

    .line 185
    invoke-virtual {v6, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_6

    .line 194
    .line 195
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v8, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 200
    .line 201
    .line 202
    :cond_6
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_7

    .line 207
    .line 208
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v9, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 213
    .line 214
    .line 215
    :cond_7
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_8

    .line 220
    .line 221
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v10, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 226
    .line 227
    .line 228
    :cond_8
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_9

    .line 233
    .line 234
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v11, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 239
    .line 240
    .line 241
    :cond_9
    invoke-virtual {p0, v5, v8}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const-string v0, "imeis5"

    .line 245
    .line 246
    invoke-virtual {p0, v0, v9}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    const-string v0, "meids"

    .line 250
    .line 251
    invoke-virtual {p0, v0, v10}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const-string v0, "meids5"

    .line 255
    .line 256
    invoke-virtual {p0, v0, v11}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    .line 258
    .line 259
    :catch_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-lez v0, :cond_b

    .line 264
    .line 265
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0, v7, v4}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 270
    .line 271
    .line 272
    goto :goto_1

    .line 273
    :cond_a
    iget-object v0, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 274
    .line 275
    invoke-virtual {p0, v5, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 276
    .line 277
    .line 278
    :cond_b
    :goto_1
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const-string v1, "MacAddress"

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v2, "wifiMacs"

    .line 289
    .line 290
    if-eqz v0, :cond_c

    .line 291
    .line 292
    new-instance v3, Lorg/json/JSONArray;

    .line 293
    .line 294
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 295
    .line 296
    .line 297
    const-string v4, "mac"

    .line 298
    .line 299
    invoke-static {v4}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, v2, v3}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    new-instance v2, Lorg/json/JSONArray;

    .line 310
    .line 311
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v3, "ethMac"

    .line 315
    .line 316
    invoke-static {v3}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 321
    .line 322
    .line 323
    const-string v3, "ethMacs"

    .line 324
    .line 325
    invoke-virtual {p0, v3, v2}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-lez v2, :cond_d

    .line 333
    .line 334
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-virtual {v2, v1, v0}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_c
    iget-object v0, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 343
    .line 344
    invoke-virtual {p0, v2, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 345
    .line 346
    .line 347
    :cond_d
    :goto_2
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    const-string v1, "AndroidId"

    .line 352
    .line 353
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    const-string v2, "androidId"

    .line 358
    .line 359
    if-eqz v0, :cond_e

    .line 360
    .line 361
    invoke-static {v2}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {p0, v2, v3}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-lez v2, :cond_f

    .line 373
    .line 374
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v2, v1, v0}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 379
    .line 380
    .line 381
    goto :goto_3

    .line 382
    :cond_e
    iget-object v0, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 383
    .line 384
    invoke-virtual {p0, v2, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 385
    .line 386
    .line 387
    :cond_f
    :goto_3
    invoke-static {}, Lcom/tendcloud/tenddata/fr;->a()Lcom/tendcloud/tenddata/fr;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    const-string v1, "msaIds"

    .line 396
    .line 397
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    return-void
.end method
