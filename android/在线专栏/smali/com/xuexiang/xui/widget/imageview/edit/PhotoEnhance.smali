.class public Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ENHANCE_BRIGHTNESS:I = 0x1

.field public static final ENHANCE_CONTRAST:I = 0x2

.field public static final ENHANCE_SATURATION:I


# instance fields
.field private mAllMatrix:Landroid/graphics/ColorMatrix;

.field private mBitmap:Landroid/graphics/Bitmap;

.field private mBrightNum:F

.field private mBrightnessMatrix:Landroid/graphics/ColorMatrix;

.field private mContrastMatrix:Landroid/graphics/ColorMatrix;

.field private mContrastNum:F

.field private mSaturationMatrix:Landroid/graphics/ColorMatrix;

.field private mSaturationNum:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationNum:F

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightNum:F

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastNum:F

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationNum:F

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightNum:F

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastNum:F

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    .line 15
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    .line 16
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    .line 17
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBitmap:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public getBrightness()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightNum:F

    return v0
.end method

.method public getContrast()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastNum:F

    return v0
.end method

.method public getSaturation()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationNum:F

    return v0
.end method

.method public handleImage(I)Landroid/graphics/Bitmap;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBitmap:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    .line 2
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v4, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v6, 0x1

    invoke-static {v2, v4, v5, v6}, Lcom/xuexiang/xui/utils/DrawableUtils;->createBitmapSafely(IILandroid/graphics/Bitmap$Config;I)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v3

    .line 3
    :cond_1
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 4
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 5
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 6
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    if-nez v5, :cond_2

    .line 7
    new-instance v5, Landroid/graphics/ColorMatrix;

    invoke-direct {v5}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    .line 8
    :cond_2
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    if-nez v5, :cond_3

    .line 9
    new-instance v5, Landroid/graphics/ColorMatrix;

    invoke-direct {v5}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    .line 10
    :cond_3
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    if-nez v5, :cond_4

    .line 11
    new-instance v5, Landroid/graphics/ColorMatrix;

    invoke-direct {v5}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    .line 12
    :cond_4
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    if-nez v5, :cond_5

    .line 13
    new-instance v5, Landroid/graphics/ColorMatrix;

    invoke-direct {v5}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    :cond_5
    const/4 v5, 0x0

    if-eqz v1, :cond_8

    const/16 v11, 0xd

    const/16 v12, 0xc

    const/16 v13, 0xb

    const/16 v14, 0xa

    const/16 v15, 0x9

    const/16 v16, 0x8

    const/16 v17, 0x7

    const/16 v18, 0x6

    const/16 v19, 0x5

    const/16 v20, 0x4

    const/16 v21, 0x3

    const/16 v22, 0x0

    const/16 v7, 0x14

    const/4 v8, 0x2

    const/high16 v23, 0x3f800000    # 1.0f

    if-eq v1, v6, :cond_7

    if-eq v1, v8, :cond_6

    goto/16 :goto_0

    .line 14
    :cond_6
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastNum:F

    sub-float v1, v23, v1

    const/high16 v24, 0x43000000    # 128.0f

    mul-float v1, v1, v24

    .line 15
    iget-object v9, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v9}, Landroid/graphics/ColorMatrix;->reset()V

    .line 16
    iget-object v9, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    new-array v7, v7, [F

    iget v10, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastNum:F

    aput v10, v7, v22

    aput v5, v7, v6

    aput v5, v7, v8

    aput v5, v7, v21

    aput v1, v7, v20

    aput v5, v7, v19

    aput v10, v7, v18

    aput v5, v7, v17

    aput v5, v7, v16

    aput v1, v7, v15

    aput v5, v7, v14

    aput v5, v7, v13

    aput v10, v7, v12

    aput v5, v7, v11

    const/16 v6, 0xe

    aput v1, v7, v6

    const/16 v1, 0xf

    aput v5, v7, v1

    const/16 v1, 0x10

    aput v5, v7, v1

    const/16 v1, 0x11

    aput v5, v7, v1

    const/16 v1, 0x12

    aput v23, v7, v1

    const/16 v1, 0x13

    aput v5, v7, v1

    invoke-virtual {v9, v7}, Landroid/graphics/ColorMatrix;->set([F)V

    goto :goto_0

    .line 17
    :cond_7
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1}, Landroid/graphics/ColorMatrix;->reset()V

    .line 18
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    new-array v7, v7, [F

    aput v23, v7, v22

    aput v5, v7, v6

    aput v5, v7, v8

    aput v5, v7, v21

    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightNum:F

    aput v6, v7, v20

    aput v5, v7, v19

    aput v23, v7, v18

    aput v5, v7, v17

    aput v5, v7, v16

    aput v6, v7, v15

    aput v5, v7, v14

    aput v5, v7, v13

    aput v23, v7, v12

    aput v5, v7, v11

    const/16 v8, 0xe

    aput v6, v7, v8

    const/16 v6, 0xf

    aput v5, v7, v6

    const/16 v6, 0x10

    aput v5, v7, v6

    const/16 v6, 0x11

    aput v5, v7, v6

    const/16 v6, 0x12

    aput v23, v7, v6

    const/16 v6, 0x13

    aput v5, v7, v6

    invoke-virtual {v1, v7}, Landroid/graphics/ColorMatrix;->set([F)V

    goto :goto_0

    .line 19
    :cond_8
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1}, Landroid/graphics/ColorMatrix;->reset()V

    .line 20
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationNum:F

    invoke-virtual {v1, v6}, Landroid/graphics/ColorMatrix;->setSaturation(F)V

    .line 21
    :goto_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1}, Landroid/graphics/ColorMatrix;->reset()V

    .line 22
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1, v6}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    .line 23
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightnessMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1, v6}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    .line 24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastMatrix:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1, v6}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    .line 25
    new-instance v1, Landroid/graphics/ColorMatrixColorFilter;

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mAllMatrix:Landroid/graphics/ColorMatrix;

    invoke-direct {v1, v6}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 26
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v1, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-object v2
.end method

.method public hasSetBitmap()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public setBrightness(I)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;
    .locals 0

    add-int/lit8 p1, p1, -0x80

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mBrightNum:F

    return-object p0
.end method

.method public setContrast(I)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;
    .locals 4

    div-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x40

    int-to-double v0, p1

    const-wide/high16 v2, 0x4060000000000000L    # 128.0

    div-double/2addr v0, v2

    double-to-float p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mContrastNum:F

    return-object p0
.end method

.method public setSaturation(I)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;
    .locals 1

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float p1, p1, v0

    const/high16 v0, 0x43000000    # 128.0f

    div-float/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEnhance;->mSaturationNum:F

    return-object p0
.end method
