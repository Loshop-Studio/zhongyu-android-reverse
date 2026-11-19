.class public Lcom/tencent/liteav/basic/license/c;
.super Lcom/tencent/liteav/basic/license/a;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/tencent/liteav/basic/license/b;

.field private g:J

.field private h:J

.field private i:Z

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/basic/license/b;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/basic/license/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tencent/liteav/basic/license/c;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tencent/liteav/basic/license/c;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tencent/liteav/basic/license/c;->d:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/tencent/liteav/basic/license/c;->e:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/tencent/liteav/basic/license/c;->i:Z

    .line 15
    .line 16
    iput-object p7, p0, Lcom/tencent/liteav/basic/license/c;->j:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method private a(Ljava/lang/Exception;I)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p2, v0, p1}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v0, p0, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/c;->a(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->c:Ljava/lang/String;

    .line 38
    .line 39
    const-string v4, "http"

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    :cond_0
    move-object v10, v3

    .line 48
    goto/16 :goto_12

    .line 49
    .line 50
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 51
    .line 52
    iget-object v4, v1, Lcom/tencent/liteav/basic/license/c;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    iget-object v4, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    invoke-interface {v4, v0, v3}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/Exception;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    :goto_0
    new-instance v4, Ljava/io/File;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    iget-object v5, v1, Lcom/tencent/liteav/basic/license/c;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v5, v1, Lcom/tencent/liteav/basic/license/c;->e:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object v5, v3

    .line 122
    move-object v10, v5

    .line 123
    goto/16 :goto_f

    .line 124
    .line 125
    :catch_0
    move-exception v0

    .line 126
    move-object v5, v3

    .line 127
    move-object v8, v5

    .line 128
    :goto_1
    move-object v12, v8

    .line 129
    goto/16 :goto_10

    .line 130
    .line 131
    :cond_4
    :goto_2
    :try_start_2
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    .line 132
    .line 133
    .line 134
    new-instance v0, Ljava/net/URL;

    .line 135
    .line 136
    iget-object v5, v1, Lcom/tencent/liteav/basic/license/c;->c:Ljava/lang/String;

    .line 137
    .line 138
    invoke-direct {v0, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    move-object v5, v0

    .line 146
    check-cast v5, Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 147
    .line 148
    :try_start_3
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->j:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 154
    if-nez v0, :cond_5

    .line 155
    .line 156
    :try_start_4
    const-string v0, "If-Modified-Since"

    .line 157
    .line 158
    iget-object v6, v1, Lcom/tencent/liteav/basic/license/c;->j:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v5, v0, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catchall_1
    move-exception v0

    .line 165
    move-object v10, v3

    .line 166
    goto/16 :goto_f

    .line 167
    .line 168
    :catch_1
    move-exception v0

    .line 169
    move-object v8, v3

    .line 170
    goto :goto_1

    .line 171
    :cond_5
    :goto_3
    const/16 v0, 0x7530

    .line 172
    .line 173
    :try_start_5
    invoke-virtual {v5, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 177
    .line 178
    .line 179
    const/4 v0, 0x1

    .line 180
    invoke-virtual {v5, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 181
    .line 182
    .line 183
    const-string v6, "GET"

    .line 184
    .line 185
    invoke-virtual {v5, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 193
    .line 194
    .line 195
    move-result v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 196
    const/16 v8, 0xc8

    .line 197
    .line 198
    if-ne v7, v8, :cond_6

    .line 199
    .line 200
    move v7, v0

    .line 201
    goto :goto_4

    .line 202
    :cond_6
    move v7, v2

    .line 203
    :goto_4
    const/16 v0, 0x64

    .line 204
    .line 205
    if-eqz v7, :cond_f

    .line 206
    .line 207
    :try_start_6
    const-string v6, "Last-Modified"

    .line 208
    .line 209
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    iput-object v6, v1, Lcom/tencent/liteav/basic/license/c;->j:Ljava/lang/String;

    .line 214
    .line 215
    iget-boolean v8, v1, Lcom/tencent/liteav/basic/license/c;->i:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 216
    .line 217
    const-wide/16 v9, 0x0

    .line 218
    .line 219
    if-eqz v8, :cond_a

    .line 220
    .line 221
    :try_start_7
    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentLength()I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    int-to-long v11, v8

    .line 226
    iput-wide v11, v1, Lcom/tencent/liteav/basic/license/c;->g:J

    .line 227
    .line 228
    cmp-long v8, v11, v9

    .line 229
    .line 230
    if-gtz v8, :cond_8

    .line 231
    .line 232
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 233
    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    invoke-interface {v0, v4, v3}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/Exception;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :catch_2
    move-exception v0

    .line 241
    move-object v8, v3

    .line 242
    move-object v12, v8

    .line 243
    :goto_5
    move v2, v7

    .line 244
    goto/16 :goto_10

    .line 245
    .line 246
    :cond_7
    :goto_6
    :try_start_8
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 247
    .line 248
    .line 249
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 250
    .line 251
    if-eqz v0, :cond_1e

    .line 252
    .line 253
    :goto_7
    invoke-interface {v0}, Lcom/tencent/liteav/basic/license/b;->a()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_b

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_8
    :try_start_9
    invoke-static {v11, v12}, Lcom/tencent/liteav/basic/util/c;->a(J)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-nez v8, :cond_a

    .line 262
    .line 263
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 264
    .line 265
    if-eqz v0, :cond_9

    .line 266
    .line 267
    invoke-interface {v0, v4, v3}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/Exception;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 268
    .line 269
    .line 270
    :cond_9
    :try_start_a
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 271
    .line 272
    .line 273
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_b

    .line 274
    .line 275
    if-eqz v0, :cond_1e

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_a
    :try_start_b
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 279
    .line 280
    .line 281
    move-result-object v8
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 282
    const/16 v11, 0x2000

    .line 283
    .line 284
    :try_start_c
    new-array v11, v11, [B

    .line 285
    .line 286
    new-instance v12, Ljava/io/FileOutputStream;

    .line 287
    .line 288
    invoke-direct {v12, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 289
    .line 290
    .line 291
    :try_start_d
    iput-wide v9, v1, Lcom/tencent/liteav/basic/license/c;->h:J

    .line 292
    .line 293
    :cond_b
    :goto_8
    invoke-virtual {v8, v11}, Ljava/io/InputStream;->read([B)I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    const/4 v10, -0x1

    .line 298
    if-eq v9, v10, :cond_d

    .line 299
    .line 300
    invoke-virtual {v12, v11, v2, v9}, Ljava/io/FileOutputStream;->write([BII)V

    .line 301
    .line 302
    .line 303
    iget-boolean v10, v1, Lcom/tencent/liteav/basic/license/c;->i:Z

    .line 304
    .line 305
    if-eqz v10, :cond_b

    .line 306
    .line 307
    iget-wide v13, v1, Lcom/tencent/liteav/basic/license/c;->h:J

    .line 308
    .line 309
    const-wide/16 v15, 0x64

    .line 310
    .line 311
    mul-long v17, v13, v15

    .line 312
    .line 313
    iget-wide v2, v1, Lcom/tencent/liteav/basic/license/c;->g:J

    .line 314
    .line 315
    move-object/from16 v19, v11

    .line 316
    .line 317
    div-long v10, v17, v2

    .line 318
    .line 319
    long-to-int v10, v10

    .line 320
    move-wide/from16 v17, v2

    .line 321
    .line 322
    int-to-long v2, v9

    .line 323
    add-long/2addr v13, v2

    .line 324
    iput-wide v13, v1, Lcom/tencent/liteav/basic/license/c;->h:J

    .line 325
    .line 326
    mul-long/2addr v13, v15

    .line 327
    div-long v13, v13, v17

    .line 328
    .line 329
    long-to-int v2, v13

    .line 330
    if-eq v10, v2, :cond_c

    .line 331
    .line 332
    iget-object v3, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 333
    .line 334
    if-eqz v3, :cond_c

    .line 335
    .line 336
    invoke-interface {v3, v2}, Lcom/tencent/liteav/basic/license/b;->a(I)V

    .line 337
    .line 338
    .line 339
    goto :goto_9

    .line 340
    :catchall_2
    move-exception v0

    .line 341
    move-object v10, v8

    .line 342
    move-object v3, v12

    .line 343
    goto/16 :goto_f

    .line 344
    .line 345
    :catch_3
    move-exception v0

    .line 346
    goto :goto_5

    .line 347
    :cond_c
    :goto_9
    move-object/from16 v11, v19

    .line 348
    .line 349
    const/4 v2, 0x0

    .line 350
    const/4 v3, 0x0

    .line 351
    goto :goto_8

    .line 352
    :cond_d
    invoke-virtual {v12}, Ljava/io/OutputStream;->flush()V

    .line 353
    .line 354
    .line 355
    iget-object v2, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 356
    .line 357
    if-eqz v2, :cond_e

    .line 358
    .line 359
    invoke-interface {v2, v0}, Lcom/tencent/liteav/basic/license/b;->a(I)V

    .line 360
    .line 361
    .line 362
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 363
    .line 364
    invoke-interface {v0, v4, v6}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 365
    .line 366
    .line 367
    :cond_e
    :goto_a
    const/16 v20, 0x0

    .line 368
    .line 369
    goto :goto_e

    .line 370
    :catchall_3
    move-exception v0

    .line 371
    move-object v10, v8

    .line 372
    const/4 v3, 0x0

    .line 373
    goto :goto_f

    .line 374
    :catch_4
    move-exception v0

    .line 375
    move v2, v7

    .line 376
    :goto_b
    const/4 v12, 0x0

    .line 377
    goto/16 :goto_10

    .line 378
    .line 379
    :catchall_4
    move-exception v0

    .line 380
    const/4 v3, 0x0

    .line 381
    :goto_c
    const/4 v10, 0x0

    .line 382
    goto :goto_f

    .line 383
    :catch_5
    move-exception v0

    .line 384
    move v2, v7

    .line 385
    :goto_d
    const/4 v8, 0x0

    .line 386
    goto :goto_b

    .line 387
    :cond_f
    const/16 v2, 0x130

    .line 388
    .line 389
    if-ne v6, v2, :cond_11

    .line 390
    .line 391
    :try_start_e
    iget-object v2, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 392
    .line 393
    if-eqz v2, :cond_10

    .line 394
    .line 395
    invoke-interface {v2, v0}, Lcom/tencent/liteav/basic/license/b;->a(I)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 399
    .line 400
    iget-object v2, v1, Lcom/tencent/liteav/basic/license/c;->j:Ljava/lang/String;

    .line 401
    .line 402
    const/4 v10, 0x0

    .line 403
    invoke-interface {v0, v10, v2}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    :cond_10
    const/4 v8, 0x0

    .line 407
    const/4 v12, 0x0

    .line 408
    goto :goto_a

    .line 409
    :cond_11
    new-instance v0, Lcom/tencent/liteav/basic/license/d;

    .line 410
    .line 411
    new-instance v2, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    const-string v3, "http status got exception. code = "

    .line 417
    .line 418
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-direct {v0, v2}, Lcom/tencent/liteav/basic/license/d;-><init>(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 429
    .line 430
    .line 431
    move-object/from16 v20, v0

    .line 432
    .line 433
    const/4 v8, 0x0

    .line 434
    const/4 v12, 0x0

    .line 435
    :goto_e
    if-eqz v12, :cond_12

    .line 436
    .line 437
    :try_start_f
    invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V

    .line 438
    .line 439
    .line 440
    :cond_12
    if-eqz v8, :cond_13

    .line 441
    .line 442
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 443
    .line 444
    .line 445
    :cond_13
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 446
    .line 447
    .line 448
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 449
    .line 450
    if-eqz v0, :cond_1c

    .line 451
    .line 452
    invoke-interface {v0}, Lcom/tencent/liteav/basic/license/b;->a()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 453
    .line 454
    .line 455
    goto :goto_11

    .line 456
    :catch_6
    move-exception v0

    .line 457
    const/4 v2, 0x0

    .line 458
    goto :goto_d

    .line 459
    :catchall_5
    move-exception v0

    .line 460
    const/4 v3, 0x0

    .line 461
    const/4 v5, 0x0

    .line 462
    goto :goto_c

    .line 463
    :catch_7
    move-exception v0

    .line 464
    const/4 v2, 0x0

    .line 465
    const/4 v5, 0x0

    .line 466
    goto :goto_d

    .line 467
    :goto_f
    if-eqz v3, :cond_14

    .line 468
    .line 469
    :try_start_10
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 470
    .line 471
    .line 472
    :cond_14
    if-eqz v10, :cond_15

    .line 473
    .line 474
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 475
    .line 476
    .line 477
    :cond_15
    if-eqz v5, :cond_16

    .line 478
    .line 479
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 480
    .line 481
    .line 482
    :cond_16
    iget-object v2, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 483
    .line 484
    if-eqz v2, :cond_17

    .line 485
    .line 486
    invoke-interface {v2}, Lcom/tencent/liteav/basic/license/b;->a()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    .line 487
    .line 488
    .line 489
    :catch_8
    :cond_17
    throw v0

    .line 490
    :goto_10
    if-eqz v12, :cond_18

    .line 491
    .line 492
    :try_start_11
    invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V

    .line 493
    .line 494
    .line 495
    :cond_18
    if-eqz v8, :cond_19

    .line 496
    .line 497
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 498
    .line 499
    .line 500
    :cond_19
    if-eqz v5, :cond_1a

    .line 501
    .line 502
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 503
    .line 504
    .line 505
    :cond_1a
    iget-object v3, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 506
    .line 507
    if-eqz v3, :cond_1b

    .line 508
    .line 509
    invoke-interface {v3}, Lcom/tencent/liteav/basic/license/b;->a()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9

    .line 510
    .line 511
    .line 512
    :catch_9
    :cond_1b
    move-object/from16 v20, v0

    .line 513
    .line 514
    move v7, v2

    .line 515
    :catch_a
    :cond_1c
    :goto_11
    if-eqz v7, :cond_1d

    .line 516
    .line 517
    if-eqz v20, :cond_1e

    .line 518
    .line 519
    :cond_1d
    iget-object v0, v1, Lcom/tencent/liteav/basic/license/c;->f:Lcom/tencent/liteav/basic/license/b;

    .line 520
    .line 521
    if-eqz v0, :cond_1e

    .line 522
    .line 523
    const/4 v10, 0x0

    .line 524
    invoke-interface {v0, v4, v10}, Lcom/tencent/liteav/basic/license/b;->a(Ljava/io/File;Ljava/lang/Exception;)V

    .line 525
    .line 526
    .line 527
    :catch_b
    :cond_1e
    return-void

    .line 528
    :goto_12
    invoke-direct {v1, v10, v2}, Lcom/tencent/liteav/basic/license/c;->a(Ljava/lang/Exception;I)V

    .line 529
    .line 530
    .line 531
    return-void
.end method
