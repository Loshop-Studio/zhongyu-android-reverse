.class public Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field static final DEFAULT_BRUSH_SIZE:F = 25.0f

.field static final DEFAULT_ERASER_SIZE:F = 50.0f

.field static final DEFAULT_OPACITY:I = 0xff

.field private static final TOUCH_TOLERANCE:F = 4.0f


# instance fields
.field private mBrushDrawMode:Z

.field private mBrushEraserSize:F

.field private mBrushSize:F

.field private mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

.field private mDrawCanvas:Landroid/graphics/Canvas;

.field private final mDrawPaint:Landroid/graphics/Paint;

.field private final mDrawnPaths:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/LinePath;",
            ">;"
        }
    .end annotation
.end field

.field private mOpacity:I

.field private mPath:Landroid/graphics/Path;

.field private final mRedoPaths:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/LinePath;",
            ">;"
        }
    .end annotation
.end field

.field private mTouchX:F

.field private mTouchY:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x41c80000    # 25.0f

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushSize:F

    const/high16 p1, 0x42480000    # 50.0f

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushEraserSize:F

    const/16 p1, 0xff

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mOpacity:I

    .line 7
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    .line 8
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setupBrushDrawing()V

    return-void
.end method

.method private refreshBrushDrawing()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushDrawMode:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setupPathAndPaint()V

    return-void
.end method

.method private setupBrushDrawing()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setupPathAndPaint()V

    const/16 v0, 0x8

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private setupPathAndPaint()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mOpacity:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method

.method private touchMove(FF)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchX:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchY:F

    sub-float v1, p2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x40800000    # 4.0f

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    cmpl-float v0, v1, v2

    if-ltz v0, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchX:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchY:F

    add-float v3, p1, v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float v5, p2, v2

    div-float/2addr v5, v4

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchX:F

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchY:F

    :cond_1
    return-void
.end method

.method private touchStart(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchX:F

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchY:F

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;->onStartDrawing()V

    :cond_0
    return-void
.end method

.method private touchUp()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchX:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mTouchY:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawCanvas:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-direct {v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;-><init>(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;->onStopDrawing()V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

    invoke-interface {v0, p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;->onViewAdd(Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;)V

    :cond_0
    return-void
.end method


# virtual methods
.method brushEraser()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushDrawMode:Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushEraserSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method

.method clearAll()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawCanvas:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 4
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method getBrushColor()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method getBrushDrawingMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushDrawMode:Z

    return v0
.end method

.method getBrushSize()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushSize:F

    return v0
.end method

.method getDrawingPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    return-object v0
.end method

.method getDrawingPath()Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/LinePath;",
            ">;",
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/LinePath;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Landroid/util/Pair;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method getEraserSize()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushEraserSize:F

    return v0
.end method

.method getOpacity()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mOpacity:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;

    .line 2
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;->getDrawPath()Landroid/graphics/Path;

    move-result-object v2

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;->getDrawPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 3
    new-instance p2, Landroid/graphics/Canvas;

    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawCanvas:Landroid/graphics/Canvas;

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushDrawMode:Z

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v2, :cond_1

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->touchMove(FF)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->touchUp()V

    goto :goto_0

    .line 7
    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->touchStart(FF)V

    .line 8
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method redo()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0, p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;->onViewAdd(Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method setBrushColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    return-void
.end method

.method setBrushDrawingMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushDrawMode:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->refreshBrushDrawing()V

    :cond_0
    return-void
.end method

.method setBrushEraserColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    return-void
.end method

.method setBrushEraserSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushEraserSize:F

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    return-void
.end method

.method setBrushSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushSize:F

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    return-void
.end method

.method setBrushViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

    return-void
.end method

.method setOpacity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mOpacity:I

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    return-void
.end method

.method undo()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mRedoPaths:Ljava/util/Stack;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mBrushViewChangeListener:Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0, p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;->onViewRemoved(Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->mDrawnPaths:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
