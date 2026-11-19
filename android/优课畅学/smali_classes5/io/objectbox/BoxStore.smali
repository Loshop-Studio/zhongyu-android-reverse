.class public Lio/objectbox/BoxStore;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field public static w:Ljava/lang/Object;

.field public static x:Ljava/lang/Object;

.field public static final y:Ljava/util/Set;

.field public static volatile z:Ljava/lang/Thread;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/Map;

.field public final g:Lz9/b;

.field public final h:[I

.field public final i:Ljava/util/Map;

.field public final j:Ljava/util/Set;

.field public final k:Ljava/util/concurrent/ExecutorService;

.field public final l:Lio/objectbox/g;

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Ljava/lang/ThreadLocal;

.field public q:Z

.field public final r:Ljava/lang/Object;

.field public volatile s:I

.field public t:I

.field public final u:I

.field public v:Lr6/a;


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
    sput-object v0, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/objectbox/c;)V
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
    iput-object v2, v1, Lio/objectbox/BoxStore;->d:Ljava/util/Map;

    .line 14
    .line 15
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, Lio/objectbox/BoxStore;->e:Ljava/util/Map;

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v2, v1, Lio/objectbox/BoxStore;->f:Ljava/util/Map;

    .line 28
    .line 29
    new-instance v2, Lz9/b;

    .line 30
    .line 31
    invoke-direct {v2}, Lz9/b;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v1, Lio/objectbox/BoxStore;->g:Lz9/b;

    .line 35
    .line 36
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v2, v1, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 42
    .line 43
    new-instance v2, Ljava/util/WeakHashMap;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v1, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 53
    .line 54
    new-instance v2, Ln6/e;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Ln6/e;-><init>(Lio/objectbox/BoxStore;)V

    .line 57
    .line 58
    .line 59
    iput-object v2, v1, Lio/objectbox/BoxStore;->k:Ljava/util/concurrent/ExecutorService;

    .line 60
    .line 61
    new-instance v2, Ljava/lang/ThreadLocal;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v2, v1, Lio/objectbox/BoxStore;->p:Ljava/lang/ThreadLocal;

    .line 67
    .line 68
    new-instance v2, Ljava/lang/Object;

    .line 69
    .line 70
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v2, v1, Lio/objectbox/BoxStore;->r:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v2, v0, Lio/objectbox/c;->f:Ljava/lang/Object;

    .line 76
    .line 77
    sput-object v2, Lio/objectbox/BoxStore;->w:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v2, v0, Lio/objectbox/c;->g:Ljava/lang/Object;

    .line 80
    .line 81
    sput-object v2, Lio/objectbox/BoxStore;->x:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {}, Ln6/d;->b()V

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, Lio/objectbox/c;->b:Ljava/io/File;

    .line 87
    .line 88
    iput-object v2, v1, Lio/objectbox/BoxStore;->a:Ljava/io/File;

    .line 89
    .line 90
    invoke-static {v2}, Lio/objectbox/BoxStore;->n(Ljava/io/File;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iput-object v2, v1, Lio/objectbox/BoxStore;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v2}, Lio/objectbox/BoxStore;->H(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :try_start_0
    invoke-virtual {v0, v2}, Lio/objectbox/c;->c(Ljava/lang/String;)[B

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v3, v0, Lio/objectbox/c;->a:[B

    .line 104
    .line 105
    invoke-static {v2, v3}, Lio/objectbox/BoxStore;->nativeCreateWithFlatOptions([B[B)J

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    iput-wide v2, v1, Lio/objectbox/BoxStore;->c:J

    .line 110
    .line 111
    const-wide/16 v4, 0x0

    .line 112
    .line 113
    cmp-long v2, v2, v4

    .line 114
    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    iget v2, v0, Lio/objectbox/c;->h:I

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    const/4 v4, 0x1

    .line 121
    if-eqz v2, :cond_2

    .line 122
    .line 123
    and-int/lit8 v5, v2, 0x1

    .line 124
    .line 125
    if-eqz v5, :cond_0

    .line 126
    .line 127
    move v5, v4

    .line 128
    goto :goto_0

    .line 129
    :cond_0
    move v5, v3

    .line 130
    :goto_0
    iput-boolean v5, v1, Lio/objectbox/BoxStore;->m:Z

    .line 131
    .line 132
    and-int/lit8 v2, v2, 0x2

    .line 133
    .line 134
    if-eqz v2, :cond_1

    .line 135
    .line 136
    move v2, v4

    .line 137
    goto :goto_1

    .line 138
    :cond_1
    move v2, v3

    .line 139
    :goto_1
    iput-boolean v2, v1, Lio/objectbox/BoxStore;->n:Z

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catch_0
    move-exception v0

    .line 143
    goto/16 :goto_7

    .line 144
    .line 145
    :cond_2
    iput-boolean v3, v1, Lio/objectbox/BoxStore;->n:Z

    .line 146
    .line 147
    iput-boolean v3, v1, Lio/objectbox/BoxStore;->m:Z

    .line 148
    .line 149
    :goto_2
    iget-boolean v2, v0, Lio/objectbox/c;->j:Z

    .line 150
    .line 151
    iput-boolean v2, v1, Lio/objectbox/BoxStore;->o:Z

    .line 152
    .line 153
    iget-object v2, v0, Lio/objectbox/c;->s:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-eqz v5, :cond_6

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Lio/objectbox/EntityInfo;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    :try_start_1
    iget-object v6, v1, Lio/objectbox/BoxStore;->d:Ljava/util/Map;

    .line 172
    .line 173
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getDbName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    iget-wide v6, v1, Lio/objectbox/BoxStore;->c:J

    .line 185
    .line 186
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getDbName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-static {v6, v7, v8, v9}, Lio/objectbox/BoxStore;->nativeRegisterEntityClass(JLjava/lang/String;Ljava/lang/Class;)I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    iget-object v6, v1, Lio/objectbox/BoxStore;->e:Ljava/util/Map;

    .line 199
    .line 200
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    iget-object v6, v1, Lio/objectbox/BoxStore;->g:Lz9/b;

    .line 212
    .line 213
    int-to-long v7, v12

    .line 214
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-virtual {v6, v7, v8, v9}, Lz9/b;->c(JLjava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    iget-object v6, v1, Lio/objectbox/BoxStore;->f:Ljava/util/Map;

    .line 222
    .line 223
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getAllProperties()[Lio/objectbox/Property;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    array-length v7, v6

    .line 235
    move v8, v3

    .line 236
    :goto_3
    if-ge v8, v7, :cond_3

    .line 237
    .line 238
    aget-object v9, v6, v8

    .line 239
    .line 240
    iget-object v10, v9, Lio/objectbox/Property;->j:Ljava/lang/Class;

    .line 241
    .line 242
    if-eqz v10, :cond_5

    .line 243
    .line 244
    iget-object v15, v9, Lio/objectbox/Property;->i:Ljava/lang/Class;

    .line 245
    .line 246
    if-eqz v15, :cond_4

    .line 247
    .line 248
    move-object/from16 v16, v10

    .line 249
    .line 250
    iget-wide v10, v1, Lio/objectbox/BoxStore;->c:J

    .line 251
    .line 252
    iget-object v14, v9, Lio/objectbox/Property;->h:Ljava/lang/String;

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    invoke-static/range {v10 .. v16}, Lio/objectbox/BoxStore;->nativeRegisterCustomType(JIILjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :catch_1
    move-exception v0

    .line 260
    goto :goto_5

    .line 261
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 262
    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const-string v3, "No converter class for custom type of "

    .line 269
    .line 270
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 284
    :cond_5
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :goto_5
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 288
    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string v4, "Could not setup up entity "

    .line 295
    .line 296
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-interface {v5}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    throw v2

    .line 314
    :cond_6
    iget-object v2, v1, Lio/objectbox/BoxStore;->g:Lz9/b;

    .line 315
    .line 316
    invoke-virtual {v2}, Lz9/b;->e()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    new-array v5, v2, [I

    .line 321
    .line 322
    iput-object v5, v1, Lio/objectbox/BoxStore;->h:[I

    .line 323
    .line 324
    iget-object v5, v1, Lio/objectbox/BoxStore;->g:Lz9/b;

    .line 325
    .line 326
    invoke-virtual {v5}, Lz9/b;->b()[J

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    :goto_6
    if-ge v3, v2, :cond_7

    .line 331
    .line 332
    iget-object v6, v1, Lio/objectbox/BoxStore;->h:[I

    .line 333
    .line 334
    aget-wide v7, v5, v3

    .line 335
    .line 336
    long-to-int v7, v7

    .line 337
    aput v7, v6, v3

    .line 338
    .line 339
    add-int/lit8 v3, v3, 0x1

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_7
    new-instance v2, Lio/objectbox/g;

    .line 343
    .line 344
    invoke-direct {v2, v1}, Lio/objectbox/g;-><init>(Lio/objectbox/BoxStore;)V

    .line 345
    .line 346
    .line 347
    iput-object v2, v1, Lio/objectbox/BoxStore;->l:Lio/objectbox/g;

    .line 348
    .line 349
    iget v0, v0, Lio/objectbox/c;->m:I

    .line 350
    .line 351
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    iput v0, v1, Lio/objectbox/BoxStore;->u:I

    .line 356
    .line 357
    return-void

    .line 358
    :cond_8
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 359
    .line 360
    const-string v2, "Could not create native store"

    .line 361
    .line 362
    invoke-direct {v0, v2}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 366
    :goto_7
    invoke-virtual {v1}, Lio/objectbox/BoxStore;->close()V

    .line 367
    .line 368
    .line 369
    throw v0
.end method

.method public static A(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return v2

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    sget-object v0, Lio/objectbox/BoxStore;->z:Ljava/lang/Thread;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p0, v2}, Lio/objectbox/BoxStore;->B(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/Thread;

    .line 33
    .line 34
    new-instance v1, Lio/objectbox/b;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lio/objectbox/b;-><init>(Ljava/lang/String;)V

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
    sput-object v0, Lio/objectbox/BoxStore;->z:Ljava/lang/Thread;

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
    sget-object v1, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 62
    .line 63
    monitor-enter v1

    .line 64
    :try_start_2
    invoke-interface {v1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    monitor-exit v1

    .line 69
    return p0

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    throw p0

    .line 73
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    throw p0
.end method

.method public static B(Ljava/lang/String;Z)Z
    .locals 5

    .line 1
    sget-object v0, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

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
    sget-object v2, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

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
    sget-object p1, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

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

.method public static H(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Lio/objectbox/BoxStore;->A(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Lio/objectbox/exception/DbException;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "Another BoxStore is still open for this directory: "

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ". Hint: for most apps it\'s recommended to keep a BoxStore for the app\'s life time."

    .line 33
    .line 34
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v1, p0}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p0
.end method

.method public static synthetic a(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lio/objectbox/BoxStore;->B(Ljava/lang/String;Z)Z

    .line 3
    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    sput-object p0, Lio/objectbox/BoxStore;->z:Ljava/lang/Thread;

    .line 7
    .line 8
    return-void
.end method

.method public static n(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "Is not a directory: "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, p0}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception p0

    .line 53
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 54
    .line 55
    const-string v1, "Could not verify dir"

    .line 56
    .line 57
    invoke-direct {v0, v1, p0}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Could not create directory: "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v0, p0}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0
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

.method public static native nativeDropAllData(J)V
.end method

.method public static native nativeGetSupportedSync()I
.end method

.method public static native nativeGetVersion()Ljava/lang/String;
.end method

.method public static native nativeIsObjectBrowserAvailable()Z
.end method

.method public static native nativeIsReadOnly(J)Z
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

.method public static native nativeSetDbExceptionListener(JLio/objectbox/exception/DbExceptionListener;)V
    .param p2    # Lio/objectbox/exception/DbExceptionListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public static native nativeSetDebugFlags(JI)V
.end method

.method private native nativeStartObjectBrowser(JLjava/lang/String;I)Ljava/lang/String;
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method private native nativeStopObjectBrowser(J)Z
.end method

.method public static declared-synchronized o()Ljava/lang/Object;
    .locals 2

    .line 1
    const-class v0, Lio/objectbox/BoxStore;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lio/objectbox/BoxStore;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method public static declared-synchronized t()Ljava/lang/Object;
    .locals 2

    .line 1
    const-class v0, Lio/objectbox/BoxStore;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lio/objectbox/BoxStore;->x:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method public static native testUnalignedMemoryAccess()V
.end method


# virtual methods
.method public C(Lr6/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/objectbox/BoxStore;->v:Lr6/a;

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized D()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lio/objectbox/BoxStore;->t:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lio/objectbox/BoxStore;->t:I

    .line 8
    .line 9
    iget-wide v0, p0, Lio/objectbox/BoxStore;->c:J

    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lio/objectbox/BoxStore;->nativeStopObjectBrowser(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "ObjectBrowser has not been started before"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public E(Ljava/lang/Class;)Lq6/g;
    .locals 3

    .line 1
    new-instance v0, Lq6/g;

    .line 2
    .line 3
    iget-object v1, p0, Lio/objectbox/BoxStore;->l:Lio/objectbox/g;

    .line 4
    .line 5
    iget-object v2, p0, Lio/objectbox/BoxStore;->k:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, v2}, Lq6/g;-><init>(Lq6/b;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public F(Lio/objectbox/Transaction;[I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lio/objectbox/BoxStore;->s:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lio/objectbox/BoxStore;->s:I

    .line 9
    .line 10
    iget-boolean v1, p0, Lio/objectbox/BoxStore;->n:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "TX committed. New commit count: "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v3, p0, Lio/objectbox/BoxStore;->s:I

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, ", entity types affected: "

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    array-length v3, p2

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    const/4 v3, 0x0

    .line 43
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    iget-object v0, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lio/objectbox/a;

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Lio/objectbox/a;->u(Lio/objectbox/Transaction;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    if-eqz p2, :cond_3

    .line 81
    .line 82
    iget-object p1, p0, Lio/objectbox/BoxStore;->l:Lio/objectbox/g;

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lio/objectbox/g;->f([I)V

    .line 85
    .line 86
    .line 87
    :cond_3
    return-void

    .line 88
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1
.end method

.method public G(Lio/objectbox/Transaction;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public b()Lio/objectbox/Transaction;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->g()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lio/objectbox/BoxStore;->s:I

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/objectbox/BoxStore;->m:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "Begin read TX with commit count "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-wide v1, p0, Lio/objectbox/BoxStore;->c:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeBeginReadTx(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    const-wide/16 v3, 0x0

    .line 39
    .line 40
    cmp-long v3, v1, v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    new-instance v3, Lio/objectbox/Transaction;

    .line 45
    .line 46
    invoke-direct {v3, p0, v1, v2, v0}, Lio/objectbox/Transaction;-><init>(Lio/objectbox/BoxStore;JI)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 50
    .line 51
    monitor-enter v0

    .line 52
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 53
    .line 54
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-object v3

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw v1

    .line 62
    :cond_1
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 63
    .line 64
    const-string v1, "Could not create native read transaction"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method

.method public c()Lio/objectbox/Transaction;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->g()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lio/objectbox/BoxStore;->s:I

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/objectbox/BoxStore;->n:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "Begin TX with commit count "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-wide v1, p0, Lio/objectbox/BoxStore;->c:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeBeginTx(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    const-wide/16 v3, 0x0

    .line 39
    .line 40
    cmp-long v3, v1, v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    new-instance v3, Lio/objectbox/Transaction;

    .line 45
    .line 46
    invoke-direct {v3, p0, v1, v2, v0}, Lio/objectbox/Transaction;-><init>(Lio/objectbox/BoxStore;JI)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 50
    .line 51
    monitor-enter v0

    .line 52
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 53
    .line 54
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-object v3

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw v1

    .line 62
    :cond_1
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 63
    .line 64
    const-string v1, "Could not create native transaction"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method

.method public close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->q:Z

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget v1, p0, Lio/objectbox/BoxStore;->t:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->D()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_1
    move-exception v0

    .line 20
    goto :goto_4

    .line 21
    :cond_0
    :goto_0
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, p0, Lio/objectbox/BoxStore;->q:Z

    .line 23
    .line 24
    iget-object v1, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 25
    .line 26
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :try_start_3
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v3, p0, Lio/objectbox/BoxStore;->j:Ljava/util/Set;

    .line 30
    .line 31
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 35
    :try_start_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lio/objectbox/Transaction;

    .line 50
    .line 51
    invoke-virtual {v2}, Lio/objectbox/Transaction;->close()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-wide v1, p0, Lio/objectbox/BoxStore;->c:J

    .line 56
    .line 57
    const-wide/16 v3, 0x0

    .line 58
    .line 59
    cmp-long v3, v1, v3

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeDelete(J)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v1, p0, Lio/objectbox/BoxStore;->k:Ljava/util/concurrent/ExecutorService;

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->h()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_2
    move-exception v0

    .line 76
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 77
    :try_start_6
    throw v0

    .line 78
    :cond_3
    :goto_2
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    sget-object v0, Lio/objectbox/BoxStore;->y:Ljava/util/Set;

    .line 82
    .line 83
    monitor-enter v0

    .line 84
    :try_start_7
    iget-object v1, p0, Lio/objectbox/BoxStore;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 90
    .line 91
    .line 92
    monitor-exit v0

    .line 93
    goto :goto_3

    .line 94
    :catchall_3
    move-exception v1

    .line 95
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 96
    throw v1

    .line 97
    :cond_4
    :goto_3
    return-void

    .line 98
    :goto_4
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 99
    throw v0
.end method

.method public d(Ljava/lang/Class;)Lio/objectbox/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, Lio/objectbox/BoxStore;->d:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v2, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public e(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->p:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/objectbox/Transaction;

    .line 8
    .line 9
    const-string v1, "Callable threw exception"

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->b()Lio/objectbox/Transaction;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lio/objectbox/BoxStore;->p:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

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
    iget-object v1, p0, Lio/objectbox/BoxStore;->p:Ljava/lang/ThreadLocal;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lio/objectbox/a;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Lio/objectbox/a;->o(Lio/objectbox/Transaction;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v0}, Lio/objectbox/Transaction;->close()V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :catch_0
    move-exception p1

    .line 64
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    invoke-direct {v2, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v2

    .line 70
    :catch_1
    move-exception p1

    .line 71
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :goto_1
    iget-object v1, p0, Lio/objectbox/BoxStore;->p:Ljava/lang/ThreadLocal;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lio/objectbox/a;

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lio/objectbox/a;->o(Lio/objectbox/Transaction;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v0}, Lio/objectbox/Transaction;->close()V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    :try_start_2
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 111
    return-object p1

    .line 112
    :catch_2
    move-exception p1

    .line 113
    new-instance v0, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw v0
.end method

.method public f(Ljava/util/concurrent/Callable;IIZ)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lio/objectbox/BoxStore;->e(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1

    .line 9
    :cond_0
    if-lt p2, v0, :cond_3

    .line 10
    .line 11
    int-to-long v1, p3

    .line 12
    const/4 p3, 0x0

    .line 13
    :goto_0
    if-gt v0, p2, :cond_2

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, Lio/objectbox/BoxStore;->e(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Lio/objectbox/exception/DbException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception p3

    .line 21
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->k()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v5, " of "

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v5, " attempts of calling a read TX failed:"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz p4, :cond_1

    .line 51
    .line 52
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 53
    .line 54
    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    sget-object v4, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/io/PrintStream;->flush()V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lio/objectbox/BoxStore;->i()I

    .line 77
    .line 78
    .line 79
    :cond_1
    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    const-wide/16 v3, 0x2

    .line 83
    .line 84
    mul-long/2addr v1, v3

    .line 85
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catch_1
    move-exception p1

    .line 89
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    .line 91
    .line 92
    throw p3

    .line 93
    :cond_2
    throw p3

    .line 94
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    new-instance p3, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string p4, "Illegal value of attempts: "

    .line 102
    .line 103
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1
.end method

.method public finalize()V
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

.method public final g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Store is closed"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final h()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/objectbox/BoxStore;->k:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

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

.method public i()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/BoxStore;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lio/objectbox/BoxStore;->nativeCleanStaleReadTransactions(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isClosed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lio/objectbox/a;

    .line 22
    .line 23
    invoke-virtual {v1}, Lio/objectbox/a;->a()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/BoxStore;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lio/objectbox/BoxStore;->nativeDiagnose(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->d:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->h:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public native nativePanicModeRemoveAllObjects(JI)J
.end method

.method public native nativeSizeOnDisk(J)J
.end method

.method public native nativeValidate(JJZ)J
.end method

.method public p(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->d:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public q(I)Ljava/lang/Class;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->g:Lz9/b;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    invoke-virtual {v0, v1, v2}, Lz9/b;->a(J)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Class;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Lio/objectbox/exception/DbSchemaException;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "No entity registered for type ID "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Lio/objectbox/exception/DbSchemaException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public r(Ljava/lang/Class;)Lio/objectbox/EntityInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->f:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lio/objectbox/EntityInfo;

    .line 8
    .line 9
    return-object p1
.end method

.method public s(Ljava/lang/Class;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->e:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    new-instance v0, Lio/objectbox/exception/DbSchemaException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "No entity registered for "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Lio/objectbox/exception/DbSchemaException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public u()Lr6/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->v:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public v()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/BoxStore;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public w()I
    .locals 1

    .line 1
    iget v0, p0, Lio/objectbox/BoxStore;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public x(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->k:Ljava/util/concurrent/ExecutorService;

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

.method public y()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/BoxStore;->k:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/objectbox/BoxStore;->o:Z

    .line 2
    .line 3
    return v0
.end method
