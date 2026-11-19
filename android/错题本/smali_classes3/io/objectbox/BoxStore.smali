.class public Lio/objectbox/BoxStore;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field public static s:Ljava/lang/Object;

.field public static final t:Ljava/util/HashSet;

.field public static volatile u:Ljava/lang/Thread;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;

.field public final f:Lb8/b;

.field public final g:[I

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/Set;

.field public final j:Lm5/e;

.field public final k:Lio/objectbox/f;

.field public final l:Z

.field public final m:Z

.field public final n:Ljava/lang/ThreadLocal;

.field public o:Z

.field public final p:Ljava/lang/Object;

.field public volatile q:I

.field public final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/objectbox/b;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, Lio/objectbox/BoxStore;->c:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, Lio/objectbox/BoxStore;->d:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v2, v1, Lio/objectbox/BoxStore;->e:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v2, Lb8/b;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    iput v3, v2, Lb8/b;->b:I

    .line 37
    .line 38
    const/16 v4, 0x15

    .line 39
    .line 40
    iput v4, v2, Lb8/b;->c:I

    .line 41
    .line 42
    new-array v3, v3, [Lb8/a;

    .line 43
    .line 44
    iput-object v3, v2, Lb8/b;->a:[Lb8/a;

    .line 45
    .line 46
    iput-object v2, v1, Lio/objectbox/BoxStore;->f:Lb8/b;

    .line 47
    .line 48
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v2, v1, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    new-instance v2, Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, v1, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 65
    .line 66
    new-instance v2, Lm5/e;

    .line 67
    .line 68
    invoke-direct {v2, v1}, Lm5/e;-><init>(Lio/objectbox/BoxStore;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, v1, Lio/objectbox/BoxStore;->j:Lm5/e;

    .line 72
    .line 73
    new-instance v2, Ljava/lang/ThreadLocal;

    .line 74
    .line 75
    invoke-direct {v2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v2, v1, Lio/objectbox/BoxStore;->n:Ljava/lang/ThreadLocal;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/Object;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v2, v1, Lio/objectbox/BoxStore;->p:Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v2, v0, Lio/objectbox/b;->f:Ljava/lang/Object;

    .line 88
    .line 89
    sput-object v2, Lio/objectbox/BoxStore;->s:Ljava/lang/Object;

    .line 90
    .line 91
    sget v2, Lm5/c;->a:I

    .line 92
    .line 93
    iget-object v2, v0, Lio/objectbox/b;->b:Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 109
    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v4, "Is not a directory: "

    .line 113
    .line 114
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-direct {v0, v2}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_b

    .line 137
    .line 138
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 142
    iput-object v2, v1, Lio/objectbox/BoxStore;->a:Ljava/lang/String;

    .line 143
    .line 144
    const-string v3, "Another BoxStore is still open for this directory: "

    .line 145
    .line 146
    sget-object v4, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 147
    .line 148
    monitor-enter v4

    .line 149
    :try_start_1
    invoke-static {v2}, Lio/objectbox/BoxStore;->f(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_a

    .line 157
    .line 158
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    :try_start_2
    invoke-virtual {v0, v2}, Lio/objectbox/b;->c(Ljava/lang/String;)[B

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iget-object v3, v0, Lio/objectbox/b;->a:[B

    .line 164
    .line 165
    invoke-static {v2, v3}, Lio/objectbox/BoxStore;->nativeCreateWithFlatOptions([B[B)J

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    iput-wide v2, v1, Lio/objectbox/BoxStore;->b:J

    .line 170
    .line 171
    const-wide/16 v4, 0x0

    .line 172
    .line 173
    cmp-long v2, v2, v4

    .line 174
    .line 175
    if-eqz v2, :cond_9

    .line 176
    .line 177
    const/4 v2, 0x0

    .line 178
    iput-boolean v2, v1, Lio/objectbox/BoxStore;->m:Z

    .line 179
    .line 180
    iput-boolean v2, v1, Lio/objectbox/BoxStore;->l:Z

    .line 181
    .line 182
    iget-object v0, v0, Lio/objectbox/b;->h:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    move v4, v2

    .line 189
    :cond_2
    if-ge v4, v3, :cond_5

    .line 190
    .line 191
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    add-int/lit8 v4, v4, 0x1

    .line 196
    .line 197
    check-cast v5, Lio/objectbox/EntityInfo;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 198
    .line 199
    :try_start_3
    iget-object v6, v1, Lio/objectbox/BoxStore;->c:Ljava/util/HashMap;

    .line 200
    .line 201
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getDbName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    iget-wide v6, v1, Lio/objectbox/BoxStore;->b:J

    .line 213
    .line 214
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getDbName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    invoke-static {v6, v7, v8, v9}, Lio/objectbox/BoxStore;->nativeRegisterEntityClass(JLjava/lang/String;Ljava/lang/Class;)I

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    iget-object v6, v1, Lio/objectbox/BoxStore;->d:Ljava/util/HashMap;

    .line 227
    .line 228
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    iget-object v6, v1, Lio/objectbox/BoxStore;->f:Lb8/b;

    .line 240
    .line 241
    int-to-long v7, v12

    .line 242
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-virtual {v6, v7, v8, v9}, Lb8/b;->a(JLjava/lang/Class;)V

    .line 247
    .line 248
    .line 249
    iget-object v6, v1, Lio/objectbox/BoxStore;->e:Ljava/util/HashMap;

    .line 250
    .line 251
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-virtual {v6, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getAllProperties()[Lio/objectbox/Property;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    array-length v7, v6

    .line 263
    move v8, v2

    .line 264
    :goto_1
    if-ge v8, v7, :cond_2

    .line 265
    .line 266
    aget-object v9, v6, v8

    .line 267
    .line 268
    iget-object v10, v9, Lio/objectbox/Property;->customType:Ljava/lang/Class;

    .line 269
    .line 270
    if-eqz v10, :cond_4

    .line 271
    .line 272
    iget-object v15, v9, Lio/objectbox/Property;->converterClass:Ljava/lang/Class;

    .line 273
    .line 274
    if-eqz v15, :cond_3

    .line 275
    .line 276
    move-object/from16 v16, v10

    .line 277
    .line 278
    iget-wide v10, v1, Lio/objectbox/BoxStore;->b:J

    .line 279
    .line 280
    iget-object v14, v9, Lio/objectbox/Property;->dbName:Ljava/lang/String;

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    invoke-static/range {v10 .. v16}, Lio/objectbox/BoxStore;->nativeRegisterCustomType(JIILjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :catch_0
    move-exception v0

    .line 288
    goto :goto_3

    .line 289
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 290
    .line 291
    new-instance v2, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const-string v3, "No converter class for custom type of "

    .line 297
    .line 298
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 312
    :cond_4
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :goto_3
    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    .line 316
    .line 317
    new-instance v3, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    const-string v4, "Could not setup up entity "

    .line 323
    .line 324
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 339
    .line 340
    .line 341
    throw v2

    .line 342
    :catch_1
    move-exception v0

    .line 343
    goto :goto_7

    .line 344
    :cond_5
    iget-object v0, v1, Lio/objectbox/BoxStore;->f:Lb8/b;

    .line 345
    .line 346
    iget v0, v0, Lb8/b;->d:I

    .line 347
    .line 348
    new-array v3, v0, [I

    .line 349
    .line 350
    iput-object v3, v1, Lio/objectbox/BoxStore;->g:[I

    .line 351
    .line 352
    iget-object v3, v1, Lio/objectbox/BoxStore;->f:Lb8/b;

    .line 353
    .line 354
    iget v4, v3, Lb8/b;->d:I

    .line 355
    .line 356
    new-array v4, v4, [J

    .line 357
    .line 358
    iget-object v3, v3, Lb8/b;->a:[Lb8/a;

    .line 359
    .line 360
    array-length v5, v3

    .line 361
    move v6, v2

    .line 362
    move v7, v6

    .line 363
    :goto_4
    if-ge v6, v5, :cond_7

    .line 364
    .line 365
    aget-object v8, v3, v6

    .line 366
    .line 367
    :goto_5
    if-eqz v8, :cond_6

    .line 368
    .line 369
    add-int/lit8 v9, v7, 0x1

    .line 370
    .line 371
    iget-wide v10, v8, Lb8/a;->a:J

    .line 372
    .line 373
    aput-wide v10, v4, v7

    .line 374
    .line 375
    iget-object v8, v8, Lb8/a;->c:Lb8/a;

    .line 376
    .line 377
    move v7, v9

    .line 378
    goto :goto_5

    .line 379
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 380
    .line 381
    goto :goto_4

    .line 382
    :cond_7
    move v3, v2

    .line 383
    :goto_6
    if-ge v3, v0, :cond_8

    .line 384
    .line 385
    iget-object v5, v1, Lio/objectbox/BoxStore;->g:[I

    .line 386
    .line 387
    aget-wide v6, v4, v3

    .line 388
    .line 389
    long-to-int v6, v6

    .line 390
    aput v6, v5, v3

    .line 391
    .line 392
    add-int/lit8 v3, v3, 0x1

    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_8
    new-instance v0, Lio/objectbox/f;

    .line 396
    .line 397
    invoke-direct {v0, v1}, Lio/objectbox/f;-><init>(Lio/objectbox/BoxStore;)V

    .line 398
    .line 399
    .line 400
    iput-object v0, v1, Lio/objectbox/BoxStore;->k:Lio/objectbox/f;

    .line 401
    .line 402
    const/4 v0, 0x1

    .line 403
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    iput v0, v1, Lio/objectbox/BoxStore;->r:I

    .line 408
    .line 409
    return-void

    .line 410
    :cond_9
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 411
    .line 412
    const-string v2, "Could not create native store"

    .line 413
    .line 414
    invoke-direct {v0, v2}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 418
    :goto_7
    invoke-virtual {v1}, Lio/objectbox/BoxStore;->close()V

    .line 419
    .line 420
    .line 421
    throw v0

    .line 422
    :catchall_0
    move-exception v0

    .line 423
    goto :goto_8

    .line 424
    :cond_a
    :try_start_5
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 425
    .line 426
    new-instance v5, Ljava/lang/StringBuilder;

    .line 427
    .line 428
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    const-string v2, ". Hint: for most apps it\'s recommended to keep a BoxStore for the app\'s life time."

    .line 435
    .line 436
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-direct {v0, v2}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw v0

    .line 447
    :goto_8
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 448
    throw v0

    .line 449
    :catch_2
    move-exception v0

    .line 450
    new-instance v2, Lio/objectbox/exception/DbException;

    .line 451
    .line 452
    const-string v3, "Could not verify dir"

    .line 453
    .line 454
    invoke-direct {v2, v3, v0}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 455
    .line 456
    .line 457
    throw v2

    .line 458
    :cond_b
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 459
    .line 460
    new-instance v3, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v4, "Could not create directory: "

    .line 463
    .line 464
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-direct {v0, v2}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v0
.end method

.method public static f(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_2

    .line 14
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    sget-object v0, Lio/objectbox/BoxStore;->u:Ljava/lang/Thread;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    invoke-static {p0, v0}, Lio/objectbox/BoxStore;->g(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/Thread;

    .line 32
    .line 33
    new-instance v1, Lcom/zykj/blackboard/utils/a;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, Lcom/zykj/blackboard/utils/a;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lio/objectbox/BoxStore;->u:Ljava/lang/Thread;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 49
    .line 50
    .line 51
    const-wide/16 v1, 0x1f4

    .line 52
    .line 53
    :try_start_1
    invoke-virtual {v0, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget-object v1, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 62
    .line 63
    monitor-enter v1

    .line 64
    :try_start_2
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    monitor-exit v1

    .line 68
    return-void

    .line 69
    :catchall_1
    move-exception p0

    .line 70
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    throw p0

    .line 72
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    throw p0
.end method

.method public static g(Ljava/lang/String;Z)Z
    .locals 5

    .line 1
    sget-object v0, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :catch_0
    :goto_0
    const/4 v2, 0x5

    .line 6
    if-ge v1, v2, :cond_2

    .line 7
    .line 8
    :try_start_0
    sget-object v2, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v2, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    if-le v1, v3, :cond_0

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :goto_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    if-le v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->runFinalization()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :cond_1
    const-wide/16 v3, 0x64

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    :try_start_2
    sget-object p1, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    monitor-exit v0

    .line 55
    return p0

    .line 56
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    throw p0
.end method

.method public static native nativeBeginReadTx(J)J
.end method

.method public static native nativeBeginTx(J)J
.end method

.method public static native nativeCleanStaleReadTransactions(J)I
.end method

.method public static native nativeCreateWithFlatOptions([B[B)J
.end method

.method public static native nativeDelete(J)V
.end method

.method public static native nativeDiagnose(J)Ljava/lang/String;
.end method

.method public static native nativeRegisterCustomType(JIILjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JII",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lio/objectbox/converter/PropertyConverter;",
            ">;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation
.end method

.method public static native nativeRegisterEntityClass(JLjava/lang/String;Ljava/lang/Class;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation
.end method


# virtual methods
.method public final a()Lio/objectbox/Transaction;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Lio/objectbox/BoxStore;->q:I

    .line 6
    .line 7
    iget-boolean v1, p0, Lio/objectbox/BoxStore;->l:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Begin read TX with commit count "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-wide v1, p0, Lio/objectbox/BoxStore;->b:J

    .line 31
    .line 32
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeBeginReadTx(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    cmp-long v3, v1, v3

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    new-instance v3, Lio/objectbox/Transaction;

    .line 43
    .line 44
    invoke-direct {v3, p0, v1, v2, v0}, Lio/objectbox/Transaction;-><init>(Lio/objectbox/BoxStore;JI)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return-object v3

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw v1

    .line 60
    :cond_1
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 61
    .line 62
    const-string v1, "Could not create native read transaction"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v1, "Store is closed"

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public final b()Lio/objectbox/Transaction;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Lio/objectbox/BoxStore;->q:I

    .line 6
    .line 7
    iget-boolean v1, p0, Lio/objectbox/BoxStore;->m:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Begin TX with commit count "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-wide v1, p0, Lio/objectbox/BoxStore;->b:J

    .line 31
    .line 32
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeBeginTx(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    cmp-long v3, v1, v3

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    new-instance v3, Lio/objectbox/Transaction;

    .line 43
    .line 44
    invoke-direct {v3, p0, v1, v2, v0}, Lio/objectbox/Transaction;-><init>(Lio/objectbox/BoxStore;JI)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return-object v3

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw v1

    .line 60
    :cond_1
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 61
    .line 62
    const-string v1, "Could not create native transaction"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v1, "Store is closed"

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public final c(Ljava/lang/Class;)Lio/objectbox/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/objectbox/a;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lio/objectbox/BoxStore;->c:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lio/objectbox/a;

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    new-instance v1, Lio/objectbox/a;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Lio/objectbox/a;-><init>(Lio/objectbox/BoxStore;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-virtual {v2, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit v0

    .line 46
    return-object v1

    .line 47
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw p1

    .line 49
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, " is not a known entity. Please add it and trigger generation again."

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_2
    return-object v0
.end method

.method public final close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->o:Z

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lio/objectbox/BoxStore;->o:Z

    .line 8
    .line 9
    iget-object v1, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 10
    .line 11
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v3, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :try_start_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v3, v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    check-cast v4, Lio/objectbox/Transaction;

    .line 34
    .line 35
    invoke-virtual {v4}, Lio/objectbox/Transaction;->close()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    iget-wide v1, p0, Lio/objectbox/BoxStore;->b:J

    .line 42
    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    cmp-long v3, v1, v3

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeDelete(J)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, Lio/objectbox/BoxStore;->j:Lm5/e;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :try_start_4
    throw v0

    .line 64
    :cond_2
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    sget-object v0, Lio/objectbox/BoxStore;->t:Ljava/util/HashSet;

    .line 68
    .line 69
    monitor-enter v0

    .line 70
    :try_start_5
    iget-object v1, p0, Lio/objectbox/BoxStore;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 76
    .line 77
    .line 78
    monitor-exit v0

    .line 79
    return-void

    .line 80
    :catchall_2
    move-exception v1

    .line 81
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 82
    throw v1

    .line 83
    :cond_3
    return-void

    .line 84
    :goto_2
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 85
    throw v0
.end method

.method public final d(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lio/objectbox/BoxStore;->n:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lio/objectbox/Transaction;

    .line 10
    .line 11
    const-string v3, "Callable threw exception"

    .line 12
    .line 13
    if-nez v2, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->a()Lio/objectbox/Transaction;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lio/objectbox/a;

    .line 48
    .line 49
    iget-object v1, v1, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lio/objectbox/Cursor;

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-virtual {v3}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-ne v4, v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v2}, Lio/objectbox/Transaction;->close()V

    .line 73
    .line 74
    .line 75
    return-object p1

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_1

    .line 78
    :catch_0
    move-exception p1

    .line 79
    :try_start_1
    new-instance v4, Ljava/lang/RuntimeException;

    .line 80
    .line 81
    invoke-direct {v4, v3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v4

    .line 85
    :catch_1
    move-exception p1

    .line 86
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    :goto_1
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Lio/objectbox/a;

    .line 109
    .line 110
    iget-object v1, v1, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lio/objectbox/Cursor;

    .line 117
    .line 118
    if-eqz v3, :cond_2

    .line 119
    .line 120
    invoke-virtual {v3}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-ne v4, v2, :cond_2

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    invoke-virtual {v2}, Lio/objectbox/Transaction;->close()V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_4
    :try_start_2
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 141
    return-object p1

    .line 142
    :catch_2
    move-exception p1

    .line 143
    new-instance v0, Ljava/lang/RuntimeException;

    .line 144
    .line 145
    invoke-direct {v0, v3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    throw v0
.end method

.method public final e()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/objectbox/BoxStore;->j:Lm5/e;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/Thread;->activeCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 18
    .line 19
    const-string v2, "Thread pool not terminated in time; printing stack traces..."

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    new-array v0, v0, [Ljava/lang/Thread;

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Thread;->enumerate([Ljava/lang/Thread;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_0
    if-ge v2, v1, :cond_0

    .line 34
    .line 35
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 36
    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v5, "Thread: "

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    aget-object v5, v0, v2

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    return-void

    .line 72
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->close()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final h(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->n:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lio/objectbox/Transaction;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->b()Lio/objectbox/Transaction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lio/objectbox/Transaction;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lio/objectbox/Transaction;->close()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lio/objectbox/Transaction;->close()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_0
    iget-boolean v0, v1, Lio/objectbox/Transaction;->c:Z

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "Cannot start a transaction while a read only transaction is active"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method
