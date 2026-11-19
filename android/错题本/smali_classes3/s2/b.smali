.class public final Ls2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lr2/k;

.field public b:F

.field public c:F

.field public final d:F

.field public final e:F

.field public f:Landroid/view/VelocityTracker;

.field public g:Z

.field public h:I

.field public i:I

.field public final j:Landroid/view/ScaleGestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-float v1, v1

    .line 13
    iput v1, p0, Ls2/b;->e:F

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v0, v0

    .line 20
    iput v0, p0, Ls2/b;->d:F

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    iput v0, p0, Ls2/b;->h:I

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Ls2/b;->i:I

    .line 27
    .line 28
    new-instance v0, Ls2/a;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ls2/a;-><init>(Ls2/b;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Landroid/view/ScaleGestureDetector;

    .line 34
    .line 35
    invoke-direct {v1, p1, v0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Ls2/b;->j:Landroid/view/ScaleGestureDetector;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)F
    .locals 1

    .line 1
    :try_start_0
    iget v0, p0, Ls2/b;->i:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final b(Landroid/view/MotionEvent;)F
    .locals 1

    .line 1
    :try_start_0
    iget v0, p0, Ls2/b;->i:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final c(Landroid/view/MotionEvent;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_12

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eq v2, v5, :cond_a

    .line 15
    .line 16
    const/4 v6, 0x2

    .line 17
    if-eq v2, v6, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 25
    .line 26
    if-eqz v1, :cond_11

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 29
    .line 30
    .line 31
    iput-object v4, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual/range {p0 .. p1}, Ls2/b;->a(Landroid/view/MotionEvent;)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual/range {p0 .. p1}, Ls2/b;->b(Landroid/view/MotionEvent;)F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iget v7, v0, Ls2/b;->b:F

    .line 43
    .line 44
    sub-float v7, v2, v7

    .line 45
    .line 46
    iget v8, v0, Ls2/b;->c:F

    .line 47
    .line 48
    sub-float v8, v4, v8

    .line 49
    .line 50
    iget-boolean v9, v0, Ls2/b;->g:Z

    .line 51
    .line 52
    if-nez v9, :cond_3

    .line 53
    .line 54
    mul-float v9, v7, v7

    .line 55
    .line 56
    mul-float v10, v8, v8

    .line 57
    .line 58
    add-float/2addr v10, v9

    .line 59
    float-to-double v9, v10

    .line 60
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    iget v11, v0, Ls2/b;->d:F

    .line 65
    .line 66
    float-to-double v11, v11

    .line 67
    cmpl-double v9, v9, v11

    .line 68
    .line 69
    if-ltz v9, :cond_2

    .line 70
    .line 71
    move v9, v5

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move v9, v3

    .line 74
    :goto_0
    iput-boolean v9, v0, Ls2/b;->g:Z

    .line 75
    .line 76
    :cond_3
    iget-boolean v9, v0, Ls2/b;->g:Z

    .line 77
    .line 78
    if-eqz v9, :cond_11

    .line 79
    .line 80
    iget-object v9, v0, Ls2/b;->a:Lr2/k;

    .line 81
    .line 82
    iget-object v10, v9, Lr2/k;->j:Ls2/b;

    .line 83
    .line 84
    iget-object v11, v10, Ls2/b;->j:Landroid/view/ScaleGestureDetector;

    .line 85
    .line 86
    invoke-virtual {v11}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    if-eqz v11, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    sget-boolean v11, Lr2/k;->z:Z

    .line 94
    .line 95
    if-eqz v11, :cond_5

    .line 96
    .line 97
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    filled-new-array {v11, v12}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    const-string v12, "onDrag: dx: %.2f. dy: %.2f"

    .line 110
    .line 111
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-virtual {v9}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    iget-object v12, v9, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 119
    .line 120
    invoke-virtual {v12, v7, v8}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Lr2/k;->a()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    iget-boolean v11, v9, Lr2/k;->f:Z

    .line 131
    .line 132
    if-eqz v11, :cond_8

    .line 133
    .line 134
    iget-object v10, v10, Ls2/b;->j:Landroid/view/ScaleGestureDetector;

    .line 135
    .line 136
    invoke-virtual {v10}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-nez v10, :cond_8

    .line 141
    .line 142
    iget-boolean v10, v9, Lr2/k;->g:Z

    .line 143
    .line 144
    if-nez v10, :cond_8

    .line 145
    .line 146
    iget v9, v9, Lr2/k;->w:I

    .line 147
    .line 148
    if-eq v9, v6, :cond_7

    .line 149
    .line 150
    if-nez v9, :cond_6

    .line 151
    .line 152
    const/high16 v6, 0x3f800000    # 1.0f

    .line 153
    .line 154
    cmpl-float v6, v7, v6

    .line 155
    .line 156
    if-gez v6, :cond_7

    .line 157
    .line 158
    :cond_6
    if-ne v9, v5, :cond_9

    .line 159
    .line 160
    const/high16 v5, -0x40800000    # -1.0f

    .line 161
    .line 162
    cmpg-float v5, v7, v5

    .line 163
    .line 164
    if-gtz v5, :cond_9

    .line 165
    .line 166
    :cond_7
    if-eqz v8, :cond_9

    .line 167
    .line 168
    invoke-interface {v8, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_8
    if-eqz v8, :cond_9

    .line 173
    .line 174
    invoke-interface {v8, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_1
    iput v2, v0, Ls2/b;->b:F

    .line 178
    .line 179
    iput v4, v0, Ls2/b;->c:F

    .line 180
    .line 181
    iget-object v2, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 182
    .line 183
    if-eqz v2, :cond_11

    .line 184
    .line 185
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_a
    iget-boolean v2, v0, Ls2/b;->g:Z

    .line 190
    .line 191
    if-eqz v2, :cond_10

    .line 192
    .line 193
    iget-object v2, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 194
    .line 195
    if-eqz v2, :cond_10

    .line 196
    .line 197
    invoke-virtual/range {p0 .. p1}, Ls2/b;->a(Landroid/view/MotionEvent;)F

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    iput v2, v0, Ls2/b;->b:F

    .line 202
    .line 203
    invoke-virtual/range {p0 .. p1}, Ls2/b;->b(Landroid/view/MotionEvent;)F

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    iput v2, v0, Ls2/b;->c:F

    .line 208
    .line 209
    iget-object v2, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 210
    .line 211
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 215
    .line 216
    const/16 v2, 0x3e8

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 219
    .line 220
    .line 221
    iget-object v1, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    iget-object v2, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 228
    .line 229
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    iget v6, v0, Ls2/b;->e:F

    .line 246
    .line 247
    cmpl-float v5, v5, v6

    .line 248
    .line 249
    if-ltz v5, :cond_10

    .line 250
    .line 251
    iget-object v5, v0, Ls2/b;->a:Lr2/k;

    .line 252
    .line 253
    neg-float v1, v1

    .line 254
    neg-float v2, v2

    .line 255
    invoke-virtual {v5}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    new-instance v7, Lr2/e;

    .line 260
    .line 261
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-direct {v7, v5, v8}, Lr2/e;-><init>(Lr2/k;Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    iput-object v7, v5, Lr2/k;->v:Lr2/e;

    .line 269
    .line 270
    invoke-static {v6}, Lr2/k;->i(Landroid/widget/ImageView;)I

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    invoke-static {v6}, Lr2/k;->h(Landroid/widget/ImageView;)I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    float-to-int v13, v1

    .line 279
    float-to-int v14, v2

    .line 280
    invoke-virtual {v5}, Lr2/k;->b()Z

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5}, Lr2/k;->f()Landroid/graphics/Matrix;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {v5, v1}, Lr2/k;->e(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-nez v1, :cond_b

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_b
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 295
    .line 296
    neg-float v2, v2

    .line 297
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    int-to-float v2, v8

    .line 302
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    cmpg-float v8, v2, v8

    .line 307
    .line 308
    if-gez v8, :cond_c

    .line 309
    .line 310
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    sub-float/2addr v8, v2

    .line 315
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    move v15, v3

    .line 320
    goto :goto_2

    .line 321
    :cond_c
    move v2, v11

    .line 322
    move v15, v2

    .line 323
    :goto_2
    iget v8, v1, Landroid/graphics/RectF;->top:F

    .line 324
    .line 325
    neg-float v8, v8

    .line 326
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 327
    .line 328
    .line 329
    move-result v12

    .line 330
    int-to-float v8, v9

    .line 331
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    cmpg-float v9, v8, v9

    .line 336
    .line 337
    if-gez v9, :cond_d

    .line 338
    .line 339
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    sub-float/2addr v1, v8

    .line 344
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    move/from16 v17, v3

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_d
    move v1, v12

    .line 352
    move/from16 v17, v1

    .line 353
    .line 354
    :goto_3
    iput v11, v7, Lr2/e;->b:I

    .line 355
    .line 356
    iput v12, v7, Lr2/e;->c:I

    .line 357
    .line 358
    if-ne v11, v2, :cond_e

    .line 359
    .line 360
    if-eq v12, v1, :cond_f

    .line 361
    .line 362
    :cond_e
    const/16 v20, 0x0

    .line 363
    .line 364
    iget-object v3, v7, Lr2/e;->a:Lt2/a;

    .line 365
    .line 366
    iget-object v10, v3, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    .line 370
    move/from16 v18, v1

    .line 371
    .line 372
    move/from16 v16, v2

    .line 373
    .line 374
    invoke-virtual/range {v10 .. v20}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 375
    .line 376
    .line 377
    :cond_f
    :goto_4
    iget-object v1, v5, Lr2/k;->v:Lr2/e;

    .line 378
    .line 379
    invoke-virtual {v6, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 380
    .line 381
    .line 382
    :cond_10
    iget-object v1, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 383
    .line 384
    if-eqz v1, :cond_11

    .line 385
    .line 386
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 387
    .line 388
    .line 389
    iput-object v4, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 390
    .line 391
    :cond_11
    :goto_5
    return-void

    .line 392
    :cond_12
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    iput-object v2, v0, Ls2/b;->f:Landroid/view/VelocityTracker;

    .line 397
    .line 398
    if-eqz v2, :cond_13

    .line 399
    .line 400
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 401
    .line 402
    .line 403
    :cond_13
    invoke-virtual/range {p0 .. p1}, Ls2/b;->a(Landroid/view/MotionEvent;)F

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    iput v2, v0, Ls2/b;->b:F

    .line 408
    .line 409
    invoke-virtual/range {p0 .. p1}, Ls2/b;->b(Landroid/view/MotionEvent;)F

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    iput v1, v0, Ls2/b;->c:F

    .line 414
    .line 415
    iput-boolean v3, v0, Ls2/b;->g:Z

    .line 416
    .line 417
    return-void
.end method

.method public final d(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    if-eq v0, v4, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const v4, 0xff00

    .line 26
    .line 27
    .line 28
    and-int/2addr v0, v4

    .line 29
    shr-int/lit8 v0, v0, 0x8

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget v5, p0, Ls2/b;->h:I

    .line 36
    .line 37
    if-ne v4, v5, :cond_4

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v3, v2

    .line 43
    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, Ls2/b;->h:I

    .line 48
    .line 49
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Ls2/b;->b:F

    .line 54
    .line 55
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Ls2/b;->c:F

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iput v1, p0, Ls2/b;->h:I

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iput v0, p0, Ls2/b;->h:I

    .line 70
    .line 71
    :cond_4
    :goto_1
    iget v0, p0, Ls2/b;->h:I

    .line 72
    .line 73
    if-eq v0, v1, :cond_5

    .line 74
    .line 75
    move v2, v0

    .line 76
    :cond_5
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Ls2/b;->i:I

    .line 81
    .line 82
    :try_start_0
    invoke-virtual {p0, p1}, Ls2/b;->c(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    :catch_0
    return-void
.end method
