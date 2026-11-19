.class public final Lz2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public C:[F

.field public final D:Landroid/graphics/RectF;

.field public E:I

.field public F:I

.field public G:I

.field public final H:Ljava/lang/ref/WeakReference;

.field public I:Z

.field public final J:Landroid/graphics/Path;

.field public K:Z

.field public L:I

.field public M:F

.field public N:I

.field public final O:I

.field public final P:I

.field public final Q:I

.field public final R:I

.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I

.field public x:I

.field public y:Landroid/graphics/Paint;

.field public final z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lz2/c;->a:I

    .line 6
    .line 7
    iput v0, p0, Lz2/c;->b:I

    .line 8
    .line 9
    iput v0, p0, Lz2/c;->c:I

    .line 10
    .line 11
    iput v0, p0, Lz2/c;->d:I

    .line 12
    .line 13
    iput v0, p0, Lz2/c;->e:I

    .line 14
    .line 15
    iput v0, p0, Lz2/c;->f:I

    .line 16
    .line 17
    iput v0, p0, Lz2/c;->g:I

    .line 18
    .line 19
    const/16 v1, 0xff

    .line 20
    .line 21
    iput v1, p0, Lz2/c;->i:I

    .line 22
    .line 23
    iput v0, p0, Lz2/c;->j:I

    .line 24
    .line 25
    iput v0, p0, Lz2/c;->k:I

    .line 26
    .line 27
    iput v0, p0, Lz2/c;->l:I

    .line 28
    .line 29
    iput v1, p0, Lz2/c;->n:I

    .line 30
    .line 31
    iput v0, p0, Lz2/c;->o:I

    .line 32
    .line 33
    iput v0, p0, Lz2/c;->p:I

    .line 34
    .line 35
    iput v0, p0, Lz2/c;->q:I

    .line 36
    .line 37
    iput v1, p0, Lz2/c;->s:I

    .line 38
    .line 39
    iput v0, p0, Lz2/c;->t:I

    .line 40
    .line 41
    iput v0, p0, Lz2/c;->u:I

    .line 42
    .line 43
    iput v0, p0, Lz2/c;->v:I

    .line 44
    .line 45
    iput v1, p0, Lz2/c;->x:I

    .line 46
    .line 47
    iput v0, p0, Lz2/c;->B:I

    .line 48
    .line 49
    iput v0, p0, Lz2/c;->E:I

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    iput v1, p0, Lz2/c;->F:I

    .line 53
    .line 54
    iput v0, p0, Lz2/c;->G:I

    .line 55
    .line 56
    iput-boolean v0, p0, Lz2/c;->I:Z

    .line 57
    .line 58
    new-instance v2, Landroid/graphics/Path;

    .line 59
    .line 60
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lz2/c;->J:Landroid/graphics/Path;

    .line 64
    .line 65
    iput-boolean v1, p0, Lz2/c;->K:Z

    .line 66
    .line 67
    iput v0, p0, Lz2/c;->L:I

    .line 68
    .line 69
    const/high16 v2, -0x1000000

    .line 70
    .line 71
    iput v2, p0, Lz2/c;->N:I

    .line 72
    .line 73
    iput v0, p0, Lz2/c;->O:I

    .line 74
    .line 75
    iput v0, p0, Lz2/c;->P:I

    .line 76
    .line 77
    iput v0, p0, Lz2/c;->Q:I

    .line 78
    .line 79
    iput v0, p0, Lz2/c;->R:I

    .line 80
    .line 81
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    invoke-direct {v2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iput-object v2, p0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 87
    .line 88
    sget p4, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    .line 89
    .line 90
    invoke-static {p1, p4, v0}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    iput p4, p0, Lz2/c;->h:I

    .line 95
    .line 96
    iput p4, p0, Lz2/c;->m:I

    .line 97
    .line 98
    new-instance p4, Landroid/graphics/PorterDuffXfermode;

    .line 99
    .line 100
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 101
    .line 102
    invoke-direct {p4, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 103
    .line 104
    .line 105
    new-instance p4, Landroid/graphics/Paint;

    .line 106
    .line 107
    invoke-direct {p4}, Landroid/graphics/Paint;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p4, p0, Lz2/c;->z:Landroid/graphics/Paint;

    .line 111
    .line 112
    invoke-virtual {p4, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 113
    .line 114
    .line 115
    sget p4, Lcom/xuexiang/xui/R$attr;->xui_general_shadow_alpha:I

    .line 116
    .line 117
    new-instance v2, Landroid/util/TypedValue;

    .line 118
    .line 119
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3, p4, v2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/util/TypedValue;->getFloat()F

    .line 130
    .line 131
    .line 132
    move-result p4

    .line 133
    iput p4, p0, Lz2/c;->M:F

    .line 134
    .line 135
    new-instance p4, Landroid/graphics/RectF;

    .line 136
    .line 137
    invoke-direct {p4}, Landroid/graphics/RectF;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object p4, p0, Lz2/c;->D:Landroid/graphics/RectF;

    .line 141
    .line 142
    if-nez p2, :cond_1

    .line 143
    .line 144
    if-eqz p3, :cond_0

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_0
    move v2, v0

    .line 148
    move v3, v2

    .line 149
    goto/16 :goto_3

    .line 150
    .line 151
    :cond_1
    :goto_0
    sget-object p4, Lcom/xuexiang/xui/R$styleable;->XUILayout:[I

    .line 152
    .line 153
    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    move p4, v0

    .line 162
    move v1, p4

    .line 163
    move v2, v1

    .line 164
    move v3, v2

    .line 165
    :goto_1
    if-ge p4, p3, :cond_24

    .line 166
    .line 167
    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_maxWidth:I

    .line 172
    .line 173
    if-ne v4, v5, :cond_2

    .line 174
    .line 175
    iget v5, p0, Lz2/c;->a:I

    .line 176
    .line 177
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    iput v4, p0, Lz2/c;->a:I

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_2
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_maxHeight:I

    .line 186
    .line 187
    if-ne v4, v5, :cond_3

    .line 188
    .line 189
    iget v5, p0, Lz2/c;->b:I

    .line 190
    .line 191
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    iput v4, p0, Lz2/c;->b:I

    .line 196
    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :cond_3
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_minWidth:I

    .line 200
    .line 201
    if-ne v4, v5, :cond_4

    .line 202
    .line 203
    iget v5, p0, Lz2/c;->c:I

    .line 204
    .line 205
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    iput v4, p0, Lz2/c;->c:I

    .line 210
    .line 211
    goto/16 :goto_2

    .line 212
    .line 213
    :cond_4
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_minHeight:I

    .line 214
    .line 215
    if-ne v4, v5, :cond_5

    .line 216
    .line 217
    iget v5, p0, Lz2/c;->d:I

    .line 218
    .line 219
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    iput v4, p0, Lz2/c;->d:I

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_5
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerColor:I

    .line 228
    .line 229
    if-ne v4, v5, :cond_6

    .line 230
    .line 231
    iget v5, p0, Lz2/c;->h:I

    .line 232
    .line 233
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    iput v4, p0, Lz2/c;->h:I

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_6
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerHeight:I

    .line 242
    .line 243
    if-ne v4, v5, :cond_7

    .line 244
    .line 245
    iget v5, p0, Lz2/c;->e:I

    .line 246
    .line 247
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    iput v4, p0, Lz2/c;->e:I

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :cond_7
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerInsetLeft:I

    .line 256
    .line 257
    if-ne v4, v5, :cond_8

    .line 258
    .line 259
    iget v5, p0, Lz2/c;->f:I

    .line 260
    .line 261
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    iput v4, p0, Lz2/c;->f:I

    .line 266
    .line 267
    goto/16 :goto_2

    .line 268
    .line 269
    :cond_8
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerInsetRight:I

    .line 270
    .line 271
    if-ne v4, v5, :cond_9

    .line 272
    .line 273
    iget v5, p0, Lz2/c;->g:I

    .line 274
    .line 275
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    iput v4, p0, Lz2/c;->g:I

    .line 280
    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_9
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerColor:I

    .line 284
    .line 285
    if-ne v4, v5, :cond_a

    .line 286
    .line 287
    iget v5, p0, Lz2/c;->m:I

    .line 288
    .line 289
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    iput v4, p0, Lz2/c;->m:I

    .line 294
    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :cond_a
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerHeight:I

    .line 298
    .line 299
    if-ne v4, v5, :cond_b

    .line 300
    .line 301
    iget v5, p0, Lz2/c;->j:I

    .line 302
    .line 303
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    iput v4, p0, Lz2/c;->j:I

    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :cond_b
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerInsetLeft:I

    .line 312
    .line 313
    if-ne v4, v5, :cond_c

    .line 314
    .line 315
    iget v5, p0, Lz2/c;->k:I

    .line 316
    .line 317
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    iput v4, p0, Lz2/c;->k:I

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_c
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerInsetRight:I

    .line 326
    .line 327
    if-ne v4, v5, :cond_d

    .line 328
    .line 329
    iget v5, p0, Lz2/c;->l:I

    .line 330
    .line 331
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    iput v4, p0, Lz2/c;->l:I

    .line 336
    .line 337
    goto/16 :goto_2

    .line 338
    .line 339
    :cond_d
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerColor:I

    .line 340
    .line 341
    if-ne v4, v5, :cond_e

    .line 342
    .line 343
    iget v5, p0, Lz2/c;->r:I

    .line 344
    .line 345
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    iput v4, p0, Lz2/c;->r:I

    .line 350
    .line 351
    goto/16 :goto_2

    .line 352
    .line 353
    :cond_e
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerWidth:I

    .line 354
    .line 355
    if-ne v4, v5, :cond_f

    .line 356
    .line 357
    iget v5, p0, Lz2/c;->j:I

    .line 358
    .line 359
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    iput v4, p0, Lz2/c;->o:I

    .line 364
    .line 365
    goto/16 :goto_2

    .line 366
    .line 367
    :cond_f
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerInsetTop:I

    .line 368
    .line 369
    if-ne v4, v5, :cond_10

    .line 370
    .line 371
    iget v5, p0, Lz2/c;->p:I

    .line 372
    .line 373
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    iput v4, p0, Lz2/c;->p:I

    .line 378
    .line 379
    goto/16 :goto_2

    .line 380
    .line 381
    :cond_10
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerInsetBottom:I

    .line 382
    .line 383
    if-ne v4, v5, :cond_11

    .line 384
    .line 385
    iget v5, p0, Lz2/c;->q:I

    .line 386
    .line 387
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    iput v4, p0, Lz2/c;->q:I

    .line 392
    .line 393
    goto/16 :goto_2

    .line 394
    .line 395
    :cond_11
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerColor:I

    .line 396
    .line 397
    if-ne v4, v5, :cond_12

    .line 398
    .line 399
    iget v5, p0, Lz2/c;->w:I

    .line 400
    .line 401
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    iput v4, p0, Lz2/c;->w:I

    .line 406
    .line 407
    goto/16 :goto_2

    .line 408
    .line 409
    :cond_12
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerWidth:I

    .line 410
    .line 411
    if-ne v4, v5, :cond_13

    .line 412
    .line 413
    iget v5, p0, Lz2/c;->t:I

    .line 414
    .line 415
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    iput v4, p0, Lz2/c;->t:I

    .line 420
    .line 421
    goto/16 :goto_2

    .line 422
    .line 423
    :cond_13
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerInsetTop:I

    .line 424
    .line 425
    if-ne v4, v5, :cond_14

    .line 426
    .line 427
    iget v5, p0, Lz2/c;->u:I

    .line 428
    .line 429
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    iput v4, p0, Lz2/c;->u:I

    .line 434
    .line 435
    goto/16 :goto_2

    .line 436
    .line 437
    :cond_14
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerInsetBottom:I

    .line 438
    .line 439
    if-ne v4, v5, :cond_15

    .line 440
    .line 441
    iget v5, p0, Lz2/c;->v:I

    .line 442
    .line 443
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    iput v4, p0, Lz2/c;->v:I

    .line 448
    .line 449
    goto/16 :goto_2

    .line 450
    .line 451
    :cond_15
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_borderColor:I

    .line 452
    .line 453
    if-ne v4, v5, :cond_16

    .line 454
    .line 455
    iget v5, p0, Lz2/c;->E:I

    .line 456
    .line 457
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    iput v4, p0, Lz2/c;->E:I

    .line 462
    .line 463
    goto/16 :goto_2

    .line 464
    .line 465
    :cond_16
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_borderWidth:I

    .line 466
    .line 467
    if-ne v4, v5, :cond_17

    .line 468
    .line 469
    iget v5, p0, Lz2/c;->F:I

    .line 470
    .line 471
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    iput v4, p0, Lz2/c;->F:I

    .line 476
    .line 477
    goto/16 :goto_2

    .line 478
    .line 479
    :cond_17
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_radius:I

    .line 480
    .line 481
    if-ne v4, v5, :cond_18

    .line 482
    .line 483
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    goto/16 :goto_2

    .line 488
    .line 489
    :cond_18
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outerNormalColor:I

    .line 490
    .line 491
    if-ne v4, v5, :cond_19

    .line 492
    .line 493
    iget v5, p0, Lz2/c;->G:I

    .line 494
    .line 495
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    iput v4, p0, Lz2/c;->G:I

    .line 500
    .line 501
    goto/16 :goto_2

    .line 502
    .line 503
    :cond_19
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_hideRadiusSide:I

    .line 504
    .line 505
    if-ne v4, v5, :cond_1a

    .line 506
    .line 507
    iget v5, p0, Lz2/c;->B:I

    .line 508
    .line 509
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    iput v4, p0, Lz2/c;->B:I

    .line 514
    .line 515
    goto :goto_2

    .line 516
    :cond_1a
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_showBorderOnlyBeforeL:I

    .line 517
    .line 518
    if-ne v4, v5, :cond_1b

    .line 519
    .line 520
    iget-boolean v5, p0, Lz2/c;->K:Z

    .line 521
    .line 522
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    iput-boolean v4, p0, Lz2/c;->K:Z

    .line 527
    .line 528
    goto :goto_2

    .line 529
    :cond_1b
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_shadowElevation:I

    .line 530
    .line 531
    if-ne v4, v5, :cond_1c

    .line 532
    .line 533
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    goto :goto_2

    .line 538
    :cond_1c
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_shadowAlpha:I

    .line 539
    .line 540
    if-ne v4, v5, :cond_1d

    .line 541
    .line 542
    iget v5, p0, Lz2/c;->M:F

    .line 543
    .line 544
    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    iput v4, p0, Lz2/c;->M:F

    .line 549
    .line 550
    goto :goto_2

    .line 551
    :cond_1d
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_useThemeGeneralShadowElevation:I

    .line 552
    .line 553
    if-ne v4, v5, :cond_1e

    .line 554
    .line 555
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    goto :goto_2

    .line 560
    :cond_1e
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetLeft:I

    .line 561
    .line 562
    if-ne v4, v5, :cond_1f

    .line 563
    .line 564
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    iput v4, p0, Lz2/c;->O:I

    .line 569
    .line 570
    goto :goto_2

    .line 571
    :cond_1f
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetRight:I

    .line 572
    .line 573
    if-ne v4, v5, :cond_20

    .line 574
    .line 575
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    iput v4, p0, Lz2/c;->P:I

    .line 580
    .line 581
    goto :goto_2

    .line 582
    :cond_20
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetTop:I

    .line 583
    .line 584
    if-ne v4, v5, :cond_21

    .line 585
    .line 586
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    iput v4, p0, Lz2/c;->Q:I

    .line 591
    .line 592
    goto :goto_2

    .line 593
    :cond_21
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetBottom:I

    .line 594
    .line 595
    if-ne v4, v5, :cond_22

    .line 596
    .line 597
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    iput v4, p0, Lz2/c;->R:I

    .line 602
    .line 603
    goto :goto_2

    .line 604
    :cond_22
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineExcludePadding:I

    .line 605
    .line 606
    if-ne v4, v5, :cond_23

    .line 607
    .line 608
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    iput-boolean v4, p0, Lz2/c;->I:Z

    .line 613
    .line 614
    :cond_23
    :goto_2
    add-int/lit8 p4, p4, 0x1

    .line 615
    .line 616
    goto/16 :goto_1

    .line 617
    .line 618
    :cond_24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 619
    .line 620
    .line 621
    move v0, v1

    .line 622
    :goto_3
    if-nez v0, :cond_25

    .line 623
    .line 624
    if-eqz v2, :cond_25

    .line 625
    .line 626
    sget p2, Lcom/xuexiang/xui/R$attr;->xui_general_shadow_elevation:I

    .line 627
    .line 628
    const/4 p3, -0x1

    .line 629
    invoke-static {p1, p2, p3}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    :cond_25
    iget p1, p0, Lz2/c;->B:I

    .line 634
    .line 635
    iget p2, p0, Lz2/c;->M:F

    .line 636
    .line 637
    invoke-virtual {p0, v3, p1, v0, p2}, Lz2/c;->l(IIIF)V

    .line 638
    .line 639
    .line 640
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v1, p0, Lz2/c;->E:I

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lz2/c;->A:I

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget v1, p0, Lz2/c;->G:I

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, Lz2/c;->K:Z

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    iget v1, p0, Lz2/c;->L:I

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void

    .line 34
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-boolean v3, p0, Lz2/c;->I:Z

    .line 43
    .line 44
    iget-object v4, p0, Lz2/c;->D:Landroid/graphics/RectF;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    int-to-float v3, v3

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    int-to-float v5, v5

    .line 62
    add-int/lit8 v1, v1, -0x1

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    sub-int/2addr v1, v6

    .line 69
    int-to-float v1, v1

    .line 70
    add-int/lit8 v2, v2, -0x1

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    sub-int/2addr v2, v0

    .line 77
    int-to-float v0, v2

    .line 78
    invoke-virtual {v4, v3, v5, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 83
    .line 84
    int-to-float v0, v1

    .line 85
    add-int/lit8 v2, v2, -0x1

    .line 86
    .line 87
    int-to-float v1, v2

    .line 88
    const/high16 v2, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual {v4, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget v0, p0, Lz2/c;->A:I

    .line 94
    .line 95
    iget-object v1, p0, Lz2/c;->z:Landroid/graphics/Paint;

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    iget v0, p0, Lz2/c;->E:I

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    .line 103
    .line 104
    iget v0, p0, Lz2/c;->F:I

    .line 105
    .line 106
    int-to-float v0, v0

    .line 107
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lz2/c;->C:[F

    .line 116
    .line 117
    if-nez v0, :cond_5

    .line 118
    .line 119
    iget v0, p0, Lz2/c;->A:I

    .line 120
    .line 121
    int-to-float v0, v0

    .line 122
    invoke-virtual {p1, v4, v0, v0, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    iget-object v2, p0, Lz2/c;->J:Landroid/graphics/Path;

    .line 127
    .line 128
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 129
    .line 130
    .line 131
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 132
    .line 133
    invoke-virtual {v2, v4, v0, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 141
    .line 142
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 143
    .line 144
    .line 145
    iget v0, p0, Lz2/c;->E:I

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v4, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;II)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 8
    .line 9
    iget v4, v0, Lz2/c;->t:I

    .line 10
    .line 11
    iget v5, v0, Lz2/c;->o:I

    .line 12
    .line 13
    iget v6, v0, Lz2/c;->j:I

    .line 14
    .line 15
    iget v7, v0, Lz2/c;->e:I

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    if-gtz v7, :cond_0

    .line 20
    .line 21
    if-gtz v6, :cond_0

    .line 22
    .line 23
    if-gtz v5, :cond_0

    .line 24
    .line 25
    if-lez v4, :cond_1

    .line 26
    .line 27
    :cond_0
    new-instance v3, Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v3, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 33
    .line 34
    :cond_1
    const/high16 v3, 0x40000000    # 2.0f

    .line 35
    .line 36
    const/high16 v8, 0x3f800000    # 1.0f

    .line 37
    .line 38
    const/16 v9, 0xff

    .line 39
    .line 40
    if-lez v7, :cond_3

    .line 41
    .line 42
    iget-object v10, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 43
    .line 44
    int-to-float v11, v7

    .line 45
    invoke-virtual {v10, v11}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    iget-object v10, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 49
    .line 50
    iget v11, v0, Lz2/c;->h:I

    .line 51
    .line 52
    invoke-virtual {v10, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    iget v10, v0, Lz2/c;->i:I

    .line 56
    .line 57
    if-ge v10, v9, :cond_2

    .line 58
    .line 59
    iget-object v11, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 60
    .line 61
    invoke-virtual {v11, v10}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 62
    .line 63
    .line 64
    :cond_2
    int-to-float v7, v7

    .line 65
    mul-float/2addr v7, v8

    .line 66
    div-float v12, v7, v3

    .line 67
    .line 68
    iget v7, v0, Lz2/c;->f:I

    .line 69
    .line 70
    int-to-float v11, v7

    .line 71
    iget v7, v0, Lz2/c;->g:I

    .line 72
    .line 73
    sub-int v7, v1, v7

    .line 74
    .line 75
    int-to-float v13, v7

    .line 76
    iget-object v15, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 77
    .line 78
    move v14, v12

    .line 79
    move-object/from16 v10, p1

    .line 80
    .line 81
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    if-lez v6, :cond_5

    .line 85
    .line 86
    iget-object v7, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 87
    .line 88
    int-to-float v10, v6

    .line 89
    invoke-virtual {v7, v10}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 90
    .line 91
    .line 92
    iget-object v7, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 93
    .line 94
    iget v10, v0, Lz2/c;->m:I

    .line 95
    .line 96
    invoke-virtual {v7, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 97
    .line 98
    .line 99
    iget v7, v0, Lz2/c;->n:I

    .line 100
    .line 101
    if-ge v7, v9, :cond_4

    .line 102
    .line 103
    iget-object v10, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 104
    .line 105
    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 106
    .line 107
    .line 108
    :cond_4
    int-to-float v7, v2

    .line 109
    int-to-float v6, v6

    .line 110
    invoke-static {v6, v8, v3, v7}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    float-to-double v6, v3

    .line 115
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 116
    .line 117
    .line 118
    move-result-wide v6

    .line 119
    double-to-float v3, v6

    .line 120
    iget v6, v0, Lz2/c;->k:I

    .line 121
    .line 122
    int-to-float v6, v6

    .line 123
    iget v7, v0, Lz2/c;->l:I

    .line 124
    .line 125
    sub-int v7, v1, v7

    .line 126
    .line 127
    int-to-float v7, v7

    .line 128
    iget-object v8, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 129
    .line 130
    move/from16 v20, v3

    .line 131
    .line 132
    move-object/from16 v16, p1

    .line 133
    .line 134
    move/from16 v18, v3

    .line 135
    .line 136
    move/from16 v17, v6

    .line 137
    .line 138
    move/from16 v19, v7

    .line 139
    .line 140
    move-object/from16 v21, v8

    .line 141
    .line 142
    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    if-lez v5, :cond_7

    .line 146
    .line 147
    iget-object v3, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 148
    .line 149
    int-to-float v5, v5

    .line 150
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 151
    .line 152
    .line 153
    iget-object v3, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 154
    .line 155
    iget v5, v0, Lz2/c;->r:I

    .line 156
    .line 157
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 158
    .line 159
    .line 160
    iget v3, v0, Lz2/c;->s:I

    .line 161
    .line 162
    if-ge v3, v9, :cond_6

    .line 163
    .line 164
    iget-object v5, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 165
    .line 166
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 167
    .line 168
    .line 169
    :cond_6
    iget v3, v0, Lz2/c;->p:I

    .line 170
    .line 171
    int-to-float v3, v3

    .line 172
    iget v5, v0, Lz2/c;->q:I

    .line 173
    .line 174
    sub-int v5, v2, v5

    .line 175
    .line 176
    int-to-float v5, v5

    .line 177
    iget-object v6, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v19, 0x0

    .line 182
    .line 183
    move-object/from16 v16, p1

    .line 184
    .line 185
    move/from16 v18, v3

    .line 186
    .line 187
    move/from16 v20, v5

    .line 188
    .line 189
    move-object/from16 v21, v6

    .line 190
    .line 191
    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    if-lez v4, :cond_9

    .line 195
    .line 196
    iget-object v3, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 197
    .line 198
    int-to-float v4, v4

    .line 199
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 200
    .line 201
    .line 202
    iget-object v3, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 203
    .line 204
    iget v4, v0, Lz2/c;->w:I

    .line 205
    .line 206
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 207
    .line 208
    .line 209
    iget v3, v0, Lz2/c;->x:I

    .line 210
    .line 211
    if-ge v3, v9, :cond_8

    .line 212
    .line 213
    iget-object v4, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 214
    .line 215
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 216
    .line 217
    .line 218
    :cond_8
    int-to-float v1, v1

    .line 219
    iget v3, v0, Lz2/c;->u:I

    .line 220
    .line 221
    int-to-float v3, v3

    .line 222
    iget v4, v0, Lz2/c;->v:I

    .line 223
    .line 224
    sub-int/2addr v2, v4

    .line 225
    int-to-float v2, v2

    .line 226
    iget-object v4, v0, Lz2/c;->y:Landroid/graphics/Paint;

    .line 227
    .line 228
    move/from16 v19, v1

    .line 229
    .line 230
    move-object/from16 v16, p1

    .line 231
    .line 232
    move/from16 v17, v1

    .line 233
    .line 234
    move/from16 v20, v2

    .line 235
    .line 236
    move/from16 v18, v3

    .line 237
    .line 238
    move-object/from16 v21, v4

    .line 239
    .line 240
    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 241
    .line 242
    .line 243
    :cond_9
    return-void
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget v0, p0, Lz2/c;->b:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-le v1, v0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget v0, p0, Lz2/c;->a:I

    .line 16
    .line 17
    const/high16 v1, -0x80000000

    .line 18
    .line 19
    if-ne p1, v1, :cond_0

    .line 20
    .line 21
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    const/high16 p1, 0x40000000    # 2.0f

    .line 27
    .line 28
    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    :cond_1
    return p1
.end method

.method public final d(I)I
    .locals 2

    .line 1
    iget v0, p0, Lz2/c;->a:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-le v1, v0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/high16 v1, -0x80000000

    .line 16
    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/high16 p1, 0x40000000    # 2.0f

    .line 25
    .line 26
    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    :cond_1
    return p1
.end method

.method public final e(II)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lz2/c;->d:I

    .line 10
    .line 11
    if-ge p2, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_0
    return p1
.end method

.method public final f(II)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lz2/c;->c:I

    .line 10
    .line 11
    if-ge p2, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_0
    return p1
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget v1, p0, Lz2/c;->L:I

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    int-to-float v1, v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final h(I)V
    .locals 3

    .line 1
    iget v0, p0, Lz2/c;->B:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lz2/c;->A:I

    .line 7
    .line 8
    iget v1, p0, Lz2/c;->L:I

    .line 9
    .line 10
    iget v2, p0, Lz2/c;->M:F

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1, v2}, Lz2/c;->l(IIIF)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lz2/c;->G:I

    .line 2
    .line 3
    iget-object p1, p0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-boolean p1, p0, Lz2/c;->I:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k(I)V
    .locals 3

    .line 1
    iget v0, p0, Lz2/c;->A:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lz2/c;->L:I

    .line 6
    .line 7
    iget v1, p0, Lz2/c;->M:F

    .line 8
    .line 9
    iget v2, p0, Lz2/c;->B:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v2, v0, v1}, Lz2/c;->l(IIIF)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final l(IIIF)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, Lz2/c;->N:I

    .line 10
    .line 11
    iget-object v5, v0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Landroid/view/View;

    .line 18
    .line 19
    if-nez v6, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iput v1, v0, Lz2/c;->A:I

    .line 23
    .line 24
    iput v2, v0, Lz2/c;->B:I

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x1

    .line 28
    if-lez v1, :cond_5

    .line 29
    .line 30
    const/4 v10, 0x7

    .line 31
    const/4 v11, 0x6

    .line 32
    const/4 v12, 0x5

    .line 33
    const/16 v13, 0x8

    .line 34
    .line 35
    const/4 v14, 0x4

    .line 36
    const/4 v15, 0x3

    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    if-ne v2, v9, :cond_1

    .line 41
    .line 42
    move/from16 v17, v9

    .line 43
    .line 44
    int-to-float v9, v1

    .line 45
    new-array v13, v13, [F

    .line 46
    .line 47
    aput v8, v13, v16

    .line 48
    .line 49
    aput v8, v13, v17

    .line 50
    .line 51
    aput v8, v13, v7

    .line 52
    .line 53
    aput v8, v13, v15

    .line 54
    .line 55
    aput v9, v13, v14

    .line 56
    .line 57
    aput v9, v13, v12

    .line 58
    .line 59
    aput v9, v13, v11

    .line 60
    .line 61
    aput v9, v13, v10

    .line 62
    .line 63
    iput-object v13, v0, Lz2/c;->C:[F

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move/from16 v17, v9

    .line 67
    .line 68
    if-ne v2, v7, :cond_2

    .line 69
    .line 70
    int-to-float v9, v1

    .line 71
    new-array v13, v13, [F

    .line 72
    .line 73
    aput v9, v13, v16

    .line 74
    .line 75
    aput v9, v13, v17

    .line 76
    .line 77
    aput v8, v13, v7

    .line 78
    .line 79
    aput v8, v13, v15

    .line 80
    .line 81
    aput v8, v13, v14

    .line 82
    .line 83
    aput v8, v13, v12

    .line 84
    .line 85
    aput v9, v13, v11

    .line 86
    .line 87
    aput v9, v13, v10

    .line 88
    .line 89
    iput-object v13, v0, Lz2/c;->C:[F

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    if-ne v2, v15, :cond_3

    .line 93
    .line 94
    int-to-float v9, v1

    .line 95
    new-array v13, v13, [F

    .line 96
    .line 97
    aput v9, v13, v16

    .line 98
    .line 99
    aput v9, v13, v17

    .line 100
    .line 101
    aput v9, v13, v7

    .line 102
    .line 103
    aput v9, v13, v15

    .line 104
    .line 105
    aput v8, v13, v14

    .line 106
    .line 107
    aput v8, v13, v12

    .line 108
    .line 109
    aput v8, v13, v11

    .line 110
    .line 111
    aput v8, v13, v10

    .line 112
    .line 113
    iput-object v13, v0, Lz2/c;->C:[F

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    if-ne v2, v14, :cond_4

    .line 117
    .line 118
    int-to-float v9, v1

    .line 119
    new-array v13, v13, [F

    .line 120
    .line 121
    aput v8, v13, v16

    .line 122
    .line 123
    aput v8, v13, v17

    .line 124
    .line 125
    aput v9, v13, v7

    .line 126
    .line 127
    aput v9, v13, v15

    .line 128
    .line 129
    aput v9, v13, v14

    .line 130
    .line 131
    aput v9, v13, v12

    .line 132
    .line 133
    aput v8, v13, v11

    .line 134
    .line 135
    aput v8, v13, v10

    .line 136
    .line 137
    iput-object v13, v0, Lz2/c;->C:[F

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_4
    const/4 v7, 0x0

    .line 141
    iput-object v7, v0, Lz2/c;->C:[F

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    move/from16 v17, v9

    .line 145
    .line 146
    const/16 v16, 0x0

    .line 147
    .line 148
    :goto_0
    iput v3, v0, Lz2/c;->L:I

    .line 149
    .line 150
    move/from16 v7, p4

    .line 151
    .line 152
    iput v7, v0, Lz2/c;->M:F

    .line 153
    .line 154
    iput v4, v0, Lz2/c;->N:I

    .line 155
    .line 156
    if-eqz v3, :cond_7

    .line 157
    .line 158
    if-lez v1, :cond_6

    .line 159
    .line 160
    if-eqz v2, :cond_6

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_6
    int-to-float v1, v3

    .line 164
    invoke-virtual {v6, v1}, Landroid/view/View;->setElevation(F)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_7
    :goto_1
    invoke-virtual {v6, v8}, Landroid/view/View;->setElevation(F)V

    .line 169
    .line 170
    .line 171
    :goto_2
    iget v1, v0, Lz2/c;->N:I

    .line 172
    .line 173
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 174
    .line 175
    const/16 v3, 0x1c

    .line 176
    .line 177
    if-lt v2, v3, :cond_9

    .line 178
    .line 179
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Landroid/view/View;

    .line 184
    .line 185
    if-nez v2, :cond_8

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_8
    invoke-static {v2, v1}, Landroidx/activity/j;->B(Landroid/view/View;I)V

    .line 189
    .line 190
    .line 191
    invoke-static {v2, v1}, Landroidx/activity/j;->u(Landroid/view/View;I)V

    .line 192
    .line 193
    .line 194
    :cond_9
    :goto_3
    new-instance v1, Lz2/b;

    .line 195
    .line 196
    invoke-direct {v1, v0}, Lz2/b;-><init>(Lz2/c;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 200
    .line 201
    .line 202
    iget v1, v0, Lz2/c;->A:I

    .line 203
    .line 204
    if-lez v1, :cond_a

    .line 205
    .line 206
    move/from16 v7, v17

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_a
    move/from16 v7, v16

    .line 210
    .line 211
    :goto_4
    invoke-virtual {v6, v7}, Landroid/view/View;->setClipToOutline(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final m(F)V
    .locals 1

    .line 1
    iget v0, p0, Lz2/c;->M:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, Lz2/c;->M:F

    .line 9
    .line 10
    invoke-virtual {p0}, Lz2/c;->g()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
