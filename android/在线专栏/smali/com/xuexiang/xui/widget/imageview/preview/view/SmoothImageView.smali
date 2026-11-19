.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;
.super Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    }
.end annotation


# static fields
.field private static final MIN_TRANS_DEST:I = 0x5

.field private static TRANSFORM_DURATION:I = 0x190


# instance fields
.field private alpha:I

.field private alphaChangeListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;

.field private animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

.field animator:Landroid/animation/ValueAnimator;

.field private bitmapHeight:I

.field private bitmapWidth:I

.field private downX:I

.field private downY:I

.field private endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

.field private isDownPhoto:Z

.field private isDrag:Z

.field private isMoved:Z

.field private mMaxTransScale:F

.field private mPaint:Landroid/graphics/Paint;

.field private mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

.field private markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

.field private matrix:Landroid/graphics/Matrix;

.field private onTransformListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;

.field private startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

.field private thumbRect:Landroid/graphics/Rect;

.field private transformOutListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;

.field private transformStart:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;)V

    .line 9
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_NORMAL:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    const/high16 p1, 0x3f000000    # 0.5f

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mMaxTransScale:F

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    .line 12
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDownPhoto:Z

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    .line 14
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->initSmoothImageView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_NORMAL:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    const/high16 p1, 0x3f000000    # 0.5f

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mMaxTransScale:F

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDownPhoto:Z

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->initSmoothImageView()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alphaChangeListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->onTransformListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    return-object p0
.end method

.method static synthetic access$302(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    return-object p1
.end method

.method private changeTransform()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->clone()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleX()F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v3, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    mul-float v2, v2, v3

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    .line 7
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->clone()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    .line 8
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->clone()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    :cond_0
    return-void
.end method

.method private initSmoothImageView()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    .line 2
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->matrix:Landroid/graphics/Matrix;

    .line 5
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method private initTransform()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    .line 4
    :cond_2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 10
    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    .line 11
    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 14
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    .line 16
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    .line 17
    :goto_0
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$1;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    const/4 v2, 0x0

    .line 18
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    if-nez v0, :cond_5

    .line 20
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    .line 22
    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-static {}, Lcom/xuexiang/xui/utils/Utils;->getStatusBarHeight()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 26
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 27
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    .line 28
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 29
    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 30
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    invoke-direct {v3, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$1;)V

    iput-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    .line 31
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    .line 32
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    const/16 v1, 0xff

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    .line 33
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    int-to-float v2, v2

    mul-float v2, v2, v1

    float-to-int v2, v2

    .line 34
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    int-to-float v3, v3

    mul-float v1, v1, v3

    float-to-int v1, v1

    .line 35
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    sub-int/2addr v3, v2

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v3

    sub-int/2addr v3, v1

    int-to-float v3, v3

    div-float/2addr v3, v4

    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    .line 37
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    int-to-float v1, v1

    .line 38
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    .line 39
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-ne v1, v2, :cond_6

    .line 40
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->clone()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    goto :goto_1

    .line 41
    :cond_6
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-ne v1, v2, :cond_7

    .line 42
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->clone()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    .line 43
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    :cond_8
    :goto_2
    return-void
.end method

.method private moveScale()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->initTransform()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method private moveToOldPosition()V
    .locals 10

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v3, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 2
    new-instance v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$1;

    invoke-direct {v4, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$1;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v4, v0, [I

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v5

    aput v5, v4, v3

    aput v3, v4, v2

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v4

    .line 4
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;

    invoke-direct {v5, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v5, v0, [I

    .line 5
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    aput v6, v5, v3

    const/16 v6, 0xff

    aput v6, v5, v2

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v5

    .line 6
    new-instance v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$3;

    invoke-direct {v6, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$3;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v6, v0, [F

    .line 7
    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleX()F

    move-result v7

    aput v7, v6, v3

    const/high16 v7, 0x3f800000    # 1.0f

    aput v7, v6, v2

    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v6

    .line 8
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$4;

    invoke-direct {v7, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$4;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v6, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 9
    new-instance v7, Landroid/animation/AnimatorSet;

    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    .line 10
    sget v8, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->TRANSFORM_DURATION:I

    int-to-long v8, v8

    invoke-virtual {v7, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 11
    new-instance v8, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v8}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v8, 0x4

    new-array v8, v8, [Landroid/animation/Animator;

    aput-object v1, v8, v3

    aput-object v4, v8, v2

    aput-object v6, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    .line 12
    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 13
    invoke-virtual {v7}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method public static setDuration(I)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->TRANSFORM_DURATION:I

    return-void
.end method

.method private startTransform()V
    .locals 15

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformStart:Z

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    .line 4
    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->TRANSFORM_DURATION:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x6

    const-string v7, "animHeight"

    const-string v8, "animWidth"

    const-string v9, "animTop"

    const-string v10, "animLeft"

    const-string v11, "animAlpha"

    const-string v12, "animScale"

    const/4 v13, 0x1

    const/4 v14, 0x2

    if-ne v1, v2, :cond_1

    new-array v1, v14, [F

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    aput v2, v1, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    aput v2, v1, v13

    invoke-static {v12, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    new-array v2, v14, [I

    .line 8
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    aput v12, v2, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    aput v12, v2, v13

    invoke-static {v11, v2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    new-array v11, v14, [F

    .line 9
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    aput v12, v11, v13

    invoke-static {v10, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v10

    new-array v11, v14, [F

    .line 10
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    aput v12, v11, v13

    invoke-static {v9, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    new-array v11, v14, [F

    .line 11
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    aput v12, v11, v13

    invoke-static {v8, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    new-array v11, v14, [F

    .line 12
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    aput v12, v11, v13

    invoke-static {v7, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 13
    iget-object v11, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    new-array v6, v6, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v6, v0

    aput-object v2, v6, v13

    aput-object v10, v6, v14

    aput-object v9, v6, v5

    aput-object v8, v6, v4

    aput-object v7, v6, v3

    invoke-virtual {v11, v6}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto/16 :goto_0

    .line 14
    :cond_1
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-ne v1, v2, :cond_2

    new-array v1, v14, [F

    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    aput v2, v1, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    aput v2, v1, v13

    invoke-static {v12, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    new-array v2, v14, [I

    .line 16
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    aput v12, v2, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    aput v12, v2, v13

    invoke-static {v11, v2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    new-array v11, v14, [F

    .line 17
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    aput v12, v11, v13

    invoke-static {v10, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v10

    new-array v11, v14, [F

    .line 18
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    aput v12, v11, v13

    invoke-static {v9, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    new-array v11, v14, [F

    .line 19
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    aput v12, v11, v13

    invoke-static {v8, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    new-array v11, v14, [F

    .line 20
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    aput v12, v11, v0

    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    aput v12, v11, v13

    invoke-static {v7, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v7

    .line 21
    iget-object v11, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    new-array v6, v6, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v6, v0

    aput-object v2, v6, v13

    aput-object v10, v6, v14

    aput-object v9, v6, v5

    aput-object v8, v6, v4

    aput-object v7, v6, v3

    invoke-virtual {v11, v6}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    .line 22
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$5;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$5;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public checkMinScale()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->getScale()F

    move-result v0

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v2, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setScale(FZ)V

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->getScale()F

    move-result v1

    const/4 v2, 0x3

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    cmpl-float v1, v1, v3

    if-nez v1, :cond_e

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    if-eq v0, v4, :cond_8

    const/4 v5, 0x2

    if-eq v0, v5, :cond_0

    if-eq v0, v2, :cond_8

    goto/16 :goto_3

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDownPhoto:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ne v0, v4, :cond_1

    goto/16 :goto_3

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 6
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->downX:I

    sub-int/2addr v0, v5

    .line 7
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->downY:I

    sub-int/2addr v2, v5

    .line 8
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    if-nez v5, :cond_3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v5

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-gt v5, v6, :cond_2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/4 v6, 0x5

    if-ge v5, v6, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_4

    .line 9
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 10
    :cond_4
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDrag:Z

    if-eqz v5, :cond_5

    .line 11
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 12
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-ne v5, v4, :cond_12

    .line 13
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_MOVE:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 14
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->offsetLeftAndRight(I)V

    .line 15
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->offsetTopAndBottom(I)V

    .line 16
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->moveScale()F

    move-result p1

    const v0, 0x3dcccccd    # 0.1f

    mul-float v0, v0, p1

    sub-float v0, v3, v0

    .line 17
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleY(F)V

    .line 18
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleX(F)V

    .line 19
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    const/high16 v0, 0x437f0000    # 255.0f

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float p1, p1, v2

    sub-float/2addr v3, p1

    mul-float v3, v3, v0

    float-to-int p1, v3

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    .line 21
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    .line 22
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    if-gez p1, :cond_6

    .line 23
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    .line 24
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alphaChangeListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;

    if-eqz p1, :cond_7

    .line 25
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alpha:I

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;->onAlphaChange(I)V

    :cond_7
    return v4

    .line 26
    :cond_8
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    if-eqz v0, :cond_12

    .line 27
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->moveScale()F

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mMaxTransScale:F

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_9

    .line 28
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->moveToOldPosition()V

    goto :goto_1

    .line 29
    :cond_9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->changeTransform()V

    .line 30
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformOutListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;

    if-eqz p1, :cond_a

    .line 32
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;->onTransformOut()V

    :cond_a
    :goto_1
    return v4

    .line 33
    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->downX:I

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->downY:I

    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-nez v0, :cond_c

    .line 36
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->initTransform()V

    .line 37
    :cond_c
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDownPhoto:Z

    .line 38
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->markTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_d

    .line 39
    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    float-to-int v3, v2

    .line 40
    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    add-float/2addr v0, v2

    float-to-int v0, v0

    .line 41
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->downY:I

    if-lt v2, v3, :cond_d

    if-lt v0, v2, :cond_d

    .line 42
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDownPhoto:Z

    .line 43
    :cond_d
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    goto :goto_3

    :cond_e
    if-eq v0, v4, :cond_f

    if-eq v0, v2, :cond_f

    goto :goto_3

    .line 44
    :cond_f
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isMoved:Z

    if-eqz v0, :cond_12

    .line 45
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->moveScale()F

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mMaxTransScale:F

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_10

    .line 46
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->moveToOldPosition()V

    goto :goto_2

    .line 47
    :cond_10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->changeTransform()V

    .line 48
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    .line 49
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformOutListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;

    if-eqz p1, :cond_11

    .line 50
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;->onTransformOut()V

    :cond_11
    :goto_2
    return v4

    .line 51
    :cond_12
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->matrix:Landroid/graphics/Matrix;

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_0

    .line 11
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->clone()Landroid/animation/ValueAnimator;

    .line 13
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animator:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-eq v0, v1, :cond_3

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_MOVE:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-ne v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 6
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    goto/16 :goto_1

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 9
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    goto/16 :goto_1

    .line 10
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->endTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-nez v0, :cond_5

    .line 11
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->initTransform()V

    .line 12
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    if-nez v0, :cond_6

    .line 13
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    return-void

    .line 14
    :cond_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->alpha:I

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getSaveCount()I

    move-result v0

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->matrix:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    invoke-virtual {v1, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 18
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapWidth:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v3, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->scale:F

    mul-float v1, v1, v3

    iget v4, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    sub-float/2addr v1, v4

    neg-float v1, v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    .line 19
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->bitmapHeight:I

    int-to-float v5, v5

    mul-float v5, v5, v3

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    sub-float/2addr v5, v2

    neg-float v2, v5

    div-float/2addr v2, v4

    .line 20
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->left:F

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->top:F

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->animTransform:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;

    iget v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->width:F

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Transform;->height:F

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v3, v2, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 24
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 26
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformStart:Z

    if-eqz p1, :cond_7

    .line 27
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform()V

    :cond_7
    :goto_1
    return-void
.end method

.method public setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->alphaChangeListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;

    return-void
.end method

.method public setDrag(ZF)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->isDrag:Z

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mMaxTransScale:F

    return-void
.end method

.method public setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->onTransformListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;

    return-void
.end method

.method public setThumbRect(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->thumbRect:Landroid/graphics/Rect;

    return-void
.end method

.method public setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformOutListener:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;

    return-void
.end method

.method public transformIn(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformStart:Z

    .line 3
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 4
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public transformOut(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->offsetTopAndBottom(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->offsetLeftAndRight(I)V

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleX()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setScaleX(F)V

    .line 7
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setScaleY(F)V

    .line 8
    :cond_2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformStart:Z

    .line 10
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->mStatus:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 11
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method
