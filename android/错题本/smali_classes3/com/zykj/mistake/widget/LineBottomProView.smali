.class public Lcom/zykj/mistake/widget/LineBottomProView;
.super Lcom/zykj/mistake/widget/LineBaseProView;
.source "SourceFile"


# instance fields
.field public G:Landroid/graphics/Paint;

.field public H:I

.field public I:I

.field public J:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/zykj/mistake/widget/LineBottomProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/mistake/widget/LineBottomProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/mistake/widget/LineBaseProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 5
    sget-object p3, Lcom/zykj/mistake/R$styleable;->LineBottomProView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBottomProView_box_width:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 7
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBottomProView_box_height:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 8
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBottomProView_box_radius:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/mistake/widget/LineBottomProView;->J:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 19
    .line 20
    iget v2, p0, Lcom/zykj/mistake/widget/BaseProView;->b:I

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    div-int/lit8 v0, v2, 0x5

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 29
    .line 30
    :cond_0
    iget v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    if-ne v0, v3, :cond_1

    .line 34
    .line 35
    div-int/lit8 v2, v2, 0x5

    .line 36
    .line 37
    mul-int/lit8 v2, v2, 0x2

    .line 38
    .line 39
    iput v2, p0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 40
    .line 41
    :cond_1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 42
    .line 43
    if-ne v0, v3, :cond_2

    .line 44
    .line 45
    iget v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 46
    .line 47
    mul-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    iput v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 50
    .line 51
    :cond_2
    iget v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->J:I

    .line 52
    .line 53
    if-ne v0, v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/high16 v2, 0x40a00000    # 5.0f

    .line 64
    .line 65
    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    float-to-int v0, v0

    .line 70
    iput v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->J:I

    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public getBoxPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBoxRadius()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->J:I

    .line 2
    .line 3
    return v0
.end method

.method public getBoxWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/mistake/widget/LineBaseProView;->E:Landroid/graphics/Path;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lcom/zykj/mistake/widget/LineBaseProView;->F:Landroid/graphics/Path;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 13
    .line 14
    .line 15
    iget-wide v4, v0, Lcom/zykj/mistake/widget/BaseProView;->t:D

    .line 16
    .line 17
    iget-wide v6, v0, Lcom/zykj/mistake/widget/BaseProView;->s:D

    .line 18
    .line 19
    div-double/2addr v4, v6

    .line 20
    iget v6, v0, Lcom/zykj/mistake/widget/BaseProView;->a:I

    .line 21
    .line 22
    iget v7, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 23
    .line 24
    sub-int/2addr v6, v7

    .line 25
    int-to-double v6, v6

    .line 26
    mul-double/2addr v4, v6

    .line 27
    double-to-int v4, v4

    .line 28
    iget v5, v0, Lcom/zykj/mistake/widget/BaseProView;->b:I

    .line 29
    .line 30
    iget v6, v0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 31
    .line 32
    sub-int/2addr v5, v6

    .line 33
    iget-boolean v6, v0, Lcom/zykj/mistake/widget/LineBaseProView;->B:Z

    .line 34
    .line 35
    const/4 v8, 0x6

    .line 36
    const/4 v9, 0x5

    .line 37
    const/4 v10, 0x4

    .line 38
    const/4 v11, 0x3

    .line 39
    const/4 v12, 0x1

    .line 40
    const/16 v13, 0x8

    .line 41
    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x2

    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    iget v6, v0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    .line 47
    .line 48
    const/16 v16, 0x7

    .line 49
    .line 50
    new-array v7, v13, [F

    .line 51
    .line 52
    aput v6, v7, v14

    .line 53
    .line 54
    aput v6, v7, v12

    .line 55
    .line 56
    aput v6, v7, v15

    .line 57
    .line 58
    aput v6, v7, v11

    .line 59
    .line 60
    aput v6, v7, v10

    .line 61
    .line 62
    aput v6, v7, v9

    .line 63
    .line 64
    aput v6, v7, v8

    .line 65
    .line 66
    aput v6, v7, v16

    .line 67
    .line 68
    iput-object v7, v0, Lcom/zykj/mistake/widget/LineBaseProView;->C:[F

    .line 69
    .line 70
    iget v7, v0, Lcom/zykj/mistake/widget/LineBaseProView;->A:F

    .line 71
    .line 72
    new-array v13, v13, [F

    .line 73
    .line 74
    aput v6, v13, v14

    .line 75
    .line 76
    aput v6, v13, v12

    .line 77
    .line 78
    aput v7, v13, v15

    .line 79
    .line 80
    aput v7, v13, v11

    .line 81
    .line 82
    aput v7, v13, v10

    .line 83
    .line 84
    aput v7, v13, v9

    .line 85
    .line 86
    aput v6, v13, v8

    .line 87
    .line 88
    aput v6, v13, v16

    .line 89
    .line 90
    iput-object v13, v0, Lcom/zykj/mistake/widget/LineBaseProView;->D:[F

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const/16 v16, 0x7

    .line 94
    .line 95
    iget v6, v0, Lcom/zykj/mistake/widget/LineBaseProView;->w:F

    .line 96
    .line 97
    iget v7, v0, Lcom/zykj/mistake/widget/LineBaseProView;->y:F

    .line 98
    .line 99
    move/from16 v17, v8

    .line 100
    .line 101
    iget v8, v0, Lcom/zykj/mistake/widget/LineBaseProView;->z:F

    .line 102
    .line 103
    move/from16 v18, v9

    .line 104
    .line 105
    iget v9, v0, Lcom/zykj/mistake/widget/LineBaseProView;->x:F

    .line 106
    .line 107
    move/from16 v19, v10

    .line 108
    .line 109
    new-array v10, v13, [F

    .line 110
    .line 111
    aput v6, v10, v14

    .line 112
    .line 113
    aput v6, v10, v12

    .line 114
    .line 115
    aput v7, v10, v15

    .line 116
    .line 117
    aput v7, v10, v11

    .line 118
    .line 119
    aput v8, v10, v19

    .line 120
    .line 121
    aput v8, v10, v18

    .line 122
    .line 123
    aput v9, v10, v17

    .line 124
    .line 125
    aput v9, v10, v16

    .line 126
    .line 127
    iput-object v10, v0, Lcom/zykj/mistake/widget/LineBaseProView;->C:[F

    .line 128
    .line 129
    iget v7, v0, Lcom/zykj/mistake/widget/LineBaseProView;->A:F

    .line 130
    .line 131
    new-array v8, v13, [F

    .line 132
    .line 133
    aput v6, v8, v14

    .line 134
    .line 135
    aput v6, v8, v12

    .line 136
    .line 137
    aput v7, v8, v15

    .line 138
    .line 139
    aput v7, v8, v11

    .line 140
    .line 141
    aput v7, v8, v19

    .line 142
    .line 143
    aput v7, v8, v18

    .line 144
    .line 145
    aput v9, v8, v17

    .line 146
    .line 147
    aput v9, v8, v16

    .line 148
    .line 149
    iput-object v8, v0, Lcom/zykj/mistake/widget/LineBaseProView;->D:[F

    .line 150
    .line 151
    :goto_0
    new-instance v6, Landroid/graphics/RectF;

    .line 152
    .line 153
    iget v7, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 154
    .line 155
    div-int/2addr v7, v15

    .line 156
    int-to-float v8, v7

    .line 157
    int-to-float v9, v5

    .line 158
    iget v10, v0, Lcom/zykj/mistake/widget/BaseProView;->a:I

    .line 159
    .line 160
    sub-int/2addr v10, v7

    .line 161
    int-to-float v7, v10

    .line 162
    iget v10, v0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 163
    .line 164
    add-int/2addr v10, v5

    .line 165
    int-to-float v10, v10

    .line 166
    invoke-direct {v6, v8, v9, v7, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 167
    .line 168
    .line 169
    iget-object v7, v0, Lcom/zykj/mistake/widget/LineBaseProView;->C:[F

    .line 170
    .line 171
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 172
    .line 173
    invoke-virtual {v2, v6, v7, v8}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 174
    .line 175
    .line 176
    new-instance v6, Landroid/graphics/RectF;

    .line 177
    .line 178
    iget v7, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 179
    .line 180
    div-int/2addr v7, v15

    .line 181
    int-to-float v10, v7

    .line 182
    add-int/2addr v7, v4

    .line 183
    int-to-float v7, v7

    .line 184
    iget v11, v0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 185
    .line 186
    add-int/2addr v5, v11

    .line 187
    int-to-float v5, v5

    .line 188
    invoke-direct {v6, v10, v9, v7, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 189
    .line 190
    .line 191
    iget-object v5, v0, Lcom/zykj/mistake/widget/LineBaseProView;->D:[F

    .line 192
    .line 193
    invoke-virtual {v3, v6, v5, v8}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 194
    .line 195
    .line 196
    sget-object v5, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 197
    .line 198
    invoke-virtual {v3, v2, v5}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 199
    .line 200
    .line 201
    iget-object v5, v0, Lcom/zykj/mistake/widget/BaseProView;->n:Landroid/graphics/Paint;

    .line 202
    .line 203
    invoke-virtual {v1, v2, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 207
    .line 208
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 209
    .line 210
    .line 211
    new-instance v2, Landroid/graphics/RectF;

    .line 212
    .line 213
    int-to-float v3, v4

    .line 214
    iget v5, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 215
    .line 216
    add-int/2addr v5, v4

    .line 217
    int-to-float v5, v5

    .line 218
    iget v6, v0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 219
    .line 220
    int-to-float v6, v6

    .line 221
    const/4 v7, 0x0

    .line 222
    invoke-direct {v2, v3, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 223
    .line 224
    .line 225
    iget v3, v0, Lcom/zykj/mistake/widget/LineBottomProView;->J:I

    .line 226
    .line 227
    int-to-float v3, v3

    .line 228
    iget-object v5, v0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 229
    .line 230
    invoke-virtual {v1, v2, v3, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 231
    .line 232
    .line 233
    new-instance v2, Landroid/graphics/Path;

    .line 234
    .line 235
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 236
    .line 237
    .line 238
    iget v3, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 239
    .line 240
    div-int/2addr v3, v15

    .line 241
    add-int/2addr v3, v4

    .line 242
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    const/high16 v6, 0x40800000    # 4.0f

    .line 251
    .line 252
    invoke-static {v15, v6, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    float-to-int v5, v5

    .line 257
    sub-int/2addr v3, v5

    .line 258
    int-to-float v3, v3

    .line 259
    iget v5, v0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 260
    .line 261
    int-to-float v5, v5

    .line 262
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 263
    .line 264
    .line 265
    iget v3, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 266
    .line 267
    div-int/2addr v3, v15

    .line 268
    add-int/2addr v3, v4

    .line 269
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-static {v15, v6, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    float-to-int v5, v5

    .line 282
    add-int/2addr v5, v3

    .line 283
    int-to-float v3, v5

    .line 284
    iget v5, v0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 285
    .line 286
    int-to-float v5, v5

    .line 287
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 288
    .line 289
    .line 290
    iget v3, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 291
    .line 292
    div-int/2addr v3, v15

    .line 293
    add-int/2addr v3, v4

    .line 294
    int-to-float v3, v3

    .line 295
    iget v5, v0, Lcom/zykj/mistake/widget/BaseProView;->b:I

    .line 296
    .line 297
    iget v6, v0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 298
    .line 299
    sub-int/2addr v5, v6

    .line 300
    sub-int/2addr v5, v15

    .line 301
    int-to-float v5, v5

    .line 302
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 306
    .line 307
    .line 308
    iget-object v3, v0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 309
    .line 310
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 311
    .line 312
    .line 313
    iget-object v2, v0, Lcom/zykj/mistake/widget/BaseProView;->f:Ljava/lang/String;

    .line 314
    .line 315
    iget v3, v0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 316
    .line 317
    div-int/2addr v3, v15

    .line 318
    add-int/2addr v3, v4

    .line 319
    new-instance v4, Landroid/graphics/Rect;

    .line 320
    .line 321
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 322
    .line 323
    .line 324
    iget-object v5, v0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    invoke-virtual {v5, v2, v14, v6, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    div-int/2addr v4, v15

    .line 338
    sub-int/2addr v3, v4

    .line 339
    int-to-float v3, v3

    .line 340
    iget-object v4, v0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    .line 341
    .line 342
    iget v5, v0, Lcom/zykj/mistake/widget/LineBottomProView;->I:I

    .line 343
    .line 344
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    iget v6, v4, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 349
    .line 350
    iget v4, v4, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 351
    .line 352
    sub-int v4, v6, v4

    .line 353
    .line 354
    div-int/lit8 v7, v4, 0x2

    .line 355
    .line 356
    sub-int/2addr v7, v6

    .line 357
    add-int/2addr v5, v4

    .line 358
    div-int/2addr v5, v15

    .line 359
    sub-int/2addr v5, v7

    .line 360
    int-to-float v4, v5

    .line 361
    iget-object v5, v0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    .line 362
    .line 363
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 364
    .line 365
    .line 366
    return-void
.end method

.method public setBoxPaint(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/LineBottomProView;->G:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-void
.end method

.method public setBoxRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBottomProView;->J:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBoxWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBottomProView;->H:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
