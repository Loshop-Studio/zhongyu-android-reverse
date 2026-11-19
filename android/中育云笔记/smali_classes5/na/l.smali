.class public final Lna/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lna/l$a;
    }
.end annotation


# static fields
.field public static final a:Lna/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lna/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/l;->a:Lna/l;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lga/d;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lba/a;
    .locals 17

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    const-string v0, "sourceLoad"

    .line 4
    .line 5
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "pageSnapshot"

    .line 9
    .line 10
    move-object/from16 v6, p2

    .line 11
    .line 12
    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->J()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v1, Lna/l$a;->a:[I

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    aget v0, v1, v0

    .line 30
    .line 31
    :goto_0
    const-string v7, "pageSnapshot.paint"

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const-string v9, "pageSnapshot.matrix"

    .line 35
    .line 36
    const-string v1, "pageSnapshot.outRect"

    .line 37
    .line 38
    const-string v2, "pageSnapshot.id"

    .line 39
    .line 40
    packed-switch v0, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :pswitch_0
    new-instance v0, Lca/b;

    .line 46
    .line 47
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v1, v4

    .line 66
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-direct/range {v0 .. v5}, Lca/b;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 79
    .line 80
    .line 81
    sget-object v1, Lna/l;->a:Lna/l;

    .line 82
    .line 83
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Lca/b;->I(Landroid/graphics/Paint;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Q()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v2, "pageSnapshot.pointListList"

    .line 116
    .line 117
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast v1, Ljava/lang/Iterable;

    .line 121
    .line 122
    new-instance v2, Ljava/util/ArrayList;

    .line 123
    .line 124
    const/16 v3, 0xa

    .line 125
    .line 126
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lcom/zykj/board/EzyPointF$PointF;

    .line 148
    .line 149
    const-string v4, "it"

    .line 150
    .line 151
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v3}, Lna/m;->e(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    invoke-virtual {v0, v2}, Lca/b;->J(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    :cond_2
    :goto_2
    move-object/from16 v3, p1

    .line 166
    .line 167
    :goto_3
    move-object v8, v0

    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :pswitch_1
    new-instance v0, Lca/d;

    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v2}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    move-object v1, v3

    .line 203
    move-object/from16 v3, p1

    .line 204
    .line 205
    invoke-direct/range {v0 .. v5}, Lca/d;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 206
    .line 207
    .line 208
    sget-object v1, Lna/l;->a:Lna/l;

    .line 209
    .line 210
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v2}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v0, v1}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v0, v1}, Lca/d;->G(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :pswitch_2
    new-instance v10, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 247
    .line 248
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    invoke-static {v11, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v0}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 263
    .line 264
    .line 265
    move-result-object v12

    .line 266
    const/16 v15, 0xc

    .line 267
    .line 268
    const/16 v16, 0x0

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const/4 v14, 0x0

    .line 272
    invoke-direct/range {v10 .. v16}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 273
    .line 274
    .line 275
    sget-object v0, Lna/l;->a:Lna/l;

    .line 276
    .line 277
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-static {v1, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v10, v0}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v3, p1

    .line 292
    .line 293
    :goto_4
    move-object v8, v10

    .line 294
    goto/16 :goto_6

    .line 295
    .line 296
    :pswitch_3
    new-instance v0, Lea/a;

    .line 297
    .line 298
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v2}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    move-object v1, v3

    .line 329
    move-object/from16 v3, p1

    .line 330
    .line 331
    invoke-direct/range {v0 .. v5}, Lea/a;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 332
    .line 333
    .line 334
    sget-object v1, Lna/l;->a:Lna/l;

    .line 335
    .line 336
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v2}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->U()Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_2

    .line 355
    .line 356
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    invoke-virtual {v0, v1, v2, v3}, Lea/c;->L(Landroid/graphics/Paint;FF)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_2

    .line 387
    .line 388
    :pswitch_4
    new-instance v0, Lea/b;

    .line 389
    .line 390
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v2}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    move-object v1, v3

    .line 421
    move-object/from16 v3, p1

    .line 422
    .line 423
    invoke-direct/range {v0 .. v5}, Lea/b;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 424
    .line 425
    .line 426
    sget-object v1, Lna/l;->a:Lna/l;

    .line 427
    .line 428
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v2}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->U()Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_2

    .line 447
    .line 448
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-static {v1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    invoke-virtual {v0, v1, v2, v3}, Lea/c;->L(Landroid/graphics/Paint;FF)V

    .line 476
    .line 477
    .line 478
    goto/16 :goto_2

    .line 479
    .line 480
    :pswitch_5
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 481
    .line 482
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v2}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    const-string v1, "pageSnapshot.sourceFileName"

    .line 505
    .line 506
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    move-object v1, v3

    .line 514
    move-object/from16 v3, p1

    .line 515
    .line 516
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;I)V

    .line 517
    .line 518
    .line 519
    sget-object v1, Lna/l;->a:Lna/l;

    .line 520
    .line 521
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v2}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    if-eqz v1, :cond_4

    .line 540
    .line 541
    const-string v2, "filePath"

    .line 542
    .line 543
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    if-nez v2, :cond_3

    .line 551
    .line 552
    goto :goto_5

    .line 553
    :cond_3
    invoke-interface {v3}, Lga/d;->path()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    if-eqz v2, :cond_4

    .line 558
    .line 559
    new-instance v4, Ljava/io/File;

    .line 560
    .line 561
    sget-object v5, Lia/c;->d:Lia/c$a;

    .line 562
    .line 563
    sget-object v7, Lcom/zykj/blackboard/enums/DocumentType;->c:Lcom/zykj/blackboard/enums/DocumentType;

    .line 564
    .line 565
    invoke-virtual {v5, v2, v7}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-direct {v4, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    :cond_4
    :goto_5
    invoke-virtual {v0, v8}, Lca/a;->H(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    goto/16 :goto_3

    .line 580
    .line 581
    :pswitch_6
    new-instance v10, Lda/a;

    .line 582
    .line 583
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v11

    .line 587
    invoke-static {v11, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    invoke-static {v0}, Lna/m;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 598
    .line 599
    .line 600
    move-result-object v12

    .line 601
    const/16 v15, 0xc

    .line 602
    .line 603
    const/16 v16, 0x0

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const/4 v14, 0x0

    .line 607
    invoke-direct/range {v10 .. v16}, Lda/a;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 608
    .line 609
    .line 610
    sget-object v0, Lna/l;->a:Lna/l;

    .line 611
    .line 612
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-static {v1, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0, v1}, Lna/l;->b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v10, v0}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 624
    .line 625
    .line 626
    goto/16 :goto_4

    .line 627
    .line 628
    :goto_6
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    :cond_5
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    if-eqz v1, :cond_6

    .line 641
    .line 642
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    check-cast v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 647
    .line 648
    const-string v2, "childPageSnapshot"

    .line 649
    .line 650
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v2, p0

    .line 654
    .line 655
    invoke-virtual {v2, v3, v1}, Lna/l;->a(Lga/d;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lba/a;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    if-eqz v1, :cond_5

    .line 660
    .line 661
    if-eqz v8, :cond_5

    .line 662
    .line 663
    invoke-virtual {v8, v1}, Lba/a;->s(Lba/c;)V

    .line 664
    .line 665
    .line 666
    goto :goto_7

    .line 667
    :cond_6
    move-object/from16 v2, p0

    .line 668
    .line 669
    return-object v8

    .line 670
    nop

    .line 671
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/16 v8, 0x9

    .line 38
    .line 39
    new-array v8, v8, [F

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    aput v0, v8, v9

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    aput v1, v8, v0

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    aput v2, v8, v0

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    aput v3, v8, v0

    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    aput v4, v8, v0

    .line 55
    .line 56
    const/4 v0, 0x5

    .line 57
    aput v5, v8, v0

    .line 58
    .line 59
    const/4 v0, 0x6

    .line 60
    aput v6, v8, v0

    .line 61
    .line 62
    const/4 v0, 0x7

    .line 63
    aput v7, v8, v0

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    aput p1, v8, v0

    .line 68
    .line 69
    new-instance p1, Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v8}, Landroid/graphics/Matrix;->setValues([F)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method

.method public final c(Ljava/util/List;)Landroid/graphics/Path;
    .locals 8

    .line 1
    const-string v0, "pointList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 31
    .line 32
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    invoke-static {p1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v6, 0x2

    .line 74
    if-eqz v5, :cond_1

    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    add-float/2addr v5, v2

    .line 81
    int-to-float v6, v6

    .line 82
    div-float/2addr v5, v6

    .line 83
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    add-float/2addr v7, v3

    .line 88
    div-float/2addr v7, v6

    .line 89
    invoke-virtual {v0, v2, v3, v5, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    add-float/2addr v5, v2

    .line 109
    int-to-float v6, v6

    .line 110
    div-float/2addr v5, v6

    .line 111
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    add-float/2addr v7, v3

    .line 116
    div-float/2addr v7, v6

    .line 117
    invoke-virtual {v0, v2, v3, v5, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 118
    .line 119
    .line 120
    :goto_1
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    return-object v0
.end method

.method public final d(Ljava/util/List;)Landroid/graphics/RectF;
    .locals 8

    .line 1
    const-string v0, "pointList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v1, Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 41
    .line 42
    .line 43
    move-object v2, p1

    .line 44
    check-cast v2, Ljava/lang/Iterable;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x1

    .line 51
    move v4, v3

    .line 52
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 63
    .line 64
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    cmpg-float v6, v6, v7

    .line 71
    .line 72
    if-nez v6, :cond_1

    .line 73
    .line 74
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 75
    .line 76
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    cmpg-float v5, v6, v5

    .line 81
    .line 82
    if-nez v5, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const/4 v4, 0x0

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    if-eqz v4, :cond_3

    .line 88
    .line 89
    iget p1, v1, Landroid/graphics/PointF;->x:F

    .line 90
    .line 91
    int-to-float v2, v3

    .line 92
    sub-float v3, p1, v2

    .line 93
    .line 94
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 95
    .line 96
    sub-float v4, v1, v2

    .line 97
    .line 98
    add-float/2addr p1, v2

    .line 99
    add-float/2addr v1, v2

    .line 100
    invoke-virtual {v0, v3, v4, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_3
    invoke-virtual {p0, p1}, Lna/l;->c(Ljava/util/List;)Landroid/graphics/Path;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1, v0, v3}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method

.method public final e(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
    .locals 2

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/io/FileInputStream;

    .line 18
    .line 19
    new-instance v1, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method
