.class public Lcom/friday/common/camera/ZoomControlView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public c:I

.field public final d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:F

.field public m:F

.field public n:Landroid/graphics/Paint;

.field public o:Landroid/graphics/RectF;

.field public p:Landroid/graphics/Path;

.field public q:Landroid/graphics/RectF;

.field public r:Landroid/graphics/Rect;

.field public s:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/friday/common/camera/ZoomControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/friday/common/camera/ZoomControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->d:I

    const/4 p2, 0x4

    .line 5
    iput p2, p0, Lcom/friday/common/camera/ZoomControlView;->e:I

    sub-int/2addr p2, p1

    .line 6
    iput p2, p0, Lcom/friday/common/camera/ZoomControlView;->f:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 7
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->g:F

    .line 8
    invoke-virtual {p0}, Lcom/friday/common/camera/ZoomControlView;->b()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    float-to-int p1, p1

    .line 16
    return p1
.end method

.method public final b()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/camera/ZoomControlView;->a(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iput v1, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/friday/common/camera/ZoomControlView;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 15
    .line 16
    add-int/2addr v1, v2

    .line 17
    iput v1, p0, Lcom/friday/common/camera/ZoomControlView;->i:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-virtual {p0, v2}, Lcom/friday/common/camera/ZoomControlView;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v1, v2

    .line 25
    iput v1, p0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 26
    .line 27
    new-instance v1, Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 38
    .line 39
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->o:Landroid/graphics/RectF;

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Path;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 57
    .line 58
    new-instance v0, Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->q:Landroid/graphics/RectF;

    .line 64
    .line 65
    new-instance v0, Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/friday/common/camera/ZoomControlView;->e()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final c(I)I
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    float-to-int p1, p1

    .line 16
    return p1
.end method

.method public d(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->e:I

    .line 8
    .line 9
    sub-int/2addr p1, v1

    .line 10
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/common/camera/ZoomControlView;->e()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    new-array v0, v0, [Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->s:[Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/friday/common/camera/ZoomControlView;->s:[Ljava/lang/String;

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-ge v0, v2, :cond_0

    .line 14
    .line 15
    iget v2, p0, Lcom/friday/common/camera/ZoomControlView;->e:I

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    iget v3, p0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 20
    .line 21
    div-int/2addr v2, v3

    .line 22
    mul-int/2addr v2, v0

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    aput-object v2, v1, v0

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public getRealTimeValue()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->g:F

    .line 2
    .line 3
    const/high16 v1, 0x41200000    # 10.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    div-float/2addr v0, v1

    .line 12
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v7, -0x1

    .line 9
    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v8, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v1, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    const/16 v1, -0x3c

    .line 20
    .line 21
    int-to-double v1, v1

    .line 22
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v9

    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v11

    .line 38
    iget v1, v0, Lcom/friday/common/camera/ZoomControlView;->k:I

    .line 39
    .line 40
    iget v2, v0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 41
    .line 42
    add-int v3, v1, v2

    .line 43
    .line 44
    int-to-double v3, v3

    .line 45
    iget v5, v0, Lcom/friday/common/camera/ZoomControlView;->c:I

    .line 46
    .line 47
    int-to-double v13, v5

    .line 48
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 49
    .line 50
    sub-double v17, v15, v9

    .line 51
    .line 52
    mul-double v13, v13, v17

    .line 53
    .line 54
    add-double/2addr v3, v13

    .line 55
    double-to-float v3, v3

    .line 56
    add-int v4, v1, v2

    .line 57
    .line 58
    int-to-double v13, v4

    .line 59
    move/from16 v18, v8

    .line 60
    .line 61
    int-to-double v7, v5

    .line 62
    sub-double/2addr v15, v11

    .line 63
    mul-double/2addr v7, v15

    .line 64
    add-double/2addr v13, v7

    .line 65
    double-to-float v4, v13

    .line 66
    add-int v6, v1, v2

    .line 67
    .line 68
    add-int/2addr v6, v5

    .line 69
    int-to-double v6, v6

    .line 70
    iget v8, v0, Lcom/friday/common/camera/ZoomControlView;->i:I

    .line 71
    .line 72
    sub-int v13, v5, v8

    .line 73
    .line 74
    int-to-double v13, v13

    .line 75
    mul-double/2addr v13, v9

    .line 76
    sub-double/2addr v6, v13

    .line 77
    double-to-float v6, v6

    .line 78
    add-int/2addr v1, v2

    .line 79
    add-int/2addr v1, v5

    .line 80
    int-to-double v1, v1

    .line 81
    sub-int/2addr v5, v8

    .line 82
    int-to-double v7, v5

    .line 83
    mul-double/2addr v7, v11

    .line 84
    sub-double/2addr v1, v7

    .line 85
    double-to-float v5, v1

    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 87
    .line 88
    .line 89
    move v2, v3

    .line 90
    move v3, v4

    .line 91
    move v4, v6

    .line 92
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 93
    .line 94
    move-object/from16 v1, p1

    .line 95
    .line 96
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    const/16 v7, 0x78

    .line 100
    .line 101
    int-to-float v8, v7

    .line 102
    mul-float v13, v8, v18

    .line 103
    .line 104
    iget v6, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 105
    .line 106
    int-to-float v6, v6

    .line 107
    div-float v14, v13, v6

    .line 108
    .line 109
    move/from16 v16, v7

    .line 110
    .line 111
    const/4 v6, 0x0

    .line 112
    :goto_0
    iget v7, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 113
    .line 114
    if-ge v6, v7, :cond_0

    .line 115
    .line 116
    iget v7, v0, Lcom/friday/common/camera/ZoomControlView;->l:F

    .line 117
    .line 118
    iget v15, v0, Lcom/friday/common/camera/ZoomControlView;->m:F

    .line 119
    .line 120
    invoke-virtual {v1, v14, v7, v15}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 121
    .line 122
    .line 123
    move v15, v6

    .line 124
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 125
    .line 126
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v6, v15, 0x1

    .line 130
    .line 131
    move-object/from16 v1, p1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 138
    .line 139
    .line 140
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 141
    .line 142
    move/from16 v4, v18

    .line 143
    .line 144
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 145
    .line 146
    .line 147
    iget v1, v0, Lcom/friday/common/camera/ZoomControlView;->k:I

    .line 148
    .line 149
    iget v4, v0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 150
    .line 151
    add-int v5, v1, v4

    .line 152
    .line 153
    iget v6, v0, Lcom/friday/common/camera/ZoomControlView;->c:I

    .line 154
    .line 155
    add-int/2addr v5, v6

    .line 156
    int-to-double v14, v5

    .line 157
    int-to-float v5, v6

    .line 158
    iget v7, v0, Lcom/friday/common/camera/ZoomControlView;->i:I

    .line 159
    .line 160
    move/from16 v19, v1

    .line 161
    .line 162
    int-to-float v1, v7

    .line 163
    const/high16 v20, 0x40000000    # 2.0f

    .line 164
    .line 165
    div-float v1, v1, v20

    .line 166
    .line 167
    sub-float/2addr v5, v1

    .line 168
    move/from16 v21, v2

    .line 169
    .line 170
    float-to-double v1, v5

    .line 171
    mul-double/2addr v1, v9

    .line 172
    sub-double/2addr v14, v1

    .line 173
    double-to-float v1, v14

    .line 174
    add-int v2, v19, v4

    .line 175
    .line 176
    add-int/2addr v2, v6

    .line 177
    int-to-double v4, v2

    .line 178
    int-to-float v2, v6

    .line 179
    int-to-float v6, v7

    .line 180
    div-float v6, v6, v20

    .line 181
    .line 182
    sub-float/2addr v2, v6

    .line 183
    float-to-double v6, v2

    .line 184
    mul-double/2addr v6, v11

    .line 185
    sub-double/2addr v4, v6

    .line 186
    double-to-float v5, v4

    .line 187
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 188
    .line 189
    move v4, v1

    .line 190
    move/from16 v2, v21

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 195
    .line 196
    .line 197
    iget v6, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 198
    .line 199
    const/16 v7, 0xa

    .line 200
    .line 201
    mul-int/2addr v6, v7

    .line 202
    int-to-float v6, v6

    .line 203
    div-float v14, v13, v6

    .line 204
    .line 205
    const/4 v6, 0x1

    .line 206
    move v15, v6

    .line 207
    :goto_1
    iget v6, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 208
    .line 209
    mul-int/2addr v6, v7

    .line 210
    if-ge v15, v6, :cond_2

    .line 211
    .line 212
    iget v6, v0, Lcom/friday/common/camera/ZoomControlView;->l:F

    .line 213
    .line 214
    iget v7, v0, Lcom/friday/common/camera/ZoomControlView;->m:F

    .line 215
    .line 216
    invoke-virtual {v1, v14, v6, v7}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 217
    .line 218
    .line 219
    rem-int/lit8 v6, v15, 0xa

    .line 220
    .line 221
    if-nez v6, :cond_1

    .line 222
    .line 223
    :goto_2
    move/from16 v21, v2

    .line 224
    .line 225
    move v7, v3

    .line 226
    goto :goto_3

    .line 227
    :cond_1
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 228
    .line 229
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :goto_3
    add-int/lit8 v15, v15, 0x1

    .line 234
    .line 235
    move-object/from16 v1, p1

    .line 236
    .line 237
    move v3, v7

    .line 238
    move/from16 v2, v21

    .line 239
    .line 240
    const/16 v7, 0xa

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_2
    move/from16 v21, v2

    .line 244
    .line 245
    move v7, v3

    .line 246
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 247
    .line 248
    .line 249
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 250
    .line 251
    const/16 v2, 0xa

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Lcom/friday/common/camera/ZoomControlView;->c(I)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    int-to-float v2, v3

    .line 258
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 262
    .line 263
    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 264
    .line 265
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 266
    .line 267
    .line 268
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 269
    .line 270
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 271
    .line 272
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 273
    .line 274
    .line 275
    const/4 v14, 0x0

    .line 276
    :goto_4
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->s:[Ljava/lang/String;

    .line 277
    .line 278
    array-length v2, v1

    .line 279
    const-wide v3, 0x400921fb54442d18L    # Math.PI

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    if-ge v14, v2, :cond_4

    .line 285
    .line 286
    aget-object v1, v1, v14

    .line 287
    .line 288
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    invoke-virtual {v0}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    const v5, 0x3e99999a    # 0.3f

    .line 297
    .line 298
    .line 299
    add-float/2addr v2, v5

    .line 300
    cmpg-float v1, v1, v2

    .line 301
    .line 302
    if-gtz v1, :cond_3

    .line 303
    .line 304
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->s:[Ljava/lang/String;

    .line 305
    .line 306
    aget-object v1, v1, v14

    .line 307
    .line 308
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-virtual {v0}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    sub-float/2addr v2, v5

    .line 317
    cmpl-float v1, v1, v2

    .line 318
    .line 319
    if-ltz v1, :cond_3

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_3
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 323
    .line 324
    iget-object v2, v0, Lcom/friday/common/camera/ZoomControlView;->s:[Ljava/lang/String;

    .line 325
    .line 326
    aget-object v2, v2, v14

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 333
    .line 334
    const/4 v15, 0x0

    .line 335
    invoke-virtual {v1, v2, v15, v5, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 336
    .line 337
    .line 338
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 339
    .line 340
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    mul-int/lit16 v1, v1, 0xb4

    .line 345
    .line 346
    div-int/lit8 v1, v1, 0x2

    .line 347
    .line 348
    int-to-double v1, v1

    .line 349
    iget v5, v0, Lcom/friday/common/camera/ZoomControlView;->c:I

    .line 350
    .line 351
    iget v6, v0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 352
    .line 353
    sub-int/2addr v5, v6

    .line 354
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 355
    .line 356
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    sub-int/2addr v5, v6

    .line 361
    int-to-double v5, v5

    .line 362
    mul-double/2addr v5, v3

    .line 363
    div-double/2addr v1, v5

    .line 364
    double-to-float v1, v1

    .line 365
    iget-object v2, v0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 366
    .line 367
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 368
    .line 369
    .line 370
    iget-object v2, v0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 371
    .line 372
    iget-object v3, v0, Lcom/friday/common/camera/ZoomControlView;->q:Landroid/graphics/RectF;

    .line 373
    .line 374
    iget v4, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 375
    .line 376
    div-int v4, v16, v4

    .line 377
    .line 378
    mul-int/2addr v4, v14

    .line 379
    add-int v4, v16, v4

    .line 380
    .line 381
    int-to-float v4, v4

    .line 382
    sub-float/2addr v4, v1

    .line 383
    invoke-virtual {v2, v3, v4, v8}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 384
    .line 385
    .line 386
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->s:[Ljava/lang/String;

    .line 387
    .line 388
    aget-object v2, v1, v14

    .line 389
    .line 390
    iget-object v3, v0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 391
    .line 392
    const/4 v5, 0x0

    .line 393
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 394
    .line 395
    const/4 v4, 0x0

    .line 396
    move-object/from16 v1, p1

    .line 397
    .line 398
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 399
    .line 400
    .line 401
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 402
    .line 403
    goto :goto_4

    .line 404
    :cond_4
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 405
    .line 406
    const/16 v14, -0x100

    .line 407
    .line 408
    invoke-virtual {v1, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 409
    .line 410
    .line 411
    new-instance v1, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    const-string v2, "x"

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 439
    .line 440
    const/4 v15, 0x0

    .line 441
    invoke-virtual {v1, v2, v15, v5, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 442
    .line 443
    .line 444
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 445
    .line 446
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    mul-int/lit16 v1, v1, 0xb4

    .line 451
    .line 452
    div-int/lit8 v1, v1, 0x2

    .line 453
    .line 454
    int-to-double v5, v1

    .line 455
    iget v1, v0, Lcom/friday/common/camera/ZoomControlView;->c:I

    .line 456
    .line 457
    iget v15, v0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 458
    .line 459
    sub-int/2addr v1, v15

    .line 460
    iget-object v15, v0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 461
    .line 462
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 463
    .line 464
    .line 465
    move-result v15

    .line 466
    sub-int/2addr v1, v15

    .line 467
    move-wide v15, v3

    .line 468
    int-to-double v3, v1

    .line 469
    mul-double/2addr v3, v15

    .line 470
    div-double/2addr v5, v3

    .line 471
    double-to-float v1, v5

    .line 472
    iget-object v3, v0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 473
    .line 474
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 475
    .line 476
    .line 477
    iget-object v3, v0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 478
    .line 479
    iget-object v4, v0, Lcom/friday/common/camera/ZoomControlView;->q:Landroid/graphics/RectF;

    .line 480
    .line 481
    iget v5, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 482
    .line 483
    const/16 v6, 0xa

    .line 484
    .line 485
    mul-int/2addr v5, v6

    .line 486
    int-to-float v5, v5

    .line 487
    div-float v5, v13, v5

    .line 488
    .line 489
    iget v15, v0, Lcom/friday/common/camera/ZoomControlView;->g:F

    .line 490
    .line 491
    const/high16 v18, 0x3f800000    # 1.0f

    .line 492
    .line 493
    sub-float v15, v15, v18

    .line 494
    .line 495
    mul-float/2addr v5, v15

    .line 496
    int-to-float v15, v6

    .line 497
    mul-float/2addr v5, v15

    .line 498
    add-float/2addr v5, v8

    .line 499
    sub-float/2addr v5, v1

    .line 500
    invoke-virtual {v3, v4, v5, v8}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 501
    .line 502
    .line 503
    iget-object v3, v0, Lcom/friday/common/camera/ZoomControlView;->p:Landroid/graphics/Path;

    .line 504
    .line 505
    const/4 v5, 0x0

    .line 506
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 507
    .line 508
    const/4 v4, 0x0

    .line 509
    move-object/from16 v1, p1

    .line 510
    .line 511
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 515
    .line 516
    .line 517
    iget-object v2, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 518
    .line 519
    const/high16 v3, 0x40800000    # 4.0f

    .line 520
    .line 521
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 522
    .line 523
    .line 524
    iget-object v2, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 525
    .line 526
    invoke-virtual {v2, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 527
    .line 528
    .line 529
    iget v2, v0, Lcom/friday/common/camera/ZoomControlView;->k:I

    .line 530
    .line 531
    iget v3, v0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 532
    .line 533
    add-int v4, v2, v3

    .line 534
    .line 535
    iget v5, v0, Lcom/friday/common/camera/ZoomControlView;->c:I

    .line 536
    .line 537
    add-int/2addr v4, v5

    .line 538
    move v6, v2

    .line 539
    move v8, v3

    .line 540
    int-to-double v2, v4

    .line 541
    iget v4, v0, Lcom/friday/common/camera/ZoomControlView;->i:I

    .line 542
    .line 543
    sub-int v14, v5, v4

    .line 544
    .line 545
    move-wide/from16 v22, v2

    .line 546
    .line 547
    int-to-double v2, v14

    .line 548
    mul-double/2addr v2, v9

    .line 549
    sub-double v2, v22, v2

    .line 550
    .line 551
    double-to-float v2, v2

    .line 552
    add-int v3, v6, v8

    .line 553
    .line 554
    add-int/2addr v3, v5

    .line 555
    int-to-double v8, v3

    .line 556
    sub-int/2addr v5, v4

    .line 557
    int-to-double v3, v5

    .line 558
    mul-double/2addr v3, v11

    .line 559
    sub-double/2addr v8, v3

    .line 560
    double-to-float v5, v8

    .line 561
    iget v3, v0, Lcom/friday/common/camera/ZoomControlView;->f:I

    .line 562
    .line 563
    const/16 v19, 0xa

    .line 564
    .line 565
    mul-int/lit8 v3, v3, 0xa

    .line 566
    .line 567
    int-to-float v3, v3

    .line 568
    div-float/2addr v13, v3

    .line 569
    iget v3, v0, Lcom/friday/common/camera/ZoomControlView;->g:F

    .line 570
    .line 571
    const/high16 v18, 0x3f800000    # 1.0f

    .line 572
    .line 573
    sub-float v3, v3, v18

    .line 574
    .line 575
    mul-float/2addr v13, v3

    .line 576
    mul-float/2addr v13, v15

    .line 577
    iget v3, v0, Lcom/friday/common/camera/ZoomControlView;->l:F

    .line 578
    .line 579
    iget v4, v0, Lcom/friday/common/camera/ZoomControlView;->m:F

    .line 580
    .line 581
    invoke-virtual {v1, v13, v3, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 582
    .line 583
    .line 584
    iget-object v6, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 585
    .line 586
    move v4, v2

    .line 587
    move v3, v7

    .line 588
    move/from16 v2, v21

    .line 589
    .line 590
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 594
    .line 595
    .line 596
    iget-object v1, v0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 597
    .line 598
    const/4 v2, -0x1

    .line 599
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 600
    .line 601
    .line 602
    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iput p2, p0, Lcom/friday/common/camera/ZoomControlView;->k:I

    .line 33
    .line 34
    invoke-virtual {p0, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    sget v0, Lcom/friday/common/R$dimen;->view_150:I

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p2, p1}, Landroid/view/View;->resolveSize(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget p2, p0, Lcom/friday/common/camera/ZoomControlView;->k:I

    .line 52
    .line 53
    mul-int/lit8 p2, p2, 0x2

    .line 54
    .line 55
    sub-int/2addr p1, p2

    .line 56
    iget p2, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 57
    .line 58
    mul-int/lit8 p2, p2, 0x2

    .line 59
    .line 60
    sub-int/2addr p1, p2

    .line 61
    div-int/lit8 p1, p1, 0x2

    .line 62
    .line 63
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->c:I

    .line 64
    .line 65
    iget-object p1, p0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 66
    .line 67
    const/16 p2, 0x10

    .line 68
    .line 69
    invoke-virtual {p0, p2}, Lcom/friday/common/camera/ZoomControlView;->c(I)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    int-to-float p2, p2

    .line 74
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    int-to-float p1, p1

    .line 82
    const/high16 p2, 0x40000000    # 2.0f

    .line 83
    .line 84
    div-float/2addr p1, p2

    .line 85
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->m:F

    .line 86
    .line 87
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->l:F

    .line 88
    .line 89
    iget-object p1, p0, Lcom/friday/common/camera/ZoomControlView;->o:Landroid/graphics/RectF;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 96
    .line 97
    add-int/2addr p2, v0

    .line 98
    int-to-float p2, p2

    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget v1, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 104
    .line 105
    add-int/2addr v0, v1

    .line 106
    int-to-float v0, v0

    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    sub-int/2addr v1, v2

    .line 116
    iget v2, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 117
    .line 118
    sub-int/2addr v1, v2

    .line 119
    int-to-float v1, v1

    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    sub-int/2addr v2, v3

    .line 129
    iget v3, p0, Lcom/friday/common/camera/ZoomControlView;->h:I

    .line 130
    .line 131
    sub-int/2addr v2, v3

    .line 132
    int-to-float v2, v2

    .line 133
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 137
    .line 138
    const/16 p2, 0xa

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Lcom/friday/common/camera/ZoomControlView;->c(I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    int-to-float p2, p2

    .line 145
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lcom/friday/common/camera/ZoomControlView;->n:Landroid/graphics/Paint;

    .line 149
    .line 150
    const/4 p2, 0x1

    .line 151
    iget-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 152
    .line 153
    const-string v1, "0"

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    invoke-virtual {p1, v1, v2, p2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lcom/friday/common/camera/ZoomControlView;->q:Landroid/graphics/RectF;

    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 166
    .line 167
    add-int/2addr p2, v0

    .line 168
    iget-object v0, p0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    add-int/2addr p2, v0

    .line 175
    int-to-float p2, p2

    .line 176
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iget v1, p0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 181
    .line 182
    add-int/2addr v0, v1

    .line 183
    iget-object v1, p0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    add-int/2addr v0, v1

    .line 190
    int-to-float v0, v0

    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    sub-int/2addr v1, v2

    .line 200
    iget v2, p0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 201
    .line 202
    sub-int/2addr v1, v2

    .line 203
    iget-object v2, p0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 204
    .line 205
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    sub-int/2addr v1, v2

    .line 210
    int-to-float v1, v1

    .line 211
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    sub-int/2addr v2, v3

    .line 220
    iget v3, p0, Lcom/friday/common/camera/ZoomControlView;->j:I

    .line 221
    .line 222
    sub-int/2addr v2, v3

    .line 223
    iget-object v3, p0, Lcom/friday/common/camera/ZoomControlView;->r:Landroid/graphics/Rect;

    .line 224
    .line 225
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    sub-int/2addr v2, v3

    .line 230
    int-to-float v2, v2

    .line 231
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public setRealTimeValue(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->g:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float v0, p1, v0

    .line 10
    .line 11
    if-ltz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lcom/friday/common/camera/ZoomControlView;->e:I

    .line 14
    .line 15
    int-to-float v0, v0

    .line 16
    cmpl-float v0, p1, v0

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput p1, p0, Lcom/friday/common/camera/ZoomControlView;->g:F

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method
