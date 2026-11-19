.class public Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;
.super Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/ShadowUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShadowDrawable"
.end annotation


# static fields
.field private static final COS_45:D


# instance fields
.field private isCircle:Z

.field private mAddPaddingForCorners:Z

.field private mContentBounds:Landroid/graphics/RectF;

.field private mCornerRadius:F

.field private mCornerShadowPaint:Landroid/graphics/Paint;

.field private mCornerShadowPath:Landroid/graphics/Path;

.field private mDirty:Z

.field private mEdgeShadowPaint:Landroid/graphics/Paint;

.field private mMaxShadowSize:F

.field private mRawMaxShadowSize:F

.field private mRawShadowSize:F

.field private mRotation:F

.field private mShadowBottomScale:F

.field private final mShadowEndColor:I

.field private mShadowHorizScale:F

.field private mShadowMultiplier:F

.field private mShadowSize:F

.field private final mShadowStartColor:I

.field private mShadowTopScale:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->COS_45:D

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;FFFIZ)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 7
    .line 8
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowTopScale:F

    .line 9
    .line 10
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowHorizScale:F

    .line 11
    .line 12
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowBottomScale:F

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mDirty:Z

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mAddPaddingForCorners:Z

    .line 19
    .line 20
    iput p5, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowStartColor:I

    .line 21
    .line 22
    const v1, 0xffffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p5, v1

    .line 26
    iput p5, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowEndColor:I

    .line 27
    .line 28
    iput-boolean p6, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->isCircle:Z

    .line 29
    .line 30
    if-eqz p6, :cond_0

    .line 31
    .line 32
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 33
    .line 34
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowTopScale:F

    .line 35
    .line 36
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowHorizScale:F

    .line 37
    .line 38
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowBottomScale:F

    .line 39
    .line 40
    :cond_0
    new-instance p1, Landroid/graphics/Paint;

    .line 41
    .line 42
    const/4 p5, 0x5

    .line 43
    invoke-direct {p1, p5}, Landroid/graphics/Paint;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 47
    .line 48
    sget-object p5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 49
    .line 50
    invoke-virtual {p1, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-float p1, p1

    .line 58
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 59
    .line 60
    new-instance p1, Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 66
    .line 67
    new-instance p1, Landroid/graphics/Paint;

    .line 68
    .line 69
    iget-object p2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p3, p4}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->setShadowSize(FF)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method private buildComponents(Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->isCircle:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    div-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 15
    .line 16
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 17
    .line 18
    mul-float/2addr v1, v0

    .line 19
    iget-object v2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 20
    .line 21
    iget v3, p1, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    int-to-float v3, v3

    .line 24
    add-float/2addr v3, v0

    .line 25
    iget v4, p1, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    int-to-float v4, v4

    .line 28
    add-float/2addr v4, v1

    .line 29
    iget v5, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    int-to-float v5, v5

    .line 32
    sub-float/2addr v5, v0

    .line 33
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    sub-float/2addr p1, v1

    .line 37
    invoke-virtual {v2, v3, v4, v5, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->getWrappedDrawable()Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 45
    .line 46
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 47
    .line 48
    float-to-int v1, v1

    .line 49
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    float-to-int v2, v2

    .line 52
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    float-to-int v3, v3

    .line 55
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 56
    .line 57
    float-to-int v0, v0

    .line 58
    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->buildShadowCorners()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private buildShadowCorners()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->isCircle:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x3

    .line 8
    const/high16 v5, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const/high16 v6, 0x43340000    # 180.0f

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget-object v1, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/high16 v9, 0x40000000    # 2.0f

    .line 23
    .line 24
    div-float/2addr v1, v9

    .line 25
    sub-float/2addr v1, v5

    .line 26
    new-instance v9, Landroid/graphics/RectF;

    .line 27
    .line 28
    neg-float v10, v1

    .line 29
    invoke-direct {v9, v10, v10, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 30
    .line 31
    .line 32
    new-instance v11, Landroid/graphics/RectF;

    .line 33
    .line 34
    invoke-direct {v11, v9}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 35
    .line 36
    .line 37
    iget v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowSize:F

    .line 38
    .line 39
    neg-float v13, v12

    .line 40
    neg-float v12, v12

    .line 41
    invoke-virtual {v11, v13, v12}, Landroid/graphics/RectF;->inset(FF)V

    .line 42
    .line 43
    .line 44
    iget-object v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 45
    .line 46
    if-nez v12, :cond_0

    .line 47
    .line 48
    new-instance v12, Landroid/graphics/Path;

    .line 49
    .line 50
    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v12}, Landroid/graphics/Path;->reset()V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 60
    .line 61
    sget-object v13, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 62
    .line 63
    invoke-virtual {v12, v13}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 64
    .line 65
    .line 66
    iget-object v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 67
    .line 68
    invoke-virtual {v12, v10, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 69
    .line 70
    .line 71
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 72
    .line 73
    iget v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowSize:F

    .line 74
    .line 75
    neg-float v12, v12

    .line 76
    invoke-virtual {v10, v12, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 77
    .line 78
    .line 79
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 80
    .line 81
    invoke-virtual {v10, v11, v6, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 82
    .line 83
    .line 84
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 85
    .line 86
    invoke-virtual {v10, v11, v8, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 87
    .line 88
    .line 89
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 90
    .line 91
    invoke-virtual {v10, v9, v6, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 92
    .line 93
    .line 94
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 95
    .line 96
    invoke-virtual {v10, v9, v8, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 97
    .line 98
    .line 99
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 100
    .line 101
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 102
    .line 103
    .line 104
    iget v6, v11, Landroid/graphics/RectF;->top:F

    .line 105
    .line 106
    neg-float v12, v6

    .line 107
    cmpl-float v6, v12, v8

    .line 108
    .line 109
    if-lez v6, :cond_1

    .line 110
    .line 111
    div-float/2addr v1, v12

    .line 112
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 113
    .line 114
    new-instance v9, Landroid/graphics/RadialGradient;

    .line 115
    .line 116
    iget v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowStartColor:I

    .line 117
    .line 118
    iget v11, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowEndColor:I

    .line 119
    .line 120
    filled-new-array {v7, v10, v11}, [I

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    new-array v14, v4, [F

    .line 125
    .line 126
    aput v8, v14, v7

    .line 127
    .line 128
    aput v1, v14, v3

    .line 129
    .line 130
    aput v5, v14, v2

    .line 131
    .line 132
    sget-object v15, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 133
    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    invoke-direct/range {v9 .. v15}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 140
    .line 141
    .line 142
    :cond_1
    return-void

    .line 143
    :cond_2
    new-instance v1, Landroid/graphics/RectF;

    .line 144
    .line 145
    iget v9, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 146
    .line 147
    neg-float v10, v9

    .line 148
    neg-float v11, v9

    .line 149
    invoke-direct {v1, v10, v11, v9, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 150
    .line 151
    .line 152
    new-instance v9, Landroid/graphics/RectF;

    .line 153
    .line 154
    invoke-direct {v9, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 155
    .line 156
    .line 157
    iget v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowSize:F

    .line 158
    .line 159
    neg-float v11, v10

    .line 160
    neg-float v10, v10

    .line 161
    invoke-virtual {v9, v11, v10}, Landroid/graphics/RectF;->inset(FF)V

    .line 162
    .line 163
    .line 164
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 165
    .line 166
    if-nez v10, :cond_3

    .line 167
    .line 168
    new-instance v10, Landroid/graphics/Path;

    .line 169
    .line 170
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_3
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 177
    .line 178
    .line 179
    :goto_1
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 180
    .line 181
    sget-object v11, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 182
    .line 183
    invoke-virtual {v10, v11}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 184
    .line 185
    .line 186
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 187
    .line 188
    iget v11, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 189
    .line 190
    neg-float v11, v11

    .line 191
    invoke-virtual {v10, v11, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 192
    .line 193
    .line 194
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 195
    .line 196
    iget v11, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowSize:F

    .line 197
    .line 198
    neg-float v11, v11

    .line 199
    invoke-virtual {v10, v11, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 200
    .line 201
    .line 202
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 203
    .line 204
    const/high16 v11, 0x42b40000    # 90.0f

    .line 205
    .line 206
    invoke-virtual {v10, v9, v6, v11, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 207
    .line 208
    .line 209
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 210
    .line 211
    const/high16 v10, 0x43870000    # 270.0f

    .line 212
    .line 213
    const/high16 v11, -0x3d4c0000    # -90.0f

    .line 214
    .line 215
    invoke-virtual {v6, v1, v10, v11, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 216
    .line 217
    .line 218
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 219
    .line 220
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 221
    .line 222
    .line 223
    iget v6, v9, Landroid/graphics/RectF;->top:F

    .line 224
    .line 225
    neg-float v13, v6

    .line 226
    cmpl-float v6, v13, v8

    .line 227
    .line 228
    if-lez v6, :cond_4

    .line 229
    .line 230
    iget v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 231
    .line 232
    div-float/2addr v6, v13

    .line 233
    iget-object v10, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 234
    .line 235
    move-object v11, v10

    .line 236
    new-instance v10, Landroid/graphics/RadialGradient;

    .line 237
    .line 238
    iget v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowStartColor:I

    .line 239
    .line 240
    iget v14, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowEndColor:I

    .line 241
    .line 242
    filled-new-array {v7, v12, v14}, [I

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    new-array v15, v4, [F

    .line 247
    .line 248
    aput v8, v15, v7

    .line 249
    .line 250
    aput v6, v15, v3

    .line 251
    .line 252
    aput v5, v15, v2

    .line 253
    .line 254
    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 255
    .line 256
    move-object v2, v11

    .line 257
    const/4 v11, 0x0

    .line 258
    const/4 v12, 0x0

    .line 259
    invoke-direct/range {v10 .. v16}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 263
    .line 264
    .line 265
    :cond_4
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 266
    .line 267
    new-instance v10, Landroid/graphics/LinearGradient;

    .line 268
    .line 269
    iget v12, v1, Landroid/graphics/RectF;->top:F

    .line 270
    .line 271
    iget v14, v9, Landroid/graphics/RectF;->top:F

    .line 272
    .line 273
    iget v15, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowStartColor:I

    .line 274
    .line 275
    iget v1, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowEndColor:I

    .line 276
    .line 277
    sget-object v17, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 278
    .line 279
    const/4 v11, 0x0

    .line 280
    const/4 v13, 0x0

    .line 281
    move/from16 v16, v1

    .line 282
    .line 283
    invoke-direct/range {v10 .. v17}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 287
    .line 288
    .line 289
    iget-object v1, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 290
    .line 291
    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method private static calculateHorizontalPadding(FFZ)F
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    float-to-double v0, p0

    .line 4
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 5
    .line 6
    sget-wide v4, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->COS_45:D

    .line 7
    .line 8
    sub-double/2addr v2, v4

    .line 9
    float-to-double p0, p1

    .line 10
    mul-double/2addr v2, p0

    .line 11
    add-double/2addr v0, v2

    .line 12
    double-to-float p0, v0

    .line 13
    :cond_0
    return p0
.end method

.method private calculateVerticalPadding(FFZ)F
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget p3, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 4
    .line 5
    mul-float/2addr p1, p3

    .line 6
    float-to-double v0, p1

    .line 7
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 8
    .line 9
    sget-wide v4, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->COS_45:D

    .line 10
    .line 11
    sub-double/2addr v2, v4

    .line 12
    float-to-double p1, p2

    .line 13
    mul-double/2addr v2, p1

    .line 14
    add-double/2addr v0, v2

    .line 15
    double-to-float p1, v0

    .line 16
    return p1

    .line 17
    :cond_0
    iget p2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 18
    .line 19
    mul-float/2addr p1, p2

    .line 20
    return p1
.end method

.method private drawShadow(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->isCircle:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 29
    .line 30
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    iget v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRotation:F

    .line 44
    .line 45
    iget-object v3, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 52
    .line 53
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 58
    .line 59
    .line 60
    iget v8, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 61
    .line 62
    neg-float v2, v8

    .line 63
    iget v3, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowSize:F

    .line 64
    .line 65
    sub-float v3, v2, v3

    .line 66
    .line 67
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    const/high16 v4, 0x40000000    # 2.0f

    .line 74
    .line 75
    mul-float v9, v8, v4

    .line 76
    .line 77
    sub-float/2addr v2, v9

    .line 78
    const/4 v4, 0x0

    .line 79
    cmpl-float v2, v2, v4

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x1

    .line 83
    if-lez v2, :cond_1

    .line 84
    .line 85
    move v10, v6

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move v10, v5

    .line 88
    :goto_0
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sub-float/2addr v2, v9

    .line 95
    cmpl-float v2, v2, v4

    .line 96
    .line 97
    if-lez v2, :cond_2

    .line 98
    .line 99
    move v11, v6

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move v11, v5

    .line 102
    :goto_1
    iget v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawShadowSize:F

    .line 103
    .line 104
    iget v5, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowTopScale:F

    .line 105
    .line 106
    mul-float/2addr v5, v2

    .line 107
    sub-float v5, v2, v5

    .line 108
    .line 109
    iget v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowHorizScale:F

    .line 110
    .line 111
    mul-float/2addr v6, v2

    .line 112
    sub-float v6, v2, v6

    .line 113
    .line 114
    iget v12, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowBottomScale:F

    .line 115
    .line 116
    mul-float/2addr v12, v2

    .line 117
    sub-float/2addr v2, v12

    .line 118
    cmpl-float v4, v8, v4

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    if-nez v4, :cond_3

    .line 123
    .line 124
    move v13, v12

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    add-float/2addr v6, v8

    .line 127
    div-float v6, v8, v6

    .line 128
    .line 129
    move v13, v6

    .line 130
    :goto_2
    if-nez v4, :cond_4

    .line 131
    .line 132
    move v14, v12

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    add-float/2addr v5, v8

    .line 135
    div-float v5, v8, v5

    .line 136
    .line 137
    move v14, v5

    .line 138
    :goto_3
    if-nez v4, :cond_5

    .line 139
    .line 140
    move v15, v12

    .line 141
    goto :goto_4

    .line 142
    :cond_5
    add-float/2addr v2, v8

    .line 143
    div-float v2, v8, v2

    .line 144
    .line 145
    move v15, v2

    .line 146
    :goto_4
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 151
    .line 152
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 153
    .line 154
    add-float/2addr v5, v8

    .line 155
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 156
    .line 157
    add-float/2addr v4, v8

    .line 158
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->scale(FF)V

    .line 162
    .line 163
    .line 164
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 165
    .line 166
    iget-object v5, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 167
    .line 168
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    if-eqz v10, :cond_6

    .line 172
    .line 173
    div-float v4, v12, v13

    .line 174
    .line 175
    invoke-virtual {v1, v4, v12}, Landroid/graphics/Canvas;->scale(FF)V

    .line 176
    .line 177
    .line 178
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    sub-float/2addr v4, v9

    .line 185
    iget v5, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 186
    .line 187
    neg-float v5, v5

    .line 188
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 189
    .line 190
    move/from16 v16, v2

    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    move/from16 v17, v12

    .line 194
    .line 195
    move/from16 v12, v16

    .line 196
    .line 197
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_6
    move/from16 v17, v12

    .line 202
    .line 203
    move v12, v2

    .line 204
    :goto_5
    invoke-virtual {v1, v12}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 212
    .line 213
    iget v4, v2, Landroid/graphics/RectF;->right:F

    .line 214
    .line 215
    sub-float/2addr v4, v8

    .line 216
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 217
    .line 218
    sub-float/2addr v2, v8

    .line 219
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v13, v15}, Landroid/graphics/Canvas;->scale(FF)V

    .line 223
    .line 224
    .line 225
    const/high16 v2, 0x43340000    # 180.0f

    .line 226
    .line 227
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 228
    .line 229
    .line 230
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 231
    .line 232
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 233
    .line 234
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    if-eqz v10, :cond_7

    .line 238
    .line 239
    div-float v2, v17, v13

    .line 240
    .line 241
    move/from16 v4, v17

    .line 242
    .line 243
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 244
    .line 245
    .line 246
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 247
    .line 248
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    sub-float v4, v2, v9

    .line 253
    .line 254
    iget v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 255
    .line 256
    neg-float v5, v2

    .line 257
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 258
    .line 259
    const/4 v2, 0x0

    .line 260
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 261
    .line 262
    .line 263
    :cond_7
    invoke-virtual {v1, v12}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 271
    .line 272
    iget v4, v2, Landroid/graphics/RectF;->left:F

    .line 273
    .line 274
    add-float/2addr v4, v8

    .line 275
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 276
    .line 277
    sub-float/2addr v2, v8

    .line 278
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v13, v15}, Landroid/graphics/Canvas;->scale(FF)V

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x43870000    # 270.0f

    .line 285
    .line 286
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 287
    .line 288
    .line 289
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 290
    .line 291
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 292
    .line 293
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 294
    .line 295
    .line 296
    if-eqz v11, :cond_8

    .line 297
    .line 298
    const/high16 v4, 0x3f800000    # 1.0f

    .line 299
    .line 300
    div-float v12, v4, v15

    .line 301
    .line 302
    invoke-virtual {v1, v12, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 303
    .line 304
    .line 305
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 306
    .line 307
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    sub-float v4, v2, v9

    .line 312
    .line 313
    iget v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 314
    .line 315
    neg-float v5, v2

    .line 316
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 317
    .line 318
    const/4 v2, 0x0

    .line 319
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 320
    .line 321
    .line 322
    :cond_8
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 330
    .line 331
    iget v4, v2, Landroid/graphics/RectF;->right:F

    .line 332
    .line 333
    sub-float/2addr v4, v8

    .line 334
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 335
    .line 336
    add-float/2addr v2, v8

    .line 337
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->scale(FF)V

    .line 341
    .line 342
    .line 343
    const/high16 v2, 0x42b40000    # 90.0f

    .line 344
    .line 345
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 346
    .line 347
    .line 348
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPath:Landroid/graphics/Path;

    .line 349
    .line 350
    iget-object v4, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 351
    .line 352
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 353
    .line 354
    .line 355
    if-eqz v11, :cond_9

    .line 356
    .line 357
    const/high16 v4, 0x3f800000    # 1.0f

    .line 358
    .line 359
    div-float v12, v4, v14

    .line 360
    .line 361
    invoke-virtual {v1, v12, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 362
    .line 363
    .line 364
    iget-object v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mContentBounds:Landroid/graphics/RectF;

    .line 365
    .line 366
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    sub-float v4, v2, v9

    .line 371
    .line 372
    iget v2, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 373
    .line 374
    neg-float v5, v2

    .line 375
    iget-object v6, v0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 376
    .line 377
    const/4 v2, 0x0

    .line 378
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 379
    .line 380
    .line 381
    :cond_9
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 385
    .line 386
    .line 387
    return-void
.end method

.method private static toEven(F)I
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    rem-int/lit8 v0, p0, 0x2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    sub-int/2addr p0, v1

    .line 11
    :cond_0
    return p0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mDirty:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->buildComponents(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mDirty:Z

    .line 14
    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->drawShadow(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->draw(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public bridge synthetic getChangingConfigurations()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getChangingConfigurations()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getCornerRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getCurrent()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getIntrinsicHeight()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getIntrinsicHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getIntrinsicWidth()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getIntrinsicWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getMaxShadowSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 2
    .line 3
    return v0
.end method

.method public getMinHeight()F
    .locals 4

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 2
    .line 3
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 4
    .line 5
    iget v2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 6
    .line 7
    mul-float/2addr v2, v0

    .line 8
    const/high16 v3, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float/2addr v2, v3

    .line 11
    add-float/2addr v1, v2

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    mul-float/2addr v0, v3

    .line 17
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 18
    .line 19
    iget v2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    .line 20
    .line 21
    mul-float/2addr v1, v2

    .line 22
    mul-float/2addr v1, v3

    .line 23
    add-float/2addr v0, v1

    .line 24
    return v0
.end method

.method public getMinWidth()F
    .locals 4

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 2
    .line 3
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 4
    .line 5
    const/high16 v2, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float v3, v0, v2

    .line 8
    .line 9
    add-float/2addr v1, v3

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    mul-float/2addr v0, v2

    .line 15
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 16
    .line 17
    mul-float/2addr v1, v2

    .line 18
    add-float/2addr v0, v1

    .line 19
    return v0
.end method

.method public bridge synthetic getMinimumHeight()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getMinimumHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getMinimumWidth()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getMinimumWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 2
    .line 3
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mAddPaddingForCorners:Z

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->calculateVerticalPadding(FFZ)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    float-to-double v0, v0

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    double-to-int v0, v0

    .line 17
    iget v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 18
    .line 19
    iget v2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 20
    .line 21
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mAddPaddingForCorners:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->calculateHorizontalPadding(FFZ)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    float-to-double v1, v1

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    double-to-int v1, v1

    .line 33
    invoke-virtual {p1, v1, v0, v1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method public getShadowSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawShadowSize:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getState()[I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getState()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getTransparentRegion()Landroid/graphics/Region;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getTransparentRegion()Landroid/graphics/Region;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getWrappedDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->getWrappedDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic isAutoMirrored()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->isAutoMirrored()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jumpToCurrentState()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->jumpToCurrentState()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mDirty:Z

    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setAddPaddingForCorners(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mAddPaddingForCorners:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setAlpha(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerShadowPaint:Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mEdgeShadowPaint:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic setAutoMirrored(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setAutoMirrored(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setChangingConfigurations(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setChangingConfigurations(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCornerRadius(F)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 7
    .line 8
    cmpl-float v0, v0, p1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mCornerRadius:F

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mDirty:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public bridge synthetic setDither(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setDither(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setFilterBitmap(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setFilterBitmap(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setHotspot(FF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setHotspot(FF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setHotspotBounds(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setHotspotBounds(IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMaxShadowSize(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawShadowSize:F

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->setShadowSize(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setRotation(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRotation:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRotation:F

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setShadowSize(F)V
    .locals 1

    .line 11
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->setShadowSize(FF)V

    return-void
.end method

.method public setShadowSize(FF)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-ltz v1, :cond_2

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_2

    .line 1
    invoke-static {p1}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->toEven(F)I

    move-result p1

    int-to-float p1, p1

    .line 2
    invoke-static {p2}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->toEven(F)I

    move-result p2

    int-to-float p2, p2

    cmpl-float v0, p1, p2

    if-lez v0, :cond_0

    move p1, p2

    .line 3
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawShadowSize:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_1

    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    cmpl-float v0, v0, p2

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawShadowSize:F

    .line 5
    iput p2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mRawMaxShadowSize:F

    .line 6
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowMultiplier:F

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mShadowSize:F

    .line 7
    iput p2, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mMaxShadowSize:F

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;->mDirty:Z

    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid shadow size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic setState([I)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setState([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic setTint(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setTint(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setVisible(ZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic setWrappedDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->setWrappedDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/blankj/utilcode/util/ShadowUtils$DrawableWrapper;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
