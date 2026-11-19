.class public final Laa/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lga/d;

.field public final b:Lv9/c;


# direct methods
.method public constructor <init>(Lga/d;Lv9/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Laa/f;->a:Lga/d;

    .line 15
    .line 16
    iput-object p2, p0, Laa/f;->b:Lv9/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lz9/e;
    .locals 0

    .line 1
    const-string p2, "data"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Laa/f;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V
    .locals 8

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laa/f;->b:Lv9/c;

    .line 7
    .line 8
    invoke-interface {v0}, Lv9/c;->n()Lba/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_e

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_e

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lba/c;

    .line 37
    .line 38
    invoke-interface {v1}, Lba/c;->getId()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->E()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-string v3, "data.paint"

    .line 51
    .line 52
    if-eqz v2, :cond_a

    .line 53
    .line 54
    instance-of v0, v1, Lca/c;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    move-object v0, v1

    .line 65
    check-cast v0, Lca/c;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->F()Lcom/zykj/board/EzyRectF$RectF;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v4, "data.outRect"

    .line 72
    .line 73
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v0, v2}, Lca/c;->p(Landroid/graphics/RectF;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    instance-of v0, v1, Lca/d;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v2, "data.content"

    .line 92
    .line 93
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_2

    .line 101
    .line 102
    move-object v0, v1

    .line 103
    check-cast v0, Lca/d;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Lca/d;->G(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->I()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    check-cast v1, Lca/d;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v1, p1}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_1

    .line 135
    .line 136
    :cond_3
    instance-of v0, v1, Lca/b;

    .line 137
    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v2, "data.pointsList"

    .line 145
    .line 146
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    check-cast v0, Ljava/util/Collection;

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_5

    .line 156
    .line 157
    move-object v0, v1

    .line 158
    check-cast v0, Lca/b;

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    check-cast v4, Ljava/lang/Iterable;

    .line 168
    .line 169
    new-instance v2, Ljava/util/ArrayList;

    .line 170
    .line 171
    const/16 v5, 0xa

    .line 172
    .line 173
    invoke-static {v4, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-eqz v5, :cond_4

    .line 189
    .line 190
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    check-cast v5, Lcom/zykj/board/EzyPointF$PointF;

    .line 195
    .line 196
    const-string v6, "it"

    .line 197
    .line 198
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5}, Lna/m;->e(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_4
    invoke-virtual {v0, v2}, Lca/b;->J(Ljava/util/List;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->I()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_9

    .line 217
    .line 218
    check-cast v1, Lca/b;

    .line 219
    .line 220
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {v1, p1}, Lca/b;->I(Landroid/graphics/Paint;)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_6
    instance-of v0, v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 236
    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->J()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_7

    .line 244
    .line 245
    move-object v0, v1

    .line 246
    check-cast v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 247
    .line 248
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->H()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    const-string v3, "data.renderMatrix"

    .line 253
    .line 254
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v2}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->z(Landroid/graphics/Matrix;)V

    .line 262
    .line 263
    .line 264
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->C()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    const-string v2, "data.filePath"

    .line 269
    .line 270
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-nez v0, :cond_9

    .line 278
    .line 279
    iget-object v0, p0, Laa/f;->a:Lga/d;

    .line 280
    .line 281
    invoke-interface {v0}, Lga/d;->path()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_e

    .line 286
    .line 287
    sget-object v2, Lia/c;->d:Lia/c$a;

    .line 288
    .line 289
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->c:Lcom/zykj/blackboard/enums/DocumentType;

    .line 290
    .line 291
    invoke-virtual {v2, v0, v3}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-nez v0, :cond_8

    .line 296
    .line 297
    goto/16 :goto_3

    .line 298
    .line 299
    :cond_8
    new-instance v2, Ljava/io/File;

    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->C()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-direct {v2, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 313
    .line 314
    const-string v0, "absolutePath"

    .line 315
    .line 316
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;->K(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_9
    :goto_1
    iget-object p1, p0, Laa/f;->b:Lv9/c;

    .line 323
    .line 324
    invoke-interface {p1}, Lv9/c;->g()V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :cond_a
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 329
    .line 330
    if-eqz v2, :cond_0

    .line 331
    .line 332
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 333
    .line 334
    invoke-virtual {v1}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-eqz v4, :cond_c

    .line 347
    .line 348
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    move-object v5, v4

    .line 353
    check-cast v5, Lba/c;

    .line 354
    .line 355
    invoke-interface {v5}, Lba/c;->getId()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->E()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v7

    .line 363
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    if-eqz v6, :cond_b

    .line 368
    .line 369
    instance-of v5, v5, Lea/b;

    .line 370
    .line 371
    if-eqz v5, :cond_b

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_c
    const/4 v4, 0x0

    .line 375
    :goto_2
    check-cast v4, Lba/c;

    .line 376
    .line 377
    if-eqz v4, :cond_0

    .line 378
    .line 379
    check-cast v4, Lea/b;

    .line 380
    .line 381
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->I()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_d

    .line 386
    .line 387
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v0}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    invoke-virtual {v4, v0, v2, p1}, Lea/c;->L(Landroid/graphics/Paint;FF)V

    .line 415
    .line 416
    .line 417
    :cond_d
    const/4 p1, 0x1

    .line 418
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l(Z)V

    .line 419
    .line 420
    .line 421
    iget-object p1, p0, Laa/f;->b:Lv9/c;

    .line 422
    .line 423
    invoke-interface {p1}, Lv9/c;->g()V

    .line 424
    .line 425
    .line 426
    :cond_e
    :goto_3
    return-void
.end method
