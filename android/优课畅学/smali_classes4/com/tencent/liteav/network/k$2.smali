.class Lcom/tencent/liteav/network/k$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/network/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I

.field final synthetic f:Lcom/tencent/liteav/network/k$a;

.field final synthetic g:Lcom/tencent/liteav/network/k;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/network/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/tencent/liteav/network/k$2;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/tencent/liteav/network/k$2;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/tencent/liteav/network/k$2;->c:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/tencent/liteav/network/k$2;->d:Ljava/lang/String;

    .line 10
    .line 11
    iput p7, p0, Lcom/tencent/liteav/network/k$2;->e:I

    .line 12
    .line 13
    iput-object p8, p0, Lcom/tencent/liteav/network/k$2;->f:Lcom/tencent/liteav/network/k$a;

    .line 14
    .line 15
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "pull_addr"

    .line 4
    .line 5
    const-string v3, "message"

    .line 6
    .line 7
    const-string v4, "code"

    .line 8
    .line 9
    const-string v5, "TXRTMPAccUrlFetcher"

    .line 10
    .line 11
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    move v7, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v7, v6

    .line 35
    :goto_0
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 36
    .line 37
    iget-object v8, v1, Lcom/tencent/liteav/network/k$2;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v9, v1, Lcom/tencent/liteav/network/k$2;->b:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v10, v1, Lcom/tencent/liteav/network/k$2;->c:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    invoke-static {v0, v11, v8, v9, v10}, Lcom/tencent/liteav/network/k;->a(Lcom/tencent/liteav/network/k;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 51
    .line 52
    invoke-static {v0}, Lcom/tencent/liteav/network/k;->a(Lcom/tencent/liteav/network/k;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    long-to-int v0, v9

    .line 57
    if-gtz v0, :cond_1

    .line 58
    .line 59
    move v0, v11

    .line 60
    move v9, v0

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    :goto_1
    const/4 v9, 0x2

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/4 v0, 0x5

    .line 65
    goto :goto_1

    .line 66
    :goto_2
    add-int/2addr v0, v9

    .line 67
    const/4 v10, -0x1

    .line 68
    const-string v12, ""

    .line 69
    .line 70
    move v13, v10

    .line 71
    move-object v14, v12

    .line 72
    move v10, v0

    .line 73
    :goto_3
    if-lt v10, v11, :cond_15

    .line 74
    .line 75
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 76
    .line 77
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v15, "bizid"

    .line 81
    .line 82
    invoke-virtual {v0, v15, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    const-string v15, "stream_id"

    .line 86
    .line 87
    iget-object v8, v1, Lcom/tencent/liteav/network/k$2;->d:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    const-string v8, "txSecret"

    .line 93
    .line 94
    iget-object v15, v1, Lcom/tencent/liteav/network/k$2;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v8, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    const-string v8, "txTime"

    .line 100
    .line 101
    iget-object v15, v1, Lcom/tencent/liteav/network/k$2;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v8, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    const-string v8, "type"

    .line 107
    .line 108
    invoke-virtual {v0, v8, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-le v10, v9, :cond_3

    .line 116
    .line 117
    const-string v8, "https://livepull.myqcloud.com/getpulladdr"

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :catch_0
    move-exception v0

    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    move-object/from16 v18, v3

    .line 124
    .line 125
    :goto_4
    const/4 v2, 0x2

    .line 126
    goto/16 :goto_11

    .line 127
    .line 128
    :cond_3
    const-string v8, "https://livepullipv6.myqcloud.com/getpulladdr"

    .line 129
    .line 130
    :goto_5
    new-instance v15, Ljava/net/URL;

    .line 131
    .line 132
    invoke-direct {v15, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v15}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    check-cast v8, Ljavax/net/ssl/HttpsURLConnection;

    .line 140
    .line 141
    invoke-virtual {v8, v11}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, v11}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8, v6}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 148
    .line 149
    .line 150
    const/16 v15, 0x1388

    .line 151
    .line 152
    invoke-virtual {v8, v15}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8, v15}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 156
    .line 157
    .line 158
    const-string v15, "POST"

    .line 159
    .line 160
    invoke-virtual {v8, v15}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string v15, "Charsert"

    .line 164
    .line 165
    const-string v6, "UTF-8"

    .line 166
    .line 167
    invoke-virtual {v8, v15, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v6, "Content-Type"

    .line 171
    .line 172
    const-string v15, "text/plain;"

    .line 173
    .line 174
    invoke-virtual {v8, v6, v15}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string v6, "Content-Length"

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v15

    .line 187
    invoke-virtual {v8, v6, v15}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v6, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v15, "getAccelerateStreamPlayUrl: sendHttpRequest[ "

    .line 196
    .line 197
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v15, "] retryIndex = "

    .line 204
    .line 205
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    new-instance v6, Ljava/io/DataOutputStream;

    .line 219
    .line 220
    invoke-virtual {v8}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    invoke-direct {v6, v15}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v6, v0}, Ljava/io/OutputStream;->write([B)V

    .line 232
    .line 233
    .line 234
    new-instance v0, Ljava/io/BufferedReader;

    .line 235
    .line 236
    new-instance v6, Ljava/io/InputStreamReader;

    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-direct {v6, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 243
    .line 244
    .line 245
    invoke-direct {v0, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 246
    .line 247
    .line 248
    move-object v6, v12

    .line 249
    :goto_6
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    if-eqz v8, :cond_4

    .line 254
    .line 255
    new-instance v15, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    goto :goto_6

    .line 271
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string v8, "getAccelerateStreamPlayUrl: receive response, strResponse = "

    .line 277
    .line 278
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v5, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v0, Lorg/json/JSONTokener;

    .line 292
    .line 293
    invoke-direct {v0, v6}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, Lorg/json/JSONObject;

    .line 301
    .line 302
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    if-eqz v6, :cond_5

    .line 307
    .line 308
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    :cond_5
    if-eqz v13, :cond_7

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    if-eqz v6, :cond_6

    .line 319
    .line 320
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    :cond_6
    new-instance v6, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const-string v8, "getAccelerateStreamPlayUrl: errorCode = "

    .line 330
    .line 331
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string v8, " errorMessage = "

    .line 338
    .line 339
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_7
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-eqz v6, :cond_13

    .line 357
    .line 358
    new-instance v6, Ljava/util/Vector;

    .line 359
    .line 360
    invoke-direct {v6}, Ljava/util/Vector;-><init>()V

    .line 361
    .line 362
    .line 363
    new-instance v8, Ljava/util/Vector;

    .line 364
    .line 365
    invoke-direct {v8}, Ljava/util/Vector;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 369
    .line 370
    .line 371
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    if-eqz v0, :cond_8

    .line 373
    .line 374
    :try_start_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 375
    .line 376
    .line 377
    move-result v15

    .line 378
    if-nez v15, :cond_9

    .line 379
    .line 380
    :cond_8
    move-object/from16 v17, v2

    .line 381
    .line 382
    move-object/from16 v18, v3

    .line 383
    .line 384
    goto/16 :goto_c

    .line 385
    .line 386
    :cond_9
    const/4 v15, 0x0

    .line 387
    :goto_7
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    if-ge v15, v11, :cond_e

    .line 392
    .line 393
    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    check-cast v11, Lorg/json/JSONObject;

    .line 398
    .line 399
    if-eqz v11, :cond_c

    .line 400
    .line 401
    move-object/from16 v16, v0

    .line 402
    .line 403
    const-string v0, "rtmp_url"

    .line 404
    .line 405
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 409
    move-object/from16 v17, v2

    .line 410
    .line 411
    :try_start_2
    const-string v2, "proto"

    .line 412
    .line 413
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    const/4 v11, 0x1

    .line 418
    if-ne v2, v11, :cond_a

    .line 419
    .line 420
    const/4 v11, 0x1

    .line 421
    goto :goto_8

    .line 422
    :cond_a
    const/4 v11, 0x0

    .line 423
    :goto_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 424
    .line 425
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 426
    .line 427
    .line 428
    move-object/from16 v18, v3

    .line 429
    .line 430
    :try_start_3
    const-string v3, "getAccelerateStreamPlayUrl: streamUrl = "

    .line 431
    .line 432
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    const-string v3, " Q channel = "

    .line 439
    .line 440
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-static {v5, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getStreamIDByStreamUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    if-eqz v2, :cond_d

    .line 458
    .line 459
    iget-object v3, v1, Lcom/tencent/liteav/network/k$2;->d:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-eqz v2, :cond_d

    .line 466
    .line 467
    if-eqz v11, :cond_b

    .line 468
    .line 469
    new-instance v2, Lcom/tencent/liteav/network/e;

    .line 470
    .line 471
    invoke-direct {v2, v0, v11}, Lcom/tencent/liteav/network/e;-><init>(Ljava/lang/String;Z)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v6, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto :goto_b

    .line 478
    :catch_1
    move-exception v0

    .line 479
    :goto_9
    const/4 v2, 0x2

    .line 480
    const/4 v11, 0x1

    .line 481
    goto/16 :goto_11

    .line 482
    .line 483
    :cond_b
    new-instance v2, Lcom/tencent/liteav/network/e;

    .line 484
    .line 485
    invoke-direct {v2, v0, v11}, Lcom/tencent/liteav/network/e;-><init>(Ljava/lang/String;Z)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v8, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    goto :goto_b

    .line 492
    :catch_2
    move-exception v0

    .line 493
    :goto_a
    move-object/from16 v18, v3

    .line 494
    .line 495
    goto :goto_9

    .line 496
    :catch_3
    move-exception v0

    .line 497
    move-object/from16 v17, v2

    .line 498
    .line 499
    goto :goto_a

    .line 500
    :cond_c
    move-object/from16 v16, v0

    .line 501
    .line 502
    move-object/from16 v17, v2

    .line 503
    .line 504
    move-object/from16 v18, v3

    .line 505
    .line 506
    :cond_d
    :goto_b
    add-int/lit8 v15, v15, 0x1

    .line 507
    .line 508
    move-object/from16 v0, v16

    .line 509
    .line 510
    move-object/from16 v2, v17

    .line 511
    .line 512
    move-object/from16 v3, v18

    .line 513
    .line 514
    goto :goto_7

    .line 515
    :cond_e
    move-object/from16 v17, v2

    .line 516
    .line 517
    move-object/from16 v18, v3

    .line 518
    .line 519
    goto :goto_d

    .line 520
    :goto_c
    const-string v0, "getAccelerateStreamPlayUrl: no pull_addr"

    .line 521
    .line 522
    invoke-static {v5, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    :goto_d
    iget v0, v1, Lcom/tencent/liteav/network/k$2;->e:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 526
    .line 527
    const/4 v11, 0x1

    .line 528
    if-ne v0, v11, :cond_10

    .line 529
    .line 530
    :try_start_4
    invoke-virtual {v8}, Ljava/util/Vector;->size()I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    if-lez v0, :cond_f

    .line 535
    .line 536
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 537
    .line 538
    invoke-static {v0}, Lcom/tencent/liteav/network/k;->b(Lcom/tencent/liteav/network/k;)Landroid/os/Handler;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    new-instance v2, Lcom/tencent/liteav/network/k$2$1;

    .line 543
    .line 544
    invoke-direct {v2, v1, v8}, Lcom/tencent/liteav/network/k$2$1;-><init>(Lcom/tencent/liteav/network/k$2;Ljava/util/Vector;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 548
    .line 549
    .line 550
    goto :goto_10

    .line 551
    :catch_4
    move-exception v0

    .line 552
    goto/16 :goto_4

    .line 553
    .line 554
    :cond_f
    :goto_e
    const/4 v2, 0x2

    .line 555
    goto :goto_12

    .line 556
    :cond_10
    const/4 v2, 0x2

    .line 557
    if-ne v0, v2, :cond_11

    .line 558
    .line 559
    :try_start_5
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-lez v0, :cond_14

    .line 564
    .line 565
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 566
    .line 567
    invoke-static {v0}, Lcom/tencent/liteav/network/k;->b(Lcom/tencent/liteav/network/k;)Landroid/os/Handler;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    new-instance v3, Lcom/tencent/liteav/network/k$2$2;

    .line 572
    .line 573
    invoke-direct {v3, v1, v6}, Lcom/tencent/liteav/network/k$2$2;-><init>(Lcom/tencent/liteav/network/k$2;Ljava/util/Vector;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 577
    .line 578
    .line 579
    goto :goto_10

    .line 580
    :catch_5
    move-exception v0

    .line 581
    goto :goto_11

    .line 582
    :cond_11
    invoke-virtual {v8}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-eqz v3, :cond_12

    .line 591
    .line 592
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    check-cast v3, Lcom/tencent/liteav/network/e;

    .line 597
    .line 598
    invoke-virtual {v6, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    goto :goto_f

    .line 602
    :cond_12
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-lez v0, :cond_14

    .line 607
    .line 608
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 609
    .line 610
    invoke-static {v0}, Lcom/tencent/liteav/network/k;->b(Lcom/tencent/liteav/network/k;)Landroid/os/Handler;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    new-instance v3, Lcom/tencent/liteav/network/k$2$3;

    .line 615
    .line 616
    invoke-direct {v3, v1, v6}, Lcom/tencent/liteav/network/k$2$3;-><init>(Lcom/tencent/liteav/network/k$2;Ljava/util/Vector;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 620
    .line 621
    .line 622
    :goto_10
    return-void

    .line 623
    :cond_13
    move-object/from16 v17, v2

    .line 624
    .line 625
    move-object/from16 v18, v3

    .line 626
    .line 627
    goto :goto_e

    .line 628
    :goto_11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    const-string v6, "getAccelerateStreamPlayUrl exception:"

    .line 634
    .line 635
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-static {v5, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    :cond_14
    :goto_12
    const-wide/16 v2, 0x3e8

    .line 653
    .line 654
    const/4 v6, 0x0

    .line 655
    :try_start_6
    invoke-static {v2, v3, v6}, Ljava/lang/Thread;->sleep(JI)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 656
    .line 657
    .line 658
    goto :goto_13

    .line 659
    :catch_6
    const-string v0, "getAccelerateStreamPlayUrl exception sleep"

    .line 660
    .line 661
    invoke-static {v5, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    :goto_13
    add-int/lit8 v10, v10, -0x1

    .line 665
    .line 666
    move-object/from16 v2, v17

    .line 667
    .line 668
    move-object/from16 v3, v18

    .line 669
    .line 670
    goto/16 :goto_3

    .line 671
    .line 672
    :cond_15
    iget-object v0, v1, Lcom/tencent/liteav/network/k$2;->g:Lcom/tencent/liteav/network/k;

    .line 673
    .line 674
    invoke-static {v0}, Lcom/tencent/liteav/network/k;->b(Lcom/tencent/liteav/network/k;)Landroid/os/Handler;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    new-instance v2, Lcom/tencent/liteav/network/k$2$4;

    .line 679
    .line 680
    invoke-direct {v2, v1, v13, v14}, Lcom/tencent/liteav/network/k$2$4;-><init>(Lcom/tencent/liteav/network/k$2;ILjava/lang/String;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 684
    .line 685
    .line 686
    return-void
.end method
