.class public Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final DEFAULT_ASPECT_RATIO_X:I = 0x1

.field public static final DEFAULT_ASPECT_RATIO_Y:I = 0x1

.field public static final DEFAULT_FIXED_ASPECT_RATIO:Z = false

.field public static final DEFAULT_GUIDELINES:I = 0x1

.field private static final DEFAULT_IMAGE_RESOURCE:I = 0x0

.field private static final DEGREES_ROTATED:Ljava/lang/String; = "DEGREES_ROTATED"

.field private static final EMPTY_RECT:Landroid/graphics/Rect;


# instance fields
.field private mAspectRatioX:I

.field private mAspectRatioY:I

.field private mBitmap:Landroid/graphics/Bitmap;

.field private mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

.field private mDegreesRotated:I

.field private mFixAspectRatio:Z

.field private mGuidelines:I

.field private mImageResource:I

.field private mImageView:Landroid/widget/ImageView;

.field private mLayoutHeight:I

.field private mLayoutWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->EMPTY_RECT:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mGuidelines:I

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mFixAspectRatio:Z

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioX:I

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioY:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageResource:I

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mGuidelines:I

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mFixAspectRatio:Z

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioX:I

    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioY:I

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageResource:I

    .line 16
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->CropImageView:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 17
    :try_start_0
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_guidelines:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mGuidelines:I

    .line 18
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_fixAspectRatio:I

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mFixAspectRatio:Z

    .line 19
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_aspectRatioX:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioX:I

    .line 20
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_aspectRatioY:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioY:I

    .line 21
    sget v1, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_imageResource:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageResource:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->init(Landroid/content/Context;)V

    return-void

    :catchall_0
    move-exception p1

    .line 24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    throw p1
.end method

.method private static getOnMeasureSpec(III)I
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    return p1
.end method

.method private init(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_crop_image_view:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->iv_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageView:Landroid/widget/ImageView;

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageResource:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageResource(I)V

    .line 5
    sget v0, Lcom/xuexiang/xui/R$id;->crop_overlay_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mGuidelines:I

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mFixAspectRatio:Z

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioX:I

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioY:I

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setInitialAttributeValues(IZII)V

    return-void
.end method


# virtual methods
.method public cropImage()Landroid/graphics/Bitmap;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->cropImage(Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public cropImage(Z)Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->getCroppedImage()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-nez p1, :cond_1

    const/16 p1, 0x8

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setCropOverlayViewVisibility(I)Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    :cond_1
    return-object v0
.end method

.method public getActualCropRect()Landroid/graphics/RectF;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/ImageViewUtil;->getBitmapRectCenterInside(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 6
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 7
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float/2addr v4, v0

    .line 8
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    move-result v0

    .line 9
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    move-result v5

    mul-float v3, v3, v1

    mul-float v4, v4, v2

    mul-float v0, v0, v1

    add-float/2addr v0, v3

    mul-float v5, v5, v2

    add-float/2addr v5, v4

    const/4 v1, 0x0

    .line 10
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 11
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 13
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 14
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v2, v1, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v4
.end method

.method public getCropOverlayView()Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    return-object v0
.end method

.method public getCroppedImage()Landroid/graphics/Bitmap;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/ImageViewUtil;->getBitmapRectCenterInside(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 4
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 6
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 8
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float/2addr v4, v0

    .line 9
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    move-result v0

    .line 10
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    move-result v5

    mul-float v3, v3, v1

    mul-float v4, v4, v2

    mul-float v0, v0, v1

    mul-float v5, v5, v2

    .line 11
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    float-to-int v7, v3

    float-to-int v8, v4

    float-to-int v9, v0

    float-to-int v10, v5

    const/4 v11, 0x1

    invoke-static/range {v6 .. v11}, Lcom/xuexiang/xui/utils/DrawableUtils;->createBitmapSafely(Landroid/graphics/Bitmap;IIIII)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public getImageResource()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageResource:I

    return v0
.end method

.method public getImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageView:Landroid/widget/ImageView;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutWidth:I

    if-lez p1, :cond_0

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutHeight:I

    if-lez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 4
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutWidth:I

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 5
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutHeight:I

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_6

    .line 6
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    if-nez v3, :cond_0

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    if-ge v1, p1, :cond_1

    int-to-double p1, v1

    .line 9
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-double v6, v6

    div-double/2addr p1, v6

    goto :goto_0

    :cond_1
    move-wide p1, v4

    .line 10
    :goto_0
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-ge v3, v6, :cond_2

    int-to-double v6, v3

    .line 11
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-double v8, v8

    div-double/2addr v6, v8

    goto :goto_1

    :cond_2
    move-wide v6, v4

    :goto_1
    cmpl-double v8, p1, v4

    if-nez v8, :cond_4

    cmpl-double v8, v6, v4

    if-eqz v8, :cond_3

    goto :goto_2

    .line 12
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    .line 13
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    goto :goto_3

    :cond_4
    :goto_2
    cmpg-double v4, p1, v6

    if-gtz v4, :cond_5

    .line 14
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-double v4, v4

    mul-double v4, v4, p1

    double-to-int p2, v4

    move p1, v1

    goto :goto_3

    .line 15
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-double p1, p1

    mul-double p1, p1, v6

    double-to-int p1, p1

    move p2, v3

    .line 16
    :goto_3
    invoke-static {v0, v1, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->getOnMeasureSpec(III)I

    move-result p1

    .line 17
    invoke-static {v2, v3, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->getOnMeasureSpec(III)I

    move-result p2

    .line 18
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutWidth:I

    .line 19
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutHeight:I

    .line 20
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    .line 21
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutWidth:I

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutHeight:I

    .line 22
    invoke-static {p1, p2, v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/ImageViewUtil;->getBitmapRectCenterInside(IIII)Landroid/graphics/Rect;

    move-result-object p1

    .line 23
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapSize(II)V

    .line 25
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutWidth:I

    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mLayoutHeight:I

    invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V

    goto :goto_4

    .line 26
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->EMPTY_RECT:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 27
    invoke-virtual {p0, v1, v3}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V

    :goto_4
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Landroid/os/Bundle;

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    const-string v0, "DEGREES_ROTATED"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->rotateImage(I)V

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    :cond_0
    const-string v0, "instanceState"

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const-string v2, "instanceState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    const-string v2, "DEGREES_ROTATED"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p1, p0}, Lcom/xuexiang/xui/widget/imageview/crop/ImageViewUtil;->getBitmapRectCenterInside(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->EMPTY_RECT:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    :goto_0
    return-void
.end method

.method public reverseImage(Lcom/xuexiang/xui/widget/imageview/crop/CropImageType$REVERSE_TYPE;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 3
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageType$REVERSE_TYPE;->UP_DOWN:Lcom/xuexiang/xui/widget/imageview/crop/CropImageType$REVERSE_TYPE;

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne p1, v0, :cond_1

    .line 4
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0

    .line 5
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageType$REVERSE_TYPE;->LEFT_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/CropImageType$REVERSE_TYPE;

    if-ne p1, v0, :cond_2

    .line 6
    invoke-virtual {v6, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 7
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public rotateImage(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    int-to-float v0, p1

    .line 3
    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    .line 7
    rem-int/lit16 v0, v0, 0x168

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mDegreesRotated:I

    return-void
.end method

.method public setAspectRatio(II)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioX:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setAspectRatioX(I)V

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mAspectRatioY:I

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setAspectRatioY(I)V

    return-void
.end method

.method public setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setCropOverlayViewVisibility(I)Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-object p0
.end method

.method public setFixedAspectRatio(Z)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setFixedAspectRatio(Z)V

    return-void
.end method

.method public setGuidelines(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setGuidelines(I)V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mBitmap:Landroid/graphics/Bitmap;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mImageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->resetCropOverlayView()V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->mCropOverlayView:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;Landroid/media/ExifInterface;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 7
    :cond_1
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    const/4 v0, 0x1

    const-string v1, "Orientation"

    .line 8
    invoke-virtual {p2, v1, v0}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result p2

    const/4 v0, 0x3

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x6

    if-eq p2, v0, :cond_3

    const/16 v0, 0x8

    if-eq p2, v0, :cond_2

    const/4 p2, -0x1

    goto :goto_0

    :cond_2
    const/16 p2, 0x10e

    goto :goto_0

    :cond_3
    const/16 p2, 0x5a

    goto :goto_0

    :cond_4
    const/16 p2, 0xb4

    :goto_0
    if-ne p2, v1, :cond_5

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_5
    int-to-float p2, p2

    .line 10
    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p1

    .line 13
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 14
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :goto_1
    return-void
.end method

.method public setImagePath(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public switchCropOverlayViewVisibility(Z)Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setCropOverlayViewVisibility(I)Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    move-result-object p1

    return-object p1
.end method
