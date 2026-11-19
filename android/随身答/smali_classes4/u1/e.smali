.class public Lu1/e;
.super Lq1/b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final j:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final b:Lcom/liulishuo/okdownload/a;

.field public final c:Z

.field public final d:Ljava/util/ArrayList;

.field public volatile e:Lu1/d;

.field public volatile f:Z

.field public volatile g:Z

.field public volatile h:Ljava/lang/Thread;

.field public final i:Lr1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    .line 6
    .line 7
    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "OkDownload Block"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v1, v2}, Lq1/c;->y(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    const/4 v1, 0x0

    .line 18
    const v2, 0x7fffffff

    .line 19
    .line 20
    .line 21
    const-wide/16 v3, 0x3c

    .line 22
    .line 23
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lu1/e;->j:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/liulishuo/okdownload/a;ZLjava/util/ArrayList;Lr1/i;)V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download call: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lq1/b;-><init>(Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 4
    iput-boolean p2, p0, Lu1/e;->c:Z

    .line 5
    iput-object p3, p0, Lu1/e;->d:Ljava/util/ArrayList;

    .line 6
    iput-object p4, p0, Lu1/e;->i:Lr1/i;

    return-void
.end method

.method public constructor <init>(Lcom/liulishuo/okdownload/a;ZLr1/i;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, p2, v0, p3}, Lu1/e;-><init>(Lcom/liulishuo/okdownload/a;ZLjava/util/ArrayList;Lr1/i;)V

    return-void
.end method

.method public static g(Lcom/liulishuo/okdownload/a;ZLr1/i;)Lu1/e;
    .locals 1

    .line 1
    new-instance v0, Lu1/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lu1/e;-><init>(Lcom/liulishuo/okdownload/a;ZLr1/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 13

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lu1/e;->h:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lp1/d;->i()Lv1/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lu1/e;->o()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :cond_0
    iget-object v4, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/liulishuo/okdownload/a;->f()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x1

    .line 31
    if-gtz v4, :cond_1

    .line 32
    .line 33
    new-instance v0, Lu1/d$a;

    .line 34
    .line 35
    new-instance v1, Ljava/io/IOException;

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v3, "unexpected url: "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 48
    .line 49
    invoke-virtual {v3}, Lcom/liulishuo/okdownload/a;->f()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1}, Lu1/d$a;-><init>(Ljava/io/IOException;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lu1/e;->e:Lu1/d;

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_1
    iget-boolean v4, p0, Lu1/e;->f:Z

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_2
    :try_start_0
    iget-object v4, p0, Lu1/e;->i:Lr1/i;

    .line 77
    .line 78
    iget-object v6, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 79
    .line 80
    invoke-virtual {v6}, Lcom/liulishuo/okdownload/a;->c()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-interface {v4, v6}, Lr1/f;->get(I)Lr1/c;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-nez v4, :cond_3

    .line 89
    .line 90
    iget-object v4, p0, Lu1/e;->i:Lr1/i;

    .line 91
    .line 92
    iget-object v6, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 93
    .line 94
    invoke-interface {v4, v6}, Lr1/f;->a(Lcom/liulishuo/okdownload/a;)Lr1/c;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_3
    :goto_0
    invoke-virtual {p0, v4}, Lu1/e;->r(Lr1/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    iget-boolean v6, p0, Lu1/e;->f:Z

    .line 106
    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    goto/16 :goto_5

    .line 110
    .line 111
    :cond_4
    invoke-virtual {p0, v4}, Lu1/e;->h(Lr1/c;)Lu1/d;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iput-object v6, p0, Lu1/e;->e:Lu1/d;

    .line 116
    .line 117
    invoke-virtual {p0, v4}, Lu1/e;->j(Lr1/c;)Lu1/b;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    :try_start_1
    invoke-virtual {v7}, Lu1/b;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 122
    .line 123
    .line 124
    iget-object v8, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 125
    .line 126
    invoke-virtual {v8}, Lcom/liulishuo/okdownload/a;->v()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v6, v8}, Lu1/d;->o(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lv1/e;->d()Lv1/c;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    iget-object v9, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 138
    .line 139
    invoke-virtual {v9}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v8, v9}, Lv1/c;->f(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v8}, Lp1/d;->f()Lu1/g;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    iget-object v9, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 159
    .line 160
    invoke-virtual {v7}, Lu1/b;->d()J

    .line 161
    .line 162
    .line 163
    move-result-wide v10

    .line 164
    invoke-virtual {v8, v9, v4, v10, v11}, Lu1/g;->d(Lcom/liulishuo/okdownload/a;Lr1/c;J)Z

    .line 165
    .line 166
    .line 167
    :try_start_2
    invoke-virtual {v7}, Lu1/b;->f()Z

    .line 168
    .line 169
    .line 170
    move-result v8
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 171
    const-string v9, " "

    .line 172
    .line 173
    const-string v10, "DownloadCall"

    .line 174
    .line 175
    if-eqz v8, :cond_6

    .line 176
    .line 177
    :try_start_3
    invoke-virtual {v7}, Lu1/b;->d()J

    .line 178
    .line 179
    .line 180
    move-result-wide v11

    .line 181
    invoke-virtual {p0, v4, v11, v12}, Lu1/e;->i(Lr1/c;J)Lu1/a;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v8}, Lu1/a;->a()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Lu1/a;->c()Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_5

    .line 193
    .line 194
    new-instance v11, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v12, "breakpoint invalid: download from beginning because of local check is dirty "

    .line 200
    .line 201
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    iget-object v12, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 205
    .line 206
    invoke-virtual {v12}, Lcom/liulishuo/okdownload/a;->c()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    invoke-static {v10, v9}, Lq1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object v9, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 227
    .line 228
    invoke-virtual {v1, v9}, Lv1/e;->c(Lcom/liulishuo/okdownload/a;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8}, Lu1/a;->b()Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {p0, v4, v7, v8}, Lu1/e;->d(Lr1/c;Lu1/b;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :catch_1
    move-exception v0

    .line 240
    goto :goto_3

    .line 241
    :cond_5
    invoke-virtual {v0}, Lp1/d;->b()Lt1/a;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v7}, Lt1/a;->a()Lp1/a;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    iget-object v8, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 250
    .line 251
    invoke-interface {v7, v8, v4}, Lp1/a;->q(Lcom/liulishuo/okdownload/a;Lr1/c;)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_6
    new-instance v8, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const-string v11, "breakpoint invalid: download from beginning because of remote check not resumable "

    .line 261
    .line 262
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    iget-object v11, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 266
    .line 267
    invoke-virtual {v11}, Lcom/liulishuo/okdownload/a;->c()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v10, v8}, Lq1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object v8, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 288
    .line 289
    invoke-virtual {v1, v8}, Lv1/e;->c(Lcom/liulishuo/okdownload/a;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7}, Lu1/b;->c()Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-virtual {p0, v4, v7, v8}, Lu1/e;->d(Lr1/c;Lu1/b;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 297
    .line 298
    .line 299
    :goto_1
    invoke-virtual {p0, v6, v4}, Lu1/e;->s(Lu1/d;Lr1/c;)V

    .line 300
    .line 301
    .line 302
    iget-boolean v4, p0, Lu1/e;->f:Z

    .line 303
    .line 304
    if-eqz v4, :cond_7

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_7
    invoke-virtual {v6}, Lu1/d;->h()Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eqz v4, :cond_9

    .line 312
    .line 313
    add-int/lit8 v4, v3, 0x1

    .line 314
    .line 315
    if-ge v3, v5, :cond_8

    .line 316
    .line 317
    iget-object v3, p0, Lu1/e;->i:Lr1/i;

    .line 318
    .line 319
    iget-object v6, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 320
    .line 321
    invoke-virtual {v6}, Lcom/liulishuo/okdownload/a;->c()I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    invoke-interface {v3, v6}, Lr1/f;->remove(I)V

    .line 326
    .line 327
    .line 328
    move v3, v4

    .line 329
    move v4, v5

    .line 330
    goto :goto_2

    .line 331
    :cond_8
    move v3, v4

    .line 332
    :cond_9
    move v4, v2

    .line 333
    :goto_2
    if-nez v4, :cond_0

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :goto_3
    invoke-virtual {v6, v0}, Lu1/d;->q(Ljava/io/IOException;)V

    .line 337
    .line 338
    .line 339
    goto :goto_5

    .line 340
    :catch_2
    move-exception v0

    .line 341
    invoke-virtual {v6, v0}, Lu1/d;->a(Ljava/io/IOException;)V

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :goto_4
    new-instance v1, Lu1/d$a;

    .line 346
    .line 347
    invoke-direct {v1, v0}, Lu1/d$a;-><init>(Ljava/io/IOException;)V

    .line 348
    .line 349
    .line 350
    iput-object v1, p0, Lu1/e;->e:Lu1/d;

    .line 351
    .line 352
    :goto_5
    iput-boolean v5, p0, Lu1/e;->g:Z

    .line 353
    .line 354
    iget-object v0, p0, Lu1/e;->d:Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 357
    .line 358
    .line 359
    iget-object v0, p0, Lu1/e;->e:Lu1/d;

    .line 360
    .line 361
    iget-boolean v1, p0, Lu1/e;->f:Z

    .line 362
    .line 363
    if-nez v1, :cond_f

    .line 364
    .line 365
    if-nez v0, :cond_a

    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_a
    invoke-virtual {v0}, Lu1/d;->i()Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-nez v1, :cond_e

    .line 373
    .line 374
    invoke-virtual {v0}, Lu1/d;->j()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-nez v1, :cond_e

    .line 379
    .line 380
    invoke-virtual {v0}, Lu1/d;->h()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_b

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_b
    invoke-virtual {v0}, Lu1/d;->e()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    const/4 v2, 0x0

    .line 392
    if-eqz v1, :cond_c

    .line 393
    .line 394
    sget-object v1, Lcom/liulishuo/okdownload/core/cause/EndCause;->d:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_c
    invoke-virtual {v0}, Lu1/d;->g()Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-eqz v1, :cond_d

    .line 402
    .line 403
    sget-object v1, Lcom/liulishuo/okdownload/core/cause/EndCause;->f:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 404
    .line 405
    invoke-virtual {v0}, Lu1/d;->c()Ljava/io/IOException;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    goto :goto_7

    .line 410
    :cond_d
    sget-object v1, Lcom/liulishuo/okdownload/core/cause/EndCause;->a:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 411
    .line 412
    goto :goto_7

    .line 413
    :cond_e
    :goto_6
    sget-object v1, Lcom/liulishuo/okdownload/core/cause/EndCause;->b:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 414
    .line 415
    invoke-virtual {v0}, Lu1/d;->c()Ljava/io/IOException;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    :goto_7
    invoke-virtual {p0, v0, v1, v2}, Lu1/e;->n(Lu1/d;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V

    .line 420
    .line 421
    .line 422
    :cond_f
    :goto_8
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp1/d;->e()Lt1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lt1/b;->h(Lu1/e;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "call is finished "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "DownloadCall"

    .line 36
    .line 37
    invoke-static {v1, v0}, Lq1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public c(Ljava/lang/InterruptedException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lu1/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu1/e;->f(Lu1/e;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(Lr1/c;Lu1/b;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lu1/b;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {p2}, Lu1/b;->e()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {v0, p1, v1, v2, p2}, Lq1/c;->d(Lcom/liulishuo/okdownload/a;Lr1/c;JZ)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lp1/d;->b()Lt1/a;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Lt1/a;->a()Lp1/a;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 27
    .line 28
    invoke-interface {p2, v0, p1, p3}, Lp1/a;->p(Lcom/liulishuo/okdownload/a;Lr1/c;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public e()Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lu1/e;->f:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lu1/e;->g:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lu1/e;->f:Z

    .line 20
    .line 21
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lp1/d;->e()Lt1/b;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4, p0}, Lt1/b;->i(Lu1/e;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lu1/e;->e:Lu1/d;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v4}, Lu1/d;->r()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v5, p0, Lu1/e;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_5

    .line 51
    .line 52
    array-length v6, v5

    .line 53
    if-nez v6, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    array-length v6, v5

    .line 57
    :goto_0
    if-ge v1, v6, :cond_6

    .line 58
    .line 59
    aget-object v7, v5, v1

    .line 60
    .line 61
    instance-of v8, v7, Lu1/f;

    .line 62
    .line 63
    if-eqz v8, :cond_4

    .line 64
    .line 65
    check-cast v7, Lu1/f;

    .line 66
    .line 67
    invoke-virtual {v7}, Lu1/f;->a()V

    .line 68
    .line 69
    .line 70
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    :goto_1
    iget-object v1, p0, Lu1/e;->h:Ljava/lang/Thread;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    const-string v1, "DownloadCall"

    .line 78
    .line 79
    new-instance v5, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v6, "interrupt thread with cancel operation because of chains are not running "

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v6, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 90
    .line 91
    invoke-virtual {v6}, Lcom/liulishuo/okdownload/a;->c()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v1, v5}, Lq1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lu1/e;->h:Ljava/lang/Thread;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 108
    .line 109
    .line 110
    :cond_6
    if-eqz v4, :cond_7

    .line 111
    .line 112
    invoke-virtual {v4}, Lu1/d;->b()Lv1/d;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lv1/d;->b()V

    .line 117
    .line 118
    .line 119
    :cond_7
    const-string v1, "DownloadCall"

    .line 120
    .line 121
    new-instance v4, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v5, "cancel task "

    .line 127
    .line 128
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-object v5, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 132
    .line 133
    invoke-virtual {v5}, Lcom/liulishuo/okdownload/a;->c()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v5, " consume: "

    .line 141
    .line 142
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    sub-long/2addr v5, v2

    .line 150
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v2, "ms"

    .line 154
    .line 155
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v1, v2}, Lq1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return v0

    .line 166
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    throw v0
.end method

.method public f(Lu1/e;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu1/e;->m()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lu1/e;->m()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-int/2addr p1, v0

    .line 10
    return p1
.end method

.method public h(Lr1/c;)Lu1/d;
    .locals 3

    .line 1
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp1/d;->i()Lv1/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 10
    .line 11
    iget-object v2, p0, Lu1/e;->i:Lr1/i;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lv1/e;->b(Lcom/liulishuo/okdownload/a;Lr1/c;Lr1/i;)Lv1/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lu1/d;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lu1/d;-><init>(Lv1/d;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public i(Lr1/c;J)Lu1/a;
    .locals 2

    .line 1
    new-instance v0, Lu1/a;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, Lu1/a;-><init>(Lcom/liulishuo/okdownload/a;Lr1/c;J)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public j(Lr1/c;)Lu1/b;
    .locals 2

    .line 1
    new-instance v0, Lu1/b;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lu1/b;-><init>(Lcom/liulishuo/okdownload/a;Lr1/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public k(Lcom/liulishuo/okdownload/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/liulishuo/okdownload/a;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public l()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final n(Lu1/d;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/liulishuo/okdownload/core/cause/EndCause;->c:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 2
    .line 3
    if-eq p2, v0, :cond_2

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-boolean v0, p0, Lu1/e;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lu1/e;->g:Z

    .line 16
    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object v0, p0, Lu1/e;->i:Lr1/i;

    .line 19
    .line 20
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-interface {v0, v1, p2, p3}, Lr1/i;->f(ILcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lcom/liulishuo/okdownload/core/cause/EndCause;->a:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 30
    .line 31
    if-ne p2, v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lu1/e;->i:Lr1/i;

    .line 34
    .line 35
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-interface {v0, v1}, Lr1/i;->m(I)Z

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lp1/d;->i()Lv1/e;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1}, Lu1/d;->b()Lv1/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 57
    .line 58
    invoke-virtual {v0, p1, v1}, Lv1/e;->a(Lv1/d;Lcom/liulishuo/okdownload/a;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lp1/d;->b()Lt1/a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lt1/a;->a()Lp1/a;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 74
    .line 75
    invoke-interface {p1, v0, p2, p3}, Lp1/a;->i(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/IllegalAccessError;

    .line 82
    .line 83
    const-string p2, "can\'t recognize cancelled on here"

    .line 84
    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/e;->i:Lr1/i;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v0, v1}, Lr1/i;->d(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lp1/d;->b()Lt1/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lt1/a;->a()Lp1/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lp1/a;->g(Lcom/liulishuo/okdownload/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu1/e;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu1/e;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public r(Lr1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/liulishuo/okdownload/a$c;->b(Lcom/liulishuo/okdownload/a;Lr1/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(Lu1/d;Lr1/c;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Lr1/c;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p2}, Lr1/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2, v3}, Lr1/c;->c(I)Lr1/a;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Lr1/a;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-virtual {v4}, Lr1/a;->b()J

    .line 31
    .line 32
    .line 33
    move-result-wide v7

    .line 34
    invoke-static {v5, v6, v7, v8}, Lq1/c;->o(JJ)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {v4}, Lq1/c;->x(Lr1/a;)V

    .line 42
    .line 43
    .line 44
    iget-object v4, p0, Lu1/e;->b:Lcom/liulishuo/okdownload/a;

    .line 45
    .line 46
    iget-object v5, p0, Lu1/e;->i:Lr1/i;

    .line 47
    .line 48
    invoke-static {v3, v4, p2, p1, v5}, Lu1/f;->b(ILcom/liulishuo/okdownload/a;Lr1/c;Lu1/d;Lr1/i;)Lu1/f;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Lu1/f;->d()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-boolean p2, p0, Lu1/e;->f:Z

    .line 70
    .line 71
    if-eqz p2, :cond_2

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    invoke-virtual {p1}, Lu1/d;->b()Lv1/d;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1, v2}, Lv1/d;->w(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lu1/e;->t(Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public t(Ljava/util/List;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lu1/f;

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lu1/e;->u(Lu1/f;)Ljava/util/concurrent/Future;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v2

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-object v2, p0, Lu1/e;->d:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    move v3, v1

    .line 47
    :catch_0
    :cond_1
    :goto_1
    if-ge v3, v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    check-cast v4, Ljava/util/concurrent/Future;

    .line 56
    .line 57
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    .line 58
    .line 59
    .line 60
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    :try_start_1
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    iget-object v0, p0, Lu1/e;->d:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    :goto_3
    if-ge v1, v3, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    check-cast v4, Ljava/util/concurrent/Future;

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    invoke-interface {v4, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    goto :goto_4

    .line 94
    :cond_3
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    :goto_4
    iget-object v1, p0, Lu1/e;->d:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    throw v0
.end method

.method public u(Lu1/f;)Ljava/util/concurrent/Future;
    .locals 1

    .line 1
    sget-object v0, Lu1/e;->j:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
