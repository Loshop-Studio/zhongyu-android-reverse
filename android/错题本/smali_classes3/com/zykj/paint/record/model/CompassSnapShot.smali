.class public Lcom/zykj/paint/record/model/CompassSnapShot;
.super Lcom/zykj/paint/record/model/GraphSnapShot;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "CompassSnapShot"


# instance fields
.field degree:D

.field downDegree:D

.field downWidth:I

.field private hand:Landroid/graphics/Bitmap;

.field private height:I

.field private left:Landroid/graphics/Bitmap;

.field leftDownMartix:Landroid/graphics/Matrix;

.field leftMartix:Landroid/graphics/Matrix;

.field private pencil:Landroid/graphics/Bitmap;

.field pencilMartix:Landroid/graphics/Matrix;

.field public radius:F

.field private right:Landroid/graphics/Bitmap;

.field rightDownMartix:Landroid/graphics/Matrix;

.field rightMartix:Landroid/graphics/Matrix;

.field private top:I

.field private width:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/model/GraphSnapShot;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftDownMartix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightDownMartix:Landroid/graphics/Matrix;

    .line 31
    .line 32
    new-instance v0, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencilMartix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->radius:F

    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->hand:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    iput-object p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    iput-object p3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    iput-object p4, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencil:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    invoke-direct {p0}, Lcom/zykj/paint/record/model/CompassSnapShot;->init()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private init()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->hand:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-double v0, v0

    .line 8
    const-wide v2, 0x3fe3333333333333L    # 0.6

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    mul-double/2addr v0, v2

    .line 14
    double-to-int v0, v0

    .line 15
    iput v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->top:I

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x2

    .line 24
    mul-int/2addr v0, v1

    .line 25
    iput v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->top:I

    .line 34
    .line 35
    add-int/2addr v0, v2

    .line 36
    iput v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->height:I

    .line 37
    .line 38
    iget v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 39
    .line 40
    div-int/2addr v0, v1

    .line 41
    int-to-float v0, v0

    .line 42
    int-to-float v2, v2

    .line 43
    new-array v3, v1, [F

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    aput v0, v3, v4

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    aput v2, v3, v0

    .line 50
    .line 51
    iput-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 52
    .line 53
    iget-object v2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-float v2, v2

    .line 60
    iget-object v3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    int-to-float v3, v3

    .line 67
    new-array v5, v1, [F

    .line 68
    .line 69
    aput v2, v5, v4

    .line 70
    .line 71
    aput v3, v5, v0

    .line 72
    .line 73
    iput-object v5, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->markerCenter:[F

    .line 74
    .line 75
    iget v2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 76
    .line 77
    iget v3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->height:I

    .line 78
    .line 79
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 80
    .line 81
    invoke-static {v2, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v3, Landroid/graphics/Canvas;

    .line 86
    .line 87
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 91
    .line 92
    iget-object v6, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 93
    .line 94
    aget v6, v6, v4

    .line 95
    .line 96
    iget-object v7, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    int-to-float v7, v7

    .line 103
    sub-float/2addr v6, v7

    .line 104
    iget-object v7, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 105
    .line 106
    aget v7, v7, v0

    .line 107
    .line 108
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 109
    .line 110
    .line 111
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 112
    .line 113
    iget-object v6, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 114
    .line 115
    aget v7, v6, v4

    .line 116
    .line 117
    aget v6, v6, v0

    .line 118
    .line 119
    invoke-virtual {v5, v7, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 120
    .line 121
    .line 122
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencilMartix:Landroid/graphics/Matrix;

    .line 123
    .line 124
    const/high16 v6, 0x41980000    # 19.0f

    .line 125
    .line 126
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 127
    .line 128
    .line 129
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencilMartix:Landroid/graphics/Matrix;

    .line 130
    .line 131
    iget-object v6, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 132
    .line 133
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    div-int/2addr v6, v1

    .line 138
    int-to-float v6, v6

    .line 139
    iget-object v7, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 140
    .line 141
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    div-int/2addr v7, v1

    .line 146
    add-int/lit8 v7, v7, -0xf

    .line 147
    .line 148
    int-to-float v7, v7

    .line 149
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 150
    .line 151
    .line 152
    new-instance v5, Landroid/graphics/Matrix;

    .line 153
    .line 154
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 155
    .line 156
    .line 157
    iget-object v6, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencilMartix:Landroid/graphics/Matrix;

    .line 158
    .line 159
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 160
    .line 161
    .line 162
    iget-object v6, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 163
    .line 164
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 165
    .line 166
    .line 167
    iget-object v6, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 168
    .line 169
    iget-object v7, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 170
    .line 171
    const/4 v8, 0x0

    .line 172
    invoke-virtual {v3, v6, v7, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 173
    .line 174
    .line 175
    iget-object v6, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 176
    .line 177
    iget-object v7, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 178
    .line 179
    invoke-virtual {v3, v6, v7, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 180
    .line 181
    .line 182
    iget-object v6, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencil:Landroid/graphics/Bitmap;

    .line 183
    .line 184
    invoke-virtual {v3, v6, v5, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 185
    .line 186
    .line 187
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->hand:Landroid/graphics/Bitmap;

    .line 188
    .line 189
    iget-object v6, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 190
    .line 191
    aget v4, v6, v4

    .line 192
    .line 193
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    div-int/2addr v6, v1

    .line 198
    int-to-float v1, v6

    .line 199
    sub-float/2addr v4, v1

    .line 200
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 201
    .line 202
    aget v0, v1, v0

    .line 203
    .line 204
    iget v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->top:I

    .line 205
    .line 206
    int-to-float v1, v1

    .line 207
    sub-float/2addr v0, v1

    .line 208
    invoke-virtual {v3, v5, v4, v0, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 209
    .line 210
    .line 211
    iput-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 212
    .line 213
    return-void
.end method


# virtual methods
.method public calculateRadius()F
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    new-array v2, v0, [F

    .line 5
    .line 6
    new-instance v3, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v4, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    int-to-float v4, v4

    .line 28
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    int-to-float v5, v5

    .line 35
    new-array v6, v0, [F

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    aput v4, v6, v7

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    aput v5, v6, v4

    .line 42
    .line 43
    invoke-virtual {v3, v1, v6}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 54
    .line 55
    .line 56
    iget-object v5, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 57
    .line 58
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 59
    .line 60
    .line 61
    iget-object v5, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    int-to-float v5, v5

    .line 68
    new-array v0, v0, [F

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    aput v6, v0, v7

    .line 72
    .line 73
    aput v5, v0, v4

    .line 74
    .line 75
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 76
    .line 77
    .line 78
    aget v0, v1, v7

    .line 79
    .line 80
    aget v1, v1, v4

    .line 81
    .line 82
    aget v3, v2, v7

    .line 83
    .line 84
    aget v2, v2, v4

    .line 85
    .line 86
    invoke-virtual {p0, v0, v1, v3, v2}, Lcom/zykj/paint/record/model/GraphSnapShot;->getPointsLength(FFFF)D

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    double-to-float v0, v0

    .line 91
    return v0
.end method

.method public getCompassMode(FF)I
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencilMartix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencil:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    return p1

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 p1, 0x3

    .line 37
    return p1

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1
.end method

.method public onGraphChange(FFFF)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(FF)[F

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p3, p4}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(FF)[F

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    aget v2, p1, p3

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    aget v3, p1, p4

    .line 16
    .line 17
    aget v4, p2, p3

    .line 18
    .line 19
    aget v5, p2, p4

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/paint/record/model/GraphSnapShot;->exactCalculateDegree([FFFFF)D

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    aget v3, p2, p3

    .line 27
    .line 28
    aget p3, p1, p3

    .line 29
    .line 30
    sub-float/2addr v3, p3

    .line 31
    aget p2, p2, p4

    .line 32
    .line 33
    aget p1, p1, p4

    .line 34
    .line 35
    sub-float/2addr p2, p1

    .line 36
    double-to-float p1, v1

    .line 37
    invoke-virtual {p0, p1, v3, p2}, Lcom/zykj/paint/record/model/CompassSnapShot;->updateGraph(FFF)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public setCenterPoint()V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 17
    .line 18
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->markerCenter:[F

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "markerCenter--->"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->markerCenter:[F

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    aget v1, v1, v2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ","

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->markerCenter:[F

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    aget v3, v3, v4

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v3, "CompassSnapShot"

    .line 56
    .line 57
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v5, "center--->"

    .line 63
    .line 64
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v5, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 68
    .line 69
    aget v2, v5, v2

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 78
    .line 79
    aget v1, v1, v4

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public setDownMatrix()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftDownMartix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightDownMartix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 16
    .line 17
    iput v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->downWidth:I

    .line 18
    .line 19
    iget-wide v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->degree:D

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->downDegree:D

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/paint/record/model/CompassSnapShot;->calculateRadius()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->radius:F

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/paint/record/model/GraphSnapShot;->reset()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/paint/record/model/CompassSnapShot;->setCenterPoint()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public updateGraph(FFF)V
    .locals 9

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->downDegree:D

    .line 2
    .line 3
    float-to-double v2, p1

    .line 4
    add-double/2addr v2, v0

    .line 5
    iput-wide v2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->degree:D

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmpg-double p3, v2, v4

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    if-gtz p3, :cond_0

    .line 15
    .line 16
    iput-wide v4, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->degree:D

    .line 17
    .line 18
    double-to-float p1, v0

    .line 19
    neg-float p1, p1

    .line 20
    iget p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 21
    .line 22
    iget p3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->downWidth:I

    .line 23
    .line 24
    sub-int/2addr p2, p3

    .line 25
    div-int/2addr p2, v8

    .line 26
    :goto_0
    int-to-float p2, p2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-wide v4, 0x4056800000000000L    # 90.0

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmpl-double p3, v2, v4

    .line 34
    .line 35
    if-ltz p3, :cond_1

    .line 36
    .line 37
    iput-wide v4, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->degree:D

    .line 38
    .line 39
    const/high16 p1, 0x42b40000    # 90.0f

    .line 40
    .line 41
    double-to-float p2, v0

    .line 42
    sub-float/2addr p1, p2

    .line 43
    iget p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 44
    .line 45
    iget p3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->downWidth:I

    .line 46
    .line 47
    sub-int/2addr p2, p3

    .line 48
    div-int/2addr p2, v8

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget p3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->downWidth:I

    .line 51
    .line 52
    int-to-float p3, p3

    .line 53
    const/high16 v0, 0x40000000    # 2.0f

    .line 54
    .line 55
    mul-float/2addr v0, p2

    .line 56
    add-float/2addr v0, p3

    .line 57
    float-to-int p3, v0

    .line 58
    iput p3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 59
    .line 60
    div-int/2addr p3, v8

    .line 61
    int-to-float p3, p3

    .line 62
    iget v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->top:I

    .line 63
    .line 64
    int-to-float v0, v0

    .line 65
    new-array v1, v8, [F

    .line 66
    .line 67
    aput p3, v1, v7

    .line 68
    .line 69
    aput v0, v1, v6

    .line 70
    .line 71
    iput-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 72
    .line 73
    :goto_1
    iget p3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->width:I

    .line 74
    .line 75
    iget v0, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->height:I

    .line 76
    .line 77
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 78
    .line 79
    invoke-static {p3, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    new-instance v0, Landroid/graphics/Canvas;

    .line 84
    .line 85
    invoke-direct {v0, p3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Landroid/graphics/Matrix;

    .line 89
    .line 90
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftDownMartix:Landroid/graphics/Matrix;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 96
    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-virtual {v1, p2, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 100
    .line 101
    .line 102
    iget-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 103
    .line 104
    aget v4, v3, v7

    .line 105
    .line 106
    aget v3, v3, v6

    .line 107
    .line 108
    invoke-virtual {v1, p1, v4, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 112
    .line 113
    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->left:Landroid/graphics/Bitmap;

    .line 117
    .line 118
    iget-object v3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->leftMartix:Landroid/graphics/Matrix;

    .line 119
    .line 120
    const/4 v4, 0x0

    .line 121
    invoke-virtual {v0, v1, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 122
    .line 123
    .line 124
    new-instance v1, Landroid/graphics/Matrix;

    .line 125
    .line 126
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 127
    .line 128
    .line 129
    iget-object v3, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightDownMartix:Landroid/graphics/Matrix;

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, p2, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 135
    .line 136
    .line 137
    neg-float p1, p1

    .line 138
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 139
    .line 140
    aget v2, p2, v7

    .line 141
    .line 142
    aget p2, p2, v6

    .line 143
    .line 144
    invoke-virtual {v1, p1, v2, p2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->right:Landroid/graphics/Bitmap;

    .line 153
    .line 154
    iget-object p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 155
    .line 156
    invoke-virtual {v0, p1, p2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 157
    .line 158
    .line 159
    new-instance p1, Landroid/graphics/Matrix;

    .line 160
    .line 161
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 162
    .line 163
    .line 164
    iget-object p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencilMartix:Landroid/graphics/Matrix;

    .line 165
    .line 166
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 167
    .line 168
    .line 169
    iget-object p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->rightMartix:Landroid/graphics/Matrix;

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 172
    .line 173
    .line 174
    iget-object p2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->pencil:Landroid/graphics/Bitmap;

    .line 175
    .line 176
    invoke-virtual {v0, p2, p1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->hand:Landroid/graphics/Bitmap;

    .line 180
    .line 181
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 182
    .line 183
    aget p2, p2, v7

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    div-int/2addr v1, v8

    .line 190
    int-to-float v1, v1

    .line 191
    sub-float/2addr p2, v1

    .line 192
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    .line 193
    .line 194
    aget v1, v1, v6

    .line 195
    .line 196
    iget v2, p0, Lcom/zykj/paint/record/model/CompassSnapShot;->top:I

    .line 197
    .line 198
    int-to-float v2, v2

    .line 199
    sub-float/2addr v1, v2

    .line 200
    invoke-virtual {v0, p1, p2, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 201
    .line 202
    .line 203
    iput-object p3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 204
    .line 205
    return-void
.end method
