.class public final Lr9/d;
.super Lcom/zykj/blackboard/core/action/BaseTouchAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/d$a;
    }
.end annotation


# static fields
.field public static final q:Lr9/d$a;


# instance fields
.field public final e:Landroid/graphics/PointF;

.field public final f:Landroid/graphics/PointF;

.field public g:F

.field public h:Lcom/zykj/board/EzyMatrix$Matrix;

.field public final i:Landroid/graphics/Matrix;

.field public final j:Landroid/graphics/Matrix;

.field public k:I

.field public final l:Ljava/util/List;

.field public final m:Landroid/graphics/RectF;

.field public final n:Landroid/graphics/RectF;

.field public o:F

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr9/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr9/d$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr9/d;->q:Lr9/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/PointF;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr9/d;->e:Landroid/graphics/PointF;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/PointF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr9/d;->f:Landroid/graphics/PointF;

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v0, p0, Lr9/d;->g:F

    .line 21
    .line 22
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lr9/d;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 27
    .line 28
    new-instance v1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 34
    .line 35
    new-instance v1, Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lr9/d;->j:Landroid/graphics/Matrix;

    .line 41
    .line 42
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lr9/d;->l:Ljava/util/List;

    .line 48
    .line 49
    new-instance v1, Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 55
    .line 56
    new-instance v1, Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 62
    .line 63
    iput v0, p0, Lr9/d;->o:F

    .line 64
    .line 65
    return-void
.end method

.method private final A(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;
    .locals 8

    .line 1
    iget v0, p0, Lr9/d;->k:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v2, :cond_4

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-direct {p0, v3, v0}, Lr9/d;->v(FF)Landroid/graphics/PointF;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-direct {p0, v3, p1}, Lr9/d;->v(FF)Landroid/graphics/PointF;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v3}, Lq9/b;->z()Lq9/d;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-virtual {v3}, Lq9/d;->e()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-ne v3, v2, :cond_3

    .line 74
    .line 75
    iget v3, p0, Lr9/d;->g:F

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const v5, 0x38d1b717    # 1.0E-4f

    .line 82
    .line 83
    .line 84
    if-nez v4, :cond_1

    .line 85
    .line 86
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_1

    .line 91
    .line 92
    iget v3, p0, Lr9/d;->g:F

    .line 93
    .line 94
    cmpl-float v3, v3, v5

    .line 95
    .line 96
    if-lez v3, :cond_1

    .line 97
    .line 98
    invoke-virtual {p0, v0, p1}, Lr9/d;->q(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iget v4, p0, Lr9/d;->g:F

    .line 103
    .line 104
    div-float/2addr v3, v4

    .line 105
    iget v4, p0, Lr9/d;->o:F

    .line 106
    .line 107
    invoke-static {v3, v4}, Ljava/lang/Float;->max(FF)F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    goto :goto_0

    .line 112
    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    .line 113
    .line 114
    :goto_0
    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_2

    .line 119
    .line 120
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_2

    .line 125
    .line 126
    cmpl-float v4, v3, v5

    .line 127
    .line 128
    if-lez v4, :cond_2

    .line 129
    .line 130
    iget-object v4, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 131
    .line 132
    iget-object v5, p0, Lr9/d;->f:Landroid/graphics/PointF;

    .line 133
    .line 134
    iget v6, v5, Landroid/graphics/PointF;->x:F

    .line 135
    .line 136
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 137
    .line 138
    invoke-virtual {v4, v3, v3, v6, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 139
    .line 140
    .line 141
    :cond_2
    iget-object v3, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 142
    .line 143
    invoke-virtual {p0, v3}, Lr9/d;->B(Landroid/graphics/Matrix;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    invoke-direct {p0, v0, p1}, Lr9/d;->s(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v0, p0, Lr9/d;->f:Landroid/graphics/PointF;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    iget-object v0, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    invoke-direct {p0, v0, p1}, Lr9/d;->v(FF)Landroid/graphics/PointF;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object v0, p0, Lr9/d;->e:Landroid/graphics/PointF;

    .line 171
    .line 172
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const/4 v4, 0x0

    .line 177
    if-eqz v3, :cond_8

    .line 178
    .line 179
    invoke-virtual {v3}, Lq9/b;->z()Lq9/d;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-eqz v3, :cond_8

    .line 184
    .line 185
    invoke-virtual {v3}, Lq9/d;->a()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-ne v3, v2, :cond_8

    .line 190
    .line 191
    iget-object v3, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 192
    .line 193
    iget v5, v3, Landroid/graphics/RectF;->left:F

    .line 194
    .line 195
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 196
    .line 197
    cmpl-float v6, v5, v3

    .line 198
    .line 199
    if-lez v6, :cond_5

    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v3}, Lv9/c;->q()Landroid/graphics/RectF;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    iget-object v5, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 217
    .line 218
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    sub-float/2addr v3, v5

    .line 223
    int-to-float v5, v1

    .line 224
    div-float/2addr v3, v5

    .line 225
    iget-object v5, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 226
    .line 227
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 228
    .line 229
    sub-float v5, v3, v5

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_5
    iget v6, p1, Landroid/graphics/PointF;->x:F

    .line 233
    .line 234
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 235
    .line 236
    sub-float/2addr v6, v7

    .line 237
    cmpg-float v7, v6, v5

    .line 238
    .line 239
    if-gez v7, :cond_6

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_6
    cmpl-float v5, v6, v3

    .line 243
    .line 244
    if-lez v5, :cond_7

    .line 245
    .line 246
    move v5, v3

    .line 247
    goto :goto_2

    .line 248
    :cond_7
    move v5, v6

    .line 249
    :goto_2
    iget-object v3, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 250
    .line 251
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_8
    move v5, v4

    .line 256
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    if-eqz v3, :cond_c

    .line 261
    .line 262
    invoke-virtual {v3}, Lq9/b;->z()Lq9/d;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    if-eqz v3, :cond_c

    .line 267
    .line 268
    invoke-virtual {v3}, Lq9/d;->f()Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-ne v3, v2, :cond_c

    .line 273
    .line 274
    iget-object v2, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 275
    .line 276
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 277
    .line 278
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 279
    .line 280
    cmpl-float v6, v3, v2

    .line 281
    .line 282
    if-lez v6, :cond_9

    .line 283
    .line 284
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p1}, Lv9/c;->q()Landroid/graphics/RectF;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    sub-float/2addr p1, v0

    .line 306
    int-to-float v0, v1

    .line 307
    div-float/2addr p1, v0

    .line 308
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 309
    .line 310
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 311
    .line 312
    sub-float v3, p1, v0

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_9
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 316
    .line 317
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 318
    .line 319
    sub-float/2addr p1, v0

    .line 320
    cmpg-float v0, p1, v3

    .line 321
    .line 322
    if-gez v0, :cond_a

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_a
    cmpl-float v0, p1, v2

    .line 326
    .line 327
    if-lez v0, :cond_b

    .line 328
    .line 329
    move v3, v2

    .line 330
    goto :goto_4

    .line 331
    :cond_b
    move v3, p1

    .line 332
    :goto_4
    iget-object p1, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 333
    .line 334
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 335
    .line 336
    .line 337
    move v4, v3

    .line 338
    :cond_c
    invoke-direct {p0, v5, v4}, Lr9/d;->H(FF)V

    .line 339
    .line 340
    .line 341
    new-instance p1, Landroid/graphics/Matrix;

    .line 342
    .line 343
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-eqz v0, :cond_d

    .line 351
    .line 352
    invoke-virtual {v0}, Lu9/a;->e()Landroid/graphics/Matrix;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-nez v0, :cond_e

    .line 357
    .line 358
    :cond_d
    new-instance v0, Landroid/graphics/Matrix;

    .line 359
    .line 360
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 361
    .line 362
    .line 363
    :cond_e
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 364
    .line 365
    .line 366
    iget-object v0, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 367
    .line 368
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-eqz v0, :cond_f

    .line 376
    .line 377
    invoke-virtual {v0}, Lu9/a;->e()Landroid/graphics/Matrix;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    if-nez v0, :cond_10

    .line 382
    .line 383
    :cond_f
    new-instance v0, Landroid/graphics/Matrix;

    .line 384
    .line 385
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 386
    .line 387
    .line 388
    :cond_10
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 393
    .line 394
    .line 395
    return-object p1
.end method

.method public static synthetic C(Lr9/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lr9/d;->B(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final H(FF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 23
    .line 24
    sub-float/2addr v2, p1

    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    div-float/2addr v2, p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v1

    .line 32
    :goto_0
    iget-object p1, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    cmpl-float p1, p1, v1

    .line 39
    .line 40
    if-lez p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 43
    .line 44
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 45
    .line 46
    sub-float/2addr v0, p2

    .line 47
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    div-float v1, v0, p1

    .line 52
    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-interface {p1}, Lr9/b;->p()Lma/d;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const/4 v0, 0x1

    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p2}, Lq9/b;->z()Lq9/d;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p2}, Lq9/d;->a()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-ne p2, v0, :cond_2

    .line 83
    .line 84
    invoke-interface {p1, v2}, Lma/d;->a(F)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2}, Lq9/b;->z()Lq9/d;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-eqz p2, :cond_3

    .line 98
    .line 99
    invoke-virtual {p2}, Lq9/d;->f()Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-ne p2, v0, :cond_3

    .line 104
    .line 105
    invoke-interface {p1, v1}, Lma/d;->b(F)V

    .line 106
    .line 107
    .line 108
    :cond_3
    return-void
.end method

.method private final r(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v1, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    mul-float/2addr p1, v1

    .line 17
    sub-float/2addr v2, p1

    .line 18
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v0

    .line 24
    :goto_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iget-object v0, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 31
    .line 32
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    mul-float/2addr p2, v0

    .line 39
    sub-float/2addr v1, p2

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    iget-object p2, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p2, p1, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {p2, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 66
    .line 67
    .line 68
    :cond_3
    new-instance p1, Landroid/graphics/Matrix;

    .line 69
    .line 70
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lu9/a;->e()Landroid/graphics/Matrix;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lu9/a;->e()Landroid/graphics/Matrix;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 108
    .line 109
    .line 110
    return-object p1
.end method

.method private final s(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 7
    .line 8
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    add-float/2addr v1, v2

    .line 11
    const/4 v2, 0x2

    .line 12
    int-to-float v2, v2

    .line 13
    div-float/2addr v1, v2

    .line 14
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    add-float/2addr p1, p2

    .line 19
    div-float/2addr p1, v2

    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method private final v(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lna/o;->a:Lna/o;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, p1, p2, v1}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method private final x()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lv9/c;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lr9/d;->l:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final y(Landroid/graphics/Matrix;J)V
    .locals 1

    .line 1
    invoke-static {p1}, Lna/n;->c(Landroid/graphics/Matrix;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lv9/c;->r(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lr9/d;->m(Landroid/graphics/Matrix;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final z(Landroid/graphics/Matrix;Ljava/lang/Long;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    :goto_0
    invoke-virtual {p0, p1, v0, v1}, Lr9/d;->m(Landroid/graphics/Matrix;J)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p1, p0, Lr9/d;->l:Ljava/util/List;

    .line 18
    .line 19
    check-cast p1, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p2, p0, Lr9/d;->l:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {p2}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 40
    .line 41
    invoke-static {p2}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p1, p2}, Lv9/c;->D(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Lr9/d;->J()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {p1, v0, p2, v0}, Lv9/c$a;->a(Lv9/c;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void
.end method


# virtual methods
.method public final B(Landroid/graphics/Matrix;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lv9/c;->G()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lv9/c;->q()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lq9/b;->z()Lq9/d;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lq9/d;->b()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, 0x1

    .line 50
    if-lt v3, v4, :cond_5

    .line 51
    .line 52
    invoke-virtual {v2}, Lq9/d;->c()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-lt v3, v4, :cond_5

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v2}, Lq9/d;->c()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    int-to-float v4, v4

    .line 67
    mul-float/2addr v3, v4

    .line 68
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {v2}, Lq9/d;->b()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    int-to-float v2, v2

    .line 77
    mul-float/2addr v0, v2

    .line 78
    iget-object v2, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-virtual {v2, v4, v4, v3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    :cond_1
    new-instance v0, Landroid/graphics/Matrix;

    .line 97
    .line 98
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 99
    .line 100
    .line 101
    :cond_2
    if-eqz p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    iget-object v2, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 112
    .line 113
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 114
    .line 115
    iget-object v3, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 116
    .line 117
    iget v4, v3, Landroid/graphics/RectF;->right:F

    .line 118
    .line 119
    sub-float/2addr v2, v4

    .line 120
    iget v4, v1, Landroid/graphics/RectF;->bottom:F

    .line 121
    .line 122
    iget v5, v3, Landroid/graphics/RectF;->bottom:F

    .line 123
    .line 124
    sub-float/2addr v4, v5

    .line 125
    iget v5, v1, Landroid/graphics/RectF;->left:F

    .line 126
    .line 127
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 128
    .line 129
    sub-float/2addr v5, v6

    .line 130
    iget v6, v1, Landroid/graphics/RectF;->top:F

    .line 131
    .line 132
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 133
    .line 134
    sub-float/2addr v6, v3

    .line 135
    invoke-virtual {v0, v2, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 136
    .line 137
    .line 138
    if-nez p1, :cond_4

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    div-float/2addr p1, v0

    .line 151
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    iget-object v1, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    div-float/2addr v0, v1

    .line 162
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iput p1, p0, Lr9/d;->o:F

    .line 167
    .line 168
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string v0, "configRectF -> "

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    const-string v0, "MoveAction"

    .line 188
    .line 189
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    new-instance p1, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v1, "limitRenderRectF -> "

    .line 198
    .line 199
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    iget-object v1, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 203
    .line 204
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_5
    iget-object p1, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 216
    .line 217
    invoke-virtual {p1}, Landroid/graphics/RectF;->setEmpty()V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v0, v1, v2}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    iput-object v0, p0, Lr9/d;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 24
    .line 25
    return-void
.end method

.method public final E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-direct {p0, v1, v0}, Lr9/d;->v(FF)Landroid/graphics/PointF;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, v2, p1}, Lr9/d;->v(FF)Landroid/graphics/PointF;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v1, p0, Lr9/d;->f:Landroid/graphics/PointF;

    .line 44
    .line 45
    invoke-direct {p0, v0, p1}, Lr9/d;->s(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0, p1}, Lr9/d;->q(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput p1, p0, Lr9/d;->g:F

    .line 57
    .line 58
    return-void
.end method

.method public final F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/d;->e:Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-direct {p0, v1, p1}, Lr9/d;->v(FF)Landroid/graphics/PointF;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final G()V
    .locals 2

    .line 1
    sget-object v0, Lna/i;->a:Lna/i;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/d;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/d;->l:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lr9/d;->k:I

    .line 13
    .line 14
    iget-object v0, p0, Lr9/d;->e:Landroid/graphics/PointF;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 18
    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iput v0, p0, Lr9/d;->g:F

    .line 23
    .line 24
    iget-object v0, p0, Lr9/d;->f:Landroid/graphics/PointF;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final J()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lr9/d;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 8
    .line 9
    const-string v2, "originMatrix"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    :cond_0
    new-instance v2, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_1
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    invoke-static {v2, v3, v4}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lr9/d;->l:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v0, v1, v2, v3}, Lr9/b;->b(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method

.method public final K(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr9/d;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    iput v0, p0, Lr9/d;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lr9/d;->t()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lr9/d;->E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lr9/d;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lr9/d;->t()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-direct {p0, p1}, Lr9/d;->A(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p0, v0, p1}, Lr9/d;->z(Landroid/graphics/Matrix;Ljava/lang/Long;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lr9/d;->k:I

    .line 11
    .line 12
    return-void
.end method

.method public d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lr9/d;->t()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lr9/d;->A(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-direct {p0, v0, v1, v2}, Lr9/d;->y(Landroid/graphics/Matrix;J)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput v0, p0, Lr9/d;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lr9/d;->t()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Lr9/d;->G()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p0, v1, v0, v1}, Lr9/d;->C(Lr9/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lr9/d;->F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lr9/d;->D()V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lr9/d;->x()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final m(Landroid/graphics/Matrix;J)V
    .locals 1

    .line 1
    invoke-static {p1}, Lna/n;->c(Landroid/graphics/Matrix;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lr9/d;->l:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, p2, p3}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final n(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lr9/d;->r(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {p0, p1, p2}, Lr9/d;->z(Landroid/graphics/Matrix;Ljava/lang/Long;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lr9/d;->C(Lr9/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lr9/d;->x()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final p(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/d;->m:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lr9/d;->r(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-direct {p0, p1, v0, v1}, Lr9/d;->y(Landroid/graphics/Matrix;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final q(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 4

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    float-to-double v0, v0

    .line 7
    const/4 v2, 0x2

    .line 8
    int-to-double v2, v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float v0, v0

    .line 14
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    sub-float/2addr p1, p2

    .line 19
    float-to-double p1, p1

    .line 20
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    double-to-float p1, p1

    .line 25
    add-float/2addr v0, p1

    .line 26
    float-to-double p1, v0

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    double-to-float p1, p1

    .line 32
    return p1
.end method

.method public final t()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr9/d;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lq9/b;->z()Lq9/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lq9/d;->g()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public final u()F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lr9/d;->C(Lr9/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 7
    .line 8
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 9
    .line 10
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    cmpl-float v2, v1, v2

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    div-float/2addr v1, v0

    .line 21
    return v1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final w()F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lr9/d;->C(Lr9/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/d;->n:Landroid/graphics/RectF;

    .line 7
    .line 8
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 9
    .line 10
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 11
    .line 12
    cmpl-float v2, v1, v2

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    div-float/2addr v1, v0

    .line 21
    return v1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method
