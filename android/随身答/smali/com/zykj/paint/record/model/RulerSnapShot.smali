.class public Lcom/zykj/paint/record/model/RulerSnapShot;
.super Lcom/zykj/paint/record/model/GraphSnapShot;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "RulerSnapShot"


# instance fields
.field private bgPaint:Landroid/graphics/Paint;

.field private degree:F

.field private downDegree:F

.field private height:I

.field public rectF:Landroid/graphics/RectF;

.field public ruler:Landroid/graphics/Bitmap;

.field private width:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/model/GraphSnapShot;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->ruler:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/paint/record/model/RulerSnapShot;->init()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private init()V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->ruler:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    const/high16 v2, 0x41200000    # 10.0f

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/high16 v4, -0x3db80000    # -50.0f

    .line 14
    .line 15
    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->rectF:Landroid/graphics/RectF;

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 37
    .line 38
    const/high16 v2, -0x10000

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 44
    .line 45
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 51
    .line 52
    sget-object v4, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 58
    .line 59
    const/high16 v4, 0x3f800000    # 1.0f

    .line 60
    .line 61
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Landroid/graphics/Paint;

    .line 65
    .line 66
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->bgPaint:Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->bgPaint:Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->bgPaint:Landroid/graphics/Paint;

    .line 80
    .line 81
    const v1, -0x333334

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->bgPaint:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->bgPaint:Landroid/graphics/Paint;

    .line 93
    .line 94
    const/high16 v1, 0x40000000    # 2.0f

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 97
    .line 98
    .line 99
    const/16 v0, 0x258

    .line 100
    .line 101
    iput v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->width:I

    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->ruler:Landroid/graphics/Bitmap;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iput v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->height:I

    .line 110
    .line 111
    invoke-virtual {p0, v4, v3}, Lcom/zykj/paint/record/model/RulerSnapShot;->setScaleMatrix(FF)V

    .line 112
    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public isInDrawGraphRect(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(Landroid/graphics/Matrix;FF)[F

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->rectF:Landroid/graphics/RectF;

    .line 21
    .line 22
    aget v0, p1, v1

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    aget p1, p1, v1

    .line 26
    .line 27
    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_0
    return v1
.end method

.method public setDownScale()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->width:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->height:I

    .line 16
    .line 17
    iget v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->degree:F

    .line 18
    .line 19
    iput v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->downDegree:F

    .line 20
    .line 21
    return-void
.end method

.method public setScaleMatrix(FF)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->downDegree:F

    .line 2
    .line 3
    add-float/2addr v0, p2

    .line 4
    iput v0, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->degree:F

    .line 5
    .line 6
    iget p2, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->width:I

    .line 7
    .line 8
    int-to-float p2, p2

    .line 9
    mul-float/2addr p2, p1

    .line 10
    float-to-int p1, p2

    .line 11
    const/16 p2, 0x780

    .line 12
    .line 13
    if-gt p1, p2, :cond_4

    .line 14
    .line 15
    const/16 p2, 0x258

    .line 16
    .line 17
    if-ge p1, p2, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    iget p2, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->height:I

    .line 21
    .line 22
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v0, Landroid/graphics/Canvas;

    .line 29
    .line 30
    invoke-direct {v0, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 31
    .line 32
    .line 33
    int-to-float v3, p1

    .line 34
    iget v1, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->height:I

    .line 35
    .line 36
    int-to-float v4, v1

    .line 37
    iget-object v5, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->bgPaint:Landroid/graphics/Paint;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    move v6, v1

    .line 46
    :goto_0
    const/16 v1, 0xc8

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    if-ge v6, v1, :cond_3

    .line 50
    .line 51
    rem-int/lit8 v1, v6, 0xa

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    rem-int/lit8 v1, v6, 0x5

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 v2, 0x1

    .line 63
    :goto_1
    mul-int/lit8 v1, v6, 0xa

    .line 64
    .line 65
    int-to-float v1, v1

    .line 66
    mul-int/lit8 v2, v2, 0x14

    .line 67
    .line 68
    int-to-float v4, v2

    .line 69
    iget-object v5, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    move v3, v1

    .line 73
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    iget v3, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->degree:F

    .line 85
    .line 86
    float-to-int v3, v3

    .line 87
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string/jumbo v3, "\u00b0"

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    div-int/2addr p1, v2

    .line 105
    int-to-float p1, p1

    .line 106
    iget v3, p0, Lcom/zykj/paint/record/model/RulerSnapShot;->height:I

    .line 107
    .line 108
    div-int/2addr v3, v2

    .line 109
    int-to-float v2, v3

    .line 110
    iget-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 111
    .line 112
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    iput-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    :cond_4
    :goto_2
    return-void
.end method
