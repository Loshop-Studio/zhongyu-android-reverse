.class public Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final DEFAULT_CORNER_EXTENSION_DP:F

.field private static final DEFAULT_CORNER_LENGTH_DP:F = 20.0f

.field private static final DEFAULT_CORNER_OFFSET_DP:F

.field private static final DEFAULT_CORNER_THICKNESS_DP:F

.field private static final DEFAULT_LINE_THICKNESS_DP:F

.field private static final DEFAULT_SHOW_GUIDELINES_LIMIT:F = 100.0f

.field private static final GUIDELINES_OFF:I = 0x0

.field private static final GUIDELINES_ON:I = 0x2

.field private static final GUIDELINES_ON_TOUCH:I = 0x1

.field private static final SNAP_RADIUS_DP:I = 0x6


# instance fields
.field private initializedCropWindow:Z

.field private mAspectRatioX:I

.field private mAspectRatioY:I

.field private mBackgroundPaint:Landroid/graphics/Paint;

.field public mBitmap:Landroid/graphics/Bitmap;

.field private mBitmapHeight:I

.field private mBitmapRect:Landroid/graphics/Rect;

.field private mBitmapWidth:I

.field private mBorderPaint:Landroid/graphics/Paint;

.field private mCornerBitmap:Landroid/graphics/Bitmap;

.field private mCornerExtension:F

.field private mCornerHeight:I

.field private mCornerLength:F

.field private mCornerOffset:F

.field private mCornerPaint:Landroid/graphics/Paint;

.field private mCornerWidth:I

.field private mFixAspectRatio:Z

.field private mGuidelinePaint:Landroid/graphics/Paint;

.field private mGuidelines:I

.field private mHandleRadius:F

.field private mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field private mSnapRadius:F

.field private mTargetAspectRatio:F

.field private mTouchOffset:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/PaintUtil;->getCornerThickness()F

    move-result v0

    sput v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->DEFAULT_CORNER_THICKNESS_DP:F

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/PaintUtil;->getLineThickness()F

    move-result v1

    sput v1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->DEFAULT_LINE_THICKNESS_DP:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v3, v0, v2

    div-float/2addr v1, v2

    sub-float/2addr v3, v1

    .line 3
    sput v3, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->DEFAULT_CORNER_OFFSET_DP:F

    div-float/2addr v0, v2

    add-float/2addr v0, v3

    .line 4
    sput v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->DEFAULT_CORNER_EXTENSION_DP:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mFixAspectRatio:Z

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioX:I

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioY:I

    int-to-float v2, v1

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initializedCropWindow:Z

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmap:Landroid/graphics/Bitmap;

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapWidth:I

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapHeight:I

    .line 10
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    .line 13
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 14
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 15
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mFixAspectRatio:Z

    const/4 v0, 0x1

    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioX:I

    .line 17
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioY:I

    int-to-float v1, v0

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 18
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    .line 19
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initializedCropWindow:Z

    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmap:Landroid/graphics/Bitmap;

    .line 21
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapWidth:I

    .line 22
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapHeight:I

    .line 23
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    .line 24
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    .line 25
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    .line 26
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->init(Landroid/content/Context;)V

    return-void
.end method

.method private drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 13

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v11

    .line 4
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v12

    .line 5
    iget v1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v6, v1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v7, v1

    iget v1, p2, Landroid/graphics/Rect;->right:I

    int-to-float v8, v1

    iget-object v10, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBackgroundPaint:Landroid/graphics/Paint;

    move-object v5, p1

    move v9, v0

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 6
    iget v1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v6, v1

    iget v1, p2, Landroid/graphics/Rect;->right:I

    int-to-float v8, v1

    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v9, v1

    iget-object v10, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBackgroundPaint:Landroid/graphics/Paint;

    move v7, v12

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 7
    iget v1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBackgroundPaint:Landroid/graphics/Paint;

    move-object v1, p1

    move v3, v0

    move v5, v12

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 8
    iget p2, p2, Landroid/graphics/Rect;->right:I

    int-to-float v8, p2

    iget-object v10, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBackgroundPaint:Landroid/graphics/Paint;

    move-object v5, p1

    move v6, v11

    move v7, v0

    move v9, v12

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawCornerText(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapWidth:I

    int-to-float v2, v2

    div-float/2addr v2, v0

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapHeight:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    .line 5
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    move-result v1

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 6
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    move-result v2

    mul-float v2, v2, v0

    float-to-int v0, v2

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    const/high16 v3, 0x41c80000    # 25.0f

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 11
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    div-float/2addr v3, v2

    add-float/2addr v1, v3

    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 12
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    div-float/2addr v3, v2

    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    div-float/2addr v4, v2

    add-float/2addr v3, v4

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    .line 13
    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawCorners(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v6

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v7

    .line 3
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v8

    .line 4
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v9

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v6, v1

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float v3, v7, v3

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v1, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    int-to-float v1, v1

    div-float/2addr v1, v2

    sub-float v1, v8, v1

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr v7, v3

    invoke-virtual {p1, v0, v1, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    int-to-float v1, v1

    div-float/2addr v1, v2

    sub-float/2addr v6, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    int-to-float v1, v1

    div-float/2addr v1, v2

    sub-float v1, v9, v1

    invoke-virtual {p1, v0, v6, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    int-to-float v1, v1

    div-float/2addr v1, v2

    sub-float/2addr v8, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    int-to-float v1, v1

    div-float/2addr v1, v2

    sub-float/2addr v9, v1

    invoke-virtual {p1, v0, v8, v9, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 10
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    sub-float v1, v6, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerExtension:F

    sub-float v2, v7, v2

    sub-float v3, v6, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    add-float v4, v7, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 11
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    sub-float v2, v7, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    add-float v3, v6, v1

    sub-float v4, v7, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    add-float v1, v8, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerExtension:F

    sub-float v2, v7, v2

    add-float v3, v8, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    add-float v4, v7, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 13
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    sub-float v2, v7, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    sub-float v3, v8, v1

    sub-float v4, v7, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 14
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    sub-float v1, v6, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerExtension:F

    add-float/2addr v2, v9

    sub-float v3, v6, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    sub-float v4, v9, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    add-float v2, v9, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    add-float v3, v6, v1

    add-float v4, v9, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    add-float v1, v8, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerExtension:F

    add-float/2addr v2, v9

    add-float v3, v8, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    sub-float v4, v9, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 17
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    add-float v2, v9, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    sub-float v3, v8, v1

    add-float v4, v9, v0

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method private drawRuleOfThirdsGuidelines(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    .line 3
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v8

    .line 4
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v9

    .line 5
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    move-result v2

    const/high16 v10, 0x40400000    # 3.0f

    div-float v11, v2, v10

    add-float v5, v0, v11

    .line 6
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move-object v2, p1

    move v3, v5

    move v4, v1

    move v6, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v5, v8, v11

    .line 7
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 8
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    move-result v2

    div-float v7, v2, v10

    add-float v5, v1, v7

    .line 9
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move-object v1, p1

    move v2, v0

    move v3, v5

    move v4, v8

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v5, v9, v7

    .line 10
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->getTargetRadius(Landroid/content/Context;)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mHandleRadius:F

    const/4 v1, 0x1

    const/high16 v2, 0x40c00000    # 6.0f

    .line 3
    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mSnapRadius:F

    .line 4
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/crop/PaintUtil;->newBorderPaint(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/crop/PaintUtil;->newGuidelinePaint(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    .line 6
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/crop/PaintUtil;->newBackgroundPaint(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBackgroundPaint:Landroid/graphics/Paint;

    .line 7
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/crop/PaintUtil;->newCornerPaint(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    .line 8
    sget p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->DEFAULT_CORNER_OFFSET_DP:F

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerOffset:F

    .line 9
    sget p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->DEFAULT_CORNER_EXTENSION_DP:F

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerExtension:F

    const/high16 p1, 0x41a00000    # 20.0f

    .line 10
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerLength:F

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelines:I

    return-void
.end method

.method private initCropWindow(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initializedCropWindow:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initializedCropWindow:Z

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mFixAspectRatio:Z

    if-eqz v0, :cond_4

    .line 4
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateAspectRatio(Landroid/graphics/Rect;)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x42200000    # 40.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 5
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 6
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v2

    .line 8
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    .line 10
    invoke-static {v4, v5, v6}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateWidth(FFF)F

    move-result v4

    .line 11
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    cmpl-float v5, v4, v3

    if-nez v5, :cond_1

    .line 12
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    .line 13
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    sub-float/2addr v1, v0

    div-float/2addr v3, v1

    iput v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    :cond_1
    div-float/2addr v4, v2

    .line 14
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    sub-float v1, p1, v4

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 15
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    add-float/2addr p1, v4

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    goto/16 :goto_0

    .line 16
    :cond_2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 17
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v2

    .line 19
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    .line 20
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    .line 21
    invoke-static {v4, v5, v6}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateHeight(FFF)F

    move-result v4

    .line 22
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    cmpl-float v5, v4, v3

    if-nez v5, :cond_3

    .line 23
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    .line 24
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    sub-float/2addr v1, v0

    const/4 v0, 0x0

    cmpl-float v0, v1, v0

    if-lez v0, :cond_3

    div-float/2addr v1, v3

    .line 25
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    :cond_3
    div-float/2addr v4, v2

    .line 26
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    sub-float v1, p1, v4

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 27
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    add-float/2addr p1, v4

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    goto :goto_0

    .line 28
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3dcccccd    # 0.1f

    mul-float v0, v0, v1

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v1

    .line 30
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget v3, p1, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    add-float/2addr v3, v0

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 31
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget v3, p1, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    add-float/2addr v3, v2

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 32
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget v3, p1, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    sub-float/2addr v3, v0

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 33
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    sub-float/2addr p1, v2

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    :goto_0
    return-void
.end method

.method private onActionDown(FF)V
    .locals 11

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v8

    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v9

    .line 4
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v10

    .line 5
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mHandleRadius:F

    move v1, p1

    move v2, p2

    move v3, v0

    move v4, v8

    move v5, v9

    move v6, v10

    invoke-static/range {v1 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->getPressedHandle(FFFFFFF)Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    if-nez v1, :cond_0

    return-void

    :cond_0
    move v2, p1

    move v3, p2

    move v4, v0

    move v5, v8

    move v6, v9

    move v7, v10

    .line 6
    invoke-static/range {v1 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->getOffset(Lcom/xuexiang/xui/widget/imageview/crop/Handle;FFFFFF)Landroid/util/Pair;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTouchOffset:Landroid/util/Pair;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private onActionMove(FF)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTouchOffset:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float v2, p1, v0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTouchOffset:Landroid/util/Pair;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    add-float v3, p2, p1

    .line 4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mFixAspectRatio:Z

    if-eqz p1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mSnapRadius:F

    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->updateCropWindow(FFFLandroid/graphics/Rect;F)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mSnapRadius:F

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->updateCropWindow(FFLandroid/graphics/Rect;F)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private onActionUp()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static showGuidelines()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 3
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    sub-float/2addr v0, v2

    .line 4
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->showGuidelines()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelines:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->drawRuleOfThirdsGuidelines(Landroid/graphics/Canvas;)V

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->drawCornerText(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mPressedHandle:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    if-eqz v0, :cond_1

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->drawRuleOfThirdsGuidelines(Landroid/graphics/Canvas;)V

    .line 9
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->drawCornerText(Landroid/graphics/Canvas;)V

    .line 10
    :cond_1
    :goto_0
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 11
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v5

    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    move-object v1, p1

    .line 12
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 13
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->drawCorners(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initCropWindow(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_2

    return v1

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->onActionMove(FF)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v2

    .line 5
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->onActionUp()V

    return v2

    .line 7
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->onActionDown(FF)V

    return v2
.end method

.method public resetCropOverlayView()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initializedCropWindow:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initCropWindow(Landroid/graphics/Rect;)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setAspectRatioX(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioX:I

    int-to-float p1, p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioY:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAspectRatioY(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioY:I

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioX:I

    int-to-float v0, v0

    int-to-float p1, p1

    div-float/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBitmapRect(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapRect:Landroid/graphics/Rect;

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->initCropWindow(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBitmapSize(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapWidth:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBitmapHeight:I

    return-void
.end method

.method public setBorderAndGuidelineColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setBorderAndGuidelineStyle(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setBorderStyle(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setBorderWidth(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setCornerColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setCornerStyle(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setCornerWidth(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerWidth:I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mCornerHeight:I

    :cond_0
    return-void
.end method

.method public setFixedAspectRatio(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mFixAspectRatio:Z

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setGuidelineColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setGuidelineStyle(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setGuidelineWidth(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void
.end method

.method public setGuidelines(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelines:I

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Guideline value must be set between 0 and 2. See documentation."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setInitialAttributeValues(IZII)V
    .locals 1

    if-ltz p1, :cond_2

    const/4 v0, 0x2

    if-gt p1, v0, :cond_2

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mGuidelines:I

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mFixAspectRatio:Z

    const-string p1, "Cannot set aspect ratio value to a number less than or equal to 0."

    if-lez p3, :cond_1

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioX:I

    int-to-float p2, p3

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioY:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    if-lez p4, :cond_0

    .line 5
    iput p4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mAspectRatioY:I

    int-to-float p1, p3

    int-to-float p2, p4

    div-float/2addr p1, p2

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->mTargetAspectRatio:F

    return-void

    .line 7
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Guideline value must be set between 0 and 2. See documentation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
