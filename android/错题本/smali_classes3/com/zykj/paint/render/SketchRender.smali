.class public Lcom/zykj/paint/render/SketchRender;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SketchRender"


# instance fields
.field public height:I

.field public mBitmap:Landroid/graphics/Bitmap;

.field public mCanvas:Landroid/graphics/Canvas;

.field public mPaint:Landroid/graphics/Paint;

.field private mPath:Landroid/graphics/Path;

.field public mScreenBitmap:Landroid/graphics/Bitmap;

.field public mScreenCanvas:Landroid/graphics/Canvas;

.field private mX:F

.field private mY:F

.field mapViewer:Lcom/zykj/paint/render/MapViewer;

.field private polylineDrawer:Lcom/zykj/paint/draw/PolylineDrawer;

.field public width:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/paint/render/SketchRender;->mX:F

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/paint/render/SketchRender;->mY:F

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 7
    .line 8
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 9
    .line 10
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 22
    .line 23
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public directDrawBitmap(Lcom/zykj/paint/graphic/RectBmp;Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p3, p2, p4, p1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public directDrawPolyLine(Ljava/util/List;Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/data/Vector2D;",
            ">;",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/zykj/paint/data/Vector2D;

    .line 13
    .line 14
    iget-wide v3, v2, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 15
    .line 16
    double-to-float v3, v3

    .line 17
    iget-wide v4, v2, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 18
    .line 19
    double-to-float v2, v4

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance v4, Landroid/graphics/Path;

    .line 23
    .line 24
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v4, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 28
    .line 29
    invoke-virtual {v4, v3, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v4, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 34
    .line 35
    iget v5, p0, Lcom/zykj/paint/render/SketchRender;->mX:F

    .line 36
    .line 37
    iget v6, p0, Lcom/zykj/paint/render/SketchRender;->mY:F

    .line 38
    .line 39
    add-float v7, v3, v5

    .line 40
    .line 41
    const/high16 v8, 0x40000000    # 2.0f

    .line 42
    .line 43
    div-float/2addr v7, v8

    .line 44
    add-float v9, v2, v6

    .line 45
    .line 46
    div-float/2addr v9, v8

    .line 47
    invoke-virtual {v4, v5, v6, v7, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 48
    .line 49
    .line 50
    :goto_1
    iput v3, p0, Lcom/zykj/paint/render/SketchRender;->mX:F

    .line 51
    .line 52
    iput v2, p0, Lcom/zykj/paint/render/SketchRender;->mY:F

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-eqz p3, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 60
    .line 61
    invoke-virtual {p1, p3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 65
    .line 66
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 70
    .line 71
    iget-object p3, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-virtual {p2, p1, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public drawBezierLine(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender;->polylineDrawer:Lcom/zykj/paint/draw/PolylineDrawer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/paint/draw/PolylineDrawer;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/zykj/paint/draw/PolylineDrawer;-><init>(Landroid/graphics/Paint;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/paint/render/SketchRender;->polylineDrawer:Lcom/zykj/paint/draw/PolylineDrawer;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender;->polylineDrawer:Lcom/zykj/paint/draw/PolylineDrawer;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1, p2}, Lcom/zykj/paint/draw/PolylineDrawer;->draw(Landroid/graphics/Canvas;Ljava/util/List;Z)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Lcom/zykj/paint/data/Rect2D;Lcom/zykj/paint/data/Rect2D;)V
    .locals 2

    .line 7
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 10
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    invoke-virtual {p2}, Lcom/zykj/paint/data/Rect2D;->toRect()Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p3}, Lcom/zykj/paint/data/Rect2D;->toRect()Landroid/graphics/Rect;

    move-result-object p3

    invoke-virtual {v1, p1, p2, p3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap(Lcom/zykj/paint/graphic/RectBmp;Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/zykj/paint/graphic/RectBmp;->vector2D:Lcom/zykj/paint/data/Vector2D;

    .line 2
    iget-object v1, p1, Lcom/zykj/paint/graphic/RectBmp;->dstVector2D:Lcom/zykj/paint/data/Vector2D;

    .line 3
    iget-object v2, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lcom/zykj/paint/render/MapViewer;->geoVector2ViewVector(Lcom/zykj/paint/data/Vector2D;Z)Lcom/zykj/paint/data/Vector2D;

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    invoke-virtual {v2, v1, v3}, Lcom/zykj/paint/render/MapViewer;->geoVector2ViewVector(Lcom/zykj/paint/data/Vector2D;Z)Lcom/zykj/paint/data/Vector2D;

    move-result-object v1

    .line 5
    new-instance v2, Landroid/graphics/Rect;

    iget-wide v3, v0, Lcom/zykj/paint/data/Vector2D;->x:D

    double-to-int v3, v3

    iget-wide v4, v0, Lcom/zykj/paint/data/Vector2D;->y:D

    double-to-int v0, v4

    iget-wide v4, v1, Lcom/zykj/paint/data/Vector2D;->x:D

    double-to-int v4, v4

    iget-wide v5, v1, Lcom/zykj/paint/data/Vector2D;->y:D

    double-to-int v1, v5

    invoke-direct {v2, v3, v0, v4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 6
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mScreenCanvas:Landroid/graphics/Canvas;

    iget-object p1, p1, Lcom/zykj/paint/graphic/Graph;->graphMatrix:Landroid/graphics/Matrix;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawPolyLine(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/data/Vector2D;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/zykj/paint/data/Vector2D;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Lcom/zykj/paint/render/MapViewer;->geoVector2ViewVector(Lcom/zykj/paint/data/Vector2D;)Lcom/zykj/paint/data/Vector2D;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-wide v3, v2, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 21
    .line 22
    double-to-float v3, v3

    .line 23
    iget-wide v4, v2, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 24
    .line 25
    double-to-float v2, v4

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v4, Landroid/graphics/Path;

    .line 29
    .line 30
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v4, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-virtual {v4, v3, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v4, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 40
    .line 41
    iget v5, p0, Lcom/zykj/paint/render/SketchRender;->mX:F

    .line 42
    .line 43
    iget v6, p0, Lcom/zykj/paint/render/SketchRender;->mY:F

    .line 44
    .line 45
    add-float v7, v3, v5

    .line 46
    .line 47
    const/high16 v8, 0x40000000    # 2.0f

    .line 48
    .line 49
    div-float/2addr v7, v8

    .line 50
    add-float v9, v2, v6

    .line 51
    .line 52
    div-float/2addr v9, v8

    .line 53
    invoke-virtual {v4, v5, v6, v7, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 54
    .line 55
    .line 56
    :goto_1
    iput v3, p0, Lcom/zykj/paint/render/SketchRender;->mX:F

    .line 57
    .line 58
    iput v2, p0, Lcom/zykj/paint/render/SketchRender;->mY:F

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mPath:Landroid/graphics/Path;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 68
    .line 69
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public init(Lcom/zykj/paint/render/MapViewer;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/paint/render/SketchRender$1;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/zykj/paint/render/SketchRender$1;-><init>(Lcom/zykj/paint/render/SketchRender;Lcom/zykj/paint/render/MapViewer;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 14
    .line 15
    new-instance p1, Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 32
    .line 33
    const/16 v0, 0xff

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p1, v0, v1, v1, v1}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 40
    .line 41
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 47
    .line 48
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 54
    .line 55
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/paint/render/SketchRender;->mPaint:Landroid/graphics/Paint;

    .line 61
    .line 62
    const/high16 v0, 0x40400000    # 3.0f

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/zykj/paint/render/SketchRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    :cond_0
    return-void
.end method
