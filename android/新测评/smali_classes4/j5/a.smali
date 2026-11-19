.class public final Lj5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/camera/view/ManualPointView;


# direct methods
.method public constructor <init>(Lcom/zykj/camera/view/ManualPointView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    div-int/lit8 v0, v0, 0xa

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    div-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    iget-object v1, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    div-int/lit8 v1, v1, 0xa

    .line 20
    .line 21
    div-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    iget-object v2, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    div-int/lit8 v2, v2, 0x2

    .line 30
    .line 31
    int-to-float v2, v2

    .line 32
    const/high16 v3, 0x41a00000    # 20.0f

    .line 33
    .line 34
    sub-float/2addr v2, v3

    .line 35
    iget-object v4, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 36
    .line 37
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    div-int/lit8 v4, v4, 0x2

    .line 42
    .line 43
    int-to-float v4, v4

    .line 44
    sub-float/2addr v4, v3

    .line 45
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 46
    .line 47
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v5, Lcom/zykj/camera/view/ManualPointView$PointType;->a:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 52
    .line 53
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-nez v3, :cond_0

    .line 58
    .line 59
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 60
    .line 61
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v6, Landroid/graphics/Point;

    .line 66
    .line 67
    invoke-direct {v6, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_0
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 74
    .line 75
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v6, Lcom/zykj/camera/view/ManualPointView$PointType;->c:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 80
    .line 81
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 88
    .line 89
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    new-instance v7, Landroid/graphics/Point;

    .line 94
    .line 95
    iget-object v8, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 96
    .line 97
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    sub-int/2addr v8, v0

    .line 102
    invoke-direct {v7, v8, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_1
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 109
    .line 110
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    sget-object v7, Lcom/zykj/camera/view/ManualPointView$PointType;->b:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 115
    .line 116
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-nez v3, :cond_2

    .line 121
    .line 122
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 123
    .line 124
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-instance v8, Landroid/graphics/Point;

    .line 129
    .line 130
    iget-object v9, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 131
    .line 132
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    sub-int/2addr v9, v1

    .line 137
    invoke-direct {v8, v0, v9}, Landroid/graphics/Point;-><init>(II)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_2
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 144
    .line 145
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    sget-object v8, Lcom/zykj/camera/view/ManualPointView$PointType;->d:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 150
    .line 151
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-nez v3, :cond_3

    .line 156
    .line 157
    iget-object v3, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 158
    .line 159
    invoke-static {v3}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    new-instance v9, Landroid/graphics/Point;

    .line 164
    .line 165
    iget-object v10, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 166
    .line 167
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    sub-int/2addr v10, v0

    .line 172
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    sub-int/2addr v0, v1

    .line 179
    invoke-direct {v9, v10, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v3, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_3
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 186
    .line 187
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Landroid/graphics/Point;

    .line 196
    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    iget-object v1, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 200
    .line 201
    invoke-static {v1}, Lcom/zykj/camera/view/ManualPointView;->c(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    new-instance v3, Landroid/graphics/Point;

    .line 206
    .line 207
    iget v9, v0, Landroid/graphics/Point;->x:I

    .line 208
    .line 209
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 210
    .line 211
    invoke-direct {v3, v9, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_4
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 218
    .line 219
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Landroid/graphics/Point;

    .line 228
    .line 229
    if-eqz v0, :cond_5

    .line 230
    .line 231
    iget-object v1, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 232
    .line 233
    invoke-static {v1}, Lcom/zykj/camera/view/ManualPointView;->c(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    new-instance v3, Landroid/graphics/Point;

    .line 238
    .line 239
    iget v9, v0, Landroid/graphics/Point;->x:I

    .line 240
    .line 241
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 242
    .line 243
    invoke-direct {v3, v9, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    :cond_5
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 250
    .line 251
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Landroid/graphics/Point;

    .line 260
    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    iget-object v1, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 264
    .line 265
    invoke-static {v1}, Lcom/zykj/camera/view/ManualPointView;->c(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    new-instance v3, Landroid/graphics/Point;

    .line 270
    .line 271
    iget v9, v0, Landroid/graphics/Point;->x:I

    .line 272
    .line 273
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 274
    .line 275
    invoke-direct {v3, v9, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 276
    .line 277
    .line 278
    invoke-interface {v1, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    :cond_6
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 282
    .line 283
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, Landroid/graphics/Point;

    .line 292
    .line 293
    if-eqz v0, :cond_7

    .line 294
    .line 295
    iget-object v1, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 296
    .line 297
    invoke-static {v1}, Lcom/zykj/camera/view/ManualPointView;->c(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    new-instance v3, Landroid/graphics/Point;

    .line 302
    .line 303
    iget v9, v0, Landroid/graphics/Point;->x:I

    .line 304
    .line 305
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 306
    .line 307
    invoke-direct {v3, v9, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_7
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 314
    .line 315
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->b(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v1, Landroid/graphics/RectF;

    .line 320
    .line 321
    const/high16 v3, 0x41200000    # 10.0f

    .line 322
    .line 323
    add-float v9, v2, v3

    .line 324
    .line 325
    add-float v10, v4, v3

    .line 326
    .line 327
    invoke-direct {v1, v3, v3, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 334
    .line 335
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->b(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    new-instance v1, Landroid/graphics/RectF;

    .line 340
    .line 341
    const/high16 v5, 0x41f00000    # 30.0f

    .line 342
    .line 343
    add-float/2addr v2, v5

    .line 344
    iget-object v11, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 345
    .line 346
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    int-to-float v11, v11

    .line 351
    sub-float/2addr v11, v3

    .line 352
    invoke-direct {v1, v2, v3, v11, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 359
    .line 360
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->b(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    new-instance v1, Landroid/graphics/RectF;

    .line 365
    .line 366
    add-float/2addr v4, v5

    .line 367
    iget-object v5, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 368
    .line 369
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    int-to-float v5, v5

    .line 374
    sub-float/2addr v5, v3

    .line 375
    iget-object v6, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 376
    .line 377
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    int-to-float v6, v6

    .line 382
    sub-float/2addr v6, v3

    .line 383
    invoke-direct {v1, v2, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    iget-object v0, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 390
    .line 391
    invoke-static {v0}, Lcom/zykj/camera/view/ManualPointView;->b(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    new-instance v1, Landroid/graphics/RectF;

    .line 396
    .line 397
    iget-object v2, p0, Lj5/a;->a:Lcom/zykj/camera/view/ManualPointView;

    .line 398
    .line 399
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    int-to-float v2, v2

    .line 404
    sub-float/2addr v2, v3

    .line 405
    invoke-direct {v1, v3, v4, v9, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    return-void
.end method
