.class public Lk5/f;
.super Lk5/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final i:Ljava/lang/String; = "f"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILk5/c;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/c;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lk5/a;-><init>(Ljava/lang/String;ILk5/c;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk5/f;->h()Lk5/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()Lk5/d;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException"

    .line 4
    .line 5
    const-string v3, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable"

    .line 6
    .line 7
    sget-object v0, Lk5/f;->i:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "Post call execute"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 21
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    invoke-virtual {v1}, Lk5/a;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    invoke-virtual {v1}, Lk5/a;->a()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    invoke-virtual {v1}, Lk5/a;->e()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    invoke-static {v9, v10, v11}, Lo5/a;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Ljavax/net/ssl/HttpsURLConnection;

    .line 38
    .line 39
    .line 40
    move-result-object v9
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 41
    if-nez v9, :cond_1

    .line 42
    .line 43
    :try_start_2
    const-string v10, "create HttpsURLConnection instance by url return null."

    .line 44
    .line 45
    invoke-static {v0, v10}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    .line 48
    if-eqz v9, :cond_0

    .line 49
    .line 50
    :try_start_3
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    .line 52
    .line 53
    return-object v6

    .line 54
    :catchall_0
    sget-object v0, Lk5/f;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v3}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    sget-object v0, Lk5/f;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    :goto_0
    return-object v6

    .line 66
    :catchall_1
    move-exception v0

    .line 67
    move-object v6, v9

    .line 68
    goto/16 :goto_8

    .line 69
    .line 70
    :catch_1
    move-exception v0

    .line 71
    :goto_1
    move-wide/from16 v19, v7

    .line 72
    .line 73
    move-wide v6, v4

    .line 74
    move-wide/from16 v4, v19

    .line 75
    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_1
    :try_start_4
    const-string v10, "Content-Type"

    .line 79
    .line 80
    const-string v11, "application/json; charset=UTF-8"

    .line 81
    .line 82
    invoke-virtual {v9, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v10, "Connection"

    .line 86
    .line 87
    const-string v11, "close"

    .line 88
    .line 89
    invoke-virtual {v9, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v10, "POST"

    .line 93
    .line 94
    invoke-virtual {v9, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 v10, 0x1

    .line 98
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lk5/a;->b()Lk5/c;

    .line 105
    .line 106
    .line 107
    move-result-object v10
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 108
    const-string v11, ""

    .line 109
    .line 110
    if-eqz v10, :cond_2

    .line 111
    .line 112
    :try_start_5
    invoke-virtual {v1}, Lk5/a;->b()Lk5/c;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-virtual {v10}, Lk5/c;->a()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move-object v10, v11

    .line 122
    :goto_2
    const-string v12, "If-None-Match"

    .line 123
    .line 124
    :try_start_6
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v13
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 128
    if-eqz v13, :cond_3

    .line 129
    .line 130
    const-string v10, "&"

    .line 131
    .line 132
    :cond_3
    :try_start_7
    invoke-virtual {v9, v12, v10}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v9}, Ljava/net/URLConnection;->connect()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lk5/a;->f()Li5/c;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    const-string v12, "services"

    .line 143
    .line 144
    invoke-virtual {v10, v12, v11}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-static {v9, v10}, Lo5/a;->b(Ljavax/net/ssl/HttpsURLConnection;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    new-instance v10, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v11, "httpsURLConnection result code:"

    .line 161
    .line 162
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-static {v0, v10}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 173
    .line 174
    .line 175
    const/16 v0, 0xc8

    .line 176
    .line 177
    if-ne v12, v0, :cond_4

    .line 178
    .line 179
    :try_start_8
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v6}, Lcom/huawei/hms/framework/common/IoUtils;->toByteArray(Ljava/io/InputStream;)[B

    .line 184
    .line 185
    .line 186
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 187
    :try_start_9
    invoke-static {v6}, Lcom/huawei/hms/framework/common/IoUtils;->closeSecure(Ljava/io/InputStream;)V

    .line 188
    .line 189
    .line 190
    move-object v6, v0

    .line 191
    goto :goto_3

    .line 192
    :catchall_2
    move-exception v0

    .line 193
    invoke-static {v6}, Lcom/huawei/hms/framework/common/IoUtils;->closeSecure(Ljava/io/InputStream;)V

    .line 194
    .line 195
    .line 196
    throw v0

    .line 197
    :cond_4
    :goto_3
    invoke-virtual {v9}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 205
    .line 206
    .line 207
    move-result-wide v10

    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v17

    .line 212
    if-nez v6, :cond_5

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    new-array v6, v0, [B

    .line 216
    .line 217
    :cond_5
    move-object v14, v6

    .line 218
    move-wide v15, v10

    .line 219
    new-instance v11, Lk5/d;

    .line 220
    .line 221
    sub-long/2addr v15, v7

    .line 222
    invoke-direct/range {v11 .. v16}, Lk5/d;-><init>(ILjava/util/Map;[BJ)V

    .line 223
    .line 224
    .line 225
    iput-object v11, v1, Lk5/a;->a:Lk5/d;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 226
    .line 227
    :try_start_a
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 228
    .line 229
    .line 230
    :goto_4
    move-wide/from16 v2, v17

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :catchall_3
    move-exception v0

    .line 234
    goto :goto_8

    .line 235
    :catch_2
    move-exception v0

    .line 236
    move-object v9, v6

    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :catch_3
    move-exception v0

    .line 240
    move-object v9, v6

    .line 241
    move-wide v6, v4

    .line 242
    :goto_5
    :try_start_b
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 243
    .line 244
    .line 245
    move-result-wide v10

    .line 246
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 247
    .line 248
    .line 249
    move-result-wide v17

    .line 250
    sget-object v8, Lk5/f;->i:Ljava/lang/String;

    .line 251
    .line 252
    const-string v12, "RequestCallableV2 run task catch IOException"

    .line 253
    .line 254
    invoke-static {v8, v12, v0}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    new-instance v8, Lk5/d;

    .line 258
    .line 259
    sub-long/2addr v10, v4

    .line 260
    invoke-direct {v8, v0, v10, v11}, Lk5/d;-><init>(Ljava/lang/Exception;J)V

    .line 261
    .line 262
    .line 263
    iput-object v8, v1, Lk5/a;->a:Lk5/d;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 264
    .line 265
    if-eqz v9, :cond_6

    .line 266
    .line 267
    :try_start_c
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :catchall_4
    move-wide v4, v6

    .line 272
    :catchall_5
    sget-object v0, Lk5/f;->i:Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v0, v3}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :catch_4
    move-wide v4, v6

    .line 279
    :catch_5
    sget-object v0, Lk5/f;->i:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_6
    :goto_6
    move-wide v4, v6

    .line 286
    goto :goto_4

    .line 287
    :goto_7
    iget-object v0, v1, Lk5/a;->a:Lk5/d;

    .line 288
    .line 289
    invoke-virtual {v1}, Lk5/a;->c()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v0, v6}, Lk5/d;->i(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    iget-object v0, v1, Lk5/a;->a:Lk5/d;

    .line 297
    .line 298
    invoke-virtual {v1}, Lk5/a;->d()I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    invoke-virtual {v0, v6}, Lk5/d;->b(I)V

    .line 303
    .line 304
    .line 305
    iget-object v0, v1, Lk5/a;->a:Lk5/d;

    .line 306
    .line 307
    invoke-virtual {v0, v4, v5}, Lk5/d;->h(J)V

    .line 308
    .line 309
    .line 310
    iget-object v0, v1, Lk5/a;->a:Lk5/d;

    .line 311
    .line 312
    invoke-virtual {v0, v2, v3}, Lk5/d;->c(J)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Lk5/a;->b()Lk5/c;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_7

    .line 320
    .line 321
    invoke-virtual {v1}, Lk5/a;->b()Lk5/c;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iget-object v2, v1, Lk5/a;->a:Lk5/d;

    .line 326
    .line 327
    invoke-virtual {v0, v2}, Lk5/c;->e(Lk5/d;)V

    .line 328
    .line 329
    .line 330
    :cond_7
    iget-object v0, v1, Lk5/a;->a:Lk5/d;

    .line 331
    .line 332
    return-object v0

    .line 333
    :goto_8
    if-eqz v6, :cond_8

    .line 334
    .line 335
    :try_start_d
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :catchall_6
    sget-object v2, Lk5/f;->i:Ljava/lang/String;

    .line 340
    .line 341
    invoke-static {v2, v3}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :catch_6
    sget-object v3, Lk5/f;->i:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v3, v2}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_8
    :goto_9
    throw v0
.end method
