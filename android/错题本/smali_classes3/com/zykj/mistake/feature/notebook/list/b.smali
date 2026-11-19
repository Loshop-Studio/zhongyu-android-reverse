.class public final synthetic Lcom/zykj/mistake/feature/notebook/list/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Lp4/b;

.field public final synthetic j:F

.field public final synthetic k:Lcom/zykj/mistake/feature/notebook/list/e;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:F

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:F

.field public final synthetic p:F

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:F

.field public final synthetic s:Z

.field public final synthetic t:F

.field public final synthetic u:F

.field public final synthetic v:F

.field public final synthetic w:F


# direct methods
.method public synthetic constructor <init>(FFLjava/util/List;FFFFFLp4/b;FLcom/zykj/mistake/feature/notebook/list/e;Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;FZFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->a:F

    iput p2, p0, Lcom/zykj/mistake/feature/notebook/list/b;->b:F

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/b;->c:Ljava/util/List;

    iput p4, p0, Lcom/zykj/mistake/feature/notebook/list/b;->d:F

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/list/b;->e:F

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/list/b;->f:F

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/list/b;->g:F

    iput p8, p0, Lcom/zykj/mistake/feature/notebook/list/b;->h:F

    iput-object p9, p0, Lcom/zykj/mistake/feature/notebook/list/b;->i:Lp4/b;

    iput p10, p0, Lcom/zykj/mistake/feature/notebook/list/b;->j:F

    iput-object p11, p0, Lcom/zykj/mistake/feature/notebook/list/b;->k:Lcom/zykj/mistake/feature/notebook/list/e;

    iput-object p12, p0, Lcom/zykj/mistake/feature/notebook/list/b;->l:Ljava/lang/String;

    iput p13, p0, Lcom/zykj/mistake/feature/notebook/list/b;->m:F

    iput-object p14, p0, Lcom/zykj/mistake/feature/notebook/list/b;->n:Ljava/lang/String;

    iput p15, p0, Lcom/zykj/mistake/feature/notebook/list/b;->o:F

    move/from16 p1, p16

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->p:F

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->q:Ljava/lang/String;

    move/from16 p1, p18

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->r:F

    move/from16 p1, p19

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->s:Z

    move/from16 p1, p20

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->t:F

    move/from16 p1, p21

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->u:F

    move/from16 p1, p22

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->v:F

    move/from16 p1, p23

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/b;->w:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 6
    .line 7
    const-string v2, "$this$onDrawBehind"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide v2, 0xffe0e2e5L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const/4 v4, 0x7

    .line 22
    int-to-float v4, v4

    .line 23
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iget v5, v0, Lcom/zykj/mistake/feature/notebook/list/b;->b:F

    .line 32
    .line 33
    add-float/2addr v4, v5

    .line 34
    iget v5, v0, Lcom/zykj/mistake/feature/notebook/list/b;->a:F

    .line 35
    .line 36
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    int-to-long v5, v5

    .line 41
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-long v7, v4

    .line 46
    const/16 v16, 0x20

    .line 47
    .line 48
    shl-long v4, v5, v16

    .line 49
    .line 50
    const-wide v17, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long v6, v7, v17

    .line 56
    .line 57
    or-long/2addr v4, v6

    .line 58
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const/4 v6, 0x1

    .line 63
    int-to-float v6, v6

    .line 64
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    const/16 v7, 0xa

    .line 73
    .line 74
    int-to-float v14, v7

    .line 75
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-interface {v1, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    int-to-long v8, v6

    .line 88
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    int-to-long v6, v6

    .line 93
    shl-long v8, v8, v16

    .line 94
    .line 95
    and-long v6, v6, v17

    .line 96
    .line 97
    or-long/2addr v6, v8

    .line 98
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    const/16 v12, 0x78

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    invoke-static/range {v1 .. v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/b;->c:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v19

    .line 118
    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/4 v4, 0x2

    .line 123
    if-eqz v3, :cond_0

    .line 124
    .line 125
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/l1;

    .line 130
    .line 131
    iget-wide v5, v3, Lcom/zykj/mistake/feature/notebook/list/l1;->d:J

    .line 132
    .line 133
    iget v7, v3, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    .line 134
    .line 135
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    int-to-long v7, v7

    .line 140
    iget v9, v0, Lcom/zykj/mistake/feature/notebook/list/b;->g:F

    .line 141
    .line 142
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    int-to-long v9, v9

    .line 147
    shl-long v7, v7, v16

    .line 148
    .line 149
    and-long v9, v9, v17

    .line 150
    .line 151
    or-long/2addr v7, v9

    .line 152
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v7

    .line 156
    iget v3, v3, Lcom/zykj/mistake/feature/notebook/list/l1;->c:F

    .line 157
    .line 158
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    int-to-long v9, v3

    .line 163
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/list/b;->h:F

    .line 164
    .line 165
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    int-to-long v11, v3

    .line 170
    shl-long v9, v9, v16

    .line 171
    .line 172
    and-long v11, v11, v17

    .line 173
    .line 174
    or-long/2addr v9, v11

    .line 175
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 176
    .line 177
    .line 178
    move-result-wide v9

    .line 179
    int-to-float v3, v4

    .line 180
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    int-to-long v11, v4

    .line 193
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    int-to-long v3, v3

    .line 198
    shl-long v11, v11, v16

    .line 199
    .line 200
    and-long v3, v3, v17

    .line 201
    .line 202
    or-long/2addr v3, v11

    .line 203
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 204
    .line 205
    .line 206
    move-result-wide v3

    .line 207
    move v11, v14

    .line 208
    const/16 v14, 0xf0

    .line 209
    .line 210
    const/4 v15, 0x0

    .line 211
    move-object v12, v2

    .line 212
    move-wide/from16 v26, v7

    .line 213
    .line 214
    move-wide/from16 v28, v9

    .line 215
    .line 216
    move-wide v8, v3

    .line 217
    move-wide v2, v5

    .line 218
    move-wide/from16 v4, v26

    .line 219
    .line 220
    move-wide/from16 v6, v28

    .line 221
    .line 222
    const/4 v10, 0x0

    .line 223
    move v13, v11

    .line 224
    const/4 v11, 0x0

    .line 225
    move-object/from16 v20, v12

    .line 226
    .line 227
    const/4 v12, 0x0

    .line 228
    move/from16 v21, v13

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v2, v20

    .line 235
    .line 236
    move/from16 v14, v21

    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_0
    move-object/from16 v20, v2

    .line 240
    .line 241
    move/from16 v21, v14

    .line 242
    .line 243
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-static {v2}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/b;->i:Lp4/b;

    .line 256
    .line 257
    iget-object v5, v3, Lp4/b;->f:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/b;->k:Lcom/zykj/mistake/feature/notebook/list/e;

    .line 260
    .line 261
    iget-object v7, v6, Lcom/zykj/mistake/feature/notebook/list/e;->a:Landroid/graphics/Paint;

    .line 262
    .line 263
    iget-object v8, v6, Lcom/zykj/mistake/feature/notebook/list/e;->c:Landroid/graphics/Paint;

    .line 264
    .line 265
    const/4 v9, 0x0

    .line 266
    iget v10, v0, Lcom/zykj/mistake/feature/notebook/list/b;->j:F

    .line 267
    .line 268
    invoke-virtual {v2, v5, v9, v10, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 269
    .line 270
    .line 271
    iget-object v5, v6, Lcom/zykj/mistake/feature/notebook/list/e;->b:Landroid/graphics/Paint;

    .line 272
    .line 273
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/list/b;->l:Ljava/lang/String;

    .line 274
    .line 275
    iget v9, v0, Lcom/zykj/mistake/feature/notebook/list/b;->m:F

    .line 276
    .line 277
    invoke-virtual {v2, v7, v9, v10, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 278
    .line 279
    .line 280
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-eqz v7, :cond_1

    .line 289
    .line 290
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    check-cast v7, Lcom/zykj/mistake/feature/notebook/list/l1;

    .line 295
    .line 296
    iget v9, v7, Lcom/zykj/mistake/feature/notebook/list/l1;->e:I

    .line 297
    .line 298
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 299
    .line 300
    .line 301
    iget-object v9, v7, Lcom/zykj/mistake/feature/notebook/list/l1;->a:Ljava/lang/String;

    .line 302
    .line 303
    iget v7, v7, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    .line 304
    .line 305
    iget v10, v0, Lcom/zykj/mistake/feature/notebook/list/b;->v:F

    .line 306
    .line 307
    add-float/2addr v7, v10

    .line 308
    iget v10, v0, Lcom/zykj/mistake/feature/notebook/list/b;->w:F

    .line 309
    .line 310
    invoke-virtual {v2, v9, v7, v10, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 311
    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_1
    iget-object v5, v6, Lcom/zykj/mistake/feature/notebook/list/e;->d:Landroid/graphics/Paint;

    .line 315
    .line 316
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/list/b;->n:Ljava/lang/String;

    .line 317
    .line 318
    iget v8, v0, Lcom/zykj/mistake/feature/notebook/list/b;->o:F

    .line 319
    .line 320
    iget v9, v0, Lcom/zykj/mistake/feature/notebook/list/b;->p:F

    .line 321
    .line 322
    invoke-virtual {v2, v7, v8, v9, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 323
    .line 324
    .line 325
    iget-object v5, v6, Lcom/zykj/mistake/feature/notebook/list/e;->e:Landroid/graphics/Paint;

    .line 326
    .line 327
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/list/b;->q:Ljava/lang/String;

    .line 328
    .line 329
    iget v8, v0, Lcom/zykj/mistake/feature/notebook/list/b;->r:F

    .line 330
    .line 331
    invoke-virtual {v2, v7, v8, v9, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 332
    .line 333
    .line 334
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/notebook/list/b;->s:Z

    .line 335
    .line 336
    if-nez v5, :cond_2

    .line 337
    .line 338
    iget-object v3, v3, Lp4/b;->s:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v5, v6, Lcom/zykj/mistake/feature/notebook/list/e;->f:Landroid/graphics/Paint;

    .line 341
    .line 342
    iget v6, v0, Lcom/zykj/mistake/feature/notebook/list/b;->t:F

    .line 343
    .line 344
    iget v7, v0, Lcom/zykj/mistake/feature/notebook/list/b;->u:F

    .line 345
    .line 346
    invoke-virtual {v2, v3, v6, v7, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 347
    .line 348
    .line 349
    :cond_2
    const-wide v2, 0xff27c69aL

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v2

    .line 358
    const-wide v5, 0x4010e147ae147ae1L    # 4.22

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    double-to-float v5, v5

    .line 364
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    const-wide v6, 0x4022800000000000L    # 9.25

    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    double-to-float v6, v6

    .line 378
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    iget v7, v0, Lcom/zykj/mistake/feature/notebook/list/b;->d:F

    .line 387
    .line 388
    add-float/2addr v6, v7

    .line 389
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    int-to-long v8, v5

    .line 394
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    int-to-long v5, v5

    .line 399
    shl-long v8, v8, v16

    .line 400
    .line 401
    and-long v5, v5, v17

    .line 402
    .line 403
    or-long/2addr v5, v8

    .line 404
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v5

    .line 408
    const-wide/high16 v8, 0x3ff4000000000000L    # 1.25

    .line 409
    .line 410
    double-to-float v8, v8

    .line 411
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    invoke-interface {v1, v8}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    const-wide v9, 0x4019333333333333L    # 6.3

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    double-to-float v9, v9

    .line 425
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 426
    .line 427
    .line 428
    move-result v9

    .line 429
    invoke-interface {v1, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    add-float/2addr v9, v7

    .line 434
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    int-to-long v10, v8

    .line 439
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 440
    .line 441
    .line 442
    move-result v8

    .line 443
    int-to-long v8, v8

    .line 444
    shl-long v10, v10, v16

    .line 445
    .line 446
    and-long v8, v8, v17

    .line 447
    .line 448
    or-long/2addr v8, v10

    .line 449
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 450
    .line 451
    .line 452
    move-result-wide v8

    .line 453
    sget-object v19, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 454
    .line 455
    move v10, v4

    .line 456
    move-wide/from16 v26, v8

    .line 457
    .line 458
    move v8, v7

    .line 459
    move-wide v6, v5

    .line 460
    move-wide/from16 v4, v26

    .line 461
    .line 462
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    .line 463
    .line 464
    .line 465
    move-result v9

    .line 466
    const/16 v14, 0x1e0

    .line 467
    .line 468
    const/4 v15, 0x0

    .line 469
    move v11, v8

    .line 470
    iget v8, v0, Lcom/zykj/mistake/feature/notebook/list/b;->e:F

    .line 471
    .line 472
    move v12, v10

    .line 473
    const/4 v10, 0x0

    .line 474
    move v13, v11

    .line 475
    const/4 v11, 0x0

    .line 476
    move/from16 v20, v12

    .line 477
    .line 478
    const/4 v12, 0x0

    .line 479
    move/from16 v22, v13

    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    const-wide v4, 0x4025800000000000L    # 10.75

    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    double-to-float v4, v4

    .line 491
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    const-wide/high16 v9, 0x4006000000000000L    # 2.75

    .line 500
    .line 501
    double-to-float v5, v9

    .line 502
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    add-float v5, v5, v22

    .line 511
    .line 512
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    int-to-long v9, v4

    .line 517
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    int-to-long v4, v4

    .line 522
    shl-long v9, v9, v16

    .line 523
    .line 524
    and-long v4, v4, v17

    .line 525
    .line 526
    or-long/2addr v4, v9

    .line 527
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 528
    .line 529
    .line 530
    move-result-wide v4

    .line 531
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    const/4 v10, 0x0

    .line 536
    move-wide/from16 v26, v6

    .line 537
    .line 538
    move-wide v6, v4

    .line 539
    move-wide/from16 v4, v26

    .line 540
    .line 541
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    const-wide v2, 0xffff3b30L

    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 550
    .line 551
    .line 552
    move-result-wide v2

    .line 553
    iget v4, v0, Lcom/zykj/mistake/feature/notebook/list/b;->f:F

    .line 554
    .line 555
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 556
    .line 557
    .line 558
    move-result v4

    .line 559
    int-to-long v4, v4

    .line 560
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 561
    .line 562
    .line 563
    move-result v6

    .line 564
    int-to-long v6, v6

    .line 565
    shl-long v4, v4, v16

    .line 566
    .line 567
    and-long v6, v6, v17

    .line 568
    .line 569
    or-long/2addr v4, v6

    .line 570
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 571
    .line 572
    .line 573
    move-result-wide v4

    .line 574
    const/4 v10, 0x2

    .line 575
    int-to-float v6, v10

    .line 576
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 577
    .line 578
    .line 579
    move-result v7

    .line 580
    invoke-interface {v1, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 585
    .line 586
    .line 587
    move-result v9

    .line 588
    invoke-interface {v1, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 593
    .line 594
    .line 595
    move-result v7

    .line 596
    int-to-long v10, v7

    .line 597
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    int-to-long v12, v7

    .line 602
    shl-long v9, v10, v16

    .line 603
    .line 604
    and-long v11, v12, v17

    .line 605
    .line 606
    or-long/2addr v9, v11

    .line 607
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 608
    .line 609
    .line 610
    move-result-wide v9

    .line 611
    invoke-static {v4, v5, v9, v10}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 612
    .line 613
    .line 614
    move-result-wide v9

    .line 615
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 616
    .line 617
    .line 618
    move-result v7

    .line 619
    invoke-interface {v1, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 624
    .line 625
    .line 626
    move-result v11

    .line 627
    invoke-interface {v1, v11}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 632
    .line 633
    .line 634
    move-result v7

    .line 635
    int-to-long v12, v7

    .line 636
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    int-to-long v14, v7

    .line 641
    shl-long v11, v12, v16

    .line 642
    .line 643
    and-long v13, v14, v17

    .line 644
    .line 645
    or-long/2addr v11, v13

    .line 646
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 647
    .line 648
    .line 649
    move-result-wide v11

    .line 650
    invoke-static {v4, v5, v11, v12}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 651
    .line 652
    .line 653
    move-result-wide v11

    .line 654
    move-wide v13, v4

    .line 655
    move-wide v4, v9

    .line 656
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    .line 657
    .line 658
    .line 659
    move-result v9

    .line 660
    move-wide/from16 v22, v13

    .line 661
    .line 662
    const/16 v14, 0x1e0

    .line 663
    .line 664
    const/4 v15, 0x0

    .line 665
    const/4 v10, 0x0

    .line 666
    move-wide/from16 v26, v11

    .line 667
    .line 668
    move v12, v6

    .line 669
    move-wide/from16 v6, v26

    .line 670
    .line 671
    const/4 v11, 0x0

    .line 672
    move v13, v12

    .line 673
    const/4 v12, 0x0

    .line 674
    move/from16 v20, v13

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    move-wide/from16 v24, v22

    .line 678
    .line 679
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 687
    .line 688
    .line 689
    move-result v4

    .line 690
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 691
    .line 692
    .line 693
    move-result v5

    .line 694
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 695
    .line 696
    .line 697
    move-result v5

    .line 698
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 699
    .line 700
    .line 701
    move-result v4

    .line 702
    int-to-long v6, v4

    .line 703
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 704
    .line 705
    .line 706
    move-result v4

    .line 707
    int-to-long v4, v4

    .line 708
    shl-long v6, v6, v16

    .line 709
    .line 710
    and-long v4, v4, v17

    .line 711
    .line 712
    or-long/2addr v4, v6

    .line 713
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 714
    .line 715
    .line 716
    move-result-wide v4

    .line 717
    move-wide/from16 v13, v24

    .line 718
    .line 719
    invoke-static {v13, v14, v4, v5}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 720
    .line 721
    .line 722
    move-result-wide v4

    .line 723
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 724
    .line 725
    .line 726
    move-result v6

    .line 727
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 728
    .line 729
    .line 730
    move-result v6

    .line 731
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    invoke-interface {v1, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 736
    .line 737
    .line 738
    move-result v7

    .line 739
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 740
    .line 741
    .line 742
    move-result v6

    .line 743
    int-to-long v9, v6

    .line 744
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 745
    .line 746
    .line 747
    move-result v6

    .line 748
    int-to-long v6, v6

    .line 749
    shl-long v9, v9, v16

    .line 750
    .line 751
    and-long v6, v6, v17

    .line 752
    .line 753
    or-long/2addr v6, v9

    .line 754
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 755
    .line 756
    .line 757
    move-result-wide v6

    .line 758
    invoke-static {v13, v14, v6, v7}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 759
    .line 760
    .line 761
    move-result-wide v6

    .line 762
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    .line 763
    .line 764
    .line 765
    move-result v9

    .line 766
    const/16 v14, 0x1e0

    .line 767
    .line 768
    const/4 v10, 0x0

    .line 769
    const/4 v13, 0x0

    .line 770
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 774
    .line 775
    return-object v1
.end method
