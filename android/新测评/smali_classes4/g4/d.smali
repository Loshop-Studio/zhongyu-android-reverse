.class public final Lg4/d;
.super Lcom/zykj/blackboard/core/action/BaseTouchAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg4/d$a;
    }
.end annotation


# static fields
.field public static final q:Lg4/d$a;


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
    new-instance v0, Lg4/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg4/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg4/d;->q:Lg4/d$a;

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
    iput-object v0, p0, Lg4/d;->e:Landroid/graphics/PointF;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/PointF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg4/d;->f:Landroid/graphics/PointF;

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v0, p0, Lg4/d;->g:F

    .line 21
    .line 22
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->u()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lg4/d;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 27
    .line 28
    new-instance v1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 34
    .line 35
    new-instance v1, Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lg4/d;->j:Landroid/graphics/Matrix;

    .line 41
    .line 42
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lg4/d;->l:Ljava/util/List;

    .line 48
    .line 49
    new-instance v1, Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 55
    .line 56
    new-instance v1, Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lg4/d;->n:Landroid/graphics/RectF;

    .line 62
    .line 63
    iput v0, p0, Lg4/d;->o:F

    .line 64
    .line 65
    return-void
.end method

.method private final A(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;
    .locals 8

    .line 1
    iget v0, p0, Lg4/d;->k:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v2, :cond_2

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
    iget-object v0, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-direct {p0, v3, v0}, Lg4/d;->v(FF)Landroid/graphics/PointF;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-virtual {p1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-direct {p0, v3, p1}, Lg4/d;->v(FF)Landroid/graphics/PointF;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v3}, Lf4/c;->e()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-ne v3, v2, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0, v0, p1}, Lg4/d;->q(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    iget v4, p0, Lg4/d;->g:F

    .line 80
    .line 81
    div-float/2addr v3, v4

    .line 82
    iget v4, p0, Lg4/d;->o:F

    .line 83
    .line 84
    invoke-static {v3, v4}, Ljava/lang/Float;->max(FF)F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iget-object v4, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 89
    .line 90
    iget-object v5, p0, Lg4/d;->f:Landroid/graphics/PointF;

    .line 91
    .line 92
    iget v6, v5, Landroid/graphics/PointF;->x:F

    .line 93
    .line 94
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 95
    .line 96
    invoke-virtual {v4, v3, v3, v6, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 97
    .line 98
    .line 99
    iget-object v3, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 100
    .line 101
    invoke-virtual {p0, v3}, Lg4/d;->B(Landroid/graphics/Matrix;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    invoke-direct {p0, v0, p1}, Lg4/d;->s(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object v0, p0, Lg4/d;->f:Landroid/graphics/PointF;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    iget-object v0, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-direct {p0, v0, p1}, Lg4/d;->v(FF)Landroid/graphics/PointF;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, p0, Lg4/d;->e:Landroid/graphics/PointF;

    .line 129
    .line 130
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const/4 v4, 0x0

    .line 135
    if-eqz v3, :cond_6

    .line 136
    .line 137
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-eqz v3, :cond_6

    .line 142
    .line 143
    invoke-virtual {v3}, Lf4/c;->a()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-ne v3, v2, :cond_6

    .line 148
    .line 149
    iget-object v3, p0, Lg4/d;->n:Landroid/graphics/RectF;

    .line 150
    .line 151
    iget v5, v3, Landroid/graphics/RectF;->left:F

    .line 152
    .line 153
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 154
    .line 155
    cmpl-float v6, v5, v3

    .line 156
    .line 157
    if-lez v6, :cond_3

    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v3}, Lk4/c;->r()Landroid/graphics/RectF;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    iget-object v5, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 175
    .line 176
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    sub-float/2addr v3, v5

    .line 181
    int-to-float v5, v1

    .line 182
    div-float/2addr v3, v5

    .line 183
    iget-object v5, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 184
    .line 185
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 186
    .line 187
    sub-float v5, v3, v5

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_3
    iget v6, p1, Landroid/graphics/PointF;->x:F

    .line 191
    .line 192
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 193
    .line 194
    sub-float/2addr v6, v7

    .line 195
    cmpg-float v7, v6, v5

    .line 196
    .line 197
    if-gez v7, :cond_4

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_4
    cmpl-float v5, v6, v3

    .line 201
    .line 202
    if-lez v5, :cond_5

    .line 203
    .line 204
    move v5, v3

    .line 205
    goto :goto_1

    .line 206
    :cond_5
    move v5, v6

    .line 207
    :goto_1
    iget-object v3, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 208
    .line 209
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_6
    move v5, v4

    .line 214
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    if-eqz v3, :cond_a

    .line 219
    .line 220
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    if-eqz v3, :cond_a

    .line 225
    .line 226
    invoke-virtual {v3}, Lf4/c;->f()Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-ne v3, v2, :cond_a

    .line 231
    .line 232
    iget-object v2, p0, Lg4/d;->n:Landroid/graphics/RectF;

    .line 233
    .line 234
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 235
    .line 236
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 237
    .line 238
    cmpl-float v6, v3, v2

    .line 239
    .line 240
    if-lez v6, :cond_7

    .line 241
    .line 242
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-interface {p1}, Lk4/c;->r()Landroid/graphics/RectF;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    sub-float/2addr p1, v0

    .line 264
    int-to-float v0, v1

    .line 265
    div-float/2addr p1, v0

    .line 266
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 267
    .line 268
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 269
    .line 270
    sub-float v3, p1, v0

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_7
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 274
    .line 275
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 276
    .line 277
    sub-float/2addr p1, v0

    .line 278
    cmpg-float v0, p1, v3

    .line 279
    .line 280
    if-gez v0, :cond_8

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_8
    cmpl-float v0, p1, v2

    .line 284
    .line 285
    if-lez v0, :cond_9

    .line 286
    .line 287
    move v3, v2

    .line 288
    goto :goto_3

    .line 289
    :cond_9
    move v3, p1

    .line 290
    :goto_3
    iget-object p1, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 291
    .line 292
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 293
    .line 294
    .line 295
    move v4, v3

    .line 296
    :cond_a
    invoke-direct {p0, v5, v4}, Lg4/d;->H(FF)V

    .line 297
    .line 298
    .line 299
    new-instance p1, Landroid/graphics/Matrix;

    .line 300
    .line 301
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-eqz v0, :cond_b

    .line 309
    .line 310
    invoke-virtual {v0}, Lj4/a;->e()Landroid/graphics/Matrix;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-nez v0, :cond_c

    .line 315
    .line 316
    :cond_b
    new-instance v0, Landroid/graphics/Matrix;

    .line 317
    .line 318
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 319
    .line 320
    .line 321
    :cond_c
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 322
    .line 323
    .line 324
    iget-object v0, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 325
    .line 326
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-eqz v0, :cond_d

    .line 334
    .line 335
    invoke-virtual {v0}, Lj4/a;->e()Landroid/graphics/Matrix;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-nez v0, :cond_e

    .line 340
    .line 341
    :cond_d
    new-instance v0, Landroid/graphics/Matrix;

    .line 342
    .line 343
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 344
    .line 345
    .line 346
    :cond_e
    invoke-static {v0}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 351
    .line 352
    .line 353
    return-object p1
.end method

.method public static synthetic C(Lg4/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1}, Lg4/d;->B(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final H(FF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    iget-object v0, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    iget-object v0, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    iget-object p1, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    iget-object p1, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lg4/b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-interface {p1}, Lg4/b;->o()Lc5/d;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p2}, Lf4/c;->a()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-ne p2, v0, :cond_2

    .line 83
    .line 84
    invoke-interface {p1, v2}, Lc5/d;->a(F)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-eqz p2, :cond_3

    .line 98
    .line 99
    invoke-virtual {p2}, Lf4/c;->f()Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-ne p2, v0, :cond_3

    .line 104
    .line 105
    invoke-interface {p1, v1}, Lc5/d;->b(F)V

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
    iget-object v1, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    iget-object v0, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    iget-object p2, p0, Lg4/d;->i:Landroid/graphics/Matrix;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lj4/a;->e()Landroid/graphics/Matrix;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lj4/a;->e()Landroid/graphics/Matrix;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Le5/n;->a:Le5/n;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, p1, p2, v1}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lk4/c;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lg4/d;->l:Ljava/util/List;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lk4/c;->s(Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lg4/d;->m(Landroid/graphics/Matrix;J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final z(Landroid/graphics/Matrix;Ljava/lang/Long;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lg4/d;->l:Ljava/util/List;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    :goto_0
    invoke-static {p1, v1, v2}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Lg4/d;->l:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object p2, p0, Lg4/d;->l:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 44
    .line 45
    invoke-static {p2}, Le5/m;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p1, p2}, Lk4/c;->D(Landroid/graphics/Matrix;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p0}, Lg4/d;->J()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {p1, v0, p2, v0}, Lk4/c$a;->a(Lk4/c;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method


# virtual methods
.method public final B(Landroid/graphics/Matrix;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lk4/c;->G()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lk4/c;->r()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lf4/c;->b()I

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
    invoke-virtual {v2}, Lf4/c;->c()I

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
    invoke-virtual {v2}, Lf4/c;->c()I

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
    invoke-virtual {v2}, Lf4/c;->b()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    int-to-float v2, v2

    .line 77
    mul-float/2addr v0, v2

    .line 78
    iget-object v2, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-virtual {v2, v4, v4, v3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

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
    iget-object v2, p0, Lg4/d;->m:Landroid/graphics/RectF;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lg4/d;->n:Landroid/graphics/RectF;

    .line 112
    .line 113
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 114
    .line 115
    iget-object v3, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    iget-object v1, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    iput p1, p0, Lg4/d;->o:F

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
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    iget-object v1, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    iget-object p1, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lj4/a;->d()Landroid/graphics/Matrix;

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
    invoke-static {v0, v1, v2}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

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
    iput-object v0, p0, Lg4/d;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 24
    .line 25
    return-void
.end method

.method public final E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-direct {p0, v1, v0}, Lg4/d;->v(FF)Landroid/graphics/PointF;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->w(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    invoke-direct {p0, v2, p1}, Lg4/d;->v(FF)Landroid/graphics/PointF;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v1, p0, Lg4/d;->f:Landroid/graphics/PointF;

    .line 44
    .line 45
    invoke-direct {p0, v0, p1}, Lg4/d;->s(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0, p1}, Lg4/d;->q(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput p1, p0, Lg4/d;->g:F

    .line 57
    .line 58
    return-void
.end method

.method public final F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/d;->e:Landroid/graphics/PointF;

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
    invoke-direct {p0, v1, p1}, Lg4/d;->v(FF)Landroid/graphics/PointF;

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
    sget-object v0, Le5/h;->a:Le5/h;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/d;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/d;->l:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lg4/d;->k:I

    .line 13
    .line 14
    iget-object v0, p0, Lg4/d;->e:Landroid/graphics/PointF;

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
    iput v0, p0, Lg4/d;->g:F

    .line 23
    .line 24
    iget-object v0, p0, Lg4/d;->f:Landroid/graphics/PointF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lg4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lg4/d;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 8
    .line 9
    const-string v2, "originMatrix"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lj4/a;->d()Landroid/graphics/Matrix;

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
    invoke-static {v2, v3, v4}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lg4/d;->l:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v0, v1, v2, v3}, Lg4/b;->b(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method

.method public final K(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lg4/d;->p:Z

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    iput v0, p0, Lg4/d;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lg4/d;->t()Z

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
    invoke-virtual {p0, p1}, Lg4/d;->E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lg4/d;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lg4/d;->t()Z

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
    invoke-direct {p0, p1}, Lg4/d;->A(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;

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
    invoke-direct {p0, v0, p1}, Lg4/d;->z(Landroid/graphics/Matrix;Ljava/lang/Long;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lg4/d;->k:I

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lg4/d;->t()Z

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
    invoke-direct {p0, p1}, Lg4/d;->A(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;

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
    invoke-direct {p0, v0, v1, v2}, Lg4/d;->y(Landroid/graphics/Matrix;J)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput v0, p0, Lg4/d;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lg4/d;->t()Z

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
    invoke-virtual {p0}, Lg4/d;->G()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p0, v1, v0, v1}, Lg4/d;->C(Lg4/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lg4/d;->F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lg4/d;->D()V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lg4/d;->x()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final m(Landroid/graphics/Matrix;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/d;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p2, p3}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final n(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    invoke-direct {p0, p1, p2}, Lg4/d;->r(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;

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
    invoke-direct {p0, p1, p2}, Lg4/d;->z(Landroid/graphics/Matrix;Ljava/lang/Long;)V

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
    invoke-static {p0, v0, v1, v0}, Lg4/d;->C(Lg4/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    invoke-direct {p0}, Lg4/d;->x()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final p(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/d;->m:Landroid/graphics/RectF;

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
    invoke-direct {p0, p1, p2}, Lg4/d;->r(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;

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
    invoke-direct {p0, p1, v0, v1}, Lg4/d;->y(Landroid/graphics/Matrix;J)V

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
    iget-boolean v0, p0, Lg4/d;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lf4/c;->g()Z

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
    invoke-static {p0, v0, v1, v0}, Lg4/d;->C(Lg4/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
    invoke-static {p0, v0, v1, v0}, Lg4/d;->C(Lg4/d;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/d;->n:Landroid/graphics/RectF;

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
