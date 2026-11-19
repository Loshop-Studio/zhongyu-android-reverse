.class Lcom/tencent/liteav/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/e;->a(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/e$a;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/tencent/liteav/e$a;

.field final synthetic e:Lcom/tencent/liteav/e;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/e;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/e$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 2
    .line 3
    iput p2, p0, Lcom/tencent/liteav/e$1;->a:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tencent/liteav/e$1;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/tencent/liteav/e$1;->c:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/tencent/liteav/e$1;->d:Lcom/tencent/liteav/e$a;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const-string v0, "TXCTimeShiftUtil"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v1, v2, v3}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;J)J

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-static {v1, v2}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 20
    .line 21
    iget v3, p0, Lcom/tencent/liteav/e$1;->a:I

    .line 22
    .line 23
    invoke-static {v1, v3}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;I)I

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/tencent/liteav/e$1;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lcom/tencent/liteav/e;->b(Lcom/tencent/liteav/e;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/tencent/liteav/e$1;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getStreamIDByStreamUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v1, v3}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/tencent/liteav/e$1;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v3}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getAppNameByStreamUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v1, v3}, Lcom/tencent/liteav/e;->c(Lcom/tencent/liteav/e;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 56
    .line 57
    invoke-static {v1}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 64
    .line 65
    const-string v3, "live"

    .line 66
    .line 67
    invoke-static {v1, v3}, Lcom/tencent/liteav/e;->c(Lcom/tencent/liteav/e;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 71
    .line 72
    invoke-static {v1}, Lcom/tencent/liteav/e;->b(Lcom/tencent/liteav/e;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-gez v1, :cond_1

    .line 77
    .line 78
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 79
    .line 80
    invoke-static {v1}, Lcom/tencent/liteav/e;->c(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v3, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 85
    .line 86
    invoke-static {v3}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iget-object v4, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 91
    .line 92
    invoke-static {v4}, Lcom/tencent/liteav/e;->d(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    filled-new-array {v1, v3, v4}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v3, "http://%s/timeshift/%s/%s/timeshift.m3u8?delay=0"

    .line 101
    .line 102
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto :goto_0

    .line 107
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 108
    .line 109
    invoke-static {v1}, Lcom/tencent/liteav/e;->c(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v3, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 114
    .line 115
    invoke-static {v3}, Lcom/tencent/liteav/e;->b(Lcom/tencent/liteav/e;)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-object v4, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 124
    .line 125
    invoke-static {v4}, Lcom/tencent/liteav/e;->d(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget-object v5, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 130
    .line 131
    invoke-static {v5}, Lcom/tencent/liteav/e;->e(Lcom/tencent/liteav/e;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    filled-new-array {v1, v3, v4, v5}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v3, "http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0"

    .line 140
    .line 141
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :goto_0
    :try_start_0
    new-instance v3, Ljava/net/URL;

    .line 146
    .line 147
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 155
    .line 156
    const/4 v3, 0x1

    .line 157
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 161
    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 165
    .line 166
    .line 167
    const/16 v3, 0x1388

    .line 168
    .line 169
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 173
    .line 174
    .line 175
    const-string v3, "GET"

    .line 176
    .line 177
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string v3, "Charsert"

    .line 181
    .line 182
    const-string v4, "UTF-8"

    .line 183
    .line 184
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string v3, "Content-Type"

    .line 188
    .line 189
    const-string v4, "text/plain;"

    .line 190
    .line 191
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance v3, Ljava/io/BufferedReader;

    .line 195
    .line 196
    new-instance v4, Ljava/io/InputStreamReader;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-direct {v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 206
    .line 207
    .line 208
    :goto_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-eqz v1, :cond_2

    .line 213
    .line 214
    new-instance v4, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    goto :goto_1

    .line 230
    :catch_0
    move-exception v1

    .line 231
    goto :goto_2

    .line 232
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v3, "prepareSeekTime: receive response, strResponse = "

    .line 238
    .line 239
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    iget-object v1, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 253
    .line 254
    invoke-static {v1, v2}, Lcom/tencent/liteav/e;->d(Lcom/tencent/liteav/e;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    if-eqz v1, :cond_3

    .line 259
    .line 260
    iget-object v2, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 261
    .line 262
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    const-wide/16 v5, 0x3e8

    .line 267
    .line 268
    mul-long/2addr v3, v5

    .line 269
    invoke-static {v2, v3, v4}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :goto_2
    iget-object v2, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 274
    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 276
    .line 277
    .line 278
    move-result-wide v3

    .line 279
    invoke-static {v2, v3, v4}, Lcom/tencent/liteav/e;->a(Lcom/tencent/liteav/e;J)J

    .line 280
    .line 281
    .line 282
    new-instance v2, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const-string v3, "prepareSeekTime error "

    .line 288
    .line 289
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :cond_3
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 307
    .line 308
    .line 309
    move-result-wide v1

    .line 310
    new-instance v3, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .line 314
    .line 315
    const-string v4, "live start time:"

    .line 316
    .line 317
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    iget-object v4, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 321
    .line 322
    invoke-static {v4}, Lcom/tencent/liteav/e;->f(Lcom/tencent/liteav/e;)J

    .line 323
    .line 324
    .line 325
    move-result-wide v4

    .line 326
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v4, ",currentTime:"

    .line 330
    .line 331
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string v4, ",diff:"

    .line 338
    .line 339
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    iget-object v4, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 343
    .line 344
    invoke-static {v4}, Lcom/tencent/liteav/e;->f(Lcom/tencent/liteav/e;)J

    .line 345
    .line 346
    .line 347
    move-result-wide v4

    .line 348
    sub-long v4, v1, v4

    .line 349
    .line 350
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, p0, Lcom/tencent/liteav/e$1;->e:Lcom/tencent/liteav/e;

    .line 361
    .line 362
    invoke-static {v0}, Lcom/tencent/liteav/e;->f(Lcom/tencent/liteav/e;)J

    .line 363
    .line 364
    .line 365
    move-result-wide v3

    .line 366
    sub-long/2addr v1, v3

    .line 367
    iget-object v0, p0, Lcom/tencent/liteav/e$1;->d:Lcom/tencent/liteav/e$a;

    .line 368
    .line 369
    if-eqz v0, :cond_4

    .line 370
    .line 371
    new-instance v0, Landroid/os/Handler;

    .line 372
    .line 373
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 378
    .line 379
    .line 380
    new-instance v3, Lcom/tencent/liteav/e$1$1;

    .line 381
    .line 382
    invoke-direct {v3, p0, v1, v2}, Lcom/tencent/liteav/e$1$1;-><init>(Lcom/tencent/liteav/e$1;J)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 386
    .line 387
    .line 388
    :cond_4
    return-void
.end method
