.class public Lcom/xuexiang/xui/widget/button/RippleView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/RippleView$RippleType;,
        Lcom/xuexiang/xui/widget/button/RippleView$OnRippleCompleteListener;
    }
.end annotation


# instance fields
.field private HEIGHT:I

.field private WIDTH:I

.field private animationRunning:Z

.field private canvasHandler:Landroid/os/Handler;

.field private durationEmpty:I

.field private frameRate:I

.field private gestureDetector:Landroid/view/GestureDetector;

.field private hasToZoom:Ljava/lang/Boolean;

.field private isCentered:Ljava/lang/Boolean;

.field private onCompletionListener:Lcom/xuexiang/xui/widget/button/RippleView$OnRippleCompleteListener;

.field private originBitmap:Landroid/graphics/Bitmap;

.field private paint:Landroid/graphics/Paint;

.field private radiusMax:F

.field private rippleAlpha:I

.field private rippleColor:I

.field private rippleDuration:I

.field private ripplePadding:I

.field private rippleType:Ljava/lang/Integer;

.field private final runnable:Ljava/lang/Runnable;

.field private scaleAnimation:Landroid/view/animation/ScaleAnimation;

.field private timer:I

.field private timerEmpty:I

.field private x:F

.field private y:F

.field private zoomDuration:I

.field private zoomScale:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/RippleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->RippleViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/RippleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    const/16 v0, 0x190

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    const/16 v0, 0x5a

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->animationRunning:Z

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timerEmpty:I

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->durationEmpty:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:F

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:F

    .line 14
    new-instance v0, Lcom/xuexiang/xui/widget/button/RippleView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/RippleView$1;-><init>(Lcom/xuexiang/xui/widget/button/RippleView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->runnable:Ljava/lang/Runnable;

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/RippleView;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/button/RippleView;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->sendClickEvent(Ljava/lang/Boolean;)V

    return-void
.end method

.method private createAnimation(FF)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->animationRunning:Z

    if-nez v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->hasToZoom:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->scaleAnimation:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 4
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->WIDTH:I

    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->HEIGHT:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    .line 7
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->ripplePadding:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->isCentered:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:F

    .line 10
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:F

    goto :goto_1

    .line 11
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result p1

    shr-int/2addr p1, v1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:F

    .line 12
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result p1

    shr-int/2addr p1, v1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:F

    .line 13
    :goto_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->animationRunning:Z

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_4

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->originBitmap:Landroid/graphics/Bitmap;

    if-nez p1, :cond_4

    .line 15
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->originBitmap:Landroid/graphics/Bitmap;

    .line 16
    :cond_4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    :cond_5
    return-void
.end method

.method private getCircleBitmap(I)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->originBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->originBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 3
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 4
    new-instance v3, Landroid/graphics/Rect;

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:F

    int-to-float p1, p1

    sub-float v5, v4, p1

    float-to-int v5, v5

    iget v6, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:F

    sub-float v7, v6, p1

    float-to-int v7, v7

    add-float/2addr v4, p1

    float-to-int v4, v4

    add-float/2addr v6, p1

    float-to-int v6, v6

    invoke-direct {v3, v5, v7, v4, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v4, 0x1

    .line 5
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v4, 0x0

    .line 6
    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 7
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:F

    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:F

    invoke-virtual {v1, v4, v5, p1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 8
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->originBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1, p1, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-object v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/RippleView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/RippleView;->initPaint()V

    .line 3
    new-instance p2, Landroid/view/GestureDetector;

    new-instance p3, Lcom/xuexiang/xui/widget/button/RippleView$2;

    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/button/RippleView$2;-><init>(Lcom/xuexiang/xui/widget/button/RippleView;)V

    invoke-direct {p2, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->gestureDetector:Landroid/view/GestureDetector;

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setDrawingCacheEnabled(Z)V

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setClickable(Z)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RippleView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_color:I

    sget p3, Lcom/xuexiang/xui/R$color;->xui_config_color_white:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleColor:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_type:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_zoom:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->hasToZoom:Ljava/lang/Boolean;

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_centered:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->isCentered:Ljava/lang/Boolean;

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_rippleDuration:I

    iget p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_frameRate:I

    iget p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_alpha:I

    iget p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_ripplePadding:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->ripplePadding:I

    .line 10
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->canvasHandler:Landroid/os/Handler;

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_zoomScale:I

    const p3, 0x3f83d70a    # 1.03f

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomScale:F

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_zoomDuration:I

    const/16 p3, 0xc8

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomDuration:I

    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initPaint()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    return-void
.end method

.method private sendClickEvent(Ljava/lang/Boolean;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/AdapterView;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/AdapterView;

    .line 3
    invoke-virtual {v2, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v4

    .line 4
    invoke-virtual {v2, v4}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v5

    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemLongClickListener()Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemLongClickListener()Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v1

    move-object v3, p0

    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v1

    move-object v3, p0

    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public animateRipple(FF)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/RippleView;->createAnimation(FF)V

    return-void
.end method

.method public animateRipple(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->createAnimation(FF)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->animationRunning:Z

    if-eqz v0, :cond_8

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    mul-int v1, v1, v2

    const/4 v3, -0x1

    if-gt v0, v1, :cond_2

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->animationRunning:Z

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    .line 7
    iput v3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->durationEmpty:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timerEmpty:I

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-eq v0, v1, :cond_0

    .line 10
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->onCompletionListener:Lcom/xuexiang/xui/widget/button/RippleView$OnRippleCompleteListener;

    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/button/RippleView$OnRippleCompleteListener;->onComplete(Lcom/xuexiang/xui/widget/button/RippleView;)V

    :cond_1
    return-void

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->canvasHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->runnable:Ljava/lang/Runnable;

    int-to-long v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    if-nez v0, :cond_3

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 17
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:F

    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    int-to-float v4, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    int-to-float v5, v5

    mul-float v4, v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    mul-float v2, v2, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    const-string v1, "#FFFF4444"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->originBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    int-to-float v2, v0

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    int-to-float v5, v4

    mul-float v2, v2, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    int-to-float v6, v5

    div-float/2addr v2, v6

    const v6, 0x3ecccccd    # 0.4f

    cmpl-float v2, v2, v6

    if-lez v2, :cond_5

    .line 20
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->durationEmpty:I

    if-ne v2, v3, :cond_4

    mul-int v0, v0, v4

    sub-int/2addr v5, v0

    .line 21
    iput v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->durationEmpty:I

    .line 22
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timerEmpty:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timerEmpty:I

    .line 23
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->radiusMax:F

    int-to-float v0, v0

    int-to-float v3, v4

    mul-float v0, v0, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->durationEmpty:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    mul-float v2, v2, v0

    float-to-int v0, v2

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/RippleView;->getCircleBitmap(I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 24
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 25
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 26
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_7

    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    int-to-float v2, v0

    mul-float p1, p1, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    int-to-float v2, v2

    div-float/2addr p1, v2

    const v2, 0x3f19999a    # 0.6f

    cmpl-float p1, p1, v2

    if-lez p1, :cond_6

    .line 29
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    int-to-float v3, v2

    int-to-float v2, v2

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timerEmpty:I

    int-to-float v4, v4

    int-to-float v0, v0

    mul-float v4, v4, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->durationEmpty:I

    int-to-float v0, v0

    div-float/2addr v4, v0

    mul-float v2, v2, v4

    sub-float/2addr v3, v2

    float-to-int v0, v3

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_0

    .line 30
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_0

    .line 31
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->paint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    int-to-float v2, v0

    int-to-float v0, v0

    iget v3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    int-to-float v3, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    int-to-float v4, v4

    mul-float v3, v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float v0, v0, v3

    sub-float/2addr v2, v0

    float-to-int v0, v2

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 32
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->timer:I

    :cond_8
    return-void
.end method

.method public getFrameRate()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    return v0
.end method

.method public getRippleAlpha()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    return v0
.end method

.method public getRippleColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleColor:I

    return v0
.end method

.method public getRippleDuration()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    return v0
.end method

.method public getRipplePadding()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->ripplePadding:I

    return v0
.end method

.method public getRippleType()Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
    .locals 2

    invoke-static {}, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->values()[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getZoomDuration()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomDuration:I

    return v0
.end method

.method public getZoomScale()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomScale:F

    return v0
.end method

.method public isCentered()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->isCentered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public isZooming()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->hasToZoom:Ljava/lang/Boolean;

    return-object v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->WIDTH:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->HEIGHT:I

    .line 4
    new-instance p3, Landroid/view/animation/ScaleAnimation;

    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomScale:F

    const/4 p4, 0x1

    shr-int/2addr p1, p4

    int-to-float v5, p1

    shr-int/lit8 p1, p2, 0x1

    int-to-float v6, p1

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    move-object v0, p3

    move v2, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->scaleAnimation:Landroid/view/animation/ScaleAnimation;

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomDuration:I

    int-to-long p1, p1

    invoke-virtual {p3, p1, p2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->scaleAnimation:Landroid/view/animation/ScaleAnimation;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/view/animation/ScaleAnimation;->setRepeatMode(I)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->scaleAnimation:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {p1, p4}, Landroid/view/animation/ScaleAnimation;->setRepeatCount(I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->gestureDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->animateRipple(Landroid/view/MotionEvent;)V

    .line 3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/RippleView;->sendClickEvent(Ljava/lang/Boolean;)V

    .line 4
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setCentered(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->isCentered:Ljava/lang/Boolean;

    return-void
.end method

.method public setFrameRate(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->frameRate:I

    return-void
.end method

.method public setOnRippleCompleteListener(Lcom/xuexiang/xui/widget/button/RippleView$OnRippleCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->onCompletionListener:Lcom/xuexiang/xui/widget/button/RippleView$OnRippleCompleteListener;

    return-void
.end method

.method public setRippleAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleAlpha:I

    return-void
.end method

.method public setRippleColor(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleColor:I

    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleDuration:I

    return-void
.end method

.method public setRipplePadding(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->ripplePadding:I

    return-void
.end method

.method public setRippleType(Lcom/xuexiang/xui/widget/button/RippleView$RippleType;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->rippleType:Ljava/lang/Integer;

    return-void
.end method

.method public setZoomDuration(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomDuration:I

    return-void
.end method

.method public setZoomScale(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->zoomScale:F

    return-void
.end method

.method public setZooming(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->hasToZoom:Ljava/lang/Boolean;

    return-void
.end method
