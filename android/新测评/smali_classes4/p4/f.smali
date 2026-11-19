.class public final Lp4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv4/d;

.field public final b:Lk4/c;


# direct methods
.method public constructor <init>(Lv4/d;Lk4/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lp4/f;->a:Lv4/d;

    .line 15
    .line 16
    iput-object p2, p0, Lp4/f;->b:Lk4/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lo4/e;
    .locals 0

    .line 1
    const-string p2, "data"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lp4/f;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp4/f;->b:Lk4/c;

    .line 7
    .line 8
    invoke-interface {v0}, Lk4/c;->n()Lq4/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    invoke-interface {v0}, Lq4/c;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_e

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_e

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lq4/c;

    .line 35
    .line 36
    invoke-interface {v1}, Lq4/c;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->E()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const-string v3, "data.paint"

    .line 49
    .line 50
    if-eqz v2, :cond_a

    .line 51
    .line 52
    instance-of v0, v1, Lr4/c;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    check-cast v0, Lr4/c;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->F()Lcom/zykj/board/EzyRectF$RectF;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v4, "data.outRect"

    .line 70
    .line 71
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Le5/l;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v0, v2}, Lr4/c;->o(Landroid/graphics/RectF;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    instance-of v0, v1, Lr4/d;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v2, "data.content"

    .line 90
    .line 91
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    move-object v0, v1

    .line 101
    check-cast v0, Lr4/d;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, v2}, Lr4/d;->K(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    check-cast v1, Lr4/d;

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Le5/l;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {v1, p1}, Lr4/d;->L(Landroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_1

    .line 133
    .line 134
    :cond_3
    instance-of v0, v1, Lr4/b;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const-string v2, "data.pointsList"

    .line 143
    .line 144
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_5

    .line 152
    .line 153
    move-object v0, v1

    .line 154
    check-cast v0, Lr4/b;

    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPointsList()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v2, Ljava/util/ArrayList;

    .line 164
    .line 165
    const/16 v5, 0xa

    .line 166
    .line 167
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_4

    .line 183
    .line 184
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    check-cast v5, Lcom/zykj/board/EzyPointF$PointF;

    .line 189
    .line 190
    const-string v6, "it"

    .line 191
    .line 192
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v5}, Le5/l;->e(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_4
    invoke-virtual {v0, v2}, Lr4/b;->N(Ljava/util/List;)V

    .line 204
    .line 205
    .line 206
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    check-cast v1, Lr4/b;

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {p1}, Le5/l;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {v1, p1}, Lr4/b;->M(Landroid/graphics/Paint;)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_6
    instance-of v0, v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 230
    .line 231
    if-eqz v0, :cond_9

    .line 232
    .line 233
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->I()Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_7

    .line 238
    .line 239
    move-object v0, v1

    .line 240
    check-cast v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->H()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const-string v3, "data.renderMatrix"

    .line 247
    .line 248
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Le5/m;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->A(Landroid/graphics/Matrix;)V

    .line 256
    .line 257
    .line 258
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->C()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    const-string v2, "data.filePath"

    .line 263
    .line 264
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_9

    .line 272
    .line 273
    iget-object v0, p0, Lp4/f;->a:Lv4/d;

    .line 274
    .line 275
    invoke-interface {v0}, Lv4/d;->path()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-eqz v0, :cond_e

    .line 280
    .line 281
    sget-object v2, Lx4/c;->d:Lx4/c$a;

    .line 282
    .line 283
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->a:Lcom/zykj/blackboard/enums/DocumentType;

    .line 284
    .line 285
    invoke-virtual {v2, v0, v3}, Lx4/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-nez v0, :cond_8

    .line 290
    .line 291
    goto/16 :goto_3

    .line 292
    .line 293
    :cond_8
    new-instance v2, Ljava/io/File;

    .line 294
    .line 295
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->C()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-direct {v2, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 307
    .line 308
    const-string v0, "absolutePath"

    .line 309
    .line 310
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;->O(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_9
    :goto_1
    iget-object p1, p0, Lp4/f;->b:Lk4/c;

    .line 317
    .line 318
    invoke-interface {p1}, Lk4/c;->e()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_a
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 323
    .line 324
    if-eqz v2, :cond_0

    .line 325
    .line 326
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 327
    .line 328
    invoke-virtual {v1}, Lq4/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_c

    .line 341
    .line 342
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    move-object v5, v4

    .line 347
    check-cast v5, Lq4/c;

    .line 348
    .line 349
    invoke-interface {v5}, Lq4/c;->getId()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->E()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-eqz v6, :cond_b

    .line 362
    .line 363
    instance-of v5, v5, Lt4/b;

    .line 364
    .line 365
    if-eqz v5, :cond_b

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_c
    const/4 v4, 0x0

    .line 369
    :goto_2
    check-cast v4, Lq4/c;

    .line 370
    .line 371
    if-eqz v4, :cond_0

    .line 372
    .line 373
    check-cast v4, Lt4/b;

    .line 374
    .line 375
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_d

    .line 380
    .line 381
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v0}, Le5/l;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->s()F

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->G()Lcom/zykj/board/EzyPaint$Paint;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->t()F

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    invoke-virtual {v4, v0, v2, p1}, Lt4/c;->L(Landroid/graphics/Paint;FF)V

    .line 409
    .line 410
    .line 411
    :cond_d
    const/4 p1, 0x1

    .line 412
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l(Z)V

    .line 413
    .line 414
    .line 415
    iget-object p1, p0, Lp4/f;->b:Lk4/c;

    .line 416
    .line 417
    invoke-interface {p1}, Lk4/c;->e()V

    .line 418
    .line 419
    .line 420
    :cond_e
    :goto_3
    return-void
.end method
